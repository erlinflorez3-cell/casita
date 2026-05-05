package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.R;
import cz.msebera.android.httpclient.HttpStatus;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
class TooltipPopup {
    private static final String TAG = "TooltipPopup";
    private final View mContentView;
    private final Context mContext;
    private final WindowManager.LayoutParams mLayoutParams;
    private final TextView mMessageView;
    private final int[] mTmpAnchorPos;
    private final int[] mTmpAppPos;
    private final Rect mTmpDisplayFrame;

    TooltipPopup(Context context) throws Throwable {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.mLayoutParams = layoutParams;
        this.mTmpDisplayFrame = new Rect();
        this.mTmpAnchorPos = new int[2];
        this.mTmpAppPos = new int[2];
        this.mContext = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.mContentView = viewInflate;
        this.mMessageView = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(getClass().getSimpleName());
        short sXd = (short) (C1607wl.Xd() ^ 27435);
        short sXd2 = (short) (C1607wl.Xd() ^ 5181);
        int[] iArr = new int["=KBQOJF\u0011GTT[MW^\u0019/\\\\cUif".length()];
        QB qb = new QB("=KBQOJF\u0011GTT[MW^\u0019/\\\\cUif");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd3 = (short) (Od.Xd() ^ (-16060));
        int[] iArr2 = new int["nkyTdelafcK]h_".length()];
        QB qb2 = new QB("nkyTdelafcK]h_");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            layoutParams.packageName = (String) method.invoke(context, objArr);
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    void show(View view, int i2, int i3, boolean z2, CharSequence charSequence) throws Throwable {
        if (isShowing()) {
            hide();
        }
        this.mMessageView.setText(charSequence);
        computePosition(view, i2, i3, z2, this.mLayoutParams);
        Context context = this.mContext;
        Object[] objArr = {C1561oA.od("eVZOY`", (short) (ZN.Xd() ^ 22856))};
        Method method = Class.forName(C1561oA.Kd("]kbqojf1gtt{mw~9O||\u0004u\n\u0007", (short) (C1499aX.Xd() ^ (-28672)))).getMethod(C1561oA.Xd("_^nNuprdmTguznil", (short) (OY.Xd() ^ 3207)), Class.forName(Wg.Zd("N%AW+\u0005\u0001597g05GSw", (short) (C1633zX.Xd() ^ (-7453)), (short) (C1633zX.Xd() ^ (-12235)))));
        try {
            method.setAccessible(true);
            ((WindowManager) method.invoke(context, objArr)).addView(this.mContentView, this.mLayoutParams);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    void hide() throws Throwable {
        if (isShowing()) {
            Context context = this.mContext;
            String strWd = Ig.wd("8u\u000b&o;", (short) (ZN.Xd() ^ 1211));
            Class<?> cls = Class.forName(EO.Od("|/Y\t\u0011X!dE~}$DIU.x)Qa\u000eJ\u0017", (short) (C1499aX.Xd() ^ (-10503))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (FB.Xd() ^ 15840);
            int[] iArr = new int["|r\u0007p<ymyq7[{xnrj".length()];
            QB qb = new QB("|r\u0007p<ymyq7[{xnrj");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {strWd};
            Method method = cls.getMethod(C1593ug.zd("a`pPwrtfoViw|pkn", (short) (Od.Xd() ^ (-32606)), (short) (Od.Xd() ^ (-6492))), clsArr);
            try {
                method.setAccessible(true);
                ((WindowManager) method.invoke(context, objArr)).removeView(this.mContentView);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    boolean isShowing() {
        return this.mContentView.getParent() != null;
    }

    private void computePosition(View view, int i2, int i3, boolean z2, WindowManager.LayoutParams layoutParams) throws Throwable {
        int height;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        Context context = this.mContext;
        short sXd = (short) (Od.Xd() ^ (-13620));
        int[] iArr = new int["\u0011\u001f\u0016%#\u001e\u001ad\u001b((/!+2l\u0003007)=:".length()];
        QB qb = new QB("\u0011\u001f\u0016%#\u001e\u001ad\u001b((/!+2l\u0003007)=:");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i5));
            i5++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i5)).getMethod(Wg.Zd("V3\u0001\u001dn;u:u\u0005E\u0012", (short) (C1580rY.Xd() ^ (-5136)), (short) (C1580rY.Xd() ^ (-17665))), new Class[0]);
        try {
            method.setAccessible(true);
            int dimensionPixelOffset = ((Resources) method.invoke(context, objArr)).getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i2 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                Context context2 = this.mContext;
                short sXd2 = (short) (FB.Xd() ^ 14217);
                int[] iArr2 = new int["N\\Sb`[W\"Xeel^ho*@mmtfzw".length()];
                QB qb2 = new QB("N\\Sb`[W\"Xeel^ho*@mmtfzw");
                int i6 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i6] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i6));
                    i6++;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(new String(iArr2, 0, i6)).getMethod(Wg.vd("}|\tg\u007f\u000f\b\u000f\u0001rq\u0001", (short) (C1607wl.Xd() ^ HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    int dimensionPixelOffset2 = ((Resources) method2.invoke(context2, objArr2)).getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                    height = i3 + dimensionPixelOffset2;
                    i4 = i3 - dimensionPixelOffset2;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else {
                height = view.getHeight();
                i4 = 0;
            }
            layoutParams.gravity = 49;
            Context context3 = this.mContext;
            Object[] objArr3 = new Object[0];
            Method method3 = Class.forName(Qg.kd("KWLYUNH\u0011EPNSCKP\t\u001dHFK;MH", (short) (ZN.Xd() ^ 20116), (short) (ZN.Xd() ^ 1743))).getMethod(hg.Vd("=:H%7D?D@01>", (short) (C1580rY.Xd() ^ (-4184)), (short) (C1580rY.Xd() ^ (-6564))), new Class[0]);
            try {
                method3.setAccessible(true);
                int dimensionPixelOffset3 = ((Resources) method3.invoke(context3, objArr3)).getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
                View appRootView = getAppRootView(view);
                if (appRootView == null) {
                    short sXd3 = (short) (C1633zX.Xd() ^ (-3617));
                    int[] iArr3 = new int["j\u0005\u0004\u007f\u0007z\u0001_}}\u0002{".length()];
                    QB qb3 = new QB("j\u0005\u0004\u007f\u0007z\u0001_}}\u0002{");
                    int i7 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i7] = xuXd3.fK(sXd3 + i7 + xuXd3.CK(iKK3));
                        i7++;
                    }
                    new String(iArr3, 0, i7);
                    short sXd4 = (short) (Od.Xd() ^ (-13512));
                    int[] iArr4 = new int["p\u000e\u001e\u001d\u0019\u001dK\u0011\u000f\u0013\fF\u0003\u0011\u0014B4&%6".length()];
                    QB qb4 = new QB("p\u000e\u001e\u001d\u0019\u001dK\u0011\u000f\u0013\fF\u0003\u0011\u0014B4&%6");
                    int i8 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i8] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd4 ^ i8));
                        i8++;
                    }
                    new String(iArr4, 0, i8);
                    return;
                }
                appRootView.getWindowVisibleDisplayFrame(this.mTmpDisplayFrame);
                if (this.mTmpDisplayFrame.left < 0 && this.mTmpDisplayFrame.top < 0) {
                    Context context4 = this.mContext;
                    short sXd5 = (short) (Od.Xd() ^ (-12947));
                    int[] iArr5 = new int["%3*972.x/<<C5?F\u0001\u0017DDK=QN".length()];
                    QB qb5 = new QB("%3*972.x/<<C5?F\u0001\u0017DDK=QN");
                    int i9 = 0;
                    while (qb5.YK()) {
                        int iKK5 = qb5.KK();
                        Xu xuXd5 = Xu.Xd(iKK5);
                        iArr5[i9] = xuXd5.fK(xuXd5.CK(iKK5) - (((sXd5 + sXd5) + sXd5) + i9));
                        i9++;
                    }
                    Object[] objArr4 = new Object[0];
                    Method method4 = Class.forName(new String(iArr5, 0, i9)).getMethod(Xg.qd("\u001e\u001d-\f /,31#&5", (short) (C1580rY.Xd() ^ (-3124)), (short) (C1580rY.Xd() ^ (-21561))), new Class[0]);
                    try {
                        method4.setAccessible(true);
                        Resources resources = (Resources) method4.invoke(context4, objArr4);
                        String strWd = Jg.Wd("L\u007f\f\u00101", (short) (Od.Xd() ^ (-29344)), (short) (Od.Xd() ^ (-21977)));
                        short sXd6 = (short) (C1580rY.Xd() ^ (-10128));
                        short sXd7 = (short) (C1580rY.Xd() ^ (-9750));
                        int[] iArr6 = new int["Z\u0006S;\u0002DC".length()];
                        QB qb6 = new QB("Z\u0006S;\u0002DC");
                        int i10 = 0;
                        while (qb6.YK()) {
                            int iKK6 = qb6.KK();
                            Xu xuXd6 = Xu.Xd(iKK6);
                            iArr6[i10] = xuXd6.fK(xuXd6.CK(iKK6) - (C1561oA.Xd[i10 % C1561oA.Xd.length] ^ ((i10 * sXd7) + sXd6)));
                            i10++;
                        }
                        String str = new String(iArr6, 0, i10);
                        short sXd8 = (short) (C1580rY.Xd() ^ (-20197));
                        short sXd9 = (short) (C1580rY.Xd() ^ (-27717));
                        int[] iArr7 = new int["\u0011zB(34\b{\u001a?;<9\u000f;,Z".length()];
                        QB qb7 = new QB("\u0011zB(34\b{\u001a?;<9\u000f;,Z");
                        int i11 = 0;
                        while (qb7.YK()) {
                            int iKK7 = qb7.KK();
                            Xu xuXd7 = Xu.Xd(iKK7);
                            iArr7[i11] = xuXd7.fK((C1561oA.Xd[i11 % C1561oA.Xd.length] ^ ((sXd8 + sXd8) + (i11 * sXd9))) + xuXd7.CK(iKK7));
                            i11++;
                        }
                        int identifier = resources.getIdentifier(new String(iArr7, 0, i11), strWd, str);
                        int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                        this.mTmpDisplayFrame.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                appRootView.getLocationOnScreen(this.mTmpAppPos);
                view.getLocationOnScreen(this.mTmpAnchorPos);
                int[] iArr8 = this.mTmpAnchorPos;
                int i12 = iArr8[0];
                int[] iArr9 = this.mTmpAppPos;
                int i13 = i12 - iArr9[0];
                iArr8[0] = i13;
                iArr8[1] = iArr8[1] - iArr9[1];
                layoutParams.x = (i13 + i2) - (appRootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.mContentView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = this.mContentView.getMeasuredHeight();
                int i14 = this.mTmpAnchorPos[1];
                int i15 = ((i4 + i14) - dimensionPixelOffset3) - measuredHeight;
                int i16 = i14 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i15 >= 0) {
                        layoutParams.y = i15;
                        return;
                    } else {
                        layoutParams.y = i16;
                        return;
                    }
                }
                if (measuredHeight + i16 <= this.mTmpDisplayFrame.height()) {
                    layoutParams.y = i16;
                } else {
                    layoutParams.y = i15;
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    private static View getAppRootView(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }
}
