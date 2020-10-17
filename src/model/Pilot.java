package model;
/*public enum Team{
	SCUDERIA_FERRARI("SCUDERIA FERRARI"),
	MCLAREN_F1_TEAM("MCLAREN F1 TEAM"),
	RED_BULL_RACING("RED BULL RACING"), 
	MERCEDES_AMG("MERCEDES AMG"),
	RACING_POINT("RACING POINT"),
	ALFA_ROMEO("ALFA ROMEO"),
	RENAULT("RENAULT"),
	WILLIAMS("WILLIAMS");
}
*/
public class Pilot{
	//attributes
	private String name;
	private int age;
	private String team;
	private int[] scores;

	//methods
	public Pilot(String pName, int pAge, String pTeam, int[] pScores){
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

	public String getTeam(){
		return team;
	}

	public void setTeam(String pTeam){
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
			
				sumScores+=scores[i];
			
		}
		average=sumScores/quantityRaces;

		return average;
	}
}