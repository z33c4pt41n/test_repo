package com.epam.jmp.dr.task1.calculator;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.epam.jmp.dr.task1.calculator.expression.ExpressionResolver;
import com.epam.jmp.dr.task1.calculator.operators.Operator;

public class Calculator {

	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(
	            System.in));

		while(true)
		{
		    System.out.println("Type some expression. Supported operations: '+ - / *'. Brackets are not supported. Type 'exit' to exit programm");
		    String str = "";
			try {
				str = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(str.equals("exit"))
			{
				break;
			}
			float result = 0;
			try
			{
				result = ExpressionResolver.resolve(str);
			}
			catch(UnsupportedOperationException e)
			{
				System.err.println("Sorry, this operation is not supported");
			}
			System.out.println(str + " = " + result);
		}
		
		
		/*Operator[] operators = OperatorsContainer.getInstance().getAvailableOperators();
		for(Operator o : operators)
		{
			System.out.println(o.getExpression());
		}*/
		
		
		/*String expression = "2.7+3.5";
		String regex = "(\\d+\\.*\\d*)\\+(\\d+\\.*\\d*)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(expression);
		
		matcher.find();
		
		String leftOperandStr = matcher.group(1);
		String rightOperandStr = matcher.group(2);
		
		
		System.out.println(leftOperandStr);
		System.out.println(rightOperandStr);
		
		float leftOperand = Float.parseFloat(leftOperandStr);
		float rightOperand = Float.parseFloat(rightOperandStr);
		
		System.out.println(leftOperand + rightOperand);*/
		
		/*String expression = "2 + 3 - 1";
		float result = ExpressionResolver.resolve(expression);
		System.out.println(result);*/
	}

}
