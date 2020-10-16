package model;
public enum Team{
	SCUDERIA_FERRARI, MCLAREN_F1_TEAM, RED_BULL_RACING, MERCEDES_AMG, RACING_POINT, ALFA_ROMEO, RENAULT, WILLIAMS;
}

public class Pilot{
	//attributes
	private String name;
	private int age;
	private Team team;
	private int[] scores;

	//methods
	public Pilot(String pName, int pAge, Team pTeam, int[] pScores){
		name=pName;
		age=pAge;
		team=pTeam;
		scores= pScores;
	}

	public String getName(){
		return name;
	}

	public void setName(String pName){
		name=pName;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int pAge){
		age=pAge;
	}

	public Team getTeam(){
		return team;
	}

	public void setTeam(Team pTeam){
		team=pTeam;
	}

	public int[] getScores(){
		return scores;
	}

	public void setScores(int[] pScores){
		scores=pScores;
	}

	public double calculateAverage(){
		double sumScores=0;
		double average;
		int quantityRaces=scores.length;
		for(int i=0; i<scores.length;i++){
			if(scores[i]!=null){
				sumScores+=scores[i];
			}
		}
		average=sumScores/quantityRaces;

		return average;
	}
}