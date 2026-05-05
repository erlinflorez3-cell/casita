package o.bx;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import fr.antelop.sdk.authentication.CustomerCredentialsRequiredReason;
import java.lang.reflect.Method;
import o.a.q;
import org.msgpack.core.MessagePack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements o.ea.d<CustomerCredentialsRequiredReason> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ d[] f21778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f21779b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f21780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f21781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f21782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f21783f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21784h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f21785i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f21786j = 0;

    /* JADX INFO: renamed from: o.bx.d$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f21787b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f21788d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f21789e;

        static {
            int[] iArr = new int[d.values().length];
            f21789e = iArr;
            try {
                iArr[d.f21780c.ordinal()] = 1;
                int i2 = f21788d;
                int i3 = (i2 ^ 121) + (((-1) - (((-1) - i2) | ((-1) - 121))) << 1);
                f21787b = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 4 % 5;
                } else {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21789e[d.f21781d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21789e[d.f21782e.ordinal()] = 3;
                int i6 = f21787b + 25;
                f21788d = i6 % 128;
                int i7 = i6 % 2;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r6, short r7, int r8) {
        /*
            int r7 = r7 * 4
            int r1 = r7 + 1
            int r0 = r6 * 2
            int r6 = r0 + 4
            byte[] r5 = o.bx.d.$$a
            int r0 = r8 * 7
            int r4 = r0 + 71
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r5 != 0) goto L2a
            r1 = r6
            r4 = r7
            r0 = r2
        L16:
            int r6 = r6 + 1
            int r4 = r4 + r1
            r1 = r0
        L1a:
            byte r0 = (byte) r4
            r3[r1] = r0
            int r0 = r1 + 1
            if (r1 != r7) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L27:
            r1 = r5[r6]
            goto L16
        L2a:
            r1 = r2
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bx.d.$$c(int, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21783f = 0;
        f21784h = 1;
        f21786j = 0;
        f21785i = 1;
        d();
        Object[] objArr = new Object[1];
        g("떉庉揍琽ᥫ≑㚘\udbf4\uec23\uf11f驓꺇돧䓛植牱ڻ⯿㳑섆\uea70", View.MeasureSpec.getSize(0) + 60209, objArr);
        f21780c = new d(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        g("떉꾩膍ﮝ\uddeb㟱⧘ϔ攣弿넓ꬵ赣\ue771\ud94d㍛ᒳຟ悑嫦볰", TextUtils.indexOf("", "") + 6673, objArr2);
        f21781d = new d(((String) objArr2[0]).intern(), 1);
        Object[] objArr3 = new Object[1];
        g("떉ꗩ锍蕝\uf4eb\ue431푘잔㜣❿ᚓ۲癮憶凊䄒낿", Drawable.resolveOpacity(0, 0) + 4177, objArr3);
        f21782e = new d(((String) objArr3[0]).intern(), 2);
        f21778a = a();
        int i2 = f21783f + 95;
        f21784h = i2 % 128;
        int i3 = i2 % 2;
    }

    private d(String str, int i2) {
    }

    private static /* synthetic */ d[] a() {
        int i2 = 2 % 2;
        int i3 = f21786j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f21785i = i3 % 128;
        if (i3 % 2 != 0) {
            return new d[]{f21780c, f21781d, f21782e};
        }
        d[] dVarArr = new d[5];
        dVarArr[0] = f21780c;
        dVarArr[1] = f21781d;
        dVarArr[2] = f21782e;
        return dVarArr;
    }

    static void d() {
        f21779b = -8507461744124577659L;
    }

    private static void g(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i4 = $10 + 93;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 0;
                charArray = str2.toCharArray();
            } else {
                charArray = str2.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i6 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((ViewConfiguration.getEdgeSlop() >> 16) + 731, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 7933), ExpandableListView.getPackedPositionType(0L) + 11, 355847088, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f21779b ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(837 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (KeyEvent.keyCodeFromString("") + 27279), (ViewConfiguration.getTouchSlop() >> 8) + 11, -2145994442, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i7 = $11 + 1;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = o.d.d.a(1452497747);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = o.d.d.a(836 - (ViewConfiguration.getTouchSlop() >> 8), (char) (27279 - (ViewConfiguration.getScrollBarSize() >> 8)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, -2145994442, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static void init$0() {
        $$a = new byte[]{54, MessagePack.Code.BIN8, MessagePack.Code.UINT64, -16};
        $$b = 173;
    }

    public static d valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f21785i + 81;
        f21786j = i3 % 128;
        int i4 = i3 % 2;
        d dVar = (d) Enum.valueOf(d.class, str);
        int i5 = f21786j + 113;
        f21785i = i5 % 128;
        if (i5 % 2 != 0) {
            return dVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static d[] values() {
        int i2 = 2 % 2;
        int i3 = f21786j + 89;
        f21785i = i3 % 128;
        int i4 = i3 % 2;
        d[] dVarArr = (d[]) f21778a.clone();
        int i5 = f21785i + 77;
        f21786j = i5 % 128;
        int i6 = i5 % 2;
        return dVarArr;
    }

    public final CustomerCredentialsRequiredReason c() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21785i + 87;
        f21786j = i3 % 128;
        int i4 = i3 % 2;
        int i5 = AnonymousClass5.f21789e[ordinal()];
        if (i5 == 1) {
            CustomerCredentialsRequiredReason customerCredentialsRequiredReason = CustomerCredentialsRequiredReason.ValidationNeeded;
            int i6 = f21785i + 105;
            f21786j = i6 % 128;
            int i7 = i6 % 2;
            return customerCredentialsRequiredReason;
        }
        if (i5 == 2) {
            return CustomerCredentialsRequiredReason.NotSet;
        }
        if (i5 == 3) {
            return CustomerCredentialsRequiredReason.ToBeChanged;
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        g("떟皁㏥ﳝ뤮稖❷\ue3bd겇槣⪘휋逗嵇ᦹ\uda84螠䂟", 49956 - ExpandableListView.getPackedPositionChild(0L), objArr);
        throw new UnsupportedOperationException(sb.append(((String) objArr[0]).intern()).append(name()).toString());
    }

    @Override // o.ea.a
    public final /* synthetic */ Object e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21786j + 41;
        f21785i = i3 % 128;
        if (i3 % 2 != 0) {
            return c();
        }
        c();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
