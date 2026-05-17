package com.krakedev.mepj.Excepciones;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GuardarContacto {
	private static final Logger log =LogManager.getLogger(GuardarContacto.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter escritor=null;
		try {
			escritor = new FileWriter("contactos.txt", true);
			
			escritor.write("Maria\n");
			escritor.write("Gomez\n");
			escritor.write("0981234567\n");
			
			log.info("Archivo creado con exito");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			log.error("Ocurrio un error: ", e.getMessage());
		}finally {
			try {
				escritor.close();
				log.info("Archivo cerrado con exito");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				log.error("Ocurrio un error: ", e.getMessage());
			}
		}
 
	}
	
}
