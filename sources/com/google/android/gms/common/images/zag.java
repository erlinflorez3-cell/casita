package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zag {
    final zad zaa;
    protected int zab;

    public zag(Uri uri, int i2) {
        this.zab = 0;
        this.zaa = new zad(uri);
        this.zab = i2;
    }

    protected abstract void zaa(Drawable drawable, boolean z2, boolean z3, boolean z4);

    final void zab(Context context, zam zamVar, boolean z2) throws Throwable {
        Drawable drawable;
        int i2 = this.zab;
        if (i2 != 0) {
            short sXd = (short) (OY.Xd() ^ 9070);
            short sXd2 = (short) (OY.Xd() ^ 17120);
            int[] iArr = new int["\"0'64/+u,99@2<C}\u0014AAH:NK".length()];
            QB qb = new QB("\"0'64/+u,99@2<C}\u0014AAH:NK");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
                i3++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i3)).getMethod(Jg.Wd("n\f6;m;B\u007f\u001c\u001cY~", (short) (C1633zX.Xd() ^ (-6202)), (short) (C1633zX.Xd() ^ (-17748))), new Class[0]);
            try {
                method.setAccessible(true);
                drawable = ((Resources) method.invoke(context, objArr)).getDrawable(i2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            drawable = null;
        }
        zaa(drawable, z2, false, false);
    }

    final void zac(Context context, Bitmap bitmap, boolean z2) throws Throwable {
        Asserts.checkNotNull(bitmap);
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("^\u001c\u007fm@\u0006h\u0005x\u0007|g\u0004\u000b\r'\nNyv9+ ", (short) (FB.Xd() ^ 18844), (short) (FB.Xd() ^ 13428))).getMethod(C1626yg.Ud("\u0010\nP\u0002>ifSkJM\r", (short) (ZN.Xd() ^ 30894), (short) (ZN.Xd() ^ 20486)), new Class[0]);
        try {
            method.setAccessible(true);
            zaa(new BitmapDrawable((Resources) method.invoke(context, objArr), bitmap), false, false, true);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
