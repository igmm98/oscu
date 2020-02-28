
import java.util.ArrayList;
import java.util.Scanner;

public class Huevo {
	
	private int puntajeTotal = 0;
	//private int puntajeKromi = 0;
	//private int puntajeCaguano = 0;
	//private int puntajeTrupalla = 0;
	private int filaHuevo;
	private int columnaHuevo;
	
	
	/**
	 *  @Getter y @Setter
	 */
	public void SetFilaHuevo(int filaHuevo) 
	{
		this.filaHuevo = filaHuevo;
	}
	public void SetColumnaHuevo(int columnaHuevo) 
	{
		this.columnaHuevo = columnaHuevo;
	}
	public int GetFilaHuevo() 
	{
		return this.filaHuevo;
	}
	public int GetColumnaHuevo() 
	{
		return this.columnaHuevo;
	}
	public int GetPuntajeTotal() 
	{
		return this.puntajeTotal;
	}
	
	@SuppressWarnings({ "rawtypes", "resource" })
	public String[][] Lanzamientos(String[][] tablero, ArrayList<ArrayList> carroList){
		
		Scanner sc = new Scanner(System.in);
		String vector = "";
		
		System.out.println( "- Lanzamiento de huevos -\n"+
							"Ingrese fila (0 - 14):");
		this.filaHuevo = Validacion(sc.nextLine());
		
		System.out.println( "Ingrese columna (0 - 14):");
		this.columnaHuevo = Validacion(sc.nextLine());
		vector = this.filaHuevo+","+this.columnaHuevo;
		
		for(int i = 0; i < carroList.size(); i++) 
		{
			for(int u = 0; u < carroList.get(i).size(); u++) 
			{
				if(vector.equals(carroList.get(i).get(u))) 
				{
					if(tablero[this.filaHuevo][this.columnaHuevo].equals(" H ")) 
					{
						
					}
					else 
					{ 
						tablero[this.filaHuevo][this.columnaHuevo] = " H ";
						
						switch(carroList.get(i).size()) 
						{
						case 1:
							this.puntajeTotal++;
							System.out.println("¡Has obtenido +1 puntos!");
							break;
							
						case 2:
							this.puntajeTotal = this.puntajeTotal + 2;
							System.out.println("¡Has obtenido +2 puntos!");
							if(tablero[Fila(carroList.get(i).get(0)+"")][Columna(carroList.get(i).get(0)+"")].equals(" H ")
								&& tablero[Fila(carroList.get(i).get(1)+"")][Columna(carroList.get(i).get(1)+"")].equals(" H "))
							{
								this.puntajeTotal = this.puntajeTotal + 7;
								System.out.println("¡Bonificacion de +7 puntos!");
							}
							break;
							
						case 3:
							this.puntajeTotal = this.puntajeTotal + 3;
							System.out.println("¡Has obtenido +3 puntos!");
							if(tablero[Fila(carroList.get(i).get(0)+"")][Columna(carroList.get(i).get(0)+"")].equals(" H ")
							   && tablero[Fila(carroList.get(i).get(1)+"")][Columna(carroList.get(i).get(1)+"")].equals(" H ")
							   && tablero[Fila(carroList.get(i).get(2)+"")][Columna(carroList.get(i).get(2)+"")].equals(" H "))
							{
								this.puntajeTotal = this.puntajeTotal + 10;
								System.out.println("¡Bonificacion de +10 puntos!");
							}
							break;
						}
					}
				}
			}
		}
		
		
		return tablero;
	}
	
	int Fila(String fila) 
	{
		int val = 0;
		try 
		{
			val = Integer.parseInt(fila.substring(0, 2));
		}catch(Exception e) 
		{
			val = Integer.parseInt(fila.substring(0, 1));
		}
		return val;
	}
	int Columna(String columna) 
	{
		int val = 0;
		try 
		{
			val = Integer.parseInt(columna.substring(2));
		}catch(Exception e) 
		{
			val = Integer.parseInt(columna.substring(3));
		}
		
		return val;
	}
	
	@SuppressWarnings("resource")
	private int Validacion(String var) 
	{
		int val = 0;
		boolean ciclo = true;
		do 
		{
			
			try 
			{
				val = Integer.parseInt(var);
				ciclo = false;
				
			}catch (Exception e) 
			{
				Scanner x = new Scanner(System.in);
				System.out.println("¡Ingrese un valor valido!");
				var = x.nextLine();
			}
			if(val < 0 || val > 14) 
			{
				Scanner x = new Scanner(System.in);
				System.out.println("¡Ingrese un valor valido!");
				var = x.nextLine();
			}
		}while(ciclo || val < 0 || val > 14);
		return val;
	}

	
}
