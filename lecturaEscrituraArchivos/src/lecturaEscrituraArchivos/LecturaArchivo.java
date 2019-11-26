package lecturaEscrituraArchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;

public class LecturaArchivo {
	
	public static void main(String[] args) throws IOException {
	
		System.out.println(System.getProperty("user.dir"));
			
			BufferedReader in=new BufferedReader(new FileReader("src/lecturaEscrituraArchivos/LecturaArchivo.java"));
			
			String s,s2=new String();
			while((s=in.readLine())!=null) {
				s2+=s+"\n";
				
			}
			
			in.close();
			
			BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduzca cualquier dato: ");
			s2+="Usted agregó la línea \" "+stdin.readLine()+" \" en la línea de comandos";
			
		try {
			BufferedReader leer=new BufferedReader(new StringReader(s2));
			PrintWriter escribir=new PrintWriter(new BufferedWriter(new FileWriter("ArchivoTemporal.txt")));
			int lineaNo=1;
			while((s=leer.readLine())!=null){
				escribir.println(lineaNo++ +": "+s);
			}
			escribir.close();
			
			
			System.out.println("Finallllll");
			
		} catch (EOFException e) {
			System.out.println("Final de stream");
		}
	}

}
