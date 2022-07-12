package example13;
//������ü
public class DataBox {
	
	private String data;
	
	public synchronized String getData() {
		//�о�� �����Ͱ� ���ٸ�...
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		String returnValue = this.data;
		System.out.println("ConsumerThread�� ���� ������ : " + this.data);
		this.data = null;
		notify();
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		//Consuemr�����尡 �����͸� �Һ����� �ʾҴٸ�...
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		this.data = data;
		System.out.println("ProducerThread�� ������ ������ : " + this.data);
		notify();
	}

}
