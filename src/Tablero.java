
import java.util.ArrayList;
import java.util.Scanner;

public class Tablero {
	
	private Huevo huevo = new Huevo();
	
	private Carro kromi = new Kromi();
	private Carro caguano = new Caguano();
	private Carro trupalla = new Trupalla();
	
	
	private String tablero[][] = new String[15][15];
	private String tabHuevos[][] = new String[15][15];
	private ArrayList<ArrayList> carroList = new ArrayList(18);
	private ArrayList<String> huevoList = new ArrayList();
	
	public Tablero() {}
	
	public void CrearCarro() 
	{
		GenerarTableroVacio();
		if(kromi instanceof Kromi)this.tablero=((Kromi)kromi).CrearCarro(tablero);
		if(caguano instanceof Caguano)this.tablero=((Caguano)caguano).CrearCarro(tablero);
		if(trupalla instanceof Trupalla)this.tablero=((Trupalla)trupalla).CrearCarro(tablero);
		
		ToCarroList(kromi.GetUbiTablero());
		ToCarroList(caguano.GetUbiTablero());
		ToCarroList(trupalla.GetUbiTablero());
		
	}
	
	public void MostrarMatriz() 
	{
		for(int i = 0; i < this.tablero.length; i++) 
		{
			System.out.println("-------------------------------------------------------------");
			System.out.println(
					"|"+this.tablero[i][0]+"|"+this.tablero[i][1]+"|"+this.tablero[i][2]+"|"+this.tablero[i][3]+"|"+this.tablero[i][4]+
					"|"+this.tablero[i][5]+"|"+this.tablero[i][6]+"|"+this.tablero[i][7]+"|"+this.tablero[i][8]+"|"+this.tablero[i][9]+
					"|"+this.tablero[i][10]+"|"+this.tablero[i][11]+"|"+this.tablero[i][12]+"|"+this.tablero[i][13]+"|"+this.tablero[i][14]+"|");
		}
			System.out.println("-------------------------------------------------------------");
	}
	
	public void MatrizHuevos() 
	{
		GenerarTableroHuevos();
		if(this.huevoList.size() >= 1) 
		{		System.out.println("                       -Lanzamientos-");
			for(int i = 0; i < this.tablero.length; i++) 
			{	
				System.out.println("-------------------------------------------------------------");
				System.out.println(
						"|"+this.tabHuevos[i][0]+"|"+this.tabHuevos[i][1]+"|"+this.tabHuevos[i][2]+"|"+this.tabHuevos[i][3]+"|"+this.tabHuevos[i][4]+
						"|"+this.tabHuevos[i][5]+"|"+this.tabHuevos[i][6]+"|"+this.tabHuevos[i][7]+"|"+this.tabHuevos[i][8]+"|"+this.tabHuevos[i][9]+
						"|"+this.tabHuevos[i][10]+"|"+this.tabHuevos[i][11]+"|"+this.tabHuevos[i][12]+"|"+this.tabHuevos[i][13]+"|"+this.tabHuevos[i][14]+"|");
			}
				System.out.println("-------------------------------------------------------------");
		}
	}
	
	@SuppressWarnings("resource")
	public void Iniciar() {
		boolean ciclo = true;
		
		do 
		{
			Scanner scanner = new Scanner(System.in);
			
			this.tablero = huevo.Lanzamientos(this.tablero, this.carroList);
			this.huevoList.add(huevo.GetFilaHuevo()+","+huevo.GetColumnaHuevo());
			System.out.println("¿Desea continuar? (S/N)");
			String res = scanner.nextLine();
			
			if(res.equals("n") || res.equals("N")) 
			{
				ciclo = false;
			}
		}while(ciclo);
	}
	
	public void CalcularPuntaje() 
	{
		System.out.println("Tu puntaje es: "+huevo.GetPuntajeTotal());
		System.out.println("-----------------------");
	}
	
	private void GenerarTableroVacio() 
	{
		for(int i = 0; i < this.tablero.length; i++) 
		{
			for(int u = 0; u < this.tablero.length; u++) 
			{
				tablero[i][u] = "   ";
				tabHuevos[i][u] = "   ";
			}
		}
	}
	
	private void GenerarTableroHuevos() 
	{
		if(huevoList.size() >= 1) 
		{
			for(String arr : this.huevoList)
			{
				this.tabHuevos[huevo.Fila(arr)][huevo.Columna(arr)] = " H ";
			}
		}else
		{
			System.out.println("¡Aun no hay lanzamientos!");
		}
	}
	
	@SuppressWarnings({"rawtypes", "unchecked" })
	private void ToCarroList(ArrayList ubicacion) 
	{
		ArrayList<ArrayList> array = new ArrayList();
		
		array = ubicacion;
		
		for(ArrayList arr : array) 
		{
			this.carroList.add(arr);
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void UbicacionCarro(ArrayList ubicacion) 
	{
		ArrayList<ArrayList> array = new ArrayList();
		
		array = ubicacion;
		
		for(ArrayList arr : array) 
		{
			System.out.println(arr);
		}
	}
	

}
