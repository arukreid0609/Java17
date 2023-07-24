import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
	public static void main(String[] args) {
		// try文の中を実行する。途中で例外が発生したら即座にcatch文の中に移行する。
		try {
			System.out.println("1行目");
			System.out.println("2行目");
			System.out.println("3行目");
			System.out.println("4行目");
			FileReader fr = new FileReader("test.txt");
			System.out.println("5行目");
			System.out.println("6行目");
			System.out.println("7行目");
			System.out.println("8行目");
		}catch(FileNotFoundException e) {
			System.out.println("ファイル読み込み時にエラーが出ました。");
			System.out.println(e);
		}
		System.out.println("プログラムが終了しました。");
	}
}
