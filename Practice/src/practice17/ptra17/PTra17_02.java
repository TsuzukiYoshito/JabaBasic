/*
 * PTra17_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice17.ptra17;

import java.io.IOException;

import practice17.common.ThrowExceptionUtil;

public class PTra17_02 {
	public static void main(String[] args) {
		try {
			dispInput();
		} catch(Exception e) {
			System.out.println("例外が発生しました");
		}
	}
//この下は、上のクラスで呼び出されているメソッドの内容なので、既にtry-catch文でクリアされているよね。
	//下はthrows IOExceptionを入力して、処理すると求められている課題を解決できる。
	public static void dispInput() throws IOException{

		System.out.println("文字を入力してください");

		/*
		 * 以下の処理はコンパイルエラーになります。
		 * ★ 適切な修正を行い、コンパイルエラーをなくしてください
		 */
		String line = ThrowExceptionUtil.inputValue();


		System.out.println(line);

	}
}