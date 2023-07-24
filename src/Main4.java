import java.io.FileWriter;
import java.io.IOException;

public class Main4 {
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("test.txt")){
			fw.write("hello");
		}catch(IOException e) {
			System.out.println("何らかの例外が発生しました。");
		}
	}
}
