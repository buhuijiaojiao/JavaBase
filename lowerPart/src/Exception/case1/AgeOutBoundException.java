package Exception.case1;

public class AgeOutBoundException extends RuntimeException{
    public AgeOutBoundException() {
    }

    public AgeOutBoundException(String message) {
        super(message);
    }
}
