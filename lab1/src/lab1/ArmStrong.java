package lab1;

public class ArmStrong {
	public static void main(String[] args) {
		int number = 371 , originalnumber,remainder,result=0;
		originalnumber = number;
        
		while(originalnumber !=0)
		{
			remainder= originalnumber%10;
			result +=Math.pow(remainder,3);
			originalnumber/= 10;
			 if (result==number)
				 System.out.println(number+" is an ArmStrong number.");
			 else
				 System.out.println(number+" is not an ArmStrong number.");
		}
				
	}

}
