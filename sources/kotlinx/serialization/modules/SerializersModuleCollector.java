package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u000eӵLш|\u0004O\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0LeVLZS@\u000fs{J$c$wLCU(\n*ޛWN}gvJ`\rK\u000f\u001c\u0016\u0001̓2/kތ\u000e\u0012=1\u000b?M3eok:\u0001z<ӌ.4J8(\u00041$8K(|\u000bE[\fX2ntj\u007f\u001bR\u001dC\"!N9\u0011$lk^6Nm\fB]*ɨmLT0o6\u0003W\u001dHZ-3\u0002q$;DG5\u001b&\u0002\u000b5X\"cKk\u007f=\u001dhU(KOyɎDZ(\u0014C*\u007f\u0017ku>b\u0015Sp\fm-}g{Z\u001c4\u0010\u0001\f\u000fL\u0004T\bUPtAb+\u0016\u001bKt!T`V\bމP\u000e#ad\u0016E\u00069*G*\u000fQ(IIXE\f\u001d\u0013.%\u0011ngi\u0003\u0012\u0011\u001f)e\u0010WASP=\u000f]8]mw\u0012\u0003z\b:\u0006@GF>*\u0019t;m\u0003iL;!\u001a\u0003hJmϸ\u0013n\u0011S\u0018QxJ0~.=:\u000b\u001cZ\u000br3o\u0001}f@)r,g\u0017\u000f\u001e\u0012Nqʟ@++\u0019^UnszOc\u0010KEvAiv{\u0010g9%AKP\u0012'\u0010X=)\b\bp\u001dpfpT,`b̥0@pj>v,N\\\u001c+8Os,4r?G`Eq\u00112Zf\r\u001cok~\u000f-iտ(\ro-\u0005\u000f\u0007Zlrum\u001f_<\u0007p*=Ca5_4k!\u0017K+)M#<IU\u0001dGzm6{[ݨ.$B9\u007f.m\u001d\u001d\u000fA8\u0012/UL9s\u007fQBN\t\u0017\u00122Ky>vNxҔ0jpS_Z\u001d,\u0007`x).\u007f\u0010\u0004qN\u000bIsTQiTH!\u001f\bB\u0015\\ٱ\t<"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~G}-;i\u001d2bCHy\u001c(\u0014xh9dm3Uv%VV[\u0002", "", "1n]AX?Mc\u0015\u0006", "", "\"", "9B[.f:", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", ">q^C\\+>`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "Bx_249@c!~\u0004m:j\t<i{/\u007fU\u0001$%", "Ada6T3Bh\u0019\f", ">n[F`6K^\u001c\u0003x", "\u0010`b2", "!tQ", "0`b263:a'", "/bcBT3\u001cZ\u0015\r\t", "/bcBT3,S&\u0003ve0\u0012\t<", ">n[F`6K^\u001c\u0003x=,}\u0005?l\u000f", "2dU.h3M2\u0019\rzk0x\u00103z\u007f5fM\u000b(\u001bFo\u001b", "", "1kP@f\u0015:[\u0019", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`uG}\u000eIz!<]\u0013\u001cFq 7;RHgC\u001e\u0017|7", ">n[F`6K^\u001c\u0003x=,}\u0005?l\u000f\u0007{N\u0001$\u001bCv\u0012Qv2", ">n[F`6K^\u001c\u0003x=,}\u0005?l\u000f\u0016{M\u0005\u0013\u001eK\u0005\u000eI", "2dU.h3MA\u0019\f~Z3\u0001\u001e/rj5\u0006Q\u0005\u0016\u0017T", "D`[BX", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128})JU\r$Av\u0004=Z?Jk62j", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@ExperimentalSerializationApi
public interface SerializersModuleCollector {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static <T> void contextual(SerializersModuleCollector serializersModuleCollector, KClass<T> kClass, final KSerializer<T> serializer) {
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            serializersModuleCollector.contextual(kClass, new Function1<List<? extends KSerializer<?>>, KSerializer<?>>() { // from class: kotlinx.serialization.modules.SerializersModuleCollector.contextual.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final KSerializer<?> invoke(List<? extends KSerializer<?>> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return serializer;
                }
            });
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u0004^T2Or[\u001bf\u0014nKX\fTq~W\u00042&\u007fUxJ\riwKK]CL\u0017YU\r'\u0018V<rC\u000eQ\u001cV ](\u0006F\u0012z\u0015r\u001b!Q~\u0011i6k\u0001[\u0015Q\u0004B:1KX\u0002", replaceWith = @ReplaceWith(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
        @InterfaceC1492Gx
        public static <Base> void polymorphicDefault(SerializersModuleCollector serializersModuleCollector, KClass<Base> baseClass, Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
            Intrinsics.checkNotNullParameter(baseClass, "baseClass");
            Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
            serializersModuleCollector.polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider);
        }
    }

    <T> void contextual(KClass<T> kClass, Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> function1);

    <T> void contextual(KClass<T> kClass, KSerializer<T> kSerializer);

    <Base, Sub extends Base> void polymorphic(KClass<Base> kClass, KClass<Sub> kClass2, KSerializer<Sub> kSerializer);

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u0004^T2Or[\u001bf\u0014nKX\fTq~W\u00042&\u007fUxJ\riwKK]CL\u0017YU\r'\u0018V<rC\u000eQ\u001cV ](\u0006F\u0012z\u0015r\u001b!Q~\u0011i6k\u0001[\u0015Q\u0004B:1KX\u0002", replaceWith = @ReplaceWith(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
    @InterfaceC1492Gx
    <Base> void polymorphicDefault(KClass<Base> kClass, Function1<? super String, ? extends DeserializationStrategy<? extends Base>> function1);

    <Base> void polymorphicDefaultDeserializer(KClass<Base> kClass, Function1<? super String, ? extends DeserializationStrategy<? extends Base>> function1);

    <Base> void polymorphicDefaultSerializer(KClass<Base> kClass, Function1<? super Base, ? extends SerializationStrategy<? super Base>> function1);
}
