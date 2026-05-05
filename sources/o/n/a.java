package o.n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.common.base.Ascii;
import fr.antelop.sdk.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.MissingFormatArgumentException;
import java.util.Random;
import o.a.i;
import o.ea.f;
import o.ea.m;
import o.ec.c;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1593ug;
import yg.FB;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
public class a extends c {
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static final String TAG;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f26581a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static short[] f26582b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f26583c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f26584d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f26585e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f26586f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f26587h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f26588i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f26589j = 0;
    boolean callbackFired;
    private b keypadCallback;
    private ByteBuffer pinBuffer;
    private d pinEntryBullet;
    private int pinIdx;
    private e theming;

    public interface b {
        void onExtraButtonPressed();

        void onKeyPressed();

        void onPasscodeEntryDone(byte[] bArr);
    }

    public static final class d extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f26604a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f26605d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f26606e = -736963446;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImageView[] f26607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f26608c;

        public d(Context context, e eVar) {
            super(context);
            this.f26607b = new ImageView[eVar.pinNumber];
            this.f26608c = eVar;
            int i2 = 0;
            setOrientation(0);
            setGravity(1);
            setContentDescription(eVar.digitsCounterAccessibilityLabel);
            while (i2 < eVar.pinNumber) {
                this.f26607b[i2] = new ImageView(context);
                this.f26607b[i2].setImageResource(eVar.bulletDrawable);
                this.f26607b[i2].setColorFilter(eVar.bulletUnselectedColor);
                Object[] objArr = {context, Float.valueOf(6.0f)};
                int priority = Thread.currentThread().getPriority();
                int priority2 = Thread.currentThread().getPriority();
                int i3 = m.f23564e * 1516253574;
                m.f23564e = i3;
                int iIntValue = ((Integer) m.c(objArr, new Random().nextInt(565634034), priority2, 499039219, priority, -499039218, i3)).intValue();
                this.f26607b[i2].setPadding(iIntValue, iIntValue, iIntValue, iIntValue);
                addView(this.f26607b[i2]);
                int i4 = (i2 ^ 61) + ((i2 & 61) << 1);
                i2 = (i4 ^ (-60)) + (((i4 - 60) - (i4 | (-60))) << 1);
            }
        }

        public final void c() {
            int i2 = 2 % 2;
            int i3 = f26606e * (-212108361);
            f26606e = i3;
            int i4 = ~i3;
            int i5 = ~((-1) - (((-1) - (((-2126579241) + i4) - ((-2126579241) | i4))) & ((-1) - (i4 ^ (-2126579241)))));
            int i6 = 109053472 ^ i5;
            int i7 = (i5 + 109053472) - (i5 | 109053472);
            int i8 = (-1522990834) - (~(-(-(((i7 + i6) - (i7 & i6)) * 184))));
            int i9 = -(-(((i3 & (-2129125177)) | (i3 ^ (-2129125177))) * (-184)));
            int i10 = (i8 ^ i9) + (((i9 + i8) - (i9 | i8)) << 1);
            int i11 = (~((-1) - (((-1) - ((-1) - (((-1) - (-111599409)) | ((-1) - i4)))) & ((-1) - ((-111599409) ^ i4))))) * 184;
            int i12 = (i10 & i11) + ((-1) - (((-1) - i11) & ((-1) - i10)));
            int iIdentityHashCode = System.identityHashCode(this);
            int i13 = ~iIdentityHashCode;
            int i14 = ~((1607568851 & i13) | (1607568851 ^ i13));
            int i15 = -(-(((~(i13 | (-1072059986))) | ((-1) - (((-1) - (i14 & 539382272)) & ((-1) - (i14 ^ 539382272))))) * (-397)));
            int i16 = ((-1) - (((-1) - (-528283840)) | ((-1) - i15))) + (i15 | (-528283840));
            int i17 = ((-1) - (((-1) - iIdentityHashCode) | ((-1) - 539382272))) | (iIdentityHashCode ^ 539382272);
            int i18 = i12 > (((i16 ^ 613602816) + (((-1) - (((-1) - 613602816) | ((-1) - i16))) << 1)) - (~(-(-(((-1) - (((-1) - ((-1) - (((-1) - i17) | ((-1) - 1074891138)))) & ((-1) - (i17 ^ 1074891138)))) * 397))))) - 1 ? 1 : 0;
            int i19 = f26605d + 87;
            f26604a = i19 % 128;
            int i20 = i19 % 2;
            while (i18 < this.f26608c.pinNumber) {
                int i21 = f26604a;
                int i22 = (i21 & 91) + ((-1) - (((-1) - i21) & ((-1) - 91)));
                f26605d = i22 % 128;
                int i23 = i22 % 2;
                this.f26607b[i18].setColorFilter(this.f26608c.bulletUnselectedColor);
                int i24 = i18 + 35;
                i18 = ((-1) - (((-1) - i24) & ((-1) - (-34)))) + ((i24 - 34) - ((-34) | i24));
                int i25 = f26605d;
                int i26 = (i25 ^ 97) + (((i25 + 97) - (i25 | 97)) << 1);
                f26604a = i26 % 128;
                int i27 = i26 % 2;
            }
            int i28 = f26605d + 107;
            f26604a = i28 % 128;
            int i29 = i28 % 2;
        }

