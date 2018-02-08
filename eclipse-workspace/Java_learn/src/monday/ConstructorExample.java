package monday;

public class ConstructorExample {
   String name;
   int age;
   
   public ConstructorExample(String name)
   {
	   this.name=name;
   }

   public ConstructorExample(String name, int age)
   {
	   this.name=name;
	   this.age=age;
   }
   
   public void Display()
   {
	   System.out.println("Name: " + this.name);
	   System.out.println("Age: " + this.age);	   
   }
   
   public static void main(String[] args) {
      ConstructorExample daughter = new ConstructorExample("Maria", 12);//object of class
	  ConstructorExample boy = new ConstructorExample("Alec");      
      
      daughter.Display();
      boy.Display();
      
	  
   }
}