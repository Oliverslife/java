package pre_class;

import java.util.Scanner;

public class SWEA_1946 {
	
	public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
 
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = sc.nextInt();
             
            String[] str = new String[n];   //�ݺ�����
            int[] num = new int[n]; //�ݺ�Ƚ��            
            int cnt = 0;    //��ü���ڰ���            
             
            for(int i=0; i<n; i++) {
                str[i] = sc.next();
                num[i] = sc.nextInt();
                cnt += num[i];
            }
             
            String[] arr = new String[cnt];
            int idx = 0;    //�����          
             
            for(int i=0; i<n; i++) {
                for(int j=0; j< num[i]; j++) {
                    arr[idx] = str[i];
                    idx++;
                }
            }
             
            System.out.println("#" + test_case);
            for(int i=0; i<idx; i++) {
                if(i != 0 && i%10 == 0) {
                    System.out.println();
                }
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }

}
