package dp.builder;


/*
 * Builder pattern simulates named optional parameters as found in python and scala.
 */
public class NutritionFacts {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;

	public static class Builder {
		// Required Parameters
		private final int servingSize;
		private final int servings;
		// Optional Parameters
		// No final below
		private int calories = 0;
		private int fat = 0;

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;

		}

		public Builder calories(int val) {
			this.calories = val;
			return this;
		}

		public Builder fat(int val) {
			this.fat = val;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);

		}
	}

	
	/*
	 * “The NutritionFacts class is immutable, and all parameter default values are in one place. 
	 * The builder’s setter methods return the builder itself so that invocations can be chained, 
	 * resulting in a fluent API.”
	 * Excerpt From: Joshua Bloch. “Effective Java”. Apple Books. 
	 */
	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
	}
	
	public static void main(String[] args) {
		NutritionFacts cocaCola= new NutritionFacts.Builder(240, 8).build();
		
		NutritionFacts pepsi= new NutritionFacts.Builder(240, 8).calories(40).fat(100).build();
	}
}
