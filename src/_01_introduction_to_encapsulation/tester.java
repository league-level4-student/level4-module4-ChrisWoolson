package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tester {

	@Test
	void test() {
		EncapsulateTheData e = new EncapsulateTheData();
		
		e.mutatorInt(-2);
		assertEquals(e.accecorInt(), 0);

		e.mutatorFloat(2);
		assertEquals(e.accecorFloat(), 2);
		
		e.mutatorString("");
		assertEquals( e.accecorString(), " ");
		
		
		
		int s = 2;
		e.mutatorObj(s);
		int s2 = 2;
		assertEquals(e.accecor4Obj(), s2);
		
		
	}

}
