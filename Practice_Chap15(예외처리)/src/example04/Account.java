package example04;

public class Account {

	private long balance;
	
	public Account() {
	}
	
	//���� �ܾ��� ��������
	public long getBalance() {
		return this.balance;
	}
	
	//�Ա��ϱ�
	public void deposit(int money) {
		this.balance += money;
	}
	
	//����ϱ�
	public void withdraw(int money) throws BalanceException {
		if(this.balance < money) {
			//������ ���� �߻�
			throw new BalanceException("�ܾ� ����");
		}
		this.balance -= money;
	}
}
