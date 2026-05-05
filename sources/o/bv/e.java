package o.bv;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.huawei.hms.api.HuaweiServicesNotAvailableException;
import com.huawei.hms.api.HuaweiServicesRepairableException;
import com.huawei.hms.security.SecComponentInstallWizard;
import java.lang.reflect.Method;
import o.a.k;
import o.ea.f;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f21731a = 0;

    /* JADX INFO: renamed from: b */
    private static int f21732b = 0;

    /* JADX INFO: renamed from: c */
    private static int f21733c = 0;

    /* JADX INFO: renamed from: d */
    private static int f21734d = 0;

    /* JADX INFO: renamed from: e */
    private static long f21735e = 0;

    private static String $$c(short s2, byte b2, int i2) {
        int i3 = (s2 * 7) + 107;
        int i4 = 3 - (b2 * 3);
        byte[] bArr = $$a;
        int i5 = i2 * 2;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = i5 + i4;
            i4 = i4;
        }
        while (true) {
            i6++;
            int i7 = i4 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i7];
            i4 = i7;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21733c = 0;
        f21734d = 1;
        f21731a = 0;
        f21732b = 1;
        c();
        ViewConfiguration.getMinimumFlingVelocity();
        int i2 = f21734d + 37;
        f21733c = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 35 / 0;
        }
    }

    static void c() {
        f21735e = 4585748814138774883L;
    }

    private static void f(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i4 = $10 + 39;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f21735e ^ (-5882309809461882246L), (char[]) obj, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i6 = $10 + 99;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i8 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f21735e)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(229 - View.MeasureSpec.getMode(0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 51003), 9 - Drawable.resolveOpacity(0, 0), 1749983833, false, $$c(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 1;
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(Process.getGidForName("") + 676, (char) TextUtils.getOffsetBefore("", 0), 12 - Drawable.resolveOpacity(0, 0), 522683165, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrC, 4, cArrC.length - 4);
    }

    static void init$0() {
        $$a = new byte[]{83, -90, 91, 36};
        $$b = 86;
    }

    @Override // o.bv.b
    public final i a(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21731a + 67;
        f21732b = i3 % 128;
        int i4 = i3 % 2;
        o.ea.c.a();
        int iN = o.ea.b.n(context);
        i iVar = iN != 0 ? iN != 1 ? iN != 2 ? iN != 3 ? iN != 9 ? iN != 21 ? i.f21760g : i.f21762j : i.f21754a : i.f21756c : i.f21758e : i.f21760g : i.f21755b;
        if (f.a()) {
            Object[] objArr = new Object[1];
            f("ᒒᓚ⊓ꗿ\uf88a\uf6d9◙\u0893냥۫퉑ĥⰸ᩷븜纓䇭租鮦嫤敫崵蜭뙍餩낁擿鎿뺸铸䁩輥퉋", -TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            f("ቂሥꐡ⍝\uec82\ue2c4\uaad3๒㿋聁왠踑⫹鲜ꩂ\uf1f8", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(iVar).toString());
        }
        int i5 = f21732b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f21731a = i5 % 128;
        int i6 = i5 % 2;
        return iVar;
    }

    @Override // o.bv.b
    public final void c(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21732b + 73;
        f21731a = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                SecComponentInstallWizard.install(context);
            } else {
                SecComponentInstallWizard.install(context);
                throw null;
            }
        } catch (HuaweiServicesNotAvailableException | HuaweiServicesRepairableException e2) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                f("ᒒᓚ⊓ꗿ\uf88a\uf6d9◙\u0893냥۫퉑ĥⰸ᩷븜纓䇭租鮦嫤敫崵蜭뙍餩낁擿鎿뺸铸䁩輥퉋", (Process.myPid() >> 22) + 1, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f("⟺➊Ჿ鯔认藳⭦㯿빝㣛ꅗ࿒\u1f1f␕촻瀶犵䟴\ue88a呞嘃挒\uf408뢦꩹躱៧鴌趂\uaad0㍞膚\ue127홵弣\ue234쒽\uf1cd窒왓\ud808ᴠ虱⫷㰲㢦ꇛ།ῃⓃ춳玾猳䀽\ue936埔嚁掏\uf48b롦ꫧ輷", 1 - KeyEvent.normalizeMetaState(0), objArr2);
                f.e(strIntern, ((String) objArr2[0]).intern(), e2);
                int i4 = f21731a + 47;
                f21732b = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 / 4;
                }
            }
        }
    }

    @Override // o.bv.b
    public final String e() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f21731a + 37;
        f21732b = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            f("ᒒᓚ⊓ꗿ\uf88a\uf6d9◙\u0893냥۫퉑ĥⰸ᩷븜纓䇭租鮦嫤敫崵蜭뙍餩낁擿鎿뺸铸䁩輥퉋", -TextUtils.indexOf((CharSequence) "", (char) 30), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            f("ᒒᓚ⊓ꗿ\uf88a\uf6d9◙\u0893냥۫퉑ĥⰸ᩷븜纓䇭租鮦嫤敫崵蜭뙍餩낁擿鎿뺸铸䁩輥퉋", -TextUtils.indexOf((CharSequence) "", '0'), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }
}
