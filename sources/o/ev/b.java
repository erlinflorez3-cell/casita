package o.ev;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import com.drew.metadata.mov.metadata.QuickTimeMetadataDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import o.a.o;
import o.ea.f;
import o.ea.g;
import o.ef.c;
import o.ek.e;
import o.et.i;
import o.eu.a;
import o.eu.d;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f25486a = 0;

    /* JADX INFO: renamed from: b */
    public static int f25487b = 0;

    /* JADX INFO: renamed from: c */
    public static int f25488c = 0;

    /* JADX INFO: renamed from: d */
    public static int f25489d = 0;

    /* JADX INFO: renamed from: e */
    public static int f25490e = 0;

    /* JADX INFO: renamed from: f */
    private static char[] f25491f = null;

    /* JADX INFO: renamed from: g */
    public static int f25492g = 0;

    /* JADX INFO: renamed from: i */
    private static long f25493i = 0;

    /* JADX INFO: renamed from: j */
    private static int f25494j = 0;

    /* JADX INFO: renamed from: k */
    private static int f25495k = 0;

    /* JADX INFO: renamed from: l */
    private static int f25496l = 0;

    /* JADX INFO: renamed from: m */
    private static int f25497m = 0;

    /* JADX INFO: renamed from: h */
    private final List<d> f25498h = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r10, int r11, int r12) {
        /*
            int r9 = r12 + 99
            byte[] r8 = o.ev.b.$$a
            int r0 = r11 * 3
            int r7 = 3 - r0
            int r6 = r10 * 2
            int r0 = r6 + 1
            byte[] r5 = new byte[r0]
            r4 = 0
            if (r8 != 0) goto L2c
            r0 = r6
            r3 = r7
            r2 = r4
        L14:
            int r0 = -r0
            int r7 = r7 + r0
            r1 = r2
            r9 = r7
            r7 = r3
        L19:
            int r3 = r7 + 1
            byte r0 = (byte) r9
            r5[r1] = r0
            int r2 = r1 + 1
            if (r1 != r6) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L28:
            r0 = r8[r3]
            r7 = r9
            goto L14
        L2c:
            r1 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ev.b.$$c(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25492g = -1153532197;
        f25490e = 1458869167;
        f25488c = -195230387;
        f25489d = 1157183528;
        f25487b = -380541236;
        f25486a = 2134897887;
        f25496l = 0;
        f25495k = 1;
        f25494j = 0;
        f25497m = 1;
        g();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        TextUtils.lastIndexOf("", '0', 0);
        TextUtils.getCapsMode("", 0, 0);
        SystemClock.currentThreadTimeMillis();
        SystemClock.elapsedRealtime();
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        Process.myPid();
        View.MeasureSpec.getMode(0);
        AudioTrack.getMinVolume();
        TextUtils.indexOf((CharSequence) "", '0');
        KeyEvent.getModifierMetaStateMask();
        ExpandableListView.getPackedPositionForGroup(0);
        ViewConfiguration.getWindowTouchSlop();
        TextUtils.indexOf("", "", 0, 0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        Color.alpha(0);
        Color.green(0);
        ExpandableListView.getPackedPositionChild(0L);
        int i2 = f25495k + 103;
        f25496l = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        b bVar = (b) objArr[0];
        c cVar = (c) objArr[1];
        int i2 = 2 % 2;
        int i3 = f25494j + 19;
        f25497m = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 == 0) {
                f.a();
                obj.hashCode();
                throw null;
            }
            if (f.a()) {
                Object[] objArr2 = new Object[1];
                n((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), ViewConfiguration.getDoubleTapTimeout() >> 16, 17 - KeyEvent.normalizeMetaState(0), objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr3 = new Object[1];
                n((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 64556), TextUtils.indexOf("", "", 0, 0) + 17, 26 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
                f.c(strIntern, sb.append(((String) objArr3[0]).intern()).append(cVar.b()).toString());
            }
            int i4 = 0;
            while (true) {
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i5 = c.f23799b * 1567746851;
                c.f23799b = i5;
                int i6 = c.f23798a * 1136425123;
                c.f23798a = i6;
                if (i4 >= ((Integer) c.b((int) Runtime.getRuntime().maxMemory(), i6, i5, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar})).intValue()) {
                    return null;
                }
                int i7 = f25494j + 89;
                f25497m = i7 % 128;
                if (i7 % 2 == 0) {
                    bVar.f25498h.add(a.e(cVar.d(i4)));
                    i4 += 120;
                } else {
                    bVar.f25498h.add(a.e(cVar.d(i4)));
                    i4++;
                }
            }
        } catch (o.ef.b e2) {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr4 = new Object[1];
            n((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 42 - (Process.myTid() >> 22), 67 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
            throw new o.ef.b(sb2.append(((String) objArr4[0]).intern()).append(e2.getMessage()).toString());
        }
    }

    private d c(String str) {
        int i2 = 2 % 2;
        for (d dVar : this.f25498h) {
            if (dVar.c().equals(str)) {
                int i3 = f25494j;
                int i4 = i3 + 93;
                f25497m = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 78 / 0;
                }
                int i6 = i3 + 59;
                f25497m = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 65 / 0;
                }
                return dVar;
            }
        }
        return null;
    }

    public static /* synthetic */ Object d(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) throws Throwable {
        int i8 = ~i7;
        int i9 = ~(i8 | i2);
        int i10 = ~((i6 + i2) - (i6 & i2));
        int i11 = ~i6;
        int i12 = ~i2;
        int i13 = i11 | i12;
        int i14 = ((i9 + i10) - (i9 & i10)) | (~((i13 + i7) - (i13 & i7)));
        int i15 = (-1) - (((-1) - ((-1) - (((-1) - i9) & ((-1) - (~((i8 + i6) - (i8 & i6))))))) & ((-1) - i10));
        int i16 = ~((-1) - (((-1) - i11) & ((-1) - i2)));
        int i17 = ~(i2 | i7);
        int i18 = ((i17 + i16) - (i17 & i16)) | (~((-1) - (((-1) - (i8 | i12)) & ((-1) - i6))));
        int i19 = i7 + i6 + i4 + (1880080305 * i3) + (458392769 * i5);
        int i20 = i19 * i19;
        int i21 = ((i7 * 319678698) - 2002258816) + (i6 * 319678284) + (i14 * 207) + (i15 * (-414)) + (i18 * 207) + (i4 * 319678491) + (i3 * (-161570901)) + (i5 * (-1160779685)) + (i20 * (-1109000192));
        int i22 = ((766573918 * i7) - Integer.MIN_VALUE) + (1582236324 * i6) + (i14 * (-407831203)) + (815662406 * i15) + ((-407831203) * i18) + (1174405120 * i4) + (1711276032 * i3) + ((-973078528) * i5) + (68288512 * i20) + (i21 * i21 * (-1432485888));
        if (i22 == 1) {
            return b(objArr);
        }
        if (i22 == 2) {
            return e(objArr);
        }
        b bVar = (b) objArr[0];
        int i23 = 2 % 2;
        if (f.a()) {
            int i24 = f25494j + 71;
            f25497m = i24 % 128;
            int i25 = i24 % 2;
            Object[] objArr2 = new Object[1];
            n((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 17 - View.resolveSize(0, 0), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            n((char) (ViewConfiguration.getLongPressTimeout() >> 16), 1145 - TextUtils.lastIndexOf("", '0', 0, 0), 37 - ExpandableListView.getPackedPositionType(0L), objArr3);
            f.c(strIntern, ((String) objArr3[0]).intern());
        }
        Iterator<d> it = bVar.f25498h.iterator();
        while (it.hasNext()) {
            it.next().n();
            int i26 = f25494j + 45;
            f25497m = i26 % 128;
            int i27 = i26 % 2;
        }
        return null;
    }

    private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        d dVarC = ((b) objArr[0]).c((String) objArr[1]);
        Object obj = null;
        if (dVarC == null) {
            if (f.a()) {
                int i3 = f25494j + 15;
                f25497m = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr2 = new Object[1];
                n((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), Process.myTid() >> 22, 18 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                n((char) (ImageFormat.getBitsPerPixel(0) + 64977), 1356 - KeyEvent.normalizeMetaState(0), (KeyEvent.getMaxKeyCode() >> 16) + 68, objArr3);
                f.d(strIntern, ((String) objArr3[0]).intern());
            }
            int i5 = f25497m + 65;
            f25494j = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (dVarC.i() != null) {
            Object[] objArr4 = {dVarC.i()};
            int i6 = o.fn.c.f26112c * (-665734691);
            o.fn.c.f26112c = i6;
            int id = (int) Thread.currentThread().getId();
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i7 = 798041572 * o.fn.c.f26110a;
            o.fn.c.f26110a = i7;
            return Boolean.valueOf(dVarC.c(((Integer) o.fn.c.b(objArr4, i7, -682160894, i6, id, iMaxMemory, 682160895)).intValue()));
        }
        int i8 = f25494j + 73;
        f25497m = i8 % 128;
        if (i8 % 2 == 0) {
            f.a();
            obj.hashCode();
            throw null;
        }
        if (f.a()) {
            int i9 = f25497m + 43;
            f25494j = i9 % 128;
            int i10 = i9 % 2;
            Object[] objArr5 = new Object[1];
            n((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Drawable.resolveOpacity(0, 0), 17 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr5);
            String strIntern2 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            n((char) (11332 - (KeyEvent.getMaxKeyCode() >> 16)), KeyEvent.keyCodeFromString("") + ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, Process.getGidForName("") + 114, objArr6);
            f.c(strIntern2, ((String) objArr6[0]).intern());
        }
        return false;
    }

    static void g() {
        char[] cArr = new char[1613];
        ByteBuffer.wrap("\u0094¢\f3¥Ë]\u007fö\u0017o¼\u0007F¸ÙQ\u0097É+bÿ\u001as³\u001cT³ÌUe÷\u001e\u0080h·ð\u0010Y÷¡J\n7\u0093\u009fûrD×\u00ad¤5\u001b\u009e¾æ\u0013O~¨\u00980l\u0099Ñâ³J^Óô;M\u00841í\u0090u>Þ\u0084'þ\u0094¸\f!¥Ý]|öRo\u0097\u0007J¸ñQ\u0097É\"bÆ\u001a{³\u001dT¼Ì\u0012e÷\u001e\u009c¶1/ÝÇgx\u001c\u0011¦\u0089W\"àÛ\u0097s6\u0014\u0092\u008ce%\u001aÞ»v^ï÷\u0080Ò8;ÑÜI{â\u0006\u009b»3SÔþM\u009bå(\u009eÛ6|¯\u0015@òøb\u0091ó\n\u008b¢?[×ó|\u0094\u0006\r\u0099¥W^ë÷¿o3\u0000Ü¸sQ\u0015Ê·b@\u001b²¼ßTr\u0094\u0080\f7¥Ó]vö\"o³\u0007K¸ÿQ\u0097É<bÆ\u001aY³\u0017T«ÌAe²\u001eß¶r/ÂÇsx\u000b\u0011¿\u0089W\"üÛ\u0086sr\u0014Ù\u008cw%\u000bÞòvAï÷\u0080\u00868rÑ\u0088I2\u0094\u0097\f?¥Ä]Sö\u0002o¢\u0007^¸ûQ\u0091É3bÆ\u001a{³\u001dT¼Ì{eö\u0094\u0080\f7¥Ó]vö\"o³\u0007K¸ÿQ\u0097É<bÆ\u001aY³\u0017T«ÌAe²\u001eß¶r/×Ç\u007fx\u0004\u0011\u0093\u0089B\"âÛ»s6\u0014\u0092\u008c(%R\u0094\u0082\f3¥Ë]\u007fö\u0017o¼\u0007F¸²Q\u0099É7bË\u001aa³RT°ÌWeþ\u001e\u009d¶</ÕÇaxR\u0011¦\u0089]\"²Û\u0087s<\u0014Ù\u008c|%\u001dÞ¥v\\ï²\u0080\u00978?ÑÄI2â3\u009b¢3BÔþM\u009bå1\u009eÓ6f¯\u001b@½ø\\\u0091²\nÈ¢r[\u0097óa\u0094\u0082\f3¥Ë]\u007fö\u0017o¼\u0007F¸²Q\u0099É7bË\u001aa³RT³ÌAeá\u001e\u009d¶1/ÛÇsx\u0006\u0011·\u0089V\"²Û\u0086s=\u0014\u0092\u008cW%\u001fÞ¤v\u0012ïÓ\u0080\u00828\"ÑÞI{â\u0011\u009b³3FÔûM\u009då<\u009e\u00926(¯R@÷øA\u0091²\n\u0086¢:[Óóf\u0094R\r¶¥]^÷÷\u0081or\u0000Ü¸}Q\u0006Êòb@\u001b÷¼\u0083T'ÍÛe`\u001e\u0017·ò/YÀ÷y\u008b\u0011!\u001a4\u0082\u0083+gÓÂx\u0096á\u0007\u0089ÿ6Kß#G\u0088ìr\u0094í=£Ú\u001fBõë\u0006\u0090k8Æ¡mIÃö¿\u009fF\u0007õ¬CU2ýÆ\u009at\u0002Ã«¨P\u0003øñaG\u000e*¶Æ_bÇÃl²\u0015\u0003½åZRÃ#k\u0082\u0094\u0099\f7¥Ë]a\u0083J\u001bý²\u0019J¼áèxy\u0010\u0081¯5F]Þöu\f\r\u0093¤ÝCaÛ\u008brx\t\u0015¡¸8\fÐ°oÝ\u00068\u009e\u00965=ÌOd¸\u0003\u0013\u009b½2ÁÉ8a\u008bø=\u0097L/¸ÆB^øõ\u009d\u008ck$ØÃ<Z]òþ\u0089\u0011!¶¸ÝWkïØ\u00869\u001dVµ¸L\u0011ä¶\u0083Û\u001aw²\u0096I+àQxë\u0017\f¯½FÖÝluØ\f,«PCêÚ\u001dr«\tÐ w8\u0094×<n\u0018\u0006î\u009d\u00195´ÌÍk}\u0003Ø\u009au1\u0018Éì`\u0010øª\u0097Ý.kÆ\u0090]7ôT\u008cü+XÃâZ\u0098ñ=\u0089\u009c x¿\u0015W¸î\u0013\u0086½\u001dÁ´8L\u008bë=\u0082L\u001a¸±\u000bI±àÂ\u007f}\u0017Ø®bE\u0018Ý½t\u001c\u0093A\u000bØ¢$Z\u0085ñ«hN\u0000³¿\bVnÎÛe?\u001d\u0082´äSEËëb\u000e\u0019e±È($À\u009e\u007få\u0016_\u008e®%\u0019ÜntÏ\u0013k\u008b\u009c\"ãÙBq§è\u000e\u0087+?ÙÖ.N\u008aåï\u009cB4¥Ó\fJ+âÛ\u0099*1\u0092¨æGNÿ¥\u0096\u001f\r+¥À\\.ô\u0092\u0093ø\n\u000b¢ñYK\u0007¸\u009f\u000e6ùÎBe*ü\u0087\u0094b+ÑÂ®YWÁú/»·\u0013\u001eèæ\u007fM.Ô\u008e¼r\u0003×ê½r\u001fÙê¡W\b1ï\u0090wm\u00adÁ5c\u009c\u0090d&ÏQ\u0094\u0082\f ¥Û]|ö\u0006o\u0081\u0007F¸óQ\u0086É'bÁ\u001a2³_TòÌ_eý\u001e\u0090¶;/ÞÇwxR\u0011¡\u0089F\"óÛ\u0086s'\u0014Á\u008c2%\u0015Þ·v\\ï÷\u0080\u008083ÑÆIwâ\u0016\u009bò3\bÔ²lÈôm]\u0099¥<\u000eI\u0097øÿ>@²©Ó1i\u009a\u009câ4KS¬ø4\u000f\u009d®æ\u009dN0×Ý?8\u0080Péëq]Ú¼#Í\u008bmì\u0091t4Ý^&ü\u008e\t\u0017´xÒÀs)Ý±g\u001a\u001dc¸Ë\u000e,ýµ\u0090\u001d=f\u008eÎ)W\\¸é\u0000\bi®ò\u009dZ'£Ý\u000bxlN£®;\u000b\u0092ÿjZÁ/X\u009e0X\u008fÔfµþ\u000fUú-R\u00845c\u009eûiRÈ)û\u0081V\u0018»ðXO)&\u009e¾z\u0015Ïì²D\u0015#ü»\u001b\u00125é\u009eAlØ\u009b·º\u000f\u0018æï~RÕ-¬\u009e\u0004;ãØz´Ò\u0015©ï\u0001Z\u00982w\u0095Ï~¦É=û\u0095\u001dlôÄI£{:\u009e\u0092viÍÀûX\u001a7ë\u008fKf7ý\u0092Ux,Ú\u008b¯c\u0012úôRU){\u0080Á\u0018;÷\u009eN¨-×µr\u001c\u0086ä#OVÖç¾!\u0001\u00adèÌpvÛ\u0083£+\nLíçu\u0010Ü±§\u0082\u000f/\u0096Â~!ÁM¨ì0\u0016\u009b£bËÊl\u00ad\u008750\u009c\u0002gäÏ\rV°9\u0082\u0081gh\u008fð4[\u0002\"ã\u008a\u0012m²ôÎ\\k'\u0081\u008f#\u0016VùëA\r(¬³\u0082\u001b8âÂJg-Q´¢\u001c\nç£NÑÖ\"¹\u0080\u0001'èGsìÛB¢°\u0005Çívt\u0090Ü+§G\u000eô\u0096\u0007y¦\u0094\u0087\f\"¥Ö]sö\u0006o·\u0007q¸ýQ\u009cÉ&bÓ\u001a{³\u001cT·Ì@eá\u001eÒ¶\u007f/\u0092Çqx\u001d\u0011¼\u0089F\"óÛ\u009bs<\u0014×\u008c`%RÞ¥vSïá\u0080Ò86ÑÛIaâ\u0013\u009b°3^Ô÷M\u0096år\u009e\u008862¯\u0000@·øA\u0091æ\n\u009d¢ [Ûó|\u0094\u0015\rò¥[^æ\u0094\u0087\f\"¥Ö]sö\u0006o·\u0007q¸ýQ\u009cÉ&bÓ\u001a{³\u001cT·Ì@eá\u001eÒ¶\u007f/\u0092ÇDx\u001b\u0011¡\u0089S\"²Û·s?\u0014Ä\u008c2%\u0013Þ¢vBï¾\u0080Ò8;ÑÜIdâ\u0013\u009b¾3[ÔöM\u0093å&\u009e×62¯\u0013@¦øQ\u0091²\n\u0081¢&[Óó`\u0094\u0006¨\u00060£\u0099WaòÊ\u0087S6;ð\u0084|m\u001dõ§^R&ú\u008f\u009dh6ðÁY`\"S\u008aþ\u0013\u0013ûðD\u0081-6µÒ\u001egç\u001aO½(T°³\u0019\u009dâ6JÄÓ3¼\u0017\u0004ºí@uòÞ\u0091§?\u000fÖèwqSÙ°¢\\\ný\u0093\u0087|2ÄÚ\u00ad}6\u0016\u009e¡g\u0013Ïõ¨\u009c1!\u0099\u0093bvË\u001eS¥<\u0013\u0084òm\u0083ö#^ß'z\u0080\u0010h²ñGYú\"\u009c\u008b=\u0013\u0093ü)ES-ö¶@¸º \u001f\u0089ëqNÚ;C\u008a+L\u0094À}¡å\u001bNî6F\u009f!x\u008aà}IÜ2ï\u009aB\u0003¯ëLT =\u0081¥{\u000eÎ÷¦_\u00018ê ]\toò\u0098ZnÃÜ¬ï\u0014\u0001ýàe[Îo·\u008b\u001fføÜa®É\r²ã\u001aJ\u0083+lÏÔ5½\u008f&«\u008e\u0006wüßN¸-!\u0083\u0089frÁÛ¨CO,æ\u0094[\u0094\u0087\f\"¥Ö]sö\u0006o·\u0007q¸ýQ\u009cÉ&bÓ\u001a{³\u001cT·Ì@eá\u001eÒ¶\u007f/\u0092Çwx\u001f\u0011¤\u0089\u0012\"óÛ\u0082s\"\u0014Þ\u008c{%\u0011Þ³vFïû\u0080\u009d8<Ñ\u0092I(âR\u009b÷3AÔ²M\u009aå3\u009eÁ62¯\u0010@·øW\u0091ü\nÒ¢6[×ó~\u0094\u0017\r¦¥W^ö÷Þor\u0000Ô¸~Q\u0007Ê¡bZ\u001bû¼\u009cT5Í\u0092eq\u001e\u001d·¼/FÀóy\u009b\u0011<\u008a×\"`\u0081¦\u0019\u000b°ñHAã#z\u0090\u0012f\u00adçDºÜ\u0012wë\u000fP¦'A\u0086ÙRpÃ\u000b»£\u000f:çÒLm6\u0004©\u009cg7ÛÎ±\u0094\u0096\f;¥Á]qö\u0013o \u0007V¸ÑQ\u009dÉ<bÁ\u001ag³\u001fT·ÌVeÝ\u001e\u0080¶\u0016/ÛÇax\u0011\u0011³\u0089@\"öÛ\u0097s6\u0014â\u008cs%\u000bÞ¿vWïü\u0080\u00868\u0019Ñ×Ikâ\u0001¤ß<r\u0095\u0088m8ÆZ_é7\u001f\u0088\u008baÚùbR\u0096*>\u0083Udïü\bU\u0090.Þ\u0086b\u001f\u0088÷{H\u0016!»¹\u001e\u0012¶ëÍC;$\u009a¼+\u0015Kî»FAÌçTMý´\u0005\u0012®i7â_.à\u008f\tõ\u0091@:¨B\u000fëd\fÓ\u00942=ÁF¬î\u0001w¯\u009f\u000e uI\u0081Ñ/z\u008e\u0083õ+HL§Ô\u0018}h\u0086Ï.&·ÁØí`H\u0089£\u0011AºB\u0094\u0095\f7¥Æ]\\ö\u0017oª\u0007F¸ÁQ\u009bÉ<bÕ\u001a~³\u0017T\u0087ÌAe÷\u001e¹¶7/ËÇTx\u001d\u0011 \u0089b\"óÛ\u008bs?\u0014×\u008c|%\u0006Þòv\u001fï²\u0080\u00938\"ÑÂI~â\u001b\u009b±3SÔæM\u009bå=\u009eÜ62¯H@ò\u0094Ò\f:¥Ó]aöRo¼\u0007]¸²Q\u0090É7b×\u001a|³RT ÌWeá\u001e\u009d¶>/ÄÇwx\u0016ËQSóú\u0002\u0002\u0097©À0wX\u009fç:\u000eW\u0096ô=\u001aE³ìý\u000bs\u0093\u008f:\u0018ACéûp\u0014\u0098³'ÄN6ÖÛ}v\u0084W,æK\u0006Óºzß\u0081u)\u0097°\"ß_gù\u008e\u0018\u0016ö½\u008cÄ6iAñêX\u0007 ¡\u000bÉ\u0092Cú\u0092E2¬N4ë\u009f\u0001ç£NÖ©k1\u008d\u0098,ãdKðÒ\u0007:±\u0085ÊìIt\u0087ß;&l\u008e÷é\u000fq ØÇ#p\u008bÂ\u0012o}\u0002Åò,\u0003´»\u001fÏfgÎ\u008c)6°\u0002\u0018éc\u0007Ë»R\u0082½a\u0005\u008dl,÷V_ã¦\u000b\u000e¬iÇðpXÂ£,\nM\u0092öýBE°¬Ç7v\u009f\u0090æ+AG©ô0\u0007\u0098¦8À k\t\u0086ñ ZHÃÂ«\u0013\u0014³ýÏejÎ\u0080¶\"\u001fWøê`\fÉ\u00ad²å\u001aq\u0083\u0086k0ÔK½È%\u0006\u008eºwíßv¸\u008e !\u0089FrñÚCCî,\u0083\u0094s}\u0082å:NN7æ\u009f\rx·á\u0083Ih2\u0086\u009a:\u0003\u0003ìàT\f=\u00ad¦×\u000eb÷\u008a_-8F¡ñ\tCò§[ÌÃf¬\u0090\u0014cýMfìÎ\u0017·ã\u0010Ñøfa\u0092É6²J\u001bñ\u0083\u0006lãÕÈ½f&\u009a\u008e0¸Õ ~\u0089\u0093q5Ú]C×+\u0006\u0094¦}Úå\u007fN\u009567\u009fBxÿà\u0019I¸2ð\u009ad\u0003\u0093ë%T^=Ý¥\u0013\u000e¯÷ø_c8\u009b 4\tSòäZVÃû¬\u0096\u0014fý\u0097e/Î[·ó\u001f\u0018ø¢a\u0096É}²\u0093\u001a/\u0083\u0016lõÔ\u0019½¸&Â\u008eww\u009fß8¸S!ä\u0089Vr¦Û×Cd,\u0097\u0094;}SæâN\u00137¤\u0090Åx6á\u0098I92B\u009b¶\u0003\u0004ì³UÂ=d¦\u009f\u000e3÷@Pó8\u0012¡ö\n\u008cò6[\u009dÃ3¬O\u0015åýVf¾Ï×·`\u0010\u0093øvaXÊù²\u0002\u001bö\u0084ÔlsÕ\u0093½8&\u0016\u008fäw\u0013Ðµ¹Ó!\u007f\u008a\u0080r3ÛRD¶,\u000f\u0095³~Â".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1613);
        f25491f = cArr;
        f25493i = -3658828441725367214L;
    }

    static void init$0() {
        $$a = new byte[]{Ascii.NAK, 117, 119, 110};
        $$b = 88;
    }

    private static void n(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i6 = $11 + 7;
            $10 = i6 % 128;
            if (i6 % i4 != 0) {
                int i7 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f25491f[i2 >> i7])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(742 - (Process.myTid() >> 22), (char) TextUtils.indexOf("", "", 0, 0), TextUtils.lastIndexOf("", '0', 0) + 13, 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f25493i), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 766, (char) (12470 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 12 - TextUtils.indexOf("", "", 0), 1946853218, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 386, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 19, 39570797, false, $$c(b6, b7, (byte) (6 | b7)), new Class[]{Object.class, Object.class});
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
                Object[] objArr5 = {Integer.valueOf(f25491f[i2 + i8])};
                Object objA4 = o.d.d.a(-214519724);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a(741 - ImageFormat.getBitsPerPixel(0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12, 632508977, false, $$c(b8, b9, b9), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(f25493i), Integer.valueOf(c2)};
                Object objA5 = o.d.d.a(-1567654649);
                if (objA5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objA5 = o.d.d.a(MotionEvent.axisFromString("") + 767, (char) (TextUtils.indexOf((CharSequence) "", '0') + 12471), 12 - Gravity.getAbsoluteGravity(0, 0), 1946853218, false, $$c(b10, b11, (byte) (b11 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = o.d.d.a(-723636472);
                if (objA6 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    objA6 = o.d.d.a(Color.green(0) + 387, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 18 - Color.red(0), 39570797, false, $$c(b12, b13, (byte) ((b13 + 6) - (6 & b13))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            i4 = 2;
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        int i9 = $11 + 67;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 4 / 4;
        }
        while (oVar.f19947b < i3) {
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr8 = {oVar, oVar};
            Object objA7 = o.d.d.a(-723636472);
            if (objA7 == null) {
                byte b14 = (byte) 0;
                byte b15 = b14;
                objA7 = o.d.d.a((ViewConfiguration.getWindowTouchSlop() >> 8) + 387, (char) (MotionEvent.axisFromString("") + 1), TextUtils.indexOf("", "") + 18, 39570797, false, $$c(b14, b15, (byte) ((-1) - (((-1) - b15) & ((-1) - 6)))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x03f0, code lost:
    
        if (r15 == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03f2, code lost:
    
        r18 = o.fn.c.f26112c * (-665734691);
        o.fn.c.f26112c = r18;
        r2 = (int) java.lang.Thread.currentThread().getId();
        r3 = (int) java.lang.Runtime.getRuntime().maxMemory();
        r16 = o.fn.c.f26110a * 798041572;
        o.fn.c.f26110a = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x042e, code lost:
    
        if (((java.lang.Integer) o.fn.c.b(new java.lang.Object[]{r14}, r16, -682160894, r18, r2, r3, 682160895)).intValue() < r4) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0434, code lost:
    
        if (o.ea.f.a() == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0436, code lost:
    
        r1 = o.ev.b.f25497m + 67;
        o.ev.b.f25494j = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0442, code lost:
    
        r1 = new java.lang.Object[1];
        n((char) android.widget.ExpandableListView.getPackedPositionType(0), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 16 - android.text.TextUtils.lastIndexOf("", '0'), r1);
        r8 = ((java.lang.String) r1[0]).intern();
        r6 = o.ea.g.d();
        r1 = new java.lang.Object[1];
        n((char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 6090), 361 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 116 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), r1);
        r3 = ((java.lang.String) r1[0]).intern();
        r18 = o.fn.c.f26112c * (-665734691);
        o.fn.c.f26112c = r18;
        r2 = (int) java.lang.Thread.currentThread().getId();
        r9 = (int) java.lang.Runtime.getRuntime().maxMemory();
        r16 = o.fn.c.f26110a * 798041572;
        o.fn.c.f26110a = r16;
        o.ea.f.d(r8, java.lang.String.format(r6, r3, r5, java.lang.Integer.valueOf(((java.lang.Integer) o.fn.c.b(new java.lang.Object[]{r14}, r16, -682160894, r18, r2, r9, 682160895)).intValue()), java.lang.Integer.valueOf(r4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x04d9, code lost:
    
        r12.i().e(r4 - 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> a(android.content.Context r28, o.ef.c r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ev.b.a(android.content.Context, o.ef.c):java.util.List");
    }

    public final void a() throws Throwable {
        int i2 = 2 % 2;
        Iterator<d> it = this.f25498h.iterator();
        while (it.hasNext()) {
            int i3 = f25494j + 7;
            f25497m = i3 % 128;
            int i4 = i3 % 2;
            it.next().k();
        }
        int i5 = f25494j + 33;
        f25497m = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean a(String str) {
        int id = (int) Thread.currentThread().getId();
        int i2 = f25492g * 1256025341;
        f25492g = i2;
        return ((Boolean) d(id, Process.myUid(), new Object[]{this, str}, i2, (int) Runtime.getRuntime().maxMemory(), -1608611951, 1608611953)).booleanValue();
    }

    public final short b(o.et.c cVar) {
        String strE;
        int i2 = 2 % 2;
        int i3 = f25494j + 117;
        f25497m = i3 % 128;
        int i4 = i3 % 2;
        if (cVar.l()) {
            int i5 = f25497m + 17;
            f25494j = i5 % 128;
            if (i5 % 2 != 0) {
                o.et.c.e(cVar.k());
                throw null;
            }
            strE = o.et.c.e(cVar.k());
        } else {
            strE = cVar.k();
        }
        d dVarC = c(strE);
        if (dVarC != null) {
            short sO = dVarC.o();
            int i6 = f25497m + 17;
            f25494j = i6 % 128;
            int i7 = i6 % 2;
            return sO;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            n((char) Color.argb(0, 0, 0, 0), TextUtils.indexOf("", ""), 17 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            n((char) (24516 - View.resolveSizeAndState(0, 0, 0)), 1318 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 38 - ((Process.getThreadPriority(0) + 20) >> 6), objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(strE);
            Object[] objArr3 = new Object[1];
            n((char) TextUtils.indexOf("", "", 0), 1297 - ExpandableListView.getPackedPositionType(0L), 21 - (ViewConfiguration.getTapTimeout() >> 16), objArr3);
            f.d(strIntern, sbAppend.append(((String) objArr3[0]).intern()).toString());
        }
        return (short) 0;
    }

    public final void b() throws Throwable {
        int i2 = f25486a * (-2080443126);
        f25486a = i2;
        int i3 = (int) Runtime.getRuntime().totalMemory();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i4 = f25487b * (-1851468325);
        f25487b = i4;
        d(i2, elapsedCpuTime, new Object[]{this}, i3, i4, -268642003, 268642003);
    }

    public final c c() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25494j + 59;
        f25497m = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            n((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, KeyEvent.normalizeMetaState(0) + 17, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            n((char) (37689 - (ViewConfiguration.getEdgeSlop() >> 16)), TextUtils.lastIndexOf("", '0', 0) + 533, 9 - View.combineMeasuredStates(0, 0), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        c cVar = new c();
        Iterator<d> it = this.f25498h.iterator();
        int i5 = f25497m + 101;
        f25494j = i5 % 128;
        int i6 = i5 % 2;
        while (it.hasNext()) {
            Object[] objArr3 = {it.next()};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i7 = d.f25462c * (-2035938118);
            d.f25462c = i7;
            int i8 = d.f25464e * (-308944022);
            d.f25464e = i8;
            int i9 = d.f25465i * (-1958107180);
            d.f25465i = i9;
            cVar.a((o.ef.a) d.d(-154057981, i7, 154057983, i8, i9, objArr3, iMaxMemory));
        }
        return cVar;
    }

    public final void c(c cVar) throws Throwable {
        int i2 = (-1623663008) * f25489d;
        f25489d = i2;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i3 = 1593811860 * f25488c;
        f25488c = i3;
        int i4 = 132145833 * f25490e;
        f25490e = i4;
        d(i2, i3, new Object[]{this, cVar}, elapsedCpuTime, i4, 413986993, -413986992);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Date d() {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = o.ev.b.f25497m
            int r1 = r0 + 39
            int r0 = r1 % 128
            o.ev.b.f25494j = r0
            int r1 = r1 % r5
            java.util.List<o.eu.d> r0 = r6.f25498h
            java.util.Iterator r4 = r0.iterator()
            r3 = 0
        L13:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r4.next()
            o.eu.d r0 = (o.eu.d) r0
            o.fn.c r0 = r0.i()
            if (r0 == 0) goto L13
            java.util.Date r2 = r0.b()
            if (r2 == 0) goto L13
            int r0 = o.ev.b.f25497m
            int r1 = r0 + 117
            int r0 = r1 % 128
            o.ev.b.f25494j = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L44
            r0 = 22
            int r0 = r0 / 0
            if (r3 == 0) goto L42
        L3c:
            boolean r0 = r2.before(r3)
            if (r0 == 0) goto L13
        L42:
            r3 = r2
            goto L13
        L44:
            if (r3 == 0) goto L42
            goto L3c
        L47:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ev.b.d():java.util.Date");
    }

    public final o.ef.a d(e eVar) throws Throwable {
        int i2 = 2 % 2;
        HashMap map = new HashMap();
        for (d dVar : this.f25498h) {
            int iNextInt = new Random().nextInt();
            int i3 = 883403134 * d.f25463d;
            d.f25463d = i3;
            int i4 = d.f25461b * (-1930243941);
            d.f25461b = i4;
            String str = (String) d.d(-2137010787, i3, 2137010788, i4, (int) Runtime.getRuntime().freeMemory(), new Object[]{dVar}, iNextInt);
            if (!dVar.j()) {
                if (map.get(str) == null) {
                    map.put(str, new c());
                }
                ((c) map.get(str)).a(dVar.b(eVar));
                int i5 = f25497m + 59;
                f25494j = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 / 5;
                }
            }
        }
        c cVar = new c();
        int i7 = f25494j + 49;
        f25497m = i7 % 128;
        int i8 = i7 % 2;
        for (Map.Entry entry : map.entrySet()) {
            o.ef.a aVar = new o.ef.a();
            Object[] objArr = new Object[1];
            n((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 52684), 541 - View.MeasureSpec.makeMeasureSpec(0, 0), Color.alpha(0) + 2, objArr);
            aVar.a(((String) objArr[0]).intern(), entry.getKey());
            Object[] objArr2 = new Object[1];
            n((char) (Drawable.resolveOpacity(0, 0) + 47916), 543 - (Process.myPid() >> 22), 15 - TextUtils.indexOf("", "", 0, 0), objArr2);
            aVar.a(((String) objArr2[0]).intern(), entry.getValue());
            cVar.a(aVar);
        }
        o.ef.a aVar2 = new o.ef.a();
        Object[] objArr3 = new Object[1];
        n((char) (14672 - KeyEvent.normalizeMetaState(0)), 558 - TextUtils.indexOf("", "", 0, 0), 5 - ExpandableListView.getPackedPositionType(0L), objArr3);
        aVar2.a(((String) objArr3[0]).intern(), cVar);
        if (f.a()) {
            Object[] objArr4 = new Object[1];
            n((char) ('0' - AndroidCharacter.getMirror('0')), ImageFormat.getBitsPerPixel(0) + 1, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 16, objArr4);
            String strIntern = ((String) objArr4[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr5 = new Object[1];
            n((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), TextUtils.getTrimmedLength("") + 563, (ViewConfiguration.getTouchSlop() >> 8) + 40, objArr5);
            f.c(strIntern, sb.append(((String) objArr5[0]).intern()).append(aVar2.e()).toString());
        }
        return aVar2;
    }

    public final o.ff.e d(o.et.c cVar) {
        o.ff.e eVarM;
        int i2 = 2 % 2;
        String strI = cVar.i();
        d dVarC = c(strI);
        Object obj = null;
        if (dVarC != null) {
            int i3 = f25497m + 13;
            f25494j = i3 % 128;
            if (i3 % 2 != 0) {
                eVarM = dVarC.m();
                int i4 = 27 / 0;
            } else {
                eVarM = dVarC.m();
            }
            int i5 = f25494j + 1;
            f25497m = i5 % 128;
            if (i5 % 2 != 0) {
                return eVarM;
            }
            obj.hashCode();
            throw null;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            n((char) View.resolveSizeAndState(0, 0, 0), ViewConfiguration.getKeyRepeatTimeout() >> 16, (ViewConfiguration.getLongPressTimeout() >> 16) + 17, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            n((char) Color.red(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1250, TextUtils.getOffsetAfter("", 0) + 46, objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(strI);
            Object[] objArr3 = new Object[1];
            n((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + QuickTimeMetadataDirectory.TAG_YEAR, 21 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr3);
            f.d(strIntern, sbAppend.append(((String) objArr3[0]).intern()).toString());
        }
        return null;
    }

    public final void d(Context context, o.eq.b bVar, String str, boolean z2) {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f25497m + 63;
        f25494j = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            n((char) (ViewConfiguration.getJumpTapTimeout() * 83), ViewConfiguration.getTouchSlop() + 75, (Process.myTid() / 55) * 13, objArr);
            strIntern = ((String) objArr[0]).intern();
            if (!bVar.s()) {
                return;
            }
        } else {
            Object[] objArr2 = new Object[1];
            n((char) (ViewConfiguration.getJumpTapTimeout() >> 16), ViewConfiguration.getTouchSlop() >> 8, (Process.myTid() >> 22) + 17, objArr2);
            strIntern = ((String) objArr2[0]).intern();
            if (!bVar.s()) {
                return;
            }
        }
        if (f.a()) {
            int i4 = f25497m + 59;
            f25494j = i4 % 128;
            int i5 = i4 % 2;
            Locale localeD = g.d();
            Object[] objArr3 = new Object[1];
            n((char) (63567 - View.MeasureSpec.getMode(0)), 602 - ((byte) KeyEvent.getModifierMetaStateMask()), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 54, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            String strK = bVar.k();
            int priority = Thread.currentThread().getPriority();
            int i6 = (int) Runtime.getRuntime().totalMemory();
            int i7 = o.eq.b.f24696b * 579433029;
            o.eq.b.f24696b = i7;
            f.c(strIntern, String.format(localeD, strIntern2, strK, (o.eq.d) o.eq.b.e(i7, Thread.currentThread().getPriority(), i6, -578669383, priority, 578669383, new Object[]{bVar})));
        }
        d dVarC = c(bVar.k());
        int priority2 = Thread.currentThread().getPriority();
        int i8 = (int) Runtime.getRuntime().totalMemory();
        int i9 = o.eq.b.f24696b * 579433029;
        o.eq.b.f24696b = i9;
        if (((o.eq.d) o.eq.b.e(i9, Thread.currentThread().getPriority(), i8, -578669383, priority2, 578669383, new Object[]{bVar})) == o.eq.d.f24732c) {
            if (dVarC != null) {
                int i10 = f25494j + 111;
                f25497m = i10 % 128;
                int i11 = i10 % 2;
                if (f.a()) {
                    Locale localeD2 = g.d();
                    Object[] objArr4 = new Object[1];
                    n((char) (47441 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 729, 72 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr4);
                    f.c(strIntern, String.format(localeD2, ((String) objArr4[0]).intern(), bVar.k()));
                }
                if (f.a()) {
                    Locale localeD3 = g.d();
                    Object[] objArr5 = new Object[1];
                    n((char) KeyEvent.keyCodeFromString(""), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + PhotoshopDirectory.TAG_UNICODE_ALPHA_NAMES, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 76, objArr5);
                    f.c(strIntern, String.format(localeD3, ((String) objArr5[0]).intern(), dVarC.c()));
                }
                dVarC.f();
                dVarC.l();
                this.f25498h.remove(dVarC);
                return;
            }
            return;
        }
        int i12 = f25497m + 61;
        f25494j = i12 % 128;
        Object obj2 = null;
        if (i12 % 2 != 0) {
            int priority3 = Thread.currentThread().getPriority();
            int i13 = (int) Runtime.getRuntime().totalMemory();
            int i14 = o.eq.b.f24696b * 579433029;
            o.eq.b.f24696b = i14;
            o.eq.d dVar = o.eq.d.f24730a;
            obj2.hashCode();
            throw null;
        }
        int priority4 = Thread.currentThread().getPriority();
        int i15 = (int) Runtime.getRuntime().totalMemory();
        int i16 = o.eq.b.f24696b * 579433029;
        o.eq.b.f24696b = i16;
        if (((o.eq.d) o.eq.b.e(i16, Thread.currentThread().getPriority(), i15, -578669383, priority4, 578669383, new Object[]{bVar})) != o.eq.d.f24730a) {
            if (dVarC == null) {
                if (f.a()) {
                    Locale localeD4 = g.d();
                    Object[] objArr6 = new Object[1];
                    n((char) (TextUtils.indexOf("", "", 0, 0) + 15489), 910 - Color.green(0), 75 - Color.red(0), objArr6);
                    f.c(strIntern, String.format(localeD4, ((String) objArr6[0]).intern(), bVar.k()));
                }
                d<? extends o.ff.a> dVarC2 = bVar.c(str);
                dVarC2.f();
                this.f25498h.add(dVarC2);
                return;
            }
            if (f.a()) {
                Locale localeD5 = g.d();
                Object[] objArr7 = new Object[1];
                n((char) (47441 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 729 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 72 - (Process.myPid() >> 22), objArr7);
                f.c(strIntern, String.format(localeD5, ((String) objArr7[0]).intern(), bVar.k()));
            }
            if (!dVarC.j()) {
                if (f.a()) {
                    Object[] objArr8 = new Object[1];
                    n((char) (11325 - KeyEvent.getDeadChar(0, 0)), 985 - (ViewConfiguration.getTouchSlop() >> 8), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 59, objArr8);
                    f.c(strIntern, ((String) objArr8[0]).intern());
                }
                dVarC.f();
            }
            if (z2) {
                dVarC.d(context);
                return;
            }
            return;
        }
        if (dVarC == null) {
            if (f.a()) {
                int i17 = f25494j + 99;
                f25497m = i17 % 128;
                int i18 = i17 % 2;
                Locale localeD6 = g.d();
                Object[] objArr9 = new Object[1];
                n((char) (14121 - View.MeasureSpec.makeMeasureSpec(0, 0)), 656 - (ViewConfiguration.getTapTimeout() >> 16), (Process.myPid() >> 22) + 73, objArr9);
                f.c(strIntern, String.format(localeD6, ((String) objArr9[0]).intern(), bVar.k()));
            }
            this.f25498h.add(bVar.c(str));
            return;
        }
        if (f.a()) {
            int i19 = f25494j + 123;
            f25497m = i19 % 128;
            int i20 = i19 % 2;
            Locale localeD7 = g.d();
            Object[] objArr10 = new Object[1];
            n((char) (Color.red(0) + 47440), (KeyEvent.getMaxKeyCode() >> 16) + 729, (ViewConfiguration.getEdgeSlop() >> 16) + 72, objArr10);
            f.c(strIntern, String.format(localeD7, ((String) objArr10[0]).intern(), bVar.k()));
        }
        if (dVarC.j()) {
            int i21 = f25494j + 5;
            f25497m = i21 % 128;
            if (i21 % 2 == 0) {
                f.a();
                obj2.hashCode();
                throw null;
            }
            if (f.a()) {
                Object[] objArr11 = new Object[1];
                n((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 802 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), Color.green(0) + 56, objArr11);
                f.c(strIntern, ((String) objArr11[0]).intern());
            }
            int id = (int) Thread.currentThread().getId();
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int priority5 = Thread.currentThread().getPriority();
            int i22 = d.f25460a * (-766577094);
            d.f25460a = i22;
            d.d(263150758, elapsedCpuTime, -263150758, priority5, i22, new Object[]{dVarC}, id);
        }
        if (z2) {
            dVarC.d(context);
        }
        if ((bVar instanceof i) && (dVarC instanceof o.fc.d)) {
            Integer numC = ((i) bVar).c();
            o.fc.d dVar2 = (o.fc.d) dVarC;
            if (numC != null) {
                int i23 = f25497m + 37;
                f25494j = i23 % 128;
                if (i23 % 2 != 0) {
                    if (dVar2.s() != 1) {
                        return;
                    }
                } else if (dVar2.s() != 1) {
                    return;
                }
                dVar2.a(numC.intValue());
                if (f.a()) {
                    int i24 = f25494j + 23;
                    f25497m = i24 % 128;
                    if (i24 % 2 == 0) {
                        Object[] objArr12 = new Object[1];
                        n((char) View.MeasureSpec.makeMeasureSpec(1, 1), 14228 << ExpandableListView.getPackedPositionGroup(0L), 29 >> (ExpandableListView.getPackedPositionForGroup(0) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 1L ? 0 : -1)), objArr12);
                        obj = objArr12[0];
                    } else {
                        Object[] objArr13 = new Object[1];
                        n((char) View.MeasureSpec.makeMeasureSpec(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 857, 53 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr13);
                        obj = objArr13[0];
                    }
                    f.c(strIntern, ((String) obj).intern());
                }
            }
        }
    }

    public final void e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25494j + 11;
        f25497m = i3 % 128;
        if (i3 % 2 == 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            n((char) (KeyEvent.getMaxKeyCode() >> 16), 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            n((char) (22643 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), Color.red(0) + 1214, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        Iterator<d> it = this.f25498h.iterator();
        while (it.hasNext()) {
            int i4 = f25494j + 43;
            f25497m = i4 % 128;
            int i5 = i4 % 2;
            it.next().l();
            int i6 = f25494j + 27;
            f25497m = i6 % 128;
            int i7 = i6 % 2;
        }
        this.f25498h.clear();
    }

    public final void e(o.dk.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25497m + 101;
        f25494j = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f25497m + 53;
            f25494j = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            n((char) TextUtils.indexOf("", "", 0), View.getDefaultSize(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 17, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            n((char) (5424 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1120, KeyEvent.keyCodeFromString("") + 25, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i7 = f25494j + 87;
            f25497m = i7 % 128;
            int i8 = i7 % 2;
        }
        Iterator<d> it = this.f25498h.iterator();
        int i9 = f25497m + 21;
        f25494j = i9 % 128;
        int i10 = i9 % 2;
        while (it.hasNext()) {
            it.next().b(aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(o.dk.a r19, java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ev.b.e(o.dk.a, java.lang.String):void");
    }
}
