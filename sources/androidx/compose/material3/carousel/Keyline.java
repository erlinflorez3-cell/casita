package androidx.compose.material3.carousel;

import kotlin.Metadata;
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
/* JADX INFO: compiled from: KeylineList.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4C\u0007\":\u001b\u007f\u0007l}A0RkP\u008cZS8\u001bsڔ:Śa:ڎs;\u0004\u0019>]\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019-YY\u0007`*\u000f`C\u007fCAQ\b=ge\u0005:\u0013&J\"f~\u0015\u0005(1`\u0010%\u007fSO\u001a\u001aH@\u001f;ň\u0011M\u0013#Z\rL0\u0019\u001e\u000bh\u0015ɫI5dH@;\u0003\u0018C\u0015В`x\u0004[\u001f^TU\u000e=Ҵ\u001fsGEH-%\u0002\bMҿ\\\b\nM\u0006U\u0005\u0017,mȩJ<^Dm\u0018\u0014C0\u0016֜^;-j\u001bi`:(q֙d\u0014\u001e\u001c?\u0010z*Ȟl\n\u0014\u00065HF-Hg8\u00149t\u0001UXP0_r\u0006\u0001aD\u001a=\u007fa,i!lQo?1Ne\u00015\u0013$#\u000ft9[\u0003\u0013\u0011\u001b!T\u0006XIQnBxT\u0010YKu\u001cp\u0011\u0003p˽/\u0010\u0011=\u0014).E*gaG<9m\u0018Grf=ުa1Zwl`@P\n\\\u05ca)Q\u0013h`|\u0005\u001am\u001bѧ+a\\*\\\u001f}6\u0014ء`}Dƙ=\u0012TYvt;\\k\u0010=/\u0015<֍rq\u0016ãQ`9;_o`p`z,?jgۖ\\lJͭ$\\b,0>\u0019y\u001e~\u0014D|\u0011Ʊ6EyʉL.7 j!\u0019\u0012,DY|7`˖l\u0016\u0007ԞK&\tv2\u007fY\u0010^\\\to\u0016yͅ0\u0003hõECWC'1&1v7\u0015#5\u007f\u0381\u0004Moն_Nr%\u0004`ޑ$4"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001ej", "", "Ahi2", "", "=eU@X;", "CmP1]<Lb\u0019}d_-\u000b\t>", "7r5<V(E", "", "7r0;V/H`", "7r?6i6M", "1tc<Y-", "uE5\u0013M!34\\o", "5dc\u0010h;HT\u001a", "u(5", "u(I", "5dc\u001cY-LS(", "5dc \\A>", "5dc\"a(=X)\r\n^+f\n0s\u007f7", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Keyline {
    public static final int $stable = 0;
    private final float cutoff;
    private final boolean isAnchor;
    private final boolean isFocal;
    private final boolean isPivot;
    private final float offset;
    private final float size;
    private final float unadjustedOffset;

    public static /* synthetic */ Keyline copy$default(Keyline keyline, float f2, float f3, float f4, boolean z2, boolean z3, boolean z4, float f5, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = keyline.size;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = keyline.offset;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            f4 = keyline.unadjustedOffset;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            z2 = keyline.isFocal;
        }
        if ((i2 + 16) - (16 | i2) != 0) {
            z3 = keyline.isAnchor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            z4 = keyline.isPivot;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            f5 = keyline.cutoff;
        }
        return keyline.copy(f2, f3, f4, z2, z3, z4, f5);
    }

    public final float component1() {
        return this.size;
    }

    public final float component2() {
        return this.offset;
    }

    public final float component3() {
        return this.unadjustedOffset;
    }

    public final boolean component4() {
        return this.isFocal;
    }

    public final boolean component5() {
        return this.isAnchor;
    }

    public final boolean component6() {
        return this.isPivot;
    }

    public final float component7() {
        return this.cutoff;
    }

    public final Keyline copy(float f2, float f3, float f4, boolean z2, boolean z3, boolean z4, float f5) {
        return new Keyline(f2, f3, f4, z2, z3, z4, f5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Keyline)) {
            return false;
        }
        Keyline keyline = (Keyline) obj;
        return Float.compare(this.size, keyline.size) == 0 && Float.compare(this.offset, keyline.offset) == 0 && Float.compare(this.unadjustedOffset, keyline.unadjustedOffset) == 0 && this.isFocal == keyline.isFocal && this.isAnchor == keyline.isAnchor && this.isPivot == keyline.isPivot && Float.compare(this.cutoff, keyline.cutoff) == 0;
    }

    public int hashCode() {
        return (((((((((((Float.hashCode(this.size) * 31) + Float.hashCode(this.offset)) * 31) + Float.hashCode(this.unadjustedOffset)) * 31) + Boolean.hashCode(this.isFocal)) * 31) + Boolean.hashCode(this.isAnchor)) * 31) + Boolean.hashCode(this.isPivot)) * 31) + Float.hashCode(this.cutoff);
    }

    public String toString() {
        return "Keyline(size=" + this.size + ", offset=" + this.offset + ", unadjustedOffset=" + this.unadjustedOffset + ", isFocal=" + this.isFocal + ", isAnchor=" + this.isAnchor + ", isPivot=" + this.isPivot + ", cutoff=" + this.cutoff + ')';
    }

    public Keyline(float f2, float f3, float f4, boolean z2, boolean z3, boolean z4, float f5) {
        this.size = f2;
        this.offset = f3;
        this.unadjustedOffset = f4;
        this.isFocal = z2;
        this.isAnchor = z3;
        this.isPivot = z4;
        this.cutoff = f5;
    }

    public final float getSize() {
        return this.size;
    }

    public final float getOffset() {
        return this.offset;
    }

    public final float getUnadjustedOffset() {
        return this.unadjustedOffset;
    }

    public final boolean isFocal() {
        return this.isFocal;
    }

    public final boolean isAnchor() {
        return this.isAnchor;
    }

    public final boolean isPivot() {
        return this.isPivot;
    }

    public final float getCutoff() {
        return this.cutoff;
    }
}
