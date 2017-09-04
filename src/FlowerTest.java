public class FlowerTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Flower f1 = new Lilly();
     f1 = new gift(f1);
     f1 = new Leaves(f1);
     System.out.println(f1.getDescription()+"            ß   "+f1.cost());	
     
     Flower f2 = new WhiteRose();
     f2 = new gift(f2);
     f2 = new Leaves(f2);
     System.out.println(f2.getDescription()+"   ß    "+f2.cost());	
    
     Flower f3 = new RedRose();  
     f3 = new gift(f3);
     f3 = new Leaves(f3);
     System.out.println(f3.getDescription()+"   ß    "+f3.cost());
    
     Flower f4 = new Chrysanthemum(); 
     f4 = new gift(f4);
     f4 = new Leaves(f4);
    System.out.println(f4.getDescription()+"   ß    "+f4.cost());   
    
   
	
    
	}}


