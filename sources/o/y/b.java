package o.y;

import android.content.Context;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcessActivityCallback;
import fr.antelop.sdk.card.CardStatus;
import fr.antelop.sdk.digitalcard.SecurePinInput;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.text.Typography;
import o.ai.b;
import o.ee.e;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends c {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f27028l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f27029n = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f27030q = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static long f27031s = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static char f27032u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f27033v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f27034w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static int f27035x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static int f27036y = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    CustomerAuthenticatedProcessActivityCallback f27037k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f27038m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f27039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final o.ep.d f27040p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SecurePinInput f27041t;

    private static String $$j(int i2, short s2, byte b2) {
        byte[] bArr = $$d;
        int i3 = b2 + 65;
        int i4 = s2 * 3;
        int i5 = (i2 * 3) + 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = i5 + i4;
            i5++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i5;
            i3 = bArr[i5] + i3;
            i5 = i7 + 1;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f27028l = -503227284;
        f27029n = 1099499402;
        f27036y = 0;
        f27035x = 1;
        f27034w = 0;
        f27033v = 1;
        n();
        TextUtils.indexOf("", "", 0, 0);
        CdmaCellLocation.convertQuartSecToDecDegrees(0);
        int i2 = f27036y + 107;
        f27035x = i2 % 128;
        int i3 = i2 % 2;
    }

    public b(String str, o.ep.d dVar, boolean z2) {
        super(str, dVar);
        this.f27038m = z2;
        this.f27040p = dVar;
    }

    private static void B(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
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
        Object obj = str5;
        if (str5 != null) {
            int i5 = $10 + 111;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            char[] charArray2 = str5.toCharArray();
            int i7 = $11 + 69;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            obj = charArray2;
        }
        char[] cArr2 = (char[]) obj;
        Object obj2 = str4;
        if (str4 != null) {
            char[] charArray3 = str4.toCharArray();
            int i9 = $11 + 35;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            obj2 = charArray3;
        }
        o.a.i iVar = new o.a.i();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        int i11 = 0;
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) obj2).length;
        char[] cArr5 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            int i12 = $11 + 91;
            $10 = i12 % 128;
            int i13 = i12 % i3;
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    int iResolveSizeAndState = View.resolveSizeAndState(i11, i11, i11) + 106;
                    char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                    int i14 = (TypedValue.complexToFloat(i11) > 0.0f ? 1 : (TypedValue.complexToFloat(i11) == 0.0f ? 0 : -1)) + 11;
                    byte b2 = (byte) i11;
                    byte b3 = b2;
                    String str$$j = $$j(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i11] = Object.class;
                    objA = o.d.d.a(iResolveSizeAndState, mirror, i14, -155898465, false, str$$j, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    int iMyPid = 847 - (Process.myPid() >> 22);
                    char c3 = (char) ((ExpandableListView.getPackedPositionForGroup(i11) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i11) == 0L ? 0 : -1)) + 6488);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', i11) + 13;
                    byte b4 = (byte) i11;
                    byte b5 = b4;
                    String str$$j2 = $$j(b4, b5, (byte) (b5 + 3));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i11] = Object.class;
                    objA2 = o.d.d.a(iMyPid, c3, iLastIndexOf, -694521287, false, str$$j2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                int i15 = cArr3[iVar.f19932b % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[1] = Integer.valueOf(i15);
                objArr4[i11] = iVar;
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b6 = (byte) i11;
                    byte b7 = b6;
                    objA3 = o.d.d.a(506 - AndroidCharacter.getMirror('0'), (char) ((-1) - TextUtils.lastIndexOf("", '0')), Color.red(i11) + 11, 1804962841, false, $$j(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a(TextUtils.indexOf("", "") + 639, (char) (TextUtils.indexOf("", "", 0, 0) + 65100), 11 - TextUtils.lastIndexOf("", '0'), 1636969060, false, $$j(b8, b9, (byte) (57 | b9)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r8[iVar.f19932b])) ^ (f27031s ^ 740602047300126166L)) ^ ((long) ((int) (((long) f27030q) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f27032u) ^ 740602047300126166L))));
                iVar.f19932b++;
                i3 = 2;
                i11 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str7 = new String(cArr5);
        int i16 = $11 + 31;
        $10 = i16 % 128;
        if (i16 % 2 == 0) {
            objArr[0] = str7;
        } else {
            int i17 = 91 / 0;
            objArr[0] = str7;
        }
    }

    public static /* synthetic */ Object c(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i3;
        int i9 = ~i5;
        int i10 = ~i7;
        int i11 = (-1) - (((-1) - (~(((-1) - (((-1) - i8) & ((-1) - i9))) | i10))) & ((-1) - (~(i3 | i5))));
        int i12 = ~(i7 | i5);
        int i13 = i11 | i12;
        int i14 = ~((i8 + i5) - (i8 & i5));
        int i15 = ~((i9 + i10) - (i9 & i10));
        int i16 = i12 | ((i8 + i15) - (i8 & i15));
        int i17 = i3 + i5 + i4 + (1349231875 * i2) + (1735201104 * i6);
        int i18 = i17 * i17;
        int i19 = ((-413510627) * i3) + 1558183936 + (237349861 * i5) + (i13 * 325430244) + (325430244 * i14) + ((-325430244) * i16) + ((-88080384) * i4) + ((-1337982976) * i2) + (469762048 * i6) + (1272971264 * i18);
        int i20 = ((i3 * 236314795) - 374860141) + (i5 * 236313123) + (i13 * (-836)) + (i14 * (-836)) + (i16 * 836) + (i4 * 236313959) + (i2 * (-66979019)) + (i6 * (-1872492752)) + (i18 * (-417333248));
        if (i19 + (i20 * i20 * 639631360) == 1) {
            return c(objArr);
        }
        b bVar = (b) objArr[0];
        int i21 = 2 % 2;
        int i22 = f27034w + 41;
        int i23 = i22 % 128;
        f27033v = i23;
        int i24 = i22 % 2;
        boolean z2 = bVar.f27039o;
        int i25 = i23 + 99;
        f27034w = i25 % 128;
        int i26 = i25 % 2;
        return Boolean.valueOf(z2);
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        b bVar = (b) objArr[0];
        CustomerAuthenticatedProcessActivityCallback customerAuthenticatedProcessActivityCallback = (CustomerAuthenticatedProcessActivityCallback) objArr[1];
        int i2 = 2 % 2;
        int i3 = f27033v;
        int i4 = i3 + 45;
        f27034w = i4 % 128;
        if (i4 % 2 != 0) {
            bVar.f27037k = customerAuthenticatedProcessActivityCallback;
            int i5 = 55 / 0;
        } else {
            bVar.f27037k = customerAuthenticatedProcessActivityCallback;
        }
        int i6 = i3 + 75;
        f27034w = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 10 / 0;
        }
        return null;
    }

    private void c(final Context context, SecurePinInput.NewPinInputProperties newPinInputProperties, e.a aVar) {
        int i2 = 2 % 2;
        new o.ee.e(aVar, null, new e.b(context, newPinInputProperties), new CustomerAuthenticatedProcessActivityCallback() { // from class: o.y.b.3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f27079a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f27080d = 0;

            @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcessActivityCallback
            public final void onActivityStart(Context context2) {
                int i3 = 2 % 2;
                int i4 = f27079a + 63;
                f27080d = i4 % 128;
                int i5 = i4 % 2;
                if (b.this.f27037k != null) {
                    int i6 = f27080d;
                    int i7 = (i6 ^ 13) + ((i6 & 13) << 1);
                    f27079a = i7 % 128;
                    if (i7 % 2 == 0) {
                        b.this.f27037k.onActivityStart(context);
                        throw null;
                    }
                    b.this.f27037k.onActivityStart(context);
                    int i8 = f27080d;
                    int i9 = (((i8 + 107) - (107 & i8)) << 1) - (i8 ^ 107);
                    f27079a = i9 % 128;
                    int i10 = i9 % 2;
                }
            }

            @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcessActivityCallback
            public final void onActivityStop() {
                int i3 = 2 % 2;
                int i4 = f27079a + 95;
                f27080d = i4 % 128;
                if (i4 % 2 != 0) {
                    CustomerAuthenticatedProcessActivityCallback customerAuthenticatedProcessActivityCallback = b.this.f27037k;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (b.this.f27037k != null) {
                    b.this.f27037k.onActivityStop();
                    int i5 = f27080d;
                    int i6 = ((-1) - (((-1) - i5) | ((-1) - 115))) + ((-1) - (((-1) - i5) & ((-1) - 115)));
                    f27079a = i6 % 128;
                    int i7 = i6 % 2;
                }
                int i8 = f27080d + 65;
                f27079a = i8 % 128;
                int i9 = i8 % 2;
            }
        }).b(context);
        int i3 = f27034w + 29;
        f27033v = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 77 / 0;
        }
    }

    private void d(SecurePinInput securePinInput) throws Throwable {
        int i2 = 2 % 2;
        this.f27041t = securePinInput;
        boolean zD = ((o.er.a) this.f27040p.G()).j().d();
        if (securePinInput != null) {
            int i3 = f27033v + 29;
            f27034w = i3 % 128;
            int i4 = i3 % 2;
            if (!zD) {
                WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Unexpected;
                Object[] objArr = new Object[1];
                B((char) (883 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "⛻뚀◃ퟷϬ鬦恝ᓛ迬ᅷ⇋쭠䟁豅", "\u0000\u0000\u0000\u0000", "ጅ钨狕＃", ViewConfiguration.getWindowTouchSlop() >> 8, objArr);
                throw new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
            }
            if (securePinInput.getCurrentPinInputProperties() != null) {
                WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.InvalidFormat;
                Object[] objArr2 = new Object[1];
                B((char) (882 - (ViewConfiguration.getScrollBarSize() >> 8)), "⛻뚀◃ퟷϬ鬦恝ᓛ迬ᅷ⇋쭠䟁豅", "\u0000\u0000\u0000\u0000", "ጅ钨狕＃", ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr2);
                throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr2[0]).intern());
            }
        } else if (zD) {
            WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.Mandatory;
            Object[] objArr3 = new Object[1];
            B((char) (882 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "⛻뚀◃ퟷϬ鬦恝ᓛ迬ᅷ⇋쭠䟁豅", "\u0000\u0000\u0000\u0000", "ጅ钨狕＃", KeyEvent.normalizeMetaState(0), objArr3);
            throw new WalletValidationException(walletValidationErrorCode3, ((String) objArr3[0]).intern());
        }
        int i5 = f27033v + 45;
        f27034w = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ void d(b bVar) {
        int i2 = 2 % 2;
        int i3 = f27034w + 99;
        f27033v = i3 % 128;
        int i4 = i3 % 2;
        bVar.e();
        int i5 = f27033v + 17;
        f27034w = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static void init$0() {
        $$d = new byte[]{123, 10, 108, -85};
        $$e = 169;
    }

    static void n() {
        f27031s = 740602047300126166L;
        f27030q = 1564493270;
        f27032u = (char) 13188;
    }

    @Override // o.y.c
    final void a_() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f27034w + 67;
        f27033v = i3 % 128;
        int i4 = i3 % 2;
        if (!this.f27038m) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr = new Object[1];
            B((char) (Process.myTid() >> 22), "∨歠黪Ὦ仟킸廒Ќ諏앰㙧徼ﶆ究ꔹ涯嶗_䐼\u000e", "\u0000\u0000\u0000\u0000", "矕敍췵柖", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            B((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29914), "⧋튊燼֝\ue39d堩ᅞ\uef5d❻뵐ᮗ踄\u0efaɼ魼ⶸ跋", "\u0000\u0000\u0000\u0000", "緤\uf4a9\udbbb\ue774", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1141593732, objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(this.f27040p.b());
            Object[] objArr3 = new Object[1];
            B((char) (9301 - (ViewConfiguration.getScrollBarSize() >> 8)), "\ueb3c煌鑺궬뉿磌碛\u0ad4㛩觋楄ࡇ㟱慄磖⊚컼䪋嬡㻺飲溓ﵤᶙꭢ爜섂豍ኧ\uf7a1梈ὡᮩ뚐鞆᙮˟\ue741벏ꊢ", "\u0000\u0000\u0000\u0000", "챶珶喰\ue724", Process.myTid() >> 22, objArr3);
            throw new WalletValidationException(walletValidationErrorCode, strIntern, sbAppend.append(((String) objArr3[0]).intern()).toString());
        }
        Object[] objArr4 = {this.f27040p};
        int i5 = o.ep.d.f24461m * (-222457364);
        o.ep.d.f24461m = i5;
        int i6 = o.ep.d.f24462n * 325900588;
        o.ep.d.f24462n = i6;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i7 = o.ep.d.f24460l * 323941697;
        o.ep.d.f24460l = i7;
        if (((CardStatus) o.ep.d.e(1555433584, -1555433578, objArr4, i6, iElapsedRealtime, i7, i5)) == CardStatus.Active) {
            int i8 = f27034w + 83;
            f27033v = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 62 / 0;
                if (this.f27040p.d().booleanValue()) {
                    return;
                }
            } else if (this.f27040p.d().booleanValue()) {
                return;
            }
        }
        WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
        Object[] objArr5 = new Object[1];
        B((char) (37338 - TextUtils.getOffsetAfter("", 0)), "ụퟰᚾ諐", "\u0000\u0000\u0000\u0000", "鸡邋\uda01⦑", TextUtils.getOffsetAfter("", 0), objArr5);
        throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr5[0]).intern());
    }

    @Override // o.x.i
    public final String c() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f27033v + 75;
        f27034w = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            B((char) TextUtils.indexOf("", "", 0), "∨歠黪Ὦ仟킸廒Ќ諏앰㙧徼ﶆ究ꔹ涯嶗_䐼\u000e", "\u0000\u0000\u0000\u0000", "矕敍췵柖", (-1) >>> TextUtils.lastIndexOf("", Typography.dollar, 0, 0), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            B((char) TextUtils.indexOf("", "", 0), "∨歠黪Ὦ仟킸廒Ќ諏앰㙧徼ﶆ究ꔹ涯嶗_䐼\u000e", "\u0000\u0000\u0000\u0000", "矕敍췵柖", (-1) - TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i4 = f27034w + 47;
        f27033v = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return strIntern;
    }

    public final void c(Context context, SecurePinInput securePinInput, o.x.j jVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f27034w + 81;
        f27033v = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f27034w + 5;
            f27033v = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            B((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), "℘삡䫋몭㋗鞠봋㺑㍿ꀌ᎐諴첩貞牧梪\uf404\uf683搕꺿嶼䩁\u173a\uecf9", "\u0000\u0000\u0000\u0000", "厓㾚⣼צ", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            B((char) (ViewConfiguration.getTouchSlop() >> 8), "Ⅲ䜞屦쐍ᇚ瘃퓜轒㦡왋チ", "\u0000\u0000\u0000\u0000", "\uebde⣲햐㠙", (-1876364566) - ExpandableListView.getPackedPositionChild(0L), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        d(securePinInput);
        b(context, jVar);
        int i7 = f27033v + 65;
        f27034w = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    @Override // o.x.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(final android.content.Context r16, final o.en.b r17, final o.i.d r18) throws java.lang.Throwable {
        /*
            r15 = this;
            r0 = r15
            r0 = r0
            r8 = 2
            int r1 = r8 % r8
            int r1 = o.y.b.f27033v
            int r3 = r1 + 111
            int r1 = r3 % 128
            o.y.b.f27034w = r1
            int r3 = r3 % r8
            r2 = 0
            if (r3 == 0) goto L94
            boolean r3 = o.ea.f.a()
            r1 = 87
            int r1 = r1 / r2
            if (r3 == 0) goto L67
        L1a:
            int r1 = o.y.b.f27034w
            int r3 = r1 + 39
            int r1 = r3 % 128
            o.y.b.f27033v = r1
            int r3 = r3 % r8
            java.lang.String r5 = ""
            int r1 = android.text.TextUtils.getOffsetAfter(r5, r2)
            char r9 = (char) r1
            long r6 = android.widget.ExpandableListView.getPackedPositionForChild(r2, r2)
            r3 = 0
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            r4 = 1
            int r13 = r1 + 1
            java.lang.Object[] r14 = new java.lang.Object[r4]
            java.lang.String r10 = "℘삡䫋몭㋗鞠봋㺑㍿ꀌ᎐諴첩貞牧梪\uf404\uf683搕꺿嶼䩁\u173a\uecf9"
            java.lang.String r11 = "\u0000\u0000\u0000\u0000"
            java.lang.String r12 = "厓㾚⣼צ"
            B(r9, r10, r11, r12, r13, r14)
            r1 = r14[r2]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = r1.intern()
            int r1 = android.text.TextUtils.getOffsetBefore(r5, r2)
            char r9 = (char) r1
            int r13 = android.text.TextUtils.getOffsetBefore(r5, r2)
            java.lang.Object[] r14 = new java.lang.Object[r4]
            java.lang.String r10 = "莀ၩ蔬튡\u0bd4\u0ce4ꭟ梤朄ᯐ"
            java.lang.String r11 = "\u0000\u0000\u0000\u0000"
            java.lang.String r12 = "㚃䚢豲ᵪ"
            B(r9, r10, r11, r12, r13, r14)
            r1 = r14[r2]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            o.ea.f.c(r3, r1)
        L67:
            o.x.f r11 = r0.i()
            o.y.b$2 r9 = new o.y.b$2
            r10 = r0
            r14 = r18
            r13 = r17
            r12 = r16
            r9.<init>()
            fr.antelop.sdk.digitalcard.SecurePinInput r3 = r0.f27041t
            if (r3 == 0) goto L9b
            int r1 = o.y.b.f27033v
            int r2 = r1 + 115
            int r1 = r2 % 128
            o.y.b.f27034w = r1
            int r2 = r2 % r8
            fr.antelop.sdk.digitalcard.SecurePinInput$NewPinInputProperties r1 = r3.getNewPinInputProperties()
            if (r1 == 0) goto L9b
            fr.antelop.sdk.digitalcard.SecurePinInput r1 = r0.f27041t
            fr.antelop.sdk.digitalcard.SecurePinInput$NewPinInputProperties r1 = r1.getNewPinInputProperties()
            r0.c(r12, r1, r9)
            return
        L94:
            boolean r1 = o.ea.f.a()
            if (r1 == 0) goto L67
            goto L1a
        L9b:
            r1 = 0
            r0 = r0
            r2 = r12
            r3 = r11
            r4 = r13
            r5 = r14
            r0.d(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.b.c(android.content.Context, o.en.b, o.i.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.content.Context r14, fr.antelop.sdk.digitalcard.SecurePinInput r15, o.x.f r16) throws java.lang.Throwable {
        /*
            r13 = this;
            r6 = 2
            int r0 = r6 % r6
            int r0 = o.y.b.f27034w
            int r1 = r0 + 107
            int r0 = r1 % 128
            o.y.b.f27033v = r0
            int r1 = r1 % r6
            r0 = 0
            if (r1 != 0) goto L79
            boolean r2 = o.ea.f.a()
            r1 = 21
            int r1 = r1 / r0
            if (r2 == 0) goto L67
        L18:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r3 = 1
            int r1 = 1 - r1
            char r7 = (char) r1
            double r4 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(r0)
            r1 = 0
            int r11 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.String r8 = "℘삡䫋몭㋗鞠봋㺑㍿ꀌ᎐諴첩貞牧梪\uf404\uf683搕꺿嶼䩁\u173a\uecf9"
            java.lang.String r9 = "\u0000\u0000\u0000\u0000"
            java.lang.String r10 = "厓㾚⣼צ"
            B(r7, r8, r9, r10, r11, r12)
            r1 = r12[r0]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r1.intern()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r1 = android.graphics.Color.rgb(r0, r0, r0)
            int r4 = r4 - r1
            char r7 = (char) r4
            int r1 = android.view.ViewConfiguration.getKeyRepeatDelay()
            int r1 = r1 >> 16
            r11 = -1876364565(0xffffffff9028f2eb, float:-3.3319295E-29)
            int r11 = r11 - r1
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.String r8 = "Ⅲ䜞屦쐍ᇚ瘃퓜轒㦡왋チ"
            java.lang.String r9 = "\u0000\u0000\u0000\u0000"
            java.lang.String r10 = "\uebde⣲햐㠙"
            B(r7, r8, r9, r10, r11, r12)
            r0 = r12[r0]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ea.f.c(r2, r0)
        L67:
            r13.d(r15)
            r0 = r16
            r13.b(r14, r0)
            int r0 = o.y.b.f27033v
            int r1 = r0 + 107
            int r0 = r1 % 128
            o.y.b.f27034w = r0
            int r1 = r1 % r6
            return
        L79:
            boolean r1 = o.ea.f.a()
            if (r1 == 0) goto L67
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.b.d(android.content.Context, fr.antelop.sdk.digitalcard.SecurePinInput, o.x.f):void");
    }

    final void d(byte[] bArr, Context context, final o.x.f fVar, o.en.b bVar, o.i.d dVar) throws Throwable {
        int i2 = 2 % 2;
        new o.ai.b(context, new b.e() { // from class: o.y.b.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f27042c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static boolean f27043d = false;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static char[] f27044e = null;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static boolean f27045f = false;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static int f27046g = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static int f27047h = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f27048i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static int f27049j = 0;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static int f27050k = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$e(byte r6, byte r7, int r8) {
                /*
                    int r0 = r6 * 2
                    int r0 = 115 - r0
                    int r1 = r8 * 4
                    int r8 = 1 - r1
                    int r1 = r7 * 4
                    int r7 = 4 - r1
                    byte[] r6 = o.y.b.AnonymousClass1.$$c
                    byte[] r5 = new byte[r8]
                    r4 = 0
                    if (r6 != 0) goto L2c
                    r2 = r8
                    r3 = r4
                L15:
                    int r0 = -r0
                    int r0 = r0 + r2
                    int r7 = r7 + 1
                    r2 = r3
                L1a:
                    int r3 = r2 + 1
                    byte r1 = (byte) r0
                    r5[r2] = r1
                    if (r3 != r8) goto L27
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    return r0
                L27:
                    r1 = r6[r7]
                    r2 = r0
                    r0 = r1
                    goto L15
                L2c:
                    r2 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.b.AnonymousClass1.$$e(byte, byte, int):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                f27050k = -1130164214;
                f27047h = 1657026134;
                init$0();
                f27048i = 0;
                f27049j = 1;
                f27044e = new char[]{2532, 2497, 2520, 2509, 2538, 2522, 2504, 2554, 2496, 2506, 2556, 2507, 2500, 2505, 2524, 2510, 2555, 2502, 2499, 2523, 2553, 2525, 2305, 2511, 2318, 2484, 2498, 2521, 2526, 2316};
                f27042c = 2040400191;
                f27043d = true;
                f27045f = true;
                f27046g = -1270219358;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(11:29|92|30|(2:32|(3:35|90|36))(4:37|86|38|(7:40|89|47|(2:49|56)(4:50|82|51|52)|(4:88|58|(2:60|67)(4:61|84|62|63)|(2:70|71))|72|73)(1:41))|34|89|47|(0)(0)|(0)|72|73) */
            /* JADX WARN: Removed duplicated region for block: B:49:0x048e  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x048f A[Catch: Exception -> 0x04c8, TRY_LEAVE, TryCatch #4 {Exception -> 0x04c8, blocks: (B:47:0x046d, B:50:0x048f, B:52:0x04b9, B:54:0x04c1, B:55:0x04c7, B:51:0x0499), top: B:89:0x046d, inners: #0 }] */
            /* JADX WARN: Removed duplicated region for block: B:88:0x04cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.Object[] c(int r22, int r23) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1556
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.b.AnonymousClass1.c(int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{99, Ascii.EM, 0, 108};
                $$b = Mp4VideoDirectory.TAG_COMPRESSION_TYPE;
            }

            static void init$1() {
                $$c = new byte[]{Ascii.EM, -77, -1, MessagePack.Code.INT8};
                $$d = 48;
            }

            private static void l(int i3, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
                String str3 = str;
                String str4 = str2;
                char c2 = 2;
                int i4 = 2 % 2;
                Object bytes = str4;
                if (str4 != null) {
                    int i5 = $10 + 39;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    bytes = str4.getBytes("ISO-8859-1");
                }
                byte[] bArr2 = (byte[]) bytes;
                Object charArray = str3;
                if (str3 != null) {
                    int i7 = $11 + 37;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    charArray = str3.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                o.a.f fVar2 = new o.a.f();
                char[] cArr2 = f27044e;
                if (cArr2 != null) {
                    int i9 = $11 + 7;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i11 = 0;
                    while (i11 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i11])};
                            Object objA = o.d.d.a(1618406102);
                            if (objA == null) {
                                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 593;
                                char cRed = (char) (13181 - Color.red(0));
                                int iRed = Color.red(0) + 11;
                                byte b2 = (byte) ($$d >>> 1);
                                byte b3 = (byte) ($$c[c2] + 1);
                                objA = o.d.d.a(doubleTapTimeout, cRed, iRed, -1225586509, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr3[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                            i11++;
                            c2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i12 = $11 + 107;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr2 = cArr3;
                }
                Object[] objArr3 = {Integer.valueOf(f27042c)};
                Object objA2 = o.d.d.a(-1503702982);
                if (objA2 == null) {
                    objA2 = o.d.d.a(32 - View.getDefaultSize(0, 0), (char) Color.alpha(0), 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1893380703, false, "F", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                int i14 = 21;
                int i15 = 1540807955;
                if (f27045f) {
                    fVar2.f19923e = bArr2.length;
                    char[] cArr4 = new char[fVar2.f19923e];
                    fVar2.f19922a = 0;
                    while (fVar2.f19922a < fVar2.f19923e) {
                        cArr4[fVar2.f19922a] = (char) (cArr2[bArr2[(fVar2.f19923e - 1) - fVar2.f19922a] + i3] - iIntValue);
                        Object[] objArr4 = {fVar2, fVar2};
                        Object objA3 = o.d.d.a(i15);
                        if (objA3 == null) {
                            int gidForName = Process.getGidForName("") + 459;
                            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                            int i16 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10;
                            byte b4 = (byte) i14;
                            byte b5 = (byte) ($$c[2] + 1);
                            objA3 = o.d.d.a(gidForName, cResolveOpacity, i16, -1923924106, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr4);
                        i14 = 21;
                        i15 = 1540807955;
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (!f27043d) {
                    fVar2.f19923e = iArr.length;
                    char[] cArr5 = new char[fVar2.f19923e];
                    fVar2.f19922a = 0;
                    while (fVar2.f19922a < fVar2.f19923e) {
                        cArr5[fVar2.f19922a] = (char) (cArr2[iArr[(fVar2.f19923e - 1) - fVar2.f19922a] - i3] - iIntValue);
                        fVar2.f19922a++;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                fVar2.f19923e = cArr.length;
                char[] cArr6 = new char[fVar2.f19923e];
                fVar2.f19922a = 0;
                while (fVar2.f19922a < fVar2.f19923e) {
                    cArr6[fVar2.f19922a] = (char) (cArr2[cArr[(fVar2.f19923e - 1) - fVar2.f19922a] - i3] - iIntValue);
                    Object[] objArr5 = {fVar2, fVar2};
                    Object objA4 = o.d.d.a(1540807955);
                    if (objA4 == null) {
                        int i17 = 458 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                        int iKeyCodeFromString = 11 - KeyEvent.keyCodeFromString("");
                        byte b6 = (byte) ($$c[2] + 1);
                        objA4 = o.d.d.a(i17, cAxisFromString, iKeyCodeFromString, -1923924106, false, $$e((byte) 21, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr6);
            }

            private static void m(int i3, String str, boolean z2, int i4, int i5, Object[] objArr) throws Throwable {
                Object charArray;
                String str2 = str;
                int i6 = 2 % 2;
                int i7 = $11;
                int i8 = i7 + 95;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                if (str2 != null) {
                    int i10 = i7 + 85;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        str2.toCharArray();
                        throw null;
                    }
                    charArray = str2.toCharArray();
                } else {
                    charArray = str2;
                }
                char[] cArr = (char[]) charArray;
                o.a.n nVar = new o.a.n();
                char[] cArr2 = new char[i3];
                nVar.f19944a = 0;
                while (nVar.f19944a < i3) {
                    int i11 = $10 + 93;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    nVar.f19946e = cArr[nVar.f19944a];
                    cArr2[nVar.f19944a] = (char) (i4 + nVar.f19946e);
                    int i13 = nVar.f19944a;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i13]), Integer.valueOf(f27046g)};
                        Object objA = o.d.d.a(1376241034);
                        if (objA == null) {
                            int i14 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 270;
                            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 11;
                            byte b2 = (byte) ($$c[2] + 1);
                            byte b3 = b2;
                            objA = o.d.d.a(i14, touchSlop, tapTimeout, -2071844881, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i13] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {nVar, nVar};
                        Object objA2 = o.d.d.a(-202660535);
                        if (objA2 == null) {
                            int iLastIndexOf = 521 - TextUtils.lastIndexOf("", '0', 0, 0);
                            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                            int iGreen = Color.green(0) + 12;
                            byte b4 = (byte) (-$$c[2]);
                            byte b5 = (byte) (b4 - 1);
                            objA2 = o.d.d.a(iLastIndexOf, maxKeyCode, iGreen, 627984172, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
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
                if (i5 > 0) {
                    nVar.f19945b = i5;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    System.arraycopy(cArr3, 0, cArr2, i3 - nVar.f19945b, nVar.f19945b);
                    System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i3 - nVar.f19945b);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    nVar.f19944a = 0;
                    while (nVar.f19944a < i3) {
                        int i15 = $10 + 123;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        cArr4[nVar.f19944a] = cArr2[(i3 - nVar.f19944a) - 1];
                        Object[] objArr4 = {nVar, nVar};
                        Object objA3 = o.d.d.a(-202660535);
                        if (objA3 == null) {
                            int fadingEdgeLength = 522 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            char trimmedLength = (char) TextUtils.getTrimmedLength("");
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 12;
                            byte b6 = (byte) (-$$c[2]);
                            byte b7 = (byte) (b6 - 1);
                            objA3 = o.d.d.a(fadingEdgeLength, trimmedLength, iMakeMeasureSpec, 627984172, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr4);
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0015). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void n(short r9, byte r10, byte r11, java.lang.Object[] r12) {
                /*
                    byte[] r8 = o.y.b.AnonymousClass1.$$a
                    int r7 = r9 * 4
                    int r2 = r7 + 1
                    int r0 = r10 * 4
                    int r0 = r0 + 4
                    int r1 = r11 * 4
                    int r6 = r1 + 100
                    byte[] r5 = new byte[r2]
                    r4 = 0
                    if (r8 != 0) goto L2f
                    r3 = r4
                    r2 = r0
                L15:
                    int r1 = -r0
                    int r1 = r1 + r6
                    int r0 = r2 + 1
                    r2 = r3
                    r6 = r1
                L1b:
                    byte r1 = (byte) r6
                    r5[r2] = r1
                    int r3 = r2 + 1
                    if (r2 != r7) goto L2a
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    r12[r4] = r0
                    return
                L2a:
                    r1 = r8[r0]
                    r2 = r0
                    r0 = r1
                    goto L15
                L2f:
                    r2 = r4
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.b.AnonymousClass1.n(short, byte, byte, java.lang.Object[]):void");
            }

            @Override // o.ai.b.e
            public final void a(Boolean bool) throws Throwable {
                String strIntern;
                Object obj;
                int i3 = 2 % 2;
                if (o.ea.f.a()) {
                    int i4 = f27048i + 105;
                    f27049j = i4 % 128;
                    if (i4 % 2 == 0) {
                        Object[] objArr = new Object[1];
                        l((ViewConfiguration.getMinimumFlingVelocity() << 99) * 114, null, null, "\u0082\u0090\u008d\u008c\u008f\u008e\u008d\u008c\u0086\u008b\u008a\u0089\u0088\u0083\u0084\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0082\u0081", objArr);
                        strIntern = ((String) objArr[0]).intern();
                        Object[] objArr2 = new Object[1];
                        l(1 >> (ViewConfiguration.getWindowTouchSlop() * 10), null, null, "\u008a\u008a\u0083\u0086\u0086\u0087\u0085\u0094\u0084\u008f\u0088\u0093\u008f\u008c\u008d\u0092\u008d\u0091\u0083\u008c\u008f\u008e\u008d\u008c\u0086\u008b\u0082\u0090", objArr2);
                        obj = objArr2[0];
                    } else {
                        Object[] objArr3 = new Object[1];
                        l(127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), null, null, "\u0082\u0090\u008d\u008c\u008f\u008e\u008d\u008c\u0086\u008b\u008a\u0089\u0088\u0083\u0084\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0082\u0081", objArr3);
                        strIntern = ((String) objArr3[0]).intern();
                        Object[] objArr4 = new Object[1];
                        l(127 - (ViewConfiguration.getWindowTouchSlop() >> 8), null, null, "\u008a\u008a\u0083\u0086\u0086\u0087\u0085\u0094\u0084\u008f\u0088\u0093\u008f\u008c\u008d\u0092\u008d\u0091\u0083\u008c\u008f\u008e\u008d\u008c\u0086\u008b\u0082\u0090", objArr4);
                        obj = objArr4[0];
                    }
                    o.ea.f.c(strIntern, ((String) obj).intern());
                }
                b.this.f27039o = bool.booleanValue();
                o.x.f fVar2 = fVar;
                if (fVar2 != null) {
                    fVar2.onProcessSuccess();
                    int i5 = f27048i + 21;
                    f27049j = i5 % 128;
                    int i6 = i5 % 2;
                }
            }

            @Override // o.ai.b.e
            public final void e(o.bg.c cVar) throws Throwable {
                int i3 = 2 % 2;
                int i4 = f27048i + 105;
                f27049j = i4 % 128;
                Object obj = null;
                if (i4 % 2 == 0) {
                    o.ea.f.a();
                    obj.hashCode();
                    throw null;
                }
                if (o.ea.f.a()) {
                    Object[] objArr = new Object[1];
                    l(TextUtils.indexOf("", "", 0) + 127, null, null, "\u0082\u0090\u008d\u008c\u008f\u008e\u008d\u008c\u0086\u008b\u008a\u0089\u0088\u0083\u0084\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0082\u0081", objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    l(127 - (ViewConfiguration.getScrollBarSize() >> 8), null, null, "\u0083\u0084\u0087\u0093\u008d\u008f\u0095\u0094\u0084\u008f\u0088\u0093\u008f\u008c\u008d\u0092\u008d\u0091\u0083\u008c\u008f\u008e\u008d\u008c\u0086\u008b\u0082\u0090", objArr2);
                    o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
                }
                o.by.c cVarB = o.by.c.b(cVar);
                if (fVar != null) {
                    int i5 = f27049j + 11;
                    f27048i = i5 % 128;
                    if (i5 % 2 != 0) {
                        cVar.c();
                        o.bg.a aVar = o.bg.a.az;
                        obj.hashCode();
                        throw null;
                    }
                    if (cVar.c() != o.bg.a.az) {
                        fVar.onError(cVarB);
                    } else {
                        b.d(b.this);
                        fVar.onAuthenticationDeclined();
                    }
                }
            }
        }, bVar).c(bArr, dVar, g(), this.f27040p);
        int i3 = f27034w + 97;
        f27033v = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void e(CustomerAuthenticatedProcessActivityCallback customerAuthenticatedProcessActivityCallback) {
        int iActiveCount = Thread.activeCount();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i2 = 274273059 * f27028l;
        f27028l = i2;
        c(i2, new Object[]{this, customerAuthenticatedProcessActivityCallback}, 323778715, elapsedCpuTime, -323778714, new Random().nextInt(846982669), iActiveCount);
    }

    public final boolean l() {
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int i3 = f27029n * 411550838;
        f27029n = i3;
        return ((Boolean) c((int) SystemClock.elapsedRealtime(), new Object[]{this}, -2067062937, i3, 2067062937, (int) SystemClock.uptimeMillis(), i2)).booleanValue();
    }
}
