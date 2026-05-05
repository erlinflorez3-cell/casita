package com.facetec.sdk;

import com.facetec.sdk.cf;
import com.facetec.sdk.fr;
import com.facetec.sdk.fy;
import java.io.IOException;
import java.net.Socket;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ge {
    public static ge Code = null;

    public abstract int B(fy.B b2);

    public abstract gi B(fg fgVar);

    @Nullable
    public abstract IOException B(cf.I i2, @Nullable IOException iOException);

    public abstract gm Code(fg fgVar, fc fcVar, gn gnVar, gc gcVar);

    public abstract boolean Code(fc fcVar, fc fcVar2);

    public abstract void I(fh fhVar, SSLSocket sSLSocket, boolean z2);

    public abstract void V(fr.V v2, String str);

    public abstract boolean V(fg fgVar, gm gmVar);

    public abstract Socket Z(fg fgVar, fc fcVar, gn gnVar);

    public abstract void Z(fg fgVar, gm gmVar);

    public abstract void Z(fr.V v2, String str, String str2);
}
