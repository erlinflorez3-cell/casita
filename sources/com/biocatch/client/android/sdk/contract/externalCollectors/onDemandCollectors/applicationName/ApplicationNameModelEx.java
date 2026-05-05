package com.biocatch.client.android.sdk.contract.externalCollectors.onDemandCollectors.applicationName;

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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4I\u0007\":\u001b\u007f\u0007ljA0RkP.XS0Ŧq\u0012éT[Rp\u0004Ne\u001e\f\"!O|hwrX\\#C=\u0007Ȁ|j:L\u001e\u007fk\u0019'2pp\u0006ޓN8DGh\r63!xŹ9B \u000f#BH>͌+IQ\f 0XphS=S\u000b\u001a \bV /\u001f#ʨM~YzgR/Q\u000e\u001aH\\3w2\u0013L;E\u001bݢ\u000e?h,8X7c#kڜ\u0002OYiN\u001b? >K٩&w:Wso6\u0007\u0001Џ\u00191WՕut,`\u0013V1\u001b5-gcyQˎ,}\u0003Ԉ%>\n\u0014\u0014,χ2="}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<G\u001dpZ\u0016J4\fbcH+nBF)\u0015:\u0013}Fs\b\u0010\u0014\nDnzK?\fOy^QL4oJW[\tKKNK&l\fG'[:A\u0004'G", "", "/o_9\\*:b\u001d\t\u0004G(\u0005\t", "", ">`R8T.><\u0015\u0007z", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq>", "5dc\u000ec7EW\u0017z\nb6\u0006q+m\u007f", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001dT*DO\u001b~cZ4|", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ApplicationNameModelEx {
    private final String applicationName;
    private final String packageName;

    public ApplicationNameModelEx(String applicationName, String packageName) {
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.applicationName = applicationName;
        this.packageName = packageName;
    }

    public static /* synthetic */ ApplicationNameModelEx copy$default(ApplicationNameModelEx applicationNameModelEx, String str, String str2, int i2, Object obj) {
        if ((1 & i2) != 0) {
            str = applicationNameModelEx.applicationName;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str2 = applicationNameModelEx.packageName;
        }
        return applicationNameModelEx.copy(str, str2);
    }

    public final String component1() {
        return this.applicationName;
    }

    public final String component2() {
        return this.packageName;
    }

    public final ApplicationNameModelEx copy(String applicationName, String packageName) {
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return new ApplicationNameModelEx(applicationName, packageName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationNameModelEx)) {
            return false;
        }
        ApplicationNameModelEx applicationNameModelEx = (ApplicationNameModelEx) obj;
        return Intrinsics.areEqual(this.applicationName, applicationNameModelEx.applicationName) && Intrinsics.areEqual(this.packageName, applicationNameModelEx.packageName);
    }

    public final String getApplicationName() {
        return this.applicationName;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return (this.applicationName.hashCode() * 31) + this.packageName.hashCode();
    }

    public String toString() {
        return "ApplicationNameModelEx(applicationName=" + this.applicationName + ", packageName=" + this.packageName + ')';
    }
}
