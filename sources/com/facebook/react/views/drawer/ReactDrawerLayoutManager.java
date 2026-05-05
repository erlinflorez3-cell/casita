package com.facebook.react.views.drawer;

import android.view.View;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerDelegate;
import com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface;
import com.facebook.react.views.drawer.events.DrawerClosedEvent;
import com.facebook.react.views.drawer.events.DrawerOpenedEvent;
import com.facebook.react.views.drawer.events.DrawerSlideEvent;
import com.facebook.react.views.drawer.events.DrawerStateChangedEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
@Metadata(bv = {}, d1 = {"Яl\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0ReP\u008cZS@\u000fs{:&c$\bCC٥\"}0\u000fWNmivJh-K\u000f\u0014\"\u0001j2I]xk܈\u00172HpG3[xE9fw>\u000562*8\u007f\n\t\u001a@H\u0018v\u0001DS\f 5Hp@X\u0013R\u001b܅0:n&\u0011 lg|6vk\u000e@?%\u0013ipNU`h|\u0002B\u0007Wܮ\u0011vo sVE:-%\u0002\t7ViF\u001b? E5l50CI\"W|jH2#5g\r\fxV`\u0013\\x\fU+\u007fgY\\&(&\b,\u0011J\u0012&\u0006UWtAbt\u0016\u001eKt!YpT\u0010gZ\u007f)a|+m\u000eA<Q\u001b\u0015Q\u0012?'`O{3\u0015d5I\u0001/nl\u001ap\u0017+T&fASP=v]8m\u0004\u0002L|p\u0018B\n@I\u0010/*\u0011\\\u001bkK$K18\u0004\u000eXFwv3uxUyRvXP\u0003\\Kr\u001b\u001as\\p\u0015m`T\u0007A!O,T5\u00166'fp@B/?(N}}0~\u0016c\u0018@Gfeu5\u007fVeG{K5\u007fi@e`\u007f,?jbKl/ba*r\\V(bLx/\u0010{rN<\u0017@_\n\u001cb;a\u001fj6`\u00054Ao\u001fOt#\t\u001e\u001dl3R\t\u001a(\u0003(\u0019P\u000bp k\u0007iD|\u000f7]G_V1(k!\u0017VC7O\u001c\u0002#_gzM|p$~m{N\u0016J?_SU\u0015%}WAHB։Prsv\u0016*5!\u0015y=A\u00192u\u0011\u0003pZ`\u001bP]{/$\r]!8NyH\u0010on\u0013G\u0012Z;_LR\u000b\u0003\b<~<\u000b.7\u001eS+6'EM;k?\u001dD}D3#jui\u001e.*h\u001dJ\rg\u001a+\u0012+6v\u001as@fPI\b\u0005n&2u\u001bBvj(\fP2L\ra]\bd9lFy#/,l70\u001byn[h\u0013 \u0002B[w*\"qD\u0019'`3=eS\u0016s\u001eOj\u0014b\u000f8\u000b,7|?4?6U\u0006\u0011ODӒw\u0018Dp\u0004x\u0013l!$b2l\f\u0019Lli4\u0010+\u0004T\u0011'\u0017`p:O\u001f&b+tVv\u000b\u0011In*B\u0001-\u000fc$\u0007YI\u0007\u0004E\u0003D*GIp+<3j}\u0005\u0017)9Ml9I(\t\u0007\u0019iuE_\u0001d\u0013\u000e>Թoo\u001a]h\u000f+E0!IS!_%0\r\u000f,̧PЩz\u0012nŚƲ&_"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\rIr75fG\r7i\u0014=,P7}4+{duC\u0017r\u0014J\u007f#IL[\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u0019z >X+7t0 \u0015u7", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\rIr75fG\r7i\u0014=,P7}4+{duC\u0017r\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)Ok\u00178x%BgG{@l#8QB\u001ax00\u0015uH5\u001bm<]^#PHP,i6{L\u0014\u001f[\nL+b", "u(E", "2d[2Z(MS", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u001fi\u001f*OCHJ4%\u0015j]H\u00079", "/cS\u0012i,Gbx\u0007~m;|\u0016=", "", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "DhTD", "/cS#\\,P", ">`a2a;", "1gX9W", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7mS2k", "", "1k^@X\u000bKO+~\b", "1qT.g,/W\u0019\u0011^g:\f\u00058c\u007f", "1n]AX?M", "5dc\u0010b4FO\"}\tF(\b", "", "", "5dc\u0011X3>U\u0015\u000ez", "5dc\u0012k7H`(~y<<\u000b\u00189m^,\t@~&vXo\u0017Ke9@Y[*@{%*VRI", "", "5dc\u0012k7H`(~yO0|\u001b\ro\t6\u000b<\n&%", "5dc\u001bT4>", "<dT1f\nNa(\t\u0003E(\u0011\u0013?t`2\t\u001e\u0004\u001b\u001eF|\u000eE", "", "=oT;79:e\u0019\f", "@dR2\\=>1#\u0007\u0003Z5{", "@n^A", "1n\\:T5=7\u0018", "/qV@", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "Adc\u0011e(PS&[v\\2~\u00169u\t'YJ\b!$", "D`[BX", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0012\u001b\u0017Y}W;\u0004!GY\u000bi$m\u0012,\\\"HgF\u001e\"O]M\u0011s;$],C]JucN{?]uc\u001dN-\r\u0012/\u0005\u0015", "Adc\u0011e(PS&e\u0005\\2d\u0013.e", "2qPDX9%]\u0017\u0005bh+|", "Adc\u0011e(PS&i\u0005l0\f\r9n", "2qPDX9)]'\u0003\nb6\u0006", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001b\u000b.1a\u0002\u001e\r", "Adc\u0011e(PS&i\u0005l0\f\r9nc1\u000b@\u000e \u0013N", "Adc\u0011e(PS&p~];\u007f", "EhSA[", "", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0012\u001b\u0017Y}W;\u0004!GY\u000bi$m\u0012,\\\"HgF\u001e\"O]M\u0011s;$],C]JucN{?]ra\u0018J:bHJ", "Adc\u0012_,OO(\u0003\u0005g", "3kTCT;B]\"", "Adc\u0018X@;]\u0015\fy=0\u000b\u00113s\u000e\u0010\u0006?\u0001", "Adc g(Mc'[vk\tx\u00075g\r2\fI\u007ft!Ny\u001b", "\u0011n\\=T5B]\"", "\u0012qPDX9\u001ed\u0019\b\n>4\u0001\u0018>e\r", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@ReactModule(name = "\u0001-\"/+$\u001e|*\u0018-\u001a&~\u0013*\u001f$\"")
public final class ReactDrawerLayoutManager extends ViewGroupManager<ReactDrawerLayout> implements AndroidDrawerLayoutManagerInterface<ReactDrawerLayout> {
    public static final int CLOSE_DRAWER = 2;
    public static final String COMMAND_CLOSE_DRAWER = "closeDrawer";
    public static final String COMMAND_OPEN_DRAWER = "openDrawer";
    public static final Companion Companion = new Companion(null);
    private static final String DRAWER_POSITION = "DrawerPosition";
    private static final String DRAWER_POSITION_LEFT = "Left";
    private static final String DRAWER_POSITION_RIGHT = "Right";
    public static final int OPEN_DRAWER = 1;
    public static final String REACT_CLASS = "AndroidDrawerLayout";
    private final ViewManagerDelegate<ReactDrawerLayout> delegate = new AndroidDrawerLayoutManagerDelegate(this);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\":\u001e\u007f\u0007lo?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\fa(~:\t}P>ˮAН^\u000bKƤV\"\u0007mDI\u0004|4\u070fa̓FoG\u074c\u001e{K>xtd\tv\u074ctأ}\u0005\tɝzT\u001e|\u0013Cy\u0010hؖ\u0013¤>R\u0015˟U& \rV /\"3ɤ!ɇLleŽ\u007f/\u0011qZNUc\u0007Ū ϘJT/˙Gm,4X7c\u0017{ٌU\u07baV[Gš\u0010}K\u000f\u0001'U/ ֜*͏\\\u007f\u001cƃ۩S\u0018"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\rIr75fG\r7i\u0014=,P7}4+{duC\u0017r\u0014J\u007f#IL[j:\\zH\u0010\u001b^\u0018W\u0001", "", "u(E", "\u0011K> 8&\u001d@tpZK", "", "\u0011N<\u001a4\u0015\u001dMvedL\fvg\u001cAq\bh", "", "\u0011N<\u001a4\u0015\u001dM\u0003iZG&[u\u000bW_\u0015", "\u0012Q0$8\u00198>\u0003l^M\u0010fq", "\u0012Q0$8\u00198>\u0003l^M\u0010fq)L_\tj", "\u0012Q0$8\u00198>\u0003l^M\u0010fq)Rc\n^/", "\u001dO4\u001bR\u000b+/\u000b^g", " D0\u0010G&\u001c:tlh", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG0L͜P.hS2\u000fq|<$i)yCAU\"}0\u000fWȞm˧\u0005Ϻ\u000b\u000bq\u000eF)\tn:Imx\f\u0013\u001f6PqW3{rެ=`\u0003:M.@'Py3\u0007J.V\u0017\u000fzqSR&xN~Cj\r{\u000bJ\u0016\u0014E8\u0001Ld.b~^zgR/Q\t\u001aF\\.w0+U=Jb2%v\u0010*qT\u007fC#2k\u00035X\fC\u0011M\n=3wm;{U\u0002WNX.\u0015kۃQոar.ؘU]n\u000e?+}f\"ַ\u0010߭{z\u0004Ȟʆ\b\u001e"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\rIr75fG\r7i\u0014=,P7}4+{duC\u0017r\u0014J\u007f#IL[j;_nO\u0014\u001f:\u001fN4\u001cdaE3}DDt", "\u001a`]1e6BR,Hyk(\u000f\t<l{<\u0006P\u0010`)Kn\u0010<\u0006n\u0014fy27z|*aMKzr|\"ds9\u0014J0\\\u0006'PL[\u0002", "2qPDX9%O-\t\u000bm", "\u001a`]1e6BR,Hyk(\u000f\t<l{<\u0006P\u0010`)Kn\u0010<\u0006n\u0014fy27z|*aMKz\n", "3uT;g\u000bBa$z\n\\/|\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000e^CDz\u0013\"#s]H\u0005f,[L", "uKP;W9HW\u0018\u0012D]9x\u001b/r\u0007$\u0010J\u0011&`Ys\r>v4~8\u000b\u001cIm#\u0015IWE{Cs{fkAPd(Lv$QVTuiRn;#[j\u0012V'\u0016\u0001[A18DH\u001f\u0011;WK\u001by\u0001\u0015%l9x{>e\u000eJy\"K\u0005\u001a", "=m3?T>>`v\u0006\u0005l,{", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "=m3?T>>`\u0003\nzg,{", "=m3?T>>`\u0007\u0006~],", "D", "", "=m3?T>>`\u0007\u000evm,Z\f+n\u0002(z", "7", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class DrawerEventEmitter implements DrawerLayout.DrawerListener {
        private final DrawerLayout drawerLayout;
        private final EventDispatcher eventDispatcher;

        public DrawerEventEmitter(DrawerLayout drawerLayout, EventDispatcher eventDispatcher) {
            Intrinsics.checkNotNullParameter(drawerLayout, "drawerLayout");
            Intrinsics.checkNotNullParameter(eventDispatcher, "eventDispatcher");
            this.drawerLayout = drawerLayout;
            this.eventDispatcher = eventDispatcher;
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.eventDispatcher.dispatchEvent(new DrawerClosedEvent(UIManagerHelper.getSurfaceId(this.drawerLayout), this.drawerLayout.getId()));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.eventDispatcher.dispatchEvent(new DrawerOpenedEvent(UIManagerHelper.getSurfaceId(this.drawerLayout), this.drawerLayout.getId()));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerSlide(View view, float f2) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.eventDispatcher.dispatchEvent(new DrawerSlideEvent(UIManagerHelper.getSurfaceId(this.drawerLayout), this.drawerLayout.getId(), f2));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerStateChanged(int i2) {
            this.eventDispatcher.dispatchEvent(new DrawerStateChangedEvent(UIManagerHelper.getSurfaceId(this.drawerLayout), this.drawerLayout.getId(), i2));
        }
    }

    private final void setDrawerPositionInternal(ReactDrawerLayout reactDrawerLayout, String str) {
        if (Intrinsics.areEqual(str, "left")) {
            reactDrawerLayout.setDrawerPosition$ReactAndroid_release(GravityCompat.START);
        } else if (Intrinsics.areEqual(str, ViewProps.RIGHT)) {
            reactDrawerLayout.setDrawerPosition$ReactAndroid_release(GravityCompat.END);
        } else {
            FLog.w(ReactConstants.TAG, "drawerPosition must be 'left' or 'right', received" + str);
            reactDrawerLayout.setDrawerPosition$ReactAndroid_release(GravityCompat.START);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ThemedReactContext reactContext, ReactDrawerLayout view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, view.getId());
        if (eventDispatcherForReactTag == null) {
            return;
        }
        view.addDrawerListener(new DrawerEventEmitter(view, eventDispatcherForReactTag));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(ReactDrawerLayout parent, View child, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (getChildCount(parent) >= 2) {
            throw new JSApplicationIllegalArgumentException("The Drawer cannot have more than two children");
        }
        if (i2 != 0 && i2 != 1) {
            throw new JSApplicationIllegalArgumentException("The only valid indices for drawer's child are 0 or 1. Got " + i2 + " instead.");
        }
        parent.addView(child, i2);
        parent.setDrawerProperties$ReactAndroid_release();
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    public void closeDrawer(ReactDrawerLayout view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.closeDrawer$ReactAndroid_release();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ReactDrawerLayout createViewInstance(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ReactDrawerLayout(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return MapsKt.mapOf(TuplesKt.to(COMMAND_OPEN_DRAWER, 1), TuplesKt.to(COMMAND_CLOSE_DRAWER, 2));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<ReactDrawerLayout> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        LinkedHashMap exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap();
        }
        exportedCustomDirectEventTypeConstants.put(DrawerSlideEvent.EVENT_NAME, MapsKt.mapOf(TuplesKt.to("registrationName", "onDrawerSlide")));
        exportedCustomDirectEventTypeConstants.put(DrawerOpenedEvent.EVENT_NAME, MapsKt.mapOf(TuplesKt.to("registrationName", "onDrawerOpen")));
        exportedCustomDirectEventTypeConstants.put(DrawerClosedEvent.EVENT_NAME, MapsKt.mapOf(TuplesKt.to("registrationName", "onDrawerClose")));
        exportedCustomDirectEventTypeConstants.put(DrawerStateChangedEvent.EVENT_NAME, MapsKt.mapOf(TuplesKt.to("registrationName", "onDrawerStateChanged")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return MapsKt.mapOf(TuplesKt.to(DRAWER_POSITION, MapsKt.mapOf(TuplesKt.to(DRAWER_POSITION_LEFT, Integer.valueOf(GravityCompat.START)), TuplesKt.to(DRAWER_POSITION_RIGHT, Integer.valueOf(GravityCompat.END)))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    public void openDrawer(ReactDrawerLayout view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.openDrawer$ReactAndroid_release();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Deprecated(message = "\u0017N\u0005H1\u0002\u001ak`V,:Y(kRa\\\u001b,\bi Wz\u0014._aycxmOiKcaKHS+4H\u0016\u001e>~#[\\\u001fw?K\u0017\u001e3\u0015]*\fHM2~\u0004I%Y\u0005G\u001d\u0014\r|L\u0011A\u0007F\u000f:CT\t\u0004\u0013%|\u000f4z#H", replaceWith = @ReplaceWith(expression = "receiveCommand(ReactDrawerLayout, String, ReadableArray)", imports = {}))
    @InterfaceC1492Gx
    public void receiveCommand(ReactDrawerLayout root, int i2, ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(root, "root");
        if (i2 == 1) {
            root.openDrawer$ReactAndroid_release();
        } else {
            if (i2 != 2) {
                return;
            }
            root.closeDrawer$ReactAndroid_release();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactDrawerLayout root, String commandId, ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        if (Intrinsics.areEqual(commandId, COMMAND_OPEN_DRAWER)) {
            root.openDrawer$ReactAndroid_release();
        } else if (Intrinsics.areEqual(commandId, COMMAND_CLOSE_DRAWER)) {
            root.closeDrawer$ReactAndroid_release();
        }
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u0005a`\u0011\u0001:oyYA7(ptiAm\u0014X\u0017Y")
    public void setDrawerBackgroundColor(ReactDrawerLayout view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r5.equals("unlocked") != false) goto L22;
     */
    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    @yg.InterfaceC1492Gx
    @com.facebook.react.uimanager.annotations.ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005a`\u0011\u0001:y\bYA\u001d%ed")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setDrawerLockMode(com.facebook.react.views.drawer.ReactDrawerLayout r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r2 = 0
            if (r5 == 0) goto L5b
            int r1 = r5.hashCode()
            r0 = -1292600945(0xffffffffb2f4798f, float:-2.8460617E-8)
            if (r1 == r0) goto L43
            r0 = -210949405(0xfffffffff36d2ae3, float:-1.8790347E31)
            if (r1 == r0) goto L52
            r0 = 168848173(0xa106b2d, float:6.953505E-33)
            if (r1 == r0) goto L34
        L1c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown drawerLockMode "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r5)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "ReactNative"
            com.facebook.common.logging.FLog.w(r0, r1)
            r4.setDrawerLockMode(r2)
        L33:
            return
        L34:
            java.lang.String r0 = "locked-open"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L3e
            goto L1c
        L3e:
            r0 = 2
            r4.setDrawerLockMode(r0)
            goto L33
        L43:
            java.lang.String r0 = "locked-closed"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L4d
            goto L1c
        L4d:
            r0 = 1
            r4.setDrawerLockMode(r0)
            goto L33
        L52:
            java.lang.String r0 = "unlocked"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L1c
        L5b:
            r4.setDrawerLockMode(r2)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.drawer.ReactDrawerLayoutManager.setDrawerLockMode(com.facebook.react.views.drawer.ReactDrawerLayout, java.lang.String):void");
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005a`\u0011\u0001:}\bi?D\u001fpm")
    public final void setDrawerPosition(ReactDrawerLayout view, Dynamic drawerPosition) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(drawerPosition, "drawerPosition");
        if (drawerPosition.isNull()) {
            view.setDrawerPosition$ReactAndroid_release(GravityCompat.START);
            return;
        }
        if (drawerPosition.getType() != ReadableType.Number) {
            if (drawerPosition.getType() == ReadableType.String) {
                setDrawerPositionInternal(view, drawerPosition.asString());
                return;
            } else {
                FLog.w(ReactConstants.TAG, "drawerPosition must be a string or int");
                view.setDrawerPosition$ReactAndroid_release(GravityCompat.START);
                return;
            }
        }
        int iAsInt = drawerPosition.asInt();
        if (8388611 == iAsInt || 8388613 == iAsInt) {
            view.setDrawerPosition$ReactAndroid_release(iAsInt);
        } else {
            FLog.w(ReactConstants.TAG, "Unknown drawerPosition " + iAsInt);
            view.setDrawerPosition$ReactAndroid_release(GravityCompat.START);
        }
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    public void setDrawerPosition(ReactDrawerLayout view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (str == null) {
            view.setDrawerPosition$ReactAndroid_release(GravityCompat.START);
        } else {
            setDrawerPositionInternal(view, str);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = Float.NaN, name = "\u0005a`\u0011\u0001:\u0005\u0002ZJ8")
    public final void setDrawerWidth(ReactDrawerLayout view, float f2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDrawerWidth$ReactAndroid_release(Float.isNaN(f2) ? -1 : Math.round(PixelUtil.INSTANCE.dpToPx(f2)));
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    public void setDrawerWidth(ReactDrawerLayout view, Float f2) {
        int iRound;
        Intrinsics.checkNotNullParameter(view, "view");
        if (f2 != null) {
            iRound = Math.round(PixelUtil.INSTANCE.dpToPx(f2.floatValue()));
        } else {
            iRound = -1;
        }
        view.setDrawerWidth$ReactAndroid_release(iRound);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    public void setElevation(ReactDrawerLayout view, float f2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDrawerElevation(PixelUtil.INSTANCE.dpToPx(f2));
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\fTx{\u000b) |:?C#jrn*\u001a\tQ")
    public void setKeyboardDismissMode(ReactDrawerLayout view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u0014c`\u000e\u0011;oyh\u00181\u0019lfmL \u0013PjV'\u0018\u0017")
    public void setStatusBarBackgroundColor(ReactDrawerLayout view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
