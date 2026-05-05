package com.biocatch.client.android.sdk.contract.externalCollectors.onDemandCollectors.emulator;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4G\u0007\":\u0018\u007fјnjG<L͜N\u0093Xiճ?k*3df4uQ;m\u001a,#\u07beSNui7Qh\u000f[\u000f4\u0017?͚-\u0012f\u0007b*\u000f`ԏ E9M}=Q`#7Kۚ1jI\b\u000b\u0019\u001aXI@|\tJc\u000e(/no\u0001ż\u000e\u0016\f(\u001a\u001e>N\nd\u05c8f\u0017=Vvu:].IޚA\u001f6m0\u0015M;Gù+\u0013~ѭ6-F7C\u0018ȕW\u000f"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<G\u001dpZ\u0016J4\fbcH+nBF)\u0015:\u0013\u0002Cx\b\b%\u0018B4PJf\u0017C\t\u001f\u0003)3gF`?\r\u001d", "", "7r4:h3:b#\f", "", "uY\u0018#", "u(I", "1n\\=b5>\\(J", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class EmulatorModelEx {
    private final boolean isEmulator;

    public EmulatorModelEx(boolean z2) {
        this.isEmulator = z2;
    }

    public static /* synthetic */ EmulatorModelEx copy$default(EmulatorModelEx emulatorModelEx, boolean z2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            z2 = emulatorModelEx.isEmulator;
        }
        return emulatorModelEx.copy(z2);
    }

    public final boolean component1() {
        return this.isEmulator;
    }

    public final EmulatorModelEx copy(boolean z2) {
        return new EmulatorModelEx(z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmulatorModelEx) && this.isEmulator == ((EmulatorModelEx) obj).isEmulator;
    }

    public int hashCode() {
        boolean z2 = this.isEmulator;
        if (z2) {
            return 1;
        }
        return z2 ? 1 : 0;
    }

    public final boolean isEmulator() {
        return this.isEmulator;
    }

    public String toString() {
        return "EmulatorModelEx(isEmulator=" + this.isEmulator + ')';
    }
}
