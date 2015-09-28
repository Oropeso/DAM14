package Ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		File f = new File("fichero.txt");
		File f2 = new File("ejercicios.txt");
		Notas notas = new Notas(f);
		Ejercicios ej = new Ejercicios(f2);
//			while(true)
//			{
				try
				{

				notas.imprime();
				System.out.println("Ahora los ejercicios");
				ej.imprime();
			}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
			//}
	}
}
