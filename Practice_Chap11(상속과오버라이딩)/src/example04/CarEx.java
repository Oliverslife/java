package example04;

public class CarEx {

	public static void main(String[] args) {
		
		Car car = new Car(80);
		car.speedUp();
		car.speedDown();
		car.stop();
		
		SportCar sportCar = new SportCar(150);
		sportCar.speedUp();		//����Ŭ������ speedUp()�� ȣ��
		sportCar.speedDown();	//����Ŭ������ speedDown()�� ȣ��
		sportCar.stop(); 		//�ڼ�Ŭ������ stop()�� ȣ��

	}

}
