package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Deprecated;
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
/* JADX INFO: compiled from: MeasureBlocks.kt */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "\u0010K|H\u0007\u0007\u001a9dV+\u0006cTCOo\f\r,\u0015z\u0011UwZsn\u001c4\u0014rmMwG\rq{>\u0006\u000b8;%k^~\u0012gTDhWs\u001b\u001aZ(I\u001cz\u0002")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\u0015\"4ߚ\u007f\u0007t\tA0ZeP.XU2\u000f\u0002{<řc$\bCCU0}*ޛWN}gvJ`\u000eIn\u001cǝ)jZH\u001e\u001dk\u0012'2ppo7[qU9\u000fwf\u000f.6:>\n\u0007\u0011\u001aXN>{+GY\u0013*0nq\u0001vUq\u0013\"*\u0006l!1\"jif6vo\u000eD='\u001boRP7_^\u0003{\u0012vX5\u0016\u000faL,\u0007[}C3]\u001b\u0007\u0001fo\u0007M}U\u0005\u00174W5Wwo<h\u0002$\u0015Y];b#*j\u0014i`:7qsԣJִˎ,y\u0001\r\u001bNL2\u0014:`.[\u001b\u0017\f\u001c5\rr\u0002C\u0001\flF\u0018\u0001q8'%.9Y>Kj_hS\u0019|8B)UB1\u0015\u0007!\nU>d#\u001dlw\u007f4\u0002JKLf\u0010i?}\u0004\u001fh0/44U\tG{?/]IܔZ8\u05fd!v\nKJϻ\u00133_pUoqv?̷r+ִ.\b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9u<r3Ef}|>w\u00144[\u0019", "", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "", "7mc?\\5LW\u0017fzZ:\r\u0016/S}2\u0007@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001e\u0003fkD\u00079", ";dP@h9:P ~\t", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", ExifInterface.LONGITUDE_EAST, ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "6", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", ";dP@h9>A\u0017\t\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b#\u0011y]\u0003\u0017r0U@\u000eKZ]\u0002A\u0016Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ<MKBd\u0015\u0016&\u001d~Rp>d Ty\u0002uO9oU/", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface MeasureBlocks {
    int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2);

    int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2);

    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    MeasureResult m5705measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2);

    int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2);

    int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2);
}
