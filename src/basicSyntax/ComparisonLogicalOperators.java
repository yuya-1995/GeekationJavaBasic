package basicSyntax;

public class ComparisonLogicalOperators {
	public static void main(String[] args) {
//		int型の変数aとbを定義&任意の値を代入して、aがbより大きい場合にtrueを、そうでない場合にfalseと出力するプログラムを実装してください。
		int a = 3;
		int b = 2;
		
		// true
		System.out.println(a > b);
		
//		boolean型の変数isSunnyとisWarmが与えられたとき、天気が晴れかつ暖かい場合にtrueを、それ以外の場合にfalseと出力するプログラムを実装してください。
		boolean isSunny = true;
        boolean isWarm = true;
		
		// true
		System.out.println(isSunny && isWarm);
		
//		int型の変数int xとint yを定義&任意の値を代入して、xが0以上かつyが偶数の場合にコンソールにtrueと出力するプログラムを実装してください。
		int x = 10;
		int y = 20;
		
		// true
		System.out.println(x >= 0 && y % 2 == 0);
		
//		boolean型の変数hasPermissionを定義して、hasPermissionがfalseの場合にtrueと出力するプログラムを実装してください。
		boolean hasPermission = false;
		
		// true
		System.out.println(!hasPermission);
	}
}
