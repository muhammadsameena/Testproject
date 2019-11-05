package M1_Assn2;

public class Sum3 {
	public static void main(String args[]){
        int arr[] = {-40,30,-20,-10,40,0,-5,5};
        int Count = 0;
        arr = bubbleSort(arr);
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++)
                for (int j = i + 1; j < arr.length; j++)
                    if (binarySearch(arr, -(arr[i] + arr[j]))) {
                       Count++;
                      
                       
                    }
        }
        System.out.println(Count);
    }

    static int[] bubbleSort(int[] arr) {
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++)
                for (int j = i + 1; j < arr.length; j++)
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
        }
       return arr;
    }

    static boolean binarySearch(int[] arr, int key){
        int low = 0, high = arr.length - 1, mid = (low+high)/2;
        while (low <= high){
            if (key < arr[mid]) high = mid - 1;
            else if (key > arr[mid]) low = mid + 1;
            else return true;
            mid = (low+high)/2;
        }
        return false;
    }
}



