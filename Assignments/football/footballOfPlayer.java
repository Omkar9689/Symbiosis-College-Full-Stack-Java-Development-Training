package football;

public class footballOfPlayer {
	
	String nameOfPlayer;
	
	football fb = new football();
	
	public footballOfPlayer() {
		// TODO Auto-generated constructor stub
	}
	
	public footballOfPlayer(String name, football fb) {
		// TODO Auto-generated constructor stub
		
		this.nameOfPlayer = name;
		this.fb = fb;
	}

	public String getNameOfPlayer() {
		return nameOfPlayer;
	}

	public void setNameOfPlayer(String nameOfPlayer) {
		this.nameOfPlayer = nameOfPlayer;
	}
	
	

}
