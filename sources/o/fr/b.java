package o.fr;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.a.k;
import o.d.d;
import o.ea.f;
import o.ea.m;
import o.ef.a;
import o.m.i;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26130b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f26131d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f26132f = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f26133i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f26134j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26135a = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26137e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<i, Boolean> f26136c = new HashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, short r10, byte r11) {
        /*
            int r0 = r11 * 2
            int r8 = 4 - r0
            byte[] r7 = o.fr.b.$$a
            int r6 = r9 * 2
            int r1 = r6 + 1
            int r0 = r10 * 7
            int r5 = 114 - r0
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r7 != 0) goto L2b
            r5 = r6
            r2 = r8
            r0 = r3
        L16:
            int r5 = r5 + r8
            int r8 = r2 + 1
        L19:
            byte r1 = (byte) r5
            r4[r0] = r1
            if (r0 != r6) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            r1 = r7[r8]
            int r0 = r0 + 1
            r2 = r8
            r8 = r1
            goto L16
        L2b:
            r0 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fr.b.$$c(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26134j = 0;
        f26133i = 1;
        f26130b = 0;
        f26132f = 1;
        a();
        TextUtils.getTrimmedLength("");
        SystemClock.uptimeMillis();
        SystemClock.elapsedRealtimeNanos();
        Color.red(0);
        Process.getGidForName("");
        View.resolveSize(0, 0);
        int i2 = f26133i + 67;
        f26134j = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void a() {
        f26131d = 783700097676848916L;
    }

    private void d(a aVar) throws o.ef.b {
        int i2 = 2 % 2;
        int i3 = f26132f + 65;
        f26130b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = a.f23769c * (-1989011043);
        a.f23769c = i5;
        int i6 = a.f23776j * 720337855;
        a.f23776j = i6;
        int i7 = a.f23775i * 253749855;
        a.f23775i = i7;
        int i8 = a.f23774h * 1380085454;
        a.f23774h = i8;
        Iterator it = (Iterator) a.a(1890943914, new Object[]{aVar}, i7, i8, -1890943912, i5, i6);
        while (it.hasNext()) {
            int i9 = f26132f + 101;
            f26130b = i9 % 128;
            if (i9 % 2 != 0) {
                String str = (String) it.next();
                this.f26136c.put((i) m.a(i.class, str), aVar.h(str));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str2 = (String) it.next();
            this.f26136c.put((i) m.a(i.class, str2), aVar.h(str2));
        }
    }

    private void e(a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = a.f23769c * (-1989011043);
        a.f23769c = i3;
        int i4 = a.f23776j * 720337855;
        a.f23776j = i4;
        int i5 = a.f23775i * 253749855;
        a.f23775i = i5;
        int i6 = a.f23774h * 1380085454;
        a.f23774h = i6;
        Iterator it = (Iterator) a.a(1890943914, new Object[]{aVar}, i5, i6, -1890943912, i3, i4);
        int i7 = f26132f + 125;
        f26130b = i7 % 128;
        int i8 = i7 % 2;
        while (it.hasNext()) {
            int i9 = f26132f + 9;
            f26130b = i9 % 128;
            if (i9 % 2 != 0) {
                ((String) it.next()).hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = (String) it.next();
            int iHashCode = str.hashCode();
            byte b2 = -1;
            if (iHashCode == 2658) {
                Object[] objArr = new Object[1];
                g("웓욀階ꮵ㬠宥", ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr);
                if (str.equals(((String) objArr[0]).intern())) {
                    b2 = 1;
                }
            } else if (iHashCode == 69551) {
                Object[] objArr2 = new Object[1];
                g("疯痩\ue736텪\uda1fꯦ馱", 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
                if (str.equals(((String) objArr2[0]).intern())) {
                    int i10 = f26132f + 63;
                    f26130b = i10 % 128;
                    int i11 = i10 % 2;
                    b2 = 2;
                }
            } else if (iHashCode == 79221) {
                Object[] objArr3 = new Object[1];
                g("ܻݫﰿ嘔섘Ⲇﾚ", KeyEvent.getDeadChar(0, 0), objArr3);
                if (str.equals(((String) objArr3[0]).intern())) {
                    int i12 = f26130b + 19;
                    f26132f = i12 % 128;
                    int i13 = i12 % 2;
                    b2 = 3;
                }
            } else if (iHashCode == 2402104) {
                g("쉓숝騃끿Ꜣᯔ쫭ꏛ", ExpandableListView.getPackedPositionGroup(0L), new Object[1]);
                if (!(!str.equals(((String) r1[0]).intern()))) {
                    b2 = 0;
                }
            }
            if (b2 == 0) {
                this.f26136c.put(i.f26500i, aVar.h(str));
            } else if (b2 == 1) {
                this.f26136c.put(i.f26493a, aVar.h(str));
            } else if (b2 == 2) {
                this.f26136c.put(i.f26494b, aVar.h(str));
            } else if (b2 == 3) {
                this.f26136c.put(i.f26495c, aVar.h(str));
            }
        }
    }

    private static void g(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 9;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
            charArray = str2 != null ? str2.toCharArray() : str2;
        } else {
            if (str2 != null) {
            }
        }
        k kVar = new k();
        char[] cArrC = k.c(f26131d ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (true) {
            obj = null;
            if (kVar.f19939c >= cArrC.length) {
                break;
            }
            int i6 = $10 + 41;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i8 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f26131d)};
                Object objA = d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objA = d.a(229 - View.resolveSize(0, 0), (char) (51004 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 9 - View.resolveSize(0, 0), 1749983833, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = d.a(675 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 12 - (ViewConfiguration.getEdgeSlop() >> 16), 522683165, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        String str3 = new String(cArrC, 4, cArrC.length - 4);
        int i9 = $11 + 57;
        $10 = i9 % 128;
        if (i9 % 2 == 0) {
            objArr[0] = str3;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    static void init$0() {
        $$a = new byte[]{117, -6, 58, MessagePack.Code.MAP32};
        $$b = 67;
    }

    final void b() {
        int i2 = 2 % 2;
        int i3 = f26132f + 81;
        f26130b = i3 % 128;
        int i4 = i3 % 2;
        this.f26137e = false;
    }

    public final void b(a aVar) throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f26130b + 101;
            f26132f = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            g("硢砣蚗\udefd뮌Ꝍ趿ꑕ裄Ὦ풵넅鍱錳쉭벽餥ꕴ\uf81c虹껶꾪\uf586造뒪뇸\ue344鯪멗䑀餜斚쀉亟雂", View.resolveSizeAndState(0, 0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            g("\uef1b\uef69級萛䀑㣀᫊ﺦ獙胮蹕⻌І梪颞⌼\u0e5c廣ꊂ\u19cc㦉吺꽼ྡ⏱䩲림ѯ\u2d2e뿜", ViewConfiguration.getFadingEdgeLength() >> 16, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (f.a()) {
            Object[] objArr3 = new Object[1];
            g("硢砣蚗\udefd뮌Ꝍ趿ꑕ裄Ὦ풵넅鍱錳쉭벽餥ꕴ\uf81c虹껶꾪\uf586造뒪뇸\ue344鯪멗䑀餜斚쀉亟雂", 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr4 = new Object[1];
            g("觊覧脌팽밇\uf01f簝ꦕ轅䠽\ud921\ue64f拈钼쾿\uebe2梐ꋴ\uf5ff턬彏\ua83a\uf809읽䔡뙮\uee8f쳿䯼䏐铕㋂㇢䥋魑", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, objArr4);
            f.c(strIntern2, sb.append(((String) objArr4[0]).intern()).append(aVar.e()).toString());
        }
        Object[] objArr5 = new Object[1];
        g("臿膉롈搅蕃氅琮ẫ똊퐼湑", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr5);
        Object[] objArr6 = {aVar, ((String) objArr5[0]).intern(), 1};
        int priority = Thread.currentThread().getPriority();
        int i5 = a.f23777k * (-845283131);
        a.f23777k = i5;
        int iIntValue = ((Integer) a.a(1647814368, objArr6, (int) SystemClock.uptimeMillis(), (int) Thread.currentThread().getId(), -1647814363, priority, i5)).intValue();
        Object[] objArr7 = new Object[1];
        g("臿膉롈搅蕃氅琮ẫ똊퐼湑", ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr7);
        aVar.b(((String) objArr7[0]).intern());
        if (iIntValue >= 2) {
            d(aVar);
            int i6 = f26132f + 95;
            f26130b = i6 % 128;
            int i7 = i6 % 2;
        } else {
            e(aVar);
            int i8 = f26132f + 53;
            f26130b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 / 4;
            }
        }
        if (iIntValue < 3) {
            int i10 = f26130b + 53;
            f26132f = i10 % 128;
            int i11 = i10 % 2;
            this.f26135a = true;
        }
    }

    public final boolean b(i iVar) {
        int i2 = 2 % 2;
        Boolean bool = this.f26136c.get(iVar);
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!this.f26135a) {
            int i3 = f26132f + 43;
            f26130b = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = f26130b + 87;
        f26132f = i5 % 128;
        int i6 = i5 % 2;
        e(iVar, true);
        return true;
    }

    public final void c() {
        int i2 = 2 % 2;
        int i3 = f26130b + 75;
        f26132f = i3 % 128;
        int i4 = i3 % 2;
        this.f26136c.clear();
        int i5 = f26130b + 23;
        f26132f = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
    }

    final boolean d() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f26130b + 99;
        int i4 = i3 % 128;
        f26132f = i4;
        if (i3 % 2 == 0) {
            z2 = this.f26137e;
            int i5 = 40 / 0;
        } else {
            z2 = this.f26137e;
        }
        int i6 = i4 + 101;
        f26130b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 76 / 0;
        }
        return z2;
    }

    final a e() throws Throwable {
        int i2 = 2 % 2;
        a aVar = new a();
        for (Map.Entry<i, Boolean> entry : this.f26136c.entrySet()) {
            int i3 = f26130b + 53;
            f26132f = i3 % 128;
            int i4 = i3 % 2;
            aVar.a(entry.getKey().toString(), entry.getValue());
        }
        Object[] objArr = new Object[1];
        g("臿膉롈搅蕃氅琮ẫ똊퐼湑", ViewConfiguration.getPressedStateDuration() >> 16, objArr);
        aVar.c(((String) objArr[0]).intern(), 3);
        int i5 = f26130b + 69;
        f26132f = i5 % 128;
        if (i5 % 2 != 0) {
            return aVar;
        }
        throw null;
    }

    public final void e(i iVar, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f26132f + 107;
        f26130b = i3 % 128;
        if (i3 % 2 != 0) {
            this.f26137e = false;
        } else {
            this.f26137e = true;
        }
        this.f26136c.put(iVar, Boolean.valueOf(z2));
        int i4 = f26130b + 25;
        f26132f = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
    }
}
