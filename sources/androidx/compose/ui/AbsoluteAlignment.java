package androidx.compose.ui;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAbsoluteAlignment;
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
/* JADX INFO: compiled from: Alignment.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005-4\u0012\u000e\u0007nj?;JΤHDɟ\u0004*=j<9*[ҸuCIUj\u00180\ngN\u0016i%N1ŗEǇ\n\"\u0001̓<K[{k\u0012'4HsM8\u001e\nK?xtd\u0007V6x؈{ڱ\u0005&2Ϻ x\u0001JY\f*2FxHW]g\u0013#*\u0006l\"7\"3ɩPɇLxeŽ?%\tsPN?a6\b[\u0012\u0017n5\u0019\u000faL-v;\f՞'٨\u0007\u0013Z¹O\u0005E~K\u0005\u0001)-9Wx(Pf\u000f,\u0015Y_CaI̮^ԇUl\u0014ʬ;Qi\\^\u000e@y\u0001\u000e\u001bOT(\u0014;`.[*\u001d\fdޟvɤWLX\u061cnD\u0006\u0010o6/'\u0006I9Lk\u0001_xS\u0019|92\tc̜%ъr-c٪\u001eb\u001b3bwi3WYKM\u001f$gW\u0006\u0004\u001fd8.ZΊIĬ3\b\u0019ф''=vG#9m\bdRlС\t}"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u0014%Qv\u001eKv\u0001<]\u007f)?m\u001f=#", "", "u(E", "\u0010ncAb4%S\u001a\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", "5dc\u000fb;M]!ez_;;\u00058n\n7wO\u0005! U", "5dc\u000fb;M]!ez_;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`rNs\u0010E~%>hS", "\u0010ncAb4+W\u001b\u0002\n", "5dc\u000fb;M]!k~`/\fG+n\t2\u000b<\u0010\u001b!P}", "5dc\u000fb;M]!k~`/\f", "\u0011d]AX9%S\u001a\u000e", "5dc\u0010X5MS&ez_;;\u00058n\n7wO\u0005! U", "5dc\u0010X5MS&ez_;", "\u0011d]AX9+W\u001b\u0002\n", "5dc\u0010X5MS&k~`/\fG+n\t2\u000b<\u0010\u001b!P}", "5dc\u0010X5MS&k~`/\f", "\u001adUA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "5dc\u0019X-M\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc\u0019X-M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`rNs\u0010E~%>h<\u0003Az\u001aCWLJg;s", " hV5g", "5dc\u001f\\.AbWz\u0004g6\f\u0005>i\n1\n", "5dc\u001f\\.Ab", "\"n_\u0019X-M", "5dc!b7%S\u001a\u000e9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "5dc!b7%S\u001a\u000e", "\"n_\u001f\\.Ab", "5dc!b7+W\u001b\u0002\n\u001d(\u0006\u00129t{7\u007fJ\n%", "5dc!b7+W\u001b\u0002\n", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AbsoluteAlignment {
    public static final int $stable = 0;
    public static final AbsoluteAlignment INSTANCE = new AbsoluteAlignment();
    private static final Alignment TopLeft = new BiasAbsoluteAlignment(-1.0f, -1.0f);
    private static final Alignment TopRight = new BiasAbsoluteAlignment(1.0f, -1.0f);
    private static final Alignment CenterLeft = new BiasAbsoluteAlignment(-1.0f, 0.0f);
    private static final Alignment CenterRight = new BiasAbsoluteAlignment(1.0f, 0.0f);
    private static final Alignment BottomLeft = new BiasAbsoluteAlignment(-1.0f, 1.0f);
    private static final Alignment BottomRight = new BiasAbsoluteAlignment(1.0f, 1.0f);
    private static final Alignment.Horizontal Left = new BiasAbsoluteAlignment.Horizontal(-1.0f);
    private static final Alignment.Horizontal Right = new BiasAbsoluteAlignment.Horizontal(1.0f);

    public static /* synthetic */ void getBottomLeft$annotations() {
    }

    public static /* synthetic */ void getBottomRight$annotations() {
    }

    public static /* synthetic */ void getCenterLeft$annotations() {
    }

    public static /* synthetic */ void getCenterRight$annotations() {
    }

    public static /* synthetic */ void getLeft$annotations() {
    }

    public static /* synthetic */ void getRight$annotations() {
    }

    public static /* synthetic */ void getTopLeft$annotations() {
    }

    public static /* synthetic */ void getTopRight$annotations() {
    }

    private AbsoluteAlignment() {
    }

    public final Alignment getTopLeft() {
        return TopLeft;
    }

    public final Alignment getTopRight() {
        return TopRight;
    }

    public final Alignment getCenterLeft() {
        return CenterLeft;
    }

    public final Alignment getCenterRight() {
        return CenterRight;
    }

    public final Alignment getBottomLeft() {
        return BottomLeft;
    }

    public final Alignment getBottomRight() {
        return BottomRight;
    }

    public final Alignment.Horizontal getLeft() {
        return Left;
    }

    public final Alignment.Horizontal getRight() {
        return Right;
    }
}
