package com.krakedev.mepj.Excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LeerContacto {
private static final Logger log =LogManager.getLogger(LeerContacto.class);
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String archivo="contactos.txt";
	
		FileReader lectorArchivo=null;
		BufferedReader lector=null;
		
		try {
			lectorArchivo = new FileReader(archivo);
			lector =new BufferedReader(lectorArchivo);
			for(int i=0; i<9; i++) {
				log.info(lector.readLine());
			}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			log.error("Error al abrir el archivo");
		}catch (IOException e) {
			// TODO Auto-generated catch block
			log.error("Error al leer el archivo");
		}finally {
			lector.close();
		}
		//solo se imprime el primer catch y el segundo me salta un nullpionterexception
		//al invertir los catch me sale que el primer bloque catch ya maneja el error
		//
	}

}
