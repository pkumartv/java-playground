package corejava.basics.io.bytestreams.File;

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFile {


	public static void main(String[] args) {
		int i;
		int size;
		//FileInputStream fin = null;
		
		if(args.length!=1) {
			System.out.println("Usage : ShowFile filename"+ args.toString());
			return;
		}
		
		try(FileInputStream fin= new FileInputStream(args[0])) {
			//fin= new FileInputStream(args[0]);
//			do {
//				i=fin.read();
//				if(i!=-1)
//					System.out.println((char)i);
//			} while (i!=-1);
			
			//Total available bytes
			System.out.println("Total available bytes: "+ (size=fin.available()));
			
			int n = size/40;
			//Read 40 bytes serially one byte at a time
			System.out.println("First"+ n + " bytes read one read() at a time");
			for(int j=0;j<n;j++)
				System.out.print((char)fin.read());
			
			byte b[]= new byte[n];
			if(fin.read(b)!=n) {
				System.err.println("couldnt read "+ n+" bytes");
			}
			System.out.println( new String(b,0,n));
			
			//n/2 into an array
			if(fin.read(b,n/2,n/2)!=n/2) {
				System.err.println("couldnt read "+ n/2+" bytes");
			}
			System.out.println("SubRange of Bytes\n"+ new String(b,0,b.length));
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
