package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface;
import com.swmansion.rnscreens.events.HeaderAttachedEvent;
import com.swmansion.rnscreens.events.HeaderDetachedEvent;
import java.util.Map;
import javax.annotation.Nonnull;
import kotlin.Deprecated;
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
@Metadata(bv = {}, d1 = {"Яl\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0ReP.XS2\u000f\u0002{<řc$\u007fIC٥\"}8\tWȞog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4I[ze\u0012\u001dTJoM?UoKʠht<\u0007(20A\u0002\u0005\u0007L2H&v\u0003ŏS\f(0Hp@R\u0013R\u001b܅0\\n&\u0011 lg|6vk\u000e@?%\u0013ipNU`h{$MIù+\r\u0005cfIN<M\u0015SY3\u000b`bW\u0003mqm\tv/?+w|\b:f\n,\u0015YZSq;4j\u0011i`:4[SqYh\u000eV\u0007A\u0010UJ\u0012\u001e\u001e'v.]\u001et\u0019&3#\u0005\u001aR\u0019\u0018lU\u0018z\u0010?G)\u000e:C9If\u0002eI#f7*\u0010S2k\u000f|5sT<kE\u001fb~i1\u007f@\u0004\\\u0017\u0016gR\u0006\n\u0001d\u0012*20u\u0004u\u000eYB%;OiI%1k0`Ti\u0007\u0005\u000f\u0002ih\u0001_\u000767\u001cED!\f\t\\+\u00194^bsD\u0011{\"\u0005\u000b\f$+ \u000b\u0010\u0003!m\u0016\\l\u0001i\u0019k$\u001em=tVqn\u001a\u0014\b=l:MQ\u0012\u0010(d?$M\\z\u0005\u0007lrY\u0012YjI:2vjV\fDR\\.+2mwL8:81\\CHI2\u000bW\u000b,wZ\u0017\u0016/XA+\u001biRt9\u0005^f\to\u0016\u0004\u0010@Ez0QYQc\u001fV[0\nL~9\u0006-s0Muq_N\u0003\u0015$mB4^0GwG=A\u0015/-@)EEzr\u0016U[:?z+\u0018UP1Hu1\u0003pZf\u001bP]u/$\r]!#8j\u000e\u001fyH\u0011F\u0012lQo\u0007c\u0001-q<|>-\u000b-?=\u0003\u0006!+5]I5B.y*.Cy$}8F\b\u000e'&#k42q7\bdg\\`;hMg$V\"RwIV\u0011\u0003\u00064Z\tb\u0013cNO\u0006\tXNL9/.j\u0015Q%p\u0005y\u0001'8\u001bB[w*\"I.\u0018lj=\u0011{S\u0018s{yt\r`\u000e8\u0016BFߎ\u0016\u001cKO\u001fqp9H\u0006\"\u001efGI\u0004\u001d>\u001f#b,l\u000e\u0019hlk\u001c\u000f)\u0018\rsW4@s\f;\u0005\u0014\u0005|j}`\u0005\u000fE\u0011'83\u0017\u0011I\u001d'@w\u001a֪JT=\u0013z\u0019aP!\u001b\u0019U/j3R\\Tg\u001bX^\u000f?]_YH0NJ\\q\u0006y%$8F\u0003MH&<QS'^%0\u000f\u000fc\nfd%0-f\u0017875\u0013|<B:\u0013\u0019@gr\u001eb]P\\/OCH\u001f]Yq\u001d\u001a5{FI369;dajB',[at\u0016\bN>m\u0019=7j\u0012&f8cK>$\u0019.b0\tCT.?FJ#\u0011PCPN]>K\u0002Ad\nq\u0006BX)Ak4B{l\u0007/{l\u0012\r\u001c\u001fK\u0006?\u0014\u0012n[VM\u000f5nF\u0015nYh\u0011\u0004&f6\u0018\u0016+%MANvЍ\u0014Oq\u00189\u000b]\u001a%+]qZg?Qj \u0014\u001e(u40bM-=lLloOp\u05cfFW\u001c\u000e3Br4$)B\u0003/Nl2+6\\qLd_='Ds\u000f]_5\u001c\f]n9?\u0013W\u001be8;u6\u0018)\u0005Pa#\u007fZF\u0017\u0018\u0018gZ8\rh\u000645\u001b<m\u0013\tVQSYZ\nB\u0010<\u0011_`FEV^0\u001biiyUa)\u000fWP\u0006\u001e\rI;xrk'@\u007f+\u0001=C\bV\u0004:\"U97w'}^ofi+eiZN$\u0002\u0014J/Sq\u001b'cBHc]d\u000f\u001e]\u000eO7$R\f&'\u000elIHX_\rFd:o\u0006<)dy\u000b8ؼpx\u00029t\u0002&;|[\u0010:q~\"@\\>X-\u001d\rS\u0016\u0001{!C;]ZLW\u001c7|/|>U\"D9p\u000bM]\\\u000e@!>\u001c:`l|\u000f\u0010Xgu\u001e-@Z\u0014nx\u0015i_>8B\u0013\u001bP\u00103h_.xc-oa\u0005\u0014N\\'Sqf\u0019g'$\r.r\u0010\u0019T..v5H\u0013\u0013v#bKG\"Gw\u0016d#9\u001d?[U\n38\u0003Gms8m\u0006]A\\\u0006Ln4\u0014u5Y/l|+C\u007f\u001b1<\u001an@0)\u0007Y>Kr\u001d(F\u000fCVCvD\u0001b\r][c\u0011\u001e/=\u0004\u0015\u0014\u0003\tĒ9ׄh\u00113ŋȃr*"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sx.IB;x\u0012(\u001eie;wg,`^#PHP,i(", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u0019z >X+7t0 \u0015u7", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sx.IB;x\u0012(\u001eie;\\", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)Ok\u00178x%BgG\r [\u0004,ZC;t\"-\u0011fg\u001c\u0007_+N\u0004\u0005QUO0^:nF\u0010\u0014Z\u001b24\u001c\u0005fB lD\r", "u(E", "2d[2Z(MS", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u001fi\u001f*OCHJ4%\u0015j]H\u00079", "/cS#\\,P", "", ">`a2a;", "1gX9W", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7mS2k", "", "1qT.g,,V\u0015}\u0005p\u0015\u0007\b/I\t6\u000b<\n\u0015\u0017", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001cU\u0012*G|\u00041IBE}\u001d(\u0014h7", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "1qT.g,/W\u0019\u0011^g:\f\u00058c\u007f", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "5dc\u0010[0ERt\u000e", "5dc\u0010[0ERv\t\u000bg;", "5dc\u0011X3>U\u0015\u000ez", "5dc\u0012k7H`(~y<<\u000b\u00189m^,\t@~&vXo\u0017Ke9@Y[*@{%*VRI", "", "", "", "5dc\u001bT4>", ":nV\u001bb;\u001ad\u0015\u0003\u0002Z)\u0004\t", ">q^=A(FS", "<dT1f\nNa(\t\u0003E(\u0011\u0013?t`2\t\u001e\u0004\u001b\u001eF|\u000eE", "", "=m03g,KC$}vm,k\u0016+n\u000e$yO\u0005! ", "=m3?b7/W\u0019\u0011^g:\f\u00058c\u007f", "DhTD", "@d\\<i,\u001aZ o~^>\u000b", "@d\\<i,/W\u0019\u0011Vm", "Adc\u000fT*D0)\u000e\nh5[\r=p\u0007$\u0010(\u000b\u0016\u0017", "D`[BX", "Adc\u000fT*D0)\u000e\nh5`\u0012\ru\u000e7\u0006Hq\u001b\u0017Y", "1n]3\\.", "0`R85<Mb#\b^g\n\r\u0017>o\b\u0019\u007f@\u0013", "Adc\u000fT*DB\u001d\u000e\u0002^", "Adc\u000fT*DB\u001d\u000e\u0002^\r\u0007\u0012>F{0\u007fG\u0015", "Adc\u000fT*DB\u001d\u000e\u0002^\r\u0007\u0012>S\u0004={", "Adc\u000fT*DB\u001d\u000e\u0002^\u001d\u0001\u00173b\u0007(", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r", "0`R8Z9Hc\"}Xh3\u0007\u0016", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{:\u0004%5bk/3k\u001c\u0011M?:kA{\u001fqb=\t9\u0013Sr8C\u0016U(eT<!\u001d!Z\u0010N8bHJ", "Adc\u000f_<K3\u001a\u007fz\\;", "Adc\u0010b3H`", "1n[<e", "Adc\u0011\\9>Q(\u0003\u0005g", "2ha2V;B]\"", "Adc\u0011\\::P ~WZ*\u0003e?t\u000f2\u0005(\u0001 '", "Adc\u0015\\+=S\"", "6hS1X5", "Adc\u0015\\+>0\u0015|\u0001;<\f\u00189n", "6hS25(<Yu\u000f\nm6\u0006", "Adc\u0015\\+>A\u001czyh>", "6hS2F/:R#\u0011", "Adc\u0019T9@S\b\u0003\ne,", "Adc\u0019T9@S\b\u0003\ne,Y\u0005-k\u00025\u0006P\n\u0016tQv\u0018I", "Adc\u0019T9@S\b\u0003\ne,Z\u00136o\r", "Adc\u0019T9@S\b\u0003\ne,]\u00138t`$\u0004D\b+", "Adc\u0019T9@S\b\u0003\ne,]\u00138tm,\u0011@", "Adc\u0019T9@S\b\u0003\ne,]\u00138tq(\u007fB\u0004&", "Adc\u0019T9@S\b\u0003\ne,_\r.em+w?\u000b)", "Adc!\\;ES", "Bhc9X", "Adc!\\;ESv\t\u0002h9", "Bhc9X\nHZ#\f", "Adc!\\;ESy\t\u0004m\rx\u00113l\u0014", "Bhc9X\rH\\(_vf0\u0004\u001d", "Adc!\\;ESy\t\u0004m\u001a\u0001\u001e/", "Bhc9X\rH\\(l~s,", "Adc!\\;ESy\t\u0004m\u001e|\r1h\u000f", "Bhc9X\rH\\(pzb.\u007f\u0018", "Adc!b7\"\\'~\n>5x\u00066e~", "Bn_\u0016a:>bx\bv[3|\b", "Adc!e(Ga \u000fx^5\f", "BqP;f3NQ\u0019\b\n", "CoS.g,,b\u0015\u000ez", ">q^=f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\"Yy\u001eF[%BTCIJ8\u001f\u0016P]D\\", "AsPAX\u001eKO$\nzk", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n#hy/7_#*XN;x\n", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@ReactModule(name = "\u0012\r\u0011\u0010\u001f-\u001f\u001e&\n*\u0016\u0017\u001ey\u0016\u0011\u0013\u0013\u001fn\u001a\u0018\u000f\u0011\u000e")
public final class ScreenStackHeaderConfigViewManager extends ViewGroupManager<ScreenStackHeaderConfig> implements RNSScreenStackHeaderConfigManagerInterface<ScreenStackHeaderConfig> {
    public static final Companion Companion = new Companion(null);
    public static final String REACT_CLASS = "RNSScreenStackHeaderConfig";
    private final ViewManagerDelegate<ScreenStackHeaderConfig> delegate = new RNSScreenStackHeaderConfigManagerDelegate(this);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sx.IB;x\u0012(\u001eie;wg,`^#PHP,i\u0011PG\u001c\u001dV\u0017R5\u0016Z", "", "u(E", " D0\u0010G&\u001c:tlh", "", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void logNotAvailable(String str) {
        String str2 = str + " prop is not available on Android";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(ScreenStackHeaderConfig parent, View child, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (!(child instanceof ScreenStackHeaderSubview)) {
            throw new JSApplicationCausedNativeException("Config children should be of type RNSScreenStackHeaderSubview");
        }
        parent.addConfigSubview((ScreenStackHeaderSubview) child, i2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ScreenStackHeaderConfigShadowNode(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ScreenStackHeaderConfig createViewInstance(ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new ScreenStackHeaderConfig(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(ScreenStackHeaderConfig parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getConfigSubview(i2);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(ScreenStackHeaderConfig parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getConfigSubviewsCount();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<ScreenStackHeaderConfig> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of(HeaderAttachedEvent.EVENT_NAME, MapBuilder.of("registrationName", "onAttached"), HeaderDetachedEvent.EVENT_NAME, MapBuilder.of("registrationName", "onDetached"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ScreenStackHeaderConfig parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        super.onAfterUpdateTransaction(parent);
        parent.onUpdate();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@Nonnull ScreenStackHeaderConfig view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.destroy();
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeAllViews(ScreenStackHeaderConfig parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.removeAllConfigSubviews();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(ScreenStackHeaderConfig parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.removeConfigSubview(i2);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackButtonDisplayMode(ScreenStackHeaderConfig screenStackHeaderConfig, String str) {
        logNotAvailable("backButtonDisplayMode");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003Pb\u0005]=\"\reD\u0019$DtnQ\u001a\u0012B\u0011L2")
    public void setBackButtonInCustomView(ScreenStackHeaderConfig config, boolean z2) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setBackButtonInCustomView(z2);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackTitle(ScreenStackHeaderConfig screenStackHeaderConfig, String str) {
        logNotAvailable("backTitle");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackTitleFontFamily(ScreenStackHeaderConfig screenStackHeaderConfig, String str) {
        logNotAvailable("backTitleFontFamily");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackTitleFontSize(ScreenStackHeaderConfig screenStackHeaderConfig, int i2) {
        logNotAvailable("backTitleFontSize");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackTitleVisible(ScreenStackHeaderConfig screenStackHeaderConfig, boolean z2) {
        logNotAvailable("backTitleVisible");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u0003Pb\u0005\u0003:\u001d\u000ed:\u0013%mnm")
    public void setBackgroundColor(ScreenStackHeaderConfig config, Integer num) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setBackgroundColor(num);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBlurEffect(ScreenStackHeaderConfig screenStackHeaderConfig, String str) {
        logNotAvailable("blurEffect");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u0004^k\t\u000e")
    public void setColor(ScreenStackHeaderConfig config, Integer num) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTintColor(num != null ? num.intValue() : 0);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xq~~<\u0017\bd")
    public void setDirection(ScreenStackHeaderConfig config, String str) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setDirection(str);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setDisableBackButtonMenu(ScreenStackHeaderConfig screenStackHeaderConfig, boolean z2) {
        logNotAvailable("disableBackButtonMenu");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tXc}\u00016")
    public void setHidden(ScreenStackHeaderConfig config, boolean z2) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setHidden(z2);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tXc~])\u0011\u00048KD*pm")
    public void setHideBackButton(ScreenStackHeaderConfig config, boolean z2) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setHideBackButton(z2);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tXc~n0\u000f|eM")
    public void setHideShadow(ScreenStackHeaderConfig config, boolean z2) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setHideShadow(z2);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitle(ScreenStackHeaderConfig screenStackHeaderConfig, boolean z2) {
        logNotAvailable("largeTitle");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleBackgroundColor(ScreenStackHeaderConfig screenStackHeaderConfig, Integer num) {
        logNotAvailable("largeTitleBackgroundColor");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleColor(ScreenStackHeaderConfig screenStackHeaderConfig, Integer num) {
        logNotAvailable("largeTitleColor");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleFontFamily(ScreenStackHeaderConfig screenStackHeaderConfig, String str) {
        logNotAvailable("largeTitleFontFamily");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleFontSize(ScreenStackHeaderConfig screenStackHeaderConfig, int i2) {
        logNotAvailable("largeTitleFontSize");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleFontWeight(ScreenStackHeaderConfig screenStackHeaderConfig, String str) {
        logNotAvailable("largeTitleFontWeight");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleHideShadow(ScreenStackHeaderConfig screenStackHeaderConfig, boolean z2) {
        logNotAvailable("largeTitleHideShadow");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015Xs\u0006\u0001")
    public void setTitle(ScreenStackHeaderConfig config, String str) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTitle(str);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u0015Xs\u0006\u0001\u000b\u001d\u0005eH")
    public void setTitleColor(ScreenStackHeaderConfig config, Integer num) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (num != null) {
            config.setTitleColor(num.intValue());
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015Xs\u0006\u0001\u000e\u001d\u0007j\u001c1#jkt")
    public void setTitleFontFamily(ScreenStackHeaderConfig config, String str) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTitleFontFamily(str);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015Xs\u0006\u0001\u000e\u001d\u0007j)90f")
    public void setTitleFontSize(ScreenStackHeaderConfig config, int i2) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTitleFontSize(i2);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015Xs\u0006\u0001\u000e\u001d\u0007j-5\u001fhgo")
    public void setTitleFontWeight(ScreenStackHeaderConfig config, String str) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTitleFontWeight(str);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @Deprecated(message = "\tU\u000etr\u0005%j\u0018[)\rW\u001a@WjSH\u001ahSK%K\u0006}|\u000eu&u~Q$GQcm\u0006Z-\u007f?\u0016]Q9+k\b@s?6\u001e\u0011KSF468\u0007x\r\u0005C0\u0019")
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015^ob\n;\u0013\r;D1\u0018md_")
    public void setTopInsetEnabled(ScreenStackHeaderConfig config, boolean z2) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTopInsetEnabled(z2);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015a`\b\u000f4#{[DD")
    public void setTranslucent(ScreenStackHeaderConfig config, boolean z2) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTranslucent(z2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ScreenStackHeaderConfig view, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        return super.updateState(view, reactStylesDiffMap, stateWrapper);
    }
}
