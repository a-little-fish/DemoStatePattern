package com.leo.pattern;

public class VendingMachine {
	private int mNumber;
	private State mCurrentState;

	private NoMoneyState mNoMoneyState;
	private HasMoneyState mHasMoneyState;
	private SoldState mSoldState;
	private SoldOutState mSoldOutState;

	public VendingMachine() {
		mNumber = 10;

		mNoMoneyState = new NoMoneyState(this);
		mHasMoneyState = new HasMoneyState(this);
		mSoldState = new SoldState(this);
		mSoldOutState = new SoldOutState(this);

		setCurrentState(mNoMoneyState);
	}

	public int getmNumber() {
		return mNumber;
	}

	public NoMoneyState getNoMoneyState() {
		return mNoMoneyState;
	}

	public HasMoneyState getHasMoneyState() {
		return mHasMoneyState;
	}

	public SoldState getSoldState() {
		return mSoldState;
	}

	public SoldOutState getSoldOutState() {
		return mSoldOutState;
	}

	public int getNumber() {
		return mNumber;
	}

	public void setNumber(int number) {
		mNumber = number;
	}


	public void insertMoney() {
		mCurrentState.insertMoney();
	}

	public void backMoney() {
		mCurrentState.backMoney();
	}

	public void turnCrank() {
		mCurrentState.turnCrank();
	}

	public void dispense() {
		mCurrentState.dispense();
	}

	public State getCurrentState() {
		return mCurrentState;
	}

	public void setCurrentState(State currentState) {
		mCurrentState = currentState;
	}

}
