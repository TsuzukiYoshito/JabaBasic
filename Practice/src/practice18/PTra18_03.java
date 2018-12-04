/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ① ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください ★
		 * ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {

				// ここでplayerインスタンスを作ること
				Player player1 = new Player();

				String box1 = scanner.nextLine();

				String[] box2 = box1.split(",", 0);

				player1.setposition(box2[0]);
				player1.setname(box2[1]);
				player1.setcountry(box2[2]);
				player1.setteam(box2[3]);

				array.add(player1);

			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}




		List<Player> set = new ArrayList<>();


		for(int i=0;i<array.size();i++) {
			if(array.get(i).getteam().equals("バルセロナ")) {
				set.add(array.get(i));
			}
		}

		for(int i=0;i<array.size();i++) {
			if(array.get(i).getteam().equals("レアル・マドリード")) {
				set.add(array.get(i));


			}
		}




		// b,c,dをlist2から削除する
		array.removeAll(set);



		for (Player name : array) {
			System.out.println(name);

		}
	}

	// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

	// ★ 削除後のArrayListの中身を全件出力してください

}



















