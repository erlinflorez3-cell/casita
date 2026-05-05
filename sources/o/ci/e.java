package o.ci;

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
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.Random;
import o.a.o;
import o.dx.f;
import o.ea.g;
import o.ef.a;
import o.ef.b;
import o.ep.d;
import o.et.c;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22403a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f22404b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f22405c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22406d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22407e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f22408g = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, byte r9, short r10) {
        /*
            int r0 = r10 * 3
            int r7 = 4 - r0
            byte[] r6 = o.ci.e.$$a
            int r5 = r9 + 99
            int r4 = r8 * 2
            int r0 = r4 + 1
            byte[] r3 = new byte[r0]
            r2 = 0
            if (r6 != 0) goto L28
            r1 = r5
            r0 = r2
            r5 = r4
        L14:
            int r7 = r7 + 1
            int r5 = r5 + r1
            r1 = r0
        L18:
            byte r0 = (byte) r5
            r3[r1] = r0
            int r0 = r1 + 1
            if (r1 != r4) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L25:
            r1 = r6[r7]
            goto L14
        L28:
            r1 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ci.e.$$c(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22407e = 0;
        f22408g = 1;
        f22406d = 0;
        f22403a = 1;
        e();
        AudioTrack.getMinVolume();
        ViewConfiguration.getScrollFriction();
        ViewConfiguration.getScrollFriction();
        int i2 = f22408g + 61;
        f22407e = i2 % 128;
        int i3 = i2 % 2;
    }

    private static d b(a aVar) throws Throwable {
        String strS;
        String strS2;
        String strS3;
        String strS4;
        o.dx.d dVar;
        f fVar;
        int i2 = 2 % 2;
        int i3 = f22406d + 75;
        f22403a = i3 % 128;
        int i4 = i3 % 2;
        char c2 = '0';
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            f((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            f((char) (Process.getGidForName("") + 24649), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 824, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f22403a + 111;
            f22406d = i5 % 128;
            int i6 = i5 % 2;
        }
        Object[] objArr3 = new Object[1];
        f((char) Color.blue(0), 849 - Drawable.resolveOpacity(0, 0), Process.getGidForName("") + 3, objArr3);
        Object[] objArr4 = {aVar, ((String) objArr3[0]).intern()};
        int i7 = a.f23782p * (-1576737484);
        a.f23782p = i7;
        String str = (String) a.a(-781664457, objArr4, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i7, Thread.currentThread().getPriority());
        try {
            Object[] objArr5 = new Object[1];
            f((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 28264), 851 - (ViewConfiguration.getEdgeSlop() >> 16), 11 - TextUtils.getOffsetAfter("", 0), objArr5);
            byte[] bArrB = o.ei.a.b(aVar.l(((String) objArr5[0]).intern()).shortValue());
            o.ep.f fVar2 = o.ep.f.f24513e;
            Object[] objArr6 = new Object[1];
            f((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 894 - TextUtils.getOffsetAfter("", 0), 11 - Drawable.resolveOpacity(0, 0), objArr6);
            a aVarV = aVar.v(((String) objArr6[0]).intern());
            if (aVarV != null) {
                Object[] objArr7 = new Object[1];
                f((char) (31081 - (ViewConfiguration.getScrollBarSize() >> 8)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + TypedValues.Custom.TYPE_DIMENSION, 5 - (ViewConfiguration.getTapTimeout() >> 16), objArr7);
                strS2 = aVarV.s(((String) objArr7[0]).intern());
                Object[] objArr8 = new Object[1];
                f((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 909, 8 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr8);
                strS = aVarV.s(((String) objArr8[0]).intern());
                Object[] objArr9 = new Object[1];
                f((char) (50720 - TextUtils.lastIndexOf("", '0', 0, 0)), 918 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 11 - ((Process.getThreadPriority(0) + 20) >> 6), objArr9);
                String strS5 = aVarV.s(((String) objArr9[0]).intern());
                dVar = strS5 != null ? new o.dx.d(strS5) : null;
                Object[] objArr10 = new Object[1];
                f((char) (TextUtils.lastIndexOf("", '0') + 1), 930 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 8 - (Process.myPid() >> 22), objArr10);
                strS3 = aVarV.s(((String) objArr10[0]).intern());
                Object[] objArr11 = new Object[1];
                f((char) ((KeyEvent.getMaxKeyCode() >> 16) + 39536), TextUtils.getCapsMode("", 0, 0) + 937, ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.FF, objArr11);
                a aVarV2 = aVarV.v(((String) objArr11[0]).intern());
                if (aVarV2 != null) {
                    Object[] objArr12 = new Object[1];
                    f((char) (View.combineMeasuredStates(0, 0) + 48287), View.MeasureSpec.getSize(0) + 948, Color.alpha(0) + 10, objArr12);
                    strS4 = aVarV2.s(((String) objArr12[0]).intern());
                    if (strS4 != null) {
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr13 = new Object[1];
                        f((char) (TextUtils.indexOf((CharSequence) "", '0') + 46103), AndroidCharacter.getMirror('0') + 910, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr13);
                        strS4 = sb.append(((String) objArr13[0]).intern()).append(strS4).toString();
                    }
                } else {
                    strS4 = null;
                }
                Object[] objArr14 = new Object[1];
                f((char) (32239 - (ViewConfiguration.getEdgeSlop() >> 16)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 959, 9 - View.combineMeasuredStates(0, 0), objArr14);
                String strS6 = aVarV.s(((String) objArr14[0]).intern());
                fVar = strS6 != null ? new f(strS6) : null;
                Object[] objArr15 = new Object[1];
                f((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 968 - View.MeasureSpec.makeMeasureSpec(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10, objArr15);
                fVar2 = (o.ep.f) aVarV.b(o.ep.f.class, ((String) objArr15[0]).intern(), o.ep.f.f24513e);
                c2 = '0';
            } else {
                strS = null;
                strS2 = null;
                strS3 = null;
                strS4 = null;
                dVar = null;
                fVar = null;
            }
            Object[] objArr16 = new Object[1];
            f((char) ((-1) - TextUtils.lastIndexOf("", c2)), (ViewConfiguration.getTapTimeout() >> 16) + 977, 10 - View.MeasureSpec.getSize(0), objArr16);
            String strS7 = aVar.s(((String) objArr16[0]).intern());
            Object[] objArr17 = new Object[1];
            f((char) (25549 - TextUtils.indexOf("", "", 0, 0)), (-16776458) - Color.rgb(0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13, objArr17);
            String strS8 = aVar.s(((String) objArr17[0]).intern());
            if (o.ea.f.a()) {
                Object[] objArr18 = new Object[1];
                f((char) KeyEvent.keyCodeFromString(""), ViewConfiguration.getLongPressTimeout() >> 16, 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr18);
                String strIntern2 = ((String) objArr18[0]).intern();
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr19 = new Object[1];
                f((char) TextUtils.getTrimmedLength(""), 987 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8, objArr19);
                StringBuilder sbAppend = sb2.append(((String) objArr19[0]).intern()).append(str);
                Object[] objArr20 = new Object[1];
                f((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 995 - (ViewConfiguration.getScrollBarSize() >> 8), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20, objArr20);
                o.ea.f.c(strIntern2, sbAppend.append(((String) objArr20[0]).intern()).toString());
            }
            Object[] objArr21 = new Object[1];
            f((char) (((Process.getThreadPriority(0) + 20) >> 6) + 22602), ((Process.getThreadPriority(0) + 20) >> 6) + 1015, TextUtils.getCapsMode("", 0, 0) + 14, objArr21);
            String strS9 = aVar.s(((String) objArr21[0]).intern());
            Object[] objArr22 = new Object[1];
            f((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 1029, 17 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr22);
            Object[] objArr23 = {aVar, ((String) objArr22[0]).intern(), Boolean.FALSE};
            int iNextInt = new Random().nextInt();
            int i8 = a.f23781o * (-1229447468);
            a.f23781o = i8;
            int iMyUid = Process.myUid();
            int i9 = a.f23784r * 1570495625;
            a.f23784r = i9;
            return new d(str, null, strS2, strS3, strS4, strS, strS7, strS8, (Boolean) a.a(821341192, objArr23, iMyUid, i9, -821341184, iNextInt, i8), bArrB, strS9, dVar, fVar, fVar2, true);
        } catch (IllegalArgumentException unused) {
            Object[] objArr24 = new Object[1];
            f((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 6069), TextUtils.indexOf((CharSequence) "", '0') + 863, 32 - View.combineMeasuredStates(0, 0), objArr24);
            throw new b(((String) objArr24[0]).intern());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0580, code lost:
    
        r0 = new java.lang.Object[1];
        f((char) android.view.KeyEvent.keyCodeFromString(""), android.view.Gravity.getAbsoluteGravity(0, 0) + 551, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 38, r0);
        r0 = ((java.lang.String) r0[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x05a5, code lost:
    
        r0 = new java.lang.Object[1];
        f((char) android.view.KeyEvent.keyCodeFromString(""), 8469 % android.view.Gravity.getAbsoluteGravity(1, 1), 54 << (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), r0);
        r0 = ((java.lang.String) r0[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x05cb, code lost:
    
        o.ea.f.c(r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0615, code lost:
    
        if (o.ea.f.a() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0617, code lost:
    
        r0 = new java.lang.Object[1];
        f((char) (android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 1), 481 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0), android.view.View.resolveSizeAndState(0, 0, 0) + 43, r0);
        o.ea.f.c(r6, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x063d, code lost:
    
        r1 = new java.lang.Object[1];
        f((char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 524, 26 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x066c, code lost:
    
        throw new o.en.f(((java.lang.String) r1[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x04d1, code lost:
    
        if (r10 <= 1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x04d3, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x04d4, code lost:
    
        if (r27 == 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x04d7, code lost:
    
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x04dc, code lost:
    
        if (o.ea.f.a() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x04de, code lost:
    
        r3 = new java.lang.StringBuilder();
        r0 = new java.lang.Object[1];
        f((char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 362 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), 70 - android.graphics.Color.alpha(0), r0);
        o.ea.f.c(r6, r3.append(((java.lang.String) r0[0]).intern()).append(r11.h()).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x051e, code lost:
    
        e(r11, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0525, code lost:
    
        if (r11.i() != 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x052b, code lost:
    
        if (o.ea.f.a() == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x052d, code lost:
    
        r0 = new java.lang.Object[1];
        f((char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.text.TextUtils.getOffsetBefore("", 0) + 432, android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 51, r0);
        o.ea.f.c(r6, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x055f, code lost:
    
        if (r20.put(r11.h(), r11) == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0561, code lost:
    
        r1 = o.ci.e.f22406d + 101;
        o.ci.e.f22403a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0571, code lost:
    
        if (o.ea.f.a() == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0573, code lost:
    
        r1 = o.ci.e.f22403a + 57;
        o.ci.e.f22406d = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x057d, code lost:
    
        if ((r1 % 2) == 0) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0941 A[Catch: b -> 0x0a7a, TryCatch #0 {b -> 0x0a7a, blocks: (B:37:0x02ec, B:38:0x02ef, B:39:0x02f9, B:41:0x032d, B:43:0x0345, B:45:0x034b, B:47:0x0357, B:48:0x0360, B:50:0x0366, B:52:0x036c, B:53:0x03a5, B:55:0x03dd, B:58:0x03e3, B:60:0x0415, B:62:0x0419, B:64:0x0423, B:66:0x0427, B:105:0x05e4, B:106:0x0610, B:73:0x044c, B:75:0x0479, B:77:0x04ca, B:87:0x051e, B:88:0x0521, B:90:0x0527, B:92:0x052d, B:93:0x0555, B:107:0x0611, B:109:0x0617, B:110:0x063d, B:111:0x066c, B:96:0x056d, B:101:0x0580, B:103:0x05cb, B:102:0x05a5, B:84:0x04d8, B:86:0x04de, B:112:0x066d, B:113:0x069d, B:114:0x069e, B:116:0x06a4, B:118:0x06aa, B:121:0x06d4, B:125:0x070f, B:127:0x0767, B:129:0x07be, B:135:0x07f2, B:132:0x07c5, B:136:0x08c1, B:138:0x08eb, B:140:0x0919, B:142:0x0941, B:144:0x0999, B:147:0x09a4, B:148:0x09d1, B:150:0x09d4, B:151:0x09e0, B:153:0x0a4f, B:154:0x0a79), top: B:167:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0a4f A[Catch: b -> 0x0a7a, TryCatch #0 {b -> 0x0a7a, blocks: (B:37:0x02ec, B:38:0x02ef, B:39:0x02f9, B:41:0x032d, B:43:0x0345, B:45:0x034b, B:47:0x0357, B:48:0x0360, B:50:0x0366, B:52:0x036c, B:53:0x03a5, B:55:0x03dd, B:58:0x03e3, B:60:0x0415, B:62:0x0419, B:64:0x0423, B:66:0x0427, B:105:0x05e4, B:106:0x0610, B:73:0x044c, B:75:0x0479, B:77:0x04ca, B:87:0x051e, B:88:0x0521, B:90:0x0527, B:92:0x052d, B:93:0x0555, B:107:0x0611, B:109:0x0617, B:110:0x063d, B:111:0x066c, B:96:0x056d, B:101:0x0580, B:103:0x05cb, B:102:0x05a5, B:84:0x04d8, B:86:0x04de, B:112:0x066d, B:113:0x069d, B:114:0x069e, B:116:0x06a4, B:118:0x06aa, B:121:0x06d4, B:125:0x070f, B:127:0x0767, B:129:0x07be, B:135:0x07f2, B:132:0x07c5, B:136:0x08c1, B:138:0x08eb, B:140:0x0919, B:142:0x0941, B:144:0x0999, B:147:0x09a4, B:148:0x09d1, B:150:0x09d4, B:151:0x09e0, B:153:0x0a4f, B:154:0x0a79), top: B:167:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0175 A[Catch: b -> 0x0a7e, TryCatch #2 {b -> 0x0a7e, blocks: (B:12:0x008c, B:20:0x00ec, B:22:0x0175, B:27:0x01f8), top: B:170:0x008c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o.ep.d c(o.ef.a r35) throws o.en.f {
        /*
            Method dump skipped, instruction units count: 2798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ci.e.c(o.ef.a):o.ep.d");
    }

    private static o.ep.a e(String str, a aVar) throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f22403a + 87;
            f22406d = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            f((char) Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionType(0L), 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            f((char) (Process.myPid() >> 22), View.resolveSize(0, 0) + PhotoshopDirectory.TAG_TRANSPARENCY_INDEX, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        o.ep.a aVar2 = new o.ep.a(str);
        Object[] objArr3 = new Object[1];
        f((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 850, 2 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr3);
        Object[] objArr4 = {aVar, ((String) objArr3[0]).intern()};
        int i5 = a.f23782p * (-1576737484);
        a.f23782p = i5;
        Object[] objArr5 = {aVar2, (String) a.a(-781664457, objArr4, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority())};
        int iMyPid = Process.myPid();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i6 = o.ep.a.f24409n * (-160947621);
        o.ep.a.f24409n = i6;
        int i7 = 2025584838 * o.ep.a.f24408l;
        o.ep.a.f24408l = i7;
        o.ep.a.e(-1118833945, objArr5, i7, 1118833950, iMyPid, i6, iElapsedRealtime);
        Object[] objArr6 = new Object[1];
        f((char) (31081 - ((Process.getThreadPriority(0) + 20) >> 6)), TextUtils.indexOf("", "", 0) + TypedValues.Custom.TYPE_DIMENSION, 5 - TextUtils.getCapsMode("", 0, 0), objArr6);
        Object[] objArr7 = {aVar, ((String) objArr6[0]).intern()};
        int i8 = a.f23782p * (-1576737484);
        a.f23782p = i8;
        aVar2.c((String) a.a(-781664457, objArr7, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i8, Thread.currentThread().getPriority()));
        Object[] objArr8 = new Object[1];
        f((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), ((byte) KeyEvent.getModifierMetaStateMask()) + Utf8.REPLACEMENT_BYTE, TextUtils.indexOf((CharSequence) "", '0', 0) + 7, objArr8);
        aVar2.c(aVar.h(((String) objArr8[0]).intern()).booleanValue());
        if (o.ea.f.a()) {
            Object[] objArr9 = new Object[1];
            f((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), ViewConfiguration.getFadingEdgeLength() >> 16, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10, objArr9);
            String strIntern2 = ((String) objArr9[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr10 = new Object[1];
            f((char) (View.MeasureSpec.getSize(0) + 48613), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1092, 23 - ExpandableListView.getPackedPositionType(0L), objArr10);
            StringBuilder sbAppend = sb.append(((String) objArr10[0]).intern()).append(aVar2.h());
            Object[] objArr11 = new Object[1];
            f((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.getTrimmedLength("") + 995, 'D' - AndroidCharacter.getMirror('0'), objArr11);
            o.ea.f.c(strIntern2, sbAppend.append(((String) objArr11[0]).intern()).toString());
        }
        int i9 = f22406d + 31;
        f22403a = i9 % 128;
        int i10 = i9 % 2;
        return aVar2;
    }

    static void e() {
        char[] cArr = new char[1245];
        ByteBuffer.wrap("\u0094±I\u0096.\u008a\u0003\u0099à´Å\u008eº\u008d\u009fµ|¿Q\u00ad\u0094\u0095I\u0092.\u008c\u0003¾à\u0087Å\u0099º\u0088\u009fñ|÷Qÿ6\u0090ë·È¡\u00adÐ\u0082ÑgÊDÑ9Î\u001eÆóÊÐ¶µõjùOö,ª\u0001ìæ\u0011Û\u0007¸\u001a\u0094\u0095I\u0092.\u008c\u0003¾à\u0087Å\u0099º\u0088\u009fñ|÷Qÿ6£ëªÈ \u00adÀ\u0082ÀgËD×9Ä\u001eÜóÄÐøµüj¼Oæ,ø\u0001àæ\u0005Û\u0005¸\r\u009dCr\u0013W\u00004&é?Î1£3\u0080fe?Z$?T\u001c\u001añ\\ÖA\u008bWhJT]\u0089Mî_Ã@ ^\u0005P\u0094µI\u0085.\u0097\u0003\u0088à\u0096ÅËº\u00ad\u009f£|¨Q¾6¹ëåÈ§\u00adÀ\u0082\u0094gÜDÏ9×\u001eÜóÔJ\u0086\u0097\u0081ð\u009fÝ\u00ad>\u0094\u001b\u008ad\u009bAâ¢ä\u008fìèö5²\u0016ýsÇ\\Õ¹Å\u009aÄçÄÀ\u0093-Í\u000e¬k¨´û\u0091ýò¹ßì8\u0011\u0005\tf\u000eC\u0015¬\u0004\u0089\t?\u001câ\u0011\u0085\u0005¨7K\u001dn\u0010\u0011\u000b43×2ú5\u009d?@'c*\u0006V)LP\u0016\u008d\"ê-Ç4$*\u0001-~([\u0000¸\u0016\u0095\u0015ò\u000b/@\f*idFc£}\u0080~ý\"Úd7{\u0014\u0013q[®T\u008bTè[ÅS\u0094\u0095I\u0092.\u008c\u0003¾à\u0087Å\u0099º\u0088\u009fñ|÷Qÿ6£ëªÈ \u00adÀ\u0082ÀgËD×9Ä\u001eÜóÄÐøµüj¼OÄ,ç\u0001ùæPÛ\u0014¸\u000e\u009d\u0013r\bW\u000041é6Î,£4\u0080)e%Z??\u0011\u001cMñVÖT\u008bMhGM}\"4\u0007mäjÙb¾(\u0093jq\u0084V\u0094\u000b\u0089è\u0091z©§®À°í\u0082\u000e»+¥T´qÍ\u0092Ë¿ÃØ\u009d\u0005\u0089&\u0082Cãlá\u0089æªÿ×ïðý\u001dþ>Ä[\u0087\u0084\u009a¡\u009dÂ\u0093ïÀ\bl5(V&s;\u009c=¹1ÚN\u0007\u001f \u000bMAn\u001d\u008b\u0005´\u001fÑxòv\u0094¦I\u0080.\u0097\u0003Ýà\u0087Å\u009bº\u009c\u009f½|³Q¼6¡ë±È§\u00adÜ\u0082ÚgÊD\u00829Ð\u001eÁóÙÐþµ»jèOé,ï\u0001¯æ\u0003Û\u0014¸\u0013\u009d\u0006rDW 4\u0016éwÎ9£/\u0080#ekZ%?_\u001c\u001añKÖH\u008b@h\u000eM`\"u\u0007tägÙ'¾o\u0093\u007fq\u0099V\u008e\u000b\u008cèÈ\u0094\u0091I\u0096.\u008a\u0003\u0099à¶Å\u0099º\u0083\u009f·|³Q³6¥+-ö.\u0091-¼*_\u000fz%\u00057 \u001fÃ\tî\u0006\u0089.T\u0010w\u001f\u0012l=`\u0094\u0095I\u0092.\u008c\u0003¾à\u0087Å\u0099º\u0088\u009fñ|÷Qÿ6®ëªÈî\u00adÒ\u0082×gÍDË9Ñ\u001eÍó\u008dÐþµøjùO¡,ï\u0001âæ\u0006ÛU¸\u001f\u009d\u0013r\u0014WI4;é9Îx£:\u00804e$Z9?A\u001c\u001añ\u0012Ö\u0000\u008bKhAM3\"s\u0007kämÙr¾x\u0093-q\u0086V\u008b\u000b\u008fè\u0084ÍÊ¢\u008b\u0087µd³Y·>\u00ad\u0013\u00adð½ÕÛ\u008aØoÖL\u009d!\u008b\u0006\u008b\u0094\u0095I\u0092.\u008c\u0003¾à\u0087Å\u0099º\u0088\u009fñ|÷Qÿ6§ë·È¡\u00adÆ\u0082Äg\u0099DË9Ô\u001e\u0088óÈÐûµëjèOø,ª\u0001µæPÛ\u001b¸\u0011\u009d\u0017rDW\b46é3Î=£9\u0080fe?Z#?\u0011\u001c]ñMÖO\u008bPh^M3\"y\u0007xärÙ'\u0094\u0095I\u0092.\u008c\u0003¾à\u0087Å\u0099º\u0088\u009fñ|÷Qÿ6òëåÈ\u0089\u00adÁ\u0082ÛgÌDÒ9Ô\u001e\u0088óÌÐäµþj¼Oò,â\u0001îæ\u0002Û\u001c¸\u0010\u009d\u0004rDW\u001d4:é2Îx£.\u0080'e&Z)?\u0011\u001csñ{Ö\u0000\u0094ÀI×.\u009f\u0003\u008fà\u0089Å\u009eº\u009c\u009f¢|úQ¬6¨ë¤È¼\u00adÖ\u0082\u0094gÍDÊ9Â\u001e\u0088óÞÐ÷µöjùO¡,Ã\u0001Ë\u0094\u0095I\u0092.\u008c\u0003¾à\u0087Å\u0099º\u0088\u009fñ|÷Qÿ6\u0087ë·È¡\u00adÆ\u0082Äg\u0099DÃ9Ã\u001eÌóÈÐòµ»jèOî,ª\u0001ûæ\u0018Û\u0010¸^\u009d\u0004r\u0016W\u00064'é'Îx£0\u0080'e;\u0094\u0095I\u0092.\u008c\u0003¾à\u0087Å\u0099º\u0088\u009fñ|÷Qÿ6£ë¤È¼\u00ad×\u0082\u0094gÞDÐ9È\u001eÝóÝÐ¶µöjýOñ,ª\u0001ææ\u0003ÛU¸\u001b\u009d\u000er\u0014W\u001d4+éwÎb£}\u00804e.Z8?D\u001cHñQÖI\u008bKhIM3\"z\u0007länÙk\u0094\u0093I\u0094.\u009b\u0003\u0092à\u0093Å\u0085º\u0098\u009f\u009f|¯Q²6¢ë È¼¡\u0081|\u0083\u001b\u00996\u0089Õ\u0093ð\u0098\u000fôÒóµí\u0098ß{æ^ø!é\u0004\u0090ç\u0096Ê\u009e\u00adÉpÅSÜ6\u0097\u0019¶ü·ß®¢\u0095\u0085½h\u00adK\u0083.\u0093ñ\u009eÔ´·\u0084\u009a\u0085}t@z#?\u0006véwÌ}¯V\u0094\u009bI\u0084.\u008b\u0003\u0088à\u0083Å\u0099º\u00ad\u009f²|¹Q°6µë«Èº\u00adú\u0082Ð\u0094\u0093I\u0094.\u009b\u0003\u0092à\u0093Å\u0085º\u0098\u009f\u009d|»Q½6¥ë©\u0094\u0090I\u009e.\u0096\u0014ÂÉÚ®Ý\u0083Á`ÁEÇ:ý\u001fåüûÑï\u0094\u009eI\u0096.\u008b\u0003\u0089à¢Å\u0082º\u008b\u009f¸|®Q¬,\u0003ñ#\u00961»5X'}m\u0002\u000e'\u0016Ä\bé\u001c\u008eFS%p\u0007\u0015g:\u007fß~üp÷V*IMF`E\u0083N¦TÙbü}\u001fe2vUD\u0088l\u0094\u0095I\u0092.\u008c\u0003¾à\u0087Å\u0099º\u0088ÎÌ\u0013ðtãYçº²\u009fúààÅÆ&Ë\u000bÛlÀ±Ø\u0092Õ÷©Øà=¨\u001e¸c°D³©¬\u008a\u008cï\u009b0\u008d\u0015\u0087v\u009b[\u009f¼$\u0081vâbÇ~(|\rxn\u0006³Q\u0094IùHÚV?V\u0000Ve\"Fn«(\u008c5Ñ#2>\u0017GxZ]Môù)ÐNÞcÆ\u0080Ú¥ÑÚÑÿú\u001cæ1þVæ\u008bê¨¦Í\u0095â\u0099\u0007\u0086$ÊY¬~\u0081\u0093\u0097°ºÕý\nú/ç\u0094\u009bI\u0093úù'ð@åmû\u008eú«ñÔýñú\u0012Ý?ÓXÍ\u0083\u0010^09\"\u0014&÷4Ò~\u00ad:\u0088\u000bk\u001aF\u0004!\u0001ü\u0002ß\u0002º&\u0095bpcSs.w\t=ävÇV¢C}KXQ;M\u0016\u001añ£Ì¯¯¹\u008a»e°@¨\u0094\u0096I\u0092.\u008b\u0003\u009eà\u0094Å\u0082º\u009c\u009f¥|³Q°6®í÷0ÿWózñ\u0099ã\u0094\u009bI\u009a.\u0099\u0003\u009aà\u0083Å¹º\u0089\u009f·R§\u008f¥è©Å\u0095&ª\u0003«|ªY\u0095º®\u0097\u008cð\u008d\u0094\u0086I\u0084.\u0088\u0003±à\u0087Å\u0089º\u0089\u009f½\u000eöÓô´ø\u0099Àzó_ï ý\u0005ÅæËËÛ¬Ñ(\u0001õ\t\u0092\u0005¿\u0007\\\u0015y7\u0006\u001c#\"À*í2 Çéi4kSg~F\u009dg¸gÇVâL\u0001Y\u0094\u0086I\u0099.\u009b\u0003®à\u0092Å\u008aº\u0098\u009f¤|©\u0094\u009bI\u0084.\u008b\u0003\u0088à\u0083Å\u0099º¨\u009f°|®Q¾\u0094\u0091I\u0096.\u008a\u0003\u0099àÆÅ¢º¨\u009fñ\u0094ÒI\u0087.\u0099\u0003\u008fà\u0087Å\u0086º\u0089\u009f¥|¿Q\u00ad6³ëåÈ¯\u00adÁ\u0082Ñg\u0099DÑ9Â\u001eÜó\u008dÌÛ\u0011ÜvÀ[Ó¸Ä\u009dÎâÊÇÿ$õ\tçnÄ³î\u0090éõ\u009c\u0094\u0080I\u0092.\u0089\u0003\u0088à\u008fÅ\u0099º\u0089\u009f¢|\u009bQ¼6´ë¬È¸\u00adÒ\u0082ÀgÐDÍ9É\u0094\u0091I\u0085.\u009d\u0003\u009cà\u0092Å\u008eº«\u009f£|µQª6°ëåÈã\u00ad\u0093\u0082×gÖDÌ9Ô\u001eÜóßÐãµøjèOè,ä\u0001èæPÛ\u001b¸\u001b\u009d\u0014rDW.4 é8Î-£-\u0080heeZb\u0094\u0091I\u0085.\u009d\u0003\u0099à\u008fÅ\u009f)tô`\u0093x¾y]wxk\u0007N\"FÁPìO\u008bUV\u0000u\u0006\u0010v?\u0016Ú.ù(\u00847£=Nhm:\b:×Y\u0094\u0081I\u0092.\u008c\u0003ºà\u0094Å\u0084º\u0099\u009f¡|\u008aQ¯6³ë Èî\u00ad\u009e\u0082\u0094géDò9ô\u001eíó\u008dÐùµýj¼Oæ,ø\u0001àæ\u0005Û\u0005¸^\u009dFr\u0017WI4;é$Îx£/\u0080#e(Z#?_\u001cIñKÖR\u008bPhMMg\"q\u0007}MÌ\u0090ß÷ÁÚ÷9Ù\u001cÉcÔFì¥Ç\u0088âïþ2í\u0011£tÓ[Ù¾¤\u009d¿à¹Ç *À\t´l°³ñ\u0096«õµØ\u00ad?H\u0002Ha\u0013D\u000b«Z\u008e\u0004ív0i\u00175ztYn¼`\u0083hæ\u0012Å\u0012(\u0016\u000fMR\n±\u001a\u0094~û-Þ<=*\u0000jg#J)¨É\u008fÅÒÅ1\u008c\u0014Æ{Á^é½ñ\u0080åçëÊ©)ì\f\u009cS\u009f¶Õ\u0095\u0095ø\u0086ß\u0090\"Á\u0001½d§K¢®¡\u008d¡Ð 7_\u001aMy]\\@£D".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1245);
        f22405c = cArr;
        f22404b = -1480785118090475017L;
    }

    private static void e(o.ep.a aVar, boolean z2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22403a + 125;
        int i4 = i3 % 128;
        f22406d = i4;
        int i5 = i3 % 2;
        if (z2) {
            int i6 = i4 + 5;
            f22403a = i6 % 128;
            int i7 = i6 % 2;
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                f((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ViewConfiguration.getScrollBarFadeDuration() >> 16, (ViewConfiguration.getEdgeSlop() >> 16) + 10, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Locale localeD = g.d();
                Object[] objArr2 = new Object[1];
                f((char) KeyEvent.keyCodeFromString(""), 1114 - ExpandableListView.getPackedPositionChild(0L), ImageFormat.getBitsPerPixel(0) + 49, objArr2);
                o.ea.f.c(strIntern, String.format(localeD, ((String) objArr2[0]).intern(), aVar.h()));
            }
            new o.dl.b();
            aVar.b(o.dl.b.e(aVar));
            return;
        }
        if (o.ea.f.a()) {
            int i8 = f22406d + 87;
            f22403a = i8 % 128;
            int i9 = i8 % 2;
            Object[] objArr3 = new Object[1];
            f((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.lastIndexOf("", '0') + 1, KeyEvent.getDeadChar(0, 0) + 10, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Locale localeD2 = g.d();
            Object[] objArr4 = new Object[1];
            f((char) (55629 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1163 - KeyEvent.keyCodeFromString(""), 81 - TextUtils.lastIndexOf("", '0', 0), objArr4);
            o.ea.f.c(strIntern2, String.format(localeD2, ((String) objArr4[0]).intern(), aVar.h()));
        }
        for (c cVar : aVar.c()) {
            int priority = Thread.currentThread().getPriority();
            int i10 = (int) Runtime.getRuntime().totalMemory();
            int i11 = o.eq.b.f24696b * 579433029;
            o.eq.b.f24696b = i11;
            if (((o.eq.d) o.eq.b.e(i11, Thread.currentThread().getPriority(), i10, -578669383, priority, 578669383, new Object[]{cVar})) == o.eq.d.f24730a) {
                aVar.b(cVar.B());
                return;
            }
        }
    }

    private static void f(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $11 + 15;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f22405c[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((ViewConfiguration.getPressedStateDuration() >> 16) + 742, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 12 - (ViewConfiguration.getTapTimeout() >> 16), 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f22404b), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a(765 - Process.getGidForName(""), (char) (View.resolveSize(0, 0) + 12470), 11 - TextUtils.lastIndexOf("", '0'), 1946853218, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    objA3 = o.d.d.a(387 - (ViewConfiguration.getEdgeSlop() >> 16), (char) KeyEvent.normalizeMetaState(0), 18 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 39570797, false, $$c(b6, (byte) (6 | b6), b6), new Class[]{Object.class, Object.class});
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
            int i8 = $11 + 51;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = o.d.d.a(-723636472);
                if (objA4 == null) {
                    byte b7 = (byte) 0;
                    objA4 = o.d.d.a(387 - TextUtils.indexOf("", "", 0, 0), (char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 17, 39570797, false, $$c(b7, (byte) ((b7 + 6) - (6 & b7)), b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                throw null;
            }
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr6 = {oVar, oVar};
            Object objA5 = o.d.d.a(-723636472);
            if (objA5 == null) {
                byte b8 = (byte) 0;
                objA5 = o.d.d.a(386 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 18 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 39570797, false, $$c(b8, (byte) ((b8 + 6) - (6 & b8)), b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    static void init$0() {
        $$a = new byte[]{80, 70, 7, 82};
        $$b = JfifUtil.MARKER_APP1;
    }
}
