package trainingday11LOOPSplusCONDITIONS;

public class Exerc2 {
	public static void main(String[] args) {
		String a = "JAVA,medical,OPERATION,system";
		for(int i=0;i<a.length();i++) {
			if(Character.isUpperCase(a.charAt(i))) {
				System.out.println(a.charAt(i));
				
			}
		}
		
}

}
