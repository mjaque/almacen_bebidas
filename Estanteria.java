public class Estanteria{
	
	private Bebida[] bebidas = new Bebida[10];

	public Estanteria(){
		for (int i = 0; i < bebidas.length; i++)
			bebidas[i] = null;
	}

	public Boolean hayHueco(){
		return true;
	}
}
