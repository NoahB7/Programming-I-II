import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestClass {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("grade-book.txt"));
		
		bw.write("hello");
		
		bw.close();
	}
}
