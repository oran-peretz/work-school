import java.util.Scanner;


public class file56 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		oran();
		oran2(27);
		oran3(4,6);
		oran4(4,6,7);
		oran5(5);
		oran6(3,4);
		oran7("a","b","c");
		oran8(69,55,33);
		oran9();
		oran10();
		oran11(4567);
		oran12("orannaro");
		oran13(24);
		oran14();
		oran15();
		System.out.println(oran16(3));
		oran17(2,3);
		oran18(4);

	}
	public static void oran(){
		Scanner scan = new Scanner(System.in);
	    System.out.println("enter name");
		String name = scan.nextLine();
		System.out.println("hello "+name);
	}
	public static void oran2(int num){
		for(int i=0;i<num;i++){
			if(i%5==0)
				System.out.println(i+" ");
				
		}
	}
	public static int oran3(int num,int num2){
		return num*num2;
	}
	public static int oran4(int num,int num2,int num3){
		System.out.println(num+num2+num3);
		return num*num2*num3/3;
	}
	public static void oran5(int num){
		System.out.println(num*2*3.14);
		System.out.println(num*3.14*num);
	}
	public static double oran6(int num,int num2){
		double num3=Math.sqrt((num*num)+(num2*num2));
		System.out.println(num3);	
		return num3;
	}
	public static void oran7(String letter,String letter2,String letter3){
		System.out.println(letter3+letter2+letter);
	}
	public static int oran8(int num,int num2,int num3){
          int num4=num3+(num2-1)*num;
          return num4;
	}
	public static void oran9(){
		Scanner scan = new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++)			
		    System.out.println("enter number");
	     	int num = scan.nextInt(); 
	     	sum=sum+num;
	    System.out.println(sum/5);    
	}
	public static void oran10(){
		Scanner scan = new Scanner(System.in);
		String str="";
		String str2="enter";
		while(str.equals(str2)) {
			System.out.println("enter str"); 
			str = scan.nextLine();
		}
	}
	public static void oran11(int num){
		Scanner scan = new Scanner(System.in);
		int counter=0;
		do {
			System.out.println("enter password");
		    int num2 = scan.nextInt();
			if(num2==num) {
				System.out.println("how much money"); 	
		        counter=3;
			}
			else {
				System.out.println("error");
				counter++;
			}
		}
		while (counter<3);	
	}
	public static void oran12(String str){
	        String str2reverse="";
	        for (int i = str.length()-1; i >=0; --i) {
	        	str2reverse = str2reverse + str.charAt(i);
	          }
	          if (str.equals(str2reverse)) {
	            System.out.println(" is a Palindrome String.");
	          }
	          else {
	            System.out.println(" is not a Palindrome String.");
	          }
	}
	public static void oran13(float num){
		for(int i=0;i<num;i++) {
			if(num%i==0) {
				System.out.print(i+",");
			}	
		}
		System.out.print(num);		
	}
	public static void oran14(){
	        System.out.print("    ");
	        for (int i = 1; i <= 10; i++) {
	            System.out.printf("%4d", i);
	        }
	        System.out.println("\n------------------------------------");
	        for (int i = 1; i <= 10; i++) {
	            System.out.printf("%2d |", i);
	            for (int j = 1; j <= 10; j++) {
	                System.out.printf("%4d", i * j);
	            }
	            System.out.println();
	        }		
	}
	public static void oran15(){
		Scanner scan = new Scanner(System.in);
		int max=0;
		int min=101;
		int num=0;
		for(int i=0;i<7;i++){
			System.out.println("enter grade");
		    num = scan.nextInt();
		    if(num>max)
		    	max=num;
		    if(num<min)
		    	min=num;	
		}
		System.out.println("top grade: "+max+"low grade: "+min);
	}
	public static boolean oran16(int num){		
		    int sqrt1 = (int) Math.sqrt(5 * num * num + 4);
	        int sqrt2 = (int) Math.sqrt(5 * num * num - 4);
	        return sqrt1 * sqrt1 == 5 * num * num + 4 || sqrt2 * sqrt2 == 5 * num * num - 4;
	}
	public static void oran17(int num,int num2 ){
		int num3=0;
		for(int i=0;i<num;i++)
			num3=num3+num2;
		System.out.println(num3);
	}
	public static void oran18(int num){
		for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
	    }
	}	
}
