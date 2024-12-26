package day22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayL {
public static void main(String[] args) {
	
	ArrayList lol = new ArrayList();
	lol.add(17);
	lol.add(22);
	lol.add("Lucky");
	lol.add("Baki");
	lol.add(777);
	
	System.out.println(lol); 
	ArrayList cal = new ArrayList();
	
	cal.add(17);
	cal.add(22);
	cal.add(3);
	cal.add(5);
	cal.add(879);
//	cal.addAll(lol);
	System.out.println(cal);
	Collections.sort(cal);
	System.out.println(cal);
	Collections.sort(cal,Comparator.reverseOrder());
	System.out.println(cal);
}

}
