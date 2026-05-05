package o.cl;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.card.EmvApplicationActivationMethodType;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.a.k;
import o.a.n;
import o.ea.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22473a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f22474b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22475c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f22476d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22477e = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22478j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r7, byte r8, short r9) {
        /*
            byte[] r6 = o.cl.e.$$a
            int r5 = r7 * 3
            int r1 = r5 + 1
            int r0 = r8 * 2
            int r4 = 4 - r0
            int r0 = r9 + 107
            byte[] r3 = new byte[r1]
            r2 = -1
            if (r6 != 0) goto L27
            r0 = r5
            r1 = r4
        L13:
            int r4 = r4 + r0
            int r1 = r1 + 1
        L16:
            int r2 = r2 + 1
            byte r0 = (byte) r4
            r3[r2] = r0
            if (r2 != r5) goto L24
            java.lang.String r1 = new java.lang.String
            r0 = 0
            r1.<init>(r3, r0)
            return r1
        L24:
            r0 = r6[r1]
            goto L13
        L27:
            r1 = r4
            r4 = r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cl.e.$$c(byte, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22474b = 0;
        f22478j = 1;
        f22475c = 0;
        f22477e = 1;
        b();
        TextUtils.getCapsMode("", 0, 0);
        KeyEvent.getDeadChar(0, 0);
        ExpandableListView.getPackedPositionChild(0L);
        int i2 = f22474b + 49;
        f22478j = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static List<o.eq.b> a(o.ef.a aVar) throws Throwable {
        String strIntern;
        String strIntern2;
        String strIntern3;
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        f(20 - (ViewConfiguration.getPressedStateDuration() >> 16), "￭\u0000￼\uffff\u0000\r￠\b\u0011ￜ\u000b\u000b\u0007\u0004\ufffe￼\u000f\u0004\n\t", false, TextUtils.getTrimmedLength("") + 251, View.resolveSizeAndState(0, 0, 0) + 6, objArr);
        String strIntern4 = ((String) objArr[0]).intern();
        try {
            if (f.a()) {
                Object[] objArr2 = new Object[1];
                g("艃슥\ue73a舱ⲅ捷ꐵ진Ӛ\uea5bⴆ䃅辋涺뙰\ude31ᚴ\uf48f㽌啕饜翬맄ⰽ 蛴˥ꮕ\uab0fࠓ诂⊯㉧鍰ᐭ맛뒃᩷鴹ブ㿟鶗\ue660踔욷⒃潟ՙ䥃꿧\ue9b7鱲", 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
                f.c(strIntern4, ((String) objArr2[0]).intern());
            }
            List<o.eq.b> arrayList = new ArrayList<>();
            try {
                Object[] objArr3 = new Object[1];
                g("쉁훪ꥇ숲ᄞ眩\uea48\uf44f䓨︊", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
                Object[] objArr4 = {aVar, ((String) objArr3[0]).intern()};
                int i3 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i3;
                o.eq.d dVarD = o.eq.d.d((String) o.ef.a.a(-781664457, objArr4, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i3, Thread.currentThread().getPriority()));
                int i4 = f22475c + 1;
                f22477e = i4 % 128;
                if (i4 % 2 == 0) {
                    f.a();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (f.a()) {
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr5 = new Object[1];
                    g("걨ᱻΧ갚駹붩䂨粸⫱㒅즛\uf5b9ꆠ덤勭歍㢟⩑\udbd1\ue029띷ꄲ嵙饁ค堽\ue670Ỿ蕠훥潁韄ᰀ䶩\uf0b6ಱ髼쒅禆薒ᇴ䍻˹㭹\ue884敏诒끤朦煰", Color.alpha(0) + 1, objArr5);
                    f.c(strIntern4, sb.append(((String) objArr5[0]).intern()).append(dVarD.c()).toString());
                }
                try {
                    Object[] objArr6 = new Object[1];
                    f((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6, "\ufff5\u0001\u0006\u0003\ufffa\b", true, 258 - (ViewConfiguration.getLongPressTimeout() >> 16), 5 - (ViewConfiguration.getTouchSlop() >> 8), objArr6);
                    Object[] objArr7 = {aVar, ((String) objArr6[0]).intern()};
                    int i5 = o.ef.a.f23782p * (-1576737484);
                    o.ef.a.f23782p = i5;
                    d dVarE = d.e((String) o.ef.a.a(-781664457, objArr7, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority()));
                    if (f.a()) {
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr8 = new Object[1];
                        g("뽔\ueaa4嵺뼦\udf66䭶ṵ㨧㧍쉚靆댦늜䖻రⷒ⮣\udc8e蔌ꚶꑋ埭΄\udfdeᴸ껢뢭塡陜›㆜텛༼뭶깫䨮觀㉚❛쌍ˈ떱尿緵ﮡಊ픈\uf6fb琚螯", ExpandableListView.getPackedPositionGroup(0L) + 1, objArr8);
                        f.c(strIntern4, sb2.append(((String) objArr8[0]).intern()).append(dVarE.e()).toString());
                    }
                    Object[] objArr9 = new Object[1];
                    g("\udec8斋泀\udeb8窇쑎⿁鿁塱䵫\ua6f9ᛯ팞쪃㶶蠵䨰厩뒡͇", 1 - (Process.myTid() >> 22), objArr9);
                    Object[] objArr10 = {aVar, ((String) objArr9[0]).intern()};
                    int i6 = o.ef.a.f23782p * (-1576737484);
                    o.ef.a.f23782p = i6;
                    try {
                        c<? extends o.eq.b> cVarB = a.b(dVarE, (String) o.ef.a.a(-781664457, objArr10, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i6, Thread.currentThread().getPriority()));
                        Object[] objArr11 = new Object[1];
                        g("▍ꨔĺ◤ᇂே", (ViewConfiguration.getFadingEdgeLength() >> 16) + 1, objArr11);
                        Object[] objArr12 = {aVar, ((String) objArr11[0]).intern()};
                        int i7 = o.ef.a.f23782p * (-1576737484);
                        o.ef.a.f23782p = i7;
                        String str = (String) o.ef.a.a(-781664457, objArr12, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i7, Thread.currentThread().getPriority());
                        Object[] objArr13 = new Object[1];
                        f(15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\uffde\u0011\r\ufffe\u000b\u0007\ufffa\u0005￢�\r\b\u0004\ufffe\u0007", false, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 252, 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr13);
                        String strS = aVar.s(((String) objArr13[0]).intern());
                        Object[] objArr14 = new Object[1];
                        g("⺁\uf4ad㙦⻨噪啴畬댪ꠥ", 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr14);
                        Object[] objArr15 = {aVar, ((String) objArr14[0]).intern(), -1};
                        int priority = Thread.currentThread().getPriority();
                        int i8 = o.ef.a.f23777k * (-845283131);
                        o.ef.a.f23777k = i8;
                        int iIntValue = ((Integer) o.ef.a.a(1647814368, objArr15, (int) SystemClock.uptimeMillis(), (int) Thread.currentThread().getId(), -1647814363, priority, i8)).intValue();
                        Object[] objArr16 = new Object[1];
                        f(13 - (Process.myPid() >> 22), "\u000b\u000e￬\u0000\u000e�\uffff\u0000￥\u0001\b\u0005\u0002", true, 250 - TextUtils.indexOf("", ""), 7 - ((Process.getThreadPriority(0) + 20) >> 6), objArr16);
                        String strIntern5 = ((String) objArr16[0]).intern();
                        Object[] objArr17 = new Object[1];
                        f((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2, "\ufffe\u0002", true, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 196, 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr17);
                        Object[] objArr18 = {aVar, strIntern5, ((String) objArr17[0]).intern()};
                        int i9 = o.ef.a.f23773g * 1081559339;
                        o.ef.a.f23773g = i9;
                        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                        int i10 = o.ef.a.f23772f * (-1705304066);
                        o.ef.a.f23772f = i10;
                        String str2 = (String) o.ef.a.a(1581939473, objArr18, i10, (int) SystemClock.uptimeMillis(), -1581939469, i9, iMaxMemory);
                        if (dVarD == o.eq.d.f24730a) {
                            if (f.a()) {
                                int i11 = f22475c + 95;
                                f22477e = i11 % 128;
                                if (i11 % 2 == 0) {
                                    Object[] objArr19 = new Object[1];
                                    f(24 >>> TextUtils.getOffsetAfter("", 1), "\u0018\u000b\u0016\u0005\u0003ￂ\u0015\u000bￂ\u0010\u0011\u000b\u0016\u0003\u0005\u000b\u000e\u0012\u0012￣ￂ\u0018\u000f\uffe7ￂￏￂ\u0010\u0011\u000b\u0016\u0003\u0005\u000b\u000e\u0012\u0012￣\u0018\u000f\uffe7\u0006\u0003\u0007\u0014\u0007", false, (ViewConfiguration.getScrollBarSize() / 12) * 32398, 95 >>> TextUtils.lastIndexOf("", 'T', 0, 0), objArr19);
                                    strIntern3 = ((String) objArr19[0]).intern();
                                } else {
                                    Object[] objArr20 = new Object[1];
                                    f(46 - TextUtils.getOffsetAfter("", 0), "\u0018\u000b\u0016\u0005\u0003ￂ\u0015\u000bￂ\u0010\u0011\u000b\u0016\u0003\u0005\u000b\u000e\u0012\u0012￣ￂ\u0018\u000f\uffe7ￂￏￂ\u0010\u0011\u000b\u0016\u0003\u0005\u000b\u000e\u0012\u0012￣\u0018\u000f\uffe7\u0006\u0003\u0007\u0014\u0007", true, (ViewConfiguration.getScrollBarSize() >> 8) + 244, 44 - TextUtils.lastIndexOf("", '0', 0, 0), objArr20);
                                    strIntern3 = ((String) objArr20[0]).intern();
                                }
                                f.c(strIntern4, strIntern3);
                            }
                            Object[] objArr21 = new Object[1];
                            f(Color.alpha(0) + 11, "\ufffe\f\ufffb�\uffff\u0006\u0003\u0000\t\f￪", true, 252 - ExpandableListView.getPackedPositionType(0L), Color.argb(0, 0, 0, 0) + 4, objArr21);
                            arrayList = cVarB.d(str, strS, iIntValue, str2, aVar.x(((String) objArr21[0]).intern()));
                        } else {
                            o.eq.b bVarA = cVarB.a(str, strS, iIntValue, str2);
                            if (f.a()) {
                                int i12 = f22477e + 13;
                                f22475c = i12 % 128;
                                if (i12 % 2 != 0) {
                                    Object[] objArr22 = new Object[1];
                                    g("卾搙碤匌㶚엋㮫\ud8db헧䳧늘凚庶쬆⧮켮잉刳ꃒ䑊䡡\ud950♚㴢\uf112\u205f鵳몝究꺇ᑂ㎧\ue316㗋讵꣒旪볧ʅ⇱\ueee2㬃秽齛ឈ船\uf0d6ᐇ顫॑瘲赪Ř遻", KeyEvent.getMaxKeyCode() * 40, objArr22);
                                    strIntern = ((String) objArr22[0]).intern();
                                } else {
                                    Object[] objArr23 = new Object[1];
                                    g("卾搙碤匌㶚엋㮫\ud8db헧䳧늘凚庶쬆⧮켮잉刳ꃒ䑊䡡\ud950♚㴢\uf112\u205f鵳몝究꺇ᑂ㎧\ue316㗋讵꣒旪볧ʅ⇱\ueee2㬃秽齛ឈ船\uf0d6ᐇ顫॑瘲赪Ř遻", (KeyEvent.getMaxKeyCode() >> 16) + 1, objArr23);
                                    strIntern = ((String) objArr23[0]).intern();
                                }
                                f.c(strIntern4, strIntern);
                            }
                            if (dVarD == o.eq.d.f24731b) {
                                Object[] objArr24 = new Object[1];
                                g("”\udb37蹾\u206e\ua9da竴쵵䲏Ꚕ\uf3d4䑹얾ⷑ琰\udf37季듺", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, objArr24);
                                Object[] objArr25 = {aVar, ((String) objArr24[0]).intern()};
                                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                int iMyUid = Process.myUid();
                                int i13 = (-1229108307) * o.ef.a.f23780n;
                                o.ef.a.f23780n = i13;
                                o.ef.c cVar = (o.ef.c) o.ef.a.a(-1398121910, objArr25, iMyUid, i13, 1398121917, iUptimeMillis, iElapsedRealtime);
                                HashMap map = new HashMap();
                                new o.cs.b();
                                int i14 = 0;
                                while (true) {
                                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                    int i15 = o.ef.c.f23799b * 1567746851;
                                    o.ef.c.f23799b = i15;
                                    int i16 = o.ef.c.f23798a * 1136425123;
                                    o.ef.c.f23798a = i16;
                                    if (i14 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i16, i15, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar})).intValue()) {
                                        bVarA.a(map);
                                        break;
                                    }
                                    o.cs.d dVarB = o.cs.b.b(cVar.d(i14));
                                    if (f.a()) {
                                        Object[] objArr26 = new Object[1];
                                        f(58 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0010\u0017\f\uffc8\t\u0014\u0014\u0017\u001f\r\f\uffc8ￍ\u001b\uffc8ￕ\uffc8\u001c!\u0018\r\uffc8￢\uffc8ￍ\u001b\u001a\r\t\f￭\u0015\u001e￩\u0018\u0018\u0014\u0011\u000b\t\u001c\u0011\u0017\u0016\uffc8ￕ\uffc8\u001b\u001c\r\u0018\uffc8\u001d\u0018\uffc8\u0015\r\u001c", false, Gravity.getAbsoluteGravity(0, 0) + 238, 26 - Color.argb(0, 0, 0, 0), objArr26);
                                        String strIntern6 = ((String) objArr26[0]).intern();
                                        int i17 = o.cs.d.f22590b * 2033895861;
                                        o.cs.d.f22590b = i17;
                                        int i18 = o.cs.d.f22593e * 1121861622;
                                        o.cs.d.f22593e = i18;
                                        int priority2 = Thread.currentThread().getPriority();
                                        int i19 = o.cs.d.f22589a * (-121879155);
                                        o.cs.d.f22589a = i19;
                                        String str3 = (String) o.cs.d.b(i19, 1953396095, -1953396094, new Object[]{dVarB}, priority2, i17, i18);
                                        int i20 = o.cs.d.f22592d * (-1580426530);
                                        o.cs.d.f22592d = i20;
                                        int i21 = o.cs.d.f22591c * 1801994784;
                                        o.cs.d.f22591c = i21;
                                        f.c(strIntern4, String.format(strIntern6, str3, (EmvApplicationActivationMethodType) o.cs.d.b(Thread.activeCount(), -1645654662, 1645654662, new Object[]{dVarB}, Thread.currentThread().getPriority(), i20, i21)));
                                    }
                                    int i22 = o.cs.d.f22590b * 2033895861;
                                    o.cs.d.f22590b = i22;
                                    int i23 = o.cs.d.f22593e * 1121861622;
                                    o.cs.d.f22593e = i23;
                                    int priority3 = Thread.currentThread().getPriority();
                                    int i24 = o.cs.d.f22589a * (-121879155);
                                    o.cs.d.f22589a = i24;
                                    if (map.put((String) o.cs.d.b(i24, 1953396095, -1953396094, new Object[]{dVarB}, priority3, i22, i23), dVarB) != null) {
                                        Object[] objArr27 = new Object[1];
                                        g("鉮황짱鈝攊瞪諺聟ᒒﺏϋफ龻祣颣鞿ڕ\ue046ᆀᲓ襭欦靎旭か鈄Ⱜ\ue25b묲᳞ꔂ歧∙螳㫮\uf046꒮ທ돛", -Process.getGidForName(""), objArr27);
                                        throw new o.en.f(((String) objArr27[0]).intern());
                                    }
                                    i14++;
                                }
                            }
                            arrayList.add(bVarA);
                        }
                        Iterator<o.eq.b> it = arrayList.iterator();
                        while (it.hasNext()) {
                            int i25 = f22477e + 33;
                            f22475c = i25 % 128;
                            int i26 = i25 % 2;
                            it.next().c(dVarD);
                        }
                        if (f.a()) {
                            int i27 = f22477e + 41;
                            f22475c = i27 % 128;
                            if (i27 % 2 != 0) {
                                Object[] objArr28 = new Object[1];
                                f(90 % (ExpandableListView.getPackedPositionForChild(1, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 0) == 0L ? 0 : -1)), "\u0010￡\uffc0ￍ\uffc0\u000e\u000f\t\u0014\u0001\u0003\t\f\u0010\u0010￡\u0016\r￥\u0004\u0001\u0005\u0012\u0004\u0005\u0014\u0001\u0005\u0012\u0003\uffc0\u0014\u0013\t\f\uffc0\u000e\u000f\t\u0014\u0001\u0003\t\f\u0010", true, Color.argb(0, 1, 0, 1) + 4552, 1 << (ViewConfiguration.getLongPressTimeout() - 13), objArr28);
                                strIntern2 = ((String) objArr28[0]).intern();
                            } else {
                                Object[] objArr29 = new Object[1];
                                f(44 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0010￡\uffc0ￍ\uffc0\u000e\u000f\t\u0014\u0001\u0003\t\f\u0010\u0010￡\u0016\r￥\u0004\u0001\u0005\u0012\u0004\u0005\u0014\u0001\u0005\u0012\u0003\uffc0\u0014\u0013\t\f\uffc0\u000e\u000f\t\u0014\u0001\u0003\t\f\u0010", true, Color.argb(0, 0, 0, 0) + 246, 23 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr29);
                                strIntern2 = ((String) objArr29[0]).intern();
                            }
                            f.c(strIntern4, strIntern2);
                        }
                        return arrayList;
                    } catch (IllegalArgumentException unused) {
                        if (f.a()) {
                            Object[] objArr30 = new Object[1];
                            f((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 73, "\u0011\u0014\u000f\u0003\u0016ￎￂ\ufff4\u0007\u0003\u0006\u0007\u0014ￂ\u0005\u0003\u0010\u0010\u0011\u0016ￂ\u0004\u0007ￂ\u0005\u0014\u0007\u0003\u0016\u0007\u0006\u0014\u0007\u0003\u0006\uffe7\u000f\u0018￣\u0012\u0012\u000e\u000b\u0005\u0003\u0016\u000b\u0011\u0010ￂￏￂ\ufff7\u0010\r\u0010\u0011\u0019\u0010ￂ￣\u0012\u0012\u000e\u000b\u0005\u0003\u0016\u000b\u0011\u0010ￂ￨", false, Gravity.getAbsoluteGravity(0, 0) + 244, ImageFormat.getBitsPerPixel(0) + 32, objArr30);
                            f.c(strIntern4, ((String) objArr30[0]).intern());
                        }
                        Object[] objArr31 = new Object[1];
                        f(View.MeasureSpec.makeMeasureSpec(0, 0) + 28, "\u0013\u0013\u000f\f\u0006\u0004\u0017\f\u0012\u0011ￃ￩\u0012\u0015\u0010\u0004\u0017\ufffa\u0015\u0012\u0011\nￃ￨\ufff0\ufff9ￃ￤", false, View.MeasureSpec.makeMeasureSpec(0, 0) + 243, View.getDefaultSize(0, 0) + 17, objArr31);
                        throw new o.en.f(((String) objArr31[0]).intern());
                    }
                } catch (IllegalArgumentException unused2) {
                    Object[] objArr32 = new Object[1];
                    f(TextUtils.indexOf((CharSequence) "", '0') + 29, "\u0013\u0013\u000f\f\u0006\u0004\u0017\f\u0012\u0011ￃ￩\u0012\u0015\u0010\u0004\u0017\ufffa\u0015\u0012\u0011\nￃ￨\ufff0\ufff9ￃ￤", false, 243 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 17 - ExpandableListView.getPackedPositionGroup(0L), objArr32);
                    throw new o.en.f(((String) objArr32[0]).intern());
                }
            } catch (IllegalArgumentException unused3) {
                Object[] objArr33 = new Object[1];
                g("ꅰ㰆䷝ꄧǻ鷃ໜ\ue4b0⟋ᒵ蟒涷겞鍉Ჺ\uf356㖔ਡ閶砡멡腕፪ā͒砥꠴蛾蠹\uf6adℾ࿅", 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr33);
                throw new o.en.f(((String) objArr33[0]).intern());
            }
        } catch (o.ef.b e2) {
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr34 = new Object[1];
            g("\ue830ͪ榰\ue87a쇛ꊮ⪱⒐滌⮜ꎂ궹\ue5ed걵㣢㍯糋㕏높렇\uf32e븮㜁섻䨒䜝豯䛘셽집Ԇ쿡塜劸骮咗\udef0\udb8f\u139b\uddbf嗨屰棴捝겈\ue540\ue1db\ue810⍤渀朢焲먌\uf704ﱭ\uf6cfㅨ秠畅翤蠘˯쫦", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr34);
            throw new o.en.f(sb3.append(((String) objArr34[0]).intern()).append(e2.getMessage()).toString());
        }
    }

    static void b() {
        f22473a = -1270219379;
        f22476d = 118045862465319885L;
    }

    private static void f(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $11 + 49;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            int i8 = $11 + 79;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i10 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(f22473a)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(TextUtils.indexOf("", "", 0) + 270, (char) Color.blue(0), 11 - (ViewConfiguration.getJumpTapTimeout() >> 16), -2071844881, false, $$c(b2, b3, (byte) ((b3 + 8) - (8 & b3))), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 521, (char) TextUtils.indexOf("", "", 0, 0), 12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 627984172, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 6)))), new Class[]{Object.class, Object.class});
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
            int i11 = $11 + 79;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            int i13 = $10 + 87;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 521, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 12 - View.MeasureSpec.makeMeasureSpec(0, 0), 627984172, false, $$c(b6, b7, (byte) (6 | b7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void g(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 89;
        $10 = i4 % 128;
        Object obj = null;
        Object charArray = str2;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        k kVar = new k();
        char[] cArrC = k.c(f22476d ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i5 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f22476d)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 228, (char) (51004 - KeyEvent.getDeadChar(0, 0)), 8 - TextUtils.lastIndexOf("", '0', 0), 1749983833, false, $$c(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i5] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 674, (char) (ViewConfiguration.getScrollBarSize() >> 8), '<' - AndroidCharacter.getMirror('0'), 522683165, false, $$c(b4, b5, (byte) ((b5 + 7) - (7 & b5))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i6 = $10 + 31;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str3 = new String(cArrC, 4, cArrC.length - 4);
        int i8 = $11 + 59;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        objArr[0] = str3;
    }

    static void init$0() {
        $$a = new byte[]{85, MessagePack.Code.BIN32, -28, 50};
        $$b = 36;
    }
}
