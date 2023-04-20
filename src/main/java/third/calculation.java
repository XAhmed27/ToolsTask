package third;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class calculation
{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private int n1; //first number
   private int n2; // second number 

 
   private String x;
   // x= the chosen operation of *,-,+,/

   public int getId(){
	   return id;
   }

   public void setId(int id) {
	   
	   
	   this.id = id;
    }

   public int getN1(){
	   
	   return n1;
   }

   public void setN1(int n1) {
	   
	   this.n1 = n1;
   }

   public int getN2() {
	   
	   
	   return n2;
   }

   public void setN2(int n2) {
	   
	
	   this.n2 = n2;
   }

   public String getX() {
	   return x;
   }

   public void setX(String x) {
	   this.x = x;
   }
}

