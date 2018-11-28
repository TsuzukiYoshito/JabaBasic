/*
 * PTra16_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_03 {

	@Override
	public String toString() {
		// TODO 自動生成されたメソッド・スタブ

		String str = super.toString() + "PTra16_03.toString()" + "の処理";

		return str;
	}

	/*
	 * toStringメソッドをオーバーライドしてください
	 *
	 * 処理内容 ・親クラス（Objectクラス）のtoStringの処理を行ってください
	 * ・その後、改行をして「PTra16_03#toString()の処理」という文字列を連結してください
	 */
	public static void main(String args[]) {
		PTra16_03 stonesour=new PTra16_03();

		System.out.println(stonesour.toString());


	}
}
