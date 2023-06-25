package interfacesgraficas;

import ejercicio1.ventanaoperaciones;

public class Proceso {

	public Proceso(){
		presentarVentana();
	}

	private void presentarVentana() {
		ventanaoperaciones miVentana= new ventanaoperaciones();
		miVentana.setVisible(true);
		
	}
}
