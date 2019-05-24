package CheckPoint;

public class orderCake extends Cake{

	
	
	public orderCake(String n, double r, int a) {
		super(n, r, a);
		
	}
	
	@Override
	public double calcPrice() {
		// TODO Auto-generated method stub
		double total = this.rate * this.extra;
		return total;
	}

}
