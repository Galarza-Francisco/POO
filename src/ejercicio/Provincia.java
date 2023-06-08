package ejercicio;

public class Provincia {
	
	private String nombre;
	private Pais pais;

	public Provincia(String nombre, Pais pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
	}

	public Provincia(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String toString() {
		return "Provincia [nombre=" + nombre + "]";
	}

	
}	
