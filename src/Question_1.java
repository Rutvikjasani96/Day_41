public class Question_1 {
//    Given n array elements, re-arrange the array such that
//    arr[0] should go to sorted position
//    all elements <=arr[0] go to left side of arr[0]
//    all elements >=arr[p0] go to right side of arr[0]
    public static void main(String[] args) {
        int[] array = {10, 3, 8, 15, 6, 12, 2, 18, 7, 15, 14};
        rearrange(array);
        for(int ar : array){
            System.out.print(ar + " ");
        }
    }
    static void rearrange(int[] array){
        int i=1,j=array.length-1;
        while(i<j){
            if(array[i]<array[0]){
                i++;
            }else if(array[j]>array[0]){
                j--;
            }else{
                swap(array,i,j);
                i++;
                j--;
            }
        }
        swap(array, i-1,0);
    }
    static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
