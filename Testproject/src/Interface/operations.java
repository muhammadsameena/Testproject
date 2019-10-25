package Interface;

		interface Operator{
			int performOperation(int num1, int num2);	
		}
		class Add implements Operator 
	    {
	        private String opString;
	            public Add() {
	                 opString = "+";
	            }
	        public int performOperation(int num1, int num2) {
	            return num1 + num2;
	        }
	         public String getOperation() {
	         return opString;
	        }
	    }
		 class Sub implements Operator 
	    {
	        private String opString;
	            public Sub() {
	                 opString = "-";
	            }
	        public int performOperation(int num1, int num2) {
	            return num1 - num2;
	        }
	         public String getOperation() {
	         return opString;
	        }
	    }
		class Mul implements Operator 
	    {
	        private String opString;
	            public Mul() {
	                 opString = "*";
	            }
	        public int performOperation(int num1, int num2) {
	            return num1 * num2;
	        }
	         public String getOperation() {
	         return opString;
	        }
	    }
		class Div implements Operator 
	    {
	        private String opString;
	            public Div() {
	                 opString = "/";
	            }
	        public int performOperation(int num1, int num2) {
	            return num1 / num2;
	        }
	         public String getOperation() {
	         return opString;
	        }
	    }
		public class operations{

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		Add a=new Add();
		System.out.println(a.performOperation(7,9));
		Sub s=new Sub();
		System.out.println(s.performOperation(7,4));
		Mul m=new Mul();
		System.out.println(m.performOperation(3,5));
		Div d=new Div();
		System.out.println(d.performOperation(15, 3));
		}
		}