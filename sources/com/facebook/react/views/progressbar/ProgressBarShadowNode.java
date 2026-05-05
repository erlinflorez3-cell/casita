package com.facebook.react.views.progressbar;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaMeasureOutput;
import com.facebook.yoga.YogaNode;
import java.util.HashSet;
import java.util.Set;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\u0015\"4ߚ\u007f\u0007t\fA0RkP\u008cZS8\u001bs{:)c$\u007fJC٥\"}8\tWNulvϺb\u000bY\u000f\u000e\u0016~jBկ\u0006x\f\u0011?2po\u007f6ޜs=Ga=d\u0013/J\"f\n5\u0005(;`\u0010%\rsO\u001a H@\u001fM\u0003\u0011[\u00192\u00124SP\u0005,^\u007fNd[\u001daHE;\u0003\u0018W\u0015;0<\u000bO%F\u0003*cǻcӿ/@?ߎe7a\u0007\u001fXkA\u0013? C3m}ݓ-ʁwW>ݙP:#4g\u000fsqTd5Wn\u0013?-ebyXLmN߅\bɁ@\u0010\u0016ͺ?J47(q(\u00109\u0001\u0001`\u0011\\\u0010lZ\u007f)d\rА'ő7+AӕǁUx"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0019I\u0001'BY\f.4i#w8PEmA\u001e#v>5\u0014Q/Ju1Y5X+\\(", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001cU\u0012*G|\u00041IBE}\u001d(\u0014h7", "\u001ab^:\"-:Q\u0019{\u0005h2F\u001d9g{qoJ\u0003\u0013~Gk\u001cL\u0004%\u0016i\u0007\u001eFq 7#", "u(E", "6dX4[;", "\u001a`]1e6BRb\u000f\nb3Fv:a\r6{$\n&rT|\nPL", ";dP@h9>R", "", "", "D`[BX", "", "Ash9X", "5dc g@ES", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc g@ES", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "EhSA[", ";dP@h9>", "", "<nS2", "\u001ab^:\"-:Q\u0019{\u0005h2F\u001d9g{qoJ\u0003\u0013\u007fQn\u000e\u0012", "", "EhSA[\u0014HR\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\u001d9g{qoJ\u0003\u0013~Gk\u001cL\u0004%\u001dc| \r", "6dX4[;&]\u0018~", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ProgressBarShadowNode extends LayoutShadowNode implements YogaMeasureFunction {
    private String style;
    private final SparseIntArray height = new SparseIntArray();
    private final SparseIntArray width = new SparseIntArray();
    private final Set<Integer> measured = new HashSet();

    public ProgressBarShadowNode() {
        setMeasureFunction(this);
        this.style = ReactProgressBarViewManager.DEFAULT_STYLE;
    }

    public final String getStyle() {
        return this.style;
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(YogaNode node, float f2, YogaMeasureMode widthMode, float f3, YogaMeasureMode heightMode) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(widthMode, "widthMode");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        int styleFromString$ReactAndroid_release = ReactProgressBarViewManager.Companion.getStyleFromString$ReactAndroid_release(this.style);
        if (!this.measured.contains(Integer.valueOf(styleFromString$ReactAndroid_release))) {
            ProgressBar progressBarCreateProgressBar = ReactProgressBarViewManager.Companion.createProgressBar(getThemedContext(), styleFromString$ReactAndroid_release);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            progressBarCreateProgressBar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            this.height.put(styleFromString$ReactAndroid_release, progressBarCreateProgressBar.getMeasuredHeight());
            this.width.put(styleFromString$ReactAndroid_release, progressBarCreateProgressBar.getMeasuredWidth());
            this.measured.add(Integer.valueOf(styleFromString$ReactAndroid_release));
        }
        return YogaMeasureOutput.make(this.width.get(styleFromString$ReactAndroid_release), this.height.get(styleFromString$ReactAndroid_release));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cx\u0006\u0001\t\"\rh")
    public final void setStyle(String str) {
        if (str == null) {
            str = ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        this.style = str;
    }
}
