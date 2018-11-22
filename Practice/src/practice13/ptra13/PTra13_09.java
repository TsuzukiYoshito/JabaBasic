/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = { "山田", "佐藤", "小林" };

	/** メールデータ（定数） */
	public static final String[] MAILDATA = { "yamada@hoge.com", "satou@hoge.com", "kobayashi@hoge.com" };

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = { "rezo0001", "rezo0002", "rezo0003" };

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = { { "総務部", "業務部", "システム部" }, { "5", "10", "35" }, };

	/**
	 * エントリーポイント
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください

		Employee Employee0 =new Employee();
		Employee0.setUserNm(NAMEDATA[0]);
		Employee0.setMail(MAILDATA[0]);
        Employee0.setPassword(PASSDATA[0]);
       Employee0.setdepartmentNm(QUATERDATA[0][0]);
        int  A=Integer.parseInt(QUATERDATA[1][0]);
       Employee0.setdepartmentCnt(A);


         Employee Employee1 = new Employee() ;
         Employee1.setUserNm(NAMEDATA[1]);
         Employee1.setMail(MAILDATA[1]);
         Employee1.setPassword(PASSDATA[1]);
         Employee1.setdepartmentNm(QUATERDATA[0][1]);
         int  B=Integer.parseInt(QUATERDATA[1][1]);
         Employee1.setdepartmentCnt(B);





         Employee Employee2 = new Employee();
         Employee2.setUserNm(NAMEDATA[2]);
         Employee2.setMail(MAILDATA[2]);
         Employee2.setPassword(PASSDATA[2]);
         Employee2.setdepartmentNm(QUATERDATA[0][2]);
         int C=Integer.parseInt(QUATERDATA[1][2]);
         Employee2.setdepartmentCnt(C);



	}
}