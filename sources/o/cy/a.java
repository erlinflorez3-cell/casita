package o.cy;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.google.common.base.Ascii;
import o.cu.b;
import o.ea.f;
import o.fg.d;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends b<o.fi.a> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22685a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static short[] f22686b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22687c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22688d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static byte[] f22689e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22690f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f22691g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22692h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f22693i = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$f(int r7, int r8, byte r9) {
        /*
            int r0 = r8 * 3
            int r8 = r0 + 4
            int r3 = r7 + 103
            byte[] r7 = o.cy.a.$$d
            int r0 = r9 * 2
            int r6 = r0 + 1
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r7 != 0) goto L28
            r1 = r8
            r0 = r6
            r3 = r4
        L14:
            int r8 = r8 + r0
            int r1 = r1 + 1
            r2 = r3
        L18:
            int r3 = r2 + 1
            byte r0 = (byte) r8
            r5[r2] = r0
            if (r3 != r6) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            r0 = r7[r1]
            goto L14
        L28:
            r2 = r4
            r1 = r8
            r8 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cy.a.$$f(int, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22691g = 0;
        f22693i = 1;
        f22690f = 0;
        f22692h = 1;
        d();
        SystemClock.elapsedRealtimeNanos();
        Drawable.resolveOpacity(0, 0);
        ViewConfiguration.getZoomControlsTimeout();
        Process.getGidForName("");
        ViewConfiguration.getScrollFriction();
        int i2 = f22693i + 45;
        f22691g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 39 / 0;
        }
    }

    private static o.fi.a a(short s2, int i2, byte[] bArr) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f22690f + 111;
        f22692h = i4 % 128;
        int i5 = i4 % 2;
        if (f.a()) {
            int i6 = f22692h + 53;
            f22690f = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            j((short) (77 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), ExpandableListView.getPackedPositionType(0L) + 1487094424, KeyEvent.getDeadChar(0, 0) - 544465955, (-50) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            j((short) (View.resolveSize(0, 0) + 59), TextUtils.indexOf("", "", 0) + 1487094444, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 544465935, KeyEvent.normalizeMetaState(0) - 50, (byte) View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i8 = f22692h + 75;
            f22690f = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 / 4;
            }
        }
        o.fi.a aVar = new o.fi.a(true, o.ff.b.f25845c, s2);
        aVar.a(i2);
        aVar.c(bArr);
        return aVar;
    }

    static void d() {
        f22687c = -472993563;
        f22688d = 1150422460;
        f22685a = 1692527101;
        f22689e = new byte[]{110, 77, 57, 59, 34, 75, 1, 74, 64, 7, 52, 49, 38, 42, 70, 73, Ascii.GS, 76, 57, 71, 83, 84, 82, 17, 70, 67, 48, 52, 80, 91, 60, 48, 69, 52, 85};
    }

    static void init$0() {
        $$d = new byte[]{76, -80, -89, 46};
        $$e = Mp4VideoDirectory.TAG_COLOR_TABLE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093 A[PHI: r8
  0x0093: PHI (r8v19 byte[] A[IMMUTABLE_TYPE]) = (r8v5 byte[]), (r8v21 byte[]) binds: [B:24:0x00fa, B:14:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void j(short r26, int r27, int r28, int r29, byte r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cy.a.j(short, int, int, int, byte, java.lang.Object[]):void");
    }

    @Override // o.cu.b
    public final /* synthetic */ d c(short s2, int i2, byte[] bArr) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f22690f + 47;
        f22692h = i4 % 128;
        if (i4 % 2 != 0) {
            return a(s2, i2, bArr);
        }
        a(s2, i2, bArr);
        throw null;
    }
}
