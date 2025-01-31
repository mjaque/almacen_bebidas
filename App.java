import java.util.Scanner;
import java.util.Arrays;

public class App{
	
	private static Scanner teclado = new Scanner(System.in);
	private static Almacen almacen = new Almacen();

	public static void main(String[] args){
		presentarApp();
		do{
			presentarMenu();
		}while(elegirOpcion());
		//despedirse();
		teclado.close();
	}

	private static void presentarApp(){
		System.out.println("Macanuda aplicación de gestión de almacén\n");
	}

	private static void presentarMenu(){
		System.out.println("\n MENÚ PRINCIPAL");
		System.out.println("1. Calcular precio de todas las bebidas.");
		System.out.println("2. Calcular precio de una marca.");
		System.out.println("4. Agregar producto.");
		System.out.println("0. Salir.");
	}

	private static Boolean elegirOpcion(){
		System.out.print("Opción: ");
		String opcion = teclado.nextLine();
		ejecutarOpcion(opcion);
		//comprobar opción
		return !("0".equals(opcion));
	}

	private static void ejecutarOpcion(String opcion){
		switch(opcion){
			case "1":
				System.out.println("Hago eso...");
				break;
			case "2":
				System.out.println("Hago lo otro...");
				break;
			case "4":
				agregarProducto();
				break;
			case "0":
				break;
			default:
				System.out.println("Opción incorrecta.");
		}
	}

	private static void agregarProducto(){
		try{
			System.out.println("Agregando producto...");
			System.out.print("Id de la estatería: ");
			//TODO: try-catch
			Integer idEstanteria = Integer.valueOf(teclado.nextLine());
			String[] nombresProductos = almacen.verNombresProductos();
			System.out.println("\nProductos del Almacén: ");
			for(int i = 0; i < nombresProductos.length; i++)
				System.out.println((i+1) + ". " + nombresProductos[i]);
			System.out.print("Indique el número del producto elegido: ");
			//Leer opción
			Integer numeroProductoElegido = Integer.valueOf(teclado.nextLine());
			almacen.agregarProducto(idEstanteria, numeroProductoElegido - 1);
			System.out.println("Agregado producto con éxito.\n");
		}
		catch(Exception e){
			System.out.println("Algo ha ido mal...");
		}
	}
	
}
