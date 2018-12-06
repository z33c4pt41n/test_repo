package com.epam.jmp.dr.task1.calculator.expression;

import com.epam.jmp.dr.task1.calculator.operators.Operator;

public class Expression implements Evaluable {
	
	private Operand leftOperand;
	private Operand rightOperand;
	private Operator operator;
	
	public Expression(Operand leftOperand, Operand rightOperand, Operator operator)
	{
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
		this.operator = operator;
	}
	
	public float eval()
	{
		float result = operator.getResult(leftOperand, rightOperand);
		return result;
	}

}
