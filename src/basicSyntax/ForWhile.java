package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
//		1〜100までの数字を順にコンソールに出力してください。ただし、下記の条件を満たしてください。(これはFizzBuzz問題と言われ、プログラミングではよく使われる問題です。)
//		3で割り切れる場合はFizzと出力
//		5で割り切れる場合はBuzzと出力
//		3と5の両方で割り切れる場合はFizzBuzzと出力
		
		for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
            	// FizzBuzz
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
            	// Fizz
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
            	// Buzz
                System.out.println("Buzz");
            } else {
            	// i
                System.out.println(i);
            }
        }
		
//		下記の条件で繰り返し処理を行って、条件によって処理を分けてください。
//		右記の配列を定義: "Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"
//		繰り返しの中で下記の条件分岐を行なってください。
//		Javaの場合
//		"現在学習中の言語はJavaです。"と出力
//		上記出力後に、このターンはスキップ
//		HTMLの場合
//		"HTMLはプログラミング言語ではありません。"と出力
//		上記出力後に、繰り返し処理を終了
//		その他のターンの場合は、対象のプログラミング言語を出力
		
		String[] languages = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};

        for (String language : languages) {
            if (language.equals("Java")) {
            	// 現在学習中の言語はJavaです。
            	// このターンはスキップ
                System.out.println("現在学習中の言語はJavaです。");
                System.out.println("このターンはスキップ");
                continue;
            } else if (language.equals("HTML")) {
            	// HTMLはプログラミング言語ではありません。
            	// 繰り返し処理を終了
                System.out.println("HTMLはプログラミング言語ではありません。");
                System.out.println("繰り返し処理を終了");
                break;
            } else {
            	// 対象のプログラミング言語：language
                System.out.println("対象のプログラミング言語：" + language);
            }
        }
        

	}

}
