package com.swmansion.rnscreens;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSSearchBarManagerDelegate;
import com.facebook.react.viewmanagers.RNSSearchBarManagerInterface;
import com.swmansion.rnscreens.events.SearchBarBlurEvent;
import com.swmansion.rnscreens.events.SearchBarChangeTextEvent;
import com.swmansion.rnscreens.events.SearchBarCloseEvent;
import com.swmansion.rnscreens.events.SearchBarFocusEvent;
import com.swmansion.rnscreens.events.SearchBarOpenEvent;
import com.swmansion.rnscreens.events.SearchBarSearchButtonPressEvent;
import java.util.Map;
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
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0ReP.XV2\u000f\u0002{<$a%yCIw\"}0\u0015WNu˧vJ`\u0011K\u000f\u0014\u001f\u0001j2J]xk\u0018\u00172H\u0007E8cڎ[p\u0011zF\u000702P8(\u00041 :J v)Cy\rJ/w1=ň\u0011M\u0013\u001cZ\u0016L%\u0019\u001e\u000bm~<Vsu<E\"1i\tboo>\u0005e\rtZW\u0013\u0005h6-V6c\u0015kgK\u0017`dW\u0003mwm\u000bv.?-_r\u00066\u001f\u0014\\#9Y%]!&\r\t_k$'Y[*]\u0019\u001e6\u0005\u0013{;B4\u0014\u0014.`0C\u0019\u0015\bTG=~aNh\bnD\u0010z\u00106E)FEsM)uioK\u001b^7*\u0016\u001d 3\u0001\u001d3qS<p[/\u001d}_Di@kY\u0015\u001e\"K{\u0018\tb0044U\u0015G{??]%\u007fiG99k0Ntk\u0005\fxh\u0002i\u0019Z\t:|-O*7\u0012\u000bHr\f\u0004P\u0003X\\\u0017[4l\t\u0014\u0007A1#\r\u0005>3)fO\u0017o\u001bQk\u0011=/\u00157\nty(o;t2cl*\u0015уVv\"[\u0005\u007f\u0013u~B\u0002\u0012\u000b`6)JH\u0019\u0010(\u0002Rl$\u0015H> ;zA֞\u001d\\#hK8Pb\u0015\t\u000e`\u0019\u0016\r[K&\u0019hRt9\u0007^~\tq}ww=CtjCOtM\u0019T[RlB\u0004;\u0007-s0Kup_L\u001b1<jD=$?QQ]CC\u0013\r0J\u0002[E|xsoe\u0014=y+\u0019UPÿ2g\u0016\u000b9Dn\u0011bO\u0003\u001dR|ly;\nz~(av~U\u0006l\u000b\nY\u0010\u0007KqJuP|3%N+\u000fv:~K,q'M\u001a\u00066G\u0015\u0010x0\u0004v\u0017p7>t\u0014\n\\g$vzQ\f2k>Ww\u0017@8#\u001b\"\t]ܖ{\bP)|%AqYd\u001f\\hQ\u00196\u0016f5,=vd\u0006R\u0015\u0006|b?&?<[\f?vCS\u0017}Yut\u0006Mr\nx\u000f:\u000f\nS\u0007\u0012JXfj z\u0017\\\u001esF<q?p\fT\tR4\\B\u00168[V\u007f\u0005>\fF[('%`Zsi\\>X\u0007cnH3`uf/W\u0019\u0001%2L\n{EM\u0004T\u0004Gc`\u0007\u0004!\u0017\"\u0003O-fU/R\u0005Q\u001bVsG \u000ewQz\u001a62MYsyv$:.{KBH!G\u0004)a\r/\r\u001c\u001cx\u0017\u0002\u0005E~R|(Y\u0003\t\u0004&<8\u000f;\u001f]\u0011\bdCK|\u0017}Xױ\u0005\u0017RIO+\u000b\u0018^\u001b[\fe3KP\u0003\u0016=z\u0006Sk\u0004\u0016B8)\u001asO{\u001e\"ҁ\u000e])Z^\n$\u0018\u001a\tAVP\n<Q\rt -66\u007f\u0006A8+^\b\u0007>5\u001199o\u001eH[j\t\n\u0012l\u0012r,̆\u0005Ђ5V\u0002ҧ\u009aTU"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-\u001fi\u001f*OCHA", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u0019z >X+7t0 \u0015u7", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-(q\u0016@#", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)Ok\u00178x%BgG\r [\u0004.IP9n\u0011\u001a\"P]B\u0003e,[Z0VL[-XPr\u0013", "u(E", "2d[2Z(MS", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u001fi\u001f*OCHJ4%\u0015j]H\u00079", "0kd?", "", "DhTD", "1`]0X3,S\u0015\fxa", "1kT.e\u001b>f(", "1qT.g,/W\u0019\u0011^g:\f\u00058c\u007f", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "4nRBf", "5dc\u0011X3>U\u0015\u000ez", "5dc\u0012k7H`(~y<<\u000b\u00189m^,\t@~&vXo\u0017Ke9@Y[*@{%*VRI", "", "", "", "5dc\u001bT4>", ":nV\u001bb;\u001ad\u0015\u0003\u0002Z)\u0004\t", ">q^=A(FS", "=m03g,KC$}vm,k\u0016+n\u000e$yO\u0005! ", "Adc\u000eh;H1\u0015\n~m(\u0004\rDe", "/tc<6(IW(z\u0002bA|", "Adc\u000eh;H4#|\u000bl", "/tc<96<c'", "", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{<r23\\Z\u001cD^\u001a._\u0019\"p0/\u00112h5\u0010eu+\u00011NLJ52\u0016c", "Adc\u000fT9-W\"\u000eXh3\u0007\u0016", "1n[<e", "", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{<r23\\Z\u001cD^\u001a._\u0019\"p0/\u00112h5\u0010eu2\u007f6GNN92\u0016c", "Adc\u0010T5<S [\u000bm;\u0007\u0012\u001ee\u00137", "D`[BX", "Adc\u0011\\::P ~WZ*\u0003e?t\u000f2\u0005*\u0012\u0017$Ts\r<", "2hb.U3>0\u0015|\u0001;<\f\u00189ni9{M\u000e\u001b\u0016G", "Adc\u0015X(=S&bxh5Z\u00136o\r", "Adc\u0015\\+><\u0015\u0010~`(\f\r9n\\$\t", "Adc\u0015\\+>E\u001c~\u0004L*\n\u00136l\u00041}", "Adc\u0015\\5MB\u0019\u0012\n<6\u0004\u0013<", "Adc\u0016a7Nb\b\u0013\u0006^", "7m_Bg\u001bR^\u0019", "Adc\u001cU:<c&~WZ*\u0003\u000b<o\u00101z", "Adc\u001d_(<S\u001c\t\u0002],\n", ">kP0X/HZ\u0018~\b", "Adc\u001d_(<S!~\u0004m", "Adc [6NZ\u0018l}h>_\r8tm(wM~\u001azEy\u0017", "Ag^B_+,V#\u0011]b5\fv/a\r&~$~! ", "Adc!X?M", "BdgA", "Adc!X?M1#\u0006\u0005k", "Adc!\\5M1#\u0006\u0005k", "BnV4_,\u001cO\"|ze\t\r\u0018>o\t", "4kP4", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@ReactModule(name = "\u0012\r\u0011\u0010!\u001c,\u001c x\u0017'")
public final class SearchBarManager extends ViewGroupManager<SearchBarView> implements RNSSearchBarManagerInterface<SearchBarView> {
    public static final Companion Companion = new Companion(null);
    public static final String REACT_CLASS = "RNSSearchBar";
    private final ViewManagerDelegate<SearchBarView> delegate = new RNSSearchBarManagerDelegate(this);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-\u001fi\u001f*OCH*\u0012(\u001ds]B\u000bm5$", "", "u(E", " D0\u0010G&\u001c:tlh", "", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
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

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void blur(SearchBarView searchBarView) {
        if (searchBarView != null) {
            searchBarView.handleBlurJsRequest();
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void cancelSearch(SearchBarView searchBarView) {
        if (searchBarView != null) {
            searchBarView.handleFocusJsRequest();
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void clearText(SearchBarView searchBarView) {
        if (searchBarView != null) {
            searchBarView.handleClearTextJsRequest();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public SearchBarView createViewInstance(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new SearchBarView(context);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void focus(SearchBarView searchBarView) {
        if (searchBarView != null) {
            searchBarView.handleFocusJsRequest();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<SearchBarView> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of(SearchBarBlurEvent.EVENT_NAME, MapBuilder.of("registrationName", "onSearchBlur"), SearchBarChangeTextEvent.EVENT_NAME, MapBuilder.of("registrationName", "onChangeText"), SearchBarCloseEvent.EVENT_NAME, MapBuilder.of("registrationName", "onClose"), SearchBarFocusEvent.EVENT_NAME, MapBuilder.of("registrationName", "onSearchFocus"), SearchBarOpenEvent.EVENT_NAME, MapBuilder.of("registrationName", "onOpen"), SearchBarSearchButtonPressEvent.EVENT_NAME, MapBuilder.of("registrationName", "onSearchButtonPress"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(SearchBarView view) throws Throwable {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.onUpdate();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r4.equals("none") != false) goto L16;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @yg.InterfaceC1492Gx
    @com.facebook.react.uimanager.annotations.ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002ds\t^)\u001e\u0002j7<\u001f{d")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setAutoCapitalize(com.swmansion.rnscreens.SearchBarView r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r4 == 0) goto L36
            int r0 = r4.hashCode()
            switch(r0) {
                case 3387192: goto L2e;
                case 113318569: goto L17;
                case 490141296: goto L23;
                case 1245424234: goto L39;
                default: goto Lf;
            }
        Lf:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r1 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r0 = "Forbidden auto capitalize value passed"
            r1.<init>(r0)
            throw r1
        L17:
            java.lang.String r0 = "words"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            com.swmansion.rnscreens.SearchBarView$SearchBarAutoCapitalize r0 = com.swmansion.rnscreens.SearchBarView.SearchBarAutoCapitalize.WORDS
            goto L43
        L23:
            java.lang.String r0 = "sentences"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            com.swmansion.rnscreens.SearchBarView$SearchBarAutoCapitalize r0 = com.swmansion.rnscreens.SearchBarView.SearchBarAutoCapitalize.SENTENCES
            goto L43
        L2e:
            java.lang.String r0 = "none"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
        L36:
            com.swmansion.rnscreens.SearchBarView$SearchBarAutoCapitalize r0 = com.swmansion.rnscreens.SearchBarView.SearchBarAutoCapitalize.NONE
            goto L43
        L39:
            java.lang.String r0 = "characters"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            com.swmansion.rnscreens.SearchBarView$SearchBarAutoCapitalize r0 = com.swmansion.rnscreens.SearchBarView.SearchBarAutoCapitalize.CHARACTERS
        L43:
            r3.setAutoCapitalize(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.SearchBarManager.setAutoCapitalize(com.swmansion.rnscreens.SearchBarView, java.lang.String):void");
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002ds\ta7\u0011\u000ei")
    public final void setAutoFocus(SearchBarView view, Boolean bool) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAutoFocus(bool != null ? bool.booleanValue() : false);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u0003Pqm\u00056\"[eB?(")
    public void setBarTintColor(SearchBarView view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTintColor(num);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setCancelButtonText(SearchBarView searchBarView, String str) {
        logNotAvailable("cancelButtonText");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xrz}4\u0013ZW9;wvsoL\u0019sb\rY-\u0012\ti")
    public void setDisableBackButtonOverride(SearchBarView view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShouldOverrideBackButton(!z2);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\tT`}\u0001:v{eD\u0013%mnm")
    public void setHeaderIconColor(SearchBarView view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setHeaderIconColor(num);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setHideNavigationBar(SearchBarView searchBarView, boolean z2) {
        logNotAvailable("hideNavigationBar");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setHideWhenScrolling(SearchBarView searchBarView, boolean z2) {
        logNotAvailable("hideWhenScrolling");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\tXm\u000eo-&\r9E<%s")
    public void setHintTextColor(SearchBarView view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setHintTextColor(num);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r4.equals("text") != false) goto L16;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @yg.InterfaceC1492Gx
    @com.facebook.react.uimanager.annotations.ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]o\u000f\u0010\u001c'\t[")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setInputType(com.swmansion.rnscreens.SearchBarView r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r4 == 0) goto L36
            int r0 = r4.hashCode()
            switch(r0) {
                case -1034364087: goto L17;
                case 3556653: goto L2d;
                case 96619420: goto L22;
                case 106642798: goto L39;
                default: goto Lf;
            }
        Lf:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r1 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r0 = "Forbidden input type value"
            r1.<init>(r0)
            throw r1
        L17:
            java.lang.String r0 = "number"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            com.swmansion.rnscreens.SearchBarView$SearchBarInputTypes r0 = com.swmansion.rnscreens.SearchBarView.SearchBarInputTypes.NUMBER
            goto L43
        L22:
            java.lang.String r0 = "email"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            com.swmansion.rnscreens.SearchBarView$SearchBarInputTypes r0 = com.swmansion.rnscreens.SearchBarView.SearchBarInputTypes.EMAIL
            goto L43
        L2d:
            java.lang.String r0 = "text"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
        L36:
            com.swmansion.rnscreens.SearchBarView$SearchBarInputTypes r0 = com.swmansion.rnscreens.SearchBarView.SearchBarInputTypes.TEXT
            goto L43
        L39:
            java.lang.String r0 = "phone"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            com.swmansion.rnscreens.SearchBarView$SearchBarInputTypes r0 = com.swmansion.rnscreens.SearchBarView.SearchBarInputTypes.PHONE
        L43:
            r3.setInputType(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.SearchBarManager.setInputType(com.swmansion.rnscreens.SearchBarView, java.lang.String):void");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setObscureBackground(SearchBarView searchBarView, boolean z2) {
        logNotAvailable("hideNavigationBar");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011[`|\u00010\u001d\u0005Z;B")
    public void setPlaceholder(SearchBarView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (str != null) {
            view.setPlaceholder(str);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setPlacement(SearchBarView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        logNotAvailable("setPlacement");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Wn\u000f\b,\u0001\u0001eM\u0018\u001fosNB\f\u0017O\u00100\u001e\u0018\u0013")
    public void setShouldShowHintSearchIcon(SearchBarView view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShouldShowHintSearchIcon(z2);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setText(SearchBarView searchBarView, String str) {
        if (searchBarView != null) {
            searchBarView.handleSetTextJsRequest(str);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u0015Tw\u000e^7\u001a\bh")
    public void setTextColor(SearchBarView view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTextColor(num);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setTintColor(SearchBarView searchBarView, Integer num) {
        logNotAvailable("tintColor");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void toggleCancelButton(SearchBarView searchBarView, boolean z2) {
        if (searchBarView != null) {
            searchBarView.handleToggleCancelButtonJsRequest(z2);
        }
    }
}
