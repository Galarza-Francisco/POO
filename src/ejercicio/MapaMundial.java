package ejercicio;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MapaMundial {
	private List<Continente> continentes = new ArrayList<Continente>();

	public void inicializar() {

		List<Pais> paises = new ArrayList<Pais>();

		Pais argentina = new Pais("Argentina", "Buenos Aires");
		argentina.add(new Provincia("Entre Rios", argentina));
		argentina.add(new Provincia("Mendoza", argentina));

		Pais uruguay = new Pais("Uruguay", "Montevideo");
		paises.add(argentina);
		paises.add(uruguay);
		continentes.add(new Continente("America", paises));
		continentes.add(new Continente("Europa", paises));
		continentes.add(new Continente("Asia", paises));
		continentes.add(new Continente("África", paises));
		continentes.add(new Continente("Oceanía", paises));
		continentes.add(new Continente("Antártida", paises));

		/*
		 * for (Continente c: continentes) { System.out.println(c); }
		 */

		for (Provincia c : argentina.getProvincias()) {
			System.out.println(c);
			System.out.println(c.getPais());
		}
		
		Frontera frontera = new Frontera(argentina, uruguay, "Rio");
		argentina.add(frontera);
		System.out.println(argentina.getLimitrofes());

	}

	public List<Pais> getPaises(String continent) {
		Iterator<Continente> iterator = continentes.iterator();
		while (iterator.hasNext()) {
			Continente continente = iterator.next();
			if (continente.getNombre().equalsIgnoreCase(continent)) {
				return continente.getPaises();
			}
		}
		return new ArrayList<Pais>();
	}
}