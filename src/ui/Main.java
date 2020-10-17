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
		objMain.menu();
	}

	public void menu(){
		boolean menu=true;
	}

	public void createChampionship(){
		System.out.println("-----------------------------------------------------------");
		System.out.pritnln("CAMPEONATO FIA \n");
		System.out.pritnln("Ingrese el anio del campeonato");
		int year= sc.nextInt();
		System.out.pritnln("\nIngrese el numero de carreras del campeonato");
		int races= sc.nextInt();

		championship= new Championship(year, races);
	}

	public void registerPilots(){
		sc.nextLine();
		System.out.println("-----------------------------------------------------------");
		System.out.pritnln("REGISTRAR PILOTO \n");
		//	public Pilot(String pName, int pAge, Team pTeam, int[] pScores)
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
			System.out.pritnln("Ingrese el tiempo en segundos del piloto en la carrera "+(i+1));
			scoreRaces[i]=sc.nextInt();
		}
		championship.addPilot(name, age, team, scoreRaces);
		

		System.out.println("-----------------------------------------------------------");
		if(championship.findPilot(name)){
			System.out.pritnln("No es posible registrar el piloto, ya ha sido registrado anteriormente");
		}
	}



}
