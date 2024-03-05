package basicSyntax;

public class DataType {
	
	public static void main(String[] args) {
		// 下記の3つの文字列を連結してコンソールに出力する処理を実装してください。
		// こんにちは
		// 私は
		// Geek君です。
		
		String a = "こんにちは";
		String b = "私は";
		String c = "Geek君です。";
		
		// こんにちは私はGeek君です。
		System.out.println(a+b+c);
		
		
		// 下記4つの値をそれぞれコンソールに出力して下さい。
		// 数値の10
		// 文字列の20と24を連結した値
		// 小数の3.14
		// 真偽値のtrue
		
		int d = 10;
		String e = "20";
		String f = "24";
		double g = 3.14;
		boolean h = true;
		
		// 10
		System.out.println(d);
		
		// 2024
		System.out.println(e+f);
		
		// 3.14
		System.out.println(g);
		
		// true
		System.out.println(h);
	}

}
