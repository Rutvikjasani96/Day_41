public class QuickSort {
    public static void main(String[] args) {
        int[] array = {10, 3, 7, 6, 4, 8, 14, 12, 7, 1};
        quickSort(array,0,array.length-1);
        for(int ar : array){
            System.out.print(" "+ar);
        }
    }
    static void quickSort(int[] array,int s,int e){
        if(s>=e){
            return;
        }
        int p = rearrange(array, s, e);
        quickSort(array,s,p-1);
        quickSort(array,p+1,e);
    }
    static int rearrange(int[] array,int s, int e){
        int i=s+1,j=e;
        while(i<=j){
            if(array[i]<array[s]){
                i++;
            }else if(array[j]>array[s]){
                j--;
            }else{
                swap(array,i,j);
                i++;
                j--;
            }
        }
        swap(array, i-1,s);
        return i-1;
    }
    static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
