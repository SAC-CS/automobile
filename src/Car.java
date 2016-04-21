import java.util.Scanner;	
public class Car {

	public static void main(String[] args) {
        automobile yellow = new automobile(); 
        yellow.setNumberOfDoors(4); 
        yellow.setColor("Yellow"); 
        yellow.setName("Cabbie"); 
        System.out.println(yellow.about()); 
         
        automobile red = new automobile(); 
         red.setNumberOfDoors(2); 
         red.setColor("Red"); 
         red.setName("Sporty"); 
         System.out.println(red.about());
         
          
         automobile green = new automobile(); 
         green.setNumberOfDoors(5); 
         green.setColor("Green"); 
         green.setName("Vanny"); 
         System.out.println(green.about());
         
     } 
		
		

	}

