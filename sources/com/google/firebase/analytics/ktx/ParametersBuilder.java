package com.google.firebase.analytics.ktx;

import android.os.Bundle;
import kotlin.Deprecated;
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
@Deprecated(message = "\u0010O\u0003Gr\t\u001a\u0017lVg\u0010c\u001akbdQH\u0012x`K3f/.p`\u00041&|Ti\u0002Z]qG\u0006+B>'bQSa`\\OuQ\u000e`ZM\u001dV x5\u0015wYvF+R\n\u0001+%\u0017\t\u0017\u0014N}T|)?W\u0002J\\ =\u0007/\n.M\u001er\f$\u001c\u001d:f\u001b/-\f")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0005#4\u0012\u0006\u0007nʑA0RqP\u008cZS8\u0013s{B+c$\u007fRCU }(\u000eeȞ\u0018g\u001dI\u001b\u0010ß\u0013\b\u001cxx-\u0012k\u0007c*\u000f`I CAU\b=gi%:\u0013*J\"f\u0005K\u0006b@V\u0016\u000fzqR<\u0016>H\t:\u0001\u0016}\t(\u001c\u001e>N\rda0dDN\u0005]h6S\u0007wJf'\u000e9-Q\u001bPl';\u007f(#sVE;-%\u0002\n7ViG\u001b? F5l51CI\"Z|]H5#1g\r\fyV`\u0013Yx\fU4\u007fmYZ&.\b|\f\rj\u0007<\u0013mMͶ1\u001at\u0016^B\u0003tk@~\u0005ެF\u0006\u0003ʨN\u0019+\u0004A0ݶ\u001fu"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n| \u0013N\u0004\u001d@t3~_\r3\u0001X\u0012;IK;z4+#Eq=\u000eb,[L", "", "\nh]6g\u0005", "u(E", "0t]1_,", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "5dc\u000fh5=Z\u0019", "u(;.a+K]\u001d}Dh:Fe?n~/{\u0016", ">`a.`", "", "9dh", "", "D`[BX", "", "", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'| \u0016Ty\u0012;@/C#Z0@l\u001d.#\u0007,", "8`e.!*H[a\u0001\u0005h.\u0004\twa\t'\tJ\u0005\u0016_Iw\u001c:\u000125\"\u0002)Fm\u0018vKJ?k=-]pa5\u0015s9N~'P[H(gVlE\u0014\u000eh\u001e[+\u0015\u0005bP\u001ejO;"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ParametersBuilder {
    private final Bundle zza = new Bundle();

    public final Bundle getBundle() {
        return this.zza;
    }

    @Deprecated(message = "\u0010O\u0003Gr\t\u001a\u0017lVg\u0010c\u001akbdQH\u0012x`K3f/.p`\u00041&|Ti\u0002Z]qG\u0006+B>'bQSa`\\OuQ\u000e`ZM\u001dV x5\u0015wYvF+R\n\u0001+%\u0017\t\u0017\u0014N}T|)?W\u0002J\\ =\u0007/\n.M\u001er\f$\u001c\u001d:f\u001b/-\f")
    @InterfaceC1492Gx
    public final void param(String key, double d2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.zza.putDouble(key, d2);
    }

    @Deprecated(message = "\u0010O\u0003Gr\t\u001a\u0017lVg\u0010c\u001akbdQH\u0012x`K3f/.p`\u00041&|Ti\u0002Z]qG\u0006+B>'bQSa`\\OuQ\u000e`ZM\u001dV x5\u0015wYvF+R\n\u0001+%\u0017\t\u0017\u0014N}T|)?W\u0002J\\ =\u0007/\n.M\u001er\f$\u001c\u001d:f\u001b/-\f")
    @InterfaceC1492Gx
    public final void param(String key, long j2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.zza.putLong(key, j2);
    }

    @Deprecated(message = "\u0010O\u0003Gr\t\u001a\u0017lVg\u0010c\u001akbdQH\u0012x`K3f/.p`\u00041&|Ti\u0002Z]qG\u0006+B>'bQSa`\\OuQ\u000e`ZM\u001dV x5\u0015wYvF+R\n\u0001+%\u0017\t\u0017\u0014N}T|)?W\u0002J\\ =\u0007/\n.M\u001er\f$\u001c\u001d:f\u001b/-\f")
    @InterfaceC1492Gx
    public final void param(String key, Bundle value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.zza.putBundle(key, value);
    }

    @Deprecated(message = "\u0010O\u0003Gr\t\u001a\u0017lVg\u0010c\u001akbdQH\u0012x`K3f/.p`\u00041&|Ti\u0002Z]qG\u0006+B>'bQSa`\\OuQ\u000e`ZM\u001dV x5\u0015wYvF+R\n\u0001+%\u0017\t\u0017\u0014N}T|)?W\u0002J\\ =\u0007/\n.M\u001er\f$\u001c\u001d:f\u001b/-\f")
    @InterfaceC1492Gx
    public final void param(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.zza.putString(key, value);
    }

    @Deprecated(message = "\u0010O\u0003Gr\t\u001a\u0017lVg\u0010c\u001akbdQH\u0012x`K3f/.p`\u00041&|Ti\u0002Z]qG\u0006+B>'bQSa`\\OuQ\u000e`ZM\u001dV x5\u0015wYvF+R\n\u0001+%\u0017\t\u0017\u0014N}T|)?W\u0002J\\ =\u0007/\n.M\u001er\f$\u001c\u001d:f\u001b/-\f")
    @InterfaceC1492Gx
    public final void param(String key, Bundle[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.zza.putParcelableArray(key, value);
    }
}
