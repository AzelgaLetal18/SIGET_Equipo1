package com.app.SIGET.excepciones;

/**
 * @author Equipo1
 *
 */
public class DiferentesContrasenasException extends Exception {

	public DiferentesContrasenasException() {
		// No se necesita hacer nada en el contructor
	}

	/**
	 * @return "Las contraseņas no coinciden"
	 */
	@Override
	public String getMessage() {
		return "Las contraseņas no coinciden";
	}

}
