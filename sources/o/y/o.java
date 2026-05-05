package o.y;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.CancellationSignal;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.R;
import fr.antelop.sdk.digitalcard.VirtualCardNumberOption;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import o.at.a;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends c {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static int C = 0;

    /* JADX INFO: renamed from: k */
    public static int f27300k = 0;

    /* JADX INFO: renamed from: m */
    public static int f27301m = 0;

    /* JADX INFO: renamed from: n */
    public static int f27302n = 0;

    /* JADX INFO: renamed from: o */
    public static int f27303o = 0;

    /* JADX INFO: renamed from: u */
    private static char f27304u = 0;

    /* JADX INFO: renamed from: v */
    private static int f27305v = 0;

    /* JADX INFO: renamed from: w */
    private static char[] f27306w = null;

    /* JADX INFO: renamed from: x */
    private static int f27307x = 0;

    /* JADX INFO: renamed from: y */
    private static int f27308y = 0;

    /* JADX INFO: renamed from: l */
    boolean f27309l;

    /* JADX INFO: renamed from: p */
    private final boolean f27310p;

    /* JADX INFO: renamed from: q */
    private o.eb.b f27311q;

    /* JADX INFO: renamed from: s */
    private VirtualCardNumberOption f27312s;

    /* JADX INFO: renamed from: t */
    private CancellationSignal f27313t;

    /* JADX INFO: renamed from: o.y.o$1 */
    final class AnonymousClass1 extends o.eb.e {

        /* JADX INFO: renamed from: b */
        private static int f27314b = 0;

        /* JADX INFO: renamed from: c */
        private static int f27315c = 1;

        AnonymousClass1() {
        }

        @Override // o.eb.e
        public final int getThemeResource(o.eb.b bVar) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            int i4 = f27314b + 45;
            f27315c = i4 % 128;
            int i5 = i4 % 2;
            o.eb.b.d();
            if (i5 == 0) {
                i2 = R.style.antelopSecureVirtualCardNumberDisplayThemeInternal;
                int i6 = 3 / 0;
            } else {
                i2 = R.style.antelopSecureVirtualCardNumberDisplayThemeInternal;
            }
            int i7 = f27314b + 47;
            f27315c = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 63 / 0;
            }
            return i2;
        }
    }

    /* JADX INFO: renamed from: o.y.o$2 */
    public class AnonymousClass2 implements a.InterfaceC0334a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static int f27317a = 0;

        /* JADX INFO: renamed from: b */
        private static int f27318b = 0;

        /* JADX INFO: renamed from: d */
        private static int f27319d = 0;

        /* JADX INFO: renamed from: f */
        private static short[] f27320f = null;

        /* JADX INFO: renamed from: g */
        private static int f27321g = 0;

        /* JADX INFO: renamed from: h */
        private static byte[] f27322h = null;

        /* JADX INFO: renamed from: i */
        private static int f27323i = 0;

        /* JADX INFO: renamed from: j */
        private static int f27324j = 0;

        /* JADX INFO: renamed from: k */
        public static int f27325k = 0;

        /* JADX INFO: renamed from: l */
        public static int f27326l = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Context f27327c;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0011). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(short r5, int r6, byte r7) {
            /*
                int r0 = r7 + 4
                int r1 = r6 * 2
                int r7 = 1 - r1
                byte[] r6 = o.y.o.AnonymousClass2.$$c
                int r5 = r5 + 103
                byte[] r4 = new byte[r7]
                r3 = 0
                if (r6 != 0) goto L26
                r2 = r0
                r1 = r3
            L11:
                int r0 = -r0
                int r5 = r5 + r0
                r0 = r2
            L14:
                int r2 = r0 + 1
                byte r0 = (byte) r5
                r4[r1] = r0
                int r1 = r1 + 1
                if (r1 != r7) goto L23
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L23:
                r0 = r6[r2]
                goto L11
            L26:
                r1 = r3
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.o.AnonymousClass2.$$e(short, int, byte):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            f27326l = -1656740979;
            f27325k = -1477597343;
            init$0();
            f27323i = 0;
            f27321g = 1;
            f27318b = -1270219476;
            f27317a = 124233643;
            f27319d = 1150422420;
            f27324j = 432866687;
            f27322h = new byte[]{81, 126, 92, 107, 82, -127, 120, Ascii.ETB, 107, 100, 92, 107, 82, 97, -104, 39, 86, 87, 80, 99, 91, 96, -72, -87, MessagePack.Code.ARRAY16, -118, -90, -65, -84, -78, -89, -85, -92, -91, -95, MessagePack.Code.FIXEXT4, -78, 96, -92, -29, 107, -65, -72, MessagePack.Code.FIXARRAY_PREFIX, -65, -90, -75, -20, 123, -86, -85, -92, -73, -81, -76, -105, -103, -114, -103, 33, 48, 57, 32, 62, 40, 75, Base64.padSymbol, 57, 100, -1, Base64.padSymbol, -115, -115, -115, -115, -115};
        }

        AnonymousClass2(Context context) {
            context = context;
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(Unknown Source)
            	at java.base/java.util.TreeMap.lastKey(Unknown Source)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] c(android.content.Context r20, int r21, int r22, int r23) {
            /*
                Method dump skipped, instruction units count: 1680
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.o.AnonymousClass2.c(android.content.Context, int, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{125, 113, 52, MessagePack.Code.FLOAT32};
            $$b = 232;
        }

        static void init$1() {
            $$c = new byte[]{93, -2, -4, -85};
            $$d = 207;
        }

        private static void m(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
            String str2 = str;
            int i5 = 2 % 2;
            int i6 = $11 + 65;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
            o.a.n nVar = new o.a.n();
            char[] cArr2 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                nVar.f19946e = cArr[nVar.f19944a];
                cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
                int i8 = nVar.f19944a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f27318b)};
                    Object objA = o.d.d.a(1376241034);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(270 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 11 - TextUtils.indexOf("", "", 0, 0), -2071844881, false, $$e((byte) ($$d & 60), b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {nVar, nVar};
                    Object objA2 = o.d.d.a(-202660535);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 522, (char) Gravity.getAbsoluteGravity(0, 0), 13 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 627984172, false, $$e((byte) ((-1) - (((-1) - $$d) | ((-1) - 58))), b3, (byte) (b3 - 1)), new Class[]{Object.class, Object.class});
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
                nVar.f19945b = i4;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
                System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
            }
            if (z2) {
                char[] cArr4 = new char[i2];
                nVar.f19944a = 0;
                int i9 = $10 + 11;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 4 % 3;
                }
                while (nVar.f19944a < i2) {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = o.d.d.a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 523, (char) Color.alpha(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12, 627984172, false, $$e((byte) ($$d & 58), b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        private static void n(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
            long j2;
            int i5;
            byte b3;
            long j3;
            int i6 = 2 % 2;
            o.a.j jVar = new o.a.j();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f27319d)};
                Object objA = o.d.d.a(-727631768);
                if (objA == null) {
                    int doubleTapTimeout = 238 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    char cMyPid = (char) ((Process.myPid() >> 22) + 44531);
                    int mode = 11 - View.MeasureSpec.getMode(0);
                    byte b4 = (byte) ($$d & 1);
                    byte b5 = (byte) (b4 - 1);
                    objA = o.d.d.a(doubleTapTimeout, cMyPid, mode, 35969549, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                boolean z2 = iIntValue == -1;
                if (z2) {
                    int i7 = $11 + 65;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    byte[] bArr = f27322h;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        for (int i9 = 0; i9 < length; i9++) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objA2 = o.d.d.a(-1239398195);
                            if (objA2 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objA2 = o.d.d.a(Gravity.getAbsoluteGravity(0, 0) + IptcDirectory.TAG_COPYRIGHT_NOTICE, (char) (28649 - KeyEvent.normalizeMetaState(0)), 11 - TextUtils.indexOf("", "", 0), 1621469864, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i10 = $11 + 13;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            byte[] bArr3 = f27322h;
                            Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f27317a)};
                            Object objA3 = o.d.d.a(-727631768);
                            if (objA3 == null) {
                                int iBlue = Color.blue(0) + 238;
                                char doubleTapTimeout2 = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 44531);
                                int iIndexOf = TextUtils.indexOf("", "", 0) + 11;
                                byte b8 = (byte) ($$d & 1);
                                byte b9 = (byte) (b8 - 1);
                                objA3 = o.d.d.a(iBlue, doubleTapTimeout2, iIndexOf, 35969549, false, $$e(b8, b9, (byte) (b9 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            b3 = (byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) % (-7649639543924978291L));
                            j3 = ((long) f27319d) / (-7649639543924978291L);
                        } else {
                            byte[] bArr4 = f27322h;
                            Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(f27317a)};
                            Object objA4 = o.d.d.a(-727631768);
                            if (objA4 == null) {
                                int longPressTimeout = 238 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 44531);
                                int edgeSlop = 11 - (ViewConfiguration.getEdgeSlop() >> 16);
                                byte b10 = (byte) ((-1) - (((-1) - $$d) | ((-1) - 1)));
                                byte b11 = (byte) (b10 - 1);
                                objA4 = o.d.d.a(longPressTimeout, scrollDefaultDelay, edgeSlop, 35969549, false, $$e(b10, b11, (byte) (b11 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            b3 = (byte) (((long) bArr4[((Integer) ((Method) objA4).invoke(null, objArr5)).intValue()]) ^ (-7649639543924978291L));
                            j3 = ((long) f27319d) ^ (-7649639543924978291L);
                        }
                        iIntValue = (byte) (b3 + ((int) j3));
                        j2 = -7649639543924978291L;
                    } else {
                        j2 = -7649639543924978291L;
                        iIntValue = (short) (((short) (((long) f27320f[i2 + ((int) (((long) f27317a) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f27319d) ^ (-7649639543924978291L))));
                    }
                } else {
                    j2 = -7649639543924978291L;
                }
                if (iIntValue > 0) {
                    int i11 = ((i2 + iIntValue) - 2) + ((int) (((long) f27317a) ^ j2));
                    if (z2) {
                        int i12 = $10 + 35;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    jVar.f19936d = i11 + i5;
                    Object[] objArr6 = {jVar, Integer.valueOf(i3), Integer.valueOf(f27324j), sb};
                    Object objA5 = o.d.d.a(1819197256);
                    if (objA5 == null) {
                        objA5 = o.d.d.a(1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (5358 - (KeyEvent.getMaxKeyCode() >> 16)), 11 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objA5).invoke(null, objArr6)).append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    byte[] bArr5 = f27322h;
                    if (bArr5 != null) {
                        int length2 = bArr5.length;
                        byte[] bArr6 = new byte[length2];
                        for (int i14 = 0; i14 < length2; i14++) {
                            int i15 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                            bArr6[i14] = (byte) (((long) bArr5[i14]) ^ (-7649639543924978291L));
                        }
                        bArr5 = bArr6;
                    }
                    boolean z3 = bArr5 != null;
                    jVar.f19934b = 1;
                    while (jVar.f19934b < iIntValue) {
                        if (z3) {
                            byte[] bArr7 = f27322h;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr7[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                        } else {
                            short[] sArr = f27320f;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                        }
                        sb.append(jVar.f19937e);
                        jVar.f19935c = jVar.f19937e;
                        jVar.f19934b++;
                    }
                }
                String string = sb.toString();
                int i17 = $10 + 89;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    throw null;
                }
                objArr[0] = string;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void o(byte r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r3 = r8 * 4
                int r2 = 1 - r3
                byte[] r8 = o.y.o.AnonymousClass2.$$a
                int r0 = r6 + 97
                int r1 = r7 * 4
                int r7 = r1 + 4
                byte[] r6 = new byte[r2]
                r5 = 0
                int r4 = 0 - r3
                if (r8 != 0) goto L2d
                r3 = r4
                r2 = r5
            L15:
                int r0 = -r0
                int r7 = r7 + 1
                int r0 = r0 + r3
            L19:
                byte r1 = (byte) r0
                r6[r2] = r1
                if (r2 != r4) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                r9[r5] = r0
                return
            L26:
                int r2 = r2 + 1
                r1 = r8[r7]
                r3 = r0
                r0 = r1
                goto L15
            L2d:
                r2 = r5
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.o.AnonymousClass2.o(byte, byte, int, java.lang.Object[]):void");
        }

        @Override // o.at.a.InterfaceC0334a
        public final void a(o.bg.c cVar) throws Throwable {
            int i2 = 2 % 2;
            o.by.c cVarB = o.by.c.b(cVar);
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                m(43 - TextUtils.lastIndexOf("", '0', 0, 0), "\u0001\uffef\u000e\u0001\n\n￥\u000f\u000f\u0001\uffff\u000b\u000e￬\u0001\t\u0011\u000f\u0001￮\u0001\u0003�\n�￩\n\uffff\ufff2\u0000\u000e�\uffdf\b�\u0010\u0005\u0003\u0005￠\u0001\u000e\u0011\uffff", true, 154 - TextUtils.lastIndexOf("", '0'), TextUtils.lastIndexOf("", '0', 0) + 8, objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                m((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33, "\u0014\u0013￨\u0017\n\u0006\u0019\n\ufffb\b\u0013￫\u0006\u000e\u0011\u001a\u0017\nￅￒￅ\u0017\u001a\u0013\ufff5\u0017\u0014\b\n\u0018\u0018ￅￒￅ", false, ExpandableListView.getPackedPositionType(0L) + 146, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 20, objArr2);
                o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(cVarB).toString());
            }
            if (o.e(o.this) != null) {
                int i3 = f27323i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f27321g = i3 % 128;
                if (i3 % 2 == 0) {
                    cVar.c();
                    o.bg.a aVar = o.bg.a.az;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (cVar.c() != o.bg.a.az) {
                    o.f(o.this).onError(o.by.c.b(cVar));
                    int i4 = f27323i + 79;
                    f27321g = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                o.c(o.this);
                Object[] objArr3 = {o.this};
                int priority = Thread.currentThread().getPriority();
                int iMyPid = Process.myPid();
                int i6 = (-547653636) * o.f27303o;
                o.f27303o = i6;
                ((o.x.f) o.a(i6, iMyPid, priority, -213720904, 213720905, objArr3, (int) Runtime.getRuntime().maxMemory())).onAuthenticationDeclined();
            }
        }

        @Override // o.at.a.InterfaceC0334a
        public final void c(String str) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f27323i + 85;
            f27321g = i3 % 128;
            if (i3 % 2 == 0) {
                o.ea.f.a();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                m(45 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0001\uffef\u000e\u0001\n\n￥\u000f\u000f\u0001\uffff\u000b\u000e￬\u0001\t\u0011\u000f\u0001￮\u0001\u0003�\n�￩\n\uffff\ufff2\u0000\u000e�\uffdf\b�\u0010\u0005\u0003\u0005￠\u0001\u000e\u0011\uffff", true, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 155, TextUtils.indexOf((CharSequence) "", '0', 0) + 8, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                m(30 - TextUtils.lastIndexOf("", '0', 0), "￢\r\u000e\uffbfￌ\uffbf\u0012\u0012\u0004\u0002\u000e\u0011\uffef\r\u0014\u0011\u0012\u0012\u0004\u0002\u0002\u0014\ufff2\r\u0002\ufff5\u0004\u0013\u0000\u0004\u0011", true, 151 - MotionEvent.axisFromString(""), TextUtils.indexOf((CharSequence) "", '0') + 17, objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            }
            if (o.this.f27309l && str != null) {
                o.this.d(context, str);
                return;
            }
            if (o.a(o.this) != null) {
                int i4 = f27323i + 65;
                f27321g = i4 % 128;
                int i5 = i4 % 2;
                o.d(o.this).onProcessSuccess();
                int i6 = f27323i + 47;
                f27321g = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    private static String $$j(short s2, short s3, int i2) {
        byte[] bArr = $$d;
        int i3 = s3 + 4;
        int i4 = 111 - s2;
        int i5 = i2 * 2;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 = (-i4) + i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            i3++;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i4 = (-bArr[i3]) + i4;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f27303o = -1692308737;
        f27302n = 77023552;
        f27301m = 1879586977;
        f27300k = -1036665170;
        f27305v = 0;
        C = 1;
        f27308y = 0;
        f27307x = 1;
        l();
        ViewConfiguration.getScrollBarFadeDuration();
        ViewConfiguration.getFadingEdgeLength();
        int i2 = C + 111;
        f27305v = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public o(String str, o.ep.d dVar, boolean z2) {
        super(str, dVar);
        this.f27310p = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0191 A[Catch: all -> 0x03bb, TRY_ENTER, TryCatch #0 {all -> 0x03bb, blocks: (B:94:0x0045, B:96:0x0053, B:97:0x0087, B:102:0x00a3, B:104:0x00b3, B:105:0x00e9, B:127:0x0191, B:129:0x01d7, B:130:0x024c, B:134:0x0269, B:136:0x02a8, B:137:0x0312), top: B:158:0x0045 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void B(int r24, java.lang.String r25, byte r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.o.B(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) throws Throwable {
        Object obj;
        int i8 = ~i6;
        int i9 = ~(i8 | i4);
        int i10 = ~(i8 | (~i4) | i5);
        int i11 = ~(((-1) - (((-1) - i5) & ((-1) - i6))) | i4);
        int i12 = (i10 + i11) - (i10 & i11);
        int i13 = ~i5;
        int i14 = (~((-1) - (((-1) - i13) & ((-1) - i4)))) | (~((-1) - (((-1) - i13) & ((-1) - i6))));
        int i15 = ~((i4 + i6) - (i4 & i6));
        int i16 = (i15 + i14) - (i15 & i14);
        int i17 = i5 + i6 + i3 + (1698977638 * i2) + (1466394737 * i7);
        int i18 = i17 * i17;
        int i19 = (((-1250291696) * i5) - 490274816) + ((-1116082190) * i6) + (i9 * (-67104753)) + ((-67104753) * i12) + (67104753 * i16) + ((-1183186944) * i3) + (1553727488 * i2) + (1859780608 * i7) + (925827072 * i18);
        int i20 = ((i5 * (-1787956080)) - 1478154965) + (i6 * (-1787955198)) + (i9 * (-441)) + (i12 * (-441)) + (i16 * 441) + (i3 * (-1787955639)) + (i2 * 552005654) + (i7 * (-2013897159)) + (i18 * (-429457408));
        if (i19 + (i20 * i20 * (-402587648)) == 1) {
            return a(objArr);
        }
        int i21 = 2 % 2;
        int i22 = f27308y + 11;
        f27307x = i22 % 128;
        if (i22 % 2 == 0) {
            Object[] objArr2 = new Object[1];
            B(54 >> Color.blue(0), "\u000e\u0014\u0003\u0010\n\r\u0001\u0011\u000b\u0002\u0014\u0002\u0013\t\u0005\u0007㘎", (byte) (115 - (ViewConfiguration.getDoubleTapTimeout() << 127)), objArr2);
            obj = objArr2[0];
        } else {
            Object[] objArr3 = new Object[1];
            B(Color.blue(0) + 17, "\u000e\u0014\u0003\u0010\n\r\u0001\u0011\u000b\u0002\u0014\u0002\u0013\t\u0005\u0007㘎", (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 38), objArr3);
            obj = objArr3[0];
        }
        return ((String) obj).intern();
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        o oVar = (o) objArr[0];
        int i2 = 2 % 2;
        int i3 = f27308y + 61;
        f27307x = i3 % 128;
        if (i3 % 2 == 0) {
            oVar.i();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        o.x.f fVarI = oVar.i();
        int i4 = f27308y + 103;
        f27307x = i4 % 128;
        int i5 = i4 % 2;
        return fVarI;
    }

    static /* synthetic */ o.x.f a(o oVar) {
        int i2 = 2 % 2;
        int i3 = f27307x + 75;
        f27308y = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = oVar.i();
        int i5 = f27307x + 89;
        f27308y = i5 % 128;
        int i6 = i5 % 2;
        return fVarI;
    }

    static /* synthetic */ o.x.f b(o oVar) {
        int priority = Thread.currentThread().getPriority();
        int iMyPid = Process.myPid();
        int i2 = (-547653636) * f27303o;
        f27303o = i2;
        return (o.x.f) a(i2, iMyPid, priority, -213720904, 213720905, new Object[]{oVar}, (int) Runtime.getRuntime().maxMemory());
    }

    static /* synthetic */ void c(o oVar) {
        int i2 = 2 % 2;
        int i3 = f27307x + 37;
        f27308y = i3 % 128;
        int i4 = i3 % 2;
        oVar.e();
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ o.x.f d(o oVar) {
        int i2 = 2 % 2;
        int i3 = f27307x + 19;
        f27308y = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = oVar.i();
        int i5 = f27308y + 77;
        f27307x = i5 % 128;
        int i6 = i5 % 2;
        return fVarI;
    }

    static /* synthetic */ o.x.f e(o oVar) {
        int i2 = 2 % 2;
        int i3 = f27307x + 19;
        f27308y = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = oVar.i();
        int i5 = f27307x + 55;
        f27308y = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return fVarI;
    }

    static /* synthetic */ o.x.f f(o oVar) {
        int i2 = 2 % 2;
        int i3 = f27307x + 9;
        f27308y = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = oVar.i();
        int i5 = f27308y + 71;
        f27307x = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return fVarI;
    }

    static void init$0() {
        $$d = new byte[]{124, 69, -84, MessagePack.Code.STR8};
        $$e = 40;
    }

    static void l() {
        f27306w = new char[]{64619, 64599, 64585, 64586, 64584, 64616, 64576, 64595, 64630, 64583, 64627, 64609, 64580, 64631, 64592, 64587, 64614, 64620, 64593, 64598, 64582, 64629, 64577, 64578, 64588};
        f27304u = (char) 51642;
    }

    @Override // o.y.c
    final void a_() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f27307x;
        int i4 = i3 + 121;
        f27308y = i4 % 128;
        int i5 = i4 % 2;
        if (this.f27310p) {
            int i6 = i3 + 111;
            f27308y = i6 % 128;
            int i7 = i6 % 2;
        } else {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr = new Object[1];
            B(24 - (ViewConfiguration.getEdgeSlop() >> 16), "\u000e\u0014\u0003\u0010\n\r\u0001\u0011\u000b\u0002\u0014\u0002\u0013\t\u0005\u0007\u0003\u0006\u000b\u0006\t\u0016\u0015\u0005", (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 107), objArr);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
        }
    }

    @Override // o.x.i
    public final String c() {
        int priority = Thread.currentThread().getPriority();
        int i2 = (-817833585) * f27300k;
        f27300k = i2;
        int i3 = f27301m * 1329562714;
        f27301m = i3;
        int i4 = f27302n * 1015777352;
        f27302n = i4;
        return (String) a(i3, i2, priority, -453671806, 453671806, new Object[]{this}, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0018  */
    @Override // o.x.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.content.Context r15, o.en.b r16, o.i.d r17) throws java.lang.Throwable {
        /*
            r14 = this;
            r7 = 2
            int r0 = r7 % r7
            int r0 = o.y.o.f27308y
            int r1 = r0 + 33
            int r0 = r1 % 128
            o.y.o.f27307x = r0
            int r1 = r1 % r7
            r6 = 0
            if (r1 != 0) goto L86
            boolean r1 = o.ea.f.a()
            r0 = 77
            int r0 = r0 / r6
            if (r1 == 0) goto L5b
        L18:
            java.lang.String r0 = ""
            int r0 = android.text.TextUtils.indexOf(r0, r0, r6, r6)
            int r3 = r0 + 44
            float r1 = android.view.ViewConfiguration.getScrollFriction()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            int r0 = 98 - r0
            byte r2 = (byte) r0
            r5 = 1
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "\u0012\u0010\u0010\u0005\u0003\u0006\u0005\u0015\u000b\u0004\u000b\u0010\u0014\u0018\u0017\u0013\u0011\u0007\u0011\u000b\u0002\u0015\u000f\u0000\u0014\n\n\u0011\r\u0016\b\u000b\t\u0010\u0013\t\u000b\u0001\u0002\u0004\u0015\u0005㙊㙊"
            B(r3, r0, r2, r1)
            r0 = r1[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = r0.intern()
            int r0 = android.graphics.ImageFormat.getBitsPerPixel(r6)
            int r3 = r0 + 11
            int r0 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r0 = r0 >> 24
            int r0 = r0 + 6
            byte r2 = (byte) r0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "\u0004\u000b\u0010\u0014\u0002\u0004\u0015\u0005㗯㗯"
            B(r3, r0, r2, r1)
            r0 = r1[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ea.f.c(r4, r0)
        L5b:
            o.at.a r8 = new o.at.a
            o.y.o$2 r0 = new o.y.o$2
            r0.<init>()
            r1 = r16
            r8.<init>(r15, r0, r1)
            java.lang.String r10 = r14.g()
            o.ep.d r0 = r14.f27088r
            java.lang.String r11 = r0.b()
            fr.antelop.sdk.digitalcard.VirtualCardNumberOption r12 = r14.f27312s
            boolean r13 = r14.f27309l
            r9 = r17
            r8.d(r9, r10, r11, r12, r13)
            int r0 = o.y.o.f27308y
            int r1 = r0 + 115
            int r0 = r1 % 128
            o.y.o.f27307x = r0
            int r1 = r1 % r7
            if (r1 == 0) goto L8d
            return
        L86:
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto L5b
            goto L18
        L8d:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.o.c(android.content.Context, o.en.b, o.i.d):void");
    }

    final void d(Context context, String str) throws Throwable {
        int i2 = 2 % 2;
        AnonymousClass1 anonymousClass1 = new o.eb.e() { // from class: o.y.o.1

            /* JADX INFO: renamed from: b */
            private static int f27314b = 0;

            /* JADX INFO: renamed from: c */
            private static int f27315c = 1;

            AnonymousClass1() {
            }

            @Override // o.eb.e
            public final int getThemeResource(o.eb.b bVar) throws Throwable {
                int i22;
                int i3 = 2 % 2;
                int i4 = f27314b + 45;
                f27315c = i4 % 128;
                int i5 = i4 % 2;
                o.eb.b.d();
                if (i5 == 0) {
                    i22 = R.style.antelopSecureVirtualCardNumberDisplayThemeInternal;
                    int i6 = 3 / 0;
                } else {
                    i22 = R.style.antelopSecureVirtualCardNumberDisplayThemeInternal;
                }
                int i7 = f27314b + 47;
                f27315c = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 63 / 0;
                }
                return i22;
            }
        };
        this.f27313t = new CancellationSignal();
        anonymousClass1.setProcessCallback(i());
        anonymousClass1.launch2(context, this.f27311q, str, this.f27313t);
        int i3 = f27307x + 71;
        f27308y = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void e(Context context, VirtualCardNumberOption virtualCardNumberOption, boolean z2, o.eb.b bVar, o.x.f fVar) throws Throwable {
        int i2 = 2 % 2;
        if (!(!o.ea.f.a())) {
            int i3 = f27308y + 21;
            f27307x = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            B(44 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0012\u0010\u0010\u0005\u0003\u0006\u0005\u0015\u000b\u0004\u000b\u0010\u0014\u0018\u0017\u0013\u0011\u0007\u0011\u000b\u0002\u0015\u000f\u0000\u0014\n\n\u0011\r\u0016\b\u000b\t\u0010\u0013\t\u000b\u0001\u0002\u0004\u0015\u0005㙊㙊", (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 97), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            B((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6, "\u0015\u0000\u0007\u000b\u0010\b", (byte) (TextUtils.getOffsetBefore("", 0) + 9), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        virtualCardNumberOption.validate();
        this.f27312s = virtualCardNumberOption;
        this.f27309l = z2;
        this.f27311q = bVar;
        b(context, fVar);
        int i5 = f27307x + 3;
        f27308y = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
    }

    public final fr.antelop.sdk.CancellationSignal m() {
        int i2 = 2 % 2;
        int i3 = f27307x + 87;
        f27308y = i3 % 128;
        int i4 = i3 % 2;
        CancellationSignal cancellationSignal = this.f27313t;
        if (cancellationSignal != null && !cancellationSignal.isCanceled()) {
            return new fr.antelop.sdk.CancellationSignal(this.f27313t);
        }
        int i5 = f27308y + 87;
        f27307x = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return null;
    }
}
