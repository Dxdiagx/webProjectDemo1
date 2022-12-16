package demoProject.webProjectDemo1.core.utilities.results;

public class ErrorDataResult <T> extends DataResult{
    public ErrorDataResult(String message, T data) {
        super(false, message,data);
    }
    public ErrorDataResult(String message) {
        super(false, message,null);
    }
    public ErrorDataResult(T data) {
        super(false,data);
    }
    public ErrorDataResult() {
        super(false,null);
    }
}
