package com.airbnb.android.react.lottie;

import android.animation.Animator;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieListener;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;
import java.util.WeakHashMap;
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
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\u0015\"4\u0012\u000e\u0007nj?0Le^.Zݷ2\u000fy\u001f<$i0yCI٥\"Ԃ*\t]pogtLb\u000bQ\u000f\u000e\u0016~k4Ikxe\u0012\u00152JoM<UoCHhtD\n(2(D\u0002\u0005\u000f\u001e2H\u0016w\u0011ŏ{\u0012\"2PphR;LE\u001dŪ\n>.\u0002fjuSNH\u001b]j31\t\u0002B|.&DEa\u001bNl5\u001dxq\u001eYJG7%%\u0002\u000e\u001dQ\nHIS:O\u0013t?3;K\u0004Wdb\u0010\u0016%+}\u0018\f\u007flpMWn\u001a?+}m\u0012dV6\u0006\n\u0014\rj\b>\n5XF-HfN\u000e{\u0003\u0001dXP0pr\u0004\tqN\u0017S\u007fy=\u0002;tdy;G`g\u007f\u0013\u001d6#/nQ_b\"x\u0015I^(W?fX?^M8o\u0004\u0002L\u0007p\u0019B\u0004^Y03\n!F\u0017S7\f=19\u0004\u0002v].{Mxvm\u0002RvRRt$GB\u000b\"Yrd5o^op,?fbYO\u0016\u0016/8\\&NQ)\u001e^gh\u0018j}c\u0018BGhMX\u001d\u0002T\\\u0002tASic>s\u0003z\"OTb3X\u0017Fa+r\\V;xM3&\u0006\u001c\\N:%bC\u007f,L,_\u0019\r\u0019V$6Bo\u0016Od#\u0006\u001e!l3R\u0015\u001a(\u0003\u0019\u0019P\u000bp m\u0007lD~v![Z\u0018:Ԋ*U0\r|\u00151,\u0017s.Y\u0018PU\\\u0005\u0016$U,&$@QSE<A\u0019E.z\u0018;ldr\u0014c}\u00165\u000b\u0015y=;\u00192u0\u0003pZy1O\u0018j%K\u000f^!58h\u000e\nyF)G\u0014X\u0019\u0006VI!. A\u0017P\u000b17\u001eS\u0013 &\u000bEECU\u001dF}\"\\-csh\u001e8@gW>\u0003\u0014\u001c,\u0012( f_mJ;fI\n\u0005LQ<n\u0019Avt>\r\u000b!B=KHov!ZF]#/,f72\u001b\"n]P\u0012\u001e\bz3(B\u0002u\u0016\u0014\rUU\u0015[c\u007fm\u001cK\r\u0011XB\"\r\u00120\u001d\u001cbBhne\u0017!04\u0006H:OKz\u0005j\tT::q \rYS\u0018\u0010V\u007fH^mE/2p\u0006kZ\u001cd\u0011\\\u0005H5fS\u00189,\u0017}==d}}G\u0013&^T]ub\u0005a-!\u001b\u0019O/j3d\\TgUn]I#S\u0019[I0H4K7}\u0004o:8H\u0003+~0\u001dOP?u=5/#cffp\u0007\u0014vR|\"9\u0001\u000b|<@8\u0012aĂQζsb5ًϾ{t"}, d2 = {"\u001ab^:\"(B`\u0016\bw((\u0006\b<o\u0004'EM\u0001\u0013\u0015V9\u0015F\u000649YG\u0007A|%2M\u001fDo<\u001a$lkBwg,`^#PHP,i(", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n#]\u0006+>m\u00072MU#g=\u001a\u0017hn\u000f", "\u001ab^:\"(B`\u0016\bw(3\u0007\u0018>i\u007fqbJ\u0010&\u001bGK\u0017@~!D]\b)(q\u0016@#", "u(E", ">q^=@(GO\u001b~\bl\u0014x\u0014", "\u001aiPCTuNb\u001d\u0006DP,x\u000f\u0012a\u000e+c<\fl", "\u001ab^:\"(B`\u0016\bw((\u0006\b<o\u0004'EM\u0001\u0013\u0015V9\u0015F\u000649YG\u0007A|%2M\u001fDo<\u001a$lkBwg,`a4QWN9kfZ9\u001d\u000e\\\u000e[\u0001", "1qT.g,/W\u0019\u0011^g:\f\u00058c\u007f", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "5dc\u0012k7H`(~y<<\u000b\u00189m^,\t@~&vXo\u0017Ke9@Y[*@{%*VRI", "", "", "", "5dc\u0012k7H`(~yO0|\u001b\ro\t6\u000b<\n&%", "", "5dc\u001bT4>", "5dc\u001ce\nKS\u0015\u000ezI9\u0007\u0014/r\u000f<c<\n\u0013\u0019G|", "DhTD", "=m03g,KC$}vm,k\u0016+n\u000e$yO\u0005! ", "", "@dR2\\=>1#\u0007\u0003Z5{", "1n\\:T5=<\u0015\u0007z", "/qV@", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "Adc\u000eh;H> z\u000f", "/tc<C3:g", "", "Adc\u0010T*ASv\t\u0003i6\u000b\r>i\n1", "1`R5X\nH[$\t\tb;\u0001\u00138", "Adc\u0010b3H`y\u0003\u0002m,\n\u0017", "1n[<e\rBZ(~\bl", "Adc\u0012a(;Z\u0019fzk.|s+t\u00036", "3mP/_,&S&\u0001zI(\f\f=", "Adc\u0012a(;Z\u0019lv_,d\u0013.e", "3mP/_,,O\u001a~bh+|", "Adc\u0015T9=e\u0015\fz:*z\t6e\r$\u000bD\u000b rPn\u001bFz$", "6`a1j(KSt|x^3|\u0016+t\u00042\u0005\u001c\n\u0016$Qs\r", "uKR<`u:W&{\u0004[u\u0004\u0013>t\u0004(E'\u000b&&KoiEz-1h\u0002*@^\u001a._\u0019\"p0/\u00112h5\u0010eu+\u00011NLJ52\u0016c", "Adc\u0016`(@St\r\t^;\u000bi9l~(\t", "7lP4X\bLa\u0019\u000e\t?6\u0004\b/r", "Adc\u0019b6I", ":n^=", "Adc\u001de6@`\u0019\r\t", ">q^4e,La", "", "Adc\u001fX5=S&f\u0005],", "@d]1X9&]\u0018~", "Adc\u001fX:Bh\u0019f\u0005],", "@db6m,&]\u0018~", "Adc b<KQ\u0019]\u0005m\u0013\u0007\u0018>i\u007f", "CqX", "Adc b<KQ\u0019c\th5", "8r^;", "Adc b<KQ\u0019gvf,", "<`\\2", "Adc b<KQ\u0019ngE", "Cq[ g9B\\\u001b", "Adc c,>R", "AoT2W", "", "Adc!X?M4\u001d\u0006\n^9\u000b", "BdgA90Eb\u0019\f\t", ":ncA\\,\u0006`\u0019zxms\u0006\u0005>i\u0011(uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class LottieAnimationViewManager extends SimpleViewManager<LottieAnimationView> {
    private final WeakHashMap<LottieAnimationView, LottieAnimationViewPropertyManager> propManagersMap = new WeakHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$0(LottieAnimationView view, Throwable th) {
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNull(th);
        LottieAnimationViewManagerImpl.sendAnimationFailureEvent(view, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$1(LottieAnimationView view, LottieComposition lottieComposition) {
        Intrinsics.checkNotNullParameter(view, "$view");
        LottieAnimationViewManagerImpl.sendAnimationLoadedEvent(view);
    }

    private final LottieAnimationViewPropertyManager getOrCreatePropertyManager(LottieAnimationView lottieAnimationView) {
        LottieAnimationViewPropertyManager lottieAnimationViewPropertyManager = this.propManagersMap.get(lottieAnimationView);
        if (lottieAnimationViewPropertyManager != null) {
            return lottieAnimationViewPropertyManager;
        }
        LottieAnimationViewPropertyManager lottieAnimationViewPropertyManager2 = new LottieAnimationViewPropertyManager(lottieAnimationView);
        this.propManagersMap.put(lottieAnimationView, lottieAnimationViewPropertyManager2);
        return lottieAnimationViewPropertyManager2;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public LottieAnimationView createViewInstance(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final LottieAnimationView lottieAnimationViewCreateViewInstance = LottieAnimationViewManagerImpl.createViewInstance(context);
        lottieAnimationViewCreateViewInstance.setFailureListener(new LottieListener() { // from class: com.airbnb.android.react.lottie.LottieAnimationViewManager$$ExternalSyntheticLambda0
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Object obj) {
                LottieAnimationViewManager.createViewInstance$lambda$0(lottieAnimationViewCreateViewInstance, (Throwable) obj);
            }
        });
        lottieAnimationViewCreateViewInstance.addLottieOnCompositionLoadedListener(new LottieOnCompositionLoadedListener() { // from class: com.airbnb.android.react.lottie.LottieAnimationViewManager$$ExternalSyntheticLambda1
            @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
            public final void onCompositionLoaded(LottieComposition lottieComposition) {
                LottieAnimationViewManager.createViewInstance$lambda$1(lottieAnimationViewCreateViewInstance, lottieComposition);
            }
        });
        lottieAnimationViewCreateViewInstance.addAnimatorListener(new Animator.AnimatorListener() { // from class: com.airbnb.android.react.lottie.LottieAnimationViewManager.createViewInstance.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                LottieAnimationViewManagerImpl.sendOnAnimationFinishEvent(lottieAnimationViewCreateViewInstance, true);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                LottieAnimationViewManagerImpl.sendOnAnimationFinishEvent(lottieAnimationViewCreateViewInstance, false);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        });
        return lottieAnimationViewCreateViewInstance;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return LottieAnimationViewManagerImpl.getExportedCustomDirectEventTypeConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return LottieAnimationViewManagerImpl.getExportedViewConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return LottieAnimationViewManagerImpl.REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        getOrCreatePropertyManager(view).commitChanges();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(LottieAnimationView view, String commandName, ReadableArray readableArray) throws Throwable {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(commandName, "commandName");
        switch (commandName.hashCode()) {
            case -934426579:
                if (commandName.equals("resume")) {
                    LottieAnimationViewManagerImpl.resume(view);
                    break;
                }
                break;
            case 3443508:
                if (commandName.equals("play")) {
                    LottieAnimationViewManagerImpl.play(view, readableArray != null ? readableArray.getInt(0) : -1, readableArray != null ? readableArray.getInt(1) : -1);
                    break;
                }
                break;
            case 106440182:
                if (commandName.equals("pause")) {
                    LottieAnimationViewManagerImpl.pause(view);
                    break;
                }
                break;
            case 108404047:
                if (commandName.equals("reset")) {
                    LottieAnimationViewManagerImpl.reset(view);
                    break;
                }
                break;
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002ds\tk4\u000f\u0012")
    public final void setAutoPlay(LottieAnimationView view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        LottieAnimationViewManagerImpl.setAutoPlay(z2, getOrCreatePropertyManager(view));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004Pb\u0002\u0001\u000b\u001d\u0006fEC\u001fuhjK")
    public final void setCacheComposition(LottieAnimationView lottieAnimationView, boolean z2) {
        Intrinsics.checkNotNull(lottieAnimationView);
        LottieAnimationViewManagerImpl.setCacheComposition(lottieAnimationView, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004^k\t\u000e\u000e\u0017\u0005j;B)")
    public final void setColorFilters(LottieAnimationView view, ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(view, "view");
        LottieAnimationViewManagerImpl.setColorFilters(readableArray, getOrCreatePropertyManager(view));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0006]`{\b-z}h=5\u0006bscPk\u0013P\u001aV$\rjsV\r`e\n\b~+2#1:/38")
    public final void setEnableMergePaths(LottieAnimationView view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        LottieAnimationViewManagerImpl.setEnableMergePaths(z2, getOrCreatePropertyManager(view));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0006]`{\b-\u0001y\\;\u001d%ed<K\u000f\u0017[\u0011K")
    public final void setEnableSafeMode(LottieAnimationView view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        LottieAnimationViewManagerImpl.setEnableSafeMode(z2, getOrCreatePropertyManager(view));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tPq}\u0013) }793\u001bmdm>\u001f\u000e[\u0016()\r\u0017sM&")
    public final void setHardwareAccelerationAndroid(LottieAnimationView view, Boolean bool) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNull(bool);
        LottieAnimationViewManagerImpl.setHardwareAcceleration(bool.booleanValue(), getOrCreatePropertyManager(view));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n\\`\u0001\u0001\t!\f[JC{pk_B\u001d")
    public final void setImageAssetsFolder(LottieAnimationView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        LottieAnimationViewManagerImpl.setImageAssetsFolder(str, getOrCreatePropertyManager(view));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\r^n\n")
    public final void setLoop(LottieAnimationView view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        LottieAnimationViewManagerImpl.setLoop(z2, getOrCreatePropertyManager(view));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\u0001\u000e-!\f")
    public final void setProgress(LottieAnimationView view, float f2) {
        Intrinsics.checkNotNullParameter(view, "view");
        LottieAnimationViewManagerImpl.setProgress(f2, getOrCreatePropertyManager(view));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tm}\u0001:z\bZ;")
    public final void setRenderMode(LottieAnimationView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        LottieAnimationViewManagerImpl.setRenderMode(str, getOrCreatePropertyManager(view));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\u0003\u0016-z\bZ;")
    public final void setResizeMode(LottieAnimationView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        LottieAnimationViewManagerImpl.setResizeMode(str, getOrCreatePropertyManager(view));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014^t\f~-q\bj\"?*uh`2|m")
    public final void setSourceDotLottie(LottieAnimationView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        LottieAnimationViewManagerImpl.setSourceDotLottieURI(str, getOrCreatePropertyManager(view));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014^t\f~-w\feD")
    public final void setSourceJson(LottieAnimationView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        LottieAnimationViewManagerImpl.setSourceJson(str, getOrCreatePropertyManager(view));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014^t\f~-{yc;")
    public final void setSourceName(LottieAnimationView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        LottieAnimationViewManagerImpl.setSourceName(str, getOrCreatePropertyManager(view));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014^t\f~-\u0003jB")
    public final void setSourceURL(LottieAnimationView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        LottieAnimationViewManagerImpl.setSourceURL(str, getOrCreatePropertyManager(view));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014_d~\u007f")
    public final void setSpeed(LottieAnimationView view, double d2) {
        Intrinsics.checkNotNullParameter(view, "view");
        LottieAnimationViewManagerImpl.setSpeed(d2, getOrCreatePropertyManager(view));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015Tw\u000ea1\u001a\r[HCvocmL\u0014\t")
    public final void setTextFilters(LottieAnimationView view, ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(view, "view");
        LottieAnimationViewManagerImpl.setTextFilters(readableArray, getOrCreatePropertyManager(view));
    }
}
