package o.ea;

import android.content.Intent;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.util.AndroidActivityResultCallback;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements a<AndroidActivityResultCallback> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f23548a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f23549c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f23550e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f23551f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char f23552g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23553h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f23554i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23555j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Integer, e> f23557d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23556b = false;

    public interface e {
        void onActivityResult(int i2, Intent intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, short r9, byte r10) {
        /*
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r7 = r9 + 4
            int r0 = r10 * 3
            int r6 = r0 + 69
            byte[] r5 = o.ea.j.$$a
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r5 != 0) goto L29
            r1 = r3
            r0 = r7
        L13:
            int r7 = r7 + r6
            r2 = r1
            r6 = r7
            r7 = r0
        L17:
            int r0 = r7 + 1
            byte r1 = (byte) r6
            r4[r2] = r1
            int r1 = r2 + 1
            if (r2 != r8) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L26:
            r7 = r5[r0]
            goto L13
        L29:
            r2 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ea.j.$$c(int, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23555j = 0;
        f23554i = 1;
        f23551f = 0;
        f23553h = 1;
        a();
        Color.red(0);
        int i2 = f23555j + 29;
        f23554i = i2 % 128;
        int i3 = i2 % 2;
    }

    static void a() {
        f23548a = (char) 39206;
        f23549c = (char) 45409;
        f23550e = (char) 1099;
        f23552g = (char) 51738;
    }

    static void init$0() {
        $$a = new byte[]{97, 52, 124, MessagePack.Code.EXT16};
        $$b = 145;
    }

    private static void k(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        char c2 = 2;
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i4 = $11 + 11;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.g gVar = new o.a.g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                char c3 = cArr3[1];
                char c4 = cArr3[0];
                int i8 = (c4 + i6) ^ ((c4 << 4) + ((char) (((long) f23550e) ^ (-7511683281764982996L))));
                int i9 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f23552g);
                    objArr2[c2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a(269 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (Process.myPid() >> 22), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, -1995022631, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) f23548a) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f23549c)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a(270 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 12 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1995022631, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    c2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[gVar.f19924d] = cArr3[0];
            cArr2[gVar.f19924d + 1] = cArr3[1];
            Object[] objArr4 = {gVar, gVar};
            Object objA3 = o.d.d.a(1390051551);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = (byte) (b6 - 1);
                objA3 = o.d.d.a(Color.red(0) + 270, (char) ExpandableListView.getPackedPositionGroup(0L), 11 - Color.blue(0), -2074123590, false, $$c(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            int i10 = $11 + 75;
            $10 = i10 % 128;
            c2 = 2;
            int i11 = i10 % 2;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public final AndroidActivityResultCallback b() {
        int i2 = 2 % 2;
        AndroidActivityResultCallback androidActivityResultCallback = new AndroidActivityResultCallback(this);
        int i3 = f23553h + 17;
        f23551f = i3 % 128;
        if (i3 % 2 == 0) {
            return androidActivityResultCallback;
        }
        throw null;
    }

    public final boolean b(int i2, int i3, Intent intent) throws Throwable {
        int i4 = 2 % 2;
        int i5 = f23553h + 49;
        f23551f = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (this.f23556b) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                k("\uf204蕽؋痍栐硉壘ﬥ篇䗂ዶᑃ篼撣⬨鿡ખ歁꼄䇺꾷塴厲管\ue76c怊朽᱘䆁ﺃ吳\udd82効⡎", ((Process.getThreadPriority(0) + 20) >> 6) + 34, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                k("螉咘篼撣⬨鿡ખ歁꼄䇺꾷塴厲管\ue76c怊䚝톺꯵엚峯㓦ꪝ萻ꅡ븝蹜\ue25d篇䗂쮲灁孡傌", 34 - TextUtils.getOffsetBefore("", 0), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            return false;
        }
        for (Map.Entry<Integer, e> entry : this.f23557d.entrySet()) {
            int i6 = f23551f + 27;
            f23553h = i6 % 128;
            int i7 = i6 % 2;
            if (i2 == entry.getKey().intValue()) {
                if (f.a()) {
                    Object[] objArr3 = new Object[1];
                    k("\uf204蕽؋痍栐硉壘ﬥ篇䗂ዶᑃ篼撣⬨鿡ખ歁꼄䇺꾷塴厲管\ue76c怊朽᱘䆁ﺃ吳\udd82効⡎", 34 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    k("螉咘篼撣⬨鿡ખ歁꼄䇺꾷塴厲管\ue76c怊䚝톺윰㨔⧚Შ\uebdd\udc8bꙂ果辣줯溺ꋅ駇ས䆁ﺃ吳\udd82効⡎奏䔠䷂㎱壘ﬥ", (ViewConfiguration.getPressedStateDuration() >> 16) + 44, objArr4);
                    f.c(strIntern2, ((String) objArr4[0]).intern());
                }
                entry.getValue().onActivityResult(i3, intent);
                this.f23556b = true;
                int i8 = f23551f + 47;
                f23553h = i8 % 128;
                int i9 = i8 % 2;
                return true;
            }
        }
        return false;
    }

    @Override // o.ea.a
    public final /* synthetic */ AndroidActivityResultCallback e() {
        int i2 = 2 % 2;
        int i3 = f23553h + 63;
        f23551f = i3 % 128;
        int i4 = i3 % 2;
        AndroidActivityResultCallback androidActivityResultCallbackB = b();
        int i5 = f23553h + 19;
        f23551f = i5 % 128;
        if (i5 % 2 == 0) {
            return androidActivityResultCallbackB;
        }
        throw null;
    }

    public final void e(Integer num, e eVar) {
        int i2 = 2 % 2;
        int i3 = f23553h + 41;
        f23551f = i3 % 128;
        if (i3 % 2 == 0) {
            this.f23557d.put(num, eVar);
        } else {
            this.f23557d.put(num, eVar);
            int i4 = 93 / 0;
        }
    }
}
