package o.dc;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.n;
import o.c.c;
import o.dd.g;
import o.ea.f;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements o.c.b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22791a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f22792b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22793c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22794d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22795e = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, short r9, short r10) {
        /*
            int r7 = r10 * 2
            int r1 = r7 + 1
            byte[] r6 = o.dc.e.$$a
            int r0 = r9 * 2
            int r5 = 3 - r0
            int r0 = r8 * 2
            int r0 = r0 + 113
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r6 != 0) goto L2a
            r1 = r5
            r0 = r7
            r2 = r3
        L16:
            int r0 = -r0
            int r5 = r5 + r0
        L18:
            byte r0 = (byte) r5
            int r1 = r1 + 1
            r4[r2] = r0
            if (r2 != r7) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            int r2 = r2 + 1
            r0 = r6[r1]
            goto L16
        L2a:
            r2 = r3
            r1 = r5
            r5 = r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dc.e.$$c(byte, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22793c = 0;
        f22791a = 1;
        f22794d = 0;
        f22792b = 1;
        d();
        View.resolveSizeAndState(0, 0, 0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        SystemClock.currentThreadTimeMillis();
        int i2 = f22793c + 55;
        f22791a = i2 % 128;
        int i3 = i2 % 2;
    }

    static void d() {
        f22795e = -1270219364;
    }

    private static void f(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        Object charArray;
        char[] cArr;
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $11 + 101;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 72 / 0;
            charArray = str2 != null ? str2.toCharArray() : str2;
        } else {
            if (str2 != null) {
            }
        }
        char[] cArr2 = (char[]) charArray;
        n nVar = new n();
        char[] cArr3 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr2[nVar.f19944a];
            cArr3[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(f22795e)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 1;
                    byte b3 = (byte) (b2 - 1);
                    objA = o.d.d.a(269 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 11 - View.MeasureSpec.makeMeasureSpec(0, 0), -2071844881, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 521, (char) (Process.myPid() >> 22), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, 627984172, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i4 > 0) {
            int i9 = $10 + 9;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            nVar.f19945b = i4;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr4, nVar.f19945b, cArr3, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            int i11 = $10 + 5;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                cArr = new char[i2];
                nVar.f19944a = 1;
            } else {
                cArr = new char[i2];
                nVar.f19944a = 0;
            }
            while (nVar.f19944a < i2) {
                int i12 = $11 + 101;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = nVar.f19944a;
                    int i14 = nVar.f19944a;
                    cArr[i13] = cArr3[0];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(522 - TextUtils.getCapsMode("", 0, 0), (char) Drawable.resolveOpacity(0, 0), 11 - ExpandableListView.getPackedPositionChild(0L), 627984172, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr[nVar.f19944a] = cArr3[(i2 - nVar.f19944a) - 1];
                    Object[] objArr5 = {nVar, nVar};
                    Object objA4 = o.d.d.a(-202660535);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objA4 = o.d.d.a(522 - TextUtils.indexOf("", "", 0, 0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), '<' - AndroidCharacter.getMirror('0'), 627984172, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            cArr3 = cArr;
        }
        objArr[0] = new String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{101, -87, 81, 90};
        $$b = 86;
    }

    @Override // o.c.b
    public final o.c.d a(Context context, c cVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22792b + 39;
        f22794d = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            f(ExpandableListView.getPackedPositionType(0L) + 35, "\u0001\b\u000b\u0002\r\u0012￥\u0002\uffff\ufffeￜ\u0012￼\u0005\ufffe￬\ufffe\u000b\u000f\u0002￼\ufffeￜ\b\u0007\u0007\ufffe￼\r\u0002\b\u0007ￚ\u000e\r", false, 238 - View.MeasureSpec.getMode(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            f(30 - TextUtils.getTrimmedLength(""), "￣\u0005\u0016\u000b\u0018\u0003\u0016\u000b\u0011\u0010￣\u000e\u000e\u0011\u0019\u0007\u0006ￎￂ\u0015\u0016\u0003\u0016\u0017\u0015ￂￜￂ\u000b\u0015", false, 229 - KeyEvent.keyCodeFromString(""), TextUtils.getOffsetAfter("", 0) + 28, objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(cVar).toString());
            int i5 = f22794d + 23;
            f22792b = i5 % 128;
            int i6 = i5 % 2;
        }
        if (cVar == c.f21970c) {
            if (f.a()) {
                Object[] objArr3 = new Object[1];
                f((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 34, "\u0001\b\u000b\u0002\r\u0012￥\u0002\uffff\ufffeￜ\u0012￼\u0005\ufffe￬\ufffe\u000b\u000f\u0002￼\ufffeￜ\b\u0007\u0007\ufffe￼\r\u0002\b\u0007ￚ\u000e\r", false, (KeyEvent.getMaxKeyCode() >> 16) + 238, 6 - KeyEvent.normalizeMetaState(0), objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                f(59 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0015\u0004\u0002\uffc1ￎ\uffc1\u0006\u0017\n\u0015\u0004\u0002\uffc1\u0014\n\uffc1\u0015\u0006\r\r\u0002\u0018\uffc1ￎ\uffc1\u0005\u0006\u0018\u0010\r\r￢\u000f\u0010\n\u0015\u0002\u0017\n\u0015\u0004￢\u0014\n\u0005\u0006\u0018\u0010\r\r\u0002\uffc1\u000f\u0010\n\u0015\u0002\u0017\n", true, 230 - (ViewConfiguration.getPressedStateDuration() >> 16), 43 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr4);
                f.c(strIntern2, ((String) objArr4[0]).intern());
            }
            return o.c.d.f21984a;
        }
        if (f.a()) {
            Object[] objArr5 = new Object[1];
            f(Color.rgb(0, 0, 0) + 16777251, "\u0001\b\u000b\u0002\r\u0012￥\u0002\uffff\ufffeￜ\u0012￼\u0005\ufffe￬\ufffe\u000b\u000f\u0002￼\ufffeￜ\b\u0007\u0007\ufffe￼\r\u0002\b\u0007ￚ\u000e\r", false, 238 - TextUtils.getOffsetBefore("", 0), 6 - View.getDefaultSize(0, 0), objArr5);
            String strIntern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            f(64 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "\uffc1\u0014\n\uffc1\u0015\u0006\r\r\u0002\u0018\uffc1ￎ\uffc1\u0005\u0006\u0018\u0010\r\r￢\u000f\u0010\n\u0015\u0002\u0017\n\u0015\u0004￢\u0014\n\u000f\u0006\u0005\u0005\n\u0003\u0013\u0010\u0007\uffc1\u000f\u0010\n\u0015\u0002\u0017\n\u0015\u0004\u0002\uffc1ￎ\uffc1\u0006\u0017\n\u0015\u0004\u0002\uffc1\u0015\u0010\u000f", true, 230 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) + 32, objArr6);
            f.c(strIntern3, ((String) objArr6[0]).intern());
        }
        o.c.d dVar = o.c.d.f21986c;
        int i7 = f22794d + 123;
        f22792b = i7 % 128;
        int i8 = i7 % 2;
        return dVar;
    }

    @Override // o.c.b
    public final g a(Context context) {
        int i2 = 2 % 2;
        int i3 = f22794d;
        int i4 = i3 + 35;
        f22792b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 95;
        f22792b = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }
}
