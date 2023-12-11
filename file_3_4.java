import java.util.Scanner;


public class oran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//1
      System.out.println("Enter number");
	    int num = scan.nextInt();
	    if(num>=0)
	        System.out.println("Positive");     
	    else
	         System.out.println("Negative");
	    
//2
      System.out.println("Enter number");
	    int num2 = scan.nextInt();  
	        System.out.println("Enter number");
	    int num3 = scan.nextInt(); 
	    if(num2>num3)
	        System.out.println(num3);
	    else
	    	System.out.println(num2);
	    
//3
      System.out.println("enter bike1");
	    String bike1 = scan.nextLine();
	    System.out.println("enter bike2");
	    String bike2 = scan.nextLine();
	    System.out.println("enter bike1 range");
	    int range1 = scan.nextInt();
	    System.out.println("enter bike2 range");
	    int range2 = scan.nextInt();
	    System.out.println("enter bike1 speed");
	    int speed1 = scan.nextInt();
	    System.out.println("enter bike2 speed");
	    int speed2 = scan.nextInt();
	    if(range1/speed1<range2/speed2)
	    	System.out.println(bike1);
	    else
	    	System.out.println(bike2);
//4
        System.out.println("enter number");
        int num4 = scan.nextInt();
        System.out.println("enter number");
        int num5 = scan.nextInt();
        System.out.println(" enter number");
        int num6 = scan.nextInt();
        System.out.println((num4+num5+num6)/3);
//5
      System.out.println("enter number");
      int num7 = scan.nextInt();
      System.out.println("enter number");
      int num8 = scan.nextInt();
      System.out.println(" enter number");
      int num9 = scan.nextInt();
      if(num7<num8&&num7<num9)
    	  System.out.println(num7);
      if(num8<num7&&num8<num9)
    	  System.out.println(num8);
      if(num9<num7&&num9<num8)
    	  System.out.println(num9);
//6
        System.out.println("enter number");
        int x1 = scan.nextInt();
        System.out.println("enter number");
        int x2 = scan.nextInt();
        System.out.println("enter number");
        int y1 = scan.nextInt();
        System.out.println("enter number");
        int y2 = scan.nextInt();
        System.out.println(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)));
//8
        System.out.println("enter number");
        int kartiv = scan.nextInt();
        if(kartiv<109) {
        	if(kartiv==54)
        		System.out.println("50 shekalim");
        	else if(kartiv==108)
        		System.out.println("100 shekalim");
        	else if(kartiv%10==0)
        		System.out.println(kartiv+" shekalim");
        	else
        		System.out.println(kartiv*1.2+" shekalim");		
        }
//9
        System.out.println("enter name");
        String name = scan.nextLine();
        System.out.println("enter school");
        String school = scan.nextLine();
        System.out.println("enter subjects number");
        int subjects = scan.nextInt();
        System.out.println("My name is "+name+" ,My school is"+school+" ,The number of subjects I study is "+subjects);
//10
      System.out.println("enter number 3 digits");
      int num10 = scan.nextInt();
      System.out.println(num10%10+(num10/10)%10+num10/100);
//1
        System.out.println("enter name");
        String name2 = scan.nextLine();
        System.out.println("enter name");
        String name3 = scan.nextLine();
        System.out.println("enter name");
        String name4 = scan.nextLine();
        if(name2.compareTo(name3)<0) {
            if(name2.compareTo(name4)<0) {
            	if(name3.compareTo(name4)<0)
            		System.out.println(name2+" ,"+name3+" ,"+name4);
            	else
            		System.out.println(name2+" ,"+name4+" ,"+name3);
            }
        }
        if(name3.compareTo(name2)<0) {
            if(name3.compareTo(name4)<0) {
            	if(name2.compareTo(name4)<0)
            		System.out.println(name3+" ,"+name2+" ,"+name4);
            	else
            		System.out.println(name3+" ,"+name4+" ,"+name2);
            }
        }
        if(name4.compareTo(name3)<0) {
            if(name4.compareTo(name2)<0) {
            	if(name3.compareTo(name2)<0)
            		System.out.println(name4+" ,"+name3+" ,"+name2);
            	else
            		System.out.println(name4+" ,"+name2+" ,"+name3);
            }
        }
//2
        System.out.println("enter str");
        String str1 = scan.nextLine();
        System.out.println(str1.length());
//3
        System.out.println("enter str");
        String str2 = scan.nextLine();
        String str2reverse="";
        for (int i = str2.length()-1; i >=0; --i) {
        	str2reverse = str2reverse + str2.charAt(i);
          }

          if (str2.equals(str2reverse)) {
            System.out.println(" is a Palindrome String.");
          }
          else {
            System.out.println(" is not a Palindrome String.");
          }
//4
      System.out.println("enter str");
      String str3 = scan.nextLine();
      String str3reverse="";
      for (int i = str3.length()-1; i >=0; --i) {
      	str3reverse = str3reverse + str3.charAt(i);
        }
       System.out.println(str3reverse);
        
//5
        System.out.println("enter str");
        String str4 = scan.nextLine(); 
        String str5 =str4.replace("o", "*");
        String str6 =str5.replace("i", "*");
        String str7 =str6.replace("u", "*");
        String str8 =str7.replace("e", "*");
        String str9 =str8.replace("a", "*");
        System.out.println(str9);

//6
        System.out.println("enter number");
        int num11 = scan.nextInt();
        if(num11/10>0)
        	 System.out.println("2 digits");
        else
        	 System.out.println("one digit");
        if(num11%3==0)
        	 System.out.println("divisble by 3");
        if(num11%2==0)
       	     System.out.println("divisble by 2");
        	          
    }
}
