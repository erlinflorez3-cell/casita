package o.du;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import o.ea.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f23341a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f23342b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23343c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f23344d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f23345e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f23346g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f23347i = 0;

    /* JADX INFO: renamed from: o.du.b$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f23348c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f23349d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f23350e;

        static {
            int[] iArr = new int[h.values().length];
            f23350e = iArr;
            try {
                iArr[h.f23368c.ordinal()] = 1;
                int i2 = f23348c + 67;
                f23349d = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23350e[h.f23366a.ordinal()] = 2;
                int i4 = f23349d;
                int i5 = (((i4 + 61) - (61 & i4)) << 1) - (i4 ^ 61);
                f23348c = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23350e[h.f23367b.ordinal()] = 3;
                int i7 = f23348c;
                int i8 = ((111 | i7) << 1) - (i7 ^ 111);
                f23349d = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, short r9, short r10) {
        /*
            int r0 = r8 * 3
            int r8 = 1 - r0
            int r0 = r9 + 102
            byte[] r7 = o.du.b.$$a
            int r1 = r10 * 2
            int r6 = 4 - r1
            byte[] r5 = new byte[r8]
            r4 = 0
            if (r7 != 0) goto L2a
            r1 = r6
            r3 = r4
        L13:
            int r0 = -r0
            int r0 = r0 + r6
            int r6 = r1 + 1
        L17:
            byte r1 = (byte) r0
            r5[r3] = r1
            int r3 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            r2 = r7[r6]
            r1 = r6
            r6 = r0
            r0 = r2
            goto L13
        L2a:
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.du.b.$$c(byte, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23346g = 0;
        f23347i = 1;
        f23345e = 0;
        f23343c = 1;
        a();
        ViewConfiguration.getScrollBarFadeDuration();
        AndroidCharacter.getMirror('0');
        int i2 = f23347i + 17;
        f23346g = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static void a() {
        f23344d = new char[]{51646, 64587, 64586, 64580, 64577, 64625, 64616, 64543, 51644, 64593, 64598, 64614, 64630, 51645, 64582, 64576, 64597, 64588, 64520, 64592, 64599, 64578, 64594, 64604, 64517};
        f23341a = (char) 51642;
    }

    public static h c() {
        int i2 = 2 % 2;
        int i3 = f23345e;
        int i4 = i3 + 19;
        f23343c = i4 % 128;
        int i5 = i4 % 2;
        a aVar = f23342b;
        if (aVar == null) {
            int i6 = i3 + 111;
            f23343c = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }
        h hVarB = aVar.b();
        int i8 = f23345e + 123;
        f23343c = i8 % 128;
        int i9 = i8 % 2;
        return hVarB;
    }

    public static void e(h hVar) {
        int i2 = 2 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            f(Color.rgb(0, 0, 0) + 16777248, "\n\u0000\u0004\u0002\r\u0000\u0013\u000e\u0016\u0007\u0002\u000b\b\u0004\u0018\u0005\f\u0001\u0002\u0000\u0013\u0007\u0016\u0007\u0006\u000b\u0004\u0002\u0001\u0017\u0014\u0000", (byte) (MotionEvent.axisFromString("") + 94), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            f(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 49, "\u000f\u0011\u0000\u0004\u0005\u0013\u0004\u000e\u0017\u0000\u0000\u000b\u0004\r\u0007\u0013\u0003\u0002\u0014\u000e\b\u0004\u0018\u0005\u0004\u0013\u0003\u0002\u0002\u0013\u0007\u0013\u0003\u0002\u0017\u0013\u0015\u0004\u0011\u0014\u0014\t\u0015\u0012\u0013\u0014\t\u0016", (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 79), objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(hVar).toString());
            int i3 = f23345e + 81;
            f23343c = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = AnonymousClass1.f23350e[hVar.ordinal()];
        if (i5 == 1) {
            f23342b = new d();
            return;
        }
        if (i5 != 2) {
            if (i5 != 3) {
                return;
            }
            f23342b = new c();
        } else {
            f23342b = new e();
            int i6 = f23345e + 65;
            f23343c = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0153 A[Catch: all -> 0x035d, TRY_ENTER, TryCatch #0 {all -> 0x035d, blocks: (B:11:0x0034, B:13:0x0042, B:14:0x006f, B:19:0x008d, B:21:0x009e, B:22:0x00d2, B:39:0x0153, B:41:0x019c, B:42:0x020a, B:46:0x021d, B:48:0x0258, B:49:0x02c0), top: B:69:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(int r27, java.lang.String r28, byte r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 875
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.du.b.f(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{124, 69, -84, MessagePack.Code.STR8};
        $$b = 19;
    }
}
