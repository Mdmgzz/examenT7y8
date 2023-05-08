package ejercicio3;

public class ClaseCRUD {
	static Producto[] productos = new Producto[10];

	public static void menu() {
		System.out.println("1. Añadir producto");
		System.out.println("2. Listar productos");
		System.out.println("3. Modificar producto");
		System.out.println("4. Eliminar producto");
		System.out.println("0. Salir");

	}

	public static void nuevoProducto(String nombre, double precio) {
		int pos = posicionLibre();

		if (pos >= 0) {
			productos[pos] = new Producto(nombre, precio);
		} else {
			System.out.println("No hay espacio libre");
		}
	}

	public static void listarProductos() {
		for (Producto p : productos) {
			if (p != null) {
				System.out.println(p);
			}
		}
	}

	public static void modificarProducto(double precio, int pos) {
		productos[pos].setPrecio(precio);
	}

	public static void eliminarProducto(int pos) {
		productos[pos] = null;
	}
	
	public static int posicionLibre() {
		int posicion = 0;

		while (posicion < productos.length && productos[posicion] != null) {
			posicion++;
		}
		if (posicion == productos.length) {
			posicion = -1;
		}

		return posicion;
	}

	public static int buscaProducto(String nombre) {
		int pos = 0;
		while (pos < productos.length && (productos[pos]==null || !productos[pos].getNombre().equals(nombre))) {
			pos++;
		}

		if (pos == productos.length) {
			pos = -1;
		}
		return pos;
		
		// metodo equals y metodo compare to
//		@Override
//		/**
//		 * Para comparar dos objetos atendiendo a la camiseta y el nombre
//		 * @return igual devuelve un booleano en true si la comparación se cumple
//		 */
//		public boolean equals(Object o) {
//			boolean igual = false;
//			// Igualamos el objeto al tipo de la clase; gracias Isa por explicar
//			Futbolista jugador = (Futbolista) o;
//			
//			// La comparación en un if
//			if (this.nombre.equalsIgnoreCase(jugador.nombre) && this.numero == jugador.numero) {
//				igual = true;
//			}
//			return igual;
//		}
//
//		@Override
//		/**
//		 * Metodo compareTo que ordena los jugadores
//		 */
//		public int compareTo(Object o) {
//			
//			int res;
//			//Otro cast igualamos para poder compararlos ya que object es la clase padre de java
//			Futbolista jugador= (Futbolista) o;	
//			res = this.numero - jugador.numero;
//			if (res == 0) {
//				res = this.nombre.compareToIgnoreCase(jugador.nombre);
//			}
//			return res;
//		}
	}
}
