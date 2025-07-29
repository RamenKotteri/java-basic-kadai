package kadai_015;

public class Car_chapter15 {
	
	private int gear;
	private int speed;
	
	Car_chapter15 (int gear, int speed){
		this.gear = gear;
		this.speed = speed;
	}
	
	void changeGear (int afterGear) {
		
		switch (afterGear) {
		
		case 1 -> speed=10;
		case 2 -> speed=20;
		case 3 -> speed=30;
		case 4 -> speed=40;
		case 5 -> speed=50;
		default -> speed=10;
		}
		
		System.out.println("ギア"+gear+"から"+afterGear+"に切り替えました");
	}
	
	void run () {
		
		System.out.println("速度は時速"+speed+"Kmです");
		
	}
}
