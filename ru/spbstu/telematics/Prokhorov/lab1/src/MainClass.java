import java.util.Scanner;

public class MainClass{
	public static void main(String[] args){
		System.out.print("input number");
		Scanner sc = new Scanner(System.in);
			if(sc.hasNextInt())
				{
					int x = sc.nextInt();
					if(x>2)
					{
					if(itPrimeNumber(x)) 
					System.out.print("number "+ x + " is Prime");
					else
					System.out.print("number "+ x + " is not Prime");
					}
					else
					System.out.print("wrong number");
				}
				else{
				System.out.print("wrong number");
				}
			sc.close();
	}
	
	public static boolean itPrimeNumber(long num){
		if(num<2)  return false;
		else{
		if (num%2==1) return true;
			else{
				for(int i=2; (i*i)<=num; i++)
				{
					if(num%i==0) return false;
				}
			}
		}
	return true;
	}
}