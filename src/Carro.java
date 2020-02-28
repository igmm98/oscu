
import java.util.ArrayList;
/**
 * 
 * @author mr_ig
 * 
 * @param ubiTablero Ubicacion del carro
 * @param fechaIngreso Fecha de ingreso
 * @param cantOcupantes Cantidad de ocupantes del carro
 * 
 */
public class Carro {
	
	private int cantOcupantes = 0; // CANTIDAD DE OCUPANTES CARRO
	
	private String fechaIngreso = ""; // FECHA DE INGRESO DEL CARRO
	
	@SuppressWarnings("rawtypes")
	private ArrayList<ArrayList> ubiTablero; // LISTADO CON UBICACIONES POR CARRO
	
	
	/**
	 * @Setter
	 */
	@SuppressWarnings("rawtypes")
	public void SetUbiTablero(ArrayList<ArrayList> ubiTablero) 
	{
		this.ubiTablero = ubiTablero;
	}
	public void SetFechaIngreso(String fechaIngreso) 
	{
		this.fechaIngreso = fechaIngreso;
	}
	public void SetCantOcupantes(int cantOcupantes) 
	{
		this.cantOcupantes = cantOcupantes;
	}
	/**
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public ArrayList<ArrayList> GetUbiTablero()
	{
		return this.ubiTablero;
	}
	public String GetFechaIngreso() 
	{
		return this.fechaIngreso;
	}
	public int GetCantOcupantes() 
	{
		return this.cantOcupantes;
	}

}
