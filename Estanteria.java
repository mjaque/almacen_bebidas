public class Estanteria{
	
	private Bebida[] bebidas = new Bebida[10];

	public Estanteria(){
		for (int i = 0; i < bebidas.length; i++)
			bebidas[i] = null;
	}

	public Boolean hayHueco(){
		//TODO: programar esto.
		return true;
	}

	public void colocar(Bebida bebida){}
}
