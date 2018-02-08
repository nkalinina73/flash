package monday;

import java.util.Scanner;

public class ConeValue {

		  public static double Volume(double r,double h) //modifier returnType nameOfMethod (Parameters)
	        {  
	         
	                     double  a=(22*r*r*h)/(3*7);
	                      
	                      return a;//return the volume
	          }   
	           public static void main(String args[]) //modifier returnType nameOfMethod (Parameters)
	            {  
	              
	                    Scanner s= new Scanner(System.in);
	                     System.out.println("Enter the radius of cone:");
	                     double r=s.nextDouble();
	                        System.out.println("Enter the height of cone:");
	                     double h=s.nextDouble();
	                     //object of a class
	                     ConeValue v=new ConeValue();
	                         double  a=v.Volume(r,h); 
	        
	                     System.out.println("Volume Of Cone is:" +a);
	              }
	

}
