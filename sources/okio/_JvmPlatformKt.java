package okio;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d̉=!4i\bDZc|İI\u0006>\u001b6B\r.4\u0012}\tnjO0LeN.ZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]ތe\u0012%2JoE3UoS9hҚN\u000f.݅:<(\u0004i\u001a\tHV͌\u0013MY\r*0nrbR;PK܅*\u0010L$\u0019\u001e\u000bjv6vn$ŽGN\u0011nZNmeP~SεTZO\u0011%`\u0007+\u001f7e\u001f3Z\u001b\rb]O\u0003\u0006wk\r/Ѯ-ɛH֕ɱ:X\u000e\u001d=3]\u0017}rTg5Q\u000f\u0017O3]okP<5(z*\u001ad\f\u001c\u0014GH\\<Jf6\u001d[|\u0001c`P0or\u007f)r^\u001f3\u0012S+g.\u0017Q\u0010NAVE\u0010%\rL81nOp|\u0016n+;T&haQnTpV\u0018q]m2o\u0013\u0002X\u0003XO\u000eH\u001c\u0011\\1U7\nS\u05fd!p\nKJϳ'3_ĎW\u0005"}, d2 = {"<df\u0019b*D", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006c%5b\r-3v%\u0015WAAA", "\u001anZ6bu%]\u0017\u0005P", "/rDAY~-]u\u0013\n^\b\n\u0016+y", "", "", "BnDAY~,b&\u0003\u0004`", "Ehc5?6<Y", "\"", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`\u001eQm\u0014J@\u00125Y\u0007/Di\u001f=4M9q\n\u0005\u001brp@\u000bluS\b/\u0011M^5ZavG\u001d $n^4\u000b\u0014]K-9\u001az\u0006\r(Z}\u0005o|\u0015\u0018W\u001fguBT\u001f\u001d", "\u000fqa.l\u0010GR\u0019\u0012dn;f\n\fo\u00101zN`*\u0015Gz\u001d@\u0001.", "\u001aiPCTuEO\"\u0001D:9\n\u0005CI\t'{Sj'&1pjF\u0007.4g]35m!=QMDA", "\u0011k^@X(;Z\u0019", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "\u0012dU9T;>`", "\u001aiPCTuNb\u001d\u0006Ds0\bR\u000ee\u0001/wO\u0001$l", "\u0013N5\u0012k*>^(\u0003\u0005g", "\u001aiPCTuB]b^d?\f\u0010\u0007/p\u000f,\u0006IV", "\u0014h[2A6M4#\u000f\u0004]\f\u0010\u0007/p\u000f,\u0006I", "\u001aiPCTuB]b_~e,e\u0013>F\n8\u0005?`*\u0015Gz\u001d@\u0001.\u000b", "\u0017N4EV,Ib\u001d\t\u0004", "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", "\u0017mU9T;>`", "\u001aiPCTuNb\u001d\u0006Ds0\bR\u0013n\u0001/wO\u0001$l", "\u001anR8", "\u001eq^Ab*HZx\u0012x^7\f\r9n", "\u001aiPCTuGS(Hek6\f\u0013-o\u0007\b\u000f>\u0001\"&Ky\u0017\u0012", "=jX<"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class _JvmPlatformKt {
    public static final byte[] asUtf8ToByteArray(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public static final ReentrantLock newLock() {
        return new ReentrantLock();
    }

    public static final String toUtf8String(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }

    public static final <T> T withLock(ReentrantLock reentrantLock, Function0<? extends T> action) {
        Intrinsics.checkNotNullParameter(reentrantLock, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        ReentrantLock reentrantLock2 = reentrantLock;
        reentrantLock2.lock();
        try {
            return action.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            reentrantLock2.unlock();
            InlineMarker.finallyEnd(1);
        }
    }
}
