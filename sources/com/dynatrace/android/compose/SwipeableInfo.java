package com.dynatrace.android.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\bI\u0006>\u00176B\u0005(2\u0011\u000eј\u0017jg/\u0005\u0007X4`SB\u0011\u0002zb#k*\u007fDSW0|P\b_Rui\u0007J\t\nß\u0013\b\u001c{x0\u0012[\u0007j*\u000f`H6S\u0004[}=Qb\u000b53\u001f\tĵ:ѩ\t\u0001\"ݒ\u0019\u001e\u0005{[M\"\u0011^?GðTҫQ\u0005\"ŇVJ.\u00036\\\u0016M\rԢnҺ>/+Ʌ:Q\\,w0+SC\u000bù+\u0011\u000fc$2N?\u0006$3\\\u001b\u0007\u0001auGӭuA\u001dj-19QDfDc\u0018\u0014C1\u0006Qǁv*t\u0007Wl\u001a/ˬSq"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~G\u0010$Bm\u0012+TC\u001ft5(j", "", "4q^:F;:b\u0019hwc,z\u0018", "BnBAT;>=\u0016\u0004z\\;", "And?V,", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d\u0010?", "4q^:F;:b\u0019", "", "5dc\u0013e6FA(z\n^", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "BnBAT;>", "5dc!b\u001aMO(~", "And?V,'O!~", "5dc b<KQ\u0019gvf,", "BnBAe0GU", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class SwipeableInfo {
    public static final int $stable = 8;
    private final Object fromStateObject;
    private final Object source;
    private final Object toStateObject;

    public SwipeableInfo(Object obj, Object obj2, Object source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.fromStateObject = obj;
        this.toStateObject = obj2;
        this.source = source;
    }

    public final String getFromState() {
        return String.valueOf(this.fromStateObject);
    }

    public final String getSourceName() {
        String name = this.source.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    public final String getToState() {
        return String.valueOf(this.toStateObject);
    }

    public String toString() {
        return "SwipeableInfo{fromState=" + getFromState() + ", toState=" + getToState() + ", source=" + getSourceName() + AbstractJsonLexerKt.END_OBJ;
    }
}
