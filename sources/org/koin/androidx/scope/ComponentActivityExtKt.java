package org.koin.androidx.scope;

import android.content.ComponentCallbacks;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.core.Koin;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;
import org.koin.core.scope.ScopeCallback;
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
@Metadata(bv = {}, d1 = {"Я0\u001d̉=!4i\bDZc|\u0004W\u00068\u000b4E\u0007\":ߚ\u007fјnjO0L͜P.hS2\u000fq{<$i$yCAU2\f0ޛgTwi~J\t\u000bq\u000e.\u0016'kDWczu\u0018\u001f4Rom3{ne9\u000fuN\r.5:8(\u0005)\u001aXI(~\tGc\f@0hphS%c\u0013\u001f*\u0006l )\u001e\u000bh~>Nlk@G%\u0019hpUmdH\u000f[\u0015^TU\r\u001faL4p;C\u001f=S1\u0012\u0019¹W\rM}U\u0007~&U+qs\u00067p\u0012\"\"CO;k\u001b&\u000b\u0010\u0002d\u001a6CO\u0012K\u0017ʫ߳{\u000b"}, d2 = {"/bc6i0Mg\u0006~\nZ0\u0006\t.S}2\u0007@", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qYJ\t\"!Po\u0017KR#D]\u000f$F\u0002k", "/bc6i0Mg\u0007|\u0005i,", "1qT.g,\u001aQ(\u0003\fb;\u0011u/t{,\u0005@\u007f\u0005\u0015Qz\u000e", "1qT.g,\u001aQ(\u0003\fb;\u0011v-o\u000b(", "1qT.g,,Q#\nz", "And?V,", "", "1qT.g,,Q#\nz?6\nf?r\r(\u0005Og\u001b\u0018Gm\":}%", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0004K\u000b \u0017P~k8},2U{&EC", "=v]2e", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "5dc V6IS\u0003\fcn3\u0004", "@dV6f;>`\u0007|\u0005i,]\u0013<L\u0004){>\u0015\u0015\u001eG", "", "Ab^=X", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ComponentActivityExtKt {

    /* JADX INFO: renamed from: org.koin.androidx.scope.ComponentActivityExtKt$activityRetainedScope$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!4i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<Scope> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Scope invoke() {
            return ComponentActivityExtKt.createActivityRetainedScope(componentActivity);
        }
    }

    /* JADX INFO: renamed from: org.koin.androidx.scope.ComponentActivityExtKt$activityScope$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!4i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C14661 extends Lambda implements Function0<Scope> {
        C14661() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Scope invoke() {
            return ComponentActivityExtKt.createActivityScope(componentActivity);
        }
    }

    /* JADX INFO: renamed from: org.koin.androidx.scope.ComponentActivityExtKt$createScopeForCurrentLifecycle$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0019\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000bDB\u0007ӬT\u0011Մ\rn\u0001ˎ`D\u0014Gv`a*'k*5T_2s[;\u0004\u001dD6߄SR"}, d2 = {"=qV{^6B\\bz\u0004]9\u0007\r.xI6yJ\f\u0017`%y\u0016G\u0001.5b\r{5|\u001a?QROKG-zw 7\u0014c(]v\u0015EVY,=\\\u007f\u001b$\u001fg\u000eW:s\tZA\"\u0003B>\u001fFw", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Rok8},2U{&\r", "=mB0b7>1 \t\t^", "", "Ab^=X", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class C14671 implements ScopeCallback {
        C14671() {
        }

        @Override // org.koin.core.scope.ScopeCallback
        public void onScopeClose(Scope scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            LifecycleOwner lifecycleOwner = lifecycleOwner;
            Intrinsics.checkNotNull(lifecycleOwner, "null cannot be cast to non-null type org.koin.android.scope.AndroidScopeComponent");
            ((AndroidScopeComponent) lifecycleOwner).onCloseScope();
        }
    }

    /* JADX INFO: renamed from: org.koin.androidx.scope.ComponentActivityExtKt$registerScopeForLifecycle$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0019\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000bDB\u0007ӬT\u0011Մ\rn\u0001ˎ`D\u0014Gv`a*'k*5T_2s[;\u0004\u001dD6߄SR"}, d2 = {"=qV{^6B\\bz\u0004]9\u0007\r.xI6yJ\f\u0017`%y\u0016G\u0001.5b\r{5|\u001a?QROKG-zw F\u0007e0\\\u0006'T:L6gRSG!x^\u000fN)!\u0003`Ab:", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E\u001f\u0001\u0018\u0013Wv\u001d#z&5W\u0012\u001e>m\u007f+[CH|4+j", "=m32f;K]-", "", "=v]2e", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class C14681 implements DefaultLifecycleObserver {
        C14681() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            super.onDestroy(owner);
            scope.close();
        }
    }

    public static final Lazy<Scope> activityRetainedScope(ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        return LazyKt.lazy(new Function0<Scope>() { // from class: org.koin.androidx.scope.ComponentActivityExtKt.activityRetainedScope.1
            AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Scope invoke() {
                return ComponentActivityExtKt.createActivityRetainedScope(componentActivity);
            }
        });
    }

    public static final Lazy<Scope> activityScope(ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        return LazyKt.lazy(new Function0<Scope>() { // from class: org.koin.androidx.scope.ComponentActivityExtKt.activityScope.1
            C14661() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Scope invoke() {
                return ComponentActivityExtKt.createActivityScope(componentActivity);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Scope createActivityRetainedScope(final ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        if (!(componentActivity instanceof AndroidScopeComponent)) {
            throw new IllegalStateException("Activity should implement AndroidScopeComponent".toString());
        }
        final Function0 function0 = null;
        ScopeHandlerViewModel scopeHandlerViewModel = (ScopeHandlerViewModel) new ViewModelLazy(Reflection.getOrCreateKotlinClass(ScopeHandlerViewModel.class), new Function0<ViewModelStore>() { // from class: org.koin.androidx.scope.ComponentActivityExtKt$createActivityRetainedScope$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = componentActivity.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: org.koin.androidx.scope.ComponentActivityExtKt$createActivityRetainedScope$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = componentActivity.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: org.koin.androidx.scope.ComponentActivityExtKt$createActivityRetainedScope$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }).getValue();
        if (scopeHandlerViewModel.getScope() == null) {
            scopeHandlerViewModel.setScope(Koin.createScope$default(ComponentCallbackExtKt.getKoin(componentActivity), KoinScopeComponentKt.getScopeId(componentActivity), KoinScopeComponentKt.getScopeName(componentActivity), null, 4, null));
        }
        Scope scope = scopeHandlerViewModel.getScope();
        Intrinsics.checkNotNull(scope);
        return scope;
    }

    public static final Scope createActivityScope(ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        if (!(componentActivity instanceof AndroidScopeComponent)) {
            throw new IllegalStateException("Activity should implement AndroidScopeComponent".toString());
        }
        ComponentActivity componentActivity2 = componentActivity;
        Scope scopeOrNull = ComponentCallbackExtKt.getKoin(componentActivity2).getScopeOrNull(KoinScopeComponentKt.getScopeId(componentActivity));
        return scopeOrNull == null ? createScopeForCurrentLifecycle(componentActivity2, componentActivity) : scopeOrNull;
    }

    public static final Scope createScope(ComponentActivity componentActivity, Object obj) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        return ComponentCallbackExtKt.getKoin(componentActivity).createScope(KoinScopeComponentKt.getScopeId(componentActivity), KoinScopeComponentKt.getScopeName(componentActivity), obj);
    }

    public static /* synthetic */ Scope createScope$default(ComponentActivity componentActivity, Object obj, int i2, Object obj2) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            obj = null;
        }
        return createScope(componentActivity, obj);
    }

    public static final Scope createScopeForCurrentLifecycle(ComponentCallbacks componentCallbacks, LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(componentCallbacks, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Scope scopeCreateScope = ComponentCallbackExtKt.getKoin(componentCallbacks).createScope(KoinScopeComponentKt.getScopeId(componentCallbacks), KoinScopeComponentKt.getScopeName(componentCallbacks), componentCallbacks);
        scopeCreateScope.registerCallback(new ScopeCallback() { // from class: org.koin.androidx.scope.ComponentActivityExtKt.createScopeForCurrentLifecycle.1
            C14671() {
            }

            @Override // org.koin.core.scope.ScopeCallback
            public void onScopeClose(Scope scope) {
                Intrinsics.checkNotNullParameter(scope, "scope");
                LifecycleOwner lifecycleOwner = lifecycleOwner;
                Intrinsics.checkNotNull(lifecycleOwner, "null cannot be cast to non-null type org.koin.android.scope.AndroidScopeComponent");
                ((AndroidScopeComponent) lifecycleOwner).onCloseScope();
            }
        });
        registerScopeForLifecycle(owner, scopeCreateScope);
        return scopeCreateScope;
    }

    public static final Scope getScopeOrNull(ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        return ComponentCallbackExtKt.getKoin(componentActivity).getScopeOrNull(KoinScopeComponentKt.getScopeId(componentActivity));
    }

    public static final void registerScopeForLifecycle(LifecycleOwner lifecycleOwner, Scope scope) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: org.koin.androidx.scope.ComponentActivityExtKt.registerScopeForLifecycle.1
            C14681() {
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onDestroy(owner);
                scope.close();
            }
        });
    }
}
