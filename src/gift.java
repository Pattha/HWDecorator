public class gift extends Decoration {
Flower Flower;
	
	public gift (Flower Flower){
		this.Flower = Flower;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return Flower.getDescription()+",�ͧ��ѭ";
	}
	
	public double cost(){
		return 200 + Flower.cost();
	}
}
