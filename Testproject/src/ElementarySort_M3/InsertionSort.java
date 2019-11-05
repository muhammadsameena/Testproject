package ElementarySort_M3;

public class InsertionSort {
    public static void main(String args[]){
        char chr[] = {'E','A','S','Y','Q','U','E','S','T','I','O','N'};
        chr = insertionSort(chr);
        for (char no:chr)
            System.out.println(no);
    }

    static char[] insertionSort(char[] chr){
        for (int i = 1;i < chr.length; i++){
            char temp = chr[i];
            for (int j = i - 1; j > -1 ;j--) {
                if (chr[j] > temp){
                    chr[i] = chr[j];
                    i--;
                }
            }
            chr[i] = temp;
        }
        return chr;
    }

}
