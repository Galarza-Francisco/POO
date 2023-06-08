package ejercicio;
import java.util.ArrayList;
import java.util.List;
public class Pais {
	private String nombre;
	private String capital;
	private List<Frontera> limitrofes = new ArrayList<Frontera>();
	private List<Provincia> provincias = new ArrayList<Provincia>();
	
	public Pais(String nombre, String capital, List<Provincia> provincias) {
		this.nombre = nombre;
		this.capital = capital;
		this.provincias = provincias;
	}
	
	public Pais(String nombre, String capital) {
		super();
		this.nombre = nombre;
		this.capital = capital;
	}
	
	public List<Frontera> getLimitrofes() {
		return limitrofes;
	}

	public void setLimitrofes(List<Frontera> limitrofes) {
		this.limitrofes = limitrofes;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(List<Provincia> provincias) {
		this.provincias = provincias;
	}
	
	public String toString() {
		return "Pais [nombre=" + nombre + ", capital=" + capital + "]";
	}
	
	public void add (Provincia provincia) {
		this.provincias.add(provincia);
	}
	
	public boolean delete (Provincia provincia) {
		return this.provincias.remove(provincia);
	}
	
	public void add (Frontera limitrofe) {
		this.limitrofes.add(limitrofe);
	}
	
	public boolean delete (Frontera limitrofe) {
		return this.limitrofes.remove(limitrofe);
	}
	
	
}
