package com.epam.jmp.dr.task1.calculator.operators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.epam.jmp.dr.task1.calculator.expression.Operand;

public class DiffOperator implements Operator {

	@Override
	public float getResult(Operand leftOperand, Operand rightOperand) {
		
		float result;
		result = leftOperand.eval() - rightOperand.eval();
		return result;
	}

	@Override
	public String getExpression() {
		return "(\\d+\\.*\\d*)-(\\d+\\.*\\d*)";
	}

	@Override
	public int getPriority() {
		return 1;
	}
	
	/**
	 * Violation of DRY principle
	 */
	@Override
	public int compareTo(Operator arg0) {
		if(arg0 == this)
		{
			return 0;
		}
		if(arg0.getPriority() > this.getPriority())
		{
			return 1;
		}
		if(arg0.getPriority() < this.getPriority())
		{
			return -1;
		}
		return 0;
	}
	
	@Override
	public float evaluate(String expression) {
		String regex = getExpression();
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(expression);
		
		matcher.find();
		
		String leftOperandStr = matcher.group(1);
		String rightOperandStr = matcher.group(2);
		
		float leftOperand = Float.parseFloat(leftOperandStr);
		float rightOperand = Float.parseFloat(rightOperandStr);
		
		return leftOperand - rightOperand;
		
	}

}
