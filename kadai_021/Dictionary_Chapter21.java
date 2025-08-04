package kadai_021;

import java.util.HashMap;

//辞書クラスです。
public class Dictionary_Chapter21 {
	
	//調べたい単語をキー、単語の意味を値とし、両者を紐付けします。
	HashMap<String,String> dictionaryMap;

	//コンストラクタです。
	public Dictionary_Chapter21(){
		
		//コンストラクタで単語と意味の対照関係を作ります。
		this.dictionaryMap = new HashMap<String,String>();
		
		dictionaryMap.put("apple","りんご");
		dictionaryMap.put("peach","桃");
		dictionaryMap.put("banana","バナナ");
		dictionaryMap.put("lemon","レモン");
		dictionaryMap.put("pear","梨");
		dictionaryMap.put("kiwi","キウィ");
		dictionaryMap.put("strawberry","いちご");
		dictionaryMap.put("grape","ぶどう");
		dictionaryMap.put("muscat","マスカット");
		dictionaryMap.put("cherry","さくらんぼ");

	}
	
	//調べたい単語があるかどうか判定し、結果を出力するメソッドです。
	public void find(String word[]) {
		
	//調べたい単語の数だけ、繰り返し処理を行います。
	for(int i = 0; i < word.length; i ++ ) {
		String definition = dictionaryMap.get(word[i]);  //調べたい単語に対応する意味を、definitionとします。
		if(definition != null) {                         //調べたい単語が登録されているか判定します。
		System.out.println(word[i] + "の意味は" + definition);  //登録されていた場合は出力します。
			}else {
				System.out.println(word[i] + "は辞書に存在しません");  // 登録がなかった場合はその旨出力します。
			}
		}
	}
}