package com.leo.pattern;

public class NoMoneyState implements State {
	private VendingMachine mMachine;

	public NoMoneyState(VendingMachine machine) {
		mMachine = machine;
	}

	@Override
	public void insertMoney() {
		System.out.println("投币");
		mMachine.setCurrentState(mMachine.getHasMoneyState());
	}

	@Override
	public void backMoney() {
		System.out.println("没有硬币可以退回");
	}

	@Override
	public void turnCrank() {
		System.out.println("请先投币,然后转动把手");
	}

	@Override
	public void dispense() {
		System.out.println("没有投币，不能出售商品");
	}

}
