package com.biocatch.client.android.sdk.contract.externalCollectors.onDemandCollectors.display;

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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\":\u0017\u007f\u0007lvA0RnP.XT2\u000fy\b<řaҜwYП\u0006\u001a,!Ir^kunbZ9D\u001f\n$z\u0003,wV\ta \u0012JB\u001eCCQ}BQ`#:ӯ$20>B\f\u000f'BH>wAƖLT\u0019>N\t:\u0001\u000e\u0014ů\u001bZ\rL/\u0019\u001e\u000bk\u0015ɫI5dH?;\u0003\u0018F\u0015В`x,[\u001e^TU˙'g$+N7M\u0015ST3\rX[M\u0005Wqk\u0006\u0019--+Wvo6\u0007\u0004D\u001b1O\u001bb\u000b&\u000b\t\u0018ԧ\u000bo<]ucP<;(\u0001\n!T\u0006$\u0005UGtǽ\u001b/\u000f\u001cH\rr\u0002A\u0017ٳ]\u000b\u0007\twN\u0017S\u0017yۖ8ku_cS\u0019|8߉\t\u0013&ŀ\u0019p'bb\u00161$)T\u0010Q_R͘ANVˣq?s\r~jR9\u00123_\u007f]\u007f 2\u001d-ڛs;)+y\r\u0019Su{\u001d`\u0017WׂVNH̎\u0007\u0018=6\u0017\u0017ʗH|"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<G\u001dpZ\u0016J4\fbcH+nBF)\u0015:\u0013\u0001?v\f\u0013\u0012\"~ItPa\u0017C\u000e|\u007f@)o&l5", "", "EhSA[", "", "6dX4[;", "Fc_6", "", "Gc_6", "uH8\u00139o/", "5dc\u0015X0@V(", "u(8", "5dc$\\+MV", "5dc%W7B", "u(5", "5dc&W7B", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class DisplayModelEx {
    private final int height;
    private final int width;
    private final float xdpi;
    private final float ydpi;

    public DisplayModelEx(int i2, int i3, float f2, float f3) {
        this.width = i2;
        this.height = i3;
        this.xdpi = f2;
        this.ydpi = f3;
    }

    public static /* synthetic */ DisplayModelEx copy$default(DisplayModelEx displayModelEx, int i2, int i3, float f2, float f3, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i2 = displayModelEx.width;
        }
        if ((2 & i4) != 0) {
            i3 = displayModelEx.height;
        }
        if ((i4 + 4) - (4 | i4) != 0) {
            f2 = displayModelEx.xdpi;
        }
        if ((i4 + 8) - (i4 | 8) != 0) {
            f3 = displayModelEx.ydpi;
        }
        return displayModelEx.copy(i2, i3, f2, f3);
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

    public final DisplayModelEx copy(int i2, int i3, float f2, float f3) {
        return new DisplayModelEx(i2, i3, f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisplayModelEx)) {
            return false;
        }
        DisplayModelEx displayModelEx = (DisplayModelEx) obj;
        return this.width == displayModelEx.width && this.height == displayModelEx.height && Intrinsics.areEqual((Object) Float.valueOf(this.xdpi), (Object) Float.valueOf(displayModelEx.xdpi)) && Intrinsics.areEqual((Object) Float.valueOf(this.ydpi), (Object) Float.valueOf(displayModelEx.ydpi));
    }

    public final int getHeight() {
        return this.height;
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
        return (((((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31) + Float.hashCode(this.xdpi)) * 31) + Float.hashCode(this.ydpi);
    }

    public String toString() {
        return "DisplayModelEx(width=" + this.width + ", height=" + this.height + ", xdpi=" + this.xdpi + ", ydpi=" + this.ydpi + ')';
    }
}
