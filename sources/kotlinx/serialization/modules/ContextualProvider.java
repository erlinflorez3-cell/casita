package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
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
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":0\u007f\u0007ljA0ZeP.hS2şq*Jř\f$ BsU\u001f\u0004b\u000eUP˗knXZS`\u001d\u0007.|z,OV'_B\u001d@E\bICS\u007fAI`z73\"`&~ѭ\u0005В\u0019*O\u0018͵~L"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~7\b)Fm)=]?BVA(&l`9\u00149", "", "u(E", "7me<^,", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "Bx_249@c!~\u0004m:j\t<i{/\u007fU\u0001$%", "", "\u000fqV9X:L", "%hc5G@ISt\f|n4|\u0012>s", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~7\b)Fm)=]?BVA(&l`9\u0014\"\b[x.GZ\\\u0002", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~7\b)Fm)=]?BVA(&l`9\u0014\"\u001eR\u0006*6`Y,8_tM\u001c\u0012c\u001d\\\u0001", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class ContextualProvider {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4D\u0007\":\u001b\u007fјnjGӄL͜P.`Y2\u000fq{<$iByّQ٥J}P\b\u0010]wo|Jr\u000fS\u000f\f\u0017'k߽MU\u0007_Z @G\b?aS CGg\r8\u001b\u001f`*~ѝ\u0005I 8Q(v)M\u0012 ZMN{RV\u001dM\u000b\u001b@\u0007n.\u000f*tq^<Xpm:5$1jp[mۖ0M`\u001bFl+\u001dvg\u001fYA˝9\u001b-م\u001b\tX^M\u0007ӳuK"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~7\b)Fm)=]?BVA(&l`9\u0014\"\b[x.GZ\\\u0002", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~7\b)Fm)=]?BVA(&l`9\u00149", "Ada6T3Bh\u0019\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `-]\u000eIz!<]\u0013 DCY\u001f", "5dc X9BO \u0003\u0010^9", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011U{<\u0004)1`\u000257zk", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "7me<^,", "Bx_249@c!~\u0004m:j\t<i{/\u007fU\u0001$%", "", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Argless extends ContextualProvider {
        private final KSerializer<?> serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Argless(KSerializer<?> serializer) {
            super(null);
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            this.serializer = serializer;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Argless) && Intrinsics.areEqual(((Argless) obj).serializer, this.serializer);
        }

        public final KSerializer<?> getSerializer() {
            return this.serializer;
        }

        public int hashCode() {
            return this.serializer.hashCode();
        }

        @Override // kotlinx.serialization.modules.ContextualProvider
        public KSerializer<?> invoke(List<? extends KSerializer<?>> typeArgumentsSerializers) {
            Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.serializer;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLш|\u0004W\u00068\u000b<`\u0007\"B\u0012\u007f\u0007|jA0Jj^\u008c\u0003SX\u000e,0DQi$\nlKp*\u00172\u000f_RwgtK\t\u000eq\u0011و\u001a\u0003p0Y[~b\"\u00118H\u0016ECS\u007fAI`z73#`#أ}\u0005\u000f!re\u001e\u0001\u0013G[\f\u00181nsj`\u001bS\u001d$\"\fN$\u0011\u001ebh|9vn$Ɣ/s;wBfPoK\rf\u001dLd+\u001dvg\u001fYCe7չ)]\t\u000bbaE\bOsC\u000b\u000f-71Ywg6^\u0001B\u0018YPոax.ؘ\u001dSf\u001454ջgV"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~7\b)Fm)=]?BVA(&l`9\u0014\"\u001eR\u0006*6`Y,8_tM\u001c\u0012c\u001d\\\u0001", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~7\b)Fm)=]?BVA(&l`9\u00149", ">q^C\\+>`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "Bx_249@c!~\u0004m:j\t<i{/\u007fU\u0001$%", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "5dc\u001de6OW\u0018~\b", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "7me<^,", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class WithTypeArguments extends ContextualProvider {
        private final Function1<List<? extends KSerializer<?>>, KSerializer<?>> provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public WithTypeArguments(Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider) {
            super(null);
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.provider = provider;
        }

        public final Function1<List<? extends KSerializer<?>>, KSerializer<?>> getProvider() {
            return this.provider;
        }

        @Override // kotlinx.serialization.modules.ContextualProvider
        public KSerializer<?> invoke(List<? extends KSerializer<?>> typeArgumentsSerializers) {
            Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.provider.invoke(typeArgumentsSerializers);
        }
    }

    private ContextualProvider() {
    }

    public /* synthetic */ ContextualProvider(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract KSerializer<?> invoke(List<? extends KSerializer<?>> list);
}
