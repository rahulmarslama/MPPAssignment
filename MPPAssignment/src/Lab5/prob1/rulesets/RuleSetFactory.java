package Lab5.prob1.rulesets;

import java.awt.Component;
import java.util.HashMap;

import Lab5.prob1.gui.BookWindow;
import Lab5.prob1.gui.CDWindow;


final public class RuleSetFactory {
	private RuleSetFactory(){}
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();

	static {
		map.put(BookWindow.class, new BookRuleSet());
		map.put(CDWindow.class, new CDRuleSet());
	}
	public static RuleSet getRuleSet(Component c) {
		Class<? extends Component> cl = c.getClass();
		if(!map.containsKey(cl)) {
			throw new IllegalArgumentException(
					"Invalid component passed!");
		}
		return map.get(cl);
	}

}
