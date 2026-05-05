package com.biocatch.client.android.sdk.contract.externalCollectors.onDemandCollectors.displays;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\":\u0017\u007f\u0007ljA0RqP.Xa2\u000fy\u0005<$a&w٘Akڼ.\"7N\u000f\u0013wrXZ#C=\u0007&|x.aU'^\"\u0013@E\b?aQ\u007fAGe\r63$B&F\u007f\u001d\u0001H1Н\u0014v\tK\u0014\u0013 AXphSȘ\u0006b\u0019\u0014P8\u0001L].ߵ7\u0011skMG#1m\tľ((7\u000ba%F\u0003+Sȿbf2NLM\u0015SZIߞS$x\u0011U\n=3ؒW-1I\u0002WNX.\u0015E1U\rkt>\\3R\u0011\u0012-+]fcP<,(\u0001\u0002\rJ\t&\u0006UL^3 f\u0016\u0014Kt!Z\u0007ї\u0001'S\u000e\u0012y6E=099R3hg`i\u0018\u0015Ұ|M\u0014,=\u0019nO\\\u001bج_]\"b\u0013i1\u007fG\u0004̇MZhKo\u001cp\u0011\u0003ò\b6OĉG}\u00177%/\bjG)9k0Oזk|\r\u009b\u0001Uo]VLr}$7B\t:[ֈh\u000bs¬lZ2\u001e[&%\u0016\f\u000b+ \u000b{˶%+\u0018ʚgjox[lZ4=kOY\u001doް[?fڨMSi oaρ\u0018["}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<G\u001dpZ\u0016J4\fbcH+nBF)\u0015:\u0013\u0001?v\f\u0013\u0012\"C4OFd\u001bNu)T=8d.c^yN!X8", "", "EhSA[", "", "6dX4[;", "Fc_6", "", "Gc_6", "<`\\2", "", "uH8\u00139\u0013CO*zDe(\u0006\u000bxS\u000f5\u007fI\u0003lZ8", "5dc\u0015X0@V(", "u(8", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc$\\+MV", "5dc%W7B", "u(5", "5dc&W7B", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class DisplayDataModelEx {
    private final int height;
    private final String name;
    private final int width;
    private final float xdpi;
    private final float ydpi;

    public DisplayDataModelEx(int i2, int i3, float f2, float f3, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.width = i2;
        this.height = i3;
        this.xdpi = f2;
        this.ydpi = f3;
        this.name = name;
    }

    public static /* synthetic */ DisplayDataModelEx copy$default(DisplayDataModelEx displayDataModelEx, int i2, int i3, float f2, float f3, String str, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i2 = displayDataModelEx.width;
        }
        if ((i4 + 2) - (2 | i4) != 0) {
            i3 = displayDataModelEx.height;
        }
        if ((i4 + 4) - (4 | i4) != 0) {
            f2 = displayDataModelEx.xdpi;
        }
        if ((8 & i4) != 0) {
            f3 = displayDataModelEx.ydpi;
        }
        if ((i4 + 16) - (i4 | 16) != 0) {
            str = displayDataModelEx.name;
        }
        return displayDataModelEx.copy(i2, i3, f2, f3, str);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final float component3() {
        return this.xdpi;
    }

    public final float component4() {
        return this.ydpi;
    }

    public final String component5() {
        return this.name;
    }

    public final DisplayDataModelEx copy(int i2, int i3, float f2, float f3, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new DisplayDataModelEx(i2, i3, f2, f3, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisplayDataModelEx)) {
            return false;
        }
        DisplayDataModelEx displayDataModelEx = (DisplayDataModelEx) obj;
        return this.width == displayDataModelEx.width && this.height == displayDataModelEx.height && Intrinsics.areEqual((Object) Float.valueOf(this.xdpi), (Object) Float.valueOf(displayDataModelEx.xdpi)) && Intrinsics.areEqual((Object) Float.valueOf(this.ydpi), (Object) Float.valueOf(displayDataModelEx.ydpi)) && Intrinsics.areEqual(this.name, displayDataModelEx.name);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getName() {
        return this.name;
    }

    public final int getWidth() {
        return this.width;
    }

    public final float getXdpi() {
        return this.xdpi;
    }

    public final float getYdpi() {
        return this.ydpi;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31) + Float.hashCode(this.xdpi)) * 31) + Float.hashCode(this.ydpi)) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "DisplayDataModelEx(width=" + this.width + ", height=" + this.height + ", xdpi=" + this.xdpi + ", ydpi=" + this.ydpi + ", name=" + this.name + ')';
    }
}
