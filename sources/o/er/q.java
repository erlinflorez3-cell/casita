package o.er;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.AntelopErrorCode;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethod;
import fr.antelop.sdk.authentication.LocalAuthenticationErrorReason;
import fr.antelop.sdk.card.Card;
import fr.antelop.sdk.digitalcard.SecureCardPushToIssuerNfcWallet;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.util.List;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f25138b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f25139c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f25140e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f25141f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f25142h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f25143i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f25144j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o.en.b f25145d;

    private static String $$c(byte b2, int i2, byte b3) {
        int i3 = 4 - (b3 * 4);
        int i4 = 122 - i2;
        byte[] bArr = $$a;
        int i5 = b2 * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i3++;
            i4 = (-i4) + i6;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            int i8 = bArr[i3];
            i3++;
            i4 = (-i8) + i4;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25144j = 0;
        f25141f = 1;
        f25142h = 0;
        f25143i = 1;
        a();
        SystemClock.uptimeMillis();
        ExpandableListView.getPackedPositionForChild(0, 0);
        int i2 = f25141f + 11;
        f25144j = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public q(o.ep.d dVar, o.eq.e eVar) {
        super(dVar, eVar);
        this.f25145d = o.en.b.c();
    }

    static void a() {
        f25139c = 740602047300126166L;
        f25140e = -24484414;
        f25138b = (char) 17878;
    }

    private String f() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25142h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f25143i = i3 % 128;
        int i4 = i3 % 2;
        String strB = this.f25010g.b().b();
        if (strB != null) {
            return strB;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            k((char) (23458 - Color.green(0)), "䲥ḕ않̢鸔씯\ueaf0뽜鎊鋋࣠㭋\ue017ꎕ봨䃻굎俆똾⃫뒦陪벎ℎ榔팯㓹", "\u0000\u0000\u0000\u0000", "\udab3櫡ꈪ퉛", 711647705 - MotionEvent.axisFromString(""), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            k((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), "\ue07fﶯӋᭋѼ\ue8a8‐뛚櫊\udd44\ue272꽨磤㽝熺\ue0bc鵘ﱨ梍뛻\uedf1戛\ueeb3쓆厐조욕⪷➒ě甒쮾껜ꄿ姙㑩⇈ᶭ纜\ufaea㎸يﵮ䞩꿁\uec28\u20fd袗င觌戂脇∄\ue8ea㵣虹ꠃ䉘\ue659ឦ瑟툩䡑룊ᾑꌢ튢䗪웭謰㷧솂Ĩ鬛ܙ㶋ᗧ傴눅鞙ᷕ\ue90aࢗ\uf24e퐪\ue326晗睗̚綴⑧檔ꦑ鯬鏞祜﹉❂뱹썴\ueb03闟㱚홍\ue427刅\ue114멕\uf81f⩉죮Ʞ\uf66d吓", "\u0000\u0000\u0000\u0000", "钯뭲ᕲ㤴", (-1) - TextUtils.indexOf((CharSequence) "", '0'), objArr2);
            o.ea.f.d(strIntern, ((String) objArr2[0]).intern());
        }
        Object[] objArr3 = new Object[1];
        k((char) (38609 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), "㡘ᨼ㑂鹳莙谪纶甝⸔\uddda\uf1ec䕼㪈⇢咊郔잴", "\u0000\u0000\u0000\u0000", "\udc19톍퇍纖", TextUtils.indexOf((CharSequence) "", '0') - 841904675, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        int i5 = f25143i + 13;
        f25142h = i5 % 128;
        int i6 = i5 % 2;
        return strIntern2;
    }

    static void init$0() {
        $$a = new byte[]{84, 109, 90, 4};
        $$b = 168;
    }

    private static void k(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        char c3 = 2;
        int i3 = 2 % 2;
        int i4 = $11 + 37;
        $10 = i4 % 128;
        Object obj = null;
        Object charArray = str6;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (str6 != null) {
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            int i5 = $11 + 53;
            $10 = i5 % 128;
            int i6 = i5 % 2;
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
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a((KeyEvent.getMaxKeyCode() >> 16) + 106, (char) KeyEvent.normalizeMetaState(0), 11 - Color.blue(0), -155898465, false, $$c(b2, (byte) ((b2 + 57) - (57 & b2)), b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 847, (char) (6488 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12, -694521287, false, $$c(b3, (byte) ((b3 + 54) - (54 & b3)), b3), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(obj, objArr3)).intValue();
                int i7 = cArr3[iVar.f19932b % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[c3] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[1] = Integer.valueOf(i7);
                objArr4[0] = iVar;
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(459 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), KeyEvent.getDeadChar(0, 0) + 11, 1804962841, false, $$c(b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 56))), b4), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    c3 = 2;
                    objA4 = o.d.d.a(ExpandableListView.getPackedPositionGroup(0L) + 639, (char) (65099 - ((byte) KeyEvent.getModifierMetaStateMask())), 12 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1636969060, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c3 = 2;
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (r10[iVar.f19932b] ^ cArr3[iIntValue2])) ^ (f25139c ^ 740602047300126166L)) ^ ((long) ((int) (((long) f25140e) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f25138b) ^ 740602047300126166L))));
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
        objArr[0] = new String(cArr5);
    }

    public final void a(Context context, boolean z2, final OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        SecureCardPushToIssuerNfcWallet secureCardPushToIssuerNfcWalletD = d();
        secureCardPushToIssuerNfcWalletD.requireTermsAndConditionsApproval(z2);
        secureCardPushToIssuerNfcWalletD.launch(context, new CustomCustomerAuthenticatedProcessCallback() { // from class: o.er.q.2
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static final int $$f = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static char f25146b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long f25147d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f25148e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static int f25149f = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f25150i = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0014). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$g(short r9, int r10, int r11) {
                /*
                    int r8 = r11 * 2
                    int r2 = r8 + 1
                    int r0 = r9 + 65
                    byte[] r7 = o.er.q.AnonymousClass2.$$c
                    int r1 = r10 * 4
                    int r6 = 4 - r1
                    byte[] r5 = new byte[r2]
                    r4 = 0
                    if (r7 != 0) goto L2d
                    r1 = r6
                    r2 = r8
                    r3 = r4
                L14:
                    int r0 = -r2
                    int r6 = r6 + r0
                    int r1 = r1 + 1
                    r2 = r3
                    r0 = r6
                    r6 = r1
                L1b:
                    byte r1 = (byte) r0
                    r5[r2] = r1
                    int r3 = r2 + 1
                    if (r2 != r8) goto L28
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    return r0
                L28:
                    r2 = r7[r6]
                    r1 = r6
                    r6 = r0
                    goto L14
                L2d:
                    r2 = r4
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.q.AnonymousClass2.$$g(short, int, int):java.lang.String");
            }

            static {
                init$2();
                $10 = 0;
                $11 = 1;
                init$1();
                init$0();
                f25150i = 0;
                f25149f = 1;
                f25147d = 740602047300126166L;
                f25148e = 979387082;
                f25146b = (char) 17878;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0015). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void g(short r9, int r10, int r11, java.lang.Object[] r12) {
                /*
                    int r0 = r11 * 2
                    int r8 = 4 - r0
                    byte[] r7 = o.er.q.AnonymousClass2.$$a
                    int r0 = r9 * 3
                    int r6 = 1 - r0
                    int r0 = r10 * 3
                    int r5 = r0 + 98
                    byte[] r4 = new byte[r6]
                    r3 = 0
                    if (r7 != 0) goto L2d
                    r0 = r8
                    r2 = r3
                L15:
                    int r8 = r8 + 1
                    int r5 = r5 + r0
                    r1 = r2
                L19:
                    byte r0 = (byte) r5
                    int r2 = r1 + 1
                    r4[r1] = r0
                    if (r2 != r6) goto L28
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    r12[r3] = r0
                    return
                L28:
                    r1 = r7[r8]
                    r0 = r5
                    r5 = r1
                    goto L15
                L2d:
                    r1 = r3
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.q.AnonymousClass2.g(short, int, int, java.lang.Object[]):void");
            }

            private static void h(char c2, String str, String str2, String str3, int i3, Object[] objArr) throws Throwable {
                String str4 = str;
                String str5 = str2;
                String str6 = str3;
                int i4 = 2 % 2;
                int i5 = $10 + 99;
                $11 = i5 % 128;
                Object obj = null;
                Object charArray = str6;
                if (i5 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (str6 != null) {
                    charArray = str6.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                Object obj2 = str5;
                if (str5 != null) {
                    char[] charArray2 = str5.toCharArray();
                    int i6 = $11 + 79;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    obj2 = charArray2;
                }
                char[] cArr2 = (char[]) obj2;
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
                cArr4[2] = (char) (cArr4[2] + ((char) i3));
                int length3 = ((char[]) charArray3).length;
                char[] cArr5 = new char[length3];
                iVar.f19932b = 0;
                while (iVar.f19932b < length3) {
                    try {
                        Object[] objArr2 = {iVar};
                        Object objA = o.d.d.a(540069882);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a(107 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), ExpandableListView.getPackedPositionGroup(0L) + 11, -155898465, false, $$g(b2, b3, b3), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                        Object[] objArr3 = {iVar};
                        Object objA2 = o.d.d.a(2068572);
                        if (objA2 == null) {
                            int trimmedLength = 847 - TextUtils.getTrimmedLength("");
                            char deadChar = (char) (6488 - KeyEvent.getDeadChar(0, 0));
                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 12;
                            byte b4 = (byte) ((-1) - (((-1) - $$f) | ((-1) - 11)));
                            byte b5 = (byte) (b4 - 3);
                            objA2 = o.d.d.a(trimmedLength, deadChar, touchSlop, -694521287, false, $$g(b4, b5, b5), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                        Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                        Object objA3 = o.d.d.a(-1122996612);
                        if (objA3 == null) {
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + MessagePack.Code.FLOAT64;
                            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                            int fadingEdgeLength = 11 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            byte b6 = (byte) ($$f & 1);
                            byte b7 = (byte) (b6 - 1);
                            objA3 = o.d.d.a(modifierMetaStateMask, cResolveOpacity, fadingEdgeLength, 1804962841, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objA3).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                        Object objA4 = o.d.d.a(-1223178239);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            objA4 = o.d.d.a(639 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((-16712116) - Color.rgb(0, 0, 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12, 1636969060, false, $$g((byte) 57, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                        cArr3[iIntValue2] = iVar.f19933e;
                        cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f25147d ^ 740602047300126166L)) ^ ((long) ((int) (((long) f25148e) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f25146b) ^ 740602047300126166L))));
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
                objArr[0] = new String(cArr5);
            }

            static void init$0() {
                $$a = new byte[]{3, 32, 122, 114};
                $$b = 176;
            }

            static void init$1() {
                $$d = new byte[]{Ascii.ETB, 121, MessagePack.Code.FALSE, Ascii.SI, -65, 52, 0, MessagePack.Code.UINT8, 54, MessagePack.Code.NIL, 64, -65, 53, 4, MessagePack.Code.EXT8, 51};
                $$e = 38;
            }

            static void init$2() {
                $$c = new byte[]{Ascii.ETB, 121, MessagePack.Code.FALSE, Ascii.SI};
                $$f = JfifUtil.MARKER_RST7;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:5:0x000f). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void j(byte r8, int r9, int r10, java.lang.Object[] r11) {
                /*
                    int r7 = r10 + 4
                    byte[] r6 = o.er.q.AnonymousClass2.$$d
                    int r5 = r8 + 1
                    int r4 = r9 + 98
                    byte[] r3 = new byte[r5]
                    r2 = 0
                    if (r6 != 0) goto L24
                    r0 = r5
                    r1 = r2
                Lf:
                    int r4 = r4 + r0
                L10:
                    int r7 = r7 + 1
                    byte r0 = (byte) r4
                    r3[r1] = r0
                    int r1 = r1 + 1
                    if (r1 != r5) goto L21
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r3, r2)
                    r11[r2] = r0
                    return
                L21:
                    r0 = r6[r7]
                    goto Lf
                L24:
                    r1 = r2
                    goto L10
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.q.AnonymousClass2.j(byte, int, int, java.lang.Object[]):void");
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onAuthenticationDeclined(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i3 = 2 % 2;
                operationCallback.onError(new o.by.c(AntelopErrorCode.CustomerAuthenticationImpossible).a());
                int i4 = f25149f + 101;
                f25150i = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onCustomerCredentialsInvalid(LocalAuthenticationErrorReason localAuthenticationErrorReason, CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i3 = 2 % 2;
                operationCallback.onError(new o.by.c(AntelopErrorCode.CustomerCredentialsInvalid).a());
                int i4 = f25149f + 65;
                f25150i = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onCustomerCredentialsRequired(List<CustomerAuthenticationMethod> list, CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i3 = 2 % 2;
                operationCallback.onError(new o.by.c(AntelopErrorCode.CustomerAuthenticationImpossible).a());
                int i4 = f25149f + 21;
                f25150i = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onError(AntelopError antelopError, CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i3 = 2 % 2;
                int i4 = f25150i + 1;
                f25149f = i4 % 128;
                if (i4 % 2 != 0) {
                    operationCallback.onError(antelopError);
                    return;
                }
                operationCallback.onError(antelopError);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onProcessStart(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i3 = 2 % 2;
                int i4 = f25149f + 15;
                f25150i = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x012d  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0285  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x028f  */
            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onProcessSuccess(fr.antelop.sdk.authentication.CustomerAuthenticatedProcess r32) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 2722
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.q.AnonymousClass2.onProcessSuccess(fr.antelop.sdk.authentication.CustomerAuthenticatedProcess):void");
            }
        });
        int i3 = f25143i + 61;
        f25142h = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 / 0;
        }
    }

    public final Card b() {
        int i2 = 2 % 2;
        for (o.ep.d dVar : this.f25145d.e().e(true).values()) {
            if (dVar.i() == o.en.e.f24190c) {
                int i3 = f25142h + 105;
                f25143i = i3 % 128;
                int i4 = i3 % 2;
                if (dVar.n() != null && dVar.n().equals(this.f25009a.n())) {
                    Card card = new Card(dVar);
                    int i5 = f25143i + 43;
                    f25142h = i5 % 128;
                    if (i5 % 2 == 0) {
                        return card;
                    }
                    throw null;
                }
            }
            if (dVar.i() == o.en.e.f24190c && dVar.r() != null && this.f25009a.r() != null) {
                int i6 = f25143i + 109;
                f25142h = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr = {dVar.r()};
                int iActiveCount = Thread.activeCount();
                int i8 = f.f24986b * (-319723722);
                f.f24986b = i8;
                int i9 = f.f24990f * 1454362011;
                f.f24990f = i9;
                int i10 = f.f24991i * (-733680792);
                f.f24991i = i10;
                String str = (String) f.c(1370509635, i8, i9, objArr, -1370509633, i10, iActiveCount);
                Object[] objArr2 = {this.f25009a.r()};
                int iActiveCount2 = Thread.activeCount();
                int i11 = f.f24986b * (-319723722);
                f.f24986b = i11;
                int i12 = f.f24990f * 1454362011;
                f.f24990f = i12;
                int i13 = f.f24991i * (-733680792);
                f.f24991i = i13;
                if (str.equals((String) f.c(1370509635, i11, i12, objArr2, -1370509633, i13, iActiveCount2))) {
                    return new Card(dVar);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (super.c() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r7 = new java.lang.Object[]{r12.f25145d};
        r6 = (int) android.os.Process.getElapsedCpuTime();
        r8 = (int) android.os.SystemClock.uptimeMillis();
        r10 = java.lang.Thread.currentThread().getPriority();
        r11 = o.en.b.f24088c * (-1721916949);
        o.en.b.f24088c = r11;
        r6 = new java.lang.Object[]{((o.fm.g) o.en.b.a(-568976488, r6, r7, r8, 568976490, r10, r11)).e(), o.en.e.f24190c};
        r9 = (int) java.lang.Runtime.getRuntime().maxMemory();
        r11 = o.fm.h.f26083c * (-966280673);
        o.fm.h.f26083c = r11;
        r10 = o.fm.h.f26084d * 1253296810;
        o.fm.h.f26084d = r10;
        r2 = ((java.lang.Boolean) o.fm.h.c(-1003639645, r6, android.os.Process.myTid(), 1003639646, r9, r10, r11)).booleanValue();
        r1 = o.er.q.f25142h + 25;
        o.er.q.f25143i = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        if ((r1 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009b, code lost:
    
        r0 = 64 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (super.c() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        r1 = o.er.q.f25142h + com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        o.er.q.f25143i = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        return true;
     */
    @Override // o.er.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r12 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = o.er.q.f25142h
            int r1 = r0 + 73
            int r0 = r1 % 128
            o.er.q.f25143i = r0
            int r1 = r1 % r4
            r3 = 0
            if (r1 != 0) goto L25
            boolean r1 = super.c()
            r0 = 8
            int r0 = r0 / r3
            if (r1 != 0) goto L2d
        L18:
            int r0 = o.er.q.f25142h
            int r1 = r0 + 119
            int r0 = r1 % 128
            o.er.q.f25143i = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L2c
            r0 = 1
            return r0
        L25:
            boolean r0 = super.c()
            if (r0 != 0) goto L2d
            goto L18
        L2c:
            return r3
        L2d:
            o.en.b r0 = r12.f25145d
            java.lang.Object[] r7 = new java.lang.Object[]{r0}
            long r0 = android.os.Process.getElapsedCpuTime()
            int r6 = (int) r0
            long r0 = android.os.SystemClock.uptimeMillis()
            int r8 = (int) r0
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            int r10 = r0.getPriority()
            int r11 = o.en.b.f24088c
            r0 = -1721916949(0xffffffff995da1eb, float:-1.1458131E-23)
            int r11 = r11 * r0
            o.en.b.f24088c = r11
            r5 = -568976488(0xffffffffde161b98, float:-2.7041015E18)
            r9 = 568976490(0x21e9e46a, float:1.5849155E-18)
            java.lang.Object r0 = o.en.b.a(r5, r6, r7, r8, r9, r10, r11)
            o.fm.g r0 = (o.fm.g) r0
            o.fm.h r1 = r0.e()
            o.en.e r0 = o.en.e.f24190c
            java.lang.Object[] r6 = new java.lang.Object[]{r1, r0}
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r0 = r0.maxMemory()
            int r9 = (int) r0
            int r11 = o.fm.h.f26083c
            r0 = -966280673(0xffffffffc667ba1f, float:-14830.53)
            int r11 = r11 * r0
            o.fm.h.f26083c = r11
            int r10 = o.fm.h.f26084d
            r0 = 1253296810(0x4ab3caaa, float:5891413.0)
            int r10 = r10 * r0
            o.fm.h.f26084d = r10
            int r7 = android.os.Process.myTid()
            r8 = 1003639646(0x3bd2535e, float:0.0064186295)
            r5 = -1003639645(0xffffffffc42daca3, float:-694.69745)
            java.lang.Object r0 = o.fm.h.c(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            int r0 = o.er.q.f25142h
            int r1 = r0 + 25
            int r0 = r1 % 128
            o.er.q.f25143i = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L9e
            r0 = 64
            int r0 = r0 / r3
        L9e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.q.c():boolean");
    }

    public final SecureCardPushToIssuerNfcWallet d() {
        int i2 = 2 % 2;
        SecureCardPushToIssuerNfcWallet secureCardPushToIssuerNfcWallet = new SecureCardPushToIssuerNfcWallet(new o.y.a(f(), this.f25009a, c()));
        int i3 = f25142h + 117;
        f25143i = i3 % 128;
        if (i3 % 2 != 0) {
            return secureCardPushToIssuerNfcWallet;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean e() {
        int i2 = 2 % 2;
        int i3 = f25142h + 1;
        f25143i = i3 % 128;
        if (i3 % 2 == 0) {
            b();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (b() != null) {
            return true;
        }
        int i4 = f25143i + 71;
        f25142h = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return false;
    }

    @Override // o.er.h
    public final c[] h() {
        int i2 = 2 % 2;
        int i3 = f25142h + 111;
        f25143i = i3 % 128;
        int i4 = i3 % 2;
        c[] cVarArr = {this.f25010g.b()};
        int i5 = f25142h + 59;
        f25143i = i5 % 128;
        int i6 = i5 % 2;
        return cVarArr;
    }
}
