package androidx.compose.runtime.reflect;

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
/* JADX INFO: compiled from: ComposableMethod.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\r(4\u0012}\u0016njG<L͜N\u008dXiճ?k*3d~4uQ;m\u001a,#\u0019S\\i\u007fnx]\u001bG\u001d\n.x\u0019/YY\u0007b*\u000f`EņC3[u\u0006@n\u0001N\u0005N3hهzM\b(7`\u0010%}\nƾ\rZ7N~RR;PK\u074c\u0013NE.\u00106\\\u0016Q|զm&i=3\u001bip÷We6|[\r^TU\u000e'g$+N9M\u0015SV3\rX[M\u0007Wqk\b\u0019--+Wxo6\u0007\u0003ZǊ*\u0018\u001ek\u0004>\\3R\u0011\u00125=geaO<'>\u0094|UC\u0012!\u001e'v1s֖eP\u0015A\t\u000bSneHߠAP\no:/%.6ڢ=!nϟy=\u001fUE\u0004U\u001c,(\u0019nO^ڍ\u0012f\u001dÑlyW:_H\u000eW\\\nq=\u001c\u0005Ͳf\b2ʶHI\u0006/\n\u001b~&39s9Q$Ƞ\u0006NLϙ\u000f\u0007fsaqʖLV"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001b<w,5W\ri\u0015w\u001e9WQ7h;\u001exqbC\\", "", "7r2<`7Ha\u0015{\u0002^", "", "@dP9C(KO!\rXh<\u0006\u0018", "", "1gP;Z,=>\u0015\fvf:", "2dU.h3M>\u0015\fvf:", "uY8\u0016<o/", "5dc\u0010[(GU\u0019}eZ9x\u0011=", "u(8", "5dc\u0011X-:c \u000eeZ9x\u0011=", "u(I", "5dc\u001fX(E>\u0015\fvf:Z\u0013?n\u000f", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "BnBAe0GU", "", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ComposableInfo {
    public static final int $stable = 0;
    private final int changedParams;
    private final int defaultParams;
    private final boolean isComposable;
    private final int realParamsCount;

    public static /* synthetic */ ComposableInfo copy$default(ComposableInfo composableInfo, boolean z2, int i2, int i3, int i4, int i5, Object obj) {
        if ((-1) - (((-1) - i5) | ((-1) - 1)) != 0) {
            z2 = composableInfo.isComposable;
        }
        if ((i5 + 2) - (2 | i5) != 0) {
            i2 = composableInfo.realParamsCount;
        }
        if ((4 & i5) != 0) {
            i3 = composableInfo.changedParams;
        }
        if ((i5 & 8) != 0) {
            i4 = composableInfo.defaultParams;
        }
        return composableInfo.copy(z2, i2, i3, i4);
    }

    public final boolean component1() {
        return this.isComposable;
    }

    public final int component2() {
        return this.realParamsCount;
    }

    public final int component3() {
        return this.changedParams;
    }

    public final int component4() {
        return this.defaultParams;
    }

    public final ComposableInfo copy(boolean z2, int i2, int i3, int i4) {
        return new ComposableInfo(z2, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposableInfo)) {
            return false;
        }
        ComposableInfo composableInfo = (ComposableInfo) obj;
        return this.isComposable == composableInfo.isComposable && this.realParamsCount == composableInfo.realParamsCount && this.changedParams == composableInfo.changedParams && this.defaultParams == composableInfo.defaultParams;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isComposable) * 31) + Integer.hashCode(this.realParamsCount)) * 31) + Integer.hashCode(this.changedParams)) * 31) + Integer.hashCode(this.defaultParams);
    }

    public String toString() {
        return "ComposableInfo(isComposable=" + this.isComposable + ", realParamsCount=" + this.realParamsCount + ", changedParams=" + this.changedParams + ", defaultParams=" + this.defaultParams + ')';
    }

    public ComposableInfo(boolean z2, int i2, int i3, int i4) {
        this.isComposable = z2;
        this.realParamsCount = i2;
        this.changedParams = i3;
        this.defaultParams = i4;
    }

    public final boolean isComposable() {
        return this.isComposable;
    }

    public final int getRealParamsCount() {
        return this.realParamsCount;
    }

    public final int getChangedParams() {
        return this.changedParams;
    }

    public final int getDefaultParams() {
        return this.defaultParams;
    }
}
