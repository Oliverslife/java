package example03;

public class SplitEx {

	public static void main(String[] args) {
		
		String str1 = "�����,�ʸ�/����ġŲ&���ġŲ,����ġŲ";
		
		//����ǥ���� : /, &, ,
		//split() : �Ű������� ����ǥ������ �´�. ����Ÿ���� ����ǥ���� ���еǾ��� String[]�� �����Ѵ�.		
		String[] strArr = str1.split(",|/|&");
		
		for(String str : strArr)
			System.out.println(str);

	}

}
