package org.koin.androidx.viewmodel.ext.android;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<;!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007njO0L͜P.hS2şs{J$c$wCCU0}*ޛg.u˧\u0007J!\nc\u0017\fǝ\u0007iBH}x\f\u001272ppo;SoK;xvL\u0004N5RD\u007f\r\u000f\u001eBN x\u000bCy\u0012@5p~@Z\u001bT\u001d\"\"\bN /&rf|;xzcB=,\u001bqRP7_^\u0007c\ftYmˡ|Ӧ\u001dѨË;5#0kc\u0015^sE\u0013A\u0002=KgU4KQyɎDW\u0016\u0013=+}\r\u0006rT]5Yf\f5-geaO<+(\u0007\u0002\u0015J\b&\f7J>-Hl6\u0013c\u0003x[NW\u001afR\u0002\u000bad\u001f;~a0i)lYoD1VG}\u0015\rL-\u0017mO`\u001bםf۶\u001aƘȰQ6YCCˊ~8Xǆq\u0012"}, d2 = {"5dc#\\,P;#}ze", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "=v]2e\u0017K]\u0018\u000fx^9", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0013Dc\u000b !\u007f\u001f.Z\u0019", "3wc?T:)`#}\u000b\\,\n", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,j", ">`a.`,MS&\r", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "uKP;W9HW\u0018\u0012D_9x\u000b7e\t7E<\f\"`(|\n>~%>hS\u0007Az\u0018wSM?t}\u001c\u001fua\u0003\u0013s(Uz(KL[uHbnD\u0018\u0013^\u000e[\u0001s\u000bcP+rM\u0001$\u00194\u0013\u0003Kq~\u001b\u001a\u0018>x:#f\u0019E\t\u0019\u007fJs>-_i\tNEN,/u\u0014)\u001elC83\u0018{\")21>\u0013yb\u0015|[D=NM#\n?(G7`WM9VL}%.O\u0006\u0001 {9\u00054r<\b>3\u0001:H2c!=k\u0003\u0019+o\u000b.*7<\u0011SIju6/\u0012h1I\u0012\rb<\u0007", "DhTD@6=S ", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class FragmentVMKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.androidx.viewmodel.ext.android.FragmentVMKt$viewModel$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<;!&i\u0016DLcz\u0004OيH\u000btA\u001f*2ߚ\u0006\u0006|ia0re\u000f6ʂW,\u0015l\n6"}, d2 = {"\n`]<a@F])\rS", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "7me<^,", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J\b\u001bG\u0002uFu%</"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass2<T> extends Lambda implements Function0<T> {
        final /* synthetic */ Function0<CreationExtras> $extrasProducer;
        final /* synthetic */ Function0<ViewModelStoreOwner> $ownerProducer;
        final /* synthetic */ Function0<ParametersHolder> $parameters;
        final /* synthetic */ Qualifier $qualifier;
        final /* synthetic */ Fragment $this_viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Fragment fragment, Qualifier qualifier, Function0<? extends ViewModelStoreOwner> function0, Function0<? extends CreationExtras> function02, Function0<? extends ParametersHolder> function03) {
            super(0);
            this.$this_viewModel = fragment;
            this.$qualifier = qualifier;
            this.$ownerProducer = function0;
            this.$extrasProducer = function02;
            this.$parameters = function03;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        public final ViewModel invoke() throws Throwable {
            CreationExtras defaultViewModelCreationExtras;
            Fragment fragment = this.$this_viewModel;
            Qualifier qualifier = this.$qualifier;
            Function0<ViewModelStoreOwner> function0 = this.$ownerProducer;
            Function0<CreationExtras> function02 = this.$extrasProducer;
            Function0<ParametersHolder> function03 = this.$parameters;
            ViewModelStore viewModelStore = function0.invoke().getViewModelStore();
            if (function02 == null || (defaultViewModelCreationExtras = function02.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
            }
            Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(fragment);
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return GetViewModelKt.resolveViewModel$default(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStore, null, defaultViewModelCreationExtras, qualifier, koinScope, function03, 4, null);
        }
    }

    public static final /* synthetic */ <T extends ViewModel> T getViewModel(Fragment fragment, Qualifier qualifier, Function0<? extends ViewModelStoreOwner> ownerProducer, Function0<? extends CreationExtras> function0, Function0<? extends ParametersHolder> function02) throws Throwable {
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        ViewModelStore viewModelStore = ownerProducer.invoke().getViewModelStore();
        if (function0 == null || (defaultViewModelCreationExtras = function0.invoke()) == null) {
            defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
        }
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(fragment);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) GetViewModelKt.resolveViewModel$default(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStore, null, defaultViewModelCreationExtras, qualifier, koinScope, function02, 4, null);
    }

    public static /* synthetic */ ViewModel getViewModel$default(final Fragment fragment, Qualifier qualifier, Function0 ownerProducer, Function0 function0, Function0 function02, int i2, Object obj) throws Throwable {
        CreationExtras defaultViewModelCreationExtras;
        Qualifier qualifier2 = qualifier;
        if ((1 & i2) != 0) {
            qualifier2 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            ownerProducer = new Function0<Fragment>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentVMKt.getViewModel.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Fragment invoke() {
                    return fragment;
                }
            };
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            function0 = null;
        }
        Function0 function03 = (i2 & 8) == 0 ? function02 : null;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) ownerProducer.invoke()).getViewModelStore();
        if (function0 == null || (defaultViewModelCreationExtras = (CreationExtras) function0.invoke()) == null) {
            defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
        }
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(fragment);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return GetViewModelKt.resolveViewModel$default(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStore, null, defaultViewModelCreationExtras, qualifier2, koinScope, function03, 4, null);
    }

    public static final /* synthetic */ <T extends ViewModel> Lazy<T> viewModel(Fragment fragment, Qualifier qualifier, Function0<? extends ViewModelStoreOwner> ownerProducer, Function0<? extends CreationExtras> function0, Function0<? extends ParametersHolder> function02) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass2(fragment, qualifier, ownerProducer, function0, function02));
    }

    public static /* synthetic */ Lazy viewModel$default(final Fragment fragment, Qualifier qualifier, Function0 function0, Function0 function02, Function0 function03, int i2, Object obj) {
        Function0 function04 = function02;
        Function0 ownerProducer = function0;
        Qualifier qualifier2 = qualifier;
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            qualifier2 = null;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            ownerProducer = new Function0<Fragment>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentVMKt.viewModel.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Fragment invoke() {
                    return fragment;
                }
            };
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            function04 = null;
        }
        Function0 function05 = (i2 & 8) == 0 ? function03 : null;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass2(fragment, qualifier2, ownerProducer, function04, function05));
    }
}
