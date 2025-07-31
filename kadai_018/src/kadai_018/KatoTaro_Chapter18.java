package kadai_018;

//加藤クラスを継承した、加藤太郎クラスを宣言します。
public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	//太郎クラスのフィールドgivenNameに値を代入できるセッターを追加します。
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	//加藤クラスのeachIntroduceをオーバーライドします。
	public void eachIntroduce(){
		System.out.println("私はJavaが得意です");
	}
}
