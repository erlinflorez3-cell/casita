package o.y;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c extends o.x.i<o.dt.a> {
    private static final byte[] $$o = null;
    private static final int $$p = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k */
    private static int f27083k = 0;

    /* JADX INFO: renamed from: l */
    private static int f27084l = 0;

    /* JADX INFO: renamed from: m */
    private static int f27085m = 0;

    /* JADX INFO: renamed from: n */
    private static int f27086n = 0;

    /* JADX INFO: renamed from: o */
    private static int f27087o = 0;

    /* JADX INFO: renamed from: r */
    protected final o.ep.d f27088r;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$q(int r6, int r7, int r8) {
        /*
            int r2 = r8 * 4
            int r1 = 1 - r2
            int r0 = r6 * 2
            int r0 = 115 - r0
            int r8 = r7 + 4
            byte[] r7 = o.y.c.$$o
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2c
            r2 = r8
            r1 = r4
            r3 = r5
        L16:
            int r8 = r8 + r1
            r0 = r8
            r8 = r2
        L19:
            int r2 = r8 + 1
            byte r1 = (byte) r0
            r6[r3] = r1
            if (r3 != r4) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L26:
            int r3 = r3 + 1
            r1 = r7[r2]
            r8 = r0
            goto L16
        L2c:
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.c.$$q(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f27085m = 0;
        f27086n = 1;
        f27083k = 0;
        f27084l = 1;
        p();
        ViewConfiguration.getKeyRepeatDelay();
        TextUtils.getTrimmedLength("");
        AndroidCharacter.getMirror('0');
        int i2 = f27086n + 49;
        f27085m = i2 % 128;
        int i3 = i2 % 2;
    }

    c(String str, o.ep.d dVar) {
        super(o.m.f.f26436a, str);
        this.f27088r = dVar;
    }

    private static void P(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.n nVar = new o.a.n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            int i6 = $11 + 115;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f27087o)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objA = o.d.d.a(270 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 11 - (ViewConfiguration.getScrollBarSize() >> 8), -2071844881, false, $$q(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 1;
                    byte b5 = (byte) (-b4);
                    objA2 = o.d.d.a(521 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), 12 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 627984172, false, $$q(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i9 = $10 + 19;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 5 % 2;
                }
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
        }
        if (z2) {
            int i11 = $10 + 73;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i13 = $10 + 73;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (-b6);
                    objA3 = o.d.d.a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 522, (char) (ViewConfiguration.getTouchSlop() >> 8), 13 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 627984172, false, $$q(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void init$0() {
        $$o = new byte[]{64, -84, MessagePack.Code.MAP32, -5};
        $$p = 8;
    }

    private static o.dt.a l() {
        int i2 = 2 % 2;
        o.dt.a aVar = new o.dt.a();
        int i3 = f27083k + 1;
        f27084l = i3 % 128;
        if (i3 % 2 != 0) {
            return aVar;
        }
        throw null;
    }

    static void p() {
        f27087o = -1270219518;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (((java.lang.Boolean) o.fm.h.c(-1003639645, r9, android.os.Process.myTid(), 1003639646, r12, r13, r14)).booleanValue() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        r10 = new java.lang.Object[]{r16.f27088r};
        r14 = o.ep.d.f24461m * (-222457364);
        o.ep.d.f24461m = r14;
        r11 = o.ep.d.f24462n * 325900588;
        o.ep.d.f24462n = r11;
        r12 = (int) android.os.SystemClock.elapsedRealtime();
        r13 = o.ep.d.f24460l * 323941697;
        o.ep.d.f24460l = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
    
        if (((fr.antelop.sdk.card.CardStatus) o.ep.d.e(1555433584, -1555433578, r10, r11, r12, r13, r14)) != fr.antelop.sdk.card.CardStatus.Active) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        a_();
        r2 = o.y.c.f27083k + 83;
        o.y.c.f27084l = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
    
        if ((r2 % 2) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
    
        r1 = 42 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0115, code lost:
    
        if (((java.lang.Boolean) o.fm.h.c(-1003639645, r9, android.os.Process.myTid(), 1003639646, r12, r13, r14)).booleanValue() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0119, code lost:
    
        r2 = fr.antelop.sdk.exception.WalletValidationErrorCode.WrongState;
        r11 = new java.lang.Object[1];
        P(android.view.View.MeasureSpec.getMode(0) + 4, "￥\u0003\u0014\u0006", false, 119 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 4 - (android.view.ViewConfiguration.getTapTimeout() >> 16), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0148, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r2, ((java.lang.String) r11[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0149, code lost:
    
        r1 = fr.antelop.sdk.exception.WalletValidationErrorCode.Unexpected;
        r4 = new java.lang.Object[1];
        P(android.widget.ExpandableListView.getPackedPositionGroup(0) + 7, "\u000b\ufffa\f\ufffb\u0006\t\uffe7", true, 130 - android.text.TextUtils.getOffsetBefore("", 0), 8 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), r4);
        r5 = ((java.lang.String) r4[0]).intern();
        r15 = new java.lang.Object[1];
        P(51 - android.text.TextUtils.getCapsMode("", 0, 0), "\u0006\u0017\tￅ\ufff5\u0017\u0014\t\u001a\b\u0019ￅ\u000e\u0018ￅ\u0013\u0014\u0019ￅ\u0018\u001a\u0015\u0015\u0014\u0017\u0019\n\tￅ\u0007\u001eￅ\u0019\r\nￅ\ufff8￩\ufff0\ufff9\r\nￅ￩\u000e\f\u000e\u0019\u0006\u0011￨", false, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 116, 39 - (android.os.Process.myTid() >> 22), r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a1, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r1, r5, ((java.lang.String) r15[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return;
     */
    @Override // o.x.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(o.en.b r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.c.a(o.en.b):void");
    }

    abstract void a_() throws WalletValidationException;

    @Override // o.x.i
    public final int b() {
        int i2 = 2 % 2;
        int i3 = f27084l;
        int i4 = i3 + 7;
        f27083k = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 99;
        f27083k = i6 % 128;
        int i7 = i6 % 2;
        return 0;
    }

    @Override // o.x.i
    public final /* synthetic */ o.i.c j() {
        int i2 = 2 % 2;
        int i3 = f27083k + 113;
        f27084l = i3 % 128;
        int i4 = i3 % 2;
        o.dt.a aVarL = l();
        int i5 = f27084l + 43;
        f27083k = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return aVarL;
    }
}
