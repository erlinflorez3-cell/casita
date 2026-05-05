package okhttp3.internal.tls;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.Xg;
import yg.ZO;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004O\u00158\u000bDB\u0007\"2\u0012\u007f\u0007t\rA0ZeP.`s2şs{B-cҕyCI٥\"}(\nWNumvϺpŏs\u000f4\u00159\u0002<Ycxu\u001a\u001f6HnO3{qk:\u0001td\u0007ڶ6\"F|M\u0012(2`\u0010%\u0004sQ\u001a\u001cHB\u00079\u0001\u0018\u0014Ŀ\u001aZ\u0016L,\u0019 rf|8xpkGG#1k\tboe>\u000be\rtcm!G\u007f,/XIE\u00175S1\rbcO\tOsM\u0005\u0017)U2wx.̯Zÿ\u0018\u00153˽վa\u0003"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI7\u0003NJs\u0013Us\f+\u00045Chj*A|y7LCNA", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI7\u0003NJ\u0006$W}\u001d)\u0001/D=\u0007\u001f7\u0001k", "1`22e;L", "", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R-e\r7E3Paj%o\u001bKz&9Wy/7C", "uZ;7T=:\u001d'~xn9\u0001\u0018C/}(\tOJ\nf\u0012Ck<\u000449Z\u0002\u001e3|\u0016\u0004\u00114", "AtQ7X*MB#\\v<,\n\u0018=", "", "\u001aiPCT?\ba\u0019|\u000bk0\f\u001dxa\u00107~\n\u0014fa\u00129\u0001\fAo f\u0002)5q!*T\u0019", "", "3pd._:", "", "=sW2e", "", "4h]15@\"a'\u000fzk\b\u0006\b\u001di\u00021wO\u0011$\u0017", "1daA", "6`b566=S", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BasicTrustRootIndex implements TrustRootIndex {
    private final Map<X500Principal, Set<X509Certificate>> subjectToCaCerts;

    public BasicTrustRootIndex(X509Certificate... x509CertificateArr) throws Throwable {
        Intrinsics.checkNotNullParameter(x509CertificateArr, C1561oA.yd("'&\u0005(251", (short) (C1607wl.Xd() ^ 1356)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Yd("YQgS!gZYljbnt*`cqt/Z84>Ilz}squpo\u0004u", (short) (C1580rY.Xd() ^ (-1201)))).getMethod(Xg.qd("ON^>aOXTSeJ($%Fiag]dl^j", (short) (FB.Xd() ^ 1901), (short) (FB.Xd() ^ 21856)), new Class[0]);
            try {
                method.setAccessible(true);
                X500Principal x500Principal = (X500Principal) method.invoke(x509Certificate, objArr);
                Intrinsics.checkNotNullExpressionValue(x500Principal, Jg.Wd("ZRH\u0010UtR\n3>y\u001b0?C5X\u0016JQ@_w4bqp", (short) (C1607wl.Xd() ^ 17166), (short) (C1607wl.Xd() ^ 13057)));
                Object obj = linkedHashMap.get(x500Principal);
                if (obj == null) {
                    obj = (Set) new LinkedHashSet();
                    linkedHashMap.put(x500Principal, obj);
                }
                ((Set) obj).add(x509Certificate);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.subjectToCaCerts = linkedHashMap;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof BasicTrustRootIndex) && Intrinsics.areEqual(((BasicTrustRootIndex) obj).subjectToCaCerts, this.subjectToCaCerts));
    }

    @Override // okhttp3.internal.tls.TrustRootIndex
    public X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) throws Throwable {
        Intrinsics.checkNotNullParameter(x509Certificate, ZO.xd("$C\b\u0010", (short) (C1499aX.Xd() ^ (-2801)), (short) (C1499aX.Xd() ^ (-30280))));
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("a\u000e&y9-\nGz\u0014T\u000fr\u0007\r\f\u000f\u000eb\u0005\u001fLf=\u0001\u0001t#AvjNP1", (short) (C1499aX.Xd() ^ (-27061)), (short) (C1499aX.Xd() ^ (-11082)))).getMethod(Ig.wd(".[\\\u0015o3]T3hK u\b>\u0013{t!\u0012Ct", (short) (C1499aX.Xd() ^ (-19940))), new Class[0]);
        try {
            method.setAccessible(true);
            Set<X509Certificate> set = this.subjectToCaCerts.get((X500Principal) method.invoke(x509Certificate, objArr));
            Object obj = null;
            if (set == null) {
                return null;
            }
            for (Object obj2 : set) {
                try {
                    x509Certificate.verify(((X509Certificate) obj2).getPublicKey());
                    obj = obj2;
                    break;
                } catch (Exception unused) {
                }
            }
            return (X509Certificate) obj;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public int hashCode() {
        return this.subjectToCaCerts.hashCode();
    }
}
