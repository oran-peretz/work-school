
public class file7 {
      private int firstMember;
      private int difference;
      public file7(int diff,int first) {
    	  firstMember=first;
    	  difference=diff;
      }
      public void print() {
    	  System.out.println("an=a1+(n-1)*d");
      }
      public int calc(int n) {
    	  return firstMember+(n-1)*difference;
      }
      public float calculateN(int an) {
    	  int num=(an-firstMember)/difference+1;
    	  int num2=firstMember;
    	  if (difference<0) {
    		  while(an<num2) {
    			  num2=num2+difference;
    		  }
    		  if(num2==an)
    			  return num;
    		  else
    			  return 0;
    	  }
    	  else if(difference>0) {
    		  while(an>num2) {
    			  num2=num2+difference;
    		  }
    		  if(num2==an)
    			  return num;
    		  else
    			  return 0;
    	  }
          else
        	  if(num2==an)
    			  return num;
    		  else
    			  return 0;
    	  }  	  
      }



public class tester {

	public static void main(String[] args) {
		file7 num=new file7(2,1);
		num.print();
		System.out.println(num.calc(25));
		System.out.println(num.calculateN(2));				
	}

}
