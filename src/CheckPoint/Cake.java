package CheckPoint;

public abstract class Cake { 
           
	protected String name; 
            protected double rate; 
            protected int extra;
            public Cake (String n, double r, int a) { 
                name = n; 
                rate = r; 
                extra = a;
            } 
            
            public abstract double calcPrice(); 
            
            public String toString() {
                return name + "/t" + rate;
            } 
        }


/*

A) Based on class Cake and the following table, define TWO (2) subclasses named as
        orderCake
        and
        readymadeCake.

B) By using classes definition from a), write an application program that will: 
        i) declare an array of 20 cake objects; 
        ii) input data for cake objects and store them into the array; 
        iii) display the total price for all types of cakes; 
        iv) display the total price and the quantity sold for ready made cakes; 
        v) display the information for the cake that has been sold for the highest price.


*/