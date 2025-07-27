public class methodss {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Logic");
        sb.append("while");
        System.out.println("After append: "+sb);
        sb.insert(6,"and");
        System.out.println("After insert: "+sb);
        sb.replace(0,5,"loop");
        System.out.println("After replace: "+sb);
        sb.delete(4,8);
        System.out.println("After delete: "+sb);
        sb.reverse();
        System.out.println("after reverse: "+sb);
        String finalString=sb.toString();
        System.out.println("final string: "+finalString);
    }
    
}
