public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {3, 1, 5, -2, 4, 7, 2};
        insertionSort(array);
        for(int ar : array){
            System.out.print(ar + " ");
        }
    }
    static void insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int j = i-1;
            while(j>=0 && array[j]>array[j+1]){
                swap(array,j,j+1);
                j--;
            }
        }
    }
    static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
