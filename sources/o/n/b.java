package o.n;

import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.dynatrace.android.callback.Callback;
import fr.antelop.sdk.R;
import java.lang.reflect.Method;
import o.a.g;
import o.n.a;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends Fragment {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f26618d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f26619e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f26620f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f26621g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char f26622h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f26623i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char f26624j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f26625k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.b f26626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f26627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f26628c;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r9, byte r10, short r11) {
        /*
            byte[] r8 = o.n.b.$$c
            int r0 = r9 * 2
            int r1 = 3 - r0
            int r0 = r10 * 3
            int r7 = 72 - r0
            int r0 = r11 * 4
            int r6 = 1 - r0
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r8 != 0) goto L2b
            r3 = r4
            r0 = r1
        L15:
            int r1 = r1 + r7
            r2 = r3
            r7 = r1
            r1 = r0
        L19:
            int r0 = r1 + 1
            byte r1 = (byte) r7
            int r3 = r2 + 1
            r5[r2] = r1
            if (r3 != r6) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L28:
            r1 = r8[r0]
            goto L15
        L2b:
            r2 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.n.b.$$g(short, byte, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f26625k = 457330507;
        f26621g = -1559081466;
        init$0();
        f26623i = 0;
        f26620f = 1;
        f26618d = (char) 37340;
        f26619e = (char) 43900;
        f26624j = (char) 43988;
        f26622h = (char) 2985;
    }

    public b(d dVar, a.b bVar) {
        this.f26627b = dVar;
        this.f26626a = bVar;
    }

    private /* synthetic */ void c(View view) throws Exception {
        int i2 = 2 % 2;
        int i3 = f26623i + 39;
        f26620f = i3 % 128;
        int i4 = i3 % 2;
        this.f26627b.r();
        int i5 = f26620f + 99;
        f26623i = i5 % 128;
        int i6 = i5 % 2;
    }

    static void init$0() {
        $$a = new byte[]{83, -90, 91, 36};
        $$b = 129;
    }

    static void init$1() {
        $$d = new byte[]{78, MessagePack.Code.UINT64, MessagePack.Code.NIL, -88, 60, MessagePack.Code.BIN8, -15, 60, MessagePack.Code.BIN8, 60, -19};
        $$e = 114;
    }

    static void init$2() {
        $$c = new byte[]{95, MessagePack.Code.FALSE, -107, -90};
        $$f = 173;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$onCreateView$-Landroid-view-LayoutInflater-Landroid-view-ViewGroup-Landroid-os-Bundle--Landroid-view-View-, reason: not valid java name */
    public static /* synthetic */ void m10650xd0e31f79(b bVar, View view) {
        Callback.onClick_enter(view);
        try {
            bVar.c(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$onCreateView$-Landroid-view-LayoutInflater-Landroid-view-ViewGroup-Landroid-os-Bundle--Landroid-view-View-, reason: not valid java name */
    public static /* synthetic */ void m10651x961510d8(b bVar, View view) {
        Callback.onClick_enter(view);
        try {
            bVar.c(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(int r9, int r10, int r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = o.n.b.$$a
            int r0 = r9 * 4
            int r0 = 4 - r0
            int r1 = r10 * 3
            int r7 = r1 + 1
            int r1 = r11 * 3
            int r1 = 100 - r1
            byte[] r6 = new byte[r7]
            r5 = 0
            if (r8 != 0) goto L2f
            r4 = r0
            r2 = r7
            r3 = r5
        L16:
            int r1 = -r0
            int r1 = r1 + r2
            int r0 = r4 + 1
        L1a:
            byte r2 = (byte) r1
            r6[r3] = r2
            int r3 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            r12[r5] = r0
            return
        L29:
            r2 = r8[r0]
            r4 = r0
            r0 = r2
            r2 = r1
            goto L16
        L2f:
            r3 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.n.b.l(int, int, int, java.lang.Object[]):void");
    }

    private static void m(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        Object obj = null;
        if (str2 != null) {
            int i4 = $11 + 91;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                str2.toCharArray();
                obj.hashCode();
                throw null;
            }
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[i5] = cArr[gVar.f19924d];
            char c2 = 1;
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i6 = $11 + 45;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i5;
            while (i9 < 16) {
                int i10 = $10 + 47;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                char c3 = cArr3[c2];
                char c4 = cArr3[i5];
                int i12 = (c4 + i8) ^ ((c4 << 4) + ((char) (((long) f26624j) ^ (-7511683281764982996L))));
                int i13 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f26622h);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[c2] = Integer.valueOf(i12);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 270;
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11;
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        String str$$g = $$g(b2, b3, (byte) (b3 - 1));
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = o.d.d.a(minimumFlingVelocity, cResolveSizeAndState, scrollDefaultDelay, -1995022631, false, str$$g, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f26618d) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f26619e)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objA2 = o.d.d.a(270 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, -1995022631, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    i5 = 0;
                    c2 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[gVar.f19924d] = cArr3[0];
            cArr2[gVar.f19924d + 1] = cArr3[1];
            Object[] objArr4 = {gVar, gVar};
            Object objA3 = o.d.d.a(1390051551);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = o.d.d.a(270 - TextUtils.getTrimmedLength(""), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), TextUtils.getTrimmedLength("") + 11, -2074123590, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void n(byte b2, short s2, byte b3, Object[] objArr) {
        int i2 = (s2 * 13) + 98;
        int i3 = 11 - (b2 * 7);
        byte[] bArr = $$d;
        int i4 = b3 * 7;
        byte[] bArr2 = new byte[8 - i4];
        int i5 = 7 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i2 = (i3 + (-i2)) - 5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b4 = bArr[i3];
                i3++;
                i2 = (i2 + (-b4)) - 5;
            }
        }
    }

    public final void a() {
        int i2 = 2 % 2;
        a aVar = (a) this.f26628c.findViewById(R.id.antelop_pin_prompt_keypad);
        if (this.f26627b.l()) {
            int i3 = f26623i + 25;
            f26620f = i3 % 128;
            if (i3 % 2 == 0) {
                aVar.scramble();
                int i4 = 21 / 0;
            } else {
                aVar.scramble();
            }
        }
        aVar.resetPasscode();
        int i5 = f26623i + 57;
        f26620f = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void c(String str) {
        int i2 = 2 % 2;
        int i3 = f26623i + 11;
        f26620f = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TextView textView = (TextView) this.f26628c.findViewById(R.id.antelop_pin_prompt_description);
        if (str == null) {
            textView.setVisibility(4);
            return;
        }
        textView.setVisibility(0);
        textView.setText(str);
        int i4 = f26620f + 85;
        f26623i = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0622  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r36, android.view.ViewGroup r37, android.os.Bundle r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.n.b.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
