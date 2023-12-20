import java.util.Scanner;
import java.util.Random;
public class file9 {
	public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] str=new int[1];
        str[0]=4;
//        oran4(str);
//        oran6();
        oran7();
    }
	public void oran1(int []arr,int index) {
		if(arr[index]%2==0) {}
		else {
			arr[index]=arr[index]+1;
		}
			
	}
	public void oran2() {
		Scanner scan = new Scanner(System.in);
		int[] str=new int[5];
		int num1=0;
		int sum=0;
		for(int i=0;i<5;i++) {
	        System.out.println("enter number");		
	         num1 = scan.nextInt();
	         str[i]=num1;
	         sum=sum+num1;
		}
		System.out.println(sum/5);			
	}
	public void oran3() {
		Scanner scan = new Scanner(System.in);
		int[] str=new int[5];
		int num1=0;
		int sum=0;
		for(int i=0;i<5;i++) {
	        System.out.println("enter number");		
	         num1 = scan.nextInt();
	         str[i]=num1;
	         if(num1>sum)
	        	 sum=num1;
		}
		System.out.println(sum);			
	}
	public static void oran4(int[] arr) {
		for(int i=0;i<10;i++) {
			if(i!=9) {
	          if((arr[i]%2!=0)&&!(arr[i+1]%2!=0))
	        	 System.out.println(arr[i]+" "+arr[i+1]);	 
			}
		}			
	}
	public void oran5(int num) {
		Random rand = new Random();
		int int_random = rand.nextInt(1000);
		int[] str=new int[10];
		for(int i=0;i<10;i++) {
	         str[i]=int_random;
	         if(num==int_random)
	        	 System.out.println("true");
	         int_random = rand.nextInt(1000);	        	        	 	        	 
		}			
	}
	public static void oran6() {
		Random rand = new Random();
		int int_random = rand.nextInt(1000);
		int[] str=new int[10];
		for(int i=0;i<10;i++) {
	         str[i]=int_random;
	         int_random = rand.nextInt(1000);
		}
		for(int i=0;i<10;i++) {
			if(i!=9) {
	         if((str[i]+str[i+1])%2==0)
	        	 System.out.println(str[i]+" "+str[i+1]);
			} 	 
	        	 
		}			
	}
	public static void oran7() {
		Random rand = new Random();
		int int_random = rand.nextInt(1000);
		int[] str=new int[10];
		int big=0;
		int num=0;
		for(int i=0;i<10;i++) {
	         str[i]=int_random;
	         int_random = rand.nextInt(1000);
		}
		for(int i=0;i<10;i++) {
			if(str[i]>big) {
				big=str[i]; 
				num=i;	
		}
	}
		str[num]=str[9];
		str[9]=big;
		for(int i=0;i<10;i++) {
			System.out.print(str[i]+" ");
		}		
	}
 
  }
