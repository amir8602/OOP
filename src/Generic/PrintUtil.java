package Generic;

public class PrintUtil {

//    public static void printInteger(Integer [] arr){
//        for (Integer integer : arr) {
//            System.out.print(integer + " ");
//        }
//    }
//    public static void printInteger(Double [] arr){
//        for (Double integer : arr) {
//            System.out.print(integer+" ");
//        }
//    }
//
//    public static void printInteger(String [] arr){
//        for (String integer : arr) {
//            System.out.print(integer + " ");
//        }
//    }

//    public static void printInteger(Object [] arr){
//        for (Object integer : arr) {
//            System.out.print(integer + " ");
//        }
//    }
//
//    public static Integer sort(Integer [] arr){
//        Integer max = arr[0];
//        for (Integer integer : arr) {
//            if (integer>max)
//                max=integer;
//        }
//        return max;
//    }
//

    public static <T> void print(T[] arr){

    }

    public static <T extends Number & Comparable<T>> T max(T[] arr){
        T max = arr[0];
        for (T t : arr) {
            if (t.compareTo(max)>0)
                max=t;
        }
        return max;
    }

    public static <T extends Comparable<T>> T maxx(T a , T b , T c){
        T maxxx = a;
        if(maxxx.compareTo(b)<0)
            maxxx=b;
        if (maxxx.compareTo(c)<0)
            maxxx=c;
        return maxxx;
    }


}
