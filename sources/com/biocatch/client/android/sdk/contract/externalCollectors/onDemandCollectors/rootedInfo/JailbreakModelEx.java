package com.biocatch.client.android.sdk.contract.externalCollectors.onDemandCollectors.rootedInfo;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\r@4\u0012\u0006\u0013nj?>LeV4ZS0\u000fqڛ::ӋTqq:\u0016I\u000e&\u0017Ofg\u0016oZd\u0019E'\f&zz,wY'`\"\u0019@G\bECO\u007f=gd#9\u0015$@(Py3\u0002ʀ.H\u001e}CJY\u0019*0nq\u0001Ŭ\u000e\u0016\u0012( \u001eD0\u0003.\\\u0016RdK3Ӟ;w0\u0011xZT7a@|{\u0011tWm̠w*%9PO5C&\u001aϏ\b\u001b\u0017M\u0014Wqkݛ\u0019--+Wso6\u0007\u0001D!1O\u001b_\u000b,l\u0007a`:+YR\u0014WV\u000e6|\u0013\u0002\u001d>\u0014\u000e4+v1] l\b\u001c9\rr\u0002A\u0017٣]\u000b\u0011\tsN\u0017S\u0001c1G.~Sw:GM}߽\u0006U%1\u0015\u0007!\niT\u0602\u0014c[\u0006gIQnA\u000fާ\t*R{\u0006\th\u0012,\u00140u\u0004]~ 2\u001d-ڛs;))y\u000b\u0019Suv\u001d`\u0017TׂVNH̎\u0007\u0018=*\u0017\u0016+Yr\n\u0004VdZ<\u0011{ \u0003\ną\f\u0019(ο\u0010>'0\u001eW wwpe]8&çj=aʤ\u0004\u0010]El=̹Uz"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<G\u001dpZ\u0016J4\fbcH+nBF)\u0015:\u0013\u000fEr\u0010\f\u0015q>kz\f;\fK\u0001\u0012\u0003A%n.c^yN!X8", "", "7rA<b;>R", "", "/o_9\\*:b\u001d\t\u0004l", "", "", ">`c5f", ">da:\\:LW#\b\t", "uY;7T=:\u001d)\u000e~euc\r=tU\u000f\u0001<\u0012\u0013`W~\u0012C@\f9g\ru,1\u0007", "5dc\u000ec7EW\u0017z\nb6\u0006\u0017", "u(;7T=:\u001d)\u000e~euc\r=tU", "u(I", "5dc\u001dT;Aa", "5dc\u001dX9FW'\r~h5\u000b", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class JailbreakModelEx {
    private final List<String> applications;
    private final boolean isRooted;
    private final List<String> paths;
    private final boolean permissions;

    public JailbreakModelEx(boolean z2, List<String> applications, List<String> paths, boolean z3) {
        Intrinsics.checkNotNullParameter(applications, "applications");
        Intrinsics.checkNotNullParameter(paths, "paths");
        this.isRooted = z2;
        this.applications = applications;
        this.paths = paths;
        this.permissions = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JailbreakModelEx copy$default(JailbreakModelEx jailbreakModelEx, boolean z2, List list, List list2, boolean z3, int i2, Object obj) {
        if ((1 & i2) != 0) {
            z2 = jailbreakModelEx.isRooted;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            list = jailbreakModelEx.applications;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            list2 = jailbreakModelEx.paths;
        }
        if ((i2 & 8) != 0) {
            z3 = jailbreakModelEx.permissions;
        }
        return jailbreakModelEx.copy(z2, list, list2, z3);
    }

    public final boolean component1() {
        return this.isRooted;
    }

    public final List<String> component2() {
        return this.applications;
    }

    public final List<String> component3() {
        return this.paths;
    }

    public final boolean component4() {
        return this.permissions;
    }

    public final JailbreakModelEx copy(boolean z2, List<String> applications, List<String> paths, boolean z3) {
        Intrinsics.checkNotNullParameter(applications, "applications");
        Intrinsics.checkNotNullParameter(paths, "paths");
        return new JailbreakModelEx(z2, applications, paths, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JailbreakModelEx)) {
            return false;
        }
        JailbreakModelEx jailbreakModelEx = (JailbreakModelEx) obj;
        return this.isRooted == jailbreakModelEx.isRooted && Intrinsics.areEqual(this.applications, jailbreakModelEx.applications) && Intrinsics.areEqual(this.paths, jailbreakModelEx.paths) && this.permissions == jailbreakModelEx.permissions;
    }

    public final List<String> getApplications() {
        return this.applications;
    }

    public final List<String> getPaths() {
        return this.paths;
    }

    public final boolean getPermissions() {
        return this.permissions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    public int hashCode() {
        boolean z2 = this.isRooted;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int iHashCode = ((((r02 * 31) + this.applications.hashCode()) * 31) + this.paths.hashCode()) * 31;
        boolean z3 = this.permissions;
        return iHashCode + (z3 ? 1 : z3);
    }

    public final boolean isRooted() {
        return this.isRooted;
    }

    public String toString() {
        return "JailbreakModelEx(isRooted=" + this.isRooted + ", applications=" + this.applications + ", paths=" + this.paths + ", permissions=" + this.permissions + ')';
    }
}
