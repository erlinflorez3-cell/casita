package o.t;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.FujifilmMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.cert.CertificateException;
import o.a.o;
import o.ea.f;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements i {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f26820c = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f26821f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f26822g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char[] f26823h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f26824i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static long f26825j = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f26826m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f26827o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f26828a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26829b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f26831e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r5, int r6, int r7) {
        /*
            int r2 = r6 * 2
            int r1 = 1 - r2
            int r7 = r7 + 99
            int r0 = r5 * 3
            int r6 = r0 + 4
            byte[] r5 = o.t.e.$$a
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r5 != 0) goto L29
            r1 = r6
            r0 = r3
        L15:
            int r6 = r6 + 1
            int r7 = r7 + r1
            r1 = r0
        L19:
            byte r0 = (byte) r7
            r4[r1] = r0
            int r0 = r1 + 1
            if (r1 != r2) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L26:
            r1 = r5[r6]
            goto L15
        L29:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.t.e.$$c(byte, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26826m = 0;
        f26827o = 1;
        f26824i = 0;
        f26822g = 1;
        c();
        d();
        ViewConfiguration.getWindowTouchSlop();
        TextUtils.getTrimmedLength("");
        ViewConfiguration.getMinimumFlingVelocity();
        ViewConfiguration.getTapTimeout();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        ViewConfiguration.getGlobalActionKeyTimeout();
        Process.myPid();
        KeyEvent.getMaxKeyCode();
        TextUtils.indexOf("", "", 0, 0);
        int i2 = f26827o + 41;
        f26826m = i2 % 128;
        int i3 = i2 % 2;
    }

    static void c() {
        f26823h = new char[]{38040, 44183, 58508, 15519, 29850, 36040, 50313, 7324, 21675, 27814, 42158, 64689, 13548, 19589, 33955, 56510, 5338, 11475, 25800, 38037, 44179, 58510, 15543, 29836, 35989, 50334, 7311, 21692, 27829, 42175, 38038, 44185, 58556, 15511, 29836, 35975, 50310};
        f26821f = 7403472152640335094L;
    }

    static void d() {
        char[] cArr = new char[1471];
        ByteBuffer.wrap("ù[*ú^E\u0083¸·&Ø\u009e\f×0GeÜ\u0089(º\u008dî\u001e\u0012WGÆk3\u009c¢À\fô`\u0019äMX~\u0094¢\u0019×\u009dûï/IPÓ\u0084;©\u0097\u0094\u009bG\u00163\u009fîXÚÀµga\u0011]´\b?äÏ×q\u0083ë\u007fÆ*t\u0006\u0090ñI\u00adë\u0099\u009at\u0001 ¢\u0013JÏãºa\u0096\u0000B\u0097=,éÊÄ~°\u0011l\u008c_2\u000b\u009bæ{Òö\u008eÜy9U»\u0000Müô¨Ó\u009bPwý\"r\u001eîÉJ¥*\u0091\u0095Ë¯\u00186l\u0093±f\u0085íêV><\u0002\u0081æÜ5QAØ\u009c\u001f¨\u0087Ç \u0013V/ózx\u0096\u0088¥6ñ¬\r\u0081X3t×\u0083\u0007ß ëË\u0006LRõa\u0018½¤È+äi0üOd\u009b\u0082¶?ÂT\u001eÜ-'y\u0095\u0094& âüÕ\u000be'år\n\u008eÿÚ\u008eé\r\u0005ÜP2l¤»\u0012×{äY7ÌCb\u009e\u0094ª\u0012Åª\u0011Æ-|\u0094 G63\u009dh\u0018» Ï\u0013\u0012î&jIÃ\u009d·¡3ô\u0084\u0018o+ì\u007fP\u0083\"Ö\u0080ú~\u0094\u0099G\u00153ñîBÚÀµma\u0017]°\b!ÂÇ\u0011Veî\u0094¢G.3\u009fîdÚ\u009fµQa\u0019]·\b.äÔ×z\u0083è¿\u00adl7\u0018ýÅ@ñÂ\u009e0J\u0011v¡#:ÏÎük¨ø\u0094\u0093G\u00063¨î^ÚØµ`a\f]¶\bjä\u0090×4\u0083ü\u007f\u0093*:\u0006ÓñN\u00adñ\u0099\u0086\u0094\u009bG\u00163\u009dîTÚÚµha\u000e]²\b>äØ×p\u0083¯\u007fÙ*y\u0094\u009bG\u00163\u009dîTÚÚµha\u000e]²\b>äØ×p\u0083¯\u007fË*y\u0006ÕñS\u00adá\u0099\u0090t\u001c ³\u0013WÏþºf\u0086£U.!¥ülÈâ§Ps6O\u008a\u001a\u0006öàÅH\u0091\u0097mó8A\u0014ããv¿Ã\u008bíf=2\u008c\u0001&ÝÇ¨E\u00847P\u008eC\u0094\u0090\u0002ä©9,\rßbv¶\u000e\u008aÈß.3Â\u0000cTè¨ãý=Ñå&{zÒN¨£6÷\u0094\u000f\u0093Ü\u001e¨\u0095u\\AÒ.`ú\u0006Æº\u00936\u007fÐLx\u0018§äÆ±0\u009dÍjW6â\u0002\u0098ï\n»»\u0088_Tú!a\r\u001fÙ·¦!r\u0085_7+S÷ÁÄ<\u0090Á}oIè\u0094\u009bG\u00163\u009dîTÚÚµha\u000e]²\b>äØ×p\u0083¯\u007fË*y\u0006ÕñS\u00adá\u0099\u0090t\u001c ³\u0013WÏþºf\u0096CB¹=!éÅÄl°\u0005lÉ_z\u000b\u009b\u0094\u009bG\u00163\u009dîTÚÚµha\u000e]²\b>äØ×p\u0083¯\u007fË*y\u0006ÅñX\u00adç\u0099\u0087tL ®\u0013MÏ±ºf\u0096\fB®=méÅÄj°\u0002l\u0081_%\u000bÕæfÒì\u008e\u009fy6Uº\u0000Düü@y\u0093ôç\u007f:¶\u000e8a\u008aµì\u0089PÜÜ0:\u0003\u0092WM«,þÕÒ=%½y@Mv ûôQÇ´\u001b\u0016n\u0084Bõ\u0096QéÌ='\u0010\u0089dñ¸o\u008b\u008bßy2Ý\u0006GZj\u00adÇ\u0081YÔ¦Z;\u0089\u008bý* Ö\u0014B{è¯\u009c\u0093sÆ¿*N\u0019ñM}±Fä¸ÈE?ßcjW\u0010º\u0082î3Ý×\u0001rtéX\u0097\u008c3ó¢'J\n¿~\u0080¢\b\u0091¬ÅR(ö\u001cl@\b·®\u009bnÎÅ2mf\u0001U\u008b¹)ìÝÐ@\u0007è\u0083{Pö$}ù´Í:¢\u0088vîJR\u001fÞó8À\u0090\u0094Oh+=\u0099\u0011\u0013æ¤º\f\u008efcø7U\u0004«Ø\u0012\u00ad\u009c\u0081ìUH*\u008dþ4Ó\u008d§ù{yHÒ\u001c2ñ\u0097Å\u0011\u0099}nÅBW\u0017áë\u001d¿a\u008cø`R5¦\toÞ\u0091²ñ\u0086U[Å/bü\u0093Ð\t¤syÝM9\"¡ö\rÊ}\u009f\u00adsO@º\u0014\u000fé\u009a½ô\u0091Tf : \u000fÜãü·k\u0084ØXx-Þ\u0001JÕ~ªÕ~ZSµ'\u001cû0È±\u009c\u0002\u0094\u009bG\u00163\u009dîTÚÚµha\u000e]²\b>äØ×p\u0083¯\u007fË*y\u0006ÂñN\u00adó\u0099\u0080t\t ´\u0013JÏøºf\u0096\u0004Bú=&éÁÄf°\u0005l\u009d_/\u000bÉæwÒ¥\u008e\u009dy0U¯\u0000Hüö\u0094\u009bG\u00163\u009dîTÚÚµha\u000e]²\b>äØ×p\u0083¯\u007fË*y\u0006ÄñD\u00adí\u0099Õt\u0001 ¦\u0013PÏèº(\u0096\u0011B¿=<éÑÄz°\u0005l\u009d_3á=2°F;\u009bò¯|ÀÎ\u0014¨(\u0014}\u0098\u0091~¢Öö\t\nm_ßsY\u0084ùØLì6\u0001¸UAfóº^ÏÀã¡7\\H\u0084\u009cd±\u0099Åµ\u00197*\u0085~x\u0093Ä§Wû3\f\u009e \u0006u§\u0089\u0004Ýuî¯\u0002\u0017W÷kh¼ÎÐ¶ä\u00189\u008aM$\u009eØ²OÆ8\u001b\u008b/c@á\u0094W¨9\u0094\u009bG\u00163\u009dîTÚÚµha\u000e]²\b>äØ×p\u0083¯\u007fË*y\u0006ÔñN\u00adî\u0099\u0090t\u0018 ®\u0013PÏöº(\u0096\bB¿=4é\u0084Äo°\u0017l\u0080_2\u000b\u009bæsÒö\u008eÜy%U«\u0000Bü÷¨\u0085\u009b\u000fw¯\"M\u001e\u008fÉ+¥Y\u0091µL38ÁëpÇü³\u0093n7ZÞ5FVê\u0085wñ×,:\u0018¸\u0094\u0094G\t3©îDÚÆµ!aU]ó\b/äÅ×w\u0083ê\u007f\u0096*-\u0006ÙñD\u00adì\u0081±R-&\u0086û:Ïê Bt%H\u008b\u001d\u0013ñ°Â\u0003\u0096\u0082\u0094\u0096G\u00003¿îEÚ×µqa\f]\u009a\b$äÍ×a\u0083û\u007f¢*8\u0006ÄñJUP\u0086Æò0/\u009f\u001b\u0003t¹ Õ\u009c?Éò%\u001e\u0016øB!¾OëµÇ\u00180\u0082l-XKµÙá{Ò\u0086\u000e8{ \u0094\u0093G\u00103¨î_ÚËµoa\f]º\b)äÜ×`\u0083æ\u007f\u0089*7\u0006ôñ^\u00adð\u0099\u0094t\u0018 ®\u0013QÏÿº[\u0096\u0006B¹=\"éÊÄ{°\u0005lÉ_$\u000bÞæ~Òä\u008e\u0085ywU\u008f\u0000Oüü¨\u0081\u009b\u0005w´\"P\u001e\u008fÉ3¥Y\u0091ýLk8éëZ\u0094\u0096G\u00003¿îEÚ×µqa\f]\u009a\b$äÍ×a\u0083û\u007f¢*8\u0006ÄñJ\u00ad¢\u0099ØtL ¦\u0013KÏåº`\u0096\u0006B´=9éÍÄ|°\u0017l\u009d_)\u000bÔæ|ÒÁ\u008e\u0089y%U¯\u0000Uüñ¨\u009c\u009b\u0004w\u008e\"Q\u001eÌÉi¥\u0017\u0091´L88\u0082ëqÇé³\u008bn?ZÈ5\báÂÝ\u0094\u0088\td¶WP\u0003ÿþmª@\u0086îq\u0012-\u0088\u0018<ô8 ¥\u0094\u0096G\u00003¿îEÚ×µqa\f]\u009a\b$äÍ×a\u0083û\u007f¢*8\u0006ÄñJ\u00ad¢\u0099ØtL ¬\u0013[Ïèº(\u0096FB©=méÍÄl°Vl\u0087_/\u000bÏæ2Òà\u008e\u0084y>U½\u0000Uüñ¨\u009d\u009b\rwý\"]\u001eÁÉ&¥\u0012\u0091µL28ÑëaÇã³\u0095n;\u0094\u0096G\u00003¿îEÚ×µqa\f]\u009a\b$äÍ×a\u0083û\u007f¢*8\u0006ÄñJ\u00ad¢\u0099ØtL ®\u0013PÏçºi\u0096\u000fB³=)é\u0084Ät°\u0013l\u0090_`\u000bÏækÒõ\u008e\u0099\u0094\u0096G\u00003¿îEÚ×µqa\f]\u009a\b$äÍ×a\u0083û\u007f¢*8\u0006ÄñJ\u00ad¢\u0099ØtL £\u0013_Ïåºi\u0096CB¾=(éÇÄm°\u000fl\u0099_4\u000bÞævÒ¥\u008e\u008fy\"U\u00ad\u0000Büý¨\u0080\u009b\u0019w»\"A\u001eÃÉj¥\u0000\u0091ðLq8\u0082\u0091°B&6\u0099ëcßñ°Wd*X¼\r\u0002áëÒG\u0086Ýz\u0084/\u001e\u0003âôl¨\u0084\u009cþqj%\u0084\u0016`ÊÔ¿K\u00935G\u00888\u0002ìíÁWµpi¬Z\n\u000eüãG×Ð\u008bú|KPÈ\u0094\u0096G\u00003¿îEÚ×µqa\f]\u009a\b$äÍ×a\u0083û\u007f¢*8\u0006ÄñJ\u00ad¢\u0099ØtL ²\u0013MÏôºz\u0096CB³=>é\u0084Äq°\u0019l\u009d_`\u000bÚægÒñ\u008e\u0094y2U \u0000Uüñ¨\u0090\u009b\u000bw©\"Q\u001eË\u0094\u0087G\u00163¹îEÚ\u008eµoa\u0017]§\bjäÜ×a\u0083û\u007f\u008e*<\u0006Þñ_\u00adë\u0099\u0096t\r ³\u0013[ÏõM\u0083\u009e\u0015êª7P\u0003Âld¸\u0019\u0084\u008fÑ1=Ø\u000etZî¦·ó-ßÑ(_t·@Í\u00adYù·ÊS\u0016çcxO\u0006\u009b»ä10Þ\u001dd\u0094\u0096G\u00003¿îEÚ×µqa\f]\u009a\b$äÍ×a\u0083û\u007f¢*8\u0006ÄñJ\u00ad¢\u0099ØtL \u0084\u0013QÏÿº{\u0096\u0017B¨=8éÇÄk°\u0019l\u009b_`\u000bËæ`Òê\u008e\u008cy%U§\u0000Düì¨\u0092\u009b\u0018w¤\"\u0014\u001eÊÉt¥\u000b\u0091¿L98\u0082ëbÇä³\u0082n0Z\u00915NáæÝ\u008e\u0088\u000ed¬WV\u0003øþnª@\u0086°qW-Ü\u0018oô\u0003 \u0081\u00933OÝ:3\u0016áÂ\u0098½-iïD\u000b0¹ì\u0093ß\n\u008b·fFRÉ\r'ùDÕñ¢%q³\u0005\fØöìd\u0083ÂW¿k)>\u0097Ò~áÒµHI\u0011\u001c\u008b0wÇù\u009b\u0011¯kBÿ\u0016\u0006%èùS\u008cÎ µt\u001a\u000b\u008aß~òÂ\u0086¢Zzi\u0098=mÐØäE¸;O\u008bc\u000f6÷Ê\u000b\u009e!\u00ad¾A\u000f\u0014î(rÏE\u001cÓhlµ\u0096\u0081\u0004î¢:ß\u0006IS÷¿\u001e\u008c²Ø($qqë]\u0017ª\u0099öqÂ\u000b/\u009f{`H\u0082\u0094-áûÍÝ\u0019hfð²\u000e\u009fìë×7_\u0004âP\u001d½¤\u0089%Õ[\"÷\u000e\u0096Ý\u0005©¡tU@Ð/\u007fû\u001cÇ¼\u0092+~ÕM9\u0019öå\u0084°t\u009cÙkC7ì\u0003\u008aî\u0018ºº\u0089GU¼ l\f\u0000Ø§§5sÝ^2*\u001fö\u0085Å9\u0091×|?Ó\u009e\u0000\bt·©M\u009dßòy&\u0004\u001a\u0092O,£Å\u0090iÄó8ªm0AÌ¶BêªÞÐ3Dg\u0080TB\u0088ñýeÑ\u0019\u0005òz.®Å\u0083y÷\u001a+Á\u0018'LÕ¡:\u0095èÉ\u008c><\u0012£GY»äï\u0092Ü\r0»e\u001cY\u009d\u008e.â\u0012Ö´\u000b&\u007fË¬s\u0080íô\u0081)1\u001d\u0099rK¦î\u009a\u008bÏ\u0016#¸\u0010XDì¹d\u0094\u0081G\u00103·îGÚ\u0080µja\b]·".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1471);
        f26820c = cArr;
        f26825j = -2437452284472834203L;
    }

    static void init$0() {
        $$a = new byte[]{117, -127, -11, 113};
        $$b = Mp4VideoDirectory.TAG_COMPRESSION_TYPE;
    }

    private static void k(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f26820c[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(742 - Color.red(0), (char) Color.red(0), TextUtils.lastIndexOf("", '0', 0) + 13, 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f26825j), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(767 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (View.getDefaultSize(0, 0) + 12470), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 13, 1946853218, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a((ViewConfiguration.getEdgeSlop() >> 16) + 387, (char) TextUtils.getCapsMode("", 0, 0), TextUtils.getOffsetAfter("", 0) + 18, 39570797, false, $$c(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 6)))), new Class[]{Object.class, Object.class});
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
            int i6 = $10 + 99;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a(387 - (Process.myPid() >> 22), (char) ExpandableListView.getPackedPositionGroup(0L), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, 39570797, false, $$c(b8, b9, (byte) ((-1) - (((-1) - b9) & ((-1) - 6)))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i8 = $10 + 111;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 4 / 3;
            }
        }
        objArr[0] = new String(cArr);
    }

    private static void l(int i2, char c2, int i3, Object[] objArr) throws Throwable {
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i4 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f26823h[i2 + i4])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(742 - View.getDefaultSize(0, 0), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 11 - ImageFormat.getBitsPerPixel(0), 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(f26821f), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(765 - TextUtils.lastIndexOf("", '0'), (char) (12470 - TextUtils.indexOf("", "", 0)), 11 - ImageFormat.getBitsPerPixel(0), 1946853218, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(387 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (Process.myTid() >> 22), 18 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 39570797, false, $$c(b6, b7, (byte) ((b7 + 6) - (6 & b7))), new Class[]{Object.class, Object.class});
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
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a((Process.myPid() >> 22) + 387, (char) Gravity.getAbsoluteGravity(0, 0), 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 39570797, false, $$c(b8, b9, (byte) ((b9 + 6) - (6 & b9))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    @Override // o.t.a
    public final void a() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26824i + 17;
        f26822g = i3 % 128;
        if (i3 % 2 == 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            k((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28154), View.combineMeasuredStates(0, 0), 28 - View.resolveSizeAndState(0, 0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            k((char) ((Process.myTid() >> 22) + 49790), TextUtils.getCapsMode("", 0, 0) + 742, 5 - TextUtils.getOffsetBefore("", 0), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        try {
            Object[] objArr3 = new Object[1];
            k((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 64683), 140 - (Process.myPid() >> 22), 15 - ExpandableListView.getPackedPositionGroup(0L), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Class<?> cls = Class.forName(C1561oA.Kd("wo\u0006q?\u0006xw\u000b\t\u0001\r\u0013Hf\u0002\u0017q\u0014\u0010\u0014\b", (short) (C1607wl.Xd() ^ 20310)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Wg.Zd("|CW*u\u0003o{[\u0012\u0016-+x|U", (short) (C1499aX.Xd() ^ (-32043)), (short) (C1499aX.Xd() ^ (-13270))));
            Object[] objArr4 = {strIntern2};
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.Xd(")(8\u000e4:<*8.1", (short) (C1607wl.Xd() ^ 14641)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                KeyStore keyStore = (KeyStore) declaredMethod.invoke(null, objArr4);
                Class<?> cls2 = Class.forName(Wg.vd("ndxb6zkh\u0002}s}\n=Yr\u000ef\u0007\u0001\u000b|", (short) (C1499aX.Xd() ^ (-14384))));
                Class<?>[] clsArr2 = new Class[1];
                clsArr2[0] = Class.forName(Qg.kd("\u007fu\ns?\u0004tq\u0003~t~\u00036Rk~Wwqse#Jl]_Mmgi[EUeS^UcS_", (short) (C1580rY.Xd() ^ (-16791)), (short) (C1580rY.Xd() ^ (-4192))));
                Object[] objArr5 = {null};
                Method method = cls2.getMethod(hg.Vd("|~oq", (short) (ZN.Xd() ^ 17625), (short) (ZN.Xd() ^ 3868)), clsArr2);
                try {
                    method.setAccessible(true);
                    method.invoke(keyStore, objArr5);
                    Object[] objArr6 = new Object[1];
                    k((char) TextUtils.indexOf("", ""), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 156, 9 - (Process.myTid() >> 22), objArr6);
                    String strIntern3 = ((String) objArr6[0]).intern();
                    Class<?> cls3 = Class.forName(C1561oA.ud("3)='r7(%62(26i\u0006\u001f2\u000b+%'\u0019", (short) (Od.Xd() ^ (-29485))));
                    Class<?>[] clsArr3 = new Class[1];
                    clsArr3[0] = Class.forName(C1561oA.yd("\u000f\u0007\u0019\u0005V\u0016\b\u0016\u0004Km\u0010\u0013\u000b\r\u0007", (short) (OY.Xd() ^ FujifilmMakernoteDirectory.TAG_DYNAMIC_RANGE_SETTING)));
                    Object[] objArr7 = {strIntern3};
                    short sXd = (short) (Od.Xd() ^ (-12693));
                    int[] iArr = new int["@BJDTF'QXW_".length()];
                    QB qb = new QB("@BJDTF'QXW_");
                    int i4 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i4));
                        i4++;
                    }
                    Method method2 = cls3.getMethod(new String(iArr, 0, i4), clsArr3);
                    try {
                        method2.setAccessible(true);
                        method2.invoke(keyStore, objArr7);
                        int i5 = f26822g + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                        f26824i = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 73 / 0;
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e5) {
            if (f.a()) {
                Object[] objArr8 = new Object[1];
                k((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 28155), (-1) - ImageFormat.getBitsPerPixel(0), 28 - Color.blue(0), objArr8);
                String strIntern4 = ((String) objArr8[0]).intern();
                Object[] objArr9 = new Object[1];
                k((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 747 - View.resolveSize(0, 0), 17 - KeyEvent.normalizeMetaState(0), objArr9);
                f.e(strIntern4, ((String) objArr9[0]).intern(), e5);
            }
            throw new d(e5.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    @Override // o.t.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(byte[] r12) throws java.lang.Throwable {
        /*
            r11 = this;
            r10 = 2
            int r0 = r10 % r10
            int r0 = o.t.e.f26824i
            int r1 = r0 + 79
            int r0 = r1 % 128
            o.t.e.f26822g = r0
            int r1 = r1 % r10
            r6 = 0
            if (r1 != 0) goto L85
            boolean r1 = o.ea.f.a()
            r0 = 94
            int r0 = r0 / r6
            if (r1 == 0) goto L79
        L18:
            int r0 = android.view.View.getDefaultSize(r6, r6)
            int r0 = r0 + 28154
            char r3 = (char) r0
            int r2 = android.graphics.Color.green(r6)
            int r0 = android.view.ViewConfiguration.getScrollBarFadeDuration()
            int r0 = r0 >> 16
            int r1 = 28 - r0
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            k(r3, r2, r1, r0)
            r0 = r0[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = r0.intern()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            long r8 = android.os.Process.getElapsedCpuTime()
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            int r0 = 5422 - r0
            char r3 = (char) r0
            r0 = 48
            char r0 = android.text.AndroidCharacter.getMirror(r0)
            int r2 = r0 + 716
            r1 = -16777204(0xffffffffff00000c, float:-1.7014143E38)
            int r0 = android.graphics.Color.rgb(r6, r6, r6)
            int r1 = r1 - r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            k(r3, r2, r1, r0)
            r0 = r0[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.StringBuilder r1 = r5.append(r0)
            java.lang.String r0 = o.dl.d.e(r12)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            o.ea.f.c(r4, r0)
        L79:
            r11.f26831e = r12
            int r0 = o.t.e.f26824i
            int r1 = r0 + 7
            int r0 = r1 % 128
            o.t.e.f26822g = r0
            int r1 = r1 % r10
            return
        L85:
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto L79
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.t.e.a(byte[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    @Override // o.t.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.content.Context r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.t.e.a(android.content.Context):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0562, code lost:
    
        if (java.lang.Integer.valueOf(r7.getCause().getMessage()).intValue() > 105) goto L128;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x048c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] b() throws o.t.c, o.t.d {
        /*
            Method dump skipped, instruction units count: 1838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.t.e.b():byte[]");
    }

    @Override // o.t.a
    public final boolean c(Context context) {
        int i2 = 2 % 2;
        int i3 = f26822g + 87;
        f26824i = i3 % 128;
        return i3 % 2 == 0;
    }

    public final void d(int i2) {
        int i3 = 2 % 2;
        int i4 = f26822g;
        int i5 = i4 + 65;
        f26824i = i5 % 128;
        int i6 = i5 % 2;
        this.f26830d = i2;
        int i7 = i4 + 69;
        f26824i = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0540, code lost:
    
        if (java.lang.Integer.valueOf(r8.getCause().getMessage()).intValue() > 51) goto L158;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // o.t.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.t.e.e():boolean");
    }

    @Override // o.t.a
    public final byte[] e(Context context) throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f26822g + 11;
            f26824i = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            k((char) (28154 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Color.green(0), 28 - TextUtils.indexOf("", "", 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            k((char) (28874 - View.resolveSize(0, 0)), 129 - (ViewConfiguration.getTapTimeout() >> 16), 9 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f26824i + 93;
            f26822g = i5 % 128;
            int i6 = i5 % 2;
        }
        try {
            Object[] objArr3 = new Object[1];
            k((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 137 - (Process.myTid() >> 22), TextUtils.indexOf("", "", 0, 0) + 3, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            k((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 64683), 140 - Drawable.resolveOpacity(0, 0), 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr4);
            String strIntern3 = ((String) objArr4[0]).intern();
            Class<?> cls = Class.forName(C1561oA.Kd("<4J6\u0004J=<OMEQW\r+F[3ENX.MWO]Ma]a", (short) (ZN.Xd() ^ 21118)));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(Wg.Zd("-EI!]\rpjRw\u0016f\u0012wm\u0016", (short) (Od.Xd() ^ (-14771)), (short) (Od.Xd() ^ (-3998))));
            clsArr[1] = Class.forName(C1561oA.Xd("LDZF\u0014SIWQ\u0019?a`X^X", (short) (ZN.Xd() ^ 13110)));
            Object[] objArr5 = {strIntern2, strIntern3};
            Method declaredMethod = cls.getDeclaredMethod(Wg.vd("@=K\u001fCGG3OCD", (short) (C1580rY.Xd() ^ (-7063))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) declaredMethod.invoke(null, objArr5);
                if (Build.VERSION.SDK_INT >= 30) {
                    Object[] objArr6 = new Object[1];
                    k((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 155 - Color.argb(0, 0, 0, 0), 9 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr6);
                    KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(((String) objArr6[0]).intern(), 3);
                    Class<?> cls2 = Class.forName(Qg.kd("&2'40)#k0!\u001e/+!+/b\u001f\u0018+$$\u001e \u0012Yu\u000f\"n\f\u0014t\u0005\u0015\u0003\u000e\u0005\u0013\u0003\u000fn\u000b~{;X\u000b}\u007fvv\u0003", (short) (C1580rY.Xd() ^ (-26089)), (short) (C1580rY.Xd() ^ (-15069))));
                    Class<?>[] clsArr2 = {Boolean.TYPE};
                    Object[] objArr7 = {true};
                    short sXd = (short) (C1607wl.Xd() ^ 5689);
                    short sXd2 = (short) (C1607wl.Xd() ^ 31888);
                    int[] iArr = new int["ZKY9VGS!TREAINB;8J>CA$6AD7?1/".length()];
                    QB qb = new QB("ZKY9VGS!TREAINB;8J>CA$6AD7?1/");
                    int i7 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i7] = xuXd.fK(sXd + i7 + xuXd.CK(iKK) + sXd2);
                        i7++;
                    }
                    Method method = cls2.getMethod(new String(iArr, 0, i7), clsArr2);
                    try {
                        method.setAccessible(true);
                        KeyGenParameterSpec.Builder builder2 = (KeyGenParameterSpec.Builder) method.invoke(builder, objArr7);
                        Object[] objArr8 = new Object[1];
                        k((char) ((-16755088) - Color.rgb(0, 0, 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 163, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2, objArr8);
                        String[] strArr = {((String) objArr8[0]).intern()};
                        Class<?> cls3 = Class.forName(C1561oA.ud("codqmf`)m^[lh^hl \\Uhaa[]O\u00173L_,IQ2BR@KBP@L,H<9x\u0016H;=44@", (short) (C1499aX.Xd() ^ (-16345))));
                        Class<?>[] clsArr3 = {String[].class};
                        Object[] objArr9 = {strArr};
                        short sXd3 = (short) (C1633zX.Xd() ^ (-2367));
                        int[] iArr2 = new int["YLX'VZKT+N@BU".length()];
                        QB qb2 = new QB("YLX'VZKT+N@BU");
                        int i8 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i8] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i8));
                            i8++;
                        }
                        Method method2 = cls3.getMethod(new String(iArr2, 0, i8), clsArr3);
                        try {
                            method2.setAccessible(true);
                            KeyGenParameterSpec.Builder builder3 = (KeyGenParameterSpec.Builder) method2.invoke(builder2, objArr9);
                            Object[] objArr10 = new Object[1];
                            k((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 167 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11, objArr10);
                            Object[] objArr11 = {new String[]{((String) objArr10[0]).intern()}};
                            Method method3 = Class.forName(C1561oA.Yd(":H?NLGC\u000eTGFYWO[a\u0017UPe`b^bV >Yn=\\fI[m]jcsesUsih*I}rvoq\u007f", (short) (Od.Xd() ^ (-22355)))).getMethod(Xg.qd(";.>\u0010:0@H@E;BB%7;<BHBO", (short) (C1499aX.Xd() ^ (-18351)), (short) (C1499aX.Xd() ^ (-12215))), String[].class);
                            try {
                                method3.setAccessible(true);
                                KeyGenParameterSpec.Builder builder4 = (KeyGenParameterSpec.Builder) method3.invoke(builder3, objArr11);
                                short sXd4 = (short) (C1607wl.Xd() ^ 20767);
                                short sXd5 = (short) (C1607wl.Xd() ^ 25165);
                                int[] iArr3 = new int["-(\u0016#\u0018\u0014\u0016S\u001dwq\b{z~{8`\\dYfU]H\u0001%-H\u0012,8\u0010\u001d%\f\u001e\r$\b\u0013o\u007fxr,RupeUYZ".length()];
                                QB qb3 = new QB("-(\u0016#\u0018\u0014\u0016S\u001dwq\b{z~{8`\\dYfU]H\u0001%-H\u0012,8\u0010\u001d%\f\u001e\r$\b\u0013o\u007fxr,RupeUYZ");
                                int i9 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i9] = xuXd3.fK(xuXd3.CK(iKK3) - ((i9 * sXd5) ^ sXd4));
                                    i9++;
                                }
                                Class<?> cls4 = Class.forName(new String(iArr3, 0, i9));
                                Object[] objArr12 = {2048};
                                Method method4 = cls4.getMethod(ZO.xd("[)ZN\u001dK'\tEJ", (short) (ZN.Xd() ^ 11084), (short) (ZN.Xd() ^ 4958)), Integer.TYPE);
                                try {
                                    method4.setAccessible(true);
                                    KeyGenParameterSpec.Builder builder5 = (KeyGenParameterSpec.Builder) method4.invoke(builder4, objArr12);
                                    int i10 = this.f26830d;
                                    Class<?> cls5 = Class.forName(C1626yg.Ud("_\\44%>\t9cZhcO\u0012\u0002u I\u001c4^c-\u0011!1p\rR!\u0012~y1*\u001b5NBb\u0013\u001eV\u0003X7z\u001d~Z\u0010(\u0005", (short) (ZN.Xd() ^ 27041), (short) (ZN.Xd() ^ IptcDirectory.TAG_DATE_CREATED)));
                                    Class<?>[] clsArr4 = {Integer.TYPE, Integer.TYPE};
                                    Object[] objArr13 = {Integer.valueOf(i10), 3};
                                    Method method5 = cls5.getMethod(Ig.wd("q\u0017\u0016Q6K>r\\|l\u0012HNQn\u0014/Yi.9v\u0006u(;\u001e\u0017Ov", (short) (C1580rY.Xd() ^ (-13606))), clsArr4);
                                    try {
                                        method5.setAccessible(true);
                                        KeyGenParameterSpec.Builder builder6 = (KeyGenParameterSpec.Builder) method5.invoke(builder5, objArr13);
                                        Object[] objArr14 = new Object[0];
                                        Method method6 = Class.forName(EO.Od("K\u0011vcIw\r\ttikU|{\u0019zkEi\u0014$\u007f\u000b\f\u0015\bE(`^\u0017:Fs\\\bBTlmt\u007fOH\u0017i}\u0002\n+d\u0012j", (short) (C1607wl.Xd() ^ 25212))).getMethod(C1561oA.Qd("3E8:1", (short) (C1580rY.Xd() ^ (-29430))), new Class[0]);
                                        try {
                                            method6.setAccessible(true);
                                            KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) method6.invoke(builder6, objArr14);
                                            Class<?> cls6 = Class.forName(C1593ug.zd("4,B.{B54GE=IO\u0005#>S+=FP&EOGUEYUY", (short) (C1580rY.Xd() ^ (-6761)), (short) (C1580rY.Xd() ^ (-3871))));
                                            Class<?>[] clsArr5 = new Class[1];
                                            clsArr5[0] = Class.forName(C1561oA.od("OEYC\u000fSDARNDNR\u0006JF:7\u0001\u0013=7>@6@37\u0019)9'2)7'3\u0013/# ", (short) (C1580rY.Xd() ^ (-24103))));
                                            Object[] objArr15 = {keyGenParameterSpec};
                                            Method method7 = cls6.getMethod(C1561oA.Kd("jplxngsq\u0004o", (short) (C1580rY.Xd() ^ (-25038))), clsArr5);
                                            try {
                                                method7.setAccessible(true);
                                                method7.invoke(keyPairGenerator, objArr15);
                                            } catch (InvocationTargetException e2) {
                                                throw e2.getCause();
                                            }
                                        } catch (InvocationTargetException e3) {
                                            throw e3.getCause();
                                        }
                                    } catch (InvocationTargetException e4) {
                                        throw e4.getCause();
                                    }
                                } catch (InvocationTargetException e5) {
                                    throw e5.getCause();
                                }
                            } catch (InvocationTargetException e6) {
                                throw e6.getCause();
                            }
                        } catch (InvocationTargetException e7) {
                            throw e7.getCause();
                        }
                    } catch (InvocationTargetException e8) {
                        throw e8.getCause();
                    }
                } else {
                    Object[] objArr16 = new Object[1];
                    k((char) View.getDefaultSize(0, 0), 155 - TextUtils.getTrimmedLength(""), ExpandableListView.getPackedPositionType(0L) + 9, objArr16);
                    KeyGenParameterSpec.Builder builder7 = new KeyGenParameterSpec.Builder(((String) objArr16[0]).intern(), 3);
                    Object[] objArr17 = {true};
                    Method method8 = Class.forName(Wg.Zd("\u0018[0*\u0006R,!\u0006jG@`n\u0015@\u0018La\u001d9U/\u0016gj'$\u0018<=-*rf<#2`|,\u007f<\\yL\n${u\b0 ", (short) (ZN.Xd() ^ 20506), (short) (ZN.Xd() ^ 18302))).getMethod(C1561oA.Xd("\f~\u000fp\u0010\u0003\u0011`\u0016\u0016\u000b\t\u0013\u001a\u0010\u000b\n\u001e\u0014\u001b\u001b\u007f\u0014!&\u001b%\u0019\u0019", (short) (FB.Xd() ^ 21038)), Boolean.TYPE);
                    try {
                        method8.setAccessible(true);
                        KeyGenParameterSpec.Builder builder8 = (KeyGenParameterSpec.Builder) method8.invoke(builder7, objArr17);
                        Object[] objArr18 = new Object[1];
                        k((char) (Color.argb(0, 0, 0, 0) + 22128), 164 - TextUtils.indexOf("", ""), (Process.myPid() >> 22) + 3, objArr18);
                        String[] strArr2 = {((String) objArr18[0]).intern()};
                        short sXd6 = (short) (C1499aX.Xd() ^ (-6685));
                        int[] iArr4 = new int["Vd[jhc_*pcbuskw}\u0013QLa\\^Z^R\u001c:Uj9Xb%7I9F?OAO1OED\u0006%Y.2+-;".length()];
                        QB qb4 = new QB("Vd[jhc_*pcbuskw}\u0013QLa\\^Z^R\u001c:Uj9Xb%7I9F?OAO1OED\u0006%Y.2+-;");
                        int i11 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i11] = xuXd4.fK((sXd6 ^ i11) + xuXd4.CK(iKK4));
                            i11++;
                        }
                        Object[] objArr19 = {strArr2};
                        Method method9 = Class.forName(new String(iArr4, 0, i11)).getMethod(Qg.kd("(\u0019's\u001d\u001f\u0012\u0019y\u001b\u000f\u000f\u001c", (short) (FB.Xd() ^ 12129), (short) (FB.Xd() ^ 18571)), String[].class);
                        try {
                            method9.setAccessible(true);
                            KeyGenParameterSpec.Builder builder9 = (KeyGenParameterSpec.Builder) method9.invoke(builder8, objArr19);
                            Object[] objArr20 = new Object[1];
                            k((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) + 167, ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.CR, objArr20);
                            Object[] objArr21 = {new String[]{((String) objArr20[0]).intern()}};
                            Method method10 = Class.forName(hg.Vd("\u0007\u0013\b\u0015\u0011\n\u0004L\u0011\u0002~\u0010\f\u0002\f\u0010C\u007fx\f\u0005\u0005~\u0001r:Vo\u0003OltUeucnescoOk_\\\u001c9k^`WWc", (short) (C1499aX.Xd() ^ (-28505)), (short) (C1499aX.Xd() ^ (-22637)))).getMethod(C1561oA.ud("\u0014\u0005\u0013b\u000b~\r\u0013\t\f\u007f\u0005\u0003csutx|t\u007f", (short) (C1633zX.Xd() ^ (-30994))), String[].class);
                            try {
                                method10.setAccessible(true);
                                KeyGenParameterSpec.Builder builder10 = (KeyGenParameterSpec.Builder) method10.invoke(builder9, objArr21);
                                Object[] objArr22 = {2048};
                                Method method11 = Class.forName(C1561oA.yd("frgtxqk4pa^osisw#_XkllfhR\u001a6Oj7T\\u\u0006\u0016\u0004\u0017\u000e\u001c\f\u0010o\f\u007f\u0005Da\u0014~\u0001ww\f", (short) (Od.Xd() ^ (-16370)))).getMethod(C1561oA.Yd(":-=\u00150E 7I5", (short) (C1607wl.Xd() ^ 15447)), Integer.TYPE);
                                try {
                                    method11.setAccessible(true);
                                    KeyGenParameterSpec.Builder builder11 = (KeyGenParameterSpec.Builder) method11.invoke(builder10, objArr22);
                                    int i12 = this.f26830d;
                                    Class<?> cls7 = Class.forName(Xg.qd("Zh_nlgc.tgfywo{\u00027up\u0006\u0001\u0003~\u0003v@^y\u000f]|\u0007i{\u000e}\u000b\u0004\u0014\u0006\u0014u\u0014\n\tJi\u001e\u0013\u0017\u0010\u0012 ", (short) (C1633zX.Xd() ^ (-26282)), (short) (C1633zX.Xd() ^ (-23200))));
                                    Class<?>[] clsArr6 = {Integer.TYPE};
                                    Object[] objArr23 = {Integer.valueOf(i12)};
                                    Method method12 = cls7.getMethod(Jg.Wd("\t\u001f:g3-\u0007\u0001A\t*3\t67}\tD\u0006\u0017Br\u000bB\f\u000e?\u0017)\u001c\u001a\"]\u0019\u001bm\u0019\u0005c\u000e'n\u0011+", (short) (ZN.Xd() ^ 24227), (short) (ZN.Xd() ^ 8475)), clsArr6);
                                    try {
                                        method12.setAccessible(true);
                                        KeyGenParameterSpec.Builder builder12 = (KeyGenParameterSpec.Builder) method12.invoke(builder11, objArr23);
                                        Class<?> cls8 = Class.forName(ZO.xd("\u0018W=3u6{$\u001bOq~\u0016>>\u0001\u0019E'$o\u0003\u0012\tP\u0006#>An|b]'NwlC/IPy\u001c]i+UR\"\u0010%rI", (short) (C1607wl.Xd() ^ 3362), (short) (C1607wl.Xd() ^ 1923)));
                                        Class<?>[] clsArr7 = new Class[0];
                                        Object[] objArr24 = new Object[0];
                                        short sXd7 = (short) (Od.Xd() ^ (-17202));
                                        short sXd8 = (short) (Od.Xd() ^ (-16989));
                                        int[] iArr5 = new int["\t\tS- ".length()];
                                        QB qb5 = new QB("\t\tS- ");
                                        int i13 = 0;
                                        while (qb5.YK()) {
                                            int iKK5 = qb5.KK();
                                            Xu xuXd5 = Xu.Xd(iKK5);
                                            iArr5[i13] = xuXd5.fK((C1561oA.Xd[i13 % C1561oA.Xd.length] ^ ((sXd7 + sXd7) + (i13 * sXd8))) + xuXd5.CK(iKK5));
                                            i13++;
                                        }
                                        Method method13 = cls8.getMethod(new String(iArr5, 0, i13), clsArr7);
                                        try {
                                            method13.setAccessible(true);
                                            KeyGenParameterSpec keyGenParameterSpec2 = (KeyGenParameterSpec) method13.invoke(builder12, objArr24);
                                            Class<?> cls9 = Class.forName(Ig.wd("\u0017V=\bCLboW$\u0019\n\\\u0013,,\bL55\u0004a(/F}\tJq\u0001", (short) (C1499aX.Xd() ^ (-14585))));
                                            Class<?>[] clsArr8 = new Class[1];
                                            clsArr8[0] = Class.forName(EO.Od("O\u0019oC\u000fx\u000f=\u0002s@qEk1T\u000e\u0006\u0019$\u0012i\u0018\u001f\u0018Wm'<_\u0015*Fhw\u001fVSmtn", (short) (C1633zX.Xd() ^ (-21728))));
                                            Object[] objArr25 = {keyGenParameterSpec2};
                                            Method method14 = cls9.getMethod(C1561oA.Qd("swq{ofpl|f", (short) (C1499aX.Xd() ^ (-25486))), clsArr8);
                                            try {
                                                method14.setAccessible(true);
                                                method14.invoke(keyPairGenerator, objArr25);
                                                int i14 = f26822g + 53;
                                                f26824i = i14 % 128;
                                                if (i14 % 2 != 0) {
                                                    int i15 = 5 % 3;
                                                }
                                            } catch (InvocationTargetException e9) {
                                                throw e9.getCause();
                                            }
                                        } catch (InvocationTargetException e10) {
                                            throw e10.getCause();
                                        }
                                    } catch (InvocationTargetException e11) {
                                        throw e11.getCause();
                                    }
                                } catch (InvocationTargetException e12) {
                                    throw e12.getCause();
                                }
                            } catch (InvocationTargetException e13) {
                                throw e13.getCause();
                            }
                        } catch (InvocationTargetException e14) {
                            throw e14.getCause();
                        }
                    } catch (InvocationTargetException e15) {
                        throw e15.getCause();
                    }
                }
                short sXd9 = (short) (OY.Xd() ^ 26161);
                short sXd10 = (short) (OY.Xd() ^ 9102);
                int[] iArr6 = new int["`XnZ(na`sqiu{1Oj\u007fWir|Rq{s\u0002q\u0006\u0002\u0006g\u0006\u007f".length()];
                QB qb6 = new QB("`XnZ(na`sqiu{1Oj\u007fWir|Rq{s\u0002q\u0006\u0002\u0006g\u0006\u007f");
                int i16 = 0;
                while (qb6.YK()) {
                    int iKK6 = qb6.KK();
                    Xu xuXd6 = Xu.Xd(iKK6);
                    iArr6[i16] = xuXd6.fK((xuXd6.CK(iKK6) - (sXd9 + i16)) - sXd10);
                    i16++;
                }
                Class<?> cls10 = Class.forName(new String(iArr6, 0, i16));
                Object[] objArr26 = new Object[0];
                Method method15 = cls10.getMethod(C1561oA.od("\u0001}\u0006{\bu\bw\\u\t^nu}", (short) (FB.Xd() ^ 28162)), new Class[0]);
                try {
                    method15.setAccessible(true);
                    KeyPair keyPair = (KeyPair) method15.invoke(keyPairGenerator, objArr26);
                    if (!(!f.a())) {
                        int i17 = f26824i + 111;
                        f26822g = i17 % 128;
                        int i18 = i17 % 2;
                        Object[] objArr27 = new Object[1];
                        k((char) (Gravity.getAbsoluteGravity(0, 0) + 28154), TextUtils.indexOf("", ""), Color.alpha(0) + 28, objArr27);
                        String strIntern4 = ((String) objArr27[0]).intern();
                        Object[] objArr28 = new Object[1];
                        k((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 191 - (ViewConfiguration.getWindowTouchSlop() >> 8), 18 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr28);
                        f.c(strIntern4, ((String) objArr28[0]).intern());
                    }
                    return keyPair.getPublic().getEncoded();
                } catch (InvocationTargetException e16) {
                    throw e16.getCause();
                }
            } catch (InvocationTargetException e17) {
                throw e17.getCause();
            }
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException | ProviderException e18) {
            throw new d(e18.getMessage(), e18);
        }
    }
}
