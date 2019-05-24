package CheckPoint;

public class runner{

	public static void main(String[] args) {
		Cake[] cakes = new Cake[20];
		
		
	
		cakes[0] = new orderCake("a", 10, 3);
		cakes[1] = new readymadeCake("b", 10, 1);
		cakes[2] = new readymadeCake("c", 10, 2);
		cakes[3] = new orderCake("d", 10, 4);
		cakes[4] = new readymadeCake("e", 10, 9);
		cakes[5] = new orderCake("f", 10, 3);
		cakes[6] = new orderCake("g", 10, 5);
		cakes[7] = new readymadeCake("h", 10, 10);
		cakes[8] = new orderCake("i", 10, 14);
		cakes[9] = new orderCake("j", 10, 13);
		cakes[10] = new orderCake("k", 10, 3);
		cakes[11] = new orderCake("l", 10, 9);
		cakes[12] = new readymadeCake("m", 10, 2);
		cakes[13] = new orderCake("n", 10, 22);
		cakes[14] = new orderCake("o", 10, 3);
		cakes[15] = new readymadeCake("p", 10, 15);
		cakes[16] = new orderCake("q", 10, 4);
		cakes[17] = new readymadeCake("r", 10, 11);
		cakes[18] = new orderCake("s", 10, 1);
		cakes[19] = new readymadeCake("t", 10, 2);
		
		double gtotal = 0;
		
		for (Cake cake : cakes) {
			
			gtotal+= cake.calcPrice();
			
		}
		System.out.println("all cakes:"+ gtotal);
		
		double rdyTotal = 0;
		int qntytotal = 0;
		for (Cake cake : cakes) {
			if(cake instanceof readymadeCake) {
				rdyTotal += cake.calcPrice();
				qntytotal += cake.extra;
				
		}
		
	}
		
System.out.println("readymadecake:"+ rdyTotal + "     "+ qntytotal);
	
		int high = 0;
		for (int i = 0; i < cakes.length; i++) {
			
			
			if(cakes[i].calcPrice() >= cakes[high].calcPrice()) {
				high = i;
			}
			
			
		}
		
		System.out.println("the highest price was "+ high + " which costed "+ cakes[high].calcPrice());
		
		
		
		
	}
	
	
	
}
