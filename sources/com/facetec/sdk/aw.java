package com.facetec.sdk;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
class aw extends FrameLayout {
    private boolean B;
    private ImageView Code;
    private int[] D;
    private Handler F;
    private RoundedBitmapDrawable[] I;
    private int L;
    private boolean S;
    private ImageView V;

    public aw(Context context) throws Throwable {
        super(context);
        this.I = new RoundedBitmapDrawable[0];
        this.D = new int[0];
        this.L = 0;
        this.S = true;
        I(context);
    }

    public aw(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.I = new RoundedBitmapDrawable[0];
        this.D = new int[0];
        this.L = 0;
        this.S = true;
        I(context);
    }

    public aw(Context context, AttributeSet attributeSet, int i2) throws Throwable {
        super(context, attributeSet, i2);
        this.I = new RoundedBitmapDrawable[0];
        this.D = new int[0];
        this.L = 0;
        this.S = true;
        I(context);
    }

    private void B() {
        if (FaceTecSDK.V.D.enableRetryScreenSlideshowShuffle) {
            int[] iArrAC = ba.aC();
            Random random = new Random();
            for (int i2 = 0; i2 < iArrAC.length; i2++) {
                int iNextInt = random.nextInt(iArrAC.length);
                int i3 = iArrAC[iNextInt];
                iArrAC[iNextInt] = iArrAC[i2];
                iArrAC[i2] = i3;
            }
            this.D = iArrAC;
        } else {
            this.D = ba.aC();
        }
        this.I = new RoundedBitmapDrawable[this.D.length];
        for (int i4 = 0; i4 < this.D.length; i4++) {
            this.I[i4] = RoundedBitmapDrawableFactory.create(getResources(), BitmapFactory.decodeResource(getResources(), this.D[i4]));
        }
        this.V.setImageDrawable(this.I[this.L]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() throws Throwable {
        Handler handler;
        if (!this.S) {
            S();
        }
        int i2 = FaceTecSDK.V.D.retryScreenSlideshowInterval;
        if (this.S) {
            i2 /= 2;
            this.S = false;
        }
        int iMax = Math.max(500, i2);
        if (this.D.length <= 1 || (handler = this.F) == null) {
            return;
        }
        Class<?> cls = Class.forName(yg.hg.Vd("t\u0001u\u0003~wq:z}7Phtipht", (short) (ZN.Xd() ^ 27410), (short) (ZN.Xd() ^ 4853)));
        Class<?>[] clsArr = {Class.forName(C1561oA.ud("WMaK\u0017THTL\u00125WON@@IA", (short) (FB.Xd() ^ 1548))), Long.TYPE};
        Object[] objArr = {new Runnable() { // from class: com.facetec.sdk.aw.5
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                aw.this.F();
            }
        }, Long.valueOf(iMax)};
        short sXd = (short) (C1633zX.Xd() ^ (-20112));
        int[] iArr = new int["\u0002\u007f\u0003\u0003Yy\u007fs\u0003mk".length()];
        QB qb = new QB("\u0002\u007f\u0003\u0003Yy\u007fs\u0003mk");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        int iV = V();
        this.L = iV;
        RoundedBitmapDrawable roundedBitmapDrawable = this.I[iV];
        if (this.B) {
            this.Code.setImageDrawable(roundedBitmapDrawable);
        } else {
            this.V.setImageDrawable(roundedBitmapDrawable);
        }
    }

    private void I(Context context) throws Throwable {
        if (ba.aC().length == 0) {
            return;
        }
        short sXd = (short) (FB.Xd() ^ 26493);
        int[] iArr = new int["}\f\u0003\u0012\u0010\u000b\u0007Q\u0014\u0019Ts\u0018\u0019\u001b\u0011\u001f".length()];
        QB qb = new QB("}\f\u0003\u0012\u0010\u000b\u0007Q\u0014\u0019Ts\u0018\u0019\u001b\u0011\u001f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Xg.qd("32B\u001c1:@\u001fCDF<J", (short) (ZN.Xd() ^ 30598), (short) (ZN.Xd() ^ 27135)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.F = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.V = new ImageView(context);
            this.Code = new ImageView(context);
            this.V.setAlpha(1.0f);
            this.Code.setAlpha(0.0f);
            this.V.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.V.setAdjustViewBounds(true);
            this.Code.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.Code.setAdjustViewBounds(true);
            this.B = true;
            addView(this.V);
            addView(this.Code);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(ce.V((int) (ba.n() * ba.V())));
            gradientDrawable.setStroke((int) ce.V(Math.max(ba.F() == 0 ? 0 : 1, (int) (ba.F() * ba.V()))), ba.f(context));
            gradientDrawable.setColor(0);
            setBackground(gradientDrawable);
            setClipToOutline(true);
            setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            B();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void S() throws Throwable {
        if (this.B) {
            this.Code.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
            this.V.animate().alpha(0.0f).setDuration(800L).setListener(null).start();
        } else {
            this.Code.animate().alpha(0.0f).setDuration(800L).setListener(null).start();
            this.V.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
        }
        this.B = !this.B;
        Handler handler = this.F;
        if (handler != null) {
            Object[] objArr = {new Runnable() { // from class: com.facetec.sdk.aw.4
                @Override // java.lang.Runnable
                public final void run() {
                    aw.this.I();
                }
            }, 800L};
            Method method = Class.forName(Jg.Wd("\baU\u0001z2j\u0011\u0010axPG1DJ`:", (short) (C1580rY.Xd() ^ (-874)), (short) (C1580rY.Xd() ^ (-538)))).getMethod(C1626yg.Ud("g\u0013\u0003\u0007|\rA\u0007\\d\u0002", (short) (C1607wl.Xd() ^ 25528), (short) (C1607wl.Xd() ^ 31380)), Class.forName(ZO.xd("]@>\u000f\u000bj@\u0016{>;B$W8Zxo", (short) (C1633zX.Xd() ^ (-12144)), (short) (C1633zX.Xd() ^ (-29999)))), Long.TYPE);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private int V() {
        int i2 = this.L;
        if (i2 == this.I.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    final void Code() {
        Handler handler = this.F;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.F = null;
        }
    }

    final void Z() throws Throwable {
        if (this.D.length == 0) {
            return;
        }
        this.L = 0;
        this.S = true;
        F();
        I();
    }
}
