package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenManagerInterface;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.events.HeaderBackButtonClickedEvent;
import com.swmansion.rnscreens.events.HeaderHeightChangeEvent;
import com.swmansion.rnscreens.events.ScreenAppearEvent;
import com.swmansion.rnscreens.events.ScreenDisappearEvent;
import com.swmansion.rnscreens.events.ScreenDismissedEvent;
import com.swmansion.rnscreens.events.ScreenTransitionProgressEvent;
import com.swmansion.rnscreens.events.ScreenWillAppearEvent;
import com.swmansion.rnscreens.events.ScreenWillDisappearEvent;
import com.swmansion.rnscreens.events.SheetDetentChangedEvent;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.sequences.SequencesKt;
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
@Metadata(bv = {}, d1 = {"Яx\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0ReP.XS2\u000f\u0002{<řc$\u007fICU }*\teNogtJb\u000bQ2\u000e\u0016\u0007v4Icތe\u0012\u00157JoM8UoC9htD\u000e(2(;\u0002\u0005\u0017\u001a2H\u0016\u0006\u0003Ca\f\u001a0F\u0006BR#M\r܅\u001a\u0006T \t\u001ebgTK^Ǎ{\f_)\u0013kRNU_^{}\u0013VV7\r%aL,x6\u0007U(٨\u0007\u0007`]\b!MvU\u0005\u0017-W/Wzo6\u0007\u007fD\u00199W%]!/\r\t_j$'YZ*_\u0019\u001c6\u0004\u0013{;<4\u0012\u00144`.[(-\u001aV?\u0003\u0002kF`\u0004nB.z\u0010:]7HE9I3racK\u0019|I\f\u0007\u001d\u001eQ\u0014\u001d2\"hVf#/lw\u007fC\u0018T\u0006V\\\u001fq=\u001c\n!f\u0010@\u001c0u\u007fu\u000eYD%<O[g)Qo\u0010O\\g%\u0005\u0011la\u007fjHn+5*\u007f@\u0017$rD\u0013\u000b\u001cTb_D\u0011{\u001c\u0005\u000b\f\u0012+ \u000b\u0003\u00035m&\\h\u0001i\u0019S\u000e\u000e3E~7\bn\u001c\u0012eSv3cl*$*h\u0005-W<\u0011\u000b\tjPi$Z\u000b(R6V\u0005(w*O\u0015\u0011[JM\u000e44Z7Ib#^\u001b X@+\t\u0010^v-\u0017TaBI}l\r\u0017 h\\\u001fu\u0018~WB\u0015b8,oQe\u001d4r:hb\u001bi\u001bG\f\u000eg\u007fLuR\u001d\u001c\u0004k\u0014\",\u0019gQ_A!,\u0017)` sY\u0015\tsre\u0012U\u0001-}\u001dQ\u0001.\u0016\b\u001bt:\u0003\u0003J}r]7?x\u0001F d.\u007f\u0012L\t]{V!ZlI#\tgYf:\u0013\u0004MBk\u00158:\u000bZECU#F}\"E-csh\u001e.*f\u001dC\re2J**8z_\u0004J;fO\n\u0005L8<n\u0019Avj(\fP&L\raf\bx9lFt#/,l70\u001b\u0007n[h\u0013 \u0002BVw*\"aD)'`3:eS\u0016s\u001eOj!b\u000f8\u000b,7|<4?6U\u0006mOEӒw\u0018Dl\u0004x\u0013h!$b2l\f\u0019Yli4\u0010+\u0004T\r'\u0017``:P\u001f$b'tVv\u000b\u0011In7B\u0001-\u000fc\"\u0007dI\u0005\u001cd\u001bD,J\u000f\u00045\tIp\u007f\u0005t;CFj8I(\t\u0005\u0019buCw |\u0018\u0010A{\u001d\b\ff\u001e-!P.39\u007f\u0011\u0010|>\u0011#WzM\u0013\tX{\u001bf0\\\u0017z+\u0014l\u000e\u001d!1O!o\u00133Z\u0003\u00109Y\u0019/)\u000b>O$\u000b\u0019^\u001b[\fe1K_\u0003\u0014U{\bYI\u001b \"6&2+gq $tAu\u001bh\u001c\"\u001ap\u0018!\u0013~ 42X\u0012\u000b\n\\#|dJK\u0010KvY\u001a}QF5A\u0005\bXJ\u0017x:gz\u0001\u0007U9\u000e-F\u001f\u0010|fh\u001d7-}2!nr:?SP\\\u001f\u001d,\u0015T=|\u001d+?\u001e\n{h\u001fq\u007f_\u001bAGkXaa4`;\u0016\u001f(\u0014J?\u001d>#vnMlj9`zXo\u000e\rjXh\u0003)A\u0014+\n\u000fsY)B\u0003\u000b\u001e\u00135g\u001d-q%G\u000f\u00074IWC91\u0001JaLz#}e\u000f\u00111@\u0013x\u000e@Z\t!\u007f\u00182;xl?0&\b64yK>Y\u0004PB62A\u0012\u001fEr8N>\r *zi5W\u0018?\u0013[MN\b\u0015YMj\u007fYU.\u000f\u0013\u0019\rmyaqH5Ot9.=\u0002al/X3w}LU\u00122iX\u0015ec\u0005\u000f\u00122Wx] \u0010Tn\u000bP4\u009d(\u0006\u0004NH[?\rB_\u000bF\u0007we\u001a>*dnt'U2\u0011s8J0-<|i(LA)\u001aIHL@El5E}n\bR\\\u000f[\u0013e!L>{-\u000bXgqn1yv[Et]j\u0013$\bH{y6(e\u0007nr ;\\lc\u0019p\u001eWm&P\u0014#\f2waXn\u001dx\u001f.&y\t\rJ%\u0011[\rz\u000bn\u0015Td<X$\r\u001c\u0015\\HG\u0006\fgx\u0015A>\u000e\b\nk #\u0014#3\u0010\n86)u\u0001_?\u0004q\tCG\u0001#o`Wc4\r\u000bcpcfA\u0014.;qB\u0018hL\u001dB^\u0016\u0010Udv\u0010r|\u001b٭oԊ40Xڄ\u0088G0"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>J\u0002 IU\u00127IE;x\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u0019z >X+7t0 \u0015u7", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>/", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)Ok\u00178x%BgG\r [\u0004,ZC;t\u001c\u001a\u001edc9\u0014G5]v4HHL,2", "u(E", "2d[2Z(MS", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u001fi\u001f*OCHJ4%\u0015j]H\u00079", "/cS#\\,P", "", ">`a2a;", "1gX9W", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7mS2k", "", "1qT.g,/W\u0019\u0011^g:\f\u00058c\u007f", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "5dc\u0011X3>U\u0015\u000ez", "5dc\u0012k7H`(~y<<\u000b\u00189m^,\t@~&vXo\u0017Ke9@Y[*@{%*VRI", "", "", "", "5dc\u001bT4>", "=m03g,KC$}vm,k\u0016+n\u000e$yO\u0005! ", "DhTD", "@d\\<i,/W\u0019\u0011", "@d\\<i,/W\u0019\u0011Vm", "Adc\u000eV;Bd\u001d\u000e\u000fL;x\u0018/", "/bc6i0Mg\u0007\u000evm,", "", "Adc\u0010h:M]!Z\u0004b4x\u00183o\t\u0012\u0005.\u0013\u001b\"G", "D`[BX", "", "Adc\u0013h3EA\u0017\fz^5j\u001b3p\u007f\b\u0005<}\u001e\u0017F", "Adc\u0013h3EA\u0017\fz^5j\u001b3p\u007f\u0016~<\u007f!)'x\n9}%4", "Adc\u0014X:Mc&~Zg(y\u0010/d", "5dbAh9>3\"zwe,{", "Adc\u0014X:Mc&~g^:\b\u00138s\u007f\u0007\u007fN\u0010\u0013 Eo", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "Adc\u0015\\+>9\u0019\u0013wh(\n\b\u0019nm:\u007fK\u0001", "Adc\u0015b4>7\"}~\\(\f\u0013<H\u0004'z@\n", "Adc\u001bT;Bd\u0019[v\\2Y\u0019>t\n1ZD\u000f\u001f\u001bU}\nCV.1V\u0005 6", "<`c6i,\u001bO\u0017\u0005Wn;\f\u00138D\u00046\u0004D\u000f%\u0013NO\u00178s,5X", "Adc\u001bT=BU\u0015\u000e~h5Y\u0005<C\n/\u0006M", "<`e6Z(MW#\bWZ9Z\u00136o\r", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{:\u0004%5bS\u0007<i'*\u0017J7t6gxqp9\tc9$:\u0018", "Adc\u001bT=BU\u0015\u000e~h5Y\u0005<H\u0004'z@\n", "<`e6Z(MW#\bWZ9_\r.d\u007f1", "Adc\u001bT=BU\u0015\u000e~h5Y\u0005<T\r$\u0005N\b'\u0015Gx\u001d", "<`e6Z(MW#\bWZ9k\u0016+n\u000e/\f>\u0001 &", "Adc\u001de,OS\"\u000ecZ;\u0001\u001a/D\u00046\u0004D\u000f%", "Adc\u001fX7EO\u0017~Vg0\u0005\u0005>i\n1", "/mX:T;B]\"", "Adc V9>S\"h\bb,\u0006\u0018+t\u00042\u0005", "Aba2X5(`\u001d~\u0004m(\f\r9n", "Adc [,>bt\u0006\u0002h>|\b\u000ee\u000f(\u0005O\u000f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "Adc [,>bv\t\bg,\nu+d\u00048\n", "Adc [,>bx\u0006zo(\f\r9n", "Adc [,>bx\u0012\u0006Z5{\u0017!h\u007f1i>\u000e!\u001eNo\r+\u0001\u00054[}", "Adc [,>bz\fv[)|\u0016 i\u000e,xG\u0001", "Adc [,>b|\b~m0x\u0010\u000ee\u000f(\u0005O", "Adc [,>b\u007fz\b`,\u000b\u0018\u001fn~,\u0004H\u0001\u0016uG~\u000eE\u0006", "Adc g(<Yt\b~f(\f\r9n", "Adc g(<Y\u0004\fzl,\u0006\u0018+t\u00042\u0005", ">qT@X5MO(\u0003\u0005g", "Adc g(Mc'[vk\b\u0006\r7a\u000f,\u0006I", "AsPAh:\u001bO&Z\u0004b4x\u00183o\t", "Adc g(Mc'[vk\n\u0007\u00109r", "AsPAh:\u001bO&\\\u0005e6\n", "Adc g(Mc'[vk\u000f\u0001\b.e\t", "AsPAh:\u001bO&a~]+|\u0012", "Adc g(Mc'[vk\u001a\f\u001d6e", "AsPAh:\u001bO&l\nr3|", "Adc g(Mc'[vk\u001b\n\u00058s\u00078y@\n&", "AsPAh:\u001bO&m\bZ5\u000b\u0010?c\u007f1\u000b", "Adc j0ISw\u0003\b^*\f\r9n", "Adc!e(Ga\u001d\u000e~h5[\u0019<a\u000f,\u0006I", "CoS.g,,b\u0015\u000ez", ">q^=f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\"Yy\u001eF[%BTCIJ8\u001f\u0016P]D\\", "AsPAX\u001eKO$\nzk", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n#hy/7_#*XN;x\n", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@ReactModule(name = "\u0012\r\u0011\u0010\u001f-\u001f\u001e&")
public class ScreenViewManager extends ViewGroupManager<Screen> implements RNSScreenManagerInterface<Screen> {
    public static final Companion Companion = new Companion(null);
    public static final String REACT_CLASS = "RNSScreen";
    private final ViewManagerDelegate<Screen> delegate = new RNSScreenManagerDelegate(this);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>J\u0002 IU\u00127IE;xr{\u001fpl5\u0010g6WL", "", "u(E", " D0\u0010G&\u001c:tlh", "", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(Screen parent, View child, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child instanceof ScreenContentWrapper) {
            parent.registerLayoutCallbackForWrapper((ScreenContentWrapper) child);
        } else if (child instanceof ScreenFooter) {
            parent.setFooter((ScreenFooter) child);
        }
        super.addView(parent, child, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public Screen createViewInstance(ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new Screen(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<Screen> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapsKt.mutableMapOf(TuplesKt.to(ScreenDismissedEvent.EVENT_NAME, MapBuilder.of("registrationName", "onDismissed")), TuplesKt.to(ScreenWillAppearEvent.EVENT_NAME, MapBuilder.of("registrationName", "onWillAppear")), TuplesKt.to(ScreenAppearEvent.EVENT_NAME, MapBuilder.of("registrationName", "onAppear")), TuplesKt.to(ScreenWillDisappearEvent.EVENT_NAME, MapBuilder.of("registrationName", "onWillDisappear")), TuplesKt.to(ScreenDisappearEvent.EVENT_NAME, MapBuilder.of("registrationName", "onDisappear")), TuplesKt.to(HeaderHeightChangeEvent.EVENT_NAME, MapBuilder.of("registrationName", "onHeaderHeightChange")), TuplesKt.to(HeaderBackButtonClickedEvent.EVENT_NAME, MapBuilder.of("registrationName", "onHeaderBackButtonClicked")), TuplesKt.to(ScreenTransitionProgressEvent.EVENT_NAME, MapBuilder.of("registrationName", "onTransitionProgress")), TuplesKt.to(SheetDetentChangedEvent.EVENT_NAME, MapBuilder.of("registrationName", "onSheetDetentChanged")));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(Screen view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.onFinalizePropsUpdate$react_native_screens_release();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(Screen parent, View view) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        super.removeView(parent, view);
        if (view instanceof ScreenFooter) {
            parent.setFooter(null);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(Screen parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (parent.getChildAt(i2) instanceof ScreenFooter) {
            parent.setFooter(null);
        }
        super.removeViewAt(parent, i2);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setActivityState(Screen view, float f2) {
        Intrinsics.checkNotNullParameter(view, "view");
        setActivityState(view, (int) f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002Rs\u0003\u00121\"\u0012IJ1*f")
    public final void setActivityState(Screen view, int i2) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (i2 == -1) {
            return;
        }
        if (i2 == 0) {
            view.setActivityState(Screen.ActivityState.INACTIVE);
        } else if (i2 == 1) {
            view.setActivityState(Screen.ActivityState.TRANSITIONING_OR_BELOW_TOP);
        } else {
            if (i2 != 2) {
                return;
            }
            view.setActivityState(Screen.ActivityState.ON_TOP);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setCustomAnimationOnSwipe(Screen screen, boolean z2) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setFullScreenSwipeEnabled(Screen screen, boolean z2) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setFullScreenSwipeShadowEnabled(Screen screen, boolean z2) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = true, name = "\bTr\u000e\u0011:\u0013]d72\"fc")
    public void setGestureEnabled(Screen view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setGestureEnabled(z2);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setGestureResponseDistance(Screen screen, ReadableMap readableMap) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setHideKeyboardOnSwipe(Screen screen, boolean z2) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setHomeIndicatorHidden(Screen screen, boolean z2) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPs\u0003\u0012-oyYA\u0012+usjKn\u000e_\u0015P.\u001c\u0006p)0XS+\fn")
    public void setNativeBackButtonDismissalEnabled(Screen view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNativeBackButtonDismissalEnabled(z2);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @Deprecated(message = "\tU\u000etr\u0005%j\u0018[)\rW\u001a@WjSH\u001ahSK%K\u0006}|\u000eu&u~Q$VUe{xV0BJQ^M\rafWzjD:\u0017\u000f[")
    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u000fPu\u0003\u0003)\"\u0002eD\u0012\u0017sBjI\u001a\u0017")
    public void setNavigationBarColor(Screen view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNavigationBarColor(num);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPu\u0003\u0003)\"\u0002eD\u0012\u0017sGdA\u000f\nZ")
    public void setNavigationBarHidden(Screen view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNavigationBarHidden(Boolean.valueOf(z2));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @Deprecated(message = "\tU\u000etr\u0005%j\u0018[)\rW\u001a@WjSH\u001ahSK%K\u0006}|\u000eu&u~Q$GQcm\u0006Z-\u007f?\u0016]Q9+k\b@s?6\u001e\u0011KSF468\u0007x\r\u0005C0")
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPu\u0003\u0003)\"\u0002eD\u0012\u0017sSm>\u0019\u0018X\u001dJ \u0017\u0019")
    public void setNavigationBarTranslucent(Screen view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNavigationBarTranslucent(Boolean.valueOf(z2));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setPreventNativeDismiss(Screen screen, boolean z2) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013To\u0006|+\u0013Yd?=\u0017uhjK")
    public void setReplaceAnimation(Screen view, String str) {
        Screen.ReplaceAnimation replaceAnimation;
        Intrinsics.checkNotNullParameter(view, "view");
        if (str == null ? true : Intrinsics.areEqual(str, "pop")) {
            replaceAnimation = Screen.ReplaceAnimation.POP;
        } else {
            if (!Intrinsics.areEqual(str, "push")) {
                throw new JSApplicationIllegalArgumentException("Unknown replace animation type " + str);
            }
            replaceAnimation = Screen.ReplaceAnimation.PUSH;
        }
        view.setReplaceAnimation(replaceAnimation);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Rq~\u00016|\u000b_;>*bsdL\u0019")
    public void setScreenOrientation(Screen view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScreenOrientation(str);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Wd~\u0010\t\u001a\u0005eM5\u001aEdoB\u0019\u0019_")
    public void setSheetAllowedDetents(Screen view, final ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.getSheetDetents().clear();
        if (readableArray == null || readableArray.size() == 0) {
            view.getSheetDetents().add(Double.valueOf(1.0d));
        } else {
            SequencesKt.toCollection(SequencesKt.map(CollectionsKt.asSequence(IntProgression.Companion.fromClosedRange(0, readableArray.size() - 1, 1)), new Function1<Integer, Double>() { // from class: com.swmansion.rnscreens.ScreenViewManager.setSheetAllowedDetents.1
                {
                    super(1);
                }

                public final Double invoke(int i2) {
                    return Double.valueOf(readableArray.getDouble(i2));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Double invoke(Integer num) {
                    return invoke(num.intValue());
                }
            }), view.getSheetDetents());
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Wd~\u0010\u000b\u001d\u000bd;B\bbcdR\u001e")
    public void setSheetCornerRadius(Screen view, float f2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetCornerRadius(f2);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Wd~\u0010\r\u001a}l7D\u001fpm")
    public void setSheetElevation(Screen screen, int i2) {
        if (screen == null) {
            return;
        }
        screen.setSheetElevation(i2);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Wd~\u0010\r&\tWD4)Xg`K}\b^\u0017S'\u000e\tXS\u0007[X$")
    public void setSheetExpandsWhenScrolledToEdge(Screen view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetExpandsWhenScrolledToEdge(z2);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Wd~\u0010\u000f yX85(WhnF\r\u0011Q")
    public void setSheetGrabberVisible(Screen view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetGrabberVisible(z2);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Wd~\u0010\u0011\u001c\u0002j?1\"EdoB\u0019\u0019")
    public void setSheetInitialDetent(Screen view, int i2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetInitialDetentIndex(i2);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Wd~\u0010\u0014\u000f\u000b];C*Vm_F\u0018\u0012Q\f+ \u001d\nrX")
    public void setSheetLargestUndimmedDetent(Screen view, int i2) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (-1 > i2 || i2 >= 3) {
            throw new IllegalStateException("[RNScreens] sheetLargestUndimmedDetent on Android supports values between -1 and 2".toString());
        }
        view.setSheetLargestUndimmedDetentIndex(i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r5.equals("flip") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        if (r5.equals("default") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (r5.equals("simple_push") != false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @yg.InterfaceC1492Gx
    @com.facebook.react.uimanager.annotations.ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014c`|\u0007\t\u001c\u0002c7D\u001fpm")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setStackAnimation(com.swmansion.rnscreens.Screen r4, java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackAnimation(com.swmansion.rnscreens.Screen, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r5.equals("modal") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r5.equals("containedModal") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r5.equals("containedTransparentModal") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        r0 = com.swmansion.rnscreens.Screen.StackPresentation.TRANSPARENT_MODAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r5.equals("fullScreenModal") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        r0 = com.swmansion.rnscreens.Screen.StackPresentation.MODAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (r5.equals("transparentModal") != false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @yg.InterfaceC1492Gx
    @com.facebook.react.uimanager.annotations.ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014c`|\u0007\u0018 }i;>*bsdL\u0019")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setStackPresentation(com.swmansion.rnscreens.Screen r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            if (r5 == 0) goto Lf
            int r0 = r5.hashCode()
            switch(r0) {
                case -76271493: goto L24;
                case 3452698: goto L2e;
                case 104069805: goto L39;
                case 438078970: goto L42;
                case 955284238: goto L4b;
                case 1171936146: goto L56;
                case 1798290171: goto L61;
                default: goto Lf;
            }
        Lf:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown presentation type "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r5)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L24:
            java.lang.String r0 = "transparentModal"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lf
            goto L53
        L2e:
            java.lang.String r0 = "push"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lf
            com.swmansion.rnscreens.Screen$StackPresentation r0 = com.swmansion.rnscreens.Screen.StackPresentation.PUSH
            goto L6b
        L39:
            java.lang.String r0 = "modal"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lf
            goto L5e
        L42:
            java.lang.String r0 = "containedModal"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lf
            goto L5e
        L4b:
            java.lang.String r0 = "containedTransparentModal"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lf
        L53:
            com.swmansion.rnscreens.Screen$StackPresentation r0 = com.swmansion.rnscreens.Screen.StackPresentation.TRANSPARENT_MODAL
            goto L6b
        L56:
            java.lang.String r0 = "fullScreenModal"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lf
        L5e:
            com.swmansion.rnscreens.Screen$StackPresentation r0 = com.swmansion.rnscreens.Screen.StackPresentation.MODAL
            goto L6b
        L61:
            java.lang.String r0 = "formSheet"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lf
            com.swmansion.rnscreens.Screen$StackPresentation r0 = com.swmansion.rnscreens.Screen.StackPresentation.FORM_SHEET
        L6b:
            r4.setStackPresentation(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackPresentation(com.swmansion.rnscreens.Screen, java.lang.String):void");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014c`\u000e\u0011;oyh\u0017>\u001fn`oF\u001a\u0013")
    public void setStatusBarAnimation(Screen view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarAnimated(Boolean.valueOf((str == null || Intrinsics.areEqual("none", str)) ? false : true));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @Deprecated(message = "\tU\u000etr\u0005%j\u0018[)\rW\u001a@WjSH\u001ahSK%K\u0006}|\u000eu&u~Q$VUe{xV0BJQ^M\rafWzjD:\u0017\u000f[a\u0004\u000e\u007fB\u0005wK\u0004?!\u000b\u0003\u007fd'T\u0010W\\D~H3g:f/@a\u001dp\b%yaF)e\u0003 \u001b\fN^&_3F<%}&2PM\u0016f^p\u001d[P3\b8 G*\u0001\u0013\u0017;yn\u001dRk%")
    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u0014c`\u000e\u0011;oyh\u0019?\"pq")
    public void setStatusBarColor(Screen view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarColor(num);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014c`\u000e\u0011;oyh\u001e9\u001aedi")
    public void setStatusBarHidden(Screen view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarHidden(Boolean.valueOf(z2));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014c`\u000e\u0011;oyh)D/md")
    public void setStatusBarStyle(Screen view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarStyle(str);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @Deprecated(message = "\tU\u000etr\u0005%j\u0018[)\rW\u001a@WjSH\u001ahSK%K\u0006}|\u000eu&u~Q$GQcm\u0006Z-\u007f?\u0016]Q9+k\b@s?6\u001e\u0011KSF468\u0007x\r\u0005C0\u000b~\naa\u001f\u0005T\u001c~|Fm-?Y~MV!r;)\u0004aX\u0018+>!*\u001fNd\u0017m")
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014c`\u000e\u0011;oyh*B\u0017orgR\u000e\nZ\u001c")
    public void setStatusBarTranslucent(Screen view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarTranslucent(Boolean.valueOf(z2));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSwipeDirection(Screen screen, String str) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setTransitionDuration(Screen screen, int i2) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(Screen view, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        return super.updateState(view, reactStylesDiffMap, stateWrapper);
    }
}
