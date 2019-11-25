package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ColeccionesDeDatos {
	
	public static List<String> lista;
	public static Set<String> conjunto;
	public static Map diccionario;
	public static List<DatosPersonales> datosP;
	
	public static void main (String[] args) {
		
		lista = new ArrayList<String>();
		conjunto=new HashSet<String>();
		diccionario= new HashMap();
		datosP=new ArrayList<DatosPersonales>();
		
		// Para la lista
		
		lista.add("Manzanas");
		lista.add("Peras");
		lista.add("Naranjas");
		lista.add("Fresas");
		lista.add(3,"Melones");
		//lista.remove(2);
		
		System.out.println("Lista de frutas: "+lista);
		System.out.println("Elemento de la lista de frutas: "+lista.get(0));
		System.out.println("Elemento de la lista de frutas: "+lista.get(1));
		System.out.println("Elemento de la lista de frutas: "+lista.get(2));
		System.out.println("Elemento de la lista de frutas: "+lista.get(3));
		System.out.println("Elemento de la lista de frutas: "+lista.get(4));
		
		// para los conjuntos
		
		conjunto.add("Manzanas");
		conjunto.add("Peras");
		conjunto.add("Naranjas");
		conjunto.add("Fresas");
		
		imprimeConjunto(conjunto);
		
		//para el hashmap
		
		Vehiculo carro=new Vehiculo();
		diccionario.put("V 1234", carro.getVehiculo());
		diccionario.put("V 5678", carro.getVehiculo2());
		imprimeDiccionario(diccionario);
		
		// en los datos personales
		
		DatosPersonales datosPersonales = new DatosPersonales("Pepe", "Ruiz", "PepeRuiz", true);
		datosP.add(datosPersonales);
		DatosPersonales datosPersonales1 = new DatosPersonales("Juan", "Sanchez", "JuanSanchez", true);
		datosP.add(datosPersonales1);
		DatosPersonales datosPersonales2 = new DatosPersonales("Jose", "Pere", "JosePere", true);
		datosP.add(datosPersonales2);
		System.out.println("Primer nombre de la lista 2 de datos personales: "+(datosP.get(1).getNombre())+" tamaño de la lista: "+datosP.size());
		
		// todos los elementos de datos personales
		
		for(int i=0;i<datosP.size();i++) {
			System.out.println("Lista de datos Personales "+datosP.get(i).getNombre()+" "+datosP.get(i).getApellido());
		}
		
	}

	private static void imprimeDiccionario(Map diccionario2) {
		System.out.println("Diccionario "+diccionario+" Tamaño "+diccionario.size());
		System.out.println("Diccionario "+diccionario.get("V 1234"));
		System.out.println("Diccionario "+diccionario.get("V 5678"));
		
	}

	private static void imprimeConjunto(Set conjunto2) {
		
		System.out.println("Conjunto: "+conjunto2+" tamaño: "+conjunto2.size());
		conjunto2.remove("Fresas");
		System.out.println("Conjunto: "+conjunto2+" tamaño: "+conjunto2.size());
		
	}

}
