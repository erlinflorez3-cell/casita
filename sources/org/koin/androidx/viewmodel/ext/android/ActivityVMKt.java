package org.koin.androidx.viewmodel.ext.android;

import androidx.activity.ComponentActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<;!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007njO0L͜P.hS2\u000fq{<$q$yّS%(Ԃ:\t\u0016M\botϺh\nY\u000e.\u0016'jTI\u0004y\u000e\u001a\u00152PqW5cnk<\u0011\u0003<\r.6:@\n\u0007\u0011\u001aXN&u)H{\u001a\u00188NwRZ\u001dO\u0015\u001a@\u000eT\u001f/##ɩTʝGǍҺ>/1\f\u0002\u0013\\1w6\rO\u001dF\u001b&;\u0002\u0002&1¨E4+${\u00035R\u0004?1@\"E\u000bh5)CK\nVd[0\"\u001b3]\u0011uz6^\u0015Q\u000f\u0012=*}h{^\u00140\u0006\u0002\u0014\u0015L\u0006\u001e\u0006UPD,HkNԌ9иqԟöP\u0007fE\u0006ч\u0012d\u0016Ԅ\u0004?"}, d2 = {"5dc#\\,P;#}ze", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qYJ\t\"!Po\u0017KR#D]\u000f$F\u0002k", "?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "3wc?T:)`#}\u000b\\,\n", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,j", ">`a.`,MS&\r", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "uKP;W9HW\u0018\u0012DZ*\f\r@i\u000f<E\u001e\u000b\u001f\"Qx\u000eE\u0006\u00013h\u00021;|*\u00044MHm}$\u001flj\u0003\u0005m9N@3WHU0]VrJ]}j\nU/\u000e\tYNyUJA.\u000f0RK@y\tU\u0017\u001e>h\u007fF`\u0019UCu\u0006J'wJchD\u001d(Kl9k\u0010hfaKBm\u0015\u0002\"\u0019wT8\u0013\n\u001dq\u0003[wvkQ\"E\u000eg%idERyY;\bp&O|w\u0010FV{+>\u001e\b4<\u001en\u0004Knm", "DhTD@6=S ", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ActivityVMKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.androidx.viewmodel.ext.android.ActivityVMKt$viewModel$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<;!&i\u0016DLcz\u0004OيH\u000btA\u001f*2ߚ\u0006\u0006|ia0re\u000f6ʂW,\u0015l\n6"}, d2 = {"\n`]<a@F])\rS", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "7me<^,", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J\b\u001bG\u0002uFu%</"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass1<T> extends Lambda implements Function0<T> {
        final /* synthetic */ Function0<CreationExtras> $extrasProducer;
        final /* synthetic */ Function0<ParametersHolder> $parameters;
        final /* synthetic */ Qualifier $qualifier;
        final /* synthetic */ ComponentActivity $this_viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ComponentActivity componentActivity, Qualifier qualifier, Function0<? extends CreationExtras> function0, Function0<? extends ParametersHolder> function02) {
            super(0);
            this.$this_viewModel = componentActivity;
            this.$qualifier = qualifier;
            this.$extrasProducer = function0;
            this.$parameters = function02;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        public final ViewModel invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ComponentActivity componentActivity = this.$this_viewModel;
            Qualifier qualifier = this.$qualifier;
            Function0<CreationExtras> function0 = this.$extrasProducer;
            Function0<ParametersHolder> function02 = this.$parameters;
            ViewModelStore viewModelStore = componentActivity.getViewModelStore();
            if (function0 == null || (defaultViewModelCreationExtras = function0.invoke()) == null) {
                defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
            }
            Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
            Intrinsics.checkNotNull(viewModelStore);
            return GetViewModelKt.resolveViewModel$default(orCreateKotlinClass, viewModelStore, null, defaultViewModelCreationExtras, qualifier, koinScope, function02, 4, null);
        }
    }

    public static final /* synthetic */ <T extends ViewModel> T getViewModel(ComponentActivity componentActivity, Qualifier qualifier, Function0<? extends CreationExtras> function0, Function0<? extends ParametersHolder> function02) {
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        ViewModelStore viewModelStore = componentActivity.getViewModelStore();
        if (function0 == null || (defaultViewModelCreationExtras = function0.invoke()) == null) {
            defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
        }
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        Intrinsics.checkNotNull(viewModelStore);
        return (T) GetViewModelKt.resolveViewModel$default(orCreateKotlinClass, viewModelStore, null, defaultViewModelCreationExtras, qualifier, koinScope, function02, 4, null);
    }

    public static /* synthetic */ ViewModel getViewModel$default(ComponentActivity componentActivity, Qualifier qualifier, Function0 function0, Function0 function02, int i2, Object obj) {
        CreationExtras defaultViewModelCreationExtras;
        Qualifier qualifier2 = qualifier;
        if ((i2 + 1) - (1 | i2) != 0) {
            qualifier2 = null;
        }
        if ((2 & i2) != 0) {
            function0 = null;
        }
        Function0 function03 = (i2 + 4) - (i2 | 4) == 0 ? function02 : null;
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        ViewModelStore viewModelStore = componentActivity.getViewModelStore();
        if (function0 == null || (defaultViewModelCreationExtras = (CreationExtras) function0.invoke()) == null) {
            defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
        }
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        Intrinsics.checkNotNull(viewModelStore);
        return GetViewModelKt.resolveViewModel$default(orCreateKotlinClass, viewModelStore, null, defaultViewModelCreationExtras, qualifier2, koinScope, function03, 4, null);
    }

    public static final /* synthetic */ <T extends ViewModel> Lazy<T> viewModel(ComponentActivity componentActivity, Qualifier qualifier, Function0<? extends CreationExtras> function0, Function0<? extends ParametersHolder> function02) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass1(componentActivity, qualifier, function0, function02));
    }

    public static /* synthetic */ Lazy viewModel$default(ComponentActivity componentActivity, Qualifier qualifier, Function0 function0, Function0 function02, int i2, Object obj) {
        if ((1 & i2) != 0) {
            qualifier = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function0 = null;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            function02 = null;
        }
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass1(componentActivity, qualifier, function0, function02));
    }
}
