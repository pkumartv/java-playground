package corejava.basics.io.bytestreams.File;

import java.io.File;
import java.nio.file.Path;

public class FileDemo {
	static void p (String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		File f1= new File("Text.txt");
		
		p("File Name: "+f1.getName());
		p("Path: "+f1.getPath());
		p("Abs Path: "+ f1.getAbsolutePath() );
		p(f1.exists() ? "exists" : " does not exist");
		p("Can Write: "+ f1.canWrite());
		p("is Absolute: "+ f1.isAbsolute());
		p("File size: "+f1.length());
		
		Path newPath=f1.toPath();
		//newPath.
		
		
	}

}
