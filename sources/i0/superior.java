package i0;

import i1.gregarious;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public final class superior {

    /* JADX INFO: renamed from: a */
    public final String f19703a;

    /* JADX INFO: renamed from: b */
    public final apparatus f19704b;

    /* JADX INFO: renamed from: c */
    public final String f19705c;

    /* JADX INFO: renamed from: d */
    public final String f19706d;

    public superior(Certificate certificate) throws Throwable {
        String name;
        short sXd = (short) (C1633zX.Xd() ^ (-13561));
        int[] iArr = new int["{q\u0006oC\bxu\u000f\u000b\u0001\u000b\u0017J~\u007fst-Ajvwkoqjg\u0002q".length()];
        QB qb = new QB("{q\u0006oC\bxu\u000f\u000b\u0001\u000b\u0017J~\u007fst-Ajvwkoqjg\u0002q");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Qg.kd("UR`0XLWKKI", (short) (ZN.Xd() ^ 24206), (short) (ZN.Xd() ^ 27897)), new Class[0]);
        try {
            method.setAccessible(true);
            String strJoinToString$default = ArraysKt.joinToString$default(MessageDigest.getInstance(hg.Vd("9-%\u0010\u0014\u0016\u0016", (short) (ZN.Xd() ^ 16914), (short) (ZN.Xd() ^ 29036))).digest((byte[]) method.invoke(certificate, objArr)), (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) gregarious.f19716a, 30, (Object) null);
            apparatus apparatusVar = apparatus.f19688a;
            boolean z2 = certificate instanceof X509Certificate;
            String name2 = "";
            if (z2) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.ud(" \u0016*\u0014_$\u0015\u0012#\u001f\u0015\u001f#V\u000b\f\u0018\u0019QzVPXa\u0003\u000f\u0010\u0004\u007f\u0002zw\ny", (short) (C1633zX.Xd() ^ (-847)))).getMethod(C1561oA.yd("QN\\0YXYHT9\u0015\u000f\u000e-NDh\\agWa", (short) (C1607wl.Xd() ^ 12085)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    name = ((X500Principal) method2.invoke(x509Certificate, objArr2)).getName();
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else {
                name = "";
            }
            if (z2) {
                X509Certificate x509Certificate2 = (X509Certificate) certificate;
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1561oA.Yd("vn\u0005p>\u0005wv\n\b\u007f\f\u0012G}\u0001\u000f\u0012LwUQ[f\n\u0018\u001b\u0011\u000f\u0013\u000e\r!\u0013", (short) (OY.Xd() ^ 25048))).getMethod(Xg.qd("\u0019\u0018(\b+\u0019\"\u001e\u001d/\u0014qmn\u00103+1'.6(4", (short) (C1633zX.Xd() ^ (-15281)), (short) (C1633zX.Xd() ^ (-31831))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    name2 = ((X500Principal) method3.invoke(x509Certificate2, objArr3)).getName();
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            this.f19703a = strJoinToString$default;
            this.f19704b = apparatusVar;
            this.f19705c = name;
            this.f19706d = name2;
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof superior)) {
            return false;
        }
        superior superiorVar = (superior) obj;
        return Intrinsics.areEqual(this.f19703a, superiorVar.f19703a) && this.f19704b == superiorVar.f19704b && Intrinsics.areEqual(this.f19705c, superiorVar.f19705c) && Intrinsics.areEqual(this.f19706d, superiorVar.f19706d);
    }

    public final int hashCode() {
        return this.f19706d.hashCode() + d0.superior.a(this.f19705c, (this.f19704b.hashCode() + (this.f19703a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "CertificateDetail(fingerprint=" + this.f19703a + ", fingerprintAlgorithm=" + this.f19704b + ", issuerDN=" + this.f19705c + ", subjectDN=" + this.f19706d + ")";
    }
}
