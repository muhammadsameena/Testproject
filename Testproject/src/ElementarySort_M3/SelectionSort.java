package ElementarySort_M3;

import java.util.Scanner;

public class SelectionSort {

public static void main(String[] args) {
// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the String: ");
	String Str = sc.nextLine();

	char[] chr = Str.toCharArray();
	
	for (int i=0; i<chr.length;i++ ) {
		for (int j=i+1; j<chr.length;j++) {
			if(Character.toLowerCase(chr[j])<Character.toLowerCase(chr[i])) {
				sortString(i,j,chr);
				}
            }
        }
	
        System.out.println(String.valueOf(chr));
    }

private static void sortString(int i, int j, char[] chr) {
        char temp = chr[i];
        chr[i] = chr[j];
        chr[j] = temp;
      }
 }

