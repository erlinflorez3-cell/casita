package com.facebook.react.views.imagehelper;

import android.content.Context;
import android.net.Uri;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007tnA0JfP.`\\2\u000fq\u0002<$q$yCAZ\"}0\u000fWNmgt^pŏa*6\u0016'idHp9\t\u0018\u0014BF}?KM\u001e>If\u00038\u001d\"H!f|\u0015\u0007 *V\u0014\u000fzqP\u001c\u00186@~@j\r{\nܨ\u0016\u0006L'I,j|f6v~\u000e>=#\u001bipOm_x\u000b[#^TU\u001f'e,+X7c\u0016kSK\u0018`rW\u0003mzm\u000bv??-_r\u00065\u001fó\u0014]1]&urTvKe1\u001853gcyYdߍ\u0004ߡ\u007f\rDǉ^\u00185RF-Ho>b\nϖtՂDT\u001a`H\n\tl\u0007&3\fK+g ƻUgCϊf9\u0002\u0012\u001b,s\u0012|#sV$_C\u001eƻ{W9҅X?N]\u0018i\u000e\u007f\u0012\u0002z\u0002X\u0016\u0007ϱ\u0002\u009e\u007f\u00176Ϗ=9aL15Ȧ\u0006d"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5\\}'Bm#w1K7m4\f\u001fxn7\u00079", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "And?V,", "", "EhSA[", "", "6dX4[;", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6ssG%*", "-hb\u001fX:Hc&|z", "", "7rA2f6N`\u0017~", "u(I", "Ahi2", "5dc \\A>", "u(3", "5dc b<KQ\u0019", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "CqX", "\u001a`]1e6BRb\bzmul\u00163;", "5dc\"e0", "u(;.a+K]\u001d}Dg,\fR\u001fr\u0004}", "1n\\=h;>:#|ve\u001c\n\r", "1n\\=h;>C&\u0003", "3pd._:", "=sW2e", "6`b566=S", "", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class ImageSource {
    public static final Companion Companion = new Companion(null);
    private static final String TRANSPARENT_BITMAP_URI = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII=";
    private boolean _isResource;
    private final double size;
    private final String source;
    private final Uri uri;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007fјnjO0L͜N\u0093Siճ?k*3d`*qٴ?U(}j\u0017]Q\u007fg\u001dN\u000b\u000fQ\u0014\u001e\u0016'prN&\u0005k\u0013'2pq\u0016ݏ ڱA9hҚȫ\t'"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5\\}'Bm#w1K7m4\f\u001fxn7\u0007\"\nX~2CUR6e(", "", "u(E", "\"Q0\u001bF\u0017\u001a@xgiX\t`w\u0017Aj\"k-d", "", "5dc!e(Ga$z\b^5\fe3t\b$\u0007$\t\u0013\u0019G]\u0018L\u0004#5", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5\\}'Bm#w1K7m4\f\u001fxn7\u00079", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ImageSource getTransparentBitmapImageSource(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new ImageSource(context, ImageSource.TRANSPARENT_BITMAP_URI, 0.0d, 0.0d, 12, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageSource(Context context, String str) {
        this(context, str, 0.0d, 0.0d, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageSource(Context context, String str, double d2) {
        this(context, str, d2, 0.0d, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public ImageSource(Context context, String str, double d2, double d3) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.source = str;
        this.uri = computeUri(context);
        this.size = d2 * d3;
    }

    public /* synthetic */ ImageSource(Context context, String str, double d2, double d3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i2 + 4) - (4 | i2) != 0 ? 0.0d : d2, (i2 + 8) - (i2 | 8) == 0 ? d3 : 0.0d);
    }

    private final Uri computeLocalUri(Context context) {
        this._isResource = true;
        return ResourceDrawableIdHelper.Companion.getInstance().getResourceDrawableUri(context, this.source);
    }

    private final Uri computeUri(Context context) {
        try {
            Uri uriComputeLocalUri = Uri.parse(this.source);
            if (uriComputeLocalUri.getScheme() == null) {
                uriComputeLocalUri = computeLocalUri(context);
            }
            Intrinsics.checkNotNull(uriComputeLocalUri);
            return uriComputeLocalUri;
        } catch (NullPointerException unused) {
            return computeLocalUri(context);
        }
    }

    @JvmStatic
    public static final ImageSource getTransparentBitmapImageSource(Context context) {
        return Companion.getTransparentBitmapImageSource(context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(getClass(), obj.getClass())) {
            return false;
        }
        ImageSource imageSource = (ImageSource) obj;
        return Double.compare(imageSource.size, this.size) == 0 && isResource() == imageSource.isResource() && Intrinsics.areEqual(getUri(), imageSource.getUri()) && Intrinsics.areEqual(this.source, imageSource.source);
    }

    public final double getSize() {
        return this.size;
    }

    public final String getSource() {
        return this.source;
    }

    public Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return Objects.hash(getUri(), this.source, Double.valueOf(this.size), Boolean.valueOf(isResource()));
    }

    public boolean isResource() {
        return this._isResource;
    }
}
