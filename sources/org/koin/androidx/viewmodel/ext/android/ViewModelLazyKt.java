package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.core.context.GlobalContext;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yCQU\"}8\tWȞog|VbŏK\u000f\u001c\u0016\u0001jBI]ތe\u0012%2JoU3UڎUʡ_\u0003Ȃ\u001d&B$HyK\u0001H)h\u0016|ٙQK4\u0012^A!D`\u000fe\u000b*\u0014\u0016>f\u0001L_\u0018RDL\u0005]h4S\toB\\-w0+T=NZ'\u001b~y A?e>E9Y\u0003\u0015\\sM\u0013A\u0002=3t=&YT\\YLW^!E3U\rk\u0001>^\u001bP\u000f\u001bW?UcY`&6\b|\f\rj\u0015$\u0005US\u0017/0ef yy\u000bNNc\u001adR\u0002\u000ba|\u0017S~S1?ӕtQ\n;GO_{3!N-\u000fp9ad\u0010p\u0015aT&TaYF=VV\"[Sl2y\u0013\b0\u0004>K\u0018/*\u0016^++7iC;/{\u0004XD\u0016\u0003\u001b_\u0017^RT^?\u0001{F?0\t\u001ah\\f\u001bj~c\t@\u0017M*d\u001f\f\u0018\u00150\\&M7$>Y8j\u007fi,oP*Gό6g\u0002\u0004\u0014g;n3{Q\u0012\u000f\u0002X|ܝM<\u000b\u0005\u0007gjS:o\r204`p y\fD\u0015\fA5oy\"4:91^+G1'rM\u0003\tm^\u0001\u0016\u000fVC$1nR\u007f9\u0015V\\~y\u007f\u0007Y.\r`P9WPc$\u000fW8g\u0013\nS\u000f\u0005s\u000eU\u007fN]K\u001b%&i\u0002 $*Q_??#\u000f-:H\u0001[P5t{P,$m\u007f܉}%"}, d2 = {"5dc\u0019TARD\u001d~\rF6{\t6F\n5YG|%%", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "1kPGm", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "=v]2e", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0013Dc\u000b !\u007f\u001f.Z\u0019", "Ab^=X", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "AsPAX", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "\u001ana4\"2HW\"Hvg+\n\u00133d\u0013q\rD\u0001)\u001fQn\u000eC@33c\t \u0001J&7LJ;J4\u001f\u0019qeH\u000bm5$", "9dh", "", ">`a.`,MS&\r", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EL\u0016/QL?z8(\u001e>", "DhTD@6=S _\u0005k\n\u0004\u0005=s", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qYJ\t\"!Po\u0017KR#D]\u000f$F\u0002k", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ViewModelLazyKt {
    @Deprecated(message = "6I\u000bEv4\u001ej\u0018U7\u000f\u0010*?S`\f\u000f6\u0017(\u0002[{][yRy0&k^iCaewG\u0014]'B\u001bi\f\u0011+dTzk?@\u001e\u000eH\u0017OZ\u000bCA\u0005\u001b~K[^\u0001\u000bm'U")
    @InterfaceC1492Gx
    public static final <T extends ViewModel> Lazy<T> getLazyViewModelForClass(final KClass<T> clazz, final ViewModelStoreOwner owner, final Scope scope, final Qualifier qualifier, final Function0<Bundle> function0, final String str, final Function0<? extends ParametersHolder> function02) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(scope, "scope");
        final ViewModelStore viewModelStore = owner.getViewModelStore();
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<T>() { // from class: org.koin.androidx.viewmodel.ext.android.ViewModelLazyKt.getLazyViewModelForClass.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModel invoke() {
                CreationExtras.Empty extras;
                Bundle bundleInvoke;
                Function0<Bundle> function03 = function0;
                if (function03 == null || (bundleInvoke = function03.invoke()) == null || (extras = BundleExtKt.toExtras(bundleInvoke, owner)) == null) {
                    extras = CreationExtras.Empty.INSTANCE;
                }
                return GetViewModelKt.resolveViewModel(clazz, viewModelStore, str, extras, qualifier, scope, function02);
            }
        });
    }

    public static /* synthetic */ Lazy getLazyViewModelForClass$default(KClass kClass, ViewModelStoreOwner viewModelStoreOwner, Scope scope, Qualifier qualifier, Function0 function0, String str, Function0 function02, int i2, Object obj) {
        String str2 = str;
        Function0 function03 = function0;
        Qualifier qualifier2 = qualifier;
        Scope rootScope = scope;
        if ((i2 + 4) - (4 | i2) != 0) {
            rootScope = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope();
        }
        if ((8 & i2) != 0) {
            qualifier2 = null;
        }
        if ((i2 + 16) - (16 | i2) != 0) {
            function03 = null;
        }
        if ((32 & i2) != 0) {
            str2 = null;
        }
        return getLazyViewModelForClass(kClass, viewModelStoreOwner, rootScope, qualifier2, function03, str2, (i2 & 64) == 0 ? function02 : null);
    }

    public static final <T extends ViewModel> Lazy<T> viewModelForClass(final ComponentActivity componentActivity, final KClass<T> clazz, final Qualifier qualifier, final ViewModelStoreOwner owner, final Function0<Bundle> function0, final String str, final Function0<? extends ParametersHolder> function02) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(owner, "owner");
        final ViewModelStore viewModelStore = owner.getViewModelStore();
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<T>() { // from class: org.koin.androidx.viewmodel.ext.android.ViewModelLazyKt.viewModelForClass.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModel invoke() {
                CreationExtras.Empty extras;
                Bundle bundleInvoke;
                Function0<Bundle> function03 = function0;
                if (function03 == null || (bundleInvoke = function03.invoke()) == null || (extras = BundleExtKt.toExtras(bundleInvoke, owner)) == null) {
                    extras = CreationExtras.Empty.INSTANCE;
                }
                return GetViewModelKt.resolveViewModel(clazz, viewModelStore, str, extras, qualifier, AndroidKoinScopeExtKt.getKoinScope(componentActivity), function02);
            }
        });
    }

    public static final <T extends ViewModel> Lazy<T> viewModelForClass(final Fragment fragment, final KClass<T> clazz, final Qualifier qualifier, final Function0<? extends ViewModelStoreOwner> owner, final Function0<Bundle> function0, final String str, final Function0<? extends ParametersHolder> function02) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(owner, "owner");
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<T>() { // from class: org.koin.androidx.viewmodel.ext.android.ViewModelLazyKt.viewModelForClass.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModel invoke() {
                CreationExtras.Empty extras;
                Bundle bundleInvoke;
                ViewModelStoreOwner viewModelStoreOwnerInvoke = owner.invoke();
                ViewModelStore viewModelStore = viewModelStoreOwnerInvoke.getViewModelStore();
                Function0<Bundle> function03 = function0;
                if (function03 == null || (bundleInvoke = function03.invoke()) == null || (extras = BundleExtKt.toExtras(bundleInvoke, viewModelStoreOwnerInvoke)) == null) {
                    extras = CreationExtras.Empty.INSTANCE;
                }
                return GetViewModelKt.resolveViewModel(clazz, viewModelStore, str, extras, qualifier, AndroidKoinScopeExtKt.getKoinScope(fragment), function02);
            }
        });
    }

    public static /* synthetic */ Lazy viewModelForClass$default(ComponentActivity componentActivity, KClass kClass, Qualifier qualifier, ViewModelStoreOwner viewModelStoreOwner, Function0 function0, String str, Function0 function02, int i2, Object obj) {
        Function0 function03 = function0;
        String str2 = str;
        ComponentActivity componentActivity2 = viewModelStoreOwner;
        Qualifier qualifier2 = qualifier;
        if ((i2 & 2) != 0) {
            qualifier2 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            componentActivity2 = componentActivity;
        }
        if ((i2 & 8) != 0) {
            function03 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            str2 = null;
        }
        return viewModelForClass(componentActivity, kClass, qualifier2, componentActivity2, (Function0<Bundle>) function03, str2, (Function0<? extends ParametersHolder>) ((i2 & 32) == 0 ? function02 : null));
    }

    public static /* synthetic */ Lazy viewModelForClass$default(final Fragment fragment, KClass kClass, Qualifier qualifier, Function0 function0, Function0 function02, String str, Function0 function03, int i2, Object obj) {
        Function0 function04 = function0;
        String str2 = str;
        Function0 function05 = function02;
        Qualifier qualifier2 = qualifier;
        if ((i2 & 2) != 0) {
            qualifier2 = null;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            function04 = new Function0<Fragment>() { // from class: org.koin.androidx.viewmodel.ext.android.ViewModelLazyKt.viewModelForClass.2
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
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            function05 = null;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            str2 = null;
        }
        return viewModelForClass(fragment, kClass, qualifier2, (Function0<? extends ViewModelStoreOwner>) function04, (Function0<Bundle>) function05, str2, (Function0<? extends ParametersHolder>) ((i2 & 32) == 0 ? function03 : null));
    }
}
