package formatExample;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		
		double number = 5577669.78;
		//0�� �ڸ��� �� ������ �ϰ� ǥ���� �ϴ� �ݸ鿡, #�� ǥ���� �� �ϵ� ǥ���� �ȵȴ�.
		DecimalFormat dFormat = new DecimalFormat("0");
		System.out.println(dFormat.format(number));
		
		dFormat = new DecimalFormat("0.0");
		System.out.println(dFormat.format(number));
		
		dFormat = new DecimalFormat("000000000.000000");
		System.out.println(dFormat.format(number));
		
		dFormat = new DecimalFormat("#");
		System.out.println(dFormat.format(number));
		
		dFormat = new DecimalFormat("#.#");
		System.out.println(dFormat.format(number));
		
		dFormat = new DecimalFormat("###############.########");
		System.out.println(dFormat.format(number));
		
		dFormat = new DecimalFormat("#,###.00");
		System.out.println(dFormat.format(number));
		
		

	}

}
