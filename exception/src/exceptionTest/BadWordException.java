package exceptionTest;

//RuntimeException 컴파일러가 검사하지 않는다.
public class BadWordException extends RuntimeException {
	public BadWordException() {;}
	public BadWordException(String message) {
		super(message);
	}
}
