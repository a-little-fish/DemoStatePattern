package com.leo.pattern;

public class SoldOutState implements State {
	private VendingMachine mMachine;

	public SoldOutState(VendingMachine machine) {
		mMachine = machine;
	}

	@Override
	public void insertMoney() {
		System.out.println("商品售罄，请不要重复投币");
	}

	@Override
	public void backMoney() {
		System.out.println("商品售罄，退回硬币操作无效");
	}

	@Override
	public void turnCrank() {
		System.out.println("商品售罄，转动手柄操作无效");
	}

	@Override
	public void dispense() {
		System.out.println("商品售罄，不能出售");
	}

}
