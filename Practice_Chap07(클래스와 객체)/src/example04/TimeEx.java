package example04;

public class TimeEx {

	public static void main(String[] args) {


		Time t1 = new Time();
		//t1.hour = 10;	//private ���������ڷ� ���� ��� �Ұ�.
		
		System.out.println(t1);
		
		t1.setHour(23);
		t1.setMinute(30);
		t1.setSecond(50);
			
		System.out.println(t1);

	}

}
