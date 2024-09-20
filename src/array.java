public class array {
    public static void main(String[] args) throws Exception{
        // int[,] intarr= new int[2,3]{{1,2,3},{4,5,6}};
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++){
            int sum = 0;
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
                sum+=arr[i][j];
            }
            System.out.println("Sum of row"+(i+1)+":"+sum);
        }
    }
    
}