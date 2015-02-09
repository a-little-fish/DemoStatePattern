package com.leo.pattern;

public class HasMoneyState implements State {
	private VendingMachine mMachine;

	public HasMoneyState(VendingMachine machine) {
		mMachine = machine;
	}

	@Override
	public void insertMoney() {
		System.out.println("已经投币，请不要重复投币");
	}

	@Override
	public void backMoney() {
		System.out.println("成功退回硬币");
		mMachine.setCurrentState(mMachine.getNoMoneyState());
	}

	@Override
	public void turnCrank() {
		System.out.println("转动手柄成功");
		mMachine.setCurrentState(mMachine.getSoldState());
	}

	@Override
	public void dispense() {
		System.out.println("请先转动手柄");
	}

}
