package com.epam.jmp.dr.task1.calculator.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.epam.jmp.dr.task1.calculator.operators.DiffOperator;
import com.epam.jmp.dr.task1.calculator.operators.DivOperator;
import com.epam.jmp.dr.task1.calculator.operators.MulOperator;
import com.epam.jmp.dr.task1.calculator.operators.Operator;
import com.epam.jmp.dr.task1.calculator.operators.SumOperator;

public class OperatorsContainer {
	
	private static OperatorsContainer instance = null;
	
	private Operator[] operators;
	
	private OperatorsContainer()
	{
		List<Operator> o = new ArrayList<Operator>();
		
		o.add(new SumOperator());
		o.add(new DiffOperator());
		o.add(new MulOperator());
		o.add(new DivOperator());
		
		operators = new Operator[o.size()];
		operators = o.toArray(operators);
		Arrays.sort(operators);
	}
	
	public Operator[] getAvailableOperators()
	{
		return operators;
	}
	
	public static OperatorsContainer getInstance()
	{
		if(instance == null)
		{
			instance = new OperatorsContainer();
		}
		return instance;
	}

}
