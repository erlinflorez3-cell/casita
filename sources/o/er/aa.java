package o.er;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class aa {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    public static int A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f24770a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f24771c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f24772d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f24773f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f24774g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f24775h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f24776i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f24777j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f24778k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f24779l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f24780m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f24781n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f24782o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f24783p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f24784q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f24785r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f24786s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f24787t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f24788u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f24789v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static int f24790w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static int f24791x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static int f24792y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static int f24793z = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o.aa.b f24794b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o.en.b f24795e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(short r9, int r10, byte r11) {
        /*
            byte[] r8 = o.er.aa.$$c
            int r7 = 105 - r9
            int r2 = r11 * 4
            int r1 = 1 - r2
            int r0 = r10 + 4
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r8 != 0) goto L28
            r1 = r0
            r3 = r5
        L13:
            int r7 = r7 + r0
            r0 = r1
            r2 = r3
        L16:
            byte r1 = (byte) r7
            r6[r2] = r1
            int r1 = r0 + 1
            int r3 = r2 + 1
            if (r2 != r4) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L25:
            r0 = r8[r1]
            goto L13
        L28:
            r2 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.aa.$$e(short, int, byte):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        A = 1857193154;
        f24793z = 1211596317;
        f24792y = 652651326;
        f24791x = -727672685;
        f24790w = 1481487653;
        f24789v = 1746513136;
        f24788u = 393519611;
        f24787t = 1296414444;
        f24786s = 794366303;
        f24785r = 1529702424;
        f24784q = -1853800157;
        f24783p = 464089265;
        f24782o = 84590044;
        f24781n = 1590723469;
        f24780m = 1518154468;
        f24779l = -246110105;
        f24778k = -382513031;
        f24777j = 30461090;
        f24776i = -611793714;
        f24774g = 1900649215;
        f24773f = 1863114582;
        init$0();
        f24770a = 0;
        f24775h = 1;
        char[] cArr = new char[1897];
        ByteBuffer.wrap("_\u001cÌQyZæW\u0013\u0004\u0080J-xZuÇgtcáf\u000e\u0002»\u0013(\"U\u0006Â\ro7\u009c'\t:¶2#8P\u0012ýÄjÉ\u0097Â\u0004Æ±Ê\u0094Ý\u0007\u0090²\u009b-\u0096ØÅK\u008bæ¹\u0091´\f¦¿¢*§ÅÃpÒãã\u009eÖ\tÁ¤âWñÂÁ}äèú\u009bþ6\u0015¡\f\\\u0006\u0094Ý\u0007\u0090²\u009b-\u0096ØÅK\u008bæ¹\u0091´\f¦¿¢*§ÅÃpÒãã\u009eÕ\tÑ¤üW÷×®Dôñônà\u009b¶\bò¥ÊÒÏOÄüÛiØ\u0086ì3®  Ý¹J¿ç\u0087\u0014\u008e\u0081\u009e>\u009b«¦Ø\u009dudâ\u007f\u001fe\u008cr9oVZh\u008eûÂNÙÑÐ$\u0096·Û\u001aâm¥ðáCåÖò9\u0093l¤ÿèJóÕú ¼³æ\u001eÆiÌô\u0095GÍÒÅ=¦\u0088³\u0094Ý\u0007\u0087²\u009a-\u0083Ø\u008bK\u009eæ²\u0091÷\f\u0090¿\u0082*\u0083ÅßpÌãÙ\u009eâ\tÉ¤æWõ1F¢\u001c\u0017\u001c\u0088\b}\u0005î\u0012C 4l©5\u001a6\u008f7`\u0004ÕMFN;_¬]\u0001kò!gvØt\u0094\u0090\u0007\u009d²\u0099-\u008eØ\u0085K\u0094\u0094Ý\u0007\u0087²\u0087-\u0093Ø\u009eK\u0089æ»\u0091÷\f ¿\u00ad* Å\u009fpÔãÙ\u009eË\tÝ¤ÄWÙÂ³}îèï\u009bá6\u0003¡U\\\u0001Ï\u000bz\u0000\u0015$\u0080(33®*Î:]`è`wt\u0082y\u0011n¼\\Ë\u0010VGåJpG\u009fx*3¹>Ä,S:þ#\r>\u0098T'\u0017²\u001fÁ\u0004lá&\bµR\u0000R\u009fFjKù\\Tn#\"¾{\rx\u0098ywJÂ\u0003Q\u0000,\u0011»\u0013\u0016\"å,p>Ï\u0003Z\u0012))\u0084Ñ\u0013ÂîÇ}\u009fÈÈ§ê\u0097\u0005\u0004H±C.NÛ\u001dHZåk\u0092m\u000fo¼{)cÆ\rs\u0011à\u0010\u0094\u0080\u0007\u009b²Ð-\u0082Ø\u009fK\u0085æº\u0091¼\fì¿¬*¡ÅÃpÎ\u0094\u009c\u0007\u0091²\u009f-\u0093Ø\u008fKÂæ¸\u0091½\f¶\u0094Ý\u0007\u0084²\u008c-\u008fØ\u0089KÃæ°\u0091±\f®¿¡*½ÅÉpÉãÈ\u009eÃ\tÅ¤á«V8[\u008dY\u0012_çSt@=å®þ\u0094\u0080\u0007\u009b²Ð-\u0090Ø\u0098K\u0083æ²\u0091\u00ad\f¡¿°*àÅÝpÛãÒ\u009eÓ\tÎ¤óW÷Âê}õèø\u009bé6\u0004ª\u009a9\u009e\u008c\u009f\u0013\u0096\u0094\u0082\u0007\u0091²\u008c-\u0093Ø\u0083K\u009fæ¢\u0091ö\f±¿½*½Å\u009epØãØ\u009e\u0088\tÌ¤÷WöÂë}çè¤\u009bë6\u0006¡\r\\LÏ\u0002z\u000f\u0015;\u0080?3\u0003®!Y8ôGgk\u0012L\u008dE8D«HFsñjlg\u001fv\u0094\u0082\u0007\u0091²\u008c-\u0093Ø\u0083K\u009fæ¢\u0091ö\f±¿½*½Å\u009epØãØ\u009e\u0088\tÌ¤÷WöÂë}çè¤\u009bë6\u0006¡\r\\LÏ\u0002z\u000f\u0015;\u0080?3\u0003®!Y8ôGgk\u0012H\u008dE8D«HFyñj\u0094\u0082\u0007\u0091²\u008c-\u0093Ø\u0083K\u009fæ¢\u0091ö\f±¿½*½Å\u009epØãØ\u009e\u0088\tÌ¤÷WöÂë}çè¤\u009bþ6\u0019¡V\\\u0001Ï\u0015z\u0007\u001c_\u008fL:Q¥NP^ÃBn\u007f\u0019+\u0084l7`¢`MCø\u0005k\u0005\u0016U\u0081\u0011,*ß+J6õ:`y\u0013#¾Ä)\u008bÔÓGØòÐakòxGeØz-j¾v\u0013Kd\u001fùXJTßT0w\u00851\u00161kaü%Q\u001e¢\u001f7\u0002\u0088\u000e\u001dMn\u0017ÃðT¿©æ:î\u008fä96ª%\u001f8\u0080'u7æ+K\u0016<B¡\u0005\u0012\t\u0087\th*ÝlNl3<¤x\tCúBo_ÐSE\u00106J\u009b\u00ad\fâñ»b¾×¹/\u000f¼\u001d\t\u001a\u0096\u0013c\u0012ð\u0001\u0095\u0082\u0006Û³Ó,ÐÙÖJ\u009cçä\u0090è\rù¾î+ýÄ\u008aq\u0096ÖÏEÝðÚoÓ\u009aÆ\tÒ¤øÓàNý/\u008a¼®\t¯\u0096¦c¸ð¼]\u009d*\u008e·\u0092\u0004\u0095î]}@ÈOWT¢_1A\u009cb\u0094\u0091\u0007\u009c²\u008c-\u008fØ\u0087K\u0085æ£\u0091µf\u0018õ\u0003@Hß\b*\u0000¹\u001b\u0014*c5þ9M(Øx7L\u0082G\u0011RlWûSVo\u009fK\fY¹^&WÓ\u001d@\u0015íi\u0094\u0095\u0007\u0091²\u0090-\u0085Ø\u0098K\u0085æµ\u0094\u0095\u0007\u0091²\u0090-\u0085Ø\u0098K\u0085æµ\u0091\u0087\fº¿ü*ør\u0097á\u0093T\u0092Ë\u0087>\u009a\u00ad\u0087\u0000·w\u0085ê¸YþÌú#í\u0096\u008e\u0005\u008a\u0080Ü\u0013Ç¦\u008c9ÌÌÄ_ßòî\u0085ñ\u0018ý«ì>¼Ñ\u0081d\u0089÷\u0084\u008a\u009f\u001d\u0098\u0094\u0081\u0007\u0090²\u0095\u0094\u0097\u0007\u0099²\u008b-\u008cØ\u008bK\u0098æ¹\u0091ªís~DËNT\u0000¡x2Y\u009fxèlukÆiSk¼P\t\u001c\u009a\u0013ç\u0014pHÝ\u0011.<»,\u0004/\u0091'â)7V¤\u007f\u0011\u007f\u008ew{`è`EW2\u001d¯t\u001ce\u0089`fuÓ=@,=*ª!\u0007\u0003ôQa\u001dÞ\nK\u001d8I\u0095ë\u0002¥ÿ±\t\f\u009a%/%°-E:Ö:{\r\fG\u0091.\"?·:X/íg~v\u0003p\u0094{9YÊ\u000b_GàPuG\u0006\u0013«±<ÿÁëR\u0084çç\u0088Û\u0094\u0080\u0007\u009b²Ð-\u0088Ø\u008bK\u009eæ²\u0091¯\f£¿¶*«\u0094\u0095\u0007\u009b²\u0092-\u0084Ø\u008cK\u0085æ¥\u0091°\u0094\u0084\u0007\u0096²\u0091-\u0098ØÒKÚ\u0094\u0080\u0007\u0095²\u0090-\u0083Ø\u0082K\u0099\u0094\u0080\u0007\u009b²Ð-\u0090Ø\u0098K\u0083æ²\u0091\u00ad\f¡¿°*àÅÒpÈãÝ\u009eÈ\tÌ\u0094\u0080\u0007\u009b²Ð-\u008bØ\u008fK\u009eæ¸\u0091½\f®¿ê*¿ÅÕp×ãÉçb\u0094\u0080\u0007\u009b²Ð-\u0093Ø\u008fK\u008fæ£\u0091ª\f§È®\u0094\u0080\u0007\u009b²Ð-\u0082Ø\u009fK\u0085æº\u0091¼\fì¿´*¼ÅßpÞãÉ\u009eÅ\tÜm!þ4K'Ô9!\u0000²!\u001f[h[\u0094\u0080\u0007\u009b²Ð-\u0082Ø\u009fK\u0085æº\u0091¼\fì¿¢*§ÅÞpÝãÙ\u009eÔ\tØ¤àWýÂð}ô§P4T\u0081U\u001e@ë]x@Õp¢2?t\u008ce\u0019`öZC\u0018Ð\u001c\u00ad\r:\b\u0097%d8ñ8\u0094\u0095\u0007\u0091²\u0090-\u0085Ø\u0098K\u0085æµ\u0091\u0087\fº¿ü*øÅ\u009fpÉãØ\u009eÍ\t÷¤êW¬Â¨}¯èí\u009bé6\u0018¡\u001d\\\u0010Ï\rz\r\u0015\u000f\u0080\"3d®p\u0094\u0095\u0007\u0091²\u0090-\u0085Ø\u0098K\u0085æµ\u0091÷\f¥¿«*¡Å×pÖãÙ\u009eù\tÛ¤öWÿÂ±}çèï\u009bâ6\u0013¡\n\\\u000bÏ\u0007\u0094\u0095\u0007\u0091²\u0090-\u0085Ø\u0098K\u0085æµ\u0091÷\f´¿¦*¡ÅÈp\u0082ã\u008a\u009eÖ\t\u0087¤äWöÂñ}øè²\u009bº6\u0006\u0088\u0094\u001b\u009a®\u00901\u0086Ä\u0087W\u0088úø\u008dª\u0010§£®6\u0090ÙÖlËÿÕ\u0082È\u0015Ç¸öKÊÞça¹ô½\u0087¢*\u0010½\u001c@\rÓ\u0000f\u001d\t8\u009c8/\u0002²?Eqè\u0005\u0094\u0080\u0007\u009b²Ð-\u0082Ø\u0085K\u0083æ¢\u0091´\f\u00ad¿¥*ªÅÕpÈ\u0094\u0080\u0007\u009b²Ð-\u0082Ø\u0085K\u0083æ¢\u0091±\f¯¿¥*©ÅÕp\u0094ãÞ\u009eÓ\tÁ¤þWðÂ°}æèã\u009bâ6\u0011¡\u001d\\\u0010Ï\u0014z\u001c\u00159\u008043( \u000e3'\u0086'\u0019/ì8\u007f8Ò\u000f¥H8\u0007\u008bA\u001eE\u0094\u0080\u0007\u009b²Ð-\u0082Ø\u009fK\u0085æº\u0091¼\fì¿ *§ÅÃpÊãÐ\u009eÇ\tÑ¤¼WýÂú½æ.ñ\u009bí\u0004ôñ§\u0094\u009b\u0007\u009a²\u0097-\u0094ØÄK\u009fæ \u0091»\fì¿µ*«ÅÝpÏã\u0091\u009eÖ\tÚ¤ýWäÂí\u0094\u0083\u0007\u0091²\u0093-\u0095ØÄK\u0084æ¡\u0091ö\f¯¿¥*§ÅÞpÑãÙ\u009eß\tÛ7Y¤K\u0011I\u008eO{\u001eèEEj2,¯~\u001c\u007f\u0089\u007ff\u000fÓ?@\u0005=\u001dª\u001f\u0007-ô<a%\u0094\u0083\u0007\u0091²\u0093-\u0095ØÄK\u009fæ°\u0091ö\f®¿§*ªÅïpÞãÙ\u009eÈ\tÛ¤ûWàÂçiRúIO\u0002ÐY%]¶L\u001bjloñ|B8×}8\f\u008d\f\u001e\u001cc\u001bô\u0013Y$ªh?=\u00807\u00155f+ËÀ\u0012ª\u0081±4ú«¨^¯Í©`\u0088\u0017Ü\u008a\u00999\u008b¬\u0089Cïö¾e÷\u0018ú\u008fæ\"çÑÐDÕûÇnÅ)×ºÌ\u000f\u0087\u0090ØeÙöÖ[¯,í±à\u0002ú\u0097õx\u0083ÍÃ^\u008d#\u0098´\u0091\u0019¢ê¦\u007f»À§U¯&²\u008bO\u001c[*J¹Q\f\u001a\u0093ZfRõIXx/g²k\u0001z\u0094*{\u0018Î\u0005]\u001f \u0000·\u0006\u001avé8|=Ã$V'%#\u0088Î\u001fÂâÚqÇÄÊ«î\u0094\u0080\u0007\u009b²Ð-\u0093Ø\u0093K\u009fæ¢\u0091½\f¯¿ê*¬ÅÅpÓãÐ\u009eÂ\t\u0086¤ôWýÂð}çèï\u009bþ6\u0006¡\n\\\u000bÏ\nz\u001a\u0001;\u0092 'k¸(M(Þ$s\u0019\u0004\u0006\u0099\u0014* ¿\u0010Psåuv)\u000b\u007f\u009cf1@ÂCWAè\u0015}W\u000e^££4¤É¼Z\u00adï¥\u0080\u0099\u0015\u0088¦\u0089;\u0089g#ô8AsÞ5+,¸!\u0015\u0011b\u0014ÿ\u0013LIÙ\u000f6f\u0083p\u0010smaú%WW¤^1S\u008eD\u001bLh]Å¥R©¯¨<©\u0089¹yÊêÑ_\u009aÀÜ5Å¦È\u000bø|ýáúRÑÇà(\u0096\u009d\u009b\u000e\u009bsÂä\u0080I\u00adº·/¸\u0090®\u0005îv ÛUL\\±O\"K\u0097VøjmbÞ\u007fCb´vÆ\u009e\u0094Ý\u0007\u0090²\u009b-\u0096ØÅK\u009dæ³\u0091µ\f·¿\u009b*¾ÅÙpÊãÙÊûY¶ì½s°\u0086ã\u0015¹¸\u009fÏ\u009dR\u008fá\u0087t\u009c\u009b¹.þ½ûÀóWëúÖ\tÓ\u009cÖ#Â¶óÅÍh5ÿ0\u0002=\u0091&\u000fV\u009c\u001b)\u0010¶\u001dCNÐ\u0014}2\n0\u0097\"$*±1^\u0014ëVxR\u0005C\u0092Z?}ß×L\u009aù\u0091f\u009c\u0093Ï\u0000\u0095\u00ad³Ú±G£ô«a°\u008e\u0095;Á¨ÓÕÁB×ïü\u0017c\u0084919®-[{È#e\r\u0012\u000b\u008f\t<%©\u0004F|óe`a\u001d}*õ¹¯\f¯\u0093»f¶õ¡X\u0093/ß²\u0086\u0001\u0085\u0094\u0084{·Îþ]ý ì·ã\u001aåéÑ|×ÃÄVÎ%Ë\u0088=\u001f\u000fâ.q)Ä$«\r>\u0015\u008d+\u0010\u001fç\u0005JwÙi¬83{\u0086m\u0094Ý\u0007\u0090²\u009b-\u0096ØÅK\u008eæ¥\u0091¬\f\u009d¿£*¾ÅÃ\u0094Ý\u0007\u0090²\u009b-\u0096ØÅK\u008eæ¥\u0091¬\f\u009d¿°*§ÅÝpßæ\u000buFÀM_@ª\u00139I\u0094oãm~\u007fÍwXl·I\u0002\u000e\u0091\u0019ì\u0004{\u0018Ö+%.°,\u000f3\u009a.é>Ç\u0099TÃáÃ~×\u008bÚ\u0018ÍµÿÂ³_êìéyè\u0096Û#\u0092°\u0091Í\u0080Z\u008e÷¥\u0004¤\u0091¼.«»¢È¬eWòN\u000fy\u009cJ)DF}Ó0`kým\u0019Ñ\u008a\u009c?\u0097 \u009aUÉÆ\u0082k©\u001c \u0081¯2«§¡HÙD8×ub~ýs\b \u009bk6@AIÜ@oXúY\u0015:\u000fù\u009c´)¿¶²CáÐª}\u0081\n\u0088\u0097\u008b$\u0085±\u008d^ú\u0094Ý\u0007\u0090²\u009b-\u0096ØÅK\u008eæ¥\u0091¬\f\u00ad¿¶*§ÅÕs\u0099àÔUßÊÒ?\u0081¬Ê\u0001ávèëðXíÍù\"\u0093\u0094Ý\u0007\u0090²\u009b-\u0096ØÅK\u008eæ¥\u0091¬\f²¿£*¯ÅÙpÊãß\u0094Ý\u0007\u0090²\u009b-\u0096ØÅK\u008eæ¥\u0091¬\f\u009d¿\u00ad*£ÅÕµo&\"\u0093-\f&ù9jqÇ\u0000°\u0005-\u0007\u009e\u0018\u000b\u0010ämQiÂj¿g(5\u0085\u000ev^ãN\\\u001dÉZºM\u0017°\u0080¡.T½\u0010\b\u0019\u0097\u001dbLñ\u0012\\6+?¶/\u0005\"\u00900\u007fJÊ\u001cYw$\\³U\u001eHíuxvÇ{Rf!a\u008c¹\u001b\u009eæ\u0087u\u0089À\u0082¯«\u0094Ý\u0007\u0084²\u008c-\u008fØ\u0089KÃæ¿\u0091·\f²¿«*¼ÅÄpÉ\u0094Â\u0007\u0092²\u0098-ÀØÐ\u0094Ý\u0007\u0084²\u008c-\u008fØ\u0089KÃæ¥\u0091½\f®¿¢*áÅÝpÛãÌ\u009eÕ\u0094\u0095\u0007\u0086²\u009f-\u008cØ\u0086K\u0083æµ\u0091ö\f¥¿«*¢ÅÔpÜãÕ\u009eÕ\tÀ¤¼WçÂñó«`¨Õ©J\u0092¿\u0093,\u009c\u0081°ö²k\u0095Ø\u0082M\u008f¢«\u0017ü\u0084æ\u0016ô\u0085¸0£¯ªZìÉ¨d\u009a\u0013\u0095\u008e\u0082=\u008c¨¸Gúòüañ\u001cê\u008bâ&ÈÕ\u0093@ÏÿÄjÏ\u0094\u0090\u0007\u0098²\u008b-\u0085Ø\u0099K\u0098æ·\u0091»\f©¿·\u0088y\u001b5®.1'ÄaW%ú\u001d\u008d\t\u0010\b£\u00146\u0019\u0094Ý\u0007\u0090²\u009f-\u0094Ø\u008bKÃæ²\u0091·\fµ¿ª*¢ÅßpÛãØ\u009eÕ\t\u0087¤¼WðÂî}¯èë\u009bü6\u0006¡\u000b\\LÏ\u001cz\u0003\u0015<\u0094Ý\u0007\u0084²\u008c-\u008fØ\u0089KÃæµ\u0091¨\f·¿\u00ad* ÅÖpÕ\u0094µ\u0007\u009b²\u0092-\u0084Ø\u008cK\u0085æ¥\u0091°\u0094Ý\u0007\u0090²\u009f-\u0094Ø\u008bKÃæ»\u0091±\f±¿§*áÅÀpÈãÓ\u009eÀ\tÁ¤þWñÂí}¯èé\u009bù6\u0004¡W\\RÏKz\r\u0015?\u008073r®+Y!ôQgF\u0012Q\u008dV8C«^Fbñ6lo\u001fa\u008ac&\u0085Ñ\u0093L\u0091ÿ\u0083".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1897);
        f24771c = cArr;
        f24772d = -6292892901121849356L;
    }

    public aa(o.en.b bVar) {
        this.f24795e = bVar;
        int i2 = o.en.b.f24086a * (-1339268403);
        o.en.b.f24086a = i2;
        this.f24794b = o.aa.b.c((Context) o.en.b.a(-1657581939, i2, new Object[]{bVar}, (int) Runtime.getRuntime().totalMemory(), 1657581940, (int) Thread.currentThread().getId(), Process.myPid()));
    }

    private static void B(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o.a.o oVar = new o.a.o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f24771c[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    objA = o.d.d.a(View.MeasureSpec.getMode(0) + 742, (char) (ViewConfiguration.getTapTimeout() >> 16), 12 - (ViewConfiguration.getFadingEdgeLength() >> 16), 632508977, false, $$e((byte) 6, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f24772d), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b3 = (byte) (-1);
                    objA2 = o.d.d.a(766 - (Process.myPid() >> 22), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 12470), TextUtils.lastIndexOf("", '0', 0, 0) + 13, 1946853218, false, $$e((byte) 5, b3, (byte) (b3 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objA3 = o.d.d.a(387 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 18 - TextUtils.getCapsMode("", 0, 0), 39570797, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i6 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                $10 = i6 % 128;
                int i7 = i6 % 2;
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
            int i8 = $11 + 53;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = o.d.d.a(-723636472);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objA4 = o.d.d.a(TextUtils.lastIndexOf("", '0', 0) + 388, (char) KeyEvent.getDeadChar(0, 0), 18 - Color.red(0), 39570797, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                throw null;
            }
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr6 = {oVar, oVar};
            Object objA5 = o.d.d.a(-723636472);
            if (objA5 == null) {
                byte b8 = (byte) 0;
                byte b9 = (byte) (b8 - 1);
                objA5 = o.d.d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 386, (char) (ViewConfiguration.getTapTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 18, 39570797, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void C(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r0 = 101 - r7
            byte[] r7 = o.er.aa.$$a
            int r6 = r9 + 4
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r7 != 0) goto L2b
            r2 = r8
            r1 = r6
            r3 = r4
        L12:
            int r6 = r6 + r2
            r2 = r3
            r0 = r6
            r6 = r1
        L16:
            byte r1 = (byte) r0
            r5[r2] = r1
            int r3 = r2 + 1
            if (r2 != r8) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r10[r4] = r0
            return
        L25:
            int r1 = r6 + 1
            r2 = r7[r1]
            r6 = r0
            goto L12
        L2b:
            r2 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.aa.C(short, short, short, java.lang.Object[]):void");
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] b(android.content.Context r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 14345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.aa.b(android.content.Context, int, int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{116, 109, 87, -103};
        $$b = 236;
    }

    static void init$1() {
        $$c = new byte[]{100, 68, -66, 16};
        $$d = 251;
    }

    public final void a(OperationCallback<Void> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f24775h + 3;
        f24770a = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f24794b, operationCallback};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int id = (int) Thread.currentThread().getId();
        int i5 = o.aa.b.f19958i * (-1273408225);
        o.aa.b.f19958i = i5;
        int i6 = o.aa.b.f19959j * (-1192134959);
        o.aa.b.f19959j = i6;
        o.aa.b.a(objArr, iUptimeMillis, 409566510, i5, id, -409566510, i6);
        int i7 = f24770a + 15;
        f24775h = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 81 / 0;
        }
    }

    public final boolean a() {
        boolean zB;
        int i2 = 2 % 2;
        int i3 = f24775h + 73;
        f24770a = i3 % 128;
        if (i3 % 2 != 0) {
            zB = this.f24794b.b();
            int i4 = 46 / 0;
        } else {
            zB = this.f24794b.b();
        }
        int i5 = f24770a + 5;
        f24775h = i5 % 128;
        int i6 = i5 % 2;
        return zB;
    }

    public final void b(k kVar, n nVar, OperationCallback<Void> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f24775h + 77;
        f24770a = i3 % 128;
        if (i3 % 2 == 0) {
            this.f24794b.b(kVar, nVar, operationCallback);
        } else {
            this.f24794b.b(kVar, nVar, operationCallback);
            int i4 = 19 / 0;
        }
    }

    public final void c(k kVar, List<o> list, n nVar, OperationCallback<List<m>> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f24775h + 33;
        f24770a = i3 % 128;
        int i4 = i3 % 2;
        this.f24794b.c(kVar, list, nVar, operationCallback);
        int i5 = f24775h + 111;
        f24770a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
    }

    public final void d(final OperationCallback<k> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        this.f24794b.c(new OperationCallback<k>() { // from class: o.er.aa.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f24796a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static int f24797b = -382450005;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f24798d = 1;

            private void b(k kVar) {
                int i3 = 2 % 2;
                int i4 = f24796a;
                int i5 = (i4 ^ 31) + ((i4 & 31) << 1);
                f24798d = i5 % 128;
                int i6 = i5 % 2;
                operationCallback.onSuccess(kVar);
                f24797b *= -92913156;
                System.identityHashCode(this);
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public final void onError(AntelopError antelopError) {
                int i3 = 2 % 2;
                int i4 = f24796a + 33;
                f24798d = i4 % 128;
                if (i4 % 2 != 0) {
                    operationCallback.onError(antelopError);
                } else {
                    operationCallback.onError(antelopError);
                    int i5 = 47 / 0;
                }
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public final /* synthetic */ void onSuccess(k kVar) {
                int i3 = 2 % 2;
                int i4 = f24798d;
                int i5 = (i4 ^ 69) + ((i4 & 69) << 1);
                f24796a = i5 % 128;
                int i6 = i5 % 2;
                b(kVar);
                if (i6 != 0) {
                    int i7 = 10 / 0;
                }
                int i8 = f24796a + 37;
                f24798d = i8 % 128;
                int i9 = i8 % 2;
            }
        });
        int i3 = f24770a + 33;
        f24775h = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void e(OperationCallback<List<o>> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f24775h + 111;
        f24770a = i3 % 128;
        if (i3 % 2 == 0) {
            this.f24794b.a(operationCallback);
        } else {
            this.f24794b.a(operationCallback);
            int i4 = 39 / 0;
        }
    }
}
