public class FlowerTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Flower f1 = new Lilly();
     System.out.println(f1.getDescription()+"            �   "+f1.cost());
		
     Flower f2 = new WhiteRose();
     System.out.println(f2.getDescription()+"   �    "+f2.cost());
		
     Flower f3 = new RedRose();  
     System.out.println(f3.getDescription()+"   �    "+f3.cost());
	
     Flower f4 = new Chrysanthemum();  
    System.out.println(f4.getDescription()+"   �    "+f4.cost());   
     
    Flower f5 = new Leaves(); 
    f5 = new gift(f5);
    System.out.println(f5.getDescription()+"   �    "+f5.cost());
	}

}
