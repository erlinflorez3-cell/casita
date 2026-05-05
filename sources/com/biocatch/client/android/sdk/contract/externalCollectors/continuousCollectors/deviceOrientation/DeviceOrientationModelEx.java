package com.biocatch.client.android.sdk.contract.externalCollectors.continuousCollectors.deviceOrientation;

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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4F\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:Ša:ڎs;\u0004\u0019>-\u0019S\\g\u007fnx[ŲG\u000f\u0014\u0018Aq:Nmx\f\u0013U̷C8PAS\b=gś%<\u000b @\"Py3\u0002`ޙGX\b\tJc\f@8pvH[%O\u001b\u0019@\u0005\u0005ſ\u0002fcuXNH\u001bh\u0001ș\"KpPZ?_^\n\u0014ЌE%6\u001bvy\u001eYA˝9\u001b-م\u001b\tX^M\u0007ӳuK"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<;\u001e\u001bi\u0012W;\u0017\u0015g\u001f.uK7\u001d\u00176V\u0010\u0005g\u0001\u001d\u001a\f5T}FV\u0019Vu$yK22%Yp}EA/o.d\u0015n\u0019k>D-{{\u0018\u001bo0A_", "", "=qX2a;:b\u001d\t\u0004", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<;\u001e\u001bi\u0012W;\u0017\u0015g\u001f.uK7\u001d\u00176V\u0010\u0005g\u0001\u001d\u001a\f5T}FV\u0019Vu$yK22%Yp}EA/o.d\u0015n\u0019k>D-\u0003\u0006$\u001b>", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001f=Z?9z}\u001e(waF\u0010_3,\u0001.NLL;f_\u0001\u0007\u0012\u001cc\u001dR4\u001d\u000fiO\u0002xK>\u001f\u0006;S\u000fI2\u007f\f'\u00123jZOZ\u0010P\t\u0011\u0005E3q\u00108_\u000bK?EL7h\fh,XI>.\u001d`-&h&qz", "5dc\u001ce0>\\(z\nb6\u0006", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k 7\\P7iCg\u0015{p9\u0014l(UT1NSN*k\\\u007fK]\u0010d\u0017]/\u0016\u0015cQ2LN>&\b*X\fHvJ\u000b\u0016\u001f9hp,c\u0014G\u0003$qP-rO#>yXECb\u0014q\u0010_&k6I(\u001ez\b/sP\u0004", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class DeviceOrientationModelEx {
    private final DeviceOrientationType orientation;

    public DeviceOrientationModelEx(DeviceOrientationType orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.orientation = orientation;
    }

    public static /* synthetic */ DeviceOrientationModelEx copy$default(DeviceOrientationModelEx deviceOrientationModelEx, DeviceOrientationType deviceOrientationType, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            deviceOrientationType = deviceOrientationModelEx.orientation;
        }
        return deviceOrientationModelEx.copy(deviceOrientationType);
    }

    public final DeviceOrientationType component1() {
        return this.orientation;
    }

    public final DeviceOrientationModelEx copy(DeviceOrientationType orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return new DeviceOrientationModelEx(orientation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeviceOrientationModelEx) && this.orientation == ((DeviceOrientationModelEx) obj).orientation;
    }

    public final DeviceOrientationType getOrientation() {
        return this.orientation;
    }

    public int hashCode() {
        return this.orientation.hashCode();
    }

    public String toString() {
        return "DeviceOrientationModelEx(orientation=" + this.orientation + ')';
    }
}
