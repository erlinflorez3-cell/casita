package fr.antelop.sdk.authentication.prompt;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import o.a.q;
import o.az.a;
import o.d.d;
import o.dd.e;
import o.dd.g;
import o.ea.f;
import o.en.b;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CustomerAuthenticationPromptBuilder {
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f18801a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f18802b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f18803e = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r9, byte r10, int r11) {
        /*
            byte[] r8 = fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPromptBuilder.$$c
            int r0 = r9 * 7
            int r0 = 78 - r0
            int r1 = r10 * 4
            int r7 = 3 - r1
            int r2 = r11 * 3
            int r1 = 1 - r2
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r8 != 0) goto L2e
            r2 = r7
            r1 = r4
            r3 = r5
        L18:
            int r7 = r7 + r1
            r0 = r7
            r7 = r2
        L1b:
            int r2 = r7 + 1
            byte r1 = (byte) r0
            r6[r3] = r1
            if (r3 != r4) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L28:
            int r3 = r3 + 1
            r1 = r8[r2]
            r7 = r0
            goto L18
        L2e:
            r3 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPromptBuilder.$$i(byte, byte, int):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        f18802b = 0;
        f18803e = 1;
        f18801a = 7736580695857745726L;
    }

    private static void L(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 95;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i6 = $11 + 121;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = d.a(-1011865131);
                    if (objA == null) {
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 731;
                        char tapTimeout2 = (char) (7933 - (ViewConfiguration.getTapTimeout() >> 16));
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 11;
                        int i8 = $$f;
                        byte b2 = (byte) ((i8 + 7) - (i8 | 7));
                        byte b3 = (byte) (b2 - 1);
                        objA = d.a(tapTimeout, tapTimeout2, jumpTapTimeout, 355847088, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    long jLongValue = ((Long) ((Method) objA).invoke(null, objArr2)).longValue();
                    long j2 = f18801a;
                    jArr[i7] = jLongValue - ((j2 + 4743694005979712847L) - (j2 & 4743694005979712847L));
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = d.a(1452497747);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = d.a(836 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 27280), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.FF, -2145994442, false, $$i(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i9 = qVar.f19948a;
                Object[] objArr4 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA3 = d.a(-1011865131);
                if (objA3 == null) {
                    int i10 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 730;
                    char defaultSize = (char) (View.getDefaultSize(0, 0) + 7933);
                    int iMyTid = 11 - (Process.myTid() >> 22);
                    int i11 = $$f;
                    byte b6 = (byte) ((i11 + 7) - (i11 | 7));
                    byte b7 = (byte) (b6 - 1);
                    objA3 = d.a(i10, defaultSize, iMyTid, 355847088, false, $$i(b6, b7, b7), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i9] = ((Long) ((Method) objA3).invoke(null, objArr4)).longValue() ^ (f18801a ^ 4743694005979712847L);
                Object[] objArr5 = {qVar, qVar};
                Object objA4 = d.a(1452497747);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = d.a(Color.rgb(0, 0, 0) + 16778052, (char) (Color.alpha(0) + 27279), KeyEvent.getDeadChar(0, 0) + 11, -2145994442, false, $$i(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr6 = {qVar, qVar};
            Object objA5 = d.a(1452497747);
            if (objA5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objA5 = d.a(TextUtils.getOffsetAfter("", 0) + 836, (char) (27279 - KeyEvent.keyCodeFromString("")), 11 - Color.green(0), -2145994442, false, $$i(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void M(int r8, short r9, byte r10, java.lang.Object[] r11) {
        /*
            int r8 = 113 - r8
            int r0 = r9 * 5
            int r7 = r0 + 1
            int r0 = r10 * 5
            int r0 = 8 - r0
            byte[] r6 = fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPromptBuilder.$$d
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r6 != 0) goto L2d
            r8 = r7
            r1 = r0
            r3 = r4
        L14:
            int r8 = r8 + r0
            int r8 = r8 + (-6)
            r0 = r1
            r2 = r3
        L19:
            byte r1 = (byte) r8
            int r3 = r2 + 1
            r5[r2] = r1
            int r1 = r0 + 1
            if (r3 != r7) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r11[r4] = r0
            return
        L2a:
            r0 = r6[r1]
            goto L14
        L2d:
            r2 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPromptBuilder.M(int, short, byte, java.lang.Object[]):void");
    }

    public static void a(Context context, long j2, long j3) throws Throwable {
        int i2 = 2 % 2;
        long j4 = j2 ^ (j3 << 32);
        int i3 = f18802b + 87;
        f18803e = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                Method method = f.class.getMethod("a", null);
                method.setAccessible(false);
                if (((Boolean) method.invoke(null, null)).booleanValue()) {
                    Object[] objArr = new Object[1];
                    L("숣ᵭ糸屜뿹鼫ﺷ\ude31㦊ᤎ硦寯뭻", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 57202, objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    Object[] objArr2 = new Object[1];
                    L("숃濓馄쭈甯ꛑ킌ɐ갭\ud9cf\u0b9b땵\ue736ტ䊾\uec78ṡ䮯\uf5e7❺儢苡ⳇ康衖㨞柚釚쌅", 44483 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
                    Object[] objArr3 = {(String) objArr2[0]};
                    Object[] objArr4 = new Object[1];
                    L("숐ꇘֳ\ue99f䵻ㄨ", View.MeasureSpec.makeMeasureSpec(0, 0) + 25561, objArr4);
                    Method method2 = StringBuilder.class.getMethod((String) objArr4[0], String.class);
                    method2.setAccessible(true);
                    Object objInvoke = method2.invoke(objNewInstance, objArr3);
                    Object[] objArr5 = {Long.valueOf(j4)};
                    Object[] objArr6 = new Object[1];
                    L("숐ꇘֳ\ue99f䵻ㄨ", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 25561, objArr6);
                    Method method3 = StringBuilder.class.getMethod((String) objArr6[0], Long.TYPE);
                    method3.setAccessible(true);
                    Object objInvoke2 = method3.invoke(objInvoke, objArr5);
                    Object[] objArr7 = new Object[1];
                    L("숅⸕ᨴؤ爯帯䩝뙛", 60427 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr7);
                    Method method4 = StringBuilder.class.getMethod((String) objArr7[0], null);
                    method4.setAccessible(true);
                    Object[] objArr8 = {strIntern, method4.invoke(objInvoke2, null)};
                    Method method5 = f.class.getMethod("c", String.class, Object.class);
                    method5.setAccessible(true);
                    method5.invoke(null, objArr8);
                }
            } else {
                f.class.getMethod("a", null).setAccessible(true);
                if (!(!((Boolean) r0.invoke(null, null)).booleanValue())) {
                    Object[] objArr9 = new Object[1];
                    L("숣ᵭ糸屜뿹鼫ﺷ\ude31㦊ᤎ硦寯뭻", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 57202, objArr9);
                    String strIntern2 = ((String) objArr9[0]).intern();
                    Constructor declaredConstructor2 = StringBuilder.class.getDeclaredConstructor(null);
                    declaredConstructor2.setAccessible(true);
                    Object objNewInstance2 = declaredConstructor2.newInstance(null);
                    Object[] objArr22 = new Object[1];
                    L("숃濓馄쭈甯ꛑ킌ɐ갭\ud9cf\u0b9b땵\ue736ტ䊾\uec78ṡ䮯\uf5e7❺儢苡ⳇ康衖㨞柚釚쌅", 44483 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr22);
                    Object[] objArr32 = {(String) objArr22[0]};
                    Object[] objArr42 = new Object[1];
                    L("숐ꇘֳ\ue99f䵻ㄨ", View.MeasureSpec.makeMeasureSpec(0, 0) + 25561, objArr42);
                    Method method22 = StringBuilder.class.getMethod((String) objArr42[0], String.class);
                    method22.setAccessible(true);
                    Object objInvoke3 = method22.invoke(objNewInstance2, objArr32);
                    Object[] objArr52 = {Long.valueOf(j4)};
                    Object[] objArr62 = new Object[1];
                    L("숐ꇘֳ\ue99f䵻ㄨ", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 25561, objArr62);
                    Method method32 = StringBuilder.class.getMethod((String) objArr62[0], Long.TYPE);
                    method32.setAccessible(true);
                    Object objInvoke22 = method32.invoke(objInvoke3, objArr52);
                    Object[] objArr72 = new Object[1];
                    L("숅⸕ᨴؤ爯帯䩝뙛", 60427 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr72);
                    Method method42 = StringBuilder.class.getMethod((String) objArr72[0], null);
                    method42.setAccessible(true);
                    Object[] objArr82 = {strIntern2, method42.invoke(objInvoke22, null)};
                    Method method52 = f.class.getMethod("c", String.class, Object.class);
                    method52.setAccessible(true);
                    method52.invoke(null, objArr82);
                }
            }
            byte b2 = (byte) 2;
            byte b3 = (byte) (b2 - 1);
            byte b4 = b3;
            Object[] objArr10 = new Object[1];
            M(b2, b3, b4, objArr10);
            Class<?> cls = Class.forName((String) objArr10[0]);
            byte b5 = (byte) 13;
            byte b6 = (byte) 0;
            byte b7 = b6;
            Object[] objArr11 = new Object[1];
            M(b5, b6, b7, objArr11);
            Method method6 = cls.getMethod((String) objArr11[0], null);
            method6.setAccessible(true);
            Object objInvoke4 = method6.invoke(null, null);
            int i4 = (int) j4;
            Object[] objArr12 = new Object[1];
            M(b2, b3, b4, objArr12);
            Class.forName((String) objArr12[0]).getField("c").setInt(objInvoke4, i4);
            Object[] objArr13 = new Object[1];
            M(b2, b3, b4, objArr13);
            Class<?> cls2 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            M(b5, b6, b7, objArr14);
            Method method7 = cls2.getMethod((String) objArr14[0], null);
            method7.setAccessible(true);
            Object objInvoke5 = method7.invoke(null, null);
            Object[] objArr15 = new Object[1];
            M(b2, b3, b4, objArr15);
            Object objInvoke6 = context;
            if (Class.forName((String) objArr15[0]).getField("d").getBoolean(objInvoke5)) {
                return;
            }
            if (context == null) {
                Object[] objArr16 = new Object[1];
                M((byte) 14, b6, b7, objArr16);
                Method method8 = b.class.getMethod((String) objArr16[0], null);
                method8.setAccessible(true);
                Object objInvoke7 = method8.invoke(null, null);
                Object[] objArr17 = new Object[1];
                M(b6, b7, b7, objArr17);
                Method method9 = b.class.getMethod((String) objArr17[0], null);
                method9.setAccessible(true);
                objInvoke6 = method9.invoke(objInvoke7, null);
            }
            if (objInvoke6 != null) {
                Method method10 = o.dc.d.class.getMethod("a", null);
                method10.setAccessible(true);
                Object objInvoke8 = method10.invoke(null, null);
                Object[] objArr18 = {a.class.getField("b").get(null), g.class.getField("z").get(null)};
                Constructor declaredConstructor3 = e.class.getDeclaredConstructor(a.class, g.class);
                declaredConstructor3.setAccessible(true);
                Object[] objArr19 = {objInvoke6, declaredConstructor3.newInstance(objArr18), true};
                Method method11 = o.dc.d.class.getMethod("b", Context.class, e.class, Boolean.TYPE);
                method11.setAccessible(true);
                method11.invoke(objInvoke8, objArr19);
                Object[] objArr20 = new Object[1];
                M(b2, b3, b4, objArr20);
                Class<?> cls3 = Class.forName((String) objArr20[0]);
                Object[] objArr21 = new Object[1];
                M(b5, b6, b7, objArr21);
                Method method12 = cls3.getMethod((String) objArr21[0], null);
                method12.setAccessible(true);
                Object objInvoke9 = method12.invoke(null, null);
                Object[] objArr23 = new Object[1];
                M(b2, b3, b4, objArr23);
                Class.forName((String) objArr23[0]).getField("d").setBoolean(objInvoke9, true);
            }
            int i5 = f18803e + 59;
            f18802b = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void init$0() {
        $$d = new byte[]{127, 52, 116, 98, MessagePack.Code.BIN16, 58, Ascii.DC4, MessagePack.Code.BIN8, 60};
        $$e = 41;
    }

    static void init$1() {
        $$c = new byte[]{34, 36, MessagePack.Code.EXT32, -5};
        $$f = 233;
    }

    public abstract CustomerAuthenticationPrompt build();

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f18802b + 11;
        f18803e = i3 % 128;
        int i4 = i3 % 2;
        boolean zEquals = super.equals(obj);
        int i5 = f18803e + 97;
        f18802b = i5 % 128;
        int i6 = i5 % 2;
        return zEquals;
    }

    protected final void finalize() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18802b + 29;
        f18803e = i3 % 128;
        int i4 = i3 % 2;
        super.finalize();
        int i5 = f18803e + 29;
        f18802b = i5 % 128;
        int i6 = i5 % 2;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f18803e + 63;
        f18802b = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = super.hashCode();
        int i5 = f18803e + 71;
        f18802b = i5 % 128;
        if (i5 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f18802b + 113;
        f18803e = i3 % 128;
        int i4 = i3 % 2;
        String string = super.toString();
        int i5 = f18802b + 57;
        f18803e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return string;
    }
}
