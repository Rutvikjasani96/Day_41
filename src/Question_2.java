public class Question_2 {
//    Given n array elements & subarray [s...e] rearrange subarray [s...e]
    public static void main(String[] args) {
        int[] array = {10, 3, 7, 6, 4, 8, 14, 12, 7, 1};
        rearrange(array,2,7);
        for(int ar : array){
            System.out.print(" "+ar);
        }
    }
    static void rearrange(int[] array,int s, int e){
        int i=s+1,j=e;
        while(i<j){
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
    }
    static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
