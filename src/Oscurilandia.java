/**
 * 
 * @author mr_ig
 *
 */
import java.util.Scanner;

public class Oscurilandia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tablero tablero = new Tablero();
		tablero.CrearCarro();
		for(boolean ciclo = true; ciclo;) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			System.out.println("       - Menu -\n\n"+
							   "1) Iniciar el juego\n"+
							   "2) Mostrar mapa (Trampa)\n"+
							   "3) Mostrar lanzamientos\n"+
							   "4) Mostrar puntaje\n"+
							   "5) Salir\n"+
							   "-----------------------");
			int val = Validacion(sc.nextLine());
			System.out.println("-----------------------");
			switch(val) 
			{
			case 1:
				tablero.Iniciar();
				break;
			case 2:
				tablero.MostrarMatriz();
				tablero.CalcularPuntaje();
				break;
			case 3:
				tablero.MatrizHuevos();
				break;
			case 4:
				tablero.CalcularPuntaje();
				break;
			case 5:
				System.err.println("(;-_-)~~\nbye bye  . . .");
				ciclo = false;
			}
			
		}
		
		
		}
	
	@SuppressWarnings("resource")
	static int Validacion(String var) 
	{
		int val = 0;
		boolean ciclo = true;
		do 
		{
			Scanner sc = new Scanner(System.in);
			try 
			{
				val = Integer.parseInt(var);
				ciclo = false;
			}catch (Exception e) 
			{
				System.out.println("¡Ingrese un valor valido!");
				var = sc.nextLine();
			}
			if(val < 1 || val > 5) 
			{
				System.out.println("¡Ingrese un valor valido!");
				var = sc.nextLine();
			}
		}while(ciclo || val < 1 || val > 5);
		return val;
	}

}
