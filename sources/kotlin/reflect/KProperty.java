package kotlin.reflect;

import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0005%4\u0012\u0006\u0010nj?5JJ^\u008czW0şyzR#\f*\u0002EKU`|P\t\bNtu?fh\f[\u0015\u0016\u0018\tjbկ\u0004z4ܯ\u0011̓FyO5SrK=xv<\n.8rP\b\f\u0019\u001aXPF\u001bQŷMë\u0016:Pr@[\u001bQ\u001d\u001c\u0018\rL*Q6jrf6vt\u0014^\u0006ݲ\u0005ݦFX7a6\t[\u0011^V-\u0018\u0005kԅ/O"}, d2 = {"\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[E", "$", "\u001aj^A_0G\u001d&~{e,z\u0018xK]$\u0003G|\u0014\u001eGE", "5dcAX9", "\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[.o<\u000645fS", "5dc\u0014X;MS&=vg5\u0007\u0018+t\u00042\u0005N", "u(E", "5dc\u0014X;MS&", "u(;8b;EW\"H\b^-\u0004\t-tI\u000efM\u000b\"\u0017T~\"zX%Dh}-\r", "7r2<a:M", "", "7r2<a:M\u0012\u0015\b\u0004h;x\u00183o\t6", "u(I", "7r;.g,B\\\u001d\u000e", "7r;.g,B\\\u001d\u000e9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "\u000fbR2f:H`", "\u0015dcAX9", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface KProperty<V> extends KCallable<V> {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&˛\bDRш|İI\u0006F\u000b6B\u0005#2v\u000eј\u000fn?/Rdf-\u0003SX\u000f<\u0012B%s*\u0002EKUP|P\u000b&Ʌi̊rNr\rI\u0012\u0014\u001aѷn1"}, d2 = {"\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[.i:t%Cg\b-\r", "$", "", ">q^=X9Mg", "\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[E", "5dc\u001de6IS&\u000e\u000f", "u(;8b;EW\"H\b^-\u0004\t-tI\u000efM\u000b\"\u0017T~\"\u0012", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface Accessor<V> {
        KProperty<V> getProperty();
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static /* synthetic */ void getGetter$annotations() {
        }

        public static /* synthetic */ void isConst$annotations() {
        }

        public static /* synthetic */ void isLateinit$annotations() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&˛\bDZc|\u0004W\u00068é4'\u0015ӬT\u0016}\u0006tiW/tkX0bSp\u000e\u001a{d*k&\u0002C\u0002TH~͆\rQ"}, d2 = {"\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[.o<\u000645fS", "$", "\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[.i:t%Cg\b-\r", "\u001aj^A_0G\u001d&~{e,z\u0018xK`8\u0005>\u0010\u001b!PE", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface Getter<V> extends Accessor<V>, KFunction<V> {
    }

    Getter<V> getGetter();

    boolean isConst();

    boolean isLateinit();
}
