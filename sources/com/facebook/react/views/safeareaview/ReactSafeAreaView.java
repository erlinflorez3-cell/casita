package com.facebook.react.views.safeareaview;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4D\u0007\"B\u0012\u007f\u0007lmA0ReP.XS2\u000fy\u0005<řc$\u007fICU \u0001*\teNo˧\u0005Ϻ\u000b\u000bq\u000eF!\tn:Imx\f\u0013Ƥ6B}A{S}HQ`#BK2zPF\u0007\u001d\u0001H6x\u0014\u0005\t[K:!`D~Jj\r{\u0016J\u0016\u0014P8\u0001Lm\u0018RD[\u0005]h@S\u0007wVf'\u000eAC_UTb<%v\u0010*[DEK-%\u0002\u001aMS,N\u0011?\n=3iҊ+1Q֕o8^\u0003\"\u0019{i\u001bb\u000b(r\u0004\u007ffbʭ7յgWXʫ@y\u0001\u0003\u001bD$\u0010\f0V8Ǐ\u001e~"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c8w%1f}\u001cHq\u0016@\u00170;g2-\u0003db9bp,Jg+G^$", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~H\u0001 ?m\u0015\u001bM?9z\u0012(\u001ewaL\u00169o?", "5dc\u001fX(<bv\t\u0004m,\u0010\u0018", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#l#7u\u0016-:C7iC{\u001fqp9\u001ar\u0002", "AsPAX\u001eKO$\nzk", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n#hy/7_#*XN;x\n", "5dc g(MS\u000b\fvi7|\u0016mR\u007f$yO\\ \u0016Ty\u0012;p25`}\u001cEm", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#k/3|\u0016 Z?Fv4+j", "Adc g(MS\u000b\fvi7|\u0016mR\u007f$yO\\ \u0016Ty\u0012;p25`}\u001cEm", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~G\r\u001cFm\b;INFkAsXY", "=m0Ag(<V\u0019}ih\u001e\u0001\u0012.o\u0012", "", "=m;.l6Nb", ">/", "", ">0", "", ">1", ">2", ">3", "CoS.g,,b\u0015\u000ez", "7mb2g:", "\u001a`]1e6BR,Hxh9|R1r{3~D~%`+x\u001c<\u00063\u000b", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ReactSafeAreaView extends ViewGroup {
    private final ThemedReactContext reactContext;
    private StateWrapper stateWrapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactSafeAreaView(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat onAttachedToWindow$lambda$0(ReactSafeAreaView this$0, View view, WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Insets insets = windowInsets.getInsets((-1) - (((-1) - WindowInsetsCompat.Type.systemBars()) & ((-1) - WindowInsetsCompat.Type.displayCutout())));
        Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        this$0.updateState(insets);
        return WindowInsetsCompat.CONSUMED;
    }

    private final void updateState(Insets insets) {
        StateWrapper stateWrapper = this.stateWrapper;
        if (stateWrapper == null) {
            ThemedReactContext themedReactContext = this.reactContext;
            themedReactContext.runOnNativeModulesQueueThread(new GuardedRunnable(insets, themedReactContext) { // from class: com.facebook.react.views.safeareaview.ReactSafeAreaView.updateState.2
                final /* synthetic */ Insets $insets;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(themedReactContext);
                }

                @Override // com.facebook.react.bridge.GuardedRunnable
                public void runGuarded() {
                    UIManagerModule uIManagerModule = (UIManagerModule) ReactSafeAreaView.this.getReactContext().getReactApplicationContext().getNativeModule(UIManagerModule.class);
                    if (uIManagerModule != null) {
                        uIManagerModule.updateInsetsPadding(ReactSafeAreaView.this.getId(), this.$insets.top, this.$insets.left, this.$insets.bottom, this.$insets.right);
                    }
                }
            });
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putDouble("left", PixelUtil.INSTANCE.pxToDp(insets.left));
        writableNativeMap.putDouble("top", PixelUtil.INSTANCE.pxToDp(insets.top));
        writableNativeMap.putDouble(ViewProps.BOTTOM, PixelUtil.INSTANCE.pxToDp(insets.bottom));
        writableNativeMap.putDouble(ViewProps.RIGHT, PixelUtil.INSTANCE.pxToDp(insets.right));
        stateWrapper.updateState(writableNativeMap);
    }

    public final ThemedReactContext getReactContext() {
        return this.reactContext;
    }

    public final StateWrapper getStateWrapper$ReactAndroid_release() {
        return this.stateWrapper;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: com.facebook.react.views.safeareaview.ReactSafeAreaView$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return ReactSafeAreaView.onAttachedToWindow$lambda$0(this.f$0, view, windowInsetsCompat);
            }
        });
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    public final void setStateWrapper$ReactAndroid_release(StateWrapper stateWrapper) {
        this.stateWrapper = stateWrapper;
    }
}
