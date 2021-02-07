package com;

public class ArithmeticImpl implements IArithmetic{
	
	@Override
	public int sum(int a, int b) {
		System.out.println("Sum method");
		return a+b;
	}
}
