package o.er;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import fr.antelop.sdk.digitalcard.ClickToPayPushCardNotProcessed;
import java.lang.reflect.Method;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements o.ea.a<ClickToPayPushCardNotProcessed> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: c */
    static String f25057c = null;

    /* JADX INFO: renamed from: d */
    private static int[] f25058d = null;

    /* JADX INFO: renamed from: f */
    private static int f25059f = 0;

    /* JADX INFO: renamed from: g */
    private static int f25060g = 0;

    /* JADX INFO: renamed from: h */
    private static int f25061h = 0;

    /* JADX INFO: renamed from: j */
    private static int f25062j = 0;

    /* JADX INFO: renamed from: a */
    private final String f25063a;

    /* JADX INFO: renamed from: b */
    private final b f25064b;

    /* JADX INFO: renamed from: e */
    private final String f25065e;

    /* JADX INFO: renamed from: o.er.m$4 */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a */
        private static int f25066a = 0;

        /* JADX INFO: renamed from: d */
        private static int f25067d = 1;

        /* JADX INFO: renamed from: e */
        static final /* synthetic */ int[] f25068e;

        static {
            int[] iArr = new int[b.values().length];
            f25068e = iArr;
            try {
                iArr[b.f25073e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25068e[b.f25070b.ordinal()] = 2;
                int i2 = f25067d;
                int i3 = (i2 ^ 29) + (((i2 + 29) - (i2 | 29)) << 1);
                f25066a = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25068e[b.f25072d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25068e[b.f25069a.ordinal()] = 4;
                int i5 = f25067d + 41;
                f25066a = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25068e[b.f25071c.ordinal()] = 5;
                int i8 = f25067d;
                int i9 = (i8 ^ 87) + ((i8 & 87) << 1);
                f25066a = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 5 % 3;
                } else {
                    int i11 = 2 % 2;
                }
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25068e[b.f25077i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25068e[b.f25078j.ordinal()] = 7;
                int i12 = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25068e[b.f25074f.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f25068e[b.f25075g.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f25068e[b.f25076h.ordinal()] = 10;
                Runtime.getRuntime().maxMemory();
                Runtime.getRuntime().maxMemory();
                int i13 = 2 % 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f25068e[b.f25082n.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f25068e[b.f25080l.ordinal()] = 12;
                int i14 = f25067d;
                int i15 = (((-1) - (((-1) - i14) & ((-1) - 111))) << 1) - (i14 ^ 111);
                f25066a = i15 % 128;
                if (i15 % 2 != 0) {
                    int i16 = 5 % 4;
                } else {
                    int i17 = 2 % 2;
                }
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f25068e[b.f25079k.ordinal()] = 13;
                int i18 = f25066a;
                int i19 = (((-1) - (((-1) - i18) & ((-1) - 19))) << 1) - (i18 ^ 19);
                f25067d = i19 % 128;
                int i20 = i19 % 2;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public static final class b extends Enum<b> implements o.ea.d<ClickToPayPushCardNotProcessed.ErrorCode> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        public static final b f25069a;

        /* JADX INFO: renamed from: b */
        public static final b f25070b;

        /* JADX INFO: renamed from: c */
        public static final b f25071c;

        /* JADX INFO: renamed from: d */
        public static final b f25072d;

        /* JADX INFO: renamed from: e */
        public static final b f25073e;

        /* JADX INFO: renamed from: f */
        public static final b f25074f;

        /* JADX INFO: renamed from: g */
        public static final b f25075g;

        /* JADX INFO: renamed from: h */
        public static final b f25076h;

        /* JADX INFO: renamed from: i */
        public static final b f25077i;

        /* JADX INFO: renamed from: j */
        public static final b f25078j;

        /* JADX INFO: renamed from: k */
        public static final b f25079k;

        /* JADX INFO: renamed from: l */
        public static final b f25080l;

        /* JADX INFO: renamed from: m */
        private static final /* synthetic */ b[] f25081m;

        /* JADX INFO: renamed from: n */
        public static final b f25082n;

        /* JADX INFO: renamed from: o */
        private static long f25083o = 0;

        /* JADX INFO: renamed from: p */
        private static int f25084p = 0;

        /* JADX INFO: renamed from: q */
        private static int f25085q = 0;

        /* JADX INFO: renamed from: r */
        private static int f25086r = 0;

        /* JADX INFO: renamed from: s */
        private static int f25087s = 0;

        /* JADX INFO: renamed from: t */
        private static int f25088t = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r6, int r7, short r8) {
            /*
                int r0 = r8 * 2
                int r8 = 1 - r0
                int r7 = r7 + 107
                int r0 = r6 * 3
                int r6 = r0 + 4
                byte[] r5 = o.er.m.b.$$a
                byte[] r4 = new byte[r8]
                r3 = 0
                if (r5 != 0) goto L2b
                r2 = r3
                r1 = r6
            L13:
                int r6 = r6 + r7
                int r0 = r1 + 1
                r1 = r2
                r7 = r6
                r6 = r0
            L19:
                int r2 = r1 + 1
                byte r0 = (byte) r7
                r4[r1] = r0
                if (r2 != r8) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L26:
                r0 = r5[r6]
                r1 = r6
                r6 = r0
                goto L13
            L2b:
                r1 = r3
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.m.b.$$c(int, int, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f25087s = 0;
            f25086r = 1;
            f25088t = 0;
            f25085q = 1;
            c();
            Object[] objArr = new Object[1];
            u("ᰠ䏷ᱴ撀ᯨ\uf856ጋ⠌\uf3fe\ue8caΛ㢕썌\ud8ac㈻ॶ틓줼⊽᧦ꈲ㦜勚", ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr);
            f25073e = new b(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            v(34 - (ViewConfiguration.getJumpTapTimeout() >> 16), "\u0000\ufff8\u0001\u0004\uffff\ufff3\u0006\ufffb\u0001\u0000\t\u0004\u0001\u0000\ufff9\u0011\ufff5\u0007\u0005\u0006\u0001\uffff\ufff7\u0004\u0011\u0002\u0004\u0001\ufff8\ufffb\ufffe\ufff7\u0011\ufffb", false, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 199, 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
            f25070b = new b(((String) objArr2[0]).intern(), 1);
            Object[] objArr3 = new Object[1];
            u("奱凿夲췟뇄\uea4e멄舼뚮陼ꫂ銪蘎쪫魥ꍇ鞇\udb22诫돝\ue76e⮚ﮛ䁺\uf4e4㠊\ue803僡쑎ࣾ\ud8af悁헒\u197f줴", 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
            f25072d = new b(((String) objArr3[0]).intern(), 2);
            Object[] objArr4 = new Object[1];
            u("셿诒센焅㳣っڞ༛⺠⃫ᘘᾍḀႆ➿\u2e60ྉď㜱㻺罠\uf1b2䝂쵊泼\ue239哓\uddd0屋틉摨\uedb7䷆썕痩", TextUtils.lastIndexOf("", '0') + 1, objArr4);
            f25069a = new b(((String) objArr4[0]).intern(), 3);
            Object[] objArr5 = new Object[1];
            u("坕\uf052圂쭤柬䯤볣后뢂孹걿䒑蠧欒鷓畩馫窀赓既\ue958訷ﴸ陉響馨", (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr5);
            f25071c = new b(((String) objArr5[0]).intern(), 4);
            Object[] objArr6 = new Object[1];
            u("\ud88f珍\ud8cc鄨㣏졨\ue6b2ଧ㝀\ud8f7\uf63fᮧ߰\ue88c잌⩊ᙸ蘿휒㫟暊", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, objArr6);
            f25077i = new b(((String) objArr6[0]).intern(), 5);
            Object[] objArr7 = new Object[1];
            u("\ue27e퇲\ue23a‘俠機垗簅ය竇䜌沃㴝䪷皢嵨ⲑ嬪是䷿屵ꮓᙔ", 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr7);
            f25078j = new b(((String) objArr7[0]).intern(), 6);
            Object[] objArr8 = new Object[1];
            u("䌭\uf5fc䍩侂㳢乑㠍༇곩廉⢖ᾁ鱎溹ᤸ\u2e6a跂缬ি㻲ﴨ辌秏쵊", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr8);
            f25074f = new b(((String) objArr8[0]).intern(), 7);
            Object[] objArr9 = new Object[1];
            u("밉좦뱍\udddb䙩猋꩔疌反掓뫏攊捪口譡員狦䉷鯱䑧Ȇ닐", ViewConfiguration.getWindowTouchSlop() >> 8, objArr9);
            f25075g = new b(((String) objArr9[0]).intern(), 8);
            Object[] objArr10 = new Object[1];
            v(20 - Process.getGidForName(""), "\u0014\u0001\ufff6\t\ufffe￼\ufffe\ufff9\ufffa\u000b\ufffe\t\ufff8\ufff6\u0003\ufffe\u0014\ufff9\u0007\ufff6\ufff8", true, 196 - ((byte) KeyEvent.getModifierMetaStateMask()), 7 - ExpandableListView.getPackedPositionChild(0L), objArr10);
            f25076h = new b(((String) objArr10[0]).intern(), 9);
            Object[] objArr11 = new Object[1];
            v(((Process.getThreadPriority(0) + 20) >> 6) + 31, "\ufffa\u0012\ufff9\b\u0001\ufff7￼\u0001\ufffa\u0012\u0007\f\u0003\ufff8\ufff7￼\ufffa￼\u0007\ufff4\uffff\u0012\ufff6\ufff4\u0005\ufff7\u0012\n\u0005\u0002\u0001", false, 199 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 15, objArr11);
            f25082n = new b(((String) objArr11[0]).intern(), 10);
            Object[] objArr12 = new Object[1];
            v(Color.rgb(0, 0, 0) + 16777242, "\ufff3\u0006\ufff7\ufff6\ufff5\ufffe\ufffb\ufff5�\u0011\u0006\u0001\u0011\u0002\ufff3\u000b\u0011\u0000\u0001\u0006\u0011\ufff3\ufff5\u0006\ufffb\b", false, 199 - TextUtils.lastIndexOf("", '0'), 4 - KeyEvent.normalizeMetaState(0), objArr12);
            f25080l = new b(((String) objArr12[0]).intern(), 11);
            Object[] objArr13 = new Object[1];
            v((ViewConfiguration.getTapTimeout() >> 16) + 5, "\ufffb\u0007\u0002\u0005\ufff8", true, 198 - TextUtils.lastIndexOf("", '0'), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2, objArr13);
            f25079k = new b(((String) objArr13[0]).intern(), 12);
            f25081m = a();
            int i2 = f25086r + 99;
            f25087s = i2 % 128;
            int i3 = i2 % 2;
        }

        private b(String str, int i2) {
            super(str, i2);
        }

        private static /* synthetic */ b[] a() {
            int i2 = 2 % 2;
            int i3 = f25085q + 109;
            int i4 = i3 % 128;
            f25088t = i4;
            int i5 = i3 % 2;
            b[] bVarArr = {f25073e, f25070b, f25072d, f25069a, f25071c, f25077i, f25078j, f25074f, f25075g, f25076h, f25082n, f25080l, f25079k};
            int i6 = i4 + 25;
            f25085q = i6 % 128;
            if (i6 % 2 != 0) {
                return bVarArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void c() {
            f25083o = 4716643484502141342L;
            f25084p = -1270219423;
        }

        static void init$0() {
            $$a = new byte[]{47, MessagePack.Code.BIN8, Ascii.FS, 43};
            $$b = 83;
        }

        private static void u(String str, int i2, Object[] objArr) throws Throwable {
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $10 + 5;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            Object charArray = str2 != null ? str2.toCharArray() : str2;
            o.a.k kVar = new o.a.k();
            char[] cArrC = o.a.k.c(f25083o ^ (-5882309809461882246L), (char[]) charArray, i2);
            kVar.f19939c = 4;
            int i6 = $10 + 39;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            while (kVar.f19939c < cArrC.length) {
                kVar.f19938a = kVar.f19939c - 4;
                int i8 = kVar.f19939c;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f25083o)};
                    Object objA = o.d.d.a(-1093976004);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 229, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 51003), TextUtils.indexOf("", "", 0, 0) + 9, 1749983833, false, $$c(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {kVar, kVar};
                    Object objA2 = o.d.d.a(-912105096);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        objA2 = o.d.d.a((ViewConfiguration.getPressedStateDuration() >> 16) + 675, (char) KeyEvent.getDeadChar(0, 0), View.getDefaultSize(0, 0) + 12, 522683165, false, $$c(b4, (byte) (7 | b4), b4), new Class[]{Object.class, Object.class});
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
            objArr[0] = new String(cArrC, 4, cArrC.length - 4);
        }

        private static void v(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
            String str2 = str;
            int i5 = 2 % 2;
            char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
            o.a.n nVar = new o.a.n();
            char[] cArr2 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i6 = $11 + 35;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                nVar.f19946e = cArr[nVar.f19944a];
                cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
                int i8 = nVar.f19944a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f25084p)};
                    Object objA = o.d.d.a(1376241034);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(270 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 11 - TextUtils.getOffsetBefore("", 0), -2071844881, false, $$c(b2, (byte) ((b2 + 8) - (8 & b2)), b2), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {nVar, nVar};
                    Object objA2 = o.d.d.a(-202660535);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a(TextUtils.indexOf("", "", 0) + 522, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 627984172, false, $$c(b3, (byte) ((b3 + 6) - (6 & b3)), b3), new Class[]{Object.class, Object.class});
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
                int i9 = $11 + 101;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                nVar.f19945b = i4;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
                System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
            }
            if (z2) {
                char[] cArr4 = new char[i2];
                nVar.f19944a = 0;
                while (nVar.f19944a < i2) {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = o.d.d.a(KeyEvent.getDeadChar(0, 0) + 522, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), TextUtils.getOffsetBefore("", 0) + 12, 627984172, false, $$c(b4, (byte) (6 | b4), b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                }
                int i11 = $10 + 21;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr2 = cArr4;
            }
            String str3 = new String(cArr2);
            int i13 = $11 + 37;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            objArr[0] = str3;
        }

        public static b valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f25085q + 31;
            f25088t = i3 % 128;
            int i4 = i3 % 2;
            b bVar = (b) Enum.valueOf(b.class, str);
            int i5 = f25085q + 17;
            f25088t = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 73 / 0;
            }
            return bVar;
        }

        public static b[] values() {
            int i2 = 2 % 2;
            int i3 = f25085q + 87;
            f25088t = i3 % 128;
            int i4 = i3 % 2;
            b[] bVarArr = f25081m;
            if (i4 == 0) {
                return (b[]) bVarArr.clone();
            }
            b[] bVarArr2 = (b[]) bVarArr.clone();
            int i5 = 51 / 0;
            return bVarArr2;
        }

        public final ClickToPayPushCardNotProcessed.ErrorCode b() throws Throwable {
            int i2 = 2 % 2;
            switch (AnonymousClass4.f25068e[ordinal()]) {
                case 1:
                    return ClickToPayPushCardNotProcessed.ErrorCode.TECHNICAL_SRC_ERROR;
                case 2:
                    return ClickToPayPushCardNotProcessed.ErrorCode.WRONG_CUSTOMER_PROFILE_INFORMATION;
                case 3:
                    return ClickToPayPushCardNotProcessed.ErrorCode.CUSTOMER_PROFILE_ALREADY_EXISTS;
                case 4:
                    return ClickToPayPushCardNotProcessed.ErrorCode.CUSTOMER_PROFILE_DOES_NOT_EXIST;
                case 5:
                    return ClickToPayPushCardNotProcessed.ErrorCode.WRONG_CARD_INFORMATION;
                case 6:
                    ClickToPayPushCardNotProcessed.ErrorCode errorCode = ClickToPayPushCardNotProcessed.ErrorCode.CARD_NOT_ELIGIBLE;
                    int i3 = f25088t + 79;
                    f25085q = i3 % 128;
                    int i4 = i3 % 2;
                    return errorCode;
                case 7:
                    return ClickToPayPushCardNotProcessed.ErrorCode.DIGITAL_CARD_LOCKED;
                case 8:
                    return ClickToPayPushCardNotProcessed.ErrorCode.DIGITAL_CARD_DELETED;
                case 9:
                    return ClickToPayPushCardNotProcessed.ErrorCode.DIGITAL_CARD_ERROR;
                case 10:
                    return ClickToPayPushCardNotProcessed.ErrorCode.DIGITAL_CARD_INACTIVE;
                case 11:
                    return ClickToPayPushCardNotProcessed.ErrorCode.DIGITAL_CARD_WRONG_FUNDING_TYPE;
                case 12:
                    return ClickToPayPushCardNotProcessed.ErrorCode.CLICK_TO_PAY_NOT_ACTIVATED;
                case 13:
                    return ClickToPayPushCardNotProcessed.ErrorCode.OTHER;
                default:
                    if (o.ea.f.a()) {
                        String str = m.f25057c;
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr = new Object[1];
                        u("髪쩔骿\ud8fd맑燞꽐訅甊慅뿆骙䖯儴踵ꭋ吻䂬黰믨⒐끐", TextUtils.indexOf("", "", 0, 0), objArr);
                        o.ea.f.b(str, sb.append(((String) objArr[0]).intern()).append(name()).toString());
                        int i5 = f25088t + 9;
                        f25085q = i5 % 128;
                        int i6 = i5 % 2;
                    }
                    return ClickToPayPushCardNotProcessed.ErrorCode.OTHER;
            }
        }

        @Override // o.ea.a
        public final /* synthetic */ Object e() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f25085q + 69;
            f25088t = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                b();
                obj.hashCode();
                throw null;
            }
            ClickToPayPushCardNotProcessed.ErrorCode errorCodeB = b();
            int i4 = f25085q + 7;
            f25088t = i4 % 128;
            if (i4 % 2 == 0) {
                return errorCodeB;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, byte r9, byte r10) {
        /*
            int r8 = r8 * 2
            int r1 = r8 + 1
            int r0 = r9 * 2
            int r7 = r0 + 117
            byte[] r6 = o.er.m.$$a
            int r0 = r10 * 2
            int r0 = 3 - r0
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r6 != 0) goto L2a
            r1 = r0
            r3 = r4
        L15:
            int r7 = r7 + r0
            r0 = r1
            r2 = r3
        L18:
            byte r1 = (byte) r7
            r5[r2] = r1
            int r3 = r2 + 1
            if (r2 != r8) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            int r1 = r0 + 1
            r0 = r6[r1]
            goto L15
        L2a:
            r2 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.m.$$c(short, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25060g = 0;
        f25061h = 1;
        f25062j = 0;
        f25059f = 1;
        h();
        Object[] objArr = new Object[1];
        i(new int[]{-516791225, 1094660033, -759459413, 1272083445, -856580712, -435664179, 1165824113, -1282789861, 1024228301, 432152462, -599172011, 962545397, 580921128, -722949154, 1100906248, 1827958173, 390650109, -74292091}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 34, objArr);
        f25057c = ((String) objArr[0]).intern();
        int i2 = f25061h + 73;
        f25060g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
    }

    public m(String str, String str2, b bVar) {
        this.f25063a = str;
        this.f25065e = str2;
        this.f25064b = bVar;
    }

    static void h() {
        f25058d = new int[]{1594884599, 579631357, -333900637, 1404140986, 690062286, 1415888586, 1306237525, -1841542623, 1195760329, 495338248, -349581255, 2029352496, 938090947, -731920877, 482966889, -438091178, 733878700, 746877329};
    }

    private static void i(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        o.a.l lVar = new o.a.l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f25058d;
        long j2 = 0;
        int i4 = 989264422;
        int i5 = 16;
        int i6 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = 0;
            while (i7 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 2);
                        objA = o.d.d.a((ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1)) + 676, (char) Color.red(0), (ViewConfiguration.getScrollBarFadeDuration() >> i5) + 12, -328001469, false, $$c(b2, b3, (byte) (b3 - 2)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i7++;
                    int i8 = $11 + 41;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    j2 = 0;
                    i4 = 989264422;
                    i5 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = f25058d;
        if (iArr6 != null) {
            int i10 = $10 + 35;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i11 = 0;
            while (i11 < length) {
                Object[] objArr3 = {Integer.valueOf(iArr6[i11])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) i6;
                    byte b5 = (byte) (b4 + 2);
                    objA2 = o.d.d.a(675 - ((Process.getThreadPriority(i6) + 20) >> 6), (char) TextUtils.indexOf("", "", i6, i6), 12 - (KeyEvent.getMaxKeyCode() >> 16), -328001469, false, $$c(b4, b5, (byte) (b5 - 2)), new Class[]{Integer.TYPE});
                }
                iArr2[i11] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i11++;
                i6 = 0;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, i6, iArr5, i6, length3);
        lVar.f19941d = i6;
        while (lVar.f19941d < iArr.length) {
            cArr[i6] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            o.a.l.a(iArr5);
            int i12 = $11 + 85;
            $10 = i12 % 128;
            int i13 = 2;
            int i14 = i12 % 2;
            int i15 = 0;
            while (i15 < 16) {
                int i16 = $11 + 1;
                $10 = i16 % 128;
                int i17 = i16 % i13;
                lVar.f19942e ^= iArr5[i15];
                Object[] objArr4 = {lVar, Integer.valueOf(o.a.l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objA3 = o.d.d.a(301 - TextUtils.getOffsetBefore("", 0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 52698), (ViewConfiguration.getPressedStateDuration() >> 16) + 11, -1416256172, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i15++;
                i13 = 2;
            }
            int i18 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i18;
            lVar.f19940a ^= iArr5[16];
            lVar.f19942e ^= iArr5[17];
            int i19 = lVar.f19942e;
            int i20 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            o.a.l.a(iArr5);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = o.d.d.a(986820978);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a(229 - Gravity.getAbsoluteGravity(0, 0), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 51004), 8 - Process.getGidForName(""), -330018025, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            i6 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void init$0() {
        $$a = new byte[]{97, 98, -19, -80};
        $$b = 169;
    }

    public final b a() {
        b bVar;
        int i2 = 2 % 2;
        int i3 = f25059f + 21;
        int i4 = i3 % 128;
        f25062j = i4;
        if (i3 % 2 != 0) {
            bVar = this.f25064b;
            int i5 = 35 / 0;
        } else {
            bVar = this.f25064b;
        }
        int i6 = i4 + 27;
        f25059f = i6 % 128;
        if (i6 % 2 != 0) {
            return bVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f25062j;
        int i4 = i3 + 7;
        f25059f = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f25063a;
        int i5 = i3 + 75;
        f25059f = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String c() {
        String str;
        int i2 = 2 % 2;
        int i3 = f25059f;
        int i4 = i3 + 109;
        f25062j = i4 % 128;
        if (i4 % 2 != 0) {
            str = this.f25065e;
            int i5 = 11 / 0;
        } else {
            str = this.f25065e;
        }
        int i6 = i3 + 43;
        f25062j = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final ClickToPayPushCardNotProcessed d() {
        int i2 = 2 % 2;
        ClickToPayPushCardNotProcessed clickToPayPushCardNotProcessed = new ClickToPayPushCardNotProcessed(this);
        int i3 = f25062j + 5;
        f25059f = i3 % 128;
        int i4 = i3 % 2;
        return clickToPayPushCardNotProcessed;
    }

    @Override // o.ea.a
    public final /* synthetic */ ClickToPayPushCardNotProcessed e() {
        int i2 = 2 % 2;
        int i3 = f25062j + 23;
        f25059f = i3 % 128;
        int i4 = i3 % 2;
        ClickToPayPushCardNotProcessed clickToPayPushCardNotProcessedD = d();
        int i5 = f25062j + 59;
        f25059f = i5 % 128;
        if (i5 % 2 != 0) {
            return clickToPayPushCardNotProcessedD;
        }
        throw null;
    }
}
