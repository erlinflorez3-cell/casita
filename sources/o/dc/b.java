package o.dc;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.Method;
import o.a.h;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22763a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f22764b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f22765d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f22766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f22767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static char f22768c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static char[] f22769d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ d[] f22770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f22771f = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f22772h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f22773i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f22774j = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r8, short r9, byte r10) {
            /*
                int r0 = r8 * 2
                int r8 = 4 - r0
                byte[] r7 = o.dc.b.d.$$a
                int r0 = r9 * 2
                int r6 = 1 - r0
                int r0 = r10 + 102
                byte[] r5 = new byte[r6]
                r4 = 0
                if (r7 != 0) goto L27
                r3 = r4
                r2 = r8
            L13:
                int r8 = r8 + r0
                int r2 = r2 + 1
                r1 = r3
            L17:
                int r3 = r1 + 1
                byte r0 = (byte) r8
                r5[r1] = r0
                if (r3 != r6) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L24:
                r0 = r7[r2]
                goto L13
            L27:
                r1 = r4
                r2 = r8
                r8 = r0
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dc.b.d.$$c(int, short, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f22773i = 0;
            f22774j = 1;
            f22772h = 0;
            f22771f = 1;
            c();
            Object[] objArr = new Object[1];
            g(29 - (ViewConfiguration.getTapTimeout() >> 16), "\u0018\u0014\u0010\u0013\u0016\t\u0006\u0004\u0012\r\u0002\u000e㘆㘆\u0015\t\u0001\f\u0003\u0005\u0006\u0007\b\u0006\u0013\u0006\r\u000e㗼", (byte) (8 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr);
            f22767b = new d(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            g(33 - Process.getGidForName(""), "\u0018\u0014\u0010\u0013\u0016\t\u0006\u0004\u0012\r\u0002\u000e㙔㙔\u0015\t\u0001\f\u0018\u0014\u0017\f\u000e\u0004\u0000\n\u0007\u0006\u000e\u0014\u0017\u0014\u0007\u0005", (byte) (86 - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr2);
            f22766a = new d(((String) objArr2[0]).intern(), 1);
            f22770e = b();
            int i2 = f22773i + 97;
            f22774j = i2 % 128;
            int i3 = i2 % 2;
        }

        private d(String str, int i2) {
        }

        private static /* synthetic */ d[] b() {
            int i2 = 2 % 2;
            int i3 = f22771f;
            int i4 = i3 + 91;
            f22772h = i4 % 128;
            int i5 = i4 % 2;
            d[] dVarArr = {f22767b, f22766a};
            int i6 = i3 + 37;
            f22772h = i6 % 128;
            if (i6 % 2 == 0) {
                return dVarArr;
            }
            throw null;
        }

        static void c() {
            f22769d = new char[]{64625, 64611, 64615, 64622, 64583, 64580, 64587, 64598, 64599, 64593, 64578, 64604, 64588, 64586, 64621, 64596, 64582, 64624, 64592, 64577, 64616, 64623, 64584, 64631, 64576};
            f22768c = (char) 51642;
        }

        private static void g(int i2, String str, byte b2, Object[] objArr) throws Throwable {
            int i3;
            String str2 = str;
            int i4 = 2;
            int i5 = 2 % 2;
            Object obj = str2;
            if (str2 != null) {
                char[] charArray = str2.toCharArray();
                int i6 = $11 + 1;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                obj = charArray;
            }
            char[] cArr = (char[]) obj;
            h hVar = new h();
            char[] cArr2 = f22769d;
            long j2 = 0;
            if (cArr2 != null) {
                int i8 = $11 + 19;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i10 = 0;
                while (i10 < length) {
                    int i11 = $11 + 3;
                    $10 = i11 % 128;
                    int i12 = i11 % i4;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i10])};
                        Object objA = o.d.d.a(421932776);
                        if (objA == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objA = o.d.d.a(271 - (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(j2), 11 - View.combineMeasuredStates(0, 0), -811348851, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr3[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i10++;
                        i4 = 2;
                        j2 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(f22768c)};
            Object objA2 = o.d.d.a(421932776);
            if (objA2 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objA2 = o.d.d.a(270 - View.resolveSize(0, 0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ';' - AndroidCharacter.getMirror('0'), -811348851, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i2];
            if (i2 % 2 != 0) {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b2);
            } else {
                i3 = i2;
            }
            if (i3 > 1) {
                hVar.f19926b = 0;
                while (hVar.f19926b < i3) {
                    int i13 = $10 + 81;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    hVar.f19927c = cArr[hVar.f19926b];
                    hVar.f19925a = cArr[hVar.f19926b + 1];
                    if (hVar.f19927c == hVar.f19925a) {
                        int i15 = $11 + 35;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                        cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                    } else {
                        Object[] objArr4 = {hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA3 = o.d.d.a(219124184);
                        if (objA3 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objA3 = o.d.d.a(TextUtils.getCapsMode("", 0, 0) + 825, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 11, -611683395, false, $$c(b7, b8, (byte) (9 | b8)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                            int i17 = $11 + 61;
                            $10 = i17 % 128;
                            int i18 = i17 % 2;
                            Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                            Object objA4 = o.d.d.a(-634864343);
                            if (objA4 == null) {
                                byte b9 = (byte) 0;
                                byte b10 = b9;
                                objA4 = o.d.d.a(219 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 11, 212688716, false, $$c(b9, b10, (byte) (7 | b10)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                            int i19 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[iIntValue];
                            cArr4[hVar.f19926b + 1] = cArr2[i19];
                        } else if (hVar.f19928d == hVar.f19929e) {
                            int i20 = $10 + 43;
                            $11 = i20 % 128;
                            int i21 = i20 % 2;
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i22 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i23 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i22];
                            cArr4[hVar.f19926b + 1] = cArr2[i23];
                        } else {
                            int i24 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i25 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i24];
                            cArr4[hVar.f19926b + 1] = cArr2[i25];
                        }
                    }
                    hVar.f19926b += 2;
                }
            }
            for (int i26 = 0; i26 < i2; i26++) {
                int i27 = $10 + 75;
                $11 = i27 % 128;
                int i28 = i27 % 2;
                cArr4[i26] = (char) (cArr4[i26] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        static void init$0() {
            $$a = new byte[]{52, 50, -24, MessagePack.Code.MAP16};
            $$b = 43;
        }

        public static d valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f22771f + 103;
            f22772h = i3 % 128;
            int i4 = i3 % 2;
            d dVar = (d) Enum.valueOf(d.class, str);
            int i5 = f22772h + 1;
            f22771f = i5 % 128;
            if (i5 % 2 != 0) {
                return dVar;
            }
            throw null;
        }

        public static d[] values() {
            int i2 = 2 % 2;
            int i3 = f22772h + 79;
            f22771f = i3 % 128;
            int i4 = i3 % 2;
            d[] dVarArr = (d[]) f22770e.clone();
            int i5 = f22772h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f22771f = i5 % 128;
            if (i5 % 2 != 0) {
                return dVarArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    b(d dVar, String str) {
        super(str);
        this.f22765d = dVar;
    }

    public final d c() {
        d dVar;
        int i2 = 2 % 2;
        int i3 = f22763a + 15;
        int i4 = i3 % 128;
        f22764b = i4;
        if (i3 % 2 == 0) {
            dVar = this.f22765d;
            int i5 = 44 / 0;
        } else {
            dVar = this.f22765d;
        }
        int i6 = (i4 ^ 69) + ((i4 & 69) << 1);
        f22763a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 21 / 0;
        }
        return dVar;
    }
}
