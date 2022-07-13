package trainingday11LOOPSplusCONDITIONS;

public class for9 {
	public static void main(String[] args) {
		int[] num = {17,14,3,60,92};
		for(int i =0;i<num.length;i++) {
			if(num[i]%2==0&&num[i]%3==0) {
				System.out.println("divisible by 2="+num[i]);
			}
			else {
				System.out.println("not divisile");
		
			}
			}
	}
}
