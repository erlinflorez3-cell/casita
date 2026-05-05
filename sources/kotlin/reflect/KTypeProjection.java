package kotlin.reflect;

import androidx.webkit.ProxyConfig;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u000enjG9LeN.ZS8\u0015sڔ<$i0yCAU Ԋ(\u001fѧlz\u0018nxYCB\"F-\tp:Imzs\u0011=3RuM5eqS8\u000fwȥ\t @&\u0001\u0003\u0013\n2,^\u000f%{\nƾ\rZ9NzRT#L3\u001dXĦ?h ,g\u007fNdԟ\u001de@/1\u0003\u0002Dd&\u000e1-U\u0013Fb)%xw\u001dYC}\u0094\u0014md\u0011\u0013j[m\u0010owK\u0013\u0001)=*wr\u001e\u0383YH\u001b#:g\r\f\u0003lٯ\u0004\u001af\u001a8CO\u0012]\u0017\"x\t\t}%>\u001a\r4*ρ23\"Ǒ \u00109y\u0001Y\u0011a\u0010^Z\u0002\u0011`d\u0018Ӿ\u000493ݍ3hWhI!״;\u0010"}, d2 = {"\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@k$!Lo\fKz/>/", "", "D`a6T5<S", "\u001aj^A_0G\u001d&~{e,z\u0018xKp$\tD| \u0015GE", "Bx_2", "\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@V", "uKZ<g3B\\b\fz_3|\u0007>/e\u0019wM\u0005\u0013 Eoc#|/D`\u0002)\u0001z\u0016/TC9z}\u0004\u0004|l9\\'\u001d", "5dc!l7>", "u(;8b;EW\"H\b^-\u0004\t-tI\u000ejT\f\u0017l", "5dc#T9BO\"|z", "u(;8b;EW\"H\b^-\u0004\t-tI\u000el<\u000e\u001b\u0013Pm\u000e\u0012", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class KTypeProjection {
    public static final Companion Companion = new Companion(null);
    public static final KTypeProjection star = new KTypeProjection(null, null);
    private final KType type;
    private final KVariance variance;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005&4\u0012\u000e\u0007nj?1JͣIDɟ\u0004*=j<9*[ҸuCIUb\f0\u0010gN\u0016i\u001fNh\u0013[\u000f4\u001f?otWc\u0003u\u0012=4rsM;eokB'y~\u0013.=:8(\u00071\u001e8P(v)L\u0012\u0011b?NqRR;O;^Ū\nB8\u0003$_uR\u0007\\zbR/Q\u0005 ĩ%ύa݁\u0001S\u0015Ͽd)\u0013|o\u001eґDC"}, d2 = {"\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@k$!Lo\fKz/>\u0018[*?x\u00127QMDA", "", "u(E", "!S0\u001f", "\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@k$!Lo\fKz/>/", "5dc G\b+", "u(;8b;EW\"H\b^-\u0004\t-tI\u000ejT\f\u0017\u0002Ty\u0013<t49c\u0007u", "AsP?", "5dc g(K\u0012\u0015\b\u0004h;x\u00183o\t6", "1n]Ae(OO&\u0003vg;", "Bx_2", "\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@V", "1ne.e0:\\(", "7me.e0:\\(", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getStar$annotations() {
        }

        @JvmStatic
        public final KTypeProjection contravariant(KType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(KVariance.IN, type);
        }

        @JvmStatic
        public final KTypeProjection covariant(KType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(KVariance.OUT, type);
        }

        public final KTypeProjection getSTAR() {
            return KTypeProjection.star;
        }

        @JvmStatic
        public final KTypeProjection invariant(KType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(KVariance.INVARIANT, type);
        }
    }

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

    public KTypeProjection(KVariance kVariance, KType kType) {
        this.variance = kVariance;
        this.type = kType;
        if ((kVariance == null) == (kType == null)) {
        } else {
            throw new IllegalArgumentException((kVariance == null ? "Star projection must have no type specified." : "The projection variance " + kVariance + " requires type to be specified.").toString());
        }
    }

    @JvmStatic
    public static final KTypeProjection contravariant(KType kType) {
        return Companion.contravariant(kType);
    }

    public static /* synthetic */ KTypeProjection copy$default(KTypeProjection kTypeProjection, KVariance kVariance, KType kType, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            kVariance = kTypeProjection.variance;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            kType = kTypeProjection.type;
        }
        return kTypeProjection.copy(kVariance, kType);
    }

    @JvmStatic
    public static final KTypeProjection covariant(KType kType) {
        return Companion.covariant(kType);
    }

    @JvmStatic
    public static final KTypeProjection invariant(KType kType) {
        return Companion.invariant(kType);
    }

    public final KVariance component1() {
        return this.variance;
    }

    public final KType component2() {
        return this.type;
    }

    public final KTypeProjection copy(KVariance kVariance, KType kType) {
        return new KTypeProjection(kVariance, kType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        return this.variance == kTypeProjection.variance && Intrinsics.areEqual(this.type, kTypeProjection.type);
    }

    public final KType getType() {
        return this.type;
    }

    public final KVariance getVariance() {
        return this.variance;
    }

    public int hashCode() {
        KVariance kVariance = this.variance;
        int iHashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        KType kType = this.type;
        return iHashCode + (kType != null ? kType.hashCode() : 0);
    }

    public String toString() {
        KVariance kVariance = this.variance;
        int i2 = kVariance == null ? -1 : WhenMappings.$EnumSwitchMapping$0[kVariance.ordinal()];
        if (i2 == -1) {
            return ProxyConfig.MATCH_ALL_SCHEMES;
        }
        if (i2 == 1) {
            return String.valueOf(this.type);
        }
        if (i2 == 2) {
            return "in " + this.type;
        }
        if (i2 == 3) {
            return "out " + this.type;
        }
        throw new NoWhenBranchMatchedException();
    }
}
