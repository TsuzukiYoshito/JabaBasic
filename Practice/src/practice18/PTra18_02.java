/*
 * PTra18_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_02 {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド position ： String name ： String country ： String team ： String メソッド
	 * 各アクセサ
	 *
	 * toString() ： Objectクラスのオーバーライド 各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	public static void main(String[] args) {

		/*
		 * entity.Playerの作成後に行ってください
		 *
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */


		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう
               ArrayList<Player>  array= new ArrayList<>();

	        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))){
	        	while (scanner.hasNext()) {



	        		//ここでplayerインスタンスを作ること
	        		entity.Player player1=new entity.Player();

	        		for(int i=0;i<scanner.nextLine().length();i++) {
                 String[]box=new String[i];


	        		String box[i]=scanner.nextLine();


	        		player1.toString(box[i]);
	        		 array.add(player1);





	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	        }

	        for(Player name : array){
	            System.out.println(name);

	        }
		}
}

