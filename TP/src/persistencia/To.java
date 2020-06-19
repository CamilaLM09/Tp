package persistencia;

import java.util.ArrayList;


import com.google.gson.*;

import clases.Juego;
import gene.Generala;

public class To {
	
	/**
	 * Transforma un juego a un JSONObject
	 * @param juego
	 * @return JSONObject
	 */
	public static JsonObject ToJSON(Juego j) {
		Gson gson = new Gson();
		String s = gson.toJson(j);
		JsonObject Oj = gson.fromJson(s, JsonObject.class);
		return Oj;
	}
	
	public static JsonObject ToJSON(String s) {
		Gson gson = new Gson();
		JsonObject Oj = gson.fromJson(s, JsonObject.class);
		return Oj;
	}
	
	
	/**
	 * Transforma un JSONArray en un ArrayList de tipo diezmil
	 * @param JSONArray
	 * @return ArrayList<Diezmil>
	//cierre docs
	public static ArrayList<Generala> toArrayListD(JSONArray leido){
		ArrayList<Diezmil> test = new ArrayList<Diezmil>();
    	int i = 0;
		
		while(i < leido.length()) {
			try {
				Diezmil juego = new Diezmil();
				juego = toDiezmil(leido.getJSONObject(i));
				test.add(juego);
				i++;
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return test;
    }
    */
    /**
     * Transforma un JSONObject a un Objeto DiezMil
     * @param JSONObject
     * @return Diezmil
    // cierre docs
   
    public static Diezmil toDiezmil(JSONObject Oj) {
		Diezmil diez = new Diezmil();
		Gson gson = new Gson();
    	diez = gson.fromJson(Oj.toString(), Diezmil.class);
    	return diez;
    	
    }
	*/
	
	/**
	 * Transforma un JSONArray en un ArrayList de tipo generala
	 * @param JSONArray
	 * @return ArrayList<Generala>
	 */
	
    public static ArrayList<Generala> toArrayListG(JsonArray leido){
		Gson gson = new Gson();
    	ArrayList<Generala> test = new ArrayList<Generala>();
    	int i = 0;
		
		while(i < leido.size()) {

				Generala juego = new Generala();
				juego = toGenerala(leido.get(i).getAsJsonObject());
				test.add(juego);
				i++;

		}
		return test;
    }
    
    /**
     * Transforma un JSONObject a un Objeto Generala
     * @param JSONObject
     * @return Generala
     */
    public static Generala toGenerala(JsonObject Oj) {
		Generala gen = new Generala();
		Gson gson = new Gson();
    	gen = gson.fromJson(Oj, Generala.class);
    	return gen;
    	
    }
}
