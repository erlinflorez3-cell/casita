package com.facebook.react.uimanager.drawable;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.facebook.react.uimanager.style.BorderInsets;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r@4ߚ\u007f\u0007|jA0JgP.hS2\u000fq\u000b:řqҕ\"CiTZE2\u0011UNug\u0007Lp\nq\u0010\u0016\"~j:Km~m\u0014\u001f2ppm6]wC9nxN\u000761P=\n\r\u0007\u001a8N(x\u0011By\r\"<FpHY%S\u0015\u001c\"\u0006l!/!֔kNDP5kHF;\u0003\u0018ĩ~-m4\u0015O#E\u0003,U\u0005o6C@eߎE+a\u001c\u001fTq>1@:]\u0013\u0003?'Yɞ$aDZ\u0018\u001a%-_\r\fsT_5[n\u0013?1_e[P<)&}L'J\r&\b=G\\7pǘ\u0014ԧ7\u0001zԟXR\biP\f\u001bc<$3\u000e\u0004<G\u001f~Sw:GSѼ\u007f\u000b\u0015̔;\u0003t0id^q#!lyg0\u007fAףLT\u0012ԯUo\n\u0002p\u0014z\u0019>N\u00185\f\u0013>\u0017S8\n<؝%q\n҆\\i|\u0018n|$z`HX$\u0005\u0015e+Á\u0010`Lߟ\u001dmVif>ab*V\u001f\u0004\u0018\u00150\\&=O(ŎRUpȉ\u0003Oc 3Cϲ;t"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n4fy23j\u001d.\u0017!Es?(#lp9c_*Tx4Q\\W+;_nO\u0010\u000fa\u000e$", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW#r95f\\-3\u007f\u0012+TC\u0011", "=qX4\\5:Zuzxd.\n\u0013?n~", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW\u001b\u0004!GUz'7C", "=tc2e\u001aAO\u0018\t\rl", "", "1rb\u000fT*DU&\t\u000bg+", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n4fy23j\u001d.\u0017!)Y\u0011\u001a\u0013ncF\u0011s5MU4C^J)cRH", "4dT1U(<Y\t\by^9\u0004\u0005C", "7m]2e\u001aAO\u0018\t\rl", "uKP;W9HW\u0018H|k(\b\f3c\u000eqzM|)\u0013Dv\u000e\u0006U21ky\u001d>mk\u0015R?Lg}.$lh\u0003mg:]L\u000eEVVu]Np=\u0011\u001cd\u0014\u00188\r\u0001WPm~H?\u001b\u0011(K\u0002H2\u007f\u0019\u0012 1gwB m5gqq?/jSco\u0003F R^<`\tf\u001d2!6-\u0013~#\u001fg\u001a0\u0017w^\u0014vP\b1fT\u0015\r4!Em%%Rkg8q.\u001f!b|\u000eCT>;\u00041\u000b}\u0011:r\u0014!+\t", "0na1X9\"\\'~\nl", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77r8ZB;x\u0018'#hpG\\", "5dc\u000fb9=S&b\u0004l,\f\u0017", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#\f/Kt\u0016w*MHj4+xqo9\u0016q\u0002", "Adc\u000fb9=S&b\u0004l,\f\u0017", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~g\r4>m_\u000bWP:kA\u0002\u001evaH\u00159o?", "5dc\u0010f:\u001bO\u0017\u0005|k6\r\u0012.", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#|-3\u007f\u0012+TC\u0005I\"\fqd_?\tp6^\u007f&&YJ>XOy=i", "5dc\u0013X,=P\u0015|\u0001N5{\t<l{<", "u(;.a+K]\u001d}D`9x\u00142i}6E?\u000e\u0013)Cl\u0015<@\u0004BU\u0010\u001c4t\u0016\u0004", "5dc\u0016a5>`\u0007\u0002v]6\u000f\u0017", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u001ce0@W\"z\u0002;(z\u000f1r\n8\u0005?", "5dc\u001ch;>`\u0007\u0002v]6\u000f\u0017", "Ehc5A,P1'\rWZ*\u0003\u000b<o\u00101z", "Ehc5A,P4\u0019~y[(z\u000f\u001fn~(\tG|+", "<df\"a+>` z\u000f", "Ehc5A,PA\u001czyh>\u000b", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CompositeBackgroundDrawable extends LayerDrawable {
    private BorderInsets borderInsets;
    private final CSSBackgroundDrawable cssBackground;
    private final Drawable feedbackUnderlay;
    private final List<Drawable> innerShadows;
    private final Drawable originalBackground;
    private final List<Drawable> outerShadows;

    public CompositeBackgroundDrawable() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeBackgroundDrawable(Drawable drawable, List<? extends Drawable> outerShadows, CSSBackgroundDrawable cSSBackgroundDrawable, Drawable drawable2, List<? extends Drawable> innerShadows) {
        Intrinsics.checkNotNullParameter(outerShadows, "outerShadows");
        Intrinsics.checkNotNullParameter(innerShadows, "innerShadows");
        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
        spreadBuilder.add(drawable);
        spreadBuilder.addSpread(CollectionsKt.asReversed(outerShadows).toArray(new Drawable[0]));
        spreadBuilder.add(cSSBackgroundDrawable);
        spreadBuilder.add(drawable2);
        spreadBuilder.addSpread(CollectionsKt.asReversed(innerShadows).toArray(new Drawable[0]));
        super((Drawable[]) CollectionsKt.listOfNotNull(spreadBuilder.toArray(new Drawable[spreadBuilder.size()])).toArray(new Drawable[0]));
        this.originalBackground = drawable;
        this.outerShadows = outerShadows;
        this.cssBackground = cSSBackgroundDrawable;
        this.feedbackUnderlay = drawable2;
        this.innerShadows = innerShadows;
        setPaddingMode(1);
    }

    public /* synthetic */ CompositeBackgroundDrawable(Drawable drawable, List list, CSSBackgroundDrawable cSSBackgroundDrawable, Drawable drawable2, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((1 & i2) != 0 ? null : drawable, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? CollectionsKt.emptyList() : list, (i2 + 4) - (4 | i2) != 0 ? null : cSSBackgroundDrawable, (-1) - (((-1) - i2) | ((-1) - 8)) == 0 ? drawable2 : null, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public final BorderInsets getBorderInsets() {
        return this.borderInsets;
    }

    public final CSSBackgroundDrawable getCssBackground() {
        return this.cssBackground;
    }

    public final Drawable getFeedbackUnderlay() {
        return this.feedbackUnderlay;
    }

    public final List<Drawable> getInnerShadows() {
        return this.innerShadows;
    }

    public final Drawable getOriginalBackground() {
        return this.originalBackground;
    }

    public final List<Drawable> getOuterShadows() {
        return this.outerShadows;
    }

    public final void setBorderInsets(BorderInsets borderInsets) {
        this.borderInsets = borderInsets;
    }

    public final CompositeBackgroundDrawable withNewCssBackground(CSSBackgroundDrawable cSSBackgroundDrawable) {
        return new CompositeBackgroundDrawable(this.originalBackground, this.outerShadows, cSSBackgroundDrawable, this.feedbackUnderlay, this.innerShadows);
    }

    public final CompositeBackgroundDrawable withNewFeedbackUnderlay(Drawable drawable) {
        return new CompositeBackgroundDrawable(this.originalBackground, this.outerShadows, this.cssBackground, drawable, this.innerShadows);
    }

    public final CompositeBackgroundDrawable withNewShadows(List<? extends Drawable> outerShadows, List<? extends Drawable> innerShadows) {
        Intrinsics.checkNotNullParameter(outerShadows, "outerShadows");
        Intrinsics.checkNotNullParameter(innerShadows, "innerShadows");
        return new CompositeBackgroundDrawable(this.originalBackground, outerShadows, this.cssBackground, this.feedbackUnderlay, innerShadows);
    }
}
