package trainingday11LOOPSplusCONDITIONS;

public class Exel1 {
	public static void main(String[] args) {
		String[] b = {"laptop","java","television","printer"};
		int largest =6;
		String c = " ";
		for(int i =0; i<b.length;i++) {
			if(b[i].length()>largest) {
				c=b[i];
		System.out.println(c.toUpperCase());
			}
		}
	}
}
	