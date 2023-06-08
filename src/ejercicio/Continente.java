package ejercicio;
import java.util.ArrayList;
import java.util.List;

public class Continente {
	private String nombre;
	private List<Pais> paises = new ArrayList<Pais>();
	
	public Continente(String nombre, List<Pais> paises) {
		super();
		this.nombre = nombre;
		this.paises = paises;
	}
	
	public Continente(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Pais> getPaises() {
		return paises;
	}

	public void setPaises(List<Pais> paises) {
		this.paises = paises;
	}

	public String toString() {
		return "Continente [nombre=" + nombre + "]";
	}
	
	public void add (Pais pais) {
		this.paises.add(pais);
	}
	
	public boolean delete (Pais pais) {
		return this.paises.remove(pais);
	}
		
	
}
