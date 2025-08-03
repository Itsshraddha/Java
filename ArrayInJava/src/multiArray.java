public class multiArray {
    public static void main(String[] args) {
        int[][] arr = {{1,23,4},
                       {4,6,11},
                       {7,9,66}};
       // System.out.println(arr[0][1]);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        //System.out.println("Original Array= " +Arrays.toString(arr));




    }
}
