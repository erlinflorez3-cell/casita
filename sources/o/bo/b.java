package o.bo;

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
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import o.a.o;
import o.ea.m;
import o.ea.n;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends o.bv.a<o.bv.c> implements d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static long f21436a = 0;

    /* JADX INFO: renamed from: b */
    private static int f21437b = 0;

    /* JADX INFO: renamed from: d */
    private static char[] f21438d = null;

    /* JADX INFO: renamed from: f */
    private static int f21439f = 0;

    /* JADX INFO: renamed from: h */
    private static int f21440h = 0;

    /* JADX INFO: renamed from: j */
    private static int f21441j = 0;

    /* JADX INFO: renamed from: c */
    private final o.bk.a f21442c;

    /* JADX INFO: renamed from: e */
    private final FirebaseApp f21443e;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, int r10, int r11) {
        /*
            int r0 = r10 * 3
            int r8 = 4 - r0
            byte[] r7 = o.bo.b.$$a
            int r3 = r9 + 99
            int r6 = r11 * 4
            int r0 = r6 + 1
            byte[] r5 = new byte[r0]
            r4 = 0
            if (r7 != 0) goto L29
            r1 = r8
            r0 = r6
            r3 = r4
        L14:
            int r0 = -r0
            int r8 = r8 + r0
            int r1 = r1 + 1
            r2 = r3
        L19:
            byte r0 = (byte) r8
            r5[r2] = r0
            int r3 = r2 + 1
            if (r2 != r6) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r0 = r7[r1]
            goto L14
        L29:
            r2 = r4
            r1 = r8
            r8 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bo.b.$$c(short, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21441j = 0;
        f21439f = 1;
        f21437b = 0;
        f21440h = 1;
        e();
        TextUtils.getOffsetAfter("", 0);
        TextUtils.getTrimmedLength("");
        KeyEvent.getModifierMetaStateMask();
        Color.rgb(0, 0, 0);
        Drawable.resolveOpacity(0, 0);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        SystemClock.elapsedRealtimeNanos();
        TextUtils.lastIndexOf("", '0', 0, 0);
        ViewConfiguration.getMinimumFlingVelocity();
        KeyEvent.getModifierMetaStateMask();
        View.MeasureSpec.getSize(0);
        AudioTrack.getMaxVolume();
        int i2 = f21441j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f21439f = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public b(Context context, o.bv.c cVar, o.bk.a aVar) {
        super(cVar);
        this.f21442c = aVar;
        this.f21443e = c(context);
    }

    private FirebaseApp c(Context context) throws Throwable {
        FirebaseApp next;
        int i2 = 2 % 2;
        String strA = this.f21442c.a();
        String strC = this.f21442c.c();
        String strD = this.f21442c.d();
        String strE = this.f21442c.e();
        long j2 = 0;
        if (!strA.isEmpty()) {
            int i3 = f21437b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f21440h = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                strC.isEmpty();
                obj.hashCode();
                throw null;
            }
            if (!strC.isEmpty()) {
                int i4 = f21440h + 115;
                f21437b = i4 % 128;
                if (i4 % 2 != 0) {
                    strD.isEmpty();
                    throw null;
                }
                if (!strD.isEmpty()) {
                    int i5 = f21437b + 87;
                    f21440h = i5 % 128;
                    if (i5 % 2 == 0) {
                        strE.isEmpty();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (!strE.isEmpty()) {
                        FirebaseOptions firebaseOptionsBuild = new FirebaseOptions.Builder().setGcmSenderId(strA).setApplicationId(strC).setProjectId(strD).setApiKey(strE).build();
                        List<FirebaseApp> apps = FirebaseApp.getApps(context);
                        if (apps.isEmpty()) {
                            if (o.ea.f.a()) {
                                int i6 = f21440h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                                f21437b = i6 % 128;
                                int i7 = i6 % 2;
                                Object[] objArr = new Object[1];
                                g((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 41136), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, 'W' - AndroidCharacter.getMirror('0'), objArr);
                                String strIntern = ((String) objArr[0]).intern();
                                Object[] objArr2 = new Object[1];
                                g((char) (Process.myTid() >> 22), 784 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 86, objArr2);
                                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
                            }
                            return FirebaseApp.initializeApp(context, firebaseOptionsBuild);
                        }
                        Iterator<FirebaseApp> it = apps.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            String name = next.getName();
                            Object[] objArr3 = new Object[1];
                            g((char) KeyEvent.keyCodeFromString(""), 870 - TextUtils.getTrimmedLength(""), 29 - (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)), objArr3);
                            if (!name.equals(((String) objArr3[0]).intern())) {
                                j2 = 0;
                            } else if (o.ea.f.a()) {
                                Object[] objArr4 = new Object[1];
                                g((char) (41136 - ((Process.getThreadPriority(0) + 20) >> 6)), ViewConfiguration.getWindowTouchSlop() >> 8, 39 - TextUtils.indexOf("", "", 0, 0), objArr4);
                                String strIntern2 = ((String) objArr4[0]).intern();
                                StringBuilder sb = new StringBuilder();
                                Object[] objArr5 = new Object[1];
                                g((char) (AndroidCharacter.getMirror('0') + 26304), 898 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.indexOf("", "") + 55, objArr5);
                                o.ea.f.c(strIntern2, sb.append(((String) objArr5[0]).intern()).append(next.getName()).toString());
                            }
                        }
                        if (next != null) {
                            return next;
                        }
                        Object[] objArr6 = new Object[1];
                        g((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), AndroidCharacter.getMirror('0') + 822, 29 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr6);
                        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, firebaseOptionsBuild, ((String) objArr6[0]).intern());
                        if (!o.ea.f.a()) {
                            return firebaseAppInitializeApp;
                        }
                        Object[] objArr7 = new Object[1];
                        g((char) (Color.green(0) + 41136), ViewConfiguration.getDoubleTapTimeout() >> 16, 39 - Color.argb(0, 0, 0, 0), objArr7);
                        String strIntern3 = ((String) objArr7[0]).intern();
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr8 = new Object[1];
                        g((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 955 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 63 - TextUtils.lastIndexOf("", '0', 0), objArr8);
                        o.ea.f.c(strIntern3, sb2.append(((String) objArr8[0]).intern()).append(firebaseAppInitializeApp.getName()).toString());
                        return firebaseAppInitializeApp;
                    }
                }
            }
        }
        if (o.ea.f.a()) {
            int i8 = f21440h + 75;
            f21437b = i8 % 128;
            int i9 = i8 % 2;
            Object[] objArr9 = new Object[1];
            g((char) (41135 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 39 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr9);
            String strIntern4 = ((String) objArr9[0]).intern();
            Object[] objArr10 = new Object[1];
            g((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 50455), Color.blue(0) + 737, 46 - MotionEvent.axisFromString(""), objArr10);
            o.ea.f.c(strIntern4, ((String) objArr10[0]).intern());
        }
        Object[] objArr11 = new Object[1];
        g((char) (20746 - (Process.myTid() >> 22)), 461 - Color.argb(0, 0, 0, 0), 30 - Color.alpha(0), objArr11);
        throw new IllegalArgumentException(((String) objArr11[0]).intern());
    }

    public static h d(RemoteMessage remoteMessage) throws Throwable {
        int i2 = 2 % 2;
        if (!remoteMessage.getData().isEmpty()) {
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                g((char) (41135 - ExpandableListView.getPackedPositionChild(0L)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 39, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                g((char) (46087 - Color.red(0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 91, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 47, objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            }
            return new h(remoteMessage.getData(), remoteMessage);
        }
        int i3 = f21437b + 47;
        f21440h = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            o.ea.f.a();
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr3 = new Object[1];
            g((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 41136), TextUtils.getTrimmedLength(""), 39 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            g((char) (26984 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), Gravity.getAbsoluteGravity(0, 0) + 39, View.combineMeasuredStates(0, 0) + 52, objArr4);
            o.ea.f.d(strIntern2, ((String) objArr4[0]).intern());
        }
        int i4 = f21437b + 13;
        f21440h = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    static void e() {
        char[] cArr = new char[1023];
        ByteBuffer.wrap("4\u0004[bê¢yü\u0089\u0004\u0018N¯\u0087>ØNZÝ¦lëü\t\u0003`\u0092\u0098!È±lÀ´Wòç\u0003vH\u0085\u0082\u0014Ö¤kË£ZÉê\u0006yZ\u0088\u0087\u001f×¯d>©MÅÝ\u0010lDó\u0086\u0002Ð\u0092b!ª°æýë\u0092³#{°3@ÚÑ¸fB÷\u0010\u0087º\u0014l¥(5ÛÊ\u0096[Zè\fx³\te\u009eb.\u0094¿ÐLAÝ\tmý\u0002p\u0093\"#Î°\u0090A\bÖ\u000ef°÷5\u00848\u0014Ó¥\u0097:\tË\r[ºèey>\tå\u009e\u0094/O¼MLøÝvr,\u0002ê\u0093\u008e _±\u000bA·Öw \u0085OÝþ\u0015m]\u009d´\fÖ»,*~ZÔÉ\u0002xFèµ\u0017ø\u008645b¥ÝÔ\u000bC\fóúb¾\u0091/\u0000g°Çß\u0013NKþ½mü\u009c'\u000b}»Ù*\u0014YLÉõxìç&\u0016|\u0086Â5\u0011¤MÔ\u008dC½ò7az\u0091Õ\u0000\u001a¯Eß\u0098Ná\n°eöÔ6Gh·\u0090&Ú\u0091\u0013\u0000Lê\u0088\u0085Û4#§OW¶Æäq\u0019àq\u0090Ý\u0003\u0019²]\"«ÝîL5ÿkoÏ\u001e\u001e\u0089V9\u0090¨ï[;ÊxzÂ\u0015\u001c\u0084j4µ§ûV\"ÁrqÖà\u001b\u0093S\u0003¥²¨-~Ü:LÈÿ\tnD\u001e\u008d\u0089è87«~[\u0082Ê\u001eeQ\u0015\u0091\u0084â74¦jV\u0083Á\u0003pFàÜ\u0093ó\u0002&½|-\u0080Ü\u0004O\\ÿ\u0098n¤\u0019,\u0088y8Ï«\u000eZZÊ\u009deð\u0014>\u0087r7º¦IQVÁ\u0094pðãm\u0092`\u0002·½\u0003,\u0011Ü\u008bOçþ!#*Lyý\u0081ní\u009e\u0014\u000fF¸»)ÓY\u007fÊ»{ÿë\t\u0014L\u0085\u00976É¦m×¼@ôð2aM\u0092\u0099\u0003Ú³`Ü¾MÈý\u0017nY\u009f\u0080\bÐ¸t)¹ZñÊ\u0007{\näÜ\u0015\u0098\u0085j6«§æ×/@Jñ\u0095bÜ\u0092 \u0003¼¬óÜ3M@þ\u0096oÈ\u009f!\b¡¹ä)~ZKË\u0083tÏä\"\u0015½\u0086ø6:§\u0006Ð\u0082AÚñfbê\u0093ò\u00037¬IÝ\u0088NÜþ\u001bo¾\u0098à\b<¹D*Ï[ÐË\u0012t¶å³\u0015.\u0086I7\u008d \u0097Ð\rA¡òçï\u0091\u0080Ú1\u0010¢kR»Ãõt'ål\u0095Ì\u0006\u0017·^'¼ØôI7úajß\u001b\u0001\u008cf<°\u00ad½^oÏ+\u007f×\u0010\u0016\u0081A1°¢ðS Ä*tÃå\u0014\u0096@\u0006¯·¿(7ÙhIÀú\rkI\u001b\u008a\u008cû=4®,^ÛÏ\u0015`W\u0010È\u0081ð20£nSÝÄ\u0011uCå\u0089\u0096ü\u0007<\u0094\u0095ûÔJ\u000fÙN)º¸ú\u000fd\u009e}îÖ}\u0002ÌQ\\ñ£í2\"\u0081~\u0011Ã`\u000b÷HGµÖê%f´a\u0004Ûk\tú\nJ²Ùî( ¿g\u000fÛ\u009e\u001díG}¾Ìþ\u0094\u0095ûÞJ\u0014Ùo)¿¸ñ\u000f#\u009ehîÈ}\u0013ÌZ\\¸£ð23\u0081e\u0011Û`\u0005÷bG´Ö¹%k´/\u0004Ýk\u0013ú\\J²Ùô((¿j\u000f\u0097\u009e\u001aíL} ÌþS\"¢h2Å\u0081\u001a\u0010\u0004`\u008e÷õF-Õn%Ø´\u0019\u001bRk\u009eúôI6Øb(ß¿\u0017Å\u0091ªß\u001b\u001c\u0088Bx°éü^*Ï'¿Ö,\u0000\u009dP\r¾òöc,Ðu@Ú1H¦B\u0016µ\u0087ýt*ålUÙ:\u0002«R\u001b¸\u0088æy\"îk^Ósõ\u001c¾\u00adj>#ÎÝ_\u008fè\u0000y\u001b\t»\u009at+#»ÙD\u008cÕFfHö·\u0087o\u0010= Ñ1\u009fÂCS\u0018ãµ\u008c9\u001d'\u00adÓÒ¨½â\f(\u009fvo\u0082þ÷I\u0017ØZ¨ã;1\u008a4\u001aÀå\u0082t\u001cÇ_Wæ&9±{\u0001\u0089\u0090\u0085c\nò_Bé-8¼6\f\u009c\u009fÁn\u000fùDIâØ#«|;\u009d\u008a\u0087\u0015\u0012äZtþÇcVy&§±Ç\u0000\u0016\u0093Xcìò ]w-µ\u0094\u0094ûÞJ\u0014ÙJ)¾¸Ë\u000f+\u009efîß}\rÌ\b\\ü£¾2.\u0081b\u0011Ã`\u0003÷GG¹Öý%f´i\u0004Ýk\u000fúOJ±Ùù(2¿k\u000f\u0097\u009e\u001fíJ}¼ÌýS)¢n2Ã\u0081\r\u0010E`\u0099÷óF,Õf\u0094\u0094ûÞJ\u0014ÙJ)¾¸Ë\u000f+\u009efîß}\rÌw\\¸£ð23\u0081i\u0011Ç`\f÷JG¼Ö¹%k´/\u0004Àk\u0012úAJ¶Ùö(a¿h\u000fÒ\u009e\bíF}ºÌþS$¢)2\u008c\u0081_\u0010\u0001`\u009e\u0094\u0094ûÞJ\u0014ÙJ)¾¸Ë\u000f+\u009efîß}\rÌ\b\\ü£¾2)\u0081c\u0011\u0095`\u0016÷DG»Öü%(´/\u0004Òk\u0018ú^J°Ùð($¿j\u000f\u009b\u009e\\íP}¼ÌðS.¢f2Á\u0081\u0011\u0010\u0004`\u008b÷ûF*Õd%Ä´\f\u001bBkÌúçI'Øj(Ã¿\u0016\u000eHÔ\u001b»P\n\u0084\u0099Íi3øaOîÞõ®U=\u009a\u008cÍ\u001c7ãbr¨Á¦QY \u0081·Ó\u0007?\u0096qe\u00adôöD[+×ºÔ\n6\u0099yh®ÿê\u0094\u0094ûÒJ\u0012ÙL)´¸þ\u000f7\u009ehQ\u0082>É\u008f\u0003\u001cxì¨}úÊ6[x+Ì¸\u0007\tZ\u0099\u0087fù÷ D;Ô\u008f¥U2Z\u0082®\u0013üà4qzÁÂ®\u0019?X\u008fä\u001cìí9zwÊÆ[\u0002(U¸°\tþ\u00966gj÷ÈD\u0007Õ]¥Ú2ã\u0083;\u0010kà\u0086q\u001aÞU®\u008f\u0094\u0095ûÞJ\u0014Ùo)¿¸í\u000f!\u009eoîÛ}\u0010ÌM\\\u0090£î27\u0081`\u0011Ü`\u0001÷JG¤Öð%)´a\u0004\u0094kPú\nJ½Ù÷(a¿h\u000fÞ\u009e\u000eí@}°ÌúS3¢l2\u0096\u0081>\u0010T`\u009d÷ºF*Õ{%\u0091´\u001a\u001bBk\u008aúüI,Øn(Ô¿Y\u000e_\u009e\u008aíà|}Ã0S\u0093¢\u00111O\u0081\u0087\u0010ãg5ödFÞÕ\u0012$Z´\u0080\u001bøj8ù$I¹Ø\u0012/F¿È\u000eõ\u009d;ìa|\u00adÃ\u0000RN¢\u009f1°\u00806\u0017hgª\u0094\u0094ûÉJNÙH)¸¸ë\u000f!\u009eaîÕ}\u0013Ì\u0006\\·£÷25\u0081i\u0011×`\u0003÷XGµÖ·%5´j\u0004×k\u0012úDJ·Ùù(3¿wòe\u009d.,ä¿\u009fOOÞ\u001diÑø\u009f\u0088+\u001bàª½:`Å\u001eTÇç\u0090w,\u0006ñ\u0091º!T°\u0000CÙÒ\u0091bd\r \u009cú,q¿\rNÄÙ\u008di\"ø¬\u008b\u0086\u001bGª\b5ßÄ\u0097T\"çîv¦\u0006d\u0091J õ³\u0091C3Òë}µ\r}\u009c\u0016/×¾ºN0Ùùhöø%\u008bD\u0094\u0095ûÞJ\u0014Ùo)¿¸í\u000f!\u009eoîÛ}\u0010ÌM\\\u0090£î27\u0081`\u0011Ü`\u0001÷JG¤Öð%)´a\u0004\u0094kPú\nJ\u009aÙö((¿z\u000fÞ\u009e\u001díI}»ÌáS%¢)2Ø\u0081\u001a\u0010S`Í÷ÉF&Õk%Þ´\u0010\u001bCk\u008dúçI;Ø+(ö¿\u0010\u000eT\u009e\u008aíö|<ÃySÖ¢91Q\u0081\u009e\u0010·gfö%Sª<é\u008d+\u001edî\u0080".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1023);
        f21438d = cArr;
        f21436a = 6139999988991458235L;
    }

    private static void g(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i6 = $11 + 65;
            $10 = i6 % 128;
            if (i6 % i4 != 0) {
                int i7 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f21438d[i2 / i7])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(742 - Color.red(0), (char) (ViewConfiguration.getTouchSlop() >> 8), ExpandableListView.getPackedPositionChild(0L) + 13, 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f21436a), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a(765 - MotionEvent.axisFromString(""), (char) (12470 - ExpandableListView.getPackedPositionGroup(0L)), 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1946853218, false, $$c(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        objA3 = o.d.d.a(TextUtils.getCapsMode("", 0, 0) + 387, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 17 - ((byte) KeyEvent.getModifierMetaStateMask()), 39570797, false, $$c((byte) ($$b >>> 1), b6, b6), new Class[]{Object.class, Object.class});
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
                Object[] objArr5 = {Integer.valueOf(f21438d[i2 + i8])};
                Object objA4 = o.d.d.a(-214519724);
                if (objA4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objA4 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0') + 743, (char) ((-1) - TextUtils.lastIndexOf("", '0')), 12 - ExpandableListView.getPackedPositionGroup(0L), 632508977, false, $$c(b7, b8, b8), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(f21436a), Integer.valueOf(c2)};
                Object objA5 = o.d.d.a(-1567654649);
                if (objA5 == null) {
                    byte b9 = (byte) 1;
                    byte b10 = (byte) (b9 - 1);
                    objA5 = o.d.d.a(766 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((-16764746) - Color.rgb(0, 0, 0)), 12 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1946853218, false, $$c(b9, b10, b10), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = o.d.d.a(-723636472);
                if (objA6 == null) {
                    byte b11 = (byte) 0;
                    objA6 = o.d.d.a(388 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (KeyEvent.getMaxKeyCode() >> 16), 18 - KeyEvent.keyCodeFromString(""), 39570797, false, $$c((byte) ($$b >>> 1), b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            i4 = 2;
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i9 = $10 + 37;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr8 = {oVar, oVar};
                Object objA7 = o.d.d.a(-723636472);
                if (objA7 == null) {
                    byte b12 = (byte) 0;
                    objA7 = o.d.d.a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 386, (char) KeyEvent.normalizeMetaState(0), 18 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 39570797, false, $$c((byte) ($$b >>> 1), b12, b12), new Class[]{Object.class, Object.class});
                }
                ((Method) objA7).invoke(null, objArr8);
                throw null;
            }
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr9 = {oVar, oVar};
            Object objA8 = o.d.d.a(-723636472);
            if (objA8 == null) {
                byte b13 = (byte) 0;
                objA8 = o.d.d.a((ViewConfiguration.getScrollBarSize() >> 8) + 387, (char) TextUtils.getOffsetAfter("", 0), 18 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 39570797, false, $$c((byte) ($$b >>> 1), b13, b13), new Class[]{Object.class, Object.class});
            }
            ((Method) objA8).invoke(null, objArr9);
        }
        String str = new String(cArr);
        int i10 = $11 + 111;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    static void init$0() {
        $$a = new byte[]{7, -110, 9, 72};
        $$b = 12;
    }

    @Override // o.bo.d
    public final String a(Context context) throws Throwable {
        int i2 = 2 % 2;
        if (!b(context)) {
            if (o.ea.f.a()) {
                int i3 = f21437b + 25;
                f21440h = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = new Object[1];
                g((char) (41135 - TextUtils.lastIndexOf("", '0', 0)), TextUtils.indexOf("", "", 0, 0), 39 - KeyEvent.getDeadChar(0, 0), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                g((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 17980), View.resolveSize(0, 0) + 517, 47 - Color.argb(0, 0, 0, 0), objArr2);
                o.ea.f.d(strIntern, ((String) objArr2[0]).intern());
            }
            Object[] objArr3 = new Object[1];
            g((char) (TextUtils.lastIndexOf("", '0') + 1), ExpandableListView.getPackedPositionType(0L) + 375, TextUtils.getCapsMode("", 0, 0) + 34, objArr3);
            throw new f(((String) objArr3[0]).intern());
        }
        try {
            String str = (String) n.c(((FirebaseMessaging) this.f21443e.get(FirebaseMessaging.class)).getToken());
            int i5 = f21440h + 85;
            f21437b = i5 % 128;
            int i6 = i5 % 2;
            if (str == null) {
                if (o.ea.f.a()) {
                    Object[] objArr4 = new Object[1];
                    g((char) (41136 - TextUtils.getCapsMode("", 0, 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 38, objArr4);
                    String strIntern2 = ((String) objArr4[0]).intern();
                    Object[] objArr5 = new Object[1];
                    g((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0') + 648, 54 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr5);
                    o.ea.f.d(strIntern2, ((String) objArr5[0]).intern());
                    int i7 = f21440h + 83;
                    f21437b = i7 % 128;
                    int i8 = i7 % 2;
                }
                Object[] objArr6 = new Object[1];
                g((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16522), 700 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 29, objArr6);
                throw new f(((String) objArr6[0]).intern());
            }
            if (o.ea.f.a()) {
                int i9 = f21440h + 19;
                f21437b = i9 % 128;
                int i10 = i9 % 2;
                Object[] objArr7 = new Object[1];
                g((char) (41135 - TextUtils.indexOf((CharSequence) "", '0', 0)), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.lastIndexOf("", '0', 0, 0) + 40, objArr7);
                String strIntern3 = ((String) objArr7[0]).intern();
                Locale localeD = o.ea.g.d();
                Object[] objArr8 = new Object[1];
                g((char) TextUtils.getCapsMode("", 0, 0), 607 - (ViewConfiguration.getWindowTouchSlop() >> 8), 39 - TextUtils.lastIndexOf("", '0', 0, 0), objArr8);
                o.ea.f.c(strIntern3, String.format(localeD, ((String) objArr8[0]).intern(), str));
            }
            Object[] objArr9 = {str};
            int i11 = m.f23563d * 691068131;
            m.f23563d = i11;
            int i12 = m.f23561b * (-1916120846);
            m.f23561b = i12;
            return (String) m.c(objArr9, (int) SystemClock.uptimeMillis(), i12, -327535505, i11, 327535505, Process.myUid());
        } catch (IllegalArgumentException e2) {
            if (o.ea.f.a()) {
                Object[] objArr10 = new Object[1];
                g((char) (41136 - View.MeasureSpec.makeMeasureSpec(0, 0)), ViewConfiguration.getDoubleTapTimeout() >> 16, 39 - Color.argb(0, 0, 0, 0), objArr10);
                String strIntern4 = ((String) objArr10[0]).intern();
                Object[] objArr11 = new Object[1];
                g((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 565 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 43 - Drawable.resolveOpacity(0, 0), objArr11);
                o.ea.f.e(strIntern4, ((String) objArr11[0]).intern(), e2);
            }
            Object[] objArr12 = new Object[1];
            g((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 20746), 461 - (ViewConfiguration.getWindowTouchSlop() >> 8), 29 - ImageFormat.getBitsPerPixel(0), objArr12);
            throw new f(((String) objArr12[0]).intern());
        }
    }

    @Override // o.bo.d
    public final void b() throws Throwable {
        int i2 = 2 % 2;
        if (!(!o.ea.f.a())) {
            Object[] objArr = new Object[1];
            g((char) (41135 - Process.getGidForName("")), ViewConfiguration.getKeyRepeatTimeout() >> 16, 'W' - AndroidCharacter.getMirror('0'), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            g((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 51007), 1019 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 4 - TextUtils.lastIndexOf("", '0', 0), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        try {
            this.f21443e.delete();
        } catch (Exception e2) {
            if (o.ea.f.a()) {
                Object[] objArr3 = new Object[1];
                g((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 41136), ViewConfiguration.getLongPressTimeout() >> 16, 39 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                g((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 51006), (ViewConfiguration.getScrollBarSize() >> 8) + 1018, ExpandableListView.getPackedPositionChild(0L) + 6, objArr4);
                o.ea.f.e(strIntern2, ((String) objArr4[0]).intern(), e2);
                int i3 = f21440h + 19;
                f21437b = i3 % 128;
                int i4 = i3 % 2;
            }
            int i5 = f21437b + 53;
            f21440h = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // o.bo.d
    public final boolean b(h hVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21440h + 77;
        f21437b = i3 % 128;
        int i4 = i3 % 2;
        String strA = this.f21442c.a();
        Object[] objArr = {((RemoteMessage) hVar.e()).getFrom()};
        int i5 = m.f23563d * 691068131;
        m.f23563d = i5;
        int i6 = m.f23561b * (-1916120846);
        m.f23561b = i6;
        if (Objects.equals(strA, (String) m.c(objArr, (int) SystemClock.uptimeMillis(), i6, -327535505, i5, 327535505, Process.myUid()))) {
            int i7 = f21440h + 95;
            f21437b = i7 % 128;
            if (i7 % 2 != 0) {
                o.ea.f.a();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (o.ea.f.a()) {
                Object[] objArr2 = new Object[1];
                g((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 41136), 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), Color.rgb(0, 0, 0) + 16777255, objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                g((char) (View.resolveSize(0, 0) + 32275), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 146, 83 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr3);
                o.ea.f.c(strIntern, ((String) objArr3[0]).intern());
            }
            return true;
        }
        if (o.ea.f.a()) {
            int i8 = f21437b + 21;
            f21440h = i8 % 128;
            int i9 = i8 % 2;
            Object[] objArr4 = new Object[1];
            g((char) (41136 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), ViewConfiguration.getKeyRepeatTimeout() >> 16, 39 - KeyEvent.keyCodeFromString(""), objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            g((char) (47025 - TextUtils.getOffsetAfter("", 0)), KeyEvent.normalizeMetaState(0) + 231, 88 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr5);
            o.ea.f.c(strIntern2, ((String) objArr5[0]).intern());
            int i10 = f21440h + 75;
            f21437b = i10 % 128;
            int i11 = i10 % 2;
        }
        return false;
    }

    @Override // o.bo.d
    public final String c() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f21437b + 35;
        f21440h = i3 % 128;
        int i4 = i3 % 2;
        double dConvertQuartSecToDecDegrees = CdmaCellLocation.convertQuartSecToDecDegrees(0);
        if (i4 == 0) {
            Object[] objArr = new Object[1];
            g((char) (40452 % (dConvertQuartSecToDecDegrees > 1.0d ? 1 : (dConvertQuartSecToDecDegrees == 1.0d ? 0 : -1))), 10387 >> TextUtils.lastIndexOf("", '%', 1), 9 / (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 1.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 1.0d ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            g((char) ((dConvertQuartSecToDecDegrees > 0.0d ? 1 : (dConvertQuartSecToDecDegrees == 0.0d ? 0 : -1)) + 40452), 138 - TextUtils.lastIndexOf("", '0', 0), 8 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // o.bo.d
    public final String d() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21437b + 29;
        f21440h = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        g((char) (ViewConfiguration.getEdgeSlop() >> 16), 729 - (Process.myTid() >> 22), 8 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f21437b + 27;
        f21440h = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }

    @Override // o.bo.d
    public final String d(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21440h + 29;
        f21437b = i3 % 128;
        int i4 = i3 % 2;
        if (!b(context)) {
            int i5 = f21437b + 91;
            f21440h = i5 % 128;
            if (i5 % 2 == 0) {
                o.ea.f.a();
                throw null;
            }
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                g((char) (41135 - TextUtils.lastIndexOf("", '0')), Process.myPid() >> 22, TextUtils.lastIndexOf("", '0') + 40, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                g((char) (KeyEvent.getDeadChar(0, 0) + 31492), Color.green(0) + ExifDirectoryBase.TAG_PRIMARY_CHROMATICITIES, 56 - TextUtils.getTrimmedLength(""), objArr2);
                o.ea.f.d(strIntern, ((String) objArr2[0]).intern());
            }
            Object[] objArr3 = new Object[1];
            g((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 375 - Drawable.resolveOpacity(0, 0), Drawable.resolveOpacity(0, 0) + 34, objArr3);
            throw new f(((String) objArr3[0]).intern());
        }
        try {
            String str = (String) n.c(FirebaseInstallations.getInstance(this.f21443e).getId());
            int i6 = f21437b + 125;
            f21440h = i6 % 128;
            int i7 = i6 % 2;
            if (str != null) {
                int i8 = m.f23563d * 691068131;
                m.f23563d = i8;
                int i9 = m.f23561b * (-1916120846);
                m.f23561b = i9;
                return (String) m.c(new Object[]{str}, (int) SystemClock.uptimeMillis(), i9, -327535505, i8, 327535505, Process.myUid());
            }
            Object[] objArr4 = new Object[1];
            g((char) (View.combineMeasuredStates(0, 0) + 59236), 492 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 26 - Color.argb(0, 0, 0, 0), objArr4);
            throw new f(((String) objArr4[0]).intern());
        } catch (IllegalArgumentException e2) {
            if (o.ea.f.a()) {
                Object[] objArr5 = new Object[1];
                g((char) (ExpandableListView.getPackedPositionGroup(0L) + 41136), ViewConfiguration.getFadingEdgeLength() >> 16, ExpandableListView.getPackedPositionType(0L) + 39, objArr5);
                String strIntern2 = ((String) objArr5[0]).intern();
                Object[] objArr6 = new Object[1];
                g((char) View.getDefaultSize(0, 0), 409 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 52 - View.resolveSizeAndState(0, 0, 0), objArr6);
                o.ea.f.e(strIntern2, ((String) objArr6[0]).intern(), e2);
            }
            Object[] objArr7 = new Object[1];
            g((char) (20746 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), View.combineMeasuredStates(0, 0) + 461, 31 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr7);
            throw new f(((String) objArr7[0]).intern());
        }
    }
}
