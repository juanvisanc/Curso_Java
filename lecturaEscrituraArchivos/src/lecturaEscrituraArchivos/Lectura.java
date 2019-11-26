package lecturaEscrituraArchivos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {
	
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		
		
		try {
			String contenido=readFile("uno");
			System.out.println("Contenido del archivo: "+contenido);
			
			if(contenido.contains("clases")) {
				System.out.println("La palabra está en el archivo");
			}
			
			String manejo=contenido.replace("clases", "muestras");
			System.out.println("Contenido: "+manejo);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String readFile (String filename) throws IOException {
		String contenido=null;
		File file=new File(filename);
		FileReader reader=null;
		
		reader=new FileReader(file);
		char[] chars=new char[(int) file.length()];
		reader.read(chars);
		contenido= new String (chars);
		reader.close();
		
		return contenido;
	}

}
