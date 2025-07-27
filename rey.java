import java.util.*;
class rey {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        System.out.println(arr);
        for(char el: arr){
            System.out.print(el+" ");
        }
        ArrayList<Integer> num=new ArrayList<>();
        num.add(10);
        num.addFirst(29);
        System.out.println(num);
        sc.close();
    }  
}
