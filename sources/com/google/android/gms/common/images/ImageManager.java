package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;
import com.google.android.gms.internal.base.zat;
import com.google.android.gms.internal.base.zau;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class ImageManager {
    private static final Object zaa = new Object();
    private static final HashSet zab = new HashSet();
    private static ImageManager zac = null;
    private final Context zad;
    private final Handler zae;
    private final ExecutorService zaf;
    private final zam zag;
    private final Map zah;
    private final Map zai;
    private final Map zaj;

    /* JADX INFO: Access modifiers changed from: private */
    final class ImageReceiver extends ResultReceiver {
        private final Uri zab;
        private final ArrayList zac;

        /* JADX WARN: Illegal instructions before constructor call */
        ImageReceiver(Uri uri) throws Throwable {
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(hg.Vd("+7,95.(p14m\u000b-,, ,", (short) (C1580rY.Xd() ^ (-1479)), (short) (C1580rY.Xd() ^ (-6463)))).getDeclaredMethod(C1561oA.ud("&#1\t\u001c#'\u0004&%%\u0019%", (short) (C1499aX.Xd() ^ (-25125))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                super(new zau((Looper) declaredMethod.invoke(null, objArr)));
                this.zab = uri;
                this.zac = new ArrayList();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i2, Bundle bundle) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager imageManager = ImageManager.this;
            imageManager.zaf.execute(new zaa(imageManager, this.zab, parcelFileDescriptor));
        }

        public final void zab(zag zagVar) throws Throwable {
            Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            this.zac.add(zagVar);
        }

        public final void zac(zag zagVar) throws Throwable {
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.zac.remove(zagVar);
        }

        public final void zad() throws Throwable {
            Intent intent = new Intent(C1561oA.yd("Xed&Xab[ic-ag^mkNJ\u0015ONU\u0011G\\[\\_W\u0018TYv}|\f?^bUa}hmZa`", (short) (ZN.Xd() ^ 28964)));
            intent.setPackage(C1561oA.Yd("\u0012\u001f\u001e_\u001a#$\u001d#\u001df\u001b) /-($n)07", (short) (C1580rY.Xd() ^ (-7501))));
            intent.putExtra(Xg.qd("fsr4nwxqwq;o}t\u0004\u0002|xC}\u0005\fG\u007f\u0014\u0011\u0010\u007f\u0013N\u0017\u0015\r", (short) (C1580rY.Xd() ^ (-18217)), (short) (C1580rY.Xd() ^ (-31331))), this.zab);
            intent.putExtra(Jg.Wd("T'N\u0007g$|-YJ8s(VM~\u0010\u0003u'P_\u0002p,\u001d3\u0019SGo*`[zuk8\u001eW\u007fUkp", (short) (C1580rY.Xd() ^ (-16133)), (short) (C1580rY.Xd() ^ (-31531))), this);
            intent.putExtra(ZO.xd("kbJ`Bqs*\u0018\u0016??T\u001c\u00103|\u001dv%+GR|\u001dRV\u0017R\u00176\u0019\u00190u\u007f#S", (short) (C1499aX.Xd() ^ (-2491)), (short) (C1499aX.Xd() ^ (-25636))), 3);
            Context context = ImageManager.this.zad;
            Object[] objArr = {intent};
            Method method = Class.forName(C1626yg.Ud("G&\\EQxC\u00171U\u0010oD\u001db`\u0002@=\u0011?w9", (short) (C1580rY.Xd() ^ (-28039)), (short) (C1580rY.Xd() ^ (-20306)))).getMethod(EO.Od("g\ntS\u0010\u0005&(}Qe]\r", (short) (FB.Xd() ^ 16336)), Class.forName(Ig.wd(")\u0007\u000b=i\u0016\u0001\u001b%ABf(75\u0011v\u000elQ\u001f}", (short) (ZN.Xd() ^ 8314))));
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public interface OnImageLoadedListener {
        void onImageLoaded(Uri uri, Drawable drawable, boolean z2);
    }

    private ImageManager(Context context, boolean z2) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("T`Ub^WQ\u001aNYW\\LTY\u0012&QOTDVQ", (short) (C1499aX.Xd() ^ (-16671)))).getMethod(C1593ug.zd("vu\u0006S\u0004\u0005\u0002\u007fzy\u000e\u0004\u000b\u000b`\u000e\u000e\u0015\u0007\u001b\u0018", (short) (C1499aX.Xd() ^ (-15426)), (short) (C1499aX.Xd() ^ (-30157))), new Class[0]);
        try {
            method.setAccessible(true);
            this.zad = (Context) method.invoke(context, objArr);
            Class<?> cls = Class.forName(C1561oA.od("R^S`\\UO\u0018X[\u00152TSSGS", (short) (ZN.Xd() ^ 26080)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd = (short) (OY.Xd() ^ 11865);
            int[] iArr = new int["edtNclrQuvxn|".length()];
            QB qb = new QB("edtNclrQuvxn|");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
            try {
                declaredMethod.setAccessible(true);
                this.zae = new zau((Looper) declaredMethod.invoke(null, objArr2));
                this.zaf = zat.zaa().zab(4, 2);
                this.zag = new zam();
                this.zah = new HashMap();
                this.zai = new HashMap();
                this.zaj = new HashMap();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static ImageManager create(Context context) {
        if (zac == null) {
            zac = new ImageManager(context, false);
        }
        return zac;
    }

    public void loadImage(ImageView imageView, int i2) throws Throwable {
        zaj(new zae(imageView, i2));
    }

    public void loadImage(ImageView imageView, Uri uri) throws Throwable {
        zaj(new zae(imageView, uri));
    }

    public void loadImage(ImageView imageView, Uri uri, int i2) throws Throwable {
        zae zaeVar = new zae(imageView, uri);
        zaeVar.zab = i2;
        zaj(zaeVar);
    }

    public void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri) throws Throwable {
        zaj(new zaf(onImageLoadedListener, uri));
    }

    public void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri, int i2) throws Throwable {
        zaf zafVar = new zaf(onImageLoadedListener, uri);
        zafVar.zab = i2;
        zaj(zafVar);
    }

    public final void zaj(zag zagVar) throws Throwable {
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new zab(this, zagVar).run();
    }
}
