package com.upokecenter.numbers;

/* JADX INFO: loaded from: classes5.dex */
public final class ETrapException extends ArithmeticException {
    private static final long serialVersionUID = 1;
    private final EContext ctx;
    private final int error;
    private final int errors;
    private final Object result;

    public ETrapException() {
        this(FlagToMessage(64));
    }

    public ETrapException(int i2, int i3, EContext eContext, Object obj) {
        super(FlagToMessage(i2));
        if ((i2 + i3) - (i2 | i3) != i3) {
            throw new IllegalArgumentException("flags doesn't include flag");
        }
        this.error = i3;
        this.errors = i2;
        this.ctx = eContext == null ? null : eContext.Copy();
        this.result = obj;
    }

    public ETrapException(int i2, EContext eContext, Object obj) {
        this(i2, i2, eContext, obj);
    }

    public ETrapException(String str) {
        super(str);
        this.error = 64;
        this.errors = 64;
        this.ctx = null;
        this.result = null;
    }

    public ETrapException(String str, Throwable th) {
        super(str);
        initCause(th);
        this.error = 64;
        this.errors = 64;
        EContext eContext = this.ctx;
        this.ctx = eContext == null ? null : eContext.Copy();
        this.result = null;
    }

    private static String FlagToMessage(int i2) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (int i3 = 0; i3 < 32; i3++) {
            int i4 = 1 << i3;
            if ((i2 & i4) != 0) {
                if (!z2) {
                    sb.append(", ");
                }
                sb.append(i4 == 32 ? "Clamped" : i4 == 128 ? "DivideByZero" : i4 == 1 ? "Inexact" : i4 == 64 ? "Invalid" : i4 == 16 ? "Overflow" : i4 == 2 ? "Rounded" : i4 == 4 ? "Subnormal" : i4 == 8 ? "Underflow" : "Trap");
                z2 = false;
            }
        }
        return sb.toString();
    }

    public boolean HasError(int i2) {
        return (-1) - (((-1) - getError()) | ((-1) - i2)) == i2;
    }

    public final EContext getContext() {
        return this.ctx;
    }

    public final int getError() {
        return this.error;
    }

    public final int getErrors() {
        return this.errors;
    }

    public final Object getResult() {
        return this.result;
    }
}
