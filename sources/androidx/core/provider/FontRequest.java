package androidx.core.provider;

import androidx.core.util.Preconditions;
import com.dynatrace.android.agent.Global;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public final class FontRequest {
    private final List<List<byte[]>> mCertificates;
    private final int mCertificatesArray;
    private final String mIdentifier;
    private final String mProviderAuthority;
    private final String mProviderPackage;
    private final String mQuery;

    public FontRequest(String str, String str2, String str3, List<List<byte[]>> list) {
        this.mProviderAuthority = (String) Preconditions.checkNotNull(str);
        this.mProviderPackage = (String) Preconditions.checkNotNull(str2);
        this.mQuery = (String) Preconditions.checkNotNull(str3);
        this.mCertificates = (List) Preconditions.checkNotNull(list);
        this.mCertificatesArray = 0;
        this.mIdentifier = createIdentifier(str, str2, str3);
    }

    public FontRequest(String str, String str2, String str3, int i2) {
        this.mProviderAuthority = (String) Preconditions.checkNotNull(str);
        this.mProviderPackage = (String) Preconditions.checkNotNull(str2);
        this.mQuery = (String) Preconditions.checkNotNull(str3);
        this.mCertificates = null;
        Preconditions.checkArgument(i2 != 0);
        this.mCertificatesArray = i2;
        this.mIdentifier = createIdentifier(str, str2, str3);
    }

    private String createIdentifier(String str, String str2, String str3) {
        return str + Global.HYPHEN + str2 + Global.HYPHEN + str3;
    }

    public String getProviderAuthority() {
        return this.mProviderAuthority;
    }

    public String getProviderPackage() {
        return this.mProviderPackage;
    }

    public String getQuery() {
        return this.mQuery;
    }

    public List<List<byte[]>> getCertificates() {
        return this.mCertificates;
    }

    public int getCertificatesArrayResId() {
        return this.mCertificatesArray;
    }

    @Deprecated
    public String getIdentifier() {
        return this.mIdentifier;
    }

    String getId() {
        return this.mIdentifier;
    }

    public String toString() throws Throwable {
        StringBuilder sb = new StringBuilder();
        sb.append(ZO.xd("7#kTJ:c\u0012$;lXz\u0014C}s+^\u001c&q'q$3Bw5KZ,)", (short) (FB.Xd() ^ 27866), (short) (FB.Xd() ^ 17680)) + this.mProviderAuthority + C1626yg.Ud("0{I(,V\u0007Uxva\u001f[,=\u001fqv6F", (short) (FB.Xd() ^ 16557), (short) (FB.Xd() ^ 29849)) + this.mProviderPackage + Ig.wd("@l,g#f\u0010&\t!", (short) (C1499aX.Xd() ^ (-27372))) + this.mQuery + EO.Od("\u00152.,7!vL\u0018/#C! yb", (short) (ZN.Xd() ^ 20992)));
        for (int i2 = 0; i2 < this.mCertificates.size(); i2++) {
            sb.append(C1561oA.Qd("w2", (short) (Od.Xd() ^ (-6955))));
            List<byte[]> list = this.mCertificates.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                short sXd = (short) (C1607wl.Xd() ^ 15643);
                short sXd2 = (short) (C1607wl.Xd() ^ 29297);
                int[] iArr = new int["/2".length()];
                QB qb = new QB("/2");
                int i4 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i4] = xuXd.fK((xuXd.CK(iKK) - (sXd + i4)) - sXd2);
                    i4++;
                }
                sb.append(new String(iArr, 0, i4));
                Object[] objArr = {list.get(i3), 0};
                Method declaredMethod = Class.forName(C1561oA.od("KWLYUNH\u0011WUIK\f\u001f=N?\u000f\f", (short) (C1580rY.Xd() ^ (-19155)))).getDeclaredMethod(C1561oA.Kd("`j`mceUqVxwouo", (short) (C1499aX.Xd() ^ (-30959))), byte[].class, Integer.TYPE);
                try {
                    declaredMethod.setAccessible(true);
                    sb.append((String) declaredMethod.invoke(null, objArr));
                    sb.append(Wg.Zd("@", (short) (Od.Xd() ^ (-21189)), (short) (Od.Xd() ^ (-25256))));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            sb.append(C1561oA.Xd("2p", (short) (C1580rY.Xd() ^ (-17408))));
        }
        sb.append(Wg.vd("\u0016", (short) (OY.Xd() ^ 21319)));
        sb.append(Qg.kd("F\u001b<HI=9;41C3@\r=<*A\u0001e", (short) (OY.Xd() ^ 26338), (short) (OY.Xd() ^ 11677)) + this.mCertificatesArray);
        return sb.toString();
    }
}
