package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: BaselineShift.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4E\u0007\":\u001b\u007f\u0007llA0RkP.XT2\u000fy\b<$a&wٙykڼ\u001c59O|f m]\u001b\u0018S\u0013\u0014\u0016\u0011jZJǤ|_\u0018\u0011@E8WAS\b=gg%<\u0013(J$Nx3\u007f`ީIǘz|IT\u001a\u001cxN~Ej\r{\u0011`ƞ\u0005̧$\u0003$iu\\~VzlR/Q\u00130ƀMϮc2\u0003^\u001bX%6\u001bvy\u001eYA˝9\u001b-م\u001b\tX_M\bӓp=ބl;"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#Z\u001cEm\u001d2VC)n8\u001f$>", "", ";t[A\\7EW\u0019\f", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uE\u0018\u0013", "5dc\u001ah3MW$\u0006~^9", "u(5", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uE;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uE\u0018\u0016", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uE\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class BaselineShift {
    private final float multiplier;
    public static final Companion Companion = new Companion(null);
    private static final float Superscript = m6412constructorimpl(0.5f);
    private static final float Subscript = m6412constructorimpl(-0.5f);
    private static final float None = m6412constructorimpl(0.0f);

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BaselineShift m6411boximpl(float f2) {
        return new BaselineShift(f2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float m6412constructorimpl(float f2) {
        return f2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6413equalsimpl(float f2, Object obj) {
        return (obj instanceof BaselineShift) && Float.compare(f2, ((BaselineShift) obj).m6417unboximpl()) == 0;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6414equalsimpl0(float f2, float f3) {
        return Float.compare(f2, f3) == 0;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6415hashCodeimpl(float f2) {
        return Float.hashCode(f2);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6416toStringimpl(float f2) {
        return "BaselineShift(multiplier=" + f2 + ')';
    }

    public boolean equals(Object obj) {
        return m6413equalsimpl(this.multiplier, obj);
    }

    public int hashCode() {
        return m6415hashCodeimpl(this.multiplier);
    }

    public String toString() {
        return m6416toStringimpl(this.multiplier);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m6417unboximpl() {
        return this.multiplier;
    }

    /* JADX INFO: compiled from: BaselineShift.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005+2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005Fi%\nCiWP\u0002xޣQʗf˧ŪIYŲG\u001d\u000e\u0016\u0007p<K[{k\u0012'4HsM8\u001e\u0012K@xtd\u0007V6x؈{܇\u007fɝߋG\u000fͯ~QS\f 6Pr@Z\u001bM\u001d\u001c\u0018\u000fL%Q@jqf6vn\u0014>\u0006ݒ\u0005\u07bcA÷ф^/ƊQ\u001bNT5\u0013\u0007c$6N7M\u0017+_\u0011\fѻ[H\u000bBwݗ!\u0017&/+O\u0013ɷ:e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#Z\u001cEm\u001d2VC)n8\u001f$'?C\u000fn(Wz1P\"", "", "u(E", "\u001cn]2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#Z\u001cEm\u001d2VC)n8\u001f$>", "5dc\u001bb5>\u001b-RzH\u0018q\u0017ma\t1\u0006O|&\u001bQx\u001c", "5dc\u001bb5>\u001b-RzH\u0018q\u0017", "u(5", "\u0014", "!tQ@V9B^(", "5dc h)LQ&\u0003\u0006ms\u0011\\/Ok\u001d\n~|  Q~\nKz/>g", "5dc h)LQ&\u0003\u0006ms\u0011\\/Ok\u001d\n", "!t_2e:<`\u001d\n\n", "5dc h7>`'|\bb7\fPC9\u007f\u0012g5\u000fU\u0013Px\u0018Kr49c\u0007.", "5dc h7>`'|\bb7\fPC9\u007f\u0012g5\u000f", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getNone-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m6418getNoney9eOQZs$annotations() {
        }

        /* JADX INFO: renamed from: getSubscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m6419getSubscripty9eOQZs$annotations() {
        }

        /* JADX INFO: renamed from: getSuperscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m6420getSuperscripty9eOQZs$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getSuperscript-y9eOQZs, reason: not valid java name */
        public final float m6423getSuperscripty9eOQZs() {
            return BaselineShift.Superscript;
        }

        /* JADX INFO: renamed from: getSubscript-y9eOQZs, reason: not valid java name */
        public final float m6422getSubscripty9eOQZs() {
            return BaselineShift.Subscript;
        }

        /* JADX INFO: renamed from: getNone-y9eOQZs, reason: not valid java name */
        public final float m6421getNoney9eOQZs() {
            return BaselineShift.None;
        }
    }

    private /* synthetic */ BaselineShift(float f2) {
        this.multiplier = f2;
    }

    public final float getMultiplier() {
        return this.multiplier;
    }
}
