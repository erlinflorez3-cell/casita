package o.eo;

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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferStatusCodes;
import com.google.common.base.Ascii;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.io.encoding.Base64;
import o.a.k;
import o.a.l;
import o.eo.b;
import o.eo.c;
import o.ep.h;
import o.ep.i;
import o.er.w;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f24303a = 0;

    /* JADX INFO: renamed from: b */
    public static int f24304b = 0;

    /* JADX INFO: renamed from: c */
    public static int f24305c = 0;

    /* JADX INFO: renamed from: d */
    public static int f24306d = 0;

    /* JADX INFO: renamed from: e */
    public static int f24307e = 0;

    /* JADX INFO: renamed from: f */
    private static char[] f24308f = null;

    /* JADX INFO: renamed from: g */
    private static int f24309g = 0;

    /* JADX INFO: renamed from: i */
    private static long f24310i = 0;

    /* JADX INFO: renamed from: j */
    private static char f24311j = 0;

    /* JADX INFO: renamed from: l */
    private static int f24312l = 0;

    /* JADX INFO: renamed from: m */
    private static int f24313m = 0;

    /* JADX INFO: renamed from: o */
    private static int f24314o = 0;

    /* JADX INFO: renamed from: h */
    private final c f24315h = new c();

    /* JADX INFO: renamed from: o.eo.e$1 */
    final class AnonymousClass1 implements b.d<o.ex.b<?>> {

        /* JADX INFO: renamed from: a */
        private static int f24316a = 1;

        /* JADX INFO: renamed from: d */
        private static int f24317d = 0;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ d f24318b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Context f24319c;

        AnonymousClass1(Context context, d dVar) {
            context = context;
            dVar = dVar;
        }

        @Override // o.eo.b.d
        public final void a(o.by.c cVar) {
            int i2 = 2 % 2;
            int i3 = f24317d;
            int i4 = (i3 ^ 17) + (((i3 + 17) - (i3 | 17)) << 1);
            f24316a = i4 % 128;
            int i5 = i4 % 2;
            dVar.a(cVar);
            int i6 = f24317d;
            int i7 = (i6 ^ 3) + (((i6 + 3) - (i6 | 3)) << 1);
            f24316a = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 63 / 0;
            }
        }

        @Override // o.eo.b.d
        public final void c(List<o.ex.b<?>> list) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f24316a;
            int i4 = (((i3 + 1) - (1 & i3)) << 1) - (i3 ^ 1);
            f24317d = i4 % 128;
            if (i4 % 2 != 0) {
                e.this.e(context);
                dVar.d(list);
                int i5 = 92 / 0;
            } else {
                e.this.e(context);
                dVar.d(list);
            }
            int i6 = f24316a;
            int i7 = (((-1) - (((-1) - i6) & ((-1) - 125))) << 1) - (i6 ^ 125);
            f24317d = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    /* JADX INFO: renamed from: o.eo.e$2 */
    public class AnonymousClass2 implements d<i> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final int $$f = 0;
        private static int $10 = 0;
        private static int $11 = 0;
        public static int A = 0;
        public static int B = 0;
        public static int C = 0;

        /* JADX INFO: renamed from: a */
        private static int f24321a = 0;

        /* JADX INFO: renamed from: b */
        private static char[] f24322b = null;

        /* JADX INFO: renamed from: d */
        private static long f24323d = 0;

        /* JADX INFO: renamed from: f */
        public static int f24324f = 0;

        /* JADX INFO: renamed from: g */
        public static int f24325g = 0;

        /* JADX INFO: renamed from: h */
        public static int f24326h = 0;

        /* JADX INFO: renamed from: i */
        private static int f24327i = 0;

        /* JADX INFO: renamed from: j */
        public static int f24328j = 0;

        /* JADX INFO: renamed from: k */
        public static int f24329k = 0;

        /* JADX INFO: renamed from: l */
        public static int f24330l = 0;

        /* JADX INFO: renamed from: m */
        public static int f24331m = 0;

        /* JADX INFO: renamed from: n */
        public static int f24332n = 0;

        /* JADX INFO: renamed from: o */
        public static int f24333o = 0;

        /* JADX INFO: renamed from: p */
        public static int f24334p = 0;

        /* JADX INFO: renamed from: q */
        public static int f24335q = 0;

        /* JADX INFO: renamed from: r */
        public static int f24336r = 0;

        /* JADX INFO: renamed from: s */
        public static int f24337s = 0;

        /* JADX INFO: renamed from: t */
        public static int f24338t = 0;

        /* JADX INFO: renamed from: u */
        public static int f24339u = 0;

        /* JADX INFO: renamed from: v */
        public static int f24340v = 0;

        /* JADX INFO: renamed from: w */
        public static int f24341w = 0;

        /* JADX INFO: renamed from: x */
        public static int f24342x = 0;

        /* JADX INFO: renamed from: y */
        public static int f24343y = 0;

        /* JADX INFO: renamed from: z */
        public static int f24344z = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ d f24345c;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0021 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$g(int r8, byte r9, short r10) {
            /*
                int r8 = r8 + 99
                byte[] r7 = o.eo.e.AnonymousClass2.$$c
                int r6 = r10 * 3
                int r1 = r6 + 1
                int r0 = r9 * 2
                int r5 = r0 + 4
                byte[] r4 = new byte[r1]
                r3 = 0
                if (r7 != 0) goto L28
                r2 = r5
                r1 = r3
            L13:
                int r5 = r5 + 1
                int r8 = r8 + r2
            L16:
                byte r0 = (byte) r8
                r4[r1] = r0
                if (r1 != r6) goto L21
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L21:
                int r1 = r1 + 1
                r0 = r7[r5]
                r2 = r8
                r8 = r0
                goto L13
            L28:
                r1 = r3
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.eo.e.AnonymousClass2.$$g(int, byte, short):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            C = -702301194;
            B = -1564629049;
            A = 49865529;
            f24344z = 1432755855;
            f24343y = -1716729068;
            f24342x = 1228627024;
            f24341w = -510000020;
            f24340v = 903373012;
            f24339u = 1776862721;
            f24338t = 706701359;
            f24337s = 1138832763;
            f24336r = 498304769;
            f24335q = 1045666762;
            f24334p = 1317719238;
            f24333o = -165488513;
            f24332n = -593908558;
            f24331m = -359286224;
            f24330l = -1820688168;
            f24329k = 458268332;
            f24328j = -319200350;
            f24326h = 1495648400;
            f24325g = 1290544474;
            f24324f = -1831618548;
            init$0();
            f24321a = 0;
            f24327i = 1;
            char[] cArr = new char[1953];
            ByteBuffer.wrap("\u0092îÙ\u0093\u0004Ss\b¿øê\u0099QH\u009c\u0019Èß7\u0088bU©\u0013\u0015ÒÎv\u0085%X÷/´ãV¶+\rëÀ°\u0094@k!>ðõ¡Ig\u001c0Óá¦ z$1i\u0084¤[¶/kâ+¹ð\f\u0087Àk\u0097 já!þõ$\u0094\u0093ßÂ\u0002\u0002uW¹\u009cìÖ-Áf\u009a»fÌ\u0001\u0000ÇU\u009cî[#\u0012(\u0099c\u0092¾SÉ\u0000\u0005\u0099P\u0091ëY&\u001arÒ\u008d\u0090Ø_\u0013\u0005¯Þú©5W@\u0012\u009cÒ×\u0084bS½\u0005ÉÅ\u0004©_Eê\u0006&×q\u0095\u008cS]ï\u0016äË%¼vpï%ç\u009e/Sl\u0007¤øæ\u00ad)fsÚ¨\u008fß@05ié°¢å\u0017\u001fÈd¼°qò*#\u009ftS¤\u0000ÂKÉ\u0096\bá[-ÂxÊÃ\u0002\u000eAZ\u0089¥Ëð\u0004;^\u0087\u0085Òò\u001d\u001ehT´\u0083ÿÎ\u0094ÝßÁ\u0002\u000buA¹ÝìßW\u001d\u009aVÎ\u00871Þd\u0017¯\u001d\u0013\u0095FÝ\u0089\u001eüV \u0094kÛÞ\u0001\u0001Zu\u00ad¸Ðã\u0013VF\u009a\u0086Í×0\u0000{K\u0094Ýß×\u0002\u0006uQ¹ÝìÖW\u0015\u009a\u001cÎ\u00821Àd\u001d¯B©ÇâÍ?\u001cHK\u0084ÇÑÛj\u0001§EóÆ\fØY\u001a\u0092G.\u0098\u0094ÝßÁ\u0002\u0016uQ¹\u0093ìÀW\u0016\u009a\u001dÎ 1ôd?¯]\u0013\u0084F×\u00896üS \u0086kÓ\u0094ÝßÁ\u0002\u000buA¹\u0086ì×W\u001f\u009a\u001dÎ\u009e1Ûd\u0010¯\u001d\u0013\u009eFÛ\u0089\u0010ü\\ \u0090k\u009cÞ\u0001\u0001]\u0094\u0090ßÛ\u0002\u0015u\\¹\u009dìÊ\u0094®ßó¨.ã2>øI²\u0085uÐ$kì¦îòc\r(Xï\u0093î/oz$µìÀ´\u001cWW\fâ¬=¯Id\u0084,ßôjì¦bñ.\fïGµ\u0093s..yí\u00969Ý%\u0000ïw¥»bî3Uû\u0098ùÌt3?fø\u00adù\u0011xD3\u008bûþ£\"@i\u001bÜ»\u0003¦wdº9áæcß(Ãõ\t\u0082CN\u0084\u001bÕ \u001dm\u001f9\u009cÆÙ\u0093\u0012X\u001fä\u009c±Ù~\u0012\u000b^×\u0095\u009cÝ)\u0005öf\u0082½OÀ\u0014\u0002¡_m\u0080:\u009eÇ\u0003\u008c_\u0094ÝßÖ\u0002\u0017uD¹ÝìÜW\u0017\u009a_Î\u00871Õd\u0007¯W\u0013\u0081FÆ\u0013}X \u0085¡ò\u00ad>zk&Ðã\u001d«I!¶'ãà(¼\u0094{\u007fâ4©ém\u009e?Ré\u0007â¼bq)%ø\u0094ÝßÂ\u0002\u0000u]¹\u0091ì\u009dW\u0014\u009a[Î\u009e1×d\u0001¯K\u0013\u0081FÆ\u0089\u0017ü_ \u0081Î\"\u0085iX¡/ùã?¶j\u0094\u0080ßÝ\u0002\\uB¹\u0080ìÝW\u0016\u009aGÎ\u00911Æd\\¯_\u0013\u0093FÜ\u0089\u0007üT \u0093kÑÞ\u0006\u0001Gu\u0080¸×ã\u0000·Nü\f!ÇV\u0090\u0094\u0082ß×\u0002\u0000uA¹\u009bìÁW\u0006\u009a\u001cÎ\u00811Ëd\u0001¯\u001c\u0013\u0090FÖ\u0089\\üV \u0097kÐÞ\u0007\u0001UuÜ¸Õã\u0002VG\u009aÜÍÔ0\u0013{Y¯\u0097\u0012íE\u0015\u0088Bü\u0087'íj\u0000ÝW\u0001\u009ctÖ¿\u0017â@V\u0097\u0099À\u0094\u0082ß×\u0002\u0000uA¹\u009bìÁW\u0006\u009a\u001cÎ\u00811Ëd\u0001¯\u001c\u0013\u0090FÖ\u0089\\üV \u0097kÐÞ\u0007\u0001UuÜ¸Õã\u0002VG\u009aÜÍÔ0\u0013{Y¯\u0097\u0012íE\u0015\u0088Bü\u0087'íj\u0004ÝW\u0001\u009ctÖ¿\u001dâ@\u0094\u0082ß×\u0002\u0000uA¹\u009bìÁW\u0006\u009a\u001cÎ\u00811Ëd\u0001¯\u001c\u0013\u0090FÖ\u0089\\üV \u0097kÐÞ\u0007\u0001UuÜ¸Àã\u001dV\u001c\u009a\u0091ÍÃ0\u001b\u0094\u0082ß×\u0002\u0000uA¹\u009bìÁW\u0006\u009a\u001cÎ\u00811Ëd\u0001¯\u001c\u0013\u0090FÖ\u0089\\üV \u0097kÐÞ\u0007\u0001UuÜ¸Àã\u001dV\u001c\u009a\u009eÍÓ0\u0011\u0099\tÒ\\\u000f\u008bxÊ´\u0010áJZ\u008d\u0097\u0097Ã\n<@i\u008a¢\u0097\u001e\u001bK]\u0084×ñÝ-\u001cf[Ó\u008c\fÞxWµKî\u0096[\u0097\u0097\u0014ÀZ=\u009aYÏ\u0012\u009aÏM¸\ftÖ!\u008c\u009aKWQ\u0003Ìü\u0086©LbQÞÝ\u008b\u009bD\u00111\u001bíÚ¦\u009d\u0013JÌ\u0018¸\u0091u\u008d.P\u009bQWÒ\u0000\u0091ý\\\u0094\u0084ßÐ\u0002\u001duJ¹\u0081ìÔ\u0014¨_·\u0082uõ(9älè×j\u001a(Nã±²äk/\"\u0093ôÊ«\u0081ÿ\\2+eçº²è\t8Än\u0090©\u0094µß×\u0002\u001cuK¹\u009fìÝW\u0006\u009a[Î\u009d1Ü+L`\u0017½ÒÊ\u0097\u0006VS\u000eè×\u0094\u0091ßÚ\u0002\u0000u]¹\u009fìÛW\u0007\u009a_\u0094\u0080ßÝ\u0002\\uB¹\u0080ìÝW\u0016\u009aGÎ\u00911Æd\\¯V\u0013\u0097FÄ\u0089\u001büQ \u0097å7®cs®\u0004ùÈy\u009d7&±\u0094\u0095ß×\u0002\u001cuW¹\u0080ìÛW\u0011Xé\u0013«Î`¹+uü §\u009bmV\u0011\u0002öýö¨8ªèáª<aK*\u0087ýÒ¦il¤\u0010ð÷\u000f÷Z9\u0091\u0010-¹xûñ\u0011ºLgÍ\u0010ÓÜ\u0011\u0089L2\u0087ÿÖ«\u0000TW\u0001ÍÊÎv\f#Gì\u0086\u0099Ï¾öõ¡(n\u0094\u0097ßß\u0002\u0007u^¹\u0093ìÆW\u001d\u009a@¸&óW.\u0097Y\u0087\u00955ÀR{\u0089¶Óâ\u000e\u001dJH\u0082\u0083\u0087?\u0001jH¥\u0095Ð\u0087\f$GOò\u0095-ÈY\n\u0094B\u0094³ßÜ\u0002\u0016u@¹\u009dìÛW\u0016\u009a\u0012Î¡1öd9¯\u0012\u0013\u0090FÇ\u0089\u001bü^ \u0086k\u0092Þ\u0014\u0001]u\u0080¸\u0092ã\nV\n\u009aÄ\u0017\u0095\\ú\u00810öf:»oýÔ0\u00194M\u0087²Ðç\u001f,4\u0090¶Åá\n=\u007fx£ è´]2\u0082{ö¦;´`,Õ,\u0019âNË³bø \u0090çÛº\u0006;q=½ôè§Sq\u009e\"Êô5§`p\u001eÜU\u0094\u0088Wÿ\u001f3Ýf\u0092ÝH\u0010\u0013\u0094\u0084ßÐ\u0002\u001duJ¹Êì\u0084\u008cÖÇ\u0085\u001aJm\u0007¡Ìô\u0091\u0094\u0080ßÝ\u0002\\uB¹\u0080ìÝW\u0016\u009aGÎ\u00911Æd\\¯P\u0013\u0080FÓ\u0089\u001cüV\u0094\u0080ßÝ\u0002\\uY¹\u0097ìÀW\u001c\u009aWÎ\u009e1\u009cd\u0003¯W\u0013\u009fFÇ\u0094Ã\u0094\u0080ßÝ\u0002\\uA¹\u0097ìÑW\u0007\u009a@Î\u0097\u0094ÂÀ\u001c\u008bAVÀ!Ìí\u001b¸G\u0003\u0082ÎÊ\u009a@e^0\u009cûÁG\n\u0012[Ý\u008d¨Ú\u0094\u0094ßÇ\u0002\u001eu^¹\u00adìÊWJ\u009a\u0004\u0094\u0080ßÝ\u0002\\uP¹\u0087ìÛW\u001e\u009aVÎÜ1Ôd\u001b¯\\\u0013\u0095F×\u0089\u0000üB \u0080kÛÞ\u001c\u0001F\u0003¡Hã\u0095(âc.´{ïÀ%\r)Yµ¦âó-8)\u0084¡Ñã\u001e(kc·´üïI%\u0094\u0095ß×\u0002\u001cuW¹\u0080ìÛW\u0011\u009amÎ\u008a1\u008adD¯\u001d\u0013\u0081FÖ\u0089\u0019üm \u008ak\u008aÞD\u0001\u001du\u0095¸×ã\u001cVW\u009a\u0080ÍÛ0\u0011{m¯\u008a\u0012\u008aEDy¯2íï&\u0098mTº\u0001áº+w'#¯Üç\u0089'Boþ¤«íd\u0017\u0011{Í¬\u0086ã3gìo\u0098\u00adUæ\u000e-»zw¡ ë\u0094\u0095ß×\u0002\u001cuW¹\u0080ìÛW\u0011\u009a\u001dÎ\u00841Ðd\u001d¯J\u0013ÊF\u0084\u0089\u0002ü\u001d \u0084kÐÞ\u001d\u0001JuÊ¸\u0084ã\u0002\u0094\u0095ßÝ\u0002\u001duU¹\u009eì×W]\u009aAÎ\u00961Ùd-¯U\u0013\u0082FÚ\u0089\u001dü\\ \u0097kíÞ\n\u0001\nuÄ¸\u009dã\u0015VW\u009a\u009cÍ×0\u0000{[¯\u0091\u0012íE\n\u0088\nüÄý·¶êkk\u001cgÐª\u0085ê>1ói§ªXä\r!Æ`z·\u0094\u0080ßÝ\u0002\\uP¹\u009dìÝW\u0006\u009a[Î\u009f1Ód\u0015¯W\u0013ÜFÐ\u0089\u0007ü[ \u009ekÖÞ\\\u0001Tu\u009b¸Üã\u0015VW\u009a\u0080ÍÂ0\u0000{[¯\u009c\u0012Æ\u0094³ßÜ\u0002\u0016u@¹\u009dìÛW\u0016\u009a\u001fÎ\u008a1\u008adDëÊ \u0097}\u0016\n\u001aÆÍ\u0093\u0091(Tå\u001c±\u0096N\u009c\u001bQÐ\u000blÈ9\u0094öY\u0083\u0001_\u0096\u0014\u0091¡\\åô®¥ss\u00044È\u00ad!£jä·#À~\fäYùâ</i{ä\u0084ûÑ/\u001ag¦¿ó§<:Ix\u0095¥Þúk9\u0094\u0083ß×\u0002\u001fuG¹ÜìÚW\u0005\u009a\u001cÎ\u009f1Ód\u001b¯\\\u0013\u0099F×\u0089\u000büA\u0094\u0083ß×\u0002\u001fuG¹ÜìÁW\u0014\u009a\u001cÎ\u00941Ód\u0019¯W\u0013\u00adFÑ\u0089\u0013ü_ \u0097kÀÞ\u0013\u009fçÔ³\t{~#²¸ç¥\\p\u0091xÅú:µor¤\t\u0018òM³\u0082x÷%+ÿ`¢Õo\u0094\u0080ßÝ\u0002\\uY¹\u0097ìÀW\u001c\u009aWÎ\u009e1\u009cd\u0013¯\\\u0013\u0096FÀ\u0089\u001dü[ \u0096k\u009cÞ\u0003\u0001Wu\u009f¸Çã\u0016\u0094\u0080ßÝ\u0002\\uP¹\u009dìÝW\u0006\u009a\u001cÎ\u00831×d\u001f¯G\u0013ÜFÓ\u0089\u0004üV \u00adkÜÞ\u0013\u0001_u\u0097+\u0007`Z½ÛÊÚ\u0006\u0011SXèÛ%×q\u0000\u008e\\Û\u0099\u0010Ñ¬[ùS6\u009cCÛ\u009f\u0012ÔPa\u0087¾ÅÊ\u0007\u0007\\\\\u009béÁ\u0094\u0080ßÝ\u0002\\uB¹\u0080ìÝW\u0016\u009aGÎ\u00911Æd\\¯P\u0013\u0087FÛ\u0089\u001eüV ÜkÔÞ\u001b\u0001\\u\u0095¸×ã\u0000VB\u009a\u0080ÍÛ0\u001c{F\u0006\u0083MÞ\u0090_çB+\u0088~ÂÅ\u0005\bT\\\u009c£\u009fö\u0013=D\u0081\u0098ÔÝ\u001b\u0015n\u001f²\u0097ùØL\u001f\u0093Vç\u0094*Ãq\u0001ÄC\b\u0098_ß¢\u0005\u0094\u0080ßÝ\u0002\\uA¹\u008bìÁW\u0006\u009aWÎ\u009f1íd\u0017¯J\u0013\u0086F\u009c\u0089\u0010üG \u009bkÞÞ\u0016\u0001\u001cu\u0094¸Ûã\u001cVU\u009a\u0097ÍÀ0\u0002{@¯\u009b\u0012ÜE\u0006°¢ûÿ&~Qf\u009dµÈþs4¾\u007fê¢\u0015¾@2\u008be7¹bü\u00ad4Ø>\u0004¶Oùú>%wQµ\u009câÇ rb¾¹éþ\u0014$f¨-õðt\u0087lK¿\u001eô¥>hu<¨ÃÅ\u0096>]vá±´÷{t\u000exÒ¯\u0099ó,6ó~\u0087ôJü\u00113¤th½?ÿÂ(\u0089j]¨àó·4znÁk`T+_ö\u009e\u0081ÍMT\u0018J£\u009enÖ:\u000eÅd\u0090\u008b[Òç\u000b²^\u0094ÝßÖ\u0002\u0017uD¹ÝìÁW\u001d\u009aQÎ\u00991×d\u0006¯\u001d\u0013\u0090FÓ\u0089\u0001üW \u0090kÓÞ\u001c\u0001Vu\u00ad¸Õã\u0017V\\\u009a\u008bÍÖOX\u0004SÙ\u0092®ÁbX7D\u008c\u0098AÔ\u0015\u001cêR¿\u0083t\u0098È\u0010\u009dRR\u0099'Îû\u0013~\u00885\u0083èB\u009f\u0011S\u0088\u0006\u0094½Hp\u0004$ÌÛ\u0082\u008eSEHùÖ¬\u0082cJ\u0016\u0012ÊÃÂ·\u0089«Ta#+ï·º©\u0001}Ì5\u0098íg\u00872lù*Eù\u0010»ß}<gw{ª±Ýû\u0011<Dmÿ¥2§f$\u0099aÌª\u0007§»$îa!ªTë\u0088\u0017Ãev©©äÝ$\u0010gK«þ×2,em\u0098ªÓý\u0007/ºWí¹ íT%\u008f}Âæuû©'\u0094ÝßÖ\u0002\u0017uD¹ÝìÐW\u0001\u009aFÎ\u00ad1Õd\u0002¯A\u0094ÝßÖ\u0002\u0017uD¹ÝìÐW\u0001\u009aFÎ\u00ad1Æd\u001b¯_\u0013\u0097\u0002vI}\u0094¼ãï/vzjÁ¶\fúX2§|ò\u00ad9¶\u0085;Ðj\u001f\u00adjÿ¶6ýuH½\u0097üã+.}W\u0016\u001c\nÁÀ¶\u008azM/\u001c\u0094ÔYÖ\rUò\u0010§ÛlÖÐU\u0085\u0010JÛ?\u009bãJ¨\r\u001dßÂ\u0096¶U{\u001d Ü\u0095\u008bYf\u000e\u0013ó×¸\u0090l\u0017Ñ\n\u0086Öyu2~ï¿\u0098ìTu\u0001xº©wî#;Üy\u0089¹BÿW=\u001c6Á÷¶¤z=/0\u0094áY¦\ruò+§àl½a\u009c*\u0097÷V\u0080\u0005L\u009c\u0019\u0091¢@o\u0007;ÞÄ\u0096\u0091TZ\u001d\u0094ÝßÖ\u0002\u0017uD¹ÝìÐW\u0001\u009aFÎ\u009d1Àd\u001b¯W\u0093úØñ\u00050rc¾úë÷P&\u009daÉ£6øc&¨r\u0094ÝßÖ\u0002\u0017uD¹ÝìÐW\u0001\u009aFÎ\u00821Õd\u0013¯[\u0013\u0082FÑ\u0094ÝßÖ\u0002\u0017uD¹ÝìÐW\u0001\u009aFÎ\u00ad1Ûd\u001f¯W,ögýº8Ím\u0001¸T¶ï=\"vv®\u0089÷Ü5\u0017v«¸þý1*D6\u0098÷Óáf;¹6Í»\u0000ê[-îr\u0094Ýßß\u0002\u001cuF¹ÝìÅW\u001b\u009a\\Î\u00961Ýd\u0005¯A\u0013ÝFð\u0089\u0001üF ¡kÚÞ\u0013\u0001@u\u0097¸Öã4V]\u009a\u009eÍÖ0\u0017{@\u0094ÝßÂ\u0002\u0000u]¹\u0091ì\u009dW\u001b\u009a]Î\u00821Ýd\u0000¯F\u0013\u0081\u0094ÂßÔ\u0002\u0014u\u0012¹È¾.õ1(ó_®\u0093bÆn}ò°¤äm\u001b'N®\u0085¬9`l1£ò\u0094\u0095ßÀ\u0002\u0013u^¹\u009eìÝW\u0011\u009a\u001cÎ\u00951Ýd\u001e¯V\u0013\u0094FÛ\u0089\u0001üZ ÜkÁÞ\u001d\u0094\u009eßÛ\u0002\u0010uu¹¾ì÷W!\u009amÎ\u00901Ád\u0006¯\u001c\u0013\u0081FÝ\u0094Ýß×\u0002\u0006uQ¹ÝìßW\u0017\u009aVÎ\u009b1Ód-¯Q\u0013\u009dFÖ\u0089\u0017üQ \u0081k\u009cÞ\n\u0001_u\u009e\u0094\u0090ßÞ\u0002\u0007uW¹\u0081ìÆW\u0013\u009aQÎ\u00991Á\u0097\u0095Ü\u009f\u0001Nv\u0019º\u0095ï\u0097TU\u0099\u000fÍÔ2\u008egIsH8Cå\u0086\u0092Ó^\u0006\u000b\b°\u0083}È)\u0010ÖI\u0083\u008bHÈô\u0006¡Cn\u0094\u001b\u0088ÇI\u008cC9\u0097æ\u0088\u0092\u0006_W\u0004\u0097±Ô}I*_×\u008a\u009cË\u001c\u0017W\b\u008aÊý\u00971[dWßÛ\u0012\u0088FM¹\u0011ìÖ'\u009e\u009bW\u0094µßÝ\u0002\u001euV¹\u0094ìÛW\u0001\u009aZ°\u0097û\u009c&YQ\f\u009dÙÈ×sU¾\u0011êË\u0015\u009b@\u0017\u008b\b7Êb\u0097\u00ad^Ø\u0011\u0004ÔO\u009dúK%WQÛ\u009c\u008dÇJrW¾\u0088é×\u0014[_\u0017\u008bÕ6ÖaU¬\u0011ØÛ\u0003\u008aNWù\u000e%ÑP\u008a\u009bLÆVrÕ½\u009dèU\u0013\r_Ñ\u008a\u00955]".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1953);
            f24322b = cArr;
            f24323d = 6033086952309120946L;
        }

        AnonymousClass2(d dVar) {
            dVar = dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:92:0x0203  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0204  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void D(char r21, int r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 525
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.eo.e.AnonymousClass2.D(char, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void E(short r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r2 = r7 * 5
                int r1 = 6 - r2
                int r7 = r6 + 99
                byte[] r6 = o.eo.e.AnonymousClass2.$$d
                int r0 = r8 * 5
                int r5 = 9 - r0
                byte[] r4 = new byte[r1]
                int r3 = 5 - r2
                r2 = 0
                if (r6 != 0) goto L2d
                r0 = r7
                r7 = r3
                r1 = r2
            L16:
                int r5 = r5 + 1
                int r7 = r7 + r0
                int r7 = r7 + (-6)
            L1b:
                byte r0 = (byte) r7
                r4[r1] = r0
                if (r1 != r3) goto L28
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r2)
                r9[r2] = r0
                return
            L28:
                int r1 = r1 + 1
                r0 = r6[r5]
                goto L16
            L2d:
                r1 = r2
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.eo.e.AnonymousClass2.E(short, byte, int, java.lang.Object[]):void");
        }

        private static void F(byte b2, short s2, int i2, Object[] objArr) {
            int i3 = i2 * 2;
            int i4 = 3 - (s2 * 2);
            int i5 = b2 + 97;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[1 - i3];
            int i6 = 0 - i3;
            int i7 = -1;
            if (bArr == null) {
                i5 += -i6;
            }
            while (true) {
                i7++;
                i4++;
                bArr2[i7] = (byte) i5;
                if (i7 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i5 += -bArr[i4];
            }
        }

        public static void b(Context context, long j2, long j3) throws Throwable {
            long j4;
            Object obj;
            int i2 = 2 % 2;
            int i3 = f24327i + 121;
            f24321a = i3 % 128;
            if (i3 % 2 != 0) {
                long j5 = j3 >>> 115;
                j4 = (j2 + j5) - (j2 & j5);
            } else {
                j4 = j2 ^ (j3 << 32);
            }
            try {
                Method method = o.ea.f.class.getMethod("a", null);
                method.setAccessible(true);
                if (((Boolean) method.invoke(null, null)).booleanValue()) {
                    Object[] objArr = new Object[1];
                    D((char) ((ViewConfiguration.getTapTimeout() >> 16) + 1614), TextUtils.indexOf("", "", 0, 0), 13 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    Object[] objArr2 = new Object[1];
                    D((char) (TextUtils.getOffsetBefore("", 0) + 23286), 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 29 - Color.alpha(0), objArr2);
                    Object[] objArr3 = {((String) objArr2[0]).intern()};
                    Object[] objArr4 = new Object[1];
                    D((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), Gravity.getAbsoluteGravity(0, 0) + 42, (Process.myPid() >> 22) + 6, objArr4);
                    Method method2 = StringBuilder.class.getMethod(((String) objArr4[0]).intern(), String.class);
                    method2.setAccessible(true);
                    Object objInvoke = method2.invoke(objNewInstance, objArr3);
                    Object[] objArr5 = {Long.valueOf(j4)};
                    Object[] objArr6 = new Object[1];
                    D((char) TextUtils.getOffsetAfter("", 0), 42 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 6, objArr6);
                    Method method3 = StringBuilder.class.getMethod(((String) objArr6[0]).intern(), Long.TYPE);
                    method3.setAccessible(true);
                    Object objInvoke2 = method3.invoke(objInvoke, objArr5);
                    Object[] objArr7 = new Object[1];
                    D((char) (47431 - TextUtils.indexOf("", "")), (ViewConfiguration.getTapTimeout() >> 16) + 48, 9 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr7);
                    Method method4 = StringBuilder.class.getMethod(((String) objArr7[0]).intern(), null);
                    method4.setAccessible(true);
                    Object[] objArr8 = {strIntern, method4.invoke(objInvoke2, null)};
                    Method method5 = o.ea.f.class.getMethod("c", String.class, Object.class);
                    method5.setAccessible(true);
                    method5.invoke(null, objArr8);
                }
                int i4 = $$e;
                byte b2 = (byte) 0;
                byte b3 = (byte) (b2 + 1);
                Object[] objArr9 = new Object[1];
                E((byte) (i4 >>> 2), b2, b3, objArr9);
                Class<?> cls = Class.forName((String) objArr9[0]);
                byte b4 = (byte) ((i4 + 5) - (5 | i4));
                byte b5 = b4;
                Object[] objArr10 = new Object[1];
                E(b4, b5, (byte) (b5 - 1), objArr10);
                Method method6 = cls.getMethod((String) objArr10[0], null);
                method6.setAccessible(true);
                Object objInvoke3 = method6.invoke(null, null);
                int i5 = (int) j4;
                Object[] objArr11 = new Object[1];
                E((byte) (i4 >>> 2), b2, b3, objArr11);
                Class.forName((String) objArr11[0]).getField("c").setInt(objInvoke3, i5);
                Object[] objArr12 = new Object[1];
                E((byte) (i4 >>> 2), b2, b3, objArr12);
                Class<?> cls2 = Class.forName((String) objArr12[0]);
                byte b6 = (byte) (5 & i4);
                byte b7 = b6;
                Object[] objArr13 = new Object[1];
                E(b6, b7, (byte) (b7 - 1), objArr13);
                Method method7 = cls2.getMethod((String) objArr13[0], null);
                method7.setAccessible(true);
                Object objInvoke4 = method7.invoke(null, null);
                Object[] objArr14 = new Object[1];
                E((byte) (i4 >>> 2), b2, b3, objArr14);
                if (Class.forName((String) objArr14[0]).getField("d").getBoolean(objInvoke4)) {
                    return;
                }
                if (context == null) {
                    Object[] objArr15 = new Object[1];
                    E(b2, b3, (byte) (b3 - 1), objArr15);
                    Method method8 = o.en.b.class.getMethod((String) objArr15[0], null);
                    method8.setAccessible(true);
                    Object objInvoke5 = method8.invoke(null, null);
                    byte b8 = (byte) (5 & i4);
                    Object[] objArr16 = new Object[1];
                    E((byte) 14, b8, (byte) (b8 - 1), objArr16);
                    Method method9 = o.en.b.class.getMethod((String) objArr16[0], null);
                    method9.setAccessible(true);
                    Object objInvoke6 = method9.invoke(objInvoke5, null);
                    int i6 = f24327i + 35;
                    f24321a = i6 % 128;
                    int i7 = i6 % 2;
                    obj = objInvoke6;
                } else {
                    obj = context;
                }
                if (obj != null) {
                    int i8 = f24321a + 27;
                    f24327i = i8 % 128;
                    int i9 = i8 % 2;
                    Method method10 = o.dc.d.class.getMethod("a", null);
                    method10.setAccessible(true);
                    Object objInvoke7 = method10.invoke(null, null);
                    Object[] objArr17 = {o.az.a.class.getField("b").get(null), o.dd.g.class.getField("z").get(null)};
                    Constructor declaredConstructor2 = o.dd.e.class.getDeclaredConstructor(o.az.a.class, o.dd.g.class);
                    declaredConstructor2.setAccessible(true);
                    Object[] objArr18 = {obj, declaredConstructor2.newInstance(objArr17), true};
                    Method method11 = o.dc.d.class.getMethod("b", Context.class, o.dd.e.class, Boolean.TYPE);
                    method11.setAccessible(true);
                    method11.invoke(objInvoke7, objArr18);
                    Object[] objArr19 = new Object[1];
                    E((byte) (i4 >>> 2), b2, b3, objArr19);
                    Class<?> cls3 = Class.forName((String) objArr19[0]);
                    byte b9 = (byte) ((i4 + 5) - (5 | i4));
                    byte b10 = b9;
                    Object[] objArr20 = new Object[1];
                    E(b9, b10, (byte) (b10 - 1), objArr20);
                    Method method12 = cls3.getMethod((String) objArr20[0], null);
                    method12.setAccessible(true);
                    Object objInvoke8 = method12.invoke(null, null);
                    Object[] objArr21 = new Object[1];
                    E((byte) (i4 >>> 2), b2, b3, objArr21);
                    Class.forName((String) objArr21[0]).getField("d").setBoolean(objInvoke8, true);
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:484:0x0891  */
        /* JADX WARN: Removed duplicated region for block: B:522:0x0ce1  */
        /* JADX WARN: Removed duplicated region for block: B:533:0x0d77  */
        /* JADX WARN: Removed duplicated region for block: B:579:0x11ba  */
        /* JADX WARN: Removed duplicated region for block: B:590:0x1249  */
        /* JADX WARN: Removed duplicated region for block: B:629:0x1797  */
        /* JADX WARN: Removed duplicated region for block: B:650:0x236e  */
        /* JADX WARN: Type inference failed for: r0v1724 */
        /* JADX WARN: Type inference failed for: r0v1725, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v2850 */
        /* JADX WARN: Type inference failed for: r1v490, types: [int[]] */
        /* JADX WARN: Type inference failed for: r3v181, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r6v175 */
        /* JADX WARN: Type inference failed for: r6v176 */
        /* JADX WARN: Type inference failed for: r6v70 */
        /* JADX WARN: Type inference failed for: r6v71 */
        /* JADX WARN: Type inference failed for: r6v95 */
        /* JADX WARN: Type inference failed for: r6v96 */
        /* JADX WARN: Type inference failed for: r6v97 */
        /* JADX WARN: Type inference failed for: r6v98 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] d(android.content.Context r39, int r40, int r41, int r42) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 13749
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.eo.e.AnonymousClass2.d(android.content.Context, int, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{96, -118, -108, -83};
            $$b = 200;
        }

        static void init$1() {
            $$d = new byte[]{97, 52, 124, MessagePack.Code.EXT16, MessagePack.Code.BIN16, 58, Ascii.DC4, MessagePack.Code.BIN8, 60};
            $$e = 51;
        }

        static void init$2() {
            $$c = new byte[]{Base64.padSymbol, -67, -29, 104};
            $$f = 146;
        }

        @Override // o.eo.e.d
        public final void a(o.by.c cVar) {
            int i2 = 2 % 2;
            int i3 = f24327i + 9;
            f24321a = i3 % 128;
            if (i3 % 2 == 0) {
                dVar.a(cVar);
            } else {
                dVar.a(cVar);
                int i4 = 57 / 0;
            }
        }

        @Override // o.eo.e.d
        public final void d(List<i> list) {
            int i2 = 2 % 2;
            int i3 = f24321a + 95;
            f24327i = i3 % 128;
            int i4 = i3 % 2;
            dVar.d(list);
            if (i4 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: o.eo.e$3 */
    final class AnonymousClass3 implements b.d<w> {

        /* JADX INFO: renamed from: b */
        private static int f24347b = 1;

        /* JADX INFO: renamed from: e */
        private static int f24348e = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ Context f24349a;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ d f24350c;

        AnonymousClass3(Context context, d dVar) {
            context = context;
            dVar = dVar;
        }

        @Override // o.eo.b.d
        public final void a(o.by.c cVar) {
            int i2 = 2 % 2;
            int i3 = f24347b + 15;
            f24348e = i3 % 128;
            if (i3 % 2 != 0) {
                dVar.a(cVar);
                throw null;
            }
            dVar.a(cVar);
            int i4 = f24347b;
            int i5 = (i4 ^ 55) + ((i4 & 55) << 1);
            f24348e = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 57 / 0;
            }
        }

        @Override // o.eo.b.d
        public final void c(List<w> list) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f24348e + 105;
            f24347b = i3 % 128;
            int i4 = i3 % 2;
            e.this.e(context);
            dVar.d(list);
            int i5 = f24348e;
            int i6 = (i5 ^ 83) + (((i5 + 83) - (i5 | 83)) << 1);
            f24347b = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX INFO: renamed from: o.eo.e$4 */
    final class AnonymousClass4 implements b.d<i> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final int $$f = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: c */
        private static char[] f24352c = null;

        /* JADX INFO: renamed from: d */
        private static int f24353d = 0;

        /* JADX INFO: renamed from: f */
        private static boolean f24354f = false;

        /* JADX INFO: renamed from: g */
        private static int f24355g = 0;

        /* JADX INFO: renamed from: h */
        private static int f24356h = 0;

        /* JADX INFO: renamed from: j */
        private static boolean f24357j = false;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ Context f24358a;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ d f24360e;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$g(int r9, byte r10, byte r11) {
            /*
                int r0 = r11 * 3
                int r8 = 3 - r0
                int r0 = r9 * 2
                int r7 = 1 - r0
                byte[] r6 = o.eo.e.AnonymousClass4.$$c
                int r0 = r10 * 6
                int r5 = 73 - r0
                byte[] r4 = new byte[r7]
                r3 = 0
                if (r6 != 0) goto L2a
                r0 = r5
                r2 = r3
                r5 = r7
            L16:
                int r5 = r5 + r0
                r1 = r2
            L18:
                byte r0 = (byte) r5
                int r2 = r1 + 1
                r4[r1] = r0
                if (r2 != r7) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L25:
                int r8 = r8 + 1
                r0 = r6[r8]
                goto L16
            L2a:
                r1 = r3
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.eo.e.AnonymousClass4.$$g(int, byte, byte):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            init$0();
            f24355g = 0;
            f24356h = 1;
            f24352c = new char[]{2547, 2532, 2558, 2528, 2533, 2555, 2340, 2529, 2305, 2539, 2542, 2559, 2535, 2321, 2534, 2545, 2553, 2530, 2304, 2552, 2540, 2557, 2330, 2554};
            f24353d = 2040400210;
            f24357j = true;
            f24354f = true;
        }

        AnonymousClass4(Context context, d dVar) {
            context = context;
            dVar = dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void i(byte r8, byte r9, short r10, java.lang.Object[] r11) {
            /*
                int r0 = r8 * 5
                int r8 = r0 + 101
                int r0 = r9 * 2
                int r7 = r0 + 4
                byte[] r6 = o.eo.e.AnonymousClass4.$$a
                int r5 = r10 * 4
                int r0 = r5 + 1
                byte[] r4 = new byte[r0]
                r3 = 0
                if (r6 != 0) goto L2d
                r1 = r7
                r2 = r3
            L15:
                int r8 = r8 + r7
                int r7 = r1 + 1
                r1 = r2
            L19:
                byte r0 = (byte) r8
                r4[r1] = r0
                int r2 = r1 + 1
                if (r1 != r5) goto L28
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                r11[r3] = r0
                return
            L28:
                r0 = r6[r7]
                r1 = r7
                r7 = r0
                goto L15
            L2d:
                r1 = r3
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.eo.e.AnonymousClass4.i(byte, byte, short, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{Ascii.FF, 10, -28, MessagePack.Code.NEGFIXINT_PREFIX};
            $$b = 36;
        }

        static void init$1() {
            $$d = new byte[]{54, -126, MessagePack.Code.INT32, 96, MessagePack.Code.BIN8, 60, 2, MessagePack.Code.INT16, 56};
            $$e = 35;
        }

        static void init$2() {
            $$c = new byte[]{117, -127, -11, 113};
            $$f = 10;
        }

        /* JADX WARN: Removed duplicated region for block: B:87:0x0018  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void k(int r20, java.lang.String r21, int[] r22, java.lang.String r23, java.lang.Object[] r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 581
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.eo.e.AnonymousClass4.k(int, java.lang.String, int[], java.lang.String, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x002c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002c -> B:17:0x0017). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void l(int r8, byte r9, int r10, java.lang.Object[] r11) {
            /*
                int r0 = r10 * 12
                int r7 = 111 - r0
                int r2 = r8 * 5
                int r1 = 6 - r2
                byte[] r6 = o.eo.e.AnonymousClass4.$$d
                int r0 = r9 * 5
                int r5 = 8 - r0
                byte[] r4 = new byte[r1]
                int r3 = 5 - r2
                r2 = 0
                if (r6 != 0) goto L2f
                r1 = r3
                r0 = r2
            L17:
                int r7 = r7 + r1
                int r7 = r7 + (-5)
                r1 = r0
            L1b:
                byte r0 = (byte) r7
                r4[r1] = r0
                int r5 = r5 + 1
                int r0 = r1 + 1
                if (r1 != r3) goto L2c
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r2)
                r11[r2] = r0
                return
            L2c:
                r1 = r6[r5]
                goto L17
            L2f:
                r1 = r2
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.eo.e.AnonymousClass4.l(int, byte, int, java.lang.Object[]):void");
        }

        @Override // o.eo.b.d
        public final void a(o.by.c cVar) {
            int i2 = 2 % 2;
            int i3 = f24355g + 33;
            f24356h = i3 % 128;
            int i4 = i3 % 2;
            dVar.a(cVar);
            int i5 = f24355g + 65;
            f24356h = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:74:0x02c3  */
        @Override // o.eo.b.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(java.util.List<o.ep.i> r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1076
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.eo.e.AnonymousClass4.c(java.util.List):void");
        }
    }

    /* JADX INFO: renamed from: o.eo.e$5 */
    final class AnonymousClass5 implements b.d<h> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final int $$f = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static int[] f24361a = null;

        /* JADX INFO: renamed from: d */
        private static int f24362d = 0;

        /* JADX INFO: renamed from: f */
        private static int f24363f = 0;

        /* JADX INFO: renamed from: g */
        public static int f24364g = 0;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Context f24365b;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ d f24367e;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0017). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$g(short r8, byte r9, byte r10) {
            /*
                int r0 = r10 * 3
                int r7 = 4 - r0
                int r0 = r9 * 2
                int r6 = r0 + 117
                byte[] r5 = o.eo.e.AnonymousClass5.$$c
                int r1 = r8 * 3
                int r0 = 1 - r1
                byte[] r4 = new byte[r0]
                r3 = 0
                int r2 = 0 - r1
                if (r5 != 0) goto L2a
                r0 = r2
                r1 = r3
            L17:
                int r6 = r6 + r0
                int r7 = r7 + 1
            L1a:
                byte r0 = (byte) r6
                r4[r1] = r0
                if (r1 != r2) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L25:
                int r1 = r1 + 1
                r0 = r5[r7]
                goto L17
            L2a:
                r1 = r3
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.eo.e.AnonymousClass5.$$g(short, byte, byte):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            f24364g = -1409776866;
            init$0();
            f24362d = 0;
            f24363f = 1;
            f24361a = new int[]{-1643011882, 1520544925, -732434346, 429142349, 1334456138, 1811544673, 2097958496, -896669506, 2146531885, -1505132025, 447955384, 1221615055, -586639431, 698220377, -510463769, -1099742650, -2058275706, -1498886191};
        }

        AnonymousClass5(Context context, d dVar) {
            context = context;
            dVar = dVar;
        }

        private static void h(int i2, short s2, int i3, Object[] objArr) {
            int i4 = s2 * 3;
            int i5 = 106 - (i2 * 5);
            int i6 = 4 - (i3 * 4);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[1 - i4];
            int i7 = 0 - i4;
            int i8 = -1;
            if (bArr == null) {
                i5 = (-i5) + i6;
                i6++;
            }
            while (true) {
                i8++;
                bArr2[i8] = (byte) i5;
                if (i8 == i7) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                byte b2 = bArr[i6];
                i5 = (-b2) + i5;
                i6++;
            }
        }

        private static void i(int[] iArr, int i2, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i3;
            int i4 = 2;
            int i5 = 2 % 2;
            l lVar = new l();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = f24361a;
            int i6 = 989264422;
            int i7 = 0;
            if (iArr3 != null) {
                int i8 = $10 + 57;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i3 = 1;
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i3 = 0;
                }
                while (i3 < length) {
                    int i9 = $11 + 27;
                    $10 = i9 % 128;
                    if (i9 % i4 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr3[i3])};
                            Object objA = o.d.d.a(i6);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                byte b3 = (byte) (b2 + 2);
                                objA = o.d.d.a(KeyEvent.normalizeMetaState(0) + 675, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 12 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -328001469, false, $$g(b2, b3, (byte) (b3 - 2)), new Class[]{Integer.TYPE});
                            }
                            iArr2[i3] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                            i3 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(iArr3[i3])};
                        Object objA2 = o.d.d.a(989264422);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 2);
                            objA2 = o.d.d.a(675 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (AndroidCharacter.getMirror('0') - '0'), 12 - View.MeasureSpec.makeMeasureSpec(0, 0), -328001469, false, $$g(b4, b5, (byte) (b5 - 2)), new Class[]{Integer.TYPE});
                        }
                        iArr2[i3] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                        i3++;
                    }
                    i4 = 2;
                    i6 = 989264422;
                }
                int i10 = $10 + 1;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = f24361a;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i12 = 0;
                while (i12 < length3) {
                    int i13 = $10 + 113;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    Object[] objArr4 = {Integer.valueOf(iArr5[i12])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        byte b6 = (byte) i7;
                        byte b7 = (byte) (b6 + 2);
                        objA3 = o.d.d.a(675 - ExpandableListView.getPackedPositionGroup(0L), (char) View.MeasureSpec.getMode(i7), TextUtils.getTrimmedLength("") + 12, -328001469, false, $$g(b6, b7, (byte) (b7 - 2)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    i12++;
                    i7 = 0;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, i7, iArr4, i7, length2);
            lVar.f19941d = i7;
            int i15 = $10 + 101;
            $11 = i15 % 128;
            int i16 = 3;
            if (i15 % 2 == 0) {
                int i17 = 5 / 3;
            }
            while (lVar.f19941d < iArr.length) {
                cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
                cArr[1] = (char) iArr[lVar.f19941d];
                cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                cArr[i16] = (char) iArr[lVar.f19941d + 1];
                lVar.f19942e = (cArr[0] << 16) + cArr[1];
                lVar.f19940a = (cArr[2] << 16) + cArr[i16];
                l.a(iArr4);
                int i18 = 0;
                for (int i19 = 16; i18 < i19; i19 = 16) {
                    lVar.f19942e ^= iArr4[i18];
                    int iE = l.e(lVar.f19942e);
                    Object[] objArr5 = new Object[4];
                    objArr5[i16] = lVar;
                    objArr5[2] = lVar;
                    objArr5[1] = Integer.valueOf(iE);
                    objArr5[0] = lVar;
                    Object objA4 = o.d.d.a(2098218801);
                    if (objA4 == null) {
                        int jumpTapTimeout = 301 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        char capsMode = (char) (52697 - TextUtils.getCapsMode("", 0, 0));
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11;
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 + 1);
                        String str$$g = $$g(b8, b9, (byte) (b9 - 1));
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Object.class;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Object.class;
                        clsArr[i16] = Object.class;
                        objA4 = o.d.d.a(jumpTapTimeout, capsMode, keyRepeatTimeout, -1416256172, false, str$$g, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i18++;
                }
                int i20 = lVar.f19942e;
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = i20;
                lVar.f19940a ^= iArr4[16];
                lVar.f19942e ^= iArr4[17];
                int i21 = lVar.f19942e;
                int i22 = lVar.f19940a;
                cArr[0] = (char) (lVar.f19942e >>> 16);
                cArr[1] = (char) lVar.f19942e;
                cArr[2] = (char) (lVar.f19940a >>> 16);
                cArr[i16] = (char) lVar.f19940a;
                l.a(iArr4);
                cArr2[lVar.f19941d * 2] = cArr[0];
                cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                cArr2[(lVar.f19941d * 2) + i16] = cArr[i16];
                Object[] objArr6 = {lVar, lVar};
                Object objA5 = o.d.d.a(986820978);
                if (objA5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objA5 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 230, (char) (51004 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 9 - TextUtils.indexOf("", ""), -330018025, false, $$g(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
                i16 = 3;
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        static void init$0() {
            $$a = new byte[]{120, -15, 89, -97};
            $$b = 253;
        }

        static void init$1() {
            $$d = new byte[]{121, Base64.padSymbol, 92, -93, 64, MessagePack.Code.FLOAT32, 52, MessagePack.Code.UINT8, 60, MessagePack.Code.NEVER_USED};
            $$e = 183;
        }

        static void init$2() {
            $$c = new byte[]{121, -71, 80, 66};
            $$f = 149;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x002c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002c -> B:17:0x0017). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void j(int r7, short r8, byte r9, java.lang.Object[] r10) {
            /*
                int r2 = r7 * 6
                int r1 = 7 - r2
                byte[] r7 = o.eo.e.AnonymousClass5.$$d
                int r0 = r8 * 6
                int r6 = r0 + 4
                int r0 = r9 * 10
                int r0 = 111 - r0
                byte[] r5 = new byte[r1]
                int r4 = 6 - r2
                r3 = -1
                if (r7 != 0) goto L2f
                r2 = r3
                r1 = r6
            L17:
                int r0 = -r0
                int r6 = r6 + r0
                int r1 = r1 + 1
                int r6 = r6 + r3
            L1c:
                int r2 = r2 + 1
                byte r0 = (byte) r6
                r5[r2] = r0
                if (r2 != r4) goto L2c
                java.lang.String r1 = new java.lang.String
                r0 = 0
                r1.<init>(r5, r0)
                r10[r0] = r1
                return
            L2c:
                r0 = r7[r1]
                goto L17
            L2f:
                r2 = r3
                r1 = r6
                r6 = r0
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.eo.e.AnonymousClass5.j(int, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:65:0x02ac  */
        @Override // o.eo.b.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(o.by.c r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1220
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.eo.e.AnonymousClass5.a(o.by.c):void");
        }

        @Override // o.eo.b.d
        public final void c(List<h> list) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f24363f + 49;
            f24362d = i3 % 128;
            int i4 = i3 % 2;
            e.this.e(context);
            dVar.d(list);
            int i5 = f24363f + 61;
            f24362d = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public interface d<T> {
        void a(o.by.c cVar);

        void d(List<T> list);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r7, int r8, short r9) {
        /*
            int r2 = r8 * 4
            int r1 = 1 - r2
            byte[] r8 = o.eo.e.$$a
            int r0 = r7 * 4
            int r7 = r0 + 4
            int r6 = r9 + 102
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r8 != 0) goto L29
            r0 = r4
            r2 = r7
        L15:
            int r7 = r7 + r6
            int r2 = r2 + 1
            r1 = r0
        L19:
            byte r0 = (byte) r7
            r5[r1] = r0
            int r0 = r1 + 1
            if (r1 != r3) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r6 = r8[r2]
            goto L15
        L29:
            r1 = r4
            r2 = r7
            r7 = r6
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eo.e.$$c(byte, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24305c = 1628664176;
        f24307e = -586210915;
        f24306d = -1349125650;
        f24303a = 351677462;
        f24304b = 1400230867;
        f24314o = 0;
        f24313m = 1;
        f24309g = 0;
        f24312l = 1;
        b();
        KeyEvent.getDeadChar(0, 0);
        SystemClock.elapsedRealtime();
        ViewConfiguration.getMinimumFlingVelocity();
        int i2 = f24314o + 97;
        f24313m = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object a(java.lang.Object[] r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eo.e.a(java.lang.Object[]):java.lang.Object");
    }

    static void b() {
        f24308f = new char[]{64631, 64594, 64605, 64609, 64584, 64588, 64577, 64628, 64630, 64589, 64626, 64525, 64598, 64587, 64576, 64539, 64582, 64621, 64596, 64614, 64597, 64624, 64634, 64578, 64592, 64524, 64523, 64586, 64591, 64593, 64604, 64583, 64521, 64580, 64590, 64607, 64625, 64579, 64520, 64623, 64622, 64543, 64619, 64616, 64517, 64599, 64627, 64629, 64585};
        f24311j = (char) 51640;
        f24310i = 8532400991420497819L;
    }

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~i5;
        int i9 = ~(i2 | i8);
        int i10 = (i6 + i9) - (i6 & i9);
        int i11 = ~i6;
        int i12 = i9 | (~((-1) - (((-1) - i8) & ((-1) - i11))));
        int i13 = (-1) - (((-1) - (~(i8 | i6))) & ((-1) - (~(i11 | i5))));
        int i14 = i5 + i6 + i7 + (513088896 * i4) + ((-1342203445) * i3);
        int i15 = i14 * i14;
        int i16 = (665020156 * i5) + 661520384 + (1303681286 * i6) + ((-638661130) * i10) + (638661130 * i12) + (319330565 * i13) + (984350720 * i7) + ((-771751936) * i4) + (1382285312 * i3) + ((-350355456) * i15);
        int i17 = ((i5 * (-363642324)) - 614971735) + (i6 * (-363641282)) + (i10 * (-1042)) + (i12 * 1042) + (i13 * 521) + (i7 * (-363641803)) + (i4 * (-2127225984)) + (i3 * (-1080704249)) + (i15 * (-1523187712));
        return i16 + ((i17 * i17) * (-227409920)) != 1 ? a(objArr) : c(objArr);
    }

    private static /* synthetic */ Object c(Object[] objArr) throws Throwable {
        String strIntern;
        Object obj;
        short sXd = (short) (Od.Xd() ^ (-1960));
        int[] iArr = new int["ǻ;P9V[iO[l?obM`]Uo".length()];
        QB qb = new QB("ǻ;P9V[iO[l?obM`]Uo");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        e eVar = (e) objArr[0];
        Context context = (Context) objArr[1];
        int i3 = 2 % 2;
        int offsetBefore = 47 - TextUtils.getOffsetBefore("", 0);
        byte packedPositionChild = (byte) (25 - ExpandableListView.getPackedPositionChild(0L));
        Object[] objArr2 = new Object[1];
        short sXd2 = (short) (C1580rY.Xd() ^ (-18495));
        short sXd3 = (short) (C1580rY.Xd() ^ (-3276));
        int[] iArr2 = new int["x\u007fu}^yl\u0004|v}\u0006f\u0002t\f\u0005~t|z\u0012k\u000b\u001a\u000b\u0019\r\tw|\u0010\u001d\u0005u\u0011\b(\t\u001d\f&\u0011\u0005\u0010\u000f祼".length()];
        QB qb2 = new QB("x\u007fu}^yl\u0004|v}\u0006f\u0002t\f\u0005~t|z\u0012k\u000b\u001a\u000b\u0019\r\tw|\u0010\u001d\u0005u\u0011\b(\t\u001d\f&\u0011\u0005\u0010\u000f祼");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i4)) + sXd3);
            i4++;
        }
        k(offsetBefore, new String(iArr2, 0, i4), packedPositionChild, objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        short sXd4 = (short) (C1607wl.Xd() ^ 19859);
        short sXd5 = (short) (C1607wl.Xd() ^ AccountTransferStatusCodes.NO_DATA_AVAILABLE);
        int[] iArr3 = new int["h0rC\rJ\u0010\u001e\u001e~J\u001bX%usS7}J\u0004e)".length()];
        QB qb3 = new QB("h0rC\rJ\u0010\u001e\u001e~J\u001bX%usS7}J\u0004e)");
        int i5 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - ((i5 * sXd5) ^ sXd4));
            i5++;
        }
        Object[] objArr3 = {strIntern2, 0};
        Method method = Class.forName(new String(iArr3, 0, i5)).getMethod(C1626yg.Ud("\r5aU$q\u0019P\u001f0$m36a\u0007D\u001fc~", (short) (Od.Xd() ^ (-9381)), (short) (Od.Xd() ^ (-19425))), Class.forName(ZO.xd("k\u0002\u0002*CG/F\u0019:x\u0003cm\u000b\u0003", (short) (Od.Xd() ^ (-2321)), (short) (Od.Xd() ^ (-4318)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr3);
            int i6 = -TextUtils.lastIndexOf("", '0', 0, 0);
            Object[] objArr4 = new Object[1];
            short sXd6 = (short) (C1580rY.Xd() ^ (-1874));
            int[] iArr4 = new int["뽱☎ꦈ₎\ue1bd勊逘".length()];
            QB qb4 = new QB("뽱☎ꦈ₎\ue1bd勊逘");
            int i7 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i7] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i7 % C1561oA.Xd.length] ^ (sXd6 + i7)));
                i7++;
            }
            n(new String(iArr4, 0, i7), i6, objArr4);
            String string = sharedPreferences.getString(((String) objArr4[0]).intern(), "");
            boolean zIsEmpty = string.isEmpty();
            short sXd7 = (short) (C1633zX.Xd() ^ (-10181));
            int[] iArr5 = new int["聽⊥\uf5e2\uf7fc⋖浭\udc18ᜯ쏬䓳쟲䳁韥櫴鯎꺌媷뷃拯\uf1c1ﳚ\uf107꼗㷥".length()];
            QB qb5 = new QB("聽⊥\uf5e2\uf7fc⋖浭\udc18ᜯ쏬䓳쟲䳁韥櫴鯎꺌媷뷃拯\uf1c1ﳚ\uf107꼗㷥");
            int i8 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i8] = xuXd5.fK((C1561oA.Xd[i8 % C1561oA.Xd.length] ^ ((sXd7 + sXd7) + i8)) + xuXd5.CK(iKK5));
                i8++;
            }
            String str2 = new String(iArr5, 0, i8);
            if (zIsEmpty) {
                if (!o.ea.f.a()) {
                    int i9 = f24309g + 9;
                    f24312l = i9 % 128;
                    int i10 = i9 % 2;
                    return null;
                }
                int i11 = f24309g + 79;
                f24312l = i11 % 128;
                int i12 = i11 % 2;
                String strQd = C1561oA.Qd("\u2da7\u2d7dᇴᓈ驺汨띮Դ닲䥨쑀嫬鉭惬藼Ꭰ䰫\b㵃쐣\udb3f\ueff0껓籬ǽ⽨湀㓆灒뻕⟀\ue5a3⧝\uf664휯鷚뤮噵샏幨纬趧聟ᛯ嘸鵵㧁읧\u0feb풭ꥼ蟶鼯㑲檼㡓岒믩≋\ue8a3㐣\uf355폋ꅦ\ue58e勖쬯懜蕹詪", (short) (ZN.Xd() ^ 7266));
                if (i12 == 0) {
                    Object[] objArr5 = new Object[1];
                    n(str2, 1 % Color.argb(0, 1, 0, 1), objArr5);
                    strIntern = ((String) objArr5[0]).intern();
                    Object[] objArr6 = new Object[1];
                    n(strQd, 1 - (ViewConfiguration.getDoubleTapTimeout() - 77), objArr6);
                    obj = objArr6[0];
                } else {
                    Object[] objArr7 = new Object[1];
                    n(str2, 1 - Color.argb(0, 0, 0, 0), objArr7);
                    strIntern = ((String) objArr7[0]).intern();
                    Object[] objArr8 = new Object[1];
                    n(strQd, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, objArr8);
                    obj = objArr8[0];
                }
                o.ea.f.c(strIntern, ((String) obj).intern());
                return null;
            }
            if (o.ea.f.a()) {
                int i13 = f24309g + 3;
                f24312l = i13 % 128;
                int i14 = i13 % 2;
                Object[] objArr9 = new Object[1];
                n(str2, (Process.myTid() >> 22) + 1, objArr9);
                String strIntern3 = ((String) objArr9[0]).intern();
                Object[] objArr10 = new Object[1];
                n(C1593ug.zd("줚죄錐涃的䂚렭粲桏펢ꔋ㸄㾸␞\uf64f蕀\uef96沢㗏䴧軇딼辆ᲇ䙇\uf5b5Γ\udc1cᷠ䘽⁏ꮑ쵓躰堘猘泰치ꇊ㪂ⓆỚ\uf13c舻\uf401杭㋐䦑뎓꿝訏ჾ䬌\uf0b9\u07b3\ud89c滋䃸", (short) (OY.Xd() ^ 29149), (short) (OY.Xd() ^ 14237)), 1 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr10);
                o.ea.f.c(strIntern3, ((String) objArr10[0]).intern());
            }
            String strC = new o.dk.a(context).c(string);
            if (o.ea.f.a()) {
                Object[] objArr11 = new Object[1];
                n(str2, 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr11);
                String strIntern4 = ((String) objArr11[0]).intern();
                StringBuilder sb = new StringBuilder();
                int i15 = 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                Object[] objArr12 = new Object[1];
                short sXd8 = (short) (C1499aX.Xd() ^ (-4220));
                int[] iArr6 = new int["\uecc3\ued29᪷羫ᑷ씱㛿ϥ嶦\ue229䠥쳷阅ꦭ\uf061茻칟焮뤜㯭䜍䂩ᶑ\uee74罺ီ\ue5b9꜄럶侫蹸嵤\uf07eᜦ囖ᗏ棍\udf6e䌡퀶饚꛷\uebe2袳퇍湯둜㼥ȿ㖰Კ".length()];
                QB qb6 = new QB("\uecc3\ued29᪷羫ᑷ씱㛿ϥ嶦\ue229䠥쳷阅ꦭ\uf061茻칟焮뤜㯭䜍䂩ᶑ\uee74罺ီ\ue5b9꜄럶侫蹸嵤\uf07eᜦ囖ᗏ棍\udf6e䌡퀶饚꛷\uebe2袳퇍湯둜㼥ȿ㖰Კ");
                int i16 = 0;
                while (qb6.YK()) {
                    int iKK6 = qb6.KK();
                    Xu xuXd6 = Xu.Xd(iKK6);
                    iArr6[i16] = xuXd6.fK(sXd8 + sXd8 + i16 + xuXd6.CK(iKK6));
                    i16++;
                }
                n(new String(iArr6, 0, i16), i15, objArr12);
                o.ea.f.c(strIntern4, sb.append(((String) objArr12[0]).intern()).append(strC).toString());
            }
            if (strC == null || strC.isEmpty()) {
                if (!o.ea.f.a()) {
                    return null;
                }
                Object[] objArr13 = new Object[1];
                n(str2, -TextUtils.indexOf((CharSequence) "", '0'), objArr13);
                String strIntern5 = ((String) objArr13[0]).intern();
                Object[] objArr14 = new Object[1];
                k(59 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), Wg.Zd("6[o/\u001fJ\u0001/\u0011\u001bZ_s1FoCS\u0012IZv\u070f\u001ecQ{\u001c\u007f\tF\u001arv\u0018#Y\u001eOH\u001f*톷\uea53\u001eCtmL9Ea_r$l9`", (short) (C1633zX.Xd() ^ (-22111)), (short) (C1633zX.Xd() ^ (-26257))), (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 79), objArr14);
                o.ea.f.c(strIntern5, ((String) objArr14[0]).intern());
                return null;
            }
            try {
                o.ef.a aVar = new o.ef.a(strC);
                Object[] objArr15 = new Object[1];
                k(MotionEvent.axisFromString("") + 19, str, (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 76), objArr15);
                if (!aVar.d(((String) objArr15[0]).intern())) {
                    return null;
                }
                int i17 = f24309g + 19;
                f24312l = i17 % 128;
                int i18 = i17 % 2;
                Object[] objArr16 = new Object[1];
                k(17 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), str, (byte) (75 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr16);
                eVar.f24315h.e(aVar.x(((String) objArr16[0]).intern()));
                return null;
            } catch (o.ef.b e2) {
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr17 = new Object[1];
                n(C1561oA.Kd("覱襉즜Ḝ茈ἦ\uecb3觉\uecd1都\udd95䫌鱛㪔꼖눎搝猶皟禓䭩ꎞ\uf430─ᛴȗ쎸ಆ빶鑥贱퐋藴촲哄箖\ue5a9ﵥ\ue263䝇뤪㶠뇤꺺悒瘪筲瘌⡳껭", (short) (OY.Xd() ^ 24907)), 1 - TextUtils.indexOf("", ""), objArr17);
                throw new o.en.f(sb2.append(((String) objArr17[0]).intern()).append(e2.getMessage()).toString());
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static void init$0() {
        $$a = new byte[]{96, -118, -108, -83};
        $$b = 205;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(int r26, java.lang.String r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eo.e.k(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    private static void n(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        k kVar = new k();
        char[] cArrC = k.c(f24310i ^ (-5882309809461882246L), (char[]) charArray, i2);
        int i4 = 4;
        kVar.f19939c = 4;
        int i5 = $10 + 73;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - i4;
            int i7 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % i4]), Long.valueOf(kVar.f19938a), Long.valueOf(f24310i)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 229, (char) (51003 - Process.getGidForName("")), 10 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1749983833, false, $$c(b2, b3, (byte) (b3 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(675 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 12, 522683165, false, $$c(b4, b5, (byte) ((b5 + Ascii.FF) - (12 & b5))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i8 = $10 + 117;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i4 = 4;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str3 = new String(cArrC, 4, cArrC.length - 4);
        int i10 = $11 + 5;
        $10 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        objArr[0] = str3;
    }

    public final void a() throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f24312l + 113;
        f24309g = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f24309g + 77;
            f24312l = i5 % 128;
            if (i5 % 2 == 0) {
                ViewConfiguration.getScrollDefaultDelay();
                Object[] objArr = new Object[1];
                n("ၝမ\ue3a7\ue620ﭵ丯붅\uf2bfꞭ⬫꺯㏛缴労眫詆㚴騱㾤싥츿얽萲ᕿ", 0, objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                k(61 - KeyEvent.getDeadChar(0, 1), "),\u001a\n\n\u0002\u0002\u001a\u0001!\"/\u001a(0\u0003\r\f㖳", (byte) ((-1) / Process.getGidForName("")), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                n("ၝမ\ue3a7\ue620ﭵ丯붅\uf2bfꞭ⬫꺯㏛缴労眫詆㚴騱㾤싥츿얽萲ᕿ", 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                k(19 - KeyEvent.getDeadChar(0, 0), "),\u001a\n\n\u0002\u0002\u001a\u0001!\"/\u001a(0\u0003\r\f㖳", (byte) ((-1) - Process.getGidForName("")), objArr4);
                obj = objArr4[0];
            }
            o.ea.f.c(strIntern, ((String) obj).intern());
        }
        this.f24315h.a();
    }

    public final void a(Context context, String str, d<i> dVar) throws WalletValidationException {
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i2 = f24304b * (-1905940773);
        f24304b = i2;
        int id = (int) Thread.currentThread().getId();
        int i3 = f24303a * 720860110;
        f24303a = i3;
        c(iMaxMemory, i3, id, -1627101864, 1627101864, new Object[]{this, context, str, dVar}, i2);
    }

    public final void b(Context context) throws o.en.f {
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i2 = f24306d * 259485876;
        f24306d = i2;
        int i3 = f24307e * 1989512331;
        f24307e = i3;
        int i4 = 335404225 * f24305c;
        f24305c = i4;
        c(iElapsedRealtime, i4, i3, 548140208, -548140207, new Object[]{this, context}, i2);
    }

    public final void b(Context context, String str, d<o.ex.b<?>> dVar) throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f24312l + 15;
            f24309g = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                n("ၝမ\ue3a7\ue620ﭵ丯붅\uf2bfꞭ⬫꺯㏛缴労眫詆㚴騱㾤싥츿얽萲ᕿ", -TextUtils.indexOf((CharSequence) "", 'S', 1, 0), objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                k(51 / View.getDefaultSize(0, 1), "*\u0011&,\u0013\u0007\b%/\u001f\u0007\r\u001e\u0013!\u0001\"\u0014\u0014\u001a\b\"0\u0018/\r", (byte) (84 << View.resolveSizeAndState(1, 0, 1)), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                n("ၝမ\ue3a7\ue620ﭵ丯붅\uf2bfꞭ⬫꺯㏛缴労眫詆㚴騱㾤싥츿얽萲ᕿ", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                k(26 - View.getDefaultSize(0, 0), "*\u0011&,\u0013\u0007\b%/\u001f\u0007\r\u001e\u0013!\u0001\"\u0014\u0014\u001a\b\"0\u0018/\r", (byte) (View.resolveSizeAndState(0, 0, 0) + 99), objArr4);
                obj = objArr4[0];
            }
            o.ea.f.c(strIntern, ((String) obj).intern());
        }
        if (!o.en.b.c().s()) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr5 = new Object[1];
            n("繽縪굈ꓩ\ue4c4Èｇ\ued0b즜旙", 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr5);
            String strIntern2 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            k((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, "\f\u001f㘾㘾\u000f\u001c/\u0002\t/\u0014\"\u001e+\u0003\u001f㘼㘼\u0006\f\u0019\u001e\u0002\u0017\"\u0014\u0007\u0014\u000f\u001e\u0006\u001a\t0*\u0011\u0011\u0019\u0003/\u0014\u0000", (byte) (TextUtils.indexOf("", "", 0) + 72), objArr6);
            throw new WalletValidationException(walletValidationErrorCode, strIntern2, ((String) objArr6[0]).intern());
        }
        Object[] objArr7 = {this.f24315h.o(str)};
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i4 = c.b.f24280d * (-865627137);
        c.b.f24280d = i4;
        ((f) c.b.c(iFreeMemory, objArr7, -1983340530, (int) Runtime.getRuntime().freeMemory(), i4, 1983340531, Process.myUid())).a(context, str, new b.d<o.ex.b<?>>() { // from class: o.eo.e.1

            /* JADX INFO: renamed from: a */
            private static int f24316a = 1;

            /* JADX INFO: renamed from: d */
            private static int f24317d = 0;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ d f24318b;

            /* JADX INFO: renamed from: c */
            private /* synthetic */ Context f24319c;

            AnonymousClass1(Context context2, d dVar2) {
                context = context2;
                dVar = dVar2;
            }

            @Override // o.eo.b.d
            public final void a(o.by.c cVar) {
                int i22 = 2 % 2;
                int i32 = f24317d;
                int i42 = (i32 ^ 17) + (((i32 + 17) - (i32 | 17)) << 1);
                f24316a = i42 % 128;
                int i5 = i42 % 2;
                dVar.a(cVar);
                int i6 = f24317d;
                int i7 = (i6 ^ 3) + (((i6 + 3) - (i6 | 3)) << 1);
                f24316a = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 63 / 0;
                }
            }

            @Override // o.eo.b.d
            public final void c(List<o.ex.b<?>> list) throws Throwable {
                int i22 = 2 % 2;
                int i32 = f24316a;
                int i42 = (((i32 + 1) - (1 & i32)) << 1) - (i32 ^ 1);
                f24317d = i42 % 128;
                if (i42 % 2 != 0) {
                    e.this.e(context);
                    dVar.d(list);
                    int i5 = 92 / 0;
                } else {
                    e.this.e(context);
                    dVar.d(list);
                }
                int i6 = f24316a;
                int i7 = (((-1) - (((-1) - i6) & ((-1) - 125))) << 1) - (i6 ^ 125);
                f24317d = i7 % 128;
                int i8 = i7 % 2;
            }
        });
        int i5 = f24312l + 99;
        f24309g = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void c(Context context, String str, d<w> dVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24312l + 47;
        f24309g = i3 % 128;
        if (i3 % 2 != 0) {
            o.ea.f.a();
            throw null;
        }
        if (o.ea.f.a()) {
            int i4 = f24309g + 53;
            f24312l = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            n("ၝမ\ue3a7\ue620ﭵ丯붅\uf2bfꞭ⬫꺯㏛缴労眫詆㚴騱㾤싥츿얽萲ᕿ", Color.alpha(0) + 1, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            k(Color.rgb(0, 0, 0) + 16777234, "\u0015\u0010$+\")\u0014\u0007\u0007\u0015\u0011\u0019\u0013\u0007\"\u0016/\n", (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 33), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (!o.en.b.c().s()) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr3 = new Object[1];
            n("繽縪굈ꓩ\ue4c4Èｇ\ued0b즜旙", Color.argb(0, 0, 0, 0) + 1, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            k(41 - MotionEvent.axisFromString(""), "\f\u001f㘾㘾\u000f\u001c/\u0002\t/\u0014\"\u001e+\u0003\u001f㘼㘼\u0006\f\u0019\u001e\u0002\u0017\"\u0014\u0007\u0014\u000f\u001e\u0006\u001a\t0*\u0011\u0011\u0019\u0003/\u0014\u0000", (byte) (71 - Process.getGidForName("")), objArr4);
            throw new WalletValidationException(walletValidationErrorCode, strIntern2, ((String) objArr4[0]).intern());
        }
        Object[] objArr5 = {this.f24315h.o(str)};
        int i6 = (-819250473) * c.b.f24279c;
        c.b.f24279c = i6;
        ((o.eo.d) c.b.c(i6, objArr5, -556348340, Process.myUid(), (int) Process.getElapsedCpuTime(), 556348340, (int) Thread.currentThread().getId())).c(context, str, new b.d<w>() { // from class: o.eo.e.3

            /* JADX INFO: renamed from: b */
            private static int f24347b = 1;

            /* JADX INFO: renamed from: e */
            private static int f24348e = 0;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ Context f24349a;

            /* JADX INFO: renamed from: c */
            private /* synthetic */ d f24350c;

            AnonymousClass3(Context context2, d dVar2) {
                context = context2;
                dVar = dVar2;
            }

            @Override // o.eo.b.d
            public final void a(o.by.c cVar) {
                int i22 = 2 % 2;
                int i32 = f24347b + 15;
                f24348e = i32 % 128;
                if (i32 % 2 != 0) {
                    dVar.a(cVar);
                    throw null;
                }
                dVar.a(cVar);
                int i42 = f24347b;
                int i52 = (i42 ^ 55) + ((i42 & 55) << 1);
                f24348e = i52 % 128;
                if (i52 % 2 != 0) {
                    int i62 = 57 / 0;
                }
            }

            @Override // o.eo.b.d
            public final void c(List<w> list) throws Throwable {
                int i22 = 2 % 2;
                int i32 = f24348e + 105;
                f24347b = i32 % 128;
                int i42 = i32 % 2;
                e.this.e(context);
                dVar.d(list);
                int i52 = f24348e;
                int i62 = (i52 ^ 83) + (((i52 + 83) - (i52 | 83)) << 1);
                f24347b = i62 % 128;
                int i7 = i62 % 2;
            }
        });
        int i7 = f24312l + 59;
        f24309g = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void c(Context context, String str, h hVar, h.e eVar) throws Throwable {
        int i2 = 2 % 2;
        c.b bVarF = e().f(str);
        if (bVarF == null) {
            return;
        }
        int iNextInt = new Random().nextInt(710546813);
        int i3 = c.b.f24278b * (-1534841831);
        c.b.f24278b = i3;
        int i4 = c.b.f24281e * (-1576044770);
        c.b.f24281e = i4;
        Iterator<h> it = ((g) c.b.c(iNextInt, new Object[]{bVarF}, 139242858, (int) Process.getElapsedCpuTime(), i3, -139242856, i4)).d().iterator();
        int i5 = f24312l + 121;
        f24309g = i5 % 128;
        int i6 = i5 % 2;
        while (it.hasNext()) {
            int i7 = f24312l + 91;
            f24309g = i7 % 128;
            if (i7 % 2 != 0) {
                it.next().a().equals(hVar.a());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            h next = it.next();
            if (next.a().equals(hVar.a())) {
                Object[] objArr = {next, eVar};
                int i8 = (int) Runtime.getRuntime().totalMemory();
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i9 = h.f24524d * (-1038625529);
                h.f24524d = i9;
                int i10 = h.f24525e * 1286687698;
                h.f24525e = i10;
                h.c(1046956277, i8, -1046956276, iMaxMemory, objArr, i9, i10);
                return;
            }
        }
        e(context);
    }

    public final void c(Context context, String str, i iVar, i.b bVar) throws Throwable {
        int i2 = 2 % 2;
        c.b bVarF = e().f(str);
        if (bVarF == null) {
            return;
        }
        for (i iVar2 : bVarF.b().d()) {
            int iNextInt = new Random().nextInt(829335317);
            int i3 = i.f24595m * 1091325868;
            i.f24595m = i3;
            String str2 = (String) i.d((int) Runtime.getRuntime().freeMemory(), -2118374406, iNextInt, Thread.currentThread().getPriority(), i3, new Object[]{iVar2}, 2118374413);
            int iNextInt2 = new Random().nextInt(829335317);
            int i4 = i.f24595m * 1091325868;
            i.f24595m = i4;
            if (str2.equals((String) i.d((int) Runtime.getRuntime().freeMemory(), -2118374406, iNextInt2, Thread.currentThread().getPriority(), i4, new Object[]{iVar}, 2118374413))) {
                int i5 = f24309g + 41;
                f24312l = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i.f24585c * 37294137;
                i.f24585c = i7;
                int i8 = i.f24586d * (-1870870753);
                i.f24586d = i8;
                i.d((int) Process.getElapsedCpuTime(), 427626745, i7, Process.myUid(), i8, new Object[]{iVar2, bVar}, -427626745);
                return;
            }
        }
        e(context);
        int i9 = f24312l + 39;
        f24309g = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    public final void d(Context context, String str, List<o.ex.b<?>> list, Date date) throws Throwable {
        int i2 = 2 % 2;
        c.b bVarO = this.f24315h.o(str);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i3 = c.b.f24280d * (-865627137);
        c.b.f24280d = i3;
        ((f) c.b.c(iFreeMemory, new Object[]{bVarO}, -1983340530, (int) Runtime.getRuntime().freeMemory(), i3, 1983340531, Process.myUid())).d(list, Long.valueOf(new Date().getTime()));
        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
        int i4 = c.b.f24280d * (-865627137);
        c.b.f24280d = i4;
        ((f) c.b.c(iFreeMemory2, new Object[]{bVarO}, -1983340530, (int) Runtime.getRuntime().freeMemory(), i4, 1983340531, Process.myUid())).b(date);
        e(context);
        int i5 = f24312l + 105;
        f24309g = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void d(Context context, String str, d<i> dVar) throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f24309g + 19;
            f24312l = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                n("ၝမ\ue3a7\ue620ﭵ丯붅\uf2bfꞭ⬫꺯㏛缴労眫詆㚴騱㾤싥츿얽萲ᕿ", 1 >>> (KeyEvent.getMaxKeyCode() >>> 45), objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                k(Drawable.resolveOpacity(1, 1) + 101, "*\u0011&,\u0013\u0007\b%\")\u0014\u0007", (byte) (42 >>> KeyEvent.getDeadChar(0, 1)), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                n("ၝမ\ue3a7\ue620ﭵ丯붅\uf2bfꞭ⬫꺯㏛缴労眫詆㚴騱㾤싥츿얽萲ᕿ", 1 - (KeyEvent.getMaxKeyCode() >> 16), objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                k(Drawable.resolveOpacity(0, 0) + 12, "*\u0011&,\u0013\u0007\b%\")\u0014\u0007", (byte) (75 - KeyEvent.getDeadChar(0, 0)), objArr4);
                obj = objArr4[0];
            }
            o.ea.f.c(strIntern, ((String) obj).intern());
        }
        if (o.en.b.c().s()) {
            this.f24315h.o(str).b().b(context, str, new b.d<i>() { // from class: o.eo.e.4
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static final byte[] $$c = null;
                private static final byte[] $$d = null;
                private static final int $$e = 0;
                private static final int $$f = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: c */
                private static char[] f24352c = null;

                /* JADX INFO: renamed from: d */
                private static int f24353d = 0;

                /* JADX INFO: renamed from: f */
                private static boolean f24354f = false;

                /* JADX INFO: renamed from: g */
                private static int f24355g = 0;

                /* JADX INFO: renamed from: h */
                private static int f24356h = 0;

                /* JADX INFO: renamed from: j */
                private static boolean f24357j = false;

                /* JADX INFO: renamed from: a */
                private /* synthetic */ Context f24358a;

                /* JADX INFO: renamed from: e */
                private /* synthetic */ d f24360e;

                private static String $$g(int v2, byte v3, byte v4) {
                    /*
                        int r0 = r11 * 3
                        int r8 = 3 - r0
                        int r0 = r9 * 2
                        int r7 = 1 - r0
                        byte[] r6 = o.eo.e.AnonymousClass4.$$c
                        int r0 = r10 * 6
                        int r5 = 73 - r0
                        byte[] r4 = new byte[r7]
                        r3 = 0
                        if (r6 != 0) goto L2a
                        r0 = r5
                        r2 = r3
                        r5 = r7
                    L16:
                        int r5 = r5 + r0
                        r1 = r2
                    L18:
                        byte r0 = (byte) r5
                        int r2 = r1 + 1
                        r4[r1] = r0
                        if (r2 != r7) goto L25
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r4, r3)
                        return r0
                    L25:
                        int r8 = r8 + 1
                        r0 = r6[r8]
                        goto L16
                    L2a:
                        r1 = r3
                        goto L18
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.eo.e.AnonymousClass4.$$g(int, byte, byte):java.lang.String");
                }

                static {
                    init$2();
                    $10 = 0;
                    $11 = 1;
                    init$1();
                    init$0();
                    f24355g = 0;
                    f24356h = 1;
                    f24352c = new char[]{2547, 2532, 2558, 2528, 2533, 2555, 2340, 2529, 2305, 2539, 2542, 2559, 2535, 2321, 2534, 2545, 2553, 2530, 2304, 2552, 2540, 2557, 2330, 2554};
                    f24353d = 2040400210;
                    f24357j = true;
                    f24354f = true;
                }

                AnonymousClass4(Context context2, d dVar2) {
                    context = context2;
                    dVar = dVar2;
                }

                private static void i(byte v2, byte v3, short v4, Object[] v5) {
                    /*
                        int r0 = r8 * 5
                        int r8 = r0 + 101
                        int r0 = r9 * 2
                        int r7 = r0 + 4
                        byte[] r6 = o.eo.e.AnonymousClass4.$$a
                        int r5 = r10 * 4
                        int r0 = r5 + 1
                        byte[] r4 = new byte[r0]
                        r3 = 0
                        if (r6 != 0) goto L2d
                        r1 = r7
                        r2 = r3
                    L15:
                        int r8 = r8 + r7
                        int r7 = r1 + 1
                        r1 = r2
                    L19:
                        byte r0 = (byte) r8
                        r4[r1] = r0
                        int r2 = r1 + 1
                        if (r1 != r5) goto L28
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r4, r3)
                        r11[r3] = r0
                        return
                    L28:
                        r0 = r6[r7]
                        r1 = r7
                        r7 = r0
                        goto L15
                    L2d:
                        r1 = r3
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.eo.e.AnonymousClass4.i(byte, byte, short, java.lang.Object[]):void");
                }

                static void init$0() {
                    $$a = new byte[]{Ascii.FF, 10, -28, MessagePack.Code.NEGFIXINT_PREFIX};
                    $$b = 36;
                }

                static void init$1() {
                    $$d = new byte[]{54, -126, MessagePack.Code.INT32, 96, MessagePack.Code.BIN8, 60, 2, MessagePack.Code.INT16, 56};
                    $$e = 35;
                }

                static void init$2() {
                    $$c = new byte[]{117, -127, -11, 113};
                    $$f = 10;
                }

                /* JADX WARN: Removed duplicated region for block: B:87:0x0018  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void k(int r20, java.lang.String r21, int[] r22, java.lang.String r23, java.lang.Object[] r24) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 581
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.eo.e.AnonymousClass4.k(int, java.lang.String, int[], java.lang.String, java.lang.Object[]):void");
                }

                private static void l(int v2, byte v3, int v4, Object[] v5) {
                    /*
                        int r0 = r10 * 12
                        int r7 = 111 - r0
                        int r2 = r8 * 5
                        int r1 = 6 - r2
                        byte[] r6 = o.eo.e.AnonymousClass4.$$d
                        int r0 = r9 * 5
                        int r5 = 8 - r0
                        byte[] r4 = new byte[r1]
                        int r3 = 5 - r2
                        r2 = 0
                        if (r6 != 0) goto L2f
                        r1 = r3
                        r0 = r2
                    L17:
                        int r7 = r7 + r1
                        int r7 = r7 + (-5)
                        r1 = r0
                    L1b:
                        byte r0 = (byte) r7
                        r4[r1] = r0
                        int r5 = r5 + 1
                        int r0 = r1 + 1
                        if (r1 != r3) goto L2c
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r4, r2)
                        r11[r2] = r0
                        return
                    L2c:
                        r1 = r6[r5]
                        goto L17
                    L2f:
                        r1 = r2
                        goto L1b
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.eo.e.AnonymousClass4.l(int, byte, int, java.lang.Object[]):void");
                }

                @Override // o.eo.b.d
                public final void a(o.by.c cVar) {
                    int i22 = 2 % 2;
                    int i32 = f24355g + 33;
                    f24356h = i32 % 128;
                    int i4 = i32 % 2;
                    dVar.a(cVar);
                    int i5 = f24355g + 65;
                    f24356h = i5 % 128;
                    int i6 = i5 % 2;
                }

                /* JADX WARN: Removed duplicated region for block: B:74:0x02c3  */
                @Override // o.eo.b.d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void c(java.util.List<o.ep.i> r25) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 1076
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.eo.e.AnonymousClass4.c(java.util.List):void");
                }
            });
            int i4 = f24309g + 117;
            f24312l = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
        Object[] objArr5 = new Object[1];
        n("繽縪굈ꓩ\ue4c4Èｇ\ued0b즜旙", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, objArr5);
        String strIntern2 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        k((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42, "\f\u001f㘾㘾\u000f\u001c/\u0002\t/\u0014\"\u001e+\u0003\u001f㘼㘼\u0006\f\u0019\u001e\u0002\u0017\"\u0014\u0007\u0014\u000f\u001e\u0006\u001a\t0*\u0011\u0011\u0019\u0003/\u0014\u0000", (byte) (ImageFormat.getBitsPerPixel(0) + 73), objArr6);
        throw new WalletValidationException(walletValidationErrorCode, strIntern2, ((String) objArr6[0]).intern());
    }

    public final c e() {
        int i2 = 2 % 2;
        int i3 = f24312l + 51;
        int i4 = i3 % 128;
        f24309g = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        c cVar = this.f24315h;
        int i5 = i4 + 65;
        f24312l = i5 % 128;
        int i6 = i5 % 2;
        return cVar;
    }

    public final void e(Context context) throws Throwable {
        o.ef.a aVar;
        short sXd = (short) (C1607wl.Xd() ^ 19513);
        int[] iArr = new int["ᐅᐭ韷ෟ\uf57c昿ꈣ".length()];
        QB qb = new QB("ᐅᐭ韷ෟ\uf57c昿ꈣ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strVd = Wg.vd("턊탇걖껐쐞ᛙ蘰뭫灒\uebd1睖\uf483䟕᭖㿎勪\uf771拯ࡣ讥雸蹷䳭혻", (short) (C1607wl.Xd() ^ 9353));
        int i3 = 2 % 2;
        Object[] objArr = new Object[1];
        k((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 47, Qg.kd("\u001e#\u0017\u001d{\u0015\u0006\u001b\u0012\n\u000f\u0015s\r}\u0013\n\u0002u{w\rd\u0002\u000f}\n{ubev\u0002gVod\u0003as`xaS\\Yﰱ", (short) (Od.Xd() ^ (-2480)), (short) (Od.Xd() ^ (-23500))), (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Class<?> cls = Class.forName(hg.Vd("x\u0005y\u0007\u0003{u>r}{\u0001px}6Jusxhzu", (short) (ZN.Xd() ^ 135), (short) (ZN.Xd() ^ 25290)));
        Class<?>[] clsArr = {Class.forName(C1561oA.ud("$\u001a.\u0018c!\u0015!\u0019^\u0003# \u0016\u001a\u0012", (short) (C1499aX.Xd() ^ (-6492)))), Integer.TYPE};
        Object[] objArr2 = {strIntern, 0};
        short sXd2 = (short) (FB.Xd() ^ 29046);
        int[] iArr2 = new int["ifxVf^rdnY~pljzl\u0001ty\u0007".length()];
        QB qb2 = new QB("ifxVf^rdnY~pljzl\u0001ty\u0007");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i4));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr2);
            try {
                aVar = new o.ef.a();
            } catch (o.ef.b e2) {
                e = e2;
            }
            try {
                Object[] objArr3 = {this.f24315h};
                int i5 = c.f24256a * (-805690);
                c.f24256a = i5;
                int i6 = c.f24262g * (-1866330840);
                c.f24262g = i6;
                int i7 = c.f24263h * 1365440401;
                c.f24263h = i7;
                o.ef.a aVar2 = (o.ef.a) c.a(new Random().nextInt(742452500), objArr3, i7, -811278882, 811278884, i5, i6);
                int iActiveCount = Thread.activeCount();
                int priority = Thread.currentThread().getPriority();
                int i8 = 408478217 * o.ef.a.f23768b;
                o.ef.a.f23768b = i8;
                if (((Integer) o.ef.a.a(-1670499501, new Object[]{aVar2}, i8, (int) Thread.currentThread().getId(), 1670499501, iActiveCount, priority)).intValue() != 0) {
                    if (o.ea.f.a()) {
                        Object[] objArr4 = new Object[1];
                        n(strVd, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, objArr4);
                        String strIntern2 = ((String) objArr4[0]).intern();
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr5 = new Object[1];
                        n(C1561oA.Yd("茫莉쟭\uf627\ued7f⍺䞁\uf5cc혞ࢍ㙳딈麃ἂ蔠⚔擧м뵷\ue5fc㖲ꈋ…鎎\uf83b\uda92ַ笒샃烙ꜰ䲎蜵ꦝ\udf77\uec1a쾎९㈞놈鈒䐋艧ℳ婟", (short) (C1580rY.Xd() ^ (-3111))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr5);
                        o.ea.f.c(strIntern2, sb.append(((String) objArr5[0]).intern()).append(aVar2).toString());
                    }
                    int iMakeMeasureSpec = 18 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    short sXd3 = (short) (OY.Xd() ^ 8123);
                    short sXd4 = (short) (OY.Xd() ^ 11380);
                    int[] iArr3 = new int["ȸ#8!>CQ7CT'WJ5HE=W".length()];
                    QB qb3 = new QB("ȸ#8!>CQ7CT'WJ5HE=W");
                    int i9 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i9] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i9)) + sXd4);
                        i9++;
                    }
                    Object[] objArr6 = new Object[1];
                    k(iMakeMeasureSpec, new String(iArr3, 0, i9), (byte) (76 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr6);
                    aVar.a(((String) objArr6[0]).intern(), aVar2);
                } else if (o.ea.f.a()) {
                    Object[] objArr7 = new Object[1];
                    n(strVd, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr7);
                    String strIntern3 = ((String) objArr7[0]).intern();
                    Object[] objArr8 = new Object[1];
                    k(Color.rgb(0, 0, 0) + 16777249, Jg.Wd("pg販슱PeS5H?+3dQ;\u0016/1\"\u0018 *\u0016\u001b\u00136o\u0001\u0012\u001dtd톪", (short) (C1633zX.Xd() ^ (-18084)), (short) (C1633zX.Xd() ^ (-24125))), (byte) (View.MeasureSpec.getMode(0) + 43), objArr8);
                    o.ea.f.c(strIntern3, ((String) objArr8[0]).intern());
                }
                String strE = new o.dk.a(context).e(aVar.e());
                if (o.ea.f.a()) {
                    int i10 = f24312l + 109;
                    f24309g = i10 % 128;
                    int i11 = i10 % 2;
                    Object[] objArr9 = new Object[1];
                    n(strVd, 1 - View.combineMeasuredStates(0, 0), objArr9);
                    String strIntern4 = ((String) objArr9[0]).intern();
                    Object[] objArr10 = new Object[1];
                    n(ZO.xd("铈볊銅偑\ue45dⁱ鐎¨슞맘홸ﶫ筟ᢋ줭罇\ue011칑\uf82c亁鰅ѹ\ue828ᘩᔕඓ뵺瀕\ue95e퉂Ჴ䁍풏뗅\uf45c᪆糵\ueefbꢯ䚢㩷뉶샿\uf558\uec61㥯㆚\uf627", (short) (FB.Xd() ^ 5299), (short) (FB.Xd() ^ 10937)), ExpandableListView.getPackedPositionGroup(0L) + 1, objArr10);
                    o.ea.f.c(strIntern4, ((String) objArr10[0]).intern());
                    int i12 = f24312l + 27;
                    f24309g = i12 % 128;
                    int i13 = i12 % 2;
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                Object[] objArr11 = new Object[1];
                n(str, (Process.myPid() >> 22) + 1, objArr11);
                editorEdit.putString(((String) objArr11[0]).intern(), strE).commit();
            } catch (o.ef.b e3) {
                e = e3;
                if (o.ea.f.a()) {
                    Object[] objArr12 = new Object[1];
                    n(strVd, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr12);
                    String strIntern5 = ((String) objArr12[0]).intern();
                    StringBuilder sb2 = new StringBuilder();
                    Object[] objArr13 = new Object[1];
                    k(Color.red(0) + 70, C1626yg.Ud("M\u0012㼭綼\u0015|~j\u0005\u0014Cz.\nk*\u0015R\u007f\u0014\u0016ƒ0avwdGjYT\u0013G,9}Ug\n5\u001fyڵ7Db\u0002EFB1.:Gz\u001eGv.oU}Dno[d)\r\u0018", (short) (FB.Xd() ^ 4374), (short) (FB.Xd() ^ 11116)), (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 101), objArr13);
                    o.ea.f.c(strIntern5, sb2.append(((String) objArr13[0]).intern()).append(e.getMessage()).toString());
                }
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                Object[] objArr14 = new Object[1];
                n(str, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr14);
                editorEdit2.putString(((String) objArr14[0]).intern(), "").commit();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public final void e(Context context, String str, d<h> dVar) throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            n("ၝမ\ue3a7\ue620ﭵ丯붅\uf2bfꞭ⬫꺯㏛缴労眫詆㚴騱㾤싥츿얽萲ᕿ", (ViewConfiguration.getTouchSlop() >> 8) + 1, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            k(25 - (ViewConfiguration.getTouchSlop() >> 8), "*\u0011&,\u0013\u0007\u000b,\u0003/\u001f\u0016\"/\u001a(0\u0003-\u0015\u0003 \u0011*㘃", (byte) (TextUtils.indexOf((CharSequence) "", '0') + 27), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i3 = f24312l + 79;
            f24309g = i3 % 128;
            int i4 = i3 % 2;
        }
        if (!o.en.b.c().s()) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr3 = new Object[1];
            n("繽縪굈ꓩ\ue4c4Èｇ\ued0b즜旙", ExpandableListView.getPackedPositionGroup(0L) + 1, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            k(41 - ExpandableListView.getPackedPositionChild(0L), "\f\u001f㘾㘾\u000f\u001c/\u0002\t/\u0014\"\u001e+\u0003\u001f㘼㘼\u0006\f\u0019\u001e\u0002\u0017\"\u0014\u0007\u0014\u000f\u001e\u0006\u001a\t0*\u0011\u0011\u0019\u0003/\u0014\u0000", (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 72), objArr4);
            throw new WalletValidationException(walletValidationErrorCode, strIntern2, ((String) objArr4[0]).intern());
        }
        Object[] objArr5 = {this.f24315h.o(str)};
        int iNextInt = new Random().nextInt(710546813);
        int i5 = c.b.f24278b * (-1534841831);
        c.b.f24278b = i5;
        int i6 = c.b.f24281e * (-1576044770);
        c.b.f24281e = i6;
        ((g) c.b.c(iNextInt, objArr5, 139242858, (int) Process.getElapsedCpuTime(), i5, -139242856, i6)).c(context, str, new b.d<h>() { // from class: o.eo.e.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static final int $$f = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a */
            private static int[] f24361a = null;

            /* JADX INFO: renamed from: d */
            private static int f24362d = 0;

            /* JADX INFO: renamed from: f */
            private static int f24363f = 0;

            /* JADX INFO: renamed from: g */
            public static int f24364g = 0;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ Context f24365b;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ d f24367e;

            private static String $$g(short v2, byte v3, byte v4) {
                /*
                    int r0 = r10 * 3
                    int r7 = 4 - r0
                    int r0 = r9 * 2
                    int r6 = r0 + 117
                    byte[] r5 = o.eo.e.AnonymousClass5.$$c
                    int r1 = r8 * 3
                    int r0 = 1 - r1
                    byte[] r4 = new byte[r0]
                    r3 = 0
                    int r2 = 0 - r1
                    if (r5 != 0) goto L2a
                    r0 = r2
                    r1 = r3
                L17:
                    int r6 = r6 + r0
                    int r7 = r7 + 1
                L1a:
                    byte r0 = (byte) r6
                    r4[r1] = r0
                    if (r1 != r2) goto L25
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    return r0
                L25:
                    int r1 = r1 + 1
                    r0 = r5[r7]
                    goto L17
                L2a:
                    r1 = r3
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: o.eo.e.AnonymousClass5.$$g(short, byte, byte):java.lang.String");
            }

            static {
                init$2();
                $10 = 0;
                $11 = 1;
                init$1();
                f24364g = -1409776866;
                init$0();
                f24362d = 0;
                f24363f = 1;
                f24361a = new int[]{-1643011882, 1520544925, -732434346, 429142349, 1334456138, 1811544673, 2097958496, -896669506, 2146531885, -1505132025, 447955384, 1221615055, -586639431, 698220377, -510463769, -1099742650, -2058275706, -1498886191};
            }

            AnonymousClass5(Context context2, d dVar2) {
                context = context2;
                dVar = dVar2;
            }

            private static void h(int i22, short s2, int i32, Object[] objArr6) {
                int i42 = s2 * 3;
                int i52 = 106 - (i22 * 5);
                int i62 = 4 - (i32 * 4);
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[1 - i42];
                int i7 = 0 - i42;
                int i8 = -1;
                if (bArr == null) {
                    i52 = (-i52) + i62;
                    i62++;
                }
                while (true) {
                    i8++;
                    bArr2[i8] = (byte) i52;
                    if (i8 == i7) {
                        objArr6[0] = new String(bArr2, 0);
                        return;
                    }
                    byte b2 = bArr[i62];
                    i52 = (-b2) + i52;
                    i62++;
                }
            }

            private static void i(int[] iArr, int i22, Object[] objArr6) throws Throwable {
                int length;
                int[] iArr2;
                int i32;
                int i42 = 2;
                int i52 = 2 % 2;
                l lVar = new l();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr3 = f24361a;
                int i62 = 989264422;
                int i7 = 0;
                if (iArr3 != null) {
                    int i8 = $10 + 57;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        length = iArr3.length;
                        iArr2 = new int[length];
                        i32 = 1;
                    } else {
                        length = iArr3.length;
                        iArr2 = new int[length];
                        i32 = 0;
                    }
                    while (i32 < length) {
                        int i9 = $11 + 27;
                        $10 = i9 % 128;
                        if (i9 % i42 != 0) {
                            try {
                                Object[] objArr22 = {Integer.valueOf(iArr3[i32])};
                                Object objA = o.d.d.a(i62);
                                if (objA == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = (byte) (b2 + 2);
                                    objA = o.d.d.a(KeyEvent.normalizeMetaState(0) + 675, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 12 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -328001469, false, $$g(b2, b3, (byte) (b3 - 2)), new Class[]{Integer.TYPE});
                                }
                                iArr2[i32] = ((Integer) ((Method) objA).invoke(null, objArr22)).intValue();
                                i32 = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr32 = {Integer.valueOf(iArr3[i32])};
                            Object objA2 = o.d.d.a(989264422);
                            if (objA2 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = (byte) (b4 + 2);
                                objA2 = o.d.d.a(675 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (AndroidCharacter.getMirror('0') - '0'), 12 - View.MeasureSpec.makeMeasureSpec(0, 0), -328001469, false, $$g(b4, b5, (byte) (b5 - 2)), new Class[]{Integer.TYPE});
                            }
                            iArr2[i32] = ((Integer) ((Method) objA2).invoke(null, objArr32)).intValue();
                            i32++;
                        }
                        i42 = 2;
                        i62 = 989264422;
                    }
                    int i10 = $10 + 1;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    iArr3 = iArr2;
                }
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = f24361a;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i12 = 0;
                    while (i12 < length3) {
                        int i13 = $10 + 113;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        Object[] objArr42 = {Integer.valueOf(iArr5[i12])};
                        Object objA3 = o.d.d.a(989264422);
                        if (objA3 == null) {
                            byte b6 = (byte) i7;
                            byte b7 = (byte) (b6 + 2);
                            objA3 = o.d.d.a(675 - ExpandableListView.getPackedPositionGroup(0L), (char) View.MeasureSpec.getMode(i7), TextUtils.getTrimmedLength("") + 12, -328001469, false, $$g(b6, b7, (byte) (b7 - 2)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i12] = ((Integer) ((Method) objA3).invoke(null, objArr42)).intValue();
                        i12++;
                        i7 = 0;
                    }
                    iArr5 = iArr6;
                }
                System.arraycopy(iArr5, i7, iArr4, i7, length2);
                lVar.f19941d = i7;
                int i15 = $10 + 101;
                $11 = i15 % 128;
                int i16 = 3;
                if (i15 % 2 == 0) {
                    int i17 = 5 / 3;
                }
                while (lVar.f19941d < iArr.length) {
                    cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
                    cArr[1] = (char) iArr[lVar.f19941d];
                    cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                    cArr[i16] = (char) iArr[lVar.f19941d + 1];
                    lVar.f19942e = (cArr[0] << 16) + cArr[1];
                    lVar.f19940a = (cArr[2] << 16) + cArr[i16];
                    l.a(iArr4);
                    int i18 = 0;
                    for (int i19 = 16; i18 < i19; i19 = 16) {
                        lVar.f19942e ^= iArr4[i18];
                        int iE = l.e(lVar.f19942e);
                        Object[] objArr52 = new Object[4];
                        objArr52[i16] = lVar;
                        objArr52[2] = lVar;
                        objArr52[1] = Integer.valueOf(iE);
                        objArr52[0] = lVar;
                        Object objA4 = o.d.d.a(2098218801);
                        if (objA4 == null) {
                            int jumpTapTimeout = 301 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            char capsMode = (char) (52697 - TextUtils.getCapsMode("", 0, 0));
                            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11;
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 + 1);
                            String str$$g = $$g(b8, b9, (byte) (b9 - 1));
                            Class[] clsArr = new Class[4];
                            clsArr[0] = Object.class;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Object.class;
                            clsArr[i16] = Object.class;
                            objA4 = o.d.d.a(jumpTapTimeout, capsMode, keyRepeatTimeout, -1416256172, false, str$$g, clsArr);
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr52)).intValue();
                        lVar.f19942e = lVar.f19940a;
                        lVar.f19940a = iIntValue;
                        i18++;
                    }
                    int i20 = lVar.f19942e;
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = i20;
                    lVar.f19940a ^= iArr4[16];
                    lVar.f19942e ^= iArr4[17];
                    int i21 = lVar.f19942e;
                    int i222 = lVar.f19940a;
                    cArr[0] = (char) (lVar.f19942e >>> 16);
                    cArr[1] = (char) lVar.f19942e;
                    cArr[2] = (char) (lVar.f19940a >>> 16);
                    cArr[i16] = (char) lVar.f19940a;
                    l.a(iArr4);
                    cArr2[lVar.f19941d * 2] = cArr[0];
                    cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                    cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                    cArr2[(lVar.f19941d * 2) + i16] = cArr[i16];
                    Object[] objArr62 = {lVar, lVar};
                    Object objA5 = o.d.d.a(986820978);
                    if (objA5 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        objA5 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 230, (char) (51004 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 9 - TextUtils.indexOf("", ""), -330018025, false, $$g(b10, b11, b11), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA5).invoke(null, objArr62);
                    i16 = 3;
                }
                objArr6[0] = new String(cArr2, 0, i22);
            }

            static void init$0() {
                $$a = new byte[]{120, -15, 89, -97};
                $$b = 253;
            }

            static void init$1() {
                $$d = new byte[]{121, Base64.padSymbol, 92, -93, 64, MessagePack.Code.FLOAT32, 52, MessagePack.Code.UINT8, 60, MessagePack.Code.NEVER_USED};
                $$e = 183;
            }

            static void init$2() {
                $$c = new byte[]{121, -71, 80, 66};
                $$f = 149;
            }

            private static void j(int v2, short v3, byte v4, Object[] v5) {
                /*
                    int r2 = r7 * 6
                    int r1 = 7 - r2
                    byte[] r7 = o.eo.e.AnonymousClass5.$$d
                    int r0 = r8 * 6
                    int r6 = r0 + 4
                    int r0 = r9 * 10
                    int r0 = 111 - r0
                    byte[] r5 = new byte[r1]
                    int r4 = 6 - r2
                    r3 = -1
                    if (r7 != 0) goto L2f
                    r2 = r3
                    r1 = r6
                L17:
                    int r0 = -r0
                    int r6 = r6 + r0
                    int r1 = r1 + 1
                    int r6 = r6 + r3
                L1c:
                    int r2 = r2 + 1
                    byte r0 = (byte) r6
                    r5[r2] = r0
                    if (r2 != r4) goto L2c
                    java.lang.String r1 = new java.lang.String
                    r0 = 0
                    r1.<init>(r5, r0)
                    r10[r0] = r1
                    return
                L2c:
                    r0 = r7[r1]
                    goto L17
                L2f:
                    r2 = r3
                    r1 = r6
                    r6 = r0
                    goto L1c
                */
                throw new UnsupportedOperationException("Method not decompiled: o.eo.e.AnonymousClass5.j(int, short, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:65:0x02ac  */
            @Override // o.eo.b.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(o.by.c r26) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1220
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.eo.e.AnonymousClass5.a(o.by.c):void");
            }

            @Override // o.eo.b.d
            public final void c(List<h> list) throws Throwable {
                int i22 = 2 % 2;
                int i32 = f24363f + 49;
                f24362d = i32 % 128;
                int i42 = i32 % 2;
                e.this.e(context);
                dVar.d(list);
                int i52 = f24363f + 61;
                f24362d = i52 % 128;
                int i62 = i52 % 2;
            }
        });
        int i7 = f24312l + 73;
        f24309g = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 58 / 0;
        }
    }
}
