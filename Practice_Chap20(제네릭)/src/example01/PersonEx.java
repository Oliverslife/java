package example01;

public class PersonEx {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setObject("ȫ�浿");	//��ĳ����(String -> Object)
		String str = (String)person.getObject();	//�ٿ�ĳ����*(Object -> String)
		System.out.println(str);

	}

}
