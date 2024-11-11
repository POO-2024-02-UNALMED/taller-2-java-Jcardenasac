package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	Motor motor;
	int registro;
	static String cantidadCreados;
	int cantidadAsientos(){
		int cantidad = 0;
		for(int i=0;i<this.asientos.length; i++) {
			if(asientos[i]!= null) {
				cantidad++;
			}	
		}
		return cantidad;
	}
	String verificarIntegridad () {
		if(this.registro != this.motor.registro) {
			return "Las piezas del auto no son originales";
		}
		else{
			for(int i=0;i<this.asientos.length; i++) {
				if(asientos[i].registro != this.registro) {
					return "Las piezas del auto no son originales";
				}
		}
	}
		return "Auto original";
}
}