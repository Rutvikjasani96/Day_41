import java.util.ArrayList;

public class RadixSort {
    public static void main(String[] args) {
        int[] array = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(array);
        for(int arr : array){
            System.out.print(arr + " ");
        }
    }
    static void radixSort(int[] array) {
        ArrayList<Integer>[] ele = new ArrayList[10];
        int digits = maxDigits(array);
        for(int i=0; i<digits; i++) {
            for(int j=0; j< array.length; j++) {
                int digit = (array[j]%pow(10,i+1))/pow(10,i);
                if(ele[digit] == null) {
                    ele[digit] = new ArrayList<>();
                }
                ele[digit].add(array[j]);
            }
//            for(int j=0;j<10;j++){
//                System.out.println(ele[j]);
//            }
            int l=0;
            for(int j=0;j<10;j++){
                if(ele[j]!=null){
                    for(int k=0;k<ele[j].size();k++){
                        array[l] = ele[j].get(k);
                        l++;
                    }
                    ele[j].clear();
                }
            }
        }
    }
    static int maxDigits(int[] array){
        int max = 0,count = 0;
        for(int i=0;i<array.length;i++){
            max = Math.max(max,array[i]);
        }
        while(max>1){
            count++;
            max /= 10;
        }
        return count;
    }
    static int pow(int a,int n){
        if(n==0){
            return 1;
        }
        int ha = pow(a,n/2);
        int he = ha * ha;
        if(n%2==0){
            return he;
        }else{
            return he*a;
        }
    }
}
