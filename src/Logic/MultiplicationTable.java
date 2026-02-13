package Logic;

import java.util.Iterator;

public class MultiplicationTable {

	public static void main(String[] args) {
		int number=5;
		System.out.println(number+"table");
		for(int i=1;i<=10;i++) {
			System.out.println(number+"="+"X"+i+"="+(number*i));
		}
		
	}
}
