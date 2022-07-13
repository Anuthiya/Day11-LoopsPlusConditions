package trainingday11LOOPSplusCONDITIONS;

public class for11posi {
	public static void main(String[] args) {
		int[] num= {17,14,-5,-97,60,7,-88,19};
		int positive =0;
		int negative =0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>=0) {
				positive = positive+1;
			}
			else if (num[i]<=0) {
				negative=negative+1;
			}
			{
				System.out.println(positive);
				System.out.println(negative);
				
			}
		}
	}
}
		
	

	
