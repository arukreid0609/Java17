
public class Main2 {

	public static void main(String[] args) {
		int[] nums = new int[5];

		try {
			for (int i = 0; i < 10; i++) {
				nums[i] = i;
				System.out.println(i + "番目に代入しました。");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("存在しない要素に代入しようとしました。");
			System.out.println(e);
		}
	}
}
