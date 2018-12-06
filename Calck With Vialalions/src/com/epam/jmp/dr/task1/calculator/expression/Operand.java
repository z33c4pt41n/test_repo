package com.epam.jmp.dr.task1.calculator.expression;

public class Operand implements Evaluable {
	private float value;
	
	public Operand(float value)
	{
		this.value = value;
	}

	public float eval()
	{
		return value;
	}
	
	
}
