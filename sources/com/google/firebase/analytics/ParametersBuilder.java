package com.google.firebase.analytics;

import android.os.Bundle;
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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0005#4\u0012\u0006\u0007nʑA0RqP\u008cZS8\u0013s{B+c$\u007fRCU }8ޛ\u007fN\u0016f/OҼ\u000fE\u0015\u0006$y3@W[\u0011]@\u0016bF}GKM\u001eFid\u0003@\u001d `-\u0001\u000e\u0013\u00072*v\u0017'~QS$\u0012^I!>`\u0017e\u0005H\u001eNR.\u00076\\\u0016UfLzeR/Q\f\u001aF\\1w0+VUZb-%v\u0010%[DE=-%\u0002\f7ViI\u001b? @M\b5-CI\"^f\\\u000e\u001c-+}\u0016\u000e|4f\u001dWp\u000e7+}fy]ˎ,w\t\n]K\u0012\u0010\u001e'v1ǉ\u001el\u0010ԄKvxWNUمbQ"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n| \u0013N\u0004\u001d@t3~Dy-3u\u0016=MPIHD\"\u001cgaF\\", "", "\nh]6g\u0005", "u(E", "0t]1_,", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "5dc\u000fh5=Z\u0019", "u(;.a+K]\u001d}Dh:Fe?n~/{\u0016", ">`a.`", "", "9dh", "", "D`[BX", "", "", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'| \u0016Ty\u0012;@/C#Z0@l\u001d.#\u0007,", "8`e.!*H[a\u0001\u0005h.\u0004\twa\t'\tJ\u0005\u0016_Iw\u001c:\u000125\"\u0002)Fm\u0018vKJ?k=-]pa5\u0015s9N~'P[H(gVlE\u0014\u000eh\u001e[+\u0015\u0005bP\u001ejO;"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ParametersBuilder {
    private final Bundle zza = new Bundle();

    public final Bundle getBundle() {
        return this.zza;
    }

    public final void param(String key, double d2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.zza.putDouble(key, d2);
    }

    public final void param(String key, long j2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.zza.putLong(key, j2);
    }

    public final void param(String key, Bundle value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.zza.putBundle(key, value);
    }

    public final void param(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.zza.putString(key, value);
    }

    public final void param(String key, Bundle[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.zza.putParcelableArray(key, value);
    }
}
