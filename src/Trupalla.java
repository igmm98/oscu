
import java.util.ArrayList;
import java.util.Random;
/**
 * 
 * @author mr_ig
 *
 */

public class Trupalla extends Carro {
	
	private int nvlArmaduraTrupalla = 3;
	
	private String manupiladorTrupalla = "Peter Parker";
	
	
	private int cantOcupantes = 0;
	
	private String fechaIngreso = "";
	
	@SuppressWarnings("rawtypes")
	private ArrayList<ArrayList> ubiTablero;
	
	
	/**
	 * @Getters y @Setter Clase Trupalla
	 */
	public void SetNvlArmaduraTrupalla(int nvlArmaduraTrupalla) 
	{
		this.nvlArmaduraTrupalla = nvlArmaduraTrupalla;
	}
	public void SetManipuladorTrupalla(String manipuladorTrupalla) 
	{
		this.manupiladorTrupalla = manipuladorTrupalla;
	}
	public int GetNvlArmaduraTrupalla() 
	{
		return this.nvlArmaduraTrupalla;
	}
	public String GetManipuladorTrupalla() 
	{
		return this.manupiladorTrupalla;
	}
	
	
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
		this.fechaIngreso =fechaIngreso;
	}
	public void SetCantOcupantes(int cantOcupantes) 
	{
		this.cantOcupantes = cantOcupantes;
	}
	/**
	 * @Getter
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
	
	public String ToString() 
	{
		String var = "Conductor: "+this.manupiladorTrupalla+"\nNivel de armadura: "+this.nvlArmaduraTrupalla+
					 "\nCantidad de ocupantes: "+this.cantOcupantes+"\nFecha de ingreso: "+this.fechaIngreso+"\nUbicaciones: "+this.ubiTablero;
		return var;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String[][] CrearCarro(String[][] tablero){
		Random numRandom = new Random();
		int cantTrupallas = 10;
		
		ArrayList<ArrayList> arrFin = new ArrayList();
		
		for(int r = 0; r < cantTrupallas; r++) 
		{
			
			int filaStartPoint = numRandom.nextInt(15);
			int columnaStartPoint = numRandom.nextInt(15);
			
			if (tablero[filaStartPoint][columnaStartPoint]=="   ") 
			{
				ArrayList<String> arrAux = new ArrayList();
				
				tablero[filaStartPoint][columnaStartPoint] = " T ";
				arrAux.add( filaStartPoint+","+columnaStartPoint);
			
				arrFin.add(r, arrAux);
			}else {
				r--;
			}
			
		}
		this.SetUbiTablero(arrFin);
		return tablero;  
	}

}
