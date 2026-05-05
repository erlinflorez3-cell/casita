package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: LayoutCoordinates.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!4i\bDZc|\u0004G\b8\u000bDB\u0007\"2\u0015\u0010\u000ftʑQ0rdp.\u0001SB\u0017y|L$\n#\u001aCiU2\u00060\u000bgN\u0016f\u0017J\t\u000b[\u0017\u0014\u0019\u0011jZI}x\f\u0012'?PsW3{te9\u000ftȥ\t @(P\u0007\u0013\b2*v\u0015\u001fzqKë\u00160NvR_\u001bU\u001d\u001a@\u000bf /\u001e֔kNDN\u0005jH8;\u0003\u0018Gv'\u000e0ƊQ\rTZܴ\u0011\u0001"}, d2 = {"0nd;W:\"\\\u0004z\b^5\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "0nd;W:\"\\\u0006\t\u0005m", "0nd;W:\"\\\u000b\u0003\u0004]6\u000f", "4h]1E6Hbv\t\u0005k+\u0001\u0012+t\u007f6", ">nb6g0H\\|\beZ9|\u0012>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7|k", ">nb6g0H\\|\bgh6\f", ">nb6g0H\\|\blb5{\u0013A", ">nb6g0H\\\u0003\bh\\9|\t8", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LayoutCoordinatesKt {
    public static final long positionInRoot(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo5525localToRootMKHz9U(Offset.Companion.m3953getZeroF1C5BW0());
    }

    public static final long positionInWindow(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo5527localToWindowMKHz9U(Offset.Companion.m3953getZeroF1C5BW0());
    }

    public static final long positionOnScreen(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo5526localToScreenMKHz9U(Offset.Companion.m3953getZeroF1C5BW0());
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates) {
        return LayoutCoordinates.localBoundingBoxOf$default(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = findRootCoordinates(layoutCoordinates);
        float fM6808getWidthimpl = IntSize.m6808getWidthimpl(layoutCoordinatesFindRootCoordinates.mo5522getSizeYbymL2g());
        float fM6807getHeightimpl = IntSize.m6807getHeightimpl(layoutCoordinatesFindRootCoordinates.mo5522getSizeYbymL2g());
        Rect rectBoundsInRoot = boundsInRoot(layoutCoordinates);
        float left = rectBoundsInRoot.getLeft();
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > fM6808getWidthimpl) {
            left = fM6808getWidthimpl;
        }
        float top = rectBoundsInRoot.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > fM6807getHeightimpl) {
            top = fM6807getHeightimpl;
        }
        float right = rectBoundsInRoot.getRight();
        if (right < 0.0f) {
            right = 0.0f;
        }
        if (right <= fM6808getWidthimpl) {
            fM6808getWidthimpl = right;
        }
        float bottom = rectBoundsInRoot.getBottom();
        float f2 = bottom >= 0.0f ? bottom : 0.0f;
        if (f2 <= fM6807getHeightimpl) {
            fM6807getHeightimpl = f2;
        }
        if (left == fM6808getWidthimpl || top == fM6807getHeightimpl) {
            return Rect.Companion.getZero();
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
        return new Rect(fMin, Math.min(fM3938getYimpl, Math.min(fM3938getYimpl2, Math.min(fM3938getYimpl3, fM3938getYimpl4))), fMax, Math.max(fM3938getYimpl, Math.max(fM3938getYimpl2, Math.max(fM3938getYimpl3, fM3938getYimpl4))));
    }

    public static final long positionInParent(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo5523localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m3953getZeroF1C5BW0()) : Offset.Companion.m3953getZeroF1C5BW0();
    }

    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates) {
        Rect rectLocalBoundingBoxOf$default;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(0.0f, 0.0f, IntSize.m6808getWidthimpl(layoutCoordinates.mo5522getSizeYbymL2g()), IntSize.m6807getHeightimpl(layoutCoordinates.mo5522getSizeYbymL2g())) : rectLocalBoundingBoxOf$default;
    }

    public static final LayoutCoordinates findRootCoordinates(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = parentLayoutCoordinates;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates2 instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates2 : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy$ui_release = nodeCoordinator.getWrappedBy$ui_release();
        while (true) {
            NodeCoordinator nodeCoordinator2 = nodeCoordinator;
            nodeCoordinator = wrappedBy$ui_release;
            if (nodeCoordinator != null) {
                wrappedBy$ui_release = nodeCoordinator.getWrappedBy$ui_release();
            } else {
                return nodeCoordinator2;
            }
        }
    }
}
