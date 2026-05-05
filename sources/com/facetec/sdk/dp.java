package com.facetec.sdk;

import com.dynatrace.android.agent.Global;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class dp {
    public dp() {
    }

    public dp(Field field) {
        Code(field);
    }

    public static Writer B(Appendable appendable) {
        return (Writer) appendable;
    }

    public static DateFormat B(int i2, int i3) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i2 == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i2 == 1) {
            str = "MMMM d, yyyy";
        } else if (i2 == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(i2)));
            }
            str = "M/d/yy";
        }
        StringBuilder sbAppend = sb.append(str).append(Global.BLANK);
        if (i3 == 0 || i3 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i3 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i3 != 3) {
                throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(i3)));
            }
            str2 = "h:mm a";
        }
        return new SimpleDateFormat(sbAppend.append(str2).toString(), Locale.US);
    }

    public static <T> T Code(T t2) {
        t2.getClass();
        return t2;
    }

    public static void Code(cm cmVar, ek ekVar) throws IOException {
        eb.f3138q.B(ekVar, cmVar);
    }

    public static boolean Code(Type type) {
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    public static cm I(ei eiVar) throws cr {
        boolean z2;
        try {
            try {
                eiVar.D();
                z2 = false;
                try {
                    return eb.f3138q.V(eiVar);
                } catch (EOFException e2) {
                    e = e2;
                    if (z2) {
                        return cs.I;
                    }
                    throw new da(e);
                }
            } catch (em e3) {
                throw new da(e3);
            } catch (IOException e4) {
                throw new cu(e4);
            } catch (NumberFormatException e5) {
                throw new da(e5);
            }
        } catch (EOFException e6) {
            e = e6;
            z2 = true;
        }
    }

    public static void V(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }
}
