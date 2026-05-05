package com.ts.coresdk.c.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.ts.coresdk.TSLog;
import com.ts.coresdk.crypto.api.CryptographyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import yg.C1561oA;
import yg.C1580rY;
import yg.OY;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String str) {
        super(context, str);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // com.ts.coresdk.c.a.a.c
    public SharedPreferences C() throws Throwable {
        Context contextE = E();
        Object[] objArr = {D(), 0};
        Method method = Class.forName(hg.Vd("`lanjc]&ZechX`e\u001e2][`Pb]", (short) (C1580rY.Xd() ^ (-30671)), (short) (C1580rY.Xd() ^ (-25450)))).getMethod(C1561oA.yd("\u0007\u0006\u0012q\f\u0006\u0014\b{h\b{\u0002\u0002\f\u007f}sr\u0002", (short) (OY.Xd() ^ 19186)), Class.forName(C1561oA.ud("G=Q;\u0007D8D<\u0002&FC9=5", (short) (ZN.Xd() ^ 22818))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(contextE, objArr);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
            return sharedPreferences;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.ts.coresdk.c.a.a.c
    public <R> R a(Object obj, KClass<R> kClass) {
        Object objValueOf;
        Intrinsics.checkNotNullParameter(kClass, "");
        if (obj == null) {
            return null;
        }
        String strDecrypt = CryptographyManager.INSTANCE.decrypt(E(), obj.toString(), com.ts.coresdk.logger.c.a.INSTANCE);
        if (strDecrypt == null) {
            strDecrypt = "";
        }
        try {
            if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(String.class))) {
                objValueOf = strDecrypt;
            } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                objValueOf = Integer.valueOf(Integer.parseInt(strDecrypt));
            } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                objValueOf = Boolean.valueOf(Boolean.parseBoolean(strDecrypt));
            } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                objValueOf = Float.valueOf(Float.parseFloat(strDecrypt));
            } else {
                if (!Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    return null;
                }
                objValueOf = Long.valueOf(Long.parseLong(strDecrypt));
            }
            return (R) objValueOf;
        } catch (Throwable th) {
            Context contextE = E();
            com.ts.coresdk.logger.c.a aVar = com.ts.coresdk.logger.c.a.INSTANCE;
            String message = th.getMessage();
            TSLog.e(contextE, aVar, message != null ? message : "", th);
            return null;
        }
    }

    @Override // com.ts.coresdk.c.a.a.c
    public KClass<? extends Object> a(KClass<? extends Object> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        return Reflection.getOrCreateKotlinClass(String.class);
    }

    @Override // com.ts.coresdk.c.a.a.c
    public Object b(Object obj) {
        String strEncrypt = CryptographyManager.INSTANCE.encrypt(E(), String.valueOf(obj), com.ts.coresdk.logger.c.a.INSTANCE);
        return strEncrypt == null ? "" : strEncrypt;
    }

    @Override // com.ts.coresdk.c.a.a.c
    public Object c(Object obj) {
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
