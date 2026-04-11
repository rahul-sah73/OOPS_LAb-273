public class Reverse_Array {
    public static void main(String[] args){
        int [] arr = {1 , 2 , 3 , 4 , 5 , 6 , 7};
        int temp ;
        for (int i = 0; i < arr.length / 2 ; i++) {
            temp = arr[i] ;
            arr[i] = arr[arr.length - 1 - i] ;
            arr[arr.length - 1 - i] = temp ;
        }
        
        for(int element:arr){
            System.out.print(element + " ");
        }
        
    }
}
