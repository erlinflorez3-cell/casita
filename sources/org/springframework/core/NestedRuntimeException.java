package org.springframework.core;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NestedRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 5439915454935047936L;

    public NestedRuntimeException(String str) {
        super(str);
    }

    public NestedRuntimeException(String str, Throwable th) {
        super(str, th);
    }

    public boolean contains(Class cls) {
        if (cls == null) {
            return false;
        }
        if (cls.isInstance(this)) {
            return true;
        }
        Throwable cause = getCause();
        if (cause == this) {
            return false;
        }
        if (cause instanceof NestedRuntimeException) {
            return ((NestedRuntimeException) cause).contains(cls);
        }
        while (cause != null) {
            if (cls.isInstance(cause)) {
                return true;
            }
            if (cause.getCause() == cause) {
                break;
            }
            cause = cause.getCause();
        }
        return false;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return NestedExceptionUtils.buildMessage(super.getMessage(), getCause());
    }

    public Throwable getMostSpecificCause() {
        Throwable rootCause = getRootCause();
        return rootCause != null ? rootCause : this;
    }

    public Throwable getRootCause() {
        Throwable th = null;
        for (Throwable cause = getCause(); cause != null && cause != th; cause = cause.getCause()) {
            th = cause;
        }
        return th;
    }
}
