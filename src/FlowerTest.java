public class FlowerTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Flower f1 = new Lilly();
     System.out.println(f1.getDescription()+"   �"+f1.cost());
		
     Flower f2 = new WhiteRose();
     f2 = new gift(f2);
     System.out.println(f2.getDescription()+" �"+f2.cost());
		
     Flower f3 = new RedRose();
      f3 = new gift(f3);  
     System.out.println(f3.getDescription()+" �"+f3.cost());
	
     
     
	}

}
