
import java.util.ArrayList;
import java.util.Random;
/**
 * 
 * @author mr_ig
 *
 */

public class Kromi extends Carro {
	
	public Kromi() {}
	
	@SuppressWarnings("rawtypes")
	public Kromi(int anioFabKromi, String marcaKromi, int cantOcupantes, String fechaIngreso, ArrayList<ArrayList> ubiTablero)
	{
		this.anioFabKromi = anioFabKromi;
		this.marcaKromi = marcaKromi;
		this.cantOcupantes = cantOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.ubiTablero = ubiTablero;
	}
	
	private int anioFabKromi = 2020;
	
	private String marcaKromi = "Mercedes Benz";
	
	
	private int cantOcupantes = 5;
	
	private String fechaIngreso = "28-02-2020";
	
	@SuppressWarnings("rawtypes")
	private ArrayList<ArrayList> ubiTablero;
	
	
	/**
	 *  @Getter y @Setter Clase Kromi
	 */
	public void SetAnioFabKromi(int anioFabKromi) 
	{
		this.anioFabKromi = anioFabKromi;
	}
	public void SetMarcaKromi(String marcaKromi) 
	{
		this.marcaKromi = marcaKromi;
	}
	public int GetAnioFabKromi() 
	{
		return this.anioFabKromi;
	}
	public String GetMarcaKromi() 
	{
		return this.marcaKromi;
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
		String var = "Año fabricacion: "+this.anioFabKromi+"\nMarca: "+this.marcaKromi+
					 "\nCantidad de ocupantes: "+this.cantOcupantes+"\nFecha de ingreso: "+this.fechaIngreso+"\nUbicaciones: "+this.ubiTablero;
		return var;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String[][] CrearCarro(String[][] tablero) {
		Random numRandom = new Random();
		int cantKromis = 3;
		
		ArrayList<ArrayList> arrFin = new ArrayList();
		
		for(int k = 0; k < cantKromis; k++) 
		{
			
			int filaStartPoint = numRandom.nextInt(13);
			int columnaStartPoint = numRandom.nextInt(15);
			
			if (tablero[filaStartPoint][columnaStartPoint]=="   " 
				&& tablero[filaStartPoint+1][columnaStartPoint]=="   "
				&& tablero[filaStartPoint+2][columnaStartPoint]=="   ") 
			{
				ArrayList<String> arrAux = new ArrayList();
			
				tablero[filaStartPoint][columnaStartPoint] = " K ";
				arrAux.add( filaStartPoint+","+columnaStartPoint);
			
				tablero[filaStartPoint+1][columnaStartPoint] = " K ";
				arrAux.add(  (filaStartPoint+1)+","+columnaStartPoint);
			
				tablero[filaStartPoint+2][columnaStartPoint] = " K ";
				arrAux.add(  (filaStartPoint+2)+","+columnaStartPoint);
			
				arrFin.add(k, arrAux);
			}else{
				k--;
			}
			
		}
		this.SetUbiTablero(arrFin);
		return tablero;
	}

}
