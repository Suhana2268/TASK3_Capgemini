package Demo;

import java.util.Scanner;

public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		d1.setName("Ruby");
		d1.setAge(4);
		d1.setWeight(10);
		System.out.println(d1.getWeight()+"Ruby weight");
	    d1.doFeedAnimal();
		//d1.playGames();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of trails of "+d1.getName());
		int n = sc.nextInt();
		d1.numOfPlays(n);
		d1.playGames();
		System.out.println(d1.getName()+" - weight is "+d1.getWeight()+" - Age is "+d1.getAge()+" - Play Game: "+d1.playStatus());
		
		
		Dog d2 = new Dog();
		d2.setName("Snoopy");
		d2.setAge(7);
		d2.setWeight(26);
		//System.out.println(d2.getWeight()+"Snoopy weight");
		
		d2.doFeedAnimal();
		System.out.println("enter the number of trails of "+d2.getName());
		int n2 = sc.nextInt();
		d2.numOfPlays(n2);
		d2.playGames();
		
		/**Dog d3 = new Dog();
		d3.setName("Puppy");
		d3.setAge(10);
		d3.setWeight(30);
		//System.out.println(d3.getWeight()+"Puppy weight");
		d3.doFeedAnimal();
		System.out.println("enter the number of trails of "+d3.getName() );
		int n3 = sc.nextInt();
		
		d3.numOfPlays(n3);
		d3.playGames();**/
		
		Dog d4 = new Dog();
		d4.setName("Sam");
		d4.setAge(2);
		d4.setWeight(12);
		//System.out.println(d4.getWeight()+"Sam weight");
		d4.doFeedAnimal();
		System.out.println("enter the number of trails of"+d4.getName());
		int n4 = sc.nextInt();
		d4.numOfPlays(n4);
		d4.playGames();
		
		
			System.out.println(d2.getName()+" - weight is "+d2.getWeight()+" - Age is "+d2.getAge()+" - Play Game: "+d2.playStatus());
			//System.out.println(d3.getName()+"- weight is "+d3.getWeight()+"- Age is "+d3.getAge()+" - Play Game: "+d3.playStatus());
			System.out.println(d4.getName()+" - weight is "+d4.getWeight()+" - Age is "+d4.getAge()+" - Play Game: "+d4.playStatus());
			
		
	}

}
