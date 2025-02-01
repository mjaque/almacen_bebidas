public class Almacen{

	private final static int MAX_BEBIDAS = 100;
	private Estanteria[] estanterias = new Estanteria[25];
	private Bebida[] bebidas = new Bebida[MAX_BEBIDAS];

	public Almacen(){
		for (int i = 0; i < estanterias.length; i++)
			estanterias[i] = new Estanteria();
		crearBebidas();
	}

	private void crearBebidas(){
		bebidas[1] = new Azucarada(1, 1, new BigDecimal(3.33), "Viva Valencia", 0.3f, false);
		bebidas[2] = new Azucarada(2, 5, new BigDecimal(8.99), "Viva Valencia", 0.3f, true);
		bebidas[3] = new Bebida(3, 2, new BigDecimal(5.14), "AlMonte");
		bebidas[4] = new AguaMineral(4, 4, new BigDecimal(2.82), "Agua Fría", "Grifo");
	}

	public String[] verNombresProductos(){
		String[] nombresProductos = new String[MAX_BEBIDAS];
		for (int i = 0; i < bebidas.length; i++)
			if (bebidas[i] != null)
				nombresProductos[i] = bebidas[i].toString();
		return nombresProductos;
	}
	public void agregarProducto(Integer idEstanteria, Integer idBebida) throws Exception{
		if (!estanterias[idEstanteria].hayHueco())
			throw new Exception("Estantería completa.");

		estanterias[idEstanteria].colocar(bebidas[idBebida]);
	}
}
