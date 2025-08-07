package kadai_028;

public class JyankenExec_Chapter28 {
	
	public static void main(String[] args) {
		
		Jyanken_Chapter28 Jyanken = new Jyanken_Chapter28();
		
		String inputChoise = Jyanken.getMyChoise();
		
		String randomChoise = Jyanken.getRandom();
		
		Jyanken.playGame(inputChoise,randomChoise);
		
	}

}
