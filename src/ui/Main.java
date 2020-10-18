package ui;
import java.util.Scanner;
import model.Championship;
public class Main{

	private Championship championship;
	private Scanner sc;

	public Main(){
		sc= new Scanner(System.in);
		createChampionship();
	}

	public static void main(String [] args){
		Main objMain= new Main();
		int option;
		do{
			option=objMain.showMenu();
			objMain.chosenOption(option);
		}while(option!=3);
		
	}

	public int showMenu(){
		System.out.println("Seleccione una opcion:\n"+
				"(1) Registrar informacion de un piloto\n"+
				"(2) Mostrar el promedio del tiempo en las carreras de cada piloto \n"+
				"(3) Salir");
		int option= sc.nextInt();
		return option;
	}

	public void chosenOption(int op) {
		
		switch(op) {
		case 1:
			registerPilots();
			break;
		case 2:
			showAveragePilots();
			break;
		case 3:
			System.out.println("\nHasta la proxima!");
			break;
	
	
		
		default:
			System.out.println("\n Error, opcion no valida \n");
		
		}
	}

	public void createChampionship(){
		System.out.println("-----------------------------------------------------------");
		System.out.println("CAMPEONATO FIA \n");
		
		System.out.println("Ingrese el anio del campeonato");
		int year= sc.nextInt();
		
		System.out.println("\nIngrese el numero de carreras del campeonato");
		int races= sc.nextInt();

		championship= new Championship(year, races);
		System.out.println("-----------------------------------------------------------");
	}

	public void registerPilots(){
		sc.nextLine();
		System.out.println("-----------------------------------------------------------");
		System.out.println("REGISTRAR PILOTO \n");
		
		System.out.println("Ingrese el nombre del piloto");
		String name=sc.nextLine().toUpperCase();

		System.out.println("\nIngrese la edad del piloto");
		int age=sc.nextInt();
		sc.nextLine();
		boolean control=false;
		String team;
		do{
			System.out.println("\nIngrese el equipo al que pertenece el piloto"+ 
				" (SCUDERIA FERRARI, MCLAREN F1 TEAM, RED BULL RACING, MERCEDES AMG,"+
				" RACING POINT, ALFA ROMEO, RENAULT, WILLIAMS");
			team=sc.nextLine().toUpperCase();
			if(team.equals("SCUDERIA FERRARI") 
				||team.equals("MCLAREN F1 TEAM") 
				||team.equals("RED BULL RACING") 
				|| team.equals("MERCEDES AMG") 
				|| team.equals("RACING POINT") 
				|| team.equals("ALFA ROMEO") 
				|| team.equals("RENAULT")
				 || team.equals("WILLIAMS")){
				
				control=false;
			}
			else{
				control=true;
				System.out.println("Equipo no valido, ingrese nuevamente");
			}

		}while(control);
		

		int[] scoreRaces= new int [championship.getRaces()];
		for(int i=0; i<scoreRaces.length; i++){
			System.out.println("\nIngrese el tiempo en segundos del piloto en la carrera "+(i+1));
			scoreRaces[i]=sc.nextInt();
		}
		
		

		System.out.println("-----------------------------------------------------------");
		if(championship.findPilot(name)){
			System.out.println("\nNo es posible registrar el piloto, ya ha sido registrado un piloto con el mismo nombre \n");
			System.out.println("-----------------------------------------------------------");

		}
		if(championship.getPilots()[14]!=null){
			System.out.println("\nNo es posible registrar el piloto, ya ha se ha registrado la cantidad maxima (15) \n");
			System.out.println("-----------------------------------------------------------");
		}
		championship.addPilot(name, age, team, scoreRaces);
		
	}

	public void showAveragePilots(){
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("MOSTRAR EL PROMEDIO DEL TIEMPO EN LAS CARRERAS DE CADA PILOTO \n");
		System.out.println(championship.showAverageTimes());
		
		System.out.println("-----------------------------------------------------------");
	
	}



}
