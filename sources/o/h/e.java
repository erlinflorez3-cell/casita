package o.h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.IBinder;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.n;
import o.ea.f;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e extends BroadcastReceiver {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static final String TAG;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f26257a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26258b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f26259c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f26260d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f26261e = 0;
    private static long lastUserPresentEvent = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r6, short r7, short r8) {
        /*
            int r0 = r6 * 3
            int r0 = r0 + 4
            int r1 = r8 * 2
            int r8 = 115 - r1
            int r1 = r7 * 2
            int r7 = r1 + 1
            byte[] r6 = o.h.e.$$a
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r6 != 0) goto L2d
            r3 = r4
            r2 = r0
        L15:
            int r1 = -r0
            int r0 = r2 + 1
            int r1 = r1 + r8
            r2 = r3
            r8 = r1
        L1b:
            byte r1 = (byte) r8
            int r3 = r2 + 1
            r5[r2] = r1
            if (r3 != r7) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L28:
            r1 = r6[r0]
            r2 = r0
            r0 = r1
            goto L15
        L2d:
            r2 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.h.e.$$c(int, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26259c = 0;
        f26257a = 1;
        f26261e = 0;
        f26260d = 1;
        b();
        Object[] objArr = new Object[1];
        f(TextUtils.indexOf((CharSequence) "", '0', 0) + 32, "\ufffb\u000e￭�\f\uffff\uffff\b\uffef\b\u0006\t�\u0005￬\uffff�\uffff\u0003\u0010\uffff\f￣\b\b\uffff\f\uffdd\t\u0007\n", false, 343 - AndroidCharacter.getMirror('0'), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, objArr);
        TAG = ((String) objArr[0]).intern();
        lastUserPresentEvent = 0L;
        int i2 = f26259c + 123;
        f26257a = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void b() {
        f26258b = -1270219302;
    }

    private static void f(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $10 + 5;
        $11 = i6 % 128;
        Object charArray = str2;
        if (i6 % 2 == 0) {
            throw null;
        }
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i7 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(f26258b)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(Color.rgb(0, 0, 0) + 16777486, (char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 11, -2071844881, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(522 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 12 - KeyEvent.getDeadChar(0, 0), 627984172, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i8 = $11 + 29;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i4 > 0) {
            int i10 = $11 + 31;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i12 = $10 + 23;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    cArr4[nVar.f19944a] = cArr2[(nVar.f19944a * i2) / 0];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(ExpandableListView.getPackedPositionType(0L) + 522, (char) (ViewConfiguration.getEdgeSlop() >> 16), 11 - TextUtils.lastIndexOf("", '0', 0, 0), 627984172, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr5 = {nVar, nVar};
                    Object objA4 = o.d.d.a(-202660535);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objA4 = o.d.d.a(521 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) TextUtils.indexOf("", ""), 12 - Gravity.getAbsoluteGravity(0, 0), 627984172, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public static long getLastUserPresentEvent() {
        int i2 = 2 % 2;
        int i3 = f26261e + 63;
        int i4 = i3 % 128;
        f26260d = i4;
        int i5 = i3 % 2;
        long j2 = lastUserPresentEvent;
        int i6 = i4 + 67;
        f26261e = i6 % 128;
        if (i6 % 2 == 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{119, -27, 45, 98};
        $$b = 60;
    }

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f26260d + 107;
        f26261e = i3 % 128;
        int i4 = i3 % 2;
        boolean zEquals = super.equals(obj);
        int i5 = f26260d + 73;
        f26261e = i5 % 128;
        int i6 = i5 % 2;
        return zEquals;
    }

    protected final void finalize() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26260d + 89;
        f26261e = i3 % 128;
        int i4 = i3 % 2;
        super.finalize();
        int i5 = f26261e + 103;
        f26260d = i5 % 128;
        int i6 = i5 % 2;
    }

    public int hashCode() {
        int i2 = 2 % 2;
        int i3 = f26260d + 69;
        f26261e = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = super.hashCode();
        int i5 = f26260d + 97;
        f26261e = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26260d + 91;
        f26261e = i3 % 128;
        if (i3 % 2 != 0) {
            intent.getAction();
            throw null;
        }
        if (intent.getAction() != null) {
            String action = intent.getAction();
            Object[] objArr = new Object[1];
            f((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34, "\r\bￒ\r\u0012\u0018\t\u0012\u0018ￒ\u0005\u0007\u0018\r\u0013\u0012ￒ\ufff9\ufff7￩\ufff6\u0003\ufff4\ufff6￩\ufff7￩\ufff2\ufff8\u0005\u0012\b\u0016\u0013", false, ((Process.getThreadPriority(0) + 20) >> 6) + 285, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29, objArr);
            if (action.equals(((String) objArr[0]).intern())) {
                int i4 = f26260d + 17;
                f26261e = i4 % 128;
                int i5 = i4 % 2;
                if (f.a()) {
                    Object[] objArr2 = new Object[1];
                    f((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31, "\ufffb\u000e￭�\f\uffff\uffff\b\uffef\b\u0006\t�\u0005￬\uffff�\uffff\u0003\u0010\uffff\f￣\b\b\uffff\f\uffdd\t\u0007\n", false, 296 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22, objArr2);
                    String strIntern = ((String) objArr2[0]).intern();
                    Object[] objArr3 = new Object[1];
                    f(25 - TextUtils.getCapsMode("", 0, 0), "\u000f\u0002\ufff5\u0003\u0005\u000f\ufffe\uffff\ufff9\u0004\ufff3\ufff1\uffd0\u0018\u0013$\u0011\ufff3\u0004\ufffe\ufff5\u0003\ufff5\u0002\u0000", true, 273 - View.combineMeasuredStates(0, 0), 19 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr3);
                    f.c(strIntern, ((String) objArr3[0]).intern());
                }
                lastUserPresentEvent = System.currentTimeMillis();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final IBinder peekService(Context context, Intent intent) {
        int i2 = 2 % 2;
        int i3 = f26260d + 41;
        f26261e = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            super.peekService(context, intent);
            obj.hashCode();
            throw null;
        }
        IBinder iBinderPeekService = super.peekService(context, intent);
        int i4 = f26261e + 51;
        f26260d = i4 % 128;
        if (i4 % 2 != 0) {
            return iBinderPeekService;
        }
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f26260d + 29;
        f26261e = i3 % 128;
        int i4 = i3 % 2;
        String string = super.toString();
        int i5 = f26261e + 25;
        f26260d = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }
}
