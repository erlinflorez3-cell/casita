package fr.antelop.sdk.card.emvapplication;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.AntelopCallback;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.Product;
import fr.antelop.sdk.card.EmvApplicationActivationMethod;
import fr.antelop.sdk.util.OperationCallback;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.CharCompanionObject;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.k;
import o.a.m;
import o.a.q;
import o.d.d;
import o.eq.b;
import o.et.c;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class HceEmvApplication implements EmvApplication {
    private final c innerApplication;

    public HceEmvApplication(c cVar) {
        this.innerApplication = cVar;
    }

    @Override // fr.antelop.sdk.card.emvapplication.EmvApplication
    public final List<EmvApplicationActivationMethod> getActivationMethods() {
        return this.innerApplication.w();
    }

    public final String getAid() {
        return this.innerApplication.j();
    }

    public final short getAvailableCredentialsNumber() {
        return this.innerApplication.z();
    }

    @Override // fr.antelop.sdk.card.emvapplication.EmvApplication
    public final String getCardId() {
        Object[] objArr = {this.innerApplication};
        int iMyUid = Process.myUid();
        int priority = Thread.currentThread().getPriority();
        int iActiveCount = Thread.activeCount();
        int i2 = (-280241304) * b.f24699e;
        b.f24699e = i2;
        return (String) b.e(iActiveCount, i2, priority, -688819955, iMyUid, 688819957, objArr);
    }

    @Override // fr.antelop.sdk.card.emvapplication.EmvApplication
    public final String getEmvApplicationGroupId() {
        return this.innerApplication.A();
    }

    @Override // fr.antelop.sdk.card.emvapplication.EmvApplication
    public final String getId() {
        return this.innerApplication.k();
    }

    public final byte[] getNextTransactionAtc() {
        return this.innerApplication.m();
    }

    public final byte[] getNextTransactionIdn() {
        return this.innerApplication.F();
    }

    public final short getPriority() {
        Object[] objArr = {this.innerApplication};
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i2 = c.f25345n * 655284246;
        c.f25345n = i2;
        int i3 = c.f25344m * 705755884;
        c.f25344m = i3;
        int i4 = c.f25346o * (-100553870);
        c.f25346o = i4;
        return ((Short) c.d(1163887627, objArr, elapsedCpuTime, -1163887626, i2, i3, i4)).shortValue();
    }

    @Override // fr.antelop.sdk.card.emvapplication.EmvApplication
    public final Product getProduct() {
        return this.innerApplication.D().d();
    }

    @Override // fr.antelop.sdk.card.emvapplication.EmvApplication
    public final EmvApplicationActivationMethod getSelectedActivationMethod() {
        Object[] objArr = {this.innerApplication};
        int i2 = b.f24695a * 928465393;
        b.f24695a = i2;
        int i3 = b.f24698d * (-2053167728);
        b.f24698d = i3;
        return (EmvApplicationActivationMethod) b.e(Thread.activeCount(), Process.myUid(), i3, -529944753, i2, 529944754, objArr);
    }

    @Override // fr.antelop.sdk.card.emvapplication.EmvApplication
    public final EmvApplicationStatus getStatus() {
        return this.innerApplication.t();
    }

    public final String getTokenExternalId() {
        return this.innerApplication.g();
    }

    public final String getTokenLastDigits() {
        String strI = this.innerApplication.I();
        return strI != null ? strI : "";
    }

    @Override // fr.antelop.sdk.card.emvapplication.EmvApplication
    public final EmvApplicationType getType() {
        return this.innerApplication.a();
    }

    @Override // fr.antelop.sdk.card.emvapplication.EmvApplication
    @Deprecated
    public final void selectActivationMethod(Context context, String str, final AntelopCallback antelopCallback) throws Throwable {
        this.innerApplication.c(context, str, antelopCallback != null ? new OperationCallback<Void>() { // from class: fr.antelop.sdk.card.emvapplication.HceEmvApplication.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static int f18967a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static int f18968b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static int f18969c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static int f18970d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static long f18971e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static int f18972f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static int f18973g = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static int f18974h = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f18975i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static long f18976j = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0015). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$c(int r8, short r9, short r10) {
                /*
                    byte[] r7 = fr.antelop.sdk.card.emvapplication.HceEmvApplication.AnonymousClass1.$$a
                    int r2 = r9 * 4
                    int r1 = 1 - r2
                    int r6 = r10 + 71
                    int r0 = r8 * 2
                    int r5 = r0 + 4
                    byte[] r4 = new byte[r1]
                    r3 = 0
                    int r2 = 0 - r2
                    if (r7 != 0) goto L28
                    r0 = r2
                    r1 = r3
                L15:
                    int r6 = r6 + r0
                    int r5 = r5 + 1
                L18:
                    byte r0 = (byte) r6
                    r4[r1] = r0
                    if (r1 != r2) goto L23
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    return r0
                L23:
                    int r1 = r1 + 1
                    r0 = r7[r5]
                    goto L15
                L28:
                    r1 = r3
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.emvapplication.HceEmvApplication.AnonymousClass1.$$c(int, short, short):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f18973g = 1115525473;
                f18972f = -1315201991;
                f18970d = 918048766;
                f18967a = -883628051;
                f18969c = 2101029562;
                f18968b = -223874625;
                f18975i = 0;
                f18974h = 1;
                f18971e = -5452630711417198024L;
                f18976j = 4762134624941890804L;
            }

            public static Object[] b(Context context2, int i2, int i3) {
                Object[] objArr;
                int i4;
                Object objInvoke;
                Class<?> cls;
                Object[] objArr2;
                if (context2 == null) {
                    Object[] objArr3 = {new int[]{(i + i) - (i & i)}, new int[]{i2}, null, new int[]{i2}};
                    int i5 = (-397704410) + ((~(((-134236427) + i2) - ((-134236427) & i2))) * (-301));
                    int i6 = ~((-1) - (((-1) - 219203898) & ((-1) - i2)));
                    int i7 = ~((~i2) | 897351920);
                    int i8 = i5 + (((i6 + i7) - (i6 & i7)) * (-301)) + (((-1) - (((-1) - 219203898) & ((-1) - (~(((-897351921) + i2) - ((-897351921) & i2)))))) * 301);
                    int i9 = (i8 << 1) - i8;
                    int i10 = ((i9 * (-167)) - (~(i3 * (-167)))) - 1;
                    int i11 = ~i9;
                    int i12 = ~i3;
                    int i13 = ~((-1) - (((-1) - (i11 ^ i12)) & ((-1) - ((-1) - (((-1) - i11) | ((-1) - i12))))));
                    int i14 = ~i2;
                    int i15 = i12 ^ i14;
                    int i16 = (i12 + i14) - (i12 | i14);
                    int i17 = ~((i15 + i16) - (i15 & i16));
                    int i18 = i10 + (((-1) - (((-1) - (i13 & i17)) & ((-1) - (i13 ^ i17)))) * 168);
                    int i19 = (i12 + i11) - (i12 & i11);
                    int i20 = i18 + ((~((-1) - (((-1) - (i19 & i2)) & ((-1) - (i19 ^ i2))))) * 168);
                    int i21 = ~i9;
                    int i22 = ~(((i21 + i14) - (i21 | i14)) | (i21 ^ i14));
                    int i23 = ~((-1) - (((-1) - ((i11 + i3) - (i11 | i3))) & ((-1) - (i11 ^ i3))));
                    int i24 = i22 ^ i23;
                    int i25 = (i23 + i22) - (i23 | i22);
                    int i26 = (i25 + i24) - (i25 & i24);
                    int i27 = ~i3;
                    int i28 = i27 ^ i9;
                    int i29 = (i27 + i9) - (i27 | i9);
                    int i30 = (i29 + i28) - (i29 & i28);
                    int i31 = ~((-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - i30)))) & ((-1) - (i30 ^ i2))));
                    int i32 = i20 + (((-1) - (((-1) - ((-1) - (((-1) - i31) | ((-1) - i26)))) & ((-1) - (i26 ^ i31)))) * 168);
                    int i33 = (i32 << 13) ^ i32;
                    int i34 = i33 >>> 17;
                    int i35 = ~(i33 & i34);
                    int i36 = (-1) - (((-1) - i33) & ((-1) - i34));
                    int i37 = (i36 + i35) - (i36 | i35);
                    int i38 = i37 << 5;
                    int i39 = (~i38) & i37;
                    int i40 = ~i37;
                    int i41 = (i40 + i38) - (i40 | i38);
                    return objArr3;
                }
                try {
                    Object[] objArr4 = new Object[1];
                    k("⾣⿉\u173fꘒ\udea8⼜훠瘏컓๛\uf7ed圃\uedd0\ued18铴됗賏찜떠锗꯶ꬩ勞\uf260䫳詠玎퍶榽椕႓のࢫ䠕㇜ᄿ➍埞\udebf濞욊㛙", ViewConfiguration.getWindowTouchSlop() >> 8, objArr4);
                    objArr = (Object[]) Array.newInstance(Class.forName((String) objArr4[0]), 2);
                    int i42 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int i43 = ~i2;
                    int i44 = (-2) ^ i43;
                    int i45 = ((-2) + i43) - ((-2) | i43);
                    int i46 = ~((i44 + i45) - (i44 & i45));
                    int i47 = ~i42;
                    int i48 = (((i42 * (-949)) - 949) - (~(-(-(((-1) - (((-1) - i46) & ((-1) - (~((i47 ^ i2) | ((-1) - (((-1) - i47) | ((-1) - i2)))))))) * 1900))))) - 1;
                    int i49 = ~i2;
                    int i50 = i49 ^ i42;
                    int i51 = (-1) - (((-1) - i49) | ((-1) - i42));
                    i4 = i2 ^ 1;
                    int i52 = i48 + (((-1) - (((-1) - (~((i51 + i50) - (i51 & i50)))) & ((-1) - (~((-1) - (((-1) - i4) & ((-1) - ((i2 + 1) - (1 | i2))))))))) * (-950));
                    int i53 = ~(i43 | 1);
                    int i54 = ~((i42 ^ i2) | ((-1) - (((-1) - i42) | ((-1) - i2))));
                    int i55 = ((-1) - (((-1) - ((-1) - (((-1) - i53) | ((-1) - i54)))) & ((-1) - (i53 ^ i54)))) * 950;
                    int i56 = ((i52 | i55) << 1) - (i55 ^ i52);
                    Object[] objArr5 = new Object[1];
                    k("䑑䐒돩ᛈ⌌该晱讋ꔷ\uaac7䜶ꪭ蘨䧟⑼䦞\ue72c棑ԡ梵쁝࿄\ue251ྫ℗⻧쌖⺍Ȉ췿ꁐ춹捔\uecc6脧", i56, objArr5);
                    try {
                        Object[] objArr6 = {(String) objArr5[0]};
                        Object[] objArr7 = new Object[1];
                        k("⾣⿉\u173fꘒ\udea8⼜훠瘏컓๛\uf7ed圃\uedd0\ued18铴됗賏찜떠锗꯶ꬩ勞\uf260䫳詠玎퍶榽椕႓のࢫ䠕㇜ᄿ➍埞\udebf濞욊㛙", ExpandableListView.getPackedPositionGroup(0L), objArr7);
                        objArr[0] = Class.forName((String) objArr7[0]).getDeclaredConstructor(String.class).newInstance(objArr6);
                        Object[] objArr8 = new Object[1];
                        k("쮜쯟ؾ焱흼㹁Ǡ翩⪸Ἳ₀廳ৢﰈ䏗뷅棭\udd00抁鳡俲멡藔ﯴ껐鬦ꓲ\udafb跈硬쟁㧯\uecc6失\ue6ea", TextUtils.getCapsMode("", 0, 0), objArr8);
                        try {
                            Object[] objArr9 = {(String) objArr8[0]};
                            Object[] objArr10 = new Object[1];
                            k("⾣⿉\u173fꘒ\udea8⼜훠瘏컓๛\uf7ed圃\uedd0\ued18铴됗賏찜떠锗꯶ꬩ勞\uf260䫳詠玎퍶榽椕႓のࢫ䠕㇜ᄿ➍埞\udebf濞욊㛙", Process.myPid() >> 22, objArr10);
                            objArr[1] = Class.forName((String) objArr10[0]).getDeclaredConstructor(String.class).newInstance(objArr9);
                            try {
                                int i57 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                int iNextInt = new Random().nextInt();
                                int i58 = i57 * (-55);
                                int i59 = (i58 & 55) + ((-1) - (((-1) - i58) & ((-1) - 55)));
                                int i60 = ~((-1) - (((-1) - ((iNextInt + i57) - (iNextInt | i57))) & ((-1) - (i57 ^ iNextInt))));
                                int i61 = ((i59 - (~((i60 | (i60 ^ (-1))) * 56))) - 1) + ((~((~i57) | i57)) * (-56));
                                int i62 = -(-(i57 * 56));
                                Object[] objArr11 = new Object[1];
                                k("ᵈᴩ喺ં㾾涖穢霊ﰯ䲙孪뙞\udf3b꾇㡸唜븵躎ᥪ瑎餫\ue9b7﹈ጬ砅좨\udf5a", ((-1) - (((-1) - i61) | ((-1) - i62))) + (i62 | i61), objArr11);
                                Class<?> cls2 = Class.forName((String) objArr11[0]);
                                int trimmedLength = TextUtils.getTrimmedLength("");
                                int i63 = f18968b * (-832528651);
                                f18968b = i63;
                                int i64 = trimmedLength * 302;
                                int i65 = (i64 ^ 28885509) + ((i64 & 28885509) << 1);
                                int i66 = ~trimmedLength;
                                int i67 = ~i63;
                                int i68 = ~((i66 ^ i67) | (i66 & i67));
                                int i69 = -(-(((-1) - (((-1) - (i68 ^ 47903)) & ((-1) - ((-1) - (((-1) - i68) | ((-1) - 47903)))))) * (-602)));
                                int i70 = (((i65 + i69) - (i65 & i69)) << 1) - (i69 ^ i65);
                                int i71 = i66 ^ (-47904);
                                int i72 = (-47904) & i66;
                                int i73 = ~((i72 + i71) - (i72 & i71));
                                int i74 = ~trimmedLength;
                                int i75 = ~((-1) - (((-1) - ((-1) - (((-1) - i63) | ((-1) - i74)))) & ((-1) - (i74 ^ i63))));
                                int i76 = (-1) - (((-1) - (i75 & i73)) & ((-1) - (i73 ^ i75)));
                                int i77 = ((trimmedLength + i67) - (trimmedLength | i67)) | (i67 ^ trimmedLength);
                                int i78 = ~((i77 + 47903) - (i77 & 47903));
                                int i79 = ((-1) - (((-1) - ((-1) - (((-1) - i78) | ((-1) - i76)))) & ((-1) - (i76 ^ i78)))) * (-301);
                                Object[] objArr12 = new Object[1];
                                l("퇜櫁\ua7f1\ue0b6㶦癃덪찃त䗉黀\udb8fᒡ光\uea6e✏怹", (i70 ^ i79) + (((-1) - (((-1) - i70) | ((-1) - i79))) << 1) + ((~((-1) - (((-1) - (i67 ^ 47903)) & ((-1) - ((-1) - (((-1) - i67) | ((-1) - 47903))))))) * 301), objArr12);
                                objInvoke = cls2.getMethod((String) objArr12[0], null).invoke(context2, null);
                                try {
                                    Object[] objArr13 = new Object[1];
                                    k("ᵈᴩ喺ં㾾涖穢霊ﰯ䲙孪뙞\udf3b꾇㡸唜븵躎ᥪ瑎餫\ue9b7﹈ጬ砅좨\udf5a", ExpandableListView.getPackedPositionType(0L), objArr13);
                                    cls = Class.forName((String) objArr13[0]);
                                    int iBlue = Color.blue(0);
                                    objArr2 = new Object[1];
                                    l("퇜妥섹䢚\uf036箿\ue332檇鈄ᶍ蔻ಓ됒㿡", (iBlue ^ 34939) + (((-1) - (((-1) - iBlue) | ((-1) - 34939))) << 1), objArr2);
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 != null) {
                            throw cause4;
                        }
                        throw th4;
                    }
                } catch (Throwable unused) {
                }
                try {
                    Object[] objArr14 = {cls.getMethod((String) objArr2[0], null).invoke(context2, null), 64};
                    int i80 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                    Object[] objArr15 = new Object[1];
                    l("퇚ဘ剅钮훠ᣓ嬑鴎\udfb0ǡ䏗舀쑂ڼ䣹誖촛ཋ燿돜\uf5de㐉癎뢱\ufae4㳛缤ꅅ\ue3b9◣柚꘍\ue869", (i80 & 49613) + (i80 | 49613), objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    int iRed = Color.red(0);
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i81 = iRed * 85;
                    int i82 = (i81 ^ 3068245) + ((i81 & 3068245) << 1);
                    int i83 = ~iRed;
                    int i84 = i83 ^ (-36098);
                    int i85 = (-36098) & i83;
                    int i86 = ~((i85 + i84) - (i85 & i84));
                    int i87 = ~iUptimeMillis;
                    int i88 = ~((-1) - (((-1) - (i83 ^ i87)) & ((-1) - (i83 & i87))));
                    int i89 = (i86 ^ i88) | ((i88 + i86) - (i88 | i86));
                    int i90 = ~iUptimeMillis;
                    int i91 = ~((-1) - (((-1) - ((-36098) ^ i90)) & ((-1) - ((-36098) & i90))));
                    int i92 = i89 ^ i91;
                    int i93 = (i89 + i91) - (i89 | i91);
                    int i94 = (i92 + i93) - (i92 & i93);
                    int i95 = (-1) - (((-1) - iRed) & ((-1) - 36097));
                    int i96 = ~((i95 ^ iUptimeMillis) | ((i95 + iUptimeMillis) - (i95 | iUptimeMillis)));
                    int i97 = i82 + (((-1) - (((-1) - (i94 ^ i96)) & ((-1) - (i94 & i96)))) * (-84));
                    int i98 = (-36098) ^ iUptimeMillis;
                    int i99 = (-36098) & iUptimeMillis;
                    int i100 = ~((i99 + i98) - (i99 & i98));
                    int i101 = (-1) - (((-1) - ((-1) - (((-1) - i100) | ((-1) - iRed)))) & ((-1) - (iRed ^ i100)));
                    int i102 = ~((-1) - (((-1) - (i90 ^ 36097)) & ((-1) - (i90 & 36097))));
                    int i103 = i101 ^ i102;
                    int i104 = i101 & i102;
                    int i105 = -(-(((i104 + i103) - (i104 & i103)) * (-84)));
                    int i106 = ((i97 | i105) << 1) - (i105 ^ i97);
                    int i107 = ~((-1) - (((-1) - 36097) & ((-1) - i87)));
                    int i108 = ~i95;
                    int i109 = -(-((((-1) - (((-1) - i108) | ((-1) - i107))) | (i107 ^ i108)) * 84));
                    try {
                        Object[] objArr16 = new Object[1];
                        l("퇜峟쯍盨\ue5deო鿖\u0add맔ⓗ司\udede䷑\uf8d9", (i106 ^ i109) + ((i109 & i106) << 1), objArr16);
                        Object objInvoke2 = cls3.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0');
                        int i110 = f18969c * (-974570205);
                        f18969c = i110;
                        int i111 = iIndexOf * 624;
                        int i112 = (i111 & (-622)) + (i111 | (-622));
                        int i113 = (-1) - (((-1) - ((-2) ^ iIndexOf)) & ((-1) - (((-2) + iIndexOf) - ((-2) | iIndexOf))));
                        int i114 = ((i112 - (~((~((-1) - (((-1) - (i113 ^ i110)) & ((-1) - ((-1) - (((-1) - i113) | ((-1) - i110))))))) * 623))) - 1) + (((~((-1) - (((-1) - (~iIndexOf)) & ((-1) - 1)))) | (~i110)) * (-623));
                        int i115 = ~i113;
                        int i116 = (-2) ^ i110;
                        int i117 = (-1) - (((-1) - (-2)) | ((-1) - i110));
                        int i118 = ~((i116 + i117) - (i116 & i117));
                        int i119 = (i115 & i118) | (i115 ^ i118);
                        int i120 = ~(((-1) - (((-1) - iIndexOf) | ((-1) - i110))) | (iIndexOf ^ i110));
                        int i121 = ((i120 + i119) - (i120 & i119)) * 623;
                        int i122 = (i114 ^ i121) + ((i121 & i114) << 1);
                        Object[] objArr17 = new Object[1];
                        k("\ueabd\ueadc붫狁䔏薇ȡ\uedbb\u0bdaꒈ〈쳯⣎䞖䀻⾭䧀暟愩\u0eff滭Ƥ虋榹迴₢꜆䢀곪쎼쐼ꮗ췣\ue2be", i122, objArr17);
                        Class<?> cls4 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        k("诽讎存靼￮捳\ue79f坆檔䉦욅癒䦈ꅹ", (-2) - ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) ^ (-1)), objArr18);
                        Object[] objArr19 = (Object[]) cls4.getField((String) objArr18[0]).get(objInvoke2);
                        int length = objArr19.length;
                        int i123 = 0;
                        while (i123 < length) {
                            Object obj = objArr19[i123];
                            int i124 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                            Object[] objArr20 = new Object[1];
                            l("퇣묒Ҁ\uee1e箞", ((i124 | 27271) << 1) - (i124 ^ 27271), objArr20);
                            try {
                                Object[] objArr21 = {(String) objArr20[0]};
                                int i125 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                int i126 = (i125 ^ 1) + (((-1) - (((-1) - i125) | ((-1) - 1))) << 1);
                                Object[] objArr22 = new Object[1];
                                k("⣍⢧章笽긲䋃\u0bcfڕ짫揙⫔➟\ueaa8胀䧀쒐讬ꆔ棂\ue589겟웶辷芗䶀\ue7f8껥ꎵ溛ӻ췪䂥ཱྀ◿\uecc7憭⃮㨖Ζ\u1f46쇼", i126, objArr22);
                                Class<?> cls5 = Class.forName((String) objArr22[0]);
                                Object[] objArr23 = new Object[1];
                                k("燿熘鎲䤌처ꮕ㧼搗邙誋ᣴ䔷뎁榃篽", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr23);
                                Object objInvoke3 = cls5.getMethod((String) objArr23[0], String.class).invoke(null, objArr21);
                                try {
                                    int i127 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    Object[] objArr24 = new Object[1];
                                    l("퇚˴瞝ꢪ鵐칷⌙ᑲ䣐뷽\uee9f쎤㑒楸威轺\ue3db퓧ে窛꽆聩\uf503☭\u1ad7俷ꂓ閥", ((-1) - (((-1) - i127) | ((-1) - 54048))) + ((i127 + 54048) - (i127 & 54048)), objArr24);
                                    Class<?> cls6 = Class.forName((String) objArr24[0]);
                                    int i128 = -View.MeasureSpec.getSize(0);
                                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                    int i129 = i128 * 221;
                                    int i130 = (i129 ^ (-12730251)) + ((i129 & (-12730251)) << 1);
                                    int i131 = ~i128;
                                    int i132 = i131 ^ (-58130);
                                    int i133 = (i131 - 58130) - (i131 | (-58130));
                                    int i134 = ~((i132 + i133) - (i132 & i133));
                                    int i135 = ~iMaxMemory;
                                    int i136 = i135 ^ i128;
                                    int i137 = i135 & i128;
                                    int i138 = (i136 + i137) - (i136 & i137);
                                    int i139 = ~((i138 + 58129) - (i138 & 58129));
                                    int i140 = ((-1) - (((-1) - (i134 ^ i139)) & ((-1) - ((i139 + i134) - (i139 | i134))))) * 220;
                                    int i141 = ((i130 + i140) - (i130 | i140)) + (i130 | i140);
                                    int i142 = ~((-1) - (((-1) - (i135 ^ 58129)) & ((-1) - (i135 & 58129))));
                                    int i143 = ((i141 - (~((((-1) - (((-1) - i142) | ((-1) - i128))) | (i128 ^ i142)) * (-440)))) - 1) + (((-1) - (((-1) - ((-1) - (((-1) - (i128 ^ 58129)) & ((-1) - ((i128 + 58129) - (i128 | 58129)))))) & ((-1) - iMaxMemory))) * 220);
                                    Object[] objArr25 = new Object[1];
                                    l("퇏㋅៛磱嶋뺋莜\ue4be쥁⩃ཨ", i143, objArr25);
                                    try {
                                        Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr25[0], null).invoke(obj, null))};
                                        Object[] objArr27 = new Object[1];
                                        k("⣍⢧章笽긲䋃\u0bcfڕ짫揙⫔➟\ueaa8胀䧀쒐讬ꆔ棂\ue589겟웶辷芗䶀\ue7f8껥ꎵ溛ӻ췪䂥ཱྀ◿\uecc7憭⃮㨖Ζ\u1f46쇼", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr27);
                                        Class<?> cls7 = Class.forName((String) objArr27[0]);
                                        Object[] objArr28 = new Object[1];
                                        k("ᾢ\u1fc5洧䳹㒇唀㰓鰤ﻘ琌ᴁ봬\uddf1霐縟帥볓똛弌缺鯣턱렸", View.resolveSizeAndState(0, 0, 0), objArr28);
                                        Object objInvoke4 = cls7.getMethod((String) objArr28[0], InputStream.class).invoke(objInvoke3, objArr26);
                                        int length2 = objArr.length;
                                        for (int i144 = 0; i144 < 2; i144 = (((-1) - (((-1) - i144) & ((-1) - 1))) << 1) - (i144 ^ 1)) {
                                            Object obj2 = objArr[i144];
                                            try {
                                                Object[] objArr29 = new Object[1];
                                                k("\udf03\udf69廨㙻횾曋䚉縙㸥䟑枒弓ᵦ\ua4c8҆발籢薜▄鴅孑\ue2fe싱切먞쎲\ue3ee\udb13饖⃨肻㠡\uf85dǻꆤᤡ휷ḏ", ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr29);
                                                Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                Object[] objArr30 = new Object[1];
                                                k("햛헼✵鑍뷲ἒ\ue4bdᕧ㓦㸝얫㑙៨\udd13ꚁ휑皳ﱟ螁\uf65e凒鬹悊酽냃먾䆍", TextUtils.getCapsMode("", 0, 0), objArr30);
                                                if (obj2.equals(cls8.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                    int[] iArr = new int[1];
                                                    Object[] objArr31 = {iArr, new int[]{i2}, null, new int[]{i4}};
                                                    int i145 = f18972f * (-805772760);
                                                    f18972f = i145;
                                                    int i146 = (-362819088) + (((~(i145 | 672617984)) | (-5530038)) * (-465)) + (((-1) - (((-1) - 672617984) & ((-1) - (~((-1) - (((-1) - (-5530038)) & ((-1) - i145))))))) * 930) + ((i145 | (-4202934)) * 465);
                                                    int i147 = f18967a * (-130838822);
                                                    f18967a = i147;
                                                    int i148 = i146 * 965;
                                                    int i149 = ((-16372) ^ i148) + ((i148 & (-16372)) << 1);
                                                    int i150 = ~i146;
                                                    int i151 = i150 ^ i147;
                                                    int i152 = (i150 + i147) - (i150 | i147);
                                                    int i153 = ~((i151 + i152) - (i151 & i152));
                                                    int i154 = ((-1) - (((-1) - ((-1) - (((-1) - i153) | ((-1) - (-17))))) & ((-1) - ((-17) ^ i153)))) * (-964);
                                                    int i155 = (i149 ^ i154) + (((-1) - (((-1) - i154) | ((-1) - i149))) << 1);
                                                    int i156 = ~i146;
                                                    int i157 = ~i147;
                                                    int i158 = ~((i157 + i156) - (i157 & i156));
                                                    int i159 = ~((-1) - (((-1) - (i150 & 16)) & ((-1) - (i150 ^ 16))));
                                                    int i160 = i158 ^ i159;
                                                    int i161 = (-1) - (((-1) - i158) | ((-1) - i159));
                                                    int i162 = -(-(((i161 + i160) - (i161 & i160)) * (-964)));
                                                    int i163 = -(-(((i155 | i162) << 1) - (i162 ^ i155)));
                                                    int i164 = (i3 ^ i163) + ((i163 & i3) << 1);
                                                    int i165 = i164 << 13;
                                                    int i166 = (-1) - (((-1) - ((-1) - (((-1) - i165) & ((-1) - i164)))) | ((-1) - (~(i164 & i165))));
                                                    int i167 = i166 >>> 17;
                                                    int i168 = (-1) - (((-1) - ((~i166) & i167)) & ((-1) - ((~i167) & i166)));
                                                    int i169 = i168 << 5;
                                                    iArr[0] = (-1) - (((-1) - ((i168 + i169) - (i168 & i169))) | ((-1) - (~(i168 & i169))));
                                                    return objArr31;
                                                }
                                            } catch (Throwable th5) {
                                                Throwable cause5 = th5.getCause();
                                                if (cause5 != null) {
                                                    throw cause5;
                                                }
                                                throw th5;
                                            }
                                        }
                                        int i170 = ((-1) - (((-1) - i123) | ((-1) - (-6)))) + ((i123 - 6) - (i123 & (-6)));
                                        i123 = (i170 & 7) + ((-1) - (((-1) - i170) & ((-1) - 7)));
                                    } catch (Throwable th6) {
                                        Throwable cause6 = th6.getCause();
                                        if (cause6 != null) {
                                            throw cause6;
                                        }
                                        throw th6;
                                    }
                                } catch (Throwable th7) {
                                    Throwable cause7 = th7.getCause();
                                    if (cause7 != null) {
                                        throw cause7;
                                    }
                                    throw th7;
                                }
                            } catch (Throwable th8) {
                                Throwable cause8 = th8.getCause();
                                if (cause8 != null) {
                                    throw cause8;
                                }
                                throw th8;
                            }
                        }
                        Object[] objArr32 = {new int[]{(i + i) - (i | i)}, new int[]{i2}, null, new int[]{i2}};
                        int i171 = f18973g * (-1691485144);
                        f18973g = i171;
                        int i172 = ~i171;
                        int i173 = 786454849 + (((~((-1) - (((-1) - 613726469) & ((-1) - i172)))) | 64421552) * (-328)) + (((-1) - (((-1) - i171) & ((-1) - 64421552))) * 164) + (((~(i171 | (-613726470))) | 9746432 | (~((-1) - (((-1) - i172) & ((-1) - 668401589))))) * 164);
                        int i174 = f18970d * 1152953583;
                        f18970d = i174;
                        int i175 = (i173 * IptcDirectory.TAG_DATE_CREATED) + (i3 * (-565));
                        int i176 = ~i173;
                        int i177 = ~(i176 | i3);
                        int i178 = i176 ^ i174;
                        int i179 = (-1) - (((-1) - i176) | ((-1) - i174));
                        int i180 = ((~((i179 + i178) - (i179 & i178))) | i177) * (-566);
                        int i181 = (i175 ^ i180) + (((i175 + i180) - (i175 | i180)) << 1);
                        int i182 = ~i3;
                        int i183 = -(-((~((i182 + i173) - (i182 & i173))) * 566));
                        int i184 = ~i173;
                        int i185 = (i182 & i184) | (i184 ^ i182);
                        int i186 = (i181 & i183) + ((-1) - (((-1) - i183) & ((-1) - i181))) + ((~((i174 & i185) | (i185 ^ i174))) * 566);
                        int i187 = (i186 << 13) ^ i186;
                        int i188 = i187 >>> 17;
                        int i189 = ~i188;
                        int i190 = ((-1) - (((-1) - (~i187)) | ((-1) - i188))) | ((i189 + i187) - (i189 | i187));
                        int i191 = i190 << 5;
                        int i192 = ~((-1) - (((-1) - i190) | ((-1) - i191)));
                        int i193 = i190 | i191;
                        return objArr32;
                    } catch (Throwable th9) {
                        th = th9;
                        Throwable cause9 = th.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th;
                    }
                } catch (Throwable th10) {
                    th = th10;
                }
            }

            static void init$0() {
                $$a = new byte[]{124, 69, -84, MessagePack.Code.STR8};
                $$b = 172;
            }

            private static void k(String str2, int i2, Object[] objArr) throws Throwable {
                Object obj;
                String str3 = str2;
                int i3 = 2 % 2;
                int i4 = $10 + 79;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                if (str3 != null) {
                    char[] charArray = str3.toCharArray();
                    int i5 = $11 + 37;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    obj = charArray;
                } else {
                    obj = str3;
                }
                k kVar = new k();
                char[] cArrC = k.c(f18971e ^ (-5882309809461882246L), (char[]) obj, i2);
                int i7 = 4;
                kVar.f19939c = 4;
                int i8 = $10 + 55;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                while (kVar.f19939c < cArrC.length) {
                    kVar.f19938a = kVar.f19939c - i7;
                    int i10 = kVar.f19939c;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % i7]), Long.valueOf(kVar.f19938a), Long.valueOf(f18971e)};
                        Object objA = d.a(-1093976004);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = d.a(TextUtils.indexOf("", "", 0, 0) + 229, (char) (51005 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8, 1749983833, false, $$c(b2, b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 36)))), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrC[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {kVar, kVar};
                        Object objA2 = d.a(-912105096);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA2 = d.a(675 - TextUtils.getOffsetBefore("", 0), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13, 522683165, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 43)))), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA2).invoke(null, objArr3);
                        i7 = 4;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                String str4 = new String(cArrC, 4, cArrC.length - 4);
                int i11 = $11 + 59;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                objArr[0] = str4;
            }

            private static void l(String str2, int i2, Object[] objArr) throws Throwable {
                Object charArray;
                String str3 = str2;
                int i3 = 2 % 2;
                if (str3 != null) {
                    int i4 = $11 + 69;
                    $10 = i4 % 128;
                    int i5 = i4 % 2;
                    charArray = str3.toCharArray();
                } else {
                    charArray = str3;
                }
                char[] cArr = (char[]) charArray;
                q qVar = new q();
                qVar.f19949d = i2;
                int length = cArr.length;
                long[] jArr = new long[length];
                qVar.f19948a = 0;
                while (qVar.f19948a < cArr.length) {
                    int i6 = $10 + 29;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = qVar.f19948a;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                            Object objA = d.a(-1011865131);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objA = d.a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 731, (char) (7933 - TextUtils.indexOf("", "", 0, 0)), KeyEvent.keyCodeFromString("") + 11, 355847088, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                            }
                            jArr[i7] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() * (f18976j / 4743694005979712847L);
                            Object[] objArr3 = {qVar, qVar};
                            Object objA2 = d.a(1452497747);
                            if (objA2 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objA2 = d.a(837 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (27279 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, -2145994442, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 7)))), new Class[]{Object.class, Object.class});
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
                        int i8 = qVar.f19948a;
                        Object[] objArr4 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                        Object objA3 = d.a(-1011865131);
                        if (objA3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objA3 = d.a(TextUtils.getTrimmedLength("") + 731, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 7934), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12, 355847088, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i8] = ((Long) ((Method) objA3).invoke(null, objArr4)).longValue() ^ (f18976j ^ 4743694005979712847L);
                        Object[] objArr5 = {qVar, qVar};
                        Object objA4 = d.a(1452497747);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objA4 = d.a(TextUtils.indexOf("", "") + 836, (char) (27278 - TextUtils.lastIndexOf("", '0', 0)), 11 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -2145994442, false, $$c(b8, b9, (byte) (7 | b9)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA4).invoke(null, objArr5);
                    }
                }
                char[] cArr2 = new char[length];
                qVar.f19948a = 0;
                while (qVar.f19948a < cArr.length) {
                    int i9 = $10 + 123;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                        Object[] objArr6 = {qVar, qVar};
                        Object objA5 = d.a(1452497747);
                        if (objA5 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            objA5 = d.a(835 - TextUtils.lastIndexOf("", '0', 0), (char) (27279 - View.getDefaultSize(0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 11, -2145994442, false, $$c(b10, b11, (byte) ((b11 + 7) - (7 & b11))), new Class[]{Object.class, Object.class});
                        }
                        Object obj = null;
                        ((Method) objA5).invoke(null, objArr6);
                        obj.hashCode();
                        throw null;
                    }
                    cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                    Object[] objArr7 = {qVar, qVar};
                    Object objA6 = d.a(1452497747);
                    if (objA6 == null) {
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        objA6 = d.a(835 - Process.getGidForName(""), (char) (View.resolveSizeAndState(0, 0, 0) + 27279), 11 - KeyEvent.keyCodeFromString(""), -2145994442, false, $$c(b12, b13, (byte) (7 | b13)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA6).invoke(null, objArr7);
                    int i10 = $10 + 47;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                }
                String str4 = new String(cArr2);
                int i12 = $11 + 121;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                objArr[0] = str4;
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public void onError(AntelopError antelopError) {
                int i2 = 2 % 2;
                int i3 = f18974h + 79;
                f18975i = i3 % 128;
                int i4 = i3 % 2;
                antelopCallback.onError(antelopError);
                int i5 = f18975i + 105;
                f18974h = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 22 / 0;
                }
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public /* bridge */ /* synthetic */ void onSuccess(Void r4) {
                int i2 = 2 % 2;
                int i3 = f18974h + 83;
                f18975i = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(r4);
                int i5 = f18975i + 85;
                f18974h = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: onSuccess, reason: avoid collision after fix types in other method */
            public void onSuccess2(Void r4) {
                int i2 = 2 % 2;
                int i3 = f18974h + 33;
                f18975i = i3 % 128;
                if (i3 % 2 == 0) {
                    antelopCallback.onSuccess();
                } else {
                    antelopCallback.onSuccess();
                    throw null;
                }
            }
        } : null);
    }

    @Override // fr.antelop.sdk.card.emvapplication.EmvApplication
    public final void selectActivationMethod(Context context, String str, OperationCallback<Void> operationCallback) throws Throwable {
        this.innerApplication.c(context, str, operationCallback);
    }

    @Override // fr.antelop.sdk.card.emvapplication.EmvApplication
    @Deprecated
    public final void submitActivationCode(Context context, String str, final AntelopCallback antelopCallback) throws Throwable {
        this.innerApplication.e(context, str, antelopCallback != null ? new OperationCallback<Void>() { // from class: fr.antelop.sdk.card.emvapplication.HceEmvApplication.2
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f18977a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static byte[] f18978b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static short[] f18979c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f18980d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f18981e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static int f18982f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static char[] f18983g = null;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static int f18984h = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f18985i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static int f18986j = 0;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static int f18987k = 0;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static int f18988l = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0015). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$e(short r6, byte r7, byte r8) {
                /*
                    int r3 = r8 * 4
                    int r2 = 1 - r3
                    byte[] r8 = fr.antelop.sdk.card.emvapplication.HceEmvApplication.AnonymousClass2.$$c
                    int r0 = r6 + 103
                    int r1 = r7 * 4
                    int r7 = 3 - r1
                    byte[] r6 = new byte[r2]
                    r5 = 0
                    int r4 = 0 - r3
                    if (r8 != 0) goto L2c
                    r2 = r7
                    r3 = r5
                L15:
                    int r0 = -r0
                    int r0 = r0 + r7
                    r7 = r2
                L18:
                    byte r1 = (byte) r0
                    r6[r3] = r1
                    if (r3 != r4) goto L23
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r6, r5)
                    return r0
                L23:
                    int r2 = r7 + 1
                    r1 = r8[r2]
                    int r3 = r3 + 1
                    r7 = r0
                    r0 = r1
                    goto L15
                L2c:
                    r3 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.emvapplication.HceEmvApplication.AnonymousClass2.$$e(short, byte, byte):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                f18988l = -1946238643;
                f18987k = 400330350;
                init$0();
                f18985i = 0;
                f18982f = 1;
                f18984h = 0;
                f18986j = 1;
                a();
                f18981e = 1456557356;
                f18977a = 1150422454;
                f18980d = 2110688279;
                f18978b = new byte[]{75};
                int i2 = f18985i + 83;
                f18982f = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 35 / 0;
                }
            }

            static void a() {
                f18983g = new char[]{56496, 56551, 56553, 56555, 56560, 56556, 56550, 56521, 56520, 56553, 56558, 56561, 56556, 56553, 56561, 56529, 56504, 56537, 56558, 56561, 56556, 56558, 56566, 56526, 56344, 56344, 56329, 56329, 56348, 56346, 56348, 56344, 56336, 56340, 56344, 56348, 56350, 56326, 56328, 56346, 56340, 56531, 56356, 56350, 56321, CharCompanionObject.MIN_LOW_SURROGATE, 56353, 56358, 56361, 56356, 56353, 56361, 56329, 56327, 56358, 56325, 56559, 56336, 56360, 56358, 56354, 56350, 56346, 56354, 56358, 56356, 56358, 56339, 56339, 56354, 56354, 56352, 56351, 56353, 56355, 56323, 56704, 56439, 56441, 56444, 56499, 56548, 56545, 56551, 56552, 56521, 56528, 56554, 56521, 56522, 56556, 56555, 56521, 56524, 56555, 56555, 56558, 56529, 56525, 56556, 56555, 56551, 56520, 56520, 56548, 56547, 56555, 56558, 56345, 56752, 56718, 56713, 56740, 56739, 56747, 56750, 56743, 56740, 56737, 56743, 56744};
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x028d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.Object[] c(android.content.Context r25, int r26, int r27, int r28) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1598
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.emvapplication.HceEmvApplication.AnonymousClass2.c(android.content.Context, int, int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{93, -2, -4, -85};
                $$b = 198;
            }

            static void init$1() {
                $$c = new byte[]{111, MessagePack.Code.MAP16, MessagePack.Code.TRUE, Ascii.DC4};
                $$d = 117;
            }

            private static void m(int[] iArr, String str2, boolean z2, Object[] objArr) throws Throwable {
                int i2;
                int i3;
                String str3 = str2;
                int i4 = 2 % 2;
                Object obj = null;
                Object bytes = str3;
                if (str3 != null) {
                    int i5 = $10 + 9;
                    $11 = i5 % 128;
                    if (i5 % 2 == 0) {
                        str3.getBytes("ISO-8859-1");
                        obj.hashCode();
                        throw null;
                    }
                    bytes = str3.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                m mVar = new m();
                int i6 = 0;
                int i7 = iArr[0];
                int i8 = iArr[1];
                int i9 = iArr[2];
                int i10 = iArr[3];
                char[] cArr = f18983g;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i11 = 0;
                    while (i11 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[i11])};
                            Object objA = d.a(-2071388435);
                            if (objA == null) {
                                byte b2 = (byte) i6;
                                objA = d.a(249 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11, 1376582792, false, $$e((byte) 13, b2, b2), new Class[]{Integer.TYPE});
                            }
                            cArr2[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                            i11++;
                            i6 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i8];
                System.arraycopy(cArr, i7, cArr3, 0, i8);
                if (bArr != null) {
                    int i12 = $11 + 31;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    char[] cArr4 = new char[i8];
                    mVar.f19943d = 0;
                    char c2 = 0;
                    while (mVar.f19943d < i8) {
                        if (bArr[mVar.f19943d] == 1) {
                            int i14 = mVar.f19943d;
                            Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                            Object objA2 = d.a(120026474);
                            if (objA2 == null) {
                                objA2 = d.a(11 - View.resolveSizeAndState(0, 0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.VT, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i14] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        } else {
                            int i15 = mVar.f19943d;
                            Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                            Object objA3 = d.a(1632715197);
                            if (objA3 == null) {
                                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 836;
                                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 27279);
                                int iLastIndexOf = 10 - TextUtils.lastIndexOf("", '0', 0);
                                int i16 = $$d;
                                byte b3 = (byte) 0;
                                objA3 = d.a(packedPositionType, cIndexOf, iLastIndexOf, -1210801192, false, $$e((byte) ((i16 + 27) - (i16 | 27)), b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i15] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                        }
                        c2 = cArr4[mVar.f19943d];
                        Object[] objArr5 = {mVar, mVar};
                        Object objA4 = d.a(-1041906996);
                        if (objA4 == null) {
                            objA4 = d.a((ViewConfiguration.getEdgeSlop() >> 16) + 21, (char) (35714 - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA4).invoke(null, objArr5);
                    }
                    cArr3 = cArr4;
                }
                if (i10 > 0) {
                    int i17 = $11 + 61;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        char[] cArr5 = new char[i8];
                        i2 = 1;
                        i3 = 0;
                        System.arraycopy(cArr3, 0, cArr5, 1, i8);
                        int i18 = i8 << i10;
                        System.arraycopy(cArr5, 1, cArr3, i18, i10);
                        System.arraycopy(cArr5, i10, cArr3, 1, i18);
                    } else {
                        i2 = 1;
                        i3 = 0;
                        char[] cArr6 = new char[i8];
                        System.arraycopy(cArr3, 0, cArr6, 0, i8);
                        int i19 = i8 - i10;
                        System.arraycopy(cArr6, 0, cArr3, i19, i10);
                        System.arraycopy(cArr6, i10, cArr3, 0, i19);
                    }
                } else {
                    i2 = 1;
                    i3 = 0;
                }
                if ((!z2 ? 1 : 0) != i2) {
                    char[] cArr7 = new char[i8];
                    mVar.f19943d = i3;
                    while (mVar.f19943d < i8) {
                        cArr7[mVar.f19943d] = cArr3[(i8 - mVar.f19943d) - i2];
                        mVar.f19943d += i2;
                        int i20 = $10 + 43;
                        $11 = i20 % 128;
                        if (i20 % 2 == 0) {
                            int i21 = 4 % 3;
                        }
                        i2 = 1;
                    }
                    cArr3 = cArr7;
                }
                if (i9 > 0) {
                    int i22 = $11 + 123;
                    $10 = i22 % 128;
                    int i23 = i22 % 2;
                    int i24 = 0;
                    while (true) {
                        mVar.f19943d = i24;
                        if (mVar.f19943d >= i8) {
                            break;
                        }
                        cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                        i24 = mVar.f19943d + 1;
                    }
                }
                objArr[0] = new String(cArr3);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0013). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void n(short r9, short r10, int r11, java.lang.Object[] r12) {
                /*
                    byte[] r8 = fr.antelop.sdk.card.emvapplication.HceEmvApplication.AnonymousClass2.$$a
                    int r0 = r10 * 2
                    int r7 = r0 + 1
                    int r0 = r11 * 3
                    int r2 = 3 - r0
                    int r0 = r9 + 97
                    byte[] r6 = new byte[r7]
                    r5 = 0
                    if (r8 != 0) goto L2c
                    r4 = r5
                    r3 = r7
                L13:
                    int r0 = -r0
                    int r0 = r0 + r3
                    r3 = r4
                L16:
                    int r4 = r3 + 1
                    byte r1 = (byte) r0
                    int r2 = r2 + 1
                    r6[r3] = r1
                    if (r4 != r7) goto L27
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r6, r5)
                    r12[r5] = r0
                    return
                L27:
                    r1 = r8[r2]
                    r3 = r0
                    r0 = r1
                    goto L13
                L2c:
                    r3 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.emvapplication.HceEmvApplication.AnonymousClass2.n(short, short, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x008f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void o(short r26, int r27, int r28, int r29, byte r30, java.lang.Object[] r31) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 745
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.emvapplication.HceEmvApplication.AnonymousClass2.o(short, int, int, int, byte, java.lang.Object[]):void");
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public void onError(AntelopError antelopError) {
                int i2 = 2 % 2;
                int i3 = f18984h + 47;
                f18986j = i3 % 128;
                int i4 = i3 % 2;
                antelopCallback.onError(antelopError);
                int i5 = f18986j + 55;
                f18984h = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public /* bridge */ /* synthetic */ void onSuccess(Void r4) {
                int i2 = 2 % 2;
                int i3 = f18984h + 51;
                f18986j = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(r4);
                int i5 = f18986j + 77;
                f18984h = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX INFO: renamed from: onSuccess, reason: avoid collision after fix types in other method */
            public void onSuccess2(Void r4) {
                int i2 = 2 % 2;
                int i3 = f18986j + 45;
                f18984h = i3 % 128;
                int i4 = i3 % 2;
                antelopCallback.onSuccess();
                int i5 = f18986j + 27;
                f18984h = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        } : null);
    }

    @Override // fr.antelop.sdk.card.emvapplication.EmvApplication
    public final void submitActivationCode(Context context, String str, OperationCallback<Void> operationCallback) throws Throwable {
        this.innerApplication.e(context, str, operationCallback);
    }

    public final String toString() {
        return new StringBuilder("HceEmvApplication{id=").append(getId()).append(", product=").append(getProduct()).append(", type=").append(getType()).append(", status=").append(getStatus()).append(", activationMethod=").append(getActivationMethods() == null ? "" : getActivationMethods()).append(", cardId=").append(getCardId()).append(", emvApplicationGroupId=").append(getEmvApplicationGroupId() == null ? "" : getEmvApplicationGroupId()).append(", selectedActivationMethod=").append(getSelectedActivationMethod() == null ? "" : getSelectedActivationMethod().toString()).append(", aid=").append(getAid()).append(", priority=").append((int) getPriority()).append(", availableCredentialsNumber=").append((int) getAvailableCredentialsNumber()).append(", tokenExternalId=").append(getTokenExternalId() != null ? getTokenExternalId() : "").append(", tokenLastDigits").append(getTokenLastDigits()).append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
