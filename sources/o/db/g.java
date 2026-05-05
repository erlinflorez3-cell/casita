package o.db;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.n;
import o.du.h;
import o.en.f;
import o.fm.j;

/* JADX INFO: loaded from: classes6.dex */
public final class g {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22758a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f22759b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22760c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22761d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22762e = 0;

    private static String $$c(int i2, short s2, byte b2) {
        int i3 = (b2 * 2) + 113;
        byte[] bArr = $$a;
        int i4 = 3 - (s2 * 2);
        int i5 = i2 * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i3 = i4 + i3;
            i4 = i4;
        }
        while (true) {
            i7++;
            int i8 = i4 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i3 = bArr[i8] + i3;
            i4 = i8;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22762e = 0;
        f22758a = 1;
        f22759b = 0;
        f22760c = 1;
        e();
        ViewConfiguration.getScrollDefaultDelay();
        TypedValue.complexToFloat(0);
        ViewConfiguration.getScrollBarFadeDuration();
        int i2 = f22758a + 73;
        f22762e = i2 % 128;
        int i3 = i2 % 2;
    }

    public static j c(o.ef.a aVar) throws f {
        int i2 = 2 % 2;
        int i3 = f22759b + 87;
        f22760c = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (o.ea.f.a()) {
                int i5 = f22759b + 117;
                f22760c = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = new Object[1];
                f(View.combineMeasuredStates(0, 0) + 15, "\u0010\ufff1\u0003\u0001\u0013\u0010\u0007\u0012\u0017ﾾ\ufff0\u0003\uffff\u0002\u0003", false, Color.blue(0) + 242, 1 - Drawable.resolveOpacity(0, 0), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f(37 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\uffef\ufff3￪\uffc0\r\u000f\u0012\u0006\uffc0\u0019\u0014\t\u0012\u0015\u0003\u0005\u0013\uffc0\u0007\u000e\t\u0014\u0001\t\u0014\u000e\u0001\u0014\u0013\u000e\t\u0005\f\t\u0006\uffc0￮", true, 240 - TextUtils.getOffsetBefore("", 0), 31 - TextUtils.getTrimmedLength(""), objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            }
            Object[] objArr3 = new Object[1];
            f((ViewConfiguration.getScrollBarSize() >> 8) + 17, "\u0007\u0004\u0007\ufffb\ufff9\f�￥�\u000b\u000b\ufff9\uffff�\u000b\uffff�", false, 248 - TextUtils.indexOf("", "", 0, 0), 14 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr3);
            Object[] objArr4 = {aVar, ((String) objArr3[0]).intern(), Boolean.FALSE};
            int iNextInt = new Random().nextInt();
            int i7 = o.ef.a.f23781o * (-1229447468);
            o.ef.a.f23781o = i7;
            int iMyUid = Process.myUid();
            int i8 = o.ef.a.f23784r * 1570495625;
            o.ef.a.f23784r = i8;
            boolean zBooleanValue = ((Boolean) o.ef.a.a(821341192, objArr4, iMyUid, i8, -821341184, iNextInt, i7)).booleanValue();
            Object[] objArr5 = new Object[1];
            f(((Process.getThreadPriority(0) + 20) >> 6) + 21, "\u0006\u0003\u0006\ufffa\ufff8\u000b￼\uffe7\ufff8\u0010\u0004￼\u0005\u000b\n\f\n￼\t\uffde￼", false, TextUtils.indexOf("", "", 0, 0) + 249, TextUtils.indexOf("", "", 0, 0) + 15, objArr5);
            Object[] objArr6 = {aVar, ((String) objArr5[0]).intern(), Boolean.FALSE};
            int iNextInt2 = new Random().nextInt();
            int i9 = o.ef.a.f23781o * (-1229447468);
            o.ef.a.f23781o = i9;
            int iMyUid2 = Process.myUid();
            int i10 = o.ef.a.f23784r * 1570495625;
            o.ef.a.f23784r = i10;
            boolean zBooleanValue2 = ((Boolean) o.ef.a.a(821341192, objArr6, iMyUid2, i10, -821341184, iNextInt2, i9)).booleanValue();
            Object[] objArr7 = new Object[1];
            f((KeyEvent.getMaxKeyCode() >> 16) + 18, "\b\b\ufff9\u0007\u0002\u0003�\b\ufff7\ufff9\b\u0003\u0006￤\u0007\ufffb\u0002�", true, TextUtils.indexOf((CharSequence) "", '0', 0) + 253, TextUtils.lastIndexOf("", '0', 0) + 5, objArr7);
            Object[] objArr8 = {aVar, ((String) objArr7[0]).intern(), Boolean.FALSE};
            int iNextInt3 = new Random().nextInt();
            int i11 = o.ef.a.f23781o * (-1229447468);
            o.ef.a.f23781o = i11;
            int iMyUid3 = Process.myUid();
            int i12 = o.ef.a.f23784r * 1570495625;
            o.ef.a.f23784r = i12;
            boolean zBooleanValue3 = ((Boolean) o.ef.a.a(821341192, objArr8, iMyUid3, i12, -821341184, iNextInt3, i11)).booleanValue();
            Object[] objArr9 = new Object[1];
            f((ViewConfiguration.getKeyRepeatDelay() >> 16) + 27, "\u000f\b\ufffb\uffe7\u0011\t\u0006\u0006\ufffb\u0013\f\u000e\b\uffdf\ufffe\f\ufffb\uffdd\u0006\ufffb\u000e\u0003\u0001\u0003\uffde\u0006\ufffb", true, TextUtils.getTrimmedLength("") + 246, ExpandableListView.getPackedPositionGroup(0L) + 9, objArr9);
            Object[] objArr10 = {aVar, ((String) objArr9[0]).intern(), Boolean.FALSE};
            int iNextInt4 = new Random().nextInt();
            int i13 = o.ef.a.f23781o * (-1229447468);
            o.ef.a.f23781o = i13;
            int iMyUid4 = Process.myUid();
            int i14 = o.ef.a.f23784r * 1570495625;
            o.ef.a.f23784r = i14;
            boolean zBooleanValue4 = ((Boolean) o.ef.a.a(821341192, objArr10, iMyUid4, i14, -821341184, iNextInt4, i13)).booleanValue();
            Object[] objArr11 = new Object[1];
            f(ExpandableListView.getPackedPositionGroup(0L) + 16, "\n\uffd9\u0005\u0004\ufffa\uffff\n\uffff\u0005\u0004\u0006\ufff7\u000f\u0003\ufffb\u0004", false, Drawable.resolveOpacity(0, 0) + 250, 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr11);
            Object[] objArr12 = {aVar, ((String) objArr11[0]).intern()};
            int i15 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i15;
            h hVarA = h.a((String) o.ef.a.a(-781664457, objArr12, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i15, Thread.currentThread().getPriority()));
            Object[] objArr13 = new Object[1];
            f(37 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u000e\u000b\ufffa\r\u0002\b\u0007\f￼\ufffa￨\uffff\uffff\u0005\u0002\u0007\ufffeￚ\u000e\r\u0001\ufffe\u0007\r\u0002￼\ufffa\r\u0002\b\u0007￫\ufffe\u000e\f\ufffe\uffdd", false, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 247, 7 - (Process.myPid() >> 22), objArr13);
            Object[] objArr14 = {aVar, ((String) objArr13[0]).intern(), -1};
            int priority = Thread.currentThread().getPriority();
            int i16 = o.ef.a.f23777k * (-845283131);
            o.ef.a.f23777k = i16;
            return new j(zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, hVarA, ((Integer) o.ef.a.a(1647814368, objArr14, (int) SystemClock.uptimeMillis(), (int) Thread.currentThread().getId(), -1647814363, priority, i16)).intValue());
        } catch (o.ef.b e2) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr15 = new Object[1];
            f(54 - TextUtils.indexOf((CharSequence) "", '0', 0), "\u0003\u0005\u0013\uffc0\u0007\u000e\t\u0013\u0013\u0005\u0003\u000f\u0012\u0010\uffc0\u0005\f\t\b\u0017\uffc0\u0004\u0005\u0012\u0005\u0014\u000e\u0015\u000f\u0003\u000e\u0005\uffc0\u000e\u000f\t\u0014\u0010\u0005\u0003\u0018￥\uffc0\u000e\u000f\u0013￪\uffc0ￚ\uffc0\u0019\u0014\t\u0012\u0015", true, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 240, 47 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr15);
            throw new f(sb.append(((String) objArr15[0]).intern()).append(e2.getMessage()).toString());
        }
    }

    static void e() {
        f22761d = -1270219381;
    }

    private static void f(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $10 + 15;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            int i7 = $10 + 11;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i9 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(f22761d)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(View.MeasureSpec.getMode(0) + 270, (char) ('0' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, -2071844881, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(522 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((-1) - MotionEvent.axisFromString("")), (Process.myPid() >> 22) + 12, 627984172, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
            int i10 = $10 + 91;
            $11 = i10 % 128;
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
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a((Process.myPid() >> 22) + 522, (char) ((Process.getThreadPriority(0) + 20) >> 6), ExpandableListView.getPackedPositionChild(0L) + 13, 627984172, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void init$0() {
        $$a = new byte[]{83, -90, 91, 36};
        $$b = 49;
    }
}
