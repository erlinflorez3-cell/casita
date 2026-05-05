package com.google.android.play.core.splitinstall.internal;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public final class zzbx extends RuntimeException {
    private zzbx(Exception exc) {
        super("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", exc);
    }

    public static Object zzc(Callable callable) {
        callable.getClass();
        try {
            return callable.call();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new zzbx(e3);
        }
    }

    @Override // java.lang.Throwable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized Exception getCause() {
        Throwable cause;
        cause = super.getCause();
        cause.getClass();
        return (Exception) cause;
    }

    public final Exception zzb(Class cls) {
        int iIndexOf;
        String string;
        int i2 = 0;
        Class[] clsArr = {cls};
        for (int i3 = 0; i3 <= 0; i3++) {
            Class cls2 = clsArr[i3];
            if (RuntimeException.class.isAssignableFrom(cls2)) {
                Object[] objArr = new Object[2];
                objArr[0] = "getCause";
                objArr[1] = cls2;
                for (int i4 = 0; i4 < 2; i4++) {
                    Object obj = objArr[i4];
                    if (obj == null) {
                        string = "null";
                    } else {
                        try {
                            string = obj.toString();
                        } catch (Exception e2) {
                            String str = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str), (Throwable) e2);
                            string = "<" + str + " threw " + e2.getClass().getName() + ">";
                        }
                    }
                    objArr[i4] = string;
                }
                StringBuilder sb = new StringBuilder(118);
                int i5 = 0;
                while (i2 < 2 && (iIndexOf = "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s".indexOf("%s", i5)) != -1) {
                    sb.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i5, iIndexOf);
                    sb.append(objArr[i2]);
                    i5 = iIndexOf + 2;
                    i2++;
                }
                sb.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i5, 86);
                if (i2 < 2) {
                    sb.append(" [");
                    sb.append(objArr[i2]);
                    for (int i6 = i2 + 1; i6 < 2; i6++) {
                        sb.append(", ");
                        sb.append(objArr[i6]);
                    }
                    sb.append(AbstractJsonLexerKt.END_LIST);
                }
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (cls.isInstance(getCause())) {
            return (Exception) cls.cast(getCause());
        }
        Exception cause = getCause();
        ClassCastException classCastException = new ClassCastException(String.format("getCause(%s) doesn't match underlying exception", cls));
        classCastException.initCause(cause);
        throw classCastException;
    }
}
