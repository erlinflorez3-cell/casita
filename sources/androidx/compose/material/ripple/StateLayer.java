package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\u0015\"4\u0012\u000e\u0007nj?0Le^.ZS8\u0014s{J$cҕyCQU\"Ԃ*\t]mo˧vJh\u000bK\u000f\f\u0016\u0001jBI]xc\u0012\u00172XoG3SoE9vt>\u0005&3(8\u0010ڎ1\u001aXGP\u0010\u000bGY\f*0nqJ\\\u001bO\u001d \"\bN /\"\u000bjߑ:Hzb\u0003J1\u0011\u0002B|6\u00104\u000b]%F\u00032=zo/C@eG[Ǭ٨\u0007\u0007Xn\b%M\u0006U\u0005\u00176O+w\t\b:f\u0016,\u0015YW=a\u0001=t\u0005\u007fxѨ&˃յgMV'6\u0012K\u0014\u001bB\u001c\u001a\u0016)X.[\"v\n\u001e3#{\u0002G'؟`۰\u0004ziاg1\u000e3C9Ig(Ĩ=ϭR7\u0004˜],1\u000b\u0007#qS<kkÔ`ɐU1Y̵\u000eZ\\\u0016qC}\u0006\u0001b052=\u001eČ1ɨ\u0015.\u001f¦\bmG%9q\u0012JTg%\t\u000fk*֢T͕D\"vݫն*\u000e\u0014]J\u0080!\u001aOԢ\\G"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i%|\u0012=M*7\u007f4+j", "", "0nd;W,=", "", "@h_=_,\u001aZ$\u0002v", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u0017r?!\u0011>", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHuz^", "/mX:T;>Rt\u0006\u0006a(", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\?8r4s", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "1ta?X5M7\"\u000ezk(z\u00183o\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6WL", "7mc2e(<b\u001d\t\u0004l", "", "6`]1_,\"\\(~\bZ*\f\r9n", "", "7mc2e(<b\u001d\t\u0004", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "6`]1_,\"\\(~\bZ*\f\r9n>0wO\u0001$\u001bCv\bIz0@`}\u001aDm\u001d.IQ;", "2qPDF;:b\u0019evr,\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "@`S6h:", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "2qPDF;:b\u0019evr,\nP7x\u00121{F\\", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u0002/[j8", ";`c2e0:Z`\f~i7\u0004\t)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class StateLayer {
    private final boolean bounded;
    private Interaction currentInteraction;
    private final Function0<RippleAlpha> rippleAlpha;
    private final Animatable<Float, AnimationVector1D> animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
    private final List<Interaction> interactions = new ArrayList();

    public StateLayer(boolean z2, Function0<RippleAlpha> function0) {
        this.bounded = z2;
        this.rippleAlpha = function0;
    }

    public final void handleInteraction$material_ripple_release(Interaction interaction, CoroutineScope coroutineScope) {
        float draggedAlpha;
        boolean z2 = interaction instanceof HoverInteraction.Enter;
        if (z2) {
            this.interactions.add(interaction);
        } else if (interaction instanceof HoverInteraction.Exit) {
            this.interactions.remove(((HoverInteraction.Exit) interaction).getEnter());
        } else if (interaction instanceof FocusInteraction.Focus) {
            this.interactions.add(interaction);
        } else if (interaction instanceof FocusInteraction.Unfocus) {
            this.interactions.remove(((FocusInteraction.Unfocus) interaction).getFocus());
        } else if (interaction instanceof DragInteraction.Start) {
            this.interactions.add(interaction);
        } else if (interaction instanceof DragInteraction.Stop) {
            this.interactions.remove(((DragInteraction.Stop) interaction).getStart());
        } else if (!(interaction instanceof DragInteraction.Cancel)) {
            return;
        } else {
            this.interactions.remove(((DragInteraction.Cancel) interaction).getStart());
        }
        Interaction interaction2 = (Interaction) CollectionsKt.lastOrNull((List) this.interactions);
        if (Intrinsics.areEqual(this.currentInteraction, interaction2)) {
            return;
        }
        if (interaction2 != null) {
            RippleAlpha rippleAlphaInvoke = this.rippleAlpha.invoke();
            if (z2) {
                draggedAlpha = rippleAlphaInvoke.getHoveredAlpha();
            } else if (interaction instanceof FocusInteraction.Focus) {
                draggedAlpha = rippleAlphaInvoke.getFocusedAlpha();
            } else {
                draggedAlpha = interaction instanceof DragInteraction.Start ? rippleAlphaInvoke.getDraggedAlpha() : 0.0f;
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new StateLayer$handleInteraction$1(this, draggedAlpha, RippleKt.incomingStateLayerAnimationSpecFor(interaction2), null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new StateLayer$handleInteraction$2(this, RippleKt.outgoingStateLayerAnimationSpecFor(this.currentInteraction), null), 3, null);
        }
        this.currentInteraction = interaction2;
    }

    /* JADX INFO: renamed from: drawStateLayer-mxwnekA */
    public final void m1769drawStateLayermxwnekA(DrawScope drawScope, float f2, long j2) {
        float fFloatValue = this.animatedAlpha.getValue().floatValue();
        if (fFloatValue > 0.0f) {
            long jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(j2, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!this.bounded) {
                DrawScope.m4715drawCircleVaOC9Bg$default(drawScope, jM4177copywmQWz5c$default, f2, 0L, 0.0f, null, null, 0, 124, null);
                return;
            }
            float fM4006getWidthimpl = Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc());
            float fM4003getHeightimpl = Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc());
            int iM4167getIntersectrtfAjoo = ClipOp.Companion.m4167getIntersectrtfAjoo();
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo4658clipRectN_I0leg(0.0f, 0.0f, fM4006getWidthimpl, fM4003getHeightimpl, iM4167getIntersectrtfAjoo);
            DrawScope.m4715drawCircleVaOC9Bg$default(drawScope, jM4177copywmQWz5c$default, f2, 0L, 0.0f, null, null, 0, 124, null);
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
        }
    }
}
