package Ejemplos;

import java.io.FileNotFoundException;

public class EjerciciosException extends FileNotFoundException {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "El archivo de ejercicios no existe";
	}
}
