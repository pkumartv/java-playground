package dp.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		int c= super.read();
		
		return (c==-1 ?  c : Character.toLowerCase(c));
	}
	
	@Override
	public int read(byte[] b, int offset, int len) throws IOException {
		// TODO Auto-generated method stub
		int result=super.read(b, offset, len);
		for(int i=offset;i< offset+result;i++){
			b[i]= (byte) Character.toLowerCase(b[i]);
		}
		return result;
	}

}
