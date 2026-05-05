package com.th3rdwave.safeareacontext;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@ReactModule(name = "\u0012\r\u0001\u0010\u001d!\u001fy*\u001c\u0017\u000b\u001d\u0018)")
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`_2şs{J$cҕyCIU\"}(\tWN}gvJ`\fK\u000f\u0014ǝ\u0001jBI]ތe\u0012%2JģG3coE9ft<\n6݅@Q*\u0005/\u0019bG)7}ŲO\f 0\tvHS%M3\u001cX\u001a\u0007.\u000f!tg|:xpk?G#1o\tboe>\u0004e\rt\\m!?m,4X=E\u00175S1\t\u0001e\u0006\u0017\b\nK\u0010\u0001'U7yweCp\u007fB\u0019[U\u001bk\u000b(r\u0004\u007foR,sgq[h\u000eV\u0004+\u007f\u001bI\u001c\u000e4+x4;+~\n$2#z\u001aE\u0019&lT\u0018|w5E8079F3f\u007fuk\u001f\\L\u0014\u0007#\u001dQ\u0017\u001f'ik&b+\u001a\u0003\u0010\u0018EҮDW"}, d2 = {"\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~Gy!7I#.I4?kF\u0006\u0011q];\u0007p\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001f@v7~F}\u001c5|\u00072MU#g=\u001a\u0017hn\u000f", "u(E", "1qT.g,,V\u0015}\u0005p\u0015\u0007\b/I\t6\u000b<\n\u0015\u0017", "\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~Gy!7I#.I4?kF\f\u0018d`C\u0019L6Mv|", "1qT.g,/W\u0019\u0011^g:\f\u00058c\u007f", "\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~Gy!7I#.I4?kFs", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "5dc\u001bT4>", "", "5dc [(=]+g\u0005],Z\u0010+s\u000e", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "Adc\u0012W.>a", "", "DhTD", ">q^=?0Lb", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "Adc\u001ab+>", ";nS2", "CoS.g,,b\u0015\u000ez", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001f@v7~F}\u001c5|\u00072MU\u001dx>. >", ">q^=f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\"Yy\u001eF[%BTCIJ8\u001f\u0016P]D\\", "AsPAX\u001eKO$\nzk", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n#hy/7_#*XN;x\n", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s\u000b\u00050eG$\t@|^\u0015Qx\u001d<\n4/f}'7i$."}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SafeAreaViewManager extends ReactViewManager {
    public static final Companion Companion = new Companion(null);
    public static final String REACT_CLASS = "RNCSafeAreaView";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~Gy!7I#.I4?kF\u0006\u0011q];\u0007pj,\u0001/RHW0f[H", "", "u(E", " D0\u0010G&\u001c:tlh", "", "@dP0gsGO(\u0003\f^s\u000b\u00050eG$\t@|^\u0015Qx\u001d<\n4/f}'7i$."}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public SafeAreaViewShadowNode createShadowNodeInstance() {
        return new SafeAreaViewShadowNode();
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public SafeAreaView createViewInstance(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new SafeAreaView(context);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<SafeAreaViewShadowNode> getShadowNodeClass() {
        return SafeAreaViewShadowNode.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @yg.InterfaceC1492Gx
    @com.facebook.react.uimanager.annotations.ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0006Sf~\u000f")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setEdges(com.th3rdwave.safeareacontext.SafeAreaView r7, com.facebook.react.bridge.ReadableMap r8) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            if (r8 == 0) goto L78
            java.lang.String r0 = "top"
            java.lang.String r1 = r8.getString(r0)
            java.lang.String r5 = "toUpperCase(...)"
            if (r1 == 0) goto L23
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toUpperCase(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            com.th3rdwave.safeareacontext.SafeAreaViewEdgeModes r4 = com.th3rdwave.safeareacontext.SafeAreaViewEdgeModes.valueOf(r0)
            if (r4 != 0) goto L25
        L23:
            com.th3rdwave.safeareacontext.SafeAreaViewEdgeModes r4 = com.th3rdwave.safeareacontext.SafeAreaViewEdgeModes.OFF
        L25:
            java.lang.String r0 = "right"
            java.lang.String r1 = r8.getString(r0)
            if (r1 == 0) goto L3c
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toUpperCase(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            com.th3rdwave.safeareacontext.SafeAreaViewEdgeModes r3 = com.th3rdwave.safeareacontext.SafeAreaViewEdgeModes.valueOf(r0)
            if (r3 != 0) goto L3e
        L3c:
            com.th3rdwave.safeareacontext.SafeAreaViewEdgeModes r3 = com.th3rdwave.safeareacontext.SafeAreaViewEdgeModes.OFF
        L3e:
            java.lang.String r0 = "bottom"
            java.lang.String r1 = r8.getString(r0)
            if (r1 == 0) goto L55
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toUpperCase(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            com.th3rdwave.safeareacontext.SafeAreaViewEdgeModes r2 = com.th3rdwave.safeareacontext.SafeAreaViewEdgeModes.valueOf(r0)
            if (r2 != 0) goto L57
        L55:
            com.th3rdwave.safeareacontext.SafeAreaViewEdgeModes r2 = com.th3rdwave.safeareacontext.SafeAreaViewEdgeModes.OFF
        L57:
            java.lang.String r0 = "left"
            java.lang.String r1 = r8.getString(r0)
            if (r1 == 0) goto L6e
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toUpperCase(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            com.th3rdwave.safeareacontext.SafeAreaViewEdgeModes r1 = com.th3rdwave.safeareacontext.SafeAreaViewEdgeModes.valueOf(r0)
            if (r1 != 0) goto L70
        L6e:
            com.th3rdwave.safeareacontext.SafeAreaViewEdgeModes r1 = com.th3rdwave.safeareacontext.SafeAreaViewEdgeModes.OFF
        L70:
            com.th3rdwave.safeareacontext.SafeAreaViewEdges r0 = new com.th3rdwave.safeareacontext.SafeAreaViewEdges
            r0.<init>(r4, r3, r2, r1)
            r7.setEdges(r0)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.th3rdwave.safeareacontext.SafeAreaViewManager.setEdges(com.th3rdwave.safeareacontext.SafeAreaView, com.facebook.react.bridge.ReadableMap):void");
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000e^c~")
    public final void setMode(SafeAreaView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.areEqual(str, ViewProps.PADDING)) {
            view.setMode(SafeAreaViewMode.PADDING);
        } else if (Intrinsics.areEqual(str, ViewProps.MARGIN)) {
            view.setMode(SafeAreaViewMode.MARGIN);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ReactViewGroup view, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((SafeAreaView) view).setStateWrapper(stateWrapper);
        return null;
    }
}
