/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

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

		Collections.shuffle(array);



		List<Player> set = new ArrayList<>();
		List<Player> set1 = new ArrayList<>();
		List<Player> set2 = new ArrayList<>();
		List<Player> set3 = new ArrayList<>();

		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).getposition().equals("GK")) {
				set.add(array.get(i));
			}
		}

		for (int h = 0; h <array.size(); h++) {
			if (array.get(h).getposition().equals("DF")) {
				set1.add(array.get(h));

			}
		}

		for (int j = 0; j < array.size(); j++) {
			if (array.get(j).getposition().equals("MF")) {
				set2.add(array.get(j));

			}
		}

		for (int k = 0; k < array.size(); k++) {
			if (array.get(k).getposition().equals("FW")) {
				set3.add(array.get(k));

			}
		}








		for(int l=0;l<1;l=l++){
            System.out.println(set.get(l));

		}

		for(int l=0;l<4;l=l++){
            System.out.println(set1.get(l));

		}
		for(int l=0;l<4;l=l++){
            System.out.println(set2.get(l));
		}
		for(int l=0;l<2;l=l++){
            System.out.println(set3.get(l));

		}
				}

				// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください




	}
