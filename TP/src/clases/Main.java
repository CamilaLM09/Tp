package clases;
 
import gene.Generala;
import persistencia.Persistencia;
import persistencia.To;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import clases.Jugador;

import java.io.*;
import java.util.ArrayList;
 
 
public class Main {
 
    public static void main(String[] args) {

		Jugador A = new Jugador("Adam");
		Jugador B = new Jugador("Clara");
		Jugador C = new Jugador("Josh");
		Jugador D = new Jugador("Sam");
		
		ArrayList<Jugador> players = new ArrayList<Jugador>();
		players.add(A);
		players.add(B);
		players.add(C);
		players.add(D);
		
		Generala game = new Generala(players);
		
		
		Jugador E = new Jugador("kk");
		Jugador F = new Jugador("ss");
		Jugador G = new Jugador("Jjj");
		Jugador H = new Jugador("Sssss");
		
		ArrayList<Jugador> players2 = new ArrayList<Jugador>();
		players2.add(D);
		players2.add(E);
		players2.add(F);
		players2.add(G);
		
		Generala game2 = new Generala(players2);
		
		
		Jugador I = new Jugador("m");
		Jugador J = new Jugador("ra");
		Jugador K = new Jugador("sh");
		Jugador L = new Jugador("am");
		
		ArrayList<Jugador> players3 = new ArrayList<Jugador>();
		players3.add(I);
		players3.add(J);
		players3.add(K);
		players3.add(L);
		
		Generala game3 = new Generala(players3);

		
		Persistencia.guardarPartida(game);
		Persistencia.guardarPartida(game2);
		Persistencia.guardarPartida(game3);
		
		
		JsonArray leido=Persistencia.levantarArchivo();
		
		System.out.println(To.toArrayListG(leido));
		/*
		JsonObject Jo = To.ToJSON(game);
		System.out.println("En JSONObject: \n" +Jo);
		Generala Gen = To.toGenerala(Jo);
		System.out.println("En generala: \n" +Gen);
		*/
		
    }
    

 
   
}