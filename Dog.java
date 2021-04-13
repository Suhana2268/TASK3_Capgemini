package Demo;

public class Dog {
	private String name;
	private int age;
	private int weight;
	private boolean status;
	private String playStatus;
	private int numOfPlays;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	public int getNumOfPlays() {
		return numOfPlays;
	}
	public void setNumOfPlays(int numOfPlays) {
		this.numOfPlays = numOfPlays;
	}
	public String getPlayStatus() {
		return playStatus;
	}
	public void setPlayStatus(String playStatus) {
		this.playStatus = playStatus;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void doFeedAnimal() {
		this.weight += 10;
	}
	
	public void playGames() {
		if(weight <= 2 || weight > 30) {
			status = false;
		}
		else {
			status = true;
			weight -= 1;
		}
	}
	
	public String playStatus() {
		if(status == false) {
			return "Oops! "+name+" cannot play the game.. Feed it!";
		}
		return name+" is ready to play game";
	}
	
	public int numOfPlays(int n) {
		for(int i = 1; i <= n; i++) {
		playGames();
		}
		return weight;
	}
	

}
