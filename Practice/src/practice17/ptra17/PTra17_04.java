/*
 * PTra17_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice17.ptra17;

public class PTra17_04 {
	public static void main(String[] args) {

		String str = "スッキリわかるJava入門";

		/*
		 * ★ strに入っている文字列を1文字ずつゆっくり表示させるプログラムを完成させてください
		 * ※ Thread.sleep を使用すること
		 */

		 try {


	            System.out.print("ス");
	            Thread.sleep(1000);
	            System.out.print("ッ");
	            Thread.sleep(1000);
	            System.out.print("キ");
	            Thread.sleep(1000);
	            System.out.print("リ");
	            Thread.sleep(1000);
                System.out.print("わ");
                Thread.sleep(1000);
                System.out.print("か");
                Thread.sleep(1000);
                System.out.print("る");
                Thread.sleep(1000);
                System.out.print("J");
                Thread.sleep(1000);
                System.out.print("a");
                Thread.sleep(1000);
                System.out.print("v");
                Thread.sleep(1000);
                System.out.print("a");
                Thread.sleep(1000);
                System.out.print("入");
                Thread.sleep(1000);
                System.out.print("門");
                Thread.sleep(1000);


	        } catch(InterruptedException e){
	            e.printStackTrace();
	        }
	    }




	}

