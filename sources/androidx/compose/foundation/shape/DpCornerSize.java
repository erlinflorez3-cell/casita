package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: compiled from: CornerSize.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u001b\u007f\u0007tsAӄLeV\u008cZݷ2\u000fy\u0002<řc$\u007fHC٥\"}8\tWȞog\u0005Jb\u000bI\u0010\u000e\u0016\u0007v4կ[ޏc(ƁbB\u001e>cM\u001e=yk\u0005:\u0013!J\"f{ڱ\u0005\u001a8KX\u000b\tKc\f@2\u0007Ä;ƞ\fLơ\u0019ŇĂB\"\u0007'jn\u0017QVvu:]݊3oHN5`H|{\u000f\rĝ&͒uѭӿ/B=@#1\u001c\u0014\u0015_s?1M\"C\u0013w?)AH\"g|ް\u0001\\\u001c9`%]!8#ԻP),5>gcyd>,\u0006\u0010\u0014\rj\u001a>\n5_F-H~N\"\u008fsɁՂDR\bwP\u001aCgD2=\u007faG\u007f/7eo<1Ne}[ٿ ƹ\u007f͙ƈZS\u05f8d\u0017#T\u0006U\u0002iNB`N8[sBZͦdΜ)ʶϻF~\u009e\u007f\u0015F\u0019+=i@\u05fd!t\nKJϻ\u00133_pSoq͛D?"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@38U\t \u0001L!\fWPDkA\f\u0019}a\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@38U\t \u0001K ;VCHY83\u0015>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%*JJ;\\0%%h7", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "uE;8b;EW\"H\u007fo4F\r8t\u007f5\u0005<\b`uGp\nL}4\u0013c\u0007.Fz&,\\MHS0+\u001bhn\u000fJT", "\u0014", "D`[BX\u0016OS&\f~],", "5dc#T3NS\u0003\u0010zk9\u0001\b/-^{[EP\u0018~", "u(5", "1n\\=b5>\\(J", "1n\\=b5>\\(JB=\u007f\\\u000e~fg", "1n_F", "1n_F v\u000f&c\u0004t-", "uE\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\f#3x\u0016w,N\u0019uA'\u0015uO=\u001cc\u0002", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "Bn?E", "", "AgP=X\u001aBh\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "Bn?E \u001bF@v\u000eZ:", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KCY\u000f", "BnBAe0GU", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class DpCornerSize implements CornerSize, InspectableValue {
    private final float size;

    public /* synthetic */ DpCornerSize(float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name */
    private final float m1297component1D9Ej5fM() {
        return this.size;
    }

    /* JADX INFO: renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ DpCornerSize m1298copy0680j_4$default(DpCornerSize dpCornerSize, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = dpCornerSize.size;
        }
        return dpCornerSize.m1299copy0680j_4(f2);
    }

    /* JADX INFO: renamed from: copy-0680j_4, reason: not valid java name */
    public final DpCornerSize m1299copy0680j_4(float f2) {
        return new DpCornerSize(f2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DpCornerSize) && Dp.m6643equalsimpl0(this.size, ((DpCornerSize) obj).size);
    }

    public int hashCode() {
        return Dp.m6644hashCodeimpl(this.size);
    }

    private DpCornerSize(float f2) {
        this.size = f2;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public /* bridge */ /* synthetic */ Object getValueOverride() {
        return Dp.m6636boximpl(m1300getValueOverrideD9Ej5fM());
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* JADX INFO: renamed from: toPx-TmRCtEA */
    public float mo1292toPxTmRCtEA(long j2, Density density) {
        return density.mo710toPx0680j_4(this.size);
    }

    public String toString() {
        return "CornerSize(size = " + this.size + ".dp)";
    }

    /* JADX INFO: renamed from: getValueOverride-D9Ej5fM, reason: not valid java name */
    public float m1300getValueOverrideD9Ej5fM() {
        return this.size;
    }
}
