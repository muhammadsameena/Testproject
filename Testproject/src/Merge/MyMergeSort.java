package Merge;

public class MyMergeSort {
	void merge(char arr[], int beg, int mid, int end)  
	{  
	  
	char l =(char) (mid - beg + 1);  
	char r = (char)(end - mid);  
	  
	char LeftArray[] = new char [l];  
	char RightArray[] = new char [r];  
	  
	for (int i=0; i<l; ++i)  
	LeftArray[i] = arr[beg + i];  
	  
	for (int j=0; j<r; ++j)  
	RightArray[j] = arr[mid + 1+ j];  
	  
	  
	int i = 0, j = 0;  
	int k = beg;  
	while (i<l&&j<r)  
	{  
	if (LeftArray[i] <= RightArray[j])  
	{  
	arr[k] = LeftArray[i];  
	i++;  
	}  
	else  
	{  
	arr[k] = RightArray[j];  
	j++;  
	}  
	k++;  
	}  
	while (i<l)  
	{  
	arr[k] = LeftArray[i];  
	i++;  
	k++;  
	}  
	  
	while (j<r)  
	{  
	arr[k] = RightArray[j];  
	j++;  
	k++;  
	}  
	}  
	  
	void sort(char[] arr, int beg, int end)  
	{  
	if (beg<end)  
	{  
	int mid = (beg+end)/2;  
	sort(arr, beg, mid);  
	sort(arr , mid+1, end);  
	merge( arr, beg, mid, end);  
	}  
	}  
	public static void main(String args[])  
	{  
        char chr[] = {'E','A','S','Y','Q','U','E','S','T','I','O','N'};  
	MyMergeSort ob = new MyMergeSort();  
	ob.sort(chr, 0, chr.length-1);  
	  
	System.out.println("\nSorted array");  
	for(int i =0; i<chr.length;i++)  
	{  
	    System.out.println(chr[i]+"");  
	}  
	}  
	}  
//

//A
//E
//E
//I
//N
//O
//Q
//S
//S
//T
//U
//Y


