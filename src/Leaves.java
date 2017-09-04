 public class Leaves extends Decoration {
Flower Flower;
		
		public Leaves (Flower Flower){
			this.Flower = Flower;
		}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return Flower.getDescription()+",„∫‰¡Èµ°·µËß";
	}
	
	public double cost(){
		return 100 + Flower.cost();
	}
}
