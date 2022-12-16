package demoProject.webProjectDemo1.core.utilities.results;

import org.aspectj.weaver.tools.Trace;

public class SuccesDataResult<T> extends DataResult {
    public SuccesDataResult(String message, T data) {
        super(true, message,data);
    }
    public SuccesDataResult(String message) {
        super(true, message,null);
    }
    public SuccesDataResult(T data) {
        super(true,data);
    }
    public SuccesDataResult() {
        super(true,null);
    }
}
