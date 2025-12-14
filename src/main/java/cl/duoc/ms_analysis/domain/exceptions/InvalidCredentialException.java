package cl.duoc.ms_analysis.domain.exceptions;

public class InvalidCredentialException extends RuntimeException {
    public InvalidCredentialException() {
        super("Credenciales incorrectas");
    }
}
