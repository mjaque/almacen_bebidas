public class Almacen{

	private Estanteria[] estanterias = new Estanteria[25];

	public Almacen(){
		for (int i = 0; i < estanterias.length; i++)
			estanterias[i] = new Estanteria();
	}

	public String[] verNombresProductos(){
		String[] nombresProductos = {"Gazpacho", "Horchata", "Té con menta"};
		return nombresProductos;
	}
	public void agregarProducto(Integer idEstanteria, Integer idProducto) throws Exception{
		if (!estanterias[idEstanteria].hayHueco())
			throw new Exception("Estantería completa.");


	}
}
