package com.uniquindio.lenguaje.prioridades;

import javax.swing.JFrame;

/**
 * Permite mostrar la ventana en pantalla
 * 
 * @author Jhonnatan Osorio
 * @version 2.0
 */
public class Aplicacion {

	public static void main(String[] args) {
		InterfazG interfaz = new InterfazG();
		interfaz.setVisible(true);
		interfaz.setLocationRelativeTo(null);
		interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
