import java.io.*; 
public class question1 
{ 
	public static void main(String[] args) throws IOException 
	{ 
		PipedInputStream geek_input = new PipedInputStream(); 
		PipedOutputStream geek_output = new PipedOutputStream(); 
		try
		{ 
			// Use of connect() : connecting geek_input with geek_output 
			geek_input.connect(geek_output); 

			// Use of read() method : 
			geek_output.write(71); 
			System.out.println("using read() : " + (char)geek_input.read()); 
			geek_output.write(69); 
			System.out.println("using read() : " + (char)geek_input.read()); 
			geek_output.write(75); 
			System.out.println("using read() : " + (char)geek_input.read()); 

		} 
		catch (IOException except) 
		{ 
			except.printStackTrace(); 
		} 
	} 
} 
