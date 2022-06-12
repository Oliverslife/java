package example05;

public class VehiclableEx {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		bus.setSpeed(-50);
		bus.setSpeed(80);
		//���� ���� ��������(�ּ�)�� �ѱ�� ��
		driver.drive(bus);
		driver.stop(bus);
		
		System.out.println();

		taxi.setSpeed(-70);
		taxi.setSpeed(120);
		//���� ���� ��������(�ּ�)�� �ѱ�� ��
		driver.drive(taxi);
		driver.stop(taxi);
		
		System.out.println();
		
		//���� �Ű����� �����Ͽ� �ѱ�� ���
		driver.drive(new Taxi());
		driver.drive(new Bus());
		
		//�������̽��� ������ Ŭ������ �ƴϱ� ����
		//driver.drive(new AICar());
		
		System.out.println();
		
		Vehiclable vehiclable = driver.newCarmethod(new Taxi());
		vehiclable.run();
		vehiclable.stop();
		
		System.out.println();
		
		vehiclable = driver.newCarmethod(new Bus());
		vehiclable.run();
		vehiclable.stop();
	}

}
