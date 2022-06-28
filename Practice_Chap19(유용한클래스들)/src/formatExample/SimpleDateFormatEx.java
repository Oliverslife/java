package formatExample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat sFormat = new SimpleDateFormat("yy-MM-dd E���� a HH:mm:ss");
		System.out.println(sFormat.format(date));
		//����
		sFormat = new SimpleDateFormat("������ E����");
		System.out.println(sFormat.format(date));
		//������
		sFormat = new SimpleDateFormat("������ ������ D��° ��");
		System.out.println(sFormat.format(date));
		//������
		sFormat = new SimpleDateFormat("������ �̴��� d��° ��");
		System.out.println(sFormat.format(date));

		sFormat = new SimpleDateFormat("z");
		System.out.println(sFormat.format(date));

	}

}
