package ejercicio;
import java.util.Scanner;
public class MapaMundi {

	public static void main(String[] args) {
		MapaMundial mapa = new MapaMundial();
		mapa.inicializar();
		System.out.println (mapa.getPaises("Cualquiera"));
		Scanner in = new Scanner(System.in);
		String texto = in.nextLine();
		System.out.println (mapa.getPaises(texto));
	}

}
