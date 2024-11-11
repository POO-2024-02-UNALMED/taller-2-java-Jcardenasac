package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	void cambiarRegistro(int registronuevo) {
		registro = registronuevo;
	}
    void asignarTipo (String nuevomotor) {
    	if(nuevomotor == "electrico" || nuevomotor == "gasolina") {
    		tipo = nuevomotor;
    	}
    }
}