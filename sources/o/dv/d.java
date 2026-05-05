package o.dv;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.k;
import o.dw.b;
import o.ea.g;
import o.eh.e;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: d */
    private static long f23380d = 0;

    /* JADX INFO: renamed from: f */
    private static int f23381f = 0;

    /* JADX INFO: renamed from: i */
    private static int f23382i = 0;

    /* JADX INFO: renamed from: a */
    private final Map<String, String> f23383a;

    /* JADX INFO: renamed from: b */
    private final String f23384b;

    /* JADX INFO: renamed from: c */
    private final String f23385c;

    /* JADX INFO: renamed from: e */
    private final String f23386e;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, int r10, byte r11) {
        /*
            byte[] r8 = o.dv.d.$$a
            int r0 = r11 * 7
            int r7 = 114 - r0
            int r1 = r9 + 4
            int r0 = r10 * 2
            int r6 = 1 - r0
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r8 != 0) goto L2a
            r0 = r1
            r7 = r6
            r3 = r4
        L14:
            int r1 = r1 + r7
            r2 = r3
            r7 = r1
            r1 = r0
        L18:
            int r0 = r1 + 1
            int r3 = r2 + 1
            byte r1 = (byte) r7
            r5[r2] = r1
            if (r3 != r6) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            r1 = r8[r0]
            goto L14
        L2a:
            r2 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dv.d.$$c(byte, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23382i = 0;
        f23381f = 1;
        f23380d = -5202565067313661210L;
    }

    public d(String str) {
        this(str, new HashMap(0));
    }

    private d(String str, Map<String, String> map) {
        this.f23385c = str;
        this.f23383a = map;
        this.f23386e = o.dl.d.e(e.a(str.getBytes(g.c())));
        this.f23384b = d(str);
    }

    private static String d(String str) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        g("䋩䡈䊵惺\ued3b밫箘Ȑ\ue0ca茿侰柰ؽ╉⨚씈", Color.argb(0, 0, 0, 0), objArr);
        Matcher matcher = Pattern.compile(((String) objArr[0]).intern()).matcher(str);
        if (!matcher.find()) {
            return null;
        }
        int i3 = f23382i + 35;
        f23381f = i3 % 128;
        int i4 = i3 % 2;
        if (matcher.groupCount() != 1) {
            return null;
        }
        int i5 = f23382i + 3;
        f23381f = i5 % 128;
        int i6 = i5 % 2;
        String lowerCase = matcher.group(1).toLowerCase(Locale.US);
        int i7 = f23381f + 7;
        f23382i = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 98 / 0;
        }
        return lowerCase;
    }

    private static void g(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 83;
        int i5 = i4 % 128;
        $11 = i5;
        int i6 = i4 % 2;
        if (str2 != null) {
            int i7 = i5 + 117;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f23380d ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i8 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f23380d)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objA = o.d.d.a(229 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (51004 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 9 - Drawable.resolveOpacity(0, 0), 1749983833, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a((ViewConfiguration.getTapTimeout() >> 16) + 675, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), Process.getGidForName("") + 13, 522683165, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        $$a = new byte[]{34, -117, -98, -86};
        $$b = 189;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f23382i;
        int i4 = i3 + 37;
        f23381f = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f23384b;
        int i6 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f23381f = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f23381f + 21;
        int i4 = i3 % 128;
        f23382i = i4;
        int i5 = i3 % 2;
        String str = this.f23385c;
        int i6 = i4 + 105;
        f23381f = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Map<String, String> c() {
        int i2 = 2 % 2;
        int i3 = f23382i;
        int i4 = i3 + 17;
        f23381f = i4 % 128;
        int i5 = i4 % 2;
        Map<String, String> map = this.f23383a;
        int i6 = i3 + 3;
        f23381f = i6 % 128;
        int i7 = i6 % 2;
        return map;
    }

    @Override // o.dv.c
    public final o.dw.c d() {
        int i2 = 2 % 2;
        b bVar = new b(this);
        int i3 = f23382i + 57;
        f23381f = i3 % 128;
        int i4 = i3 % 2;
        return bVar;
    }

    @Override // o.dv.c
    public final String e() {
        int i2 = 2 % 2;
        int i3 = f23382i;
        int i4 = i3 + 71;
        f23381f = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f23386e;
        int i6 = i3 + 75;
        f23381f = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 34 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f23382i + 71;
        f23381f = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        boolean zEquals = this.f23385c.equals(((d) obj).f23385c);
        int i4 = f23381f + 79;
        f23382i = i4 % 128;
        if (i4 % 2 == 0) {
            return zEquals;
        }
        obj2.hashCode();
        throw null;
    }

    public final String toString() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        g("䛉㓩䚁ᰁ\ud918衔쟗빳\ue4caﾷ箙\udbfeɆ姡ḩ礱ꇼ㭶낳Ꚇ콻蛖勉쐐檖恐\uf54e憰蠌쎮韥过㟤굢", Color.red(0), objArr);
        StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(this.f23386e).append('\'');
        Object[] objArr2 = new Object[1];
        g("\uee10逸\uee3c튙싹鎴\uf4a1贇䰌ㄔ总", Drawable.resolveOpacity(0, 0), objArr2);
        StringBuilder sbAppend2 = sbAppend.append(((String) objArr2[0]).intern()).append(this.f23385c).append('\'');
        Object[] objArr3 = new Object[1];
        g("\ue32a覍\ue306ꄱ宫ૻ\u1cfd敌䄻䋥虜Ëꞹ\ue4cc", ((byte) KeyEvent.getModifierMetaStateMask()) + 1, objArr3);
        String string = sbAppend2.append(((String) objArr3[0]).intern()).append(this.f23383a).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f23381f + 79;
        f23382i = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
