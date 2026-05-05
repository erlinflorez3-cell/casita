package com.facebook.react.bridge;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\r.4\u0012}\u0007njO0L͜P.`T2\u000fq|:\tqҕ\"CiTb\f0\tgN\u0016h\u001fNh\r[\u000f4\u0019?\u0010t_cxu\u0012=3rsM7eok<\u0011xD\n82P>@)I28H(v)D{\u0010 4XphU=S\u0013\u001c*\bT\u001f/!#\f\u0017VVlu:]$3mPR?_^\u007f}\u0013TV?\u000f\r`L.p;C\u001a=S1\r\u0019\u007f\b%MqU\u0005\u0017(W/Wwo6\u0007\u0003D\u001b9Q%_\t%\u000b\b\u0002f\u001a.CQyJ~\u0016n\u001cC\u0014\u001b<\u001c\u000e4(x2;\u001e~\b<6%xaGh\u0004tA.\u0003(Z_E\u000e3C9Ig\u0002eI\u001df7*\b=$1\b\u0007#qS<hE\u001fb|i1\u007fF\u0004l\u00178g=\u0006\u0004\u001fc20\u00124_\u0002Ez?1G+E]Q%7j0Ktm\u0005\fxjih\u0001Pp(|\u001bO,\u001f\u000b\tJ+)4^bXD\u0011{\u001d\u0005\u000b\f\u000f+ \u000b\u007f\u0003Em&\\O\u0001i\u0019N\u000e\u000e36~7\bv\u001c\u0012e>v3cW*4*b\u0005\u001dW<\u0011\u0006\tlP]$\\r'P1\u000f\u000fߑvӻͬN\u0010\u001b4E\u0011J3Ϣ5$ã\u0019G"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW'\u0004/=]\f \r", "", "@dY2V;", "", ";db@T.>", "", "1nS2", "CrT?<5?]", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7U\u00129#", "Bga<j(;Z\u0019", "", "@db<_=>", "D`[BX", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface Promise {
    @Deprecated(message = "\u0013X\u0001;v\u0007TgYZ;\u0004^\u001ckO\u001cY\u0018+\u001at\u0011\u001f\nVsmWz-i(QvT\\n(<U\"8y&e\fc\u0015&\b0xGB\u0019K[\u001cM.6A\u0007\u0007\u0014~;[b\u0007\bia\u0018|[#~\u000fI3Qp\u0013/z\u0013[.;%\b4S\"e\u0002*\u0019\u0010x7\u0007\u000e\u0012.\u001cHc|\u000f&\u001f", replaceWith = @ReplaceWith(expression = "reject(code, message)", imports = {}))
    @InterfaceC1492Gx
    void reject(String str);

    void reject(String str, WritableMap writableMap);

    void reject(String str, String str2);

    void reject(String str, String str2, WritableMap writableMap);

    void reject(String str, String str2, Throwable th);

    void reject(String str, String str2, Throwable th, WritableMap writableMap);

    void reject(String str, Throwable th);

    void reject(String str, Throwable th, WritableMap writableMap);

    void reject(Throwable th);

    void reject(Throwable th, WritableMap writableMap);

    void resolve(Object obj);
}
