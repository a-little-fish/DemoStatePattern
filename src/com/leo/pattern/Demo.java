package com.leo.pattern;

public class Demo {

	public static void main(String[] args) {
		VendingMachine machine = new VendingMachine();
		machine.insertMoney();
		machine.turnCrank();
		machine.turnCrank();
		machine.turnCrank();
		machine.turnCrank();
		machine.dispense();
	}

}
