package basicSyntax;

public class Variables {

	public static void main(String[] args) {
		// int型の変数num1とdouble型の変数num2に好きな数字を代入して、コンソールに出力してください。
		int num1 = 10;
		double num2 = 3.14;
		// 共通化できる文字列
		String common1 = "私の好きな";
		String common2 = "です。";
		// 整数(小数)+文字列
		String console1 = common1 + "整数は" + num1 + common2;
		String console2 = common1 + "少数は" + num2 + common2;
		
		// 10
		System.out.println(num1);
		// 3.14
		System.out.println(num2);
		// 私の好きな整数は10です。
		System.out.println(console1);
		// 私の好きな少数は3.14です。
		System.out.println(console2);

	}

}
