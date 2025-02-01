import java.math.BigDecimal;

public class Azucarada extends Bebida{
	private Float porcentajeAzucar;
	private Boolean enPromocion;
	private static final BigDecimal PROMOCION = new BigDecimal(0.1);

	public Azucarada(Integer id, Integer cantidad, BigDecimal precio, String marca, Float porcentajeAzucar, Boolean enPromocion){
		super(id, cantidad, precio, marca);
		this.porcentajeAzucar = porcentajeAzucar;
		this.enPromocion = enPromocion;
	}
}
