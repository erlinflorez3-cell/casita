package androidx.compose.runtime.saveable;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
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
/* JADX INFO: compiled from: RememberSaveable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d̉=!,o\bӵLc\u0003\u0010Iي8\u000b<Ȑ\u0007Ӭ4\u0012\u000e\u0007njO0LeN0ZS8\u001es{:%c$\bCCU \u007f*\t]Nog\u0005Jbŏ[\u001d\u0014\u0016\u0011jZJ\u0006|k\u0014'2pr\u0006\u074ce,K=x\u000fF\r082:\n\u0005G!XN \u0001\u000bK[\u0010\"2VohU;S3\u001f2\bDĨ\u000f%\ry\\>`zm<?#IpRR-^@|{\u0010tYm\r\u000fA,4X7{\u001cEY\tޗ`bg\u0003mtm\u0019v1?5Yy]5h\u0002*\u0014YR;h\u0013(r\u0004\u007fc<;1OqWh\u001c8y\u000b{SC\u0014\u0012\f&X.[\u001d\u0015\r>;zraMh\u0004tA.{\u0012@%3\u00189;;+f\u0018hi(\u0015<߉\t\r,3\u0019T/dl\u0014p\u0017+T>X_W`?Nݐ\u0018`m\u0002\u0012zz\f:\n6F\u00101\u0012\u0010\\\u001aSB{;9 \u001a\u0005xVu\b\u001dnxUyR\u000fG2r\u001c6:\t:]ri5sVTf9)O2S5~8#.j\u0010H1- T_jyj\u0014d8+]u}^ˇo\u000eeKvGCd{\u0010\u0010f\u001f\u0014mQ\u0013\u000bfhZU\"Y\u000b+h2hv\u001eǮ\u0014D|\u000biԸ\u0002ۇ 44ջǲ`+"}, d2 = {"\u001b`g h7I]&\u000ez]\u0019x\b3x", "", "5d]2e(MSvz\u0004g6\fe/S{9{?`$$Q|u<\u000531[}", "", "D`[BX", "", ";tc.U3>A(z\n^\u001ax\u001a/r", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "\"", "7m]2e", "@d\\2`)>`\u0007z\f^(y\u0010/", "7m_Bg:", "", "A`e2e", "9dh", "7mXA", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wZSDz8&\u00152o5\u0018c(K}'\u0011:J=\\_H$\u0019\u000ek\n\u00182\t\u000e[\u000b\u0012}Q;(\n\u00020\bEw\b\u0010\u001fW:{x\fW Pw$yK2v\u0010:o\u0003EPIl3/aF\u0019e9G.\u0018p,dfZ6\u0015\u0006a\u0011<_\npvK!z\u0002\u0002HufPSob\u0012X\u000bb2\u0001s#.\"{'}/M\u001e';d\u0003Z=", "AsPAX\u001a:d\u0019\f", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wZSDz8&\u00152o5\u0018c(K}'\u0011:J=\\_H$\u0019\u000ek\n\u00182\t\u000e[\u000b\u0012}Q;(\n\u00020\bEw\b\u0010\u001fW:{x\fW Pw$yK2v\u0010:o\u0003EPIl3/aF\u0019e9G.\u0018p,dfZ6\u0015\u0006a\u0011<_\npvK!z\u0002\u0002HufPSob\u0012X\u000bb2w\u0001\u0011?bx*\bv\u0002>2An\u0013K1%Ng\b\u00194\\\u000b\u000f6E8\u0010FKQ\u0005hM\u000e>", "@d`B\\9>1\u0015\bW^\u001ax\u001a/d", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?M?8r4\f$dp9sc.R\u00056T`$", "@t]A\\4>\u001b'z\f^(y\u0010/_\r(\u0003@|%\u0017"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RememberSaveableKt {
    private static final int MaxSupportedRadix = 36;

    /* JADX INFO: renamed from: rememberSaveable, reason: collision with other method in class */
    public static final <T> T m3764rememberSaveable(final Object[] objArr, Saver<T, ? extends Object> saver, String str, Function0<? extends T> function0, Composer composer, int i2, int i3) {
        Object objConsumeRestored;
        final String string = str;
        final Saver<T, ? extends Object> saverAutoSaver = saver;
        ComposerKt.sourceInformationMarkerStart(composer, 441892779, "C(rememberSaveable)P(1,3,2)71@3180L23,81@3526L7,83@3552L313,93@3951L71,93@3940L82:RememberSaveable.kt#r2ddri");
        if ((i3 + 2) - (i3 | 2) != 0) {
            saverAutoSaver = SaverKt.autoSaver();
        }
        T tInvoke = null;
        if ((i3 + 4) - (i3 | 4) != 0) {
            string = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441892779, i2, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)");
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        String str2 = string;
        if (str2 == null || str2.length() == 0) {
            string = Integer.toString(currentCompositeKeyHash, CharsKt.checkRadix(MaxSupportedRadix));
            Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
        }
        Intrinsics.checkNotNull(saverAutoSaver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        ProvidableCompositionLocal<SaveableStateRegistry> localSaveableStateRegistry = SaveableStateRegistryKt.getLocalSaveableStateRegistry();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localSaveableStateRegistry);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) objConsume;
        ComposerKt.sourceInformationMarkerStart(composer, -1519365315, "CC(remember):RememberSaveable.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            if (saveableStateRegistry != null && (objConsumeRestored = saveableStateRegistry.consumeRestored(string)) != null) {
                tInvoke = saverAutoSaver.restore(objConsumeRestored);
            }
            if (tInvoke == null) {
                tInvoke = function0.invoke();
            }
            objRememberedValue = new SaveableHolder(saverAutoSaver, saveableStateRegistry, string, tInvoke, objArr);
            composer.updateRememberedValue(objRememberedValue);
        }
        final SaveableHolder saveableHolder = (SaveableHolder) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        Object obj = (T) saveableHolder.getValueIfInputsDidntChange(objArr);
        if (obj == null) {
            obj = (T) function0.invoke();
        }
        ComposerKt.sourceInformationMarkerStart(composer, -1519352789, "CC(remember):RememberSaveable.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(saveableHolder);
        int i4 = (((((-1) - (((-1) - i2) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) ^ 48) <= 32 || !composer.changedInstance(saverAutoSaver)) && (i2 + 48) - (i2 | 48) != 32) ? 0 : 1;
        int i5 = ((zChangedInstance ? 1 : 0) + i4) - ((zChangedInstance ? 1 : 0) & i4);
        boolean zChangedInstance2 = composer.changedInstance(saveableStateRegistry);
        int i6 = (i5 + (zChangedInstance2 ? 1 : 0)) - (i5 & (zChangedInstance2 ? 1 : 0)) != 1 ? 0 : 1;
        boolean zChanged = composer.changed(string);
        boolean zChangedInstance3 = ((i6 + (zChanged ? 1 : 0)) - (i6 & (zChanged ? 1 : 0)) == 1) | composer.changedInstance(obj) | composer.changedInstance(objArr);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            final Object obj2 = obj;
            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    saveableHolder.update(saverAutoSaver, saveableStateRegistry, string, obj2, objArr);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.SideEffect((Function0) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return (T) obj;
    }

    public static final <T> MutableState<T> rememberSaveable(Object[] objArr, Saver<T, ? extends Object> saver, String str, Function0<? extends MutableState<T>> function0, Composer composer, int i2, int i3) {
        String str2 = str;
        ComposerKt.sourceInformationMarkerStart(composer, -202053668, "C(rememberSaveable)P(1,3,2)127@5317L106:RememberSaveable.kt#r2ddri");
        if ((i3 + 4) - (i3 | 4) != 0) {
            str2 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-202053668, i2, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:127)");
        }
        MutableState<T> mutableState = (MutableState) m3764rememberSaveable(Arrays.copyOf(objArr, objArr.length), mutableStateSaver(saver), str2, (Function0) function0, composer, i2 & 8064, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return mutableState;
    }

    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(final Saver<T, ? extends Object> saver) {
        Intrinsics.checkNotNull(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.Saver(new Function2<SaverScope, MutableState<T>, MutableState<Object>>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final MutableState<Object> invoke(SaverScope saverScope, MutableState<T> mutableState) {
                if (!(mutableState instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
                }
                Object objSave = saver.save(saverScope, mutableState.getValue());
                if (objSave == null) {
                    return null;
                }
                SnapshotMutationPolicy<T> policy = ((SnapshotMutableState) mutableState).getPolicy();
                Intrinsics.checkNotNull(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return SnapshotStateKt.mutableStateOf(objSave, policy);
            }
        }, new Function1<MutableState<Object>, MutableState<T>>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final MutableState<T> invoke(MutableState<Object> mutableState) {
                T tRestore;
                if (!(mutableState instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (mutableState.getValue() != null) {
                    Saver<T, Object> saver2 = saver;
                    Object value = mutableState.getValue();
                    Intrinsics.checkNotNull(value);
                    tRestore = saver2.restore(value);
                } else {
                    tRestore = null;
                }
                SnapshotMutationPolicy<T> policy = ((SnapshotMutableState) mutableState).getPolicy();
                Intrinsics.checkNotNull(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3?>");
                MutableState<T> mutableStateMutableStateOf = SnapshotStateKt.mutableStateOf(tRestore, policy);
                Intrinsics.checkNotNull(mutableStateMutableStateOf, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3>");
                return mutableStateMutableStateOf;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requireCanBeSaved(SaveableStateRegistry saveableStateRegistry, Object obj) {
        String strGenerateCannotBeSavedErrorMessage;
        if (obj == null || saveableStateRegistry.canBeSaved(obj)) {
            return;
        }
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() != SnapshotStateKt.neverEqualPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.structuralEqualityPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.referentialEqualityPolicy()) {
                strGenerateCannotBeSavedErrorMessage = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            } else {
                strGenerateCannotBeSavedErrorMessage = "MutableState containing " + snapshotMutableState.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            }
        } else {
            strGenerateCannotBeSavedErrorMessage = generateCannotBeSavedErrorMessage(obj);
        }
        throw new IllegalArgumentException(strGenerateCannotBeSavedErrorMessage);
    }

    public static final String generateCannotBeSavedErrorMessage(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }
}
