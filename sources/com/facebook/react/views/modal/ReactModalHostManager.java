package com.facebook.react.views.modal;

import android.content.DialogInterface;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.viewmanagers.ModalHostViewManagerDelegate;
import com.facebook.react.viewmanagers.ModalHostViewManagerInterface;
import com.facebook.react.views.modal.ReactModalHostView;
import com.rncamerakit.events.OrientationChangeEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
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
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0ReP\u008cZS@\u000fs{:&c$\u007feCU(\n*\t]ȞogtMb\u000bQ\u0018\u000e\u0016~m4Ic~e\u0012\u00154JoU3UoC=htL\u0005(݅*8\u0010\u0005\t\u001a0H\u0016{\u0011ŏi6B6PrJR;M3\u0019B\fN\"\u0011\u001e\u000bg|7\u0001k\bz2ݭ\u0007iPPou>\u0002e\rtZW\u0011\u0005h6+n?e\u00193\\\u001b\u0007\u0001[\u0006\u0015\b\u007fK\u000f\u0001'U+ywe=p\u007fB\u001dqaUi\u00011t\u000bab\u001c'YO\u0012O\u0017\"p\n\t\b%H\u0014\u0010\u0016'v<=\u001cv\b<B#\u007f\u001aT\u0019\blR\u0018z\u0010D]9HA9J3f\u007fgk\u001d\\@\u0014\u0005;\u001ei\u00137/if&`C!\u0005{_:i@kH\u0015\u001e\"S{\u0017\tb0044U\tG{?.G)EoQ#O\u0001H]\r\u007f\u0005\u001bxh\u0002o\u0003LN+\u0007\u0016e*9\u0012h[|\u0007\u0002O\u0003fr&\u00162b\u001f\u0016\bA&\r{J*=\u0010|O\u0019mxfu\nSD-L\"\u0005y(o9\r9eUq\u0019yR%\u0014o@p\u0019pfpnRo%@0N`j>},H\\\u0015+2mqL::E1^+G1,\tVE\u001fmw\u0001\u0010-Zc(\u0011r<t7\u0001\u0001`~\u000e\u007fxwACujEOpM\u0019T[RlB\u0006;\u0007-s0Mu`_N\u0003\u0015$uB5^0GrG=A\u0015/-@\u000bEEzr\u0016U[4?z+\u000fUP1Du+\u0003pZf\u001bN]]/\"%^#'\u0016\t\u0018y\u0010[A\\,t\u0019\u0001VK\t\u0002\bK~<\u000b\u000e7\u001eS\u0001 &\u000b[ECUDF{\"W-a\f\u00136BJt\u001d)\rk\u0014.s\u0016\u001eb\u007fa\tձ:ա]~FЭ٣p."}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0016Fu!<#j 3k%\u0016WB7r\u0017(#wI5\u0010_.N\u0004|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u0019z >X+7t0 \u0015u7", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0016Fu!<#j 3k%\u0016WB7r\u0017(#wR=\u0007u\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)Ok\u00178x%BgG\bAl\u001250MIz%\"\u0015zI5\u0010_.N\u0004\u000bP[N9]Np=i", "u(E", "2d[2Z(MS", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u001fi\u001f*OCHJ4%\u0015j]H\u00079", "/cS\u0012i,Gbx\u0007~m;|\u0016=", "", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "DhTD", "1qT.g,/W\u0019\u0011^g:\f\u00058c\u007f", "5dc\u0011X3>U\u0015\u000ez", "5dc\u0012k7H`(~y<<\u000b\u00189m^,\t@~&vXo\u0017Ke9@Y[*@{%*VRI", "", "", "", "5dc\u001bT4>", "=m03g,KC$}vm,k\u0016+n\u000e$yO\u0005! ", "=m3?b7/W\u0019\u0011^g:\f\u00058c\u007f", "Adc\u000ea0FO(~y", "D`[BX", "", "Adc\u000ea0FO(\u0003\u0005g\u001b\u0011\u0014/", "/mX:T;B]\"m\u000fi,", "Adc\u0015T9=e\u0015\fz:*z\t6e\r$\u000b@\u007f", "6`a1j(KSt|x^3|\u0016+t\u007f'", "Adc\u0016W,Gb\u001d\u007f~^9", "", "Adc\u001de,LS\"\u000evm0\u0007\u0012\u001dt\u0014/{", "Adc g(Mc'[vk\u001b\n\u00058s\u00078y@\n&", "AsPAh:\u001bO&m\bZ5\u000b\u0010?c\u007f1\u000b", "Adc h7I]&\u000ez]\u0016\n\r/n\u000f$\u000bD\u000b %", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "Adc!e(Ga$z\b^5\f", "BqP;f7:`\u0019\b\n", "Adc#\\:BP ~", "Dhb6U3>", "CoS.g,,b\u0015\u000ez", ">q^=f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\"Yy\u001eF[%BTCIJ8\u001f\u0016P]D\\", "AsPAX\u001eKO$\nzk", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n#hy/7_#*XN;x\n", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@ReactModule(name = "\u0012\u0002\u0012\n+\u001f\u001b%\u007f&))\n\u001c\u0017(")
public final class ReactModalHostManager extends ViewGroupManager<ReactModalHostView> implements ModalHostViewManagerInterface<ReactModalHostView> {
    public static final Companion Companion = new Companion(null);
    public static final String REACT_CLASS = "RCTModalHostView";
    private final ViewManagerDelegate<ReactModalHostView> delegate = new ModalHostViewManagerDelegate(this);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0016Fu!<#j 3k%\u0016WB7r\u0017(#wI5\u0010_.N\u0004e%VV7X[vG\u001dg", "", "u(E", " D0\u0010G&\u001c:tlh", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEventEmitters$lambda$0(EventDispatcher eventDispatcher, ThemedReactContext reactContext, ReactModalHostView view, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(reactContext, "$reactContext");
        Intrinsics.checkNotNullParameter(view, "$view");
        eventDispatcher.dispatchEvent(new RequestCloseEvent(UIManagerHelper.getSurfaceId(reactContext), view.getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEventEmitters$lambda$1(EventDispatcher eventDispatcher, ThemedReactContext reactContext, ReactModalHostView view, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(reactContext, "$reactContext");
        Intrinsics.checkNotNullParameter(view, "$view");
        eventDispatcher.dispatchEvent(new ShowEvent(UIManagerHelper.getSurfaceId(reactContext), view.getId()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final ThemedReactContext reactContext, final ReactModalHostView view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        final EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            view.setOnRequestCloseListener(new ReactModalHostView.OnRequestCloseListener() { // from class: com.facebook.react.views.modal.ReactModalHostManager$$ExternalSyntheticLambda0
                @Override // com.facebook.react.views.modal.ReactModalHostView.OnRequestCloseListener
                public final void onRequestClose(DialogInterface dialogInterface) {
                    ReactModalHostManager.addEventEmitters$lambda$0(eventDispatcherForReactTag, reactContext, view, dialogInterface);
                }
            });
            view.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.facebook.react.views.modal.ReactModalHostManager$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    ReactModalHostManager.addEventEmitters$lambda$1(eventDispatcherForReactTag, reactContext, view, dialogInterface);
                }
            });
            view.setEventDispatcher(eventDispatcherForReactTag);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ReactModalHostView createViewInstance(ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new ReactModalHostView(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<ReactModalHostView> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        LinkedHashMap exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap();
        }
        exportedCustomDirectEventTypeConstants.put(RequestCloseEvent.EVENT_NAME, MapsKt.mapOf(TuplesKt.to("registrationName", "onRequestClose")));
        exportedCustomDirectEventTypeConstants.put(ShowEvent.EVENT_NAME, MapsKt.mapOf(TuplesKt.to("registrationName", "onShow")));
        exportedCustomDirectEventTypeConstants.put("topDismiss", MapsKt.mapOf(TuplesKt.to("registrationName", "onDismiss")));
        exportedCustomDirectEventTypeConstants.put(OrientationChangeEvent.EVENT_NAME, MapsKt.mapOf(TuplesKt.to("registrationName", "onOrientationChange")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ReactModalHostView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.showOrUpdate();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(ReactModalHostView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onDropViewInstance(view);
        view.onDropInstance();
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002]h\u0007|<\u0013|")
    public void setAnimated(ReactModalHostView view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002]h\u0007|<\u0017\bd*I&f")
    public void setAnimationType(ReactModalHostView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (str != null) {
            view.setAnimationType(str);
        }
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tPq}\u0013) }793\u001bmdm>\u001f\nP")
    public void setHardwareAccelerated(ReactModalHostView view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setHardwareAccelerated(z2);
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\nSd\b\u00101\u0014\u0002[H")
    public void setIdentifier(ReactModalHostView view, int i2) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011ad\r\u00016\"yj??$TstI\u0010")
    public void setPresentationStyle(ReactModalHostView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014c`\u000e\u0011;oyh*B\u0017orgR\u000e\nZ\u001c")
    public void setStatusBarTranslucent(ReactModalHostView view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarTranslucent(z2);
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014do\n\u000b:\"}Z%B\u001ffmo>\u001f\u000e[\u0016Z")
    public void setSupportedOrientations(ReactModalHostView view, ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015a`\b\u000f8\u000f\u000b[DD")
    public void setTransparent(ReactModalHostView view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTransparent(z2);
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Xr\u0003}4\u0013")
    public void setVisible(ReactModalHostView view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ReactModalHostView view, ReactStylesDiffMap props, StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        view.setStateWrapper(stateWrapper);
        return null;
    }
}
