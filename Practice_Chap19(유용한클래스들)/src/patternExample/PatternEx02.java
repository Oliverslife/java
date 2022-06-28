package patternExample;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEx02 {

	public static void main(String[] args) {
		
		String[] data = { "bat", "baby", "bonus", "ca", "cb", "c.", "car", "com", "date", "zoo", "disc" };
		//�ҹ��� c�� �����ϴ� ����ܾ ���ڸ� �������� ����
//		Pattern pattern = Pattern.compile("c[a-z]");
//		Pattern pattern = Pattern.compile("b[a-z]*");
		String pattern = "b[a-z]*";
		
		Vector<String> vStrings = new Vector<String>();
		
		for(String str : data) {
			
			boolean result = Pattern.matches(pattern, str);
			if(result) {
				System.out.println(str);
				vStrings.add(str);
			
//			Matcher matcher = pattern.matcher(str);
//			
//			//������ ���ϰ� ��ġ�ϴ°�?
//			if(matcher.matches()) {
//				System.out.println(str);
//				vStrings.add(str);
			}
		}
		System.out.println();
		System.out.println("b�� �����ϴ� �ҹ��� ���ܾ� : " + vStrings.toString());
	}

}
