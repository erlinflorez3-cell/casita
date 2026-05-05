package com.dynatrace.agent.common.connectivity;

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
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\u0015\"4\u0012}\u0010njG6L͜P.`_2şqڕ::ӋTqq:\u0016/\u000e&\u0017Ofg\u0016oZ^\u0019E'\u0006D{̶0K[|k\u0017W9PxW3{p\u0004˧a==\u0013*J\"f|Kі\u001brc\u001e\u0002\u0013CyÈB6FpHR%M3\u001bB\fD \u000f tg|9\u000fȔ\\\u0003@1\u000f\u0002B|(\u00106\u000bZ%Hj&;u(Գ,\t>C#=S1\u0016\u0019Đ>KF\u007fM\u001dhU8qʵr(Ef\u007f,\u0015YPոax.ؘ\u001dSf\f51 rYR&(&}ԫ\u0011B\f\u05fa\u001e)N5;\"Ǻ\f "}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006t/>b}\u001eFq'2\\W\u0005T4-'rn?tr(]v|", "", "7r2<a5>Q(~y", "", "<dcDb9DB-\nz", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006t/>b}\u001eFq'2\\W\u0005T4-'rn?uw7NL", "\nh]6g\u0005", "uY;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0015Qw\u0016F\u007fn3c\u0007)7k%2^GJ\u007f}\u0007\u0015wsC\u0014i\u001bb\u0002'\u001d\u0010?", "u(I", "5dc\u001bX;P]&\u0005ir7|", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0015Qw\u0016F\u007fn3c\u0007)7k%2^GJ\u007f}\u0007\u0015wsC\u0014i\u001bb\u0002'\u001d", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class NetworkState {
    private final boolean isConnected;
    private final NetworkType networkType;

    public NetworkState(boolean z2, NetworkType networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        this.isConnected = z2;
        this.networkType = networkType;
    }

    public static /* synthetic */ NetworkState copy$default(NetworkState networkState, boolean z2, NetworkType networkType, int i2, Object obj) {
        if ((1 & i2) != 0) {
            z2 = networkState.isConnected;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            networkType = networkState.networkType;
        }
        return networkState.copy(z2, networkType);
    }

    public final boolean component1() {
        return this.isConnected;
    }

    public final NetworkType component2() {
        return this.networkType;
    }

    public final NetworkState copy(boolean z2, NetworkType networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        return new NetworkState(z2, networkType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.isConnected == networkState.isConnected && this.networkType == networkState.networkType;
    }

    public final NetworkType getNetworkType() {
        return this.networkType;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isConnected) * 31) + this.networkType.hashCode();
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.isConnected + ", networkType=" + this.networkType + ')';
    }
}
