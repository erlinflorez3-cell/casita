package o.em;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import o.a.o;
import o.ea.f;
import o.ef.a;
import o.ef.c;
import o.ek.e;
import o.ev.b;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.FB;
import yg.Wg;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f24070a = 0;

    /* JADX INFO: renamed from: b */
    public static int f24071b = 0;

    /* JADX INFO: renamed from: c */
    public static int f24072c = 0;

    /* JADX INFO: renamed from: d */
    public static int f24073d = 0;

    /* JADX INFO: renamed from: e */
    public static int f24074e = 0;

    /* JADX INFO: renamed from: i */
    private static long f24075i = 0;

    /* JADX INFO: renamed from: j */
    private static char[] f24076j = null;

    /* JADX INFO: renamed from: k */
    private static int f24077k = 0;

    /* JADX INFO: renamed from: l */
    private static int f24078l = 0;

    /* JADX INFO: renamed from: m */
    private static int f24079m = 0;

    /* JADX INFO: renamed from: n */
    private static int f24080n = 0;

    /* JADX INFO: renamed from: o */
    public static int f24081o = 0;

    /* JADX INFO: renamed from: p */
    public static int f24082p = 0;

    /* JADX INFO: renamed from: g */
    private boolean f24084g;

    /* JADX INFO: renamed from: h */
    private final e f24085h = new e();

    /* JADX INFO: renamed from: f */
    private final b f24083f = new b();

    /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r6, byte r7, byte r8) {
        /*
            int r2 = r8 * 4
            int r1 = 1 - r2
            byte[] r8 = o.em.d.$$c
            int r0 = r7 * 4
            int r7 = r0 + 4
            int r3 = 105 - r6
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r8 != 0) goto L2b
            r3 = r7
            r0 = r4
            r2 = r5
        L16:
            int r7 = r7 + 1
            int r0 = -r0
            int r3 = r3 + r0
            r1 = r2
        L1b:
            byte r0 = (byte) r3
            r6[r1] = r0
            int r2 = r1 + 1
            if (r1 != r4) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L28:
            r0 = r8[r7]
            goto L16
        L2b:
            r1 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.em.d.$$g(byte, byte, byte):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f24082p = 1718633555;
        f24081o = 1688735101;
        init$0();
        f24072c = -1440726019;
        f24074e = 1263780318;
        f24073d = -1542610146;
        f24070a = 1020496810;
        f24071b = -545479351;
        f24079m = 0;
        f24080n = 1;
        f24078l = 0;
        f24077k = 1;
        h();
        Color.red(0);
        ViewConfiguration.getLongPressTimeout();
        ViewConfiguration.getScrollDefaultDelay();
        View.MeasureSpec.getMode(0);
        TextUtils.getOffsetAfter("", 0);
        ViewConfiguration.getScrollFriction();
        ViewConfiguration.getJumpTapTimeout();
        View.getDefaultSize(0, 0);
        Process.myPid();
        ExpandableListView.getPackedPositionType(0L);
        TextUtils.indexOf("", "", 0);
        Color.blue(0);
        ViewConfiguration.getFadingEdgeLength();
        ViewConfiguration.getScrollDefaultDelay();
        TextUtils.lastIndexOf("", '0');
        AudioTrack.getMinVolume();
        View.combineMeasuredStates(0, 0);
        View.resolveSize(0, 0);
        int i2 = f24080n + 57;
        f24079m = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ Object a(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~i3;
        int i9 = ~i2;
        int i10 = (i8 + i9) - (i8 & i9);
        int i11 = ~((i10 + i5) - (i10 & i5));
        int i12 = ~i5;
        int i13 = ~((i9 + i12) - (i9 & i12));
        int i14 = ~((-1) - (((-1) - i8) & ((-1) - i2)));
        int i15 = ((i14 + i13) - (i14 & i13)) | (~((i9 + i3) - (i9 & i3)));
        int i16 = ~(i12 | i10);
        int i17 = i3 + i2 + i6 + (1938118820 * i4) + ((-1869228383) * i7);
        int i18 = i17 * i17;
        int i19 = (i3 * (-1046486968)) + 2037645312 + ((-1046486968) * i2) + (1604861810 * i11) + (i15 * (-1345052743)) + ((-1345052743) * i16) + (1903427584 * i6) + ((-1907359744) * i4) + (1374945280 * i7) + (1516044288 * i18);
        int i20 = ((i3 * 647972376) - 1941852458) + (i2 * 647972376) + (i11 * 1702) + (i15 * 851) + (i16 * 851) + (i6 * 647973227) + (i4 * (-1260466036)) + (i7 * 1557372491) + (i18 * 1239351296);
        int i21 = i19 + (i20 * i20 * 490405888);
        if (i21 != 1) {
            return i21 != 2 ? b(objArr) : d(objArr);
        }
        d dVar = (d) objArr[0];
        String str = (String) objArr[1];
        int i22 = 2 % 2;
        int i23 = f24078l + 113;
        f24077k = i23 % 128;
        int i24 = i23 % 2;
        o.eq.b bVarC = dVar.f24085h.c(str);
        int i25 = f24077k + 7;
        f24078l = i25 % 128;
        int i26 = i25 % 2;
        return bVarC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x028b, code lost:
    
        if (r5.d(((java.lang.String) r7[0]).intern()) != false) goto L136;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.em.d.b(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24077k + 1;
        f24078l = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            dVar.f24085h.c();
            return null;
        }
        dVar.f24085h.c();
        obj.hashCode();
        throw null;
    }

    static void h() {
        char[] cArr = new char[1490];
        ByteBuffer.wrap("Qïgt<¹òE\u008bÛA6\u0016¶,\få\u009eºþp1\tÍßS\u0094¾ª>c\u00849\u0016Î\u0086\u0087ï]w\u0012À(^áª·2L\u0093\u0002\u001fÛ}\u0090å¦r\u007fÉ5#Ê¹\u0080\u001bY\u0083o\u0013$[ýå³PHÖ\u001e&×´í\u001c¢\u009a{â1~ÆÏ\u009cH\u0094\u0091¢\u000e\u0094¢¢\u001cù\u009572N«\u0084WÓÜéI ï\u007f\u0086µ\u000bÌ¢\u001a4QÒoE¦àÂ|ôô¯baÌ\u0018@Ò¿\u0085#¿\u0095v\u0017)wã£\u009a\u001dL\u0081\u000789¨ðTª\u0095]\u000b\u0014bÎå\u0081\\»Àr+$ìß\u000f\u0091\u0087Hà\u0003o5ÄìT¦´Y!\u0013\u0086ÊZü\u0098·ìnf ÌÛJ\u008d¸Dm~È1Cèc¢õUY\u000f×Æ$ø¬³$e\u009c\u001cH×i\u0089ü@PzÏ-8ç±\u009e\u0000P\u0089\u000bÿÂa,(\u001a A6\u008f\u0098ö\u0014<ëkwQÁ\u0098CÇ#\r÷tI¢Õéc×³\u001ePDÐ³Gú\" ¹o\u0003U\u008e\u009c+Êê1L\u007fÅ¦¨í!Û\u0097\u0002\u0011Hæ·cý\u0081$G\u0012ÌYì\u0080.Î\u009e5\u0014cúª|\u0090Âß\u0017\u0006+L»»Bá\u0097(i\u0016â]u\u0094\u009b¢\u0013ù\u00857+N§\u0084XÓÄér ð\u007f\u0090µDÌú\u001afQÕoE¦ðüp\u000bôB\u008c\u0098\u001b×»í-$\u0098r[\u0089ûÇ|\u001e\u0019U\u0082c8ºµð\u0010\u000fÑEw\u009cîªcá\n8\u009cv:\u008d\u00adÛH\u0012\u008a(/g¤Øbîêµ|{Ò\u0002^È¡\u009f=¥\u008bl\t3iù½\u0080\u0003V\u009f\u001d-#´ê\u001a°\u008fG\r\u000e%Ôæ\u009bF¡Éh,>·Å\r\u008b\u0088R\u00ad\u0019l/ÊöK¼¦C/\t\u0099Ð\u0007æ\u0090\u00adõt7:\u009aÁ\u0011\u0097±^'d\u0083+\rò~¸öOF\u0015ÞÜjâ«©&\u007f\u008a\u0006\u0015Íb\u0093ãZR`Û7-ý»\u0094\u0082¢\u001cù\u009572N«\u0084WÓÜéP ï\u007f\u008cµ)Ì¶\u001a(QÐoG¦öüpN¸x5#·í\u0012\u0094·^b\tî3TúÊ¥°o(\u0016¸À\u0000\u008bêµd|Û&_Ñò\u0098°B4\r\u00847\tþþ¨lÍuûø^\u008eh\u00063\u0090ý>\u0084²NM\u0019Ñ#gêåµ\u0085\u007fQ\u0006ïÐs\u009bÖ¥Plò6eÁñ\u0088\u008cR\f\u001d®'8î\u008d¸]Cî\rbÔ\u0005\u009fÒ©3p¦:JÅÐ\u008fnVä`|+Jò\u009d¼#G¯\u0011CØÞât\u00ad±t\u0094>\u0016É¶\u0093&ZÏdX/Öù)\u0080óK\u0098\u0015\\Ü¸æ.±\u008f{D\u0002îÌ2\u0097\u0007^\u0095h13³ý\u0007\u0084\u0085N\u0019\u0019ü#~ê\u001eµ\u008e\u007f'\u0006°ÐN\u009b\u0091¥8l³ï\u001eÙ\u0096\u0082\u0000L®5\"ÿÝ¨A\u0092÷[u\u0004\u0015ÎÁ·\u007faã*F\u0014ÀÝb\u0087õpa9\u001cã\u009c¬>\u0096¨_\u001d\tÍò~¼òe\u0095.B\u0018£Á6\u008bÚt@>þçtÑì\u009aÚC\r\r³ö? ÓiNSä\u001c!Å\u0004\u008f\u0086x&\"¶ë_ÕÈ\u009eFH¹1cú\b¤Ìm2W¬\u0000LÊÏ³}}ç&\u0087ï\u0001Ùõ\u0082kL\u00975YÿË¨u\u0092ù[\u0088\u0004\u0004Î°·(a\u0090*H\u0014üÝj\u0086\u0000p\u008c97ã«¬!\u0096Ã_K\tïòe»\u0012e\u0080\u0094\u009b¢\u0013ù\u00857+N§\u0084XÓÄér ð\u007f\u0094µ\u0010Ì¾\u001a)Qßo\u0000¦öüp\u000bÿB\u0093\u0098\u001d×þís$\u0098rX\u0089îÇj\u001e\u0006U\u0082c2ºáðS\u000fÂE`\u009cùª,á\u000f8\u009cv6\u008d®ÛR\u0012Æ(pg¤¾\u0091ô\t\u0003£Y-\u0090Ò®Vå\u008d3jJê\u0081\u008cß\u001a\u0016±,${Ô±\u0005Èý\u0006t]V\u0094\u008e¢2ù°7]NÑ\u0084IÓëékoDYÌ\u0002ZÌôµx\u007f\u0087(\u001b\u0012\u00adÛ/\u0084ON\u009b7%á¹ª\u0000\u0094\u0090]l\u0007¾ð3¹QcÔ,!\u0016æß\u0015\u0089\u009br#<³åÇ®]\u0098©Ax\u000b\u0080ô\u000e¾ g#Q§\u001a\u0080ÃG\u008dãve \u0097é\u001cÓ¥\u009c5E\b\u000fËøk¢ëk\u001eU\u0094\u001e\u0017Èµ±5zE$\u0096í*×´\u0080\u0004J\u00983$ýª¦ÝoWYá\u0002{ÌÍµ\u000b\u007f\u009d()\u0012¥ÛÏ\u0084VNè7|á\u0090ª\u001a\u0094¼]0\u0006AðÑ\u00937¥¿þ)0\u0087I\u000b\u0083ôÔhîÞ'\\x8²¼Ë\u0012\u001d\u0085Vsh¬¡ZûÜ\fSE?\u009f±ÐRêß#4ué\u008eYÀ\u0089\u0019»R*d\u0088½\t÷¼\b\u007fBÌ\u009b^\u00adÆæº?.q\u0090\u008aDÜñ\u0015i/Ë`E¹:ó¾\u0004]^\u009a\u0097z©üâr4ÙML\u0086<Øå\u0011\u0006+\u0082|b¶ûÏQ\u0001ÎZ¬\u0093(¥\u0098\u0094\u0091¢\u001cù\u009e7;N\u0083\u0084XÓÆéz í\u007f\u0090µ\u0016\u0094\u009b¢\u0013ù\u009a7>N¢\u0084PÓÌé; à\u007f\u0086µ\u000bÌ¹\u001afQØoN¦úüv\u000bäB\u009d\u0098\u0003×·í3$ÑrE\u0089ýÇ%\u001e\u0004U\u0086c/º¬ðU\u000fÍEf\u009c½ª~á\u001a8\u009dv6\u008d½ÛI\u0012É(pg÷¾×ô\\\u0003ñÉ\u000bÿ\u0086¤\u0004j¡\u0013'Ò¼ä6¿³q\u0005\b\u0081Âg\u0095Ð¯AfÃ9ªó,\u008aÌ\\P\u0017ª)xàÉºKMÒ\u0004´Þt\u0091\u008b«\u001dbç4uÏ\u0081\u0081XX \u0013©%\u0003ü\u009e¶+I¢\u0003\t\u0094¸¢\u000eù\u008371N\u008b\u0084AÓËé~ ú\u007f\u0081µ\rÌ¸\u001a(Q\u0091oW¦ûük\u000báB\u0099\u0098O×«í9$ÜrJ\u0089îÇl\u001e\u001aU\u0080cvº²ðU\u000f×Ef\u009côªbá\u00188\u009dvy\u008dåÛ\u001bþðÈh\u0093ñ]@$Èî,¹\u009b\u0083\nJ\u0088\u0015áß4¦\u008ap\u0016;¢\u00051Ì\u0091\u0096\u0016a\u008e(¬òv½Ê\u0087\u0019Nò\u0018{Spe±>!ð\u0089\u0089LCý\u0014e.ÌçF¸3\u0094Ò¢PùÌ7<N¢\u0084\\ÓÉéu ã\u007f\u009bµ\u0003Ì÷\u001a6QÐoY¦þüg\u000bãB\u0088\u0098O×µí,$ÁrX\u0081\u0088·\bì\u0093\"6[º\u0091KÆ×ü.5þj\u009d QÙ\u009f\u000f$DÙzO³íét\u001eÕW\u008b\u008d\u001bÂ¦ø9Äöòp©ìgN\u001eÜÔ=\u0083\u00ad¹(p\u008e/õåi\u009cÂJN\u0001½?$åýÓx\u0088ýFS?Åõ(þ½È?\u0093£]E$Ñî2¹¦\u0083\u0000J\u008c\u0015ôßl¦\u0098pJ;¿\u0005=Ì\u0098\u0096\u001e\u001f\u008a)\u0000r\u0085¼3Å·\u000fQXæbw«õô\u009c>IG÷\u0091kÚßäL-ìwk\u0080óÉÑ\u0013\u000b\\·fd¯\u008fù\u0006\u0094\u009e¢\u0012ù\u008f74N\u008d\u0084XÓÚé\u007f ª\u007fØµDÌ´\u001a'QÃoD¦àü\"\u000bäB\u0098\u0098O×äíi\u0094\u0084¢\u001cù\u008076Nª\u0084XÓÜé~ É\u007f\u0094µ\u0016Ì³\u001a\u0012QÔoR¦þüq\u000bÌB\u0092\u0098\u000b×\u009dí&$ÖrO\u0089óÇq\u001e\u001dU\u0088c8º²ð\u0010\u000f\u008eE2\u009cþªmá\r8\u008av*\u008dèÛR\u0012Î(5g¾¾×\u0094\u0091¢\u000fù\u00897;N«\u0084WÓÜér ë\u007f\u0099µ\u0017s+E¡\u001e$Ð\u0092©\u0016cð4$\u000e\u009aÇ\u0006\u0098:Rº+\u001eý\u008e¶x\u0088âAK\u001bÇì@¥<\u007f°0R\n\u008bÃ{\u0095ãnS \u0089ù¾²$\u0084\u008f]\u0003\u0017øè/¢\u0084{\u0011\u0094\u0091¢\u0012ù\u008172N§\u0084MÓüét Î\u007f\u009cµ\u0017Ì¼\u001afQ\u009co\u0000¦àüg\u000bÿB\u0095\u0098\u000e×²í $ÂrN\u0089þÇ%\u001e\u0017U\u0086c$º¥ð\u0010\u000fÎEs\u009cóªmá\u00188\u008bv+\u008dèÛ\u0001\u0012\u008a\u0084\u0089²\né\u0099'*^¿\u0094UÃäùl0Öo\u0084¥\u000fÜ¤\n~A\u0084\u007f\u0018¶îìw\u001båR\u0090\u0088\u000eÇæý24ÁbA\u0099æ×=\u000e\u0001E\u009es ª¸àO\u001fÞUxÓWåÔ¾Gpô\taÃ\u008b\u0094:®²g\b8ZòÑ\u008bz] \u0016Z(Æá&»¡L9\u0005SßÈ\u0090tªæc\u00045\u0088Î8\u0080ãYÂ\u0012@$éýj·\u0093H\u000b\u0002 Û{í¡¦Ü\u007fQ1¿Êc\u009c\u009cU\u0002o² %ùT³ÒD7\u001e¼×U\u0094\u0091¢\u0012ù\u008172N§\u0084MÓüét Î\u007f\u009cµ\u0017Ì¼\u001afQ\u009co\u0000¦öüo\u000býB\u0088\u0098\u0016×þí9$ÙrR\u0089÷Ç`\u001e\u001aU\u0093cvºªðU\u000fÚE2\u009cðªmá\u00118\u008fv>\u008d\u00adÛIRød{?èñ[\u0088ÎB$\u0015\u0095/\u001dæ§¹õs~\nÕÜ\u000f\u0097õ©i`\u009f:\u0006Í\u0094\u0084á^\u007f\u0011\u0097+Râ´´1O\u009c\u0001\u0019Øo\u0093í¥Z|Û\u0094\u0091¢\u0012ù\u008172N§\u0084MÓüét Î\u007f\u009cµ\u0017Ì¼\u001afQ\u009co\u0000¦àüg\u000bÿB\u0095\u0098\u000e×²í $ÂrN\u0089þÇ%\u001e\u001eU\u0094c9º¯ð\u0010\u000f\u0099E2\u0094\u0091¢\u0012ù\u008172N§\u0084MÓüét Î\u007f\u009cµ\u0017Ì¼\u001afQ\u009co\u0000¦àüv\u000bâB\u008e\u0098\u0006×°í.$\u0098rH\u0089óÇu\u001e\u001cU\u0082c$º¤ðT\u000f\u0083Ex\u009cîªcá\u00118Îv-\u008d§Û\u001b\u0012Î(|g÷¾\u009c31\u0005²^!\u0090\u0092é\u0007#ít\\NÔ\u0087nØ<\u0012·k\u001c½Æö<È \u0001Y[Ñ¬Bå2?ïp\u001bJ\u0091\u0083{Õî.J`Ñ¹½ò(Ä\u0098\u001dAWç¨kâÛ;Q\rÉFÿ\u009f=Ñ\u009c*\u001a|òµk\u008fÙÀM\u0019-S¯¤\u001fþ\u008773\tòBl\u0094ÅíB&;x§±\f\u008bËÜq\u0016àoM¡\u0087ú»3 \u0005\u009e^\u0002\u0090õéx#þt\u001fN\u0094\u0087ùf\u009cP\u0000\u000b\u0086Å\u001b¼¤vO!Ô\u001bYÒì\u008d\u0089G\u0018>±è'£Ù\u009d\u000fT±\u000e-ùö°\u0081j\u0015%´\u0096u éûo5òLM\u0086¦Ñ=ë°\"\u0005}`·ñÎX\u0018ÎS0mæ¤XþÄ\t\r@{\u009aåÕKïÊ\u0094\u0094¢\u0011ù\u00997,N¦\u0084\u0019ÓËéz ø\u007f\u0091µ\u0017Ì÷\u001a QÃoO¦þü\"\u000bàB\u0099\u0098\u0002×±í;$Á".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1490);
        f24076j = cArr;
        f24075i = -3698287519396486531L;
    }

    static void init$0() {
        $$a = new byte[]{64, -84, MessagePack.Code.MAP32, -5};
        $$b = 176;
    }

    static void init$1() {
        $$d = new byte[]{119, -86, Ascii.SYN, 102, MessagePack.Code.BIN8, 60, Ascii.DC2, MessagePack.Code.NEVER_USED, 67, -67, 19};
        $$e = 246;
    }

    static void init$2() {
        $$c = new byte[]{85, Ascii.RS, 127, 42};
        $$f = 178;
    }

    private static void q(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f24076j[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a((Process.myPid() >> 22) + 742, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), TextUtils.getOffsetBefore("", 0) + 12, 632508977, false, $$g((byte) 6, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f24075i), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b3 = (byte) 5;
                    byte b4 = (byte) (b3 - 5);
                    objA2 = o.d.d.a(View.combineMeasuredStates(0, 0) + 766, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 12471), (ViewConfiguration.getTapTimeout() >> 16) + 12, 1946853218, false, $$g(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA3 = o.d.d.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 387, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 18 - TextUtils.getTrimmedLength(""), 39570797, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
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
            int i6 = $10 + 97;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                objA4 = o.d.d.a(386 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ViewConfiguration.getEdgeSlop() >> 16), Process.getGidForName("") + 19, 39570797, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i8 = $11 + 123;
        $10 = i8 % 128;
        if (i8 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i9 = 22 / 0;
            objArr[0] = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void r(byte r9, byte r10, short r11, java.lang.Object[] r12) {
        /*
            int r8 = r11 * 4
            int r1 = r8 + 1
            int r0 = r9 * 5
            int r7 = r0 + 101
            int r0 = r10 * 3
            int r6 = r0 + 4
            byte[] r5 = o.em.d.$$a
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r5 != 0) goto L2e
            r2 = r6
            r7 = r8
            r1 = r3
        L16:
            int r0 = -r6
            int r7 = r7 + r0
            int r6 = r2 + 1
        L1a:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r8) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L27:
            r0 = r5[r6]
            int r1 = r1 + 1
            r2 = r6
            r6 = r0
            goto L16
        L2e:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.em.d.r(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void s(int r8, byte r9, byte r10, java.lang.Object[] r11) {
        /*
            int r1 = r8 + 4
            int r0 = r10 * 14
            int r8 = r0 + 97
            byte[] r7 = o.em.d.$$d
            int r0 = r9 * 7
            int r6 = r0 + 1
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r7 != 0) goto L2c
            r3 = r4
            r0 = r1
        L13:
            int r8 = r8 + r1
            int r8 = r8 + (-5)
            r2 = r3
            r1 = r0
        L18:
            int r3 = r2 + 1
            byte r0 = (byte) r8
            r5[r2] = r0
            if (r3 != r6) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r11[r4] = r0
            return
        L27:
            int r0 = r1 + 1
            r1 = r7[r0]
            goto L13
        L2c:
            r2 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.em.d.s(int, byte, byte, java.lang.Object[]):void");
    }

    public final o.eq.b a(String str) {
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i2 = f24073d * (-674039927);
        f24073d = i2;
        return (o.eq.b) a(-1500124824, 1500124825, new Object[]{this, str}, Process.myPid(), iMaxMemory, i2, (int) Runtime.getRuntime().maxMemory());
    }

    public final void a() throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f24078l + 73;
            f24077k = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            q((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getWindowTouchSlop() >> 8) + 49, 16 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            q((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1468, 23 - KeyEvent.normalizeMetaState(0), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f24078l + 105;
            f24077k = i5 % 128;
            int i6 = i5 % 2;
        }
        this.f24085h.b();
    }

    public final void a(Context context) throws o.en.f {
        int i2 = f24071b * (-710503470);
        f24071b = i2;
        int iNextInt = new Random().nextInt();
        int i3 = f24070a * 1729749904;
        f24070a = i3;
        a(1773301533, -1773301533, new Object[]{this, context}, i3, i2, iNextInt, (int) Runtime.getRuntime().totalMemory());
    }

    public final o.fj.b b(Context context, String str) throws Throwable {
        int i2 = 2 % 2;
        o.fj.b bVar = new o.fj.b();
        o.ep.d dVar = this.f24085h.e().get(str);
        if (dVar == null) {
            int i3 = f24077k + 51;
            f24078l = i3 % 128;
            if (i3 % 2 != 0) {
                f.a();
                throw null;
            }
            if (f.a()) {
                Object[] objArr = new Object[1];
                q((char) View.MeasureSpec.getMode(0), (ViewConfiguration.getEdgeSlop() >> 16) + 49, 16 - Drawable.resolveOpacity(0, 0), objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                q((char) View.getDefaultSize(0, 0), 996 - View.resolveSizeAndState(0, 0, 0), Color.rgb(0, 0, 0) + 16777260, objArr2);
                StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(str);
                Object[] objArr3 = new Object[1];
                q((char) (51106 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 856, 10 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr3);
                f.d(strIntern, sbAppend.append(((String) objArr3[0]).intern()).toString());
            }
            return bVar;
        }
        if (f.a()) {
            Object[] objArr4 = new Object[1];
            q((char) (ViewConfiguration.getPressedStateDuration() >> 16), 50 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr5 = new Object[1];
            q((char) ExpandableListView.getPackedPositionType(0L), 996 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 44 - ExpandableListView.getPackedPositionType(0L), objArr5);
            StringBuilder sbAppend2 = sb2.append(((String) objArr5[0]).intern()).append(str);
            Object[] objArr6 = new Object[1];
            q((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 27248), Gravity.getAbsoluteGravity(0, 0) + 933, 17 - ExpandableListView.getPackedPositionGroup(0L), objArr6);
            f.c(strIntern2, sbAppend2.append(((String) objArr6[0]).intern()).toString());
            int i4 = f24078l + 31;
            f24077k = i4 % 128;
            int i5 = i4 % 2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        o.ep.d dVarC = dVar.c();
        linkedHashMap.put(dVarC.b(), dVarC);
        this.f24085h.d(dVar, o.ep.f.f24513e);
        Object[] objArr7 = {this.f24085h, context, linkedHashMap, this.f24083f};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int iMyUid = Process.myUid();
        int i6 = e.f24029h * 1092908448;
        e.f24029h = i6;
        int i7 = e.f24032l * (-28842699);
        e.f24032l = i7;
        o.fj.b bVar2 = (o.fj.b) e.b(iElapsedRealtime, 1001399399, i7, iMyUid, objArr7, i6, -1001399394);
        int i8 = f24078l + 103;
        f24077k = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 30 / 0;
        }
        return bVar2;
    }

    public final void b() {
        int i2 = 2 % 2;
        int i3 = f24077k + 13;
        f24078l = i3 % 128;
        int i4 = i3 % 2;
        this.f24085h.g();
        int i5 = f24078l + 3;
        f24077k = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void b(Context context) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        q((char) ((Process.getThreadPriority(0) + 20) >> 6), 49 - Color.red(0), Gravity.getAbsoluteGravity(0, 0) + 16, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        q((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 50556), TextUtils.lastIndexOf("", '0') + 1, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 47, objArr2);
        Object[] objArr3 = {((String) objArr2[0]).intern(), 0};
        Method method = Class.forName(C1561oA.Kd("M[Ra_ZV!Wddk]gn)?llseyv", (short) (C1499aX.Xd() ^ (-19344)))).getMethod(C1561oA.Xd("*)9\u0019/);//\u001c?355C7A7:I", (short) (FB.Xd() ^ 8986)), Class.forName(Wg.Zd("hh\u0003R$7acQ-\u0017]`\u001ej\u0018", (short) (C1499aX.Xd() ^ (-11132)), (short) (C1499aX.Xd() ^ (-4480)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr3);
            try {
                a aVar = new a();
                a aVarD = this.f24085h.d();
                int iActiveCount = Thread.activeCount();
                int priority = Thread.currentThread().getPriority();
                int i3 = a.f23768b * 408478217;
                a.f23768b = i3;
                if (((Integer) a.a(-1670499501, new Object[]{aVarD}, i3, (int) Thread.currentThread().getId(), 1670499501, iActiveCount, priority)).intValue() != 0) {
                    int i4 = f24078l + 87;
                    f24077k = i4 % 128;
                    int i5 = i4 % 2;
                    if (f.a()) {
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr4 = new Object[1];
                        q((char) KeyEvent.keyCodeFromString(""), 1085 - TextUtils.indexOf("", "", 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 40, objArr4);
                        f.c(strIntern, sb.append(((String) objArr4[0]).intern()).append(aVarD.e()).toString());
                    }
                    Object[] objArr5 = new Object[1];
                    q((char) KeyEvent.normalizeMetaState(0), 697 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, objArr5);
                    aVar.a(((String) objArr5[0]).intern(), aVarD);
                } else if (f.a()) {
                    int i6 = f24078l + 73;
                    f24077k = i6 % 128;
                    int i7 = i6 % 2;
                    Object[] objArr6 = new Object[1];
                    q((char) (4120 - Color.blue(0)), 1126 - View.combineMeasuredStates(0, 0), Process.getGidForName("") + 34, objArr6);
                    f.c(strIntern, ((String) objArr6[0]).intern());
                }
                c cVarC = this.f24083f.c();
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i8 = c.f23799b * 1567746851;
                c.f23799b = i8;
                int i9 = c.f23798a * 1136425123;
                c.f23798a = i9;
                if (((Integer) c.b((int) Runtime.getRuntime().maxMemory(), i9, i8, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVarC})).intValue() != 0) {
                    if (f.a()) {
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr7 = new Object[1];
                        q((char) (MotionEvent.axisFromString("") + 18375), KeyEvent.normalizeMetaState(0) + 1159, 48 - (ViewConfiguration.getTouchSlop() >> 8), objArr7);
                        f.c(strIntern, sb2.append(((String) objArr7[0]).intern()).append(cVarC.b()).toString());
                    }
                    Object[] objArr8 = new Object[1];
                    q((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 278, 17 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr8);
                    aVar.a(((String) objArr8[0]).intern(), cVarC);
                } else if (f.a()) {
                    int i10 = f24078l + 111;
                    f24077k = i10 % 128;
                    int i11 = i10 % 2;
                    Object[] objArr9 = new Object[1];
                    q((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1207, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 39, objArr9);
                    f.c(strIntern, ((String) objArr9[0]).intern());
                    int i12 = f24077k + 21;
                    f24078l = i12 % 128;
                    int i13 = i12 % 2;
                }
                int iActiveCount2 = Thread.activeCount();
                int priority2 = Thread.currentThread().getPriority();
                int i14 = a.f23768b * 408478217;
                a.f23768b = i14;
                if (((Integer) a.a(-1670499501, new Object[]{aVar}, i14, (int) Thread.currentThread().getId(), 1670499501, iActiveCount2, priority2)).intValue() == 0) {
                    int i15 = f24077k + 23;
                    f24078l = i15 % 128;
                    int i16 = i15 % 2;
                    if (f.a()) {
                        int i17 = f24077k + 93;
                        f24078l = i17 % 128;
                        int i18 = i17 % 2;
                        Object[] objArr10 = new Object[1];
                        q((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 50793), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1246, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29, objArr10);
                        f.c(strIntern, ((String) objArr10[0]).intern());
                    }
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    Object[] objArr11 = new Object[1];
                    q((char) TextUtils.getCapsMode("", 0, 0), 47 - TextUtils.getOffsetBefore("", 0), 3 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr11);
                    editorEdit.putString(((String) objArr11[0]).intern(), "").commit();
                    return;
                }
                Object[] objArr12 = new Object[1];
                q((char) (55849 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 295 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 24, objArr12);
                String strIntern2 = ((String) objArr12[0]).intern();
                Object[] objArr13 = new Object[1];
                q((char) ((Process.myTid() >> 22) + 22967), 320 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2, objArr13);
                aVar.a(strIntern2, (Object) ((String) objArr13[0]).intern());
                if (f.a()) {
                    StringBuilder sb3 = new StringBuilder();
                    Object[] objArr14 = new Object[1];
                    q((char) TextUtils.getOffsetBefore("", 0), 1276 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.indexOf("", "", 0, 0) + 33, objArr14);
                    f.c(strIntern, sb3.append(((String) objArr14[0]).intern()).append(aVar.e()).toString());
                }
                String strE = new o.dk.a(context).e(aVar.e());
                if (!(!f.a())) {
                    Object[] objArr15 = new Object[1];
                    q((char) Drawable.resolveOpacity(0, 0), 1311 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.indexOf("", "") + 44, objArr15);
                    f.c(strIntern, ((String) objArr15[0]).intern());
                }
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                Object[] objArr16 = new Object[1];
                q((char) (KeyEvent.getMaxKeyCode() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 47, 1 - TextUtils.lastIndexOf("", '0', 0), objArr16);
                editorEdit2.putString(((String) objArr16[0]).intern(), strE).commit();
            } catch (o.ef.b e2) {
                if (f.a()) {
                    StringBuilder sb4 = new StringBuilder();
                    Object[] objArr17 = new Object[1];
                    q((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42912), 1354 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 70, objArr17);
                    f.c(strIntern, sb4.append(((String) objArr17[0]).intern()).append(e2.getMessage()).toString());
                }
                SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                Object[] objArr18 = new Object[1];
                q((char) (ViewConfiguration.getTouchSlop() >> 8), ((Process.getThreadPriority(0) + 20) >> 6) + 47, Color.argb(0, 0, 0, 0) + 2, objArr18);
                editorEdit3.putString(((String) objArr18[0]).intern(), "").commit();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final boolean c() throws Throwable {
        Iterator<o.ep.a> it;
        int i2 = 2 % 2;
        int i3 = f24077k + 73;
        f24078l = i3 % 128;
        int i4 = i3 % 2;
        for (o.ep.d dVar : this.f24085h.e().values()) {
            int i5 = f24078l + 15;
            f24077k = i5 % 128;
            int i6 = i5 % 2;
            if (dVar.A() != null) {
                int i7 = f24078l + 63;
                f24077k = i7 % 128;
                if (i7 % 2 == 0) {
                    it = dVar.A().values().iterator();
                    int i8 = 2 / 0;
                } else {
                    it = dVar.A().values().iterator();
                }
                while (it.hasNext()) {
                    for (o.eq.b bVar : it.next().a()) {
                        int i9 = f24077k + 9;
                        f24078l = i9 % 128;
                        int i10 = i9 % 2;
                        if (bVar.s()) {
                            int priority = Thread.currentThread().getPriority();
                            int i11 = (int) Runtime.getRuntime().totalMemory();
                            int i12 = 579433029 * o.eq.b.f24696b;
                            o.eq.b.f24696b = i12;
                            if (((o.eq.d) o.eq.b.e(i12, Thread.currentThread().getPriority(), i11, -578669383, priority, 578669383, new Object[]{bVar})) == o.eq.d.f24730a) {
                                Object[] objArr = {this.f24083f, bVar.k()};
                                int id = (int) Thread.currentThread().getId();
                                int i13 = b.f25492g * 1256025341;
                                b.f25492g = i13;
                                if (!((Boolean) b.d(id, Process.myUid(), objArr, i13, (int) Runtime.getRuntime().maxMemory(), -1608611951, 1608611953)).booleanValue()) {
                                    int i14 = f24078l + 109;
                                    f24077k = i14 % 128;
                                    int i15 = i14 % 2;
                                    if (f.a()) {
                                        int i16 = f24078l + 103;
                                        f24077k = i16 % 128;
                                        int i17 = i16 % 2;
                                        Object[] objArr2 = new Object[1];
                                        q((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 49, 16 - (ViewConfiguration.getEdgeSlop() >> 16), objArr2);
                                        String strIntern = ((String) objArr2[0]).intern();
                                        Object[] objArr3 = new Object[1];
                                        q((char) (61967 - Gravity.getAbsoluteGravity(0, 0)), 1424 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21, objArr3);
                                        f.c(strIntern, ((String) objArr3[0]).intern());
                                    }
                                    return true;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
        }
        if (f.a()) {
            Object[] objArr4 = new Object[1];
            q((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 50, (ViewConfiguration.getTouchSlop() >> 8) + 16, objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            q((char) (AndroidCharacter.getMirror('0') + 694), 1446 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 22, objArr5);
            f.c(strIntern2, ((String) objArr5[0]).intern());
        }
        return false;
    }

    public final a d() throws o.ef.b {
        int i2 = 2 % 2;
        int i3 = f24078l + 121;
        f24077k = i3 % 128;
        int i4 = i3 % 2;
        if (!this.f24084g) {
            return this.f24083f.d(this.f24085h);
        }
        a aVar = new a();
        int i5 = f24077k + 81;
        f24078l = i5 % 128;
        if (i5 % 2 == 0) {
            return aVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x053d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.fj.b d(android.content.Context r28, java.lang.String r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.em.d.d(android.content.Context, java.lang.String):o.fj.b");
    }

    public final o.fj.b d(Context context, a aVar) throws Throwable {
        o.fj.b bVar;
        int i2 = 2 % 2;
        int i3 = f24078l + 39;
        f24077k = i3 % 128;
        int i4 = i3 % 2;
        try {
            Object[] objArr = new Object[1];
            q((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 23962), ExpandableListView.getPackedPositionType(0L) + 754, 6 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            if (aVar.d(((String) objArr[0]).intern())) {
                Object[] objArr2 = new Object[1];
                q((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 23962), (ViewConfiguration.getTouchSlop() >> 8) + 754, 5 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                Object[] objArr3 = {aVar, ((String) objArr2[0]).intern()};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int iMyUid = Process.myUid();
                int i5 = a.f23780n * (-1229108307);
                a.f23780n = i5;
                c cVar = (c) a.a(-1398121910, objArr3, iMyUid, i5, 1398121917, iUptimeMillis, iElapsedRealtime);
                if (f.a()) {
                    Object[] objArr4 = new Object[1];
                    q((char) KeyEvent.keyCodeFromString(""), 49 - KeyEvent.keyCodeFromString(""), 16 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr4);
                    String strIntern = ((String) objArr4[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr5 = new Object[1];
                    q((char) (17979 - Gravity.getAbsoluteGravity(0, 0)), 759 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 33 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr5);
                    f.c(strIntern, sb.append(((String) objArr5[0]).intern()).append(cVar).toString());
                }
                Object[] objArr6 = {this.f24085h, context, e.c(cVar), this.f24083f};
                int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                int iMyUid2 = Process.myUid();
                int i6 = e.f24029h * 1092908448;
                e.f24029h = i6;
                int i7 = e.f24032l * (-28842699);
                e.f24032l = i7;
                bVar = (o.fj.b) e.b(iElapsedRealtime2, 1001399399, i7, iMyUid2, objArr6, i6, -1001399394);
            } else {
                bVar = new o.fj.b();
            }
            if (this.f24084g) {
                this.f24084g = false;
                int i8 = f24078l + 109;
                f24077k = i8 % 128;
                int i9 = i8 % 2;
            }
            return bVar;
        } catch (o.ef.b e2) {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr7 = new Object[1];
            q((char) (KeyEvent.getMaxKeyCode() >> 16), 792 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 39, objArr7);
            throw new o.en.f(sb2.append(((String) objArr7[0]).intern()).append(e2.getMessage()).toString());
        }
    }

    public final LinkedHashMap<String, o.ep.d> e(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f24078l + 79;
        int i4 = i3 % 128;
        f24077k = i4;
        int i5 = i3 % 2;
        if (!z2) {
            return this.f24085h.e();
        }
        int i6 = i4 + 113;
        f24078l = i6 % 128;
        if (i6 % 2 == 0) {
            return this.f24085h.a();
        }
        int i7 = 37 / 0;
        return this.f24085h.a();
    }

    public final List<String> e(Context context, a aVar) throws Throwable {
        c cVar;
        int i2 = 2 % 2;
        try {
            ArrayList arrayList = new ArrayList();
            Object[] objArr = new Object[1];
            q((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1040 - Color.alpha(0), 11 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            if (!aVar.d(((String) objArr[0]).intern())) {
                return arrayList;
            }
            int i3 = f24078l + 65;
            f24077k = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr2 = new Object[1];
                q((char) (ViewConfiguration.getScrollBarSize() << 108), 11151 << Gravity.getAbsoluteGravity(1, 1), 84 << Drawable.resolveOpacity(0, 0), objArr2);
                Object[] objArr3 = {aVar, ((String) objArr2[0]).intern()};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int iMyUid = Process.myUid();
                int i4 = a.f23780n * (-1229108307);
                a.f23780n = i4;
                cVar = (c) a.a(-1398121910, objArr3, iMyUid, i4, 1398121917, iUptimeMillis, iElapsedRealtime);
                if (f.a()) {
                    Object[] objArr4 = new Object[1];
                    q((char) TextUtils.getCapsMode("", 0, 0), 49 - Color.blue(0), (ViewConfiguration.getEdgeSlop() >> 16) + 16, objArr4);
                    String strIntern = ((String) objArr4[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr5 = new Object[1];
                    q((char) (Gravity.getAbsoluteGravity(0, 0) + 59308), (ViewConfiguration.getScrollDefaultDelay() >> 16) + PhotoshopDirectory.TAG_WORKFLOW_URL, 34 - (ViewConfiguration.getTapTimeout() >> 16), objArr5);
                    f.c(strIntern, sb.append(((String) objArr5[0]).intern()).append(cVar).toString());
                    int i5 = f24078l + 81;
                    f24077k = i5 % 128;
                    int i6 = i5 % 2;
                }
            } else {
                Object[] objArr6 = new Object[1];
                q((char) (ViewConfiguration.getScrollBarSize() >> 8), 1040 - Gravity.getAbsoluteGravity(0, 0), 11 - Drawable.resolveOpacity(0, 0), objArr6);
                Object[] objArr7 = {aVar, ((String) objArr6[0]).intern()};
                int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                int iMyUid2 = Process.myUid();
                int i7 = a.f23780n * (-1229108307);
                a.f23780n = i7;
                cVar = (c) a.a(-1398121910, objArr7, iMyUid2, i7, 1398121917, iUptimeMillis2, iElapsedRealtime2);
                if (f.a()) {
                    Object[] objArr42 = new Object[1];
                    q((char) TextUtils.getCapsMode("", 0, 0), 49 - Color.blue(0), (ViewConfiguration.getEdgeSlop() >> 16) + 16, objArr42);
                    String strIntern2 = ((String) objArr42[0]).intern();
                    StringBuilder sb2 = new StringBuilder();
                    Object[] objArr52 = new Object[1];
                    q((char) (Gravity.getAbsoluteGravity(0, 0) + 59308), (ViewConfiguration.getScrollDefaultDelay() >> 16) + PhotoshopDirectory.TAG_WORKFLOW_URL, 34 - (ViewConfiguration.getTapTimeout() >> 16), objArr52);
                    f.c(strIntern2, sb2.append(((String) objArr52[0]).intern()).append(cVar).toString());
                    int i52 = f24078l + 81;
                    f24077k = i52 % 128;
                    int i62 = i52 % 2;
                }
            }
            return this.f24083f.a(context, cVar);
        } catch (o.ef.b e2) {
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr8 = new Object[1];
            q((char) KeyEvent.getDeadChar(0, 0), 792 - View.MeasureSpec.getSize(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 40, objArr8);
            throw new o.en.f(sb3.append(((String) objArr8[0]).intern()).append(e2.getMessage()).toString());
        }
    }

    public final o.fj.b e(Context context, String str) throws Throwable {
        int i2 = 2 % 2;
        o.fj.b bVar = new o.fj.b();
        o.ep.d dVar = this.f24085h.e().get(str);
        if (dVar == null) {
            int i3 = f24078l + 57;
            f24077k = i3 % 128;
            if (i3 % 2 == 0) {
                f.a();
                throw null;
            }
            if (f.a()) {
                Object[] objArr = new Object[1];
                q((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 50, 16 - TextUtils.indexOf("", ""), objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                q((char) KeyEvent.normalizeMetaState(0), 1022 - AndroidCharacter.getMirror('0'), TextUtils.indexOf((CharSequence) "", '0') + 23, objArr2);
                StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(str);
                Object[] objArr3 = new Object[1];
                q((char) (ExpandableListView.getPackedPositionChild(0L) + 51107), 856 - Color.alpha(0), 9 - TextUtils.lastIndexOf("", '0', 0), objArr3);
                f.d(strIntern, sbAppend.append(((String) objArr3[0]).intern()).toString());
            }
            int i4 = f24078l + 31;
            f24077k = i4 % 128;
            int i5 = i4 % 2;
            return bVar;
        }
        if (f.a()) {
            Object[] objArr4 = new Object[1];
            q((char) ExpandableListView.getPackedPositionGroup(0L), 49 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 16, objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr5 = new Object[1];
            q((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 974, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21, objArr5);
            StringBuilder sbAppend2 = sb2.append(((String) objArr5[0]).intern()).append(str);
            Object[] objArr6 = new Object[1];
            q((char) ExpandableListView.getPackedPositionType(0L), 866 - (ViewConfiguration.getPressedStateDuration() >> 16), 24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr6);
            f.c(strIntern2, sbAppend2.append(((String) objArr6[0]).intern()).toString());
        }
        this.f24083f.e(new o.dk.a(context), str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        o.ep.d dVarA = dVar.a();
        linkedHashMap.put(dVarA.b(), dVarA);
        if (f.a()) {
            Object[] objArr7 = new Object[1];
            q((char) TextUtils.indexOf("", "", 0), Process.getGidForName("") + 50, View.MeasureSpec.makeMeasureSpec(0, 0) + 16, objArr7);
            String strIntern3 = ((String) objArr7[0]).intern();
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr8 = new Object[1];
            q((char) KeyEvent.normalizeMetaState(0), 974 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 'F' - AndroidCharacter.getMirror('0'), objArr8);
            StringBuilder sbAppend3 = sb3.append(((String) objArr8[0]).intern()).append(str);
            Object[] objArr9 = new Object[1];
            q((char) (27247 - Gravity.getAbsoluteGravity(0, 0)), 932 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 18, objArr9);
            f.c(strIntern3, sbAppend3.append(((String) objArr9[0]).intern()).toString());
        }
        Object[] objArr10 = {this.f24085h, context, linkedHashMap, this.f24083f};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int iMyUid = Process.myUid();
        int i6 = e.f24029h * 1092908448;
        e.f24029h = i6;
        int i7 = e.f24032l * (-28842699);
        e.f24032l = i7;
        return (o.fj.b) e.b(iElapsedRealtime, 1001399399, i7, iMyUid, objArr10, i6, -1001399394);
    }

    public final o.fj.b e(Context context, o.ep.d dVar) throws Throwable {
        int i2 = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Collections.singletonMap(dVar.b(), dVar));
        if (f.a()) {
            Object[] objArr = new Object[1];
            q((char) (ViewConfiguration.getTouchSlop() >> 8), 49 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 16, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            q((char) (Color.argb(0, 0, 0, 0) + 35597), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 949, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24, objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(dVar.b());
            Object[] objArr3 = new Object[1];
            q((char) (TextUtils.getCapsMode("", 0, 0) + 27247), 934 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 18 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
            f.c(strIntern, sbAppend.append(((String) objArr3[0]).intern()).toString());
        }
        Object[] objArr4 = {this.f24085h, context, linkedHashMap, this.f24083f};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int iMyUid = Process.myUid();
        int i3 = e.f24029h * 1092908448;
        e.f24029h = i3;
        int i4 = e.f24032l * (-28842699);
        e.f24032l = i4;
        o.fj.b bVar = (o.fj.b) e.b(iElapsedRealtime, 1001399399, i4, iMyUid, objArr4, i3, -1001399394);
        int i5 = f24078l + 67;
        f24077k = i5 % 128;
        if (i5 % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    public final void e() {
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i2 = f24074e * 402155285;
        f24074e = i2;
        int i3 = f24072c * 123611159;
        f24072c = i3;
        a(1314848325, -1314848323, new Object[]{this}, i3, iFreeMemory, i2, Thread.currentThread().getPriority());
    }

    public final b f() {
        int i2 = 2 % 2;
        int i3 = f24078l;
        int i4 = i3 + 63;
        f24077k = i4 % 128;
        int i5 = i4 % 2;
        b bVar = this.f24083f;
        int i6 = i3 + 23;
        f24077k = i6 % 128;
        if (i6 % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    public final LinkedHashMap<String, o.ep.d> g() {
        int i2 = 2 % 2;
        int i3 = f24078l + 33;
        f24077k = i3 % 128;
        LinkedHashMap<String, o.ep.d> linkedHashMapE = e(i3 % 2 == 0);
        int i4 = f24077k + 35;
        f24078l = i4 % 128;
        int i5 = i4 % 2;
        return linkedHashMapE;
    }

    public final e j() {
        int i2 = 2 % 2;
        int i3 = f24078l;
        int i4 = i3 + 123;
        f24077k = i4 % 128;
        int i5 = i4 % 2;
        e eVar = this.f24085h;
        int i6 = i3 + 1;
        f24077k = i6 % 128;
        int i7 = i6 % 2;
        return eVar;
    }
}
