import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main3 {
	public static void main(String[] args) {
		int[] nums = new int[5];
		try {
			FileReader fr = new FileReader("test.txt");	
			for (int i = 0; i < 10; i++) {
				nums[i] = i;
				System.out.println(i + "番目に代入しました。");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("存在しない要素に代入しようとしました。");
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println("ファイル読み込み時にエラーが出ました。");
			System.out.println(e);
		}
		System.out.println("プログラムが終了しました");
	}
}
