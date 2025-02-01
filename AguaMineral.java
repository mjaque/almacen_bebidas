import java.math.BigDecimal;

public class AguaMineral extends Bebida{
	private String origen;

	public AguaMineral(Integer id, Integer cantidad, BigDecimal precio, String marca, String origen){
		super(id, cantidad, precio, marca);
		this.origen = origen;
	}
}
