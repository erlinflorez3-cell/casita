package androidx.compose.runtime;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007\"B\u0012\u007f\u0007ljA0ZeP.XS2\u000fy\u000b<$a$yCQU\"}(\tWN}gvJ`\fK\u000f\u001c\u0016\u0001jBI]xs\u0012\u00172HoWY[ڎU9\u000fsf\t.2:8(\u00061)8J(\u0002\u000bE[\f@/nsĐV\rS\t`\u0017ĂB \u000f#t\u0012\\Ȥ`l\f9_+\u0011oZR7_6}{\u0014vc5\u000f\u000fl.-P7c\u0014SVΫ\u000bRaCIDџA\u0005v/?eW֕o6\u0007~D-9X%i\u0003.b\u0004ad\u001c'1P\u0012R~\u0018H{\u000b{\u0013=2\u001566V0E%v\n\u001e3#q\u0002Cг\u0006^H\u0004Afي\u001b%\u000e>Cg)rigK\u001b^7B\u0013;+C\u0003tďib>l\u001b\u001bb\u0007i7aBMH\u0015\u0018\bM\u001e\u000e~s\u001a0\u00142W\u007fu\n?1/NEmQ)1m\u0012H\u000bu%\u0012\u0001jY֟`Vp7|)O;\u0019\u000ejD\u0013\u001a{RdXr\u001f{0Τ\u000b}\u000e)8z\u0006S9+ P_h0x{j*'5ωEg\u001fu\u001chQdC7acVo\u0001y݆CT"}, d2 = {"\u0011n\\=b:Bb\u001d\t\u0004E6z\u00056P\r2\rD\u007f\u0017$", "", "1n]AX?M", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0015WA7r\u0012(\u001ewaL\u00169", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f$Fq 74M9g;{\u001fqp9\u001ar\u00025|1VSR5&W\u0004E]\u0013j\u0017L:\u0011\u000fbOmOT@\u001d\u00170S\u000b\b>g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010fo\u0003VEMbsB\u0016g(fH:1iU\\\f", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xI\u000169X}\u001f(i\u001d>M\u0019", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW'\u0004/F]| 6^\u00125]C\u0011R:($oeBPh=V@(WUL;`\\{K]rj\u0017L:\u0011\u000fb\u000eyU@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\fc P\t\u0019}ArFPaj\u0004UAR8\u000e(|", "D`[BX:", "", "uZ;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006a2?j\u0002\u001f7l\u0007*TS;A\u001b$\u001fwh=\u0010-1_~pH\\W*kV|F\"[;\u001eW)\u001c\tcJpD+3(\u00079S\u0006:{J\n \u0016@t~B \u001dW\u0003$yI)2$cg\u0005QOEo\u007fHOP", "1n\\=b:Bb\u001d\t\u0004E6z\u00056O\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xI\u000169Xy\u001d>ms8UNEy8-\u0019rj \u0011a(UL", "\"", ">n[6V@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Er0C\\\b/\u001f}%*\\GEt\u001f(\u001cl_M\\", "2dU.h3M4\u0015|\nh9\u0011", "1n\\=b:Bb\u001d\t\u0004E6z\u00056W\u00047~\u001e\u000b\u001f\"W~\u000e;U%6U\u000e'FW\u0017", "2dU.h3M1#\u0007\u0006n;x\u00183o\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0015WA7r\u0010\u001c\u0013hoG\u0011p\u001aL\u00012G\"", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "AsPA\\*\u001c]!\n\u0005l0\f\r9nf2y<\b\u0001\u0018", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CompositionLocalKt {

    /* JADX INFO: renamed from: androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$1 */
    /* JADX INFO: compiled from: CompositionLocal.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ ProvidedValue<?>[] $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ProvidedValue<?>[] providedValueArr, Function2<? super Composer, ? super Integer, Unit> function2, int i2) {
            super(2);
            providedValueArr = providedValueArr;
            function2 = function2;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            ProvidedValue<?>[] providedValueArr = providedValueArr;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArr, providedValueArr.length), function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$2 */
    /* JADX INFO: compiled from: CompositionLocal.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ ProvidedValue<?> $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(ProvidedValue<?> providedValue, Function2<? super Composer, ? super Integer, Unit> function2, int i2) {
            super(2);
            providedValue = providedValue;
            function2 = function2;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            CompositionLocalKt.CompositionLocalProvider(providedValue, function2, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$4 */
    /* JADX INFO: compiled from: CompositionLocal.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(Function2<? super Composer, ? super Integer, Unit> function2, int i2) {
            super(2);
            function2 = function2;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            CompositionLocalContext compositionLocalContext = compositionLocalContext;
            Function2<Composer, Integer, Unit> function2 = function2;
            int i3 = i;
            CompositionLocalKt.CompositionLocalProvider(compositionLocalContext, function2, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)));
        }
    }

    public static /* synthetic */ ProvidableCompositionLocal compositionLocalOf$default(SnapshotMutationPolicy snapshotMutationPolicy, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return compositionLocalOf(snapshotMutationPolicy, function0);
    }

    public static final <T> ProvidableCompositionLocal<T> compositionLocalOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, Function0<? extends T> function0) {
        return new DynamicProvidableCompositionLocal(snapshotMutationPolicy, function0);
    }

    public static final <T> ProvidableCompositionLocal<T> staticCompositionLocalOf(Function0<? extends T> function0) {
        return new StaticProvidableCompositionLocal(function0);
    }

    public static final <T> ProvidableCompositionLocal<T> compositionLocalWithComputedDefaultOf(Function1<? super CompositionLocalAccessorScope, ? extends T> function1) {
        return new ComputedProvidableCompositionLocal(function1);
    }

    public static final void CompositionLocalProvider(ProvidedValue<?>[] providedValueArr, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1390796515);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CompositionLocalProvider)P(1)379@16749L9:CompositionLocal.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1390796515, i2, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:377)");
        }
        composerStartRestartGroup.startProviders(providedValueArr);
        function2.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 14));
        composerStartRestartGroup.endProviders();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                final /* synthetic */ ProvidedValue<?>[] $values;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(ProvidedValue<?>[] providedValueArr2, Function2<? super Composer, ? super Integer, Unit> function22, int i22) {
                    super(2);
                    providedValueArr = providedValueArr2;
                    function2 = function22;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    ProvidedValue<?>[] providedValueArr2 = providedValueArr;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArr2, providedValueArr2.length), function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void CompositionLocalProvider(ProvidedValue<?> providedValue, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1350970552);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CompositionLocalProvider)P(1)400@17486L9:CompositionLocal.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1350970552, i2, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:398)");
        }
        composerStartRestartGroup.startProvider(providedValue);
        int i3 = i2 >> 3;
        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 + 14) - (i3 | 14)));
        composerStartRestartGroup.endProvider();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                final /* synthetic */ ProvidedValue<?> $value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(ProvidedValue<?> providedValue2, Function2<? super Composer, ? super Integer, Unit> function22, int i22) {
                    super(2);
                    providedValue = providedValue2;
                    function2 = function22;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    CompositionLocalKt.CompositionLocalProvider(providedValue, function2, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))));
                }
            });
        }
    }

    public static final void CompositionLocalProvider(CompositionLocalContext compositionLocalContext, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1853897736);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CompositionLocalProvider)P(1)418@18128L144:CompositionLocal.kt#9igjgp");
        int i3 = (-1) - (((-1) - i2) | ((-1) - 6)) == 0 ? (composerStartRestartGroup.changed(compositionLocalContext) ? 4 : 2) | i2 : i2;
        if ((i2 + 48) - (48 | i2) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1853897736, i3, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:417)");
            }
            PersistentCompositionLocalMap compositionLocals$runtime_release = compositionLocalContext.getCompositionLocals$runtime_release();
            ArrayList arrayList = new ArrayList(compositionLocals$runtime_release.size());
            for (Map.Entry<CompositionLocal<Object>, ValueHolder<Object>> entry : compositionLocals$runtime_release.entrySet()) {
                arrayList.add(entry.getValue().toProvided(entry.getKey()));
            }
            ProvidedValue[] providedValueArr = (ProvidedValue[]) arrayList.toArray(new ProvidedValue[0]);
            CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArr, providedValueArr.length), function2, composerStartRestartGroup, (-1) - (((-1) - i3) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider.4
                final /* synthetic */ int $$changed;
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass4(Function2<? super Composer, ? super Integer, Unit> function22, int i22) {
                    super(2);
                    function2 = function22;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    CompositionLocalContext compositionLocalContext2 = compositionLocalContext;
                    Function2<Composer, Integer, Unit> function22 = function2;
                    int i32 = i;
                    CompositionLocalKt.CompositionLocalProvider(compositionLocalContext2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)));
                }
            });
        }
    }
}
