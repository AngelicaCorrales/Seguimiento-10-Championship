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
		System.out.pritnln("CAMPEONATO");
		System.out.pritnln("Ingrese el anio del campeonato");
		int year= sc.nextInt();
		System.out.pritnln("Ingrese el numero de carreras del campeonato");
		int races= sc.nextInt();

		championship= new Championship();
	}

}
