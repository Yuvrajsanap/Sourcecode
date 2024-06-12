import java.io.*; 
public class question1 
{ 
	public static void main(String[] args) throws IOException 
	{ 
		PipedReader geek_reader = new PipedReader(); 
		PipedWriter geek_writer = new PipedWriter(); 

		// Use of connect() : connecting geek_reader with geek_writer 
		geek_reader.connect(geek_writer); 

		char[] carray = {'J', 'A', 'V', 'A'}; 

		// Use of write(char[] carray, int offset, int maxlen) 
		geek_writer.write(carray, 0, 4); 
		int a = 5; 
		System.out.print("Use of write(carray, offset, maxlen) : "); 
		while(a>0) 
		{ 
			System.out.print(" " + (char) geek_reader.read());		 
		} 
		
	} 
} 