        public final void setNotSelected(int i2) {
            int i3 = 2 % 2;
            int i4 = f26605d + 1;
            f26604a = i4 % 128;
            int i5 = i4 % 2;
            this.f26607b[i2].setColorFilter(this.f26608c.bulletUnselectedColor);
            int i6 = f26604a;
            int i7 = (((i6 + 85) - (85 & i6)) << 1) - (i6 ^ 85);
            f26605d = i7 % 128;
            int i8 = i7 % 2;
        }

        public final void setSelected(int i2) {
            int i3 = 2 % 2;
            int i4 = f26604a;
            int i5 = (i4 ^ 35) + ((i4 & 35) << 1);
            f26605d = i5 % 128;
            int i6 = i5 % 2;
            this.f26607b[i2].setColorFilter(this.f26608c.bulletSelectedColor);
            int i7 = f26604a + 73;
            f26605d = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 55 / 0;
            }
        }
    }

    public static class e extends c.b {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static long f26609a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f26610b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f26611c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f26612d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static char f26613e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f26614f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f26615g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static int f26616h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static int f26617i = 0;
        final int bulletDrawable;
        final int bulletSelectedColor;
        final int bulletUnselectedColor;
        final String digitsCounterAccessibilityLabel;
        final String digitsCounterAccessibilityValueFormat;
        final int pinNumber;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(byte r8, int r9, short r10) {
            /*
                byte[] r7 = o.n.a.e.$$c
                int r0 = r9 * 4
                int r6 = 4 - r0
                int r5 = r10 * 2
                int r0 = r5 + 1
                int r4 = r8 + 65
                byte[] r3 = new byte[r0]
                r2 = 0
                if (r7 != 0) goto L27
                r0 = r5
                r1 = r2
            L13:
                int r0 = -r0
                int r6 = r6 + 1
                int r4 = r4 + r0
            L17:
                byte r0 = (byte) r4
                r3[r1] = r0
                if (r1 != r5) goto L22
                java.lang.String r0 = new java.lang.String
                r0.<init>(r3, r2)
                return r0
            L22:
                int r1 = r1 + 1
                r0 = r7[r6]
                goto L13
            L27:
                r1 = r2
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.n.a.e.$$e(byte, int, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            f26617i = 176565067;
            f26616h = 1362605907;
            f26615g = -475772516;
            f26614f = -75964761;
            init$0();
            f26611c = 0;
            f26612d = 1;
            f26609a = 740602047300126166L;
            f26610b = -583432870;
            f26613e = (char) 17878;
        }

        public e(int i2, int i3, int i4, int i5, String str, String str2, int i6, int i7, int i8, int i9, int i10, String str3, String str4, String str5, String str6, boolean z2) {
            super(i6, i7, i8, z2, i9, i10, str3, str4, str5, str6);
            this.pinNumber = i2;
            this.bulletDrawable = i3;
            this.bulletSelectedColor = i4;
            this.bulletUnselectedColor = i5;
            this.digitsCounterAccessibilityLabel = str;
            this.digitsCounterAccessibilityValueFormat = str2;
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(Unknown Source)
            	at java.base/java.util.TreeMap.lastKey(Unknown Source)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] c(android.content.Context r22, int r23, int r24, int r25) {
            /*
                Method dump skipped, instruction units count: 1694
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.n.a.e.c(android.content.Context, int, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{67, Ascii.SI, 99, -76};
            $$b = 222;
        }

        static void init$1() {
            $$c = new byte[]{84, 109, 90, 4};
            $$d = 243;
        }

        private static void j(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int i3 = 2;
            int i4 = 2 % 2;
            Object charArray = str6;
            if (str6 != null) {
                charArray = str6.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            Object charArray2 = str5;
            if (str5 != null) {
                int i5 = $11 + 69;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                charArray2 = str5.toCharArray();
            }
            char[] cArr2 = (char[]) charArray2;
            Object charArray3 = str4;
            if (str4 != null) {
                charArray3 = str4.toCharArray();
            }
            i iVar = new i();
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
                int i7 = $11 + 71;
                $10 = i7 % 128;
                int i8 = i7 % i3;
                try {
                    Object[] objArr2 = {iVar};
                    Object objA = o.d.d.a(540069882);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(Color.alpha(0) + 106, (char) Color.blue(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10, -155898465, false, $$e(b2, b3, b3), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {iVar};
                    Object objA2 = o.d.d.a(2068572);
                    if (objA2 == null) {
                        int i9 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 847;
                        char c3 = (char) (6489 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int size = View.MeasureSpec.getSize(0) + 12;
                        byte b4 = (byte) ((-1) - (((-1) - $$d) | ((-1) - 15)));
                        byte b5 = (byte) (b4 - 3);
                        objA2 = o.d.d.a(i9, c3, size, -694521287, false, $$e(b4, b5, b5), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA3 = o.d.d.a(-1122996612);
                    if (objA3 == null) {
                        int iMakeMeasureSpec = 458 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        char cRed = (char) Color.red(0);
                        int iMyPid = (Process.myPid() >> 22) + 11;
                        byte b6 = (byte) ((-1) - (((-1) - $$d) | ((-1) - 5)));
                        byte b7 = (byte) (b6 - 1);
                        objA3 = o.d.d.a(iMakeMeasureSpec, cRed, iMyPid, 1804962841, false, $$e(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA4 = o.d.d.a(-1223178239);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        objA4 = o.d.d.a(639 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (65101 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.CR, 1636969060, false, $$e((byte) 57, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    cArr3[iIntValue2] = iVar.f19933e;
                    cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r8[iVar.f19932b])) ^ (f26609a ^ 740602047300126166L)) ^ ((long) ((int) (((long) f26610b) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f26613e) ^ 740602047300126166L))));
                    iVar.f19932b++;
                    int i10 = $10 + 5;
                    $11 = i10 % 128;
                    i3 = 2;
                    int i11 = i10 % 2;
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

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0011). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void k(short r8, short r9, short r10, java.lang.Object[] r11) {
            /*
                int r7 = r10 * 2
                int r0 = r7 + 1
                int r6 = r9 + 97
                byte[] r5 = o.n.a.e.$$a
                int r1 = r8 + 4
                byte[] r4 = new byte[r0]
                r3 = 0
                if (r5 != 0) goto L29
                r2 = r3
                r0 = r1
            L11:
                int r1 = -r1
                int r1 = r1 + r6
                r6 = r1
                r1 = r0
            L15:
                int r0 = r1 + 1
                byte r1 = (byte) r6
                r4[r2] = r1
                if (r2 != r7) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                r11[r3] = r0
                return
            L24:
                int r2 = r2 + 1
                r1 = r5[r0]
                goto L11
            L29:
                r2 = r3
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: o.n.a.e.k(short, short, short, java.lang.Object[]):void");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r6, int r7, short r8) {
        /*
            int r0 = 104 - r6
            int r3 = r8 * 3
            int r2 = 1 - r3
            int r1 = r7 * 4
            int r8 = 3 - r1
            byte[] r7 = o.n.a.$$c
            byte[] r6 = new byte[r2]
            r5 = 0
            int r4 = 0 - r3
            if (r7 != 0) goto L2c
            r2 = r8
            r3 = r5
        L15:
            int r0 = -r0
            int r0 = r0 + r8
            r8 = r2
        L18:
            byte r1 = (byte) r0
            r6[r3] = r1
            int r2 = r8 + 1
            if (r3 != r4) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L25:
            int r3 = r3 + 1
            r1 = r7[r2]
            r8 = r0
            r0 = r1
            goto L15
        L2c:
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.n.a.$$g(byte, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26587h = 0;
        f26589j = 1;
        f26588i = 0;
        f26586f = 1;
        b();
        Object[] objArr = new Object[1];
        m((short) ((ViewConfiguration.getEdgeSlop() >> 16) + 89), (-129444353) + (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 977007573 + (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-83) - TextUtils.lastIndexOf("", '0', 0, 0), (byte) View.resolveSize(0, 0), objArr);
        TAG = ((String) objArr[0]).intern();
        int i2 = f26587h + 71;
        f26589j = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 30 / 0;
        }
    }

    public a(Context context) {
        super(context);
        this.pinIdx = 0;
        this.callbackFired = false;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.pinIdx = 0;
        this.callbackFired = false;
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.pinIdx = 0;
        this.callbackFired = false;
    }

    private void announceEnteredDigitsCountForAccessibility(int i2) throws Throwable {
        int i3 = 2 % 2;
        try {
            if (this.theming.digitsCounterAccessibilityValueFormat != null) {
                getRootView().announceForAccessibility(String.format(this.theming.digitsCounterAccessibilityValueFormat, Integer.valueOf(i2), Integer.valueOf(this.theming.pinNumber)));
                return;
            }
            View rootView = getRootView();
            Context context = getContext();
            Class<?> cls = Class.forName(C1593ug.zd("\u0017%\u001c+)$ j!..5'18r\t66=/C@", (short) (FB.Xd() ^ 3430), (short) (FB.Xd() ^ 25909)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1499aX.Xd() ^ (-7967));
            int[] iArr = new int["iftQcpkpl\\]j".length()];
            QB qb = new QB("iftQcpkpl\\]j");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(sXd + sXd + i4 + xuXd.CK(iKK));
                i4++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i4), clsArr);
            try {
                method.setAccessible(true);
                rootView.announceForAccessibility(String.format(((Resources) method.invoke(context, objArr)).getString(R.string.antelopKeypadViewDefaultDigitsCounterAccessibilityValueFormat), Integer.valueOf(i2), Integer.valueOf(this.theming.pinNumber)));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (MissingFormatArgumentException e3) {
            if (f.a()) {
                Object[] objArr2 = new Object[1];
                m((short) (ExpandableListView.getPackedPositionType(0L) + 89), Gravity.getAbsoluteGravity(0, 0) - 129444352, 977007573 - (Process.myTid() >> 22), (-82) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (KeyEvent.getMaxKeyCode() >> 16), objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr3 = new Object[1];
                m((short) (128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (-129444337) - (ViewConfiguration.getScrollDefaultDelay() >> 16), 977007580 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 60, (byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr3);
                StringBuilder sbAppend = sb.append(((String) objArr3[0]).intern()).append(this.theming.digitsCounterAccessibilityValueFormat);
                Object[] objArr4 = new Object[1];
                m((short) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 20), (-129444300) - Color.blue(0), 62442 - AndroidCharacter.getMirror('0'), (-59) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) View.MeasureSpec.getSize(0), objArr4);
                f.e(strIntern, sbAppend.append(((String) objArr4[0]).intern()).toString(), e3);
                int i5 = f26586f + 69;
                f26588i = i5 % 128;
                int i6 = i5 % 2;
            }
            int i7 = f26586f + 37;
            f26588i = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        }
    }

    static void b() {
        f26584d = 1126508429;
        f26583c = 1150422511;
        f26585e = -2125069856;
        f26581a = new byte[]{52, 46, 55, Ascii.DC4, 39, Ascii.NAK, 19, 54, 76, -13, 59, 45, 42, 19, 87, 5, -22, MessagePack.Code.STR8, -9, Ascii.VT, -11, -14, Ascii.SI, 89, MessagePack.Code.FIXSTR_PREFIX, Ascii.EM, -8, -15, 9, 7, 74, -91, Ascii.VT, 1, -13, 9, 5, -9, -6, Ascii.FF, 2, Ascii.SO, Ascii.FF, Ascii.SO, 79, -80, -15, -13, 1, -31, 4, 43, 43, 127, 120, 105, 121, 99, 108, 104, 127, 96, 97, 116, MessagePack.Code.FIXSTR_PREFIX, Ascii.RS, 124, 122, 100, 98, 126, 104, 111, 97, 119, 99, 97, 99, MessagePack.Code.FIXSTR_PREFIX, 40, 104, 124, 104, 97, 126, 103, -119, -110, 83, 126, -115, -115, -115};
    }

    static void init$0() {
        $$c = new byte[]{60, 66, -100, 104};
        $$f = 226;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m(short r24, int r25, int r26, int r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.n.a.m(short, int, int, int, byte, java.lang.Object[]):void");
    }

    @Override // o.ec.c
    public void customizeView() {
        int i2 = 2 % 2;
        Object[] objArr = {getContext(), Float.valueOf(1.0f)};
        int priority = Thread.currentThread().getPriority();
        int priority2 = Thread.currentThread().getPriority();
        int i3 = m.f23564e * 1516253574;
        m.f23564e = i3;
        int iIntValue = ((Integer) m.c(objArr, new Random().nextInt(565634034), priority2, 499039219, priority, -499039218, i3)).intValue();
        this.pinEntryBullet = new d(getContext(), this.theming);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i4 = iIntValue << 3;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i4;
        this.pinEntryBullet.setLayoutParams(layoutParams);
        addView(this.pinEntryBullet);
        View linearLayout = new LinearLayout(getContext());
        linearLayout.setBackgroundColor(this.theming.bulletUnselectedColor);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, iIntValue);
        int i5 = iIntValue * 24;
        ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = i5;
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = i5;
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i4;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i4;
        linearLayout.setLayoutParams(layoutParams2);
        addView(linearLayout);
        int i6 = f26586f + 31;
        f26588i = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void initializeView(final b bVar, e eVar) {
        int i2 = 2 % 2;
        this.theming = eVar;
        this.keypadCallback = bVar;
        this.pinBuffer = ByteBuffer.allocate(eVar.pinNumber);
        super.initializeView(new c.d() { // from class: o.n.a.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f26590a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static char[] f26591c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static boolean f26592d = false;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static boolean f26593f = false;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static int f26594g = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static int f26595h = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f26596i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static int f26597j = 0;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static int f26598k = 0;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static int f26599l = 0;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static int f26600m = 0;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static int f26601n = 0;

            private static String $$e(int i3, int i4, byte b2) {
                int i5 = 4 - (b2 * 2);
                byte[] bArr = $$c;
                int i6 = i4 * 2;
                int i7 = (i3 * 6) + 67;
                byte[] bArr2 = new byte[i6 + 1];
                int i8 = -1;
                if (bArr == null) {
                    i7 += -i6;
                    i5++;
                }
                while (true) {
                    i8++;
                    bArr2[i8] = (byte) i7;
                    if (i8 == i6) {
                        return new String(bArr2, 0);
                    }
                    i7 += -bArr[i5];
                    i5++;
                }
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                f26601n = 28545282;
                f26600m = 1699043310;
                f26599l = -1990985785;
                f26598k = 1720705495;
                f26597j = -1455488664;
                f26595h = 1086388653;
                init$0();
                f26594g = 0;
                f26596i = 1;
                f26591c = new char[]{2124, 2098, 2147, 2112, 2117, 2096, 2126, 2101, 2146, 2102, 2121, 2114, 2099, 2115, 2110, 2116, 2145, 2441, 2166, 2108, 2122, 2123, 2118, 2103, 2113, 2164};
                f26590a = 2040400295;
                f26592d = true;
                f26593f = true;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(6:(2:84|31)|(1:33)(4:35|89|36|(4:38|99|43|(5:45|55|(4:95|57|(2:59|60)(4:68|93|69|70)|(2:62|(3:64|(1:66)|67)))|74|75)(9:46|91|47|87|48|49|(0)|74|75))(1:39))|34|99|43|(0)(0)) */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0455  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0456 A[Catch: Exception -> 0x0491, TRY_LEAVE, TryCatch #8 {Exception -> 0x0491, blocks: (B:43:0x0430, B:46:0x0456, B:49:0x0480, B:53:0x048a, B:54:0x0490), top: B:99:0x0430 }] */
            /* JADX WARN: Removed duplicated region for block: B:95:0x0494 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.Object[] e(int r21, int r22) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1519
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.n.a.AnonymousClass5.e(int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{84, 109, 90, 4};
                $$b = 150;
            }

            static void init$1() {
                $$c = new byte[]{38, Ascii.CAN, 67, -113};
                $$d = 67;
            }

            private static void o(int i3, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
                char[] cArr;
                String str3 = str;
                String str4 = str2;
                int i4 = 2;
                int i5 = 2 % 2;
                Object obj = null;
                Object bytes = str4;
                if (str4 != null) {
                    int i6 = $10 + 91;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        str4.getBytes("ISO-8859-1");
                        obj.hashCode();
                        throw null;
                    }
                    bytes = str4.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                Object charArray = str3;
                if (str3 != null) {
                    charArray = str3.toCharArray();
                }
                char[] cArr2 = (char[]) charArray;
                o.a.f fVar = new o.a.f();
                char[] cArr3 = f26591c;
                int i7 = 0;
                if (cArr3 != null) {
                    int length = cArr3.length;
                    char[] cArr4 = new char[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 113;
                        $10 = i9 % 128;
                        int i10 = i9 % i4;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr3[i8])};
                            Object objA = o.d.d.a(1618406102);
                            if (objA == null) {
                                byte b2 = (byte) i7;
                                byte b3 = b2;
                                objA = o.d.d.a(KeyEvent.keyCodeFromString("") + 593, (char) (ExpandableListView.getPackedPositionType(0L) + 13181), 11 - (ViewConfiguration.getScrollBarSize() >> 8), -1225586509, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr4[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                            i8++;
                            i4 = 2;
                            i7 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr3 = cArr4;
                }
                Object[] objArr3 = {Integer.valueOf(f26590a)};
                Object objA2 = o.d.d.a(-1503702982);
                if (objA2 == null) {
                    objA2 = o.d.d.a(KeyEvent.getDeadChar(0, 0) + 32, (char) View.resolveSizeAndState(0, 0, 0), 11 - TextUtils.getOffsetAfter("", 0), 1893380703, false, "F", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                if (f26593f) {
                    fVar.f19923e = bArr.length;
                    char[] cArr5 = new char[fVar.f19923e];
                    fVar.f19922a = 0;
                    while (fVar.f19922a < fVar.f19923e) {
                        cArr5[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i3] - iIntValue);
                        Object[] objArr4 = {fVar, fVar};
                        Object objA3 = o.d.d.a(1540807955);
                        if (objA3 == null) {
                            int iBlue = Color.blue(0) + 458;
                            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11;
                            int i11 = $$d;
                            byte b4 = (byte) ((i11 + 5) - (i11 | 5));
                            byte b5 = (byte) (b4 - 1);
                            objA3 = o.d.d.a(iBlue, maximumDrawingCacheSize, maximumFlingVelocity, -1923924106, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr4);
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                if (f26592d) {
                    int i12 = $10 + 63;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        fVar.f19923e = cArr2.length;
                        cArr = new char[fVar.f19923e];
                        fVar.f19922a = 1;
                    } else {
                        fVar.f19923e = cArr2.length;
                        cArr = new char[fVar.f19923e];
                        fVar.f19922a = 0;
                    }
                    while (fVar.f19922a < fVar.f19923e) {
                        cArr[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i3] - iIntValue);
                        Object[] objArr5 = {fVar, fVar};
                        Object objA4 = o.d.d.a(1540807955);
                        if (objA4 == null) {
                            int i13 = 458 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            char mode = (char) View.MeasureSpec.getMode(0);
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 11;
                            byte b6 = (byte) ((-1) - (((-1) - $$d) | ((-1) - 5)));
                            byte b7 = (byte) (b6 - 1);
                            objA4 = o.d.d.a(i13, mode, iResolveOpacity, -1923924106, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA4).invoke(null, objArr5);
                    }
                    objArr[0] = new String(cArr);
                    return;
                }
                int i14 = 0;
                fVar.f19923e = iArr.length;
                char[] cArr6 = new char[fVar.f19923e];
                while (true) {
                    fVar.f19922a = i14;
                    if (fVar.f19922a >= fVar.f19923e) {
                        objArr[0] = new String(cArr6);
                        return;
                    }
                    int i15 = $10 + 83;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        cArr6[fVar.f19922a] = (char) (cArr3[iArr[fVar.f19923e + fVar.f19922a] + i3] + iIntValue);
                        int i16 = fVar.f19922a;
                        i14 = 0;
                    } else {
                        cArr6[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i3] - iIntValue);
                        i14 = fVar.f19922a + 1;
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0015). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void p(short r5, short r6, int r7, java.lang.Object[] r8) {
                /*
                    int r7 = r7 + 4
                    int r0 = r6 * 2
                    int r6 = r0 + 100
                    int r1 = r5 * 3
                    int r0 = 1 - r1
                    byte[] r5 = o.n.a.AnonymousClass5.$$a
                    byte[] r4 = new byte[r0]
                    r3 = 0
                    int r2 = 0 - r1
                    if (r5 != 0) goto L2a
                    r0 = r2
                    r1 = r3
                L15:
                    int r6 = r6 + r0
                L16:
                    int r7 = r7 + 1
                    byte r0 = (byte) r6
                    r4[r1] = r0
                    if (r1 != r2) goto L25
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    r8[r3] = r0
                    return
                L25:
                    int r1 = r1 + 1
                    r0 = r5[r7]
                    goto L15
                L2a:
                    r1 = r3
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: o.n.a.AnonymousClass5.p(short, short, int, java.lang.Object[]):void");
            }

            @Override // o.ec.c.d
            public final void b() {
                int i3 = 2 % 2;
                int i4 = f26596i + 51;
                f26594g = i4 % 128;
                int i5 = i4 % 2;
                bVar.onExtraButtonPressed();
                int i6 = f26596i + 111;
                f26594g = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 46 / 0;
                }
            }

            @Override // o.ec.c.d
            public final void b(char c2) throws Throwable {
                int i3 = 2 % 2;
                int i4 = f26594g + 65;
                f26596i = i4 % 128;
                if (i4 % 2 != 0) {
                    a.this.onDigitPressed(c2);
                    return;
                }
                a.this.onDigitPressed(c2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.ec.c.d
            public final void e() throws Throwable {
                int i3 = 2 % 2;
                int i4 = f26594g + 15;
                f26596i = i4 % 128;
                int i5 = i4 % 2;
                a.this.onDigitRemoved();
                int i6 = f26596i + 63;
                f26594g = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 50 / 0;
                }
            }
        }, eVar);
        int i3 = f26586f + 123;
        f26588i = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void onDigitPressed(char r8) throws java.lang.Throwable {
        /*
            r7 = this;
            r6 = 2
            int r0 = r6 % r6
            int r1 = r7.pinIdx
            o.n.a$e r0 = r7.theming
            int r0 = r0.pinNumber
            r5 = 0
            r4 = 1
            if (r1 >= r0) goto L2f
            int r0 = o.n.a.f26586f
            int r1 = r0 + 123
            int r0 = r1 % 128
            o.n.a.f26588i = r0
            int r1 = r1 % r6
            java.nio.ByteBuffer r1 = r7.pinBuffer
            byte r0 = (byte) r8
            r1.put(r0)
            o.n.a$d r1 = r7.pinEntryBullet
            java.nio.ByteBuffer r0 = r7.pinBuffer
            int r0 = r0.position()
            int r0 = r0 - r4
            r1.setSelected(r0)
            int r0 = r7.pinIdx
            int r0 = r0 + r4
            r7.pinIdx = r0
            r7.callbackFired = r5
        L2f:
            java.nio.ByteBuffer r0 = r7.pinBuffer
            int r1 = r0.position()
            o.n.a$e r0 = r7.theming
            int r0 = r0.pinNumber
            if (r1 != r0) goto L74
            int r3 = o.n.a.f26586f
            int r1 = r3 + 15
            int r0 = r1 % 128
            o.n.a.f26588i = r0
            int r1 = r1 % r6
            o.n.a$b r2 = r7.keypadCallback
            if (r2 == 0) goto L69
            int r1 = r3 + 31
            int r0 = r1 % 128
            o.n.a.f26588i = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L6f
            boolean r1 = r7.callbackFired
            r0 = 88
            int r0 = r0 / r5
            if (r1 != 0) goto L69
        L58:
            java.nio.ByteBuffer r0 = r7.pinBuffer
            byte[] r0 = r0.array()
            java.lang.Object r0 = r0.clone()
            byte[] r0 = (byte[]) r0
            r2.onPasscodeEntryDone(r0)
            r7.callbackFired = r4
        L69:
            int r0 = r7.pinIdx
            r7.announceEnteredDigitsCountForAccessibility(r0)
            return
        L6f:
            boolean r0 = r7.callbackFired
            if (r0 != 0) goto L69
            goto L58
        L74:
            o.n.a$b r0 = r7.keypadCallback
            if (r0 == 0) goto L69
            r0.onKeyPressed()
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: o.n.a.onDigitPressed(char):void");
    }

    public void onDigitRemoved() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26588i + 103;
        f26586f = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.pinBuffer.position();
            obj.hashCode();
            throw null;
        }
        if (this.pinBuffer.position() > 0) {
            this.pinEntryBullet.setNotSelected(this.pinBuffer.position() - 1);
            this.pinBuffer.position(r1.position() - 1);
            int i4 = this.pinIdx - 1;
            this.pinIdx = i4;
            announceEnteredDigitsCountForAccessibility(i4);
            b bVar = this.keypadCallback;
            if (bVar != null) {
                int i5 = f26588i + 49;
                f26586f = i5 % 128;
                if (i5 % 2 == 0) {
                    bVar.onKeyPressed();
                    throw null;
                }
                bVar.onKeyPressed();
            }
        }
        int i6 = f26586f + 55;
        f26588i = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void resetPasscode() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = o.n.a.f26588i
            int r1 = r0 + 109
            int r0 = r1 % 128
            o.n.a.f26586f = r0
            int r1 = r1 % r3
            r2 = 0
            if (r1 != 0) goto L33
            o.n.a$e r0 = r4.theming
            int r0 = r0.pinNumber
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r4.pinBuffer = r0
            r4.pinIdx = r2
            o.n.a$d r0 = r4.pinEntryBullet
            if (r0 == 0) goto L24
        L1f:
            o.n.a$d r0 = r4.pinEntryBullet
            r0.c()
        L24:
            int r0 = o.n.a.f26586f
            int r1 = r0 + 105
            int r0 = r1 % 128
            o.n.a.f26588i = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L32
            r0 = 22
            int r0 = r0 / r2
        L32:
            return
        L33:
            o.n.a$e r0 = r4.theming
            int r0 = r0.pinNumber
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r4.pinBuffer = r0
            r4.pinIdx = r2
            o.n.a$d r0 = r4.pinEntryBullet
            if (r0 == 0) goto L24
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: o.n.a.resetPasscode():void");
    }
}
