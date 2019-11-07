package m4_Ass2_merge;

class Solution{
		// fill you code Here

	    static void merge(String[] a,String[]b, int lb, int mid,  int up) {
	        for(int k=lb;k<=up;k++)
	            b[k]=a[k];
	        
	        int i=lb;
	        int j=mid+1;
	        for(int k=lb;k<=up;k++){
	            if(i>mid){
	                a[k]=b[j];
	                j++;
	            }else if(j>up){
	                a[k]=b[i];
	                i++;
	            }else if(b[j].compareTo(b[i])<=0) {
	                a[k]=b[j];
	                j++;


	            }else{
	                a[k]=b[i++];
	            }
	            
	             }
	            }
	    
	    static void mergesort(String a[],String[] b,int lb,int up){
	        
	        if(lb<up){
	            
	            int mid=(lb+up)/2;
	            mergesort(a,b,lb,mid);
	            mergesort(a,b, mid+1,up);
	            merge(a,b,lb,mid,up);
	        }

		}
		static String[] mergeSort(String arr[]){
			String[] b=new String[arr.length];
			mergesort(arr,b,0,arr.length-1);
		return arr;
	}
		 public static void main(String[] args) {
		        //String[] a=new String[]{"SABA","SANA","SUMA","SID","ZOYA"};
		        //System.out.println(Arrays.toString(a));
		    }
	
}