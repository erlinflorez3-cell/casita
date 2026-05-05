package com.facebook.react.views.text.internal.span;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0018\u007f\u0007tjAӄLe^.Zݷ2\u000fy\u0007<$a%yCIZ\"}(\u000bWN}gvJ`\u000bK\u000f\u001c\u0016\u0001̓Bկ\u0006x\f\u0011?2po\u007fN]sK:xtd\u0007060;\u0012\u0005/\u001c:L\u001ez\u0013Cy\u000eܘ4@~?\u001b][\u000f2\u00124IP\u0005,h\u007fNdU\u001dcH=;\u0005\u007fA|6\u00104\u000b]%F\u0003)=zo/C@e7E)a\u0015\u001fR\nR3C\u007fQ\u001dhU)[M\u0002lNX.\u0016E/]#urT^5Un#?+}{\u0012dVZ\u0006\u0014\u0014\rj\u0006>\n5_F-H~8\u0014A\u0003\u000bUVO0mr\u0004\tqN\u0017S\u0002c/G,~Q\u0010=ITE\u0016\u001d\u000f4\"/\ngo%\u001dn\u00193T&SśUFEʰf\f_C{\u000bAq\u0010+\u001c0u\u0002\u009e\u007f\u00176Ϗ=9aA1(<\u0011VG\u007fv3bĈWoZ̲X$t\u001fE1Ç\u0010v"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001d<\n4~]\u0007/7z\u001f*T\rIv0'^WaL\u0016G5Uz0G=R,n=y9\u0012\u0012]\u0018U*\r\u0012GL w\u001a", "\u001a`]1e6BRb\u000ezq;F\u0017>y\u0007(E-\u0001\"\u001eCm\u000eDv.DG\t\u001c@C", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001d<\n4~]\u0007/7z\u001f*T\rIv0'^Ua5\u0005r\u001aYr0\u001d", "@dP0g\u001b:U", "", "EhSA[", "6dX4[;", "uH8\u0016\u001c\u001d", "5dc\u0015X0@V(", "u(8", "5dc\u001fX(<b\bz|", "5dc$\\+MV", "2qPD", "", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "BdgA", "", "AsP?g", "3mS", "F", "", "Bn_", "G", "0ncAb4", ">`X;g", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&l", "5dc \\A>", "4l", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&U(y\u0017K^%Df\u0002\u001eEQ\u001f=#", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class TextInlineViewPlaceholderSpan extends ReplacementSpan implements ReactSpan {
    private final int height;
    private final int reactTag;
    private final int width;

    public TextInlineViewPlaceholderSpan(int i2, int i3, int i4) {
        this.reactTag = i2;
        this.width = i3;
        this.height = i4;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getReactTag() {
        return this.reactTag;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = -this.height;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return this.width;
    }

    public final int getWidth() {
        return this.width;
    }
}
