package androidx.lifecycle.viewmodel;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: CreationExtras.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u0016DLcz\u0007I\u0006F\u000b6B\u0005\"4\u0012\u0006\u0007nj?1Z͜x.\u0001Rj\u001c{\u0002:$i$\nCiT۟\u0002\"\u0017P\u0017\nupb\\!BU\t6zpߚWX)g \u0013JH\u007fACM6@ge;ș\u0005ڶ6\"F\u007fM)(1`\u0010%\u0003cM\u0012۵>C!D`\u0011e\u000b*\u0014\u0016>f\u0004La\u0018RDQ\u0005]\u00012iɌiŌR'm:ƐQ\u0018"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u001di\r\u001c4t\u0016\fZC7z8(\u001eHtH\u0014_:$", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,j", "7mXA\\(E3,\u000e\bZ:", "uKP;W9HW\u0018\u0012De0}\t-y}/{\n\u0012\u001b\u0017Yw\u0018;v,~7\u000b 3|\u001a8V#NzA\u001a#>%*", "5dc", "\"", "9dh", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,SNaM\\", "uKP;W9HW\u0018\u0012De0}\t-y}/{\n\u0012\u001b\u0017Yw\u0018;v,~7\u000b 3|\u001a8V#NzA\u001a#'G9\u001b9o5{#XH\u00183X[t\u0007}\u000f_\u000eL:b", "Adc", "", "B", "uKP;W9HW\u0018\u0012De0}\t-y}/{\n\u0012\u001b\u0017Yw\u0018;v,~7\u000b 3|\u001a8V#NzA\u001a#'G9\u001b9\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001Pu", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableCreationExtras extends CreationExtras {
    public MutableCreationExtras() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public MutableCreationExtras(CreationExtras initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        getMap$lifecycle_viewmodel_release().putAll(initialExtras.getMap$lifecycle_viewmodel_release());
    }

    public /* synthetic */ MutableCreationExtras(CreationExtras.Empty empty, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? CreationExtras.Empty.INSTANCE : empty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void set(CreationExtras.Key<T> key, T t2) {
        Intrinsics.checkNotNullParameter(key, "key");
        getMap$lifecycle_viewmodel_release().put(key, t2);
    }

    @Override // androidx.lifecycle.viewmodel.CreationExtras
    public <T> T get(CreationExtras.Key<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) getMap$lifecycle_viewmodel_release().get(key);
    }
}
