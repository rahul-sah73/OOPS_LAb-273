public class Max_Min {
    public static void main(String[] args){

     int [] arr = { 12 , 3 ,34  ,343 ,53 ,23 } ;
     int min = Integer.MAX_VALUE ;
     int max = Integer.MIN_VALUE ;

     for(int i:arr){
        if (i > max) max = i ;
        if (i < min) min = i ;
     }

     System.out.println(max);
     System.out.println(min);


    }
    
}
