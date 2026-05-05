package com.cleafy.mobile.detection.agent;

import a.superior;
import java.util.List;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLc\u0003\u0010I\u00066\f6B\r@4\u0012\u000e\u0007nj?3LeV4ZS0\u0012s{B+c$wGA:0Ԃ@\u001e\u007fN\u0016f'Ip[U\u001d\t.x\u0019,\u007fyOٙ\u0014Ƥ6F\bA9N}?\nx\u0003>\u001d&B$Hy3\u0006H.~4MڀEƚ\u0010\u0016HBv@`\u0014\u001e\u001d(\u001c\u001eD0\u0003.\\\u0016NdL#\u0002\u0011ǩ%ɨmFf)e9\u000bT]Xb5%v\u0010)ad\u000eߵ\u0017ȏW\u0007\u001fTaK\u0011LBO\u0013x?'YT*{\rހ\u0002Џ\u0019/g\u000fc\u00024iUcn ?+}t\u0002td߱yߡ\u007f\u0011T\u0006\u0014\u00185[ͼ11"}, d2 = {"\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001I\u0018.VR\u001ao0 \u001eroH\u000ba:$", "", "", "5dc\u0011X=BQ\u0019by", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "2de6V,\"R", "", "\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001X#8JC*x0\u001c\u0015>", "5dc\u001de6;S\b\fv\\,\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", ">q^/X\u001bKO\u0017~\t", "5dc\u0012e9H`'", "3qa<e:", "", "5dc h*<S'\r{n3g\u00169b\u007f\u0016\f=\t\u001b%Us\u0018E\u0005", "u(8", "AtR0X:LT)\u0006ek6y\t\u001du|0\u007fN\u000f\u001b!P}", "5dc\u0013T0ES\u0018i\bh)|v?b\b,\nN\u0005! U", "4`X9X+)`#{zL<y\u00113s\u000e,\u0006I\u000f", "", "5dc\u0019T:M1#\b{b.\r\u0016+t\u00042\u00050\f\u0016\u0013Vo|@~%Chy(B", "u(9", ":`bA66GT\u001d\u0001\u000bk(\f\r9no3z<\u0010\u0017\u0006Kw\u000eJ\u0006!=d", "\u0011n\\=T5B]\"", "/.bBc,KW#\f", "/fT;g&KS ~vl,"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface AgentDiagnostics {
    public static final superior Companion = superior.f73a;

    String getDeviceId();

    List getErrors();

    int getFailedProbeSubmissions();

    long getLastConfigurationUpdateTimestamp();

    List getProbeTraces();

    int getSuccessfulProbeSubmissions();
}
