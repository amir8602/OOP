package Exception;

public class CustomeException extends Exception{
    int line;
    String msg;

    public CustomeException( int line, String msg) {
        this.line = line;
        this.msg = msg;
    }
}
