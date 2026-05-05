package com.facebook.react.views.progressbar;

import android.R;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.AndroidProgressBarManagerDelegate;
import com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaMeasureOutput;
import java.util.WeakHashMap;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яď\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.J~8,\u001aw\rfr9FDm߉6Ri*\u0017k\n:,[:qK;[\u001b\u0006\"\u001fOVgmnRZ\u0019O\u0017إ\u001ex\u0001,Qǁ\u0001] \u0016:B\u0006?;ݹw=O`|6\u000b!:\"F~\rЏ\"*^\u0010~zIL\u0014\u0012>RxíZ\r[\u0005\"\u0012\f?(\u0001,eoN<Mt]H3+\u0003oHV'mܞ\u0005M\u0013FZ,#Ǹ\u007fW[LG7%%\u0002\u0003\u0017Tk?1@ <5n7);I\"WdZ8\u0013NkRոar4_MWn\u0016?+}d\u0012dV6\u0006\u0006\u0014\rj\u0004>\n5TF-HsN {\u0001\u0001aXV\u0012`R\u007f)ad\u001ck\u0012{1G*~Q\u0010K_b\u007f\b\u0013\u001e6)\u0011p1[\u0003\u000f\u000f'ah@\"?dX=vb:]Ky\u001cp\u0011\u0017Z\b>]\u0018/*(^\u001b3Os9Q8\u001c\u0006V]\u007fv3w\u0019Wwl`@P\nF;8%$Zr\u00025o^rp,?hLX\u0015\u001d \u0013Ny(B/E(Peg\u0018\f\u0014qR3=\tOY\u001d\u000f>[G\u0003K5\u007fcVs\u001b\r\"dTb3{\u0017Fa0r\\V\"bLx6\u0010{ruR(z\\\u007fDL,_<\r\u0019V'6Bo|9eh\u0012(\u0001j2R\u000b09ڲ\r\u0001^\u00079\u0006u$a,+\u0004R1OuM\u0019TURlB);\u0007-\u001bF\\0bUy\u0005\u0016$x,$$>QQ]=C\u0013\rWJ\u0002[t\u0013\b.i[B?z+\u001d??vR\u007f\b\u0019p\\fx{gV-!%n98P|\u000e,yF)j\u0014X\u0019\u007fVI!\u0003\nB\\k\u0015\u00075\u001dS\u001166EM;w?\u001dD\u001bD3#\u0006ui\u001e.*h\u001dY\rg\u001a+\u0012&6w\u001as@pPI\b\"n&2#\u001bBvj(\fP@L\ra\u0001\bxAhFQ#5\u000eh\u0017,;p\u0005`\u0011ܧqϻ8.g͈Dg\f\u001av[5\u0013]S\u0016u}Yl\u0017Z\u0011\u001a\u000b*9~\u0014,=N^\u0006k77\\֏\u001aݠE;jŝÞ\r^"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0019I\u0001'BY\f.4i#w:C7iC\t\"rcF\u0007q:+r48PN>DN{9\u0016\u0012gc", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u0012U\f (q\u0016@5?Dg6\u001e\">", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0019I\u0001'BY\f.4i#w8PEmA\u001e#v>5\u0014A6W\u0006#KUN9MVrOi", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0019I\u0001'BY\f.4i#w8PEmA\u001e#v>5\u0014Q/Ju1Y5X+\\(", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)Ok\u00178x%BgG{@l#8QB&x> \"hoGc_96r0CNN9@[\u0002=!\u0013V\fN\u0001", "u(E", "2d[2Z(MS", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u001fi\u001f*OCHJ4%\u0015j]H\u00079", ";dP@h9>R\u0007\u000e\u000fe,\u000b", "\u001aiPCTuNb\u001d\u0006DP,x\u000f\u0012a\u000e+c<\fl", "", "\u001a`]1e6BRb\u000f\nb3Fs+i\r}", "1qT.g,,V\u0015}\u0005p\u0015\u0007\b/I\t6\u000b<\n\u0015\u0017", "1qT.g,/W\u0019\u0011^g:\f\u00058c\u007f", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "5dc\u0011X3>U\u0015\u000ez", "5dc\u001bT4>", "", "5dc [(=]+g\u0005],Z\u0010+s\u000e", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", ";dP@h9>", "", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ":nR._\u000b:b\u0015", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", ">q^=f", "AsPAX", "EhSA[", "", "EhSA[\u0014HR\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\u001d9g{qoJ\u0003\u0013~Gk\u001cL\u0004%\u001dc| \r", "6dX4[;", "6dX4[;&]\u0018~", "/sc.V/FS\"\u000e\tI6\u000b\r>i\n1\n", "", "=m03g,KC$}vm,k\u0016+n\u000e$yO\u0005! ", "", "DhTD", "Adc\u000ea0FO(\u0003\u0004`", "/mX:T;B\\\u001b", "", "Adc\u0010b3H`", "1n[<e", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0012\u001b\u0017Y}WG\u0004/7f}.Ej\u0012;\u0017.Hu6+\u0015vo\u0016\u0003p\nX\u007f6CPW,iCv=&gA\u0013J<\tN`=-p\u000e\u001b(\u0017,K\u0002H>D|", "Adc\u0016a+>b\u0019\f\u0003b5x\u0018/", "7mS2g,K[\u001d\bvm,", "Adc\u001de6@`\u0019\r\t", ">q^4e,La", "", "Adc g@ESt\u000e\nk", "Ash9X\u0015:[\u0019", "Adc!X:M7w", "D`[BX", "Adc!l7>/(\u000e\b", "CoS.g,\u001ef(\fv=(\f\u0005", "@n^A", "3wc?T\u000b:b\u0015", "", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@ReactModule(name = "\u0001-\"/+$\u001e\t*&\u001d'\u0019&%r\u0011!")
public final class ReactProgressBarViewManager extends BaseViewManager<ProgressBarContainerView, ProgressBarShadowNode> implements AndroidProgressBarManagerInterface<ProgressBarContainerView> {
    public static final String DEFAULT_STYLE = "Normal";
    public static final String PROP_ANIMATING = "animating";
    public static final String PROP_ATTR = "typeAttr";
    public static final String PROP_INDETERMINATE = "indeterminate";
    public static final String PROP_PROGRESS = "progress";
    public static final String PROP_STYLE = "styleAttr";
    public static final String REACT_CLASS = "AndroidProgressBar";
    public static final Companion Companion = new Companion(null);
    private static final Object progressBarCtorLock = new Object();
    private final WeakHashMap<Integer, Pair<Integer, Integer>> measuredStyles = new WeakHashMap<>();
    private final ViewManagerDelegate<ProgressBarContainerView> delegate = new AndroidProgressBarManagerDelegate(this);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005(4\u0012\u000e\u0007nʑA0ZeP\u008cZS8\u0015s{:&aҜrYП\u0006\u001a,!ITTg̊rJh\u000b\f%\u0014 \u0011jZT\u0006~k\u001e'4Xnm@}sKGxtd\u0014hG0H\u0012\u0005/)ZN\u001e\b\u0013Ea\u000b@2\u0007\u0081ĐV\rS\u0017j\u001e\u0014?8\u0001L^>ޯ\tՂp]Bǂs\u000fwEf'\u000e2Sղ_ТX'\u0015Ǹ2*9DO5C'*ΉYқ_?\u000bӊBI\u0013m?'YKJɏ\tݼ\u0004\u0014\u001dۀ \u0019kx>\\3S7ϰy˦ScSִ^4\u0006\u0002\u0014\rj\u0006dͻyρ2-\"ǑX\u001aA|\u000bSnRXސ\u0015ȸ~a>Ѝu\fA4Q\u001b\u0015P8ݥ\u001b\u05ee;{\rټ̽'\u0014"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0019I\u0001'BY\f.4i#w:C7iC\t\"rcF\u0007q:+r48PN>DN{9\u0016\u0012gL,5\u0015\u0010UJ(xM\r", "", "u(E", "\u0012D5\u000eH\u0013-M\u0007mnE\f", "", "\u001eQ>\u001dR\b'7\u0001ZiB\u0015^", "\u001eQ>\u001dR\b-B\u0006", "\u001eQ>\u001dR\u0010'2xmZK\u0014`q\u000bT_", "\u001eQ>\u001dR\u0017+=zkZL\u001a", "\u001eQ>\u001dR\u001a-G\u007f^", " D0\u0010G&\u001c:tlh", ">q^4e,Lauz\b<;\u0007\u0016\u0016o}.", "1qT.g,)`#\u0001\b^:\u000be+r", "\u001a`]1e6BRb\u0011~].|\u0018xP\r2}M\u0001%%$k\u001b\u0012", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Ash9X", "", "5dc g@ESy\f\u0005f\u001a\f\u00163n\u0002", "Ash9X\u001aM`", "5dc g@ESy\f\u0005f\u001a\f\u00163n\u0002fh@|\u0015&#x\rI\u0001)4S\u000b >m\u0012<M", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ProgressBar createProgressBar(Context context, int i2) {
            ProgressBar progressBar;
            synchronized (ReactProgressBarViewManager.progressBarCtorLock) {
                progressBar = new ProgressBar(context, null, i2);
            }
            return progressBar;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final int getStyleFromString$ReactAndroid_release(String str) {
            if (str == null) {
                FLog.w(ReactConstants.TAG, "ProgressBar needs to have a style, null received");
                return R.attr.progressBarStyle;
            }
            switch (str.hashCode()) {
                case -1955878649:
                    if (str.equals(ReactProgressBarViewManager.DEFAULT_STYLE)) {
                        return R.attr.progressBarStyle;
                    }
                    break;
                case -1414214583:
                    if (str.equals("SmallInverse")) {
                        return R.attr.progressBarStyleSmallInverse;
                    }
                    break;
                case -913872828:
                    if (str.equals("Horizontal")) {
                        return R.attr.progressBarStyleHorizontal;
                    }
                    break;
                case -670403824:
                    if (str.equals("Inverse")) {
                        return R.attr.progressBarStyleInverse;
                    }
                    break;
                case -142408811:
                    if (str.equals("LargeInverse")) {
                        return R.attr.progressBarStyleLargeInverse;
                    }
                    break;
                case 73190171:
                    if (str.equals("Large")) {
                        return R.attr.progressBarStyleLarge;
                    }
                    break;
                case 79996135:
                    if (str.equals("Small")) {
                        return R.attr.progressBarStyleSmall;
                    }
                    break;
            }
            FLog.w(ReactConstants.TAG, "Unknown ProgressBar style: " + str);
            return R.attr.progressBarStyle;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ProgressBarShadowNode createShadowNodeInstance() {
        return new ProgressBarShadowNode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ProgressBarContainerView createViewInstance(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ProgressBarContainerView(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<ProgressBarContainerView> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<ProgressBarShadowNode> getShadowNodeClass() {
        return ProgressBarShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap localData, ReadableMap props, ReadableMap state, float f2, YogaMeasureMode widthMode, float f3, YogaMeasureMode heightMode, float[] fArr) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(localData, "localData");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widthMode, "widthMode");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        Companion companion = Companion;
        int styleFromString$ReactAndroid_release = companion.getStyleFromString$ReactAndroid_release(props.getString(PROP_STYLE));
        WeakHashMap<Integer, Pair<Integer, Integer>> weakHashMap = this.measuredStyles;
        Integer numValueOf = Integer.valueOf(styleFromString$ReactAndroid_release);
        Pair<Integer, Integer> pairCreate = weakHashMap.get(numValueOf);
        if (pairCreate == null) {
            ProgressBar progressBarCreateProgressBar = companion.createProgressBar(context, styleFromString$ReactAndroid_release);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            progressBarCreateProgressBar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            pairCreate = Pair.create(Integer.valueOf(progressBarCreateProgressBar.getMeasuredWidth()), Integer.valueOf(progressBarCreateProgressBar.getMeasuredHeight()));
            weakHashMap.put(numValueOf, pairCreate);
        }
        Pair<Integer, Integer> pair = pairCreate;
        return YogaMeasureOutput.make(PixelUtil.toDIPFromPixel(((Number) pair.first).intValue()), PixelUtil.toDIPFromPixel(((Number) pair.second).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ProgressBarContainerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.apply$ReactAndroid_release();
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002]h\u0007|<\u0017\u0007]")
    public void setAnimating(ProgressBarContainerView view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAnimating$ReactAndroid_release(z2);
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u0004^k\t\u000e")
    public void setColor(ProgressBarContainerView view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setColor$ReactAndroid_release(num);
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]c~\u0010- \u0006_D1*f")
    public void setIndeterminate(ProgressBarContainerView view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setIndeterminate$ReactAndroid_release(z2);
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\u0001\u000e-!\f")
    public void setProgress(ProgressBarContainerView view, double d2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setProgress$ReactAndroid_release(d2);
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cx\u0006\u0001\t\"\rh")
    public void setStyleAttr(ProgressBarContainerView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStyle$ReactAndroid_release(str);
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    public void setTestID(ProgressBarContainerView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.setTestId(view, str);
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015ho~\\<\"\u000b")
    public void setTypeAttr(ProgressBarContainerView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(ProgressBarContainerView root, Object extraData) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
    }
}
