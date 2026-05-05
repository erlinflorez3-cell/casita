package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.protocol.SentryThread;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d̉=!4i\bӵLc\u0003\nI\u00066\u000b6B\u0015\"4\u0012}\u0007njG9L͜P.hS2\u000fq\u007fL9iҕ\nCiTJ\u0004(\t]N\u007fg\u001dK!\u0010ß\u0013\u0006$z\u0003\\WX\u0011]@\u0013ZB\u001eCcQ}BQ`#55&8\"F\u007f\u001d\u0001H1x\u0018|zQS$\u0014F?\u001fC\u0003\u0013S\u0005(\u001c\u001e>N\b6\u0011uYNH\u001bab/Q\u0007\u001aF\\,w0+L=Jb1%v\u0010%[FE=-'i\u00025[\fC\u0011K\n=3oW+9V\fWd_F\u0014-[]\u001burT`-Q\u000f\u0010W/]hcP<'(\u0001\u0002\rJ\n&\u0006UO^5 f\u0016\u0016Kv\tRnY2dH\u007f\tkN\u0017S\u0007ĺ/H"}, d2 = {"@d\\2`)>`\u0007|\bh3\u0004v>a\u000f(", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00133f\b'>[%*\\C\u0011", "7mXA\\(E", "", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.7zk\u00121\u0007\"g=\u001d\"re8\u001a-*X~2QZNu]\\\u0003F\u0013\u000ei\u0012X4VrWN.uK%.\u0004;IW", "6na6m6Gb\u0015\u0006h\\9\u0007\u00106", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AsPAX", "3mP/_,=", "", "4kX;Z\t>V\u0015\u0010~h9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w.J?t6z\u0015k]J\u000bm9$", "@de2e:>A\u0017\f\u0005e3\u0001\u00121", "Aba<_3", "7rB0e6EZ\u0015{\u0002^", "7rE2e;BQ\u0015\u0006", "DdaA\\*:Z\u0007|\bh3\u0004", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ScrollKt {
    public static final ScrollState rememberScrollState(final int i2, Composer composer, int i3, int i4) {
        ComposerKt.sourceInformationMarkerStart(composer, -1464256199, "C(rememberScrollState)70@3262L46,70@3218L90:Scroll.kt#71ulvw");
        boolean z2 = true;
        if ((i4 + 1) - (i4 | 1) != 0) {
            i2 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1464256199, i3, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:69)");
        }
        Object[] objArr = new Object[0];
        Saver<ScrollState, ?> saver = ScrollState.Companion.getSaver();
        ComposerKt.sourceInformationMarkerStart(composer, -506669717, "CC(remember):Scroll.kt#9igjgp");
        if (((((-1) - (((-1) - i3) | ((-1) - 14))) ^ 6) <= 4 || !composer.changed(i2)) && (i3 & 6) != 4) {
            z2 = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (Function0) new Function0<ScrollState>() { // from class: androidx.compose.foundation.ScrollKt$rememberScrollState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ScrollState invoke() {
                    return new ScrollState(i2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        ScrollState scrollState = (ScrollState) RememberSaveableKt.m3764rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return scrollState;
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier modifier, ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = true;
        }
        if ((4 & i2) != 0) {
            flingBehavior = null;
        }
        if ((i2 & 8) != 0) {
            z3 = false;
        }
        return verticalScroll(modifier, scrollState, z2, flingBehavior, z3);
    }

    public static final Modifier verticalScroll(Modifier modifier, ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3) {
        return scroll(modifier, scrollState, z3, flingBehavior, z2, true);
    }

    public static /* synthetic */ Modifier horizontalScroll$default(Modifier modifier, ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            z2 = true;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            flingBehavior = null;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            z3 = false;
        }
        return horizontalScroll(modifier, scrollState, z2, flingBehavior, z3);
    }

    public static final Modifier horizontalScroll(Modifier modifier, ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3) {
        return scroll(modifier, scrollState, z3, flingBehavior, z2, false);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.ScrollKt$scroll$2 */
    /* JADX INFO: compiled from: Scroll.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJc\u0003İY\u0006^\nVB-!r\u001bէ\u000bhp9>E"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pp<W\u0006+OL\u0018\nfZ}G\"\u0012gc2ns\u0001b@1xH62Q*S\nFr\u000f\f_\u001e94XLU\u0014H}\u0015\u0003\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ FlingBehavior $flingBehavior;
        final /* synthetic */ boolean $isScrollable;
        final /* synthetic */ boolean $isVertical;
        final /* synthetic */ boolean $reverseScrolling;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(boolean z2, FlingBehavior flingBehavior, boolean z3, boolean z4) {
            super(3);
            z = z2;
            flingBehavior = flingBehavior;
            z = z3;
            z = z4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier modifier, Composer composer, int i2) {
            composer.startReplaceGroup(1478351300);
            ComposerKt.sourceInformation(composer, "C286@10609L368:Scroll.kt#71ulvw");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1478351300, i2, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:276)");
            }
            Modifier modifierThen = ScrollingContainerKt.scrollingContainer(Modifier.Companion.then(new ScrollSemanticsElement(scrollState, z, flingBehavior, z, z)), scrollState, z ? Orientation.Vertical : Orientation.Horizontal, z, z, flingBehavior, scrollState.getInternalInteractionSource$foundation_release(), null, composer, 0, 64).then(new ScrollingLayoutElement(scrollState, z, z));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierThen;
        }
    }

    private static final Modifier scroll(Modifier modifier, final ScrollState scrollState, final boolean z2, final FlingBehavior flingBehavior, final boolean z3, final boolean z4) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ScrollKt$scroll$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName(ViewProps.SCROLL);
                inspectorInfo.getProperties().set(SentryThread.JsonKeys.STATE, scrollState);
                inspectorInfo.getProperties().set("reverseScrolling", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("flingBehavior", flingBehavior);
                inspectorInfo.getProperties().set("isScrollable", Boolean.valueOf(z3));
                inspectorInfo.getProperties().set("isVertical", Boolean.valueOf(z4));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ScrollKt.scroll.2
            final /* synthetic */ FlingBehavior $flingBehavior;
            final /* synthetic */ boolean $isScrollable;
            final /* synthetic */ boolean $isVertical;
            final /* synthetic */ boolean $reverseScrolling;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(final boolean z22, final FlingBehavior flingBehavior2, final boolean z32, final boolean z42) {
                super(3);
                z = z22;
                flingBehavior = flingBehavior2;
                z = z32;
                z = z42;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                composer.startReplaceGroup(1478351300);
                ComposerKt.sourceInformation(composer, "C286@10609L368:Scroll.kt#71ulvw");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1478351300, i2, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:276)");
                }
                Modifier modifierThen = ScrollingContainerKt.scrollingContainer(Modifier.Companion.then(new ScrollSemanticsElement(scrollState, z, flingBehavior, z, z)), scrollState, z ? Orientation.Vertical : Orientation.Horizontal, z, z, flingBehavior, scrollState.getInternalInteractionSource$foundation_release(), null, composer, 0, 64).then(new ScrollingLayoutElement(scrollState, z, z));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierThen;
            }
        });
    }
}
