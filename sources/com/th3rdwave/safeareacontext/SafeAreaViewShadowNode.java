package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\":$\u007fјnjG9LeN.ZS8\u0014sڔ<$q$yCAV\"}0\tWȞog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4I[xe\u0012\u001d˰JoE3UoK?hҚ>\u000562*8\u007f\u0007\u0017ɝZH>u;Fƚ\u0010\u0012>@9X`\u0015e\u0005H\u001b6B.\u000b6\\\u0016YfLziR/Q\f\u001aF\\4w0+VSF\u001d5\u001b\u0005y\u001eYOg9#5k\u00035c\"SKM\u007fO\u001dhU6[M\u0002jNX.([+\u0018\u001bk\b>\\3`\u0011\u00105AgcygT<@\u0011\n%T\u0004<\u0015WL<F2f6(cx\u0001nXP0z\t\u0015CwD4=\u007fa:i\u001ftjy;Ghg\u007f\u0013+6#/\u000bgp\u001d\u0014n43T&`wQ\u0011KVO\"[Sl2r9̦6˙4G\b\u07fcL\u001d<\u001a=7\n=yܬmɘLDoϸUlvX\u0002RvFxÅ\"֖.\t\u0014ɮ\u0015p\u0013rhT\u00070g۶\u001eΤ\u000b}\u0010ʶا`\u0018"}, d2 = {"\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~Gy!7I#.I4?kF\f\u0018d`C\u0019L6Mv|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001cU\u0012*G|\u00041IBE}\u001d(\u0014h7", "u(E", ";K^0T3\u001dO(z", "\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~Gy!7I#.I4?kF\u0005\u001ff]@e_;JL", ";LP?Z0Ga", "", ";MT2W:.^\u0018z\n^", "", ";OP1W0GU'", "5dc\u0012W.>D\u0015\u0006\u000b^", "", "3cV2@6=S", "\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~Gy!7I#.I4?kF}\u0014ja!\u0011b,\\L", "7mb2g\u001d:Z)~", "3cV2I(Ec\u0019", "=m12Y6KS\u007fz\u000fh<\f", "", "<`c6i,/W\u0019\u0011]b,\n\u0005<c\u0003<eK\u0010\u001b\u001fK\u0005\u000eI", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001eU\r$Hm\u00072MU\u001eo4+\u0011u_<\u001bM7]z/KaN92", "@db2g\u0010Ga\u0019\u000e\t", ";nS2", "\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~Gy!7I#.I4?kF\u0006\u001fga\u000f", "Adc\u0019b*:Zwz\nZ", "2`c.", "", "Adc\u001aT9@W\"\r", "7mS2k", "", ";`a4\\5", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001b\u000b.1a\u0002\u001e\r", "Adc\u001dT+=W\"\u0001\t", ">`S1\\5@", "CoS.g,\"\\'~\nl", "@dP0gsGO(\u0003\f^s\u000b\u00050eG$\t@|^\u0015Qx\u001d<\n4/f}'7i$."}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SafeAreaViewShadowNode extends LayoutShadowNode {
    private SafeAreaViewLocalData mLocalData;
    private boolean mNeedsUpdate;
    private final float[] mPaddings = new float[ViewProps.PADDING_MARGIN_SPACING_TYPES.length];
    private final float[] mMargins = new float[ViewProps.PADDING_MARGIN_SPACING_TYPES.length];

    public SafeAreaViewShadowNode() {
        int length = ViewProps.PADDING_MARGIN_SPACING_TYPES.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.mPaddings[i2] = Float.NaN;
            this.mMargins[i2] = Float.NaN;
        }
    }

    private final float getEdgeValue(SafeAreaViewEdgeModes safeAreaViewEdgeModes, float f2, float f3) {
        return safeAreaViewEdgeModes == SafeAreaViewEdgeModes.OFF ? f3 : safeAreaViewEdgeModes == SafeAreaViewEdgeModes.MAXIMUM ? Math.max(f2, f3) : f2 + f3;
    }

    private final void resetInsets(SafeAreaViewMode safeAreaViewMode) {
        if (safeAreaViewMode == SafeAreaViewMode.PADDING) {
            super.setPadding(1, this.mPaddings[1]);
            super.setPadding(2, this.mPaddings[2]);
            super.setPadding(3, this.mPaddings[3]);
            super.setPadding(0, this.mPaddings[0]);
        } else {
            super.setMargin(1, this.mMargins[1]);
            super.setMargin(2, this.mMargins[2]);
            super.setMargin(3, this.mMargins[3]);
            super.setMargin(0, this.mMargins[0]);
        }
        markUpdated();
    }

    private final void updateInsets() {
        SafeAreaViewLocalData safeAreaViewLocalData = this.mLocalData;
        if (safeAreaViewLocalData == null) {
            return;
        }
        float[] fArr = safeAreaViewLocalData.getMode() == SafeAreaViewMode.PADDING ? this.mPaddings : this.mMargins;
        float f2 = fArr[8];
        if (Float.isNaN(f2)) {
            f2 = 0.0f;
        }
        float f3 = f2;
        float f4 = f3;
        float f5 = f4;
        float f6 = fArr[7];
        if (!Float.isNaN(f6)) {
            f2 = f6;
            f4 = f2;
        }
        float f7 = fArr[6];
        if (!Float.isNaN(f7)) {
            f3 = f7;
            f5 = f3;
        }
        float f8 = fArr[1];
        if (!Float.isNaN(f8)) {
            f2 = f8;
        }
        float f9 = fArr[2];
        if (!Float.isNaN(f9)) {
            f3 = f9;
        }
        float f10 = fArr[3];
        if (!Float.isNaN(f10)) {
            f4 = f10;
        }
        float f11 = fArr[0];
        if (!Float.isNaN(f11)) {
            f5 = f11;
        }
        float pixelFromDIP = PixelUtil.toPixelFromDIP(f2);
        float pixelFromDIP2 = PixelUtil.toPixelFromDIP(f3);
        float pixelFromDIP3 = PixelUtil.toPixelFromDIP(f4);
        float pixelFromDIP4 = PixelUtil.toPixelFromDIP(f5);
        SafeAreaViewEdges edges = safeAreaViewLocalData.getEdges();
        EdgeInsets insets = safeAreaViewLocalData.getInsets();
        if (safeAreaViewLocalData.getMode() == SafeAreaViewMode.PADDING) {
            super.setPadding(1, getEdgeValue(edges.getTop(), insets.getTop(), pixelFromDIP));
            super.setPadding(2, getEdgeValue(edges.getRight(), insets.getRight(), pixelFromDIP2));
            super.setPadding(3, getEdgeValue(edges.getBottom(), insets.getBottom(), pixelFromDIP3));
            super.setPadding(0, getEdgeValue(edges.getLeft(), insets.getLeft(), pixelFromDIP4));
            return;
        }
        super.setMargin(1, getEdgeValue(edges.getTop(), insets.getTop(), pixelFromDIP));
        super.setMargin(2, getEdgeValue(edges.getRight(), insets.getRight(), pixelFromDIP2));
        super.setMargin(3, getEdgeValue(edges.getBottom(), insets.getBottom(), pixelFromDIP3));
        super.setMargin(0, getEdgeValue(edges.getLeft(), insets.getLeft(), pixelFromDIP4));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        Intrinsics.checkNotNullParameter(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        if (this.mNeedsUpdate) {
            this.mNeedsUpdate = false;
            updateInsets();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setLocalData(Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof SafeAreaViewLocalData) {
            SafeAreaViewLocalData safeAreaViewLocalData = this.mLocalData;
            if (safeAreaViewLocalData != null && safeAreaViewLocalData.getMode() != ((SafeAreaViewLocalData) data).getMode()) {
                resetInsets(safeAreaViewLocalData.getMode());
            }
            this.mLocalData = (SafeAreaViewLocalData) data;
            this.mNeedsUpdate = false;
            updateInsets();
        }
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", names = {"\u007ft\u0007|\u007f\u0006", "\u007ft\u0007|\u007f\u0006n~\r\u0010\u0006\u0001\u007f\f", "\u007ft\u0007|\u007f\u0006`\t\r\u0005\u0017\r\r\u0014\u0002\u000e", "\u007ft\u0007|\u007f\u0006k\u000e{\u000e\u0011", "\u007ft\u0007|\u007f\u0006]\b~", "\u007ft\u0007|\u007f\u0006l\t\u000b", "\u007ft\u0007|\u007f\u0006Z\t\u000f\u0010\f\u000b", "\u007ft\u0007|\u007f\u0006d~\u0001\u0010", "\u007ft\u0007|\u007f\u0006j\u0003\u0002\u0004\u0011"})
    @InterfaceC1492Gx
    public void setMargins(int i2, Dynamic margin) {
        Intrinsics.checkNotNullParameter(margin, "margin");
        this.mMargins[ViewProps.PADDING_MARGIN_SPACING_TYPES[i2]] = margin.getType() == ReadableType.Number ? (float) margin.asDouble() : Float.NaN;
        super.setMargins(i2, margin);
        this.mNeedsUpdate = true;
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", names = {"\u0003txy\u007f\u0006\u007f", "\u0003txy\u007f\u0006\u007fo\u007f\u000e\u0011\u0007\u0002\u0001\r", "\u0003txy\u007f\u0006\u007fa\n\u000e\u0006\u0018\u000e\u000e\u0015\u0003\u000f", "\u0003txy\u007f\u0006\u007fl\u000f|\u000f\u0012", "\u0003txy\u007f\u0006\u007f^\t\u007f", "\u0003txy\u007f\u0006\u007fm\n\f", "\u0003txy\u007f\u0006\u007f[\n\u0010\u0011\r\f", "\u0003txy\u007f\u0006\u007fe\u007f\u0002\u0011", "\u0003txy\u007f\u0006\u007fk\u0004\u0003\u0005\u0012"})
    @InterfaceC1492Gx
    public void setPaddings(int i2, Dynamic padding) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.mPaddings[ViewProps.PADDING_MARGIN_SPACING_TYPES[i2]] = padding.getType() == ReadableType.Number ? (float) padding.asDouble() : Float.NaN;
        super.setPaddings(i2, padding);
        this.mNeedsUpdate = true;
    }
}
