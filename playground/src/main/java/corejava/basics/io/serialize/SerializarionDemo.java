package corejava.basics.io.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializarionDemo {

	public static void main(String[] args) {
		
		//Object Serialization
		
		try (ObjectOutputStream objOStrm= 
				new ObjectOutputStream(new FileOutputStream("serial"))
				)
		{
			MyClass obj= new MyClass("PAVAN", 10, 0.1);
			System.out.println("Object obj: "+obj+ " hashCode "+obj.hashCode());
			objOStrm.writeObject(obj);
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		//Object Deserialization
		try (ObjectInputStream objIStrm= new ObjectInputStream(new FileInputStream("serial"))) {
			MyClass obj2= (MyClass) objIStrm.readObject();
			System.out.println("Deserialized"+ obj2+ " hashcode "+obj2.hashCode());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//ObjectOutput

	}

}
