package com.krakedev.mepj.Excepciones;

public class ValidarContacto {

	public static void validarTelefono(String telefono) throws  IllegalArgumentException {
		
		if(telefono == null || !telefono.matches("\\d{10}")){ 
			throw new IllegalArgumentException("Error numero imbalido");
		};
				
	}

}
