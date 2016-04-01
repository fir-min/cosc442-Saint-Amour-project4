package FactoryClasses;

import edu.towson.cis.cosc442.project4.coffeemaker.Recipe;



/**
 * The class <code>RecipeFactory</code> implements static methods that return instances of the class <code>{@link Recipe}</code>.
 *
 * @generatedBy CodePro at 4/1/16 10:40 AM
 * @author FIRMS
 * @version $Revision: 1.0 $
 */
public class RecipeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 4/1/16 10:40 AM
	 */
	private RecipeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Recipe}</code>.
	 *
	 * @generatedBy CodePro at 4/1/16 10:40 AM
	 */
	public static Recipe createRecipe() {
		return new Recipe();
	}
}