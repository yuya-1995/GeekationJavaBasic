package basicSyntax;

public class Calculation {
	
	public static void main(String[] args) {
//		下記の手順に従って実装を進めてください。
//		int型の変数xを宣言し、値5を代入します。
//		int型の変数yを宣言し、値10を代入します。
//		int型の変数zを宣言し、xとyを足した結果を代入します。
//		変数zを使用して、「変数zの値は{z}です」とコンソールに出力してください。
		
		int x = 5;
		int y = 10;
		int z = x + y;
		
		// 変数zの変数は15です
		System.out.println("変数zの変数は"+z+"です");
		
//		下記の手順に従って実装を進めてください。
//		double型の変数aを宣言し、値5.25を代入します。
//		変数aの値に2.5を足して、結果を変数aに代入します。
//		変数aの値に3.0を掛けて、結果を変数aに代入します。
//		変数aの値を整数(int)にキャストし、int型の変数bに代入します。
//		変数bに10を足して、結果を変数bに代入します。
//		変数aの値と変数bの値をそれぞれコンソールに出力してください。
		
		double a = 5.25;
		a += 2.5;
		a *= 3.0;
		int b = (int)a;
		b += 10;
		
		// 変数aの値は23.25です
		System.out.println("変数aの値は"+a+"です");
		// 変数bの値は33です
		System.out.println("変数bの値は"+b+"です");
		
	}
}
