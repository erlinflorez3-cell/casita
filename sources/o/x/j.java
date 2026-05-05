package o.x;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import com.google.common.base.Ascii;
import fr.antelop.sdk.AntelopErrorCode;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.prompt.CustomerAuthenticationFailureReason;
import fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPrompt;
import fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPromptBuilder;
import fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPromptCallback;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.a.k;
import o.a.l;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements f {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f */
    private static int f26969f = 0;

    /* JADX INFO: renamed from: g */
    private static char f26970g = 0;

    /* JADX INFO: renamed from: h */
    private static long f26971h = 0;

    /* JADX INFO: renamed from: i */
    private static int f26972i = 0;

    /* JADX INFO: renamed from: j */
    private static int[] f26973j = null;

    /* JADX INFO: renamed from: k */
    private static int f26974k = 0;

    /* JADX INFO: renamed from: m */
    private static int f26975m = 0;

    /* JADX INFO: renamed from: o */
    private static int f26976o = 0;

    /* JADX INFO: renamed from: a */
    final Context f26977a;

    /* JADX INFO: renamed from: b */
    private final i<?> f26978b;

    /* JADX INFO: renamed from: c */
    private CancellationSignal f26979c;

    /* JADX INFO: renamed from: d */
    private final DefaultCustomerAuthenticatedProcessCallback f26980d;

    /* JADX INFO: renamed from: e */
    final CustomerAuthenticatedProcess f26981e;

    /* JADX INFO: renamed from: o.x.j$2 */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f26982a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f26983b;

        /* JADX INFO: renamed from: d */
        private static int f26984d = 1;

        /* JADX INFO: renamed from: e */
        private static int f26985e = 0;

        static {
            int[] iArr = new int[o.m.i.values().length];
            f26983b = iArr;
            try {
                iArr[o.m.i.f26497e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26983b[o.m.i.f26496d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26983b[o.m.i.f26495c.ordinal()] = 3;
                int i2 = f26984d;
                int i3 = ((i2 | 77) << 1) - (i2 ^ 77);
                f26985e = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26983b[o.m.i.f26493a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26983b[o.m.i.f26494b.ordinal()] = 5;
                int i6 = f26984d + 33;
                f26985e = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26983b[o.m.i.f26500i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[CustomerAuthenticationFailureReason.values().length];
            f26982a = iArr2;
            try {
                iArr2[CustomerAuthenticationFailureReason.Cancelled.ordinal()] = 1;
                int i9 = f26984d;
                int i10 = ((i9 + 115) - (115 | i9)) + (i9 | 115);
                f26985e = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 2 % 2;
                }
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26982a[CustomerAuthenticationFailureReason.InternalError.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26982a[CustomerAuthenticationFailureReason.Timeout.ordinal()] = 3;
                int i12 = f26985e + 17;
                f26984d = i12 % 128;
                int i13 = i12 % 2;
                int i14 = 2 % 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26982a[CustomerAuthenticationFailureReason.Locked.ordinal()] = 4;
                int i15 = f26984d;
                int i16 = (((-1) - (((-1) - i15) & ((-1) - 27))) << 1) - (i15 ^ 27);
                f26985e = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 2 % 2;
                }
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26982a[CustomerAuthenticationFailureReason.Unsupported.ordinal()] = 5;
                int i18 = f26985e + 83;
                f26984d = i18 % 128;
                if (i18 % 2 == 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX INFO: renamed from: o.x.j$5 */
    final class AnonymousClass5 implements CustomerAuthenticationPromptCallback {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        private static int f26986b = 0;

        /* JADX INFO: renamed from: c */
        private static long f26987c = 0;

        /* JADX INFO: renamed from: g */
        private static int f26988g = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ List f26989a;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ List f26991e;

        private static String $$c(byte b2, byte b3, int i2) {
            byte[] bArr = $$a;
            int i3 = 114 - (b3 * 7);
            int i4 = i2 * 3;
            int i5 = (b2 * 2) + 4;
            byte[] bArr2 = new byte[i4 + 1];
            int i6 = -1;
            if (bArr == null) {
                i3 += i4;
                i5++;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i3;
                if (i6 == i4) {
                    return new String(bArr2, 0);
                }
                i3 += bArr[i5];
                i5++;
            }
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f26986b = 0;
            f26988g = 1;
            f26987c = -1701659488743050955L;
        }

        AnonymousClass5(List list, List list2) {
            list = list;
            list = list2;
        }

        private static void f(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $10;
            int i5 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            Object obj = null;
            if (str2 != null) {
                int i7 = i4 + 91;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    str2.toCharArray();
                    obj.hashCode();
                    throw null;
                }
                charArray = str2.toCharArray();
            } else {
                charArray = str2;
            }
            k kVar = new k();
            char[] cArrC = k.c(f26987c ^ (-5882309809461882246L), (char[]) charArray, i2);
            kVar.f19939c = 4;
            while (kVar.f19939c < cArrC.length) {
                int i8 = $11 + 79;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                kVar.f19938a = kVar.f19939c - 4;
                int i10 = kVar.f19939c;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f26987c)};
                    Object objA = o.d.d.a(-1093976004);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a((Process.myPid() >> 22) + 229, (char) (51005 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 10, 1749983833, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrC[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {kVar, kVar};
                    Object objA2 = o.d.d.a(-912105096);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a((-16776541) - Color.rgb(0, 0, 0), (char) ((Process.getThreadPriority(0) + 20) >> 6), 11 - TextUtils.indexOf((CharSequence) "", '0'), 522683165, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
            String str3 = new String(cArrC, 4, cArrC.length - 4);
            int i11 = $10 + 41;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            objArr[0] = str3;
        }

        static void init$0() {
            $$a = new byte[]{Utf8.REPLACEMENT_BYTE, -81, -107, -8};
            $$b = 237;
        }

        @Override // fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPromptCallback
        public final void onAuthenticationFailure(CustomerAuthenticationFailureReason customerAuthenticationFailureReason) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f26986b + 61;
            f26988g = i3 % 128;
            int i4 = i3 % 2;
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                f("냀ﬅ䌚ﱗ낉堤תᗟ㶎쯊邥謘\uaad9䚷≠\uf846\u1737끳괻涂葟⍗㣱\ue2f8犭鸋䮤倦ￍড়함앫氇蒗怬㪣\ud944\uf67a\uf316꿵䞿愋结ᴭ㓛\udcc3覀鉾ꄶ侇ᭋ\u07bd", (ViewConfiguration.getPressedStateDuration() >> 16) + 1, objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                f("掜\ue8da䵇琋揳䯻\u0b98鶓\ueed4\ud839黸͌禐啴ⰲ瀏쑜ꎰꍺ\ue5c4圪や㚠檺ꇅ跓䗨\ud83aⳝᩍ\udb6c䵾뽻靜湶닮ਓ\ue598ﵜ➴铁狄炉镪\ue7a1켓蟅ᨧ牫屘ᔁ迣ﴣꪫꡯﳗ俹⟭㾘憀\udab1됟닄흟╫Ŧ쀋䑚끦鿵", -TextUtils.indexOf((CharSequence) "", '0'), objArr2);
                o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(customerAuthenticationFailureReason).toString());
            }
            int i5 = AnonymousClass2.f26982a[customerAuthenticationFailureReason.ordinal()];
            if (i5 == 1) {
                j.this.onError(new o.by.c(AntelopErrorCode.UserCancelled));
                return;
            }
            if (i5 == 2) {
                j.this.onError(new o.by.c(AntelopErrorCode.InternalError));
                return;
            }
            if (i5 == 3) {
                j.this.onCustomerCredentialsRequired(list);
                return;
            }
            if (i5 != 4 && i5 != 5) {
                j.this.onError(new o.by.c(AntelopErrorCode.InternalError));
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (o.m.h hVar : list) {
                int i6 = f26986b + 91;
                f26988g = i6 % 128;
                int i7 = i6 % 2;
                if (!list.contains(hVar.d())) {
                    arrayList.add(hVar);
                }
            }
            if (!(!arrayList.isEmpty())) {
                j.this.onError(new o.by.c(AntelopErrorCode.CustomerAuthenticationImpossible));
                int i8 = f26986b + 33;
                f26988g = i8 % 128;
                int i9 = i8 % 2;
                return;
            }
            int i10 = f26988g + 109;
            f26986b = i10 % 128;
            if (i10 % 2 == 0) {
                j.this.onCustomerCredentialsRequired(arrayList);
            } else {
                j.this.onCustomerCredentialsRequired(arrayList);
                int i11 = 86 / 0;
            }
        }

        @Override // fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPromptCallback
        public final void onAuthenticationSuccess(CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f26986b + 59;
            f26988g = i3 % 128;
            int i4 = i3 % 2;
            try {
                j.this.f26981e.setCustomerCredentials(j.this.f26977a, customerAuthenticationCredentials);
                int i5 = f26988g + 7;
                f26986b = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 32 / 0;
                }
            } catch (WalletValidationException e2) {
                if (o.ea.f.a()) {
                    Object[] objArr = new Object[1];
                    f("냀ﬅ䌚ﱗ낉堤תᗟ㶎쯊邥謘\uaad9䚷≠\uf846\u1737끳괻涂葟⍗㣱\ue2f8犭鸋䮤倦ￍড়함앫氇蒗怬㪣\ud944\uf67a\uf316꿵䞿愋结ᴭ㓛\udcc3覀鉾ꄶ侇ᭋ\u07bd", -MotionEvent.axisFromString(""), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    f("̄\ue385懍랙ͫ䂤✐币蹋퍺뉸생ᤙ帰\u0098뎎ꓕ꣢迺♖㞀㯓ᨢꤨ셛蚬楢ᯱ䰙ᅛ\uf7b9躩\udfc4鱞䊦焨櫉\uee8a퇀\ue431\uf46c禭専団蜨쑍ꭖ\ud9b9ዢ圥㦍䱽鶰ꇿ蓍㽐⽡ⲿጋꈓ멤뼻", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr2);
                    o.ea.f.e(strIntern, ((String) objArr2[0]).intern(), e2);
                }
                j.this.onAuthenticationDeclined();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, byte r10, byte r11) {
        /*
            int r8 = 122 - r11
            int r7 = r9 + 4
            int r1 = r10 * 2
            int r0 = 1 - r1
            byte[] r6 = o.x.j.$$a
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r6 != 0) goto L29
            r2 = r4
            r0 = r7
        L13:
            int r7 = r7 + r8
            r1 = r2
            r8 = r7
            r7 = r0
        L17:
            byte r0 = (byte) r8
            r5[r1] = r0
            int r0 = r7 + 1
            int r2 = r1 + 1
            if (r1 != r3) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r7 = r6[r0]
            goto L13
        L29:
            r1 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.x.j.$$c(int, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26975m = 0;
        f26976o = 1;
        f26969f = 0;
        f26974k = 1;
        c();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        int i2 = f26975m + 17;
        f26976o = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public j(Context context, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback, CustomerAuthenticatedProcess customerAuthenticatedProcess, i<?> iVar) {
        this.f26977a = context;
        this.f26980d = defaultCustomerAuthenticatedProcessCallback;
        this.f26981e = customerAuthenticatedProcess;
        this.f26978b = iVar;
    }

    static void c() {
        f26973j = new int[]{-1721499909, 1218907833, -1424648020, -1534448344, -560039098, -420186773, -564487572, -2096837252, -442357315, 181130913, 1813785043, -1618434745, 2103597323, 1409333356, 1275320041, -1045875171, 1374866918, 53290351};
        f26971h = -6229731001769531382L;
        f26972i = 1564493270;
        f26970g = (char) 17878;
    }

    private CustomerAuthenticationPrompt e(o.m.i iVar, CustomerAuthenticationPromptBuilder customerAuthenticationPromptBuilder) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26974k + 49;
        f26969f = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            l(new int[]{978158778, -922212853, -1315436738, -1444105289, 379300330, -1576209786, -551508780, 1086094632, 394983358, 704092782, -1154027943, 1371861756, -613157578, -734496891, 1061800187, 839330277, -1615207348, -1229581616, 19621314, 244064243, -1091011896, -1170740421, 9300564, -256591315}, 49 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            l(new int[]{661278770, 1490819773, -1679536991, -381155986, -1660205589, -501993313, 1801063025, 2017339626, 1386946564, -632943119, 735312661, -339472378, 194120835, -936122595, 1500509457, 1561584302, -1919196849, -331010603}, 35 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        CustomerAuthenticationPrompt customerAuthenticationPromptBuildCustomerAuthenticationPrompt = this.f26980d.buildCustomerAuthenticationPrompt(iVar.d(), customerAuthenticationPromptBuilder);
        int i5 = f26969f + 81;
        f26974k = i5 % 128;
        if (i5 % 2 != 0) {
            return customerAuthenticationPromptBuildCustomerAuthenticationPrompt;
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{127, 52, 116, 98};
        $$b = 161;
    }

    private static void l(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f26973j;
        int i4 = 989264422;
        int i5 = -1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        int iArgb = Color.argb(i6, i6, i6, i6) + 675;
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(i6, i6);
                        int capsMode = TextUtils.getCapsMode("", i6, i6) + 12;
                        byte b2 = (byte) i5;
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a(iArgb, absoluteGravity, capsMode, -328001469, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i7++;
                    i4 = 989264422;
                    i5 = -1;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f26973j;
        long j2 = 0;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = $10 + 75;
            $11 = i8 % 128;
            int i9 = 2;
            int i10 = i8 % 2;
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $10 + 81;
                $11 = i12 % 128;
                if (i12 % i9 == 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i11])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objA2 = o.d.d.a((ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)) + 674, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.CR, -328001469, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i11])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        objA3 = o.d.d.a(675 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 12, -328001469, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    i11++;
                }
                j2 = 0;
                i9 = 2;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            int i13 = $11 + 77;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                int i17 = $11 + 19;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                lVar.f19942e ^= iArr4[i15];
                Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA4 = o.d.d.a(2098218801);
                if (objA4 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    objA4 = o.d.d.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 301, (char) (52697 - ((Process.getThreadPriority(0) + 20) >> 6)), KeyEvent.getDeadChar(0, 0) + 11, -1416256172, false, $$c(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i15++;
            }
            int i19 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i19;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i20 = lVar.f19942e;
            int i21 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr6 = {lVar, lVar};
            Object objA5 = o.d.d.a(986820978);
            if (objA5 == null) {
                byte b10 = (byte) (-1);
                byte b11 = (byte) (b10 + 1);
                objA5 = o.d.d.a(View.resolveSize(0, 0) + 229, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 51005), 8 - TextUtils.indexOf((CharSequence) "", '0', 0), -330018025, false, $$c(b10, b11, (byte) (b11 + 5)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void n(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        int i4 = $10 + 15;
        int i5 = i4 % 128;
        $11 = i5;
        Object obj = null;
        Object charArray = str6;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (str6 != null) {
            int i6 = i5 + 89;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object obj2 = str5;
        if (str5 != null) {
            char[] charArray2 = str5.toCharArray();
            int i8 = $11 + 89;
            $10 = i8 % 128;
            obj2 = charArray2;
            if (i8 % 2 != 0) {
                int i9 = 3 / 3;
                obj2 = charArray2;
            }
        }
        char[] cArr2 = (char[]) obj2;
        Object charArray3 = str4;
        if (str4 != null) {
            int i10 = $11 + 125;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            charArray3 = str4.toCharArray();
        }
        o.a.i iVar = new o.a.i();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        int i12 = 0;
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
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 106;
                    char cRed = (char) Color.red(i12);
                    int iRgb = Color.rgb(i12, i12, i12) + 16777227;
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    String str$$c = $$c(b2, b3, (byte) (57 | b3));
                    Class[] clsArr = new Class[1];
                    clsArr[i12] = Object.class;
                    objA = o.d.d.a(edgeSlop, cRed, iRgb, -155898465, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(i12, i12) + 847;
                    char cResolveSizeAndState = (char) (6488 - View.resolveSizeAndState(i12, i12, i12));
                    int iLastIndexOf = 11 - TextUtils.lastIndexOf("", '0');
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    String str$$c2 = $$c(b4, b5, (byte) ((b5 + 54) - (54 & b5)));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i12] = Object.class;
                    objA2 = o.d.d.a(absoluteGravity, cResolveSizeAndState, iLastIndexOf, -694521287, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                int i13 = cArr3[iVar.f19932b % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[1] = Integer.valueOf(i13);
                objArr4[i12] = iVar;
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    int iIndexOf = TextUtils.indexOf("", "") + 458;
                    char c3 = (char) (TypedValue.complexToFloat(i12) > 0.0f ? 1 : (TypedValue.complexToFloat(i12) == 0.0f ? 0 : -1));
                    int iMyTid = (Process.myTid() >> 22) + 11;
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    String str$$c3 = $$c(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 56))));
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i12] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objA3 = o.d.d.a(iIndexOf, c3, iMyTid, 1804962841, false, str$$c3, clsArr3);
                }
                ((Method) objA3).invoke(null, objArr4);
                int i14 = cArr3[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr4[iIntValue]);
                objArr5[i12] = Integer.valueOf(i14);
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    int iIndexOf2 = TextUtils.indexOf("", "") + 639;
                    char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 65100);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, i12) + 12;
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    String str$$c4 = $$c(b8, b9, b9);
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i12] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objA4 = o.d.d.a(iIndexOf2, scrollBarSize, absoluteGravity2, 1636969060, false, str$$c4, clsArr4);
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) ((((long) ((int) (((long) f26972i) ^ 740602047300126166L))) ^ (((long) (cArr3[iIntValue2] ^ r8[iVar.f19932b])) ^ (f26971h ^ 740602047300126166L))) ^ ((long) ((char) (((long) f26970g) ^ 740602047300126166L))));
                iVar.f19932b++;
                obj = null;
                i12 = 0;
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

    @Override // o.x.f
    public final void onAuthenticationDeclined() throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f26974k + 91;
            f26969f = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            l(new int[]{978158778, -922212853, -1315436738, -1444105289, 379300330, -1576209786, -551508780, 1086094632, 394983358, 704092782, -1154027943, 1371861756, -613157578, -734496891, 1061800187, 839330277, -1615207348, -1229581616, 19621314, 244064243, -1091011896, -1170740421, 9300564, -256591315}, 48 - TextUtils.indexOf("", "", 0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            n((char) (1322 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), "櫗鎳\u19dc瀦㩩ꕣ樛⾼钡ᱼ猤燜췆㳠陥摸繢㎎\uee67赯\ue148\ue631\ude61\u135c孱淡", "규䰉ꤊꏌ", "ꦉ흫⨏쬅", MotionEvent.axisFromString("") + 1, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f26969f + 109;
            f26974k = i5 % 128;
            int i6 = i5 % 2;
        }
        this.f26980d.onAuthenticationDeclined(this.f26981e);
        int i7 = f26974k + 85;
        f26969f = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.x.f
    public final void onCustomerCredentialsInvalid(o.j.b bVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26974k + 115;
        f26969f = i3 % 128;
        int i4 = i3 % 2;
        this.f26979c = null;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            l(new int[]{978158778, -922212853, -1315436738, -1444105289, 379300330, -1576209786, -551508780, 1086094632, 394983358, 704092782, -1154027943, 1371861756, -613157578, -734496891, 1061800187, 839330277, -1615207348, -1229581616, 19621314, 244064243, -1091011896, -1170740421, 9300564, -256591315}, 48 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            l(new int[]{1345208648, 1764201030, 466525278, -1555150848, -824765017, 52184541, 479423382, 1242813496, 671758647, -327152350, -1813834774, 994742299, 130216495, -2064720339, -666604994, 1538130301, -705048749, 1681175642, -2103331441, 680682676, -991430786, -794769840}, 41 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
            o.ea.f.d(strIntern, sb.append(((String) objArr2[0]).intern()).append(bVar).toString());
            int i5 = f26969f + 101;
            f26974k = i5 % 128;
            int i6 = i5 % 2;
        }
        onError(new o.by.c(AntelopErrorCode.InternalError));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c8  */
    @Override // o.x.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCustomerCredentialsRequired(java.util.List<o.m.h> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1116
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.x.j.onCustomerCredentialsRequired(java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x001b  */
    @Override // o.x.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onError(o.by.c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.x.j.onError(o.by.c):void");
    }

    @Override // o.x.f
    public final void onProcessStart() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26969f + 31;
        f26974k = i3 % 128;
        if (i3 % 2 == 0) {
            this.f26979c = null;
            o.ea.f.a();
            throw null;
        }
        this.f26979c = null;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            l(new int[]{978158778, -922212853, -1315436738, -1444105289, 379300330, -1576209786, -551508780, 1086094632, 394983358, 704092782, -1154027943, 1371861756, -613157578, -734496891, 1061800187, 839330277, -1615207348, -1229581616, 19621314, 244064243, -1091011896, -1170740421, 9300564, -256591315}, KeyEvent.normalizeMetaState(0) + 48, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            l(new int[]{280752629, -462270085, 1480530192, -785604850, -1123690311, -1905809170, 439448631, 978746087}, 17 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i4 = f26974k + 9;
            f26969f = i4 % 128;
            int i5 = i4 % 2;
        }
        this.f26980d.onProcessStart(this.f26981e);
    }

    @Override // o.x.f
    public final void onProcessSuccess() throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f26974k + 19;
            f26969f = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                l(new int[]{978158778, -922212853, -1315436738, -1444105289, 379300330, -1576209786, -551508780, 1086094632, 394983358, 704092782, -1154027943, 1371861756, -613157578, -734496891, 1061800187, 839330277, -1615207348, -1229581616, 19621314, 244064243, -1091011896, -1170740421, 9300564, -256591315}, 38 << View.resolveSize(1, 0), objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                l(new int[]{280752629, -462270085, 1480530192, -785604850, 1105695581, 1766733141, 19621314, 244064243, -279162175, 900517417}, (ViewConfiguration.getTapTimeout() >>> 97) + 60, objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                l(new int[]{978158778, -922212853, -1315436738, -1444105289, 379300330, -1576209786, -551508780, 1086094632, 394983358, 704092782, -1154027943, 1371861756, -613157578, -734496891, 1061800187, 839330277, -1615207348, -1229581616, 19621314, 244064243, -1091011896, -1170740421, 9300564, -256591315}, View.resolveSize(0, 0) + 48, objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                l(new int[]{280752629, -462270085, 1480530192, -785604850, 1105695581, 1766733141, 19621314, 244064243, -279162175, 900517417}, (ViewConfiguration.getTapTimeout() >> 16) + 18, objArr4);
                obj = objArr4[0];
            }
            o.ea.f.c(strIntern, ((String) obj).intern());
        }
        this.f26980d.onProcessSuccess(this.f26981e);
        int i4 = f26974k + 49;
        f26969f = i4 % 128;
        int i5 = i4 % 2;
    }
}
