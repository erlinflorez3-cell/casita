package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.Dp;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScopeKt;
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
/* JADX INFO: compiled from: LazyListState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d̉=!4i\bDJc|\u0004W\u00068é6B\r(4ߚ\u007f\u0007|jA0JgP.hS2\u000fq{LCi)\nCi[J\u0004(\t]U\u007fg\u001dN\u000b\u0011I\u000f\u0014\u001e\u0011jZM\u001c}ٕ\u0016\u000f@K\bhAR\b=gf%<\u000b @)Py3\u0005J0N\u0010\u0005\u0003[K:\u0016`Fv:`\u0017e\u0005H\u001dLCŋ\u0005\u001ejsnDVǍu:]\"Y݆DĚ+a8|[\rf`5\u000e\u000faL-\u0017ʽ7չ)S\u000bޗrgM\u0006Wqk\t?ѪyȅMs_̬ނ\u0004!"}, d2 = {"\u0012d[AT\u001bA`\u0019\r}h3{i9rm&\tJ\b\u001erPs\u00168\u0006)?b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u0013l_Al\u0013:h-e~l;d\t+s\u00105{-\u0001%'N~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001c\u001e\u0011vqF\u0007P,\\\u0007.V\"", "\u001ct\\/X9(T|\u000ezf:k\u0013\u001ee\u0007(\u0007J\u000e&", "", "@d\\2`)>`\u007fz\u0010r\u0013\u0001\u0017>S\u000f$\u000b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\"-\u0011wa\u000f", "7mXA\\(E4\u001d\f\tm\u001d\u0001\u00173b\u0007(_O\u0001\u001fzPn\u000eO", "7mXA\\(E4\u001d\f\tm\u001d\u0001\u00173b\u0007(_O\u0001\u001f\u0005E|\u0018C}\u000f6Z\f F", "uH8\u0019T5=`#\u0003yquz\u00137p\n6{\n\u000e' Vs\u0016<@\u0003?a\t*Em#\u00041'~R0'\u0014uk=\u0006vuL\u0001/RV\\,&S|M\u001d\u0011V\u001dR5\u0016N`=9\u0003\u000e\u001e\u001b\u001d@0\u0006Iwn\u001b\u0012\u001d5@", ">qT3X;<V\u0007\u000e\bZ;|\u000bC", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001f+\u0015iaH\u0005f\u001a]\u0004#VLP@2", "uH8\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\u0005\u001cL\u0002_\u0015IXOR8,$Sn9\bc;Ly\u0015VYJ;\\T\u0007\u0013z\u000ec\r[5\u0011\u0004l\u000b\"xLB)\u0016,\u0013\u000fKq\u0010\u0010\u001e\u000e~HzJa\u001aUy\"K%\r,-UhxTKIa=.\ni%gDH$]r#+qO*\u0019\u007f]\u001a<Yu|{\u0011\u007fvM8%qiU3~QKt|", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyListStateKt {
    private static final float DeltaThresholdForScrollAnimation = Dp.m6638constructorimpl(1);
    private static final LazyListMeasureResult EmptyLazyListMeasureResult = new LazyListMeasureResult(null, 0, false, 0.0f, new MeasureResult() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$EmptyLazyListMeasureResult$1
        private final Map<AlignmentLine, Integer> alignmentLines = MapsKt.emptyMap();
        private final int height;
        private final int width;

        public static /* synthetic */ void getAlignmentLines$annotations() {
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public void placeChildren() {
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public int getWidth() {
            return this.width;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public int getHeight() {
            return this.height;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public Map<AlignmentLine, Integer> getAlignmentLines() {
            return this.alignmentLines;
        }
    }, 0.0f, false, CoroutineScopeKt.CoroutineScope(EmptyCoroutineContext.INSTANCE), DensityKt.Density$default(1.0f, 0.0f, 2, null), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), CollectionsKt.emptyList(), 0, 0, 0, false, Orientation.Vertical, 0, 0, null);
    private static final int NumberOfItemsToTeleport = 100;

    public static final LazyListState rememberLazyListState(final int i2, final int i3, Composer composer, int i4, int i5) {
        ComposerKt.sourceInformationMarkerStart(composer, 1470655220, "C(rememberLazyListState)81@3758L130,81@3712L176:LazyListState.kt#428nma");
        if ((1 & i5) != 0) {
            i2 = 0;
        }
        if ((i5 + 2) - (i5 | 2) != 0) {
            i3 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1470655220, i4, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:80)");
        }
        Object[] objArr = new Object[0];
        Saver<LazyListState, ?> saver = LazyListState.Companion.getSaver();
        ComposerKt.sourceInformationMarkerStart(composer, -61897676, "CC(remember):LazyListState.kt#9igjgp");
        int i6 = ((((14 & i4) ^ 6) <= 4 || !composer.changed(i2)) && (6 & i4) != 4) ? 0 : 1;
        int i7 = ((((112 & i4) ^ 48) > 32 && composer.changed(i3)) || (i4 + 48) - (i4 | 48) == 32) ? 1 : 0;
        int i8 = (i6 + i7) - (i6 & i7);
        Object objRememberedValue = composer.rememberedValue();
        if (i8 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (Function0) new Function0<LazyListState>() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$rememberLazyListState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final LazyListState invoke() {
                    return new LazyListState(i2, i3);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        LazyListState lazyListState = (LazyListState) RememberSaveableKt.m3764rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return lazyListState;
    }

    public static final LazyListState rememberLazyListState(final int i2, final int i3, final LazyListPrefetchStrategy lazyListPrefetchStrategy, Composer composer, int i4, int i5) {
        ComposerKt.sourceInformationMarkerStart(composer, 1287535208, "C(rememberLazyListState)106@4651L39,108@4804L160,108@4722L242:LazyListState.kt#428nma");
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 4)) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, -61869191, "CC(remember):LazyListState.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = LazyListPrefetchStrategyKt.LazyListPrefetchStrategy$default(0, 1, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            lazyListPrefetchStrategy = (LazyListPrefetchStrategy) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1287535208, i4, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:107)");
        }
        Object[] objArr = {lazyListPrefetchStrategy};
        Saver<LazyListState, ?> saverSaver$foundation_release = LazyListState.Companion.saver$foundation_release(lazyListPrefetchStrategy);
        ComposerKt.sourceInformationMarkerStart(composer, -61864174, "CC(remember):LazyListState.kt#9igjgp");
        int i6 = (-1) - (((-1) - (((((((-1) - (((-1) - i4) | ((-1) - 14))) ^ 6) <= 4 || !composer.changed(i2)) && (6 & i4) != 4) ? 0 : 1) | (((((112 & i4) ^ 48) <= 32 || !composer.changed(i3)) && (-1) - (((-1) - i4) | ((-1) - 48)) != 32) ? 0 : 1))) & ((-1) - ((((((-1) - (((-1) - i4) | ((-1) - 896))) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composer.changedInstance(lazyListPrefetchStrategy)) || (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 256) ? 1 : 0)));
        Object objRememberedValue2 = composer.rememberedValue();
        if (i6 != 0 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = (Function0) new Function0<LazyListState>() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$rememberLazyListState$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final LazyListState invoke() {
                    return new LazyListState(i2, i3, lazyListPrefetchStrategy);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        LazyListState lazyListState = (LazyListState) RememberSaveableKt.m3764rememberSaveable(objArr, (Saver) saverSaver$foundation_release, (String) null, (Function0) objRememberedValue2, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return lazyListState;
    }
}
