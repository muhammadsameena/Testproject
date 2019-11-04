package Exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestDriver {

	public static void main(String[] args) {
		w W=new w();
		W.display();
		x X=new x();
		X.display();
		y Y=new y();
		Y.display();
		z Z=new z();
		Z.display();
		
			}
}
	class w {
			void display() {
		try {
	int num=5;
	int denom;
	denom= num/0;
}catch(Exception e) {
	System.out.println("Number dicide by exception"+e);
}
	finally{
		System.out.println("exception 1");
			
	}
			}
}
class x{
	void display() {
try {
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		    int x = Integer.parseInt(buf.readLine());
}catch(Exception e){
	System.out.println(e);
}
finally{
	System.out.println("exception 2");
		
}
}
}
class y{
	void display() {
try {
	int c[] = { 1 };
    c[42] = 99;
}catch(Exception e) {
	System.out.println(e);
}
finally{
	System.out.println("exception 3");
		
}
	}
}
class z{
	void display() {
try {
	String s="h";
	System.out.println(s);
}catch(Exception e) {
	System.out.println(e);
	}
	finally{
		System.out.println("exception 4");
	}	
	
}
}

