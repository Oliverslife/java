package example05;

//��ø �������̽��� ������ Ŭ����
public class DigitalThermometer implements Thermometer.TemperatureChangable {

	int temperature = 50;
	
	@Override
	public void onChange() {
		System.out.println("���� �µ����Դϴ�.");
		System.out.println(this.temperature + "�� �Դϴ�.");
		
	}

}
