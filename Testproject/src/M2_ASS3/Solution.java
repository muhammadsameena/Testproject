package M2_ASS3;

class Stack{
	int index=-1;
	char s[];
	Stack(int size){
		s=new char[size];
	}
	void push(char c) {
		if(index==-1) {
			s[++index]=c;
		}
		else if(peek()=='[' && c==']' || peek()=='{' && c=='}' || peek()=='(' && c==')')
		{
			pop();
		}
		else {
			s[++index]=c;
		}
	}
		char pop()
		{
			if(index>=0) {
				return s[index--];
			}
			else {
				return ' ';
			}
		}char peek(){
			if(index>=0) {
				return s[index];
			}
			else {
				return ' ';
			}
		}
		boolean isEmpty(){
			return index==-1;
		}
	}
class Solution{
	public static String isMatching(String str){
		// fill you code Here
		Stack o=new Stack(str.length());
		for(int i=0;i<str.length();i++) {
			o.push(str.charAt(i));
		}
		if(o.isEmpty()) {
			return "YES";
		}else {
			return "NO";
		}
	
	}	
}
	
	