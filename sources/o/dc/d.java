package o.dc;

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
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import o.a.o;
import o.az.a;
import o.dc.b;
import o.dd.c;
import o.dd.g;
import o.dd.h;
import o.dd.j;
import o.en.f;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1626yg;
import yg.C1633zX;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: d */
    private static final d f22775d;

    /* JADX INFO: renamed from: k */
    private static long f22776k = 0;

    /* JADX INFO: renamed from: l */
    private static int f22777l = 0;

    /* JADX INFO: renamed from: m */
    private static int f22778m = 0;

    /* JADX INFO: renamed from: n */
    private static int f22779n = 0;

    /* JADX INFO: renamed from: o */
    private static char[] f22780o = null;

    /* JADX INFO: renamed from: s */
    private static int f22781s = 0;

    /* JADX INFO: renamed from: b */
    private o.dd.e f22783b;

    /* JADX INFO: renamed from: e */
    private c f22785e;

    /* JADX INFO: renamed from: f */
    private boolean f22786f;

    /* JADX INFO: renamed from: g */
    private boolean f22787g;

    /* JADX INFO: renamed from: h */
    private a f22788h;

    /* JADX INFO: renamed from: a */
    private final j f22782a = new j();

    /* JADX INFO: renamed from: c */
    private final o.de.a f22784c = new o.de.a();

    /* JADX INFO: renamed from: j */
    private final h f22790j = new h();

    /* JADX INFO: renamed from: i */
    private AtomicBoolean f22789i = null;

    private static String $$c(byte b2, short s2, byte b3) {
        int i2 = 105 - b3;
        int i3 = 4 - (s2 * 2);
        byte[] bArr = $$a;
        int i4 = b2 * 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 += i4;
            i3++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i3];
            i3++;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22779n = 0;
        f22781s = 1;
        f22777l = 0;
        f22778m = 1;
        b();
        ViewConfiguration.getZoomControlsTimeout();
        Color.blue(0);
        TextUtils.indexOf((CharSequence) "", '0');
        f22775d = new d();
        int i2 = f22779n + 75;
        f22781s = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 12 / 0;
        }
    }

    private d() {
    }

    public static d a() {
        int i2 = 2 % 2;
        int i3 = f22778m + 107;
        int i4 = i3 % 128;
        f22777l = i4;
        int i5 = i3 % 2;
        d dVar = f22775d;
        int i6 = i4 + 57;
        f22778m = i6 % 128;
        if (i6 % 2 != 0) {
            return dVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private o.dd.e a(Context context, o.dd.e eVar, o.dd.e eVar2, o.en.b bVar) throws Throwable {
        int i2 = 2 % 2;
        long jC = h.c(context, bVar, eVar.e());
        long jC2 = h.c(context, bVar, eVar2.e());
        if (jC != -1) {
            int i3 = f22777l + 111;
            f22778m = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (jC2 != -2) {
                if (jC < jC2) {
                    return new o.dd.e(eVar.a(), eVar.e());
                }
                o.dd.e eVar3 = new o.dd.e(eVar2.a(), eVar2.e());
                int i4 = f22778m + 31;
                f22777l = i4 % 128;
                int i5 = i4 % 2;
                return eVar3;
            }
        }
        Object[] objArr = new Object[1];
        p((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (-16774267) - Color.rgb(0, 0, 0), View.resolveSize(0, 0) + 47, objArr);
        throw new f(((String) objArr[0]).intern());
    }

    static void b() {
        char[] cArr = new char[3137];
        ByteBuffer.wrap("\u0094½\u00854·û¡¢ÒKÌ\bþßïg\u0019,\u000bÙ%\u008fVN@\u001br«cc\u009d*\u0094\u0080\u0085!·ï¡¥ÒOÌ\u000fþÂïZ\u0019'\u000bù%\u0081VT@\u001fr\u0081cg\u009d6\u008fó¹\u0083ª[Ä\u001dö¯çr\u0011\"\u0003û=\u008e.[Xú\u0094\u0080\u0085!·ï¡¥ÒOÌ\u000fþÂïZ\u0019'\u000bù%\u0081VT@\u001fr\u0081cg\u009d6\u008fó¹\u0083ª[Ä\u001dö¯çr\u0011\"\u0003û=\u008e.[XúJà{7\u0095L\u0087Ò±\u008a¢SÜêÎ\u00adÿqé\t\u001bÈ5\u009f&'PìBôsGm\u0013\u009f\u009a\u0088cº(Ô¸Æµ÷Ká\u0017\u0013Þ\fm>|(¬ZÈKPe\u0011\u0097£\u0080o².¬ÉÞÆÏUù\u0013ëª\u0004\u007f67 ÏR\u0091CS}æo¶\u00984\u008a\u0007¤ÓÖÚÇ*ñéãª\u001cp\u000e\r8Ú*\u0094[/uò m1Ý\u0003\u0014\u0015Uf²xöJ>[\u0097\u00adÀ¿\u0010\u0091kâëôøÆT×Í)Ü;\u0017\r/\u001e²pôBHS\u0099¥Ú·c\u00893\u009aÿì\u0017þNÏ\u009c!è39\u0005v\u0016ùh\u0002zTK\u0095]à¯0\u0081x\u0092Îä\föQÇ±Ù«+8<\u0094\u000e\u008d`\u0015rVC½U÷§2¸\u0085\u008aÓ\u009c\u0018îm\u009dX\u008cù¾7¨}Û\u0097Å×÷\u001aæ\u0082\u0010ÿ\u0002!,Y_\u008cIÇ{Yj¿\u0094î\u0086+°[£\u0083ÍÅÿwîª\u0018ú\n#4V'\u0083Q\"C8rï\u009c\u0094\u008e\u001f¸N«\u0085Õ(Çnö\u00adàÀ\u0012D<\\/õY7Kcz\u0082dÝ\u0096B\u0081¹³ÿÝ.Ïkþ\u009bèÃ\u001a\u0005\u0005·7ê!:S\u0010B\u0093lß\u009e6\u0089·»ì¥T×YÆ\u008fðÃâr\r¡?¨)H[\u0004J\u009ct5fw\u0091£\u0083Â\u00ad\u001dß\u0002Îùø?ên\u0015«\u0007Û1\u0003#ER÷|*nz\u0099Ð\u008bÓµ\u001f¤öÖþÀ-òF\u001d\u009c\u000fÉ9\u000e(¸ZãD&\u0094\u0080\u0085!·ó¡¿Ò^Ì\u0019þ\u0096ïe\u0019#\u000bú%\u008fVG@\u001fr¡cc\u009d6\u008fæ¹ÄªWÄ\u0003öêçs\u00118\u0003\u0088=\u0085.[XçJ®{}\u0095L\u0087\u009c±Ø¢@ÜáÎ³ÿ\u007fé\u001e\u001bÙ5Ö&%PãBºsOm\u0007\u009fß\u0088aº#ÔöÆ¦÷\u0004á\u0017\u0013Ã\f*>:(ùZ\u009aK@e\u001d\u0097ª\u0080d²?¬Âx(i\u0089[GM\r>ç §\u0012j\u0003òõ\u008fçQÉ)ºü¬·\u009e)\u008fÏq\u009ec[U+Fó(µ\u001a\u0007\u000bÚý\u008aïSÑ&Âó´R¦H\u0097\u009fyäk|]5N÷0C\"\u0002\u0013Ý\u0005â÷yÙ?Ê\u008e¼K®\u001b\u009fã\u0081¥swdÊV\u009a8\u0010*\u0013\u001bÿ\röÿyàÎÒ\u0098ÄQ¶7§ï\u0089¸3\u007f\"Â\u0010\u0012\u0006ju§kùY1H\u0094¾Ï¬1\u0082gñ¦çóÕCÄ\u008b:Ý(\u001f\u001eb\r¢cËQN@\u009b¶Ê\u0094\u009d\u0085*·Ô¡¿ÒHÌ/þÂïi\u00190\u000bàFwWÀe>sU\u0000¢\u001eÅ,(=\u0083ËÚÙ\n÷$\u0084ç\u0092° L±\u0083OÐ]Xk|x±\u0016é$T5\u0097ÃÎÑ6ïmüº\u008aD\u0098L©\u0082GéU!c2p«\u000e\u0017\u001cG-\u008e;åÉ;ç<ôÉ\u0082\u0001\u0090R¡¨\u0094\u009d\u0085*·Ô¡¿ÒHÌ9þØïlû¨ê\u001fØáÎ\u008a½}£\f\u0091í\u0080YvWd\u008cJû9b/.\u001d\u0095\f_ò\bàÓÖñÅb«6\u0099ß\u0088G~\fléR÷A`7Ø%\u0081\u0014Fú/èöÞáÍ'³Ã¡\u008e\u0090V\u0086/tæZ\u00adI\u000e?Ò-Á\u001ch\u0002!ðîçMÕ\u0006»Þ©Ç\u0098+\u008ek| cL\u0094\u009d\u0085*·Ô¡¿ÒHÌ9þØïl\u0019b\u000b¹%ÎVJ@\u0015r®c&\u009d0\u008fó¹\u0097ª\u001eÄ\u0012ö¯çy\u00118\u0003\u0088=\u0089.]XâJ¬{\u007f\u0095\b\u0087\u0086±\u009a¢KÜ¤Î\u00adÿié\u0019\u001bÈ5\u0093&%cirÞ@ VK%¼;Í\t,\u0018\u0098î\u0096üMÒ:¡»·à\u0085\u007f\u0094\u009djÅx\bNw]\u00803ë\u0001\\\u0010ÈæËô/Ê6Ù®¯\u000f½X\u008c\u0082b¸phF,U§+\u00129E\b\u0096\u001eêì!ÂlÑÛ§VµP\u0084¨\u009aûh-\u007f\u009dMÁ#\u001f1O\u0000¾\u0016í\u009bÝ\u008aj¸\u0094®ÿÝ\bÃyñ\u0098à,\u0016\"\u0004ù*\u008eY\nOU}îlf\u0092p\u0080³¶×¥^ËRùïè9\u001ex\fÈ2À!\u0018W¡Eãt1\u009aI\u0088\u0082¾\u0098\u00ad\u0010Ó½Á¾ð\u001fæZ\u0014\u0099:Ä)i_¶Mý|\u0001bN\u0090Ö\u0087lµtÛ½Éõø\rîM\u001c\u0084\u0003/1n'¿UÆD\u0005j\u0014\u0098ç\u008f4½i£ÌÑÒÀ\u0001öBäáXêI]{£mÈ\u001e?\u0000N2¯#\u001bÕ\u0015ÇÎé¹\u009a=\u008cb¾Ù¯QQ]C\u0080uçf;\b~:\u009d+\u0019ÝDÏ®ñàâ*\u0094\u008b\u0086Ò·\t\u0094\u009d\u0085*·Ô¡¿ÒHÌ9þØïl\u0019b\u000b¹%ÎVR@\u001fr¸ct\u009d!\u008f²¹\u008aªKÄ\u001dö¨çy\u0011$\u0003\u0088=Ø.\u0014X«J³{:\u0095A\u0087\u0086±\u008a¢WÜðÎ¬ÿiéJ\u001bØ5\u0093&$PãB\u00ads\u000emH\u009fÉ\u0088iº%Ô±Æò÷\u001eá^\u0013\u0095\fy>|(»ZÈKPe\u0011\u0097º\u0080r²#¬\u008cÞ\u0095Ï[ù\u001aë¡\u0004z6% ÆR\u0099CR}¨o£\u0098`\u008aN¤\u0085Ö\u0089\u0094\u009d\u0085*·Ô¡¿ÒHÌ9þØïl\u0019b\u000b¹%ÎVJ@\u0015r®c&\u009d*\u008f÷¹\u0090ªLÄ\töêçr\u00119\u0003Ü=Â.FXëJ±{o\u0095\u0005\u0087Ô±\u009d¢V\u0094\u009d\u0085*·Ô¡¿ÒHÌ9þØïl\u0019b\u000b¹%ÎVR@\u001fr¸ct\u009d!\u008f²¹\u0097ªJÄ\u0002ö«çh\u00113\u0003Ï=\u009b.\u0014XüJ¥{w\u0095\r\u0087Ï±\u0096¢AÜ¤Îªÿxé\u000f\u001b\u009c5\u0085&)PïB±s\u000em\u0001\u009fÜ\u0088xº#ÔêÆò÷Ná\u0011\u0013Ò\f*>?(ùZ\u0085KRe\u0018\u0097«\u0080t²3¬ÃÞ\u0088Ï\u0018ùHëä\u0094\u009d\u0085*·Ô¡¿ÒHÌ9þØïl\u0019b\u000b¹%ÎVR@\u001fr¸ct\u009d!\u008f²¹\u0097ªJÄ\u0002ö«çh\u00113\u0003Ï=\u009b.\u0014XæJ¡{i\u0095L\u0087Å±\u0090¢SÜêÎ¹ÿué\u000e\u001b\u009c5\u0081&!PöB¼s\u000em\n\u009fÕ\u0088nºfÔûÆ½÷Iá\u000e\u0013Ü\fo>((ÿZ\u0087KLeT\u0097ô\u0080 ¡n°Ù\u0082'\u0094Lç»ùÊË+Ú\u009f,\u0091>J\u0010=c¤uèGVV\u0081¨Âº\u000f\u008cp\u009fíñéÃVÒ\u008d$\u00856?\bt\u001b³m\u0018\u007fPN\u009d ú²1\u0094\u009d\u0085*·Ô¡¿ÒHÌ9þØïl\u0019b\u000b¹%ÎVP@\u0015r¿cr\u009dx\u008f÷¹\u009cª[Ä\u0013ö¿çh\u0011?\u0003Ç=\u008c.\u0014XäJ¯{x\u0095L\u0087Ò±\u0097¢\u0012ÜæÎ»ÿ0é\u0019\u001bÙ5\u0098&,°;¡\u008c\u0093r\u0085\u0019öîè\u009fÚ~ËÊ=Ä/\u001f\u0001hröd¹V\u0004GÄ¹\u0097«Z\u009d%\u008e¸à¦Ò\u001eÃÕ5\u0086'g\u00197\nû|Gn\b_\u009c±¾£o\u00955\u0086ñøLêXÛÂÍ£?:\u00112\u0002\u008bt\u0004f\u0001WíI¨»hùóèDÚºÌÑ¿&¡W\u0093¶\u0082\u0002t\ff×H ; -q\u001fÕ\u000eHð\\â\u0093ÔèÇp©m\u009bÇ\u008a\u001a|]n¢PùC65\u0085'Ê\u0016Tøcê¼Ü¶\u0094\u009a\u0085%·ð¡´ÒFÌ\u0019þùïx\u0019'\u000bæ%\u008fVT@\u0013r£ch\u009d\n\u008f÷¹\u0097ªKÄ\u001cö¾\u008eù\u009fF\u00ad\u0093»×È%Özä\u009aõ\u001b\u0003D\u0011\u0085?ìL7ZphÀy\u000b\u0087i\u0095\u0094£ô°(Þ\u007fìÝý_\u000b\u0018\u0019ë'ö46B\u0081PÏa\u001c\u008f{\u009då«ò¸\"ÆÇÔÓå\u001có}\u0001ÿ/ô<HJ\u0095XÞi;wf\u0085õ\u0092O WÎ\u009eÜÂí7ûr\t½\u0016\u001a$Z2Õ@øQ5\u007fv\u008dÙ\u009a\u0016¨J¶ïÄ¿Õ{ã4ñÔAûPDb\u0091tÕ\u0007'\u0019x+\u0098:\u0019ÌFÞ\u0087ðî\u00835\u0095r§Â¶\tHkZ\u0096lö\u007f*\u0011}#ß2]Ä\u001aÖéèæû-\u008d\u009f\u009fÈ®\t@hR£d¹w9\t\u008a\u001bÝ*Q<nÎ³àôóF\u0085\u0096\u0097Û¦;¸dJ©]\boC\u0001Ù\u0013\u009e\"e4lÆ¥Ù\nëOý\u0083\u008f©\u009e'°tBÛU\u0004g\u001byº\u000bæ\u001a*,3>\u0080Ñ\fã\u0011õæ\u0087½\u0096%¨\u008cºÐM\u0001_`q³\u0003ò\u0012C$\u00806\u0099É\u001aÛq\u0094\u009a\u0085%·ð¡´ÒFÌ\u0019þùïx\u0019'\u000bæ%\u008fVT@\u0013r£ch\u009d\n\u008f÷¹\u0097ªKÄ\u001cö¾ç<\u0011{\u0003\u0088=\u008d.DXëJ²{{\u0095\u0018\u0087Ï±\u0097¢\\Ü¤Î©ÿqé\u0019\u001b\u009c5\u0097&hPöB±sOm\u0012\u009fß\u0088hºfÔìÆ ÷Eá\u0010\u0013Ã\fk>?(âZ\u0081KMe\u001a\u0097î\u0080:²z¬ÂÞ\u0089Ï\u0018ù\u0000ë¡\u0004j6\" ÓRÜCE}üo°\u0098u\u008a\u001a¤ÅÖ\u009dÇ5ñ¦ã\u00ad\u001cb\u000e\u00008ß*\u0084[/\u001fð\u000eO<\u009a*ÞY,Gsu\u0093d\u0012\u0092M\u0080\u008c®åÝ>ËyùÉè\u0002\u0016`\u0004\u009d2ý!!Ov}ÔlV\u009a\u0011\u0088â¶ú¥;Ó\u0090ÁØð\t\u001e&\f¿:æ)*W\u008fEÀt\u001fbg\u0090¯¾¼\u00adPÛ\u008dÉÓø%æc\u0014¾\u0003\u00151\f_\u0086MÐ|+j4\u0098©\u0087\u0001µ[£\u0099Ñ¢À)îx\u001cÐ\u000b\u000f9B'æUãD\"r}`Ü\u008f\u0015½N«©ÙùÈ2öÂäË\u0013\u0011\u0001i/º]üLCz\u0098hÛ\u0097\u0017\u0085`³ô¡²Ð\u0005þ\u0085ì\u0095\u0094\u009a\u0085%·ð¡´ÒFÌ\u0019þùïx\u0019'\u000bæ%\u008fVT@\u0013r£ch\u009d\n\u008f÷¹\u0097ªKÄ\u001cö¾ç<\u0011{\u0003\u0088=\u008c.QXùJà{h\u0095\t\u0087Ò±\u008a¢KÜ¤Î\u00adÿdé\u0018\u001bÝ5\u0082&-PåB\u00ads\u000em\u0012\u009fß\u0088`º'ÔìÆ·÷@á^\u0013Ú\fe>>(¶Z\u009bKAe\u001c\u0097«\u0080d²/¬ÀÞ\u008fÏVù\u0015ëä\u0004l65 ÛR\u0089CS}ûo¶$)5\u0096\u0007C\u0011\u0007bõ|ªNJ_Ë©\u0094»U\u0095<æçð Â\u0010ÓÛ-¹?D\t$\u001aøt¯F\rW\u008f¡È³;\u008d#\u009eâèIú\u0001ËÐ%ÿ7f\u0001?\u0012ólV~\u0019OÆY¾«v\u0085e\u0096\u0093àPò\u0014Ã½Ý°/a8Þ\n\u009bdLv\u0004GóQí£b¼ß\u008e\u009b\u0098@ê)û±Õ¨'\r0Ö\u0002\u009b\u001c~n!\u007fâI®[\u0019´\u008d\u0086\u0080\u0090vâ\"óõÍWß\u0014(Ó:´\u0014|f'wßA\u000fSK\u0094\u009a\u0085%·ð¡´ÒFÌ\u0019þùïx\u0019'\u000bæ%\u008fVT@\u0013r£ch\u009d\n\u008f÷¹\u0097ªKÄ\u001cö¾ç<\u0011{\u0003\u0088=\u0090.QXúJ²{c\u0095L\u0087Õ±\u008c¢@ÜåÎªÿué\r\u001bÅ5Ö& PãB§s\u000em\u0003\u009fÒ\u0088mº(ÔÿÆ·÷@á^\u0013Ñ\fl>((óZ\u009aK\u0002e\u001b\u0097¾\u0080e²(¬ÍÞ\u0092ÏQù\u001dëª\u0004>63 ÅR\u0091CF}äo§\u0098`\u008a\u0007¤ÏÖ\u0094Çlñçã¶\u001cv\u000eD8Í*\u0093[\"uùg²\u0090]\u0082\u000e¼Ñ\u00adjß`Éðû\u0083\u0014D\u0006X0Û!wS~Mâ\u007f\u008fhP\u009a\u0017´¼¥g×0Á\u008eó\u0094ìU\u001e¬\b²9p+7E\u0084w\u0091`\\\u0092î\u008cü½d¯\rÙÖË\u0086ä7\u0016 \u0000©1X#\u0014]ÙO\u0086x!jù\u0084©µ\n§FÑ\u0096Âkü#îú\u0018\u008d\tE;\u0016U Fop6bõ\u009cÄ\u008dW¿\u0004\u0098\u0001\u0089¾»k\u00ad/ÞÝÀ\u0082òbãã\u0015¼\u0007})\u0014ZÏL\u0088~8oó\u0091\u0091\u0083lµ\f¦ÐÈ\u0087ú%ë§\u001dà\u000f\u00131\t\"ÀTfF/w¡\u0099\u0092\u008bE½\u0006®ÊÐjÂ1óâå\u009e\u0017I9M*¹\\vN-\u007f\u0095a\u008f\u0093N\u0084·¶¿ØfÊiûÛí\u008a\u001fE\u0000ô\u0094\u009a\u0085%·ð¡´ÒFÌ\u0019þùïx\u0019'\u000bæ%\u008fVT@\u0013r£ch\u009d\n\u008f÷¹\u0097ªKÄ\u001cö¾ç<\u0011{\u0003\u0088=\u0080.XXáJ£{q\u0095\t\u0087Â±Ø¢XÜëÎ¼ÿ0é\u000e\u001bÙ5\u0082&-PáB sKm\u0004@\u0019Q¦csu7\u0006Å\u0018\u009a*z;ûÍ¤ßeñ\f\u0082×\u0094\u0090¦ ·ëI\u0089[tm\u0014~È\u0010\u009f\"=3¿Åø×\u000bé\u0013úÒ\u008cj\u009e*¯êA\u009bS@e\tvØ\bi\u001a:+³=\u0088ÏJá\u0001ò£\u0084d\u00969§Ù¹\u008aKZ\\în±\u0000r\u0012>#É5\u008eÇ\u0013Øýê°ü5\u008e\u0018\u009fÉ±\u0096C?Tæfùx\u0015\nEv\u0094\u0094\u009a\u0085%·ð¡´ÒFÌ\u0019þùïx\u0019'\u000bæ%\u008fVT@\u0013r£ch\u009d\n\u008f÷¹\u0097ªKÄ\u001cö¾ç<\u0011{\u0003\u0088=\u0081.XXëJ¡{t\u0095\u0005\u0087È±\u009f¢\u0012Ü÷Îªÿyé\t\u001b×5\u008f&hPìB»sZm\t\u009fÜ\u0088eº%ÔùÆ¦÷Má\u0011\u0013Þ\f*>f(¶\u00ad`¼ß\u008e\n\u0098Në¼õãÇ\u0003Ö\u0082 Ý2\u001c\u001cuo®yéKYZ\u0092¤ð¶\r\u0080m\u0093±ýæÏDÞÆ(\u0081:r\u0004O\u0017¯a\u0018sVB\u0085¬â¾\u001f\u0088m\u009b¦å\u0018÷MÆ\u008dÐå\"4\fm\u001fÆi\u0011{AJºTß¦8±\u0095\u0083Ùí\u0012ÿ\\Î·Øë*$5Ð\u0007\u009cÕ\u0005Ä£örà1\u0093Ê\u008d\u008d¿^®éX\u008cJ\u007fd\b\u0017\u0084\u0001Ó3h\"ñÜ¿Î~ø\u0005ëÞ\u0085\u0081·\"¦ñP¼BK|FoÓ\u0019b\u000b!:ýÔ\u0083Æ\u0002ð\tãÆ\u009dd\u008f;¾à¨\u008bZ\u0018t\u001bg¿\u0011&\u0003>2Å,\u0090Þ\u001eÉéû®\u0095p\u00879¶× \u009fRP\u0094\u0081\u0085'·ö¡µÒNÌ\tþÚïm\u0019\b\u000bû%\u008cV\u0000@Wrìcl\u009d7\u008fð¹ÄªQÄ\u0013ö©çi\u0011$\u0003Ú=\u0087.ZXíJ¥{:\u0095\u000f\u0087Ê±\u0097¢AÜáÎþÿué\u0004\u001bÓ5\u0083&/PêBøs\u000em\u0014\u009fÈ\u0088uº/ÔöÆµ÷\u0004á\n\u0013ß\f*>)(åZ\u008dK\u0002e=\u0097£\u0080m²?¬ÈÞ\u008fÏYù\u0006ë¡\u0004R69 ÌR\u0099CU}ño¡\u0098x\u008a\u000b¤êÖ\u0095Ç.ñÔã\u00ad\u001c|\u000e\n8Û*\u0082\u0094\u0081\u0085'·ö¡µÒNÌ\tþÚïm\u0019\b\u000bû%\u008cV\u0000@WrìcO\u009d5\u008fÿ¹\u0081ªZÄ\u0019ö«çh\u00113\u0003ä=\u008b.RXëJ£{c\u0095\u000f\u0087Ê±\u009d¢xÜëÎ¼ÿBé\u001f\u001bÒ5\u0098&-PðBôsMm\u0001\u009fÔ\u0088bº)ÔìÆò÷Fá\u001b\u0013\u0090\f\u007f>/(óZ\u008cK\u000eeT\u0097¨\u0080a²6¬ÀÞ\u0084ÏYù\u0011ë¯\u0004>6% ÙR\u0095CX}ïoâ\u0098P\u008a\u000b¤ÌÖ\u009bÇ5ñãã¼\u001c^\u000e\r8Ø*\u0095[)uågµ\u0090D\u0082\u0007¼þ\u00adaß\"ÉÈû\u0099\u0014H\u0006\u00160×!v¥A´ç\u00866\u0090uã\u008eýÉÏ\u001aÞ\u00ad(È:;\u0014LgÀq\u0097C,R¬¬÷¾0\u0088\u0004\u009b\u0091õÓÇiÖ© ä2\u001a\fG\u001f\u009ai-{eJú¤Ï¶\n\u0080W\u0093\u0081í!ÿ>ÎµØÄ*\u0013\u0004C\u0017ïa*s4B\u008c\\Õ®\u000e¹ì\u008bÏå5÷\u007fÆ\u0081ÐÚ\"\u0019=«\u000fè\u00193kdz\u008bTÒ¦k±£\u0083ã\u009d\u000fïJþ\u009dÈøÚk5¼\u0007Â\u0011\u001fcRr\u0098L-^p©ô»À\u0095\u000fç\u001aöíÀ*Òt-½?Ó\t\u001b\u001bTj¦D|Vp¡\u0089³Î\u008d\u0018\u009c¬îáø9ÊG%Æ7Í\u0001\u0001\u0010\u00adbð|7N\nY¸«Ó\u0085d\u0094£æíð\u000bÂDÝ¶/%9`\b½\u001añt\u001dF]Q\u009c£/½V\u008c¹\u009eÊè0úAÕà'.1\u007f\u0000\u009e\u0094\u0080\u0085!·ï¡¥ÒOÌ\u000fþÂïB\u0019-\u000bö%½VC@\u0012r©cb\u009d-\u008fþ¹\u008dªPÄ\u0017öêç1\u0011v\u0003Æ=\u0087.CX®J²{\u007f\u0095\u001d\u0087Ó±\u009d¢AÜðÎþÿ=éJ\u001bÈ5\u008f&8PçBôs\u0014m@\u009f\u009f\u0088\u007fºfÔµÆò÷Pá\f\u0013Ù\fm>;(óZ\u009aK\u0002eN\u0097î\u0080%²)êæûGÉ\u0089ßÃ¬)²i\u0080¤\u0091$gKu\u0090[Û(%>t\fÏ\u001d\u0004ãKñ\u0098ÇëÔ6ºq\u0088\u008c\u0099Wo\u0010}¤CëP0&È4Ï\u0005\u000fë*ù¯ÏðÜt¢\u0085°×\u0081\u001f\u0097be½K°X\u0014.Ä<Ç\r8\u0013bá½ö\u001eÄIª\u0090¸Ó\u0089b\u009fom·r\u0005@NV\u0099$à5#\u001b2éÂþ\tÌ^Òê ñ±+\u0087q\u0095×z\u001d\u0094\u0080\u0085!·ï¡¥ÒOÌ\u000fþÂïB\u0019-\u000bö%½VC@\u0012r©cb\u009d-\u008fþ¹\u008dªPÄ\u0017öêç1\u0011v\u0003Æ=\u008d.\u0014XäJ¯{x\u0095L\u0087É±\u0096¢\u0012ÜãÎ±ÿyé\u0004\u001bÛ5Ö&rP¢B¡s^m\u0004\u009fÛ\u0088xº/ÔöÆµ÷\u0004á\r\u0013Ó\fb>9(òZ\u009dKNe\u0011\u0097ª\u0080 ²0¬ÃÞ\u0084Ï\u0018ù\u0003ë±\u0004{6% Ï\u0094\u0080\u0085!·ï¡¥ÒOÌ\u000fþÂïB\u0019-\u000bö%½VC@\u0012r©cb\u009d-\u008fþ¹\u008dªPÄ\u0017öêç1\u0011v\u0003Í=\u009a.DXçJ²{\u007f\u0095\b\u0087\u0086±\u0092¢]ÜæÎþÿué\u0004\u001bß5\u0099&=PìB sKm\u0012\u009fß\u0088hºfÔµÆò÷Wá\n\u0013Ñ\fx>((¶Z\u008cKCe\u0000\u0097«\u0080 ²-¬ÍÞ\u0095Ï\u0018ùWë·\u000426p ØR\u0099CE}üo\u00ad\u0098f\u008a\u0007¤ÎÖ\u009dÇlñïã¬\u0094\u0080\u0085!·ï¡¥ÒOÌ\u000fþÂïB\u0019-\u000bö%½VC@\u0012r©cb\u009d-\u008fþ¹\u008dªPÄ\u0017öêç1\u0011v\u0003Æ=\u008d.\u0014XäJ¯{x\u0095L\u0087Õ±\u009b¢ZÜáÎºÿeé\u0006\u001bÙ5\u0092&hP¸Bôs]m\u0003\u009fÒ\u0088iº\"ÔíÆ¾÷Má\u0010\u0013×\f*>2(óZ\u009fK\u0002e\u001e\u0097¡\u0080b÷\\æýÔ3Ây±\u0093¯Ó\u009d\u001e\u008c\u009ezñh*Fa5\u009f#Î\u0011u\u0000¾þñì\"ÚQÉ\u008c§Ë\u00956\u0084írª`\u001a^[M\u009f;r)v\u0018©öÒäZÒWÁ\u008d¿0\u00adg\u009c¨\u008aÃx\fVOEð3~!i\u0010\u0086\u000e\u009c»vª×\u0098\u0019\u008eSý¹ãùÑ4À´6Û$\u0000\nKyµoä]_L\u0094²Û \b\u0096{\u0085¦ëáÙ\u001cÈÇ>\u0080,*\u0012|\u0001§wXeET\u008fºò¨5\u009ej\u008d±ó\u001eáMÐ\u0082Æ¼4 \u001ao\tÜ\u007fTmJ\\¹Bå°l§\u0098\u0095Õû\u000béJØòÎý<6#\u0098\u0011Ë\u0007\u0014u{d°J¢¸\u0015¯Ö\u009dÂ\u0083?ñgàîÖîÄ]+\u008a\u0019\u0086\u000f/}il¨R\u001b@P·\u0097¥ô\u008b3ùhè\u009aÞ\u0011ÌZ3Ä\u001du\fÔ>\u001a(P[ºEúw7f·\u0090Ø\u0082\u0003¬Hß¶Éçû\\ê\u0097\u0014Ø\u0006\u000b0x#¥Mâ\u007f\u001fnÄ\u0098\u0083\u008a)´\u007f§¤Ñ[ÃFò\u008c\u001cñ\u000e68i+²U\u001dGNv\u0081`¿\u0092#¼l¯ßÙWËIúºäæ\u0016o\u0001\u00973Ü]\u0019O\u0007~³hî\u009a \u0085\u0091·\u0089¡\u0016ÓmÂ³ìà\u001eO\t\u0090;Ë>\u0090/1\u001dÿ\u000bµx_f\u001fTÒEK³1¡ì\u008f\u009büTê\u001fØ°É\u007f7&%å\u0013Ô\u0000\u0003n@\\¨Mi»7©Í\u0097\u0097\u0084Wòêà\u009aÑe?\u001e-å\u001b\u008b\bJvñdªUuC\u0016±Å\u009f\u0088\u008c?ú²èþ\u0094\u0091\u0085%·ð¡¾ÒEÌ\bþ\u0096ïe\u0019'\u000bæ%\u0089VE@Zr¦ci\u009d:\u008f²¹\u0093ªWÄ\u0004ö¢ç<\u00117\u0003\u0088=\u0087.LXëJ£{o\u0095\u0018\u0087Ï±\u0097¢\\Ü¤Îºÿué\u0006\u001bÝ5\u008f&hPìB»sZm@\u009fÉ\u0088iº2\u0094\u0094\u0085(·ë¡£ÒBÌ3þÆïm\u00190\u000bõ%\u009aVI@\u0015r¢cuÉÛØfê±üù\u008f\u000b\u0091c£\u008c²&DiVªxÁ\u000b8\u001dU/õ><À}Ò¶äÝ÷\u0011\u0099j«òº9L\u007f^\u0087`Ûs\r\u0005\u00ad\u0017ä&7ÈiÚ\u0082ìõÿ\u0017\u0081§\u0093ú¢=\u0094\u0094\u00856·°¡±ÒDÌ\bþÓïd\u0019-\u000bä%ÀVA@\u0014r¸cc\u009d4\u008fý¹\u0094ªVÄ\u0013ö¯çp\u0011?\u0003Ê=\u0090.UXüJ¹{E\u0095\u001f\u0087Î±\u0099¢@ÜáÎºÿOé\u001a\u001bÎ5\u0093&.PçB¦sKm\u000e\u009fÙ\u0088iº5\u0094\u0082\u00856·ñ¡³ÒOÌ\u000fþÅïa\u0019,\u000bó%¡VN@=r£co\u009d6\u008fõc7r\u0084@JV\u0001%î;©\tV\u0018Êî\u009düGÒ;¡ã·¹\u0085\u0015\u0094Øj\u008fxmN:]É3¯\u0001\u0013\u0010Âæ\u0081ô8Ê\u007fÙ¤".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 3137);
        f22780o = cArr;
        f22776k = 1975146888913454404L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x053a: INVOKE (r1 I:o.bg.b) = (r9 I:o.bg.c) VIRTUAL call: o.bg.c.e():o.bg.b A[MD:():o.bg.b (m)], block:B:231:0x053a */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0559: INVOKE (r0 I:o.bg.b) = (r9 I:o.bg.c) VIRTUAL call: o.bg.c.e():o.bg.b A[MD:():o.bg.b (m)], block:B:240:0x0559 */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0286 A[Catch: f -> 0x04f3, all -> 0x0558, TryCatch #0 {f -> 0x04f3, blocks: (B:127:0x002e, B:130:0x0042, B:131:0x0069, B:133:0x006f, B:135:0x0075, B:137:0x00b4, B:142:0x00c9, B:144:0x00d5, B:146:0x00e4, B:148:0x00ea, B:149:0x0123, B:151:0x0131, B:153:0x0139, B:157:0x0150, B:158:0x0177, B:162:0x0198, B:180:0x0247, B:181:0x0280, B:183:0x0286, B:184:0x02ab, B:185:0x02b6, B:190:0x02fc, B:191:0x0302, B:192:0x0303, B:194:0x030a, B:195:0x0336, B:196:0x0341, B:201:0x0352, B:202:0x0355, B:203:0x0356, B:205:0x035c, B:206:0x0380, B:208:0x0388, B:210:0x03bb, B:211:0x03bd, B:224:0x04eb, B:225:0x04ef, B:212:0x03ca, B:214:0x03d8, B:216:0x03de, B:217:0x0452, B:218:0x0462, B:220:0x046c, B:222:0x0472, B:223:0x04b7, B:165:0x01a2, B:168:0x01b4, B:170:0x01ba, B:173:0x0201, B:175:0x020b, B:177:0x0211, B:178:0x0238, B:179:0x023b, B:156:0x014a), top: B:244:0x002e, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context, long] */
    /* JADX WARN: Type inference failed for: r9v0, types: [o.bg.c] */
    /* JADX WARN: Type inference failed for: r9v1, types: [o.bg.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(android.content.Context r20, o.bg.c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dc.d.c(android.content.Context, o.bg.c):void");
    }

    public static boolean c(o.bg.c cVar) {
        int i2 = 2 % 2;
        o.bg.a aVarC = cVar.c();
        if (aVarC != null) {
            if (aVarC == o.bg.a.f21046o || aVarC == o.bg.a.f21043l) {
                return true;
            }
            int i3 = f22778m + 117;
            f22777l = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 66 / 0;
                if (aVarC == o.bg.a.f21045n) {
                    return true;
                }
            } else if (aVarC == o.bg.a.f21045n) {
                return true;
            }
            if (aVarC == o.bg.a.aa || aVarC == o.bg.a.ag) {
                return true;
            }
            int i5 = f22778m + 85;
            f22777l = i5 % 128;
            if (i5 % 2 != 0) {
                o.bg.a aVar = o.bg.a.ae;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (aVarC == o.bg.a.ae || aVarC == o.bg.a.ah || aVarC == o.bg.a.f21047p) {
                return true;
            }
            int i6 = f22777l + 57;
            f22778m = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 64 / 0;
                if (aVarC == o.bg.a.f21044m) {
                    return true;
                }
            } else if (aVarC == o.bg.a.f21044m) {
                return true;
            }
            if (aVarC == o.bg.a.aj) {
                return true;
            }
            int i8 = f22777l + 89;
            f22778m = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 85 / 0;
                if (aVarC == o.bg.a.al) {
                    return true;
                }
            } else if (aVarC == o.bg.a.al) {
                return true;
            }
        }
        int i10 = f22778m + 27;
        f22777l = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 66 / 0;
        }
        return false;
    }

    private synchronized void d(Context context) {
        int i2 = 2 % 2;
        int i3 = f22777l + 27;
        f22778m = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            p((char) ExpandableListView.getPackedPositionGroup(0L), (-1) - ImageFormat.getBitsPerPixel(0), 16 - TextUtils.getOffsetBefore("", 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 2996 - View.MeasureSpec.getMode(0), 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f22778m + 45;
            f22777l = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        }
        Object obj = null;
        if (this.f22782a.e(context) != null) {
            int i7 = f22778m + 95;
            f22777l = i7 % 128;
            if (i7 % 2 != 0) {
                e(context);
                obj.hashCode();
                throw null;
            }
            e(context);
        }
        this.f22785e = null;
        this.f22783b = null;
        this.f22788h = null;
        this.f22784c.d(context);
    }

    private void e(Context context) {
        int i2 = 2 % 2;
        new o.dd.a();
        new Date().getTime();
        o.dd.a.c(context);
        new o.dd.d();
        new Date().getTime();
        o.dd.d.a(context);
        this.f22782a.c(context);
        int i3 = f22778m + 39;
        f22777l = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private void e(Context context, c cVar) throws Throwable {
        int i2 = 2 % 2;
        this.f22784c.a(context);
        Date dateC = cVar.c();
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(13, 10);
        if (dateC.before(calendar.getTime()) && cVar.d() != g.f22867l) {
            int i3 = f22777l + 35;
            f22778m = i3 % 128;
            int i4 = i3 % 2;
            if (cVar.b()) {
                if (o.ea.f.a()) {
                    int i5 = f22777l + 7;
                    f22778m = i5 % 128;
                    int i6 = i5 % 2;
                    Object[] objArr = new Object[1];
                    p((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ViewConfiguration.getTapTimeout() >> 16, 16 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    p((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (Process.myTid() >> 22) + 2076, (ViewConfiguration.getFadingEdgeLength() >> 16) + 84, objArr2);
                    o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
                }
                new o.dd.d();
                if (o.dd.d.d(context, cVar, String.valueOf(new Date().getTime()))) {
                    int i7 = f22777l + 91;
                    f22778m = i7 % 128;
                    int i8 = i7 % 2;
                    this.f22782a.a(context, cVar);
                    return;
                }
                if (o.ea.f.a()) {
                    Object[] objArr3 = new Object[1];
                    p((char) (TextUtils.lastIndexOf("", '0') + 1), ViewConfiguration.getScrollBarFadeDuration() >> 16, 16 - TextUtils.getCapsMode("", 0, 0), objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    p((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 2160, 98 - Color.green(0), objArr4);
                    o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
                }
            } else if (o.ea.f.a()) {
                Object[] objArr5 = new Object[1];
                p((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), Color.green(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 17, objArr5);
                String strIntern3 = ((String) objArr5[0]).intern();
                Object[] objArr6 = new Object[1];
                p((char) (12736 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2258, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 126, objArr6);
                o.ea.f.c(strIntern3, ((String) objArr6[0]).intern());
            }
        }
        new o.dd.a();
        o.dd.a.d(context, cVar, String.valueOf(new Date().getTime()));
        this.f22782a.a(context, cVar);
    }

    static void init$0() {
        $$a = new byte[]{106, -29, 108, MessagePack.Code.MAP32};
        $$b = 237;
    }

    private static void p(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $10 + 37;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f22780o[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 742, (char) TextUtils.indexOf("", "", 0), 11 - Process.getGidForName(""), 632508977, false, $$c(b2, b3, (byte) ((b3 + 6) - (6 & b3))), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f22776k), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(TextUtils.indexOf("", "", 0) + 766, (char) (12470 - View.MeasureSpec.getMode(0)), TextUtils.lastIndexOf("", '0', 0, 0) + 13, 1946853218, false, $$c(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(388 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, 39570797, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
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
            int i8 = $11 + 41;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = o.d.d.a(-723636472);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a(387 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 18 - View.combineMeasuredStates(0, 0), 39570797, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                throw null;
            }
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr6 = {oVar, oVar};
            Object objA5 = o.d.d.a(-723636472);
            if (objA5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objA5 = o.d.d.a(387 - TextUtils.getOffsetAfter("", 0), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 18 - (ViewConfiguration.getEdgeSlop() >> 16), 39570797, false, $$c(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7 A[Catch: all -> 0x0130, LOOP:0: B:62:0x00b1->B:64:0x00b7, LOOP_END, TryCatch #0 {, blocks: (B:50:0x0004, B:52:0x0013, B:60:0x0025, B:61:0x0071, B:62:0x00b1, B:64:0x00b7, B:65:0x00cb, B:67:0x00d1, B:69:0x00dc, B:71:0x00e2, B:74:0x011f, B:75:0x0127, B:78:0x012d, B:57:0x001e, B:58:0x001f, B:76:0x012b, B:53:0x0019), top: B:84:0x0004, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1 A[Catch: all -> 0x0130, TryCatch #0 {, blocks: (B:50:0x0004, B:52:0x0013, B:60:0x0025, B:61:0x0071, B:62:0x00b1, B:64:0x00b7, B:65:0x00cb, B:67:0x00d1, B:69:0x00dc, B:71:0x00e2, B:74:0x011f, B:75:0x0127, B:78:0x012d, B:57:0x001e, B:58:0x001f, B:76:0x012b, B:53:0x0019), top: B:84:0x0004, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(android.content.Context r18, o.bg.c r19, o.by.g r20) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dc.d.b(android.content.Context, o.bg.c, o.by.g):void");
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x02ff: INVOKE (r4v1 ?? I:o.dc.d), (r5 I:android.content.Context) DIRECT call: o.dc.d.d(android.content.Context):void A[Catch: all -> 0x0304, MD:(android.content.Context):void (m), TRY_LEAVE], block:B:158:0x02ff */
    public final synchronized void b(Context context, o.dd.e eVar, boolean z2) {
        Context contextD;
        boolean z3;
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        p((char) Color.argb(0, 0, 0, 0), View.resolveSize(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 16, objArr);
        String strIntern = ((String) objArr[0]).intern();
        try {
            if (o.ea.f.a()) {
                Locale localeD = o.ea.g.d();
                Object[] objArr2 = new Object[1];
                p((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 2384 - (Process.myTid() >> 22), 60 - ExpandableListView.getPackedPositionChild(0L), objArr2);
                o.ea.f.c(strIntern, String.format(localeD, ((String) objArr2[0]).intern(), eVar.a(), eVar.e()));
            }
            o.en.b bVarC = o.en.b.c();
            if (this.f22785e != null) {
                int i3 = f22778m + 47;
                f22777l = i3 % 128;
                int i4 = i3 % 2;
                if (o.ea.f.a()) {
                    Object[] objArr3 = new Object[1];
                    p((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 32358), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2445, TextUtils.indexOf("", "") + 67, objArr3);
                    o.ea.f.c(strIntern, ((String) objArr3[0]).intern());
                }
                o.dd.e eVar2 = this.f22783b;
                if (eVar2 == null) {
                    this.f22783b = eVar;
                    return;
                } else {
                    this.f22783b = a(context, eVar2, eVar, bVarC);
                    return;
                }
            }
            if (o.ea.f.a()) {
                Object[] objArr4 = new Object[1];
                p((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2511 - Process.getGidForName(""), ImageFormat.getBitsPerPixel(0) + 70, objArr4);
                o.ea.f.c(strIntern, ((String) objArr4[0]).intern());
            }
            o.de.d dVarC = this.f22784c.c(context);
            long jC = h.c(context, bVarC, eVar.e());
            c cVarE = this.f22782a.e(context);
            if (jC <= -1) {
                return;
            }
            c cVar = new c(new Date(System.currentTimeMillis() + (jC * 1000)), eVar.a(), dVarC, eVar.e(), z2);
            if (cVarE == null || !cVarE.c().before(new Date())) {
                z3 = false;
            } else {
                int i5 = f22778m + 109;
                f22777l = i5 % 128;
                int i6 = i5 % 2;
                if (o.ea.f.a()) {
                    Locale localeD2 = o.ea.g.d();
                    Object[] objArr5 = new Object[1];
                    p((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2581 - TextUtils.indexOf("", ""), 80 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr5);
                    o.ea.f.c(strIntern, String.format(localeD2, ((String) objArr5[0]).intern(), cVarE.c()));
                }
                e(context);
                cVarE.c(new Date());
                z3 = true;
            }
            if (cVarE == null) {
                if (o.ea.f.a()) {
                    Object[] objArr6 = new Object[1];
                    p((char) KeyEvent.keyCodeFromString(""), 2661 - KeyEvent.keyCodeFromString(""), 60 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr6);
                    o.ea.f.c(strIntern, ((String) objArr6[0]).intern());
                    int i7 = 2 % 2;
                }
                if (o.ea.f.a()) {
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr7 = new Object[1];
                    p((char) (25564 - KeyEvent.getDeadChar(0, 0)), TextUtils.indexOf((CharSequence) "", '0') + 2722, Process.getGidForName("") + 45, objArr7);
                    o.ea.f.c(strIntern, sb.append(((String) objArr7[0]).intern()).append(cVar.c().toString()).toString());
                }
                e(context, cVar);
                return;
            }
            if (!cVarE.d(cVar) && !z3) {
                if (o.ea.f.a()) {
                    int i8 = f22777l + 5;
                    f22778m = i8 % 128;
                    int i9 = i8 % 2;
                    Object[] objArr8 = new Object[1];
                    p((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 35318), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2845, TextUtils.indexOf((CharSequence) "", '0') + 62, objArr8);
                    o.ea.f.c(strIntern, ((String) objArr8[0]).intern());
                    int i10 = 2 % 2;
                }
                return;
            }
            if (o.ea.f.a()) {
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr9 = new Object[1];
                p((char) (12278 - (Process.myTid() >> 22)), 2766 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 81 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr9);
                o.ea.f.c(strIntern, sb2.append(((String) objArr9[0]).intern()).append(cVarE.c().toString()).toString());
            }
            e(context, cVarE);
            int i11 = f22777l + 23;
            f22778m = i11 % 128;
            int i12 = i11 % 2;
        } catch (f e2) {
            if (o.ea.f.a()) {
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr10 = new Object[1];
                p((char) (TextUtils.getCapsMode("", 0, 0) + 43536), 2907 - TextUtils.indexOf("", "", 0, 0), 'Z' - AndroidCharacter.getMirror('0'), objArr10);
                o.ea.f.c(strIntern, sb3.append(((String) objArr10[0]).intern()).append(e2.getMessage()).toString());
                int i13 = 2 % 2;
            }
            d(contextD);
        }
    }

    public final synchronized void c(Context context, a aVar, g gVar) {
        int i2 = 2 % 2;
        int i3 = f22778m + 93;
        f22777l = i3 % 128;
        if (i3 % 2 != 0) {
            o.ea.f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            p((char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf("", "", 0), 16 - View.resolveSize(0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 428 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 10, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i4 = f22777l + 95;
            f22778m = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        c cVarE = this.f22782a.e(context);
        this.f22785e = cVarE;
        if (cVarE == null) {
            if (o.ea.f.a()) {
                int i7 = f22777l + 39;
                f22778m = i7 % 128;
                int i8 = i7 % 2;
                Object[] objArr3 = new Object[1];
                p((char) View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.keyCodeFromString(""), Color.red(0) + 16, objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                p((char) (53994 - TextUtils.getTrimmedLength("")), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 439, 44 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr4);
                o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
                int i9 = f22778m + 71;
                f22777l = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 4 / 2;
                } else {
                    int i11 = 2 % 2;
                }
            }
            this.f22785e = new c(new Date(), aVar, this.f22784c.c(context), gVar, false);
            this.f22784c.e(context);
            int i12 = f22778m + 45;
            f22777l = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
        }
        this.f22782a.c(context);
    }

    public final boolean c(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22778m + 25;
        f22777l = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f22778m + 117;
            f22777l = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            p((char) Color.red(0), ViewConfiguration.getKeyRepeatDelay() >> 16, 15 - ExpandableListView.getPackedPositionChild(0L), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23881), 3011 - Color.alpha(0), View.MeasureSpec.getSize(0) + 36, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (this.f22789i == null) {
            Object[] objArr3 = new Object[1];
            p((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 3047 - View.MeasureSpec.makeMeasureSpec(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 47, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Class<?> cls = Class.forName(Xg.qd("bpgvtok6lyy\u0001r|\u0004>T\u0002\u0002\tz\u000f\f", (short) (ZN.Xd() ^ 4579), (short) (ZN.Xd() ^ 9029)));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (C1633zX.Xd() ^ (-3319));
            short sXd2 = (short) (C1633zX.Xd() ^ (-8900));
            int[] iArr = new int["\u007fsp\u00048\u0016r(*P\u001d*L'O5".length()];
            QB qb = new QB("\u007fsp\u00048\u0016r(*P\u001d*L'O5");
            int i7 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i7] = xuXd.fK(xuXd.CK(iKK) - ((i7 * sXd2) ^ sXd));
                i7++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i7));
            clsArr[1] = Integer.TYPE;
            Object[] objArr4 = {strIntern2, 0};
            Method method = cls.getMethod(ZO.xd("@K^lWO\u001b\u000f\u000f\u001c\u0018/:lM4\u0003Y4\u0012", (short) (C1499aX.Xd() ^ (-31113)), (short) (C1499aX.Xd() ^ (-32026))), clsArr);
            try {
                method.setAccessible(true);
                SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr4);
                Object[] objArr5 = new Object[1];
                p((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0', 0, 0) + 3095, 17 - Gravity.getAbsoluteGravity(0, 0), objArr5);
                this.f22789i = new AtomicBoolean(sharedPreferences.getBoolean(((String) objArr5[0]).intern(), false));
                int i8 = f22778m + 121;
                f22777l = i8 % 128;
                int i9 = i8 % 2;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return this.f22789i.get();
    }

    public final synchronized void d() throws b {
        int i2 = 2 % 2;
        int i3 = f22777l + 37;
        f22778m = i3 % 128;
        if (i3 % 2 == 0) {
            o.ea.f.a();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            p((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ViewConfiguration.getScrollBarFadeDuration() >> 16, '@' - AndroidCharacter.getMirror('0'), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p((char) ExpandableListView.getPackedPositionType(0L), 16 - (ViewConfiguration.getPressedStateDuration() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 26, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (this.f22787g) {
            int i4 = f22778m + 123;
            f22777l = i4 % 128;
            if (i4 % 2 != 0) {
                o.ea.f.a();
                throw null;
            }
            if (o.ea.f.a()) {
                Object[] objArr3 = new Object[1];
                p((char) ((-1) - TextUtils.lastIndexOf("", '0')), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 16 - TextUtils.getCapsMode("", 0, 0), objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                p((char) (ImageFormat.getBitsPerPixel(0) + 2521), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 185, View.resolveSizeAndState(0, 0, 0) + 100, objArr4);
                o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
            }
            b.d dVar = b.d.f22766a;
            Object[] objArr5 = new Object[1];
            p((char) (ViewConfiguration.getLongPressTimeout() >> 16), 285 - TextUtils.getTrimmedLength(""), 62 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr5);
            throw new b(dVar, ((String) objArr5[0]).intern());
        }
        if (o.ea.f.a()) {
            Object[] objArr6 = new Object[1];
            p((char) View.MeasureSpec.getMode(0), ViewConfiguration.getJumpTapTimeout() >> 16, View.combineMeasuredStates(0, 0) + 16, objArr6);
            String strIntern3 = ((String) objArr6[0]).intern();
            Object[] objArr7 = new Object[1];
            p((char) (60585 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 347 - Color.red(0), Color.red(0) + 58, objArr7);
            o.ea.f.c(strIntern3, ((String) objArr7[0]).intern());
            int i5 = 2 % 2;
        }
        this.f22787g = true;
    }

    public final void e(Context context, boolean z2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22778m + 43;
        f22777l = i3 % 128;
        if (i3 % 2 != 0) {
            o.ea.f.a();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            p((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), TextUtils.lastIndexOf("", '0') + 1, 16 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            p((char) (63408 - KeyEvent.keyCodeFromString("")), MotionEvent.axisFromString("") + 3112, Drawable.resolveOpacity(0, 0) + 26, objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(z2).toString());
        }
        Object[] objArr3 = new Object[1];
        p((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3046, View.resolveSizeAndState(0, 0, 0) + 47, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Class<?> cls = Class.forName(C1626yg.Ud("\u007f%ckf`\u001bB\u0005N'|A0S\u0012&8T\u001a\f04", (short) (C1633zX.Xd() ^ (-18850)), (short) (C1633zX.Xd() ^ (-15540))));
        Class<?>[] clsArr = {Class.forName(Ig.wd("Z\u0002\u0013[u_~)_\b5.]P\bX", (short) (Od.Xd() ^ (-9205)))), Integer.TYPE};
        Object[] objArr4 = {strIntern2, 0};
        short sXd = (short) (OY.Xd() ^ 19733);
        int[] iArr = new int["S!BA7\\?K\u0016OqD\u0015\u0010\u0003U4\rX\u0011".length()];
        QB qb = new QB("S!BA7\\?K\u0016OqD\u0015\u0010\u0003U4\rX\u0011");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd + sXd) + i4)) + xuXd.CK(iKK));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(context, objArr4)).edit();
            Object[] objArr5 = new Object[1];
            p((char) (TextUtils.lastIndexOf("", '0', 0) + 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3094, 17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr5);
            editorEdit.putBoolean(((String) objArr5[0]).intern(), z2).apply();
            AtomicBoolean atomicBoolean = this.f22789i;
            if (atomicBoolean == null) {
                this.f22789i = new AtomicBoolean(z2);
                return;
            }
            atomicBoolean.set(z2);
            int i5 = f22777l + 115;
            f22778m = i5 % 128;
            int i6 = i5 % 2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 35, insn: 0x0a6a: INVOKE (r0 I:o.bg.b) = (r35 I:o.bg.c) VIRTUAL call: o.bg.c.e():o.bg.b A[Catch: all -> 0x0b0a, MD:():o.bg.b (m), TRY_ENTER], block:B:597:0x0a6a */
    /* JADX WARN: Removed duplicated region for block: B:510:0x07c2 A[Catch: all -> 0x0b0a, TRY_LEAVE, TryCatch #4 {, blocks: (B:321:0x0007, B:562:0x0979, B:564:0x0983, B:566:0x098b, B:568:0x0991, B:570:0x0997, B:571:0x09ca, B:332:0x008d, B:337:0x00cf, B:339:0x00d9, B:341:0x00eb, B:343:0x00f1, B:345:0x00f7, B:346:0x012a, B:546:0x08d8, B:548:0x08e2, B:550:0x08f4, B:552:0x08fa, B:554:0x0900, B:555:0x0933, B:583:0x0a0e, B:585:0x0a18, B:587:0x0a20, B:589:0x0a26, B:591:0x0a2c, B:592:0x0a5f, B:428:0x0518, B:439:0x057f, B:441:0x0589, B:443:0x0591, B:445:0x0597, B:447:0x059d, B:449:0x05a9, B:452:0x05e1, B:453:0x05e2, B:454:0x0615, B:461:0x0628, B:463:0x0632, B:465:0x063a, B:467:0x0640, B:469:0x0646, B:470:0x067b, B:478:0x06d3, B:480:0x06dd, B:482:0x06ef, B:484:0x06f5, B:486:0x06fb, B:487:0x072e, B:496:0x0787, B:498:0x0791, B:500:0x079d, B:501:0x07a4, B:504:0x07ad, B:506:0x07b0, B:508:0x07b6, B:510:0x07c2, B:518:0x07d5, B:519:0x0808, B:515:0x07ce, B:516:0x07cf, B:389:0x0367, B:527:0x0847, B:532:0x085b, B:534:0x0861, B:536:0x0867, B:537:0x089c, B:530:0x0853, B:597:0x0a6a, B:599:0x0a74, B:601:0x0a7e, B:603:0x0a84, B:605:0x0a8a, B:607:0x0a96, B:610:0x0ace, B:612:0x0ad7, B:611:0x0acf, B:613:0x0b09, B:450:0x05de, B:322:0x003a, B:324:0x004a, B:326:0x0073, B:327:0x0076, B:558:0x093c, B:560:0x0942, B:561:0x0976, B:330:0x0081, B:333:0x0097, B:335:0x009d, B:336:0x00c2, B:349:0x0133, B:543:0x08a9, B:545:0x08af, B:352:0x0139, B:354:0x0151, B:357:0x015d, B:359:0x017c, B:361:0x018c, B:363:0x0192, B:364:0x01bb, B:365:0x01d4, B:367:0x01e0, B:368:0x021f, B:579:0x09d8, B:581:0x09de, B:582:0x0a0b, B:391:0x036c, B:393:0x0376, B:395:0x037c, B:396:0x03aa, B:398:0x03bc, B:401:0x03e2, B:402:0x03e4, B:404:0x0424, B:406:0x042a, B:407:0x0453, B:409:0x045f, B:413:0x047c, B:414:0x0480, B:416:0x04b4, B:418:0x04bf, B:420:0x04c5, B:421:0x04ef, B:427:0x0514, B:433:0x052a, B:435:0x0530, B:437:0x0536, B:438:0x057c, B:431:0x0525, B:432:0x0529, B:460:0x0623, B:474:0x0685, B:476:0x068b, B:477:0x06d0, B:492:0x073a, B:494:0x0740, B:495:0x0784, B:370:0x0224, B:372:0x022a, B:373:0x0251, B:375:0x0270, B:377:0x0276, B:378:0x02b6, B:380:0x02ca, B:382:0x02fe, B:383:0x0300, B:385:0x0321, B:387:0x0327, B:523:0x0812, B:525:0x0818, B:526:0x0841, B:502:0x07ab, B:608:0x0acb, B:511:0x07c9), top: B:622:0x0007, inners: #0, #3, #5, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:516:0x07cf A[Catch: all -> 0x0b0a, TryCatch #4 {, blocks: (B:321:0x0007, B:562:0x0979, B:564:0x0983, B:566:0x098b, B:568:0x0991, B:570:0x0997, B:571:0x09ca, B:332:0x008d, B:337:0x00cf, B:339:0x00d9, B:341:0x00eb, B:343:0x00f1, B:345:0x00f7, B:346:0x012a, B:546:0x08d8, B:548:0x08e2, B:550:0x08f4, B:552:0x08fa, B:554:0x0900, B:555:0x0933, B:583:0x0a0e, B:585:0x0a18, B:587:0x0a20, B:589:0x0a26, B:591:0x0a2c, B:592:0x0a5f, B:428:0x0518, B:439:0x057f, B:441:0x0589, B:443:0x0591, B:445:0x0597, B:447:0x059d, B:449:0x05a9, B:452:0x05e1, B:453:0x05e2, B:454:0x0615, B:461:0x0628, B:463:0x0632, B:465:0x063a, B:467:0x0640, B:469:0x0646, B:470:0x067b, B:478:0x06d3, B:480:0x06dd, B:482:0x06ef, B:484:0x06f5, B:486:0x06fb, B:487:0x072e, B:496:0x0787, B:498:0x0791, B:500:0x079d, B:501:0x07a4, B:504:0x07ad, B:506:0x07b0, B:508:0x07b6, B:510:0x07c2, B:518:0x07d5, B:519:0x0808, B:515:0x07ce, B:516:0x07cf, B:389:0x0367, B:527:0x0847, B:532:0x085b, B:534:0x0861, B:536:0x0867, B:537:0x089c, B:530:0x0853, B:597:0x0a6a, B:599:0x0a74, B:601:0x0a7e, B:603:0x0a84, B:605:0x0a8a, B:607:0x0a96, B:610:0x0ace, B:612:0x0ad7, B:611:0x0acf, B:613:0x0b09, B:450:0x05de, B:322:0x003a, B:324:0x004a, B:326:0x0073, B:327:0x0076, B:558:0x093c, B:560:0x0942, B:561:0x0976, B:330:0x0081, B:333:0x0097, B:335:0x009d, B:336:0x00c2, B:349:0x0133, B:543:0x08a9, B:545:0x08af, B:352:0x0139, B:354:0x0151, B:357:0x015d, B:359:0x017c, B:361:0x018c, B:363:0x0192, B:364:0x01bb, B:365:0x01d4, B:367:0x01e0, B:368:0x021f, B:579:0x09d8, B:581:0x09de, B:582:0x0a0b, B:391:0x036c, B:393:0x0376, B:395:0x037c, B:396:0x03aa, B:398:0x03bc, B:401:0x03e2, B:402:0x03e4, B:404:0x0424, B:406:0x042a, B:407:0x0453, B:409:0x045f, B:413:0x047c, B:414:0x0480, B:416:0x04b4, B:418:0x04bf, B:420:0x04c5, B:421:0x04ef, B:427:0x0514, B:433:0x052a, B:435:0x0530, B:437:0x0536, B:438:0x057c, B:431:0x0525, B:432:0x0529, B:460:0x0623, B:474:0x0685, B:476:0x068b, B:477:0x06d0, B:492:0x073a, B:494:0x0740, B:495:0x0784, B:370:0x0224, B:372:0x022a, B:373:0x0251, B:375:0x0270, B:377:0x0276, B:378:0x02b6, B:380:0x02ca, B:382:0x02fe, B:383:0x0300, B:385:0x0321, B:387:0x0327, B:523:0x0812, B:525:0x0818, B:526:0x0841, B:502:0x07ab, B:608:0x0acb, B:511:0x07c9), top: B:622:0x0007, inners: #0, #3, #5, #7, #8 }] */
    /* JADX WARN: Type inference failed for: r0v126, types: [o.de.a] */
    /* JADX WARN: Type inference failed for: r0v184, types: [o.dd.j] */
    /* JADX WARN: Type inference failed for: r0v257, types: [o.de.a] */
    /* JADX WARN: Type inference failed for: r0v258, types: [o.de.a] */
    /* JADX WARN: Type inference failed for: r0v76, types: [o.de.a] */
    /* JADX WARN: Type inference failed for: r0v77, types: [o.de.a] */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.Context, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r35v0, types: [o.bg.c] */
    /* JADX WARN: Type inference failed for: r36v0, types: [o.dc.d] */
    /* JADX WARN: Type inference failed for: r4v24, types: [o.de.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [long, o.by.g] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [o.by.g] */
    /* JADX WARN: Type inference failed for: r8v6, types: [o.by.g] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean e(android.content.Context r37, o.bg.c r38, o.az.a r39, boolean r40, o.by.g r41) {
        /*
            Method dump skipped, instruction units count: 2829
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dc.d.e(android.content.Context, o.bg.c, o.az.a, boolean, o.by.g):boolean");
    }
}
