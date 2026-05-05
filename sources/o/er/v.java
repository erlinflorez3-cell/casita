package o.er;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
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
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import fr.antelop.sdk.AntelopErrorCode;
import fr.antelop.sdk.card.CardStatus;
import fr.antelop.sdk.digitalcard.Token;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.eo.e;
import o.ep.i;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class v extends h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f25190b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f25191c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f25192d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f25193e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f25194f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f25195h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f25196j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, short r9, byte r10) {
        /*
            byte[] r7 = o.er.v.$$a
            int r6 = r8 + 4
            int r5 = 122 - r9
            int r4 = r10 * 4
            int r0 = r4 + 1
            byte[] r3 = new byte[r0]
            r2 = -1
            if (r7 != 0) goto L25
            r1 = r6
            r0 = r4
        L11:
            int r6 = r6 + r0
        L12:
            int r2 = r2 + 1
            byte r0 = (byte) r6
            r3[r2] = r0
            if (r2 != r4) goto L20
            java.lang.String r1 = new java.lang.String
            r0 = 0
            r1.<init>(r3, r0)
            return r1
        L20:
            int r1 = r1 + 1
            r0 = r7[r1]
            goto L11
        L25:
            r1 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.v.$$c(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25196j = 0;
        f25195h = 1;
        f25192d = 0;
        f25194f = 1;
        d();
        Color.alpha(0);
        MotionEvent.axisFromString("");
        int i2 = f25196j + 95;
        f25195h = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public v(o.ep.d dVar, o.eq.e eVar) {
        super(dVar, eVar);
    }

    static void d() {
        f25190b = 740602047300126166L;
        f25191c = 1564493270;
        f25193e = (char) 47361;
    }

    private static void i(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = $11;
        int i6 = i5 + 43;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        Object obj = null;
        Object charArray = str6;
        if (str6 != null) {
            int i8 = i5 + 73;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                str6.toCharArray();
                throw null;
            }
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str4;
        if (str4 != null) {
            charArray3 = str4.toCharArray();
        }
        o.a.i iVar = new o.a.i();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) charArray3).length;
        char[] cArr5 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            int i9 = $11 + 83;
            $10 = i9 % 128;
            int i10 = i9 % i3;
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    objA = o.d.d.a(105 - TextUtils.lastIndexOf("", '0', 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0) + 12, -155898465, false, $$c(b2, (byte) ((b2 + 57) - (57 | b2)), (byte) 0), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    byte b3 = (byte) (-1);
                    objA2 = o.d.d.a(847 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (6488 - (ViewConfiguration.getTapTimeout() >> 16)), 13 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -694521287, false, $$c(b3, (byte) (54 & b3), (byte) 0), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b4 = (byte) (-1);
                    objA3 = o.d.d.a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 458, (char) ExpandableListView.getPackedPositionType(0L), 11 - ((Process.getThreadPriority(0) + 20) >> 6), 1804962841, false, $$c(b4, (byte) (56 & b4), (byte) 0), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objA4 = o.d.d.a(TextUtils.lastIndexOf("", '0') + OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 65100), (ViewConfiguration.getFadingEdgeLength() >> 16) + 12, 1636969060, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                obj = null;
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f25190b ^ 740602047300126166L)) ^ ((long) ((int) (((long) f25191c) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f25193e) ^ 740602047300126166L))));
                iVar.f19932b++;
                int i11 = $11 + 59;
                $10 = i11 % 128;
                i3 = 2;
                int i12 = i11 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    static void init$0() {
        $$a = new byte[]{101, -104, -88, -105};
        $$b = 74;
    }

    @Override // o.er.h
    public final /* synthetic */ boolean c() {
        int i2 = 2 % 2;
        int i3 = f25192d + 31;
        f25194f = i3 % 128;
        if (i3 % 2 == 0) {
            super.c();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zC = super.c();
        int i4 = f25194f + 111;
        f25192d = i4 % 128;
        int i5 = i4 % 2;
        return zC;
    }

    public final void e(Context context, final OperationCallback<List<Token>> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25194f + 113;
        f25192d = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f25194f + 71;
            f25192d = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            i((char) ((Process.myPid() >> 22) + 43673), "\ud7fd鮲쳖硫⍅쒪ￚ㊎\u1aeb㓩솭\u0bfb埫\ue064\ueedeʡᑯ㦍鄼罵➇㩂ᣛꇏ㛼쉺껈", "\u0000\u0000\u0000\u0000", "᧴텝饥얪", KeyEvent.normalizeMetaState(0) + 1708219673, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            i((char) View.resolveSizeAndState(0, 0, 0), "㤑웎슠庳\uf5c9ᦵ㱹㜠笪", "\u0000\u0000\u0000\u0000", "ɀ눵넱忡", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 833762561, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        Object[] objArr3 = {this.f25009a};
        int i7 = o.ep.d.f24461m * (-222457364);
        o.ep.d.f24461m = i7;
        int i8 = o.ep.d.f24462n * 325900588;
        o.ep.d.f24462n = i8;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i9 = o.ep.d.f24460l * 323941697;
        o.ep.d.f24460l = i9;
        if (((CardStatus) o.ep.d.e(1555433584, -1555433578, objArr3, i8, iElapsedRealtime, i9, i7)) != CardStatus.Active) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr4 = new Object[1];
            i((char) (51727 - Color.blue(0)), "쇶༷῝烓", "\u0000\u0000\u0000\u0000", "᷷혐ྯ꿊", (Process.getThreadPriority(0) + 20) >> 6, objArr4);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr4[0]).intern());
        }
        if (!c()) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
            Object[] objArr5 = new Object[1];
            i((char) TextUtils.getOffsetBefore("", 0), "∴褉臕㴕\ue6e2叐둤奇蜋ӎ쉴䮍뫠\ue6c8牪竪䈫ﮇ\uf275ဳẼ綔", "\u0000\u0000\u0000\u0000", "恙꒪뢞馜", TextUtils.indexOf("", "", 0, 0), objArr5);
            throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr5[0]).intern());
        }
        Object[] objArr6 = {o.en.b.c().j(), context, this.f25009a.b(), new e.d<o.ep.i>() { // from class: o.er.v.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static final int $$f = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f25197a = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long f25198d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static char f25199e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static int f25200f = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static int f25201h = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0016). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$g(byte r5, byte r6, byte r7) {
                /*
                    int r0 = r7 * 4
                    int r0 = 3 - r0
                    int r7 = 122 - r5
                    int r2 = r6 * 3
                    int r1 = 1 - r2
                    byte[] r6 = o.er.v.AnonymousClass5.$$c
                    byte[] r5 = new byte[r1]
                    r4 = 0
                    int r3 = 0 - r2
                    if (r6 != 0) goto L2a
                    r7 = r3
                    r2 = r0
                    r1 = r4
                L16:
                    int r7 = r7 + r0
                    r0 = r2
                L18:
                    byte r2 = (byte) r7
                    r5[r1] = r2
                    int r2 = r0 + 1
                    if (r1 != r3) goto L25
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    return r0
                L25:
                    int r1 = r1 + 1
                    r0 = r6[r2]
                    goto L16
                L2a:
                    r1 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.v.AnonymousClass5.$$g(byte, byte, byte):java.lang.String");
            }

            static {
                init$2();
                $10 = 0;
                $11 = 1;
                init$1();
                init$0();
                f25200f = 0;
                f25201h = 1;
                f25198d = 740602047300126166L;
                f25197a = 1525049177;
                f25199e = (char) 17878;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0013). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void g(byte r8, short r9, short r10, java.lang.Object[] r11) {
                /*
                    int r8 = r8 * 2
                    int r2 = r8 + 1
                    int r1 = r9 + 4
                    byte[] r7 = o.er.v.AnonymousClass5.$$a
                    int r0 = r10 * 3
                    int r6 = 100 - r0
                    byte[] r5 = new byte[r2]
                    r4 = 0
                    if (r7 != 0) goto L2c
                    r3 = r4
                    r0 = r1
                L13:
                    int r1 = -r1
                    int r1 = r1 + r6
                    r2 = r3
                    r6 = r1
                    r1 = r0
                L18:
                    byte r0 = (byte) r6
                    r5[r2] = r0
                    int r3 = r2 + 1
                    if (r2 != r8) goto L27
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    r11[r4] = r0
                    return
                L27:
                    int r0 = r1 + 1
                    r1 = r7[r0]
                    goto L13
                L2c:
                    r2 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.v.AnonymousClass5.g(byte, short, short, java.lang.Object[]):void");
            }

            private static void i(char c2, String str, String str2, String str3, int i10, Object[] objArr7) throws Throwable {
                String str4 = str;
                String str5 = str2;
                String str6 = str3;
                int i11 = 2 % 2;
                Object charArray = str6;
                if (str6 != null) {
                    int i12 = $10 + 101;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 25 / 0;
                        charArray = str6.toCharArray();
                    } else {
                        charArray = str6.toCharArray();
                    }
                }
                char[] cArr = (char[]) charArray;
                Object obj = null;
                Object charArray2 = str5;
                if (str5 != null) {
                    int i14 = $10 + 3;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        str5.toCharArray();
                        throw null;
                    }
                    charArray2 = str5.toCharArray();
                }
                char[] cArr2 = (char[]) charArray2;
                Object charArray3 = str4;
                if (str4 != null) {
                    charArray3 = str4.toCharArray();
                }
                o.a.i iVar = new o.a.i();
                int length = cArr.length;
                char[] cArr3 = new char[length];
                int length2 = cArr2.length;
                char[] cArr4 = new char[length2];
                System.arraycopy(cArr, 0, cArr3, 0, length);
                System.arraycopy(cArr2, 0, cArr4, 0, length2);
                cArr3[0] = (char) (cArr3[0] ^ c2);
                cArr4[2] = (char) (cArr4[2] + ((char) i10));
                int length3 = ((char[]) charArray3).length;
                char[] cArr5 = new char[length3];
                iVar.f19932b = 0;
                while (iVar.f19932b < length3) {
                    try {
                        Object[] objArr8 = {iVar};
                        Object objA = o.d.d.a(540069882);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            objA = o.d.d.a(107 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -155898465, false, $$g((byte) 57, b2, b2), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr8)).intValue();
                        Object[] objArr9 = {iVar};
                        Object objA2 = o.d.d.a(2068572);
                        if (objA2 == null) {
                            byte b3 = (byte) 0;
                            objA2 = o.d.d.a(848 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (View.MeasureSpec.getMode(0) + 6488), View.combineMeasuredStates(0, 0) + 12, -694521287, false, $$g((byte) 54, b3, b3), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr9)).intValue();
                        Object[] objArr10 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                        Object objA3 = o.d.d.a(-1122996612);
                        if (objA3 == null) {
                            byte b4 = (byte) 0;
                            objA3 = o.d.d.a(View.resolveSize(0, 0) + 458, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 11, 1804962841, false, $$g((byte) 56, b4, b4), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objA3).invoke(null, objArr10);
                        Object[] objArr11 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                        Object objA4 = o.d.d.a(-1223178239);
                        if (objA4 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objA4 = o.d.d.a(TextUtils.indexOf("", "") + 639, (char) (Gravity.getAbsoluteGravity(0, 0) + 65100), Process.getGidForName("") + 13, 1636969060, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr11)).charValue();
                        cArr3[iIntValue2] = iVar.f19933e;
                        cArr5[iVar.f19932b] = (char) ((((long) ((int) (((long) f25197a) ^ 740602047300126166L))) ^ (((long) (cArr3[iIntValue2] ^ r8[iVar.f19932b])) ^ (f25198d ^ 740602047300126166L))) ^ ((long) ((char) (((long) f25199e) ^ 740602047300126166L))));
                        iVar.f19932b++;
                        obj = null;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr7[0] = new String(cArr5);
            }

            static void init$0() {
                $$a = new byte[]{97, 98, -19, -80};
                $$b = 228;
            }

            static void init$1() {
                $$d = new byte[]{97, 52, 124, MessagePack.Code.EXT16};
                $$e = 164;
            }

            static void init$2() {
                $$c = new byte[]{76, -80, -89, 46};
                $$f = 73;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0017). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void j(short r7, int r8, short r9, java.lang.Object[] r10) {
                /*
                    int r0 = r8 * 2
                    int r8 = 3 - r0
                    int r0 = r7 * 2
                    int r1 = r0 + 97
                    int r2 = r9 * 4
                    int r0 = 1 - r2
                    byte[] r7 = o.er.v.AnonymousClass5.$$d
                    byte[] r6 = new byte[r0]
                    r5 = 0
                    int r4 = 0 - r2
                    if (r7 != 0) goto L2f
                    r2 = r8
                    r0 = r5
                L17:
                    int r1 = -r1
                    int r1 = r1 + r2
                L19:
                    byte r2 = (byte) r1
                    r6[r0] = r2
                    if (r0 != r4) goto L26
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r6, r5)
                    r10[r5] = r0
                    return
                L26:
                    int r8 = r8 + 1
                    r3 = r7[r8]
                    int r0 = r0 + 1
                    r2 = r1
                    r1 = r3
                    goto L17
                L2f:
                    r0 = r5
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.v.AnonymousClass5.j(short, int, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0286  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x06b8  */
            @Override // o.eo.e.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(o.by.c r29) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 2135
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.v.AnonymousClass5.a(o.by.c):void");
            }

            @Override // o.eo.e.d
            public final void d(List<o.ep.i> list) {
                int i10 = 2 % 2;
                Iterator<o.ep.i> it = list.iterator();
                while (!(!it.hasNext())) {
                    int i11 = f25200f + 107;
                    f25201h = i11 % 128;
                    int i12 = i11 % 2;
                    if (it.next().o() == i.b.f24652a) {
                        int i13 = f25201h + 67;
                        f25200f = i13 % 128;
                        if (i13 % 2 != 0) {
                            it.remove();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        it.remove();
                        int i14 = f25200f + 67;
                        f25201h = i14 % 128;
                        if (i14 % 2 == 0) {
                            int i15 = 5 % 5;
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(list.size());
                Iterator<o.ep.i> it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        arrayList.add(new Token(v.this.f25009a, (o.eq.e) v.this.f25009a.G(), it2.next()));
                        int i16 = f25200f + 91;
                        f25201h = i16 % 128;
                        int i17 = i16 % 2;
                    } catch (WalletValidationException unused) {
                        operationCallback.onError(new o.by.c(AntelopErrorCode.InternalError).a());
                        return;
                    }
                }
                operationCallback.onSuccess(arrayList);
            }
        }};
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i10 = o.eo.e.f24304b * (-1905940773);
        o.eo.e.f24304b = i10;
        int id = (int) Thread.currentThread().getId();
        int i11 = o.eo.e.f24303a * 720860110;
        o.eo.e.f24303a = i11;
        o.eo.e.c(iMaxMemory, i11, id, -1627101864, 1627101864, objArr6, i10);
    }

    @Override // o.er.h
    public final c[] h() {
        int i2 = 2 % 2;
        int i3 = f25192d + 29;
        f25194f = i3 % 128;
        int i4 = i3 % 2;
        c[] cVarArr = {this.f25010g.h()};
        int i5 = f25194f + 57;
        f25192d = i5 % 128;
        int i6 = i5 % 2;
        return cVarArr;
    }
}
