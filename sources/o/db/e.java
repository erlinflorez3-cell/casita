package o.db;

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
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.SanyoMakernoteDirectory;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import o.ea.m;
import o.m.f;
import o.m.h;
import o.m.i;
import o.m.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f22745a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f22746b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f22747c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f22748d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f22749e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22750f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f22751g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char f22752h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f22753i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22754j = 0;

    /* JADX INFO: renamed from: o.db.e$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f22755b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f22756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f22757d = 1;

        static {
            int[] iArr = new int[f.values().length];
            f22756c = iArr;
            try {
                iArr[f.f26437b.ordinal()] = 1;
                int i2 = f22757d;
                int i3 = (i2 ^ 21) + (((i2 + 21) - (i2 | 21)) << 1);
                f22755b = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22756c[f.f26439e.ordinal()] = 2;
                int i6 = f22755b + 7;
                f22757d = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22756c[f.f26438c.ordinal()] = 3;
                int i8 = f22755b + 29;
                f22757d = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22756c[f.f26436a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, int r10, byte r11) {
        /*
            byte[] r8 = o.db.e.$$a
            int r0 = r10 * 3
            int r2 = 3 - r0
            int r0 = r9 * 2
            int r7 = 1 - r0
            int r1 = 105 - r11
            byte[] r6 = new byte[r7]
            r5 = 0
            if (r8 != 0) goto L2a
            r4 = r7
            r0 = r2
            r3 = r5
        L14:
            int r1 = -r2
            int r1 = r1 + r4
            r2 = r0
        L17:
            byte r0 = (byte) r1
            r6[r3] = r0
            int r0 = r2 + 1
            int r3 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L26:
            r2 = r8[r0]
            r4 = r1
            goto L14
        L2a:
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.db.e.$$c(int, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22750f = 0;
        f22751g = 1;
        f22753i = 0;
        f22754j = 1;
        a();
        ExpandableListView.getPackedPositionForGroup(0);
        Process.getGidForName("");
        TextUtils.indexOf("", "", 0);
        int i2 = f22750f + 41;
        f22751g = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static void a() {
        char[] cArr = new char[559];
        ByteBuffer.wrap("~\u0090Á¬\u0000µC¡\u0082\u0094Å\u0097\u0004\u0095G\u0080\u0086òÉø\bõKà\u008aÞÍ×\fìOÌ\u008e%Ñ1\u0010.S-\u0092\u0002Õ+\u0014\u0004W\b\u0096uÙ|\u0018s\u000eâ±åpñ3ñ\u0094\u0080+\u009fê\u0083©\u008eh\u0091/¬î¯\u00ad\u008blÆ#ÎâÇ¡Ç`â'îæÁ¥åd\u0007;\u0014ú\u0016¹\u0019xr?wþb½)|D3Wò\u0002±\u0010p27?öqµ*uß4ÚË\u0081\u008a\u009fI \b¨Ï§\u008e¤MÆ\f\u009aÃÃ\u0082ÞAæ\u0000ÿÇï\u0086úE\u0006\u0004ZÛ\u0001\u009a\u0005Y'\u00184ß6\u009ej]\b\u001c\u001aÓ\u0007\u0092N\u0094¸+\u0089ê\u008d©\u0084hò/¿îº\u00ad©l×#ÊâÖ¡Ã`ý'ôæ¢¥ïd\u001c;\u0019ú\r¹\u001fx<?.þ'½8|W3^ò\u0002±]pz7sönµouÒ4\u008aË\u0090\u008a\u0085I±\b¿Ï±\u008e¹MÛ\fÔÃÅ\u0082\u008aAñ\u0000ìÇï\u0086ªE\u0013\u0004\u000eÛ\u0016\u009a\u000fY?\u0018*ß6\u009ej]Q\u001cUÓW\u0092DQf\u0010i×\"\u00960VÒ\u008b 4?õ#¶.w10\u000fñ\u0011²\u001es}<wýg¾x\u007fs8OùVºB{·$´å¶¦£g\u0091 \u009bá\u0096¢\u0083cý,ôíÏ®ïoÆ(ÒéÍªÎj\u001e+3Ô1\u0095>;Ç\u0084ØEÄ\u0006ÉÇÖ\u0080èAö\u0002ùÃ\u009a\u008c\u0090M\u0080\u000e\u009fÏ\u0094\u0088¨I±\n¥ËP\u0094SUQ\u0016D×v\u0090|Qq\u0012dÓ\u001a\u009c\u0013](\u001e\bß!\u00985Y*\u001a)Úù\u009bÔdÖ%Ùæµ§°`¥!ÿâ\u0090£\u009cl\u0081-\u0084î»¯ºhå) êP«ItM5Böq·=p?1-\u001c¸£§b»!¶à©§\u0097f\u0089%\u0086äå«ïjÿ)àèë¯×nÎ-Úì/³,r.1;ð\t·\u0003v\u000e5\u001bôe»lzW9wø^¿J~U=Vý\u0086¼«C©\u0002¦ÁÊ\u0080ÏGÚ\u0006ÀÅª\u0084ïKÿ\næÉÂ\u0088ÍOÞ\u000eÁÍj\u008c#S(\u00127ÑJ\u0090\u0011W\u0012\u0016\u0013Õx\u0094k[t\u001auÙ\n\u0098V_R\u001eWÞê\u009d±\\»ã¿¢\u008faÂ \u008eç\u008b¦úeç$ºëûªÄi\u0082(ÎïÚ®/mb,9ó$²\u0007qB0\u0016÷\u001b¶yuvùFFY\u0087EÄH\u0005WBi\u0083wÀx\u0001\u001bN\u0011\u008f\u0001Ì\u001e\r\u0015J)\u008b0È$\tÑVÒ\u0097ÐÔÅ\u0015÷Rý\u0093ðÐå\u0011\u009b^\u0092\u009f©Ü\u0089\u001d Z´\u009b«Ø¨\u0094\u0087+\u0094ê\u0089©\u0084h½/\u00adî¬\u00adêlÓ#ÏâÖ¡Â`÷'ôæö¥ãd\u0011;\u001bú\u0016¹\u0003x=?4þb½'|W3NòJ±Epv7:övµsu\u00824\u009féõVû\u0097ñÔÿ\u0015ÅRÛ\u0094\u0087+\u0094ê\u0089©\u0084h½/\u00adî¬\u00adêlý#ÎâÊ¡Ï`à'ºæÁ¥ÿd\u0000;\bú\u0007¹\u0004x1?#þb½\"|S3TòF±Fp{7töeµ*u¦4\u0083Ë\u0092\u008a\u008fIò\b÷Ïâ¼Ï\u0003ÃÂÁ\u0081É@ë\u0007äÆõ\u0085ºD\u008f\u000b\u008bÊ\u008a\u0089»H¶\u000f¾Î·\u008d·LR\u0013^ÒA\u0091\u001aPt\u0017kÖ~\u0095oT\u00079(\u0086:G\u0012\u00041Å\u0004\u0082\nC\u001a\u0000\u001cÁe\u008eKOh\fPÍR\u008aZKD\b\\É³\u0094 +\u009fê\u0083©\u008eh»/´î¥\u00adêlÑ#ÌâÏ¡\u008a`¿'ºæÌ¥åd\u0006;Zú,¹\u0005x<??þb½\u001e|K3JòG±\np?7:öRµku\u00804\u0089Ë\u0087\u008aÊI¤\b»Ï®\u008e£MÖ\fÓÃÖ\u0082ÓAÖ\u0000ïÇð\u0086ëE\u0006\u0004\u0013Û\r\u009a\u0004lßÓÀ\u0012ÕQØ\u0090í×è\u0016íUè\u0094\u00adÛ\u0094\u001a\u008bY\u0090\u0098½ß¨\u001e¶]¿".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 559);
        f22745a = cArr;
        f22748d = 7500104004032015354L;
        f22746b = (char) 11357;
        f22749e = (char) 48502;
        f22747c = (char) 27113;
        f22752h = (char) 59988;
    }

    public static HashMap<i, Short> c(o.ef.c cVar) throws Throwable {
        int i2 = 2 % 2;
        try {
            HashMap<i, Short> map = new HashMap<>();
            int i3 = 0;
            while (true) {
                Object[] objArr = {cVar};
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i4 = o.ef.c.f23799b * 1567746851;
                o.ef.c.f23799b = i4;
                int i5 = 1136425123 * o.ef.c.f23798a;
                o.ef.c.f23798a = i5;
                try {
                    if (i3 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i5, i4, -1513293186, elapsedCpuTime, 1513293186, objArr)).intValue()) {
                        return map;
                    }
                    if (o.ea.f.a()) {
                        Object[] objArr2 = new Object[1];
                        k((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 59938), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, 28 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
                        String strIntern = ((String) objArr2[0]).intern();
                        Object[] objArr3 = new Object[1];
                        l("ꬔ悹휲ᛩ豩沝Ꭽ☿ؒ咻\ue0ad摉ᬋ목唑檧唨ꏋ∸\uf54d\u2d2f\uaaf9\ueb69ݥ\uee69赃묖譲路\uf69c嗃\ue3f4ꬔ悹휲ᛩ泷ᘁ⩽腏嗃\ue3f4㝜퐛鷍빵ꂩ\ue1ae路\uf69c琞⹄䰯묰\u2432漜唨ꏋ䰯묰ᙹ꠰\ue731ǲ", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 64, objArr3);
                        o.ea.f.c(strIntern, ((String) objArr3[0]).intern());
                    }
                    o.ef.a aVarD = cVar.d(i3);
                    try {
                        Object[] objArr4 = new Object[1];
                        k((char) (39550 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 26 - TextUtils.lastIndexOf("", '0', 0), 4 - Color.green(0), objArr4);
                        i iVar = (i) aVarD.c(i.class, ((String) objArr4[0]).intern());
                        Object[] objArr5 = new Object[1];
                        l("ꂩ\ue1ae路\uf69c琞⹄∸\uf54d唑檧唨ꏋ〨壨", TextUtils.getTrimmedLength("") + 13, objArr5);
                        short sShortValue = aVarD.a(((String) objArr5[0]).intern(), (Short) (-1)).shortValue();
                        if (sShortValue != -1) {
                            int i6 = f22754j + 113;
                            f22753i = i6 % 128;
                            int i7 = i6 % 2;
                            if (o.ea.f.a()) {
                                int i8 = f22754j + 101;
                                f22753i = i8 % 128;
                                int i9 = i8 % 2;
                                Object[] objArr6 = new Object[1];
                                k((char) (59940 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), KeyEvent.getMaxKeyCode() >> 16, (ViewConfiguration.getTouchSlop() >> 8) + 27, objArr6);
                                String strIntern2 = ((String) objArr6[0]).intern();
                                Locale localeD = o.ea.g.d();
                                Object[] objArr7 = new Object[1];
                                k((char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31, 60 - Color.blue(0), objArr7);
                                o.ea.f.c(strIntern2, String.format(localeD, ((String) objArr7[0]).intern(), iVar.name(), Short.valueOf(sShortValue)));
                            }
                            map.put(iVar, Short.valueOf(sShortValue));
                        }
                        i3++;
                    } catch (o.ef.b e2) {
                        e = e2;
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr8 = new Object[1];
                        k((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 91, TextUtils.lastIndexOf("", '0') + 66, objArr8);
                        throw new o.en.f(sb.append(((String) objArr8[0]).intern()).append(e.getMessage()).toString());
                    }
                } catch (o.ef.b e3) {
                    e = e3;
                }
            }
        } catch (o.ef.b e4) {
            e = e4;
        }
    }

    public static o.fm.c d(Context context, o.ef.c cVar, BigDecimal bigDecimal) throws o.en.f {
        h hVarD;
        int i2 = 2 % 2;
        HashMap map = new HashMap();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i3 = o.ef.c.f23799b * 1567746851;
        o.ef.c.f23799b = i3;
        int i4 = o.ef.c.f23798a * 1136425123;
        o.ef.c.f23798a = i4;
        int iIntValue = ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i4, i3, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar})).intValue();
        for (int i5 = 0; i5 < iIntValue; i5++) {
            try {
                o.ef.a aVarD = cVar.d(i5);
                if (o.ea.f.a()) {
                    Object[] objArr = new Object[1];
                    k((char) (59940 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), Drawable.resolveOpacity(0, 0) + 27, objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr2 = new Object[1];
                    k((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 44871), 192 - TextUtils.indexOf("", "", 0), View.resolveSizeAndState(0, 0, 0) + 56, objArr2);
                    o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(i5).toString());
                }
                hVarD = d(aVarD, bigDecimal);
            } catch (o.ef.b e2) {
                if (o.ea.f.a()) {
                    Object[] objArr3 = new Object[1];
                    k((char) (59938 - ImageFormat.getBitsPerPixel(0)), View.combineMeasuredStates(0, 0), 26 - ImageFormat.getBitsPerPixel(0), objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    k((char) (8096 - Color.blue(0)), 156 - (ViewConfiguration.getPressedStateDuration() >> 16), 36 - ExpandableListView.getPackedPositionType(0L), objArr4);
                    o.ea.f.e(strIntern2, ((String) objArr4[0]).intern(), e2);
                }
            }
            if (map.put(hVarD.d(), hVarD) != null) {
                if (o.ea.f.a()) {
                    int i6 = f22754j + 11;
                    f22753i = i6 % 128;
                    int i7 = i6 % 2;
                    Object[] objArr5 = new Object[1];
                    k((char) (59939 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 28, objArr5);
                    String strIntern3 = ((String) objArr5[0]).intern();
                    Object[] objArr6 = new Object[1];
                    k((char) (ExpandableListView.getPackedPositionGroup(0L) + 34872), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 249, 90 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr6);
                    o.ea.f.c(strIntern3, ((String) objArr6[0]).intern());
                    int i8 = f22754j + 47;
                    f22753i = i8 % 128;
                    int i9 = i8 % 2;
                }
                Object[] objArr7 = new Object[1];
                l("鿍쀶\uea92\ud81b㝜퐛쟲櫬扷썒➚\ue0f2扷썒䜵ᱛ\uee10䣊ṏ鸱ⴹ廣蓇툚懼\ufddd␝궉ꬔ悹뗣짔ꤞ堗懼\ufddd꼼䒝鷍빵熥驽츖䠸묖譲朌䱢㝜퐛鷍빵ᙹ꠰\ue731ǲ", 56 - Color.green(0), objArr7);
                throw new o.en.f(((String) objArr7[0]).intern());
            }
        }
        return new o.fm.c(context, map);
    }

    private static h d(o.ef.a aVar, BigDecimal bigDecimal) throws Throwable {
        int i2 = 2 % 2;
        try {
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                k((char) (TextUtils.lastIndexOf("", '0') + 59940), KeyEvent.getDeadChar(0, 0), 28 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                k((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 28103), 338 - (KeyEvent.getMaxKeyCode() >> 16), KeyEvent.getDeadChar(0, 0) + 32, objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            }
            try {
                int i3 = 3;
                Object[] objArr3 = new Object[1];
                l("㔞頩\uef1d쐤", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3, objArr3);
                i iVar = (i) aVar.c(i.class, ((String) objArr3[0]).intern());
                int i4 = f22754j + 65;
                f22753i = i4 % 128;
                int i5 = i4 % 2;
                h hVarE = c.e(iVar);
                Object[] objArr4 = new Object[1];
                k((char) (32114 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 404 - ExpandableListView.getPackedPositionType(0L), 6 - Gravity.getAbsoluteGravity(0, 0), objArr4);
                f[] fVarArr = (f[]) aVar.d(f.class, ((String) objArr4[0]).intern());
                int length = fVarArr.length;
                int i6 = 0;
                while (i6 < length) {
                    int i7 = AnonymousClass4.f22756c[fVarArr[i6].ordinal()];
                    if (i7 == 1) {
                        try {
                            Object[] objArr5 = new Object[1];
                            l("䞓ബꤞ堗壞䫊槲\udbf8ꬔ悹\ue783឵ٛ鸀겸♱", 15 - ((Process.getThreadPriority(0) + 20) >> 6), objArr5);
                            Object[] objArr6 = {aVar, ((String) objArr5[0]).intern()};
                            int i8 = o.ef.a.f23782p * (-1576737484);
                            o.ef.a.f23782p = i8;
                            o oVarA = o.a((String) o.ef.a.a(-781664457, objArr6, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i8, Thread.currentThread().getPriority()));
                            int i9 = f22753i + 25;
                            f22754j = i9 % 128;
                            int i10 = i9 % 2;
                            Object[] objArr7 = new Object[1];
                            l("썑ꣴ\uf38b懋晢\u0bc3츖䠸汓鈩螰猶\uea94暈汓鈩", 16 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr7);
                            BigDecimal bigDecimalM = aVar.m(((String) objArr7[0]).intern());
                            if (bigDecimal == null || bigDecimalM == null) {
                                if (bigDecimal != null) {
                                    bigDecimalM = bigDecimal;
                                }
                                Object[] objArr8 = new Object[1];
                                l("썑ꣴ\uf38b懋晢\u0bc3츖䠸汓鈩ᅒ踴ᆌ䣜唨ꏋ〨壨", (KeyEvent.getMaxKeyCode() >> 16) + 17, objArr8);
                                BigDecimal bigDecimalM2 = aVar.m(((String) objArr8[0]).intern());
                                Object[] objArr9 = new Object[1];
                                l("썑ꣴ\uf38b懋晢\u0bc3츖䠸汓鈩\u31ed惚◯\udb11䓏薄䊅休", 18 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr9);
                                Integer numG = aVar.g(((String) objArr9[0]).intern());
                                Object[] objArr10 = new Object[1];
                                l("\ue731ǲꬔ悹戄ꈼ㝜퐛", 8 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr10);
                                hVarE.d(f.f26437b, new o.q.c(aVar.l(((String) objArr10[0]).intern()).shortValue(), bigDecimalM, oVarA, bigDecimalM2, numG));
                            } else {
                                bigDecimalM = bigDecimal.min(bigDecimalM);
                            }
                            Object[] objArr82 = new Object[1];
                            l("썑ꣴ\uf38b懋晢\u0bc3츖䠸汓鈩ᅒ踴ᆌ䣜唨ꏋ〨壨", (KeyEvent.getMaxKeyCode() >> 16) + 17, objArr82);
                            BigDecimal bigDecimalM22 = aVar.m(((String) objArr82[0]).intern());
                            Object[] objArr92 = new Object[1];
                            l("썑ꣴ\uf38b懋晢\u0bc3츖䠸汓鈩\u31ed惚◯\udb11䓏薄䊅休", 18 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr92);
                            Integer numG2 = aVar.g(((String) objArr92[0]).intern());
                            Object[] objArr102 = new Object[1];
                            l("\ue731ǲꬔ悹戄ꈼ㝜퐛", 8 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr102);
                            hVarE.d(f.f26437b, new o.q.c(aVar.l(((String) objArr102[0]).intern()).shortValue(), bigDecimalM, oVarA, bigDecimalM22, numG2));
                        } catch (IllegalArgumentException e2) {
                            StringBuilder sb = new StringBuilder();
                            Object[] objArr11 = new Object[1];
                            k((char) ('0' - AndroidCharacter.getMirror('0')), 411 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 40, objArr11);
                            throw new o.en.f(sb.append(((String) objArr11[0]).intern()).append(e2.getMessage()).toString());
                        }
                    } else if (i7 == 2) {
                        hVarE.d(f.f26439e, new o.q.e());
                    } else if (i7 == i3) {
                        hVarE.d(f.f26438c, new o.q.d());
                    } else if (i7 == 4) {
                        hVarE.d(f.f26436a, new o.q.b());
                    }
                    i6++;
                    i3 = 3;
                }
                if (m.c.e(hVarE.d(), i.f26495c, i.f26496d)) {
                    if (o.ea.f.a()) {
                        int i11 = f22753i + 51;
                        f22754j = i11 % 128;
                        int i12 = i11 % 2;
                        Object[] objArr12 = new Object[1];
                        k((char) (59938 - TextUtils.lastIndexOf("", '0', 0)), (-1) - Process.getGidForName(""), 27 - Color.argb(0, 0, 0, 0), objArr12);
                        String strIntern2 = ((String) objArr12[0]).intern();
                        Object[] objArr13 = new Object[1];
                        l("氆☝휲ᛩ茣\uf04d箱ↀｩ犂嗃\ue3f4壙\ue948쾦㍇\uea94暈쿗␜茣\uf04d\ue6a1䞋ྷ䒣祼툆쿗␜茣\uf04d\ued49\ued58촘甊\uf1aaᰟᷬ磘蚺ﲛⓙ䙹\uee10䣊ǝꙟ\uf49e諸路\uf69c琞⹄w횖\uea94暈汓鈩Շ컪꽻\uf2ba묖譲ꤷ≴ꤞ堗䉚∍你\uf19eߡᢥ䣗ῼ⍸榟᙮鉲", TextUtils.lastIndexOf("", '0', 0, 0) + 83, objArr13);
                        o.ea.f.c(strIntern2, ((String) objArr13[0]).intern());
                    }
                    Object[] objArr14 = new Object[1];
                    l("썑ꣴ㸹汭ؒ咻\ue0ad摉ᬋ목겸♱", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10, objArr14);
                    short sShortValue = aVar.a(((String) objArr14[0]).intern(), (Short) (-1)).shortValue();
                    if (sShortValue == -1) {
                        Object[] objArr15 = new Object[1];
                        k((char) (Color.argb(0, 0, 0, 0) + 10320), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 449, 25 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr15);
                        throw new o.en.f(((String) objArr15[0]).intern());
                    }
                    Object[] objArr16 = new Object[1];
                    k((char) ((Process.myPid() >> 22) + 44467), 474 - TextUtils.indexOf("", "", 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16, objArr16);
                    boolean zBooleanValue = aVar.h(((String) objArr16[0]).intern()).booleanValue();
                    if (hVarE instanceof o.m.m) {
                        int i13 = f22754j + 59;
                        f22753i = i13 % 128;
                        if (i13 % 2 != 0) {
                            Object[] objArr17 = {(o.m.m) hVarE, Short.valueOf(sShortValue)};
                            int i14 = o.m.m.f26540m * (-1181685237);
                            o.m.m.f26540m = i14;
                            int iMyUid = Process.myUid();
                            int i15 = o.m.m.f26541o * 56969163;
                            o.m.m.f26541o = i15;
                            o.m.m.a(new Random().nextInt(), i14, i15, iMyUid, -1180611036, objArr17, 1180611036);
                            ((o.m.m) hVarE).o();
                            o.m.m.a((int) Process.getElapsedCpuTime(), Process.myTid(), Thread.currentThread().getPriority(), (int) SystemClock.elapsedRealtime(), 1664058493, new Object[]{(o.m.m) hVarE, Boolean.valueOf(zBooleanValue)}, -1664058492);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        Object[] objArr18 = {(o.m.m) hVarE, Short.valueOf(sShortValue)};
                        int i16 = o.m.m.f26540m * (-1181685237);
                        o.m.m.f26540m = i16;
                        int iMyUid2 = Process.myUid();
                        int i17 = o.m.m.f26541o * 56969163;
                        o.m.m.f26541o = i17;
                        o.m.m.a(new Random().nextInt(), i16, i17, iMyUid2, -1180611036, objArr18, 1180611036);
                        ((o.m.m) hVarE).o();
                        o.m.m.a((int) Process.getElapsedCpuTime(), Process.myTid(), Thread.currentThread().getPriority(), (int) SystemClock.elapsedRealtime(), 1664058493, new Object[]{(o.m.m) hVarE, Boolean.valueOf(zBooleanValue)}, -1664058492);
                    }
                }
                if (hVarE.d() != i.f26500i) {
                    if (o.ea.f.a()) {
                        Object[] objArr19 = new Object[1];
                        k((char) (59939 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), View.MeasureSpec.getSize(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 27, objArr19);
                        String strIntern3 = ((String) objArr19[0]).intern();
                        Object[] objArr20 = new Object[1];
                        k((char) View.getDefaultSize(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 491, Color.red(0) + 52, objArr20);
                        o.ea.f.c(strIntern3, ((String) objArr20[0]).intern());
                    }
                    Object[] objArr21 = new Object[1];
                    k((char) (KeyEvent.normalizeMetaState(0) + 63579), ExpandableListView.getPackedPositionType(0L) + SanyoMakernoteDirectory.TAG_SCENE_SELECT, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 15, objArr21);
                    Object[] objArr22 = {aVar, ((String) objArr21[0]).intern()};
                    int i18 = o.ef.a.f23778l * 493926616;
                    o.ef.a.f23778l = i18;
                    int i19 = o.ef.a.f23779m * 1131312688;
                    o.ef.a.f23779m = i19;
                    hVarE.d(((Integer) o.ef.a.a(1122077797, objArr22, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i18, i19)).intValue());
                    int i20 = f22754j + 67;
                    f22753i = i20 % 128;
                    int i21 = i20 % 2;
                }
                return hVarE;
            } catch (IllegalArgumentException e3) {
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr23 = new Object[1];
                l("唨ꏋ\u200f⋧ꦙḍ朌䱢\uea92\ud81b㝜퐛쟲櫬扷썒➚\ue0f2扷썒䜵ᱛ\uee10䣊ṏ鸱ⴹ廣漽ꁯ㔞頩\uef1d쐤\u2d2f\uaaf9\uf284稈", 37 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr23);
                throw new o.en.f(sb2.append(((String) objArr23[0]).intern()).append(e3.getMessage()).toString());
            }
        } catch (o.ef.b e4) {
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr24 = new Object[1];
            l("喻凍䜵ᱛ캍쑠봓㝏\uf3ca㊈扷썒䜵ᱛ軘怬\ue783឵\uea94暈汓鈩᙮鉲你\uf19e䢱兎螤\ue96c\uf749ꐅ\uf458퇜⩽腏㱲ﻊ\uf282歹茣\uf04d箱ↀ☈萉㝜퐛쟲櫬扷썒➚\ue0f2扷썒䜵ᱛ䄻瓙㝜퐛鹽䨜\ue469鱡\uf502ސ", 68 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr24);
            throw new o.en.f(sb3.append(((String) objArr24[0]).intern()).append(e4.getMessage()).toString());
        }
    }

    static void init$0() {
        $$a = new byte[]{106, 120, -13, -92};
        $$b = 15;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(char r23, int r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.db.e.k(char, int, int, java.lang.Object[]):void");
    }

    private static void l(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 27;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        o.a.g gVar = new o.a.g();
        char[] cArr2 = new char[cArr.length];
        int i6 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[i6] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i7 = 58224;
            int i8 = i6;
            while (i8 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i6];
                int i9 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) f22747c) ^ (-7511683281764982996L))));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f22752h);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i6] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        int iLastIndexOf = 269 - TextUtils.lastIndexOf("", '0');
                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int offsetAfter = 11 - TextUtils.getOffsetAfter("", i6);
                        byte b2 = (byte) i6;
                        byte b3 = b2;
                        String str$$c = $$c(b2, b3, (byte) (36 | b3));
                        Class[] clsArr = new Class[4];
                        clsArr[i6] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = o.d.d.a(iLastIndexOf, fadingEdgeLength, offsetAfter, -1995022631, false, str$$c, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) f22746b) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f22749e)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(Color.blue(0) + 270, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, -1995022631, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 36)))), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    int i11 = $10 + 111;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    i6 = 0;
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
                objA3 = o.d.d.a(KeyEvent.getDeadChar(0, 0) + 270, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 10 - TextUtils.indexOf((CharSequence) "", '0'), -2074123590, false, $$c(b6, b7, (byte) ((b7 + 33) - (33 & b7))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i6 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }
}
