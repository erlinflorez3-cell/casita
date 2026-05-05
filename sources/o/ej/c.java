package o.ej;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f23958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f23959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ c[] f23960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f23961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f23962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f23963f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f23964g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23965h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f23966i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23967j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, int r9, byte r10) {
        /*
            byte[] r7 = o.ej.c.$$a
            int r0 = r9 * 3
            int r6 = r0 + 4
            int r0 = r8 * 2
            int r5 = r0 + 113
            int r1 = r10 * 4
            int r0 = 1 - r1
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r7 != 0) goto L2a
            r0 = r2
            r1 = r3
        L17:
            int r6 = r6 + 1
            int r5 = r5 + r0
        L1a:
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r1 != r2) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            int r1 = r1 + 1
            r0 = r7[r6]
            goto L17
        L2a:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ej.c.$$c(int, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23964g = 0;
        f23963f = 1;
        f23966i = 0;
        f23965h = 1;
        d();
        Object[] objArr = new Object[1];
        k(7 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u000e\u001c!\ufff0￣￥", true, 103 - ExpandableListView.getPackedPositionType(0L), ExpandableListView.getPackedPositionGroup(0L) + 4, objArr);
        f23961d = new c(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        k(4 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "￡\u0012\r", false, 118 - TextUtils.indexOf("", "", 0, 0), View.resolveSize(0, 0) + 3, objArr2);
        f23962e = new c(((String) objArr2[0]).intern(), 1);
        Object[] objArr3 = new Object[1];
        k(6 - KeyEvent.normalizeMetaState(0), "￭1\ufff1\uffef\u0018\uffef", false, 93 - (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.normalizeMetaState(0) + 1, objArr3);
        f23958a = new c(((String) objArr3[0]).intern(), 2);
        Object[] objArr4 = new Object[1];
        k((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3, "￪￬,", true, 98 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3, objArr4);
        f23959b = new c(((String) objArr4[0]).intern(), 3);
        f23960c = e();
        int i2 = f23963f + 19;
        f23964g = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private c(String str, int i2) {
    }

    static void d() {
        f23967j = -1270219507;
    }

    private static /* synthetic */ c[] e() {
        int i2 = 2 % 2;
        int i3 = f23966i;
        int i4 = i3 + 27;
        f23965h = i4 % 128;
        int i5 = i4 % 2;
        c[] cVarArr = {f23961d, f23962e, f23958a, f23959b};
        int i6 = i3 + 105;
        f23965h = i6 % 128;
        if (i6 % 2 != 0) {
            return cVarArr;
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{74, -74, 100, -77};
        $$b = 40;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(int r19, java.lang.String r20, boolean r21, int r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ej.c.k(int, java.lang.String, boolean, int, int, java.lang.Object[]):void");
    }

    public static c valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f23965h + 67;
        f23966i = i3 % 128;
        int i4 = i3 % 2;
        c cVar = (c) Enum.valueOf(c.class, str);
        int i5 = f23965h + 45;
        f23966i = i5 % 128;
        if (i5 % 2 == 0) {
            return cVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static c[] values() {
        int i2 = 2 % 2;
        int i3 = f23965h + 69;
        f23966i = i3 % 128;
        int i4 = i3 % 2;
        c[] cVarArr = (c[]) f23960c.clone();
        int i5 = f23965h + 99;
        f23966i = i5 % 128;
        int i6 = i5 % 2;
        return cVarArr;
    }
}
