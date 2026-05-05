package o.by;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.OlympusRawInfoMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import o.a.o;
import o.ea.m;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements o.c.b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f21819a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f21820b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f21821c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f21822d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f21823e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f21824f = 0;

    /* JADX INFO: renamed from: o.by.d$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f21825a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f21826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f21827c = 0;

        static {
            int[] iArr = new int[o.c.c.values().length];
            f21826b = iArr;
            try {
                iArr[o.c.c.f21970c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21826b[o.c.c.f21971d.ordinal()] = 2;
                int i2 = f21825a;
                int i3 = (i2 ^ 31) + (((-1) - (((-1) - i2) | ((-1) - 31))) << 1);
                f21827c = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21826b[o.c.c.f21969a.ordinal()] = 3;
                int i5 = f21827c;
                int i6 = ((-1) - (((-1) - i5) | ((-1) - PanasonicMakernoteDirectory.TAG_BURST_SPEED))) + ((-1) - (((-1) - i5) & ((-1) - PanasonicMakernoteDirectory.TAG_BURST_SPEED)));
                f21825a = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21826b[o.c.c.f21972e.ordinal()] = 4;
                int i9 = f21827c;
                int i10 = ((91 | i9) << 1) - (i9 ^ 91);
                f21825a = i10 % 128;
                int i11 = i10 % 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r7, short r8, int r9) {
        /*
            int r7 = r7 * 3
            int r1 = r7 + 1
            int r0 = r9 * 2
            int r6 = 4 - r0
            byte[] r5 = o.by.d.$$a
            int r4 = 105 - r8
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r5 != 0) goto L27
            r0 = r4
            r1 = r2
            r4 = r7
        L14:
            int r4 = r4 + r0
            int r6 = r6 + 1
        L17:
            byte r0 = (byte) r4
            r3[r1] = r0
            if (r1 != r7) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L22:
            int r1 = r1 + 1
            r0 = r5[r6]
            goto L14
        L27:
            r1 = r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.d.$$c(int, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21821c = 0;
        f21824f = 1;
        f21822d = 0;
        f21823e = 1;
        e();
        TextUtils.indexOf((CharSequence) "", '0');
        Color.rgb(0, 0, 0);
        ExpandableListView.getPackedPositionChild(0L);
        int i2 = f21824f + 113;
        f21821c = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void e() {
        char[] cArr = new char[PhotoshopDirectory.TAG_VERSION];
        ByteBuffer.wrap(" ¸ÑxÃkõFçT\u0099/\u008b>½\u001a¯\u0018¡ïSýEëwÛi°\u001b²\r\u0094?\u008f1\u0099\"hÔ\u007fÆnøSê!\u009c0\u008e\u0004\u0080\u0013²÷¤ûVÊHÚz\u0086l£\u001e\u00ad\u0010\u0080\u0002\u00943x%t×XÉFj\u009a\u009bq\u0089P¿C\u00adCÓ/Á#÷\u0005å\u000fëã\u0019ö\u000fÆ=þ#¢Q±G\u0083u\u0094{\u0097he\u009e<\u008c\u0007²E 1Ö5Ä\u001fÊ\u000føúî¸\u001c\u0095\u0002\u009e\u0094\u009bepwQABSB-.?\"\t\u0004\u001b\u000e\u0015âç÷ñÇÃÿÝ£¯°¹\u0082\u008b\u0095\u0085\u0096\u0096d`1r\u000bL\u0017^3(4:\u00064\u0017\u0006í\u0010íâ\u008eüÖÎ¿Øýª³¤\u0080¶\u0084\u0087h\u0091`cB}\u0014OhYz+\n%\u001b7ý\u0001÷\u0013ÙíÝÿ¹É«Û¼Õ\u008e§Ñ°g\u0082{\u009cHnZx=J>D\fÍX<³.\u0092\u0018\u0081\n\u0081tífáPÇBÍL!¾4¨\u0004\u009a<\u0084`ösàAÒVÜUÏ§9ò+È\u0015Ô\u0007ðq÷cÅmÔ_.I.»M¥\u0015\u0097|\u0081>ó}ýOïTÞ\u00adÈ :\u0090$×\u0016«\u0000¹rÉ|Øn>X4J\u001a´\u001e¦z\u0090h\u0082\u007f\u008cMþ\u0012é¤Û¸Å\u008b7\u0099!þ\u0013ý\u001dÏ\u000f\u009ay:k5U\u001bG\u0016±Q£a\u00adf\u009fV\u0089]ø¡ê¹Ô\u0092Æ\u00900ë\"ú,Þ\u001eÔ\b#z1\u008eº\u007fQmp[cIc7\u000f%\u0003\u0013%\u0001/\u000fÃýÖëæÙÞÇ\u0082µ\u0091££\u0091´\u009f·\u008cEz\u001ch'VzD\n2\u0017  .z\u001cÈ\nÔøýæûÔ\u008cÂ\u0098°\u008a¾â¬¿\u009dO\u008bCyogsU\rC\u001e1.?y-Û\u001bÖ\tà÷þå\u0089ÓÃÁ\u009eÏ ½£ªS\u0098\u0016\u0086vt`b\nP\b^=Lx:\u0095(\u009e\u0016ì\u0004ÿòçà\u008bî\u0087Ü¡Ê£»O©Z\u0097j\u0085;s\u0004a\u0016o<]\u007fKÏ9Ñ'à\u0015ì\u0003åñ\u0084ÿ\u0094P?¡Ô³õ\u0085æ\u0097æé\u008aû\u0086Í ßªÑF#S5c\u0007[\u0019\u0007k\u0014}&O1A2RÀ¤\u0099¶¢\u0088ÿ\u009a\u008fì\u0092þ¥ðÿÂBÔR&~8;\n\u0006\u001c\u0016n\u0002`.r2CÌU×§ç¹°\u008b\u0092\u009d\u0097ï¡á¿óHÅ\u001a×g)y;\u001a\r\u0012\u001fW\u00117c!tÃFÁXô\u0094\u009bepwQABSB-.?\"\t\u0004\u001b\u000e\u0015âç÷ñÇÃÿÝ£¯°¹\u0082\u008b\u0095\u0085\u0096\u0096d`1r\u000bL\u0017^*(::J4\u000b\u0006ý\u0010êâÆü\u009fÎ¡Ø¸ª¡¤\u0090¶\u0091\u0087f\u0091\u007fcI}SOeY*+\u0019%\u00177ÿ\u0001÷\u0013ËíÙÿ¿ÉâÛ·Õ\u0085§\u0097°o\u0082y\u009cAnQÙ\u0086(c:,\fR\u001eJ`!r#D\u001bV\u0007Xéª¤¼Ý\u008eÃ\u0090¯â\u00adô\u009aÆ¿È\u008fÛ~-j?Z\u0001@\u0013\u0017e$w\fy\u0000Kì]ê¯È±Ä\u0083±\u0095¡ç\u0097é\u0099û\u0087Ê}ÜJ.Z0v\u0002\"\u0014;f\u0011h'zþLÿ^Î Ï²¸\u0084¹\u0096¯\u0098\u0095ê³ýfÏjÑ@#N5<\u0007,\t\b\u0094\u009bepwQABSB-.?\"\t\u0004\u001b\u000e\u0015âç÷ñÇÃÿÝ£¯°¹\u0082\u008b\u0095\u0085\u0096\u0096d`1r\u000bL\u0017^\"(::\u00184\u0018\u0006í\u0010ÖâÀüÓÎ¥Ø³ª·¤¢¶\u0093\u0087u\u0091\u007fcQ}UO1Y3+\u0004%\u00167Þ\u0001ö\u0013ÊíÒÿ\u0083É\u00adÛ\u0083Õ\u0095§\u0082°n\u0082Z\u009cAnFx9J:D\u000fV\u0010 à2ø\fÿ\u001eØèÀúµô¹Æ\u0082Ð\u0093¡W³f\u008dJ\u009fLi\"{<u\fG\fQË#ù=Ë\u000fË\u0019Ýë¥åµ÷ÆÁ\u009aÒe¬{¾C\u0088]\u009a-\u0094*f\u001ap_Bú\\ü.þ8Ö\nÕ\u0004á\u0016¸à\u0088ò\u0080Ã%Ý|¯D¹M\u008b'\u0085:\u0097OaQs\u00adM÷_à)É;ß5¡\u0007÷\u0011\u0080ã\u0090ülÎzØ]ªU¤:¶\u007f\u0080\u001a\u0092\u001cl\u001e~öHõÜæ-\r?,\t?\u001b?eSw_AySs]\u009f¯\u008a¹º\u008b\u0082\u0095ÞçÍñÿÃèÍëÞ\u0019(L:v\u0004j\u0016_`Gre|eN\u009cX\u008aª´´â\u0086Á\u0090ÕâÜìöþ\u00adÏ\u0011Ù\u000e+)5:\u0007Y\u0011@c\u007fmk\u007f\u0093IÃ[¢¥³·ß\u0081É\u0093Ç\u009dùïéø\tÊJÔ+&-0D\u0002I\fy\u001eqh\u0087z\u008bD¾V®$àÕ\u000bÇ*ñ9ã9\u009dU\u008fY¹\u007f«u¥\u0099W\u008cA¼s\u0084mØ\u001fË\tù;î5í&\u001fÐFÂ}ü<îJ\u0098]\u008ay\u0084 ¶\u009d \u008dR¡L\u00ad~ÑhÏ\u001aÊ\u0014ù\u0006ÿ7\u0013!\u0002Ó2ÍoÿNéS\u009b\u007f\u0095u\u0087\u009b±\u0081£±]µO\u0096yÔkÝeè\u0017þ\u0000]2\u000e,:ÞnÈCúEô`æm\u0090\u0099\u0082\u0092¼²®¢XéJ\u0082D\u008bvû`á\u0011\u0010\u0003\u0000=)/$ÙT\u0094\u009bepwQABSB-.?\"\t\u0004\u001b\u000e\u0015âç÷ñÇÃÿÝ£¯°¹\u0082\u008b\u0095\u0085\u0096\u0096d`=r\u0006LY^+(u:\u00044\u001e\u0006í\u0010ýâ\u008eüËÎ£Øýª ¤\u0086¶\u0083\u0087n\u0091zcQ}QOeY*+\u001e%\u000b7á\u0001¾\u0013ÁíÓÿ¹É«ÛµÕ\u0089§\u0092°g\u0082c\u009cMnZx$J{D\u0018V\u000b á2é\fÅ\u001eÙè×ú±ôðÆÛÐÖ¡a³{\u008dW\u009fXi\"{<u\rG\u001bQá£ÐR;@\u001av\td\t\u001ae\bi>O,E\"©Ð¼Æ\u008cô´êè\u0098û\u008eÉ¼Þ²Ý¡/WzE@{\\ix\u001f\u007f\rM\u0003\\1¦'¦ÕÅË\u009dùôï¶\u009d÷\u0093Ç\u0081Ï°j¦<T\u000fJ\u000bxgng\u001cE\u0012\u0013\u0000£6»$\u0080Ú×Èèþæììâ\u008b\u0090Ö\u0087\"µ;«\u0000Y\u000bOu}0s\u000ea\u0012\u0017¤\u0005·;\u0093)\u009fß\u008fÍéÃïñÃçÒ\u0096\"\u0084\u007fº\b¨\u001e^rLqBKpQf \u0014²\n\u0088_x®\u008b¼\u0089\u008a\u0082\u0098¾æÞôÎÂçÐåÞ\r,\u0019:!\b \u0016Qdprc@{Nw]\u009b«\u009d¹¿\u0087³\u0095ÆãÖñÆÿõÍ\u000eÛ\u001a),7%\u0005M\u0013Ua[oi}xL\u0081Z\u009e¨¤¶\u00ad\u0084ü\u0092Åàïîòü\u0003Ê\u0016Ø0&q4\r\u0002\u000f\u0010_\u001e}ll{ËI\u008fW¹¥¿³Õ\u0081×\u008fá\u009dñëCù\u0016Ç$Õ$#:1M?I\ri\u001b\u007fjÊxÔFèT¥¢Ã°Ä¾ñ\u008cö\u009a\u0011è\u0005ö)Ä!Ò9 \r.U<f\nw\u0019\u008cg\u009cu®C·QÑ_Ñ\u00ad£»â\u0089\b\u0097\u001eå\u0018\u0094\u0095efwdAoSS-3?#\t\n\u001b\b\u0015àçôñÌÃÍÝ¼¯\u009d¹\u008e\u008b\u0096\u0085\u009a\u0096v`prRL^^+(;:+4\u0018\u0006ã\u0010÷âÁüÈÎ Ø¸ª¶¤\u0084¶\u0095\u0087l\u0091scI}@O\u0011Y(+\u0002%\u001f7î\u0001û\u0013Ýí\u009cÿàÉâÛ½Õ\u008f§Ñ°g\u0082g\u009cTn\u0015x?J+D\u000fV\u000b ï2û\fÉ\u001e\u009dèÖú¦ô¤Æ\u0084Ð\u0095¡s³q\u008dA".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, PhotoshopDirectory.TAG_VERSION);
        f21820b = cArr;
        f21819a = -5591224379531631357L;
    }

    private static void g(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f21820b[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(742 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (Process.myTid() >> 22) + 12, 632508977, false, $$c(b2, (byte) (6 | b2), b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f21819a), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 5);
                    objA2 = o.d.d.a(KeyEvent.normalizeMetaState(0) + 766, (char) (Color.alpha(0) + 12470), 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1946853218, false, $$c(b3, b4, (byte) (b4 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA3 = o.d.d.a(387 - TextUtils.indexOf("", "", 0, 0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 17, 39570797, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
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
        int i6 = $11 + 123;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (oVar.f19947b < i3) {
            int i8 = $11 + 77;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = o.d.d.a(-723636472);
                if (objA4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objA4 = o.d.d.a((Process.myPid() >> 22) + 387, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), View.resolveSize(0, 0) + 18, 39570797, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                int i9 = 25 / 0;
            } else {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr6 = {oVar, oVar};
                Object objA5 = o.d.d.a(-723636472);
                if (objA5 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objA5 = o.d.d.a(387 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 18 - KeyEvent.keyCodeFromString(""), 39570797, false, $$c(b9, b10, b10), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr);
    }

    static void init$0() {
        $$a = new byte[]{88, MessagePack.Code.INT64, 78, Ascii.GS};
        $$b = 136;
    }

    @Override // o.c.b
    public final o.c.d a(Context context, o.c.c cVar) throws Throwable {
        boolean z2;
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        g((char) (46091 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), Process.myTid() >> 22, 39 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (o.ea.f.a()) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            g((char) (65025 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 38 - ExpandableListView.getPackedPositionChild(0L), 31 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(cVar).toString());
        }
        int i3 = AnonymousClass1.f21826b[cVar.ordinal()];
        if (i3 == 1) {
            if (o.ea.f.a()) {
                int i4 = f21822d + 75;
                f21823e = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr3 = new Object[1];
                g((char) Color.green(0), View.combineMeasuredStates(0, 0) + 69, 58 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr3);
                o.ea.f.c(strIntern, ((String) objArr3[0]).intern());
            }
            return o.c.d.f21984a;
        }
        if (i3 == 2) {
            if (o.ea.f.a()) {
                Object[] objArr4 = new Object[1];
                g((char) (22979 - (ViewConfiguration.getLongPressTimeout() >> 16)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 128, 79 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr4);
                o.ea.f.c(strIntern, ((String) objArr4[0]).intern());
            }
            return o.c.d.f21988e;
        }
        if (i3 != 3) {
            if (!(!o.ea.f.a())) {
                Object[] objArr5 = new Object[1];
                g((char) (TextUtils.getTrimmedLength("") + 14155), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 807, 80 - TextUtils.getOffsetBefore("", 0), objArr5);
                o.ea.f.c(strIntern, ((String) objArr5[0]).intern());
            }
            o.c.d dVar = o.c.d.f21986c;
            int i6 = f21823e + 95;
            f21822d = i6 % 128;
            int i7 = i6 % 2;
            return dVar;
        }
        if (o.c.a.c()) {
            if (o.ea.f.a()) {
                Object[] objArr6 = new Object[1];
                g((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6688), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 206, Color.red(0) + 84, objArr6);
                o.ea.f.c(strIntern, ((String) objArr6[0]).intern());
                int i8 = f21823e + 117;
                f21822d = i8 % 128;
                int i9 = i8 % 2;
            }
            return o.c.d.f21986c;
        }
        if (o.ea.f.a()) {
            Object[] objArr7 = new Object[1];
            g((char) (ExifDirectoryBase.TAG_PRINT_IMAGE_MATCHING_INFO - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + OlympusRawInfoMakernoteDirectory.TagWbRbLevelsFineWeather, 55 - Color.blue(0), objArr7);
            o.ea.f.c(strIntern, ((String) objArr7[0]).intern());
        }
        if (new o.bo.g().e(context) == null) {
            int i10 = f21823e + 99;
            f21822d = i10 % 128;
            int i11 = i10 % 2;
            if (o.ea.f.a()) {
                Object[] objArr8 = new Object[1];
                g((char) TextUtils.getCapsMode("", 0, 0), 346 - TextUtils.indexOf("", ""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 56, objArr8);
                o.ea.f.c(strIntern, ((String) objArr8[0]).intern());
            }
            try {
                Object[] objArr9 = new Object[1];
                g((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 19729), Color.rgb(0, 0, 0) + 16777618, (ViewConfiguration.getJumpTapTimeout() >> 16) + 59, objArr9);
                z2 = Boolean.parseBoolean(m.d(context, ((String) objArr9[0]).intern()));
            } catch (PackageManager.NameNotFoundException unused) {
                if (o.ea.f.a()) {
                    Object[] objArr10 = new Object[1];
                    g((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 461 - (ViewConfiguration.getPressedStateDuration() >> 16), 130 - TextUtils.lastIndexOf("", '0', 0, 0), objArr10);
                    o.ea.f.c(strIntern, ((String) objArr10[0]).intern());
                }
                z2 = false;
            }
            if (z2) {
                if (o.ea.f.a()) {
                    Object[] objArr11 = new Object[1];
                    g((char) (18557 - (ViewConfiguration.getWindowTouchSlop() >> 8)), TextUtils.indexOf("", "", 0) + IptcDirectory.TAG_BY_LINE, Gravity.getAbsoluteGravity(0, 0) + 64, objArr11);
                    o.ea.f.c(strIntern, ((String) objArr11[0]).intern());
                }
                if (o.ea.f.a()) {
                    Object[] objArr12 = new Object[1];
                    g((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 45179), 656 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 73, objArr12);
                    o.ea.f.c(strIntern, ((String) objArr12[0]).intern());
                }
                return o.c.d.f21984a;
            }
        }
        if (o.ea.f.a()) {
            int i12 = f21822d + 9;
            f21823e = i12 % 128;
            int i13 = i12 % 2;
            Object[] objArr13 = new Object[1];
            g((char) Color.alpha(0), 730 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 78 - TextUtils.getOffsetAfter("", 0), objArr13);
            o.ea.f.c(strIntern, ((String) objArr13[0]).intern());
        }
        return o.c.d.f21986c;
    }

    @Override // o.c.b
    public final o.dd.g a(Context context) throws Throwable {
        int i2 = 2 % 2;
        if (!new a().c(context)) {
            if (!(!o.ea.f.a())) {
                Object[] objArr = new Object[1];
                g((char) (Color.green(0) + 46091), 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 'W' - AndroidCharacter.getMirror('0'), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                g((char) KeyEvent.keyCodeFromString(""), Color.green(0) + 985, 72 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            }
            return o.dd.g.f22857b;
        }
        int i3 = f21823e + 83;
        f21822d = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            o.ea.f.a();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr3 = new Object[1];
            g((char) (KeyEvent.getDeadChar(0, 0) + 46091), (Process.getThreadPriority(0) + 20) >> 6, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 39, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            g((char) (AndroidCharacter.getMirror('0') + 52157), 888 - KeyEvent.keyCodeFromString(""), TextUtils.indexOf("", "", 0, 0) + 97, objArr4);
            o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
        }
        o.dd.g gVar = o.dd.g.f22860e;
        int i4 = f21822d + 79;
        f21823e = i4 % 128;
        if (i4 % 2 != 0) {
            return gVar;
        }
        obj.hashCode();
        throw null;
    }
}
