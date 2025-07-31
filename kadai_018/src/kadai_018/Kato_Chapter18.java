package kadai_018;

//抽象クラス（加藤クラス（親クラス））を宣言します。
abstract public class Kato_Chapter18 {
	
	//加藤クラス（親クラス）のフィールドを宣言します。
	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区○×";
	
	//加藤クラスに各クラス共通のメソッドを追加します。
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		
		System.out.println("住所は" + address + "です");
	}
	
	//加藤クラスに抽象メソッドeachIntroduceを追加します。
	abstract public void eachIntroduce();
	
	//加藤クラスに紹介を実行するメソッドを追加します。
	public void execIntroduce() {
		commonIntroduce();
		
		eachIntroduce();
	}
}
