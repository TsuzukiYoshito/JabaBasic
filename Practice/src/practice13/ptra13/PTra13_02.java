/*
  * PTra13_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

/*
 * ★ common.Characterクラスを継承した、common.Heroクラスを作成してください
 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
 */
public class PTra13_02 extends practice13.common.Hero {

	public static void main(String[] args) {
		// ★ common.Heroクラスをインスンタンス化してください
		
		// ★ common.Heroインスタンスのnameに"勇者"を設定して下さい
                    
		// ★ common.Heroインスタンスのキャラクター情報を表示してください
       	
		practice13.common.Hero halo=new practice13.common.Hero();

	      halo.setName("勇者");
      
	     System.out.println(halo.showParameter());

	     
	} 
	
}
