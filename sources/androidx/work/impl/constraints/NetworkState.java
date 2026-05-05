package androidx.work.impl.constraints;

import kotlin.Metadata;
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
/* JADX INFO: compiled from: NetworkState.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4M\u0007\":\u0018\u007fјnjG<L͜N\u0093Xiճ?k*3d~4uQ;m\u001a,#\u0019S\\i\u007fnx[\u001bG\u001d\t.x\u0019-YY\u0007a*\u000f`CņC3[t\u0006@n{N\u0005N3hهzM\b(2`\u0010%{\nƾ\rZ7NyRR;NK\u074c\u0013NE.\u000b6\\\u0016O|զm&i=.\u001bip÷We6|[\r^TU\u000e'g$+N9M\u0015ST3\rX[M\u0006Wqk\u0006\u0019--+Wwo6\u0007\u0001ZǊ*\u0018\u001ek~>\\3R\u0011\u001258geaO<'>\u0094|UC\u0012\u001c\u001e'v=s֖eP\u0015A\u0005\u000bSnaHߠAP\no6/%.4ڢ=!nϟy=\u001fNE\u0002U\u001c,&\u0019nO\\ڍ\u0012f\u001dÑlyW4_F\u000eW\\\u000eq=\u001c\u0005Ͳf\b2ʶHI\u00063\n\u0017~&39s9Q\"Ƞ\u0006NLϙ\u000f\u0007fjaoʖLR"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#f F\u007f ;S1JgC\u001ej", "", "7r2<a5>Q(~y", "", "7rE._0=O(~y", "7r<2g,KS\u0018", "7r=<g\u0019HO!\u0003\u0004`", "uYI'Mo/", "u(I", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class NetworkState {
    private final boolean isConnected;
    private final boolean isMetered;
    private final boolean isNotRoaming;
    private final boolean isValidated;

    public static /* synthetic */ NetworkState copy$default(NetworkState networkState, boolean z2, boolean z3, boolean z4, boolean z5, int i2, Object obj) {
        if ((1 & i2) != 0) {
            z2 = networkState.isConnected;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z3 = networkState.isValidated;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            z4 = networkState.isMetered;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            z5 = networkState.isNotRoaming;
        }
        return networkState.copy(z2, z3, z4, z5);
    }

    public final boolean component1() {
        return this.isConnected;
    }

    public final boolean component2() {
        return this.isValidated;
    }

    public final boolean component3() {
        return this.isMetered;
    }

    public final boolean component4() {
        return this.isNotRoaming;
    }

    public final NetworkState copy(boolean z2, boolean z3, boolean z4, boolean z5) {
        return new NetworkState(z2, z3, z4, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.isConnected == networkState.isConnected && this.isValidated == networkState.isValidated && this.isMetered == networkState.isMetered && this.isNotRoaming == networkState.isNotRoaming;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    public int hashCode() {
        boolean z2 = this.isConnected;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = r02 * 31;
        boolean z3 = this.isValidated;
        ?? r03 = z3;
        if (z3) {
            r03 = 1;
        }
        int i3 = (i2 + r03) * 31;
        boolean z4 = this.isMetered;
        ?? r04 = z4;
        if (z4) {
            r04 = 1;
        }
        int i4 = (i3 + r04) * 31;
        boolean z5 = this.isNotRoaming;
        return i4 + (z5 ? 1 : z5);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.isConnected + ", isValidated=" + this.isValidated + ", isMetered=" + this.isMetered + ", isNotRoaming=" + this.isNotRoaming + ')';
    }

    public NetworkState(boolean z2, boolean z3, boolean z4, boolean z5) {
        this.isConnected = z2;
        this.isValidated = z3;
        this.isMetered = z4;
        this.isNotRoaming = z5;
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public final boolean isValidated() {
        return this.isValidated;
    }

    public final boolean isMetered() {
        return this.isMetered;
    }

    public final boolean isNotRoaming() {
        return this.isNotRoaming;
    }
}
