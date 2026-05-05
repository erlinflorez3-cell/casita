package o.m;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends m {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    public static int A = 0;
    public static int B = 0;

    /* JADX INFO: renamed from: a */
    public static int f26453a = 0;

    /* JADX INFO: renamed from: b */
    public static int f26454b = 0;

    /* JADX INFO: renamed from: c */
    public static int f26455c = 0;

    /* JADX INFO: renamed from: d */
    public static int f26456d = 0;

    /* JADX INFO: renamed from: e */
    public static int f26457e = 0;

    /* JADX INFO: renamed from: f */
    public static int f26458f = 0;

    /* JADX INFO: renamed from: j */
    public static int f26459j = 0;

    /* JADX INFO: renamed from: q */
    private static long f26460q = 0;

    /* JADX INFO: renamed from: r */
    private static final byte[] f26461r;

    /* JADX INFO: renamed from: t */
    private static char[] f26462t = null;

    /* JADX INFO: renamed from: u */
    private static int f26463u = 0;

    /* JADX INFO: renamed from: v */
    public static int f26464v = 0;

    /* JADX INFO: renamed from: w */
    private static int f26465w = 0;

    /* JADX INFO: renamed from: x */
    private static int f26466x = 0;

    /* JADX INFO: renamed from: y */
    private static int f26467y = 0;

    /* JADX INFO: renamed from: z */
    public static int f26468z = 0;

    /* JADX INFO: renamed from: p */
    private short f26469p;

    /* JADX INFO: renamed from: s */
    private short f26470s;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r9, byte r10, short r11) {
        /*
            int r0 = r10 * 3
            int r8 = r0 + 1
            byte[] r7 = o.m.g.$$c
            int r0 = r11 * 2
            int r6 = r0 + 4
            int r0 = r9 + 99
            byte[] r5 = new byte[r8]
            r4 = 0
            if (r7 != 0) goto L27
            r1 = r6
            r3 = r4
        L13:
            int r6 = r6 + r0
            int r1 = r1 + 1
            r2 = r3
        L17:
            byte r0 = (byte) r6
            int r3 = r2 + 1
            r5[r2] = r0
            if (r3 != r8) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            r0 = r7[r1]
            goto L13
        L27:
            r2 = r4
            r1 = r6
            r6 = r0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.g.$$i(short, byte, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        B = -579359947;
        A = -865754258;
        f26468z = 1141388358;
        f26464v = -117543926;
        init$0();
        f26458f = -910110185;
        f26459j = 1233184773;
        f26456d = 257967027;
        f26454b = -599574548;
        f26453a = 1735763862;
        f26457e = -1420353995;
        f26455c = -2093379998;
        f26467y = 0;
        f26463u = 1;
        f26465w = 0;
        f26466x = 1;
        a();
        AudioTrack.getMaxVolume();
        ViewConfiguration.getScrollFriction();
        View.getDefaultSize(0, 0);
        ExpandableListView.getPackedPositionGroup(0L);
        Color.red(0);
        ViewConfiguration.getKeyRepeatDelay();
        ViewConfiguration.getFadingEdgeLength();
        ViewConfiguration.getScrollDefaultDelay();
        View.getDefaultSize(0, 0);
        SystemClock.elapsedRealtimeNanos();
        KeyEvent.getMaxKeyCode();
        TextUtils.indexOf("", "", 0, 0);
        f26461r = new byte[]{1};
        int i2 = f26463u + 5;
        f26467y = i2 % 128;
        int i3 = i2 % 2;
    }

    public g() {
        super(i.f26496d);
    }

    private static void D(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o.a.o oVar = new o.a.o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f26462t[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 741, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), Gravity.getAbsoluteGravity(0, 0) + 12, 632508977, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f26460q), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 1;
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(767 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (Color.green(0) + 12470), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12, 1946853218, false, $$i(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    objA3 = o.d.d.a(387 - TextUtils.getOffsetBefore("", 0), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 18 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 39570797, false, $$i((byte) 6, b6, b6), new Class[]{Object.class, Object.class});
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
            int i6 = $10 + 37;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b7 = (byte) 0;
                objA4 = o.d.d.a(((byte) KeyEvent.getModifierMetaStateMask()) + 388, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 19 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 39570797, false, $$i((byte) 6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i8 = $11 + 107;
        $10 = i8 % 128;
        if (i8 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i9 = 98 / 0;
            objArr[0] = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void E(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 97
            int r0 = r7 * 4
            int r7 = r0 + 1
            int r0 = r9 * 2
            int r6 = r0 + 4
            byte[] r5 = o.m.g.$$a
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r5 != 0) goto L2b
            r8 = r7
            r2 = r6
            r1 = r3
        L14:
            int r8 = r8 + r6
            int r6 = r2 + 1
        L17:
            byte r0 = (byte) r8
            r4[r1] = r0
            int r1 = r1 + 1
            if (r1 != r7) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r10[r3] = r0
            return
        L26:
            r0 = r5[r6]
            r2 = r6
            r6 = r0
            goto L14
        L2b:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.g.E(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void F(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r0 = r7 * 7
            int r7 = 17 - r0
            byte[] r6 = o.m.g.$$g
            int r0 = r9 * 7
            int r5 = r0 + 1
            int r4 = 111 - r8
            byte[] r3 = new byte[r5]
            r2 = 0
            if (r6 != 0) goto L2a
            r0 = r5
            r1 = r2
        L13:
            int r4 = r4 + r0
            int r4 = r4 + (-4)
        L16:
            byte r0 = (byte) r4
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 != r5) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            r10[r2] = r0
            return
        L25:
            int r7 = r7 + 1
            r0 = r6[r7]
            goto L13
        L2a:
            r1 = r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.g.F(short, int, short, java.lang.Object[]):void");
    }

    static void a() {
        char[] cArr = new char[1348];
        ByteBuffer.wrap("\u0094ºØt\rnr}§g\u0014mYX\u008ebód F\u0095qÚt\u000fr|n¡m\u0016f[p\u0088\\ýi\"k\u0097vÄ|\tv~o£s\u0010vEu\u008acÿ\u007f,~\u0091~Æ^\u000bwxY\u00adD\u0012@GJG\u009e\u000bvÞt¡ctuÇd\u008a~]Z zóYF{\tzÜs¯JrnÅy\u0088}[w.gc1/ÙúÛ\u0085ÌPÚãË®Ñyõ\u0004Õ×öbÔ-ÕøÜ\u008båVÁáÖ¬Ò\u007fØ\nÈÕ\u008e`\u00823\u0088þç\u0089ÅTßç\u0084²ò}Ç\bËÛÌfÄ1Öüî\u008fýZóåÿ°øCý\u000eôÙÿdõ7àÂµ\u008dãXäëñ¶öA÷\u0094\u0080Øh\rjr}§k\u0014zY`\u008eDód G\u0095eÚd\u000fm|T¡p\u0016g[c\u0088iýy\"?\u00973Ä9\t[~t£w\u0010xEu\u008ayÿr,1\u0091vÆr\u000b{xA\u00adY\u0012]GK\u0094\u0080Øh\rjr}§k\u0014zY`\u008eDód G\u0095eÚd\u000fm|T¡p\u0016g[c\u0088iýy\"?\u00973Ä9\tQ~u£y\u0010gEq\u008azÿs,\u007f\u0091dÆ3\u000b@xH\u00adA\u0012@GZ´Lùe.J\u0093DÀD5CzB¯K\u001cDAN¶Wûc(I\u009dHÂZ7SdI©L\u001exCU°@åZ*C\u009f\fÌ\u0011\u0006^J¶\u009f´à£5µ\u0086¤Ë¾\u001c\u009aaº²\u0099\u0007»Hº\u009d³î\u008a3®\u0084¹É½\u001a·o§°á\u0005íVç\u009b\u0085ìª1©\u0082¦×«\u0018§m¬¾ï\u0003½T¸\u0099¯ê\u0090?\u0097\u0080\u0082Õ\u0083&×k\u0081¼\u009c\u0001\u0080R\u0093§Úè\u0091=\u0081\u008e\u009dÓ\u008c$\u0094i\u0098ºÃ\u000f\u0092P\u0088¥\u008eö\u0080;Ê\u008cÅÑ\u0096\"\u008ew\u0099¸\u008c\r\u009c^Ï£¼ô\u00889\u0081\u008aüßæ ôuÝÆö\u000bø\\ô¡óòþG÷\u0088üÝö.ësßÄé\tèZæ¯ïðñEô\u0096ÄÛé,ðqêÂÿù\u0017µÿ`ó\u001fõÊùyû4ïãý\u009eÚMäøò·ðbð\u0011üÌç{ù6ðåâ\u0090üO¬ú ©ªdü\u0013éÎå}ê(âçð\u0092¥Aïüâ«îfà\u0015ÙÀÚ\u007fÑ*ØÙÔ\u0094ÏC\u0098þÌ\u00adÅXÖ\u0017ÓÂÐq\u0092,\u0089Û\u0090\u0096ÝEÇðÍ¯\u008cZÎ\t\u008aÄÂsÛ.\u0089ÝÈ\u0088ÈGÐò\u0085¡Á\\Ì\u000bÎÆÒu« ³ß¨\u008a¸9¾Çc\u008b\u008b^\u0087!\u0081ô\u008dG\u008f\n\u009bÝ\u0089 ®s\u0090Æ\u0086\u0089\u0084\\\u0084/\u0088ò\u0093E\u008d\b\u0084Û\u0096®\u0088qØÄÔ\u0097ÞZ\u0090-\u0088ð\u0095C\u0097\u0016\u0081ÙÐ¬\u0085\u007f\u009eÂ\u0096\u0095\u009aXÕ+½þªA¤\u0014¥ç«ª»}ìÀ \u0093£f\u00ad)¡ü¦O£\u0012ªå¡¨«{®Îû\u0091\u00addª7¿ú¸M¹\u0010ýãè¶óy³Ì¾\u009f¸b¤5¡ø¹KÞ\u001eÂáÆ´Î\u0007\u008eÊÃ\u009dÅ`Ï3\u0082\u0086À\u0094\u0080Øh\rjr}§k\u0014zY`\u008eXó~ d\u0095pÚr\u000fu|!¡-\u0016#[a\u0088kýq\"?\u0097$Ä9\t=~h£:\u00108E4\u008axÿ`,t\u0091bÆa\u000b{xI\u00adH\u0012JG@´\tù[._\u0093KÀQ5QzT¯\u0006\u001c\u001bA\u0000¶\u0006ûQ\u0094\u009bØ~\rDrv§l\u0014{Ya\u008eoóZ l\u0095jÚT\u000fc|u¡I\u0016m[N\u0088tý~\"\\\u0097>Ä#\t8~U£o\u0010yEx\u008a7ÿU,G\u0091]Æ3\u000baxY\u00adM\u0012[G[´Z\u0094\u009bØ~\r_rj§zhK$®ñ\u0094\u008e¦[¼è«¥±r¿\u000f\u008aÜ¼iº&\u0084ó³\u0080¥]\u0099ê½§\u009et¤\u0001®Þ\u008ckî8äõè\u0082®_¸ì·¹«vµ\u0003æÐ¶m¨:ª÷®\u0084\u0098QÜî\u008d»\u009bH\u0098\u0005\u009cÒ\u0092o\u0094<\u0092ÉÔ\u0086\u009bS\u009fà\u0093½ÐJ\u0090\u0007ÒÔ\u009ea\u0098>\u008eË\u009a\u0098\u009cU\u009b\u0094\u0080Øh\rjr}§k\u0014zY`\u008eCós g\u0095vÚn\u000fb|Q¡i\u0016m[N\u0088tý~\"\\\u0097]Äv\tm~u£n\u0010pEf\u008a7ÿ,,1\u0091^Æf\u000b~xA\u00ad\f\u0012lGx´dù\b.X\u0093^ÀD5PzR¯Uö\u0084ºnoo\u0010}Åtvn;kì_\u0091rBg÷}¸dYm\u0015\u0090À\u0080¿¿j\u008fÙ\u0093\u0094\u0082C\u009a>\u0096í\u00adX\u0095\u0017\u0091Â²±\u0090l\u009aÛ¸\u0096¹E\u008a0\u0091ï\u0089Z\u0092\t\u0084Ä\u0092³ÃnÏÝÍ\u0088\u0089G\u009d2\u009cá\u0086\\\u009a\u000bËÆ\u009dµ½`½ß»\u008a³yñ4¢ã¶^³\r¹øµ·±b¹Ñù\u008c´{²6¸ååP§\u000fçúµ©µd¡Ó·\u008e·}¾\u0094\u009bØc\rer{§.\u0014$Y(\u008e{óo w\u0095wÚn\u000fu|u¡e\u0016g[\"\u0088~ýs\"q\u0097xÄp\t\u007f~;£ \u00105ÈM\u0084¥Q¬.\u00adû·H¡\u0005\u0088Ò§¯©|©É®\u0086¯S¦ ©ý£Jº\u0007\u008cÔ¿¡¤~¼Ë§\u0098±U§\u0086rÊ\u008f\u001f\u0095`\u0091µ\u008a\u0006ºK\u0097\u009c\u0095á\u009c2\u009c\u0087\u0093È\u0082\u001d\u0084n\u0090³\u0084\u0004\u009aI\u009d\u009a\u0083ïÌ0Â\u0085ÎÖ£\u001b\u009bl\u0084±\u0084\u0002 W\u009c\u0098\u0084í\u0083>\u0091\u0083\u0094Ô\u008a\u0019\u008dj³µ\u0090ùm,wSs\u0086h5Xxu¯wÒ~\u0001~´qû`.f]r\u0080f7xz\u007f©aÜ.\u0003 ¶,å{(x_`\u0082f1sdc«aÞ$\r`°mço*fYV\u008cY3HfN\u0095ZØN\u000fP²WáY\u0014\u0016[B\u008e]=G`Z\u0097\u0011ÚU\tW¼Zã_\u0016ME\u000b\u0088L?@bM\u0091KÄB\u000bV¾\u0004í\u0019\u0010\u0002G\u0004\u008aS¤²èg=$B\u0016\u0097\f$\u001bi\u0001¾\u000fÃ:\u0010\f¥\nê$?\u0013L\u0012\u0091\u0014&\fk\u000f¸\u0018Í\u000e\u0012>§\u000bô\r9\u0010N\u001e\u0093\u0014 \u0001u\u001dº\u0014Ï\u0017\u001c\u0005¡\u0019ö\u001c;\u001cH\u0000\u009d)\";w&\u0084&É,\u001e0£)ð0\u00056J5\u009f#,/q4\u0086\u0017Ë0\u0018<\u00ad2ò,\u0007?T:\u0099,.2s5\u0080;Õ\u0015\u001a#¯\"ü4\u0001=V#\u009b&(^}o\u0082@×[dG©\\þ\u0016\u0094ÞØ-\rorz§|\u0014{Ym\u008eeó~ W\u0095aÚj\u000fi|u¡e\u0016N[c\u0088sý}\"x\u0097{Ät\t}~u£n\u0010TE`\u008acÿs,|\u0091`Æg\u000bQxB\u00adY\u0012AGZ´\u0014\u0094\u0093Øc\rhr}§a\u0014`Yl\u008e%óe v\u0095*ÚT\u000f\u007f|r¡t\u0016f[o\u0088^ýp\"p\u0097}Är\u0094\u0097Øa\rmr\u007f§}\u0014lYl\u008eYóo d\u0095hÚs\u000fo|l¡e\u0090IÜ½\t«v¿£ñ\u0010´]¸\u008a´÷¼$ú\u0091\u0086Þ¯\u000b¤x¤¥´\u0012¿Õ$\u0099ÖLÖ3ÞæÅUß\u0018ÃÏÍ²ýaÛÔÈ\u009bÐNú=ÑàÛWÙ\u0094\u0094Ø\u007f\r\"rn§`\u0014}Ym\u008egóe u\u0095*Út\u000fb|j¡.\u0016`[c\u0088oýx\"1\u0097[Äz\tw~v£I\u0010aEu\u008acÿ\u007f,r\u0091DÆ|\u000byxH\u00adB\u0012kGG´ZùX.G\u0093KÀ\\\u0094\u0094Ø\u007f\r\"rn§`\u0014}Ym\u008egóe u\u0095*Út\u000fb|j¡.\u0016`[c\u0088oýx\"1\u0097{Ät\tn~z£j\u0010eEx\u008a~ÿu,p\u0091dÆz\u000b}xC\u00ad\u0002\u0012jGC´_ùi.[\u0093ZÀI5MzD¯G\u001cUAI¶LûL(z\u009dNÂP7KdI\u0085\u0010Éé\u001cðcí¶ì\u0005õ\u0094\u0084Øl\r`rf§j\u0014hY|\u008enóI w\u0095aÚc\u000fc|o¡t\u0016j[c\u0088qýo\"?\u00973Ä9\tt~r£x\u00105Ew\u008a7ÿf,x\u0091~Æ3\u000bqxE\u00adI\u0012LGE´\tù\u0012.\u000b\u0093OÀH5TzS¯_\u001c\u0001AR¶FûQ(M\u009dSÂQ7Md\\©\u0018\u001e]CH°ZåY*\u0017\u009fU\u0094ÃØ;\r#r=§>\u0014&\u0094\u0084Øl\r`rf§j\u0014hY|\u008enóI w\u0095aÚc\u000fc|o¡t\u0016j[c\u0088qýo\"?\u00973Ä9\tt~r£x\u00105Ew\u008a7ÿf,x\u0091~Æ3\u000bqxE\u00adI\u0012LGE´\tù\u0012.\u000b\u0093CÀK5RzF¯J\u001cHAD¶\u0003ûA(O\u009dYÂ[7[dW©L\u001eRC[°YåG*\u0017\u009fFÌC1_fE«[\u0018)M)²+çnT+\u00991Îk3?`6Õ!\u001a5 \u0099lq¹}Æ{\u0013w uía:sGT\u0094j!|n~»~Èr\u0015i¢wï~<lIr\u0096\"#.p$½iÊo\u0017e¤(ñj>*K{\u0098e%cr.¿lÌX\u0019T¦QóX\u0000\u0014M\u000f\u009a\u0016'TtW\u0081KÎH\u001b^¨_õI\u0002\u001eO\\\u009cR)DvF\u0083FÐJ\u001dQªO÷F\u0004DQZ\u009e\n+[x^\u0085BÒX\u001fF¬4ù4\u00066Ssà6-,zv\u0087\"Ô+a<®(".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1348);
        f26462t = cArr;
        f26460q = 2185649366972749837L;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        o.j.e eVar = (o.j.e) objArr[0];
        int i2 = 2 % 2;
        int i3 = f26466x + 13;
        f26465w = i3 % 128;
        int i4 = i3 % 2;
        eVar.b(o.j.b.f26288b);
        int i5 = f26466x + 81;
        f26465w = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private void b(o.dk.a aVar) throws Throwable {
        int i2 = 2 % 2;
        try {
            String strB = aVar.b(m());
            if (strB != null) {
                o.ef.a aVar2 = new o.ef.a(strB);
                Object[] objArr = new Object[1];
                D((char) (25111 - Color.alpha(0)), 630 - TextUtils.getOffsetAfter("", 0), '<' - AndroidCharacter.getMirror('0'), objArr);
                short sShortValue = aVar2.l(((String) objArr[0]).intern()).shortValue();
                if (sShortValue != -1) {
                    int i3 = f26466x + 93;
                    f26465w = i3 % 128;
                    int i4 = i3 % 2;
                    this.f26469p = sShortValue;
                    return;
                }
                return;
            }
            if (o.ea.f.a()) {
                int i5 = f26465w + 17;
                f26466x = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr2 = new Object[1];
                D((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, 36 - ImageFormat.getBitsPerPixel(0), objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                D((char) Drawable.resolveOpacity(0, 0), 585 - (KeyEvent.getMaxKeyCode() >> 16), TextUtils.getOffsetAfter("", 0) + 45, objArr3);
                o.ea.f.d(strIntern, ((String) objArr3[0]).intern());
            }
        } catch (o.ef.b unused) {
            if (o.ea.f.a()) {
                Object[] objArr4 = new Object[1];
                D((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), ViewConfiguration.getJumpTapTimeout() >> 16, View.MeasureSpec.makeMeasureSpec(0, 0) + 37, objArr4);
                String strIntern2 = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                D((char) (52728 - TextUtils.getOffsetAfter("", 0)), 642 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 59 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr5);
                o.ea.f.d(strIntern2, ((String) objArr5[0]).intern());
            }
            int i7 = f26466x + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f26465w = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public static /* synthetic */ void b(o.j.e eVar) {
        Object[] objArr = {eVar};
        int i2 = f26455c * 807193968;
        f26455c = i2;
        int i3 = f26457e * (-1358041343);
        f26457e = i3;
        int i4 = f26453a * 681002736;
        f26453a = i4;
        int i5 = 535611642 * f26454b;
        f26454b = i5;
        d(objArr, i5, -2127234633, i3, 2127234633, i2, i4);
    }

    private void c(Context context, boolean z2) throws Throwable {
        int i2 = 2 % 2;
        if (d(context)) {
            int i3 = f26466x;
            int i4 = i3 + 45;
            f26465w = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (!(!z2)) {
                int i5 = i3 + 45;
                f26465w = i5 % 128;
                if (i5 % 2 != 0) {
                    a(b.f26400a);
                    throw null;
                }
                a(b.f26400a);
            } else {
                a(b.f26402c);
            }
            b(new o.dk.a(context));
        } else {
            a(b.f26402c);
        }
        if (o.ea.f.a()) {
            int i6 = f26465w + 13;
            f26466x = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            D((char) (ViewConfiguration.getEdgeSlop() >> 16), Color.argb(0, 0, 0, 0), 36 - ImageFormat.getBitsPerPixel(0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            D((char) (MotionEvent.axisFromString("") + 1), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 437, 49 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
            o.ea.f.c(strIntern, String.format(((String) objArr2[0]).intern(), d(), f()));
        }
    }

    public static /* synthetic */ void c(o.j.e eVar) {
        int i2 = 2 % 2;
        int i3 = f26466x + 17;
        f26465w = i3 % 128;
        if (i3 % 2 != 0) {
            eVar.b(o.j.b.f26289c);
            throw null;
        }
        eVar.b(o.j.b.f26289c);
        int i4 = f26465w + 11;
        f26466x = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void c(o.j.e eVar, o.g.a aVar) {
        int i2 = 2 % 2;
        int i3 = f26466x + 113;
        f26465w = i3 % 128;
        int i4 = i3 % 2;
        eVar.c(aVar);
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f26466x + 11;
        f26465w = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Object d(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i3;
        int i9 = ~i5;
        int i10 = ~(i8 | i9);
        int i11 = ~((-1) - (((-1) - (~i6)) & ((-1) - i9)));
        int i12 = (i11 + i10) - (i11 & i10);
        int i13 = i3 | i5;
        int i14 = (~(i6 | i9)) | i10;
        int i15 = i3 + i5 + i4 + (1258674323 * i7) + ((-126594725) * i2);
        int i16 = i15 * i15;
        int i17 = ((-1449289074) * i3) + 1954676736 + ((-212912869) * i5) + (i12 * (-1236376205)) + (i13 * (-1236376205)) + ((-1236376205) * i14) + (1609302016 * i4) + (881065984 * i7) + ((-991690752) * i2) + ((-541982720) * i16);
        int i18 = ((i3 * (-1656160718)) - 817430035) + (i5 * (-1656161339)) + (i12 * 621) + (i13 * 621) + (i14 * 621) + (i4 * (-1656160097)) + (i7 * (-2121497779)) + (i2 * 1378977669) + (i16 * (-275906560));
        return i17 + ((i18 * i18) * (-372375552)) != 1 ? b(objArr) : e(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:418:0x1389  */
    /* JADX WARN: Type inference failed for: r1v284, types: [int, short] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void d(android.content.Context r36, final o.g.a r37, android.os.Handler r38, final o.j.e r39, o.m.a r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.g.d(android.content.Context, o.g.a, android.os.Handler, o.j.e, o.m.a):void");
    }

    private void d(o.ef.a aVar) {
        int i2 = f26456d * 1399549413;
        f26456d = i2;
        int i3 = f26459j * 1213821393;
        f26459j = i3;
        int i4 = f26458f * (-1227771965);
        f26458f = i4;
        d(new Object[]{this, aVar}, (int) Runtime.getRuntime().totalMemory(), 1508151694, i3, -1508151693, i2, i4);
    }

    private boolean d(Context context) throws Throwable {
        int i2 = 2 % 2;
        try {
            String strB = new o.dk.a(context).b(m());
            if (strB != null) {
                o.ef.a aVar = new o.ef.a(strB);
                Object[] objArr = new Object[1];
                D((char) (ViewConfiguration.getTapTimeout() >> 16), 525 - Gravity.getAbsoluteGravity(0, 0), (Process.myTid() >> 22) + 5, objArr);
                return aVar.h(((String) objArr[0]).intern()).booleanValue();
            }
            int i3 = f26465w + 35;
            f26466x = i3 % 128;
            int i4 = i3 % 2;
            if (!(!o.ea.f.a())) {
                int i5 = f26466x + 29;
                f26465w = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr2 = new Object[1];
                D((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), ViewConfiguration.getScrollBarSize() >> 8, 37 - ((Process.getThreadPriority(0) + 20) >> 6), objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                D((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 487, ((byte) KeyEvent.getModifierMetaStateMask()) + 39, objArr3);
                o.ea.f.c(strIntern, ((String) objArr3[0]).intern());
            }
            return false;
        } catch (o.ef.b unused) {
            if (o.ea.f.a()) {
                Object[] objArr4 = new Object[1];
                D((char) KeyEvent.keyCodeFromString(""), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, 37 - View.getDefaultSize(0, 0), objArr4);
                String strIntern2 = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                D((char) (64720 - TextUtils.indexOf("", "", 0, 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 530, ExpandableListView.getPackedPositionChild(0L) + 56, objArr5);
                o.ea.f.d(strIntern2, ((String) objArr5[0]).intern());
            }
            return false;
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
        g gVar = (g) objArr[0];
        o.ef.a aVar = (o.ef.a) objArr[1];
        int i2 = 2 % 2;
        if (aVar != null) {
            int i3 = f26465w + 3;
            f26466x = i3 % 128;
            if (i3 % 2 == 0) {
                int iActiveCount = Thread.activeCount();
                int priority = Thread.currentThread().getPriority();
                int i4 = o.ef.a.f23768b * 408478217;
                o.ef.a.f23768b = i4;
                ((Integer) o.ef.a.a(-1670499501, new Object[]{aVar}, i4, (int) Thread.currentThread().getId(), 1670499501, iActiveCount, priority)).intValue();
                throw null;
            }
            int iActiveCount2 = Thread.activeCount();
            int priority2 = Thread.currentThread().getPriority();
            int i5 = o.ef.a.f23768b * 408478217;
            o.ef.a.f23768b = i5;
            if (((Integer) o.ef.a.a(-1670499501, new Object[]{aVar}, i5, (int) Thread.currentThread().getId(), 1670499501, iActiveCount2, priority2)).intValue() != 0) {
                if (o.ea.f.a()) {
                    Object[] objArr2 = new Object[1];
                    D((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), View.MeasureSpec.getMode(0), TextUtils.getOffsetBefore("", 0) + 37, objArr2);
                    String strIntern = ((String) objArr2[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr3 = new Object[1];
                    D((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 700 - View.getDefaultSize(0, 0), 26 - View.resolveSizeAndState(0, 0, 0), objArr3);
                    o.ea.f.c(strIntern, sb.append(((String) objArr3[0]).intern()).append(aVar.e()).toString());
                }
                Object[] objArr4 = new Object[1];
                D((char) (Color.red(0) + 23757), 726 - Color.red(0), 22 - Process.getGidForName(""), objArr4);
                gVar.f26470s = aVar.a(((String) objArr4[0]).intern(), (Short) 0).shortValue();
                int i6 = f26466x + 121;
                f26465w = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 30 / 0;
                }
                return null;
            }
        }
        int i8 = f26466x + 61;
        f26465w = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 2 / 0;
        }
        return null;
    }

    static void init$0() {
        $$a = new byte[]{96, -118, -108, -83};
        $$b = 221;
    }

    static void init$1() {
        $$g = new byte[]{119, -27, 45, 98, MessagePack.Code.TRUE, 55, 4, MessagePack.Code.INT16, 56, MessagePack.Code.BIN32, 17, MessagePack.Code.TRUE, 56, Ascii.NAK, -65, 58, MessagePack.Code.BIN8, 65};
        $$h = 227;
    }

    static void init$2() {
        $$c = new byte[]{95, MessagePack.Code.FALSE, -107, -90};
        $$f = 204;
    }

    @Override // o.m.h
    public final void a(Context context, boolean z2, o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26466x + 43;
        f26465w = i3 % 128;
        int i4 = i3 % 2;
        super.a(context, z2, aVar);
        c(context, z2);
        int i5 = f26456d * 1399549413;
        f26456d = i5;
        int i6 = f26459j * 1213821393;
        f26459j = i6;
        int i7 = f26458f * (-1227771965);
        f26458f = i7;
        d(new Object[]{this, aVar}, (int) Runtime.getRuntime().totalMemory(), 1508151694, i6, -1508151693, i5, i7);
        int i8 = f26465w + 33;
        f26466x = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.m.m
    public final short b() {
        int i2 = 2 % 2;
        int i3 = f26465w;
        int i4 = i3 + 79;
        f26466x = i4 % 128;
        short s2 = (short) (i4 % 2 == 0 ? this.f26470s >>> this.f26469p : this.f26470s + this.f26469p);
        int i5 = i3 + 123;
        f26466x = i5 % 128;
        int i6 = i5 % 2;
        return s2;
    }

    @Override // o.m.h
    protected final o.ef.a c() throws Throwable {
        int i2 = 2 % 2;
        o.ef.a aVarC = super.c();
        try {
            Object[] objArr = new Object[1];
            D((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 23757), 726 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 23, objArr);
            aVarC.c(((String) objArr[0]).intern(), (int) this.f26470s);
            int i3 = f26466x + 39;
            f26465w = i3 % 128;
            int i4 = i3 % 2;
            if (o.ea.f.a()) {
                int i5 = f26466x + 49;
                f26465w = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr2 = new Object[1];
                D((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), ViewConfiguration.getKeyRepeatDelay() >> 16, 36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                D((char) ((Process.myTid() >> 22) + 8466), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 782, TextUtils.lastIndexOf("", '0', 0) + 66, objArr3);
                o.ea.f.c(strIntern, String.format(((String) objArr3[0]).intern(), aVarC));
            }
            return aVarC;
        } catch (o.ef.b e2) {
            if (!o.ea.f.a()) {
                return null;
            }
            Object[] objArr4 = new Object[1];
            D((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.getTrimmedLength("") + 37, objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            D((char) (TextUtils.indexOf("", "", 0, 0) + 4848), 750 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), Color.blue(0) + 34, objArr5);
            o.ea.f.e(strIntern2, ((String) objArr5[0]).intern(), e2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0225, code lost:
    
        if (r1 != r23.f26469p) goto L93;
     */
    @Override // o.m.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean c(android.content.Context r24, boolean r25, o.bg.c r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.g.c(android.content.Context, boolean, o.bg.c):boolean");
    }

    @Override // o.m.h
    public final void d(final Context context, final o.g.a aVar, final o.j.e eVar, final a aVar2, boolean z2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26466x + 71;
        f26465w = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!z2) {
            if (!(!o.ea.f.a())) {
                Object[] objArr = new Object[1];
                D((char) TextUtils.getOffsetAfter("", 0), TextUtils.lastIndexOf("", '0') + 1, 36 - ImageFormat.getBitsPerPixel(0), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                D((char) (21479 - (ViewConfiguration.getPressedStateDuration() >> 16)), KeyEvent.normalizeMetaState(0) + 363, View.MeasureSpec.getSize(0) + 75, objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            }
            final o.ea.e eVar2 = new o.ea.e(Looper.myLooper());
            new Thread(new Runnable() { // from class: o.m.g$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.d(context, aVar, eVar2, eVar, aVar2);
                }
            }).start();
            return;
        }
        if (o.ea.f.a()) {
            int i4 = f26465w + 5;
            f26466x = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr3 = new Object[1];
            D((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), Process.myPid() >> 22, Color.green(0) + 37, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            D((char) (28051 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 293, Color.alpha(0) + 70, objArr4);
            o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
        }
        super.d(context, aVar, eVar, aVar2, z2);
    }

    @Override // o.m.m
    public final String toString() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder().append(super.toString());
        Object[] objArr = new Object[1];
        D((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12384), 848 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 72, objArr);
        StringBuilder sbAppend2 = sbAppend.append(((String) objArr[0]).intern()).append((int) this.f26469p);
        Object[] objArr2 = new Object[1];
        D((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 920 - Drawable.resolveOpacity(0, 0), Color.rgb(0, 0, 0) + 16777254, objArr2);
        String string = sbAppend2.append(((String) objArr2[0]).intern()).append((int) this.f26470s).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f26466x + 17;
        f26465w = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        throw null;
    }
}
