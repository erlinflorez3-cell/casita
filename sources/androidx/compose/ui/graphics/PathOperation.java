package androidx.compose.ui.graphics;

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
/* JADX INFO: compiled from: PathOperation.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":\u001b\u007f\u0007lnA0RqP.XU0ŧ*\u0012éBjTqq:\u000e\u0019\rb\u0018UȞwk|Jr\u000bq\u0010و\u001azp.WXAu \u0013JB\u001eDcS}CQb\u000b53\u001fxƉ9ѩ\t\u0003 1V\u0018?\tQT$\u0012^A7ńQҫQ\u0007 \u001c\u0014Ah\u000e,g\u007fNdT3qƠ3%\tvP\\wk>|e\rtU}˜xҐ\"+Hʺߗ\u0014%٘\u0002\u0007\u0001\\ϓ\u0007O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#!x\u0016;IR?u=s", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class PathOperation {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m4464constructorimpl(0);
    private static final int Intersect = m4464constructorimpl(1);
    private static final int Union = m4464constructorimpl(2);
    private static final int Xor = m4464constructorimpl(3);
    private static final int ReverseDifference = m4464constructorimpl(4);

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PathOperation m4463boximpl(int i2) {
        return new PathOperation(i2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m4464constructorimpl(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4465equalsimpl(int i2, Object obj) {
        return (obj instanceof PathOperation) && i2 == ((PathOperation) obj).m4469unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4466equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4467hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    public boolean equals(Object obj) {
        return m4465equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4467hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4469unboximpl() {
        return this.value;
    }

    /* JADX INFO: compiled from: PathOperation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005,2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0\u001al\u0007c*\u000f`DƜ>\u074c߲n<˃d|>\u0005.7::\u007f\f\u000f\u001ez_\u001e~\u0013Cy\u000eݮ/ϋú9QҫQ\r\"\u0012\u0014C8\u0003$euR\u0007_zgR/Q\u0005\u07bcA÷ф^/ƊQ\u0015NT5\u0012\u000fc$6N;\u0006,3_\u001b\u0007\u0001]У\u0002ӊҵ<\u0004ص+/3I\u0002\\NZ\u0006!#/̀\rfz)bԆm\u000f\u000b/+U\u0003\u05c8T\u001c"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#!x\u0016;IR?u=\\rriD\u0003l0X\u007f|", "", "u(E", "\u0012hU3X9>\\\u0017~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#!x\u0016;IR?u=s", "5dc\u0011\\-?S&~\u0004\\,D\u0006|IJ\u0016F>", "u(8", "\u0017", "\u0017mc2e:>Q(", "5dc\u0016a;>`'~xmsyV\u00130mry", " de2e:>2\u001d\u007f{^9|\u0012-e", "5dc\u001fX=>`'~Yb-}\t<e\t&{\b}dz\u0012]X:", "#mX<a", "5dc\"a0H\\`{HBvjS-", "&na", "5dc%b9\u0006PfbELvz", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getDifference-b3I0S0c, reason: not valid java name */
        public final int m4470getDifferenceb3I0S0c() {
            return PathOperation.Difference;
        }

        /* JADX INFO: renamed from: getIntersect-b3I0S0c, reason: not valid java name */
        public final int m4471getIntersectb3I0S0c() {
            return PathOperation.Intersect;
        }

        /* JADX INFO: renamed from: getUnion-b3I0S0c, reason: not valid java name */
        public final int m4473getUnionb3I0S0c() {
            return PathOperation.Union;
        }

        /* JADX INFO: renamed from: getXor-b3I0S0c, reason: not valid java name */
        public final int m4474getXorb3I0S0c() {
            return PathOperation.Xor;
        }

        /* JADX INFO: renamed from: getReverseDifference-b3I0S0c, reason: not valid java name */
        public final int m4472getReverseDifferenceb3I0S0c() {
            return PathOperation.ReverseDifference;
        }
    }

    private /* synthetic */ PathOperation(int i2) {
        this.value = i2;
    }

    public String toString() {
        return m4468toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4468toStringimpl(int i2) {
        return m4466equalsimpl0(i2, Difference) ? "Difference" : m4466equalsimpl0(i2, Intersect) ? "Intersect" : m4466equalsimpl0(i2, Union) ? "Union" : m4466equalsimpl0(i2, Xor) ? "Xor" : m4466equalsimpl0(i2, ReverseDifference) ? "ReverseDifference" : "Unknown";
    }
}
