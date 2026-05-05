package com.biocatch.client.android.sdk.contract.externalCollectors.continuousCollectors.applicationEvents;

import com.biocatch.client.android.sdk.collection.collectors.application.ApplicationLocation;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4F\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:Ša:ڎs;\u0004\u0019>-\u0019S\\g\u007fnx[ŲG\u000f\u0014\u0018Aq:Nmx\f\u0013U̷C8PAS\b=gś%<\u000b @\"Py3\u0002`ޙGX\b\tJc\f@8pvH[%O\u001b\u0019@\u0005\u0005ſ\u0002fcuXNH\u001bh\u0001ș\"KpPZ?_^\n\u0014ЌE%6\u001bvy\u001eYA˝9\u001b-م\u001b\tX^M\u0007ӳuK"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<;\u001e\u001bi\u0012W;\u0017\u0015g\u001f.uK7\u001d\u00176V\u0010\u0005d\f\u0017\u001d\u00123f\u007fF`\u0019'\u000b\u0015~P72\"dj\u0001K?Aq.n\u0015?.\\CI\f\u001ep\u0019\"Hc\u0004", "", "/o_9\\*:b\u001d\t\u0004E6z\u0005>i\n1", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\u0007\u0018\u0010`E\"jS;)\u0011\u0013S\u007f7w\u0005\u0016\u001fc", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016J7gYv;\u0010!^\u0018Wth\u0010dH(l@F#\u001250\f9d\u0010\u0010 \u0017\u000b.a", "5dc\u000ec7EW\u0017z\nb6\u0006o9c{7\u007fJ\n", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k 5TC9z8(\u001e2_C\u000ej,L\u00061TZ\u0018(g]yA\u0012\u000ei\u0012X4V`dL+rB3.\f6RhEf|\u001b\u001a\u0018>@", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ApplicationEventModelEx {
    private final ApplicationLocation applicationLocation;

    public ApplicationEventModelEx(ApplicationLocation applicationLocation) {
        Intrinsics.checkNotNullParameter(applicationLocation, "applicationLocation");
        this.applicationLocation = applicationLocation;
    }

    public static /* synthetic */ ApplicationEventModelEx copy$default(ApplicationEventModelEx applicationEventModelEx, ApplicationLocation applicationLocation, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            applicationLocation = applicationEventModelEx.applicationLocation;
        }
        return applicationEventModelEx.copy(applicationLocation);
    }

    public final ApplicationLocation component1() {
        return this.applicationLocation;
    }

    public final ApplicationEventModelEx copy(ApplicationLocation applicationLocation) {
        Intrinsics.checkNotNullParameter(applicationLocation, "applicationLocation");
        return new ApplicationEventModelEx(applicationLocation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApplicationEventModelEx) && this.applicationLocation == ((ApplicationEventModelEx) obj).applicationLocation;
    }

    public final ApplicationLocation getApplicationLocation() {
        return this.applicationLocation;
    }

    public int hashCode() {
        return this.applicationLocation.hashCode();
    }

    public String toString() {
        return "ApplicationEventModelEx(applicationLocation=" + this.applicationLocation + ')';
    }
}
