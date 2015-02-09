package com.leo.pattern;

public class SoldState implements State {
	private VendingMachine mMachine;

	public SoldState(VendingMachine machine) {
		mMachine = machine;
	}

	@Override
	public void insertMoney() {
		System.out.println("已经投币，请不要重复投币");
	}

	@Override
	public void backMoney() {
		System.out.println("商品正在出售，不能退回硬币");
	}

	@Override
	public void turnCrank() {
		System.out.println("商品正在出售，转动手柄操作无效");
	}

	@Override
	public void dispense() {
		int number = mMachine.getNumber();
		if(number > 0){
			number = number - 1;
			mMachine.setNumber(number);
			System.out.println("请取走商品");
		}
		if(number <= 0){
			mMachine.setCurrentState(mMachine.getSoldOutState());
		}else{
			mMachine.setCurrentState(mMachine.getNoMoneyState());
		}
	}

}
