package trainingday11LOOPSplusCONDITIONS;

public class ForStr13 {
	public static void main(String[] args) {
		int[] num = {1,5,7,8,9,10,15,16,6};
		int max=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>=max) {
				max=num[i];
			}
		}
				System.out.println("large number is="+max);
			
		}
	}


