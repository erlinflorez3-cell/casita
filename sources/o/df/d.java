package o.df;

import android.graphics.Color;
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
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;
import o.a.i;
import o.a.n;
import o.ea.f;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22940a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f22941b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22942c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f22943d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f22944e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22945h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f22946i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22947j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r7, byte r8, byte r9) {
        /*
            int r0 = r7 * 4
            int r7 = r0 + 1
            byte[] r6 = o.df.d.$$a
            int r5 = 122 - r8
            int r0 = r9 * 3
            int r4 = 4 - r0
            byte[] r3 = new byte[r7]
            r2 = 0
            if (r6 != 0) goto L28
            r0 = r7
            r5 = r4
            r1 = r2
        L14:
            int r0 = -r0
            int r4 = r4 + 1
            int r5 = r5 + r0
        L18:
            byte r0 = (byte) r5
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 != r7) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L25:
            r0 = r6[r4]
            goto L14
        L28:
            r1 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.df.d.$$c(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22947j = 0;
        f22946i = 1;
        f22941b = 0;
        f22945h = 1;
        c();
        Color.red(0);
        ViewConfiguration.getScrollFriction();
        int i2 = f22947j + 123;
        f22946i = i2 % 128;
        int i3 = i2 % 2;
    }

    private static Date b(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22941b + 101;
        f22945h = i3 % 128;
        int i4 = i3 % 2;
        try {
            Date dateD = o.eg.a.d(str);
            int i5 = f22941b + 53;
            f22945h = i5 % 128;
            int i6 = i5 % 2;
            return dateD;
        } catch (IllegalArgumentException e2) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                f((char) TextUtils.indexOf("", "", 0, 0), "䯝⎃뷯惜齈㖟㸀↤ꏕ˳替몶\ue794倉쾷륽ᜤ逡\ue625͚㇖䑣솠\u1ccf", "ǽ\uf7ce嗦❭", "Ჭ謞湂ᄋ", (-1) - ExpandableListView.getPackedPositionChild(0L), objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                f((char) (ViewConfiguration.getFadingEdgeLength() >> 16), "젆\u2fd9㢣锿\ue13a囉\ud96c", "ǽ\uf7ce嗦❭", "\uf629⺌ꛒ峣", (-768701194) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
                StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(str);
                Object[] objArr3 = new Object[1];
                f((char) View.MeasureSpec.getMode(0), "操祍눎\uf210毗砄Ꟈ첶\uf766ീֆဿ\ueb5b∻鯴ᴜ’靜辀팅", "ǽ\uf7ce嗦❭", "蘨ﳀ躈낍", View.resolveSize(0, 0), objArr3);
                f.e(strIntern, sbAppend.append(((String) objArr3[0]).intern()).toString(), e2);
            }
            Object[] objArr4 = new Object[1];
            g(20 - Drawable.resolveOpacity(0, 0), "\u0016\u0015\u0004\u0013ￃ\u0012\u0017ￃ\b\u000f\u0005\u0004\u0011\ufff8\b\u0017\u0004\u0007ￃ\b", true, (ViewConfiguration.getJumpTapTimeout() >> 16) + 195, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, objArr4);
            throw new o.en.f(((String) objArr4[0]).intern());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.dq.d c(java.lang.String r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.df.d.c(java.lang.String):o.dq.d");
    }

    static void c() {
        f22944e = 3254537125245109291L;
        f22940a = 1564493270;
        f22943d = (char) 17878;
        f22942c = -1270219395;
    }

    private static o.dq.e e(String str) throws Throwable {
        int i2 = 2 % 2;
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1015619173:
                f((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), "䴩\u0d52瑺\uf62c鍘\udc78Ꞁ폑៧➒", "ǽ\uf7ce嗦❭", "攉质⪙냦", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new Object[1]);
                if (!(!str.equals(((String) r14[0]).intern()))) {
                    b2 = 0;
                }
                break;
            case 518126018:
                Object[] objArr = new Object[1];
                f((char) ('0' - AndroidCharacter.getMirror('0')), "ߪ譄욇鸳㫶繖\uea5b栗", "ǽ\uf7ce嗦❭", "鳂갋㙲麺", TextUtils.getOffsetAfter("", 0), objArr);
                if (str.equals(((String) objArr[0]).intern())) {
                    b2 = 3;
                }
                break;
            case 1350822958:
                f((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), "隚溙᳐厘ఋ鬚헅\ue786", "ǽ\uf7ce嗦❭", "螻ᜟᕶ쾙", Color.red(0), new Object[1]);
                if (!(!str.equals(((String) r12[0]).intern()))) {
                    b2 = 1;
                }
                break;
            case 1574760332:
                Object[] objArr2 = new Object[1];
                f((char) (KeyEvent.getMaxKeyCode() >> 16), "䌌鿘呎窎\uf26c莒絫", "ǽ\uf7ce嗦❭", "ᖹ솠⩱Ḉ", 1908514837 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
                if (str.equals(((String) objArr2[0]).intern())) {
                    b2 = 2;
                }
                break;
        }
        if (b2 == 0) {
            return o.dq.e.f23285d;
        }
        if (b2 == 1) {
            return o.dq.e.f23286e;
        }
        if (b2 == 2) {
            o.dq.e eVar = o.dq.e.f23283b;
            int i3 = f22945h + 113;
            f22941b = i3 % 128;
            if (i3 % 2 == 0) {
                return eVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (b2 == 3) {
            return o.dq.e.f23287f;
        }
        if (f.a()) {
            Object[] objArr3 = new Object[1];
            f((char) (ViewConfiguration.getEdgeSlop() >> 16), "䯝⎃뷯惜齈㖟㸀↤ꏕ˳替몶\ue794倉쾷륽ᜤ逡\ue625͚㇖䑣솠\u1ccf", "ǽ\uf7ce嗦❭", "Ჭ謞湂ᄋ", View.resolveSizeAndState(0, 0, 0), objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr4 = new Object[1];
            f((char) TextUtils.getTrimmedLength(""), "絧䶂ﮂᫎꍡ\ue552\uda36\ufae3䰎횔嬥\uf18a\ue8ce龽̙ዪ\ud9ab欆ᙽ럦\uec20䩸泠ᐅꨳ쵐\ued3d胾\uef41ᗠ\udc74쯐䲄", "ǽ\uf7ce嗦❭", "낽蓓둓\uf65f", TextUtils.lastIndexOf("", '0') + 1401213873, objArr4);
            f.d(strIntern, sb.append(((String) objArr4[0]).intern()).append(str).toString());
            int i4 = f22941b + 51;
            f22945h = i4 % 128;
            int i5 = i4 % 2;
        }
        Object[] objArr5 = new Object[1];
        f((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 56857), "ꊡ⟉㤸㷏ꎆ婎曜쒓帣횀ډ떲䵿傭ᝄꍩ❰몯ꮋ螗鵮⸬枍ﻵ贒ၺ", "ǽ\uf7ce嗦❭", "ﲽ鈌ᤐ쟞", ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr5);
        throw new o.en.f(((String) objArr5[0]).intern());
    }

    private static void f(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        Object charArray = str6;
        if (str6 != null) {
            int i4 = $11 + 69;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object obj = null;
        Object charArray3 = str4;
        if (str4 != null) {
            int i6 = $11 + 13;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                str4.toCharArray();
                obj.hashCode();
                throw null;
            }
            charArray3 = str4.toCharArray();
        }
        i iVar = new i();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) charArray3).length;
        char[] cArr5 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(107 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), Process.getGidForName("") + 12, -155898465, false, $$c(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 57))), b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(KeyEvent.normalizeMetaState(0) + 847, (char) (6487 - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13, -694521287, false, $$c(b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 54))), b3), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(obj, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(Gravity.getAbsoluteGravity(0, 0) + 458, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getTouchSlop() >> 8) + 11, 1804962841, false, $$c(b4, (byte) (56 | b4), b4), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA4 = o.d.d.a(639 - Gravity.getAbsoluteGravity(0, 0), (char) (65100 - TextUtils.indexOf("", "", 0)), Color.argb(0, 0, 0, 0) + 12, 1636969060, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                obj = null;
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r10[iVar.f19932b])) ^ (f22944e ^ 740602047300126166L)) ^ ((long) ((int) (((long) f22940a) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f22943d) ^ 740602047300126166L))));
                iVar.f19932b++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    private static void g(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i5 = 2 % 2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i6 = $10 + 27;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        char[] cArr = (char[]) obj;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        int i8 = $10 + 15;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i10 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(f22942c)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(270 - TextUtils.getCapsMode("", 0, 0), (char) Color.alpha(0), 11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -2071844881, false, $$c(b2, (byte) ((b2 + 7) - (7 & b2)), b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(522 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) KeyEvent.keyCodeFromString(""), 11 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 627984172, false, $$c(b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 9))), b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i4 > 0) {
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            int i11 = $11 + 91;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            while (nVar.f19944a < i2) {
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a((ViewConfiguration.getFadingEdgeLength() >> 16) + 522, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, 627984172, false, $$c(b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 9))), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            int i13 = $10 + 73;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void init$0() {
        $$a = new byte[]{Ascii.EM, -93, 95, -122};
        $$b = 178;
    }

    @Override // o.df.a
    public final o.dq.c d(String str, String str2) throws Throwable {
        int i2 = 2 % 2;
        o.dq.c cVar = new o.dq.c();
        try {
            o.ef.a aVar = new o.ef.a(str2);
            int i3 = o.dq.c.f23255o * (-1462558457);
            o.dq.c.f23255o = i3;
            int i4 = o.dq.c.f23252l * (-431129044);
            o.dq.c.f23252l = i4;
            o.dq.c.e(Thread.currentThread().getPriority(), (int) Runtime.getRuntime().maxMemory(), new Object[]{cVar, str}, 561374006, i3, -561374001, i4);
            Object[] objArr = new Object[1];
            f((char) Color.red(0), "⎠܇\udcbf\uea81蚑캝ཀ䱧", "ǽ\uf7ce嗦❭", "퉿\u0e67鷺齕", ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr);
            Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
            int i5 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i5;
            Object[] objArr3 = {cVar, (String) o.ef.a.a(-781664457, objArr2, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority())};
            int i6 = o.dq.c.f23261u * (-248101015);
            o.dq.c.f23261u = i6;
            int i7 = o.dq.c.f23264x * (-1173840984);
            o.dq.c.f23264x = i7;
            int iMyTid = Process.myTid();
            int i8 = o.dq.c.f23263w * (-23964688);
            o.dq.c.f23263w = i8;
            o.dq.c.e(iMyTid, i8, objArr3, 497708874, i6, -497708862, i7);
            String strB = o.dq.a.b(str, cVar.w());
            int iMyTid2 = Process.myTid();
            int iMyUid = Process.myUid();
            int i9 = o.dq.c.V * 2054036048;
            o.dq.c.V = i9;
            int i10 = o.dq.c.W * 702719824;
            o.dq.c.W = i10;
            o.dq.c.e(i9, i10, new Object[]{cVar, strB}, -1624624042, iMyTid2, 1624624066, iMyUid);
            int i11 = o.dq.c.R * 165990070;
            o.dq.c.R = i11;
            int iMyUid2 = Process.myUid();
            int i12 = o.dq.c.T * 56027633;
            o.dq.c.T = i12;
            o.dq.c.e(i12, Process.myTid(), new Object[]{cVar, strB}, -872378002, i11, 872378025, iMyUid2);
            Object[] objArr4 = new Object[1];
            g((ViewConfiguration.getWindowTouchSlop() >> 8) + 12, "\u0006\ufffb\u0011ￛ\u0007￼�\ufffb\r\n\n�", false, TextUtils.getOffsetAfter("", 0) + 206, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 7, objArr4);
            Object[] objArr5 = {aVar, ((String) objArr4[0]).intern()};
            int i13 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i13;
            Object[] objArr6 = {cVar, o.ei.c.e((String) o.ef.a.a(-781664457, objArr5, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i13, Thread.currentThread().getPriority()))};
            int iNextInt = new Random().nextInt();
            int priority = Thread.currentThread().getPriority();
            int iNextInt2 = new Random().nextInt(394647635);
            int i14 = (-1625678718) * o.dq.c.f23265y;
            o.dq.c.f23265y = i14;
            o.dq.c.e(iNextInt2, i14, objArr6, 2100515447, iNextInt, -2100515436, priority);
            Object[] objArr7 = new Object[1];
            g(15 - Color.blue(0), "\ufffa\u0005\u000e￩\u0003\u0004\ufffe\t\ufff8\ufff6\b\u0003\ufff6\u0007\t", true, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 208, 14 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr7);
            Object[] objArr8 = {aVar, ((String) objArr7[0]).intern()};
            int i15 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i15;
            Object[] objArr9 = {cVar, c((String) o.ef.a.a(-781664457, objArr8, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i15, Thread.currentThread().getPriority()))};
            int iNextInt3 = new Random().nextInt(1759596137);
            int iMyTid3 = Process.myTid();
            int i16 = o.dq.c.ag * 1555996728;
            o.dq.c.ag = i16;
            int i17 = o.dq.c.ah * (-805012015);
            o.dq.c.ah = i17;
            o.dq.c.e(i16, i17, objArr9, 1891140439, iNextInt3, -1891140408, iMyTid3);
            Object[] objArr10 = new Object[1];
            f((char) (11388 - Gravity.getAbsoluteGravity(0, 0)), "性䔙誘\ue620穉쵪픚폻咢▱늼\uef02榩螁\uf087㎺գ阭鄔", "ǽ\uf7ce嗦❭", "㸅鬞簕蘬", 362487358 - (ViewConfiguration.getEdgeSlop() >> 16), objArr10);
            Object[] objArr11 = {aVar, ((String) objArr10[0]).intern()};
            int i18 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i18;
            cVar.e(e((String) o.ef.a.a(-781664457, objArr11, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i18, Thread.currentThread().getPriority())));
            Object[] objArr12 = new Object[1];
            f((char) Color.green(0), "\ue725\u209f繍\ue130\ue99a㶻⅌幍伄\u1aae頜\uded3\uea3b\uf463훍㮫慯匍봇꽸", "ǽ\uf7ce嗦❭", "榮\uf683馢面", 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr12);
            Object[] objArr13 = {aVar, ((String) objArr12[0]).intern()};
            int i19 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i19;
            Object[] objArr14 = {cVar, b((String) o.ef.a.a(-781664457, objArr13, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i19, Thread.currentThread().getPriority()))};
            int id = (int) Thread.currentThread().getId();
            int priority2 = Thread.currentThread().getPriority();
            int iMyUid3 = Process.myUid();
            int i20 = o.dq.c.F * 1706170942;
            o.dq.c.F = i20;
            o.dq.c.e(iMyUid3, i20, objArr14, -2081493663, id, 2081493681, priority2);
            Object[] objArr15 = new Object[1];
            f((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 5600), "甙Ȗ☰凉쁖釘", "ǽ\uf7ce嗦❭", "⁏끤\ue0b5㸕", ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr15);
            if (aVar.d(((String) objArr15[0]).intern())) {
                int i21 = f22941b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f22945h = i21 % 128;
                int i22 = i21 % 2;
                Object[] objArr16 = new Object[1];
                f((char) (5600 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), "甙Ȗ☰凉쁖釘", "ǽ\uf7ce嗦❭", "⁏끤\ue0b5㸕", 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr16);
                cVar.d(BigDecimal.valueOf(aVar.j(((String) objArr16[0]).intern()).doubleValue()).abs());
            }
            Object[] objArr17 = new Object[1];
            g((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12, "�\u0002\ufffb\b\u000e￨\ufffb\u0007\uffff\u0007\uffff\f", false, 204 - View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf("", "") + 9, objArr17);
            cVar.c(aVar.s(((String) objArr17[0]).intern()));
            Object[] objArr18 = new Object[1];
            f((char) (TextUtils.indexOf("", "", 0, 0) + 26338), "Ⰰꗍ䪹氾⬘訣Ḗ櫉낝粒襁쵘\u086f旅≩활ﹶ靅", "ǽ\uf7ce嗦❭", "剪稲\ue290試", ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr18);
            cVar.m(aVar.s(((String) objArr18[0]).intern()));
            Object[] objArr19 = new Object[1];
            g(ExpandableListView.getPackedPositionChild(0L) + 13, "￼\u0007\u0010￫\u000b\u0005\ufff8\uffff\ufffa\t￼\u0004", true, 207 - View.combineMeasuredStates(0, 0), TextUtils.indexOf("", "", 0) + 12, objArr19);
            Object[] objArr20 = {cVar, aVar.s(((String) objArr19[0]).intern())};
            int i23 = o.dq.c.ac * 1323193544;
            o.dq.c.ac = i23;
            int iNextInt4 = new Random().nextInt();
            int id2 = (int) Thread.currentThread().getId();
            int i24 = o.dq.c.Z * (-636728898);
            o.dq.c.Z = i24;
            o.dq.c.e(id2, i24, objArr20, 295617363, i23, -295617336, iNextInt4);
            Object[] objArr21 = new Object[1];
            g(21 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u000b\ufffa\ufff8\n\u0005\ufff8\t\u000b\t￼\u0000�\u0000\u000b\u0005￼\ufffb￠\u0005\u0006\u0000", true, TextUtils.indexOf((CharSequence) "", '0') + 208, 8 - Color.blue(0), objArr21);
            cVar.s(aVar.s(((String) objArr21[0]).intern()));
            int i25 = f22941b + 67;
            f22945h = i25 % 128;
            if (i25 % 2 != 0) {
                return cVar;
            }
            throw null;
        } catch (o.ef.b e2) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr22 = new Object[1];
            g(55 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\uffc1\u0015\u0013\u0002\u000f\u0014\u0002\u0004\u0015\n\u0010\u000f\uffc1ￛ\uffc1￫\u0014\u0010\u000f\uffc1￦\u0019\u0004\u0006\u0011\u0015\n\u0010\u000f\uffc1\u0006\u000f\u0004\u0010\u0016\u000f\u0015\u0006\u0013\u0006\u0005\uffc1\u0018\t\n\r\u0006\uffc1\u0013\u0006\u0002\u0005\n\u000f\b", false, 198 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 15 - TextUtils.getOffsetBefore("", 0), objArr22);
            throw new o.en.f(sb.append(((String) objArr22[0]).intern()).append(e2.getMessage()).toString());
        }
    }
}
