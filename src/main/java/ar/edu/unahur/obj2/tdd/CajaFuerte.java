package ar.edu.unahur.obj2.tdd;

public class CajaFuerte {
	
	private Boolean abierta = true;
	private Integer codigo = null;
	
	public Boolean estaAbierta() {
		return abierta;
	}
	
	public Integer codigo() {
		return this.codigo;
	}
	
	public void cerrar(Integer codigo) {
		this.abierta = false;
		this.codigo = codigo;
	}
	
	public void abrir(Integer codigo) {
		if(this.codigo.equals(codigo)) {
			this.abierta = true;
		} else {
			throw new RuntimeException("El codigo ingresado es incorrecto.");
		}
	}
} 
