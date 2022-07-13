package trainingday11LOOPSplusCONDITIONS;

public class for10 {
	public static void main(String[] args) {
		int[] num = {17,14,-3,-60,92};
		for(int i =0;i<num.length;i++) {
			if(num[i]>=0) {
				System.out.println("Positive="+num[i]);
			}
			else if(num[i]<=0) {
				System.out.println("Negative="+num[i]);
			}
			else {
				System.out.println(" none");
			}
			}
	}
}


