package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

//じゃんけんクラスです
public class Jyanken_Chapter28 {
	
	//自分のじゃんけんの手を入力するメソッドです
	public String getMyChoise() {
		
		//正しい入力がされるまでループします
		while(true) {
			
			//コンソールの初期表示です。
			System.out.println("自分のじゃんけんの手を入力しましょう\nグーはrockのrを入力しましょう\n"
					+ "チョキはscissorsのsを入力しましょう\nパーはpaperのpを入力しましょう");
			
			//スキャナークラスを生成します。
			Scanner scanner = new Scanner(System.in);
			
				//例外処理を実行するためにtry catchを使います
				try {
					
					//入力された内容を取得します
					String inputChoise = scanner.next();
					
					//正しい値が入力されたときだけreturnでmainメソッドに値を渡します。
					switch (inputChoise) {
						case "r","s","p" : scanner.close(); return inputChoise; 
						default : System.out.println("r,s,pのどれかを一つだけ入力してください。空白も含めないでください。");
					}
					
				} catch (NullPointerException e) {
					//何も入力されていない場合の処理
					System.out.println("何も入力されませんでした。入力してください");
				}
			}
		
	}
	
	//相手の手をランダムに取得するメソッドです
	public String getRandom() {
		String[] randomChoise = {"r","s","p"};
		
		//double doubleNumber = Math.random() * 3;
		//int listNumber = (int) doubleNumber;
		int listNumber = (int) Math.floor(Math.random() * 3);
		
		return randomChoise[listNumber];
	
	}
	
	//じゃんけんの結果を判定しコンソールに表示するメソッドです
	public void playGame(String inputChoise, String randomChoise) {
		
		HashMap<String,String> choiseMap = new HashMap<String,String>();

		choiseMap.put("r","グー");
	    choiseMap.put("s","チョキ");
	    choiseMap.put("p","パー");
	      
	    String myChoise = choiseMap.get(inputChoise);
	    String opponentChoise = choiseMap.get(randomChoise);
	      
	    System.out.println("自分の手は" + myChoise + ",対戦相手の手は" + opponentChoise);
	    
	    if(inputChoise.equals(randomChoise)) {
	    	System.out.println("あいこです");
	    } if(inputChoise.equals("r") && randomChoise.equals("s")) {
	    	System.out.println("自分の勝ちです");
	    } if(inputChoise.equals("r") && randomChoise.equals("p")) {
	    	System.out.println("自分の負けです");
	    } if(inputChoise.equals("s") && randomChoise.equals("r")) {
	    	System.out.println("自分の負けです");
	    } if(inputChoise.equals("s") && randomChoise.equals("p")) {
	    	System.out.println("自分の勝ちです");
	    } if(inputChoise.equals("p") && randomChoise.equals("r")) {
	    	System.out.println("自分の勝ちです");
	    } if(inputChoise.equals("p") && randomChoise.equals("s")) {
	    	System.out.println("自分の負けです");
	    }
	}
}
