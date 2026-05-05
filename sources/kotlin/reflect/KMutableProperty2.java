package kotlin.reflect;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KMutableProperty;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0006ELc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lmA0ReP.XW0s\u0002ڔ\\&aҕ\u007fBcW |0\twPmg|K\u000b\u001dS\u0011\u0016\u0016?i<Kex$\u0012\u001f4Ro\u00064{qm?pvF\u0005f3P;2\u0004\u0011bMV\u001a\u000fzqV<\u0016>L\t:\t҈}\t(\u001f\u001e>V\u007fN`u\\NH#]\u0001Sݭ\u0007iP]w\b>\u0001e\u001fVV7\r-ѭ.-P7k\u00145U\u0013\u0007\t[m\b\u0016ѣ?ݾl17-Oye=p\u0002\u001a\u001d9Xվa\u0004"}, d2 = {"\u001aj^A_0G\u001d&~{e,z\u0018xKg8\u000b<}\u001e\u00172|\u0018Gv2DmJu", "\u0012", "\u0013", "$", "\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[<c", "\u001aj^A_0G\u001d&~{e,z\u0018xKg8\u000b<}\u001e\u00172|\u0018Gv2DmS", "AdcAX9", "\u001aj^A_0G\u001d&~{e,z\u0018xKg8\u000b<}\u001e\u00172|\u0018Gv2DmJ^%m%=MP\u0011", "5dc X;MS&=vg5\u0007\u0018+t\u00042\u0005N", "u(E", "5dc X;MS&", "u(;8b;EW\"H\b^-\u0004\t-tI\u000ecP\u0010\u0013\u0014NoxI\u000105f\r4\u0004,\u0004.\\R;x\n", "Adc", "", "@dR2\\=>`d", "@dR2\\=>`e", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d\u0010?", "!dcAX9", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface KMutableProperty2<D, E, V> extends KProperty2<D, E, V>, KMutableProperty<V> {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static /* synthetic */ void getSetter$annotations() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u0006ELc\u000b\u0004I\u0006F\u000b6B\r\"4ߚ}k|ʑa2JfV-zU0\u0011y{\\&a'\u007fDk[*\u007f2\t\u0016O\u0016i\u001fbj\rS\u000fL\u0015\tl<I\u001cxm\u0014\u001f2\tpO5]ok=\u000fwȫ\t%"}, d2 = {"\u001aj^A_0G\u001d&~{e,z\u0018xKg8\u000b<}\u001e\u00172|\u0018Gv2DmJ^%m%=MP\u0011", "\u0012", "\u0013", "$", "\u001aj^A_0G\u001d&~{e,z\u0018xKg8\u000b<}\u001e\u00172|\u0018Gv2Dm<\u000e7|%.Z\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface Setter<D, E, V> extends KMutableProperty.Setter<V>, Function3<D, E, V, Unit> {
    }

    @Override // kotlin.reflect.KMutableProperty
    Setter<D, E, V> getSetter();

    void set(D d2, E e2, V v2);
}
