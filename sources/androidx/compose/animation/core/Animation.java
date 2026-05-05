package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
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
/* JADX INFO: compiled from: Animation.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0006DLc\u000b\u0004I\u0006>é6Ȑ\u0007\":\u0019\u007f\u0007lkA0RnP.XV2\u000f\u0002{<$a+w(Q٥B\u007f(ޛ]M\u0010mtIh\u000bk\u000f4\u0017)jZK\u001e\fk#'2xģo7[\u0002U9\u000fx|)ڶ6\"F\rM\u0014(>`\u0010-ysO\u001a$H@\u001f>\u00191̂\t\u001a \u001b\u0007.\u000f4tg|>xpkLG#1m\tbwq>\u007fe\rtX]qMҔ ҋD;M\u0017+X\u0011\r#kM\nWqk\r?Ҏ)ȅMwo8^\u0007\"\u001e{_\u001bg\u000b&\u0013Ӥ(ԇ\u000eˏ/S{MV\u00196\u0004K\u0018\u001bI\u001c\u001a\u0016)X.cԿv\n\u001e3+q\u0002N'ك`۰\u0004~y8\u001d4\u000eC۸8ӕƛQeC\u001bTV*\u0004ڥ\":Ѩr\""}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\n", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "", "2ta.g0H\\\u0002z\u0004h:", "", "5dc\u0011h9:b\u001d\t\u0004G(\u0006\u0013=", "u(9", "7r8;Y0GW(~", "", "u(I", "B`a4X;/O \u000fz", "5dc!T9@S(ove<|", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Bx_266Gd\u0019\f\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "5dc!l7>1#\b\f^9\f\t<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\(8??OI>'&hnH\u0007p\u0002", "5dc#T3NSy\f\u0005f\u0015x\u00129s", ">kPFG0FS\u0002z\u0004h:", "uI\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "5dc#X3HQ\u001d\u000e\u000fO,z\u00189r`5\u0006Hi\u0013 Q}", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n| \u001bOk\u001d@\u0001.~W\b-77q7QK7z8(\u001eYa7\u0016m9$", "7r56a0LV\u0019}[k6\u0005q+n\n6", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface Animation<T, V extends AnimationVector> {
    long getDurationNanos();

    T getTargetValue();

    TwoWayConverter<T, V> getTypeConverter();

    T getValueFromNanos(long j2);

    V getVelocityVectorFromNanos(long j2);

    boolean isInfinite();

    /* JADX INFO: compiled from: Animation.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        @Deprecated
        public static <T, V extends AnimationVector> boolean isFinishedFromNanos(Animation<T, V> animation, long j2) {
            return Animation.super.isFinishedFromNanos(j2);
        }
    }

    default boolean isFinishedFromNanos(long j2) {
        return j2 >= getDurationNanos();
    }
}
