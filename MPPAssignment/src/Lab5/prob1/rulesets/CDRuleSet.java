package Lab5.prob1.rulesets;

import java.awt.Component;

import Lab5.prob1.gui.CDWindow;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {

	private CDWindow cdWindow;
	@Override
	public void applyRules(Component ob) throws RuleException
	{
		cdWindow = (CDWindow) ob;
		nonEmptyRule();
		priceFloatingRule();
		priceGreaterRule();
	}

	private void nonEmptyRule() throws RuleException {
		if(cdWindow.getArtistValue().trim().isEmpty() ||
				cdWindow.getPriceValue().trim().isEmpty() ||
				cdWindow.getTitleValue().trim().isEmpty()
		)
		{
			throw new RuleException("All field must be nonempty.");
		}
	}

	private void priceFloatingRule() throws RuleException {
		priceFloatingRule(cdWindow.getPriceValue().trim());
	}

	private void priceGreaterRule() throws RuleException
	{
		priceGreaterRule(cdWindow.getPriceValue().trim());

	}
	
}
