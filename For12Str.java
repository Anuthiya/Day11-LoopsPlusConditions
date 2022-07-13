package trainingday11LOOPSplusCONDITIONS;

public class For12Str {
	public static void main(String[] args) {
		String name = "Onesoft";
		char[] name1 = name.toCharArray();
		for(int i=0;i<name1.length;i++) {
			if(name1[i]=='a'||name1[i]=='e'||name1[i]=='i'||name1[i]=='o'||name1[i]=='u') {
				System.out.println(name1[i]+"=is Vowels");
			}
			else {
				System.out.println(name1[i]+"=not a vowels");
				
			}
		}
			
	}

}
