package o.bh;

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
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Random;
import o.a.o;
import o.bh.g;
import o.br.a;
import o.ea.f;
import o.m.h;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends o.ab.e<d> implements e, g.b {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static long A = 0;
    private static char[] B = null;
    private static int C = 0;
    private static int E = 0;
    private static int H = 0;
    private static int I = 0;

    /* JADX INFO: renamed from: q */
    public static int f21153q = 0;

    /* JADX INFO: renamed from: s */
    public static int f21154s = 0;

    /* JADX INFO: renamed from: t */
    public static int f21155t = 0;

    /* JADX INFO: renamed from: w */
    public static int f21156w = 0;

    /* JADX INFO: renamed from: x */
    public static int f21157x = 0;
    private boolean D;

    /* JADX INFO: renamed from: f */
    o.h.d f21158f;

    /* JADX INFO: renamed from: g */
    boolean f21159g;

    /* JADX INFO: renamed from: j */
    o.i.d f21160j;

    /* JADX INFO: renamed from: k */
    String f21161k;

    /* JADX INFO: renamed from: l */
    boolean f21162l;

    /* JADX INFO: renamed from: m */
    String f21163m;

    /* JADX INFO: renamed from: n */
    o.ef.a f21164n;

    /* JADX INFO: renamed from: o */
    o.ad.d f21165o;

    /* JADX INFO: renamed from: p */
    boolean f21166p;

    /* JADX INFO: renamed from: r */
    final Object f21167r;

    /* JADX INFO: renamed from: u */
    private boolean f21168u;

    /* JADX INFO: renamed from: v */
    private final o.dd.g f21169v;

    /* JADX INFO: renamed from: y */
    private o.bh.d f21170y;

    /* JADX INFO: renamed from: z */
    private Collection<h> f21171z;

    /* JADX INFO: renamed from: o.bh.b$3 */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: b */
        private static int f21172b = 1;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f21173c;

        /* JADX INFO: renamed from: e */
        private static int f21174e = 0;

        static {
            int[] iArr = new int[o.cg.h.values().length];
            f21173c = iArr;
            try {
                iArr[o.cg.h.f22342e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21173c[o.cg.h.f22339a.ordinal()] = 2;
                int i2 = f21174e;
                int i3 = (((-1) - (((-1) - i2) & ((-1) - 105))) << 1) - (i2 ^ 105);
                f21172b = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21173c[o.cg.h.f22341d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21173c[o.cg.h.f22340b.ordinal()] = 4;
                int i6 = f21174e;
                int i7 = ((103 | i6) << 1) - (i6 ^ 103);
                f21172b = i7 % 128;
                int i8 = i7 % 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static class c extends o.ab.c<b> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: f */
        private static long f21175f = 0;

        /* JADX INFO: renamed from: g */
        private static int f21176g = 0;

        /* JADX INFO: renamed from: h */
        private static char[] f21177h = null;

        /* JADX INFO: renamed from: j */
        private static int f21178j = 0;

        /* JADX INFO: renamed from: b */
        private final String f21179b;

        /* JADX INFO: renamed from: c */
        private boolean f21180c;

        /* JADX INFO: renamed from: d */
        private boolean f21181d;

        /* JADX INFO: renamed from: i */
        private boolean f21182i;

        private static String $$d(short s2, int i2, short s3) {
            int i3 = s2 * 4;
            int i4 = (s3 * 2) + 4;
            byte[] bArr = $$a;
            int i5 = 105 - i2;
            byte[] bArr2 = new byte[i3 + 1];
            int i6 = -1;
            if (bArr == null) {
                i5 += i3;
                i4++;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i5;
                if (i6 == i3) {
                    return new String(bArr2, 0);
                }
                i5 += bArr[i4];
                i4++;
            }
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f21178j = 0;
            f21176g = 1;
            char[] cArr = new char[1010];
            ByteBuffer.wrap("\u0094³\u0097\u0006\u0093¨\u009e^\u009aØ\u0085`\u0081\f\u008dº\u0088%´Ó·W³à¿\u008bº4¦Ñ¡E\u00adæë\u0013è\u0083ì!á\u0084å\u0010ú²þ\u009bò2÷¼ËXÈîÌsÀ\u0000Å¹Ù\u0003ÞÔÒxÖ\u0000«\u009a¯7¬Ô a¥÷¹\u0095½i²´¶X\u008bî\u008fÅ\u0083\u001e\u0080¼\u0084M\u0099ò\u009dx\u0091H\u0096°j}o×ceg\u0004dÙx>}ÕqSvåJ\u008fN1C´GHD¦X2\\TQ½UM*È.d\"I'\u009f;48Ø<l1ì5\u0092\t<\u000eÈ\u0002Y\u0007á\u001bÄ\u001f\r\u001c»\u0010E\u0015ç\u0094\u0080\u0097\u0010\u0093²\u009e\u0017\u009a\u0083\u0085!\u0081\u0019\u008d°\u0088>´Ô·b³î¿\u0092º0¦ß¡E\u00ad¢©\u0094Ô\u000eÐ¨ÓLßåÚmÆ\u0007\u0094\u0080\u0097\u0010\u0093²\u009e\u0017\u009a\u0083\u0085!\u0081\n\u008d¶\u0088'´Ò·`³ê¿Æº4¦Ñ¡E\u00adã©\u0092Ô\tÐªÓ[ßÿÚ|ÆCÂ©Í!ÉËôkðVü\u009bÿ%ûÑæwâæî\u0088é2\u0015ª\\¦_6[\u0094V1R¥M\u0007I?E\u0080@\u0018|ó\u007fW{Çw´r\u0016nõileÐaº\u001c%\u0018\u008f\u001b8\u0017Å\u0012K\u000e4\n\u0089\u0005\u0002\u0001ð<\\84÷Oôßð}ýØùLæîâÂîrëà×\nÔ«Ð%ÜJÙâÅ\u001aÂ\u0080ÎmÊ[·Ö³|°\u0099¼;¹©¥Ø¡|®áª\n\u0097¤\u0093Ð\u009fI\u009cá\u0098T\u0085¯\u0081/\u008dB\u008aívhs\u009c\u007f2{XWyTéPK]îYzFØBòNOKÝw t\u0084p\u0018|xy\u0080e(b±n\u000fje\u0017ã\u0013_\u0010³\u001c\u0001\u0019\u009e\u0005ô\u0001\u0003\u000eÆ\n87\u00973ú?u<Ê86\u0094\u0080\u0097\u0010\u0093²\u009e\u0017\u009a\u0083\u0085!\u0081,\u008d¶\u0088)´Õ·z³æ¿\u0085º8¦Ü¡\u000b\u00adä©\u0094Ô\u0005Ð«ÓKßãÚmÆCÂµÍ#É\u0084ô~ð\u0015ü\u009dÿ)ûÍæsâñî\u0095é8\u0015 \u0010\u0001\u001cµ\u0018Ó\u001b\u000b\u0007¿\u0002[\u000eÝ\tr5\u00101¾<,ý\bþ\u0098ú:÷\u009fó\u000bì©è ä)á\u00adÝVÞùÚtÖ\u001dÓ¸ÏVÈÄÄ*À\u001f½\u0085¹,ºÝ¶|³î¯\u008f«r¤· I\u009dä\u0099\u008e\u0095\u000e\u0096¦\u0092@\u008fÿ\u0094\u0080\u0097\u0010\u0093²\u009e\u0017\u009a\u0083\u0085!\u0081\u0016\u008d¦\u0088&´Ñ·4³î¿\u0085º-¦Ù¡]\u00adã©\u0081Ô\u0005Ð¨ÓPß±ÚzÆ\u0006Â©Í=ÉËôqð\u0005ü\u008cé¡ê1î\u0093ã6ç¢ø\u0000ü)ð\u0087õ\u0019ÉïÊ@ÎÇÂ©Ç\u001fÛ±Ü}ÐÊÔ ©%\u00adÆ®o¢Å§Z»*¿Û°\u001c´ä\u0089G\u008d;\u0081§\u0082\u0000\u0086þ\u009b\u0013\u009fÖ\u0093¸\u0094\u0015h\u008amiaÏe·f/zÜ\u007fssütHH5LÑA\u0004EìF@ZÄ^ S\u0016Wó(h,Ö ²%#9\u008b\u0094\u0080\u0097\u0010\u0093²\u009e\u0017\u009a\u0083\u0085!\u0081\b\u008d¦\u00888´Î·a³æ¿\u0088º>¦\u0090¡\\\u00adë©\u0081Ô\u0004ÐçÓNßäÚ{Æ\u000bÂúÍ=ÉÅôfð\u001aü\u0086ÿ!ûßæ2âèî\u0093é4\u0015¥\u0010D\u001cü\u0018Ó\u001b\u0005\u0007¯\u0002\u0014\u000eÝ\tc5\u001a1µ<\"8Ô;p'è#Ç.8*ÃUGQî]ÚX\u0005D°GKCæN)J\u0012v¾qA}Õxsd\u0019`\u009dc$\u0094\u0080\u0097\u0010\u0093²\u009e\u0017\u009a\u0083\u0085!\u0081\u0016\u008d¼\u0088j´Í·a³ü¿\u008eºy¦À¡J\u00adû©\u0099Ô\u0003Ð¦ÓZß±ÚaÆ\rÂúÍ%ÉÐôkð\u0006üÉÿ2ûÞæaâõî\u0093é9\u0015½\u0010D\u001c¸\u0018\u0092\u001b\u0004\u0007¹\u0002\u0014\u000eÁ\ti5Y1 <>8Ñ;}'¬#\u0089.1*ÅUAQå]\u0093X\u000eD¥GKCÿNfJ\u000evûqF}Êx<d\u0012`\u0096c1oÝjp\u0096þ\u0092Ý\u009dy\u0099ï\u0084V\u0080ì\u008c\u0082\u008f\u0018\u008b·¶\\²Â½`¹^¥¦ !¬×¯r«\u00ad×\u008aÒ*ÞÚÙEÅ Á\u008bÌ'È¶ËT÷·ò~þ\u0000ú¡å_áÅì|è\u0010\u0096k\u0095û\u0091Y\u009cü\u0098h\u0087Ê\u0083à\u008fL\u008aÎ¶&µ\u008f±\r½c¸Õ¤{£¡¯\u0007«zÖ§Ò[Ñ´Ý\u0013Ø\u0097ÄáÀ_ÏÁËoö\u0084òèþqýÃùpä\u0089à\u000fìnëÐ\u0017J\u0012«\u001e\u0017\u001a8\u0019õ\u0005Y\u0000ÿ\f&\u000b\u00887²3I>Å:*9\u009b%\u000e!z,Ð(>WãS\u000e_cZéFBEôA\u0013L\u008dHÿtYs¿\u007f'z\u0094fýbqaÃm<h\u0096ÊSÉÃÍaÀÄÄPÛòßÛÓrÖöê\ré¢í/áFäãø\rÿ\u009fóq÷V\u008aÊ\u008eg\u008d\u0085\u0081b\u0084\u009f\u0098Ñ\u009c}\u0093ÿÁÕÂEÆçËBÏÖÐtÔHØôÝmá\u0087â3æúêÄïdó\u0080ô\u0010ø÷üÐ\u0081K\u0085ý\u0086\b\u008a¡\u008f.\u0093E\u0097æ\u0098v\u009c\u0096¡j¥S©Éªf®\u0086³g·\u0094»È¼v@ú\u0094\u0080\u0097\u0010\u0093²\u009e\u0017\u009a\u0083\u0085!\u0081\u001c\u008d¶\u00889´Ä·z³ì¿\u008eº+¦ß¡E\u00adë©\u008fÔ\tÐ£Ó\u001eßáÚ}Æ\u0010Â²ÍmÉÀô~ð\u0002ü\u0088ÿ`û\u0096æ2âÒî\u009dé>\u0015º\u0010\u0001\u001cþ\u0018\u009c\u001b\u0018\u0007ý\u0002Z\u000eÊ\tq5Y1 <>8Ñ;}\u0094\u0080\u0097\u0010\u0093²\u009e\u0017\u009a\u0083\u0085!\u0081\b\u008d¦\u00889´Õ·4³ë¿\u0087º-¦Ñ¡\u000b\u00adò©\u0087Ô\u0003Ð·Ó[ßãÚdÆ\u001aÂúÍ=ÉÖôpð\u0015ü\u008cÿ3ûÈæwâáGKDÛ@yMÜIHVêRÃ^j[îg\u0015dº`7l^iûu\u0015r\u0087~iz_\u0007Ä\u0003x\u0000\u009c\f,\t¢\u0015Ü\u0011x\u001eé\u001a\u0001'ô#Ï/G,ø(\u00005¶1 =D:ù\u0094\u0080\u0097\u0010\u0093²\u009e\u0017\u009a\u0083\u0085!\u0081\u0019\u008d°\u0088>´Ô·b³î¿\u0092º0¦ß¡E\u00ad¢©\u0087Ô\tÐ´ÓNßþÚfÆ\u0010Â¿ÍmÉÔômð\u0019ü\u008aÿ%ûÈæaâìî\u0092é0\u0015î\u0010G\u001cù\u0018\u009a\u001b\u0006\u0007¨\u0002F\u000eÊ\u0006\u008d\u0005\u001d\u0001¿\f\u001a\b\u008e\u0017,\u0013\u0014\u001f½\u001a3&Ù%o!ã-\u009f(=4Ò3H?¯;\u008aF\u0004B¹ACMóHkT\u001dP²_`[Ùf`b\u0014n\u0087m(iÅtlpá|\u009f{=\u0087ã\u0082_\u008eà\u008a\u009d\u0089\u0004\u0095µ\u0090J\u009cÑ\u0080s\u0083æ\u0087H\u008a¾\u008e8\u0091\u0080\u0095ì\u0099Z\u009cÅ 3£Ô§\u0018«g®Ð²$µ¢¹\f½rÀ¬ÄAÇ±Ë\u0003ÎÈÒóÖOÙÞÝ,àßäøèfëÔï2ò\u0094ö\fú\u007fýÖ\u0001Z\u0004¨\b\u0017\f}\u0094\u009d\u0097\u000b\u0093\u008e\u009eR\u009aß\u0085t\u0081\u001d\u008d \u0088>´î·a³ì¿\u0085º<¦Ã¡X\u0094\u009d\u0097\u000b\u0093\u008e\u009eR\u009aß\u0085t\u0081\u001d\u008d \u0088>´û·u³æ¿\u008a".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1010);
            f21177h = cArr;
            f21175f = 5100730942353610597L;
        }

        c(b bVar, String str) {
            super(bVar, false);
            this.f21180c = false;
            this.f21181d = false;
            this.f21182i = false;
            this.f21179b = str;
        }

        static void init$0() {
            $$a = new byte[]{64, -84, MessagePack.Code.MAP32, -5};
            $$b = 33;
        }

        private void l() throws Throwable {
            String str;
            boolean z2;
            Object[] objArr = new Object[1];
            m((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionType(0L), 17 - View.MeasureSpec.getMode(0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            if (this.f21179b == null) {
                synchronized (e().f21167r) {
                    if (this.f21182i) {
                        if (f.a()) {
                            Object[] objArr2 = new Object[1];
                            m((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), TextUtils.indexOf("", "") + 89, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25, objArr2);
                            f.c(strIntern, ((String) objArr2[0]).intern());
                        }
                        return;
                    }
                    if (!b()) {
                        if (f.a()) {
                            Object[] objArr3 = new Object[1];
                            m((char) Color.alpha(0), 113 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 37, objArr3);
                            f.d(strIntern, ((String) objArr3[0]).intern());
                        }
                        return;
                    }
                    this.f21181d = true;
                    o.bu.e.a().d(h(), true, false);
                    o.ad.d dVarA = new o.bh.c(h(), e().f21158f, e().f21162l).a(e().f21160j);
                    if (!((Boolean) o.u.e.a((int) SystemClock.uptimeMillis(), -692343172, (int) Runtime.getRuntime().maxMemory(), new Random().nextInt(), new Object[]{dVarA}, (int) Runtime.getRuntime().totalMemory(), 692343174)).booleanValue() || dVarA.l()) {
                        if (f.a()) {
                            String strD = d();
                            Object[] objArr4 = new Object[1];
                            m((char) (51238 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 150 - (ViewConfiguration.getFadingEdgeLength() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 28, objArr4);
                            f.c(strD, ((String) objArr4[0]).intern());
                        }
                        f().d(o.bg.a.ae);
                        return;
                    }
                    int i2 = o.ad.d.f20137a * (-231849454);
                    o.ad.d.f20137a = i2;
                    int i3 = o.ad.d.f20140h * (-1119816026);
                    o.ad.d.f20140h = i3;
                    int iNextInt = new Random().nextInt(1133826221);
                    int i4 = o.ad.d.f20141i * (-828000951);
                    o.ad.d.f20141i = i4;
                    if (((Boolean) o.ad.d.a(new Object[]{dVarA}, 647439991, i2, iNextInt, -647439990, i3, i4)).booleanValue() || dVarA.o()) {
                        if (f.a()) {
                            String strD2 = d();
                            Object[] objArr5 = new Object[1];
                            m((char) (25552 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Drawable.resolveOpacity(0, 0) + 179, 40 - KeyEvent.keyCodeFromString(""), objArr5);
                            f.c(strD2, ((String) objArr5[0]).intern());
                        }
                        f().d(o.bg.a.ak);
                    }
                    e().f21165o = dVarA;
                    o.dj.a.c(e());
                    if (f.a()) {
                        String strD3 = d();
                        Object[] objArr6 = new Object[1];
                        m((char) (50168 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (-16776997) - Color.rgb(0, 0, 0), 'P' - AndroidCharacter.getMirror('0'), objArr6);
                        f.c(strD3, ((String) objArr6[0]).intern());
                    }
                    e().n();
                    Object[] objArr7 = {f()};
                    int i5 = o.bg.c.f21082a * 1232037242;
                    o.bg.c.f21082a = i5;
                    int iMyUid = Process.myUid();
                    int i6 = o.bg.c.f21083c * 1942342535;
                    o.bg.c.f21083c = i6;
                    if (!((Boolean) o.bg.c.a(i5, i6, iMyUid, -1017985026, objArr7, 1017985027, new Random().nextInt())).booleanValue()) {
                        if (f.a()) {
                            Object[] objArr8 = new Object[1];
                            m((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 250, 48 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr8);
                            f.d(strIntern, ((String) objArr8[0]).intern());
                        }
                        o.dj.a.d(e());
                        return;
                    }
                    if (f.a()) {
                        Object[] objArr9 = new Object[1];
                        m((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 27016), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 299, 33 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr9);
                        f.c(strIntern, ((String) objArr9[0]).intern());
                    }
                }
            }
            o.ef.a aVar = e().f21164n;
            if (aVar == null) {
                if (f.a()) {
                    Object[] objArr10 = new Object[1];
                    m((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), Color.green(0) + 332, 29 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr10);
                    f.d(strIntern, ((String) objArr10[0]).intern());
                    return;
                }
                return;
            }
            synchronized (e().f21167r) {
                if (this.f21182i) {
                    if (f.a()) {
                        Object[] objArr11 = new Object[1];
                        m((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 89 - (ViewConfiguration.getScrollBarSize() >> 8), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24, objArr11);
                        f.c(strIntern, ((String) objArr11[0]).intern());
                    }
                    return;
                }
                if (this.f21179b != null) {
                    if (f.a()) {
                        Object[] objArr12 = new Object[1];
                        m((char) (32032 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 362 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 59, objArr12);
                        f.c(strIntern, ((String) objArr12[0]).intern());
                    }
                    str = this.f21179b;
                    z2 = true;
                } else {
                    if (e().f21163m != null) {
                        if (f.a()) {
                            Object[] objArr13 = new Object[1];
                            m((char) Color.blue(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 421, 70 - TextUtils.indexOf("", ""), objArr13);
                            f.c(strIntern, ((String) objArr13[0]).intern());
                        }
                        o.dj.a.d(e());
                        str = e().f21163m;
                    } else {
                        Object[] objArr14 = {o.bk.e.d(h()).e()};
                        int i7 = o.br.a.f21541e * (-371875515);
                        o.br.a.f21541e = i7;
                        int id = (int) Thread.currentThread().getId();
                        int i8 = o.br.a.f21539c * 248001262;
                        o.br.a.f21539c = i8;
                        if (((a.b) o.br.a.e(i8, id, objArr14, -1023910309, 1023910309, (int) Thread.currentThread().getId(), i7)) == a.b.f21551b) {
                            if (f.a()) {
                                Object[] objArr15 = new Object[1];
                                m((char) (747 - View.MeasureSpec.getSize(0)), 598 - Color.green(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 72, objArr15);
                                f.c(strIntern, ((String) objArr15[0]).intern());
                            }
                            this.f21180c = true;
                            return;
                        }
                        if (f.a()) {
                            Object[] objArr16 = new Object[1];
                            m((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), AndroidCharacter.getMirror('0') + 443, ((Process.getThreadPriority(0) + 20) >> 6) + 107, objArr16);
                            f.c(strIntern, ((String) objArr16[0]).intern());
                        }
                        o.dj.a.d(e());
                        str = null;
                    }
                    z2 = false;
                }
                if (str != null) {
                    if (f.a()) {
                        Object[] objArr17 = new Object[1];
                        m((char) (AndroidCharacter.getMirror('0') + 24227), AndroidCharacter.getMirror('0') + 622, (ViewConfiguration.getJumpTapTimeout() >> 16) + 26, objArr17);
                        f.c(strIntern, ((String) objArr17[0]).intern());
                    }
                    boolean zD = e().d(str);
                    Object[] objArr18 = {f()};
                    int i9 = o.bg.c.f21082a * 1232037242;
                    o.bg.c.f21082a = i9;
                    int iMyUid2 = Process.myUid();
                    int i10 = o.bg.c.f21083c * 1942342535;
                    o.bg.c.f21083c = i10;
                    if (!((Boolean) o.bg.c.a(i9, i10, iMyUid2, -1017985026, objArr18, 1017985027, new Random().nextInt())).booleanValue()) {
                        if (f.a()) {
                            String strD4 = d();
                            Object[] objArr19 = new Object[1];
                            m((char) (21845 - Color.red(0)), (ViewConfiguration.getScrollBarSize() >> 8) + IptcDirectory.TAG_JOB_ID, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 37, objArr19);
                            f.c(strD4, ((String) objArr19[0]).intern());
                        }
                        o.dj.a.d(e());
                        return;
                    }
                    if (zD) {
                        if (!z2) {
                            f().d(o.bg.a.f21036e);
                            o.dj.a.d(e());
                            return;
                        }
                        if (f.a()) {
                            String strD5 = d();
                            Object[] objArr20 = new Object[1];
                            m((char) TextUtils.getOffsetAfter("", 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 732, KeyEvent.getDeadChar(0, 0) + 50, objArr20);
                            f.c(strD5, ((String) objArr20[0]).intern());
                        }
                        this.f21180c = true;
                        return;
                    }
                    if (f.a()) {
                        String strD6 = d();
                        Object[] objArr21 = new Object[1];
                        m((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 784, TextUtils.indexOf("", "", 0, 0) + 34, objArr21);
                        f.c(strD6, ((String) objArr21[0]).intern());
                    }
                    o.dj.a.d(e());
                }
                if (f.a()) {
                    Object[] objArr22 = new Object[1];
                    m((char) (KeyEvent.getDeadChar(0, 0) + 54219), 816 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getEdgeSlop() >> 16) + 36, objArr22);
                    f.c(strIntern, ((String) objArr22[0]).intern());
                }
                Object[] objArr23 = {e(), aVar};
                int iNextInt2 = new Random().nextInt();
                int i11 = b.f21154s * 775587431;
                b.f21154s = i11;
                b.b(45001523, i11, (int) Runtime.getRuntime().maxMemory(), new Random().nextInt(), objArr23, -45001523, iNextInt2);
                Object[] objArr24 = {f()};
                int i12 = o.bg.c.f21082a * 1232037242;
                o.bg.c.f21082a = i12;
                int iMyUid3 = Process.myUid();
                int i13 = o.bg.c.f21083c * 1942342535;
                o.bg.c.f21083c = i13;
                if (((Boolean) o.bg.c.a(i12, i13, iMyUid3, -1017985026, objArr24, 1017985027, new Random().nextInt())).booleanValue()) {
                    if (f.a()) {
                        Object[] objArr25 = new Object[1];
                        m((char) (View.combineMeasuredStates(0, 0) + ExifDirectoryBase.TAG_NOISE), 897 - (ViewConfiguration.getEdgeSlop() >> 16), Color.argb(0, 0, 0, 0) + 44, objArr25);
                        f.c(strIntern, ((String) objArr25[0]).intern());
                    }
                    if (e().f21159g) {
                        a.e(h());
                    }
                } else if (f.a()) {
                    Object[] objArr26 = new Object[1];
                    m((char) View.resolveSizeAndState(0, 0, 0), 853 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 44 - ExpandableListView.getPackedPositionType(0L), objArr26);
                    f.c(strIntern, ((String) objArr26[0]).intern());
                }
                Object[] objArr27 = {f()};
                int i14 = o.bg.c.f21082a * 1232037242;
                o.bg.c.f21082a = i14;
                int iMyUid4 = Process.myUid();
                int i15 = o.bg.c.f21083c * 1942342535;
                o.bg.c.f21083c = i15;
                if (!((Boolean) o.bg.c.a(i14, i15, iMyUid4, -1017985026, objArr27, 1017985027, new Random().nextInt())).booleanValue() && f().c() == o.bg.a.B) {
                    f().e().e();
                }
                Object[] objArr28 = {f()};
                int i16 = o.bg.c.f21082a * 1232037242;
                o.bg.c.f21082a = i16;
                int iMyUid5 = Process.myUid();
                int i17 = o.bg.c.f21083c * 1942342535;
                o.bg.c.f21083c = i17;
                if (((Boolean) o.bg.c.a(i16, i17, iMyUid5, -1017985026, objArr28, 1017985027, new Random().nextInt())).booleanValue() || f().c() == o.bg.a.ag || f().c() == o.bg.a.ae) {
                    if (o.c.a.b(h(), false)) {
                        i().c();
                    }
                    if (f().c() == o.bg.a.ag || f().c() == o.bg.a.ae) {
                        o.c.c cVarE = o.c.a.e(h());
                        if (o.c.a.f(h())) {
                            if (cVarE == o.c.c.f21969a) {
                                i().c();
                            } else {
                                i().d();
                            }
                        }
                    }
                }
            }
        }

        private static void m(char c2, int i2, int i3, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            o oVar = new o();
            long[] jArr = new long[i3];
            oVar.f19947b = 0;
            while (oVar.f19947b < i3) {
                int i5 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f21177h[i2 + i5])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 743, (char) Drawable.resolveOpacity(0, 0), 12 - Color.blue(0), 632508977, false, $$d(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 6))), b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f21175f), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        int i6 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 765;
                        char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12469);
                        int iArgb = 12 - Color.argb(0, 0, 0, 0);
                        byte b3 = (byte) (-$$a[3]);
                        objA2 = o.d.d.a(i6, c3, iArgb, 1946853218, false, $$d((byte) 0, b3, (byte) (b3 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA3 = o.d.d.a(387 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getTapTimeout() >> 16) + 18, 39570797, false, $$d(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    int i7 = $10 + 15;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i3];
            oVar.f19947b = 0;
            while (oVar.f19947b < i3) {
                int i9 = $10 + 45;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                    Object[] objArr5 = {oVar, oVar};
                    Object objA4 = o.d.d.a(-723636472);
                    if (objA4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA4 = o.d.d.a(386 - ExpandableListView.getPackedPositionChild(0L), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18, 39570797, false, $$d(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                    int i10 = 44 / 0;
                } else {
                    cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                    Object[] objArr6 = {oVar, oVar};
                    Object objA5 = o.d.d.a(-723636472);
                    if (objA5 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objA5 = o.d.d.a(386 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 18, 39570797, false, $$d(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr);
        }

        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            synchronized (e().f21167r) {
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    m((char) Color.alpha(0), Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16, objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    m((char) (AndroidCharacter.getMirror('0') - '0'), Process.getGidForName("") + 998, 13 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
                    f.c(strIntern, ((String) objArr2[0]).intern());
                }
                o.bg.a aVarC = cVar.c();
                if (aVarC == o.bg.a.B) {
                    Object[] objArr3 = {f()};
                    int i2 = 408235578 * o.bg.c.f21084d;
                    o.bg.c.f21084d = i2;
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int priority = Thread.currentThread().getPriority();
                    int i3 = o.bg.c.f21085e * (-1327944260);
                    o.bg.c.f21085e = i3;
                    o.bg.c.a(i2, priority, iElapsedRealtime, -1640167031, objArr3, 1640167031, i3);
                    e().f21161k = null;
                    e().f21163m = null;
                    e().f21164n = null;
                    b.b(e());
                } else if (aVarC == o.bg.a.ag || aVarC == o.bg.a.ae) {
                    boolean z2 = aVarC == o.bg.a.ag;
                    e().f21166p = true;
                    if (e().f21160j != null) {
                        e().f21160j.e();
                    }
                    e().g().e(z2, o.f.b.c(h()), cVar);
                } else if (aVarC != o.bg.a.ah) {
                    e().f21166p = true;
                    if (e().f21160j != null) {
                        e().f21160j.e();
                    }
                    e().g().c(cVar);
                } else if (e().f21160j != null) {
                    e().f21160j.e();
                }
            }
        }

        @Override // o.ab.c
        public final void c() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f21178j + 99;
            f21176g = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = {j(), h()};
            int i5 = o.c.a.f21922i * 1809095941;
            o.c.a.f21922i = i5;
            int i6 = o.c.a.f21923j * (-208500124);
            o.c.a.f21923j = i6;
            o.c.a.e(objArr, 367855230, (int) Runtime.getRuntime().freeMemory(), i5, i6, -367855229, (int) SystemClock.uptimeMillis());
            int i7 = f21178j + 39;
            f21176g = i7 % 128;
            int i8 = i7 % 2;
        }

        @Override // o.ab.c
        public final void c(o.bg.c cVar) throws Throwable {
            if (this.f21180c) {
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    m((char) (ImageFormat.getBitsPerPixel(0) + 1), ViewConfiguration.getMaximumFlingVelocity() >> 16, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17, objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    m((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 5344), 941 - KeyEvent.keyCodeFromString(""), 40 - View.resolveSize(0, 0), objArr2);
                    f.c(strIntern, ((String) objArr2[0]).intern());
                    return;
                }
                return;
            }
            synchronized (e().f21167r) {
                if (f.a()) {
                    Object[] objArr3 = new Object[1];
                    m((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.red(0), 17 - KeyEvent.normalizeMetaState(0), objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    m((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 981, 16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr4);
                    f.c(strIntern2, ((String) objArr4[0]).intern());
                }
                if (e().f21160j != null) {
                    e().f21160j.e();
                }
                e().f21166p = true;
                e().g().d(cVar, i());
            }
        }

        @Override // o.ab.c
        public final void g() throws Throwable {
            l();
            if (this.f21180c) {
                return;
            }
            b bVarE = e();
            Object[] objArr = {f()};
            int i2 = 1232037242 * o.bg.c.f21082a;
            o.bg.c.f21082a = i2;
            int iMyUid = Process.myUid();
            int i3 = 1942342535 * o.bg.c.f21083c;
            o.bg.c.f21083c = i3;
            bVarE.d(((Boolean) o.bg.c.a(i2, i3, iMyUid, -1017985026, objArr, 1017985027, new Random().nextInt())).booleanValue());
            synchronized (e().f21167r) {
                if (!this.f21182i) {
                    a();
                    this.f21181d = false;
                }
            }
            o.dc.d.a().e(h(), false);
            if (o.dd.b.c(h())) {
                if (f.a()) {
                    Object[] objArr2 = new Object[1];
                    m((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), KeyEvent.keyCodeFromString(""), (ViewConfiguration.getFadingEdgeLength() >> 16) + 17, objArr2);
                    String strIntern = ((String) objArr2[0]).intern();
                    Object[] objArr3 = new Object[1];
                    m((char) (View.getDefaultSize(0, 0) + 32659), 17 - View.resolveSize(0, 0), 72 - ExpandableListView.getPackedPositionGroup(0L), objArr3);
                    f.c(strIntern, ((String) objArr3[0]).intern());
                }
                Object[] objArr4 = {f().e(), h(), j(), o.dd.g.A};
                int i4 = o.bg.b.f21063c * (-1736728553);
                o.bg.b.f21063c = i4;
                int i5 = o.bg.b.f21064d * 798932806;
                o.bg.b.f21064d = i5;
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i6 = o.bg.b.f21061a * 1360672158;
                o.bg.b.f21061a = i6;
                o.bg.b.c(-717841723, objArr4, i4, i6, iElapsedRealtime, 717841723, i5);
            }
        }

        final void o() {
            int i2 = 2 % 2;
            int i3 = f21178j + 9;
            f21176g = i3 % 128;
            int i4 = i3 % 2;
            this.f21182i = true;
            f().d(o.bg.a.ah);
            if (this.f21181d) {
                int i5 = f21178j + 31;
                f21176g = i5 % 128;
                if (i5 % 2 == 0) {
                    a();
                    throw null;
                }
                a();
            }
            int i6 = f21176g + 105;
            f21178j = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public interface d {
        void a();

        void b();

        void c(o.bg.c cVar);

        void d(o.bg.c cVar, o.by.g gVar);

        void e(boolean z2, o.f.a aVar, o.bg.c cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(byte r9, short r10, byte r11) {
        /*
            int r8 = 105 - r10
            int r7 = r11 * 4
            int r1 = r7 + 1
            byte[] r6 = o.bh.b.$$d
            int r0 = r9 * 2
            int r5 = 4 - r0
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r6 != 0) goto L2a
            r2 = r3
            r1 = r5
        L13:
            int r5 = r5 + r8
            int r0 = r1 + 1
            r8 = r5
            r5 = r0
        L18:
            byte r0 = (byte) r8
            r4[r2] = r0
            if (r2 != r7) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L23:
            int r2 = r2 + 1
            r0 = r6[r5]
            r1 = r5
            r5 = r0
            goto L13
        L2a:
            r2 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bh.b.$$j(byte, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21157x = 1626166433;
        f21156w = -1931862192;
        f21155t = 1436413157;
        f21153q = -913114991;
        f21154s = -1461849407;
        H = 0;
        E = 1;
        C = 0;
        I = 1;
        o();
        Process.getGidForName("");
        Process.myTid();
        ViewConfiguration.getScrollBarFadeDuration();
        TextUtils.getCapsMode("", 0, 0);
        Color.blue(0);
        ViewConfiguration.getKeyRepeatTimeout();
        Color.rgb(0, 0, 0);
        ExpandableListView.getPackedPositionForGroup(0);
        TextUtils.lastIndexOf("", '0');
        ViewConfiguration.getKeyRepeatDelay();
        ViewConfiguration.getDoubleTapTimeout();
        CdmaCellLocation.convertQuartSecToDecDegrees(0);
        ViewConfiguration.getMinimumFlingVelocity();
        Color.alpha(0);
        KeyEvent.keyCodeFromString("");
        Process.getElapsedCpuTime();
        View.resolveSizeAndState(0, 0, 0);
        Process.myTid();
        TextUtils.getTrimmedLength("");
        ViewConfiguration.getDoubleTapTimeout();
        PointF.length(0.0f, 0.0f);
        int i2 = E + 5;
        H = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    b(Context context, d dVar, o.en.b bVar, o.dd.g gVar) {
        super(context, dVar, bVar, o.bg.e.f21104b);
        this.f21161k = null;
        this.f21164n = null;
        this.f21163m = null;
        this.f21166p = false;
        this.D = false;
        this.f21167r = new Object();
        this.f21169v = gVar;
    }

    private static void K(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $11 + 1;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(B[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a((ViewConfiguration.getFadingEdgeLength() >> 16) + 742, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 632508977, false, $$j(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 6))), b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(A), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 5);
                    objA2 = o.d.d.a(View.MeasureSpec.getSize(0) + 766, (char) (ExpandableListView.getPackedPositionGroup(0L) + 12470), TextUtils.indexOf("", "", 0, 0) + 12, 1946853218, false, $$j(b3, b4, (byte) (b4 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA3 = o.d.d.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 387, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 19 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 39570797, false, $$j(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i8 = $11 + 79;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                objA4 = o.d.d.a(Color.argb(0, 0, 0, 0) + 387, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 18 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 39570797, false, $$j(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    public static /* synthetic */ Object b(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) throws Throwable {
        int i8 = ~i2;
        int i9 = i6 | i7 | i8;
        int i10 = ~i6;
        int i11 = ~i7;
        int i12 = (i11 + i8) - (i11 & i8);
        int i13 = ~i12;
        int i14 = (i13 + i10) - (i13 & i10);
        int i15 = i8 | i10;
        int i16 = (~((i7 + i15) - (i7 & i15))) | (~(i12 | i6));
        int i17 = i2 + i6 + i3 + (2053704882 * i4) + ((-167119771) * i5);
        int i18 = i17 * i17;
        int i19 = (((-385660469) * i2) - 1543503872) + (1501345335 * i6) + (1203980746 * i9) + (i14 * (-1203980746)) + ((-1203980746) * i16) + ((-1589641216) * i3) + (511705088 * i4) + ((-1639972864) * i5) + (1278279680 * i18);
        int i20 = ((i2 * (-1228230693)) - 288632672) + (i6 * (-1228230521)) + (i9 * (-86)) + (i14 * 86) + (i16 * 86) + (i3 * (-1228230607)) + (i4 * 927583762) + (i5 * (-1784727723)) + (i18 * 1163984896);
        int i21 = i19 + (i20 * i20 * 992935936);
        if (i21 != 1) {
            return i21 != 2 ? b(objArr) : d(objArr);
        }
        b bVar = (b) objArr[0];
        int i22 = 2 % 2;
        if (!bVar.D) {
            c cVar = new c(bVar, bVar.f21161k);
            int i23 = C + 49;
            I = i23 % 128;
            int i24 = i23 % 2;
            return cVar;
        }
        if (f.a()) {
            int i25 = C + 67;
            I = i25 % 128;
            int i26 = i25 % 2;
            Object[] objArr2 = new Object[1];
            K((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), ViewConfiguration.getScrollDefaultDelay() >> 16, 16 - TextUtils.lastIndexOf("", '0', 0), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            K((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 16 - ((byte) KeyEvent.getModifierMetaStateMask()), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 54, objArr3);
            f.c(strIntern, ((String) objArr3[0]).intern());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0331  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bh.b.b(java.lang.Object[]):java.lang.Object");
    }

    static /* synthetic */ void b(b bVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = C + 115;
        I = i3 % 128;
        int i4 = i3 % 2;
        bVar.a();
        int i5 = C + 67;
        I = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object d(Object[] objArr) throws Throwable {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = I + 73;
        C = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            f.a();
            obj.hashCode();
            throw null;
        }
        if (f.a()) {
            Object[] objArr2 = new Object[1];
            K((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 16 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            K((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 161 - ((Process.getThreadPriority(0) + 20) >> 6), 22 - Drawable.resolveOpacity(0, 0), objArr3);
            f.c(strIntern, ((String) objArr3[0]).intern());
            int i4 = C + 87;
            I = i4 % 128;
            int i5 = i4 % 2;
        }
        bVar.g().b();
        return null;
    }

    private static o.ef.a e(String str, String str2) throws Throwable {
        int i2 = 2 % 2;
        o.ef.a aVar = new o.ef.a();
        Object[] objArr = new Object[1];
        K((char) (48043 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 377, View.resolveSize(0, 0) + 7, objArr);
        aVar.a(((String) objArr[0]).intern(), (Object) str);
        Object[] objArr2 = new Object[1];
        K((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getTouchSlop() >> 8) + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, ((byte) KeyEvent.getModifierMetaStateMask()) + 10, objArr2);
        aVar.a(((String) objArr2[0]).intern(), (Object) str2);
        int i3 = I + 65;
        C = i3 % 128;
        int i4 = i3 % 2;
        return aVar;
    }

    static void init$0() {
        $$d = new byte[]{98, -110, MessagePack.Code.BIN16, -94};
        $$e = 130;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ca A[Catch: b -> 0x04dc, TryCatch #4 {b -> 0x04dc, blocks: (B:124:0x016d, B:126:0x01a7, B:128:0x01ad, B:129:0x01d2, B:131:0x0210, B:132:0x0219, B:134:0x0221, B:136:0x0227, B:137:0x0252, B:151:0x02ca, B:153:0x02d0, B:154:0x02f5, B:162:0x035c, B:156:0x0300, B:158:0x0306, B:159:0x032f, B:161:0x0339, B:139:0x025a, B:141:0x0260, B:142:0x0287, B:144:0x0292, B:146:0x0298, B:147:0x02bd, B:166:0x04a7, B:168:0x04ad, B:169:0x04d2, B:130:0x020e), top: B:185:0x016d, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0339 A[Catch: b -> 0x04dc, TryCatch #4 {b -> 0x04dc, blocks: (B:124:0x016d, B:126:0x01a7, B:128:0x01ad, B:129:0x01d2, B:131:0x0210, B:132:0x0219, B:134:0x0221, B:136:0x0227, B:137:0x0252, B:151:0x02ca, B:153:0x02d0, B:154:0x02f5, B:162:0x035c, B:156:0x0300, B:158:0x0306, B:159:0x032f, B:161:0x0339, B:139:0x025a, B:141:0x0260, B:142:0x0287, B:144:0x0292, B:146:0x0298, B:147:0x02bd, B:166:0x04a7, B:168:0x04ad, B:169:0x04d2, B:130:0x020e), top: B:185:0x016d, inners: #1, #2, #3, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private o.bh.g m() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bh.b.m():o.bh.g");
    }

    static void o() {
        char[] cArr = new char[3388];
        ByteBuffer.wrap("\u0094³\u001eH\u008144\u0010¿à\"®Õ\u0090_tÂUu=øËcÎ\u0016³\u0099\u009a\u0003M¶+9\u0006\u0094\u0090\u001e^\u0081)4\u0015¿ò\"\u008eÕ\u0097_dÂTu0øÜcÀ\u0016\u00ad\u0099\u009c\u0003\f¶h9B¬úWÓÚ\u009dLo÷Iz5íù\u0090Ã\u001b¬\u008e\u009601»/.\u0005ÑóDÇÏ¦qnäDoy\u0012\u0019\u0085Ý\bä³\u0099%u¨]S\rÆ¡I\u0093ü÷fméG\u009c-\u0007\t\u008aä=  \u0088*x\u0094\u0096\u001eB\u008134\u001a¿ù\"¡Õ\u008a_xÂYu'ø¨c\u008c\u0016þ\u0099\u0096\u0003O¶19\u000b¬íWÑÚ\u009dLo÷Pz:í\u00ad\u0090Ë\u001b¯\u008e\u008a0t»/.\u0003ÑåD\u0095Ï³qiäOo+\u0012\u0002\u0085Ê\b ³Ý%u¨ASHÆåIÑü¹fié\u0005\u009co\u0007[\u008aù=® \u0088*pÝF@\u0004Ëä~Ä\u0094\u0096\u001eB\u008134\u001a¿ù\"¡Õ\u008a_xÂYu'ø¨c\u008c\u0016þ\u0099\u0096\u0003N¶*9\u0010¬ïWÙÚ\u0087La÷\u001fz5íî\u0090Þ\u001bª\u008e\u008e0p»:.\u000eÑóDÛ\u0094\u0081\u001eC\u0081/4\u000b¿â\"\u008eÕ\u0087_iÂSu%øécÕ\u0016·\u0099\u0098\u0003B¶\n9\f¬ÜWßÚ\u0080Lh÷XF=ÌçS\u008dæ½mtð\u000f\u00073\u008d×\u0010ï§\u0091*_±kÄ\u0012K:ÑÀd\u0088ë\u0086~W\u0085z\b$\u009eÂÉ\u0099CAÜ\ni\u0012âæ\u007f¢\u0088\u0086\u0002p\u009f](6¥ø>ÌKµÄ\u009d^zë$d\u0005ñú\nÝ\u0087\u009b\u0011gª_'p°¤Í\u008eF¢Ó\u0092mvæ8s\u001a\u008cè\u0019Å\u0092³,k¹\u00042>O\u001dØÅU´î\u009cxpõC\u000eL\u009b¿\u0014\u009a\u0094\u009d\u001eE\u0081\u000e4\u0016¿â\"¦Õ\u0082_tÂYu2øücÈ\u0016±\u0099\u0099\u0003~¶ 9\u0001¬þWÙÚ\u009fLc÷[ztí \u0090\u008a\u001b¢\u008e\u009b0e»'.\u0011ÑýDÁÏ»qdäNoy\u0012\u0017\u0085Í\b«³\u008f%n¨VS\fÆ¡IÑü¥f,éA\u009c-\u0007\u0015\u008aõ=é Ë*?ÝG@\u0019Ëå~Óá¨\u0094\u0098\u001e@\u0081 §\u0086-^²\u0015\u0007\r\u008cù\u0011½æ\u0099loñBF)ËçPÓ%ªª\u00820e\u0085;\n\u001a\u009fådÂé\u0084\u007fxÄ@IoÞ»£\u0091(«½\u0097\u0003k\u0088'\u001d\bâîwÀü®B0×Z\\!!\u0019¶Ý;©\u0080\u0087\u0016u\u009bA`\u001cõô\u0094\u009d\u001eE\u0081\u000e4\u0016¿â\"¦Õ\u0082_tÂYu2øücÈ\u0016±\u0099\u0099\u0003~¶ 9\u0001¬þWÙÚ\u009fLc÷[/)¥á:\u0092\u008f¾\u0004R\u0099\u0005n+\u0094\u0081\u001eN\u008134\n¿ÿ\" Õ\u008a_TÂ^á/káô\u0096AªÊMW1 8*Ö·ì\u0000\u009a\u008dV\u0016jc\bì'výÃ¨L¸ÙU\"z¯39Ê\u0082ô\u000fË\u0098\u001få5n\fû5EËÎ\u0087[±¤L1\u007fº\u001e\u0004\u0094\u0091ï\u001a\u0094g¦ðs}\u001eÆ1PÖÝ¬&³³Q<d\u0089\u001b\u0013Ý\u009c½é\u0089räÿJH\u0018Õ=_\u0080¨û5 ¾Z\u000bl\u0094\u0002á<kýô\u0081AãÊ\u0007W- \u0012*Ð·ô\u0000\u008a\u008dU\u0016;c\rì+vÀÃ\u009eL°ÙD\"(¯29Ù\u0082é\u000f\u008d\u0098¹åwn\rû)EÄÎ\u009c\u0094\u0090\u001e^\u0081)4\u0015¿ò\"\u008eÕ\u0087_iÂSu%øécÕ\u0016·\u0099\u0098\u0003B¶\u00179\u0007¬êWÅÚ\u008cLu÷Kztí \u0090\u008a\u001b³\u008e\u008a0t»8.\u000eÑóDÀÏ¡q+äPo+\u0012\u0019\u0085Ì\b¡³\u008e%i¨\u0013S\rÆïIÚü÷f|éW\u009c-\u0007\u000b\u008aõ=» \u008a*fÝ\u0014@@Ëª~àá·\u0094\u009f\u001eZ\u0081.4\u0012¿à\"×\u0094\u0093\u001eH\u008144\u0010¿à\"®Õ\u0090_tÂUu=øÎcÈ\u0016¬\u0099\u0084\u0003X¶\u00159\u0003¬éWÄÚÉL+÷\u001fz:íâ\u0090\u008a\u001b³\u008e\u008d0b»&.GÑñDÐÏ¡qxäAo>\u0012\u001f\u0085Á\b£³Ý%j¨AS\u0007Æ÷I×ü³fiéW\u009cb\u0007\u001f\u008aõ=¯ \u008f*qÝQ@\t2²¸\u007f'H\u0092>\u0019Þ\u0084\u009ds§ùWdsÓ\u0005^\u0080Åá°\u0097?£¥i\u0010\u0006\u009f\u000b\nÓñú|¦êNQ|Ü3KÈ6ø½\u008c(¨\u0096V\u001d\u001c\u0088(wÕâýi£×EBcÉ\u0011´\u001e#æ®²\u0015®\u0083O\u000e}õ\u0003`ÂïëZ\u0082ÀKOd:\r¡3,Ñ\u009b¿\u0006²\u008cV{dæ\"mÈØàG\u008c\u0094\u0093\u001eH\u008144\u0010¿à\"®Õ\u0090_tÂUu=øÎcÈ\u0016¬\u0099\u0084\u0003X¶\u00159\u0003¬éWÄÚÉL+÷\u001fz2íâ\u0090Ø\u001b \u008e\u009d0^» .\u000bÑõDÛÏ·qJäCo-\u0012\u001f\u0085Ù\b¥³\u0089%s¨\\S\u0006ÆÖIÖü²fbék\u009c-\u0007+\u008aå=º \u008e*RÝQ@\u001eËù~Âá¿\u0094\u0098\u001e@\u0081 4/¿ð\"ÀÕ\u009d_iÂZu3øßcÖ\u0016²\u0099\u008c\u0003z¶,9\u0004¬ìWóÚ\u0089Lc÷Kz5í\u0015\u0090Í\u001bæ\u008e\u00920u»#.\u0003ÑåDÝÏ¢qzä\u0007o*\u0012\u0014\u0085þ\b¾³\u0085%9¨XS\u0000ÆðI\u009dü¼g\u009cé]\u009c/\u0007\u001a\u008a·=á Å*wÝH@9Ëç~Ááÿ\u0094\u0090\u001eH\u0081,4\u0002¿í\"ÝÕ\u009a_'ÂJu4ø\u001ecÞ\u0016¥Êj@±ßÍjéá\u0019|W\u008bi\u0001\u008d\u009c¬+Ä¦7=1HUÇ}]¡èìgúò\u0010\t=\u00840\u0012Ò©æ$Ë³\u001bÎ!EYÐhn\u0086åÐp¾\u008f\u0015\u001a9\u0091X/\u009aºù1ÍLêÛ%VNíe{\u0084ö£\rÿ\u0098\u001f\u0017g¢^8\u0087·³ÂÍYëÔ\rcUþmtÆ\u0083¿\u001eñ\u0095\u0000 5¿MÊ}@£ß×jêá\u0002Ê\u0087@qß\u0001j9áÑ|Ü\u008b¶\u0001M\u009c}+\t¦Í=óH\u0099Ç\u00ad]pè\u0018gqòÛ\tì\u0084ú\u0012T©o$\u0013³×ÎïE\u0091Ð¿nKå\u0012p:\u008f\u008f\u001aé\u0091\u0087/\u0018ºr1\u0006L)Û¼V´í\u0098{d\u0094\u0093\u001eH\u008144\u0010¿à\"ªÕ¥_hÂNu;øícÏ\u0016ª\u0099\u009e\u0003O¶$9\u0016¬òWßÚ\u0087LK÷Zz íå\u0090Å\u001b§\u008e\u008b\u0094\u0090\u001e^\u0081)4\u0015¿ò\"\u008eÕ\u0087_iÂSu%øécÕ\u0016·\u0099\u0098\u0003B¶\u00179\u0007¬êWÅÚ\u008cLu÷Kztí \u0090\u008a\u001b \u008e\u008a0h»>.\u0013ÑóD\u0095Ï¢qyäOo/\u0012\u001f\u0085Ë\b¡³\u008f%:¨ZS\u0006ÆèIÊü÷fjéD\u009c+\u0007\u0017\u008aå=» \u0083\f¸\u0086v\u0019\u0001¬='Úº¦M¯ÇAZ{í\r`Áûý\u008e\u009f\u0001°\u009bj.?¡/4ÂÏíB¤Ô]ocâ\\u\u0088\b¢\u0083\u008a\u0016³¨M#\u000f¶9IÕÜéW\u0093éL|f÷2\u008a,\u001dþ\u0090\u009c+¡½]0KË2^ÆÑàd\u0096þ@qh\u0004\u0018\u009fs\u0012Ñ¥\u00928î²EEyØ$SÆæòyÐ\f¿\u0086i\u0019\u001d¬t'ÑºéM¨Ç\bZuí\u001b`Äûþ\u008e\u008c\u0001¢\u009bO.\t¡&4Ø\u0094\u0090\u001e^\u0081)4\u0015¿ò\"\u008eÕ\u0087_iÂSu%øécÕ\u0016·\u0099\u0098\u0003B¶\u00179\u0007¬êWÅÚ\u008cLu÷Kztí \u0090\u008a\u001b¦\u008e\u008a0c»!.\u0015Ñ¼DÂÏºqbäLo<\u0012V\u0085Ë\b¡³\u009e%h¨JS\u0018ÆõI×ü¹fké\u0005\u009c'\u0007\u0015\u008aó=» \u009f*oÝ@@\bËî~\u0083áø\u0094\u009d\u001e]\u0081,\u0094\u0090\u001e^\u0081)4\u0015¿ò\"\u008eÕ\u0087_iÂSu%øécÕ\u0016·\u0099\u0098\u0003B¶\u00179\u0007¬êWÅÚ\u008cLu÷Kztí \u0090\u008a\u001b \u008e\u008a0h»>.\u0013ÑóD\u0095Ï¢qyäOo/\u0012\u001f\u0085Ë\b¡³\u008f%:¨US\u0004ÆôIÍü¿f,éC\u009c#\u0007\u0012\u008aü=¼ \u0094*z\u0003\u0081\u0089O\u00168£\u0004(ãµ\u009fB\u0096ÈxUBâ4oøôÄ\u0081¦\u000e\u0089\u0094S!\u0006®\u0016;ûÀÔM\u009dÛd`Zíez±\u0007\u009b\u008cµ\u0019\u008c§n,:¹\u0004FìÓÐXªætsVøh\u0085\t\u0012Û\u009f¢$Ì²g?QÄ\u0012Q°ÞÊk¨ñ~~F\u000b*\u0090\u001a\u001dõª±7\u0099½iJ\u0005×\u0017\\þéËvé\u0003\u0090\u0089^\u0016?£\u001f\u0094\u0090\u001e^\u0081)4\u0015¿ò\"\u008eÕ\u0087_iÂSu%øécÕ\u0016·\u0099\u0098\u0003B¶\u00179\u0007¬êWÅÚ\u008cLu÷Kztí \u0090\u008a\u001bª\u008e\u00950a»!.\u0014ÑïDÜÏ°qgäEoy\u0012\u0002\u0085À\bä³\u009a%\u007f¨]S\rÆóIßü£fié\u0005\u009c.\u0007\b\u008aû=é \u0083*qÝW@\u001fËó~Óá¬\u0094\u0098\u001e@\u0081 4\\¿þ\"×Õ\u0092_ ÂIu7øæcÖ\u0094\u0097\u001eE\u0081#4\u000b¿ï\"¿Õ\u0090_xÂ^u\u001føûcÊ`½êfu\u001aÀ>KÎÖ\u0080!¾«V\u008b³\u0001h\u009e\u000e+< Ö=\u0086Ê\u009b@EÝwj\u000bçÑ|þç¬mbò\u0015G)ÌÎQ²¦»,U±o\u0006\u0019\u008bÕ\u0010ée\u008bê¤p~Å+J;ßÖ$ù©°?I\u0084w\tH\u009e\u009cã¶h\u009aý¼CNÈ\u0017]+¢Ô7à¼\u0081\u0002Y\u0094\u009c\u001eD\u008144\u0010¿ð\"¶Õ§_kÂWu\u0006øøcÅ\u0016¿\u0099\u0083\u0003I¶\u00179\u0007¬èWÅÚ\u0085Lr\u0094\u009c\u001eD\u008144\u0010¿ð\"¶Õ§_kÂWu\u0006øøcÅ\u0016¿\u0099\u0083\u0003I¶\u00179\u0007¬èWÅÚ\u0085Lr÷\u001fzyí\u00ad\u0090Ä\u001b¬\u008e\u008c0x»(.\u001eÑßDÃÏ¿q^äPo=\u0012\u0017\u0085Û\b¡³¯%\u007f¨@S\u001dÆíIÊ\u0094\u009c\u001eD\u008144\u0010¿ð\"¶Õ§_kÂWu\u0006øøcÅ\u0016¿\u0099\u0083\u0003I¶\u00179\u0007¬èWÅÚ\u0085Lr÷\u001fzyí\u00ad\u0090Ø\u001b¦\u008e\u009e0c»+.\u0014ÑôDøÏ·q\u007fäHo6\u0012\u0012\u0085Ü\b\u008b³\u0093%H¨VS\u001bÆñIÑü¹f\u007fé@\u009c\u0001\u0007\u0014\u008aý=¤ \u0087*qÝP\u007f\u0017õØj¸ß\u008bTAÉ:>\u0006´â)Ú\u009e¤\u0013j\u0088^ý'r\u000fèè]¶Ò\u0085Gx¼C1\f§ä\u001c\u0089\u0091ï\u0006;{Lð'e\u000bÛñP±Å\u009e:\u007f¯P$d\u009aí\u000fÄ\u0084 ù\u0083n\\ã!X\u0018Î¬CÁ¸\u0091-r¢[\u0017/\u008d½\u0002Çwôì\u0088ahÖ;KPÁù6Ð«\u0094 l\u0095P\n<\u007f\u000bõÁjñßÇT#Éb>\u0012´ä)Ì\u009e¥\u00139\u0088]ý%r\u0000èì]°Ò\u0092G(¼@1\u0019§ç\u001cÝ\u0091»\u0006\u0087{Kð9e\u0006Ûì\u0094\u0081\u001eN\u0081.4\u001d¿×\"¬Õ\u0090_tÂLu2øücÈ\u0016±\u0099\u0099\u0003~¶ 9\u0013¬îWÕÚ\u009aLr÷\u001fzyí\u00ad\u0090Ú\u001b±\u008e\u009d0g»'.\bÑéDÆÏòq{äRo6\u0012\u0015\u0085Ê\b·³\u008e%:¨VS\u0006ÆåI\u009eü§f~éJ\u009c2\u0007\u001e\u008aâ=¥ \u009f*?Ý\u0019@MËÉ~Ìá¶\u0094\u0085\u001eG\u0081)4\t¿ð\u000bÔ\u0081\u001b\u001e{«H \u0082½ùJÅÀ!]\u0019êgg©ü\u009d\u0089ä\u0006Ì\u009c+)u¦F3»È\u0080EÏÓ'hJå,rø\u000f\u00ad\u0084ó\u0011Ü¯1$~±AN½ÛÀP÷î?{\fð`\u008dL\u001a\u009b\u0097õ,\u0088º?7\u0014ÌXY¤Ö\u008acðù8v\u0004\u0003~\u0098A\u0015«¢¼?Õµ+B\bßTTºá\u0092\u0094\u0081\u001eN\u0081.4\u001d¿×\"¬Õ\u0090_tÂLu2øücÈ\u0016±\u0099\u0099\u0003~¶ 9\u0013¬îWÕÚ\u009aLr÷\u001fzyí\u00ad\u0090ø\u001b¦\u008e\u00890d»+.\u0014ÑèD\u0095Ï»qxä\u0000o7\u0012\u0013\u0085Û\b³³\u0092%h¨XS\u0004ÆäIÍü¤<\u0090¶_)?\u009c\f\u0017Æ\u008a½}\u0081÷ej]Ý#PíËÙ¾ 1\u0088«o\u001e1\u0091\u0002\u0004ÿÿÄr\u008bäc_\u000eÒhE¼8ö³½&\u008a\u0098k\u00136\u0086\u0018yêì\u0084g¡Ù{LRÇ#º\u0002-Ð ±\u001bÌ\u008dy\u0000Gû\nnàáÀT¨ÎnAQ\u0087Ó\r\u0013\u0092c®\u001b$Ô»´\u000e\u0087\u0085M\u00186ï\neîøÖO¨ÂfYR,+£\u00039ä\u008cº\u0003\u0089\u0096tmOà\u0000vèÍ\u0085@ã×7ª}!6´\u0001\nà\u0081½\u0014\u0093ëa~\u000fõ)KòÞÎUª(\u009a¿T2*\u0089\u000e\u001fï\u0092ÇiÒüksQÆ>\\þÓ\u009f¦¶=\u008e°~\u0007:\u009a\u001a\u0010ìçÍz\u0096ñdDPÛ-®\u0005\u0094\u0081\u001eN\u0081.4\u001d¿×\"¬Õ\u0090_tÂLu2øücÈ\u0016±\u0099\u0099\u0003~¶ 9\u0013¬îWÕÚ\u009aLr÷\u001fzyí\u00ad\u0090Ï\u001b»\u008e\u009b0t»>.\u0013ÑõDÚÏ¼q+äWo1\u0012\u001f\u0085Ã\b¡³Ý%y¨\\S\u0006ÆòIÊü¥fyéF\u009c6\u0007\u0012\u008aþ=® Æ*rÝ[@\u000eËá~\u0083á«\u0094\u0094\u001e\\\u008114\u0019¿ç\"\u0092Õ\u0099_eÂJu&øàcÊ\u0016®\u0099\u009f¥F/\u0089°é\u0005Ú\u008e\u0010\u0013käWn³ó\u008bDõÉ;R\u000f'v¨^2¹\u0087ç\bÔ\u009d)f\u0012ë]}µÆØK¾Üj¡\u001a*e¿S\u0001º\u008aì\u001fÔà{u\u001eþz@¯Õ\u008c^û#ÕÎTD\u008fÛùnÌå%xj\u008fA\u0005\u008a\u0098\u008f/ñ¢79\u0001LiÃUY\u0093ìücÚö\u001f\r\u0003\u0080L\u0016 \u00ad\u0086 ì·(Ê\u0019A5Ô\u0003jçáïtÐ\u008b&\u001e\u000f\u0095a+©¾Ö5ãHÏß\u001eR}é^\u007f¸\u0094\u0081\u001eN\u0081.4\u001d¿×\"¬Õ\u0090_tÂLu2øücÈ\u0016±\u0099\u0099\u0003~¶ 9\u0013¬îWÕÚ\u009aLr÷\u001fzyí\u00ad\u0090Ý\u001b¢\u008e\u00940}»+.\u0013Ñ¼DÑÏ·qgäEo-\u0012\u0013\u0085Ë0?ºð%\u0090\u0090£\u001bi\u0086\u0012q.ûÊfòÑ\u008c\\BÇv²\u000f='§À\u0012\u009e\u009d\u00ad\bPók~$èÌS¡ÞÇI\u00134f¿\u0018*7\u0094Ú\u001f\u0095\u008aªuVà+k\u001eÕÐ@ôË\u0082¶«!e¬\u001f\u0017'\u0081\u0084\fë÷¤bPímXIÂÐMú8\u009f£®.K\u0099\u0019\u0004<\u008e\u0081yìä¼oFÚ=E\u00120'ºõ%Ù\u0090°\u001bN\u0086mq&ûÑféÑÈ\\\u000bÇ:\u0094\u0081\u001eN\u0081.4\u001d¿×\"¬Õ\u0090_tÂLu2øücÈ\u0016±\u0099\u0099\u0003~¶ 9\u0013¬îWÕÚ\u009aLr÷\u001fzyí\u00ad\u0090Ú\u001b¶\u008e\u008b0y»\u001e.\u0006ÑåDÙÏ½qjäDoy\u0012\u001f\u0085Á\b§³\u0091%o¨WS\rÆåI\u009eü¾fbé\u0005\u009c1\u0007\u001e\u008aâ=¿ \u0083*mÝ\u0014@\u001fËï~Ðá¨\u0094\u009e\u001e@\u008144\u0019¿¹\"\u0092Õ\u0082_nÂMu3øýcÔ\u0016¯\u0099\u009f\u0003g¶!9\u000f¬ùW\u0097Ú\u0085Lq÷\u0002z:í\u0003\u0090\u0089\u001b¶\u008e\u008a0g»%\u0094\u0081\u001eN\u0081.4\u001d¿×\"¬Õ\u0090_tÂLu2øücÈ\u0016±\u0099\u0099\u0003~¶ 9\u0013¬îWÕÚ\u009aLr÷\u001fzyí\u00ad\u0090Ã\u001b\u00ad\u008e\u008e0p»\".\u000eÑøD\u0095Ï¢q~äSo1\u0012&\u0085Î\b½³\u0091%u¨RS\fÆ¡I×ü¹foéI\u009c7\u0007\u001f\u008aõ=\u00ad Æ*vÝZ@MËø~Æá«\u0094\u0081\u001eA\u0081)4\u000f¿ð\u0094\u0082\u001eY\u0081/4\u001a¿ó\"¼Õ\u0097_MÂOu øàcå\u0016¿\u0099\u0083\u0003M¶\u00169\u0007¬èWÃÚ\u0080Li÷Qztí \u0090\u008a\u001bù\u008eØ\u0014m\u009e¶\u0001À´õ?\u001c¢SUxß¢B õÏx\u000fã\n\u0096P\u0019l\u0083¢6ù¹è,\u0007×,ZoÌ\u0086w¾ú\u009bmO\u0010e\u009bO\u000ex°\u0090;Õ®íQ\u001dÄ.O\u001dñ\u008dd¼ï\u0096\u0092÷\u00055\u0088G3~\u0094\u0082\u001eY\u0081/4\u001a¿ó\"¼Õ\u0097_MÂOu øàcå\u0016¿\u0099\u0083\u0003M¶\u00169\u0007¬èWÃÚ\u0080Li÷Qztí \u0090\u008a\u001b§\u008e\u009d0r»'.\u0017ÑôDÐÏ qnäDoy\u0012\u0006\u0085Î\b½³\u0091%u¨RS\fÆ¡I\u0084ü÷yðó9lR\u0094\u0082\u001eY\u0081/4\u001a¿ó\"¼Õ\u0097_MÂOu øàcå\u0016¿\u0099\u0083\u0003M¶\u00169\u0007¬èWÃÚ\u0080Li÷Qztí \u0090\u008a\u001b\u0085\u008e»0\\»n.\tÑóDÁÏ»qmäIo:\u0012\u0017\u0085Û\b\u00ad³\u0092%t¨\u0013S\u000bÆîIÚü²f,éL\u009c1\u0007[\u008aþ=¦ \u0092*?ÝG@\u0014Ëä~Àá°\u0094\u0083\u001eA\u0081)4\u0015¿ï\"×Õ\u008f_ Â\u0014uvøücÏ\u0016´\u0099\u008a\u0003c¶!9\u000f¬ùW\u0097Ú\u008dLf÷Vz2í\u0006\u0090È\u001b²\u008e\u00960{»#«\u009f!D¾2\u000b\u0007\u0080î\u001d¡ê\u008a`PýRJ=Çý\\ø)¢¦\u009e<P\u0089\u000b\u0006\u001a\u0093õhÞå\u009dstÈLEiÒ½¯\u0097$\u0094±¶\u000fC\u0084\u001d\u0011?îù{ËðªNfÛIP--\u0004ºÜ\u0094\u0082\u001eY\u0081/4\u001a¿ó\"¼Õ\u0097_\\ÂYu'øác×\u0016¿\u0099\u0083\u0003E¶*9\f¬ÉWÕÚ\u009aLv÷Pz:íþ\u0090Ï\u0094\u0082\u001eY\u0081/4\u001a¿ó\"¼Õ\u0097_\\ÂYu'øác×\u0016¿\u0099\u0083\u0003E¶*9\f¬ÉWÕÚ\u009aLv÷Pz:íþ\u0090Ï\u001bã\u008eÕ01»9.\u0006ÑðDÙÏ·q\u007fä\u0000o5\u0012\u0019\u0085Ì\b¯³\u0098%~SØÙ\u0003Fuó@x©åæ\u0012Í\u0098\u0006\u0005\u0003²}?»¤\u008dÑå^ÙÄ\u001fqpþVk\u0093\u0090\u008f\u001dÀ\u008b,0\n½`*¤W\u0095Ü¹I\u008f÷k|cé\\\u0016ª\u0083\u0083\bí¶%#Z¨gÕIB\u0099ÏûtÓâ%o\r\u0094\u0082\u001eY\u0081/4\u001a¿ó\"¼Õ\u0097_\\ÂYu'øác×\u0016¿\u0099\u0083\u0003E¶*9\f¬ÉWÕÚ\u009aLv÷Pz:íþ\u0090Ï\u001bã\u008eÕ01»\u001c.\u0002ÑïDÅÏ½qeäSo<\u0012V\u0085\u008f\bþ³Ý3R¹\u0089&ÿ\u0093Ê\u0018#\u0085lrGø\u008ce\u0089Ò÷_1Ä\u0007±o>S¤\u0095\u0011ú\u009eÜ\u000b\u0019ð\u0005}Jë¦P\u0080ÝêJ.7\u001f¼3)\u0005\u0097á\u001cÎ\u0089Öv>ã\u0004hoÖ¾C\u0084ÈìµÔ\"\f¯4\u0014\r\u0082ð\u000fÃ£\u0000)Û¶\u00ad\u0003\u0098\u0088q\u0015>â\u0015hÞõÛB¥ÏcTU!=®\u00014Ç\u0081¨\u000e\u008e\u009bK`Wí\u0018{ôÀÒM¸Ú|§M,a¹W\u0007³\u008c¾\u0019\u0080æosBø5FúÓÖXû%\u0086²H?,\u0084\u001a\u0012û\u009fÅd\u008fñg~\u001cË3QüÞÈ«\u00ad0Ù½p\n*\u0097\u0007\u001döêÓw\u0081ülI\u0001Ö<£\u001c)Þ¶å\u0003\u008a\u0088\u007f\u0015UâIhðõÞBµÏ~TI!1®X4«\u0081ê\u0094\u0082\u001eY\u0081/4\u001a¿ó\"¼Õ\u0097_\\ÂYu'øác×\u0016¿\u0099\u0083\u0003E¶*9\f¬ÉWÕÚ\u009aLv÷Pz:íþ\u0090Ï\u001bã\u008eÕ01»\u001d.2ÑßDöÏ\u0097qXäs\u0094\u0085\u001eJ\u0081,4\u0015¿ó\"»Õ\u00ad_y\u0094\u0082\u001eY\u0081/4\u001a¿ó\"¼Õ\u0097_\\ÂYu'øác×\u0016¿\u0099\u0083\u0003E¶*9\f¬ÉWÕÚ\u009aLv÷Pz:íþ\u0090Ï\u001bã\u008eÕ01»\u0007.)ÑÊDôÏ\u009eqBädoy\u00125\u0085ý\b\u0081³¹%_¨}S<ÆÈIÿü\u009bf_\u0003ú\u0089!\u0016W£b(\u008bµÄBïÈ$U!â_o\u0099ô¯\u0081Ç\u000eû\u0094=!R®t;±À\u00adMâÛ\u000e`(íBz\u0086\u0007·\u008c\u009b\u0019\u00ad§I,w¹|F\u0090Ó¤XÜæ\u0012s,øH\u0085a\u0012¹\u009f\u009c$ã²\u0003?\"Ä|Q\u009cÞ¢k\u008fñ\u0016~8\u000bY\u0090b\u001d\u009dªÂ7û½GJ8×}\\\u0097éûvÐ\u0003û\u00899\u0016I£m(\u0089µ¯B÷ÈXU\"â\\o\u0092ô¸\u0081À\u000eì\u0094\u001f!Y®x;\u008aÀ¼M´Û\u001c`(íFz(\u0007¸\u008cÐ\u0019ñ§\r,Y¹{F\u009f\u0094\u0082\u001eY\u0081/4\u001a¿ó\"¼Õ\u0097_\\ÂYu'øác×\u0016¿\u0099\u0083\u0003E¶*9\f¬ÉWÕÚ\u009aLv÷Pz:íþ\u0090Ï\u001bã\u008eÕ01»\u000f.$ÑÈDüÏ\u0084qJäto\u0010\u00129\u0085á\b\u009b³\u00ad%O¨`S ÆÞIóü\u0092f_év\u009c\u0003\u0007<\u008aÙ=\u0087 ¡*@Ý}@)ËÕ~ñá\u009d\u0094 \u001e{\u0081\u000e4.¿Ð\"ö\u0094\u0082\u001eY\u0081/4\u001a¿ó\"¼Õ\u0097_\\ÂYu'øác×\u0016¿\u0099\u0083\u0003E¶*9\f¬ÉWÕÚ\u009aLv÷Pz:íþ\u0090Ï\u001bã\u008eÕ01»\u000f.\u0004ÑèDÜÏ¤qjäTo0\u0012\u0019\u0085Á\bä³\u009b%{¨ZS\u0004ÆäIÚü÷fné@\u009c!\u0007\u001a\u008aå=º \u0083*?ÝW@\u001fËï~Çá½\u0094\u009f\u001eZ\u0081.4\u001d¿ù\"ÁÕË_aÂKu3ø¯cÁ\u0016¥\u0099\u008a\u0003v¶+9\u0015¬ûWÓeËï\u0010pfÅSNºÓõ$Þ®\u00153\u0010\u0084n\t¨\u0092\u009eçöhÊò\fGcÈE]\u0080¦\u009c+Ó½?\u0006\u0019\u008bs\u001c·a\u0086êª\u007f\u009cÁxJcßK ¶µ\u008e>â\u00802\u0015\u001d\u009euã[tÆùìB×Ô'Y\u0013¢W7©¸\u0083\r÷\u0097*\u0018\u0002m+ö@{¼ÌóQßÛ9,\u0013±W:¦\u008fÊ\u0010øeËïGp`ÅZN¨ÓÛ$Ì®<3\u001c\u0084s\tæ\u0092×ç´hÆò*GeÈI]£¦\u0097+Ë½+\u0006K\u008be\u001cXa\u008cêã\u007fÓÁ)J$ß@ ¥µ\u009f>þ\u0080.\u0015\t\u009e`ãNtºùöBÀÔ?Y\u0011\u0094\u0091\u001eG\u0081/4\f¿ò\"\u0082Õ\u0081_nÂIu2øïcÈ\u0016°\u0099\u0090\u0003h¶$9\u0016¬ú×\u007f]¤ÂÒwçü\u000eaA\u0096j\u001c¡\u0081¤6Ú»\u001c *UBÚ~@¸õ×zñï4\u0014(\u0099g\u000f\u008b´\u00ad9Ç®\u0003Ó2X\u001eÍ(sÌøÐmö\u0092\u000e\u0007=\u008cK2Ö§°,ÁQøÆ!KXðgf\u008eë \u0010ò\u0085\\\n'¿K%\u0085ª¹ß\u009fDóÉ\u001d~Pãzi\u0096\u009e¬\u0003°\u0088\u0013=;¢Q×i]°ÂÎwäü\fÅÍO\u0016Ð`eUî¼só\u0084Ø\u000e\u0013\u0093\u0016$h©®2\u0098GðÈÌR\nçehCý\u0086\u0006\u009a\u008bÕ\u001d9¦\u001f+u¼±Á\u0080J¬ß\u009aa~êk\u007f[\u0080¼\u0015\u0094\u009e½ !µ\u0017>uC\\Ô\u0090YÿâÛt:ù\u0012\u0002\u0007\u0097§\u0018\u009f\u00ad¸7 ¸\u0006ÍbVAÛ»lËñÌ{#\u008c\b\u0011C\u009a¢/\u0085°ùÅÙO%ÐieGî»sÝZíÐ6O@úuq\u009cìÓ\u001bø\u00913\f6»H6\u008e\u00ad¸ØÐWìÍ*xE÷cb¦\u0099º\u0014õ\u0082\u00199?´U#\u0091^ Õ\u008c@ºþ^ukà[\u001f¼\u008a\u0094\u0001ø¿\u001c*,¡SÜiK´ÆÂ}ýë\u001b".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 3388);
        B = cArr;
        A = -3508759044121092565L;
    }

    @Override // o.ab.e
    public final o.ab.c<?> c() {
        int i2 = f21153q * 1957349488;
        f21153q = i2;
        int i3 = (-2000316484) * f21155t;
        f21155t = i3;
        return (o.ab.c) b(-1542150646, i3, (int) SystemClock.uptimeMillis(), new Random().nextInt(795226493), new Object[]{this}, 1542150647, i2);
    }

    final void d(Context context) {
        int i2 = 2 % 2;
        int i3 = I + 77;
        C = i3 % 128;
        if (i3 % 2 == 0) {
            e(context);
        } else {
            e(context);
            throw null;
        }
    }

    @Override // o.bh.e
    public final void d(String str, String str2) throws Throwable {
        try {
            synchronized (this.f21167r) {
                o.ef.a aVarE = e(str, str2);
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    K((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), ViewConfiguration.getPressedStateDuration() >> 16, 16 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr2 = new Object[1];
                    K((char) (23811 - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 204, View.getDefaultSize(0, 0) + 45, objArr2);
                    f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(aVarE).toString());
                }
                if (this.D || this.f21166p) {
                    if (f.a()) {
                        Object[] objArr3 = new Object[1];
                        K((char) TextUtils.indexOf("", "", 0), ViewConfiguration.getScrollDefaultDelay() >> 16, 17 - Color.alpha(0), objArr3);
                        String strIntern2 = ((String) objArr3[0]).intern();
                        Object[] objArr4 = new Object[1];
                        K((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 249 - (Process.myTid() >> 22), 62 - ((Process.getThreadPriority(0) + 20) >> 6), objArr4);
                        f.c(strIntern2, ((String) objArr4[0]).intern());
                    }
                    return;
                }
                if (f.a()) {
                    Object[] objArr5 = new Object[1];
                    K((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 17 - TextUtils.getOffsetBefore("", 0), objArr5);
                    String strIntern3 = ((String) objArr5[0]).intern();
                    Object[] objArr6 = new Object[1];
                    K((char) (13083 - View.resolveSizeAndState(0, 0, 0)), 311 - TextUtils.indexOf("", "", 0), 44 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr6);
                    f.c(strIntern3, ((String) objArr6[0]).intern());
                }
                this.f21161k = aVarE.e();
                a();
            }
        } catch (o.ef.b e2) {
            if (f.a()) {
                Object[] objArr7 = new Object[1];
                K((char) ((-1) - Process.getGidForName("")), Color.alpha(0), View.resolveSizeAndState(0, 0, 0) + 17, objArr7);
                String strIntern4 = ((String) objArr7[0]).intern();
                Object[] objArr8 = new Object[1];
                K((char) View.resolveSizeAndState(0, 0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 356, (Process.myPid() >> 22) + 22, objArr8);
                f.e(strIntern4, ((String) objArr8[0]).intern(), e2);
            }
        }
    }

    final void d(o.ef.a aVar) throws Throwable {
        int iNextInt = new Random().nextInt();
        int i2 = f21154s * 775587431;
        f21154s = i2;
        b(45001523, i2, (int) Runtime.getRuntime().maxMemory(), new Random().nextInt(), new Object[]{this, aVar}, -45001523, iNextInt);
    }

    final void d(o.i.d dVar, o.h.d dVar2, boolean z2, boolean z3, boolean z4) {
        synchronized (this.f21167r) {
            this.f21161k = null;
            this.f21160j = dVar;
            this.f21158f = dVar2;
            this.f21168u = z2;
            this.f21159g = z3;
            this.f21162l = z4;
            this.f21170y = new o.bh.d();
            a();
        }
    }

    final void d(boolean z2) throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = I + 93;
            C = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            K((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), KeyEvent.getDeadChar(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            K((char) ExpandableListView.getPackedPositionType(0L), 1370 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 21, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        o.m.c cVarD = o.m.c.d();
        if (this.f21171z != null) {
            int i5 = I + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            C = i5 % 128;
            int i6 = i5 % 2;
            if (f.a()) {
                Object[] objArr3 = new Object[1];
                K((char) View.getDefaultSize(0, 0), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, TextUtils.indexOf((CharSequence) "", '0', 0) + 18, objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                K((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1390, 45 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr4);
                f.c(strIntern2, ((String) objArr4[0]).intern());
            }
            o.m.c.c(h(), true, this.f21171z, z2);
            Object[] objArr5 = {h()};
            int i7 = o.en.b.f24090e * (-1580596594);
            o.en.b.f24090e = i7;
            int i8 = o.en.b.f24087b * (-2071415875);
            o.en.b.f24087b = i8;
            if (((o.fr.e) o.en.b.a(342371170, i7, objArr5, i8, -342371167, Process.myUid(), new Random().nextInt(460146032))).e()) {
                Object[] objArr6 = {h()};
                int i9 = o.en.b.f24090e * (-1580596594);
                o.en.b.f24090e = i9;
                int i10 = o.en.b.f24087b * (-2071415875);
                o.en.b.f24087b = i10;
                ((o.fr.e) o.en.b.a(342371170, i9, objArr6, i10, -342371167, Process.myUid(), new Random().nextInt(460146032))).c(b());
            }
        }
        if (!(!f.a())) {
            Object[] objArr7 = new Object[1];
            K((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.indexOf("", "", 0, 0), 17 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr7);
            String strIntern3 = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            K((char) Color.red(0), 1436 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 55 - TextUtils.getTrimmedLength(""), objArr8);
            f.c(strIntern3, ((String) objArr8[0]).intern());
        }
        if (cVarD.a(b(), h(), d())) {
            Object[] objArr9 = {j()};
            int iNextInt = new Random().nextInt();
            int iMyPid = Process.myPid();
            int i11 = (-1280983783) * o.by.g.f21851b;
            o.by.g.f21851b = i11;
            int i12 = (-1171184006) * o.by.g.f21857h;
            o.by.g.f21857h = i12;
            o.by.g.e(objArr9, iMyPid, i11, i12, iNextInt, 1369120932, -1369120931);
        }
    }

    final boolean d(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = C + 125;
        I = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        K((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 17, objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (f.a()) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            K((char) TextUtils.getOffsetAfter("", 0), 2269 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 27, objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(str).toString());
            int i5 = I + 55;
            C = i5 % 128;
            int i6 = i5 % 2;
        }
        String strA = new o.dk.a(b()).a(2, 4, str, null, null, null, null);
        if (strA == null || strA.isEmpty()) {
            if (f.a()) {
                Object[] objArr3 = new Object[1];
                K((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 33008), 2296 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.rgb(0, 0, 0) + 16777256, objArr3);
                f.d(strIntern, ((String) objArr3[0]).intern());
            }
            d().d(o.bg.a.f21033b);
            return false;
        }
        if (f.a()) {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr4 = new Object[1];
            K((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2336 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 45 - ExpandableListView.getPackedPositionChild(0L), objArr4);
            f.c(strIntern, sb2.append(((String) objArr4[0]).intern()).append(strA).toString());
        }
        try {
            o.ef.a aVar = new o.ef.a(strA);
            Object[] objArr5 = new Object[1];
            K((char) (60754 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), MotionEvent.axisFromString("") + 2383, TextUtils.indexOf((CharSequence) "", '0') + 4, objArr5);
            if (aVar.d(((String) objArr5[0]).intern())) {
                Object[] objArr6 = new Object[1];
                K((char) (60753 - (ViewConfiguration.getEdgeSlop() >> 16)), (ViewConfiguration.getPressedStateDuration() >> 16) + 2382, 3 - Color.argb(0, 0, 0, 0), objArr6);
                Object[] objArr7 = {aVar, ((String) objArr6[0]).intern()};
                int i7 = o.ef.a.f23778l * 493926616;
                o.ef.a.f23778l = i7;
                int i8 = o.ef.a.f23779m * 1131312688;
                o.ef.a.f23779m = i8;
                if (((Integer) o.ef.a.a(1122077797, objArr7, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i7, i8)).intValue() == -1) {
                    if (f.a()) {
                        Object[] objArr8 = new Object[1];
                        K((char) KeyEvent.keyCodeFromString(""), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2386, 88 - View.combineMeasuredStates(0, 0), objArr8);
                        f.c(strIntern, ((String) objArr8[0]).intern());
                        int i9 = I + 29;
                        C = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 5 % 2;
                        }
                    }
                    return true;
                }
            }
            Object[] objArr9 = new Object[1];
            K((char) Color.blue(0), 1304 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11, objArr9);
            Object[] objArr10 = {aVar, ((String) objArr9[0]).intern()};
            int i11 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i11;
            try {
                this.f21170y.d(b(), (String) o.ef.a.a(-781664457, objArr10, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i11, Thread.currentThread().getPriority()));
                return false;
            } catch (o.ef.b e2) {
                e = e2;
                if (f.a()) {
                    Object[] objArr11 = new Object[1];
                    K((char) ((ViewConfiguration.getTouchSlop() >> 8) + 16157), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2474, 38 - View.resolveSizeAndState(0, 0, 0), objArr11);
                    f.e(strIntern, ((String) objArr11[0]).intern(), e);
                }
                d().d(o.bg.a.f21036e);
                return false;
            }
        } catch (o.ef.b e3) {
            e = e3;
        }
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = C + 65;
        I = i3 % 128;
        int i4 = i3 % 2;
        long packedPositionForGroup = ExpandableListView.getPackedPositionForGroup(0);
        if (i4 == 0) {
            Object[] objArr = new Object[1];
            K((char) (packedPositionForGroup > 1L ? 1 : (packedPositionForGroup == 1L ? 0 : -1)), Color.argb(1, 0, 0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 56, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            K((char) (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), Color.argb(0, 0, 0, 0), 18 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // o.ab.e
    public final void f() {
        synchronized (this.f21167r) {
            if (this.D || this.f21166p) {
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    K((char) Color.argb(0, 0, 0, 0), ViewConfiguration.getLongPressTimeout() >> 16, ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.DC2, objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    K((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.MeasureSpec.getSize(0) + 71, 57 - ImageFormat.getBitsPerPixel(0), objArr2);
                    f.c(strIntern, ((String) objArr2[0]).intern());
                }
                return;
            }
            super.f();
            this.D = true;
            if (f.a()) {
                Object[] objArr3 = new Object[1];
                K((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 17, objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                K((char) (ViewConfiguration.getTapTimeout() >> 16), 129 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31, objArr4);
                f.c(strIntern2, ((String) objArr4[0]).intern());
            }
            c cVar = (c) i();
            if (cVar != null) {
                cVar.o();
            }
        }
    }

    @Override // o.bh.g.b
    public final void k() throws Throwable {
        int i2 = 2 % 2;
        int i3 = I + 101;
        C = i3 % 128;
        if (i3 % 2 != 0) {
            f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (f.a()) {
            int i4 = C + 29;
            I = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            K((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), ViewConfiguration.getMinimumFlingVelocity() >> 16, 17 - TextUtils.getOffsetBefore("", 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            K((char) (TextUtils.getTrimmedLength("") + 53923), 183 - Color.alpha(0), Color.green(0) + 21, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        g().a();
    }

    @Override // o.bh.g.b
    public final void l() throws Throwable {
        int i2 = f21156w * 1659829634;
        f21156w = i2;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i3 = 548936348 * f21157x;
        f21157x = i3;
        b(-1417048939, iElapsedRealtime, i3, Process.myTid(), new Object[]{this}, 1417048941, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void n() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bh.b.n():void");
    }
}
