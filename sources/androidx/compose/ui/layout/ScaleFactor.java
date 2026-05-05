package androidx.compose.ui.layout;

import androidx.compose.ui.internal.InlineClassHelperKt;
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
/* JADX INFO: compiled from: ScaleFactor.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4E\u0007\":\u0017\u007f\u0007lzA0RnP.XU2\u000fy\u0002<$a'yCIa\"}(\u000bUȦ&}ñh\u0003;C=\u0005Nw\u0013lX[ތm\u0016\u001d2Zom4ޜs??b\u00039M.@0Py3\b`ݚPǘz|IZ\u001a\u001cxN~Jj\r{\f`ŏ\u000ȩ$\u0003$muX~mzoR/QɅ\u001aHT'm6\u0015M;M\u0005-\u0013vo)C@e<\u05cf$مЁ\u0006QÜC\u0005E\u0005K\u00191C5@as\u0006̬\t\u0004\"+CO;d9̮\\՝PӠѨ&*յgMV%6\u0010C\u0014\u001bU\u001c\u000e4Ax4;5~\n$2#q\u001aŊQؿbD\u0006\u0017oS_3\u000eQC9I\u0006\u0018ż:ϭR9\u0002%\u001b?k\u001d|CsT<֫E\u001fb\u000ei1\u007fG\u0004ʸN͜XƝҠ\u0003oĊ\u0006,\nSU\u0018w\t\u001fR/%e\u0001\u007f7\u074co\u0004Nju\u001eUtvS\u0002RvAXÂlյ,Á\u0010`Lߟ\u0015mVXf1ae*Z\u001f}6\u001aV!N˛#ٚ\u0014X_jor[b\"'5oEc?\u0004\u001cbQ^a<\b(fШTλ\u0018ILd\u000bdtGk\u000e`i6,þGjݫv{rOۿ\u0013;Gq\"S44\u001fÄ1v\u0002څFj"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d#1`}\u00013k%8Z\u0019", "", ">`R8X+/O \u000fz", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "5dc\u001dT*DS\u0018ove<|G+n\t2\u000b<\u0010\u001b!P}", "u(E", "AbP9X\u001f", "", "5dc V(ES\f=vg5\u0007\u0018+t\u00042\u0005N", "5dc V(ES\fF~f7\u0004", "uI\u0018\u0013", "AbP9X ", "5dc V(ES\r=vg5\u0007\u0018+t\u00042\u0005N", "5dc V(ES\rF~f7\u0004", "1n\\=b5>\\(J", "1n\\=b5>\\(JBb4\b\u0010", "1n\\=b5>\\(K", "1n\\=b5>\\(KBb4\b\u0010", "1n_F", "1n_F ~ 5.\rE-", "uI5\u0013\u001c\u0011", "2he", "=oT?T5=", "2hey'zG0,fE", "uI5u=", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uI\u0018\u0016", "Bh\\2f", "Bh\\2fs\r\"\"[\u000eFv", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class ScaleFactor {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = ScaleFactorKt.ScaleFactor(Float.NaN, Float.NaN);
    private final long packedValue;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ScaleFactor m5594boximpl(long j2) {
        return new ScaleFactor(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m5597constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m5601equalsimpl(long j2, Object obj) {
        return (obj instanceof ScaleFactor) && j2 == ((ScaleFactor) obj).m5608unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5602equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    public static /* synthetic */ void getScaleX$annotations() {
    }

    public static /* synthetic */ void getScaleY$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m5605hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    public boolean equals(Object obj) {
        return m5601equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m5605hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5608unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ ScaleFactor(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: getScaleX-impl, reason: not valid java name */
    public static final float m5603getScaleXimpl(long j2) {
        if (!(j2 != Unspecified)) {
            InlineClassHelperKt.throwIllegalStateException("ScaleFactor is unspecified");
        }
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* JADX INFO: renamed from: getScaleY-impl, reason: not valid java name */
    public static final float m5604getScaleYimpl(long j2) {
        if (!(j2 != Unspecified)) {
            InlineClassHelperKt.throwIllegalStateException("ScaleFactor is unspecified");
        }
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m5595component1impl(long j2) {
        return m5603getScaleXimpl(j2);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m5596component2impl(long j2) {
        return m5604getScaleYimpl(j2);
    }

    /* JADX INFO: renamed from: copy-8GGzs04, reason: not valid java name */
    public static final long m5598copy8GGzs04(long j2, float f2, float f3) {
        return ScaleFactorKt.ScaleFactor(f2, f3);
    }

    /* JADX INFO: renamed from: copy-8GGzs04$default, reason: not valid java name */
    public static /* synthetic */ long m5599copy8GGzs04$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = m5603getScaleXimpl(j2);
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            f3 = m5604getScaleYimpl(j2);
        }
        return m5598copy8GGzs04(j2, f2, f3);
    }

    /* JADX INFO: renamed from: times-44nBxM0, reason: not valid java name */
    public static final long m5606times44nBxM0(long j2, float f2) {
        return ScaleFactorKt.ScaleFactor(m5603getScaleXimpl(j2) * f2, m5604getScaleYimpl(j2) * f2);
    }

    /* JADX INFO: renamed from: div-44nBxM0, reason: not valid java name */
    public static final long m5600div44nBxM0(long j2, float f2) {
        return ScaleFactorKt.ScaleFactor(m5603getScaleXimpl(j2) / f2, m5604getScaleYimpl(j2) / f2);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m5607toStringimpl(long j2) {
        return "ScaleFactor(" + ScaleFactorKt.roundToTenths(m5603getScaleXimpl(j2)) + ", " + ScaleFactorKt.roundToTenths(m5604getScaleYimpl(j2)) + ')';
    }

    public String toString() {
        return m5607toStringimpl(this.packedValue);
    }

    /* JADX INFO: compiled from: ScaleFactor.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005Fi%\nCiWP\u0002xޣQʗf˧ŪIYŲG\u001d\u000e\u0016\u0007p<K[{k\u0012'4HsM8ݼoFAczȤ!N1*8\u007f$и\u001e1"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d#1`}\u00013k%8Z\u0002\u0019u<)\u0011qeC\u00109", "", "u(E", "#mb=X*BT\u001d~y", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d#1`}\u00013k%8Z\u0019", "5dc\"a:IS\u0017\u0003{b,{P)hf:|K~U\u0013Px\u0018Kr49c\u0007.", "5dc\"a:IS\u0017\u0003{b,{P)hf:|K~", "u(9", "\u0018", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getUnspecified-_hLwfpc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5609getUnspecified_hLwfpc$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getUnspecified-_hLwfpc, reason: not valid java name */
        public final long m5610getUnspecified_hLwfpc() {
            return ScaleFactor.Unspecified;
        }
    }
}
