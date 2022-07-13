package trainingday11LOOPSplusCONDITIONS;

public class Exel2 {
	public static void main(String[] args) {
	    int num=11;
	    boolean flag=false;
	    for(int i=2;i<=num/2;i++) {
	    	if(num%i==0) {
	    		flag=true;
	    		break;
	    	}
	    }
	    if(!flag) 
	    	System.out.println(num+"prime");
	    else 
	    	System.out.println(num+"Not Prime");
	}
}


	
