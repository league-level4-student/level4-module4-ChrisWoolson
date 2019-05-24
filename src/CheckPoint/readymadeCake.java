package CheckPoint;

public class readymadeCake extends Cake{

	public readymadeCake(String n, double r, int a) {
		super(n, r, a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcPrice() {
		double total = this.rate * this.extra;
		return total;
	}

}
