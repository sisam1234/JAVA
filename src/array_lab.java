public class array_lab {
    public static void main(String[] args) throws Exception {
       
        System.out.println(a2(new int[] {10, 20, 67, 4}));
        System.out.println(a2(new int[] {30, 20, 67, 44}));
        System.out.println(a2(new int[] {12, 20, 7, 44}));
        
    }
    static int a2(int[] a)
    {
      int sumEven = 0;
      int sumOdd = 0;
          
      for (int i=0; i<a.length; i++)
      {
        if (a[i]%2 == 0)
          sumEven += a[i];
        else
          sumOdd += a[i];
      }
          
      return sumOdd - sumEven;
    }

}
