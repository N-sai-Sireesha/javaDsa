import java.util.*;
public class merge {
    public static void main(String[] args) {
        int arr[]={3,1,2,4,5};
        int n=arr.length;
        int arr2[]={7,4,6,1,8};
        arr=Arrays.copyOf(arr,arr.length+arr2.length);
        for(int i=0;i<arr2.length;i++){
            arr[n+i]=arr2[i];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

