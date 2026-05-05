package fr.antelop.sdk.transaction.hce;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.iptc.IptcDirectory;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.j;
import o.a.o;
import o.dp.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class HceTransactionStep {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    public static int A = 0;
    public static int B = 0;
    public static int C = 0;
    public static int D = 0;
    public static int E = 0;
    public static final int TRANSACTION_FIRST_STEP_INDEX = 0;
    public static final int TRANSACTION_LAST_STEP_INDEX = 5;

    /* JADX INFO: renamed from: a */
    private static int f19553a = 0;

    /* JADX INFO: renamed from: b */
    private static int f19554b = 0;

    /* JADX INFO: renamed from: c */
    private static byte[] f19555c = null;

    /* JADX INFO: renamed from: d */
    private static short[] f19556d = null;

    /* JADX INFO: renamed from: e */
    private static int f19557e = 0;

    /* JADX INFO: renamed from: f */
    private static int f19558f = 0;

    /* JADX INFO: renamed from: g */
    private static char[] f19559g = null;

    /* JADX INFO: renamed from: h */
    private static int f19560h = 0;

    /* JADX INFO: renamed from: i */
    private static int f19561i = 0;

    /* JADX INFO: renamed from: j */
    private static long f19562j = 0;

    /* JADX INFO: renamed from: k */
    private static int f19563k = 0;

    /* JADX INFO: renamed from: l */
    public static int f19564l = 0;

    /* JADX INFO: renamed from: m */
    public static int f19565m = 0;

    /* JADX INFO: renamed from: n */
    public static int f19566n = 0;

    /* JADX INFO: renamed from: o */
    public static int f19567o = 0;

    /* JADX INFO: renamed from: p */
    public static int f19568p = 0;

    /* JADX INFO: renamed from: q */
    public static int f19569q = 0;

    /* JADX INFO: renamed from: r */
    public static int f19570r = 0;

    /* JADX INFO: renamed from: s */
    public static int f19571s = 0;

    /* JADX INFO: renamed from: t */
    public static int f19572t = 0;

    /* JADX INFO: renamed from: u */
    public static int f19573u = 0;

    /* JADX INFO: renamed from: v */
    public static int f19574v = 0;

    /* JADX INFO: renamed from: w */
    public static int f19575w = 0;

    /* JADX INFO: renamed from: x */
    public static int f19576x = 0;

    /* JADX INFO: renamed from: y */
    public static int f19577y = 0;

    /* JADX INFO: renamed from: z */
    public static int f19578z = 0;
    private final d innerStep;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(short r6, byte r7, short r8) {
        /*
            int r0 = r7 * 2
            int r7 = r0 + 4
            int r1 = r6 * 2
            int r0 = 1 - r1
            int r6 = r8 + 99
            byte[] r5 = fr.antelop.sdk.transaction.hce.HceTransactionStep.$$c
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r5 != 0) goto L29
            r0 = r2
            r1 = r3
        L15:
            int r0 = -r0
            int r6 = r6 + r0
            int r7 = r7 + 1
        L19:
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r1 != r2) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            int r1 = r1 + 1
            r0 = r5[r7]
            goto L15
        L29:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.transaction.hce.HceTransactionStep.$$e(short, byte, short):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        E = -199839956;
        D = 1500239514;
        C = -906636804;
        B = -435547617;
        A = 1787157877;
        f19578z = -15347117;
        f19577y = -551034825;
        f19576x = 2143468269;
        f19575w = -876483803;
        f19574v = -1023292125;
        f19573u = -1252444269;
        f19572t = -603047672;
        f19571s = -858131260;
        f19570r = -63894484;
        f19569q = -696027820;
        f19568p = -2056823795;
        f19567o = -2080184089;
        f19566n = -861678507;
        f19565m = -718899852;
        f19564l = -1136425982;
        init$0();
        f19560h = 0;
        f19563k = 1;
        f19558f = 0;
        f19561i = 1;
        e();
        f19553a = -1478144952;
        f19554b = 1150422525;
        f19557e = -1900406684;
        f19555c = new byte[]{-114, 118, -98, 120, 122, -123, -123, -115, -115, -115, -115};
        int i2 = f19560h + 111;
        f19563k = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public HceTransactionStep(d dVar) {
        this.innerStep = dVar;
    }

    private static void F(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        boolean z2;
        int i5 = 2;
        int i6 = 2 % 2;
        j jVar = new j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f19554b)};
            Object objA = o.d.d.a(-727631768);
            if (objA == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objA = o.d.d.a((ViewConfiguration.getFadingEdgeLength() >> 16) + 238, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44531), 11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 35969549, false, $$e(b3, b4, (byte) (b4 + 5)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 != 0) {
                int i8 = $11 + 107;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = f19555c;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = $10 + 25;
                        $11 = i10 % 128;
                        if (i10 % i5 == 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objA2 = o.d.d.a(-1239398195);
                            if (objA2 == null) {
                                byte b5 = (byte) 0;
                                objA2 = o.d.d.a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + IptcDirectory.TAG_COPYRIGHT_NOTICE, (char) (Color.argb(0, 0, 0, 0) + 28649), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, 1621469864, false, $$e(b5, b5, (byte) $$c.length), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                            i9 >>>= 1;
                            i5 = 2;
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i9])};
                            Object objA3 = o.d.d.a(-1239398195);
                            if (objA3 == null) {
                                byte b6 = (byte) 0;
                                objA3 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0') + 629, (char) (Color.blue(0) + 28649), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, 1621469864, false, $$e(b6, b6, (byte) $$c.length), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objA3).invoke(null, objArr4)).byteValue();
                            i9++;
                            i5 = 2;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = f19555c;
                    Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(f19553a)};
                    Object objA4 = o.d.d.a(-727631768);
                    if (objA4 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objA4 = o.d.d.a((ViewConfiguration.getScrollBarSize() >> 8) + 238, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44531), 11 - View.combineMeasuredStates(0, 0), 35969549, false, $$e(b7, b8, (byte) (b8 + 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA4).invoke(null, objArr5)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f19554b) ^ (-7649639543924978291L))));
                } else {
                    iIntValue = (short) (((short) (((long) f19556d[i2 + ((int) (((long) f19553a) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f19554b) ^ (-7649639543924978291L))));
                }
            }
            if (iIntValue > 0) {
                jVar.f19936d = ((i2 + iIntValue) - 2) + ((int) (((long) f19553a) ^ (-7649639543924978291L))) + i7;
                Object[] objArr6 = {jVar, Integer.valueOf(i3), Integer.valueOf(f19557e), sb};
                Object objA5 = o.d.d.a(1819197256);
                if (objA5 == null) {
                    objA5 = o.d.d.a((-1) - MotionEvent.axisFromString(""), (char) (Color.green(0) + 5358), 11 - ((Process.getThreadPriority(0) + 20) >> 6), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA5).invoke(null, objArr6)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr4 = f19555c;
                if (bArr4 != null) {
                    int i11 = $10 + 85;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i13 = 0;
                    while (i13 < length2) {
                        int i14 = $11 + 55;
                        $10 = i14 % 128;
                        if (i14 % 2 != 0) {
                            bArr5[i13] = (byte) ((-1) - (((-1) - ((long) bArr4[i13])) | ((-1) - (-7649639543924978291L))));
                        } else {
                            bArr5[i13] = (byte) (((long) bArr4[i13]) ^ (-7649639543924978291L));
                            i13++;
                        }
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i15 = $10 + 117;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = f19555c;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        short[] sArr = f19556d;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    }
                    sb.append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    jVar.f19934b++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void G(int i2, char c2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $10 + 101;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f19559g[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(742 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), Process.getGidForName("") + 13, 632508977, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f19562j), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(TextUtils.getTrimmedLength("") + 766, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 12470), 12 - Color.green(0), 1946853218, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(387 - View.getDefaultSize(0, 0), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 18 - View.MeasureSpec.getSize(0), 39570797, false, $$e(b6, b7, (byte) (6 | b7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i8 = $10 + 41;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 2 % 4;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a(Color.argb(0, 0, 0, 0) + 387, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 19 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 39570797, false, $$e(b8, b9, (byte) ((b9 + 6) - (6 & b9))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void H(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 97
            int r0 = r6 * 3
            int r6 = 4 - r0
            int r1 = r8 * 3
            int r0 = 1 - r1
            byte[] r5 = fr.antelop.sdk.transaction.hce.HceTransactionStep.$$a
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r5 != 0) goto L2b
            r7 = r6
            r0 = r2
            r1 = r3
        L16:
            int r6 = r6 + 1
            int r7 = r7 + r0
        L19:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r2) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r9[r3] = r0
            return
        L26:
            r0 = r5[r6]
            int r1 = r1 + 1
            goto L16
        L2b:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.transaction.hce.HceTransactionStep.H(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:449:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0ba4  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0c65  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x10fe  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x173d  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x2146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] d(android.content.Context r39, int r40, int r41, int r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.transaction.hce.HceTransactionStep.d(android.content.Context, int, int, int):java.lang.Object[]");
    }

    static void e() {
        char[] cArr = new char[1886];
        ByteBuffer.wrap("?P;/7r3\u0095/\u0080*\u001c&(\"\u007f\u001e»\u001aÍ\u0015\u001e\u00110\rg\t\u0084\u0005Æ\u0000\u0017|[xyt²pÐk\u001cgdct_£[þV\bRR3¼7Ã;\u009e?y#l&ð*Ä.\u0093\u0012W\u0016!\u0019ò\u001dÜ\u0001\u008b\u0005h\t;\föp£t\u0082xd|+gók¥o\u0088SKW\u0017\u0094Ý\u0090¢\u009cÿ\u0098\u0018\u0084\r\u0081\u0091\u008d¥\u0089òµ6±@¾\u0093º½¦ê¢\t®Y«\u0087×ÜÓå\u0094Ý\u0090µ\u009cã\u0098\u001d\u0084\r\u0081\u009b\u008d¥\u0089úµ'±J¾\u009fºá¦å¢9®F«\u009a×ÔÓïß)ÛFÀ½ÌÔÈëô*ðfý\u0083ùÈå÷\u0094Ý\u0090£\u009cî\u0098\r\u0084\r\u0081\u0092\u008d\u00ad\u0089°µ\"±T¾\u0095º¾\u009b¨\u009fÖ\u0093\u009b\u0097x\u008bx\u008eð\u0082Ö\u0086\u0086º\t¾#±ýµÔ©\u0087&H\" .k*\u00986Ö3\u0011?;;$\u0007\u0095\u0003õ\f\"\b4\u0014a\u0010¦\u001cû\u0019\neSar\u0094Ý\u0090µ\u009cã\u0098\u001d\u0084V\u0081\u0093\u008d§\u0089±µ>±O¾\u0098ºá¦î¢?®H«\u0090×ÐÓ¨ß)ÛA\u008d\"\u0089\u001d\u0085O\u0081²\u009dÿ\u0098<\u0094®\u0090\u0087\u0094Ý\u0090µ\u009cã\u0098\u001d\u0084V\u0081\u0093\u008d§\u0089±µ0±O¾\u0094ºá¦ì¢3®G«\u008b×äÓËßwÛ@À\u0087ÌÛÈÿôsðqý\u0089ùÔåúá0íyê\u0086¶Û²³¾åº\u001b¦P£\u0095¯¡«·\u00976\u0093I\u009c\u0092\u0098ç\u0084ê\u00805\u008cA\u0089\u008dõâñÍýqùXâ\u0096îßêü\u0094Ý\u0090µ\u009cã\u0098\u001d\u0084V\u0081\u0093\u008d§\u0089±µ>±O¾\u0098ºá¦î¢?®H«\u0090××Óëß/ÛxÀ¯ÌÆÈøô1ðbýÈùÉåá\u0094Ý\u0090¢\u009cÿ\u0098\u0018\u0084\r\u0081\u0098\u008d¯\u0089óµ'±A¾\u008fº«¦ñ¢\"\u0094\u0080\u0090©\u009c´\u0098\f\u0084W\u0081\u009f\u008d¦\u0089úµ|±N¾\u0095º½¦ö\u0094\u009c\u0090£\u009cû\u0098\u001d\u0084G\u0081Ø\u008d¤\u0089ûµ&\u0094Ý\u0090¶\u009cè\u0098\u0001\u0084A\u0081Ù\u008d¬\u0089÷µ>±C¾\u0089º·¦ñ¢\"®O«\u0093×Á\u0094\u009c\u0090£\u009c÷\u0098\u001b\u0084Q\u0081\u0090\u0094\u0080\u0090©\u009c´\u0098\u001e\u0084P\u0081\u0099\u008d®\u0089ëµ1±R¾Ôº£¦ã¢8®_«\u0098×ÓÓåß.Û[À\u0090ÌÓÈø\u0085\u008a\u0081¼\u008dë\u0089\bý~ù_õ\u0014ñáí·èyäBàLÜÝØ£×uÓ\u001cÏ\u001cËÎÇøÂf¾+º\u0018¶Ó²µ©0¥-¡\u0006\u009d×\u0099À\u0094|\u0090'\u008c\u0019\u0088Û\u0084µ\u0083q\u007f2{ûwås\u0094nwj0fîbÓ^\u0090UKQ(\u0094\u0082\u0090£\u009cè\u0098\u001d\u0084K\u0081\u0085\u008d¾\u0089°µ!±_¾\u0089ºà¦à¢2®\u0004«\u009a××Óäß/ÛIÀÌÌÑÈúô+ð<ý\u0080ùÛååá'íIê\u008d\u0016Î\u0012\u0007\u001e\u0019\u001al\u0007\u008b\u0003Ì\u000f\u0012\u000b%7l\u0091È\u0095é\u0099¢\u009dW\u0081\u0001\u0084Ï\u0088ô\u008cú°k´\u0015»Ã¿ª£ª§x«N®ÐÒ\u009dÖ®ÚeÞ\u0003Å\u0086É\u008eÍ¯ñ:õ;øÝü\u0099\u0094\u0082\u0090£\u009cè\u0098\u001d\u0084K\u0081\u0085\u008d¾\u0089°µ!±_¾\u0089ºà¦à¢2®\u0004«\u009a××Óäß/ÛIÀÌÌÄÈåôpð~ý\u0087ùÙ\u0094\u0082\u0090£\u009cè\u0098\u001d\u0084K\u0081\u0085\u008d¾\u0089°µ!±_¾\u0089ºà¦à¢2®\u0004«\u009a××Óäß/ÛIÀÌÌÄÈåôpð\u007fý\u0085ùÙr\u009av»zð~\u0005bSg\u009dk¦o¨S9WGX\u0091\\ø@øD*H\u001cM\u00821Ï5ü97=Q&Ô*Ü.ý\u0012h\u0016g\u001b\u0090\u001fÁµ)±\t½X¹»¥ü =\u0094Ý\u0090¶\u009cè\u0098\u0001\u0084A\u0081Ù\u008d§\u0089ñµ6±S¾\u0096º«¦ñ\u0094\u0084\u0090¤\u009cõ\u0098\u0016\u0084E\u0081\u0083\u008d¯\u0089íµ&\u0094µ\u0090£\u009cô\u0098\u0017\u0084O\u0081\u0099\u008d¾\u0089÷µ=±HRIVfZ?^ÎB\u0083GOKjW\u009bS¤_â[\u000bGEB\u0095NµJù\nÔ\u000eý\u0002à\u0006J\u001a\u0004\u001fÍ\u0013ú\u0017¿+e/\u0006 \u0080$þ8³<t0\u00175ÉI\u0083PLTlX=\\Þ@ÒE\bIr\u0094\u0095\u0090£\u009cô\u0098\u000b\u0084P\u0081\u009f\u008d©\u0087\u0093\u0083¥\u008fò\u008b\r\u0097V\u0092\u0099\u009e¯\u009aÇ¦,¢\u0018\u00adÊ\u0094\u0095\u0090£\u009cô\u0098\u000b\u0084P\u0081\u009f\u008d©\u0089Áµ*±\u001e¾Ìº\u0091¦´¢b\u0094\u0080\u0090©\u009c´\u0098\u001e\u0084P\u0081\u0099\u008d®\u0089ëµ1±R¾Ôº£¦í¢2®O«\u0092\u0094\u0081\u0090¢\u009cñeWaRm\u000eiªu\u0094pg|@x\u000eDß@¯O{K\nW\u0000SÝ_¼Z:&\u0015\"\n.Ì*¥1k=7§b£y¯/«Í·\u009c²N¾\u007fºo\u0086Ð\u0082³\u008d`\u0089?\u00951\u0091ò\u009d\u0092\u0098Cä\u0017àwìíè\u0090óAÿGû#Ç·Ãõ\u0094³\u0090¨\u009cþ\u0098\u001c\u0084M\u0081\u009f\u008d®\u0089¾µ\u0001±b¾±ºî¦à¢#®C«\u0092×ÆÓ¦ß<ÛAÀ\u0090Ì\u0096Èòôfð$ý¹ù\u008cåºþ\u0012ú;ö&ò\u0094îÑë\u0016ç<ã{ß¡ÛÆÔ\r:->\u00112N6²*ü/'#\u0001'N6º2\u009a>Ë:(&$#þ\u0094\u0080\u0090§\u009cô\u0098\r\u0084J\u0081\u0083\u00872\u0083\u001b\u008f\u0006\u008b¬\u0097â\u0092+\u009e\u001c\u009aY¦\u0083¢à\u00adf©\u001eµB±\u0085½ö¸(\u0094\u0080\u0090©\u009c´\u0098\u0005\u0084G\u0081\u0084\u008d¤\u0089ûµ>±\b¾\u008bº«¦ï¢#\u0094\u0080\u0090©\u009c´\u0098\u001d\u0084G\u0081\u0095\u008d¿\u0089ìµ7Ä¶À\u009fÌ\u0082È:ÔaÑ©Ý\u0090ÙÌåJá`î¾ê\u0097öÐò\u0015þ\u007fû¼\u0094\u0094\u0090³\u009cö\u0098\u0002\u0084}\u0081\u008e\u008dò\u0089¨É\u0081Í¨ÁµÅ\rÙVÜ\u009eÐ§Ôûè}ìAã\u0092ç¡ûäÿ2óYö\u008f\u008aÁ\u008eî\u00825\u0086[\u0094\u0095\u0090£\u009cô\u0098\u000b\u0084P\u0081\u009f\u008d©\u0089±µ!±B¾\u0091ºá¦å¢3®D«\u009b×ÀÓïß9\ng\u000eQ\u0002\u0006\u0006ù\u001a¢\u001fm\u0013[\u00173+Ø/ì >$\u00138\u0003<À0³5SI8MLA\u009eEó^wR!V\u0016jÉn\u0092c}g+{#\u007fÈsÜt.\u0014x\u0010N\u001c\u0019\u0018æ\u0004½\u0001r\rD\t\\5Ø1¤>x:D&\u0003\"Þ.\u0098+`W;S\u0000_\u0098[¤@jL5H\u0002tÁp\u0096}hsUwc{4\u007fËc\u0090f_jinqRäV\u0084YU]vAzE I\u009aL\u00110\u00044$8õ<\u0096'\u001a+@/:K|O@C\u001cGà[§^zR\fV\u0004jßn¤aLe@y\u001b}×q¬ty\b>\f0\u0000Ë\u0004ÿ\u001f=\u0013p\u0017\u0004+Ò/\u0095\"j&!:\u000e>È2 5{ÉoÍ\u00ad\u0094\u0080\u0090©\u009c´\u0098\f\u0084M\u0081\u0099\u008d¾\u0089òµ=±G¾\u009eº«¦ðø¢ü\u008bð\u0096ô.èoí»á\u009cåÕÙ\u001dÝeÒ¿Ö\u0089Ê\u008eÎ\u0016Â}Çµ»ü¿À³V·j¬© ú¤Ï\u0098\u0019\u009cB\u0091´\u0095ê\u0089Å\u008d\u000e\u0081@\u007f§{¼wês\boYj\u008bfºb§^>Z\nUØç\u008aã£ï¾ë\u0006÷]ò\u0095þ¬úðÆvÂHÍ\u0099É·ÕøÑ0ÝAØ\u008d¤\u0096 å¬4\u0094\u0086\u0090£\u009cé\u0098\u001a\u0084\u000f\u0010g\u0014T\u0018\u000f\u001cæ\u0000ð\u0005y\t@\r\u00011\u00805«:c>_\"\u000b&\u0087*¦/pS!W\n[Õ°}´]¸\t¼å ò¥`©C\u00adN\u0091Á\u0095¹\u009am\u009e^\u0082\u0017\u0086Í\u008a\u00ad\u008fs¾Rºr¶&²Ê®Ý«T§}£a\u009få\u009b\u0096\u0094@\u0090z\u008c\f\u0088ä\u0084\u009a\u0081Bý\u0006ù%õêÄ\u0015À5ÌaÈ\u008dÔ\u009aÑ\u0013Ý:Ù&å¨áÓî\bê\u0007öpò¥þÒû\u001b\u0087M\u0083d\u008fµ\u001b2\u001f\u001b\u0013\u0006\u0017·\u000bõ\u000e6\u0002\u0016\u0006I:\u008c>º1)5\u0012)T-\u0096!÷$%Xd\\\u001aP\u0099TùO=CqG\\\u0094\u0080\u0090©\u009c´\u0098\f\u0084M\u0081\u0099\u008d¾\u0089°µ#±C¾\u0097º»¦¬¢7®\\«\u009a×íÓèß;ÛCÀ\u0087_¬[\u0085W\u0098S-OjJ·FÈBÐ~\u000bzcuºq\u0086m\u0080i\u001ceo`¼\u001cù\u0018Ï\u0014\u0004\u0010r\u000b¼\u0007ó\u0003È?\u0006?\u000b;\"7?3\u0095/Û*\u0012&%\"`\u001eº\u001aÙ\u0015_\u0011'\r|\t´\u0005Í\u0000\u0011|\u0017xkt¸pËk\u000egXcs_¥[ëV\u0004R_Nq\u009b&\u009f\u000f\u0093\u0012\u0097»\u008bý\u008e#\u0082\u0018\u0086]º\u0099¾®±>µ\u001d©M\u00ad\u009c¡è¤vØrÜIÐ\u0092ÔïÏ!ÃbÇ\\û\u008aÿÝò.öhþ#ú\nö\u0017ò¾îøë&ç\u001dãXß\u009cÛÚÔ<Ð\u0015ÌUÈÛÄëÁ(½x¹Iµ\u009d±£ª'¦|¢G\u009e\u009a\u009aÔ\u00977\u0093i\u008f_\u008b\u0088\u0087Û\u0080=\u0094\u0080\u0090©\u009c´\u0098\u0018\u0084G\u0081\u0098\u008d®\u0089ñµ ±\b¾\u0098º»¦ë¢:®N«Ð×ÔÓïß4ÛIÀ\u0087ÌÄÈúô,ð{ý\u0088ùÎ\u0094\u0080\u0090©\u009c´\u0098\u0018\u0084G\u0081\u0098\u008d®\u0089ñµ ±y¾\u009eº¢¦é¢;®\u0004«\u009c×ÇÓïß6ÛJÀÌÌÐÈãô0ðuý\u0083ùÈåþá0í\u007fê\u0084\u0016Ê\u0094Ý\u0090¢\u009cÿ\u0098\u0018\u0084\r\u0081\u0087\u008d¯\u0089óµ'±y¾\u008aº§¦ò¢3\u0094Ý\u0090¢\u009cÿ\u0098\u0018\u0084\r\u0081\u0085\u008d¥\u0089ýµ9±C¾\u008eºá¦à¢7®Y«\u009b×ÐÓçß4ÛJÀ½ÌÑÈïô0ðký\u0082»\u0000¿\u007f³\"·Å«Ð®X¢x¦ \u009aä\u009e\u009e\u0091S\u0095<\u00898\u008dî\u0081\u0099\u0084Zø\u000b\u0094Ý\u0090¢\u009cÿ\u0098\u0018\u0084\r\u0081\u0085\u008d¥\u0089ýµ9±C¾\u008eºá¦ó¢3®G«\u008b×ÖBñF\u0099JÏN1R!W«[\u0083_ßc\u000bgUh¢l\u0090pÏt\u0019xccbg\nk\\o¢sév,z\u0018~\u000eB\u0081FðI'M^QQU\u0080Y÷\\\" R$T(\u0084,ý71;f?V\u0003¾\u0007É\n<\u000eg\u0012D\u0016\u009a\u001aö\u001d$ádå é\u008cí\u008bð\"ôrH\u0005Lz@'DÀXÕ]LQaU2iÕm\u0099bRfe\u009dV\u0099)\u0095t\u0091\u0093\u008d\u0086\u0088\u001f\u00842\u0080a¼\u0086¸Ù·\u0018³(¯l\u0094Ý\u0090¢\u009cÿ\u0098\u0018\u0084\r\u0081\u0085\u008d¥\u0089ýµ9±C¾\u008eºá¦à¢%®^«\u0098×ÝÓêß>ÛKÀ\u0090ÌÒ\u0094Ý\u0090µ\u009cã\u0098\u001d\u0084V\u0081\u0093\u008d§\u0089±µ>±O¾\u0098ºá¦î¢?®H«\u009c×ÁÓòß<ÛAÀ\u008eÌÒÈïô,ðMý\u008cùÔåçálíeê\u0085\u0094Ý\u0090¢\u009cÿ\u0098\u0018\u0084\r\u0081\u0094\u008d¹\u0089êµ3±E¾\u0099º«\u0098±\u009cÎ\u0090\u0093\u0094t\u0088a\u008dø\u0081Õ\u0085\u0086¹Y½3²ä¶Í\u0094Ý\u0090¢\u009cÿ\u0098\u0018\u0084\r\u0081\u0094\u008d¹\u0089êµ?±C¾\u009dº ,½(Â$\u009f x<m9ô5Ù1\u008a\r]\t4\u0006ó\u0002Ë\u0094Ý\u0090¢\u009cÿ\u0098\u0018\u0084\r\u0081\u0094\u008d¹\u0089êµ$±K¾\u0089º©ÙÂÝ½ÑàÕ\u0007É\u0012Ì\u008bÀ¦Äõø=ü^ó\u0084÷¸ëíï*\u0094Ý\u0090¢\u009cÿ\u0098\u0018\u0084\r\u0081\u0094\u008d¹\u0089êµ\r±O¾\u0097º«\u000e\u0005\nz\u0006#\u0002Â\u001e\u009b\u001b\u0001\u0017v\u0013)/ý+\u0090$N y<;8ê4\u00811\tMDI&EàAÙZXV\u001dR&níä\u000fàyì&èÈôßñSýqù\"ÅäÁ\u009bÎ_ÊoÖ\u007fÒÆÞ\u008bÛX§3£<¯é«\u008e°U¼\u0000¸\u001e\u0084ã\u0080¬\u008dP\u0089\r\u0095.r\fvgz9~Ðb\u0090g\bkro SóW\u0098XY\\k@ f\u001bbyn%j\u0097vÁì\u0085èîä°àYü\u0019ù\u0081õáñ£ÍfÉ\u0018Æ\u008dÂûÞ»Ú~Ö\u0001\u0002\u009e\u0006¿\nð\u000e\t\u0012E\u0017\u0092\u001b¢\u001f»#>'B(\u009d,¡0ï448R=\u009dA\u0097EþI>\u0094\u009e\u0090¯\u009cø\u0098)\u0084n\u0081³\u008d\u0099\u0089Áµ0±U¾\u008eºà¦ñ¢97¹3Ç?\u008a;i'i\"ÿ.Ë*\u009e\u0016_\u0012#\u001dÁ\u0019É\u0005\u0089\u0001V\r+\bùt¥pÌ|Fx'cê<X8b4'0Ã,\u0099)J%c!5\u001dñ\u0019\u009d\u0094Ý\u0090£\u009cî\u0098\r\u0084\r\u0081\u009b\u008d¥\u0089ëµ<±R¾\u0089\u0094Ý\u0090¢\u009cû\u0098\u001a\u0084C\u0081Ù\u008d®\u0089ñµ%±H¾\u0096º¡¦ã¢2®Y«Ñ×\u009cÓâß*Û\u0001À\u0083ÌÆÈúô-ð<ý\u009eù×åâ\u0096»\u0092Ð\u009e\u008e\u009ag\u0086'\u0083¿\u008fÏ\u008b\u0088·A³)¼ò¸Î¤\u008b\u0094µ\u0090©\u009cö\u0098\n\u0084D\u0081\u009f\u008d¹\u0089ö½m¹\u0012µK±ª\u00adó¨i¤\u0017 G\u009c\u0091\u0098õ\u0097e\u0093\u000e\u008f@\u008b\u0089\u0087ü\u0082'þnúSö\u0099ò±é1åsáHÝÁÙ\u0092ÔyÐiÌQÈ\u009fÄ\u0088Ã7?g;¡7\u00843Å.(*{&´\"\u008e\u001e\u0080\u0015\u000f\u0011s\r§\t\u008b\u0005Û\u0000\u000b|\u007f".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1886);
        f19559g = cArr;
        f19562j = -8015028841569808186L;
    }

    static void init$0() {
        $$a = new byte[]{124, 69, -84, MessagePack.Code.STR8};
        $$b = 78;
    }

    static void init$1() {
        $$c = new byte[]{96, -118, -108, -83};
        $$d = 28;
    }

    public final int getIndex() {
        int i2 = 2 % 2;
        int i3 = f19561i + 7;
        f19558f = i3 % 128;
        int i4 = i3 % 2;
        int iA = this.innerStep.a();
        int i5 = f19561i + 65;
        f19558f = i5 % 128;
        if (i5 % 2 == 0) {
            return iA;
        }
        throw null;
    }

    public final HceTransactionStepName getName() {
        int i2 = 2 % 2;
        int i3 = f19561i + 75;
        f19558f = i3 % 128;
        int i4 = i3 % 2;
        HceTransactionStepName hceTransactionStepNameC = this.innerStep.c();
        int i5 = f19561i + 21;
        f19558f = i5 % 128;
        int i6 = i5 % 2;
        return hceTransactionStepNameC;
    }

    public final String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("HceTransactionStep{name=").append(getName()).append(",index=").append(getIndex()).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f19558f + 35;
        f19561i = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
