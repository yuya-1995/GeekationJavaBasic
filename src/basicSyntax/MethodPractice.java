package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
//		mainメソッドでint型の値aとbを定義&任意の値を代入して、メソッド1〜4の計算結果をメソッド5を使って順番に出力してください。
//		メソッド1: 二つの値を足し算するメソッド
//		引数1: int型
//		引数2: int型
//		戻り値: int
//		メソッド2: 二つの値を引き算するメソッド
//		引数1: int型
//		引数2: int型
//		戻り値: int
//		メソッド3: 二つの値を掛け算するメソッド
//		引数1: int型
//		引数2: int型
//		戻り値: int
//		メソッド4: 二つの値を割り算するメソッド
//		引数1: int型
//		引数2: int型
//		戻り値: int
//		メソッド5: コンソールに出力するためのメソッド
//		引数: int型
//		戻り値: void
//		出力内容: "計算結果は{引数}です。"
		
		int a = 10;
		int b = 5;
		int[] results = new int[4];
		
		results[0] = calcAdd(a,b);
		results[1] = calcSub(a,b);
		results[2] = calcMul(a,b);
		results[3] = calcDiv(a,b);
		
		for(int result : results) {
			output(result);
		}
	}

	//  二つの値を足し算するメソッド
	private static int calcAdd(int a, int b) {
        return a + b;
    }
    
    // 二つの値を引き算するメソッド
    private static int calcSub(int a, int b) {
		return a - b;
	}
    
    // 二つの値を掛け算するメソッド
    private static int calcMul(int a, int b) {
		return a * b;
	}
    
    // 二つの値を割り算するメソッド
    private static int calcDiv(int a, int b) {
		return a / b;
	}
    
 	// コンソールに出力するためのメソッド
    private static void output(int result) {
		System.out.println("計算結果は"+result+"です。");
	}


}
