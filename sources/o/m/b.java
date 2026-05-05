package o.m;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodStatus;
import java.lang.reflect.Method;
import org.msgpack.core.MessagePack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements o.ea.d<CustomerAuthenticationMethodStatus> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f26400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ b[] f26401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f26402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f26403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f26404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f26405f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f26406g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f26407h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f26408i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f26409j = 0;

    /* JADX INFO: renamed from: o.m.b$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f26410a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f26411c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f26412e;

        static {
            int[] iArr = new int[b.values().length];
            f26412e = iArr;
            try {
                iArr[b.f26403d.ordinal()] = 1;
                int i2 = f26411c + 111;
                f26410a = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26412e[b.f26404e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26412e[b.f26402c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26412e[b.f26400a.ordinal()] = 4;
                int i5 = f26410a;
                int i6 = ((i5 + 57) - (57 | i5)) + (i5 | 57);
                f26411c = i6 % 128;
                int i7 = i6 % 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, byte r10, byte r11) {
        /*
            int r0 = r11 * 4
            int r8 = 4 - r0
            int r0 = r10 * 3
            int r7 = r0 + 1
            byte[] r6 = o.m.b.$$a
            int r0 = r9 * 2
            int r0 = r0 + 113
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r6 != 0) goto L2a
            r1 = r8
            r3 = r4
        L15:
            int r0 = -r0
            int r8 = r8 + r0
            int r1 = r1 + 1
            r2 = r3
        L1a:
            int r3 = r2 + 1
            byte r0 = (byte) r8
            r5[r2] = r0
            if (r3 != r7) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            r0 = r6[r1]
            goto L15
        L2a:
            r2 = r4
            r1 = r8
            r8 = r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.b.$$c(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26409j = 0;
        f26407h = 1;
        f26408i = 0;
        f26405f = 1;
        c();
        Object[] objArr = new Object[1];
        k(12 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0007\f￪\u000b\u0006￥\ufffb￼\u000b\t\u0006\u0007", true, Drawable.resolveOpacity(0, 0) + 202, TextUtils.getOffsetAfter("", 0) + 6, objArr);
        f26403d = new b(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        k((ViewConfiguration.getScrollBarSize() >> 8) + 13, "\uffdd\u000e\t￨\ufffe\uffff\f\u000f\u0001\u0003\u0000\b\t", true, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 199, Color.rgb(0, 0, 0) + 16777220, objArr2);
        f26404e = new b(((String) objArr2[0]).intern(), 1);
        Object[] objArr3 = new Object[1];
        k((ViewConfiguration.getFadingEdgeLength() >> 16) + 10, "\u0007\bￜ�\ufffe\u000b\u000e\u0000\u0002\uffff", true, Color.alpha(0) + 200, KeyEvent.getDeadChar(0, 0) + 3, objArr3);
        f26402c = new b(((String) objArr3[0]).intern(), 2);
        Object[] objArr4 = new Object[1];
        k(9 - KeyEvent.normalizeMetaState(0), "\u0000\u000f￼\u0011\u0004\u000f\ufffeￜ\uffff", true, Color.red(0) + 198, 8 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr4);
        f26400a = new b(((String) objArr4[0]).intern(), 3);
        f26401b = b();
        int i2 = f26409j + 49;
        f26407h = i2 % 128;
        int i3 = i2 % 2;
    }

    private b(String str, int i2) {
    }

    private static /* synthetic */ b[] b() {
        int i2 = 2 % 2;
        int i3 = f26408i + 13;
        f26405f = i3 % 128;
        if (i3 % 2 != 0) {
            return new b[]{f26403d, f26404e, f26402c, f26400a};
        }
        b[] bVarArr = new b[5];
        bVarArr[1] = f26403d;
        bVarArr[1] = f26404e;
        bVarArr[5] = f26402c;
        bVarArr[4] = f26400a;
        return bVarArr;
    }

    static void c() {
        f26406g = -1270219398;
    }

    static void init$0() {
        $$a = new byte[]{106, -29, 108, MessagePack.Code.MAP32};
        $$b = 231;
    }

    private static void k(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i5 = 2 % 2;
        if (str2 != null) {
            int i6 = $10 + 45;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        o.a.n nVar = new o.a.n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            int i8 = $11 + 9;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i10 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(f26406g)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    int iIndexOf = 269 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                    int i11 = 12 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte b2 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 1)));
                    byte b3 = (byte) (b2 - 1);
                    objA = o.d.d.a(iIndexOf, cLastIndexOf, i11, -2071844881, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(522 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) KeyEvent.getDeadChar(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, 627984172, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
            int i12 = $10 + 83;
            $11 = i12 % 128;
            int i13 = i12 % 2;
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
                    objA3 = o.d.d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 521, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 627984172, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public static b valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f26408i + 59;
        f26405f = i3 % 128;
        int i4 = i3 % 2;
        b bVar = (b) Enum.valueOf(b.class, str);
        int i5 = f26408i + 79;
        f26405f = i5 % 128;
        int i6 = i5 % 2;
        return bVar;
    }

    public static b[] values() {
        int i2 = 2 % 2;
        int i3 = f26405f + 29;
        f26408i = i3 % 128;
        int i4 = i3 % 2;
        b[] bVarArr = f26401b;
        if (i4 == 0) {
            return (b[]) bVarArr.clone();
        }
        b[] bVarArr2 = (b[]) bVarArr.clone();
        int i5 = 19 / 0;
        return bVarArr2;
    }

    public final CustomerAuthenticationMethodStatus a() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26408i + 9;
        f26405f = i3 % 128;
        int i4 = i3 % 2;
        int i5 = AnonymousClass5.f26412e[ordinal()];
        if (i5 == 1) {
            return CustomerAuthenticationMethodStatus.NotSupported;
        }
        if (i5 == 2) {
            return CustomerAuthenticationMethodStatus.NotConfigured;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                return CustomerAuthenticationMethodStatus.Activated;
            }
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            k(18 - TextUtils.getCapsMode("", 0, 0), "\u0013\b\u0006\u0017\b\u0007ￃ\ufff9\u0004\u000f\u0018\b\uffddￃ\ufff8\u0011\b\u001b", false, (ViewConfiguration.getWindowTouchSlop() >> 8) + 190, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15, objArr);
            throw new UnsupportedOperationException(sb.append(((String) objArr[0]).intern()).append(name()).toString());
        }
        CustomerAuthenticationMethodStatus customerAuthenticationMethodStatus = CustomerAuthenticationMethodStatus.Configured;
        int i6 = f26408i + 125;
        f26405f = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 87 / 0;
        }
        return customerAuthenticationMethodStatus;
    }

    @Override // o.ea.a
    public final /* synthetic */ Object e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26408i + 25;
        f26405f = i3 % 128;
        int i4 = i3 % 2;
        CustomerAuthenticationMethodStatus customerAuthenticationMethodStatusA = a();
        int i5 = f26405f + 97;
        f26408i = i5 % 128;
        if (i5 % 2 == 0) {
            return customerAuthenticationMethodStatusA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
