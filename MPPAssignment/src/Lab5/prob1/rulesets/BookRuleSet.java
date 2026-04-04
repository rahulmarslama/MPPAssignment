package Lab5.prob1.rulesets;

import java.awt.Component;
import java.awt.print.Book;
import java.math.BigInteger;

import Lab5.prob1.gui.*;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {
	private BookWindow bookWindow;

	@Override
	public void applyRules(Component ob) throws RuleException {
		bookWindow = (BookWindow) ob;
		nonEmptyRule();
		isbnNumericRule();
		isbnLengthRule();
		priceFloatingRule();
		priceGreaterRule();
	}


	private void nonEmptyRule() throws RuleException {
		if(bookWindow.getIsbnValue().trim().isEmpty() ||
				bookWindow.getPriceValue().trim().isEmpty() ||
				bookWindow.getTitleValue().trim().isEmpty()
		)
		{
			throw new RuleException("All field must be nonempty.");
		}
	}

	private void isbnNumericRule() throws RuleException {
		String value = bookWindow.getIsbnValue().trim();
		try {
			new BigInteger(value);
		} catch(NumberFormatException e) {
			throw new RuleException("Isbn must be numeric.");
		}

		if(value.length() != 10 && value.length() !=13)
		{
			throw new RuleException("Isbn must consist either 10 or 13 characters");
		}
	}

	private void isbnLengthRule() throws RuleException {
		String value = bookWindow.getIsbnValue().trim();
		int intValue = Integer.parseInt(value.substring(0,3));

		if(value.length() == 13)
		{
			if(intValue != 978 && intValue != 979 )
			{
				throw new RuleException("If Isbn has length 13, the first 3 digits must be either 978 or 979");
			}
		}
	}


	private void priceFloatingRule() throws RuleException {
		priceFloatingRule(bookWindow.getPriceValue().trim());
	}

	private void priceGreaterRule() throws RuleException
	{
		priceGreaterRule(bookWindow.getPriceValue().trim());

	}

}
