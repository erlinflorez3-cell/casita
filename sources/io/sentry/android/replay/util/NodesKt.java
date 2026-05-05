package io.sentry.android.replay.util;

import android.graphics.Rect;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntSize;
import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!,n\bDJg|\u0004W\u00068\u000bDB\u0007\"2\u0017\u007f\u0007|jA0ZeP\u008cZS@\u000fsڔ<$i-yّS|(Ԃ:\t}M\u0018k|Jr\u000bq\u000e6\u001a\u0007kDI\u0004w\u000e\u0016\u001d4Zom2}sK<xtd\u0004f݈(P!\u0013\u00052*v\u000f'~QK$\u0012^?!>`\u000ee\u0005H\u00116B.\u00036\\\u0016MfLz`R/Q\u00020ĬT?s>\u0002e\rtZO\r%hN1N?M\u0017;R1\u000e\u0019¹W\u0016MzU\u0005\u0017&O+wr\b:f\n,\u0015YNSơx>o\u0013\\x\fU*wcyO>,\u0006\u0007\u0014\rj\u0003Tͽ-`I;'~\b<2\u001dr\u0002?\u0001\u0006lL\u0018z\u00105G)\u000e?C9Ie\u0018ĨA1ZE\n\u001d\u000f4\"/}I[\u0003\u001e'ٽ3^\u0006bIQnOpN8i\u0004Ч\u001czp\u0015B\u0004^[(/* tϏÏ;p"}, d2 = {"4`bA@(Q=\u001a", "", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "1", ExifInterface.GPS_MEASUREMENT_2D, "4`bA@0G=\u001a", "0nd;W:\"\\\u000b\u0003\u0004]6\u000f", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "@n^A66H`\u0018\u0003\u0004Z;|\u0017", "4`bA66>`\u0017~Vm\u0013|\u0005=t", ";h]6`<FD\u0015\u0006\u000b^", "4`bA66>`\u0017~Vm\u0014\u0007\u0017>", ";`g6`<FD\u0015\u0006\u000b^", "4`bA66>`\u0017~^g", "4h]1C(B\\(~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n@U\u0002)Fm#w8??tC\u001e\">", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "4h]1G,Qbt\u000e\nk0y\u0019>e\u000e", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001eKz,~H}3FI%=ZG8{C\u001e#>", "7r<.f2:P ~", "", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class NodesKt {
    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = layoutCoordinates2;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        if (layoutCoordinatesFindRootCoordinates == null) {
            layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates);
        }
        float fM6808getWidthimpl = IntSize.m6808getWidthimpl(layoutCoordinatesFindRootCoordinates.mo5522getSizeYbymL2g());
        float fM6807getHeightimpl = IntSize.m6807getHeightimpl(layoutCoordinatesFindRootCoordinates.mo5522getSizeYbymL2g());
        androidx.compose.ui.geometry.Rect rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(layoutCoordinatesFindRootCoordinates, layoutCoordinates, false, 2, null);
        float left = rectLocalBoundingBoxOf$default.getLeft();
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > fM6808getWidthimpl) {
            left = fM6808getWidthimpl;
        }
        float top = rectLocalBoundingBoxOf$default.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > fM6807getHeightimpl) {
            top = fM6807getHeightimpl;
        }
        float right = rectLocalBoundingBoxOf$default.getRight();
        if (right < 0.0f) {
            right = 0.0f;
        }
        if (right <= fM6808getWidthimpl) {
            fM6808getWidthimpl = right;
        }
        float bottom = rectLocalBoundingBoxOf$default.getBottom();
        float f2 = bottom >= 0.0f ? bottom : 0.0f;
        if (f2 <= fM6807getHeightimpl) {
            fM6807getHeightimpl = f2;
        }
        if (left == fM6808getWidthimpl || top == fM6807getHeightimpl) {
            return new Rect();
        }
        long jMo5527localToWindowMKHz9U = layoutCoordinatesFindRootCoordinates.mo5527localToWindowMKHz9U(OffsetKt.Offset(left, top));
        long jMo5527localToWindowMKHz9U2 = layoutCoordinatesFindRootCoordinates.mo5527localToWindowMKHz9U(OffsetKt.Offset(fM6808getWidthimpl, top));
        long jMo5527localToWindowMKHz9U3 = layoutCoordinatesFindRootCoordinates.mo5527localToWindowMKHz9U(OffsetKt.Offset(fM6808getWidthimpl, fM6807getHeightimpl));
        long jMo5527localToWindowMKHz9U4 = layoutCoordinatesFindRootCoordinates.mo5527localToWindowMKHz9U(OffsetKt.Offset(left, fM6807getHeightimpl));
        float fM3937getXimpl = Offset.m3937getXimpl(jMo5527localToWindowMKHz9U);
        float fM3937getXimpl2 = Offset.m3937getXimpl(jMo5527localToWindowMKHz9U2);
        float fM3937getXimpl3 = Offset.m3937getXimpl(jMo5527localToWindowMKHz9U4);
        float fM3937getXimpl4 = Offset.m3937getXimpl(jMo5527localToWindowMKHz9U3);
        float fMin = Math.min(fM3937getXimpl, Math.min(fM3937getXimpl2, Math.min(fM3937getXimpl3, fM3937getXimpl4)));
        float fMax = Math.max(fM3937getXimpl, Math.max(fM3937getXimpl2, Math.max(fM3937getXimpl3, fM3937getXimpl4)));
        float fM3938getYimpl = Offset.m3938getYimpl(jMo5527localToWindowMKHz9U);
        float fM3938getYimpl2 = Offset.m3938getYimpl(jMo5527localToWindowMKHz9U2);
        float fM3938getYimpl3 = Offset.m3938getYimpl(jMo5527localToWindowMKHz9U4);
        float fM3938getYimpl4 = Offset.m3938getYimpl(jMo5527localToWindowMKHz9U3);
        return new Rect((int) fMin, (int) Math.min(fM3938getYimpl, Math.min(fM3938getYimpl2, Math.min(fM3938getYimpl3, fM3938getYimpl4))), (int) fMax, (int) Math.max(fM3938getYimpl, Math.max(fM3938getYimpl2, Math.max(fM3938getYimpl3, fM3938getYimpl4))));
    }

    private static final float fastCoerceAtLeast(float f2, float f3) {
        return f2 < f3 ? f3 : f2;
    }

    private static final float fastCoerceAtMost(float f2, float f3) {
        return f2 > f3 ? f3 : f2;
    }

    private static final float fastCoerceIn(float f2, float f3, float f4) {
        if (f2 < f3) {
            f2 = f3;
        }
        return f2 > f4 ? f4 : f2;
    }

    private static final float fastMaxOf(float f2, float f3, float f4, float f5) {
        return Math.max(f2, Math.max(f3, Math.max(f4, f5)));
    }

    private static final float fastMinOf(float f2, float f3, float f4, float f5) {
        return Math.min(f2, Math.min(f3, Math.min(f4, f5)));
    }

    public static final Painter findPainter(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        List<ModifierInfo> modifierInfo = layoutNode.getModifierInfo();
        int size = modifierInfo.size();
        for (int i2 = 0; i2 < size; i2++) {
            Modifier modifier = modifierInfo.get(i2).getModifier();
            String name = modifier.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "modifier::class.java.name");
            if (StringsKt.contains$default((CharSequence) name, (CharSequence) "Painter", false, 2, (Object) null)) {
                try {
                    Field declaredField = modifier.getClass().getDeclaredField("painter");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(modifier);
                    if (obj instanceof Painter) {
                        return (Painter) obj;
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public static final TextAttributes findTextAttributes(LayoutNode layoutNode) {
        ColorProducer colorProducer;
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        List<ModifierInfo> modifierInfo = layoutNode.getModifierInfo();
        int size = modifierInfo.size();
        Color colorM4168boximpl = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            Modifier modifier = modifierInfo.get(i2).getModifier();
            String modifierClassName = modifier.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(modifierClassName, "modifierClassName");
            String str = modifierClassName;
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "Text", false, 2, (Object) null)) {
                try {
                    Field declaredField = modifier.getClass().getDeclaredField("color");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(modifier);
                    colorProducer = obj instanceof ColorProducer ? (ColorProducer) obj : null;
                } catch (Throwable unused) {
                }
                colorM4168boximpl = colorProducer != null ? Color.m4168boximpl(colorProducer.mo2078invoke0d7_KjU()) : null;
            } else if (StringsKt.contains$default((CharSequence) str, (CharSequence) "Fill", false, 2, (Object) null)) {
                z2 = true;
            }
        }
        return new TextAttributes(colorM4168boximpl, z2, null);
    }

    public static final boolean isMaskable(Painter painter) {
        Intrinsics.checkNotNullParameter(painter, "<this>");
        String className = painter.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(className, "className");
        String str = className;
        return (StringsKt.contains$default((CharSequence) str, (CharSequence) "Vector", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "Color", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "Brush", false, 2, (Object) null)) ? false : true;
    }
}
