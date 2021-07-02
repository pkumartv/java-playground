package corejava.basics.enums;

public class EnumDemo {

	public enum schemaStatus {CURRENT, UPDATED};
	
	public static schemaStatus hasChanged() {
		return schemaStatus.CURRENT;
		
	}
	public static void main(String[] args) {
		
		schemaStatus ok=hasChanged();
		System.out.println("String main"+ok.toString());
		if(hasChanged()==schemaStatus.CURRENT)
			System.out.println(true);

		
		System.out.print("output from "+hasChanged());

	}

}
