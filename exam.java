public class exam {
    public static void main(String[] args) {
        // String sb="hellojava";
        // int count=0;
        // for(int i=0;i<sb.length();i++){
        //     char c=sb.charAt(i);
        //     if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
        //         count++;
        //         System.out.print(c+" ");
        //     }
            
        // }System.out.println();
        // System.out.println(count);
        //______________________________
        StringBuilder sb=new StringBuilder("helloworld");
        StringBuilder ch=new StringBuilder();
        StringBuilder v=new StringBuilder();
        for(int i=0;i<sb.length();i++){
            char c=sb.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                ch.append(c);
            }
            else{
                v.append(c);
            }
        }
        System.out.println(v+" "+ch);
    }
}
