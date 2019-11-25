package ejemploMV;

import java.util.Arrays;

public class PrincipalMV {
	
	public static String[] otrasPalabras=new String[] {"Uno","Dos","Tres"};
	
	public static void main(String[] args) {
		
		Float[] data=new Float[] {1.1f,2.1f,3.5f};
		
		Float[] data1=new Float[data.length];
		
		Float[][] data2=new Float[2][2];
		
		System.out.println("Arreglo de palabras: "+Arrays.toString(otrasPalabras));
		System.out.println("Arreglo de números: "+Arrays.toString(data));
		System.out.println("Tamaño de los arreglos: "+data.length);
		System.out.println("Elemento del arreglo otrasPalabras: "+otrasPalabras[1]);
		
		media(data);
		
		metodoLlenarVector(data1);
		
		metodoCargarDatos(data2);
		
	}

	private static void metodoCargarDatos(Float[][] data2) {
		
		for(int i=0;i<data2.length;i++) {
			
			for (int j=0;j<data2.length;j++) {
			
				data2[i][j]=(float) (i+j);
				System.out.println("Parcial: "+data2[i][j]+"\n");
			}
		}
		
		System.out.println("Matriz: "+Arrays.deepToString(data2)+"\n");
		System.out.println("Un valor de la Matriz: "+data2[1][0]);
		
	}

	private static void metodoLlenarVector(Float[] data1) {
		
		for (int p=0;p<data1.length;p++) {
			
			data1[p]=(float) (p+1);
		}
		
		System.out.println("Valores del arreglo data1: "+Arrays.toString(data1));
		
	}

	private static float media(Float[] data) {
		
		int i;
		int n=data.length;
		float suma=0;
		for (i=0;i<n;i++) {
			
			suma=suma+data[i];
		}
		
		System.out.println("Valor promedio del vector es: "+suma/n);
		return suma/n;
	}

}
