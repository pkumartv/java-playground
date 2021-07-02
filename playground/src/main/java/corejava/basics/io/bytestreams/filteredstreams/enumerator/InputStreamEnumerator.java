package corejava.basics.io.bytestreams.filteredstreams.enumerator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Vector;

public class InputStreamEnumerator implements Enumeration<FileInputStream> {
	private Enumeration<String> files;
	
	public InputStreamEnumerator(Vector<String> files) {
		this.files=files.elements();
	}
	
	
	@Override
	public boolean hasMoreElements() {
		
		return files.hasMoreElements();
	}

	@Override
	public FileInputStream nextElement() {
		try {
			System.out.println("ok:: "+files.nextElement());
			//System.out.println(files.nextElement().toString());
			return new FileInputStream(files.nextElement().toString());
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}

}
