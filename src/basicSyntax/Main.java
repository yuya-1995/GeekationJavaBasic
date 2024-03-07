package basicSyntax;

public class Main {

	public static void main(String[] args) {
		// コンソール表示
//		System.out.println("Hello Geekation");
		
//		Geek君が自己紹介をするためのクラス(GeekIntroduction)を作成して下記の内容をMainクラスでコンソールに出力してください。
//		メソッド1: 挨拶メソッド(greeting)
//		引数:
//		引数1: int age (年齢)
//		引数2: double height (身長)
//		戻り値: void
//		挙動: コンソールに下記内容を出力する
//		出力内容:
//		"こんにちは! 私はGeek君でごわす。"
//		"年は" + age + "でごわす。"
//		"身長は" + height + "でごわす。"
		
		int age = 28;
		double height = 178.5;
		
		// 挨拶を表示
        GeekIntroduction.greeting(age, height);
		
		
//		メソッド2: 特技メソッド(specialSkill)
//		引数:
//		引数1: int num1
//		引数2: int num2
//		戻り値: void
//		挙動: num1からnum2の範囲内(num1とnum2の値は含む)で値が1ずつ増えていく繰り返し処理を行い、数値をコンソールに出力する。ただし、下記の仕様を満たすこと。
//		num1またはnum2が1より小さい場合
//		"num1とnum2は0より大きい値にしてください。"と出力
//		そこでメソッドの処理は終了
//		num1がnum2以上の場合
//		"num2はnum1より大きい値にしてください。"と出力
//		そこでメソッドの処理は終了
//		num1またはnum2が300より大きい場合
//		"num1とnum2は300以下にしてください。"と出力
//		そこでメソッドの処理は終了
//		繰り返し処理の中で数値が3の倍数かつ5の倍数の場合
//		"{対象の値}は3の倍数かつ5の倍数です。"と出力
//		そのターンは処理をスキップ
//		繰り返し処理の中で数値が3の倍数の場合
//		"{対象の値}は3の倍数です。"と出力
//		そのターンは処理をスキップ
//		繰り返し処理の中で数値が5の倍数の場合
//		"{対象の値}は5の倍数です。"と出力
//		そのターンは処理をスキップ
        
        int num1 = 1;
        int num2 = 300;

        // 特技を表示
        GeekIntroduction.specialSkill(num1, num2);
		

	}

}
