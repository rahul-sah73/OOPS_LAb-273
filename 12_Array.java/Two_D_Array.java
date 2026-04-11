    public class Two_D_Array {
    public static void main(String[] args){

        int [][] matrix = new int[2][3] ;  // matrix having 2 rows and 3 coloumns 

        matrix[0][0] = 101 ;
        matrix[0][1] = 102 ;
        matrix[0][2] = 103 ;
        matrix[1][0] = 201 ;
        matrix[1][1] = 202 ;
        matrix[1][2] = 203 ;

        for(int i = 0 ; i < matrix.length ; i++){
            System.out.println(matrix[i]);
        }

    }
    
}
