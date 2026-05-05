package kotlin.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
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
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLш|\u0004Oي8é6B\r.4ߚ\u007f\u0007|jAӄLeV7ZS0\u000fs{BBc$\bCCU \t*\t]To˧vJh\u000bK\u000f\f\u0017~oBկs\u0016\u000e\u0012=1zn\\sr\u007fCG`\r8\u001b\u001f`#H}\u0013\u00032*v\u0013\u0007~QO$\u0012^E\u0001>`\u0013e\u0005H\u0019ĂB \u000f&%x\\L`l\fA_)\u0011\u0001ZP=^^}\u0014όF\u001d-\u001b\u000fy\u001eYY}I]7a\u001d\u001fR\nZ3I\u007fL\u001dn7);I\"bdbH\u001a#Gg\r\fulpUen\u0015?3_e[P<3\u000ey*\u0017\u0013ǌ\u001aΝ+H6Ʀjt\u0016\u000eKv\tRnQXތDȸ~a>Ѝu\u0012A1Q\u001b\u0015X8ݹ\u001b\u05ee;\u0002\rټ6%\u0007t/g% n\u00173T&T\bҜBףLT\u0012ԯUo\n}p\u0010z\">V\u00185\f\u0013>\u0017SB\nCYuBɌJזk\u0001\u0015bncwc`B(\u0001$Jz\u001b\u001a^\\d3p'ԐZ¯\u0015S$\u0381\u001f\u007f\u000e'.qʥ@?"}, d2 = {"\u001aj^A_0G\u001d\u001e\u0010\u0003(0\u0006\u0018/r\t$\u0003\no+\"GZ\nIr-5h}-$m\u0017.ZCDi4s", "\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@k\u0013$Cw\u000eKv2\u000b", "1n]AT0GS&", "", "<`\\2", "", "D`a6T5<S", "\u001aj^A_0G\u001d&~{e,z\u0018xKp$\tD| \u0015GE", "7rA2\\-BS\u0018", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015SMJr8'^ua:\u000ec*]@\r8H[0X[p=i\u0007\u001e~", "0nd;W:", "", "\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@V", "u(I", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Co_2e\tHc\"}\t", "5dc\"c7>`u\t\u000bg+\u000bG+n\t2\u000b<\u0010\u001b!P}", "u(E", "5dc\"c7>`u\t\u000bg+\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc#T9BO\"|z", "u(;8b;EW\"H\b^-\u0004\t-tI\u000el<\u000e\u001b\u0013Pm\u000e\u0012", "3pd._:", "=sW2e", "6`b566=S", "", "Adc\"c7>`u\t\u000bg+\u000b", "", "BnBAe0GU", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class TypeParameterReference implements KTypeParameter {
    public static final Companion Companion = new Companion(null);
    private volatile List<? extends KType> bounds;
    private final Object container;
    private final boolean isReified;
    private final String name;
    private final KVariance variance;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:OIV2}P\u000b\u007fRuj\u0007J\t\u000få\u0013\u000b"}, d2 = {"\u001aj^A_0G\u001d\u001e\u0010\u0003(0\u0006\u0018/r\t$\u0003\no+\"GZ\nIr-5h}-$m\u0017.ZCDi4\\rriD\u0003l0X\u007f|", "", "u(E", "BnBAe0GU", "", "Bx_2C(KO!~\n^9", "\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@k\u0013$Cw\u000eKv2\u000b", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {

        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[KVariance.values().length];
                try {
                    iArr[KVariance.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[KVariance.IN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[KVariance.OUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String toString(KTypeParameter typeParameter) {
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
            StringBuilder sb = new StringBuilder();
            int i2 = WhenMappings.$EnumSwitchMapping$0[typeParameter.getVariance().ordinal()];
            if (i2 == 2) {
                sb.append("in ");
            } else if (i2 == 3) {
                sb.append("out ");
            }
            sb.append(typeParameter.getName());
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    public TypeParameterReference(Object obj, String name, KVariance variance, boolean z2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(variance, "variance");
        this.container = obj;
        this.name = name;
        this.variance = variance;
        this.isReified = z2;
    }

    public static /* synthetic */ void getUpperBounds$annotations() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeParameterReference) {
            TypeParameterReference typeParameterReference = (TypeParameterReference) obj;
            if (Intrinsics.areEqual(this.container, typeParameterReference.container) && Intrinsics.areEqual(getName(), typeParameterReference.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KTypeParameter
    public String getName() {
        return this.name;
    }

    @Override // kotlin.reflect.KTypeParameter
    public List<KType> getUpperBounds() {
        List list = this.bounds;
        if (list != null) {
            return list;
        }
        List<KType> listListOf = CollectionsKt.listOf(Reflection.nullableTypeOf(Object.class));
        this.bounds = listListOf;
        return listListOf;
    }

    @Override // kotlin.reflect.KTypeParameter
    public KVariance getVariance() {
        return this.variance;
    }

    public int hashCode() {
        Object obj = this.container;
        return ((obj != null ? obj.hashCode() : 0) * 31) + getName().hashCode();
    }

    @Override // kotlin.reflect.KTypeParameter
    public boolean isReified() {
        return this.isReified;
    }

    public final void setUpperBounds(List<? extends KType> upperBounds) {
        Intrinsics.checkNotNullParameter(upperBounds, "upperBounds");
        if (this.bounds != null) {
            throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
        }
        this.bounds = upperBounds;
    }

    public String toString() {
        return Companion.toString(this);
    }
}
