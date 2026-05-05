package androidx.lifecycle.viewmodel.compose;

import android.os.Bundle;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.SavedStateRegistry;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.PropertyDelegateProvider;
import kotlin.properties.ReadOnlyProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
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
/* JADX INFO: compiled from: SavedStateHandleSaver.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d̉=!4i\bDZc|İI\u0006>é6B\u0005\"4\u0012\u000e\u0007njO0L͜P.hS2\u000fq{<$q$yّCU0}*\tUNog|Vb\u000bI\u000f\u001eR\u0007̓Dce\u0001m\u0018\u001f4Ro\u00064{oMCp|F\t0487(\u0007/\u001aXG0x\u0001ŏY\rBBNsR`\u001dO\u0015\u001aX\u0007N$\u0007\u001dlg|8vk$:G\u000b\u0011mZj7c@~c\ftV7\u001d\u0007o./P9K\u0014SU\u0013\tb[\u0006\u0004mwk\n\t)-ǢWtwB^~\"\u001cSU\u001d_\u0003&#\u0006\u007f`4'YW\u0014_V\u000e6\u0001\u0013\n\u001d>\u0014\u000eL(X23\u0019v\b<5#q\u0004J^\fvH\u0010|q6],.>q>ӸjQgG1%E\u007f\u001d).'\u0011p7Z\u0003\u0010p%+b\bUASV<vP\u001a[MmJq\u0011\u000fX\tPM\u0006\u07fc\n\u0012V\u0017S9\u00049Q)\u001c\u0016NDu\u0005\u001dnxUyR\u000fA2r\u001c6:\t:\\rc5u^^p2!O,TM~6\u001efa\u0010\u0004/)(N\u0016i\npSΪ\u0018&Wfe[\u0017k<_ibADic>q\u0003\u000b\u001a?Jp\u001dfvDc\f!]8&8Gz\u0010&}rM<\u001d@I\n\"D.A\u0019#\u0016v\u000edG˩\u0001\tmk\u0001X\rXK*\u0013k4tO\u0002~\\\u0011qmծW-%`P5qUC(>UPxd\u000f1\u0010\u0017\u0002\u0010IwL\u000eM|\u001a{T\f D\u001cgP_M!\u0019\u00175B\n=K\\tuQ\u0014\u0013Uz+\u0005U@ą2y"}, d2 = {";tc.U3>A(z\n^\u001ax\u001a/r", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "\"", "", "7m]2e", "A`e2T)ES", "\u001aj^A_0G\u001d$\f\u0005i,\n\u00183e\u000eqfM\u000b\"\u0017T~\"\u001bv,5[y/7X#8^G:kAs", "\u001aj^A_0G\u001d$\f\u0005i,\n\u00183e\u000eqh@|\u0016\tTs\u001d<a2?d}-F\u0002k", "\u001b", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E.|(\u0017F]\u001d8\u0006%\u0018U\u0007\u001f>mk", "AsPAX\u001a:d\u0019\f", "7mXA", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "A`e2T)ES\u0001\u000f\nZ)\u0004\t\u001dt{7{", "\u001aj^A_0G\u001d$\f\u0005i,\n\u00183e\u000eqh@|\u0016\u0001Pv\"'\u0004/@Y\u000b/KC", "A`e2e", "9dh", "", "uKP;W9HW\u0018\u0012De0}\t-y}/{\nn\u0013(Gn{Kr45<y)6t\u0016\u00044H7|0g\u001cdj;PQ;[z0I\"5(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8QG(\u00170Q\u0002\u0005v|\u001d\u0016\n2qp\fD\fXy\"K(/rU`c\u0003\u0011FVjse\u001ch\u001bk>D-\";y+qN=\u000e\u0006\\[H\u0016`lcX\u0015D? Go%0BtU:\u0004|", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/C>\u000b\u001f\"Q}\u000e6\u0004%<Yy.7"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SavedStateHandleSaverKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object saveable$lambda$3$lambda$2(Object value, Object obj, KProperty kProperty) {
        Intrinsics.checkNotNullParameter(value, "$value");
        Intrinsics.checkNotNullParameter(kProperty, "<anonymous parameter 1>");
        return value;
    }

    public static /* synthetic */ Object saveable$default(SavedStateHandle savedStateHandle, String str, Saver saver, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        return m6965saveable(savedStateHandle, str, saver, function0);
    }

    /* JADX INFO: renamed from: saveable, reason: collision with other method in class */
    public static final <T> T m6965saveable(SavedStateHandle savedStateHandle, String key, final Saver<T, ? extends Object> saver, Function0<? extends T> init) {
        final T tInvoke;
        Object obj;
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(saver, "saver");
        Intrinsics.checkNotNullParameter(init, "init");
        Bundle bundle = (Bundle) savedStateHandle.get(key);
        if (bundle == null || (obj = bundle.get("value")) == null || (tInvoke = saver.restore(obj)) == null) {
            tInvoke = init.invoke();
        }
        savedStateHandle.setSavedStateProvider(key, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda1
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return SavedStateHandleSaverKt.saveable$lambda$1(saver, tInvoke);
            }
        });
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle saveable$lambda$1(Saver saver, Object value) {
        Intrinsics.checkNotNullParameter(saver, "$saver");
        Intrinsics.checkNotNullParameter(value, "$value");
        return BundleKt.bundleOf(TuplesKt.to("value", saver.save(new SavedStateHandleSaverKt$saveable$1$1$1(SavedStateHandle.Companion), value)));
    }

    public static final <T> MutableState<T> saveable(SavedStateHandle savedStateHandle, String key, Saver<T, ? extends Object> stateSaver, Function0<? extends MutableState<T>> init) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(stateSaver, "stateSaver");
        Intrinsics.checkNotNullParameter(init, "init");
        return (MutableState) m6965saveable(savedStateHandle, key, mutableStateSaver(stateSaver), (Function0) init);
    }

    public static /* synthetic */ PropertyDelegateProvider saveable$default(SavedStateHandle savedStateHandle, Saver saver, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            saver = SaverKt.autoSaver();
        }
        return saveable(savedStateHandle, saver, function0);
    }

    public static final <T> PropertyDelegateProvider<Object, ReadOnlyProperty<Object, T>> saveable(final SavedStateHandle savedStateHandle, final Saver<T, ? extends Object> saver, final Function0<? extends T> init) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(saver, "saver");
        Intrinsics.checkNotNullParameter(init, "init");
        return new PropertyDelegateProvider() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda0
            @Override // kotlin.properties.PropertyDelegateProvider
            public final Object provideDelegate(Object obj, KProperty kProperty) {
                return SavedStateHandleSaverKt.saveable$lambda$3(savedStateHandle, saver, init, obj, kProperty);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadOnlyProperty saveable$lambda$3(SavedStateHandle this_saveable, Saver saver, Function0 init, Object obj, KProperty property) {
        Intrinsics.checkNotNullParameter(this_saveable, "$this_saveable");
        Intrinsics.checkNotNullParameter(saver, "$saver");
        Intrinsics.checkNotNullParameter(init, "$init");
        Intrinsics.checkNotNullParameter(property, "property");
        final Object objM6965saveable = m6965saveable(this_saveable, (obj != null ? Reflection.getOrCreateKotlinClass(obj.getClass()).getQualifiedName() + '.' : "") + property.getName(), (Saver<Object, ? extends Object>) saver, (Function0<? extends Object>) init);
        return new ReadOnlyProperty() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda3
            @Override // kotlin.properties.ReadOnlyProperty
            public final Object getValue(Object obj2, KProperty kProperty) {
                return SavedStateHandleSaverKt.saveable$lambda$3$lambda$2(objM6965saveable, obj2, kProperty);
            }
        };
    }

    public static /* synthetic */ PropertyDelegateProvider saveableMutableState$default(SavedStateHandle savedStateHandle, Saver saver, Function0 function0, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            saver = SaverKt.autoSaver();
        }
        return saveableMutableState(savedStateHandle, saver, function0);
    }

    public static final <T, M extends MutableState<T>> PropertyDelegateProvider<Object, ReadWriteProperty<Object, T>> saveableMutableState(final SavedStateHandle savedStateHandle, final Saver<T, ? extends Object> stateSaver, final Function0<? extends M> init) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(stateSaver, "stateSaver");
        Intrinsics.checkNotNullParameter(init, "init");
        return new PropertyDelegateProvider() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda2
            @Override // kotlin.properties.PropertyDelegateProvider
            public final Object provideDelegate(Object obj, KProperty kProperty) {
                return SavedStateHandleSaverKt.saveable$lambda$4(savedStateHandle, stateSaver, init, obj, kProperty);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadWriteProperty saveable$lambda$4(SavedStateHandle this_saveable, Saver stateSaver, Function0 init, Object obj, KProperty property) {
        Intrinsics.checkNotNullParameter(this_saveable, "$this_saveable");
        Intrinsics.checkNotNullParameter(stateSaver, "$stateSaver");
        Intrinsics.checkNotNullParameter(init, "$init");
        Intrinsics.checkNotNullParameter(property, "property");
        final MutableState mutableStateSaveable = saveable(this_saveable, (obj != null ? Reflection.getOrCreateKotlinClass(obj.getClass()).getQualifiedName() + '.' : "") + property.getName(), stateSaver, init);
        return new ReadWriteProperty<Object, T>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$saveable$3$1
            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public T getValue(Object obj2, KProperty<?> property2) {
                Intrinsics.checkNotNullParameter(property2, "property");
                return mutableStateSaveable.getValue();
            }

            @Override // kotlin.properties.ReadWriteProperty
            public void setValue(Object obj2, KProperty<?> property2, T t2) {
                Intrinsics.checkNotNullParameter(property2, "property");
                mutableStateSaveable.setValue(t2);
            }
        };
    }

    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(final Saver<T, ? extends Object> saver) {
        Intrinsics.checkNotNull(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.Saver(new Function2<SaverScope, MutableState<T>, MutableState<Object>>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$mutableStateSaver$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final MutableState<Object> invoke(SaverScope Saver, MutableState<T> state) {
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(state, "state");
                if (!(state instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
                }
                Object objSave = saver.save(Saver, state.getValue());
                SnapshotMutationPolicy<T> policy = ((SnapshotMutableState) state).getPolicy();
                Intrinsics.checkNotNull(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return SnapshotStateKt.mutableStateOf(objSave, policy);
            }
        }, new Function1<MutableState<Object>, MutableState<T>>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$mutableStateSaver$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final MutableState<T> invoke(MutableState<Object> it) {
                T tRestore;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (it.getValue() != null) {
                    Saver<T, Object> saver2 = saver;
                    Object value = it.getValue();
                    Intrinsics.checkNotNull(value);
                    tRestore = saver2.restore(value);
                } else {
                    tRestore = null;
                }
                SnapshotMutationPolicy<T> policy = ((SnapshotMutableState) it).getPolicy();
                Intrinsics.checkNotNull(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver$lambda$5?>");
                MutableState<T> mutableStateMutableStateOf = SnapshotStateKt.mutableStateOf(tRestore, policy);
                Intrinsics.checkNotNull(mutableStateMutableStateOf, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver$lambda$5>");
                return mutableStateMutableStateOf;
            }
        });
    }
}
