package corejava.basics.confusing.staticaccess;

public class TradingSystem {

	private static String category = "electronic trading system";
	public static void main(String[] args) {
		  TradingSystem systems = null;
          System.out.println(systems.category);
	}

}
