package Exception;

import java.rmi.RemoteException;

public class Test {
	   
		 public static void main(String args[]){  
		  try{  
		    try{  
		     System.out.println("going to divide");  
		     int b =39/0;  
		    }catch(ArithmeticException e){System.out.println(e);}  
		 
		    try{  
		    int a[]=new int[5];  
		    a[5]=4;  
		    }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
		 
		    System.out.println("other statement"); 
		  }catch(Exception e){System.out.println("handeled");}  
		 
		  System.out.println("normal flow..");  
		 }  
		}

// 2

class Testthrows1{  
	  void m()throws RemoteException{  
	    throw new RemoteException("device error");//checked exception  
	  }  
	  void n()throws RemoteException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
	   Testthrows1 obj=new Testthrows1();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  
	}  
//

