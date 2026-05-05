package com.biocatch.client.android.sdk.contract.externalCollectors.continuousCollectors.touchEvents;

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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\":\u0017\u007f\u0007ljA0RiP.Xs2\u000fy\u0005<$a%yCIa\"Ԃ(ޢUdʴ\u0018nxYK\u001f\u001f\n$x\u0003,wV\ta \u0011JB\u001e@CQ}@Q`#:\u0015$@'Py3\u0005*.V\u0016\u000fzqR\u001c\u0016>H\t:\u0001\u000e]\t(\u001b\u001e>N\b.`uXNH\u001b^J31\u000e\u0002B|+o4\u000bY%F\u0003+\u001dzo+C@e9չ)S\u0011\u0015\u001bbM Wqk\u0006/Ү(sP\u0002uNX.\u0018[܇PUd\u0001Et\u0005\u007fdR˳,\u0018jYp&(&{Bɥ=L\u0015\u0014H`.[\u001e-ۣ\u000f{{\u0001uXP0b\tɜ{*=%H\u00183Y@aǟR*B'rO{3\u000edƇ\u00027(iy&`C\"\u001bɴRyXNc`N8Z\u0004Ѯ\u00059i\u0010Q\u001c0u\u0004uʌ\u0012v\r3_s9Qܩ\u001c\bNDuv\u001d`\u0017T\u001aXN@0p.7X\n<`Jd\u0013nhT\u00070AS\"T\u0015\u0003 \u0013N`(B'%\u001eTgh\u0018q}c\u0010%=nOY\u001dl>]?^A>ic>h\u0003|\u001a?Jl\u001dX\u0015C\u0004\u0012`\\6-JH\u0019\u0014(\u0002JN\u001a\u001fJ?  d27\u0019j\"`\u0003LF\bӘ\b(kv9\u0017TaN3o2 !\u0003f[\u001fn.ׅJt\u0004nNEA\u007f6_ŶTjoB*;\u0007-\"Fŏf\u001dVZl.u\u0004|°\u001a A֗G?\u0019\u001e\r9\u0003\u0011;Odr\u0014R̊\u0016-\u0003۠\u0012\u0011Ay<wXy~.xjxPݚ\u001b(~ܥ\u000b%\u000ev\u000e\n2U\tM{T9bƏMx\u000bʛTP>\u0010\u00133n4\u000fw:|c.ϡ+#\u001eߐ,1\u001bvky@=\bk'&#lנ0i\u001e˱zScHIL\u001ah\rI:$\u001b\u0007\u074cLp\u007f٤Z\u000b:$A`\u0012s~YPM93̱j\r4ݸ\tXaS!\bNC<dBsq\u0002љbI-ݎeUm\b{c-\u001aX\u001b\"\u000b*5ߎ\u0016\"EղnYh$>\u001eD'DNSb3@ʢ(:4ф \rIpw\u001eش~/"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<;\u001e\u001bi\u0012W;\u0017\u0015g\u001f.uK7\u001d\u00176V\u0010\u0005w\u000b\u001c\u0014\u0011\u0015{pKe\u001e\u0011h\u001f\u0006?,HWYh\t/KDb1D\u001f5", "", "6`b5", "", "@dR<Z5Bb\u001d\t\u0004L;x\u0018/", "Bnd0[\u001aBh\u0019fvc6\n", "", "Bnd0[\u001aBh\u0019f~g6\n", "Ahi2", "", "And?V,-g$~", "Bnd0[\bKS\u0015h\bb,\u0006\u0018+t\u00042\u0005", ">nX;g,K7w", "Bnd0[\u0017KS'\r\u000bk,", "F", "G", "uH8\u00139\u000b\"2|_[?om", "5dc\u0015T:A", "u(8", "5dc\u001db0Gb\u0019\f^=", "5dc\u001fX*HU\"\u0003\nb6\u0006v>a\u000f(", "5dc \\A>", "u(3", "5dc b<KQ\u0019m\u000fi,", "5dc!b<<Vt\fzZ\u0016\n\r/n\u000f$\u000bD\u000b ", "5dc!b<<V\u0004\fzl:\r\u0016/", "u(5", "5dc!b<<V\u0007\u0003\u0010^\u0014x\u000e9r", "5dc!b<<V\u0007\u0003\u0010^\u0014\u0001\u00129r", "5dc%", "5dc&", "1n\\=b5>\\(J", "1n\\=b5>\\(JE", "1n\\=b5>\\(JF", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TouchEventModelEx {
    private final int hash;
    private final int pointerID;
    private final int recognitionState;
    private final double size;
    private final int sourceType;
    private final double touchAreaOrientation;
    private final float touchPressure;
    private final float touchSizeMajor;
    private final float touchSizeMinor;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f2630x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f2631y;

    public TouchEventModelEx(int i2, int i3, float f2, float f3, double d2, int i4, double d3, int i5, float f4, float f5, float f6) {
        this.hash = i2;
        this.recognitionState = i3;
        this.touchSizeMajor = f2;
        this.touchSizeMinor = f3;
        this.size = d2;
        this.sourceType = i4;
        this.touchAreaOrientation = d3;
        this.pointerID = i5;
        this.touchPressure = f4;
        this.f2630x = f5;
        this.f2631y = f6;
    }

    public static /* synthetic */ TouchEventModelEx copy$default(TouchEventModelEx touchEventModelEx, int i2, int i3, float f2, float f3, double d2, int i4, double d3, int i5, float f4, float f5, float f6, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = touchEventModelEx.hash;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 2)) != 0) {
            i3 = touchEventModelEx.recognitionState;
        }
        if ((i6 + 4) - (i6 | 4) != 0) {
            f2 = touchEventModelEx.touchSizeMajor;
        }
        if ((i6 & 8) != 0) {
            f3 = touchEventModelEx.touchSizeMinor;
        }
        if ((i6 + 16) - (i6 | 16) != 0) {
            d2 = touchEventModelEx.size;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 32)) != 0) {
            i4 = touchEventModelEx.sourceType;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 64)) != 0) {
            d3 = touchEventModelEx.touchAreaOrientation;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 128)) != 0) {
            i5 = touchEventModelEx.pointerID;
        }
        if ((i6 + 256) - (i6 | 256) != 0) {
            f4 = touchEventModelEx.touchPressure;
        }
        if ((i6 + 512) - (i6 | 512) != 0) {
            f5 = touchEventModelEx.f2630x;
        }
        if ((i6 + 1024) - (i6 | 1024) != 0) {
            f6 = touchEventModelEx.f2631y;
        }
        return touchEventModelEx.copy(i2, i3, f2, f3, d2, i4, d3, i5, f4, f5, f6);
    }

    public final int component1() {
        return this.hash;
    }

    public final float component10() {
        return this.f2630x;
    }

    public final float component11() {
        return this.f2631y;
    }

    public final int component2() {
        return this.recognitionState;
    }

    public final float component3() {
        return this.touchSizeMajor;
    }

    public final float component4() {
        return this.touchSizeMinor;
    }

    public final double component5() {
        return this.size;
    }

    public final int component6() {
        return this.sourceType;
    }

    public final double component7() {
        return this.touchAreaOrientation;
    }

    public final int component8() {
        return this.pointerID;
    }

    public final float component9() {
        return this.touchPressure;
    }

    public final TouchEventModelEx copy(int i2, int i3, float f2, float f3, double d2, int i4, double d3, int i5, float f4, float f5, float f6) {
        return new TouchEventModelEx(i2, i3, f2, f3, d2, i4, d3, i5, f4, f5, f6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TouchEventModelEx)) {
            return false;
        }
        TouchEventModelEx touchEventModelEx = (TouchEventModelEx) obj;
        return this.hash == touchEventModelEx.hash && this.recognitionState == touchEventModelEx.recognitionState && Intrinsics.areEqual((Object) Float.valueOf(this.touchSizeMajor), (Object) Float.valueOf(touchEventModelEx.touchSizeMajor)) && Intrinsics.areEqual((Object) Float.valueOf(this.touchSizeMinor), (Object) Float.valueOf(touchEventModelEx.touchSizeMinor)) && Intrinsics.areEqual((Object) Double.valueOf(this.size), (Object) Double.valueOf(touchEventModelEx.size)) && this.sourceType == touchEventModelEx.sourceType && Intrinsics.areEqual((Object) Double.valueOf(this.touchAreaOrientation), (Object) Double.valueOf(touchEventModelEx.touchAreaOrientation)) && this.pointerID == touchEventModelEx.pointerID && Intrinsics.areEqual((Object) Float.valueOf(this.touchPressure), (Object) Float.valueOf(touchEventModelEx.touchPressure)) && Intrinsics.areEqual((Object) Float.valueOf(this.f2630x), (Object) Float.valueOf(touchEventModelEx.f2630x)) && Intrinsics.areEqual((Object) Float.valueOf(this.f2631y), (Object) Float.valueOf(touchEventModelEx.f2631y));
    }

    public final int getHash() {
        return this.hash;
    }

    public final int getPointerID() {
        return this.pointerID;
    }

    public final int getRecognitionState() {
        return this.recognitionState;
    }

    public final double getSize() {
        return this.size;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    public final double getTouchAreaOrientation() {
        return this.touchAreaOrientation;
    }

    public final float getTouchPressure() {
        return this.touchPressure;
    }

    public final float getTouchSizeMajor() {
        return this.touchSizeMajor;
    }

    public final float getTouchSizeMinor() {
        return this.touchSizeMinor;
    }

    public final float getX() {
        return this.f2630x;
    }

    public final float getY() {
        return this.f2631y;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.hash) * 31) + Integer.hashCode(this.recognitionState)) * 31) + Float.hashCode(this.touchSizeMajor)) * 31) + Float.hashCode(this.touchSizeMinor)) * 31) + Double.hashCode(this.size)) * 31) + Integer.hashCode(this.sourceType)) * 31) + Double.hashCode(this.touchAreaOrientation)) * 31) + Integer.hashCode(this.pointerID)) * 31) + Float.hashCode(this.touchPressure)) * 31) + Float.hashCode(this.f2630x)) * 31) + Float.hashCode(this.f2631y);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TouchEventModelEx(hash=");
        sb.append(this.hash).append(", recognitionState=").append(this.recognitionState).append(", touchSizeMajor=").append(this.touchSizeMajor).append(", touchSizeMinor=").append(this.touchSizeMinor).append(", size=").append(this.size).append(", sourceType=").append(this.sourceType).append(", touchAreaOrientation=").append(this.touchAreaOrientation).append(", pointerID=").append(this.pointerID).append(", touchPressure=").append(this.touchPressure).append(", x=").append(this.f2630x).append(", y=").append(this.f2631y).append(')');
        return sb.toString();
    }
}
