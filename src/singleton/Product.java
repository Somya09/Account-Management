package singleton;

 class Gadget {
	
		public static Gadget instance=new Gadget(); //static object
				private Gadget(){} //Private Constructor
		//static method
				public static Gadget getInstance(){
			return instance;
		}
		void display(){
			System.out.println("hey");
		}
}
 public class Product{
	 public static void main(String args[]){
		 Gadget ob=Gadget.getInstance();
		 ob.display();
	 }
 }
 
