 public class Leaves extends Decoration {
Flower Flower;
		
		public Leaves (Flower Flower){
			this.Flower = Flower;
		}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return Flower.getDescription()+",���鵡��";
	}
	
	public double cost(){
		return 100 + Flower.cost();
	}
}
