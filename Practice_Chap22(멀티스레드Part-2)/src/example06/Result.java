package example06;
//������ü
public class Result {
	
	private int accumValue;
	
	//������ü�̱� �빮��, �������� �ŷڼ��� ���ؼ� ���� �����尡 ������ �� �����Ƿ� �ݵ�� ����ȭ�� �ʼ����̴�.
	
	public synchronized void addValue(int value) {
		this.accumValue += value;
	}
	
	public synchronized int getValue() {
		return this.accumValue;
	}

}
