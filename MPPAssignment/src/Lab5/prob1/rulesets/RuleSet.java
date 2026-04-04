package Lab5.prob1.rulesets;

import Lab5.prob1.gui.BookWindow;
import Lab5.prob1.gui.Window;

import java.awt.Component;
import java.awt.print.Book;

public interface RuleSet {
	public void applyRules(Component ob) throws RuleException;

	default void priceFloatingRule(String value) throws RuleException
	{
		try {
			Double.parseDouble(value);
		}
		catch(NumberFormatException ex)
		{
			throw new RuleException("Price must be a floating point number.");
		}

		String decimalValue = value.split("\\.")[1];
		if(decimalValue.length() != 2)
		{
			throw new RuleException("Price must be a floating point number with two decimal places ");
		}
	}

	default void priceGreaterRule(String value) throws RuleException
	{
		try {
			double doubleValue = Double.parseDouble(value);
			if(doubleValue <= 0.49)
			{
				throw new RuleException("Price must be a number greater than 0.49.");
			}
		}
		catch(NumberFormatException ex)
		{
			throw new RuleException("Price must be a floating point number.");
		}


	}
}
