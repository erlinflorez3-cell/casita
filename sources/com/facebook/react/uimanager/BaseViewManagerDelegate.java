package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerInterface;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0015\"4\u0012}\tnjG0LeN.ZS8\u001bsڔ<$q$yCAW\"}0ޛWNmgtnpŏk\u0015\fǝ\u0007iTI\u0004x\u0006\u001e\u00151Ppg9]qM9'sd\u0007P82:\n\u0005G\u0019XKP\u0002\u000bGY\u0010*0voĐV\r[\nb9\u0014E8\u0001Ld\u0018RDQ\u0005]pǂS\twLf)u/+X=Lb3%xw\u001dYM}Iչ)S\u0011\u0015\u001b\u0003M\u0012Wqk\r\u0019+54as\u000e̬\t\u0006\"%CQ#\\!1\r\u000b_q$)AN\u0012]\u0017\"߭{z\n \r\u0014\u001c\n?Hd,Ph^Ԋ5ϢvUHP\u0010d۶\u0004\u000f"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u0012U\f (q\u0016@5?Dg6\u001e\"Ga@\u0007e(]v|", "\"", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "#", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u0012U\f (q\u0016@5?Dg6\u001e\"LjH\u0007p-Jt'\u001d", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u001fi\u001f*OCHJ4%\u0015j]H\u00079", ";UX2j\u0014:\\\u0015\u0001zk", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~6y.7^\u001a._+7t0 \u0015uEB\u0016c9Or%G\"\u0012\u001d", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u0012U\f (q\u0016@5?Dg6\u001e\"LjH\u0007p-Jt'\u001d", "@dR2\\=>1#\u0007\u0003Z5{", "", "DhTD", "1n\\:T5=<\u0015\u0007z", "", "/qV@", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044AEs}\u001f\u0011fa6\u0011m2\u0018\u0004'CJ]uY_v<\u0016\u0012$zN'\f\u0001VH$JQD\u001b\u001c\u0002\rr", "Adc\u001de6IS&\u000e\u000f", ">q^=A(FS", "D`[BX", "", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044H7|0g\u001cdj;PM)Sv%V\"\u0012\u001d", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public abstract class BaseViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T>> implements ViewManagerDelegate<T> {
    protected final U mViewManager;

    public BaseViewManagerDelegate(U mViewManager) {
        Intrinsics.checkNotNullParameter(mViewManager, "mViewManager");
        this.mViewManager = mViewManager;
    }

    @Override // com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T view, String str, ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T view, String str, Object obj) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (str != null) {
            switch (str.hashCode()) {
                case -1721943862:
                    if (str.equals(ViewProps.TRANSLATE_X)) {
                        Double d2 = (Double) obj;
                        this.mViewManager.setTranslateX(view, d2 != null ? (float) d2.doubleValue() : 0.0f);
                        break;
                    }
                    break;
                case -1721943861:
                    if (str.equals(ViewProps.TRANSLATE_Y)) {
                        Double d3 = (Double) obj;
                        this.mViewManager.setTranslateY(view, d3 != null ? (float) d3.doubleValue() : 0.0f);
                        break;
                    }
                    break;
                case -1589741021:
                    if (str.equals(ViewProps.SHADOW_COLOR)) {
                        U u2 = this.mViewManager;
                        int color = obj == null ? 0 : ColorPropConverter.getColor(obj, view.getContext());
                        Intrinsics.checkNotNull(color);
                        u2.setShadowColor(view, color.intValue());
                        break;
                    }
                    break;
                case -1267206133:
                    if (str.equals(ViewProps.OPACITY)) {
                        Double d4 = (Double) obj;
                        this.mViewManager.setOpacity(view, d4 != null ? (float) d4.doubleValue() : 1.0f);
                        break;
                    }
                    break;
                case -1228066334:
                    if (str.equals("borderTopLeftRadius")) {
                        Double d5 = (Double) obj;
                        this.mViewManager.setBorderTopLeftRadius(view, d5 != null ? (float) d5.doubleValue() : Float.NaN);
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        Double d6 = (Double) obj;
                        this.mViewManager.setScaleX(view, d6 != null ? (float) d6.doubleValue() : 1.0f);
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        Double d7 = (Double) obj;
                        this.mViewManager.setScaleY(view, d7 != null ? (float) d7.doubleValue() : 1.0f);
                        break;
                    }
                    break;
                case -877170387:
                    if (str.equals(ViewProps.TEST_ID)) {
                        this.mViewManager.setTestId(view, (String) obj);
                        break;
                    }
                    break;
                case -781597262:
                    if (str.equals(ViewProps.TRANSFORM_ORIGIN)) {
                        this.mViewManager.setTransformOrigin(view, (ReadableArray) obj);
                        break;
                    }
                    break;
                case -731417480:
                    if (str.equals(ViewProps.Z_INDEX)) {
                        Double d8 = (Double) obj;
                        this.mViewManager.setZIndex(view, d8 != null ? (float) d8.doubleValue() : 0.0f);
                        break;
                    }
                    break;
                case -101663499:
                    if (str.equals(ViewProps.ACCESSIBILITY_HINT)) {
                        this.mViewManager.setAccessibilityHint(view, (String) obj);
                        break;
                    }
                    break;
                case -101359900:
                    if (str.equals(ViewProps.ACCESSIBILITY_ROLE)) {
                        this.mViewManager.setAccessibilityRole(view, (String) obj);
                        break;
                    }
                    break;
                case -80891667:
                    if (str.equals(ViewProps.RENDER_TO_HARDWARE_TEXTURE)) {
                        Boolean bool = (Boolean) obj;
                        this.mViewManager.setRenderToHardwareTexture(view, bool != null ? bool.booleanValue() : false);
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        Double d9 = (Double) obj;
                        this.mViewManager.setRotation(view, d9 != null ? (float) d9.doubleValue() : 0.0f);
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        Double d10 = (Double) obj;
                        this.mViewManager.setElevation(view, d10 != null ? (float) d10.doubleValue() : 0.0f);
                        break;
                    }
                    break;
                case 3506294:
                    if (str.equals(ViewProps.ROLE)) {
                        this.mViewManager.setRole(view, (String) obj);
                        break;
                    }
                    break;
                case 36255470:
                    if (str.equals(ViewProps.ACCESSIBILITY_LIVE_REGION)) {
                        this.mViewManager.setAccessibilityLiveRegion(view, (String) obj);
                        break;
                    }
                    break;
                case 333432965:
                    if (str.equals("borderTopRightRadius")) {
                        Double d11 = (Double) obj;
                        this.mViewManager.setBorderTopRightRadius(view, d11 != null ? (float) d11.doubleValue() : Float.NaN);
                        break;
                    }
                    break;
                case 581268560:
                    if (str.equals("borderBottomLeftRadius")) {
                        Double d12 = (Double) obj;
                        this.mViewManager.setBorderBottomLeftRadius(view, d12 != null ? (float) d12.doubleValue() : Float.NaN);
                        break;
                    }
                    break;
                case 588239831:
                    if (str.equals("borderBottomRightRadius")) {
                        Double d13 = (Double) obj;
                        this.mViewManager.setBorderBottomRightRadius(view, d13 != null ? (float) d13.doubleValue() : Float.NaN);
                        break;
                    }
                    break;
                case 746986311:
                    if (str.equals(ViewProps.IMPORTANT_FOR_ACCESSIBILITY)) {
                        this.mViewManager.setImportantForAccessibility(view, (String) obj);
                        break;
                    }
                    break;
                case 1052666732:
                    if (str.equals(ViewProps.TRANSFORM)) {
                        this.mViewManager.setTransform(view, (ReadableArray) obj);
                        break;
                    }
                    break;
                case 1146842694:
                    if (str.equals(ViewProps.ACCESSIBILITY_LABEL)) {
                        this.mViewManager.setAccessibilityLabel(view, (String) obj);
                        break;
                    }
                    break;
                case 1153872867:
                    if (str.equals(ViewProps.ACCESSIBILITY_STATE)) {
                        this.mViewManager.setViewState(view, (ReadableMap) obj);
                        break;
                    }
                    break;
                case 1287124693:
                    if (str.equals(ViewProps.BACKGROUND_COLOR)) {
                        U u3 = this.mViewManager;
                        int color2 = obj == null ? 0 : ColorPropConverter.getColor(obj, view.getContext());
                        Intrinsics.checkNotNull(color2);
                        u3.setBackgroundColor(view, color2.intValue());
                        break;
                    }
                    break;
                case 1349188574:
                    if (str.equals("borderRadius")) {
                        Double d14 = (Double) obj;
                        this.mViewManager.setBorderRadius(view, d14 != null ? (float) d14.doubleValue() : Float.NaN);
                        break;
                    }
                    break;
                case 1505602511:
                    if (str.equals(ViewProps.ACCESSIBILITY_ACTIONS)) {
                        this.mViewManager.setAccessibilityActions(view, (ReadableArray) obj);
                        break;
                    }
                    break;
                case 1761903244:
                    if (str.equals(ViewProps.ACCESSIBILITY_COLLECTION)) {
                        this.mViewManager.setAccessibilityCollection(view, (ReadableMap) obj);
                        break;
                    }
                    break;
                case 1865277756:
                    if (str.equals(ViewProps.ACCESSIBILITY_LABELLED_BY)) {
                        this.mViewManager.setAccessibilityLabelledBy(view, new DynamicFromObject(obj));
                        break;
                    }
                    break;
                case 1993034687:
                    if (str.equals(ViewProps.ACCESSIBILITY_COLLECTION_ITEM)) {
                        this.mViewManager.setAccessibilityCollectionItem(view, (ReadableMap) obj);
                        break;
                    }
                    break;
                case 2045685618:
                    if (str.equals(ViewProps.NATIVE_ID)) {
                        this.mViewManager.setNativeId(view, (String) obj);
                        break;
                    }
                    break;
            }
        }
    }
}
