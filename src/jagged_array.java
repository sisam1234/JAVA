public class jagged_array {
    public static void main(String[] args) throws Exception{
        int[][] m=new int[][]{{1,2,3},{4,5,6,7},{8,9}};
        for (int i = 0; i < m.length; i++) {
            int sum = 0;
            for (int j = 0; j < m[i].length; j++) {
                
                System.out.print(m[i][j]+" ");
                sum+=m[i][j];
            }
            System.out.println("Sum of row"+(i+1)+":"+sum);
        }
    }
}
