package corejava.basics;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner conin = new Scanner(System.in);
		int count=0;
		double sum=0.0;
		
		System.out.println("Enter numbers to average");
		
		//Read and sum numbers
		while(conin.hasNext()) {
			if(conin.hasNextDouble()) {
				sum+=conin.nextDouble();
				count++;
			}
			else {
				
				String str=conin.next();
				if("done".equals(str)) break;
				else {
					System.out.println("data format error");
					return;
				}
						
			}
			
		}

		conin.close();
		System.out.println("Avg os numbers is "+(sum/count));
	}

}
