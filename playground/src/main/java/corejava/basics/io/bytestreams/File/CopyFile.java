package corejava.basics.io.bytestreams.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	
	public static void main(String[] args) {
		int n;
		
		if(args.length!=2) {
			System.out.println("Usage CopyFile file1 file2");
			return;
		}
		
		for(int i=0;i<args.length;i++)
			System.out.println(i+" : "+args[i]);
		
		System.out.println("About to open files");
		try (FileInputStream fin= new FileInputStream(args[0]);
		     FileOutputStream fout=new FileOutputStream(args[1]); ){
			


		System.out.println("About to read files");
			do {
			n=fin.read();
			System.out.println((char)n);
			
			if(n!=-1) 
				fout.write(n);
			}while(n!=-1);
		
		} catch ( IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
