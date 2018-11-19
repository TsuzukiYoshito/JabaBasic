/*
 * PTra13_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;


	/*
	 * ★ common.Characterクラスを継承した、common.Slimeクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（10, 5, 2）
	 */
public class PTra13_03 extends practice13.common.Slime{
	
	

	public static void main(String[] args) {
		// ★ common.Slimeクラスをインスンタンス化してください
         practice13.common.Slime slung=new practice13.common.Slime();

		// ★ common.Slimeインスタンスのnameに"スライム"を設定して下さい
                slung.setName("スライム");

		// ★ common.Slimeインスタンスのキャラクター情報を表示してください

                 System.out.println(slung.showParameter());
                
	}
}
