import java.util.Scanner;
public class PrimeNo {
		
public static void main(String[] args) {
	int xx=12;                                                          
	int yy = 0;
	int zz=0;
	// System.out.println("Enter Any Number");                     
	// Scanner sc = new Scanner(System.in);
	// xx = sc.nextInt();
	
	for(int i=1;i<=xx;i++) {
		
		if(xx %i==0)
		{
        yy++;       
	}	
}
       if(yy==2)
    System.out.println("Number is a...PRIME");
       else
    System.out.println("Number is NOT a...PRIME");	
   
    }
    

	}


