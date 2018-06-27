package catsound;

public class Cat{
	int catSound;
	public Cat(int Age){
		Age = catSound;
	}
	public void CatCall(){
		for(int Age=1; Age<3;Age++)
		System.out.println("(((Meu)))>>>> (((Meu))) - I would like to eat some fish.");
		System.out.println(" >>>>> I am so hungery !!");
	}
	public void run(int feet) {
	    
	    System.out.println(" >>>>>> \nHey!! I can ran " + feet + " Kmh!");
	    System.out.println(" >>>>>> You don't care me right! ");

		}
public void color() {
	    
	    System.out.println(" >>>>>> \nHelloo!!! Do you know..My color is White!");

		}
	public static void main(String[] args) {
		
	Cat Sound = new Cat(8);
	Sound.CatCall();
	Sound.run(10);
	Sound.color();
	
	}

}


   