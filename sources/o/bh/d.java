package o.bh;

import android.content.Context;
import android.content.SharedPreferences;
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
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.util.Locale;
import javax.crypto.NoSuchPaddingException;
import o.a.j;
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
public final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f21191a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f21192b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f21193c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f21194d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char[] f21195f = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static long f21196j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f21197k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static short[] f21198l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static byte[] f21199m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f21200n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f21201o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f21202p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f21203q = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f21204s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f21205t = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21206e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private KeyStore f21207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f21208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PrivateKey f21209i;

    public static final class c extends Exception {
        c(String str) {
            super(str);
        }
    }

    private static String $$c(int i2, short s2, int i3) {
        int i4 = i3 + 4;
        int i5 = s2 + 99;
        int i6 = i2 * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        int i8 = -1;
        if (bArr == null) {
            i5 = (-i5) + i4;
            i4 = i4;
        }
        while (true) {
            i8++;
            int i9 = i4 + 1;
            bArr2[i8] = (byte) i5;
            if (i8 == i7) {
                return new String(bArr2, 0);
            }
            i5 = (-bArr[i9]) + i5;
            i4 = i9;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21193c = -1446038311;
        f21192b = 1428329444;
        f21191a = -1153700525;
        f21194d = 1015939534;
        f21203q = 0;
        f21202p = 1;
        f21205t = 0;
        f21204s = 1;
        c();
        a();
        ViewConfiguration.getGlobalActionKeyTimeout();
        KeyEvent.getMaxKeyCode();
        TextUtils.indexOf((CharSequence) "", '0');
        KeyEvent.keyCodeFromString("");
        ViewConfiguration.getMaximumDrawingCacheSize();
        PointF.length(0.0f, 0.0f);
        ExpandableListView.getPackedPositionType(0L);
        ViewConfiguration.getLongPressTimeout();
        Drawable.resolveOpacity(0, 0);
        ViewConfiguration.getScrollBarSize();
        KeyEvent.getDeadChar(0, 0);
        ViewConfiguration.getMaximumFlingVelocity();
        int i2 = f21202p + 95;
        f21203q = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void a() {
        char[] cArr = new char[1793];
        ByteBuffer.wrap("\u0094³ù9OÖÜc\"$°Û\u0005vk\u0003ùÝNtÜ.\"¹·y\u0005*k°øEN\u0004Ü³!F·ï\u0005 \u0094\u009bù4OËÜ~UB8õ\u008e\u0015\u001dûãåq\u0016\u0094\u009bù4OËÜ~\"r°\u0097\u0005\"k\u000fùÜNyÜ\u0010\"³·b\u0005\u000ek«øDN\u0015Üú!I·ï\u0005«j\u001aøðN\u008fÓQ!õ·\u0094\u0004/jàø\u009fM&ÛR¶ý\u0000\u0002\u0093·m»ÿ^Jë$Í¶\u0014\u0001ó\u0093Îmmø¸JÁ$r·\u0093\u0001Ï\u0093zn\u0085ø$J;%\u0098·.\u0001Z\u009cÛn!øNKà%4·E\u0002î\u009c\u0011n^ù÷\u0094\u009bù4OËÜ~\"r°\u0097\u0005\"k\u0001ù×NcÜ\u0011\"¾·}\u0005\bk§ø\nN\u001dÜ¯!V·ª\u0005½j\\ø¢N\u009fÓA!ÿ.\u0093C õÃfm\u0098'\nÌ¿zÑ\u001bC\u0086ôjf\u0013\u0098¨\ro¿\rÑ³B\u001eô\rf«\u009bO\rí¿²ÐABäô\u009bêâ\u0087M1²¢\u0007\\\u000bÎî{[\u0015x\u0087®0\u001a¢;\\ÃÉ\n{j\u0015É\u0086s0d¢Ö_/ÉÓ{Ä\u0014%\u0086Û0æ\u00ad8_\u0086\u008c.á\u0081W~ÄË:Ç¨\"\u001d\u0097s\u00adábVÜÄ²:\u000b¯Ó\u001d¦s\u0019àøVçÄ\u00049ò¯F\u001d\u0014rûàXV-Ëâ\u001d\u0002p«ÆUUì«¿9^\u008cââ»pHÇíU\u0084«'>ö\u008c\u009aâ3qÚÇªU=¨Ý\u0094\u0096ù?OÁÜx\"+°Ê\u0005vk/ùÜNyÜ\u0010\"³·b\u0005\u000ek§øNN>Ü©!I·ª\u0005ÿj\u001aøòN\u0098Ó]!ì·\u008b\u0004.j÷ø\u0088MbÓÄ!\u009d¶.\u0004\u0082icÿ<MÓÒv \u0003¶Ó\u001bvi\u000bÿ°LwÒ\u001eí\\\u0080ë6\u000b¥è[àÉ\n|¯\u0012Þ\u0080\u00197¼¥Å[zÎð|Ö\u0012o\u0081\u009c7\u0090¥qX\u008eÎ!|d\u0013\u0091\u0081!7Dª\u0099X\"ÎE}ì\u0094\u0096ù?OÁÜx\"+°Ê\u0005vk/ùÜNyÜ\u0010\"³·b\u0005\u000ek§øNN>Ü©!I·ª\u0005ÿj\u001aøìN\u009fÓ^!ö·Â\u0004&jáø\u0091M\u0007ÓÄ!\u0091¶(\u0004Ûizÿ&MÓÒl \r¶ù\u001b\u007fi\u001b³ÄÞmhÚû\"\u0005x\u0097\u008b\",LSÞ\u009ei'û\u001a\u0005ù\u0090/\"[Lºß\u0017iRûë\u0006\t\u0090¦\"ãM\fß½q]\u001côª\n9³ÇàU\u0001à½\u008eä\u001c\u0017«²9ÛÇxR©àÅ\u008el\u001d\u0085«õ9bÄ\u0082Raà4\u008fÑ\u001d'«T6\u0095Ä=R\táä\u008f7\u001dR¨û6\u0018ÄISåá\f\u008c¥\u001aÕ¨\u00027¢Lv!ß\u0097h\u0004\u0085úÖh3Ý\u009a³ù!(\u0096\u0084\u0004íúDoØÝô³I ´\u0096ù\u0004\u0010ù\u00ado\u0018ÝQ²£ \u001c\u0096i\u000b¶ù\u0017\u0094 ù\tOãÜ%\"\u0017°ù\u0005@kEùâNQÜ!\"\u0099·#\u0005*k£øNN\u0016Ü³!L·í\u0094\u0096ù?OÁÜx\"+°Ê\u0005vk/ùÜNyÜ\u0010\"³·b\u0005\u000ek§øNN>Ü©!I·ª\u0005ÿj\u001aøæN\u008bÓF!û·Â\u0004.j÷ø\u0099M0ÓÓ!\u0082¶.\u0004ÇinÿrMÉÒw \t¶Ñ\u001b\u007fi\u0011ÿ¹LtÒ\u000f ®µF\u001b\u000biúþ\u0018Lª\u0094\u0096ù?OÁÜx\"+°Ê\u0005vk/ùÜNyÜ\u0010\"³·b\u0005\u000ek§øNN>Ü©!I·ª\u0005ÿj\u001aøçN\u0092ÓQ!ÿ·\u0092\u0004>jûø\u0095M,Ó\u008a!\u0085¶2\u0004Ëifÿ7M\u009aÒf \u000f¶Ñ\u001bhi\u001bÿºLfÒ\u0013 ¬µM\u001bRi¾þCLþÒ³\u0094\u0080ù?OÌÜo\"%°ÿ\u0005lk\tùÀNcÜ\u0012\"¾·w\u0005\u001ek\u008eøYN\u0019Üú!\u0018·ª\u0094\u0095ù?OÌÜo\" °Û\u0005vk\u000fùþNiÜ\t\"\u008f·|\u0005\u0019k°øSN\u0002Ü®!K·ä\u0005µjqøçN\u0093Ób!û·\u008b\u00048}{\u0010Ñ¦\"5\u0081ËÎY5ì\u0098\u0082á\u0010\u0010§\u00875çËa^\u0092ì÷\u0082^\u0011½§ì5@È¥^\nì[\u0083\u009f\u0011\t§}:\u008cÈ\u0015^eíÖ\u0083\\\u00119¤\u008c:4Èn_Ûí:\u0080\u008d\u0016Ø¤1;\u009eÉ¤_2ò\u009b\u0080ø\u0016\u0004¥\u0095;úÉE\\°òõ\u0080U\u0017 ¥\r;FÎ±\\\b\u0094 ù\tOãå¿\u00888>Ê\u00adtS1Áßtj\u001a-\u0088Û?o\u00ad=S²Æqt\u0004\u001a«\u0094·ù\u0019Oàõä\u0098W.§½\u001fC%Ñ¬d%\nH\u0098\u0090/5½JCëñÄ\u009cc*\u0081¹8GiÕ\u0082`%\u000eq\u009c\u0096+&Äd©Î\u001f=\u008c\u009erÑà*U\u0087;þ©\u000f\u001e\u0098\u008cør~ç\u008dUè;A¨¢\u001eó\u008c_qºç\u0015UD:\u0080¨\u0016\u001eb\u0083\u0093q\nçzTÉ:C¨&\u001d\u0093\u0083>q{æÈT69\u008b¯×\u001d\"\u0082\u009cpõ\u0084\u0081é+_ØÌ{24 Ï\u0015b{\u001béê^}Ì\u001d2\u009b§h\u0015\r{¤èG^\u0016Ìº1_§ð\u0015¡zeèó^\u0087Ãv1ï§\u009f\u0014,z¦èÃ]vÃê1\u008e¦+\u0014\u0096y{ï4]ÜÂy0\f¦\u0086\u000boy\u0014ï±\\pÂ\u000b0ö¥W\u000b\u0015yîîP\\ñÂ´7\u000e¥ò\u000b\u009bxDîû\\\u0091Á97ï¥\u0080\n1x\u009eî\u0096S;ÁÄ6n¤)\nÝ\u007fsí\rS\u0086Ào6\u0018¤º\t&\u007f\rí·RPÀF6¬\u009bS\t¾\u007f¯ìIRøÀ\u00915T\u009bë\t\u0092~pK<&\u0096\u0090e\u0003Æý\u0089orÚß´¦&W\u0091À\u0003 ý&hÕÚ°´\u0019'ú\u0091«\u0003\u0007þâhMÚ\u001cµØ'N\u0091:\fËþRh\"Û\u0091µ\u001b'~\u0092Ë\fmþ>i\u0084Û+¶Â \u008f\u0092g\rÎÿ®ikÄÇ¶ë \f\u0093Ý\róÿ\u0000jæÄ¢¶S!ì\u0093F\r\u0015øöjYÄ\"·ï!Z\u0093$\u000e\u008dø\u001bj$Å\u0082·w!3\u009c\u009c\u000e~ù×kÛÅr°ß\"·\u009c~\u000fÀù¿k\u0002ÆÏ°º\"\u0004\u009díF¼+\u0019\u009d\u0092\u000ekð,bÜ×\"¹\f+Ïø\u0017\u0095½#N°íN¢ÜYiô\u0007\u008d\u0095|\"ë°\u008bN\rÛþi\u009b\u00072\u0094Ñ\"\u0080°,MÉÛfi7\u0006ó\u0094e\"\u0011¿àMyÛ\thº\u00060\u0094U!à¿CM\u0015Ú¡h\u0000\u0005ø\u0093±!Q¾òLÈÚCwí\u0005\u0083\u0093+ õ¾\u008bL3ÙÎw\u0085\u00054\u0092Ì q¾pKÛÙrw\r\u0004Ñ\u0092l \u0005½¬\u0094\u0095ù?OÖÜO\"<°Ù\u0005mk\u000eù×N~Ü2\"¿·p\u0005\u0016k«øIN9Ü¿![·É\u0005·jHøöN\u0083ÓT!ó·\u0081\u0004+jæø\u009fM\u0001ÓÂ!\u0093¶3\u0004Ìi*ÿ\u007fM\u009aÒg \u0018¶À\u001bui\u0010ÿêLeÒ\u0012 §µD\u001bRi¼þGLþÒ±'Rµë\u001b\u0084hUþºL\u0081Ñ/'àµ\u008e\u001a+hÌþ\u009bC9ÑÃ&~´7\u001a\u009aoaý\u0002CÓÐs&\fL\u0004!®\u0097G\u0004Þú\u00adhHÝü³\u009f!F\u0096ï\u0004£ú.oáÝ\u0087³: Ø\u0096¨\u0004.ùÊoXÝ&²Ù g\u0096\u0012\u000bÅùbo\u0010Üº²w \u000e\u0095\u0090\u000bSù\u0002n¢Ü]±»'î\u0095\u000b\nýø\u008enOÃç±Ó'8\u0094æ\n\u0099ø'mÒÃ\u0085±\"&Ð\u0094z\n7ÿÎm3Ã\u0018°Ë&j\u0094\u001a\tµÿ#m\rÂ¶°O&\u0000\u009b£\tVþÿ\u0094\u0090ù/OËÜf\"6°û\u0005ak\u001eùÛNlÜ\u0003\"¾·{\u0005\u0015k¬øxN\u0017Ü«!W·ï\u0005¡jNø¢NÇÓ\u0012!ù·\u0087\u00048jæø\u0093M$ÓÃ!\u0091¶;\u0004ÖioÿrM\u009fÒf J¶Ô\u001bhi\rÿ§L2Ò\u0019 ªµK\u001b\u001bi´þ\u0002L°Òò'\u001fµñ\u0004\u0000iªßCLÚ²© L\u0095øû\u009biBÞëL§²*'å\u0095\u0083û>hÜÞ¬L*±Î'\\\u0095\"úÝhcÞ\u0016CÁ±f'\u0014\u0094¾úsh\nÝ\u0094CW±\u0006&¦\u0094Yù¿oêÝ\u000fBô°\u009e&I\u008báù\u0098o+Ü§B\u008a°9%Ü\u008b\u0088ù+nÒÜ?B$·Ê%e\u008b\u000bøÎniÜ\u001eA¼·f%\u001b\u008a²ø\u001fn\u0004Ó§AV¶ö$©\u0094\u0095ù?OÖÜO\"<°Ù\u0005mk\u000eù×N~Ü2\"¿·p\u0005\u0016k«øIN9Ü¿![·É\u0005·jHøöN\u0083ÓT!ó·\u0081\u0004+jæø\u009fM\u0001ÓÂ!\u0093¶3\u0004Ìi*ÿ\u007fM\u009aÒa \u000f¶À\u001bni\u000bÿ¬L{Ò\u0019 £µ^\u001b\u0017iúþALâÒ³'Sµì\u001bÊhBþèL\u0087Ñ:'óµ\u0088\u001a'hÎþÒC`Ñ\u0082\u0094\u0094ù6O×Üy\":nç\u0003Eµ¤&\nØIJéÿ\\\u00919\u0003±´\u001b&~ØÏM\bÿm\u0091Ô\u0002+´!&ÇÛ>M\u008dÿ\u0081\u0090 \u0002\u009f´ð)5Û\u0080MðþU\u0090\u0088\u0002ó·T)½\u0094\u0094ù6O×Üy\":°\u009a\u0005/kJùÙN\u007fÜ\u001b\"¹·f\u0005\u0015k°øONRÜµ!W·þ\u0005òjUøäNÊÓG!é·\u0087\u0094\u0099ù?OÛÜy\"&°Õ\u0005pk\u000fù\u0092NuÜ\u0017\"¾·2\u0005\u0015k¤ø\nN\u0007Ü©!Gôb\u0099È/!¼\u00adB×Ð$e\u0083\u000bü\u00991.\u0088¼ÞBX×\u009ce\u00ad\u000b\u0018\u0098ý.æ¼EA°×\u001eeN\n¤\u0098\u001b.z³åA\b×mdÔ\n\u0016\u0098y-Ð³3AfÖÈdu\t\u0092\u009fÃ-m²\u009e@øÖ<{Í\tå\u009f\\,\u008c²ÿ@\u0015Õç{¥\u0094\u0095ù?OÖÜZ\" °Ó\u0005tk\u000bùÆN\u007fÜ)\"¯·k\u0005Zkïø\nN\u0019Ü¿![·ª\u0005¢j[øëN\u0098Ó\u0012!ó·\u0091\u0004jjüø\u0095M6Ó\u008a!\u0082¶(\u0004Çiyÿ7MÔÒv J¶\u009a\u001bti\rÿêLqÒ\u001f °µ^\u001b\u001bi¼þKLéÒ³'Nµç\u001bÃ\u0094\u0095ù?OÖÜZ\" °Ó\u0005tk\u000bùÆN\u007fÜ)\"¯·k\u0005Zkïø\nN\u0019Ü¿![·ª\u0005¢j[øëN\u0098Ó\u0012!ó·\u0091\u0004jjüø\u0095M6Ó\u008a!\u0082¶(\u0004Çiyÿ7MÔÒv J¶\u009a\u001bti\rÿêLbÒ\b «µ\\\u001b\u0013i®þGLªÒ¹'_µû\u001bÃrÎ\u001fd©\u008d:\u0001Ä{V\u0088ã/\u008dP\u001f\u009d¨$:rÄôQ0ã\u0001\u008d´\u001eQ¨B:äÇ\u0000Qñãù\u008c\u0000\u001e°¨Ã5IÇ¨QÊâ1\u008c¹\u001eÓ«|5\u0082ÇÌPoâ\u008d\u008fq\u0019h«\u008f4=Æ\u0011P\u009cý2\u008fX\u0019óª%4D\u0094\u0094ù(O\u008cÜk\"<°Î\u0005gk\u0006ùÝNjÜL\"«·|\u0005\u000ek§øFN\u001dÜª!J·é\u0005·jVøëN\u0088Ó@!û·\u0090\u00043jÍø\u0089M*ÓË!\u0080¶?\u0004ÆiUÿ\"MÈÒg \f¶×\u001bhi\u0007ÿ¤LqÒ\u001f ±\u0094\u0093ù9OÖÜ$\"7°Ö\u0005qk\u0001Û×¶}\u0000\u0094\u0093\rm~ÿ\u009bJ2$Q¶\u0080\u0001,\u0093Emìø\u001cJK$ë·H\u0001\u001d\u0093¸n\u0005ø¦Jó%\n·¹\u0001Ø\u009c\u0004n½øÄK(%¼·Ë\u0002k\u009cÈnÞùwK\u0094&h°`\u0002\u008a\u009d%o[ù\u0095T6&TÌ°¡\u001a\u0017ó\u0084jz\u0019èü]U36¡ç\u0016K\u0084\"z\u008bï{],3\u008c /\u0016z\u0084ßykïÜ]\u009c2? \u008f\u0016\u00ad\u008bvyÌï¢\\Y2\u0083 ö\u0015G\u008bµy÷Lz!Õ\u00976\u0004\u0083úÌh\u0004Ý\u0097³ò!;\u0096\u0098\u0004éúEo\u008cÝå³u ¢\u0096â\u0004\u0001ùôoQÝE²² \u0012\u00961\u000báù\u0003oxÜÂ²\f 7\u0095\u008d\u000bxù)n\u009bÜy\u0094\u0094ù6O×Üy\":°ÿ\u0005lk\tùÀNcÜ\u0012\"¾·w\u0005\u001ek\u008eøYN\u0019\u0081\u000fì\u00adZLÉâ7¡¥j\u0010ü~\u0088ìz[õÉ\u00967#¢ì".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1793);
        f21195f = cArr;
        f21196j = 6620847014420674906L;
    }

    private static void a(KeyStore keyStore) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21205t + 1;
        f21204s = i3 % 128;
        if (i3 % 2 == 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            r((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), View.MeasureSpec.getMode(0), (KeyEvent.getMaxKeyCode() >> 16) + 21, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            r((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 5531), 1780 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.myTid() >> 22) + 13, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i4 = f21205t + 125;
            f21204s = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 4;
            }
        }
        Object[] objArr3 = new Object[1];
        r((char) (View.MeasureSpec.getSize(0) + 49628), TextUtils.indexOf((CharSequence) "", '0') + 26, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5, objArr3);
        Object[] objArr4 = {((String) objArr3[0]).intern()};
        Method method = Class.forName(C1561oA.yd("\u0012\n\u001c\bQ\u0018\u0007\u0006\u0015\u0013\u0007\u0013\u0015Jd\u007f\u0011k\n\u0006\u0006y", (short) (C1580rY.Xd() ^ (-26529)))).getMethod(Xg.qd("npxr\u0003tU\u007f\u0007\u0006\u000e", (short) (C1580rY.Xd() ^ (-24334)), (short) (C1580rY.Xd() ^ (-11199))), Class.forName(C1561oA.Yd("TLbN\u001c[Q_Y!Gih`f`", (short) (FB.Xd() ^ 2406))));
        try {
            method.setAccessible(true);
            method.invoke(keyStore, objArr4);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static /* synthetic */ Object b(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i7;
        int i9 = ~i5;
        int i10 = ~((i8 + i9) - (i8 & i9));
        int i11 = ~i6;
        int i12 = ~(i9 | i11);
        int i13 = i10 | i12;
        int i14 = (~((-1) - (((-1) - i6) & ((-1) - (i9 | i7))))) | ((-1) - (((-1) - (~(i8 | i5))) & ((-1) - (~(i11 | i8)))));
        int i15 = i7 + i5 + i2 + ((-1336646162) * i3) + (1706069763 * i4);
        int i16 = i15 * i15;
        int i17 = ((i7 * (-1709230891)) - 203685888) + ((-1709230891) * i5) + ((-1137600936) * i13) + (568800468 * i12) + ((-568800468) * i14) + (2016935936 * i2) + ((-602931200) * i3) + ((-1331167232) * i4) + ((-1604583424) * i16);
        int i18 = ((i7 * 112646815) - 831444653) + (i5 * 112646815) + (i13 * 520) + (i12 * (-260)) + (i14 * 260) + (i2 * 112647075) + (i3 * (-2078048118)) + (i4 * (-2015059991)) + (i16 * (-829161472));
        return i17 + ((i18 * i18) * (-1266417664)) != 1 ? d(objArr) : c(objArr);
    }

    private static void b(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21204s + 47;
        f21205t = i3 % 128;
        if (i3 % 2 != 0) {
            f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!f.a())) {
            int i4 = f21205t + 11;
            f21204s = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            r((char) (KeyEvent.getMaxKeyCode() >> 16), ViewConfiguration.getTouchSlop() >> 8, 21 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            r((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.getTrimmedLength("") + 1763, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i6 = f21204s + 101;
            f21205t = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 % 2;
            }
        }
        Object[] objArr3 = new Object[1];
        r((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 1598, (ViewConfiguration.getScrollBarSize() >> 8) + 47, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Class<?> cls = Class.forName(Jg.Wd("f9|W\"k\\ruQ\u001eI\u0007^3:$?\r`\u001e\u0017A", (short) (FB.Xd() ^ 30051), (short) (FB.Xd() ^ 2222)));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1580rY.Xd() ^ (-16994));
        short sXd2 = (short) (C1580rY.Xd() ^ (-26065));
        int[] iArr = new int["\u0018\u0012h+\t;\u00070.Iewwf1t".length()];
        QB qb = new QB("\u0018\u0012h+\t;\u00070.Iewwf1t");
        int i8 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i8] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i8 % C1561oA.Xd.length] ^ ((i8 * sXd2) + sXd)));
            i8++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i8));
        clsArr[1] = Integer.TYPE;
        Object[] objArr4 = {strIntern2, 0};
        Method method = cls.getMethod(C1626yg.Ud("wQNsM:{90k\u0002[\u0003O\u0011X\u000f\u0012*\\", (short) (C1633zX.Xd() ^ (-16118)), (short) (C1633zX.Xd() ^ (-15531))), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(context, objArr4)).edit();
            Object[] objArr5 = new Object[1];
            r((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1643, (ViewConfiguration.getTapTimeout() >> 16) + 8, objArr5);
            editorEdit.putString(((String) objArr5[0]).intern(), "").commit();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static void b(Context context, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21205t + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f21204s = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            r((char) TextUtils.getOffsetAfter("", 0), ViewConfiguration.getTouchSlop() >> 8, 21 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            r((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 55548), 1728 - Color.blue(0), 'S' - AndroidCharacter.getMirror('0'), objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(str).toString());
            int i5 = f21205t + 105;
            f21204s = i5 % 128;
            int i6 = i5 % 2;
        }
        Object[] objArr3 = new Object[1];
        r((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 1597 - Color.alpha(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Class<?> cls = Class.forName(Ig.wd("\u0011nv%y\u001e\u00057)ej\u000f,/9\u0011L\u0007Nl\u001a\n(", (short) (C1607wl.Xd() ^ 17573)));
        Class<?>[] clsArr = {Class.forName(EO.Od("\u00075:\u0004ZM\\\u001c;\u0005.'ONE\u001b", (short) (FB.Xd() ^ 19093))), Integer.TYPE};
        Object[] objArr4 = {strIntern2, 0};
        short sXd = (short) (Od.Xd() ^ (-6057));
        int[] iArr = new int["sp~\\phxjhStffdpbj^_l".length()];
        QB qb = new QB("sp~\\phxjhStffdpbj^_l");
        int i7 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i7] = xuXd.fK(sXd + sXd + sXd + i7 + xuXd.CK(iKK));
            i7++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i7), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(context, objArr4)).edit();
            Object[] objArr5 = new Object[1];
            r((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1644 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Color.rgb(0, 0, 0) + 16777224, objArr5);
            editorEdit.putString(((String) objArr5[0]).intern(), str).commit();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object c(java.lang.Object[] r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bh.d.c(java.lang.Object[]):java.lang.Object");
    }

    static void c() {
        f21201o = -59189545;
        f21197k = 1150422499;
        f21200n = -1493395098;
        f21199m = new byte[]{40, 64, 48, 53, 74, 107, 88, -14, 54, 73, 58, 74, 66, 120, -5, 90, 38, 88, 58, 16, -120, 117, -99, 125, -119, -123, -91, 85, -97, -116, Ascii.DC4, 108, 68, 86, 116, 32, 108};
    }

    private static /* synthetic */ Object d(Object[] objArr) throws Throwable {
        Context context = (Context) objArr[0];
        int i2 = 2 % 2;
        Object[] objArr2 = new Object[1];
        r((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1597 - ((Process.getThreadPriority(0) + 20) >> 6), View.getDefaultSize(0, 0) + 47, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Class<?> cls = Class.forName(Qg.kd("'3(51*$l!,*/\u001f',dx$\"'\u0017)$", (short) (ZN.Xd() ^ 24565), (short) (ZN.Xd() ^ 11288)));
        Class<?>[] clsArr = {Class.forName(hg.Vd("qg{e1nbnf,Ppmcg_", (short) (C1499aX.Xd() ^ (-3579)), (short) (C1499aX.Xd() ^ (-7506)))), Integer.TYPE};
        Object[] objArr3 = {strIntern, 0};
        short sXd = (short) (ZN.Xd() ^ 8828);
        int[] iArr = new int["\"\u001f-\u000b\u001f\u0017'\u0019\u0017\u0002#\u0015\u0015\u0013\u001f\u0011\u0019\r\u000e\u001b".length()];
        QB qb = new QB("\"\u001f-\u000b\u001f\u0017'\u0019\u0017\u0002#\u0015\u0015\u0013\u001f\u0011\u0019\r\u000e\u001b");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr3);
            Object[] objArr4 = new Object[1];
            r((char) (ViewConfiguration.getScrollBarSize() >> 8), 1644 - KeyEvent.keyCodeFromString(""), 8 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4);
            String string = sharedPreferences.getString(((String) objArr4[0]).intern(), "");
            if (string.isEmpty()) {
                int i4 = f21205t + 91;
                f21204s = i4 % 128;
                Object obj = null;
                if (i4 % 2 == 0) {
                    f.a();
                    obj.hashCode();
                    throw null;
                }
                if (!(!f.a())) {
                    int i5 = f21204s + 83;
                    f21205t = i5 % 128;
                    int i6 = i5 % 2;
                    Object[] objArr5 = new Object[1];
                    r((char) (Process.myTid() >> 22), ViewConfiguration.getTouchSlop() >> 8, AndroidCharacter.getMirror('0') - 27, objArr5);
                    String strIntern2 = ((String) objArr5[0]).intern();
                    Object[] objArr6 = new Object[1];
                    r((char) (20290 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1652, 43 - TextUtils.getOffsetBefore("", 0), objArr6);
                    f.c(strIntern2, ((String) objArr6[0]).intern());
                }
                return null;
            }
            if (f.a()) {
                Object[] objArr7 = new Object[1];
                r((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (-16777195) - Color.rgb(0, 0, 0), objArr7);
                String strIntern3 = ((String) objArr7[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr8 = new Object[1];
                r((char) (Color.alpha(0) + 22565), 1694 - ImageFormat.getBitsPerPixel(0), 33 - ((Process.getThreadPriority(0) + 20) >> 6), objArr8);
                f.c(strIntern3, sb.append(((String) objArr8[0]).intern()).append(string).toString());
            }
            Class<?> cls2 = Class.forName(C1561oA.yd("\u0019'\u001a)#\u001e\u0016`55'+i~\u001b.-~y", (short) (C1633zX.Xd() ^ (-23667))));
            Class<?>[] clsArr2 = new Class[2];
            short sXd2 = (short) (C1607wl.Xd() ^ 11550);
            int[] iArr2 = new int["2*@,y9/=7~%GF>D>".length()];
            QB qb2 = new QB("2*@,y9/=7~%GF>D>");
            int i7 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i7] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i7));
                i7++;
            }
            clsArr2[0] = Class.forName(new String(iArr2, 0, i7));
            clsArr2[1] = Integer.TYPE;
            Object[] objArr9 = {string, 2};
            Method declaredMethod = cls2.getDeclaredMethod(Xg.qd("%'&3)+", (short) (C1499aX.Xd() ^ (-23672)), (short) (C1499aX.Xd() ^ (-16734))), clsArr2);
            try {
                declaredMethod.setAccessible(true);
                byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr9);
                int i8 = f21205t + 93;
                f21204s = i8 % 128;
                int i9 = i8 % 2;
                return bArr;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static PrivateKey d(KeyStore keyStore, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException {
        Object[] objArr = {keyStore, str};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i2 = f21192b * (-2037617865);
        f21192b = i2;
        int i3 = f21193c * 259442625;
        f21193c = i3;
        return (PrivateKey) b(i2, i3, (int) Runtime.getRuntime().freeMemory(), objArr, -575684763, iElapsedRealtime, 575684764);
    }

    private static byte[] d(Context context) {
        int i2 = f21194d * 369763347;
        f21194d = i2;
        int iActiveCount = Thread.activeCount();
        int i3 = 1701585059 * f21191a;
        f21191a = i3;
        return (byte[]) b(iActiveCount, i3, (int) Runtime.getRuntime().freeMemory(), new Object[]{context}, -3762107, i2, 3762107);
    }

    private boolean g() {
        int i2 = 2 % 2;
        int i3 = f21205t;
        int i4 = i3 + 117;
        f21204s = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.f21206e;
        int i5 = i3 + 45;
        f21204s = i5 % 128;
        if (i5 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    private static KeyStore i() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21205t + 19;
        f21204s = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        r((char) ((-16748276) - Color.rgb(0, 0, 0)), (Process.myPid() >> 22) + 652, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14, objArr);
        Object[] objArr2 = {((String) objArr[0]).intern()};
        Method declaredMethod = Class.forName(Jg.Wd("[\u001b6i\u0003\n\t^'lo~\u000f;!\u0002Q0[n:3", (short) (C1633zX.Xd() ^ (-12142)), (short) (C1633zX.Xd() ^ (-19614)))).getDeclaredMethod(C1626yg.Ud("Aj \u0010aH'mN\u0003\u001e", (short) (OY.Xd() ^ 14332), (short) (OY.Xd() ^ 19351)), Class.forName(ZO.xd("`f:`\u001ee:nUSl#\b27/", (short) (Od.Xd() ^ (-15097)), (short) (Od.Xd() ^ (-19619)))));
        try {
            declaredMethod.setAccessible(true);
            KeyStore keyStore = (KeyStore) declaredMethod.invoke(null, objArr2);
            Object[] objArr3 = {null};
            Method method = Class.forName(Ig.wd("\u001e^C\u0010;4<w/.!\u0014F\u000bus_)\u0010d-y", (short) (C1607wl.Xd() ^ 29881))).getMethod(C1561oA.Qd("|~oq", (short) (Od.Xd() ^ (-29776))), Class.forName(EO.Od("D\u0013*1\u0017\u0001ZA\u0006#ra6^\n\fe/\u001aZ!a\u0004*\u0011\rs\u0010\u0019gL'cTw\u001e\u0016g{\u0001\b", (short) (C1580rY.Xd() ^ (-24422)))));
            try {
                method.setAccessible(true);
                method.invoke(keyStore, objArr3);
                int i5 = f21204s + 47;
                f21205t = i5 % 128;
                int i6 = i5 % 2;
                return keyStore;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static void init$0() {
        $$a = new byte[]{45, 113, 111, 122};
        $$b = 106;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void r(char r21, int r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bh.d.r(char, int, int, java.lang.Object[]):void");
    }

    private static void u(short s2, int i2, byte b2, int i3, int i4, Object[] objArr) throws Throwable {
        long j2;
        j jVar = new j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(f21197k)};
            Object objA = o.d.d.a(-727631768);
            if (objA == null) {
                byte b3 = (byte) 0;
                objA = o.d.d.a(TextUtils.getOffsetBefore("", 0) + 238, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 44531), TextUtils.indexOf("", "") + 11, 35969549, false, $$c(b3, (byte) (b3 + 5), (byte) (-1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 0) {
                byte[] bArr = f21199m;
                float f2 = 0.0f;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = 0;
                    while (i6 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                        Object objA2 = o.d.d.a(-1239398195);
                        if (objA2 == null) {
                            int i7 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + IptcDirectory.TAG_COPYRIGHT_NOTICE;
                            char c2 = (char) ((TypedValue.complexToFraction(0, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(0, f2, f2) == f2 ? 0 : -1)) + 28649);
                            int iKeyCodeFromString = 11 - KeyEvent.keyCodeFromString("");
                            byte length2 = (byte) $$a.length;
                            objA2 = o.d.d.a(i7, c2, iKeyCodeFromString, 1621469864, false, $$c((byte) 0, length2, (byte) (length2 - 5)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i6] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                        i6++;
                        f2 = 0.0f;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = f21199m;
                    Object[] objArr4 = {Integer.valueOf(i4), Integer.valueOf(f21201o)};
                    Object objA3 = o.d.d.a(-727631768);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = o.d.d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 237, (char) (Color.argb(0, 0, 0, 0) + 44531), 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 35969549, false, $$c(b4, (byte) (b4 + 5), (byte) (-1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f21197k) ^ (-7649639543924978291L))));
                    j2 = -7649639543924978291L;
                } else {
                    j2 = -7649639543924978291L;
                    iIntValue = (short) (((short) (((long) f21198l[i4 + ((int) (((long) f21201o) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f21197k) ^ (-7649639543924978291L))));
                }
            } else {
                j2 = -7649639543924978291L;
            }
            if (iIntValue > 0) {
                jVar.f19936d = ((i4 + iIntValue) - 2) + ((int) (((long) f21201o) ^ j2)) + i5;
                Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f21200n), sb};
                Object objA4 = o.d.d.a(1819197256);
                if (objA4 == null) {
                    objA4 = o.d.d.a(ViewConfiguration.getLongPressTimeout() >> 16, (char) (TextUtils.lastIndexOf("", '0') + 5359), 11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr4 = f21199m;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i8 = 0; i8 < length3; i8++) {
                        bArr5[i8] = (byte) (((long) bArr4[i8]) ^ (-7649639543924978291L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = f21199m;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        short[] sArr = f21198l;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    }
                    sb.append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    jVar.f19934b++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3 A[PHI: r1
  0x00d3: PHI (r1v4 java.lang.String) = (r1v3 java.lang.String), (r1v11 java.lang.String) binds: [B:14:0x00cf, B:5:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void a(android.content.Context r22) throws o.bh.d.c {
        /*
            Method dump skipped, instruction units count: 2260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bh.d.a(android.content.Context):void");
    }

    public final o.ef.c b() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f21204s + 31;
        f21205t = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        r((char) (Process.myPid() >> 22), ViewConfiguration.getMinimumFlingVelocity() >> 16, 21 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        long j2 = 0;
        if (!g()) {
            Object[] objArr2 = new Object[1];
            r((char) (31170 - TextUtils.getCapsMode("", 0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 262, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 27, objArr2);
            throw new c(((String) objArr2[0]).intern());
        }
        try {
            KeyStore keyStore = this.f21207g;
            Object[] objArr3 = new Object[1];
            r((char) (Gravity.getAbsoluteGravity(0, 0) + 49628), (ViewConfiguration.getEdgeSlop() >> 16) + 25, 6 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Class<?> cls = Class.forName(EO.Od("\u0001(-uSvz\u0012sB5 p5<:\f\u0002\\-o\u001c", (short) (ZN.Xd() ^ 18288)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.Qd("KAU?\u000bH<H@\u0006*JG=A9", (short) (FB.Xd() ^ 3752)));
            Object[] objArr4 = {strIntern2};
            Method method = cls.getMethod(C1593ug.zd("YXh8[ilb`d_^rdCiclr", (short) (FB.Xd() ^ 4400), (short) (FB.Xd() ^ 14966)), clsArr);
            try {
                method.setAccessible(true);
                Certificate[] certificateArr = (Certificate[]) method.invoke(keyStore, objArr4);
                int i5 = f21205t + 121;
                f21204s = i5 % 128;
                int i6 = i5 % 2;
                if (certificateArr == null) {
                    if (!f.a()) {
                        return null;
                    }
                    int i7 = f21205t + 21;
                    f21204s = i7 % 128;
                    if (i7 % 2 == 0) {
                        Object[] objArr5 = new Object[1];
                        r((char) (16832657 << Color.rgb(1, 0, 1)), 31462 >> TextUtils.getOffsetAfter("", 1), 20 / View.resolveSizeAndState(0, 0, 1), objArr5);
                        obj = objArr5[0];
                    } else {
                        Object[] objArr6 = new Object[1];
                        r((char) (Color.rgb(0, 0, 0) + 16832657), TextUtils.getOffsetAfter("", 0) + 1048, 68 - View.resolveSizeAndState(0, 0, 0), objArr6);
                        obj = objArr6[0];
                    }
                    f.c(strIntern, ((String) obj).intern());
                    return null;
                }
                o.ef.c cVar = new o.ef.c();
                try {
                    int length = certificateArr.length;
                    int i8 = f21205t + 49;
                    f21204s = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        Certificate certificate = certificateArr[i10];
                        Object[] objArr7 = new Object[0];
                        Method method2 = Class.forName(C1561oA.od("aWkU!eVSd`V`d\u0018LMYZ\u0013'HTUIEG@=O?", (short) (C1499aX.Xd() ^ (-6615)))).getMethod(C1561oA.Kd("sr\u0003T~t\u0002wyy", (short) (ZN.Xd() ^ 32501)), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            Object[] objArr8 = {(byte[]) method2.invoke(certificate, objArr7), 10};
                            Method declaredMethod = Class.forName(Wg.Zd("\u0006w[Pz\\F7lRt_\fGTMl%\u0012", (short) (FB.Xd() ^ 20591), (short) (FB.Xd() ^ 4057))).getDeclaredMethod(C1561oA.Xd("\u001f)\u001f,\"$\u00140\u001576.4.", (short) (ZN.Xd() ^ 19744)), byte[].class, Integer.TYPE);
                            try {
                                declaredMethod.setAccessible(true);
                                String str = (String) declaredMethod.invoke(null, objArr8);
                                cVar.b(i11, str);
                                if (f.a()) {
                                    Locale locale = Locale.getDefault();
                                    Object[] objArr9 = new Object[1];
                                    r((char) Gravity.getAbsoluteGravity(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1116, 55 - ExpandableListView.getPackedPositionType(j2), objArr9);
                                    f.c(strIntern, String.format(locale, ((String) objArr9[0]).intern(), Integer.valueOf(i11), str));
                                }
                                i11++;
                                i10++;
                                j2 = 0;
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    int i12 = f21205t + 45;
                    f21204s = i12 % 128;
                    int i13 = i12 % 2;
                    if (f.a()) {
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr10 = new Object[1];
                        r((char) Drawable.resolveOpacity(0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 1240, 67 - (ViewConfiguration.getScrollBarSize() >> 8), objArr10);
                        f.c(strIntern, sb.append(((String) objArr10[0]).intern()).append(cVar).toString());
                        int i14 = f21205t + 105;
                        f21204s = i14 % 128;
                        int i15 = i14 % 2;
                    }
                    return cVar;
                } catch (CertificateEncodingException | o.ef.b e4) {
                    if (f.a()) {
                        Object[] objArr11 = new Object[1];
                        r((char) (37013 - View.resolveSize(0, 0)), 1171 - TextUtils.getTrimmedLength(""), 69 - (KeyEvent.getMaxKeyCode() >> 16), objArr11);
                        f.d(strIntern, ((String) objArr11[0]).intern());
                    }
                    throw new c(e4.getMessage());
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (KeyStoreException e6) {
            if (f.a()) {
                Object[] objArr12 = new Object[1];
                r((char) (ViewConfiguration.getTouchSlop() >> 8), ExpandableListView.getPackedPositionChild(0L) + 974, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 75, objArr12);
                f.e(strIntern, ((String) objArr12[0]).intern(), e6);
            }
            throw new c(e6.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.content.Context r21) throws o.bh.d.c {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bh.d.c(android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.String d() throws o.bh.d.c {
        /*
            Method dump skipped, instruction units count: 1031
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bh.d.d():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void d(android.content.Context r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bh.d.d(android.content.Context, java.lang.String):void");
    }

    public final void e(Context context) throws c {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f21204s + 111;
            f21205t = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            r((char) TextUtils.indexOf("", "", 0), TextUtils.getCapsMode("", 0, 0), 21 - TextUtils.getCapsMode("", 0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            r((char) View.resolveSizeAndState(0, 0, 0), 1308 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Color.alpha(0) + 5, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (!this.f21206e) {
            int i5 = f21205t + 81;
            f21204s = i5 % 128;
            int i6 = i5 % 2;
            if (f.a()) {
                Object[] objArr3 = new Object[1];
                r((char) (KeyEvent.getMaxKeyCode() >> 16), KeyEvent.getDeadChar(0, 0), View.resolveSizeAndState(0, 0, 0) + 21, objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                r((char) (64115 - Drawable.resolveOpacity(0, 0)), TextUtils.indexOf("", "") + 1312, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31, objArr4);
                f.d(strIntern2, ((String) objArr4[0]).intern());
            }
            Object[] objArr5 = new Object[1];
            r((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31169), View.resolveSizeAndState(0, 0, 0) + 262, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28, objArr5);
            throw new c(((String) objArr5[0]).intern());
        }
        try {
            b(context);
            a(this.f21207g);
        } catch (KeyStoreException e2) {
            if (f.a()) {
                Object[] objArr6 = new Object[1];
                r((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), ExpandableListView.getPackedPositionType(0L), 21 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr6);
                String strIntern3 = ((String) objArr6[0]).intern();
                Object[] objArr7 = new Object[1];
                r((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 1345 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 27, objArr7);
                f.e(strIntern3, ((String) objArr7[0]).intern(), e2);
            }
            Object[] objArr8 = new Object[1];
            r((char) View.getDefaultSize(0, 0), 1371 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 19 - ((Process.getThreadPriority(0) + 20) >> 6), objArr8);
            throw new c(((String) objArr8[0]).intern());
        }
    }

    final boolean e() {
        int i2 = 2 % 2;
        if (this.f21206e) {
            int i3 = f21204s + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            int i4 = i3 % 128;
            f21205t = i4;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.f21208h != null && this.f21209i != null) {
                int i5 = i4 + 17;
                f21204s = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 95;
                f21204s = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 11 / 0;
                }
                return true;
            }
        }
        return false;
    }
}
