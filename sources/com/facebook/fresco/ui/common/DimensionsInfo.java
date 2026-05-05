package com.facebook.fresco.ui.common;

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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4F\u0007\":\u001e\u007f\u0007l{A0RnP.XU0Ŧq\u0012éT[Rp\u0004ve\u001e\f\"!O|hwrX\\#C=\u0007&|x/aU'^\"\u0013@F\b?aN\u007fAGe\r63!B&F\u007f\u001d\u0001H+X\u0014\u0005\u0002[K:\u001aضDpH[UT\u0013-*\u0006l!Gɭ]0UD\\\u0005]h0iʌj\u000bU5tH|{\u000e\rĝ(U}o4C@e6[ȳTK\u000e`rW\u0003mr\u0004ޢio.9a\fWdYFг\u0016sV\u001bv\u000b&\u000b\r\u0018ԧ\rox]}cP<ߊ(\u0001\u0002\rJ\u0004&\u0006UI^3 f\u0016\u0010Kt!TpV\b^P\u0003\u0013ad\u0018U\u00069+G\u001f~Q\u0010<IT={\u0013\u00126#/oQaZ\u000en\u001b3T&RaWF=VU\"YkuJΖaJ;\u0012K_\u007f]\u0018A4%BO]O\"OjHҝD0|\u0013~\u0001S\u0018S\u000fTju$VB\t:b\u000bµ\u0004<_b^D\u0011{\u001dΤ\u000b\u0004\u0010ʶ8^}F/0`]]m\u0002j{^ܦ)5nŽqpq\u001aeD/BCU{\u0010\u0010Sλ\u0018EDϵ\u001dZlOa\u0017+k6%JH\u0019\u0011ȑ\u007fJVۼ+4E\u007f*?|@'c-H1&նE\u0003\u0011ݠrj\u0016\u000ebCt\u0012w&\r\t/Qʷtuoծa.\u0003q08\u0012`C\u0019>UPiط\u0001)\u000fѨ\f\u0002MyZRƫp6"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\u0011\u001b`Ey\u0016D\u0001.~8\u0002(7v$2WLIO=\u001f\u001f>", "", "DhTDc6Kb\u000b\u0003ym/", "", "DhTDc6Kb{~~`/\f", "3mR<W,=7!z|^\u001e\u0001\b>h", "3mR<W,=7!z|^\u000f|\r1h\u000f", "2dR<W,=7!z|^\u001e\u0001\b>h", "2dR<W,=7!z|^\u000f|\r1h\u000f", "AbP9X\u001bR^\u0019", "", "uH8\u0016<\u0010\":\u001ez\fZu\u0004\u00058gI\u0016\u000bM\u0005 \u0019\u001d3~", "5dc\u0011X*HR\u0019}^f(~\t\u0012e\u0004*~O", "u(8", "5dc\u0011X*HR\u0019}^f(~\t!i~7~", "5dc\u0012a*HR\u0019}^f(~\t\u0012e\u0004*~O", "5dc\u0012a*HR\u0019}^f(~\t!i~7~", "5dc V(ES\b\u0013\u0006^", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc#\\,P^#\f\nA,\u0001\u000b2t", "5dc#\\,P^#\f\nP0{\u00182", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "Ch\u001c0b4F]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DimensionsInfo {
    private final int decodedImageHeight;
    private final int decodedImageWidth;
    private final int encodedImageHeight;
    private final int encodedImageWidth;
    private final String scaleType;
    private final int viewportHeight;
    private final int viewportWidth;

    public DimensionsInfo(int i2, int i3, int i4, int i5, int i6, int i7, String scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.viewportWidth = i2;
        this.viewportHeight = i3;
        this.encodedImageWidth = i4;
        this.encodedImageHeight = i5;
        this.decodedImageWidth = i6;
        this.decodedImageHeight = i7;
        this.scaleType = scaleType;
    }

    public static /* synthetic */ DimensionsInfo copy$default(DimensionsInfo dimensionsInfo, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, Object obj) {
        if ((-1) - (((-1) - i8) | ((-1) - 1)) != 0) {
            i2 = dimensionsInfo.viewportWidth;
        }
        if ((-1) - (((-1) - i8) | ((-1) - 2)) != 0) {
            i3 = dimensionsInfo.viewportHeight;
        }
        if ((-1) - (((-1) - i8) | ((-1) - 4)) != 0) {
            i4 = dimensionsInfo.encodedImageWidth;
        }
        if ((8 & i8) != 0) {
            i5 = dimensionsInfo.encodedImageHeight;
        }
        if ((-1) - (((-1) - i8) | ((-1) - 16)) != 0) {
            i6 = dimensionsInfo.decodedImageWidth;
        }
        if ((-1) - (((-1) - i8) | ((-1) - 32)) != 0) {
            i7 = dimensionsInfo.decodedImageHeight;
        }
        if ((i8 & 64) != 0) {
            str = dimensionsInfo.scaleType;
        }
        return dimensionsInfo.copy(i2, i3, i4, i5, i6, i7, str);
    }

    public final int component1() {
        return this.viewportWidth;
    }

    public final int component2() {
        return this.viewportHeight;
    }

    public final int component3() {
        return this.encodedImageWidth;
    }

    public final int component4() {
        return this.encodedImageHeight;
    }

    public final int component5() {
        return this.decodedImageWidth;
    }

    public final int component6() {
        return this.decodedImageHeight;
    }

    public final String component7() {
        return this.scaleType;
    }

    public final DimensionsInfo copy(int i2, int i3, int i4, int i5, int i6, int i7, String scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        return new DimensionsInfo(i2, i3, i4, i5, i6, i7, scaleType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.facebook.fresco.ui.common.DimensionsInfo");
        DimensionsInfo dimensionsInfo = (DimensionsInfo) obj;
        return this.viewportWidth == dimensionsInfo.viewportWidth && this.viewportHeight == dimensionsInfo.viewportHeight && this.encodedImageWidth == dimensionsInfo.encodedImageWidth && this.encodedImageHeight == dimensionsInfo.encodedImageHeight && this.decodedImageWidth == dimensionsInfo.decodedImageWidth && this.decodedImageHeight == dimensionsInfo.decodedImageHeight && Intrinsics.areEqual(this.scaleType, dimensionsInfo.scaleType);
    }

    public final int getDecodedImageHeight() {
        return this.decodedImageHeight;
    }

    public final int getDecodedImageWidth() {
        return this.decodedImageWidth;
    }

    public final int getEncodedImageHeight() {
        return this.encodedImageHeight;
    }

    public final int getEncodedImageWidth() {
        return this.encodedImageWidth;
    }

    public final String getScaleType() {
        return this.scaleType;
    }

    public final int getViewportHeight() {
        return this.viewportHeight;
    }

    public final int getViewportWidth() {
        return this.viewportWidth;
    }

    public int hashCode() {
        return (((((((((((this.viewportWidth * 31) + this.viewportHeight) * 31) + this.encodedImageWidth) * 31) + this.encodedImageHeight) * 31) + this.decodedImageWidth) * 31) + this.decodedImageHeight) * 31) + this.scaleType.hashCode();
    }

    public String toString() {
        return "DimensionsInfo(viewportWidth=" + this.viewportWidth + ", viewportHeight=" + this.viewportHeight + ", encodedImageWidth=" + this.encodedImageWidth + ", encodedImageHeight=" + this.encodedImageHeight + ", decodedImageWidth=" + this.decodedImageWidth + ", decodedImageHeight=" + this.decodedImageHeight + ", scaleType=" + this.scaleType + ")";
    }
}
