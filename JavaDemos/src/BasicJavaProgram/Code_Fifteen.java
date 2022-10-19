package BasicJavaProgram;

public class Code_Fifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x = 'E';
		switch (x) 
		{
		case 'a' : 
		case 'A' : 
			System.out.println("The value of x is a");
			break;
		case 'b':
		case 'B' :
			System.out.println("The value of x is b");
			break;
		case 'c':
		case 'C' :	
			System.out.println("The value of x is c");
		case 'd':
		case 'D' :	
			System.out.println("The value of x is d");
			break;
		case 'e':
		case 'E' :	
			System.out.println("The value of x is e");
			break;
		default:
	System.out.println("The value of x is other than a,b,c,d,e");
			break;
		}

	}

}
