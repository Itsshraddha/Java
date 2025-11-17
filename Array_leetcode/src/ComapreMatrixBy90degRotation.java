public class ComapreMatrixBy90degRotation {
    public static void main(String[] args) {

        int[][] mat = {{0,1},
                       {1,0}};
        int[][] target = {{1,0},
                          {0,1}};

        System.out.println(checkMatrix(mat ,target));
    }
    static boolean checkMatrix(int[][] mat,int[][] target){
        int n = mat.length;
        if(compare(mat,target)){
            return true;
        }
        for(int k=1 ; k<=3 ;k++){
            int[][] new_arr =new int[n][n];
            for(int i=0;i< mat.length;i++){
                for(int j=0;j< mat[0].length; j++){
                    new_arr[j][n-1-i] =mat[i][j];
                }
            }
           if( compare(new_arr , target)){
               return true;
            }
            else {
                for(int i=0;i< mat.length;i++){
                    for(int j=0 ;j< mat[0].length;j++){
                        mat[i][j] = new_arr[i][j];
                    }
                }

            }
        }
        return false;
    }
    static boolean compare(int[][] a, int[][] b){
        for(int i=0;i<a.length;i++){
            for(int j=0; j< a[0].length ;j++){
                if(a[i][j]!=b[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

}
