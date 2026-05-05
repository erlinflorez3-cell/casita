package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import kotlin.Metadata;
import kotlin.Unit;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007f\u0007lmA0RkP.XZ2\u000fy\u007f<$a'yCQU\"Ԃ*\t]NogtLb\u000bQ\u001b\u000e\u0016~kBկs\u001c\u000e\u0012=1znbsX\u007fAG`\r63!ݨ&8\b\u0007I%8c(v)_\u0012Èܘ4@vW\u001b\u001b[#2\u00124ZP\u0005,u\u007fNdb3]\u0003D1\"\u0002B|C\u00106\u000bm%Hj&;\u0018(ӜҋD7;7uk\u0011\nj[m\u0007\u0016нIݾl3/Ǣau];f\u00064\u00171V\u001beCBj\u000eib\"&YY:֠\\ˎ,\u0006\u0003{\u001bK\u001c\u0010\f2V:M\u001cl\u0015\u001cAE\u000baPh\u0002\rFVЮmي\u001b1\bđC;!w_g[\u001bTI\n\r]61\u0014\u0007!\nhd֬!ôX\u0004YĸiBC]\\ y?s\u001b~zR8\u0012I_\u0002Ez?Hm©C٦=#)ǽɞLh"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0019I\u0001'BY\f.4i#w8PEmA\u001e#v>5\u0014A6W\u0006#KUN9MVrOi", "\u001a`]1e6BRb\u0011~].|\u0018xF\r$\u0004@g\u0013+Q\u007f\u001d\u0012", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "/mX:T;B\\\u001b", "", "5dc\u000ea0FO(\u0003\u0004`ji\t+c\u000f\u0004\u0005?\u000e!\u001bFi\u001b<}%1g}", "u(I", "Adc\u000ea0FO(\u0003\u0004`ji\t+c\u000f\u0004\u0005?\u000e!\u001bFi\u001b<}%1g}", "uY\u0018#", "1n[<e", "", "5dc\u0010b3H`WkzZ*\fd8d\r2\u007f?z$\u0017No\nJv", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "Adc\u0010b3H`WkzZ*\fd8d\r2\u007f?z$\u0017No\nJv", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "7mS2g,K[\u001d\bvm,", "5dc\u0016a+>b\u0019\f\u0003b5x\u0018/$l(w>\u0010r F|\u0018@u\u001fBY\u0005 3{\u0016", "Adc\u0016a+>b\u0019\f\u0003b5x\u0018/$l(w>\u0010r F|\u0018@u\u001fBY\u0005 3{\u0016", ">q^4e,La", "", "5dc\u001de6@`\u0019\r\t\u001d\u0019|\u0005-t[1zM\u000b\u001b\u0016A|\u000eCv!CY", "u(3", "Adc\u001de6@`\u0019\r\t\u001d\u0019|\u0005-t[1zM\u000b\u001b\u0016A|\u000eCv!CY", "uC\u0018#", ">q^4e,Lauz\b", "\u001a`]1e6BRb\u0011~].|\u0018xP\r2}M\u0001%%$k\u001b\u0012", "/o_9l", "", "/o_9lj+S\u0015|\n:5{\u00169i~\"\t@\b\u0017\u0013Uo", "Adc\u0010b3H`", "Adc g@ES", "Ash9X\u0015:[\u0019", "", "Adc g@ESWkzZ*\fd8d\r2\u007f?z$\u0017No\nJv", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ProgressBarContainerView extends FrameLayout {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int MAX_PROGRESS = 1000;
    private boolean animating;
    private Integer color;
    private boolean indeterminate;
    private double progress;
    private ProgressBar progressBar;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0005ӯ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0019I\u0001'BY\f.4i#w8PEmA\u001e#v>5\u0014A6W\u0006#KUN9MVrORod\u0016Y'\u0016\tcJy", "", "u(E", "\u001b@G,C\u0019(5\u0006^hL", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressBarContainerView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.indeterminate = true;
        this.animating = true;
    }

    private final void setColor(ProgressBar progressBar) {
        Unit unit;
        Drawable indeterminateDrawable = progressBar.isIndeterminate() ? progressBar.getIndeterminateDrawable() : progressBar.getProgressDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        Integer num = this.color;
        if (num != null) {
            indeterminateDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            indeterminateDrawable.clearColorFilter();
        }
    }

    public final void apply$ReactAndroid_release() {
        Unit unit;
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setIndeterminate(this.indeterminate);
            setColor(progressBar);
            progressBar.setProgress((int) (this.progress * ((double) 1000)));
            progressBar.setVisibility(this.animating ? 0 : 4);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new JSApplicationIllegalArgumentException("setStyle() not called");
        }
    }

    public final boolean getAnimating$ReactAndroid_release() {
        return this.animating;
    }

    public final Integer getColor$ReactAndroid_release() {
        return this.color;
    }

    public final boolean getIndeterminate$ReactAndroid_release() {
        return this.indeterminate;
    }

    public final double getProgress$ReactAndroid_release() {
        return this.progress;
    }

    public final void setAnimating$ReactAndroid_release(boolean z2) {
        this.animating = z2;
    }

    public final void setColor$ReactAndroid_release(Integer num) {
        this.color = num;
    }

    public final void setIndeterminate$ReactAndroid_release(boolean z2) {
        this.indeterminate = z2;
    }

    public final void setProgress$ReactAndroid_release(double d2) {
        this.progress = d2;
    }

    public final void setStyle$ReactAndroid_release(String str) {
        ProgressBar progressBarCreateProgressBar = ReactProgressBarViewManager.Companion.createProgressBar(getContext(), ReactProgressBarViewManager.Companion.getStyleFromString$ReactAndroid_release(str));
        progressBarCreateProgressBar.setMax(1000);
        this.progressBar = progressBarCreateProgressBar;
        removeAllViews();
        addView(this.progressBar, new ViewGroup.LayoutParams(-1, -1));
    }
}
