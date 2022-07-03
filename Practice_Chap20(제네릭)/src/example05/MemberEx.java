package example05;

public class MemberEx {
	
	//���׸� Ŭ������ Member�� ������. MemberExŬ������ �ν��Ͻ� �޼���
	public <T> Member<T> boxing(T t) {
		Member<T> member = new Member<T>();
		member.setT(t);
		return member;
	}
	
	//MemberExŬ������ ���� �޼���
	public static<T> Member<T> wrapping(T t) {
		Member<T> member = new Member<T>();
		member.setT(t);
		return member;
	}

	public static void main(String[] args) {
		
		MemberEx memberEx = new MemberEx();
		Member<Integer> member = memberEx.boxing(new Integer(100));
		System.out.println("MemberŬ������ �� : " + member.getT());
		
		//Member<String> member2 = MemberEx.wrapping("�����");
		Member<String> member2 = wrapping("�����");
		System.out.println("MemberŬ������ �� : " + member2.getT());
		
	}

}
