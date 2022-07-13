package trainingday11LOOPSplusCONDITIONS;

public class ForifStr14 {
	public static void main(String[] args) {
		String[] name = {"Zoho", "infosys", "tctts","wipro","cts","capegemaini"};
		for(int i=0;i<name.length;i++) {
			if(name[i].contains("a")||name[i].contains("e")||name[i].contains("i")||name[i].contains("o")||name[i].contains("u")) {
				System.out.println(name[i].charAt(0)+" "+name[i].charAt(name[i].length()-1));
			}
			else {
				System.out.println(name[i].substring(1,name[i].length()-1));
				
			}
		}
	}

}
