package com.epam.jmp.dr.task1.calculator.operators;

import com.epam.jmp.dr.task1.calculator.expression.Operand;

public interface Operator extends Comparable<Operator> {
	
	float getResult(Operand leftOperand, Operand rightOperand);
	
	String getExpression();
	
	int getPriority();
	
	float evaluate(String expression);

}
