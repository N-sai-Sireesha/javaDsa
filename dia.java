public class dia {
    public static void main(String[] args) {
        int arr[][]={{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i!=j || i+j!=4-1){
                    if(arr[i][j]!=0){
                        System.out.print("false");
                        break;
                    }
                }
            }
        }
    }
}
