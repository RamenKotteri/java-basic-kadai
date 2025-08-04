package kadai_021;
import java.util.ArrayList;

//メインとなる実行クラスです。
public class DictionaryExec_Chapter21 {
	
	public static void main(String[]args) {
		
		//辞書クラスのインスタンスを作成します。
		Dictionary_Chapter21 dictionary1 = new Dictionary_Chapter21();
		
		//辞書で調べたい単語のリストを作成します。
		ArrayList<String> wordsList = new ArrayList<String>();
		
		wordsList.add("apple");
		wordsList.add("banana");
		wordsList.add("grape");
		wordsList.add("orange");
		
		//作成した単語リストはArrayListなので、辞書クラスで受け取れるように配列に変換します。
		 String[] word = wordsList.toArray(new String[wordsList.size()]);
		 
		//辞書クラスのインスタンスメソッド、findを呼び出します。これにより調べたい単語の検索結果が表示されます。
		dictionary1.find(word);
		
		}

}
