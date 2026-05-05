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
/* JADX INFO: compiled from: Strategy.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\":\u0017\u007f\u0007lsA0RnP.XT2\u000fy\b<řaҘwYП\u0006\u001a,!Ij^kunbZ9D\u001f\n$z\u0003,wV\ta \u0012JB\u001eCݯQoK>){D\u001082P9@ە\u0002b1V\u001c\u000fzqLRܼ1\twH_%M3\u001eXĦ?h&,j\u007fNdԟ\u001dc@/1\u0003\u0002B|(\u00106\u0003M\u001bHl';w\u0012$1@E8-%\u0002\u0007MҿZ\b\u0014M\u0001U\u0005\u00177W1W\u0005o8n~B\u0014q͔\u000e&y4n\u001dQ\u000f\rm̚N,R^!@w)\u0010Sʴ\u0003^\u00155HF-Hgڿ\u00129|ɁkBV\blIP\no9/%.7ڢ=!nϟy=\u001fVE\u0005U\u001c,%\u0019nO\\ڍ\u0012f\u001dÑlyW;_GשLc"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u001cPG<z\u001f(\u0019qp&\u0003l.NL", "", "4q^:F;>^|\by^?", "", "BnBAX7\"\\\u0018~\u000e", "AsT=c,=7\"\u000ezk7\u0007\u0010+t\u00042\u0005", "", "uH8\u0013\u001c\u001d", "5dc\u0013e6FA(~\u0006B5{\tB", "u(8", "5dc g,I^\u0019}^g;|\u0016:o\u0007$\u000bD\u000b ", "u(5", "5dc!b\u001aMS$b\u0004],\u0010", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class ShiftPointRange {
    private final int fromStepIndex;
    private final float steppedInterpolation;
    private final int toStepIndex;

    public static /* synthetic */ ShiftPointRange copy$default(ShiftPointRange shiftPointRange, int i2, int i3, float f2, int i4, Object obj) {
        if ((i4 + 1) - (1 | i4) != 0) {
            i2 = shiftPointRange.fromStepIndex;
        }
        if ((2 & i4) != 0) {
            i3 = shiftPointRange.toStepIndex;
        }
        if ((i4 & 4) != 0) {
            f2 = shiftPointRange.steppedInterpolation;
        }
        return shiftPointRange.copy(i2, i3, f2);
    }

    public final int component1() {
        return this.fromStepIndex;
    }

    public final int component2() {
        return this.toStepIndex;
    }

    public final float component3() {
        return this.steppedInterpolation;
    }

    public final ShiftPointRange copy(int i2, int i3, float f2) {
        return new ShiftPointRange(i2, i3, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftPointRange)) {
            return false;
        }
        ShiftPointRange shiftPointRange = (ShiftPointRange) obj;
        return this.fromStepIndex == shiftPointRange.fromStepIndex && this.toStepIndex == shiftPointRange.toStepIndex && Float.compare(this.steppedInterpolation, shiftPointRange.steppedInterpolation) == 0;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.fromStepIndex) * 31) + Integer.hashCode(this.toStepIndex)) * 31) + Float.hashCode(this.steppedInterpolation);
    }

    public String toString() {
        return "ShiftPointRange(fromStepIndex=" + this.fromStepIndex + ", toStepIndex=" + this.toStepIndex + ", steppedInterpolation=" + this.steppedInterpolation + ')';
    }

    public ShiftPointRange(int i2, int i3, float f2) {
        this.fromStepIndex = i2;
        this.toStepIndex = i3;
        this.steppedInterpolation = f2;
    }

    public final int getFromStepIndex() {
        return this.fromStepIndex;
    }

    public final int getToStepIndex() {
        return this.toStepIndex;
    }

    public final float getSteppedInterpolation() {
        return this.steppedInterpolation;
    }
}
