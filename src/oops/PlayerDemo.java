package oops;

class Player
{
	String plyerName;
	Double price;
	
	public void getData(String Name, Double pri)
	{
		plyerName = Name;
		price  = pri;
	}
	public void showData()
	{
		System.out.println("Player Name ="+plyerName);
		System.out.println("player price =" +price);
	}
}
public class PlayerDemo {

	public static void main(String[] args) {
		
		Player pl = new Player();
		pl.getData("bharat", 8920.4d);
		pl.showData();
		
	}
}
