package androidx.compose.ui.unit;

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
/* JADX INFO: compiled from: Dp.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eQLш|\u0004O\u000b8\u000b4E\u0007\":\u0018\u007f\u0007lqA0RnP.`ݷ2\u000fq\u0006<$i0yCAY Ԋ`\u001fѧl\f\u0018tZ\\\u001bC=إDw#+m\u0016\u0006m\u0016\u001d2Zom4ޜs??b\u00039M9@(Py3\bJ.V\u0018\u000fzqŷR܍0фoíň\u0011O\u000b# \u0010\u00079\u000f)tg|7xpkBG#1݃\tÿ/ܸ/ŧ֔\u0011HZ3\u001b\u0004*:9KO5CǬ\u0004\u0007\u0015Zs?1@8ܽ\rڋ&&ɛH֕ɱ:Z\u0006\"#8\u0018)k}>\\3ĩ\u0011\u001053gcyWTߒ\u007f¶z\f˖\u0003\u05faΝ+J4;(uP&A\u0005\u000bSna2dP\b\u0013cL\u0016S\u0012yۖ:ӸjSgN'b\u007f\n\u0013\"6#/ugǓS\u05f8d\u0017!j\u0006hyjNU`N8ԯmq\u0012xz\u0002XʶvϢ\bôz߾ѧ\u001b'=tG0i\u0005\u0010b\\g%ݓ\u0011laqjHn̎5ݳ?Ӡ\bȱʑHf\u000b\u0007^a!H\u001fi4T5â8\u0017.d\u0010<O&VʢWǏhiލ\\܃ɻ3h=v|xVsGzK5\u007fү@e`~,?jiK֢nδR\u000bʐ[̥ϒ6Jp-\u0006\u000b\r[\u001a1J? ;zA֞\u001d^\u001bh\u0011?\u000bU\u000b+wZ\u0017ɭEԦ;˭\u0002h̾sէɹT^v\u0013u{\u001a;\u000b`:-oRڤ\u001d,]Ȩ\u00016\u0003'\u0015\u0004ͧ~GшLPTo\u001c\u0090q*\u001f\u001e\u001a?pȦA8"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uE\u0018\u0013", "5dc#T3NS", "u(5", "1n\\=T9>B#", "", "=sW2e", "1n\\=T9>B#FE/~G\u000e)4", "uE5u<", "2he", "2hey#|\u0011\u001e\u001exI", "uE5u9", "2heyhxN]\u0007nb", "uE8u9", "3pd._:", "", "", "3pd._:\u0006W!\n\u0002", "uE;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "uE\u0018\u0016", ";h]Bf", ";h]Bfs\u000e`+a\u0003+z", ">kd@", ">kd@ {Ke{\u0007G-", "Bh\\2f", "Bh\\2fsN )\thN\u0014", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uE\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "CmP?l\u0014B\\)\r", "CmP?l\u0014B\\)\rB=\u007f\\\u000e~fg", "\u0011n\\=T5B]\"", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class Dp implements Comparable<Dp> {
    public static final Companion Companion = new Companion(null);
    private static final float Hairline = m6638constructorimpl(0.0f);
    private static final float Infinity = m6638constructorimpl(Float.POSITIVE_INFINITY);
    private static final float Unspecified = m6638constructorimpl(Float.NaN);
    private final float value;

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ Dp m6636boximpl(float f2) {
        return new Dp(f2);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static float m6638constructorimpl(float f2) {
        return f2;
    }

    /* JADX INFO: renamed from: div-0680j_4 */
    public static final float m6639div0680j_4(float f2, float f3) {
        return f2 / f3;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m6642equalsimpl(float f2, Object obj) {
        return (obj instanceof Dp) && Float.compare(f2, ((Dp) obj).m6652unboximpl()) == 0;
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m6643equalsimpl0(float f2, float f3) {
        return Float.compare(f2, f3) == 0;
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m6644hashCodeimpl(float f2) {
        return Float.hashCode(f2);
    }

    public boolean equals(Object obj) {
        return m6642equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6644hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ float m6652unboximpl() {
        return this.value;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Dp dp) {
        return m6651compareTo0680j_4(dp.m6652unboximpl());
    }

    private /* synthetic */ Dp(float f2) {
        this.value = f2;
    }

    public final float getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: plus-5rwHm24 */
    public static final float m6646plus5rwHm24(float f2, float f3) {
        return m6638constructorimpl(f2 + f3);
    }

    /* JADX INFO: renamed from: minus-5rwHm24 */
    public static final float m6645minus5rwHm24(float f2, float f3) {
        return m6638constructorimpl(f2 - f3);
    }

    /* JADX INFO: renamed from: unaryMinus-D9Ej5fM */
    public static final float m6650unaryMinusD9Ej5fM(float f2) {
        return m6638constructorimpl(-f2);
    }

    /* JADX INFO: renamed from: div-u2uoSUM */
    public static final float m6640divu2uoSUM(float f2, float f3) {
        return m6638constructorimpl(f2 / f3);
    }

    /* JADX INFO: renamed from: div-u2uoSUM */
    public static final float m6641divu2uoSUM(float f2, int i2) {
        return m6638constructorimpl(f2 / i2);
    }

    /* JADX INFO: renamed from: times-u2uoSUM */
    public static final float m6647timesu2uoSUM(float f2, float f3) {
        return m6638constructorimpl(f2 * f3);
    }

    /* JADX INFO: renamed from: times-u2uoSUM */
    public static final float m6648timesu2uoSUM(float f2, int i2) {
        return m6638constructorimpl(f2 * i2);
    }

    /* JADX INFO: renamed from: compareTo-0680j_4 */
    public static int m6637compareTo0680j_4(float f2, float f3) {
        return Float.compare(f2, f3);
    }

    /* JADX INFO: renamed from: compareTo-0680j_4 */
    public int m6651compareTo0680j_4(float f2) {
        return m6637compareTo0680j_4(this.value, f2);
    }

    public String toString() {
        return m6649toStringimpl(this.value);
    }

    /* JADX INFO: compiled from: Dp.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005+2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005Fi%\nCiWP\u0002xޣQʗf˧ŪIYŲG\u001d\u000e\u0016\u0007p<K[{k\u0012'4HsM8\u001e\u0012K@xtd\u0007V6x؈{܇\u007fɝߋG\u000fͯ~QS\f 6Pr@Z\u001bM\u001d\u001c\u0018\u000fL%Q@jqf6vn\u0014>\u0006ݒ\u0005\u07bcA÷ф^/ƊQ\u001bNT5\u0013\u0007c$6N7M\u0017+_\u0011\fѻ[H\u000bBwݗ!\u0017&/+O\u0013ɷ:e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lG5\u0003?a\t\u001c@q 7#", "", "u(E", "\u0016`X?_0GS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0015T0KZ\u001d\bz&\u000bPh45\u0001\u0010:<\n !Vk\u001d@\u0001.C", "5dc\u0015T0KZ\u001d\bz&\u000bPh45\u0001\u0010", "u(5", "\u0014", "\u0017mU6a0Mg", "5dc\u0016a-B\\\u001d\u000e\u000f&\u000bPh45\u0001\u0010:<\n !Vk\u001d@\u0001.C", "5dc\u0016a-B\\\u001d\u000e\u000f&\u000bPh45\u0001\u0010", "#mb=X*BT\u001d~y", "5dc\"a:IS\u0017\u0003{b,{P\u000e9_-KAhU\u0013Px\u0018Kr49c\u0007.", "5dc\"a:IS\u0017\u0003{b,{P\u000e9_-KAh", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getHairline-D9Ej5fM$annotations */
        public static /* synthetic */ void m6653getHairlineD9Ej5fM$annotations() {
        }

        /* JADX INFO: renamed from: getInfinity-D9Ej5fM$annotations */
        public static /* synthetic */ void m6654getInfinityD9Ej5fM$annotations() {
        }

        /* JADX INFO: renamed from: getUnspecified-D9Ej5fM$annotations */
        public static /* synthetic */ void m6655getUnspecifiedD9Ej5fM$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getHairline-D9Ej5fM */
        public final float m6656getHairlineD9Ej5fM() {
            return Dp.Hairline;
        }

        /* JADX INFO: renamed from: getInfinity-D9Ej5fM */
        public final float m6657getInfinityD9Ej5fM() {
            return Dp.Infinity;
        }

        /* JADX INFO: renamed from: getUnspecified-D9Ej5fM */
        public final float m6658getUnspecifiedD9Ej5fM() {
            return Dp.Unspecified;
        }
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m6649toStringimpl(float f2) {
        return Float.isNaN(f2) ? "Dp.Unspecified" : f2 + ".dp";
    }
}
