package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	public void cambiarColor(String nuevoColor) {
		if(nuevoColor == "verde" || nuevoColor == "rojo" || nuevoColor == "amarillo" || nuevoColor == "negro" || nuevoColor == "blanco") {
			this.color = nuevoColor;
	}
	}
}
