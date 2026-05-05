package com.facebook.react.views.image;

import android.graphics.Shader;
import com.facebook.common.logging.FLog;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.react.common.ReactConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005%4\u0012\u000e\u0007nʑA0ZeP.XU0Ʀk\u0012éT[Rp\u0004@[\u001aԥ&\t]N0m|Qr\u000bq\u0017L\u001bAp:Rmx\f\u001cU7\u000b\u007fM>eokC\u0011zD\u00118487(\u0007G\u001frX\u001e\u0004\u0013Cy\u0014B6N|RT#L3\u001cX\u000b\u000f,\u000f\u001ftg|8\u001fǐ0Ơ3#\u000b݃\u0013Z5bH|{\u000f\u001dÙy˼za&Ѩ\u0011CC\u0019=S1\t)¼\u0012ƄCqEݛ9350as\u00068/ßfƦ/O\u0015ƞC2j\u000bi`:)\u0002Օ6ׂT\u000e0»ߧ\u007f\u001b"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#a(3o\u0016\u001bMQ?\u00014\u0006\u001fga\u000f", "", "u(E", " DB\u0016M\f8;\u0003]ZX\n\\q\u001eEl", "", " DB\u0016M\f8;\u0003]ZX\nfq\u001eAc\u0011", " DB\u0016M\f8;\u0003]ZX\nfy\u000fR", " DB\u0016M\f8;\u0003]ZX\u0019\\s\u000fAn", " DB\u0016M\f8;\u0003]ZX\u001aku\u000fT]\u000b", "2dU.h3MB\u001d\u0006zF6{\t", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0016~<\u007f\u0017$\u0006^\u0012Cv\r?X}u", "2dU.h3MD\u0015\u0006\u000b^", "\u001ab^:\"-:Q\u0019{\u0005h2F\b<a\u0012({\n\u007f$\u0013Yk\u000bCvn#Wy';v\u0018\u001e\\GByr\f\u0013dh9uw7NL", "BnB0T3>B-\nz", "@db6m,&]\u0018~kZ3\r\t", "BnC6_,&]\u0018~", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ImageResizeMode {
    public static final ImageResizeMode INSTANCE = new ImageResizeMode();
    private static final String RESIZE_MODE_CENTER = "center";
    private static final String RESIZE_MODE_CONTAIN = "contain";
    private static final String RESIZE_MODE_COVER = "cover";
    private static final String RESIZE_MODE_REPEAT = "repeat";
    private static final String RESIZE_MODE_STRETCH = "stretch";

    private ImageResizeMode() {
    }

    @JvmStatic
    public static final Shader.TileMode defaultTileMode() {
        return Shader.TileMode.CLAMP;
    }

    @JvmStatic
    public static final ScalingUtils.ScaleType defaultValue() {
        ScalingUtils.ScaleType CENTER_CROP = ScalingUtils.ScaleType.CENTER_CROP;
        Intrinsics.checkNotNullExpressionValue(CENTER_CROP, "CENTER_CROP");
        return CENTER_CROP;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JvmStatic
    public static final ScalingUtils.ScaleType toScaleType(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals(RESIZE_MODE_STRETCH)) {
                        ScalingUtils.ScaleType FIT_XY = ScalingUtils.ScaleType.FIT_XY;
                        Intrinsics.checkNotNullExpressionValue(FIT_XY, "FIT_XY");
                        return FIT_XY;
                    }
                    break;
                case -1364013995:
                    if (str.equals(RESIZE_MODE_CENTER)) {
                        ScalingUtils.ScaleType CENTER_INSIDE = ScalingUtils.ScaleType.CENTER_INSIDE;
                        Intrinsics.checkNotNullExpressionValue(CENTER_INSIDE, "CENTER_INSIDE");
                        return CENTER_INSIDE;
                    }
                    break;
                case -934531685:
                    if (str.equals(RESIZE_MODE_REPEAT)) {
                        return ScaleTypeStartInside.Companion.getINSTANCE();
                    }
                    break;
                case 94852023:
                    if (str.equals(RESIZE_MODE_COVER)) {
                        ScalingUtils.ScaleType CENTER_CROP = ScalingUtils.ScaleType.CENTER_CROP;
                        Intrinsics.checkNotNullExpressionValue(CENTER_CROP, "CENTER_CROP");
                        return CENTER_CROP;
                    }
                    break;
                case 951526612:
                    if (str.equals(RESIZE_MODE_CONTAIN)) {
                        ScalingUtils.ScaleType FIT_CENTER = ScalingUtils.ScaleType.FIT_CENTER;
                        Intrinsics.checkNotNullExpressionValue(FIT_CENTER, "FIT_CENTER");
                        return FIT_CENTER;
                    }
                    break;
            }
        }
        if (str != null) {
            FLog.w(ReactConstants.TAG, "Invalid resize mode: '" + str + "'");
        }
        return defaultValue();
    }

    @JvmStatic
    public static final Shader.TileMode toTileMode(String str) {
        if (Intrinsics.areEqual(RESIZE_MODE_CONTAIN, str) || Intrinsics.areEqual(RESIZE_MODE_COVER, str) || Intrinsics.areEqual(RESIZE_MODE_STRETCH, str) || Intrinsics.areEqual(RESIZE_MODE_CENTER, str)) {
            return Shader.TileMode.CLAMP;
        }
        if (Intrinsics.areEqual(RESIZE_MODE_REPEAT, str)) {
            return Shader.TileMode.REPEAT;
        }
        if (str != null) {
            FLog.w(ReactConstants.TAG, "Invalid resize mode: '" + str + "'");
        }
        return defaultTileMode();
    }
}
