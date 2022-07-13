package trainingday11LOOPSplusCONDITIONS;

public class for13str {
	public static void main(String[] args) {
		String[] name = {"Java","C++","Python","html","angular"};
		int largest =0;
		String a = " ";
		for(int i=0;i<name.length;i++) {
			if(name[i].length()>=largest) {
				a = name[i];
			
			}
		}
		System.out.println(a);
	}

}
