package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: RadioButton.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4N\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS@\u000fs{:'a)\bّkUH|b,_Rug\u0007J\t\fS\u0013\u0014\u0018\u0011jZJe|k\u0015'2ppO7[sU9\u000fuȥ\t @'\u00010\u0013\r2*vƵ'\u0001IK\u001a\u0012H@\u001f;\u0003\u0013S\u0005(\u0014\u001e>N\u0002NbmNDK\u0005]h0S\toB\\+w0+NЮEÖܮ\u0011xg+9N\u007fF#4k\u00035b\fE\u0011P\n?\u001bgU&qɵs <f\u0012,\u0015YbSq;Ij\u0019if\u001c);O\u0012L~#X{\t\u0012%<2\u001e6+VEE\u001a\u0015\u0018T2ϢvUFh\u0010w\u0013\u0017\tdN\u0017S\u0001Ɗ*ݍՎePň?!V7\n\r% )\u0007|(,k\u001cd-\u001b\u0003xϼ0҅ή<Gݳ\u000eaEm\u0012xz\u00040\r>NPF\n\u0011F\u0017S8ڼ8\u05faޢj\u0001ҩHo~\u0005npkkXRN)?-E,!\f\tE×\u0004ߘĥSW¯\u0015U$T\u0015\u0006 \u0015&g\u0006CƜ%\u0019VRnȫ\u0007{\\\u0012%5\u0006Ʀ]\t"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006c!4]\b|G|%8V!Er>+#>", "", "Ad[2V;>Rv\t\u0002h9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Cmb2_,<b\u0019}Xh3\u0007\u0016", "2hb.U3>R\u0007~\u0002^*\f\t.C\n/\u0006M", "2hb.U3>R\t\b\t^3|\u0007>e~\u0006\u0006G\u000b$", "uI9\u0017=\u0013D](\u0006~gu\u0002\u001a7/\u00041\u000b@\u000e \u0013N9l<w!E`\r}Av$=ZS9z>+|dn?\u0007p\u0002\u0012g", "5dc\u0011\\::P ~yL,\u0004\t-t\u007f'YJ\b!$\u000f:\r\u000ep\u000b:I", "u(9", "\u0018", "5dc\u0011\\::P ~yN5\u000b\t6e}7{?^!\u001eQ|U\u0007uv/?\u0003\u0010", "5dc X3>Q(~y<6\u0004\u0013<-J'M:f\u001c\u0007", "5dc\"a:>Z\u0019|\n^+Z\u00136o\roF?R\u0011|L_", "1n_F", "1n_F 1+Z\n}\u0005h", "uI9\u0017=o%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`Ok\u001d<\u0004)1`Ki$i\u00152W KzC(\u001eFk@\u0011p:$", "3pd._:", "", "=sW2e", "6`b566=S", "", "@`S6b\nHZ#\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "3mP/_,=", "Ad[2V;>R", "@`S6b\nHZ#\f9f(\f\t<i{/I:\u000e\u0017\u001eGk\u001c<", "uYI\u0019T5=`#\u0003yquz\u00137p\n6{\n\u000e' Vs\u0016<@\u0003?a\t*Em#\u00041\u0007\"g=\u001d\"re8\u001a-*X~2QZNuib{L\u0018\u001aZW<:\t\u0014Y\u0017", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RadioButtonColors {
    public static final int $stable = 0;
    private final long disabledSelectedColor;
    private final long disabledUnselectedColor;
    private final long selectedColor;
    private final long unselectedColor;

    public /* synthetic */ RadioButtonColors(long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5);
    }

    private RadioButtonColors(long j2, long j3, long j4, long j5) {
        this.selectedColor = j2;
        this.unselectedColor = j3;
        this.disabledSelectedColor = j4;
        this.disabledUnselectedColor = j5;
    }

    /* JADX INFO: renamed from: getSelectedColor-0d7_KjU, reason: not valid java name */
    public final long m2410getSelectedColor0d7_KjU() {
        return this.selectedColor;
    }

    /* JADX INFO: renamed from: getUnselectedColor-0d7_KjU, reason: not valid java name */
    public final long m2411getUnselectedColor0d7_KjU() {
        return this.unselectedColor;
    }

    /* JADX INFO: renamed from: getDisabledSelectedColor-0d7_KjU, reason: not valid java name */
    public final long m2408getDisabledSelectedColor0d7_KjU() {
        return this.disabledSelectedColor;
    }

    /* JADX INFO: renamed from: getDisabledUnselectedColor-0d7_KjU, reason: not valid java name */
    public final long m2409getDisabledUnselectedColor0d7_KjU() {
        return this.disabledUnselectedColor;
    }

    /* JADX INFO: renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ RadioButtonColors m2406copyjRlVdoo$default(RadioButtonColors radioButtonColors, long j2, long j3, long j4, long j5, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            j2 = radioButtonColors.selectedColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j3 = radioButtonColors.unselectedColor;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            j4 = radioButtonColors.disabledSelectedColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            j5 = radioButtonColors.disabledUnselectedColor;
        }
        return radioButtonColors.m2407copyjRlVdoo(j2, j3, j4, j5);
    }

    /* JADX INFO: renamed from: copy-jRlVdoo, reason: not valid java name */
    public final RadioButtonColors m2407copyjRlVdoo(long j2, long j3, long j4, long j5) {
        long j6 = j2;
        long j7 = j3;
        long j8 = j4;
        long j9 = j5;
        if (j6 == 16) {
            j6 = this.selectedColor;
        }
        if (j7 == 16) {
            j7 = this.unselectedColor;
        }
        if (j8 == 16) {
            j8 = this.disabledSelectedColor;
        }
        if (j9 == 16) {
            j9 = this.disabledUnselectedColor;
        }
        return new RadioButtonColors(j6, j7, j8, j9, null);
    }

    public final State<Color> radioColor$material3_release(boolean z2, boolean z3, Composer composer, int i2) {
        long j2;
        State<Color> stateRememberUpdatedState;
        ComposerKt.sourceInformationMarkerStart(composer, -1840145292, "C(radioColor):RadioButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1840145292, i2, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:228)");
        }
        if (!z2 || !z3) {
            if (z2 && !z3) {
                j2 = this.unselectedColor;
            } else if (!z2 && z3) {
                j2 = this.disabledSelectedColor;
            } else {
                j2 = this.disabledUnselectedColor;
            }
        } else {
            j2 = this.selectedColor;
        }
        if (z2) {
            composer.startReplaceGroup(350067971);
            ComposerKt.sourceInformation(composer, "240@10272L75");
            stateRememberUpdatedState = SingleValueAnimationKt.m451animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(350170674);
            ComposerKt.sourceInformation(composer, "242@10377L28");
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4168boximpl(j2), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateRememberUpdatedState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RadioButtonColors)) {
            return false;
        }
        RadioButtonColors radioButtonColors = (RadioButtonColors) obj;
        return Color.m4179equalsimpl0(this.selectedColor, radioButtonColors.selectedColor) && Color.m4179equalsimpl0(this.unselectedColor, radioButtonColors.unselectedColor) && Color.m4179equalsimpl0(this.disabledSelectedColor, radioButtonColors.disabledSelectedColor) && Color.m4179equalsimpl0(this.disabledUnselectedColor, radioButtonColors.disabledUnselectedColor);
    }

    public int hashCode() {
        return (((((Color.m4185hashCodeimpl(this.selectedColor) * 31) + Color.m4185hashCodeimpl(this.unselectedColor)) * 31) + Color.m4185hashCodeimpl(this.disabledSelectedColor)) * 31) + Color.m4185hashCodeimpl(this.disabledUnselectedColor);
    }
}
