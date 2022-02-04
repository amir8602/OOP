package Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        try {
            System.out.println(getYear(date));
        } catch (CustomeException e) {
            System.out.println(e.getClass());
            System.out.println(e.line);
            System.out.println(e.msg);
        }

    }

    public static int getYear(String str)throws CustomeException{
        String yearStr = str.substring(0,4);
        if(!yearStr.matches("[0-9]+"))
            throw new CustomeException(20 , "mismatch"  );
        int year = Integer.parseInt(yearStr);
        return year;
    }




}
