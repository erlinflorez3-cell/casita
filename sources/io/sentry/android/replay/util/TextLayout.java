package io.sentry.android.replay.util;

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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4L\u0007\":\u0017\u007f\u0007lj?\u0015Z͜x.\u0001Rr\u001dy\u0003L$\n%\"GI]2}P\n\u0016r0u|Sr\u000bq\u00106\u001a\u0007rDI\u0004y$6W@PyW3{pm=n|N\u0005N3h\\B\u0013\u000f%BH>w+GY\u0014*0nq\u0001vU[\u0013&*\u0006l!1\"jof6vm$^w9\u0011vZNUm`\u0001[\u0015^TU\u000e'e,:X7c\u0016kwS\u0019`[W\u0005Upk\u0006?Ҏ)ȅMwo8^\u0002\"\u0018{_\u001ba\u000b&\u000b\u0006(ԇ\u000eˏ/S{MV\u00136}ߧ\u007f\u001d"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001eKz,~H}3FT\u0012BWSJA", "", "2n\\6a(Gb\b~\u000em\n\u0007\u00109r", "", "5dc\u0011b4B\\\u0015\b\nM,\u0010\u0018\ro\u00072\t", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", ":h]266N\\(", "5dc\u0019\\5>1#\u000f\u0004m", "u(8", "5dc\u0012_3B^'\u0003\t<6\r\u0012>", ":h]2", "5dc\u0019\\5>0#\u000e\nh4", "5dc\u0019\\5>A(z\bm", "5dc\u0019\\5>B#\n", "5dc\u0019\\5>D\u001d\r~[3|h8d", "5dc\u001de0FO&\u0013]h9\u0001\u001e9n\u000f$\u0003", "", "=eU@X;", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface TextLayout {
    Integer getDominantTextColor();

    int getEllipsisCount(int i2);

    int getLineBottom(int i2);

    int getLineCount();

    int getLineStart(int i2);

    int getLineTop(int i2);

    int getLineVisibleEnd(int i2);

    float getPrimaryHorizontal(int i2, int i3);
}
