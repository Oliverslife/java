package example02;

public class Member {
	
	int iv = 100;			//�ν��Ͻ� �������
	static int cv = 200;	//static �������
	
	//�ν��Ͻ� �޼���
	public void imethod() {
		System.out.println("iv : " + this.iv);
		//System.out.println("cv : " + Member.cv);  //Ŭ������.����������
	}
	
	public static void smethod() {
		//System.out.println("iv : " + this.iv);    //�ȵȴ�. �ν��Ͻ��� �����Ǿ�߸� ��� �����ϱ� ����.
		System.out.println("cv : " + Member.cv);    //cv�� static�����̱� ������ �ν��Ͻ� ���� ���̵� ���� �����ϴ�.
	}

}
