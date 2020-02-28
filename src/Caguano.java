
import java.util.ArrayList;
import java.util.Random;
/**
 * 
 * @author mr_ig
 *
 */

public class Caguano extends Carro {
	
	private int alcanceTiroCaguano = 1; 
	
	private String colorConfetiCaguano = "Rojo";
	
	
	private int cantOcupantes = 0;
	
	private String fechaIngreso = "";
	
	@SuppressWarnings("rawtypes")
	private ArrayList<ArrayList> ubiTablero;
	
	
	/**
	 *  @Getter y @Setter Clase Caguano
	 */
	public void setColorConfetiCaguano(String colorConfetiCaguano) 
	{
		this.colorConfetiCaguano = colorConfetiCaguano;
	}
	public void setAlcanceTiroCaguano(int alcanceTiroCaguano) 
	{
		this.alcanceTiroCaguano = alcanceTiroCaguano;
	}
	public int getAlcanceTiroCaguano() 
	{
		return alcanceTiroCaguano;
	}
	public String getColorConfetiCaguano() 
	{
		return colorConfetiCaguano;
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
		String var = "Alcance de tiro: "+this.alcanceTiroCaguano+"\nColor confeti: "+this.colorConfetiCaguano+
					 "\nCantidad de ocupantes: "+this.cantOcupantes+"\nFecha de ingreso: "+this.fechaIngreso+"\nUbicaciones: "+this.ubiTablero;
		return var;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String[][] CrearCarro(String[][] tablero){
		Random numRandom = new Random();
		int cantCaguanos = 5;
		
		ArrayList<ArrayList> arrFin = new ArrayList();
		
		for(int l = 0; l < cantCaguanos; l++) 
		{
			
			int filaStartPoint = numRandom.nextInt(15);
			int columnaStartPoint = numRandom.nextInt(14);
			
			if (tablero[filaStartPoint][columnaStartPoint]=="   " 
				&& tablero[filaStartPoint][columnaStartPoint+1]=="   ") 
			{
				ArrayList<String> arrAux = new ArrayList();
				
				tablero[filaStartPoint][columnaStartPoint] = " C ";
				arrAux.add( filaStartPoint+","+columnaStartPoint);
			
				tablero[filaStartPoint][columnaStartPoint+1] = " C ";
				arrAux.add( filaStartPoint+","+(columnaStartPoint+1));
			
				arrFin.add(l, arrAux);
			}else{
				l--;
			}
			
		}
		this.SetUbiTablero(arrFin);
		return tablero;
	}

}
