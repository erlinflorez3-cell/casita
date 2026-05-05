package o.ab;

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
import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.common.base.Ascii;
import cz.msebera.android.httpclient.message.TokenParser;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import o.a.o;
import o.ab.e;
import o.cg.f;
import o.cg.g;
import o.cg.h;
import o.cg.i;
import o.ea.f;
import o.ea.m;

/* JADX INFO: loaded from: classes6.dex */
public abstract class j<C extends e<?>> extends c<C> {
    private static final byte[] $$h = null;
    private static final int $$i = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: g */
    private static int f20109g = 0;

    /* JADX INFO: renamed from: h */
    private static char[] f20110h = null;

    /* JADX INFO: renamed from: i */
    private static long f20111i = 0;

    /* JADX INFO: renamed from: j */
    private static int f20112j = 0;

    /* JADX INFO: renamed from: b */
    private o.ef.a f20113b;

    /* JADX INFO: renamed from: c */
    private o.cg.j f20114c;

    /* JADX INFO: renamed from: d */
    private byte[][] f20115d;

    /* JADX INFO: renamed from: o.ab.j$1 */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: b */
        private static int f20116b = 0;

        /* JADX INFO: renamed from: c */
        private static int f20117c = 1;

        /* JADX INFO: renamed from: e */
        static final /* synthetic */ int[] f20118e;

