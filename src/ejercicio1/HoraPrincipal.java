 package ejercicio1;

public class HoraPrincipal {

	public static void main(String[] args) {
		HoraExacta he = new HoraExacta(28,59,59);
		he.inc();
		System.out.println(he);
		
		Hora h = new Hora(23,59);
		h.setHora(58);
		h.setMinutos(60);
		h.inc();
		System.out.println(h);
	}
}
