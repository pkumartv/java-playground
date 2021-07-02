package corejava.basics;

public class ReturnCheck {
	
	
	public static Integer test() {
		
		try {
			System.exit(0);
			throw new Exception("Lets test");
			//return 5;
		
		} catch (Exception e) {
			// TODO: handle exception
			return 10;
		}
		finally{
			return 20;
		}
	}
	public static void main(String[] args) {
	
		System.out.println(test());
	}

}
