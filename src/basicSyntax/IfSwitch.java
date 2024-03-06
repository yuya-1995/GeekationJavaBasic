package basicSyntax;

public class IfSwitch {

	public static void main(String[] args) {
//		int型の変数numに任意の値を代入して、if文を使って下記の条件通りにコンソールを出力されるプログラムを実装してください。
//		numが2の倍数の場合："2の倍数です。"
//		numが3の倍数の場合："3の倍数です。"
//		numが上記に当てはまらない場合："どちらでもありません。"
		
		int num = 3;
		
		if(num % 2 == 0) {
			// 2の倍数です。
			System.out.println("2の倍数です。");
		} else if(num % 3 == 0) {
			// 3の倍数です。
			System.out.println("3の倍数です。");
		} else {
			// どちらでもありません。
			System.out.println("どちらでもありません。");
		}
		
//		String型の変数prefに任意の値を代入して、switch文を使って下記の条件通りにコンソールを出力されるプログラムを実装してください。
//		prefが"北海"の場合："北海道"
//		prefが"東京"の場合："東京都"
//		prefが"京都"の場合："京都府"
//		prefが上記以外の場合："当てはまりません。"
		
		String pref = "東京";
		
		switch (pref) {
		case "北海":
			// 北海道
			System.out.println("北海道");
			break;
		case "東京":
			// 東京都
			System.out.println("東京都");
			break;
		case "京都":
			// 京都府
			System.out.println("京都府");
			break;
		default:
			// 当たりません。
			System.out.println("当たりません。");
			break;
		}
			
	}

}
