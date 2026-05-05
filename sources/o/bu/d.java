package o.bu;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import o.bu.c;
import o.ea.f;
import o.ea.g;
import o.ea.m;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends b {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$j = null;
    private static final int $$k = 0;
    private static final byte[] $$l = null;
    private static final int $$m = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f21681a = 0;

    /* JADX INFO: renamed from: b */
    public static int f21682b = 0;

    /* JADX INFO: renamed from: c */
    public static int f21683c = 0;

    /* JADX INFO: renamed from: d */
    public static int f21684d = 0;

    /* JADX INFO: renamed from: e */
    private static char[] f21685e = null;

    /* JADX INFO: renamed from: f */
    private static int f21686f = 0;

    /* JADX INFO: renamed from: g */
    private static int f21687g = 0;

    /* JADX INFO: renamed from: h */
    private static int f21688h = 0;

    /* JADX INFO: renamed from: i */
    private static int f21689i = 0;

    /* JADX INFO: renamed from: j */
    private static long f21690j = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(short r8, short r9, int r10) {
        /*
            int r0 = r10 * 4
            int r7 = 4 - r0
            int r6 = 105 - r9
            byte[] r5 = o.bu.d.$$l
            int r1 = r8 * 2
            int r0 = 1 - r1
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r5 != 0) goto L29
            r0 = r2
            r1 = r3
        L15:
            int r0 = -r0
            int r6 = r6 + r0
            int r7 = r7 + 1
        L19:
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r1 != r2) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            r0 = r5[r7]
            int r1 = r1 + 1
            goto L15
        L29:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bu.d.$$n(short, short, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        f21683c = 1359731037;
        f21684d = 1266429588;
        f21681a = -479794115;
        f21682b = 1227160155;
        f21689i = 0;
        f21688h = 1;
        f21687g = 0;
        f21686f = 1;
        a();
        ViewConfiguration.getMinimumFlingVelocity();
        ViewConfiguration.getGlobalActionKeyTimeout();
        View.MeasureSpec.getSize(0);
        int i2 = f21689i + 89;
        f21688h = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 55 / 0;
        }
    }

    static void a() {
        char[] cArr = new char[1422];
        ByteBuffer.wrap("¼\n\u0017ÿë\u0096¿¥\u0013Aç|» \u000eÈâõ¶\u0088\n¼Þ{²\u001a\u00069Ùö\u00adº\u0094\u0095?MÃ2\u0097:;«\u0094\u0095?MÃ2\u0097:;¨\u0094\u0093?FÃ\"\u0097\u000e;õÏÙ\u0093\u008a&*ÊM\u009e+\"Xöÿ\u009a³.\u0093ñj\u0085Q)?ýË\u0081ÊU³ù\u0099\u008c{\u0094\u0097?DÃ'\u0097\f;éÏÕ\u0093\u008a&VÊG\u009e9\"\u001aöØ\u009a£.\u008dñ{Ç|l\u00ad\u0090ÔÄùhP\u009c8Àku\u008e\u0099¡Í\u0092qÁ¥1É]}p¢\u009fÖ½\u0094\u009b?LÃ#\u0097\u0012;îÏÙ\u0093\u009a&}Êj\u009e9\"\u0005öÄ\u009a\u0089.\u008fñz\u0085Q\u009bB0\u009aÌå\u0098í4~\u0094\u0095?MÃ2\u0097/;óÏÝ\u0093¨&mÊL\u009e?\"\u0013öÞ\u009aº.\u0092ñw\u0085Z)&ý¨\u0081\u008bUüù\u008c\u008cqP\"ä\u0011\u0088ç\\\u0098àì\u008b,®K\u0005\u0089ùà\u00adÛ\u00016y±Òi.\u0016z\u000bÖ×\"ù~\u008cËI'hs\u001bÏ7\u001búw\u009eÃ¶\u001cSh~Ä\u0002\u0010ûlë¸\u008c\u0014¶a{½\u0006\t$eç±ì\r\u009bf[²&\u000eMZz¶\u009d\u0002¶^\u0082«M\u00078S*¯1ûæW\u0085£¶üTH}¤&ð×L¤\u0098©ôµAD\u009d\u001aé+EÛ\u0091ûGýì%\u0010ZDGè\u009b\u001cµ@Àõ\u0005\u0019$MWñ{%¶IÒýú\"\u001fV2úN.·R§\u0086À*ú_7\u0083J7h[«\u008f 3×X\u0017\u008cj0\u0001d6\u0088Ñ<ú`ó\u0095\u000799ma\u0091lÅ§iØ\u009dïÂPvd\u009a$\u0094\u0095?MÃ2\u0097/;óÏÝ\u0093¨&mÊL\u009e?\"\u0013öÞ\u009aº.\u0092ñw\u0085Z)&ýß\u0081ÏU¨ù\u0092\u008c_P\"ä\u0000\u0088Ã\\Èà¿\u008b\u007f_\u0002ãi·^[¹ï\u0092³\u009bFoêQ¾zB\u0013\u0016Ïº¶N\u0086\u00118¥_I\u001f\u001dª¡Ðu¬\u0019\u0091¬ap-\u0004\b¨è|\u009a\u0000²«{\u007fP\u0003b×\u0011{â\u000fìÓ\u0083fs\n\u001eÞ:b\u001d6ÜÚæn\u008e1\u007fÅQi\n=ýÁ\u0082\u0095â9ÖÌM\u0090($\u000fÈì\u009cÀ »Ëf\u009fA\u0094\u0095?MÃ2\u0097/;óÏÝ\u0093¨&mÊL\u009e?\"\u0013öÞ\u009aº.\u0092ñw\u0085Z)&ýß\u0081ÏU¨ù\u0092\u008c_P\"ä\u0000\u0088Ã\\Èà¿\u008b\u007f_\u0002ãi·^[¹ï\u0092³\u008eFoêR¾=B\u0015\u0016Üº´N\u0090\u0011q¥XI\u0018\u001dã¡Îu¹\u0019Ô¬qp)\u0004\b¨¼|Ø\u0000µ«.\u007fW\u0003.×\u0017{á\u000fìÓ\u008bfn\nZÞtb\u00016ÁÚ«nÜ1yÅQi\u001c=àÁ\u0082\u0095±9\u0085Ì\f\u00908$\u0005Èÿ\u009cÐ «\u0094\u0094?ZÃh\u0097\u001d;ôÏÄ\u0093\u008b&hÊM\u009e(\"XöÍ\u009a¤.\u0094ñ{\u0085X)=ýø\u0081ÎU¿ù\u009f\u008c|P'ä\u0006\u0088ð\\Ùà¤\u008bu_uã3·\u0016[õïÀ³\u008dFbêc¾*B\u0002\u0016Ëº¢N\u0087\u0011j¥SI\u0002\u001dé¡Åu\u00addÂÏ\u000e3pgO\u0094\u0095?MÃ2\u0097/;óÏÝ\u0093¨&mÊL\u009e?\"\u0013öÞ\u009aº.\u0092ñw\u0085Z)&ýß\u0081ÏU¨ù\u0092\u008c_P\"ä\u0000\u0088Ã\\Èà¿\u008b\u007f_\u0002ãi·^[¹ï\u0092³\u008dFkêL¾.B\t\u0016\u008eº¢N\u008b\u0011}¥ZI\b\u001dù¡\u0080u°\u0019\u009b¬fph\u0004\u0003¨ä|Ê\u0000µ«m\u007fP\u0003'×\u001c{¶\u000f¸Ó\u0085f \n\\Þ1bR6ÚÚ£n\u00881oÅBi\u0000=áÁÆ\u0095ø9\u0094ÌU\u0090j$\u0013È÷\u009cÙ òËk\u009fG#.÷\u001e\u001aô±,MS\u0019Nµ\u0092A¼\u001dÉ¨\fD-\u0010^¬rx¿\u0014Û ó\u007f\u0016\u000b;§Gs¾\u000f®ÛÉwó\u0002>ÞCja\u0006¢Ò©nÞ\u0005\u001eÑcm\b9?ÕØaó=úÈ\bd00^Ì1\u0098¼4ÌÀî\u009fY+4Çl\u0093\u0099/¥û\u009f\u0097ó\"\u001aþL\u008ak&\u0099ò¨\u008e\u0091%\u000eñ7\u008dFY9õ\u0092\u0081À]ûè\u0015\u0084&P\u0015ìd¸¡TÎàñ¿\u001eKqç\\³\u008cO®\u001b\u0099·ôB,\u001eYªeFß\u0012¼®ÀEI\u00115\u00adXyz\u0015\u0095¡Ö}¥\bY¤yp@\f\u008cØ¢tÕ\u0000öß\u001bk4´\u008e\u001fVã)·4\u001bèïÆ³³\u0006vêW¾$\u0002\bÖÅº¡\u000e\u0089Ñl¥A\t=ÝÄ¡Ôu³Ù\u0089¬Dp9Ä\u001b¨Ø|ÓÀ¤«d\u007f\u0019Ãr\u0097E{¢Ï\u0089\u0093\u0080ftÊJ\u009eab\b6Ô\u009a\u00adn\u009d1#\u0085Ki\u001e=ô\u0081×U¡9Ï\u008c~P2$\u0014\u0088ó\\È ¥\u008br_\u001f#-÷\n[à/²ó\u009eFn*QíÚF\u0002º}î`B¼¶\u0092êç_\"³\u0003çp[\\\u008f\u0091ãõWÝ\u00888ü\u0015Pi\u0084\u0090ø\u0080,ç\u0080Ýõ\u0010)m\u009dOñ\u008c%\u0087\u0099ðò0&M\u009a&Î\u0011\"ö\u0096ÝÊÔ?&\u0093\u001eÇp;\u001fo\u0092Ãâ7ÀhwÜ\u001a0Bd·Ø\u008b\f±`ÝÕ4\tb}EÑ·\u0005\u0086y¿Ò \u0006\u0019zh®\u0017\u0002ªv÷ªÌ\u001f#s\u001d§;\u001bXO\u008a£ù\u0017ÇH,¼_\u0010@D\u00ad¸\u0099ìò@ËµCér]N±¸å\u008fYô²)æ\u000eZ3\u008e\u000fâÿVå\u008aÎÿ;S\u001e\u0087zû¦/Å\u0083æ÷Â({\u009c\u0013ðH$¾\u0098ÓÌð Ç\u0095\u0011Én=N\u0091£Å\u009c9Ç\u0092eÆ\u001b:~n\u001bÂ¯6âjÝß&3\u0007gqÛá\u000f\u0085cø×Û\b5|#ÐV\u0004¦x\u009c¬»\u0000Þu\u0006©{\u001dWqõ¥\u0099\u0019Èr.¦\u0001\u001asNJ\u0094\u0095?MÃ2\u0097/;óÏÝ\u0093¨&mÊL\u009e?\"\u0013öÞ\u009aº.\u0092ñw\u0085Z)&ýß\u0081ÏU¨ù\u0092\u008c_P\"ä\u0000\u0088Ã\\Èà¿\u008b\u007f_\u0002ãi·^[¹ï\u0092³\u009aFcê]¾>B\u0019\u0016Àº£NÂ\u0011y¥QI\r\u001dã¡Îuþ\u0019\u0087¬{p%\u0004F¨ÿ|Û\u0000¢«j\u007f\u0004\u0003$×\u0011{ó\u000f Ó\u008efsÙÇr\u001f\u008e`Ú}v¡\u0082\u008fÞúk?\u0087\u001eÓmoA»\u008c×ècÀ¼%È\bdt°\u008dÌ\u009d\u0018ú´ÀÁ\f\u001dy©AÅ\u0091\u0011\u009a\u00adíÆ-\u0012P®;\u0094\u0081?KÃ.\u0094\u0095?MÃ2\u0097/;óÏÝ\u0093¨&mÊL\u009e?\"\u0013öÞ\u009aº.\u0092ñw\u0085Z)&ýß\u0081ÏU¨ù\u0092\u008c^P+ä\u0013\u0088Ã\\Èà¿\u008b\u007f_\u0002ãi·^[¹ï\u0092³\u0086Fiê\u001c¾\tB9\u0016ãºäN\u0081\u0011y¥DI\b\u001dª¡Ðu¬\u0019\u0091¬ap-\u0004\b¨è|\u009a\u0000¹«`\u007f\u0004\u00036×\u0010{ó\u000fìÓ\u008efe\nHÞ=b\u00116Í0L\u009b\u0094gë3ö\u009f*k\u00047q\u0082´n\u0095:æ\u0086ÊR\u0007>c\u008aKU®!\u0083\u008dÿY\u0006%\u0016ñq]K(\u0087ôò@Ê,\u001aø\u0011Df/¦ûÛG°\u0013\u0087ÿ`KK\u0017PâÿN¶\u001aÊæä²W\u001e~êZµ³\u0001\u008bí\u0095¹:\u0005\nÑ'½_\b®Ôö Ö\f6Ø\u0017¤l\u000f¥Û\u0098§ÿ\u0094\u0095?MÃ2\u0097/;óÏÝ\u0093¨&mÊL\u009e?\"\u0013öÞ\u009aº.\u0092ñw\u0085Z)&ýß\u0081ÏU¨ù\u0092\u008c^P+ä\u0013\u0088Ã\\Èà¿\u008b\u007f_\u0002ãi·^[¹ï\u0092³\u0085FgêH¾9B\u0018\u0016\u008eº¢N\u008d\u0011m¥XI\b\u001dª¡×u·\u0019\u0080¬zph\u0004\u0012¨ô|ß\u0000ð«|\u007fA\u0003%×\u0011{å\u000f¸Ó\u008ffr\n[Þ0bR6ûÚ\u008fn±1:ÅSi\u000f=öÁÆ\u0094\u0095?MÃ2\u0097/;óÏÝ\u0093¨&mÊL\u009e?\"\u0013öÞ\u009aº.\u0092ñw\u0085Z)&ýß\u0081ÏU¨ù\u0092\u008c^P+ä\u0013\u0088Ã\\Èà¿\u008b\u007f_\u0002ãi·^[¹ï\u0092³\u0086Fiê\u001c¾7B\u0011\u0016Úº§N\u008a\u00118¥PI\u0003\u001dÿ¡Îuº\u0019Ô¬ep!\u0004\u0012¨ô|\u009a\u0000¤«f\u007fA\u0003b×\n{ó\u000f«Ó\u0083fs\nJÞ1b\u00006ÍÚ¢nÜ1IÅyi#=¤ÁÁ\u0095¹9\u0084ÌH\u0094\u0096?MÃ0\u0097\u0015;ùÏÕ\u0093¯&hÊN\u009e7\"\u0001öß\u009a\u0099.\u0089ñs\u0085})<ýî\u0081ÉU\u008eù\u009f\u008cqP*ä\r\u0088ì\\ßàö\u008b!_\nã\"·\f[õïÜ³\u008cF&ê\u0006¾zBU\u0016ÝºäNÏ\u00118¥[I\u0003\u001dî¡Åu²\u0019Ô¬(ph\u0004C¨ï¼Q\u0017\u0083ëí¿ß\u00132ç\u0011ëæ@\u0017¼dèSD³°Êì\u0080\u0094¼?MÃ>\u0097\t;éÏ\u0090\u0093Û]Köº\nÉ^þò\u001e\u0006gZ/ê\u0015AÀ½¤é\u0088Es±_í\fX¬´Ôà»\\\u0082\u0088Gä%P\u0015\u008fëûÛW»\u0083`ÿ\u000e+\b\u00879ò×.\u008c\u009a½öT\"v\u009e\u001fõÄ!é\u009d\u0099É«%F\u0091uÍ:8ÅÕÀ~\u0018\u0082gÖmzª\u008e\u0093ÒÒg2\u008b\u0012ßDcN·\u009cÛöoó°\"Ä\u000fh`¼¸À\u0081\u0014ù¸ÝÍ,\u0011u¥EÉ÷\u001dÀ¡£Ê\t\u001e\u001a¢göF\u001a¨®\u0094òÎ\u0007:«\u0006ÿa\u0003\u0005W\u0096ûø\u000fÄP>ä\n\bW\\¸àÕ4±X\u0081í&1sEWé»=\u0080Aìê?>_Bg\u0096H:±Nô\u0092Ö'&K\u0018\u009fh#Hw\u0093\u009b½/ûp\n\u0084$(\u007f|\u008e\u0080§ÔÅxì\u008d7ÑZej\u0089\u0098ÝµaÆ\u008a\tÞ6\u0094\u0095?MÃ2\u00978;ÿÏÆ\u0093\u0087&gÊG\u009e\u0011\"\u001böÉ\u009a£.¦ñw\u0085Z)5ýí\u0081ÔU¬ù\u0088\u008cyP ä\u0010\u0088ª\\\u0091àö\u008b!_\n".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1422);
        f21685e = cArr;
        f21690j = -2966124964372857048L;
    }

    private static String b(Context context) throws Throwable {
        SubscriptionInfo next;
        SubscriptionInfo next2;
        int i2 = 2 % 2;
        int i3 = f21687g + 65;
        f21686f = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        o((char) (10431 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16, objArr);
        String strIntern = ((String) objArr[0]).intern();
        short sXd = (short) (C1607wl.Xd() ^ 4055);
        int[] iArr = new int["\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u000b\u0016\u0014\u0019\t\u0011\u0016Nb\u000e\f\u0011\u0001\u0013\u000e".length()];
        QB qb = new QB("\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u000b\u0016\u0014\u0019\t\u0011\u0016Nb\u000e\f\u0011\u0001\u0013\u000e");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(sXd + sXd + sXd + i5 + xuXd.CK(iKK));
            i5++;
        }
        Object[] objArr2 = {SubscriptionManager.class};
        Method method = Class.forName(new String(iArr, 0, i5)).getMethod(C1561oA.od("jguSxqqahM^jm_XY", (short) (C1499aX.Xd() ^ (-27962))), Class.forName(C1593ug.zd("\u0007~\u0015\u0001N\u000e\u0004\u0012\fSi\u0014\n\u001d\u001e", (short) (ZN.Xd() ^ 7250), (short) (ZN.Xd() ^ 20900))));
        try {
            method.setAccessible(true);
            SubscriptionManager subscriptionManager = (SubscriptionManager) method.invoke(context, objArr2);
            if (!(!f.a())) {
                Object[] objArr3 = new Object[1];
                o((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 19795), 890 - TextUtils.indexOf((CharSequence) "", '0', 0), 30 - Gravity.getAbsoluteGravity(0, 0), objArr3);
                f.c(strIntern, ((String) objArr3[0]).intern());
            }
            Object[] objArr4 = new Object[1];
            o((char) (ViewConfiguration.getEdgeSlop() >> 16), 394 - View.resolveSize(0, 0), 47 - View.combineMeasuredStates(0, 0), objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Class<?> cls = Class.forName(C1561oA.Kd("[i`omhd/erryku|7Mzz\u0002s\b\u0005", (short) (C1499aX.Xd() ^ (-15576))));
            Class<?>[] clsArr = new Class[2];
            short sXd2 = (short) (ZN.Xd() ^ 1163);
            short sXd3 = (short) (ZN.Xd() ^ 2726);
            int[] iArr2 = new int["y\u0018x\u00171\u0013] dNA\u0018Y\u0016F\u0013".length()];
            QB qb2 = new QB("y\u0018x\u00171\u0013] dNA\u0018Y\u0016F\u0013");
            int i6 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i6] = xuXd2.fK(((i6 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                i6++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i6));
            clsArr[1] = Integer.TYPE;
            Object[] objArr5 = {strIntern2, 0};
            Method method2 = cls.getMethod(C1561oA.Xd("\u0018\u0017'\u0007\u001d\u0017)\u001d\u001d\n-!##1%/%(7", (short) (OY.Xd() ^ 19917)), clsArr);
            try {
                method2.setAccessible(true);
                SharedPreferences sharedPreferences = (SharedPreferences) method2.invoke(context, objArr5);
                Object[] objArr6 = new Object[1];
                o((char) ((-1) - TextUtils.lastIndexOf("", '0')), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 921, 3 - TextUtils.getOffsetBefore("", 0), objArr6);
                String string = sharedPreferences.getString(((String) objArr6[0]).intern(), "");
                if (string.isEmpty()) {
                    int i7 = f21686f + 85;
                    f21687g = i7 % 128;
                    int i8 = i7 % 2;
                    List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
                    if (activeSubscriptionInfoList != null) {
                        Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
                        while (it.hasNext()) {
                            next2 = it.next();
                            if (next2 != null) {
                                break;
                            }
                        }
                        next2 = null;
                    } else {
                        next2 = null;
                    }
                    if (next2 == null) {
                        if (f.a()) {
                            Object[] objArr7 = new Object[1];
                            o((char) (Process.myTid() >> 22), 924 - TextUtils.getTrimmedLength(""), ExpandableListView.getPackedPositionChild(0L) + 67, objArr7);
                            f.c(strIntern, ((String) objArr7[0]).intern());
                        }
                        return "";
                    }
                    Object[] objArr8 = {next2.getIccId()};
                    int i9 = f21682b * 870472106;
                    f21682b = i9;
                    int priority = Thread.currentThread().getPriority();
                    int i10 = f21681a * (-1031928857);
                    f21681a = i10;
                    String str = (String) d(159975086, i9, i10, new Random().nextInt(101531181), objArr8, -159975086, priority);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    Object[] objArr9 = new Object[1];
                    o((char) (ViewConfiguration.getTapTimeout() >> 16), Color.alpha(0) + 921, 3 - TextUtils.getTrimmedLength(""), objArr9);
                    editorEdit.putString(((String) objArr9[0]).intern(), str).commit();
                    return next2.getIccId();
                }
                if (f.a()) {
                    Object[] objArr10 = new Object[1];
                    o((char) (42201 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 990 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 57 - TextUtils.getCapsMode("", 0, 0), objArr10);
                    f.c(strIntern, ((String) objArr10[0]).intern());
                }
                List<SubscriptionInfo> activeSubscriptionInfoList2 = subscriptionManager.getActiveSubscriptionInfoList();
                if (activeSubscriptionInfoList2 == null) {
                    if (f.a()) {
                        int i11 = f21686f + 41;
                        f21687g = i11 % 128;
                        int i12 = i11 % 2;
                        Object[] objArr11 = new Object[1];
                        o((char) View.MeasureSpec.getSize(0), 924 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 65, objArr11);
                        f.c(strIntern, ((String) objArr11[0]).intern());
                    }
                    SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                    Object[] objArr12 = new Object[1];
                    o((char) ((-1) - TextUtils.lastIndexOf("", '0')), 921 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3, objArr12);
                    editorEdit2.putString(((String) objArr12[0]).intern(), "").commit();
                    return "";
                }
                for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList2) {
                    if (subscriptionInfo != null) {
                        int i13 = f21687g + 83;
                        f21686f = i13 % 128;
                        if (i13 % 2 == 0) {
                            Object[] objArr13 = {subscriptionInfo.getIccId()};
                            int i14 = f21682b * 870472106;
                            f21682b = i14;
                            int priority2 = Thread.currentThread().getPriority();
                            int i15 = f21681a * (-1031928857);
                            f21681a = i15;
                            ((String) d(159975086, i14, i15, new Random().nextInt(101531181), objArr13, -159975086, priority2)).equals(string);
                            throw null;
                        }
                        Object[] objArr14 = {subscriptionInfo.getIccId()};
                        int i16 = f21682b * 870472106;
                        f21682b = i16;
                        int priority3 = Thread.currentThread().getPriority();
                        int i17 = f21681a * (-1031928857);
                        f21681a = i17;
                        if (((String) d(159975086, i16, i17, new Random().nextInt(101531181), objArr14, -159975086, priority3)).equals(string)) {
                            if (f.a()) {
                                int i18 = f21686f + 93;
                                f21687g = i18 % 128;
                                int i19 = i18 % 2;
                                Object[] objArr15 = new Object[1];
                                o((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), Color.rgb(0, 0, 0) + 16778263, Color.blue(0) + 73, objArr15);
                                f.c(strIntern, ((String) objArr15[0]).intern());
                            }
                            return subscriptionInfo.getIccId();
                        }
                    }
                }
                if (f.a()) {
                    int i20 = f21686f + 57;
                    f21687g = i20 % 128;
                    int i21 = i20 % 2;
                    Object[] objArr16 = new Object[1];
                    o((char) View.MeasureSpec.makeMeasureSpec(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1119, 76 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr16);
                    f.c(strIntern, ((String) objArr16[0]).intern());
                }
                Iterator<SubscriptionInfo> it2 = activeSubscriptionInfoList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (next != null) {
                        break;
                    }
                }
                if (next == null) {
                    if (f.a()) {
                        int i22 = f21687g + 27;
                        f21686f = i22 % 128;
                        int i23 = i22 % 2;
                        Object[] objArr17 = new Object[1];
                        o((char) (ExpandableListView.getPackedPositionChild(0L) + 1), KeyEvent.normalizeMetaState(0) + 924, (ViewConfiguration.getWindowTouchSlop() >> 8) + 66, objArr17);
                        f.c(strIntern, ((String) objArr17[0]).intern());
                    }
                    return "";
                }
                Object[] objArr18 = {next.getIccId()};
                int i24 = f21682b * 870472106;
                f21682b = i24;
                int priority4 = Thread.currentThread().getPriority();
                int i25 = f21681a * (-1031928857);
                f21681a = i25;
                String str2 = (String) d(159975086, i24, i25, new Random().nextInt(101531181), objArr18, -159975086, priority4);
                SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                Object[] objArr19 = new Object[1];
                o((char) (ViewConfiguration.getEdgeSlop() >> 16), 922 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), View.resolveSize(0, 0) + 3, objArr19);
                editorEdit3.putString(((String) objArr19[0]).intern(), str2).commit();
                return next.getIccId();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x037b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String c(android.content.Context r19, boolean r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1143
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bu.d.c(android.content.Context, boolean):java.lang.String");
    }

    public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) throws Throwable {
        int i8 = ~i2;
        int i9 = ~((~i3) | i8);
        int i10 = ~i6;
        int i11 = ~(i10 | i2);
        int i12 = (-1) - (((-1) - i9) & ((-1) - i11));
        int i13 = ~((-1) - (((-1) - i8) & ((-1) - i6)));
        int i14 = (i12 + i13) - (i12 & i13);
        int i15 = ~(((i10 + i8) - (i10 & i8)) | i3);
        int i16 = i11 | i13;
        int i17 = ~((-1) - (((-1) - i3) & ((-1) - i8)));
        int i18 = (i17 + i16) - (i17 & i16);
        int i19 = i6 + i2 + i7 + (2052055731 * i4) + (1687666023 * i5);
        int i20 = i19 * i19;
        int i21 = (i6 * (-1966771951)) + 1000013824 + ((-1966771951) * i2) + ((-617538080) * i14) + ((-926307120) * i15) + (308769040 * i18) + (2019426304 * i7) + (632946688 * i4) + ((-741212160) * i5) + (2121465856 * i20);
        int i22 = (i6 * 1533266457) + 1248777597 + (i2 * 1533266457) + (i14 * (-800)) + (i15 * (-1200)) + (i18 * 400) + (i7 * 1533266057) + (i4 * 706030027) + (i5 * 1023530015) + (i20 * (-2088042496));
        if (i21 + (i22 * i22 * 1434255360) == 1) {
            int i23 = 2 % 2;
            int i24 = f21687g;
            int i25 = i24 + 53;
            f21686f = i25 % 128;
            int i26 = i25 % 2 == 0 ? 1 : 0;
            int i27 = i24 + 63;
            f21686f = i27 % 128;
            int i28 = i27 % 2;
            return Integer.valueOf(i26);
        }
        String str = (String) objArr[0];
        int i29 = 2 % 2;
        int i30 = f21687g + 61;
        f21686f = i30 % 128;
        int i31 = i30 % 2;
        byte[] bArrC = o.eh.e.c(str.getBytes(g.c()));
        short sXd = (short) (Od.Xd() ^ (-1758));
        short sXd2 = (short) (Od.Xd() ^ (-24390));
        int[] iArr = new int["[i`omhd/wwmq4Ii|oA@".length()];
        QB qb = new QB("[i`omhd/wwmq4Ii|oA@");
        int i32 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i32] = xuXd.fK((xuXd.CK(iKK) - (sXd + i32)) + sXd2);
            i32++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i32));
        Class<?>[] clsArr = {byte[].class, Integer.TYPE};
        Object[] objArr2 = {bArrC, 10};
        short sXd3 = (short) (C1580rY.Xd() ^ (-20918));
        short sXd4 = (short) (C1580rY.Xd() ^ (-7658));
        int[] iArr2 = new int["\u001ddVo\"H4Zz1Lp\u0013\u0013".length()];
        QB qb2 = new QB("\u001ddVo\"H4Zz1Lp\u0013\u0013");
        int i33 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i33] = xuXd2.fK(xuXd2.CK(iKK2) - ((i33 * sXd4) ^ sXd3));
            i33++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i33), clsArr);
        try {
            declaredMethod.setAccessible(true);
            String str2 = (String) declaredMethod.invoke(null, objArr2);
            int i34 = f21687g + 29;
            f21686f = i34 % 128;
            int i35 = i34 % 2;
            return str2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String d(Context context, boolean z2) throws Throwable {
        String strB;
        int i2 = 2 % 2;
        int i3 = f21686f + 5;
        f21687g = i3 % 128;
        if (i3 % 2 == 0 || Build.VERSION.SDK_INT >= 47) {
            int i4 = f21687g + 91;
            f21686f = i4 % 128;
            if (i4 % 2 == 0) {
                b(context);
                throw null;
            }
            strB = b(context);
        } else {
            strB = c(context, z2);
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            o((char) (View.MeasureSpec.getSize(0) + 10430), (-1) - TextUtils.lastIndexOf("", '0'), 16 - View.MeasureSpec.getSize(0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            o((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 99 - Process.getGidForName(""), 28 - Color.green(0), objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(strB).toString());
        }
        if (strB.length() != 0) {
            return m.c(strB);
        }
        int i5 = f21686f + 59;
        f21687g = i5 % 128;
        int i6 = i5 % 2;
        return strB;
    }

    private static String e(String str) {
        Object[] objArr = {str};
        int i2 = f21682b * 870472106;
        f21682b = i2;
        int priority = Thread.currentThread().getPriority();
        int i3 = f21681a * (-1031928857);
        f21681a = i3;
        return (String) d(159975086, i2, i3, new Random().nextInt(101531181), objArr, -159975086, priority);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0186, code lost:
    
        if (r6.equals(((java.lang.String) r0[0]).intern()) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0188, code lost:
    
        r1 = o.bu.d.f21686f + 23;
        o.bu.d.f21687g = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0191, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01b7, code lost:
    
        if (r6.equals(((java.lang.String) r0[0]).intern()) == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean e() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bu.d.e():boolean");
    }

    private static String i(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21687g + 87;
        f21686f = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        o((char) (TextUtils.lastIndexOf("", '0') + 32391), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1275, (ViewConfiguration.getScrollBarSize() >> 8) + 35, objArr);
        if (o.bw.a.e(context, ((String) objArr[0]).intern())) {
            o.ea.c.a();
            String strD = o.ea.b.d(context);
            if (f.a()) {
                Object[] objArr2 = new Object[1];
                o((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 10430), View.combineMeasuredStates(0, 0), 16 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr3 = new Object[1];
                o((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1393, (-16777187) - Color.rgb(0, 0, 0), objArr3);
                f.c(strIntern, sb.append(((String) objArr3[0]).intern()).append(strD).toString());
            }
            return m.c(strD != null ? strD : "");
        }
        if (f.a()) {
            int i5 = f21686f + 23;
            f21687g = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr4 = new Object[1];
            o((char) (TextUtils.indexOf((CharSequence) "", '0') + 10431), 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 16 - TextUtils.getOffsetBefore("", 0), objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            o((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16725), 1310 - (ViewConfiguration.getEdgeSlop() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 83, objArr5);
            f.d(strIntern2, ((String) objArr5[0]).intern());
            int i7 = f21687g + 47;
            f21686f = i7 % 128;
            int i8 = i7 % 2;
        }
        throw new c(c.EnumC0345c.f21674c);
    }

    static void init$0() {
        $$d = new byte[]{88, 0, 126, -69};
        $$e = 100;
    }

    static void init$1() {
        $$j = new byte[]{97, 98, -19, -80, MessagePack.Code.BIN16, 59, 5, MessagePack.Code.INT32, 57, MessagePack.Code.EXT32, Ascii.DC4, MessagePack.Code.BIN16, 59, 10, MessagePack.Code.UINT16, 57};
        $$k = 43;
    }

    static void init$2() {
        $$l = new byte[]{44, 115, -31, MessagePack.Code.FLOAT32};
        $$m = 241;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0318  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void o(char r25, int r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bu.d.o(char, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002a -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(int r9, int r10, byte r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = o.bu.d.$$d
            int r2 = r11 * 4
            int r1 = 1 - r2
            int r7 = r10 + 4
            int r0 = r9 * 3
            int r0 = r0 + 98
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r8 != 0) goto L2d
            r1 = r7
            r0 = r4
            r3 = r5
        L16:
            int r0 = -r0
            int r7 = r7 + r0
            r2 = r3
        L19:
            byte r0 = (byte) r7
            r6[r2] = r0
            int r1 = r1 + 1
            int r3 = r2 + 1
            if (r2 != r4) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            r12[r5] = r0
            return
        L2a:
            r0 = r8[r1]
            goto L16
        L2d:
            r2 = r5
            r1 = r7
            r7 = r0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bu.d.p(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0010). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void q(int r8, short r9, byte r10, java.lang.Object[] r11) {
        /*
            int r8 = r8 + 1
            byte[] r7 = o.bu.d.$$j
            int r6 = r10 + 4
            int r0 = r9 + 98
            byte[] r5 = new byte[r8]
            r4 = 0
            if (r7 != 0) goto L28
            r0 = r8
            r1 = r6
            r3 = r4
        L10:
            int r6 = r6 + r0
            int r6 = r6 + (-6)
            r2 = r3
        L14:
            byte r0 = (byte) r6
            int r3 = r2 + 1
            r5[r2] = r0
            if (r3 != r8) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r11[r4] = r0
            return
        L23:
            int r1 = r1 + 1
            r0 = r7[r1]
            goto L10
        L28:
            r2 = r4
            r1 = r6
            r6 = r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bu.d.q(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x048e  */
    @Override // o.bu.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(android.content.Context r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1807
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bu.d.a(android.content.Context):java.lang.String");
    }

    @Override // o.bu.b
    public final int d() {
        int iMyTid = Process.myTid();
        int i2 = f21684d * (-1914505096);
        f21684d = i2;
        int iActiveCount = Thread.activeCount();
        int i3 = (-208686702) * f21683c;
        f21683c = i3;
        return ((Integer) d(78066374, iMyTid, iActiveCount, i3, new Object[]{this}, -78066373, i2)).intValue();
    }

    @Override // o.bu.b
    public final String e(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21687g + 49;
        f21686f = i3 % 128;
        if (i3 % 2 == 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            int i4 = f21686f + 55;
            f21687g = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            o((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10429), 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 17 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            o((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 21 - TextUtils.indexOf("", "", 0), 5 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        String strD = d(context);
        return strD != null ? strD : "";
    }

    @Override // o.bu.b
    public final String e(Context context, boolean z2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21686f + 5;
        f21687g = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f21686f + 101;
            f21687g = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            o((char) (10430 - (ViewConfiguration.getEdgeSlop() >> 16)), TextUtils.getOffsetAfter("", 0), 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            o((char) KeyEvent.normalizeMetaState(0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17, (Process.myTid() >> 22) + 5, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        String strD = d(context, z2);
        int i7 = f21687g + 69;
        f21686f = i7 % 128;
        if (i7 % 2 != 0) {
            return strD;
        }
        throw null;
    }
}
