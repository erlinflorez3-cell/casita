package o.cl;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import kotlin.io.encoding.Base64;
import o.ea.f;
import o.ea.g;
import o.ea.m;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: c */
    private static int f22442c = 0;

    /* JADX INFO: renamed from: d */
    private static int f22443d = 0;

    /* JADX INFO: renamed from: f */
    private static int f22444f = 0;

    /* JADX INFO: renamed from: g */
    private static byte[] f22445g = null;

    /* JADX INFO: renamed from: h */
    private static int f22446h = 0;

    /* JADX INFO: renamed from: i */
    private static int f22447i = 0;

    /* JADX INFO: renamed from: j */
    private static short[] f22448j = null;

    /* JADX INFO: renamed from: l */
    private static int f22449l = 0;

    /* JADX INFO: renamed from: m */
    private static int f22450m = 0;

    /* JADX INFO: renamed from: a */
    private int f22451a;

    /* JADX INFO: renamed from: b */
    private byte[] f22452b;

    /* JADX INFO: renamed from: e */
    private int f22453e;

    private static String $$c(byte b2, short s2, byte b3) {
        int i2 = b2 * 3;
        byte[] bArr = $$a;
        int i3 = s2 + 4;
        int i4 = b3 + 103;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = (-i3) + i4;
            i3 = i3;
        }
        while (true) {
            i6++;
            int i7 = i3 + 1;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i4 = (-bArr[i7]) + i4;
            i3 = i7;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22449l = 0;
        f22450m = 1;
        f22446h = 0;
        f22444f = 1;
        c();
        KeyEvent.normalizeMetaState(0);
        ViewConfiguration.getEdgeSlop();
        ImageFormat.getBitsPerPixel(0);
        ViewConfiguration.getScrollBarFadeDuration();
        View.resolveSizeAndState(0, 0, 0);
        int i2 = f22450m + 23;
        f22449l = i2 % 128;
        int i3 = i2 % 2;
    }

    public b(int i2, int i3, byte[] bArr) {
        this.f22453e = i2;
        this.f22451a = i3;
        this.f22452b = bArr;
    }

    static void c() {
        f22442c = 1818236453;
        f22443d = 1150422435;
        f22447i = -1632968293;
        f22445g = new byte[]{100, MessagePack.Code.STR16, 43, 36, MessagePack.Code.FIXEXT4, 59, 104, 88, 124, -115, -126, 112, 125, MessagePack.Code.ARRAY16, Base64.padSymbol, 112, 115, -126, MessagePack.Code.EXT16, 92, -125, 127, -66, 53, 97, -97, 114, 121, 112, -127, -99, -115, -115, -115};
    }

    static void init$0() {
        $$a = new byte[]{53, 97, -95, 41};
        $$b = 186;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01ba A[PHI: r0
  0x01ba: PHI (r0v51 int) = (r0v5 int), (r0v54 int) binds: [B:117:0x01d0, B:113:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d3 A[PHI: r0
  0x01d3: PHI (r0v6 int) = (r0v5 int), (r0v54 int) binds: [B:117:0x01d0, B:113:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(short r26, int r27, int r28, int r29, byte r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cl.b.k(short, int, int, int, byte, java.lang.Object[]):void");
    }

    public final String a() throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = f22446h + 91;
        f22444f = i4 % 128;
        int i5 = i4 % 2;
        for (o.ei.d dVar : o.ei.d.a(this.f22452b)) {
            int i6 = f22444f + 73;
            f22446h = i6 % 128;
            int i7 = i6 % i2;
            String strD = dVar.d();
            Object[] objArr = new Object[1];
            k((short) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-686955431) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') + 5103, TextUtils.getCapsMode("", 0, 0) - 44, (byte) (TextUtils.indexOf("", "") - 27), objArr);
            if (strD.equals(((String) objArr[0]).intern())) {
                if (f.a()) {
                    Object[] objArr2 = new Object[1];
                    k((short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (-686955431) - Drawable.resolveOpacity(0, 0), 633803836 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 40, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 92), objArr2);
                    String strIntern = ((String) objArr2[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr3 = new Object[1];
                    k((short) View.resolveSizeAndState(0, 0, 0), (-686955426) - TextUtils.getTrimmedLength(""), KeyEvent.normalizeMetaState(0) + 633803836, ExpandableListView.getPackedPositionType(0L) - 20, (byte) (2 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr3);
                    f.c(strIntern, sb.append(((String) objArr3[0]).intern()).append(dVar.c()).toString());
                    int i8 = f22444f + 95;
                    f22446h = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 2 / 4;
                    }
                }
                String strD2 = m.d(dVar.c().toLowerCase(g.d()));
                int i10 = f22444f + 47;
                f22446h = i10 % 128;
                if (i10 % 2 == 0) {
                    return strD2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i11 = f22446h + 85;
            f22444f = i11 % 128;
            i2 = 2;
            int i12 = i11 % 2;
        }
        int i13 = f22444f + 81;
        f22446h = i13 % 128;
        if (i13 % i2 != 0) {
            int i14 = 33 / 0;
        }
        return null;
    }

    public final int b() {
        int i2 = 2 % 2;
        int i3 = f22444f + 97;
        int i4 = i3 % 128;
        f22446h = i4;
        int i5 = i3 % 2;
        int i6 = this.f22451a;
        int i7 = i4 + 105;
        f22444f = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int d() {
        int i2 = 2 % 2;
        int i3 = f22446h + 47;
        int i4 = i3 % 128;
        f22444f = i4;
        int i5 = i3 % 2;
        int i6 = this.f22453e;
        int i7 = i4 + 91;
        f22446h = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 41 / 0;
        }
        return i6;
    }

    public final byte[] e() {
        int i2 = 2 % 2;
        int i3 = f22446h + 19;
        f22444f = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f22452b;
        }
        throw null;
    }
}
