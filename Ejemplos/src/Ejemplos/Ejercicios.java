package Ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicios {
	File f;
	
	Ejercicios (File f)
	{
		this.f = f;
	}
	
	void imprime() throws IOException
	{
		FileReader fr = new FileReader(f);
		BufferedReader bf = new BufferedReader(fr);
		String cad;
		while ((cad=bf.readLine())!=null)
		{
			System.out.println(cad);
		}
	}
}
