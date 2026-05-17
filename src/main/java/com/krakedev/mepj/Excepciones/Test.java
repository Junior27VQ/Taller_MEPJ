package com.krakedev.mepj.Excepciones;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

	private static final Logger log = LogManager.getLogger(Test.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ValidarContacto.validarTelefono("0981234567");
			GuardarContacto.main(new String[] {});
			LeerContacto.main(new String[] {});
			//System.out.println("Nuevo contacto.");
			log.info("Nuevo contacto.");
		}catch(IllegalArgumentException e) {
			//System.out.println("Error de validacion");
			log.error("Error de validacion");
		}catch(IOException e) {
			//System.out.println("Error de flujo");
			log.error("Error de flujo");
		}
		
	}

}