        static {
            int[] iArr = new int[h.values().length];
            f20118e = iArr;
            try {
                iArr[h.f22342e.ordinal()] = 1;
                int i2 = f20117c;
                int i3 = (i2 ^ 5) + (((i2 + 5) - (i2 | 5)) << 1);
                f20116b = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20118e[h.f22339a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20118e[h.f22341d.ordinal()] = 3;
                int i6 = f20117c + 25;
                f20116b = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20118e[h.f22340b.ordinal()] = 4;
                int i9 = f20116b + 27;
                f20117c = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 49 / 0;
                }
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(int r9, short r10, byte r11) {
        /*
            byte[] r8 = o.ab.j.$$h
            int r0 = r10 * 2
            int r7 = 4 - r0
            int r6 = 105 - r9
            int r0 = r11 * 3
            int r5 = 1 - r0
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r8 != 0) goto L2a
            r1 = r7
            r6 = r5
            r2 = r3
        L14:
            int r6 = r6 + r7
            int r7 = r1 + 1
            r1 = r2
        L18:
            int r2 = r1 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r2 != r5) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r8[r7]
            r1 = r7
            r7 = r0
            goto L14
        L2a:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ab.j.$$j(int, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20109g = 0;
        f20112j = 1;
        char[] cArr = new char[1342];
        ByteBuffer.wrap("\u0094\u0097ðÝ\\:¹\u008a\u0005ôa\u0003Î«*\u0011¶\u007f\u0013Ù\u007fpÛh Ö\u008c.é\u0087uôÑV>¶\u009a\u0016ærC\u0096¯!\u000bi\u0090Øü?Y\u0082¥ó\u0001IdÀ\u0000\u0080¬zIÑõ¤\u0091\u0000>îÚ\u000eF`ãÀ\u008fh+4Ðª|i\u0019Ð\u0085µ!\u0010Îûj\\\u0016\u0012³\u008e_wû/`®\fo©ßU´ñ\u000f\u009eú:_°¨Ôèx\u0012\u009d¹!ÌEhê\u0086\u000ef\u0092\b7¨[\u0000ÿ\\\u0004×¨\u0015Í²QÒõh\u001a\u0092¾\"Âzgæ\u008b\u001f/G´ÆØ\u0007}·\u0081Ü%gJ\u0092î7r\u0011\u0097®\u009b\u0082ÿÂS8¶\u0093\nænBÁ¬%L¹\"\u001c\u0082p\u0000Ôv/ßÀ×¤\u0097\bmíÆQ³5\u0017\u009aù~kâ?G\u0086+e\u008f(t\u009dØ\u007f\u0094\u0097ð×\\-¹\u0086\u0005óaWÎ¹*+¶\u007f\u0013Æ\u007f%Ûh Ý\u008c?éÄu¬Ñ\u0002>¨\u009a\u0019æyCÚ¯6\u000bx\u0090\u0089ü$Y\u0088¥ô\u0001\u001dn¬Ê\u000eVz³ß\u001f;{aÀÏ\u0094\u0097ð×\\-¹\u0086\u0005óaWÎ¹*+¶\u007f\u0013Æ\u007f%Ûh Ý\u008c?éÄu¬Ñ\u0002>ª\u009a\u000bæpCÄ¯s\u000b{\u0090Èü&Y\u008b¥å\u0001InþÊ\u0017V{³Ö\u001f5{fÀÆ,\"\u0089Æ\u0015ìqIÞ\u00ad:Z\u0086`ãØO\u0004«b0Î\u009cdù\u0095Eê¡Z\u000eªj\u0010ö6SÚ¿\u001f\u001b)`ÄÌ()Àµó\u0011[~¯Ú\u0003&~\u0083Àï\u0004K(ÐÆ<)\u0099\u008dåòA\\®¹\n\u0003\u0096yó¢_\u0000õO\u0091\u000f=õØ^d+\u0000\u008f¯aKó×§r\u001e\u001eýº°A\u0005íç\u0088\u001c\u0014t°Ú_mûÓ\u0087¢\"\u0000Î«j±ñ\t\u009dñ8ZÄ(`\u0091\u000fo«Ì7¢ÒIÆ\n¢J\u000e°ë\u001bWn3Ê\u009c$x¶äâA[-¸\u0089õr@Þ¢»Y'1\u0083\u009fl\u0010È\u0080´ù\u0011^ý«YâÂ@®÷\u000b\n÷|SÙ</\u0098\u0089\u0004èáHMï)â\u0092G~½Û\u000bG\u007f#Ó\u008c%h\u0093Ôã±B\u001d\u009eù³bPÎ¸«\u0015\u0017sóÇ\\!\u0094\u0097ð×\\-¹\u0086\u0005óaWÎ¹*+¶\u007f\u0013Æ\u007f%Ûh Ý\u008c?éÄu¬Ñ\u0002>¬\u009a\u0013æ|CÆ¯#\u000be\u0090Çü-YÇ¥â\u0001\\n½Ê\u0010Vq³ß\u001f6{/ÀÚ, \u0089\u0095\u0015óqSÞ·:\t\u0086rã\u0090O\u001d«|0Î\u009c'ù\u0084Eñ¡L\u000e±j\u001böq\u0094\u0097ð×\\-¹\u0086\u0005óaWÎ¹*+¶\u007f\u0013Æ\u007f%Ûh Ý\u008c?éÄu¬Ñ\u0002>\u0096\u009a\u0016æaCÓ¯!\u000b~\u0090Üü:Y\u0093¥å\u0001Yn\u009bÊ\u0003Vw³Ô\u001f\"{{ÀÁ,*\u0089\u0088\u0015£qKÞ±:\u0013\u0086{ãÕOM«|0Î\u009c5ù\u0094Eç¡L\u000e¬j\u001cöxSÔ¿L\u001b~`ËÌ+)\u008cµø\u0011J~ûÚ\u0001&a\u0083Öï\u000eK|ÐÀ\u0094\u0097ð×\\-¹\u0086\u0005óaWÎ¹*+¶\u007f\u0013Æ\u007f%Ûh Ý\u008c?éÄu¬Ñ\u0002>¯\u009a\u0019ægC×¯>\u000bi\u0090Ýü/Y\u0095¥ó\u0001\u001dnäÊ[\u0094\u0097ð×\\-¹\u0086\u0005óaWÎ¹*+¶\u007f\u0013Æ\u007f%Ûh Ý\u008c?éÄu¬Ñ\u0002>\u00ad\u009a\u001dæfCÆ¯<\u000bb\u0090Úü/YÇ¥º\u0001\u001d\u0094\u0097ð×\\-¹\u0086\u0005óaWÎ¹*+¶\u007f\u0013Æ\u007f%Ûh Ý\u008c?éÄu¬Ñ\u0002>\u00ad\u009a\u001dædCÃ¯6\u000b\u007f\u0090ÝüjY\u0095¥å\u0001Wn»Ê\u0018V`³Ô\u001f6{/ÀÎ,7\u0089\u0089\u0015îq\u001cÞ»:\u001b\u0086tãÛO\b«`0Ï\u009cdù\u0087Eí¡M\u000eøj\u0001ö~SÖ¿L\u001b{`ÏÌ&)\u0093µò\u0011P~ûÚN&1\u0094\u0097ð×\\-¹\u0086\u0005óaWÎ¹*+¶\u007f\u0013Æ\u007f%Ûh Ý\u008c?éÄu¬Ñ\u0002>ª\u009a\bæqC×¯'\u000be\u0090Çü-YÇ¥÷\u0001\\n²Ê\u0017Vq³Å\u001fr{lÀÇ,+\u0089\u0080\u0015êq[Þù:\u001c\u0086eãßO\u0000«.0Ù\u009c!ù\u0092Eò¡P\u000e¶j\u0006ös\u0094\u0091ðÃ\\'¹\u0090\u0005âanÎ¹*\n¶i\u0013Ö\u007f7Ûd À\u008c,é uàÑV>¾éÂ\u008d\u0082!xÄÓx¦\u001c\u0002³ìW~Ë*n\u0093\u0002p¦=]\u0088ñj\u0094\u0091\bù¬WCéçA\u009b/>\u0096Òbvyí\u0091\u0081z$ÁØ¦|\t\u0013ì·G+/Î\u0083b'\u0006>½\u009cQdôÒhö\f\u001c£üGKû#\u009e\u00912]Ö{M\u009aát\u0084À8²Ü\tsù\u0017E\u008b'\u0094\u0097ð×\\-¹\u0086\u0005óaWÎ¹*+¶\u007f\u0013Æ\u007f%Ûh Ý\u008c?éÄu¬Ñ\u0002>µ\u009a\u000bæzCØ¯s\u000bi\u0090Ñü)Y\u0082¥ð\u0001In·Ê\u0014Vz³\u0091\u001f;{aÀ\u0088,&\u0089\u008a\u0015ìqIÞ½:7\u0086rãÃO\u001e«o0Ì\u009c-ù\u008fEå¡{\u000e¹j\u0001öwS\u0093\u0094\u0097ð×\\-¹\u0086\u0005óaWÎ¹*+¶\u007f\u0013Æ\u007f%Ûh Ý\u008c?éÄu¬Ñ\u0002>¨\u009a\u0019æyCÚ¯6\u000bx\u0090\u0089ü)Y\u0088¥î\u0001[n·Ê\u001cVa³Ã\u001f3{{ÀÁ,*\u0089\u0088\u0015£qIÞ©:\u001e\u0086vãÄO\b«.0Í\u009c%ù\u0088Eî¡Z\u000e¼jUö,S\u0093¿\u0019\u001by`ÎÌ&)\u0094µø\u0011\u001e~¸Ú\u001b&\u007f\u0083Ôï\u0006KoÐ\u0085< \u0099\u0082åõAU®¿\n\u00130¯Tïø\u0015\u001d¾¡ËÅoj\u0081\u008e\u0013\u0012G·þÛ\u001d\u007fP\u0084å(\u0007MüÑ\u0094u:\u009a\u0081>!BDçâ\u000b\u001e¯F4ôXRý¼\u0001×¥hÊ\u008bn\"òB\u0017í»Jß\u001ad°\u0088\r-¿±ÉÕwz\u0084\u009e\u0001\"@Gåë8\u000fW\u0094ý8\u0018]\u009fáÛ\u0005nª\u008cÎ8R\\÷î\u001b\u0017¿^Äöh\u001a\u008dø\u0011\u009fµ&\u0094\u0097ð×\\-¹\u0086\u0005óaWÎ¹*+¶\u007f\u0013Æ\u007f%Ûh Ý\u008c?éÄu¬Ñ\u0002>¹\u009a\u0019æ|CÚ¯&\u000b~\u0090ÌüjY\u0084¥ï\u0001Pn³Ê\u001aVz³Õ\u001fr{\"À\u0088,6\u0089\u0083\u0015÷q\u001cÞ®:\u001b\u0086{ãÜO\b«z0\u008b\u009c7ù\u0095Eã¡K\u000e\u00adj\u0006ö6SÖ¿\u001e\u001b{`ÅÌ5)Àµþ\u0011Q~¿Ú\u0011&1\u0083\u0088ïO\u0094\u0097ð×\\-¹\u0086\u0005óaWÎ¹*+¶\u007f\u0013Æ\u007f%Ûh Ý\u008c?éÄu¬Ñ\u0002>¹\u009a\u0019æ|CÚ¯&\u000b~\u0090ÌüjY\u0084¥ï\u0001Pn³Ê\u001aVz³Õ\u001fr{\"À\u0088,#\u0089\u0087\u0015ïqPÞ»:\u001b\u0086tãÛOM«z0Ä\u009cdù³Eç¡Y\u000e\u00adj\u0006ösS×¿#\u001by`ÏÌ5)\u0081µé\u0011W~´Ú\u001a\u0094\u0097ð×\\-¹\u0086\u0005óaWÎ¹*+¶\u007f\u0013Æ\u007f%Ûh Ý\u008c?éÄu¬Ñ\u0002>\u009e\u009a\bæeCÚ¯:\u000bo\u0090Èü>Y\u008e¥ö\u0001XnþÊ\u001eVf³Ã\u001f={}À\u0088,\u007f\u0089Æ÷\u0090\u0093Ð?*Ú\u0081fô\u0002P\u00ad¾I,ÕxpÁ\u001c\"¸oCÚï8\u008aÃ\u0016«²\u0005]\u008eù\u001e\u0085~ ØÌ0h+óÜ\u009f(:\u0093Æ÷bU\r·©\u000f5vÐ\u0096|6\u0018g£ËO'êÛv¤\u0094\u0097ð×\\-¹\u0086\u0005óaWÎ¹*+¶\u007f\u0013Æ\u007f%Ûh Ý\u008c?éÄu¬Ñ\u0002>\u009c\u009a\u0010æpCÕ¯8\u000b,\u0090Ïü%Y\u0095¥ \u0001\\n«Ê\u000fV|³\u0091\u001f {jÀÛ,0\u0089\u008a\u0015÷Æ\u008c¢Å\u000e#ë\u0092WË3Y\u009c°x\u0013äiAÜZ\u0098>Ø\u0092\"w\u0089Ëü¯X\u0000¶ä$xpÝÉ±*\u0015gîÒB0'Ë»®\u001f\u0000ððT6(o\u008dÍa4Åf^È21\u0097\u0081kìÏS ¥\u0004\u001d\u0098t}ÐÑ}µf\u000eÆâ#G\u0085Ûé¿W\u0010öôOH8\u0094\u0097ð×\\-¹\u0086\u0005óaWÎ¹*+¶\u007f\u0013Æ\u007f%Ûh Ý\u008c?éÄu¬Ñ\u0002>\u009e\u009a\ræaCÞ¯6\u000bb\u0090Ýü#Y\u0084¥á\u0001In·Ê\u0014Vz³\u0091\u001f!{zÀË,&\u0089\u0083\u0015ðqOÞù:W\u00867ãÓO\u0002«`0ß\u009c-ù\u008fE÷¡Z\u0095õñ§]I¸à\u0004\u008c`\u0003ÏÙ+i·\u001f\u0094\u0091ðÃ\\-¹\u0084\u0005èagÎ½*\r¶{\u0013\u0097\u007f}Û- í\u008c'é\u0081uàÑL>ÿ\u009a+æpCÄ¯%\u000bi\u0090ÛüjY\u0095¥å\u0001Ln«Ê\u001eVg³Å\u001fr{\u007fÀÉ,7\u0089\u0087\u0015îqYÞ\u00ad:\u001f\u0086eãÃUÈ1\u009a\u009dtxÝÄ± >\u000fäëTw\"ÒÎ¾$\u001atá´M~(Ø´¹\u0010\u0015ÿ¦[r')\u0082\u0081nyÊ<Q\u0084=z\u0098Èd¼ÀD¯ã\u000bC\u00979r\u0089\u0094\u0091ðÃ\\-¹\u0084\u0005èagÎ½*\r¶{\u0013\u0097\u007f}Û- í\u008c'é\u0081uàÑL>ÿ\u009a-æfCÓ¯!\u000b,\u0090Êü8Y\u0082¥ä\u0001Xn°Ê\u000fV}³Ð\u001f>{|\u0094Ñðý\\-¹\u0094\u0005óaFÎ¯*\r¶N\u0013Ö\u007f#Ûf".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1342);
        f20110h = cArr;
        f20111i = -5583924938587508561L;
    }

    public j(C c2, boolean z2) {
        super(c2, z2);
        this.f20114c = null;
        this.f20115d = null;
    }

    private static void D(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i6 = $11 + 99;
            $10 = i6 % 128;
            if (i6 % i4 != 0) {
                int i7 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f20110h[i2 >> i7])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(742 - (ViewConfiguration.getTapTimeout() >> 16), (char) Drawable.resolveOpacity(0, 0), 12 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 632508977, false, $$j((byte) ($$i & 14), b2, b2), new Class[]{Integer.TYPE});
                    }
                    long jLongValue = ((Long) ((Method) objA).invoke(null, objArr2)).longValue();
                    long j2 = i7;
                    long j3 = f20111i;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(c2);
                    objArr3[i4] = Long.valueOf(j3);
                    objArr3[1] = Long.valueOf(j2);
                    objArr3[0] = Long.valueOf(jLongValue);
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        int defaultSize = 766 - View.getDefaultSize(0, 0);
                        char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 12470);
                        int iMyPid = 12 - (Process.myPid() >> 22);
                        byte b3 = (byte) ($$i & 13);
                        byte b4 = (byte) (b3 - 5);
                        String str$$j = $$j(b3, b4, b4);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Long.TYPE;
                        clsArr[1] = Long.TYPE;
                        clsArr[i4] = Long.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA2 = o.d.d.a(defaultSize, keyRepeatDelay, iMyPid, 1946853218, false, str$$j, clsArr);
                    }
                    jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = new Object[i4];
                    objArr4[1] = oVar;
                    objArr4[0] = oVar;
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        int iArgb = Color.argb(0, 0, 0, 0) + 387;
                        char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int size = View.MeasureSpec.getSize(0) + 18;
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        String str$$j2 = $$j(b5, b6, b6);
                        Class[] clsArr2 = new Class[i4];
                        clsArr2[0] = Object.class;
                        clsArr2[1] = Object.class;
                        objA3 = o.d.d.a(iArgb, c3, size, 39570797, false, str$$j2, clsArr2);
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i8 = oVar.f19947b;
                Object[] objArr5 = {Integer.valueOf(f20110h[i2 + i8])};
                Object objA4 = o.d.d.a(-214519724);
                if (objA4 == null) {
                    int iMyPid2 = (Process.myPid() >> 22) + 742;
                    char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    int iRgb = Color.rgb(0, 0, 0) + 16777228;
                    int i9 = $$i;
                    byte b7 = (byte) 0;
                    objA4 = o.d.d.a(iMyPid2, cMakeMeasureSpec, iRgb, 632508977, false, $$j((byte) ((i9 + 14) - (i9 | 14)), b7, b7), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(f20111i), Integer.valueOf(c2)};
                Object objA5 = o.d.d.a(-1567654649);
                if (objA5 == null) {
                    int i10 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 766;
                    char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12470);
                    int iIndexOf = 11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    byte b8 = (byte) ((-1) - (((-1) - $$i) | ((-1) - 13)));
                    byte b9 = (byte) (b8 - 5);
                    objA5 = o.d.d.a(i10, keyRepeatTimeout, iIndexOf, 1946853218, false, $$j(b8, b9, b9), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = o.d.d.a(-723636472);
                if (objA6 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objA6 = o.d.d.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 387, (char) (ViewConfiguration.getScrollBarSize() >> 8), (Process.myPid() >> 22) + 18, 39570797, false, $$j(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
                i4 = 2;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr8 = {oVar, oVar};
            Object objA7 = o.d.d.a(-723636472);
            if (objA7 == null) {
                byte b12 = (byte) 0;
                byte b13 = b12;
                objA7 = o.d.d.a(387 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 17 - TextUtils.lastIndexOf("", '0', 0), 39570797, false, $$j(b12, b13, b13), new Class[]{Object.class, Object.class});
            }
            ((Method) objA7).invoke(null, objArr8);
        }
        String str = new String(cArr);
        int i11 = $10 + 67;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        objArr[0] = str;
    }

    private static o.bg.a b(h hVar, g gVar) {
        int i2 = 2 % 2;
        int i3 = f20109g + 51;
        f20112j = i3 % 128;
        int i4 = i3 % 2;
        if (hVar == h.f22340b) {
            return o.bg.a.f21047p;
        }
        if (hVar == h.f22339a) {
            return o.bg.a.f21046o;
        }
        if (hVar == h.f22341d) {
            return o.bg.a.f21044m;
        }
        if (gVar == null || gVar != g.f22328c) {
            return null;
        }
        int i5 = f20112j + 41;
        f20109g = i5 % 128;
        int i6 = i5 % 2;
        o.bg.a aVar = o.bg.a.f21044m;
        int i7 = f20109g + 57;
        f20112j = i7 % 128;
        int i8 = i7 % 2;
        return aVar;
    }

    static void init$0() {
        $$h = new byte[]{Ascii.CR, Ascii.ESC, 39, 17};
        $$i = 87;
    }

    private void w() throws Throwable {
        String strD;
        String strIntern;
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        D((char) (21148 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 261 - View.MeasureSpec.getSize(0), 51 - Drawable.resolveOpacity(0, 0), objArr);
        String strIntern2 = ((String) objArr[0]).intern();
        if (f.a()) {
            String strD2 = d();
            Object[] objArr2 = new Object[1];
            D((char) (MotionEvent.axisFromString("") + 21569), 102 - ((byte) KeyEvent.getModifierMetaStateMask()), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14, objArr2);
            f.c(strD2, ((String) objArr2[0]).intern());
        }
        Object obj = null;
        if (l()) {
            int i3 = f20112j + 55;
            f20109g = i3 % 128;
            int i4 = i3 % 2;
            if (!j().s()) {
                int i5 = f20112j + 111;
                f20109g = i5 % 128;
                if (i5 % 2 != 0) {
                    f.a();
                    obj.hashCode();
                    throw null;
                }
                if (f.a()) {
                    String strD3 = d();
                    Object[] objArr3 = new Object[1];
                    D((char) Color.blue(0), 117 - TextUtils.getOffsetAfter("", 0), 35 - (ViewConfiguration.getTapTimeout() >> 16), objArr3);
                    f.d(strD3, ((String) objArr3[0]).intern());
                }
                f().d(o.bg.a.f21055x);
                return;
            }
        }
        o.ea.c.a();
        if (!o.ea.b.j(h())) {
            if (f.a()) {
                String strD4 = d();
                Object[] objArr4 = new Object[1];
                D((char) (ViewConfiguration.getTapTimeout() >> 16), 152 - View.resolveSizeAndState(0, 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 76, objArr4);
                f.c(strD4, ((String) objArr4[0]).intern());
            }
            f().d(o.bg.a.f21038g);
            return;
        }
        o.cg.f fVarA = a(h());
        try {
            this.f20113b = m();
            fVarA.c(o(), this.f20113b);
            e(fVarA.i());
            this.f20114c = k();
            byte[][] bArrP = p();
            this.f20115d = bArrP;
            fVarA.b(this.f20114c, bArrP);
            Object[] objArr5 = {j()};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int priority = Thread.currentThread().getPriority();
            int i6 = o.en.b.f24088c * (-1721916949);
            o.en.b.f24088c = i6;
            Object[] objArr6 = {(o.fm.g) o.en.b.a(-568976488, elapsedCpuTime, objArr5, iUptimeMillis, 568976490, priority, i6)};
            int i7 = o.fm.g.f26061f * 390633709;
            o.fm.g.f26061f = i7;
            Object[] objArr7 = {fVarA, (Long) o.fm.g.b((int) Thread.currentThread().getId(), new Random().nextInt(983859859), Thread.activeCount(), i7, 540695712, -540695709, objArr6)};
            int iMyTid = Process.myTid();
            int i8 = (int) Runtime.getRuntime().totalMemory();
            int iMyTid2 = Process.myTid();
            int i9 = 692187901 * o.cg.f.f22300g;
            o.cg.f.f22300g = i9;
            o.cg.f.c(i8, iMyTid, i9, iMyTid2, 1670596800, -1670596796, objArr7);
            Object[] objArr8 = {j()};
            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            int priority2 = Thread.currentThread().getPriority();
            int i10 = o.en.b.f24088c * (-1721916949);
            o.en.b.f24088c = i10;
            fVarA.d(((o.fm.g) o.en.b.a(-568976488, elapsedCpuTime2, objArr8, iUptimeMillis2, 568976490, priority2, i10)).b().a(h()));
            t();
            try {
                try {
                    try {
                        try {
                            try {
                                f.e eVarT = fVarA.t();
                                if (this.f20114c != null) {
                                    int i11 = f20112j + 91;
                                    f20109g = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        o.m.c.d().d(h(), this.f20114c.b());
                                        throw null;
                                    }
                                    o.m.c.d().d(h(), this.f20114c.b());
                                }
                                if (y()) {
                                    if (o.ea.f.a()) {
                                        int i12 = f20109g + 3;
                                        f20112j = i12 % 128;
                                        int i13 = i12 % 2;
                                        String strD5 = d();
                                        Object[] objArr9 = new Object[1];
                                        D((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 312 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.getCapsMode("", 0, 0) + 53, objArr9);
                                        o.ea.f.c(strD5, ((String) objArr9[0]).intern());
                                        return;
                                    }
                                    return;
                                }
                                if (r()) {
                                    try {
                                        j();
                                        o.en.b.t();
                                        f().e().f();
                                    } catch (InterruptedException unused) {
                                        if (o.ea.f.a()) {
                                            String strD6 = d();
                                            Object[] objArr10 = new Object[1];
                                            D((char) (Process.myPid() >> 22), Color.red(0) + 365, 68 - (ViewConfiguration.getEdgeSlop() >> 16), objArr10);
                                            o.ea.f.d(strD6, ((String) objArr10[0]).intern());
                                        }
                                        f().d(o.bg.a.f21054w);
                                        return;
                                    }
                                }
                                try {
                                    o.dc.d.a().e(h(), true);
                                    i iVarA = i.a(h(), eVarT.b(), fVarA.h(), o());
                                    if (o.ea.f.a()) {
                                        String strD7 = d();
                                        StringBuilder sb = new StringBuilder();
                                        Object[] objArr11 = new Object[1];
                                        D((char) Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionChild(0L) + 434, 'N' - AndroidCharacter.getMirror('0'), objArr11);
                                        o.ea.f.c(strD7, sb.append(((String) objArr11[0]).intern()).append(iVarA.e()).toString());
                                    }
                                    if (o.ea.f.a()) {
                                        String strD8 = d();
                                        StringBuilder sb2 = new StringBuilder();
                                        Object[] objArr12 = new Object[1];
                                        D((char) View.combineMeasuredStates(0, 0), 463 - (KeyEvent.getMaxKeyCode() >> 16), 28 - Color.blue(0), objArr12);
                                        o.ea.f.c(strD8, sb2.append(((String) objArr12[0]).intern()).append(iVarA.b()).toString());
                                    }
                                    long jC = iVarA.c().c();
                                    if (o.en.g.e(h(), jC)) {
                                        i().a(new Date(jC * 1000));
                                    }
                                    int i14 = i.f22351a * 54917210;
                                    i.f22351a = i14;
                                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                    int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                                    int i15 = i.f22352b * (-842077802);
                                    i.f22352b = i15;
                                    if (((Long) i.b(iElapsedRealtime, i14, i15, -1938085664, new Object[]{iVarA}, 1938085665, elapsedCpuTime3)) != null) {
                                        o.bt.e eVarC = o.bt.e.c();
                                        int i16 = i.f22351a * 54917210;
                                        i.f22351a = i16;
                                        int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                        int elapsedCpuTime4 = (int) Process.getElapsedCpuTime();
                                        int i17 = i.f22352b * (-842077802);
                                        i.f22352b = i17;
                                        eVarC.c((Long) i.b(iElapsedRealtime2, i16, i17, -1938085664, new Object[]{iVarA}, 1938085665, elapsedCpuTime4));
                                    }
                                    if (o.f.b.d(h(), iVarA.c().d())) {
                                        i().b();
                                    }
                                    int i18 = AnonymousClass1.f20118e[iVarA.j().ordinal()];
                                    if (i18 != 2) {
                                        if (i18 != 3) {
                                            if (i18 == 4) {
                                                o.c.a.h(h());
                                                Object[] objArr13 = {i()};
                                                int i19 = o.by.g.f21850a * (-1858193773);
                                                o.by.g.f21850a = i19;
                                                int i20 = o.by.g.f21853d * 1414328504;
                                                o.by.g.f21853d = i20;
                                                int i21 = o.by.g.f21852c * (-2003308375);
                                                o.by.g.f21852c = i21;
                                                int i22 = o.by.g.f21854e * 1746513136;
                                                o.by.g.f21854e = i22;
                                                o.by.g.e(objArr13, i20, i21, i22, i19, -192268551, 192268551);
                                            }
                                        } else if (o.c.a.f(h())) {
                                            int i23 = f20109g + 97;
                                            f20112j = i23 % 128;
                                            if (i23 % 2 == 0) {
                                                i().d();
                                                f().d(o.bg.a.f21044m);
                                                throw null;
                                            }
                                            i().d();
                                            f().d(o.bg.a.f21044m);
                                        }
                                    } else if (o.c.a.c(h())) {
                                        int i24 = f20112j + 117;
                                        f20109g = i24 % 128;
                                        if (i24 % 2 != 0) {
                                            i().d(iVarA.c().b().b());
                                            o.cg.c cVarE = iVarA.c().e();
                                            o.cg.c[] cVarArr = new o.cg.c[4];
                                            cVarArr[0] = o.cg.c.f22265r;
                                            cVarArr[1] = o.cg.c.f22264q;
                                            if (m.c.e(cVarE, cVarArr)) {
                                                i().j();
                                            }
                                        } else {
                                            i().d(iVarA.c().b().b());
                                            if (m.c.e(iVarA.c().e(), o.cg.c.f22265r, o.cg.c.f22264q)) {
                                                i().j();
                                            }
                                        }
                                    }
                                    if (iVarA.f() != null && iVarA.f() == g.f22328c) {
                                        o.c.c cVarE2 = o.c.a.e(h());
                                        if (o.c.a.f(h())) {
                                            int i25 = f20112j + 65;
                                            f20109g = i25 % 128;
                                            int i26 = i25 % 2;
                                            if (cVarE2 == o.c.c.f21969a) {
                                                i().c();
                                            } else {
                                                i().d();
                                            }
                                        }
                                    }
                                    if (!iVarA.c().a()) {
                                        o.bg.a aVarB = b(iVarA);
                                        f().d(aVarB);
                                        if (o.ea.f.a()) {
                                            String strD9 = d();
                                            StringBuilder sb3 = new StringBuilder();
                                            Object[] objArr14 = new Object[1];
                                            D((char) (ViewConfiguration.getPressedStateDuration() >> 16), 491 - KeyEvent.keyCodeFromString(""), 64 - TextUtils.getOffsetBefore("", 0), objArr14);
                                            o.ea.f.d(strD9, sb3.append(((String) objArr14[0]).intern()).append(aVarB).toString());
                                        }
                                        return;
                                    }
                                    if (o.ea.f.a()) {
                                        String strD10 = d();
                                        Object[] objArr15 = new Object[1];
                                        D((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 555 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 53, objArr15);
                                        o.ea.f.c(strD10, ((String) objArr15[0]).intern());
                                    }
                                    o.fj.e eVarB = j().b(h(), iVarA.e());
                                    i().e(eVarB);
                                    f().b(h(), j(), eVarB);
                                    try {
                                        o.ef.a aVarV = iVarA.b().v(o());
                                        if (aVarV != null) {
                                            Object[] objArr16 = new Object[1];
                                            D((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 608 - Color.red(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 18, objArr16);
                                            o.ef.a aVarV2 = aVarV.v(((String) objArr16[0]).intern());
                                            if (aVarV2 != null && o.bk.e.d(h()).e().d(h(), aVarV2)) {
                                                if (o.ea.f.a()) {
                                                    int i27 = f20112j + 17;
                                                    f20109g = i27 % 128;
                                                    if (i27 % 2 != 0) {
                                                        strD = d();
                                                        Object[] objArr17 = new Object[1];
                                                        D((char) (ExpandableListView.getPackedPositionType(0L) + 32034), (TypedValue.complexToFloat(1) > 1.0f ? 1 : (TypedValue.complexToFloat(1) == 1.0f ? 0 : -1)) + 25064, 117 >> TextUtils.indexOf("", TokenParser.CR), objArr17);
                                                        strIntern = ((String) objArr17[0]).intern();
                                                    } else {
                                                        strD = d();
                                                        Object[] objArr18 = new Object[1];
                                                        D((char) (ExpandableListView.getPackedPositionType(0L) + 32085), 626 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 54, objArr18);
                                                        strIntern = ((String) objArr18[0]).intern();
                                                    }
                                                    o.ea.f.c(strD, strIntern);
                                                }
                                                new o.bo.e();
                                                o.bo.e.b(h());
                                                Object[] objArr19 = {f().e(), h(), j(), o.dd.g.D};
                                                int i28 = o.bg.b.f21063c * (-1736728553);
                                                o.bg.b.f21063c = i28;
                                                int i29 = o.bg.b.f21064d * 798932806;
                                                o.bg.b.f21064d = i29;
                                                int iElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                                                int i30 = o.bg.b.f21061a * 1360672158;
                                                o.bg.b.f21061a = i30;
                                                o.bg.b.c(-717841723, objArr19, i28, i30, iElapsedRealtime3, 717841723, i29);
                                            }
                                        }
                                    } catch (o.ef.b e2) {
                                        if (o.ea.f.a()) {
                                            String strD11 = d();
                                            StringBuilder sb4 = new StringBuilder();
                                            Object[] objArr20 = new Object[1];
                                            D((char) ((Process.getThreadPriority(0) + 20) >> 6), 678 - MotionEvent.axisFromString(""), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 54, objArr20);
                                            o.ea.f.d(strD11, sb4.append(((String) objArr20[0]).intern()).append(e2).toString());
                                        }
                                        f().d(o.bg.a.f21036e);
                                    }
                                    Object[] objArr21 = {f()};
                                    o.bg.c.f21082a = o.bg.c.f21082a * 1232037242;
                                    int iMyUid = Process.myUid();
                                    o.bg.c.f21083c = o.bg.c.f21083c * 1942342535;
                                    if (!((Boolean) o.bg.c.a(r11, r12, iMyUid, -1017985026, objArr21, 1017985027, new Random().nextInt())).booleanValue()) {
                                        if (o.ea.f.a()) {
                                            String strD12 = d();
                                            Object[] objArr22 = new Object[1];
                                            D((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 733, 74 - View.resolveSizeAndState(0, 0, 0), objArr22);
                                            o.ea.f.d(strD12, ((String) objArr22[0]).intern());
                                        }
                                        return;
                                    }
                                    Object[] objArr23 = {iVarA, o()};
                                    int i31 = i.f22354d * (-379313138);
                                    i.f22354d = i31;
                                    int iMyTid3 = Process.myTid();
                                    int i32 = i.f22355e * 1893761032;
                                    i.f22355e = i32;
                                    int i33 = i.f22353c * 1010539156;
                                    i.f22353c = i33;
                                    int iIntValue = ((Integer) i.b(iMyTid3, i31, i33, 853933007, objArr23, -853933007, i32)).intValue();
                                    if (iIntValue != 0 && !e(iIntValue)) {
                                        o.bg.a aVarB2 = b(iIntValue);
                                        if (aVarB2 != null) {
                                            if (o.ea.f.a()) {
                                                String strD13 = d();
                                                StringBuilder sb5 = new StringBuilder();
                                                Object[] objArr24 = new Object[1];
                                                D((char) (42040 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getEdgeSlop() >> 16) + 807, 60 - ImageFormat.getBitsPerPixel(0), objArr24);
                                                o.ea.f.d(strD13, sb5.append(((String) objArr24[0]).intern()).append(aVarB2).toString());
                                            }
                                            f().d(aVarB2);
                                        } else {
                                            o.bg.a aVarB3 = b(iVarA.j(), iVarA.f());
                                            if (aVarB3 != null) {
                                                if (o.ea.f.a()) {
                                                    String strD14 = d();
                                                    StringBuilder sb6 = new StringBuilder();
                                                    Object[] objArr25 = new Object[1];
                                                    D((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 868, AndroidCharacter.getMirror('0') + 18, objArr25);
                                                    o.ea.f.d(strD14, sb6.append(((String) objArr25[0]).intern()).append(aVarB3).toString());
                                                }
                                                f().d(aVarB3);
                                            } else {
                                                if (o.ea.f.a()) {
                                                    String strD15 = d();
                                                    Object[] objArr26 = new Object[1];
                                                    D((char) View.MeasureSpec.getMode(0), Color.blue(0) + 934, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 63, objArr26);
                                                    o.ea.f.d(strD15, ((String) objArr26[0]).intern());
                                                }
                                                f().d(o.bg.a.f21037f);
                                            }
                                        }
                                        if (o.ea.f.a()) {
                                            String strD16 = d();
                                            StringBuilder sb7 = new StringBuilder();
                                            Object[] objArr27 = new Object[1];
                                            D((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 997 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 37 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr27);
                                            o.ea.f.d(strD16, sb7.append(((String) objArr27[0]).intern()).append(f().c()).toString());
                                        }
                                        return;
                                    }
                                    if (o.ea.f.a()) {
                                        String strD17 = d();
                                        StringBuilder sb8 = new StringBuilder();
                                        Object[] objArr28 = new Object[1];
                                        D((char) (TextUtils.getOffsetAfter("", 0) + 25351), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + PhotoshopDirectory.TAG_COPYRIGHT, 38 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr28);
                                        o.ea.f.c(strD17, sb8.append(((String) objArr28[0]).intern()).append(iIntValue).toString());
                                    }
                                    try {
                                        o.ef.a aVarX = iVarA.b().x(o());
                                        if (o.ea.f.a()) {
                                            String strD18 = d();
                                            Object[] objArr29 = new Object[1];
                                            D((char) (ExpandableListView.getPackedPositionChild(0L) + 1), AndroidCharacter.getMirror('0') + 1024, 38 - (ViewConfiguration.getScrollBarSize() >> 8), objArr29);
                                            o.ea.f.c(strD18, ((String) objArr29[0]).intern());
                                        }
                                        Object[] objArr30 = new Object[1];
                                        D((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21022), 1111 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr30);
                                        Short shA = aVarX.a(((String) objArr30[0]).intern(), (Short) null);
                                        if (shA != null) {
                                            if (shA.shortValue() != 0) {
                                                if (o.ea.f.a()) {
                                                    String strD19 = d();
                                                    StringBuilder sb9 = new StringBuilder();
                                                    Object[] objArr31 = new Object[1];
                                                    D((char) (52751 - (ViewConfiguration.getFadingEdgeLength() >> 16)), Color.green(0) + 1120, 42 - ExpandableListView.getPackedPositionType(0L), objArr31);
                                                    o.ea.f.c(strD19, sb9.append(((String) objArr31[0]).intern()).append(shA).toString());
                                                }
                                                short sShortValue = shA.shortValue();
                                                if (sShortValue == 1) {
                                                    f().d(o.bg.a.az);
                                                } else if (sShortValue == 2) {
                                                    f().d(o.bg.a.ay);
                                                } else if (sShortValue == 3) {
                                                    f().d(o.bg.a.ax);
                                                } else if (sShortValue != 4) {
                                                    f().d(o.bg.a.f21036e);
                                                } else {
                                                    f().d(o.bg.a.aG);
                                                }
                                                return;
                                            }
                                            if (o.ea.f.a()) {
                                                int i34 = f20112j + 89;
                                                f20109g = i34 % 128;
                                                int i35 = i34 % 2;
                                                String strD20 = d();
                                                Object[] objArr32 = new Object[1];
                                                D((char) (ViewConfiguration.getScrollBarSize() >> 8), 1162 - TextUtils.indexOf("", ""), 49 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr32);
                                                o.ea.f.c(strD20, ((String) objArr32[0]).intern());
                                            }
                                        }
                                        if (this.f20114c != null) {
                                            int i36 = f20109g + 63;
                                            f20112j = i36 % 128;
                                            if (i36 % 2 == 0) {
                                                f().e().c(this.f20114c.b());
                                                throw null;
                                            }
                                            f().e().c(this.f20114c.b());
                                        }
                                        i().c(iVarA.d(), iVarA.a());
                                        iVarA.e();
                                        a(aVarX);
                                    } catch (o.ef.b e3) {
                                        if (o.ea.f.a()) {
                                            String strD21 = d();
                                            StringBuilder sb10 = new StringBuilder();
                                            Object[] objArr33 = new Object[1];
                                            D((char) (25048 - KeyEvent.normalizeMetaState(0)), Drawable.resolveOpacity(0, 0) + 229, 32 - Color.green(0), objArr33);
                                            o.ea.f.d(strD21, sb10.append(((String) objArr33[0]).intern()).append(e3).toString());
                                        }
                                        f().d(o.bg.a.f21036e);
                                    }
                                } finally {
                                    o.dc.d.a().e(h(), false);
                                }
                            } catch (o.bk.d e4) {
                                if (o.ea.f.a()) {
                                    o.ea.f.e(d(), strIntern2, e4);
                                }
                                f().d(e4.c());
                                if (this.f20114c != null) {
                                    o.m.c.d().d(h(), this.f20114c.b());
                                }
                            } catch (o.bw.d e5) {
                                if (o.ea.f.a()) {
                                    o.ea.f.e(d(), strIntern2, e5);
                                }
                                f().d(o.bg.a.f21045n);
                                if (this.f20114c != null) {
                                    o.m.c.d().d(h(), this.f20114c.b());
                                }
                            }
                        } catch (o.bu.c e6) {
                            if (o.ea.f.a()) {
                                o.ea.f.e(d(), strIntern2, e6);
                            }
                            f().d(e6.c().a());
                            if (this.f20114c != null) {
                                o.m.c.d().d(h(), this.f20114c.b());
                            }
                        }
                    } catch (o.bt.b e7) {
                        if (o.ea.f.a()) {
                            o.ea.f.e(d(), strIntern2, e7);
                        }
                        f().d(o.bg.a.C);
                        if (this.f20114c != null) {
                            o.m.c.d().d(h(), this.f20114c.b());
                        }
                    }
                } catch (o.cg.a e8) {
                    if (o.ea.f.a()) {
                        o.ea.f.e(d(), strIntern2, e8);
                    }
                    f().d(e8.c().c());
                    if (this.f20114c != null) {
                        o.m.c.d().d(h(), this.f20114c.b());
                    }
                }
            } catch (Throwable th) {
                if (this.f20114c != null) {
                    o.m.c.d().d(h(), this.f20114c.b());
                }
                throw th;
            }
        } catch (o.ef.b e9) {
            if (o.ea.f.a()) {
                String strD22 = d();
                StringBuilder sb11 = new StringBuilder();
                Object[] objArr34 = new Object[1];
                D((char) (25049 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 229 - Color.alpha(0), 31 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr34);
                o.ea.f.c(strD22, sb11.append(((String) objArr34[0]).intern()).append(e9).toString());
            }
            f().d(o.bg.a.f21032a);
        }
    }

    private void x() throws Throwable {
        String strD;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f20112j + 99;
        f20109g = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            String strD2 = d();
            Object[] objArr = new Object[1];
            D((char) ((ViewConfiguration.getTouchSlop() >> 8) + IptcDirectory.TAG_UNIQUE_OBJECT_NAME), TextUtils.lastIndexOf("", '0') + 1213, ((byte) KeyEvent.getModifierMetaStateMask()) + 10, objArr);
            o.ea.f.c(strD2, ((String) objArr[0]).intern());
        }
        if (this.f20113b != null) {
            if (o.ea.f.a()) {
                int i5 = f20109g + 121;
                f20112j = i5 % 128;
                int i6 = i5 % 2;
                String strD3 = d();
                Object[] objArr2 = new Object[1];
                D((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), ExpandableListView.getPackedPositionChild(0L) + 1222, 43 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
                o.ea.f.c(strD3, ((String) objArr2[0]).intern());
            }
            this.f20113b.b();
            this.f20113b = null;
        }
        if (this.f20115d != null) {
            if (o.ea.f.a()) {
                String strD4 = d();
                Object[] objArr3 = new Object[1];
                D((char) (49496 - TextUtils.lastIndexOf("", '0', 0, 0)), View.MeasureSpec.getSize(0) + 1264, (ViewConfiguration.getTapTimeout() >> 16) + 32, objArr3);
                o.ea.f.c(strD4, ((String) objArr3[0]).intern());
                int i7 = f20112j + 49;
                f20109g = i7 % 128;
                int i8 = i7 % 2;
            }
            int i9 = 0;
            while (true) {
                byte[][] bArr = this.f20115d;
                if (i9 >= bArr.length) {
                    break;
                }
                int i10 = f20109g + 59;
                f20112j = i10 % 128;
                if (i10 % 2 == 0) {
                    Arrays.fill(bArr[i9], (byte) 0);
                    i9 += 72;
                } else {
                    Arrays.fill(bArr[i9], (byte) 0);
                    i9++;
                }
            }
            this.f20115d = null;
        }
        if (this.f20114c == null || u()) {
            return;
        }
        if (o.ea.f.a()) {
            int i11 = f20109g + 43;
            f20112j = i11 % 128;
            if (i11 % 2 == 0) {
                strD = d();
                Object[] objArr4 = new Object[1];
                D((char) View.MeasureSpec.getSize(0), 5719 >> (ViewConfiguration.getEdgeSlop() >> 86), (ViewConfiguration.getScrollDefaultDelay() * 26) + 39, objArr4);
                obj = objArr4[0];
            } else {
                strD = d();
                Object[] objArr5 = new Object[1];
                D((char) View.MeasureSpec.getSize(0), 1296 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 34, objArr5);
                obj = objArr5[0];
            }
            o.ea.f.c(strD, ((String) obj).intern());
        }
        this.f20114c.c();
    }

    public abstract o.cg.f a(Context context);

    public abstract void a(o.ef.a aVar) throws o.ef.b;

    public o.bg.a b(int i2) {
        int i3 = 2 % 2;
        int i4 = f20112j + 117;
        int i5 = i4 % 128;
        f20109g = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 95;
        f20112j = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 24 / 0;
        }
        return null;
    }

    public o.bg.a b(i iVar) {
        int i2 = 2 % 2;
        int i3 = f20109g + 59;
        f20112j = i3 % 128;
        int i4 = i3 % 2;
        if (iVar.c().e() == o.cg.c.f22267t) {
            int i5 = f20109g + 55;
            f20112j = i5 % 128;
            int i6 = i5 % 2;
            return o.bg.a.f21035d;
        }
        o.bg.a aVarB = b(iVar.j(), iVar.f());
        if (aVarB == null) {
            return iVar.c().e().c();
        }
        int i7 = f20112j + 39;
        f20109g = i7 % 128;
        int i8 = i7 % 2;
        return aVarB;
    }

    @Override // o.ab.c
    public String d() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder().append(e().e());
        Object[] objArr = new Object[1];
        D((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1329 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12, objArr);
        String string = sbAppend.append(((String) objArr[0]).intern()).toString();
        int i3 = f20109g + 45;
        f20112j = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public void e(o.ef.a aVar) throws o.ef.b {
        int i2 = 2 % 2;
        int i3 = f20109g + 97;
        f20112j = i3 % 128;
        int i4 = i3 % 2;
    }

    public boolean e(int i2) {
        int i3 = 2 % 2;
        int i4 = f20109g + 61;
        int i5 = i4 % 128;
        f20112j = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 117;
        f20109g = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x010a  */
    @Override // o.ab.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void g() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ab.j.g():void");
    }

    public abstract o.cg.j k();

    public boolean l() {
        int i2 = 2 % 2;
        int i3 = f20109g;
        int i4 = i3 + 53;
        f20112j = i4 % 128;
        boolean z2 = i4 % 2 != 0;
        int i5 = i3 + 55;
        f20112j = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return z2;
    }

    public abstract o.ef.a m() throws o.ef.b;

    public abstract String o();

    public abstract byte[][] p();

    public void q() {
        int i2 = 2 % 2;
        int i3 = f20109g + 115;
        f20112j = i3 % 128;
        int i4 = i3 % 2;
    }

    public boolean r() {
        int i2 = 2 % 2;
        int i3 = f20112j + 59;
        int i4 = i3 % 128;
        f20109g = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 65;
        f20112j = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void s() {
        int i2 = 2 % 2;
        int i3 = f20112j + 77;
        f20109g = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 1 / 0;
        }
    }

    public void t() {
        int i2 = 2 % 2;
        int i3 = f20109g + 59;
        f20112j = i3 % 128;
        int i4 = i3 % 2;
    }

    public boolean u() {
        int i2 = 2 % 2;
        int i3 = f20109g + 103;
        int i4 = i3 % 128;
        f20112j = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 19;
        f20109g = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public boolean y() {
        int i2 = 2 % 2;
        int i3 = f20109g + 41;
        f20112j = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }
}
