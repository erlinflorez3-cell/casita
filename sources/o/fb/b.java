package o.fb;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.Random;
import o.eu.a;
import o.eu.d;
import o.fl.e;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends a<e, c> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$h = null;
    private static final int $$i = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f25733a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f25734b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f25735c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f25736e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f25737h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char[] f25738i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f25739j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f25740k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f25741l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f25742n = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25743d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f25744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f25745g;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(byte r9, int r10, short r11) {
        /*
            int r0 = r11 * 2
            int r8 = r0 + 4
            byte[] r7 = o.fb.b.$$h
            int r6 = r10 * 3
            int r0 = r6 + 1
            int r5 = r9 + 99
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r7 != 0) goto L2a
            r5 = r6
            r2 = r8
            r1 = r3
        L14:
            int r0 = -r8
            int r5 = r5 + r0
            int r8 = r2 + 1
        L18:
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r1 != r6) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L23:
            r0 = r7[r8]
            int r1 = r1 + 1
            r2 = r8
            r8 = r0
            goto L14
        L2a:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fb.b.$$j(byte, int, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        f25734b = 147300292;
        f25733a = -617922789;
        f25736e = 846126367;
        f25735c = -1690378636;
        f25742n = 0;
        f25741l = 1;
        f25739j = 0;
        f25740k = 1;
        e();
        SystemClock.currentThreadTimeMillis();
        Process.getThreadPriority(0);
        ViewConfiguration.getKeyRepeatDelay();
        int i2 = f25741l + 25;
        f25742n = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 90 / 0;
        }
    }

    public b() throws Throwable {
        Object[] objArr = new Object[1];
        m((char) (19558 - Color.green(0)), KeyEvent.getMaxKeyCode() >> 16, TextUtils.lastIndexOf("", '0') + 4, objArr);
        this.f25743d = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        m((char) (26761 - Color.green(0)), '3' - AndroidCharacter.getMirror('0'), TextUtils.getOffsetAfter("", 0) + 19, objArr2);
        this.f25745g = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        m((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 15 - (ViewConfiguration.getTapTimeout() >> 16), objArr3);
        this.f25744f = ((String) objArr3[0]).intern();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.fb.c b(java.lang.String r24, java.lang.String r25, boolean r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fb.b.b(java.lang.String, java.lang.String, boolean):o.fb.c");
    }

    private e b(o.ef.a aVar) throws o.ef.b {
        int i2 = f25736e * 1737203387;
        f25736e = i2;
        int i3 = f25733a * 123871310;
        f25733a = i3;
        int iNextInt = new Random().nextInt(635295819);
        int i4 = (-849663422) * f25734b;
        f25734b = i4;
        return (e) c(i4, i2, iNextInt, new Object[]{this, aVar}, i3, 620304025, -620304024);
    }

    public static /* synthetic */ Object c(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i7;
        int i9 = (~((i8 + i3) - (i8 & i3))) | i6;
        int i10 = ~i6;
        int i11 = ~((i8 + i10) - (i8 & i10));
        int i12 = ~i3;
        int i13 = ~(i10 | i12);
        int i14 = (i11 + i13) - (i11 & i13);
        int i15 = ~(i8 | i12);
        int i16 = ~((-1) - (((-1) - i3) & ((-1) - i10)));
        int i17 = (i16 + i15) - (i16 & i15);
        int i18 = i7 + i6 + i5 + (417615942 * i4) + (566850886 * i2);
        int i19 = i18 * i18;
        int i20 = ((-370608051) * i7) + 147849216 + ((-2147356519) * i6) + (i9 * 1776748468) + (i14 * 1776748468) + (1776748468 * i17) + (1406140416 * i5) + ((-354418688) * i4) + ((-85983232) * i2) + ((-608960512) * i19);
        int i21 = (i7 * (-1357469509)) + 140661806 + (i6 * (-1357469617)) + (i9 * 108) + (i14 * 108) + (i17 * 108) + (i5 * (-1357469401)) + (i4 * 1137340586) + (i2 * 304092074) + (i19 * 1282146304);
        return i20 + ((i21 * i21) * 1158414336) != 1 ? d(objArr) : e(objArr);
    }

    private c c(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25739j + 23;
        f25740k = i3 % 128;
        int i4 = i3 % 2;
        c cVar = (c) super.a(aVar);
        Object[] objArr = new Object[1];
        m((char) View.MeasureSpec.getSize(0), TextUtils.lastIndexOf("", '0', 0, 0) + 75, TextUtils.indexOf("", "") + 10, objArr);
        Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
        int i5 = o.ef.a.f23778l * 493926616;
        o.ef.a.f23778l = i5;
        int i6 = o.ef.a.f23779m * 1131312688;
        o.ef.a.f23779m = i6;
        cVar.e(((Integer) o.ef.a.a(1122077797, objArr2, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i5, i6)).intValue());
        int i7 = f25739j + 5;
        f25740k = i7 % 128;
        if (i7 % 2 != 0) {
            return cVar;
        }
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) throws Throwable {
        b bVar = (b) objArr[0];
        o.ff.a aVar = (o.ff.a) objArr[1];
        int i2 = 2 % 2;
        int i3 = f25740k + 57;
        f25739j = i3 % 128;
        int i4 = i3 % 2;
        o.ef.a aVarE = bVar.e((e) aVar);
        int i5 = f25739j + 7;
        f25740k = i5 % 128;
        if (i5 % 2 != 0) {
            return aVarE;
        }
        throw null;
    }

    private static e d(boolean z2, o.ff.b bVar, short s2) {
        int i2 = 2 % 2;
        e eVar = new e(false, bVar, s2);
        int i3 = f25739j + 1;
        f25740k = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 54 / 0;
        }
        return eVar;
    }

    private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
        b bVar = (b) objArr[0];
        o.ef.a aVar = (o.ef.a) objArr[1];
        int i2 = 2 % 2;
        int i3 = f25740k + 95;
        f25739j = i3 % 128;
        int i4 = i3 % 2;
        e eVar = (e) super.d(aVar);
        Object[] objArr2 = new Object[1];
        m((char) (19559 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.indexOf("", ""), View.MeasureSpec.getMode(0) + 3, objArr2);
        Object[] objArr3 = {aVar, ((String) objArr2[0]).intern()};
        int i5 = o.ef.a.f23778l * 493926616;
        o.ef.a.f23778l = i5;
        int i6 = o.ef.a.f23779m * 1131312688;
        o.ef.a.f23779m = i6;
        eVar.e(((Integer) o.ef.a.a(1122077797, objArr3, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i5, i6)).intValue());
        Object[] objArr4 = new Object[1];
        m((char) (KeyEvent.normalizeMetaState(0) + 26761), 3 - View.MeasureSpec.getSize(0), 19 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr4);
        Object[] objArr5 = {aVar, ((String) objArr4[0]).intern()};
        int i7 = o.ef.a.f23778l * 493926616;
        o.ef.a.f23778l = i7;
        int i8 = o.ef.a.f23779m * 1131312688;
        o.ef.a.f23779m = i8;
        eVar.c(((Integer) o.ef.a.a(1122077797, objArr5, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i7, i8)).intValue());
        Object[] objArr6 = new Object[1];
        m((char) (KeyEvent.getMaxKeyCode() >> 16), 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 15 - (KeyEvent.getMaxKeyCode() >> 16), objArr6);
        Object[] objArr7 = {aVar, ((String) objArr6[0]).intern()};
        int i9 = o.ef.a.f23778l * 493926616;
        o.ef.a.f23778l = i9;
        int i10 = o.ef.a.f23779m * 1131312688;
        o.ef.a.f23779m = i10;
        eVar.d(((Integer) o.ef.a.a(1122077797, objArr7, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i9, i10)).intValue());
        int i11 = f25739j + 117;
        f25740k = i11 % 128;
        if (i11 % 2 != 0) {
            return eVar;
        }
        throw null;
    }

    private o.ef.a e(c cVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25740k + 77;
        f25739j = i3 % 128;
        int i4 = i3 % 2;
        o.ef.a aVarA = super.a(cVar);
        Object[] objArr = new Object[1];
        m((char) TextUtils.indexOf("", ""), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 74, 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int iMyTid = Process.myTid();
        int iMyPid = Process.myPid();
        aVarA.c(strIntern, ((Integer) c.d(-1462814612, (int) Process.getElapsedCpuTime(), (int) SystemClock.elapsedRealtime(), iMyPid, new Object[]{cVar}, iMyTid, 1462814612)).intValue());
        int i5 = f25740k + 59;
        f25739j = i5 % 128;
        int i6 = i5 % 2;
        return aVarA;
    }

    private o.ef.a e(e eVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25740k + 105;
        f25739j = i3 % 128;
        int i4 = i3 % 2;
        o.ef.a aVarA = super.a(eVar);
        Object[] objArr = new Object[1];
        m((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19558), ViewConfiguration.getTapTimeout() >> 16, 3 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
        aVarA.c(((String) objArr[0]).intern(), eVar.g());
        Object[] objArr2 = new Object[1];
        m((char) (Color.blue(0) + 26761), 3 - KeyEvent.getDeadChar(0, 0), 19 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
        aVarA.c(((String) objArr2[0]).intern(), eVar.j());
        Object[] objArr3 = new Object[1];
        m((char) Drawable.resolveOpacity(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22, 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr3);
        aVarA.c(((String) objArr3[0]).intern(), eVar.i());
        int i5 = f25740k + 75;
        f25739j = i5 % 128;
        if (i5 % 2 == 0) {
            return aVarA;
        }
        throw null;
    }

    static void e() {
        f25738i = new char[]{55527, 39362, 23175, 64536, 48435, 32371, 16318, 63722, 47652, 31585, 13440, 62962, 46887, 28788, 12673, 62153, 44054, 28014, 11911, 61406, 43288, 27205, 38047, 54702, 5872, 22293, 36967, 53946, 5105, 23612, 40308, 57251, 6355, 22786, 39515, 50309, 1488, 3287, 19941, 36520, 53107, 2093, 19182, 35772, 50227, 1329, 18400, 33018, 49530, 531, 23772, 40340, 56896, 7947, 23032, 39568, 56158, 5137, 22236, 5566, 21642, 38848, 54812, 4444, 21391, 37585, 56610, 7254, 24223, 39381, 55344, 7022, 17839, 34024, 38033, 54714, 5882, 22327, 36963, 53933, 5096, 23576, 40302, 57268};
        f25737h = -7536445416807017009L;
    }

    static void init$0() {
        $$a = new byte[]{57, MessagePack.Code.BIN8, -70, 1};
        $$b = 26;
    }

    static void init$1() {
        $$d = new byte[]{101, -29, 17, 95, -65, 75, -75, Utf8.REPLACEMENT_BYTE, -73, 17};
        $$e = 129;
    }

    static void init$2() {
        $$h = new byte[]{76, -80, -89, 46};
        $$i = 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m(char r22, int r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fb.b.m(char, int, int, java.lang.Object[]):void");
    }

    private static void o(short s2, short s3, short s4, Object[] objArr) {
        int i2 = s3 * 2;
        int i3 = 106 - (s4 * 5);
        int i4 = (s2 * 3) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = i5 + i3;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 += bArr[i4];
                i4++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(byte r9, short r10, byte r11, java.lang.Object[] r12) {
        /*
            int r0 = r10 * 6
            int r8 = r0 + 4
            byte[] r7 = o.fb.b.$$d
            int r0 = r9 * 6
            int r6 = r0 + 1
            int r0 = r11 * 11
            int r3 = 111 - r0
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r7 != 0) goto L2c
            r0 = r6
            r3 = r8
            r2 = r4
        L16:
            int r8 = r8 + 1
            int r3 = r3 + r0
            r1 = r2
        L1a:
            byte r0 = (byte) r3
            int r2 = r1 + 1
            r5[r1] = r0
            if (r2 != r6) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r12[r4] = r0
            return
        L29:
            r0 = r7[r8]
            goto L16
        L2c:
            r1 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fb.b.p(byte, short, byte, java.lang.Object[]):void");
    }

    @Override // o.eu.a
    public final /* synthetic */ o.ef.a a(d dVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25739j + 23;
        f25740k = i3 % 128;
        Object obj = null;
        c cVar = (c) dVar;
        if (i3 % 2 == 0) {
            e(cVar);
            throw null;
        }
        o.ef.a aVarE = e(cVar);
        int i4 = f25740k + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f25739j = i4 % 128;
        if (i4 % 2 == 0) {
            return aVarE;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.eu.a
    public final /* synthetic */ o.ef.a a(o.ff.a aVar) throws o.ef.b {
        int i2 = f25735c * 1379064620;
        f25735c = i2;
        int priority = Thread.currentThread().getPriority();
        int iActiveCount = Thread.activeCount();
        return (o.ef.a) c((int) Runtime.getRuntime().totalMemory(), i2, iActiveCount, new Object[]{this, aVar}, priority, -452516291, 452516291);
    }

    @Override // o.eu.a
    public final /* synthetic */ d a(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25739j + 31;
        f25740k = i3 % 128;
        int i4 = i3 % 2;
        c cVarC = c(aVar);
        int i5 = f25740k + 9;
        f25739j = i5 % 128;
        int i6 = i5 % 2;
        return cVarC;
    }

    @Override // o.eu.a
    public final /* synthetic */ o.ff.a a(o.ff.b bVar, short s2) {
        int i2 = 2 % 2;
        int i3 = f25739j + 71;
        f25740k = i3 % 128;
        int i4 = i3 % 2;
        e eVarD = d(false, bVar, s2);
        int i5 = f25740k + 51;
        f25739j = i5 % 128;
        int i6 = i5 % 2;
        return eVarD;
    }

    @Override // o.eu.a
    public final a.d b() {
        int i2 = 2 % 2;
        int i3 = f25739j + 87;
        f25740k = i3 % 128;
        int i4 = i3 % 2;
        a.d dVar = a.d.f25449h;
        int i5 = f25739j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f25740k = i5 % 128;
        if (i5 % 2 != 0) {
            return dVar;
        }
        throw null;
    }

    @Override // o.eu.a
    public final /* synthetic */ d d(String str, String str2, boolean z2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25740k + 65;
        f25739j = i3 % 128;
        int i4 = i3 % 2;
        c cVarB = b(str, str2, z2);
        if (i4 != 0) {
            int i5 = 77 / 0;
        }
        return cVarB;
    }

    @Override // o.eu.a
    public final /* synthetic */ o.ff.a d(o.ef.a aVar) throws o.ef.b {
        int i2 = 2 % 2;
        int i3 = f25740k + 99;
        f25739j = i3 % 128;
        int i4 = i3 % 2;
        int i5 = f25736e * 1737203387;
        f25736e = i5;
        int i6 = f25733a * 123871310;
        f25733a = i6;
        int iNextInt = new Random().nextInt(635295819);
        int i7 = f25734b * (-849663422);
        f25734b = i7;
        e eVar = (e) c(i7, i5, iNextInt, new Object[]{this, aVar}, i6, 620304025, -620304024);
        int i8 = f25740k + 49;
        f25739j = i8 % 128;
        if (i8 % 2 == 0) {
            return eVar;
        }
        throw null;
    }
}
