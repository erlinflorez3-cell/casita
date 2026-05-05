package androidx.compose.foundation;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: ScrollingContainer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006\u0010nj?0Le^.Zݷ2\u000f\u0002{<řc$\bCCU }:X]Ȟ\u007fg\u001dI\u0003\u000bq\u000e6\u001a\u0007jDI\u0004y\u000e\u0016\u001d4Zom6}sK=xtd\nP60>\u0012\u0005/\u001fZN\u001e}\u0013Ea\u000b@8pvH[%O\u001b\u0019@\u0010n(\u0007\u001ejrf8^k\fFu\"ɨmB\\4ۨ4\u000b"}, d2 = {"Aba<_3B\\\u001b\\\u0005g;x\r8e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0011eh9tr(]v|", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "3mP/_,=", "", "@de2e:>A\u0017\f\u0005e3\u0001\u00121", "4kX;Z\t>V\u0015\u0010~h9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w.J?t6z\u0015k]J\u000bm9$", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "0qX;Z\u0010Gb#o~^>j\u0014/c", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w*P?t6\u0002\u001ewk*\u000bc><\u0002'E\"", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pd6^\u007f&C[R6e\u001ct=\"!j\u001bN9VrWN.uK3\u001c\u000f,7\u00117w\u0001a|\n>i}LZ\u000fZC\u0013\u007fI4rTY)zQQNa&s\u0010i&&<:2#\u0002&\u001bv\u001a\u0018\u0017\u007fS\u001a\u0002N\tkqPno-\u000b:vZSOsTO>%)S\u0007\u0002 2\"u5\u00056\u000309:n\u000e\u0015i\u0018Lm\t\",j\u000b\b-:E\u0015\u001cKfq}B\u0018utH\u0004\u0017aB;\u001ddx-F\u0019\u000fh!i5+`\u000bG[\u0005:Xs\u001f0\u0010\u0003Kjy\"\u0005\u00053qoR\r\u0003d\u0010\u0016mK\"C\u001a\u0012\u0003s\u0014\u001a=\u001aGb|r:l5MhodA\u000b\tcG\u0014\u0004\u0012\u000ewS}eeom7\u0003!R /Z@\u0001[\rq\u0010$C\u0011\u0018~+=FO}?\u0015\t.Lc)f`AxrS nN4%\u001e:;\u0006QS8\\\u0002/ \b\u001chF\"mGG\u0006;A\u0013H,DnU\u0013<g(s\u0010\u0011{+is#L_rH\u0014l\u0018\b\u000f5\u0007\u0013e<*?/)f\u001f0j\f\u0019_", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ScrollingContainerKt {
    public static final Modifier scrollingContainer(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z2, boolean z3, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec, Composer composer, int i2, int i3) {
        BringIntoViewSpec bringIntoViewSpec2 = bringIntoViewSpec;
        ComposerKt.sourceInformationMarkerStart(composer, -1677817431, "C(scrollingContainer)P(6,4,1,5,2,3)41@1672L18,48@1943L7:ScrollingContainer.kt#71ulvw");
        if ((i3 + 64) - (i3 | 64) != 0) {
            bringIntoViewSpec2 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1677817431, i2, -1, "androidx.compose.foundation.scrollingContainer (ScrollingContainer.kt:40)");
        }
        OverscrollEffect overscrollEffect = ScrollableDefaults.INSTANCE.overscrollEffect(composer, 6);
        Modifier modifierOverscroll = OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(modifier, orientation), overscrollEffect);
        ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localLayoutDirection);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier modifierScrollable = ScrollableKt.scrollable(modifierOverscroll, scrollableState, orientation, overscrollEffect, z2, scrollableDefaults.reverseDirection((LayoutDirection) objConsume, orientation, z3), flingBehavior, mutableInteractionSource, bringIntoViewSpec2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return modifierScrollable;
    }
}
