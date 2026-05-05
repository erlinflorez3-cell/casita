package kotlin.reflect;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0006ELc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lqA0R͜P.XS0s\u0002ڔ\\&aҕ\u007fBcW |0\twRmg|Kx\ns\u0015\u0016\u0018\tjrJ\u0004z\u000e$\u001f4Ro\u00062]qM9'tF\u000702h9(\b9\u0019:\u0011+\u0005\u0005[KB\u0012`D~Ej\r\u0004ĨJ\u0016\u0014J8\u0001T[.rɇLlkGw@\u0011wZP=^^\f}\u0011T_?\r-ѭN/NCM\u0015[RI,қ_?\u0011LBe\u0013l?9;K\u0004Wlݙ\u0010\u0016%+\u0006\fmt6\\;Q\u000f\u0011}˪QӍOZ\u001e*}\u0001\n\u0014T\u0006\u0014\u000e5Qͼ1+"}, d2 = {"\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[<c", "\u0012", "\u0013", "$", "\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[E", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "5dcAX9", "\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[<L\u001ev4DY\u000bu", "5dc\u0014X;MS&=vg5\u0007\u0018+t\u00042\u0005N", "u(E", "5dc\u0014X;MS&", "u(;8b;EW\"H\b^-\u0004\t-tI\u000efM\u000b\"\u0017T~\"\t5\u00075h\r DC", "5dc", "@dR2\\=>`d", "@dR2\\=>`e", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", "5dc\u0011X3>U\u0015\u000ez", "", "\u0015dcAX9", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface KProperty2<D, E, V> extends KProperty<V>, Function2<D, E, V> {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static /* synthetic */ void getGetter$annotations() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u0006ELc\u000b\u0004I\u0006F\u000b6Ȑ\u0005\u0007Bߚ \tlkG/lgN0`SR\u0013q~B%y#\"IKW*}h\n}P\u0018y~Lj\u000b\n\u000e\u0016\u0018\tjrIezm\u0012U3prЩ7Q"}, d2 = {"\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[<L\u001ev4DY\u000bu", "\u0012", "\u0013", "$", "\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[.o<\u000645fS", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface Getter<D, E, V> extends KProperty.Getter<V>, Function2<D, E, V> {
    }

    V get(D d2, E e2);

    Object getDelegate(D d2, E e2);

    @Override // kotlin.reflect.KProperty
    Getter<D, E, V> getGetter();
}
