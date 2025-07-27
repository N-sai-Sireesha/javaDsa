import java.util.*;
public class arrmeth {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int arr2[]={1,2,3,4,5,6};
        System.out.println( Arrays.equals(arr,arr2));
        Arrays.fill(arr,3);
        System.out.println(Arrays.toString(arr));
        int copy[]=Arrays.copyOf(arr,7);
        System.out.println(Arrays.toString(copy));
        Arrays.asList(arr2);
        System.out.println(Arrays.toString(arr2));
        int index=Arrays.binarySearch(arr2,3);
        System.out.println(index);
        int arr3[][]={{1,2},{3,4}};
        int arr4[][]={{1,2},{3,4}};
        System.out.println(Arrays.deepEquals(arr3, arr4));
    }
}
