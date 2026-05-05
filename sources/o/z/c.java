package o.z;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.google.common.base.Ascii;
import fr.antelop.sdk.card.CreateCardRequestBuilder;
import fr.antelop.sdk.card.CreateCardRequestPanSource;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import o.a.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static char[] B = null;
    private static long D = 0;
    private static int H = 0;
    private static int I = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f27415a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f27416b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f27417c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f27418d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f27419e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f27420g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f27421h = 0;
    private final boolean A;
    private final String C;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f27422f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f27423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f27424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final o.ed.a f27425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f27426l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f27427m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f27428n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final CreateCardRequestPanSource f27429o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f27430p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f27431q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final byte[] f27432r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f27433s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final o.ed.a f27434t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f27435u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final byte[] f27436v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final byte[] f27437w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final byte[] f27438x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f27439y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final String f27440z;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, int r9, byte r10) {
        /*
            int r0 = r10 * 4
            int r7 = 4 - r0
            int r0 = r9 * 3
            int r6 = 1 - r0
            byte[] r5 = o.z.c.$$a
            int r4 = r8 + 99
            byte[] r3 = new byte[r6]
            r2 = 0
            if (r5 != 0) goto L26
            r0 = r6
            r1 = r2
        L13:
            int r7 = r7 + 1
            int r4 = r4 + r0
        L16:
            byte r0 = (byte) r4
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 != r6) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L23:
            r0 = r5[r7]
            goto L13
        L26:
            r1 = r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.z.c.$$c(byte, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f27420g = -768575352;
        f27421h = 1356856629;
        f27415a = -655128216;
        f27416b = -1454000393;
        f27419e = 1696817443;
        f27417c = -2080355809;
        f27418d = 816152902;
        I = 0;
        H = 1;
        char[] cArr = new char[2269];
        ByteBuffer.wrap("\u0094±\u0001ý¾mTäÁr\u007fæ\u0014_\u0082ø?hÕóBBøÈ\u0095_\u0003Þ¸AVÒÃVyý\u0016M\u008cÜ9Z××L)ú»\u0094°\u0001à¾|TíÁ&\u007f¤\u0014z\u0082ð?tÕöB~øÎ\u0095G\u0003Ê¸HVàÃAyÜ\u0016W\u008cÀ9X×ÇL\u0002ú¼\u0097'\r¥º%P¯Íy{û\u00105\u008e¿;6ÑÏNOä\u0087\u0091\u000f\u000f\u008d¤[RÙÏUe×\u0012W\u008fh%öÒ{Híås\u0093û\b[¦ùSaÉóf4\u001c\u008c\u0089\u0006'\u008aÜ\u0000JÌç\\\u009dÍ\nO ð]XËÕ`&\u001e¼\u008b6!áÞctºá0\u009f¿4;¢´_\u001eõÎb\u000f\u0018\u0081µ\u0007#\u008bØ\u0011v\u009dã\u0011Ò\u009eGÎøR\u0012Ã\u0087\b9\u008aRTÄÞyZ\u0093Ø\u0004P¾àÓiEäþf\u0010Î\u0085o?òPyÊî\u007fv\u0091é\n,¼\u0092Ñ\tK\u008bü\u000b\u0016\u0081\u008bW=ÕV\u001bÈ\u0091}\u0018\u0097á\ba¢©×!I£âu\u0014÷\u0089{#ùTyÉFcØ\u0094U\u000eÃ£]ÕÕNuà×\u0015O\u008fÝ \u001aZ¢Ï(a¤\u009a.\fâ¡rÛãLaæÞ\u001bv\u008dû&\bX\u0092Í\u0018gÏ\u0098M2\u0094§\u001eÙ\u0091r\u0015ä\u009a\u00190³à$0^¤ó+e©\u009e70¿¥5ß½p9\u0094\u0092\u0001é¾aTëÁg\u007fí\u0014\u007f\u0082ð?{ÕûBQøÎ\u0095M\u0003Ä¸QVÏÃVyñ\u0016M\u008cØ9T×ÖL>ú©\u0097j\rªº5P®Í*{û\u00107\u008e¾;<Ñ\u009bN\tä\u008c\u0091\b\u000fÃ¤\u001eR\u009cÏ\u000ee\u0080\u0012\u0015\u008fh%àÒ+Hµå!\u0093ã\bq¦üS5É f'\u001c\u008c\u0089J'ÂÜFJÒ\u0090á\u0005ÖºXPÔÅA{ñ\u0010]\u0086Ã;JÑÊFJüþ\u0091[\u0007ü¼sRúÇc}å\u0012x\u0088È=lÓáH\u0017þÚ\u0093^\t\u0095¾\u001dT\u008cÉ\u0006\u007f\u008b\u0014\u0013\u008aÅ?\u0013ÕµJ8à´\u00954\u000b¾ &V¨Ë*\u0094\u0092\u0001â¾lTàÁu\u007fÅ\u0014i\u0082÷?~ÕþB~øÊ\u0095o\u0003È¸GVÎÃWyÑ\u0016L\u008cü9X×ÕL#ú©\u0097j\rªº5P®Í*{û\u00106\u008e´;rÑ\u008dN\rä\u0091\u0091\u0011\u000f\u0086¤\u0019R\u0097ÏZeÇ\u0012P\u008fl%àÒoH¤å4\u0093°\b+¦ªS-É®f3\u001cÀ\u0089F'ÄÜ@d\u001eñjN÷¤z1ÿ\u008fjäârVÏ÷%i²ø\bheÆóGH\u0088¦@3Û\u0089@æÀ|\u0019ÉÙ'P¼®\n1g§ý\"J¢ q=°\u008b2à¬~*Ë»!\u0006¾\u008a\u0014IaÚÿOT\u0091¢\u001b?\u0092\u0095[âÏ\u007f³Õ\"\"ä¸`\u0015ìc|\u0094°\u0001à¾|TíÁ&\u007fã\u0014~\u0082ð?tÕ÷B0øÌ\u0095@\u0003Ï¸\u0004VÁÃ@yÖ\u0016V\u008cù9S×ÝL+ú½\u0097\"\r§º`P»Í7{¾\u00108\u008eµ;!ÑÏN\fä\u0080\u0091\u0000\u000f\u008a¤\u0012R\u009cÏ\u001e\u0094\u0092\u0001í¾aTëÁf\u007f£\u0014q\u0082ì?iÕãB0øÎ\u0095A\u0003Å¸PVÀÃKyÑ\u0016\u0018\u008c×9S×ÇL;ú¬\u0097/\r©º`PíÍ~{º\u0010:\u008eµ;rÑ×NHä\u0086\u0091\u000e\u000f\u0082¤\u000e\u0094\u0092\u0001í¾aTëÁJ\u007fæ\u0014r\u0082þ?nÕÿBpø\u008d\u0095C\u0003Þ¸WVÕÃ\u0002yÝ\u0016]\u008c\u00959T×ÖL8ú¾\u0097/\r¢º.PýÍn{û\u00105\u008e¿;6ÑÏNP\u0007_\u0092.-¤Ç;R¿ì\n\u0087¸\u00113¬¾F.Ñ®k\u0000\u0006Ã\u0090\u000b+\u009cÅ\u001fP\u009bêR\u0085\u0096\u001f\u0017ª\u0095D\nßàim\u0004é\u009e*)ïÃu^çèa\u0083ü\u001dy¨ñB\u0002Ý\u0095w\b\u0002Ê\u009c@7ÕÁ\u0014\\\u0083ö\u001a\u0081Þ\u001c¨¶\"A´\u0094¦\u0001ç¾mT¥ÁU\u007fÇ\u0014W\u0082¹?~ÕøBuøÞ\u0095@\u0003\u008c¸PV\u0081ÃQyÊ\u0016H\u008cÅ9Y×ÁL8úé\u0097)\r«º%P¼Í,{û\u00104\u008e¡;3Ñ\u0081N\bäÅ\u0091\u000f\u000f\u008d¤\u0016R\u009cÏ\u0019e\u0083\u0012\u0019\u008fb%àÒ%NªÛúdf\u008e÷\u001b<¥ùÎvXâån\u000fí\u0098*\"ÖOZÙÕb\u001e\u008cÛ\u0019K£ÀÌAVÚã^\rÌ\u0096\u0006 ²M>×½`z\u008a¦\u00176¡¤ÊnT¯á-\u000b\u0093\u0094\u001b>\u0091K\u0019Õ\u009d\u0094\u0092\u0001ÿ¾iTëÁU\u007fì\u0014i\u0082ë?yÕòBpø\u008d\u0095C\u0003Þ¸WVÕÃ\u0002yÝ\u0016]\u008c\u00959R×ÖL*ú \u0097$\r¢º$\u0094\u0092\u0094\u0081\u0001ê¾kTðÁt\u007fæ\u0014L\u0082ø?tSWÆ;y³s6æ\u000bYÁ³T&Ñ\u0098Só\u0098e^ØÑ2]¥À\u001fhrãäa_ ±g$ã\u009eoñëktÞ÷0y«È:©¯\u0095\u0010\u001dú\u009ao]\u0094Ò\u0001ì¾`TäÁtÌ\u0010YQæÛ\f\u0013\u0099ã'qLáÚ\u000fgÈ\u008dN\u001aÃ hÍö[:àæ\u000e7\u009bç!|NþÔsaï\u008fw\u0014\u008e¢_Ï\u009fU\u001dâ\u0093\b\n\u0095\u009a#MH\u0082Ö\u0004c\u0092\u0089!\u0016ì¼3ÉðW<ü¤\n%\u0097©=\"J²×Ò}W\u008aÓ\u0010\u001c\u0094½\u0001á¾mT¥Ái\u007få\u0014<\u0082ù?yÕáBhø\u009f\u0095N\u0003\u008b¸KVÓÃ\u0002yß\u0016K\u008cÐ9U×ÆL>ú¬\u0097\t\r±º8PïÍ>{û\u00109\u008e¤;!Ñ\u009bNHä\u0087\u0091\u0003\u000fÃ¤\u0018R\u009cÏ\u001ce\u009e\u0012\u001e\u008fh%ê_àÊ\u0094u\u0012\u009f\u0082\n\u001a´\u009eß\u0002I\u0080ô\u0017\u001e\u0083\u0089\u001cÎ{[:ä°\u000ex\u009b\u0088%\u001aN\u008aØde£\u008f%\u0018¨¢\u0003Ï\u009dYQâ\u008d\f\\\u0099\u008c#\u0017L\u0095Ö\u0018c\u0084\u008d\u001c\u0016å 4ÍòWtàù\n \u0097÷!iJ©Ôiaá\u008bV\u0014\u0095¾]ËÕU]þÓ\b]\u0095×?^HÄÕ¿\u007f=\u0088ú\u0012y¿¿É>R¬ü+\t§\u0093?<îF\u0018Ó\u009a}\u001d\u0086\u009f\u0010\u001e½\u0094ÇCP\u0085ú\u001f\u0007\u0094\u0091]\u0094\u0092\u0001ì¾~TýÁ4\u007fã\u0014<\u0082ý?uÕòBcøÃ\u0095\t\u0003ß¸\u0004VÏÃMyË\u0016\u0018\u008cÖ9Y×ÝL8ú¨\u0097#\r©º`P²Í0{·\u0010-\u008eñ;<Ñ\u009aN\u0005ä\u0087\u0091\u0003\u000f\u0091¤\u000fÙÖL®ó4\u0019±\u008c+2µY!Ï\u0099r?\u0098§\u000f1µ\u0089ØJN\u0082õ\u0015\u001b\u0096\u008e\u00124Û[\u001eÁ\u0094tR\u009a\u0093\u0001m·ëÚg@í÷a\u001dý\u0094\u0092\u0001ê¾pTõÁo\u007fñ\u0014e\u0082Ý?{ÕãBuøÍ\u0095\u000e\u0003Â¸WV\u0081ÃKyÑ\u0016\u0018\u008cÁ9^×ÖLlú¹\u0097+\r´º4PýÍ1{©\u0010t\u008eµ;=Ñ\u008aN\u001bäÅ\u0091\b\u000f\u008c¤\bRÙÏ\u001ce\u0098\u0012\u001c\u008fa%áÒ|H¤åX\u0093Û\bR¦ÕS5Éðf|\u001cÞ\u0089D'ËÜS\u0094\u0092\u0001æ¾{TöÁs\u007fæ\u0014n\u0082Ý?{ÕãBqøÍ\u0095\u000e\u0003Æ¸QVÒÃVy\u009f\u0016[\u008cÚ9X×ÇL-ú \u0097$\rçº\"P¸Í*{¬\u00101\u008e´;<ÑÏNXäÅ\u0091\u0007\u000f\u008d¤\u0018RÙÏKeÇ\u0012B\u008f9%®ÒhHìå`\u0093ðÚYO'ð¢\u001a<\u008f©1 Z¸Ì>qµ\u009b9\f©¶(Û\u0084M\rö\u008a\u0018\n\u008dÉ7\u0019X\u0086Â\rw\u0089\u0099X\u0002ä´mÙïCxôê\u001e\u007f\u0083û50^ýÀ\u007fuí\u009fS\u0000ÆªKßÃA\bê\u0087\u001c\u0012\u0081Ð+R\\ßÁækt\u009cð\u0006\u007f«êÝ*F¼è2\u001d¬\u0094¤\u0001Û¾[\"±·î\bfâëwiÉ÷¢<4ê\u0089\u007fcãô0NÍ#Xµß\u000eWàäuLÏÜ h:Ô\u008fOaÞú)L§!>»\u008e\f.æ®{*Í©¦!8¼\u008d7g\u0081ø\u001cR\u0085'J¹Ã\u0012\fä\u0098y\u0014Ó×¤\u00199~\u0093®djþèSs%ç¾~\u0010üål\u007f¶ÐwªÉ?O\u0091ÃjIüÅQYÿWj\bÕ\u0080?\rª\u008f\u0014\u0011\u007fÚé\fT\u0099¾\u0005)Ö\u0093+þ¾h9Ó±=\u0002¨ª\u0012:}\u008eç2R©¼8'Ï\u0091AüØfhÑÈ;H¦Ì\u0010O{ÇåZPÑºg%ú\u008fcú dlÏü9?¤è\u000eyyóäËN\b¹\u008f#\u000b\u008e\u0089ø\u0004cÙÍ\u001a8\u009c¢\u0015\r\u0086wjâ¡L#·µ!f\u008c¶ö9a©Ë16¿ t\u000bÿugàðJaµ\u0085\u001fX\u008aÖôR\u0094\u0092\u0001ù¾|TöÁC\u007fí\u0014\u007f\u0082É?{ÕîB}øÈ\u0095@\u0003ß¸mVÏÃQyË\u0016J\u008cÀ9[×ÖL\"ú½\u0097*\rçº-P¨Í-{¯\u0010t\u008e³;7ÑÏN\nä\u0080\u0091\u0012\u000f\u0094¤\u0019R\u009cÏ\u0014e×\u0012@\u008f-%ïÒeHàå!\u0093º\b.¦¡S'É¶f\u007f\u001cÃ\u0089G'Í\u0094±\u0001î¾fTëÁi\u007f÷\u0014<\u0082ê?\u007fÕãB0øÍ\u0095C\u0003Ï¸AVÒÃdyÊ\u0016V\u008cÑ9_×ÝL+ú\u0088\u0097)\r¤º/P¨Í0{¯\u0010\u001d\u008e¿;4Ñ\u0080N\bäÉ\u0091F\u000f\u0083\u0094Ò\u0001ë¾iTñÁg\u007fã\u0014<\u0082ø?vÕåBuøÌ\u0095J\u0003Ò¸\u0004VÅÃGyÙ\u0016Q\u008cÛ9S××\u0094±\u0001î¾fTëÁi\u007f÷\u0014<\u0082ê?\u007fÕãB0øÍ\u0095C\u0003Ï¸AVÒÃdyÊ\u0016V\u008cÑ9_×ÝL+ú\u0088\u0097)\r¤º/P¨Í0{¯\u0010\u001d\u008e¿;4Ñ\u0080N\bäÉ\u0091F\u000f\u0093¤\u001dR\u0097ÏZe\u009e\u0012\u0003\u008f-%ïÒgHöåd\u0093ã\b{¦áS5Éòfv\u001cÊ\u0089@'ÄÜBJÄ»¦.ù\u0091q{üî~Pà;+\u00adý\u0010húôm'×ÚºT,Ø\u0097VyÅìsVÝ9A£Æ\u0016HøÊc<Õ\u009f¸>\"³\u00958\u007f¿â'T¸?\n¡¨\u0014#þ\u0097a\u001fËÒ¾\u0018 \u0092\u008bK}\u009aà\u0005J\u0085=G z\nûýugýÊv¼µ'l\u0089à|gæòI$3Õ¦Q\bÉó\u0010eÚÈK²Ý%O\u008fËr\u0006äèO\u00191\u008c¤\u0006\u000e\u0094ñ\u0006[\u0088Î\u000f°\u009f\u001b\u0004\u008dçp\u0018Ú\u0090M\u0012s\u008eæúY|³ç¬K9;\u0086µl9ù¬G\u000e,¤º6\u0007£ínz¤À\u0001\u00ad\u0084;\u0006\u0080Ýn\u001aû\u009eAF.\u0083´\t\u0001\u009bï\u001dtðÂu¯ý5>\u0082©h$õæCl(é¶(\u0003¹é\u0006v\u0085Ü\u0004©\u009f7V\u009cÊjN÷Ä\u0094±\u0001î¾fTëÁi\u007f÷\u0014<\u0082ê?\u007fÕãB0øÍ\u0095C\u0003Ï¸AVÒÃvyÞ\u0016N\u008cÕ9\u001a×\u0093L,ú¤\u0097.\r¢º3P\u009bÍ+{µ\u00100\u008e¸;<Ñ\u0088N)ä\u0086\u0091\u0005\u000f\u008c¤\tR\u0097Ï\u000ee¾\u0012\u001e\u008fk%áÒkH¤åh\u0093ñ\b?¦öSzÉâf3\u001cÈ\u0089L'ÌÜNJÎçX\u009dÚ\u0094\u0092\u0001Ì¾iTëÁh\u007fì\u0014h\u0082¹?iÕòBdø\u008d\u0095N\u0003Æ¸@VÄÃQyï\u0016M\u008cÆ9^×òL/úª\u0097%\r²º.P©Í\f{¾\u00107\u008e´;;Ñ\u009fN\u001cä\u0085\u0091F\u000f\u008a¤\u001aRÙÏ\u001ae\u009a\u0012\u0014\u008fh%ýÒMHñåo\u0093æ\bv¦öSrÉ×fp\u001cÏ\u0089F'ßÜIJÔçt\u009dÐ\n] Û]QË\u0092`&\u001e»\u008be!§Þ/t®á<\u009f»43¢©_Mõ\u008ab\u000e\u0018\u0082µ\b#\u008cØ\u001av\u009c`6õiJá l5î\u008bpà»vmËø!d¶·\fJaÄ÷HLÆ¢U7õ\u008dMâÌxZÍð#W¸¨\u000e!c¸ù.N³¤\b9¼\u008f?ä¶z?Ï¥%\u001cº\u008f\u0010NeÁû\u0004\u008c%\u0019z¦òL\u007fÙýgc\f¨\u009a~'ëÍwZ¤àY\u008d×\u001b[ ÕNFÛæa^\u000eß\u0094I!ãÏDT»â2\u008f«\u0015=¢ H\u001bÕ¯c,\b¥\u0096,#¶É\u000fV\u009cü]\u0089Ò\u0017\u0007¼\u0089J\u0003×Î}\n\n\u0097\u0097¹={ÊóPbýð\u008bw\u0010ï¾uK¡Ñf~â\u0004^\u0091Ô?PÄÖRP\u0094±\u0001î¾fTëÁi\u007f÷\u0014<\u0082ê?\u007fÕãB0øÍ\u0095C\u0003Ï¸AVÒÃryÊ\u0016K\u008cÝ9w×ÐL/ú¦\u0097?\r©º4P\u008fÍ;{¸\u00101\u008e¸;\"Ñ\u009bN\bäÅ\u0091\u000f\u000f\u0085¤\\R\u008dÏ\u0012e\u0092\u0012P\u008fm%ìÒbHêåa\u0093¢\b{¦÷SpÉåf3\u001cÂ\u0089F'ÞÜ\u0007JÍç\\\u009dÊ\nX Ü]\u0011Ëÿ`\u000e\u001e\u009b\u008b\u0011!\u0083Þ\u0011t\u009fá\u0018\u009f\u00884\u0013¢ð_\u000fõ\u0087b\u0005\u0082ç\u0017\u0097¨\u0019B\u0095×\u0000i¦\u0002\u001c\u0094\u009f)\u0007Ã£T\u0006î»\u00834\u0015«®?@ Õ\u0005o¯\u0000.\u009a¥/*Á¶ZMìÜ\u0081\u001f\u001bß¬@FÛÛ_m\u008e\u0006C\u0098Á-\u0007ÇøXxòä\u0087d\u0019ó²lDâÙ/s²\u0004%\u0099\u00193\u0095Ä\u001a^ÑóB\u0085Ã\u001eJ°\u0081E\u000fß\u008dp\u0001\u000ff\u009a9%±Ï<Z¾ä \u008fë\u0019=¤¨N4Ùçc\u001a\u000e°\u00988#¶Í;X¼â)\u008dÏ\u0017\u0006¢\u0080L\u0010×úa~\f±\u00960!çËkVçà,\u008bê\u0015u ¥JYÕÓ\u007f@\nÔ\u0094U?ÏÉWT\u008dþD\u0089Â\u0014¼¾0I²Ó6~²\u0094±\u0001î¾fTëÁi\u007f÷\u0014<\u0082ê?\u007fÕãB0øÍ\u0095g\u0003ï¸aVìÃkyþ\u0016\u0018\u008cÑ9W×ÇL-ú©\u0097f\rçº \u0094»\u0001Ë¾MTÈÁO\u007fÂ\u0094\u0092\u0001æ¾lTàÁk\u007fê\u0014}\u0082Ú?sÕçBxøÈ\u0095\\\u0003Î¸@VâÃCyÍ\u0016\\\u008cü9X×ÕL#ú»\u0097'\r¦º4P´Í1{µ\u00104\u008eñ;?Ñ\u009aN\u001bä\u0091\u0091F\u000f\u0081¤\u0019RÙÏ\u0018e\u0092\u0012\u0004\u008fz%ëÒnHêå!\u0093²\b?¦ùS{Éòf3\u001c\u0094\u0089\u0018'\u0093Ü\u0015J\u0080çQ\u009dÑ\nU Ó\u0094\u0092\u0001æ¾lTàÁk\u007fê\u0014}\u0082Ø?oÕãBxøî\u0095A\u0003Ï¸AVÁÃ\u0002yÒ\u0016M\u008cÆ9B×\u0093L/ú¦\u0097$\r³º!P´Í0{û\u00106\u008e´;&Ñ\u0098N\rä\u0080\u0091\b\u000fÃ¤LRÙÏ\u001be\u0099\u0012\u0014\u008f-%ºÒ;H½å7\u0093¢\bs¦÷S{Éñ.6»B\u0004ÈîD{ÏÅN®Ù8|\u0085ËoGøÜBJ/å¹k\u0002åìey¦Ãi¬ù6`\u0083çm~ö\u009a@\b-\u009d·C\u0000\u0090ê\u0016wÚÁ\u001bª\u00954\u0013\u0081\u009fk%ô©^a+¢µ.\u001e¼è8u³ß:¨µ5ê\u009fChßòH_À)T²Þ\u001cXéòsSÜÅ¦l3Ä\u009d`fåðk]ë'w°þ\u001adçüqyÚ\u0085¤\f\u0094\u0092\u0001ÿ¾iTëÁf\u007f£\u0014s\u0082ë?:Õ÷BdøÞ\u0095^\u0003\u008b¸@VÀÃVyÞ\u0016X\u008c\u00959[×ÆL?ú½\u0097j\r¥º%PýÍ:{¾\u00102\u008e¸;<Ñ\u008aN\f/Tº%\u0005¯ï0z´Ä\u0001¯³98\u0084µn%ù¥C\u000b.È¸\u0000\u0003\u0097í\u0014x\u0090ÂY\u00ad\u009c7\u0016\u0082Ðl\u0011÷ïAi,å¶o\u0001ãë\u007f\u0094\u0092\u0001í¾aTëÁf\u007f£\u0014q\u0082ì?iÕãB0øÏ\u0095K\u0003\u008b¸@VÄÃDyÖ\u0016V\u008cÐ9R".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2269);
        B = cArr;
        D = 4878303092603617679L;
    }

    public c(CreateCardRequestBuilder createCardRequestBuilder) {
        this(createCardRequestBuilder.getBin(), createCardRequestBuilder.getBinLength(), createCardRequestBuilder.getLastDigits(), createCardRequestBuilder.getPan(), createCardRequestBuilder.getSecurePan(), createCardRequestBuilder.getPanSource(), createCardRequestBuilder.getExpiryDate(), createCardRequestBuilder.getCvx2(), createCardRequestBuilder.getSecureCvx2(), createCardRequestBuilder.getIssuerCardId(), createCardRequestBuilder.getIssuerData(), createCardRequestBuilder.getCardholderName(), createCardRequestBuilder.getVtsEncPaymentInstrument(), createCardRequestBuilder.getMdesTav(), createCardRequestBuilder.getMdesFundingAccountInfo(), createCardRequestBuilder.getMdesPushAccountReceipt(), createCardRequestBuilder.getIdemiaCipheredCardInformation(), createCardRequestBuilder.getIdemiaAuthCode(), createCardRequestBuilder.requiresTermsAndConditionsApproval(), createCardRequestBuilder.getFinancialAccountNumber(), createCardRequestBuilder.getFinancialAccountLabel());
    }

    private c(String str, int i2, String str2, String str3, o.ed.a aVar, CreateCardRequestPanSource createCardRequestPanSource, String str4, String str5, o.ed.a aVar2, String str6, String str7, String str8, byte[] bArr, byte[] bArr2, byte[] bArr3, String str9, byte[] bArr4, String str10, boolean z2, String str11, String str12) {
        this.f27422f = str;
        this.f27424j = i2;
        this.f27423i = str2;
        this.f27426l = str3;
        this.f27425k = aVar;
        this.f27429o = createCardRequestPanSource;
        this.f27428n = str4;
        this.f27427m = str5;
        this.f27434t = aVar2;
        this.f27433s = str6;
        this.f27431q = str7;
        this.f27430p = str8;
        this.f27432r = bArr;
        this.f27438x = bArr2;
        this.f27437w = bArr3;
        this.f27435u = str9;
        this.f27436v = bArr4;
        this.f27439y = str10;
        this.A = z2;
        this.f27440z = str11;
        this.C = str12;
    }

    private static void E(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $10 + 75;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(B[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(742 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11, 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(D), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 766;
                    char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 12470);
                    int deadChar = 12 - KeyEvent.getDeadChar(0, 0);
                    byte b4 = (byte) ($$b & 7);
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(iMakeMeasureSpec, cResolveSizeAndState, deadChar, 1946853218, false, $$c(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    objA3 = o.d.d.a(View.MeasureSpec.getSize(0) + 387, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 18 - View.MeasureSpec.getMode(0), 39570797, false, $$c((byte) ($$b >>> 2), b6, b6), new Class[]{Object.class, Object.class});
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
            int i8 = $11 + 81;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b7 = (byte) 0;
                objA4 = o.d.d.a(387 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (Process.myPid() >> 22), (ViewConfiguration.getTouchSlop() >> 8) + 18, 39570797, false, $$c((byte) ($$b >>> 2), b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i10 = $11 + 85;
            $10 = i10 % 128;
            int i11 = i10 % 2;
        }
        String str = new String(cArr);
        int i12 = $11 + 115;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        objArr[0] = str;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 71;
        H = i4 % 128;
        int i5 = i4 % 2;
        String str = cVar.f27431q;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 9;
        H = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 13;
        H = i4 % 128;
        int i5 = i4 % 2;
        String str = cVar.f27439y;
        int i6 = i3 + 51;
        H = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = H + 21;
        I = i3 % 128;
        int i4 = i3 % 2;
        String str = cVar.f27426l;
        if (i4 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = H + 57;
        I = i3 % 128;
        int i4 = i3 % 2;
        String str = cVar.f27428n;
        if (i4 == 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~i6;
        int i9 = ~((i8 + i7) - (i8 & i7));
        int i10 = ~i7;
        int i11 = i9 | (~((-1) - (((-1) - ((-1) - (((-1) - i10) & ((-1) - i6)))) & ((-1) - i3))));
        int i12 = ~(i8 | i10);
        int i13 = (~i3) | i10;
        int i14 = (-1) - (((-1) - i12) & ((-1) - (~i13)));
        int i15 = ~((-1) - (((-1) - i13) & ((-1) - i6)));
        int i16 = i6 + i7 + i4 + ((-1261570137) * i5) + (2040842291 * i2);
        int i17 = i16 * i16;
        int i18 = ((i6 * (-750812765)) - 1471086592) + ((-750812765) * i7) + (1493335646 * i11) + ((-1308296004) * i14) + ((-1493335646) * i15) + (742522880 * i4) + ((-1928462336) * i5) + (1629880320 * i2) + (2096168960 * i17);
        int i19 = ((i6 * 1408203179) - 1033136887) + (i7 * 1408203179) + (i11 * (-338)) + (i14 * (-676)) + (i15 * ExifDirectoryBase.TAG_EXTRA_SAMPLES) + (i4 * 1408202841) + (i5 * (-1046847217)) + (i2 * (-121732677)) + (i17 * 1741225984);
        int i20 = i18 + (i19 * i19 * 838795264);
        return i20 != 1 ? i20 != 2 ? i20 != 3 ? a(objArr) : c(objArr) : d(objArr) : b(objArr);
    }

    static void init$0() {
        $$a = new byte[]{49, 53, Ascii.ETB, 7};
        $$b = 25;
    }

    final int a() {
        int i2;
        int i3 = 2 % 2;
        int i4 = I;
        int i5 = i4 + 109;
        H = i5 % 128;
        if (i5 % 2 == 0) {
            i2 = this.f27424j;
            int i6 = 74 / 0;
        } else {
            i2 = this.f27424j;
        }
        int i7 = i4 + 21;
        H = i7 % 128;
        int i8 = i7 % 2;
        return i2;
    }

    final o.ed.a b() {
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 55;
        H = i4 % 128;
        int i5 = i4 % 2;
        o.ed.a aVar = this.f27425k;
        int i6 = i3 + 73;
        H = i6 % 128;
        int i7 = i6 % 2;
        return aVar;
    }

    final String c() {
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 63;
        H = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        String str = this.f27422f;
        int i5 = i3 + 75;
        H = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    final String d() {
        int i2 = (-452376020) * f27415a;
        f27415a = i2;
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i3 = 2115712091 * f27421h;
        f27421h = i3;
        int i4 = f27420g * 852819655;
        f27420g = i4;
        return (String) e(i4, i2, iMaxMemory, i3, -1321972341, new Object[]{this}, 1321972344);
    }

    final String e() {
        int i2 = 2 % 2;
        int i3 = H + 85;
        int i4 = i3 % 128;
        I = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f27423i;
        int i5 = i4 + 111;
        H = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String f() {
        int i2 = 2 % 2;
        int i3 = H;
        int i4 = i3 + 89;
        I = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f27427m;
        int i6 = i3 + 11;
        I = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final String g() {
        int i2 = (-709231513) * f27419e;
        f27419e = i2;
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i3 = (-750458151) * f27416b;
        f27416b = i3;
        return (String) e(Process.myTid(), i2, iUptimeMillis, i3, 1602944606, new Object[]{this}, -1602944604);
    }

    final o.ed.a h() {
        int i2 = 2 % 2;
        int i3 = H;
        int i4 = i3 + 43;
        I = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        o.ed.a aVar = this.f27434t;
        int i5 = i3 + 35;
        I = i5 % 128;
        if (i5 % 2 == 0) {
            return aVar;
        }
        throw null;
    }

    final String i() {
        int i2 = 2 % 2;
        int i3 = H + 79;
        I = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f27433s;
        if (i4 != 0) {
            int i5 = 26 / 0;
        }
        return str;
    }

    public final CreateCardRequestPanSource j() {
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 51;
        H = i4 % 128;
        int i5 = i4 % 2;
        CreateCardRequestPanSource createCardRequestPanSource = this.f27429o;
        int i6 = i3 + 53;
        H = i6 % 128;
        int i7 = i6 % 2;
        return createCardRequestPanSource;
    }

    final String k() {
        int i2 = (-1960106894) * f27418d;
        f27418d = i2;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i3 = (int) Runtime.getRuntime().totalMemory();
        return (String) e((int) Process.getElapsedCpuTime(), i2, iElapsedRealtime, i3, -1384548735, new Object[]{this}, 1384548735);
    }

    final byte[] l() {
        int i2 = 2 % 2;
        int i3 = H;
        int i4 = i3 + 15;
        I = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.f27437w;
        int i5 = i3 + 103;
        I = i5 % 128;
        if (i5 % 2 == 0) {
            return bArr;
        }
        obj.hashCode();
        throw null;
    }

    final byte[] m() {
        int i2 = 2 % 2;
        int i3 = H + 111;
        int i4 = i3 % 128;
        I = i4;
        int i5 = i3 % 2;
        byte[] bArr = this.f27432r;
        int i6 = i4 + 75;
        H = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 97 / 0;
        }
        return bArr;
    }

    final String n() {
        int i2 = 2 % 2;
        int i3 = H;
        int i4 = i3 + 99;
        I = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f27430p;
        int i6 = i3 + 103;
        I = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    final byte[] o() {
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 107;
        H = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArr = this.f27438x;
        int i6 = i3 + 17;
        H = i6 % 128;
        int i7 = i6 % 2;
        return bArr;
    }

    public final boolean p() {
        int i2 = 2 % 2;
        int i3 = H;
        int i4 = i3 + 103;
        I = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.A;
        int i6 = i3 + 55;
        I = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final String q() {
        int i2 = 2 % 2;
        int i3 = H + 11;
        int i4 = i3 % 128;
        I = i4;
        int i5 = i3 % 2;
        String str = this.f27440z;
        int i6 = i4 + 55;
        H = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 44 / 0;
        }
        return str;
    }

    public final byte[] r() {
        int i2 = 2 % 2;
        int i3 = H + 7;
        I = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = this.f27436v;
        if (i4 != 0) {
            int i5 = 93 / 0;
        }
        return bArr;
    }

    public final String s() {
        int i2 = 2105160648 * f27417c;
        f27417c = i2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int iMyPid = Process.myPid();
        return (String) e((int) SystemClock.elapsedRealtime(), i2, iFreeMemory, iMyPid, -508184951, new Object[]{this}, 508184952);
    }

    final String t() {
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 57;
        H = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f27435u;
        int i6 = i3 + 3;
        H = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String x() {
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 115;
        H = i4 % 128;
        int i5 = i4 % 2;
        String str = this.C;
        int i6 = i3 + 101;
        H = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0817, code lost:
    
        if (r3 != null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0819, code lost:
    
        r6 = r18.f27423i;
        r0 = new java.lang.Object[1];
        E((char) (android.view.KeyEvent.getDeadChar(0, 0) + 48070), 2220 - android.view.KeyEvent.getDeadChar(0, 0), 28 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), r0);
        d(r6, ((java.lang.String) r0[0]).intern());
        r5 = r18.f27422f;
        r0 = new java.lang.Object[1];
        E((char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2248, 20 - android.os.Process.getGidForName(""), r0);
        d(r5, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x086a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x086b, code lost:
    
        if (r3 != null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x086e, code lost:
    
        r4 = fr.antelop.sdk.exception.WalletValidationErrorCode.InvalidFormat;
        r0 = new java.lang.Object[1];
        E((char) (android.os.Process.getGidForName("") + 1), android.widget.ExpandableListView.getPackedPositionGroup(0) + 2185, 35 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0897, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r4, r6, ((java.lang.String) r0[0]).intern());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y() throws fr.antelop.sdk.exception.WalletValidationException {
        /*
            Method dump skipped, instruction units count: 3032
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.z.c.y():void");
    }
}
