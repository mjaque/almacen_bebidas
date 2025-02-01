import java.math.BigDecimal;

public class Bebida{
	private Integer id;
	private Integer cantidad;
	private BigDecimal precio;
	private String marca;

	public Bebida(Integer id, Integer cantidad, BigDecimal precio, String marca){
		this.id = id;
		this.cantidad = cantidad;
		this.precio = precio;
		this.marca = marca;
	}

	@Override
	public String toString(){
		return getId() + ". " + getMarca() + ".";
	}

	public Integer getId(){
		return id;
	}

	public String getMarca(){
		return marca;
	}
}
