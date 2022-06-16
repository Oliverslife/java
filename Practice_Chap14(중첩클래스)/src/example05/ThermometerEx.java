package example05;

import example05.Thermometer.TemperatureChangable;

public class ThermometerEx {

	public static void main(String[] args) {


		Thermometer thermometer = new Thermometer();
		thermometer.setChangable(new AnalogThermometer());
		thermometer.viewTemperature();
		
		thermometer = new Thermometer();
		thermometer.setChangable(new DigitalThermometer());
		thermometer.viewTemperature();
		
		//��ø�������̽��̹Ƿ� �͸�����ü�� ��� ���� �ȵȴ�.
//		TemperatureChangable thermometer2 = new Thermometer.TemperatureChangable() {
//			@Override
//			public void onChange() {
//				System.out.println("�͸�����ü�� ����");				
//			}			
//		};
//		Thermometer t = (Thermometer)thermometer2;
//		t.viewTemperature();

	}

}
