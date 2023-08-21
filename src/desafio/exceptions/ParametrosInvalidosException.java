package desafio.exceptions;

public class ParametrosInvalidosException extends Exception {
	//
	private static final long serialVersionUID = 1L;
    private String message;

    public ParametrosInvalidosException(String message) {
    	//
        super(message);
        this.message = message;
    }

    public String getMessage() {
    	//
        return message;
    }
}