package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<;!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007njO0Le^.Zݷ2\u000f\u0002{<$q$yCAU\"}8\tWȞ\u007f?|Ϻr\u000b\n\u000e&\u001e~̓:Hkw\u0006\u0012=2jom4}wC9nvN\u000761P;*\u0015\u0007\"8L(\u0001\u000bE[\f@6nu#RkT5.\u0018\u000eL(\u0019,li^6vus9](kkXM\u0006ivůSЮEÖܮ\u0011vo)C\u0019EA-+c\u0005\u0017R\">1L\u0012E\u000bؒ5&AH\u001cWdX(\u0014C,\u007f\u0015cr4^\u001dSv\u000bU.\u007fsQX\u001c,\u0010\u0005\f\u000fL\u0004<\fUM\u0017-xm8\"9|\u0001[X^\u0012`R\u007f)jL\u0016S\u0005\u001c-O\u001aE[(ݪ\u001fل6ަ˟\r#+\u0004tĩ\f\u0003\rה\u0019)"}, d2 = {"5dc g(MS\n\u0003zp\u0014\u0007\b/l", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qYJ\t\"!Po\u0017KR#D]\u000f$F\u0002k", "?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "AsPAX", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "\u001ana4\"2HW\"Hvg+\n\u00133d\u0013q\rD\u0001)\u001fQn\u000eC@33c\t \u0001J&7LJ;J4\u001f\u0019qeH\u000bm5$", ">`a.`,MS&\r", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EL\u0016/QL?z8(\u001e>", "uKP;W9HW\u0018\u0012DZ*\f\r@i\u000f<E\u001e\u000b\u001f\"Qx\u000eE\u0006\u00013h\u00021;|*\u00044MHm}$\u001flj\u0003\u0005m9N@3WHU0]VrJ]}j\nU/\u000e\tYNyUJA.\u000f0RK@y\tU\u0017\u001e>h\u007fF`\u0019UCu\u0006J'wJchD\u001d(Kl9k\u0010hfaKBm\u0015\u0002\"\u0019wT8\u0013\n\u001dq\u0003[wvkQ\"E\u000eg%idERyY;\bp&O|w\u0010FV{+>\u001e\b4<\u001en\u0004Knm", "AsPAX\u001dBS+f\u0005],\u0004", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ActivityStateVMKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.androidx.viewmodel.ext.android.ActivityStateVMKt$stateViewModel$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<;!&i\u0016DLcz\u0004OيH\u000btA\u001f*2ߚ\u0006\u0006|ia0re\u000f6ʂW,\u0015l\n6"}, d2 = {"\n`]<a@F])\rS", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "7me<^,", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J\b\u001bG\u0002uFu%</"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass1<T> extends Lambda implements Function0<T> {
        final /* synthetic */ Function0<ParametersHolder> $parameters;
        final /* synthetic */ Qualifier $qualifier;
        final /* synthetic */ Function0<Bundle> $state;
        final /* synthetic */ ComponentActivity $this_stateViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ComponentActivity componentActivity, Qualifier qualifier, Function0<Bundle> function0, Function0<? extends ParametersHolder> function02) {
            super(0);
            this.$this_stateViewModel = componentActivity;
            this.$qualifier = qualifier;
            this.$state = function0;
            this.$parameters = function02;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        public final ViewModel invoke() {
            ComponentActivity componentActivity = this.$this_stateViewModel;
            Qualifier qualifier = this.$qualifier;
            Function0<Bundle> function0 = this.$state;
            Function0<ParametersHolder> function02 = this.$parameters;
            ViewModelStore viewModelStore = componentActivity.getViewModelStore();
            CreationExtras extras = BundleExtKt.toExtras(function0.invoke(), componentActivity);
            if (extras == null) {
                extras = componentActivity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(extras, "<get-defaultViewModelCreationExtras>(...)");
            }
            Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
            Intrinsics.checkNotNull(viewModelStore);
            return GetViewModelKt.resolveViewModel$default(orCreateKotlinClass, viewModelStore, null, extras, qualifier, koinScope, function02, 4, null);
        }
    }

    @Deprecated(message = "\u0018Y\u0001tT\u0004\"ggU-\tdu/beb\u0012;\u001e6\u0013W\u000b<woea3jmX,\u000b\rsqMN]8R&hM\r{\u0018+Mj?H\u001b\u001bUx\\/\t5\u0015")
    @InterfaceC1492Gx
    public static final /* synthetic */ <T extends ViewModel> T getStateViewModel(ComponentActivity componentActivity, Qualifier qualifier, Function0<Bundle> state, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        ViewModelStore viewModelStore = componentActivity.getViewModelStore();
        CreationExtras extras = BundleExtKt.toExtras(state.invoke(), componentActivity);
        if (extras == null) {
            extras = componentActivity.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(extras, "<get-defaultViewModelCreationExtras>(...)");
        }
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        Intrinsics.checkNotNull(viewModelStore);
        return (T) GetViewModelKt.resolveViewModel$default(orCreateKotlinClass, viewModelStore, null, extras, qualifier, koinScope, function0, 4, null);
    }

    public static /* synthetic */ ViewModel getStateViewModel$default(ComponentActivity componentActivity, Qualifier qualifier, Function0 state, Function0 function0, int i2, Object obj) {
        Qualifier qualifier2 = qualifier;
        if ((i2 + 1) - (1 | i2) != 0) {
            qualifier2 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            state = ScopeExtKt.emptyState();
        }
        Function0 function02 = (i2 + 4) - (i2 | 4) == 0 ? function0 : null;
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        ViewModelStore viewModelStore = componentActivity.getViewModelStore();
        CreationExtras extras = BundleExtKt.toExtras((Bundle) state.invoke(), componentActivity);
        if (extras == null) {
            extras = componentActivity.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(extras, "<get-defaultViewModelCreationExtras>(...)");
        }
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        Intrinsics.checkNotNull(viewModelStore);
        return GetViewModelKt.resolveViewModel$default(orCreateKotlinClass, viewModelStore, null, extras, qualifier2, koinScope, function02, 4, null);
    }

    @Deprecated(message = "\u0018Y\u0001tT\u0004\"ggU-\tdu/beb\u0012;\u001e6\"[{][yRy0.1\f{Kad(>^2E;%0\f\\4]IOnMBv$[&E.")
    @InterfaceC1492Gx
    public static final /* synthetic */ <T extends ViewModel> Lazy<T> stateViewModel(ComponentActivity componentActivity, Qualifier qualifier, Function0<Bundle> state, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass1(componentActivity, qualifier, state, function0));
    }

    public static /* synthetic */ Lazy stateViewModel$default(ComponentActivity componentActivity, Qualifier qualifier, Function0 state, Function0 function0, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            qualifier = null;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            state = ScopeExtKt.emptyState();
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass1(componentActivity, qualifier, state, function0));
    }
}
