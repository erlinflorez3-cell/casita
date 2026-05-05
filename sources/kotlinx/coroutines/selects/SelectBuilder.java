package kotlinx.coroutines.selects;

import com.dynatrace.android.agent.Global;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&˛\bDRш|İI\u0006>\u000b6B\u0015\"4ߚ\u007f\u0007|jA0ZeP.XS2\u000f\u0002{<$q$yCAU\"}8\tWNmjvJh\u0012KƤ\u000e\u0016\u000fj4կ[ms܈76HģM2kڎm9\u000ft~3.3:8(\u0007)\u001aXK@\u0011\tGc\"\u0018/PxJX\u001dO\u0015\u001aHßl&\u0011\"lid5vl\f?uݱ\u0003ݦFN5fx=[\u000e^TU\u000f\u0017c$*N?]\u001b5U\u0013\u0007\u0019cm\fo\u0012K\t\u0001C-*Yug6\u001f\b$\u001d;U\u001d_\u0003&\u0013Ӥ\u007ff\u001c+;QyJ~\u000eV\u0002Aԯ\rʀ\b\u000e\u00142\u0011\u0003;\u001b~\b<5\u0015tY?^\u000e~D\u0006zo>?1\u00105;9aracK\u0019\u0015?*\u0012=\"1\u000f\u0007!\"`>\u0001#\u001fl\u0014W0aBMH\u0015\u0012iE}\n\u0001d\u0012*:\u0382u\u0006?\u007f!0-$e[g-gȤ\u0002ҩHg\u0005\u0014)7ajjHn$\u000f\u0018=)\u0017\u0018zFj\u0005yX|f<\u0015]\u001ej\u0006D\u0014#\"lw\u0003)S\u001d~ovm\u0003ic\t51v7 v{\u0016g?n5EQ\u001a߄\u0010X\u0007\u0018O>x\u0004\u0007fp]RȮ\\͈&2VzX)\nUf\fA4ou*FD1GoEb\u0011\"ZW\u0003\bobx\u0016\u000fVC$9ǭRz\u0019\u0005`^\u0007n\u0016xw1CuĘ1A_IӪ%T7פ8\u0013"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0014}\u001a5LCHA", Global.BLANK, "", "7me<^,", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\u0006A", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u000f\u0017\u001eGm\u001dJ@\u00135`}\u001eFK\u001d*]Q;6\n\u0005\u001brp@\u000bluS\b/\u0011M^5ZavG\u001d $n^4\u000b\u0014]K-:\u001az\u0010", "\u001f", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\u0007A", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u000f\u0017\u001eGm\u001dJ@\u00135`}\u001eFK\u001d*]Q;7\n\u0005\u001brp@\u000bluS\b/\u0011M^5ZavG\u001d $n^4\u000b\u0014]K-;\u001az\u0010", "\u001e", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\bA", ">`a.`", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u000f\u0017\u001eGm\u001dJ@\u00135`}\u001eFK\u001d*]Q;8\n\u0005\u001adr5Pj(Wxp1IS,ZaH$\u001a\u001ci\u0015R4V\njImoT@\u001d\u00170S\u000bI2a\u001c\u001f\fDnzK#e\u000bj", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u000f\u0017\u001eGm\u001dJ@\u00135`}\u001eFK\u001d*]Q;8\n\u0005\u001brp@\u000bluS\b/\u0011M^5ZavG\u001d $n^4\u000b\u0014]K-;\u001az\u0010", "=mC6`,Hc(", "Bh\\2@0EZ\u001d\r", "", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIuz^", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bu!5MK;tC\u001a$lkB\\", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public interface SelectBuilder<R> {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static <R, P, Q> void invoke(SelectBuilder<? super R> selectBuilder, SelectClause2<? super P, ? extends Q> selectClause2, Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
            selectBuilder.invoke(selectClause2, null, function2);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "\u0015K\fArw\u001a[\u0018^1\u000fXT@Va\f\u001c(\u0012mKW\u000fZsxa}3t(RyPPpqHT", replaceWith = @ReplaceWith(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
        @InterfaceC1492Gx
        public static <R> void onTimeout(SelectBuilder<? super R> selectBuilder, long j2, Function1<? super Continuation<? super R>, ? extends Object> function1) {
            OnTimeoutKt.onTimeout(selectBuilder, j2, function1);
        }
    }

    void invoke(SelectClause0 selectClause0, Function1<? super Continuation<? super R>, ? extends Object> function1);

    <Q> void invoke(SelectClause1<? extends Q> selectClause1, Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2);

    <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, P p2, Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2);

    <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2);

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0015K\fArw\u001a[\u0018^1\u000fXT@Va\f\u001c(\u0012mKW\u000fZsxa}3t(RyPPpqHT", replaceWith = @ReplaceWith(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    @InterfaceC1492Gx
    void onTimeout(long j2, Function1<? super Continuation<? super R>, ? extends Object> function1);
}
