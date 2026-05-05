package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.Wg;

/* JADX INFO: loaded from: classes8.dex */
public final class zbn {
    private static zbn zbd = null;
    final Storage zba;
    GoogleSignInAccount zbb;
    GoogleSignInOptions zbc;

    private zbn(Context context) {
        Storage storage = Storage.getInstance(context);
        this.zba = storage;
        this.zbb = storage.getSavedDefaultGoogleSignInAccount();
        this.zbc = storage.getSavedDefaultGoogleSignInOptions();
    }

    public static synchronized zbn zbc(Context context) {
        Object[] objArr;
        Method method;
        objArr = new Object[0];
        method = Class.forName(Wg.Zd("\u0012B\u007fM\u0016O\u0012\u001b[\u0007M\u0013O\u0018e^\u007fK\u0012W\u0014f*", (short) (FB.Xd() ^ 5865), (short) (FB.Xd() ^ 12343))).getMethod(C1561oA.Xd("+*:\b8964/.B8??\u0015BBI;OL", (short) (C1633zX.Xd() ^ (-13335))), new Class[0]);
        try {
            method.setAccessible(true);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
        return zbf((Context) method.invoke(context, objArr));
    }

    private static synchronized zbn zbf(Context context) {
        zbn zbnVar = zbd;
        if (zbnVar != null) {
            return zbnVar;
        }
        zbn zbnVar2 = new zbn(context);
        zbd = zbnVar2;
        return zbnVar2;
    }

    public final synchronized GoogleSignInAccount zba() {
        return this.zbb;
    }

    public final synchronized GoogleSignInOptions zbb() {
        return this.zbc;
    }

    public final synchronized void zbd() {
        this.zba.clear();
        this.zbb = null;
        this.zbc = null;
    }

    public final synchronized void zbe(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.zba.saveDefaultGoogleSignInAccount(googleSignInAccount, googleSignInOptions);
        this.zbb = googleSignInAccount;
        this.zbc = googleSignInOptions;
    }
}
