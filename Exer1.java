package trainingday11LOOPSplusCONDITIONS;

public class Exer1 {
	public static void main(String[] args) {
		String[] a = {"REmoTe", "Cello"};
		String d="";
		for(int i =0;i<a.length;i++) {
			char b = a[i].charAt(i);
			if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u') {
				d=d+b;
				System.out.println(d);
			}
			
		}
	}

}
