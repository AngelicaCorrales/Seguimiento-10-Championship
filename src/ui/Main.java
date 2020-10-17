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
		sc.nextLine();
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
			System.out.println("Hasta la proxima!");
			break;
	
	;
		
		default:
			System.out.println("Error, opcion no valida");
		
		}
	}

	public void createChampionship(){
		System.out.println("-----------------------------------------------------------");
		System.out.pritnln("CAMPEONATO FIA \n");
		
		System.out.pritnln("Ingrese el anio del campeonato");
		int year= sc.nextInt();
		
		System.out.pritnln("\nIngrese el numero de carreras del campeonato");
		int races= sc.nextInt();

		championship= new Championship(year, races);
		System.out.println("-----------------------------------------------------------");
	}

	public void registerPilots(){
		sc.nextLine();
		System.out.println("-----------------------------------------------------------");
		System.out.pritnln("REGISTRAR PILOTO \n");
		
		System.out.pritnln("Ingrese el nombre del piloto");
		String name=sc.nextLine();

		System.out.pritnln("\nIngrese la edad del piloto");
		int age=sc.nextInt();
		sc.nextLine();

		System.out.pritnln("\nIngrese el equipo al que pertenece el piloto");
		String team=sc.nextLine();
		///HAY QUE CONVERTIR EL STRING EN TEAM!!!
		int[] scoreRaces= new int [championship.getRaces()];
		for(int i=0; i<scoreRaces.length; i++){
			System.out.pritnln("\nIngrese el tiempo en segundos del piloto en la carrera "+(i+1));
			scoreRaces[i]=sc.nextInt();
		}
		championship.addPilot(name, age, team, scoreRaces);
		

		System.out.println("-----------------------------------------------------------");
		if(championship.findPilot(name)){
			System.out.pritnln("\nNo es posible registrar el piloto, ya ha sido registrado anteriormente");
		}
	}

	public void showAveragePilots(){
		System.out.println("-----------------------------------------------------------");
		
		System.out.pritnln("MOSTRAR EL PROMEDIO DEL TIEMPO EN LAS CARRERAS DE CADA PILOTO \n");
		System.out.pritnln(championship.showAverageTimes());
		
		System.out.println("-----------------------------------------------------------");
	
	}



}
