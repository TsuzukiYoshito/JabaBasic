package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		
		Car[] car=new Car[3];
		 
		 
		 Car car0=new Car();
		 car0.serialNo=10000;
		 car0.color="Red";
		 car0.gasoline=50;
	
		 
		 
		 Car car1=new Car();
		 car1.serialNo=15000;
		 car1.color="blue";
		 car1.gasoline=100;
	
		 
		 
		 Car car2=new Car();
		 car2.serialNo=20000;
		 car2.color="yellow";
		 car2.gasoline=120;
	     
		 
		 car[0]=car0;
		 car[1]=car1;
		 car[2]=car2;
		 
		 
	     
		 {		 
		  final int distance0 = 300;
		  int remain0=distance0;
		  
		 for(int n=1;n<51;n++) {
         int run0=car0.run();
			 

			 		if(run0<0) {System.out.println("レッドはガソリンがなくなりました");
                     break;
			 		}
			 		
			 		remain0-=run0;
			 		if(remain0<=0) {
			 	      System.out.println("「レッドは目的地に到達しました");
                      System.out.println("「レッドは目的地にまで"+n+"時間かかりました。レッドの残りのガソリンは、"+car[0].gasoline+"リットルです」");
			 			break;
                    }
			 		System.out.println("残り:"+remain0+"キロメートルです。");
                    
			 		}
                    }
		 
		 {
		 final int distance1 = 300;
		 int remain1=distance1;
		 
		 for(int b=1;b<51;b++) {
           int run1=car1.run();

			 		if(run1<0) { 
			 		System.out.println("ブルーはガソリンがなくなりました");
                    break;
			 		}
			 		remain1-=run1;
			 		if(remain1<=0) {
			 			System.out.println("「ブルーは目的地に到達しました");
                   
			 			System.out.println("「ブルーは目的地にまで"+b+"時間かかりました。残りのブルーのガソリンは、"+car[1].gasoline+"リットルです」");
			 			break;
			 		}
			 		System.out.println("残り:"+remain1+"キロメートルです。");
			 		}
		            }
		 

		            { 
		 final int distance2 = 300;
		 int remain2=distance2;
		 
		 for(int i=1;i<51;i++) {
           int run2=car2.run();;
			       
           if(run2<0){
			 		System.out.println("イエローのガソリンがなくなりました");
                    break;
			 		}
			 		remain2-=run2;
			 		if(remain2<=0) {
			 			System.out.println("「イエローの目的地に到達しました");
                    	System.out.println("「イエローは目的地にまで"+i+"時間かかりました。残りのイエローのガソリンは、"+car[2].gasoline+"リットルです」");

			 			
			 		break;
			 		}
			 		System.out.println("残り:"+remain2+"キロメートルです。");
		            }	 
	                }
	                }
}           

