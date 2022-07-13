package trainingday11LOOPSplusCONDITIONS;

public class forifpos {
	public static void main(String[] args) {
		int[] num = {17,14,-5,-97,60,7,-88,19};
		int total = 0;
		int negative=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>=0)  {
				total=total+num[i];
			}
			else if(num[i]<=0) {
				negative=negative+num[i];
				}
		}
			System.out.println("Total number="+total);
			System.out.println("Negative="+negative);
				
	}

}
