package corejava.basics.io.bytestreams.filteredstreams;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

import corejava.basics.io.bytestreams.filteredstreams.enumerator.InputStreamEnumerator;

public class SequenceInputStreamDemo {

	public static void main(String[] args) {
		int c;
		Vector<String> files =new Vector<String>();
		files.add("file1.txt");
		files.add("file2.txt");
		files.add("file3.txt");
		InputStreamEnumerator ise= new InputStreamEnumerator(files);
		try(InputStream input = new SequenceInputStream(ise);)
		{
			while((c=input.read())!=-1)
			{
				System.out.println((char)c);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
