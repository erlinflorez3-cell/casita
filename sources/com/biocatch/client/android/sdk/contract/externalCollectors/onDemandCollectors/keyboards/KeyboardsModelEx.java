package com.biocatch.client.android.sdk.contract.externalCollectors.onDemandCollectors.keyboards;

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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O$8\u000b<N\u0007\"2\u0016\u007f\u0007tsA0JeP.`Y2\u000fq{:Ša:ڎs;\u0004\u0019>3\u0019Y\\g\u007ftZ\\\u001bC=\bDy̶0Ic{&\u001f\u001d8ZuO5]ok;\u000fu|ԓ!z9F\u0001\u001d\u0001Hݒx\u001c|zQK$\u0018@B\u0001:\u0001\u000f{\u0006`Ǝ\u0005\u00071\u000f&tg|?xrkDG%\u0019hpMmܖ1ET\u001bQl';\u0003(Գ*\t>C\"=S1\t\u0019Đ>ST\u007f=\u001dn7);I\"YdYÿ\u0018\u001b3˽%_x*j\nŒd\u001a"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<G\u001dpZ\u0016J4\fbcH+nBF)\u0015:\u0013\b;|}\u0016\u0012\u001b4x:(V$D\u0004\u0011\u0003@7PPX_\u0001'T\u001b", "", "9dh/b(KR'", "", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "5dc\u0018X@;]\u0015\fyl", "u(;7T=:\u001d)\u000e~euc\r=tU", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class KeyboardsModelEx {
    private final List<String> keyboards;

    public KeyboardsModelEx(List<String> keyboards) {
        Intrinsics.checkNotNullParameter(keyboards, "keyboards");
        this.keyboards = keyboards;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KeyboardsModelEx copy$default(KeyboardsModelEx keyboardsModelEx, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = keyboardsModelEx.keyboards;
        }
        return keyboardsModelEx.copy(list);
    }

    public final List<String> component1() {
        return this.keyboards;
    }

    public final KeyboardsModelEx copy(List<String> keyboards) {
        Intrinsics.checkNotNullParameter(keyboards, "keyboards");
        return new KeyboardsModelEx(keyboards);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KeyboardsModelEx) && Intrinsics.areEqual(this.keyboards, ((KeyboardsModelEx) obj).keyboards);
    }

    public final List<String> getKeyboards() {
        return this.keyboards;
    }

    public int hashCode() {
        return this.keyboards.hashCode();
    }

    public String toString() {
        return "KeyboardsModelEx(keyboards=" + this.keyboards + ')';
    }
}
