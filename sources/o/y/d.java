package o.y;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
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
import fr.antelop.sdk.util.Address;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.io.encoding.Base64;
import o.ap.b;
import o.ap.f;
import o.ep.i;
import o.es.c;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d<TRres, TRreq, TR extends o.ap.b<TRreq, TRres>, T extends o.es.c<TRres>> extends c {
    private static final byte[] $$l = null;
    private static final int $$m = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f27089k = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f27090n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f27091o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f27092p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static long f27093q = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f27094s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f27095t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static char f27096u = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f27097w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static int f27098x = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final boolean f27099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    o.ea.h f27100m;

    private static String $$n(byte b2, int i2, short s2) {
        int i3 = i2 + 65;
        int i4 = b2 * 2;
        int i5 = 3 - (s2 * 3);
        byte[] bArr = $$l;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i3 = (-i3) + i6;
        }
        while (true) {
            i7++;
            i5++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i3 = (-bArr[i5]) + i3;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f27092p = 1260083571;
        f27094s = 1186570978;
        f27089k = -610628197;
        f27090n = -821480357;
        f27091o = 1165465166;
        f27097w = 0;
        f27098x = 1;
        f27093q = 740602047300126166L;
        f27095t = 871604212;
        f27096u = (char) 17878;
    }

    public d(String str, o.ep.d dVar, boolean z2) {
        super(str, dVar);
        this.f27100m = null;
        this.f27099l = z2;
    }

    private static void O(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        Object charArray = str6;
        if (str6 != null) {
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object obj = null;
        Object charArray2 = str5;
        if (str5 != null) {
            int i4 = $10 + 117;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                str5.toCharArray();
                obj.hashCode();
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
        int i5 = 0;
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
                    int defaultSize = View.getDefaultSize(i5, i5) + 106;
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11;
                    byte b2 = (byte) i5;
                    byte b3 = b2;
                    String str$$n = $$n(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objA = o.d.d.a(defaultSize, packedPositionType, keyRepeatDelay, -155898465, false, str$$n, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    int iArgb = 847 - Color.argb(i5, i5, i5, i5);
                    char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 6488);
                    int threadPriority = ((Process.getThreadPriority(i5) + 20) >> 6) + 12;
                    byte b4 = (byte) i5;
                    byte b5 = (byte) (b4 + 3);
                    String str$$n2 = $$n(b4, b5, (byte) (b5 - 3));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i5] = Object.class;
                    objA2 = o.d.d.a(iArgb, edgeSlop, threadPriority, -694521287, false, str$$n2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                int i6 = cArr3[iVar.f19932b % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[1] = Integer.valueOf(i6);
                objArr4[i5] = iVar;
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b6 = (byte) i5;
                    byte b7 = (byte) (b6 + 1);
                    objA3 = o.d.d.a(TextUtils.lastIndexOf("", '0') + 459, (char) (KeyEvent.getMaxKeyCode() >> 16), 11 - (KeyEvent.getMaxKeyCode() >> 16), 1804962841, false, $$n(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    objA4 = o.d.d.a(View.MeasureSpec.getMode(0) + 639, (char) (65100 - Drawable.resolveOpacity(0, 0)), 11 - MotionEvent.axisFromString(""), 1636969060, false, $$n(b8, (byte) ((-1) - (((-1) - b8) & ((-1) - 57))), b8), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                obj = null;
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f27093q ^ 740602047300126166L)) ^ ((long) ((int) (((long) f27095t) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f27096u) ^ 740602047300126166L))));
                iVar.f19932b++;
                int i7 = $11 + 111;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                i5 = 0;
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

    static /* synthetic */ o.x.f a(d dVar) {
        int i2 = 2 % 2;
        int i3 = f27098x + 93;
        f27097w = i3 % 128;
        if (i3 % 2 != 0) {
            dVar.i();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        o.x.f fVarI = dVar.i();
        int i4 = f27098x + 5;
        f27097w = i4 % 128;
        int i5 = i4 % 2;
        return fVarI;
    }

    static /* synthetic */ o.x.f b(d dVar) {
        int i2 = 2 % 2;
        int i3 = f27098x + 77;
        f27097w = i3 % 128;
        if (i3 % 2 == 0) {
            return dVar.i();
        }
        dVar.i();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c6, code lost:
    
        if (r5.getLine1() == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c8, code lost:
    
        r9 = o.y.d.f27098x + 101;
        o.y.d.f27097w = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d9, code lost:
    
        if (r5.getLine1().length() > 64) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00df, code lost:
    
        if (r5.getLine2() == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e9, code lost:
    
        if (r5.getLine2().length() > 64) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f1, code lost:
    
        if (r5.getLocality() == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00fd, code lost:
    
        if (r5.getLocality().length() > 32) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0105, code lost:
    
        if (r5.getAdministrativeArea() == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0110, code lost:
    
        if (r5.getAdministrativeArea().length() > 3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0116, code lost:
    
        if (r5.getCountryCode() == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0118, code lost:
    
        r9 = o.y.d.f27098x + 115;
        o.y.d.f27097w = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0129, code lost:
    
        if (r5.getCountryCode().length() > 2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012f, code lost:
    
        if (r5.getPostalCode() == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0131, code lost:
    
        r9 = o.y.d.f27098x + 41;
        o.y.d.f27097w = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013a, code lost:
    
        if ((r9 % 2) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0146, code lost:
    
        if (r5.getPostalCode().length() > 40) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0148, code lost:
    
        r6.f27100m = new o.ea.h(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x015a, code lost:
    
        if (r5.getPostalCode().length() > 16) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x017c, code lost:
    
        if (r5 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0180, code lost:
    
        r5 = fr.antelop.sdk.exception.WalletValidationErrorCode.InvalidFormat;
        r12 = new java.lang.Object[1];
        O((char) (37176 - android.text.TextUtils.lastIndexOf("", '0', 0, 0)), "᧢᳠棠몿\ue873踘ﱱ纩㯶暩鷦딂ၯ偄͏흗岣띖魾ౢ㢨ﷀ釂雏Ặ躳ላ䪗报ﻞ漾着\uef8bẔ濗媑䩪꼨\udfdb\u2001執", "\u0000\u0000\u0000\u0000", "⏙潚㦫鶑", (-1418765789) - android.view.KeyEvent.getDeadChar(0, 0), r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ab, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r5, r2, ((java.lang.String) r12[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ac, code lost:
    
        r4 = fr.antelop.sdk.exception.WalletValidationErrorCode.InvalidFormat;
        r11 = new java.lang.Object[1];
        O((char) (android.text.TextUtils.indexOf("", "") + 58320), "ᛀ辢楈혡遻館馊寊‿剗啂溝ꬖ輲ീ蚈親秐拶\uf459冼벙덧ឪ斿ꨜ㢡䲎\uf782婹홇纽\ud86f頳苑옽\udf98跤\uf094傈쎵", "\u0000\u0000\u0000\u0000", "༥⼞퀹\ue4e3", 959389200 + android.text.TextUtils.lastIndexOf("", '0', 0, 0), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01d7, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r4, r2, ((java.lang.String) r11[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d8, code lost:
    
        r4 = fr.antelop.sdk.exception.WalletValidationErrorCode.InvalidFormat;
        r11 = new java.lang.Object[1];
        O((char) ((-1) - android.text.TextUtils.lastIndexOf("", '0')), "ᵩ䬙锲砓稈崎뉚爄\uee5b\uea53\ue001笳\uddb5表蒭씾㒆籀쒭\ud9d4꦳⓽\uf85e秳饨佑胒찅ꒋ䇧剌栗뱚\uaac6諧", "\u0000\u0000\u0000\u0000", "\ued1a侟犐\ued95", (-1873829907) - android.graphics.Color.red(0), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0202, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r4, r2, ((java.lang.String) r11[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0203, code lost:
    
        r4 = fr.antelop.sdk.exception.WalletValidationErrorCode.InvalidFormat;
        r11 = new java.lang.Object[1];
        O((char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), "\udd0a뉘灤䠈欥삖늋䦇숁캽⏃夤搟醾瑼畿죸篊ᾈ\ue35d솾透鱇♿邳\udbd6㪅羕\uf4b2\ue126◤뇶㥣\uf2ff鋆", "\u0000\u0000\u0000\u0000", "\u000e\uf70aꈎ妇", (android.os.Process.myTid() >> 22) + 251070976, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x022d, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r4, r2, ((java.lang.String) r11[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x022e, code lost:
    
        r5 = fr.antelop.sdk.exception.WalletValidationErrorCode.InvalidFormat;
        r12 = new java.lang.Object[1];
        O((char) android.widget.ExpandableListView.getPackedPositionGroup(0), "细\ue10c垦穇嫞㭋\uf737蒬驔⼚侠桉\ue757漢咘㓠娡\ud8e8\u05cc⯽긜틤鸍떳᎗䭠㬶䎕絯ᆒ쾧呩⣊繲㊒ﲎ", "\u0000\u0000\u0000\u0000", "姄\ue12f\uee85豊", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0253, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r5, r2, ((java.lang.String) r12[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0254, code lost:
    
        r4 = fr.antelop.sdk.exception.WalletValidationErrorCode.InvalidFormat;
        r13 = new java.lang.Object[1];
        O((char) android.text.TextUtils.getCapsMode("", 0, 0), "悇ᅷ䓁䩬\uf4f8\ueedc\udf45曩핎䞏䓌쇔Ɔ蛓ⷢۿﰝ툆⥯䣐覕嗾\uf635鹡媧읭䵇爤ꞷ冉儕娊໒Ϩⵊ\uf3b2", "\u0000\u0000\u0000\u0000", "ꛤ屿\uf6b8察", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) - 1, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x027b, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r4, r2, ((java.lang.String) r13[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0283, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(fr.antelop.sdk.exception.WalletValidationErrorCode.Mandatory, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00ba, code lost:
    
        if (r5 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object c(int r7, java.lang.Object[] r8, int r9, int r10, int r11, int r12, int r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.d.c(int, java.lang.Object[], int, int, int, int, int):java.lang.Object");
    }

    static /* synthetic */ o.x.f c(d dVar) {
        int i2 = 2 % 2;
        int i3 = f27097w + 17;
        f27098x = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            dVar.i();
            obj.hashCode();
            throw null;
        }
        o.x.f fVarI = dVar.i();
        int i4 = f27097w + 17;
        f27098x = i4 % 128;
        if (i4 % 2 != 0) {
            return fVarI;
        }
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ o.x.f d(d dVar) {
        int i2 = 2 % 2;
        int i3 = f27097w + 117;
        f27098x = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = dVar.i();
        int i5 = f27097w + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f27098x = i5 % 128;
        if (i5 % 2 != 0) {
            return fVarI;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = f27098x + 105;
        f27097w = i3 % 128;
        if (i3 % 2 != 0) {
            dVar.i();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        o.x.f fVarI = dVar.i();
        int i4 = f27097w + 111;
        f27098x = i4 % 128;
        int i5 = i4 % 2;
        return fVarI;
    }

    static /* synthetic */ o.x.f e(d dVar) {
        int i2 = 2 % 2;
        int i3 = f27097w + 19;
        f27098x = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = dVar.i();
        if (i4 == 0) {
            int i5 = 71 / 0;
        }
        int i6 = f27098x + 27;
        f27097w = i6 % 128;
        if (i6 % 2 == 0) {
            return fVarI;
        }
        throw null;
    }

    static /* synthetic */ void f(d dVar) {
        int i2 = 2 % 2;
        int i3 = f27097w + 103;
        f27098x = i3 % 128;
        int i4 = i3 % 2;
        dVar.e();
        int i5 = f27098x + 81;
        f27097w = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ o.x.f g(d dVar) {
        int i2 = 2 % 2;
        int i3 = f27097w + 85;
        f27098x = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = dVar.i();
        int i5 = f27098x + 95;
        f27097w = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
        return fVarI;
    }

    static /* synthetic */ o.x.f h(d dVar) {
        Object[] objArr = {dVar};
        int i2 = f27091o * (-750334151);
        f27091o = i2;
        int i3 = f27090n * 1573979659;
        f27090n = i3;
        int i4 = f27089k * (-832898566);
        f27089k = i4;
        int i5 = f27094s * (-1088257765);
        f27094s = i5;
        return (o.x.f) c(441239940, objArr, i3, i4, i5, -441239940, i2);
    }

    static /* synthetic */ o.x.f i(d dVar) {
        int i2 = 2 % 2;
        int i3 = f27098x + 83;
        f27097w = i3 % 128;
        if (i3 % 2 != 0) {
            dVar.i();
            throw null;
        }
        o.x.f fVarI = dVar.i();
        int i4 = f27097w + 75;
        f27098x = i4 % 128;
        int i5 = i4 % 2;
        return fVarI;
    }

    static void init$0() {
        $$l = new byte[]{117, -127, -11, 113};
        $$m = 30;
    }

    static /* synthetic */ o.x.f j(d dVar) {
        int i2 = 2 % 2;
        int i3 = f27097w + 83;
        f27098x = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = dVar.i();
        int i5 = f27097w + 107;
        f27098x = i5 % 128;
        if (i5 % 2 != 0) {
            return fVarI;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    abstract T a(Context context);

    abstract TR b(T t2, o.ea.h hVar);

    public final void b(Address address) throws Throwable {
        int iMyPid = Process.myPid();
        int iMyPid2 = Process.myPid();
        int id = (int) Thread.currentThread().getId();
        int i2 = f27092p * 1897016743;
        f27092p = i2;
        c(-1198808467, new Object[]{this, address}, iMyPid2, id, i2, 1198808468, iMyPid);
    }

    @Override // o.x.i
    public final void c(Context context, final o.en.b bVar, o.i.d dVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f27098x + 109;
        f27097w = i3 % 128;
        if (i3 % 2 != 0) {
            l();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        final Activity activityL = l();
        if (activityL != null) {
            a(activityL).d(new c.a<c.e>() { // from class: o.y.d.2
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static final byte[] $$c = null;
                private static final int $$d = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f27101a = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f27102c = 0;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private static short[] f27103f = null;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private static long f27104g = 0;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static int f27105h = 0;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static byte[] f27106i = null;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static int f27107j = 0;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public static int f27108k = 0;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private static int f27109m = 0;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static java.lang.String $$e(short r8, int r9, int r10) {
                    /*
                        int r8 = 114 - r8
                        int r0 = r10 * 3
                        int r7 = r0 + 4
                        byte[] r6 = o.y.d.AnonymousClass2.$$c
                        int r5 = r9 * 3
                        int r0 = r5 + 1
                        byte[] r4 = new byte[r0]
                        r3 = 0
                        if (r6 != 0) goto L2a
                        r8 = r5
                        r1 = r7
                        r2 = r3
                    L14:
                        int r8 = r8 + r7
                        int r7 = r1 + 1
                        r1 = r2
                    L18:
                        byte r0 = (byte) r8
                        r4[r1] = r0
                        int r2 = r1 + 1
                        if (r1 != r5) goto L25
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r4, r3)
                        return r0
                    L25:
                        r0 = r6[r7]
                        r1 = r7
                        r7 = r0
                        goto L14
                    L2a:
                        r1 = r3
                        goto L18
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.y.d.AnonymousClass2.$$e(short, int, int):java.lang.String");
                }

                static {
                    init$1();
                    $10 = 0;
                    $11 = 1;
                    init$0();
                    f27108k = 488608428;
                    f27107j = 0;
                    f27109m = 1;
                    f27102c = -690541243;
                    f27101a = 1150422462;
                    f27105h = -23907137;
                    f27106i = new byte[]{117, -97, Utf8.REPLACEMENT_BYTE, -120, -98, -118, 116, -113, -86, 106, 115, -123, 44, 38, 58, 60, 59, 36, 121, Ascii.GS, 50, 54, -28, 16, 54, 46, 50, Base64.padSymbol, 98, MessagePack.Code.FIXEXT8, 62, 34, 113, MessagePack.Code.FIXEXT4, 53, 122, MessagePack.Code.FIXEXT8, 48, 42, 35, 52, Ascii.NAK, -120, 117, 106, -98, -118, -77, 110, -104, -128, -88, -118, -124, -105, -105, MessagePack.Code.STR16, -120, -110, 67, -100, -114, -82, -99, -114, -84, -66, 105, -104, -128, -88, -118, -124, -105, -73, 106, -126, -87, -116, 125, 113, 99, 120, -107, 86, 127, 87, 92, 70, -85, 74, Ascii.NAK, 65, 85, 67, 94, 65, 91, -88, Ascii.FF, 91, -81, 2, 95, 51, 105, 93, 83, 70, 69, 83, 67, 85, -111, -14, 85, 89, -84, -14, 111, 65, 94, 83, 80, -121, 75, 109, 2, 95, 73, 105, 92, 73, 111, 121, 40, 91, 67, 107, 69, 71, 86, 118, 37, 93, 104, 79, -108, -73, -87, MessagePack.Code.BIN16, MessagePack.Code.BIN32, 110, -81, -84, -87, -72, MessagePack.Code.FIXARRAY_PREFIX, MessagePack.Code.STR8, -90, -101, -65, -77, 98, -81, -84, -87, -72, MessagePack.Code.FIXARRAY_PREFIX, MessagePack.Code.STR8, -90, -104, MessagePack.Code.EXT8, -115, -88, -78, -84, -25, MessagePack.Code.FIXEXT4, -18, MessagePack.Code.ARRAY32, -25, -4, MessagePack.Code.EXT16, MessagePack.Code.FIXEXT4, -18, MessagePack.Code.MAP16, -24, MessagePack.Code.INT32, -29, -14, -109, MessagePack.Code.FIXEXT8, Ascii.DC2, -102, -18, -21, MessagePack.Code.TRUE, -18, MessagePack.Code.INT16, -28, Ascii.US, -86, MessagePack.Code.FIXEXT2, MessagePack.Code.STR16, MessagePack.Code.FIXEXT8, -26, MessagePack.Code.MAP16, -25, 65, 69, 77, 91, 74, 109, 43, 59, 85, 78, 50, 69, 79, 55, 74, 95, 106, 87, -14, 74, 95, 74, 119, -9, 71, 93, 49, 79, 90, 78, 58, -121, Ascii.US, Base64.padSymbol, 87, 49, -100, -119, -111, 113, -99, -103, -71, 105, -109, -128, 89, 83, 111, 121, 89, 101, 82, 122, -117, 47, 83, -82, Ascii.SYN, 106, 103, 95, 106, 109, 96, -101, 38, 81, 86, 83, 98, 90, 99, -118, 83, 98, -83, 70, 109, 103, -85, 79, 103, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115};
                    f27104g = -6638449772739441408L;
                }

                public static void b(Context context2, long j2, long j3) throws Throwable {
                    Class[] clsArr;
                    int i4 = 2;
                    int i5 = 2 % 2;
                    long j4 = j2 ^ (j3 << 32);
                    int i6 = f27109m;
                    int i7 = i6 + 73;
                    f27107j = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = i6 + 79;
                    f27107j = i9 % 128;
                    try {
                        if (i9 % 2 != 0) {
                            Method method = o.ea.f.class.getMethod("a", null);
                            method.setAccessible(true);
                            if (((Boolean) method.invoke(null, null)).booleanValue()) {
                                Object[] objArr = new Object[1];
                                n("\u0bd6ஓ靳졤炠⡉癟측䩥\uf292ꩯ\uf042챜㙋璑Ⱀ爍丵\uf6e4긂ﰘ", Process.getGidForName("") + 1, objArr);
                                String strIntern = ((String) objArr[0]).intern();
                                Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
                                declaredConstructor.setAccessible(true);
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                Object[] objArr2 = new Object[1];
                                l((short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 17), 1840963426 - MotionEvent.axisFromString(""), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1174325056, MotionEvent.axisFromString("") - 13, (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
                                Object[] objArr3 = {((String) objArr2[0]).intern()};
                                Object[] objArr4 = new Object[1];
                                n("躬軍蕝\uda57\ue213壟\uf32a岗塛䛔", Process.myPid() >> 22, objArr4);
                                Method method2 = StringBuilder.class.getMethod(((String) objArr4[0]).intern(), String.class);
                                method2.setAccessible(true);
                                Object objInvoke = method2.invoke(objNewInstance, objArr3);
                                Object[] objArr5 = {Long.valueOf(j4)};
                                Object[] objArr6 = new Object[1];
                                n("躬軍蕝\uda57\ue213壟\uf32a岗塛䛔", Drawable.resolveOpacity(0, 0), objArr6);
                                Method method3 = StringBuilder.class.getMethod(((String) objArr6[0]).intern(), Long.TYPE);
                                method3.setAccessible(true);
                                Object objInvoke2 = method3.invoke(objInvoke, objArr5);
                                Object[] objArr7 = new Object[1];
                                l((short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 9), 1840963463 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1174325058 - ExpandableListView.getPackedPositionType(0L), (-43) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), objArr7);
                                Method method4 = StringBuilder.class.getMethod(((String) objArr7[0]).intern(), null);
                                method4.setAccessible(true);
                                Object[] objArr8 = {strIntern, method4.invoke(objInvoke2, null)};
                                Method method5 = o.ea.f.class.getMethod("c", String.class, Object.class);
                                method5.setAccessible(true);
                                method5.invoke(null, objArr8);
                                i4 = 2;
                            }
                        } else {
                            Method method6 = o.ea.f.class.getMethod("a", null);
                            method6.setAccessible(true);
                            if (((Boolean) method6.invoke(null, null)).booleanValue()) {
                                Object[] objArr9 = new Object[1];
                                n("\u0bd6ஓ靳졤炠⡉癟측䩥\uf292ꩯ\uf042챜㙋璑Ⱀ爍丵\uf6e4긂ﰘ", Process.getGidForName("") + 1, objArr9);
                                String strIntern2 = ((String) objArr9[0]).intern();
                                Constructor declaredConstructor2 = StringBuilder.class.getDeclaredConstructor(null);
                                declaredConstructor2.setAccessible(true);
                                Object objNewInstance2 = declaredConstructor2.newInstance(null);
                                Object[] objArr22 = new Object[1];
                                l((short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 17), 1840963426 - MotionEvent.axisFromString(""), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1174325056, MotionEvent.axisFromString("") - 13, (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr22);
                                Object[] objArr32 = {((String) objArr22[0]).intern()};
                                Object[] objArr42 = new Object[1];
                                n("躬軍蕝\uda57\ue213壟\uf32a岗塛䛔", Process.myPid() >> 22, objArr42);
                                Method method22 = StringBuilder.class.getMethod(((String) objArr42[0]).intern(), String.class);
                                method22.setAccessible(true);
                                Object objInvoke3 = method22.invoke(objNewInstance2, objArr32);
                                Object[] objArr52 = {Long.valueOf(j4)};
                                Object[] objArr62 = new Object[1];
                                n("躬軍蕝\uda57\ue213壟\uf32a岗塛䛔", Drawable.resolveOpacity(0, 0), objArr62);
                                Method method32 = StringBuilder.class.getMethod(((String) objArr62[0]).intern(), Long.TYPE);
                                method32.setAccessible(true);
                                Object objInvoke22 = method32.invoke(objInvoke3, objArr52);
                                Object[] objArr72 = new Object[1];
                                l((short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 9), 1840963463 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1174325058 - ExpandableListView.getPackedPositionType(0L), (-43) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), objArr72);
                                Method method42 = StringBuilder.class.getMethod(((String) objArr72[0]).intern(), null);
                                method42.setAccessible(true);
                                Object[] objArr82 = {strIntern2, method42.invoke(objInvoke22, null)};
                                Method method52 = o.ea.f.class.getMethod("c", String.class, Object.class);
                                method52.setAccessible(true);
                                method52.invoke(null, objArr82);
                                i4 = 2;
                            }
                        }
                        byte b2 = (byte) i4;
                        byte b3 = (byte) (b2 - 2);
                        byte b4 = b3;
                        Object[] objArr10 = new Object[1];
                        o(b2, b3, b4, objArr10);
                        Class<?> cls = Class.forName((String) objArr10[0]);
                        byte[] bArr = $$a;
                        byte length = (byte) bArr.length;
                        byte b5 = (byte) ((length + 7) - (7 | length));
                        Object[] objArr11 = new Object[1];
                        o(length, b5, b5, objArr11);
                        Method method7 = cls.getMethod((String) objArr11[0], null);
                        method7.setAccessible(true);
                        Object objInvoke4 = method7.invoke(null, null);
                        int i10 = (int) j4;
                        Object[] objArr12 = new Object[1];
                        o(b2, b3, b4, objArr12);
                        Class.forName((String) objArr12[0]).getField("c").setInt(objInvoke4, i10);
                        Object[] objArr13 = new Object[1];
                        o(b2, b3, b4, objArr13);
                        Class<?> cls2 = Class.forName((String) objArr13[0]);
                        byte length2 = (byte) bArr.length;
                        byte b6 = (byte) ((-1) - (((-1) - length2) | ((-1) - 7)));
                        Object[] objArr14 = new Object[1];
                        o(length2, b6, b6, objArr14);
                        Method method8 = cls2.getMethod((String) objArr14[0], null);
                        method8.setAccessible(true);
                        Object objInvoke5 = method8.invoke(null, null);
                        Object[] objArr15 = new Object[1];
                        o(b2, b3, b4, objArr15);
                        if (Class.forName((String) objArr15[0]).getField("d").getBoolean(objInvoke5)) {
                            return;
                        }
                        Object objInvoke6 = context2;
                        if (context2 == null) {
                            byte b7 = (byte) 1;
                            byte b8 = b7;
                            Object[] objArr16 = new Object[1];
                            o((byte) 8, b7, b8, objArr16);
                            Method method9 = o.en.b.class.getMethod((String) objArr16[0], null);
                            method9.setAccessible(true);
                            Object objInvoke7 = method9.invoke(null, null);
                            Object[] objArr17 = new Object[1];
                            o(b7, b8, b8, objArr17);
                            Method method10 = o.en.b.class.getMethod((String) objArr17[0], null);
                            method10.setAccessible(true);
                            objInvoke6 = method10.invoke(objInvoke7, null);
                        }
                        if (objInvoke6 != null) {
                            byte b9 = (byte) 1;
                            Object[] objArr18 = new Object[1];
                            o((byte) 8, b9, b9, objArr18);
                            Method method11 = o.en.b.class.getMethod((String) objArr18[0], null);
                            method11.setAccessible(true);
                            Object objInvoke8 = method11.invoke(null, null);
                            byte length3 = (byte) bArr.length;
                            byte b10 = (byte) (7 & length3);
                            Object[] objArr19 = new Object[1];
                            o(length3, b10, b10, objArr19);
                            Method method12 = o.en.b.class.getMethod((String) objArr19[0], null);
                            method12.setAccessible(true);
                            if (((Boolean) method12.invoke(objInvoke8, null)).booleanValue()) {
                                int i11 = f27109m + 113;
                                f27107j = i11 % 128;
                                if (i11 % 2 == 0) {
                                    byte b11 = (byte) 0;
                                    byte b12 = (byte) (b11 + 1);
                                    Object[] objArr20 = new Object[1];
                                    o(b11, b12, b12, objArr20);
                                    String str = (String) objArr20[0];
                                    clsArr = null;
                                    Method method13 = o.en.b.class.getMethod(str, null);
                                    method13.setAccessible(true);
                                    if (!((Boolean) method13.invoke(objInvoke8, null)).booleanValue()) {
                                    }
                                    Method method14 = o.dc.d.class.getMethod("a", clsArr);
                                    method14.setAccessible(true);
                                    Object objInvoke9 = method14.invoke(clsArr, clsArr);
                                    Object[] objArr21 = {o.az.a.class.getField("b").get(clsArr), o.dd.g.class.getField("z").get(clsArr)};
                                    Constructor declaredConstructor3 = o.dd.e.class.getDeclaredConstructor(o.az.a.class, o.dd.g.class);
                                    declaredConstructor3.setAccessible(true);
                                    Object[] objArr23 = {objInvoke6, declaredConstructor3.newInstance(objArr21), true};
                                    Method method15 = o.dc.d.class.getMethod("b", Context.class, o.dd.e.class, Boolean.TYPE);
                                    method15.setAccessible(true);
                                    method15.invoke(objInvoke9, objArr23);
                                    Object[] objArr24 = new Object[1];
                                    o(b2, b3, b4, objArr24);
                                    Class<?> cls3 = Class.forName((String) objArr24[0]);
                                    byte length4 = (byte) bArr.length;
                                    byte b13 = (byte) ((-1) - (((-1) - length4) | ((-1) - 7)));
                                    Object[] objArr25 = new Object[1];
                                    o(length4, b13, b13, objArr25);
                                    Method method16 = cls3.getMethod((String) objArr25[0], null);
                                    method16.setAccessible(true);
                                    Object objInvoke10 = method16.invoke(null, null);
                                    Object[] objArr26 = new Object[1];
                                    o(b2, b3, b4, objArr26);
                                    Class.forName((String) objArr26[0]).getField("d").setBoolean(objInvoke10, true);
                                    return;
                                }
                                byte b14 = (byte) 0;
                                byte b15 = (byte) (b14 + 1);
                                Object[] objArr27 = new Object[1];
                                o(b14, b15, b15, objArr27);
                                Method method17 = o.en.b.class.getMethod((String) objArr27[0], null);
                                method17.setAccessible(true);
                                if (((Boolean) method17.invoke(objInvoke8, null)).booleanValue()) {
                                    clsArr = null;
                                    Method method142 = o.dc.d.class.getMethod("a", clsArr);
                                    method142.setAccessible(true);
                                    Object objInvoke92 = method142.invoke(clsArr, clsArr);
                                    Object[] objArr212 = {o.az.a.class.getField("b").get(clsArr), o.dd.g.class.getField("z").get(clsArr)};
                                    Constructor declaredConstructor32 = o.dd.e.class.getDeclaredConstructor(o.az.a.class, o.dd.g.class);
                                    declaredConstructor32.setAccessible(true);
                                    Object[] objArr232 = {objInvoke6, declaredConstructor32.newInstance(objArr212), true};
                                    Method method152 = o.dc.d.class.getMethod("b", Context.class, o.dd.e.class, Boolean.TYPE);
                                    method152.setAccessible(true);
                                    method152.invoke(objInvoke92, objArr232);
                                    Object[] objArr242 = new Object[1];
                                    o(b2, b3, b4, objArr242);
                                    Class<?> cls32 = Class.forName((String) objArr242[0]);
                                    byte length42 = (byte) bArr.length;
                                    byte b132 = (byte) ((-1) - (((-1) - length42) | ((-1) - 7)));
                                    Object[] objArr252 = new Object[1];
                                    o(length42, b132, b132, objArr252);
                                    Method method162 = cls32.getMethod((String) objArr252[0], null);
                                    method162.setAccessible(true);
                                    Object objInvoke102 = method162.invoke(null, null);
                                    Object[] objArr262 = new Object[1];
                                    o(b2, b3, b4, objArr262);
                                    Class.forName((String) objArr262[0]).getField("d").setBoolean(objInvoke102, true);
                                    return;
                                }
                            }
                            o.ea.f.class.getMethod("a", null).setAccessible(true);
                            if (!(!((Boolean) r0.invoke(null, null)).booleanValue())) {
                                Object[] objArr28 = new Object[1];
                                n("\u0bd6ஓ靳졤炠⡉癟측䩥\uf292ꩯ\uf042챜㙋璑Ⱀ爍丵\uf6e4긂ﰘ", ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr28);
                                String strIntern3 = ((String) objArr28[0]).intern();
                                Object[] objArr29 = new Object[1];
                                l((short) (45 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 1840963471, 1174325056 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr29);
                                Object[] objArr30 = {strIntern3, ((String) objArr29[0]).intern()};
                                Method method18 = o.ea.f.class.getMethod("c", String.class, Object.class);
                                method18.setAccessible(true);
                                method18.invoke(null, objArr30);
                            }
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }

                private void b(c.e eVar) throws Throwable {
                    int i4 = 2 % 2;
                    int i5 = f27107j + 93;
                    f27109m = i5 % 128;
                    if (i5 % 2 == 0) {
                        c.e eVar2 = c.e.f25300d;
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (eVar != c.e.f25300d) {
                        if (o.ea.f.a()) {
                            String strN = d.this.n();
                            StringBuilder sb = new StringBuilder();
                            Object[] objArr = new Object[1];
                            l((short) ((-5) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1840963385 + (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 1174325056, TextUtils.lastIndexOf("", '0', 0) - 37, (byte) View.resolveSize(0, 0), objArr);
                            StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(d.this.k());
                            Object[] objArr2 = new Object[1];
                            l((short) (82 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 1840963396 - View.resolveSize(0, 0), 1174324974 - KeyEvent.getDeadChar(0, 0), (-19) - TextUtils.getTrimmedLength(""), (byte) TextUtils.indexOf("", "", 0), objArr2);
                            o.ea.f.d(strN, sbAppend.append(((String) objArr2[0]).intern()).toString());
                        }
                        if (d.d(d.this) != null) {
                            d.e(d.this).onError(new o.by.c(d.this.o()));
                            return;
                        }
                        return;
                    }
                    if (o.ea.f.a()) {
                        String strN2 = d.this.n();
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr3 = new Object[1];
                        l((short) ((-5) - View.combineMeasuredStates(0, 0)), 1840963384 + (ViewConfiguration.getEdgeSlop() >> 16), 51056 - AndroidCharacter.getMirror('0'), (-38) - ((Process.getThreadPriority(0) + 20) >> 6), (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr3);
                        StringBuilder sbAppend2 = sb2.append(((String) objArr3[0]).intern()).append(d.this.k());
                        Object[] objArr4 = new Object[1];
                        n("棔棴㴸戵Ꮗ雃ᕐ굒\ue03f釺ᒷ鍭昁裁ា銞ᄏ\ue47e閗႑鼑樎᯦麿ᴩ\ue848饝ᭂ鯍澼ὑ", Color.alpha(0), objArr4);
                        o.ea.f.c(strN2, sbAppend2.append(((String) objArr4[0]).intern()).toString());
                    }
                    d.this.e(activityL, bVar);
                    int i6 = f27107j + 85;
                    f27109m = i6 % 128;
                    int i7 = i6 % 2;
                }

                public static Object[] c(Context context2, int i4, int i5) {
                    if (context2 == null) {
                        Object[] objArr = {new int[]{i ^ (i << 5)}, new int[]{i4}, null, new int[]{i4}};
                        int i6 = f27108k * (-701484949);
                        f27108k = i6;
                        int i7 = ~i6;
                        int i8 = ~((-1) - (((-1) - 30557214) & ((-1) - i7)));
                        int i9 = ~((i7 - 647590808) - (i7 & (-647590808)));
                        int i10 = i5 + 175266865 + ((((-638137218) + i6) - ((-638137218) & i6)) * (-676)) + (((i8 + 638137217) - (i8 & 638137217)) * 676) + (((-1) - (((-1) - (~((i6 + 668694431) - (i6 & 668694431)))) & ((-1) - ((i9 + 9453590) - (i9 & 9453590))))) * 676);
                        int i11 = i10 ^ (i10 << 13);
                        int i12 = i11 ^ (i11 >>> 17);
                        return objArr;
                    }
                    try {
                        Object[] objArr2 = new Object[1];
                        n("쩼쨖矺⣡Ԯࠟ러뮬ꪶ蜃訣㇏ⳅᘐĚే뎰꺱茮蹗㶩ₔ\u0d500뾌ꋍ迠藖㤢╈৽߾묔ꝸ讒馿╒㤣ᗱᯎꜵ무", Process.myPid() >> 22, objArr2);
                        Object[] objArr3 = (Object[]) Array.newInstance(Class.forName(((String) objArr2[0]).intern()), 2);
                        Object[] objArr4 = new Object[1];
                        n("\u0f70༳ﴺꈎ禴蚖狶읽‼ﯓҀ\uf4c9ꘔ颹継苃皭⑪ﾤø\uf8fcꩯ燔軶窖⡜\uf373ଠﱩ꾴电褤縕ⶽ\uf762", TextUtils.getTrimmedLength(""), objArr4);
                        try {
                            Object[] objArr5 = {((String) objArr4[0]).intern()};
                            Object[] objArr6 = new Object[1];
                            n("쩼쨖矺⣡Ԯࠟ러뮬ꪶ蜃訣㇏ⳅᘐĚే뎰꺱茮蹗㶩ₔ\u0d500뾌ꋍ迠藖㤢╈৽߾묔ꝸ讒馿╒㤣ᗱᯎꜵ무", (-1) - MotionEvent.axisFromString(""), objArr6);
                            objArr3[0] = Class.forName(((String) objArr6[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr5);
                            Object[] objArr7 = new Object[1];
                            l((short) ((-39) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 1840963531 - View.combineMeasuredStates(0, 0), 1174325009 - Color.alpha(0), (-20) - Gravity.getAbsoluteGravity(0, 0), (byte) ((-1) - Process.getGidForName("")), objArr7);
                            try {
                                Object[] objArr8 = {((String) objArr7[0]).intern()};
                                Object[] objArr9 = new Object[1];
                                n("쩼쨖矺⣡Ԯࠟ러뮬ꪶ蜃訣㇏ⳅᘐĚే뎰꺱茮蹗㶩ₔ\u0d500뾌ꋍ迠藖㤢╈৽߾묔ꝸ讒馿╒㤣ᗱᯎꜵ무", KeyEvent.getMaxKeyCode() >> 16, objArr9);
                                objArr3[1] = Class.forName(((String) objArr9[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr8);
                                try {
                                    Object[] objArr10 = new Object[1];
                                    n("ꅒꄳꩥ\uf571俥蔐\udcd5\uf175睮췍ݴ嫡\uf140鬌䯟腆\ud88f猹즭̄嚱ﴐ䞏赶풿缟약", Drawable.resolveOpacity(0, 0), objArr10);
                                    Class<?> cls = Class.forName(((String) objArr10[0]).intern());
                                    Object[] objArr11 = new Object[1];
                                    n("\udc91\udcf6㲹掦䋼繋ꄘﱼ\ue1b8샋ﱂ✦枖恵䛵稪ꕇ\ue5ea쒷\uf836⭃", Drawable.resolveOpacity(0, 0), objArr11);
                                    Object objInvoke = cls.getMethod(((String) objArr11[0]).intern(), null).invoke(context2, null);
                                    try {
                                        Object[] objArr12 = new Object[1];
                                        n("ꅒꄳꩥ\uf571俥蔐\udcd5\uf175睮췍ݴ嫡\uf140鬌䯟腆\ud88f猹즭̄嚱ﴐ䞏赶풿缟약", (-1) - MotionEvent.axisFromString(""), objArr12);
                                        Class<?> cls2 = Class.forName(((String) objArr12[0]).intern());
                                        float f2 = 0.0f;
                                        Object[] objArr13 = new Object[1];
                                        n("춶췑쿛郄\uf0ba\uf259뀿为ዚ犍灐㘁铴\uec67\uf4b0\uf638둣ᚌ", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr13);
                                        try {
                                            Object[] objArr14 = {cls2.getMethod(((String) objArr13[0]).intern(), null).invoke(context2, null), 64};
                                            int i13 = 1174325039;
                                            char c2 = '0';
                                            Object[] objArr15 = new Object[1];
                                            l((short) ((ViewConfiguration.getEdgeSlop() >> 16) - 93), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1840963561, 1174325039 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) - 17, (byte) (ImageFormat.getBitsPerPixel(0) + 1), objArr15);
                                            Class<?> cls3 = Class.forName(((String) objArr15[0]).intern());
                                            Object[] objArr16 = new Object[1];
                                            n("ꢃ꣤皓⦌頧궅픊⚧ꮒᨐ⾌匴ⶼ뎻鰪ꧫ텝꿎", Process.myTid() >> 22, objArr16);
                                            Object objInvoke2 = cls3.getMethod(((String) objArr16[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                            Object[] objArr17 = new Object[1];
                                            n("䬌䭭甌⨘翻챭㚋셫ꠇ\ufdd3三낿⸩퉱篁젻㋑걐靈䩹볜≻矑쐯㻥ꁭ\uf57c䇦렛➃獆쏁㨲ꖱ", KeyEvent.keyCodeFromString(""), objArr17);
                                            Class<?> cls4 = Class.forName(((String) objArr17[0]).intern());
                                            Object[] objArr18 = new Object[1];
                                            n("柒枡벒\ue381㩂\u137dᩛ蓑憄롸酙鱧\ue7abൽ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr18);
                                            Object[] objArr19 = (Object[]) cls4.getField(((String) objArr18[0]).intern()).get(objInvoke2);
                                            int length = objArr19.length;
                                            int i14 = 0;
                                            while (i14 < length) {
                                                Object obj2 = objArr19[i14];
                                                Object[] objArr20 = new Object[1];
                                                n("췁춙谍퍙죓ꧬ뀐瘒랲", (AudioTrack.getMinVolume() > f2 ? 1 : (AudioTrack.getMinVolume() == f2 ? 0 : -1)), objArr20);
                                                try {
                                                    Object[] objArr21 = {((String) objArr20[0]).intern()};
                                                    short windowTouchSlop = (short) (59 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                                                    int iAxisFromString = 1840963592 - MotionEvent.axisFromString("");
                                                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1174325048;
                                                    int scrollDefaultDelay = (-14) - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                    byte bIndexOf = (byte) (TextUtils.indexOf("", c2) + 1);
                                                    Object[] objArr22 = new Object[1];
                                                    l(windowTouchSlop, iAxisFromString, scrollBarSize, scrollDefaultDelay, bIndexOf, objArr22);
                                                    Class<?> cls5 = Class.forName(((String) objArr22[0]).intern());
                                                    Object[] objArr23 = new Object[1];
                                                    l((short) ((-15) - (AudioTrack.getMinVolume() > f2 ? 1 : (AudioTrack.getMinVolume() == f2 ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) + 1840963629, View.MeasureSpec.getMode(0) + 1174325045, (-40) - (AudioTrack.getMinVolume() > f2 ? 1 : (AudioTrack.getMinVolume() == f2 ? 0 : -1)), (byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr23);
                                                    Object objInvoke3 = cls5.getMethod(((String) objArr23[0]).intern(), String.class).invoke(null, objArr21);
                                                    try {
                                                        Object[] objArr24 = new Object[1];
                                                        l((short) (View.MeasureSpec.getMode(0) + 31), ExpandableListView.getPackedPositionGroup(0L) + 1840963639, i13 - TextUtils.getCapsMode("", 0, 0), View.combineMeasuredStates(0, 0) - 23, (byte) TextUtils.indexOf("", ""), objArr24);
                                                        Class<?> cls6 = Class.forName(((String) objArr24[0]).intern());
                                                        Object[] objArr25 = new Object[1];
                                                        l((short) (17 - TextUtils.getCapsMode("", 0, 0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1840963665, 1174325058 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-40) - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), objArr25);
                                                        try {
                                                            Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr25[0]).intern(), null).invoke(obj2, null))};
                                                            Object[] objArr27 = new Object[1];
                                                            l((short) (59 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 1840963593, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1174325047, AndroidCharacter.getMirror('0') - '>', (byte) TextUtils.indexOf("", "", 0), objArr27);
                                                            Class<?> cls7 = Class.forName(((String) objArr27[0]).intern());
                                                            Object[] objArr28 = new Object[1];
                                                            n("\ud879\ud81e㶫抴㙻욶ꗣ裡\ue0a8둉䒎⏪暄\ud8bd㉗싷ꆨ\ue4ff뀤䃸⾸櫅㸐", Color.red(0), objArr28);
                                                            Object objInvoke4 = cls7.getMethod(((String) objArr28[0]).intern(), InputStream.class).invoke(objInvoke3, objArr26);
                                                            int length2 = objArr3.length;
                                                            int i15 = 0;
                                                            for (int i16 = 2; i15 < i16; i16 = 2) {
                                                                Object obj3 = objArr3[i15];
                                                                try {
                                                                    Object[] objArr29 = new Object[1];
                                                                    n("뵇봭孵Ѯ瀃䤤삁캁虤\uf238쬞䛢M圫琬䵡쒆艩\uf64e콨䪕ఛ砻䅽죺蹇醙쒞乒৭粑䚜챹诎ﺮ\ud88c剳ᖪ", ViewConfiguration.getJumpTapTimeout() >> 16, objArr29);
                                                                    Class<?> cls8 = Class.forName(((String) objArr29[0]).intern());
                                                                    Object[] objArr30 = new Object[1];
                                                                    n("鳵鲒\uf09a꾅궧쫷\ue168ጧ\u2d9a⾑䣹杆ꮤ퓊ꦻ컁\ue57d⦘⯛䲞欼\ua7eeꗐ슭\ue90d◹✷", ViewConfiguration.getTapTimeout() >> 16, objArr30);
                                                                    if (obj3.equals(cls8.getMethod(((String) objArr30[0]).intern(), null).invoke(objInvoke4, null))) {
                                                                        Object[] objArr31 = {new int[]{i ^ (i << 5)}, new int[]{i4}, null, new int[]{i4 ^ 1}};
                                                                        int i17 = ~(((-280248377) + i4) - ((-280248377) & i4));
                                                                        int i18 = ~i4;
                                                                        int i19 = (-447773379) + ((i17 | (~(((-83955973) + i18) - ((-83955973) & i18)))) * 920);
                                                                        int i20 = ~((-1) - (((-1) - (-313943674)) & ((-1) - i18)));
                                                                        int i21 = ~((-1) - (((-1) - (-280248377)) & ((-1) - i18)));
                                                                        int i22 = ~((-33695298) | i4);
                                                                        int i23 = i5 + i19 + (((i20 + 280248376) - (i20 & 280248376)) * 920) + ((((i21 + i22) - (i21 & i22)) | (~(((-83955973) + i4) - ((-83955973) & i4)))) * 920) + 16;
                                                                        int i24 = i23 ^ (i23 << 13);
                                                                        int i25 = i24 ^ (i24 >>> 17);
                                                                        return objArr31;
                                                                    }
                                                                    i15++;
                                                                } catch (Throwable th) {
                                                                    Throwable cause = th.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                            i14++;
                                                            c2 = '0';
                                                            i13 = 1174325039;
                                                            f2 = 0.0f;
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
                                            }
                                        } catch (Throwable th5) {
                                            Throwable cause5 = th5.getCause();
                                            if (cause5 != null) {
                                                throw cause5;
                                            }
                                            throw th5;
                                        }
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
                        } catch (Throwable th9) {
                            Throwable cause9 = th9.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th9;
                        }
                    } catch (Throwable unused) {
                    }
                    Object[] objArr32 = {new int[1], new int[]{i4}, null, new int[]{i4}};
                    int i26 = (int) Runtime.getRuntime().totalMemory();
                    int i27 = ~i26;
                    int i28 = i5 + 906643394 + (((~((-1) - (((-1) - (-1035097280)) & ((-1) - i27)))) | (-356949258)) * 519) + (((-1) - (((-1) - (~((-1) - (((-1) - i27) & ((-1) - (-352457738)))))) & ((-1) - (~((-1) - (((-1) - (-4491521)) & ((-1) - i26))))))) * (-519)) + (((~((i26 - 356949258) - (i26 & (-356949258)))) | 1035097279) * 519);
                    int i29 = i28 ^ (i28 << 13);
                    int i30 = i29 ^ (i29 >>> 17);
                    ((int[]) objArr32[0])[0] = i30 ^ (i30 << 5);
                    return objArr32;
                }

                static void init$0() {
                    $$a = new byte[]{95, MessagePack.Code.FALSE, -107, -90, 60, MessagePack.Code.EXT8, -19, Base64.padSymbol, MessagePack.Code.BIN8};
                    $$b = 20;
                }

                static void init$1() {
                    $$c = new byte[]{78, MessagePack.Code.UINT64, MessagePack.Code.NIL, -88};
                    $$d = 76;
                }

                /* JADX WARN: Removed duplicated region for block: B:46:0x0232 A[PHI: r4
  0x0232: PHI (r4v19 int) = (r4v3 int), (r4v22 int) binds: [B:49:0x0247, B:45:0x0230] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0249 A[PHI: r4
  0x0249: PHI (r4v4 int) = (r4v3 int), (r4v22 int) binds: [B:49:0x0247, B:45:0x0230] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void l(short r26, int r27, int r28, int r29, byte r30, java.lang.Object[] r31) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 897
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.y.d.AnonymousClass2.l(short, int, int, int, byte, java.lang.Object[]):void");
                }

                private static void n(String str, int i4, Object[] objArr) throws Throwable {
                    Object charArray;
                    String str2 = str;
                    int i5 = 2 % 2;
                    if (str2 != null) {
                        int i6 = $10 + 121;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                        charArray = str2.toCharArray();
                    } else {
                        charArray = str2;
                    }
                    o.a.k kVar = new o.a.k();
                    char[] cArrC = o.a.k.c(f27104g ^ (-5882309809461882246L), (char[]) charArray, i4);
                    kVar.f19939c = 4;
                    int i8 = $11 + 123;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    while (kVar.f19939c < cArrC.length) {
                        int i10 = $10 + 53;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        kVar.f19938a = kVar.f19939c - 4;
                        int i12 = kVar.f19939c;
                        try {
                            Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f27104g)};
                            Object objA = o.d.d.a(-1093976004);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                objA = o.d.d.a(Color.alpha(0) + 229, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 51004), View.getDefaultSize(0, 0) + 9, 1749983833, false, $$e((byte) 7, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                            }
                            cArrC[i12] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                            Object[] objArr3 = {kVar, kVar};
                            Object objA2 = o.d.d.a(-912105096);
                            if (objA2 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objA2 = o.d.d.a(675 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((-1) - Process.getGidForName("")), ExpandableListView.getPackedPositionGroup(0L) + 12, 522683165, false, $$e(b3, b4, b4), new Class[]{Object.class, Object.class});
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

                /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:5:0x0015). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void o(int r9, int r10, int r11, java.lang.Object[] r12) {
                    /*
                        int r0 = r10 * 5
                        int r8 = r0 + 4
                        int r0 = r11 * 5
                        int r7 = 6 - r0
                        byte[] r6 = o.y.d.AnonymousClass2.$$a
                        int r0 = r9 * 2
                        int r5 = 115 - r0
                        byte[] r4 = new byte[r7]
                        r3 = 0
                        if (r6 != 0) goto L30
                        r1 = r7
                        r2 = r3
                    L15:
                        int r8 = r8 + 1
                        int r0 = -r5
                        int r1 = r1 + r0
                        int r5 = r1 + (-5)
                        r1 = r2
                    L1c:
                        byte r0 = (byte) r5
                        int r2 = r1 + 1
                        r4[r1] = r0
                        if (r2 != r7) goto L2b
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r4, r3)
                        r12[r3] = r0
                        return
                    L2b:
                        r0 = r6[r8]
                        r1 = r5
                        r5 = r0
                        goto L15
                    L30:
                        r1 = r3
                        goto L1c
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.y.d.AnonymousClass2.o(int, int, int, java.lang.Object[]):void");
                }

                @Override // o.es.c.a
                public final /* synthetic */ void a(c.e eVar) throws Throwable {
                    int i4 = 2 % 2;
                    int i5 = f27107j + 105;
                    f27109m = i5 % 128;
                    int i6 = i5 % 2;
                    b(eVar);
                    if (i6 == 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    int i7 = f27107j + 17;
                    f27109m = i7 % 128;
                    int i8 = i7 % 2;
                }

                @Override // o.es.c.a
                public final void d(o.by.c cVar) throws Throwable {
                    int i4 = 2 % 2;
                    int i5 = f27109m + 69;
                    f27107j = i5 % 128;
                    int i6 = i5 % 2;
                    if (o.ea.f.a()) {
                        String strN = d.this.n();
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr = new Object[1];
                        l((short) ((-5) - (ViewConfiguration.getWindowTouchSlop() >> 8)), View.MeasureSpec.getSize(0) + 1840963384, 1174325056 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-39) - Process.getGidForName(""), (byte) (Process.myTid() >> 22), objArr);
                        StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(d.this.k());
                        Object[] objArr2 = new Object[1];
                        n("銡銁苫\udde6Ե〆\uef25뮠忬蜈뉲椂\ud9d5⸄ą㑎\ueb6c宪茬뙁敠햟൚㡥\ue75d埉达붗懱큳ড㾩\ue396剕讚ꆧ綅챱ᖹ⎔ﾩ丯韝ꗻ秝젔ᇖ✟", TextUtils.getTrimmedLength(""), objArr2);
                        o.ea.f.d(strN, sbAppend.append(((String) objArr2[0]).intern()).toString());
                    }
                    if (d.a(d.this) != null) {
                        d.b(d.this).onError(new o.by.c(d.this.o()));
                    }
                    int i7 = f27109m + 63;
                    f27107j = i7 % 128;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                }
            });
            return;
        }
        if (o.ea.f.a()) {
            int i4 = f27097w + 21;
            f27098x = i4 % 128;
            int i5 = i4 % 2;
            String strN = n();
            Object[] objArr = new Object[1];
            O((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), "\uf059렒퉛ꍰṝ\udec5ᅕ䄧虍윊ⴖ俩勇봭죓\ueeb0邶ꊡ⍔팝\uecaaꏃ⨬蛬⏴章ᒀ\uf458웋噏莅㢝塴", "\u0000\u0000\u0000\u0000", "ᦽ㎤褥뵒", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 624141336, objArr);
            o.ea.f.c(strN, ((String) objArr[0]).intern());
        }
        if (i() != null) {
            i().onError(new o.by.c(AntelopErrorCode.InternalError));
        }
    }

    final void e(final Activity activity, final o.en.b bVar) {
        int i2 = 2 % 2;
        final c.InterfaceC0350c interfaceC0350c = new c.InterfaceC0350c() { // from class: o.y.d.4

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f27113a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f27114b = 1;

            @Override // o.es.c.InterfaceC0350c
            public final void c(String str) {
                int i3 = 2 % 2;
                int i4 = f27113a;
                int i5 = (i4 ^ 7) + (((-1) - (((-1) - i4) | ((-1) - 7))) << 1);
                f27114b = i5 % 128;
                if (i5 % 2 == 0) {
                    Object[] objArr = {bVar.j().e(), ((c) d.this).f27088r.b(), str, d.this.m()};
                    int i6 = o.eo.c.f24260e * (-824593982);
                    o.eo.c.f24260e = i6;
                    int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                    int i7 = o.eo.c.f24257b * (-720527739);
                    o.eo.c.f24257b = i7;
                    o.eo.c.a((int) SystemClock.elapsedRealtime(), objArr, i7, -1335420037, 1335420037, i6, iFreeMemory);
                    d.c(d.this);
                    throw null;
                }
                Object[] objArr2 = {bVar.j().e(), ((c) d.this).f27088r.b(), str, d.this.m()};
                int i8 = o.eo.c.f24260e * (-824593982);
                o.eo.c.f24260e = i8;
                int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                int i9 = o.eo.c.f24257b * (-720527739);
                o.eo.c.f24257b = i9;
                o.eo.c.a((int) SystemClock.elapsedRealtime(), objArr2, i9, -1335420037, 1335420037, i8, iFreeMemory2);
                o.x.f fVarC = d.c(d.this);
                if (fVarC != null) {
                    fVarC.onProcessSuccess();
                    int i10 = f27113a + 117;
                    f27114b = i10 % 128;
                    int i11 = i10 % 2;
                }
            }

            @Override // o.es.c.InterfaceC0350c
            public final void d(o.by.c cVar) {
                int i3 = 2 % 2;
                int i4 = f27114b + 47;
                f27113a = i4 % 128;
                Object obj = null;
                if (i4 % 2 != 0) {
                    d.i(d.this);
                    throw null;
                }
                o.x.f fVarI = d.i(d.this);
                if (fVarI != null) {
                    int i5 = f27113a + 51;
                    f27114b = i5 % 128;
                    if (i5 % 2 == 0) {
                        fVarI.onError(cVar);
                        obj.hashCode();
                        throw null;
                    }
                    fVarI.onError(cVar);
                    int i6 = f27113a;
                    int i7 = ((91 | i6) << 1) - (i6 ^ 91);
                    f27114b = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
        };
        new o.ap.f(activity, new f.a<TRres>() { // from class: o.y.d.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static char f27117d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static char f27118e = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static char f27119g = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static char f27120h = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f27121i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static int f27122j = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$c(short r9, int r10, byte r11) {
                /*
                    byte[] r8 = o.y.d.AnonymousClass5.$$a
                    int r0 = r11 * 3
                    int r0 = r0 + 69
                    int r7 = r10 * 4
                    int r2 = r7 + 1
                    int r1 = r9 * 4
                    int r6 = r1 + 4
                    byte[] r5 = new byte[r2]
                    r4 = 0
                    if (r8 != 0) goto L2c
                    r2 = r7
                    r3 = r4
                L15:
                    int r0 = -r0
                    int r0 = r0 + r2
                    int r6 = r6 + 1
                    r2 = r3
                L1a:
                    byte r1 = (byte) r0
                    r5[r2] = r1
                    int r3 = r2 + 1
                    if (r2 != r7) goto L27
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    return r0
                L27:
                    r1 = r8[r6]
                    r2 = r0
                    r0 = r1
                    goto L15
                L2c:
                    r2 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.d.AnonymousClass5.$$c(short, int, byte):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f27121i = 0;
                f27122j = 1;
                f27117d = (char) 6614;
                f27118e = (char) 47960;
                f27120h = (char) 5999;
                f27119g = (char) 16806;
            }

            private static void f(String str, int i3, Object[] objArr) throws Throwable {
                String str2 = str;
                int i4 = 2 % 2;
                int i5 = $10 + 53;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                o.a.g gVar = new o.a.g();
                char[] cArr2 = new char[cArr.length];
                int i7 = 0;
                gVar.f19924d = 0;
                char[] cArr3 = new char[2];
                while (gVar.f19924d < cArr.length) {
                    cArr3[i7] = cArr[gVar.f19924d];
                    cArr3[1] = cArr[gVar.f19924d + 1];
                    int i8 = $10 + 113;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = 58224;
                    int i11 = i7;
                    while (i11 < 16) {
                        int i12 = $11 + 39;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        char c2 = cArr3[1];
                        char c3 = cArr3[i7];
                        try {
                            Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i10) ^ ((c3 << 4) + ((char) (((long) f27120h) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f27119g)};
                            Object objA = o.d.d.a(1603517628);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objA = o.d.d.a(ExpandableListView.getPackedPositionChild(0L) + 271, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 12 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1995022631, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i10) ^ ((cCharValue << 4) + ((char) (((long) f27117d) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f27118e)};
                            Object objA2 = o.d.d.a(1603517628);
                            if (objA2 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objA2 = o.d.d.a(269 - TextUtils.lastIndexOf("", '0', 0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), KeyEvent.normalizeMetaState(0) + 11, -1995022631, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                            i10 -= 40503;
                            i11++;
                            i7 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[gVar.f19924d] = cArr3[0];
                    cArr2[gVar.f19924d + 1] = cArr3[1];
                    Object[] objArr4 = {gVar, gVar};
                    Object objA3 = o.d.d.a(1390051551);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 270, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.indexOf("", "", 0, 0) + 11, -2074123590, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    int i14 = $11 + 69;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    i7 = 0;
                }
                objArr[0] = new String(cArr2, 0, i3);
            }

            static void init$0() {
                $$a = new byte[]{44, 115, -31, MessagePack.Code.FLOAT32};
                $$b = 142;
            }

            @Override // o.ap.f.a
            public final void a(o.bg.c cVar) throws Throwable {
                int i3 = 2 % 2;
                int i4 = f27121i + 105;
                f27122j = i4 % 128;
                if (i4 % 2 == 0) {
                    o.ea.f.a();
                    throw null;
                }
                if (o.ea.f.a()) {
                    String strN = d.this.n();
                    Object[] objArr = new Object[1];
                    f("堋\ue121ꓤ\uecb5◳聟坛机唉ვ፪ᨶ趽钃鑿⠖ដ箅፞餡鄈䉤ԗ댗", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24, objArr);
                    o.ea.f.c(strN, ((String) objArr[0]).intern());
                }
                if (d.g(d.this) != null) {
                    if (cVar.c() != o.bg.a.az) {
                        d.j(d.this).onError(o.by.c.b(cVar));
                        int i5 = f27122j + 83;
                        f27121i = i5 % 128;
                        int i6 = i5 % 2;
                        return;
                    }
                    d.f(d.this);
                    Object[] objArr2 = {d.this};
                    int i7 = d.f27091o * (-750334151);
                    d.f27091o = i7;
                    int i8 = d.f27090n * 1573979659;
                    d.f27090n = i8;
                    int i9 = d.f27089k * (-832898566);
                    d.f27089k = i9;
                    int i10 = d.f27094s * (-1088257765);
                    d.f27094s = i10;
                    ((o.x.f) d.c(441239940, objArr2, i8, i9, i10, -441239940, i7)).onAuthenticationDeclined();
                }
            }

            @Override // o.ap.f.a
            public final void b(final TRres trres) throws Throwable {
                int i3 = 2 % 2;
                int i4 = f27122j + 113;
                f27121i = i4 % 128;
                if (i4 % 2 != 0) {
                    o.ea.f.a();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (o.ea.f.a()) {
                    String strN = d.this.n();
                    Object[] objArr = new Object[1];
                    f("堋\ue121ꓤ\uecb5◳聟坛机唉ვ፪ᨶ趽钃鑿⠖㦴\uf62fⶫ뷛ྂ❳㛐믄", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24, objArr);
                    o.ea.f.c(strN, ((String) objArr[0]).intern());
                }
                final o.es.c cVarA = d.this.a(activity);
                cVarA.c(new c.a<List<o.es.e>>() { // from class: o.y.d.5.3

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static int f27126c = 1;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static int f27127d = 0;

                    /* JADX WARN: Removed duplicated region for block: B:9:0x0058 A[PHI: r4
  0x0058: PHI (r4v6 o.es.e) = (r4v3 o.es.e), (r4v8 o.es.e) binds: [B:18:0x00d2, B:8:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private void e(java.util.List<o.es.e> r20) {
                        /*
                            Method dump skipped, instruction units count: 307
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.y.d.AnonymousClass5.AnonymousClass3.e(java.util.List):void");
                    }

                    @Override // o.es.c.a
                    public final /* synthetic */ void a(List<o.es.e> list) {
                        int i5 = 2 % 2;
                        int i6 = f27127d + 51;
                        f27126c = i6 % 128;
                        int i7 = i6 % 2;
                        e(list);
                        if (i7 == 0) {
                            throw null;
                        }
                    }

                    @Override // o.es.c.a
                    public final void d(o.by.c cVar) {
                        int i5 = 2 % 2;
                        int i6 = f27127d + 9;
                        f27126c = i6 % 128;
                        int i7 = i6 % 2;
                        interfaceC0350c.d(cVar);
                        int i8 = f27126c;
                        int i9 = ((31 | i8) << 1) - (i8 ^ 31);
                        f27127d = i9 % 128;
                        int i10 = i9 % 2;
                    }
                });
                int i5 = f27121i + 33;
                f27122j = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 62 / 0;
                }
            }
        }, bVar, b(a(activity), this.f27100m)).b(this.f26933b, g(), ((c) this).f27088r.b());
        int i3 = f27098x + 53;
        f27097w = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 56 / 0;
        }
    }

    abstract String k();

    abstract Activity l();

    abstract i.c m();

    abstract String n();

    abstract AntelopErrorCode o();

    abstract o.ea.j t();
}
