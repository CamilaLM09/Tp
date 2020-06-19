package persistencia;



import java.io.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import clases.Juego;

public class Persistencia {
	
	//Lo hacemos poli
	private static final String game = "Generala";
	
	 public static void guardarPartida(Juego j)
	    {
	        JsonArray partidas=levantarArchivo();          //lee el array ya guardado en archivo
	        partidas.add(To.ToJSON(j));                            //le agrega la partida nueva
	        escribirArray(partidas);                        //vuelve a escribir todo
	    }
	 
	    public static JsonArray levantarArchivo()
	    {
	        JsonArray array =null;
	        try {
	            DataInputStream data = new DataInputStream(new FileInputStream("archivo"+game+".dat"));

					array = new JsonArray();
					array.add(To.ToJSON(data.readUTF()));
					data.close();

	        }
	        catch (FileNotFoundException e)
	        {
	            JsonArray nuevo=new JsonArray();                  //si el archivo no existe, se crea un array vacio, se lo escribe vacio, y se retorna
	            escribirArray(nuevo);
	            return nuevo;
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	        return array;                                       //sino, devuelve el array leido del archivo
	    }
	 
	    public static void escribirArray(JsonArray ar)          
	    {
	        DataOutputStream data=null;
	        try
	        {
	            data=new DataOutputStream(new FileOutputStream("archivoGenerala.dat"));
	            data.writeUTF(ar.toString());
	            data.close();
	        }  catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
