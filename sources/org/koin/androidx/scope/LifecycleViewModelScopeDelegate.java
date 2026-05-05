package org.koin.androidx.scope;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import org.koin.core.Koin;
import org.koin.core.component.KoinScopeComponentKt;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000fq~<$q$yّCU(\u0007*ޛeȞ\u0018s~Lj\u000bq\u000f\u0016\u0018\tjZJ\u0004w\u001e;\u001f6PqW3{rM=nxN\u0005N72J\u007f\u0005\u000f BT x\u000bCy\u0011\"2PphS;Tŋ\u001e\u0012\u0014Fh\u001c,f\u007fNdI\u001daH:;\u0003\u0018B~/m<\u0015Q\u001dFZ(;\u0004(ӳ+\tAC#=S1\u0016z[m\u0003\u0006q\u000e\u0013v0?-_r\u00067/ß Ʀ/O\u0015ƞC>j\u000bil\u001c);O\u0012P`\u00108w)|;CZ\u05fd\bόL.5Կ7\u0014\u001c7\rr\u0002E'؟`۰\u0004ziاg1\u000e5C9Ii(Ĩ=ϭR7\u0004˜ڥ\"3"}, d2 = {"\u001ana4\"2HW\"Hvg+\n\u00133d\u0013q\n>\u000b\"\u0017\u0011V\u0012=v#IW\u0005 (q\u0016@5M:k;\f\u0013rl9ec3Nx#VL$", "\u001aj^A_0G\u001d$\f\u0005i,\n\u00183e\u000eqh@|\u0016\u0001Pv\"'\u0004/@Y\u000b/KC", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", ":hU2V@<Z\u0019h\rg,\n", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qYJ\t\"!Po\u0017KR#D]\u000f$F\u0002k", "9nX;", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041Q", "1qT.g,,Q#\nz", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKP;W9HW\u0018\u0012DZ*\f\r@i\u000f<E\u001e\u000b\u001f\"Qx\u000eE\u0006\u00013h\u00021;|*\u00044MHm}$\u001flj\u0003\u0005m9N@\rQPW\u0002CX|L\u001b\u0016cWS<\u0015NZQ-lS;)\u0011:\u0013bKq~\u001b\u001a\u0018>6F\u0006G", "-rR<c,", "5dc#T3NS", "BgX@E,?", ">q^=X9Mg", "\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[E", "7r00g0OS", "", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class LifecycleViewModelScopeDelegate implements ReadOnlyProperty<LifecycleOwner, Scope> {
    private Scope _scope;
    private final Function1<Koin, Scope> createScope;
    private final Koin koin;
    private final ComponentActivity lifecycleOwner;

    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleViewModelScopeDelegate(final ComponentActivity lifecycleOwner, Koin koin, Function1<? super Koin, Scope> createScope) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(koin, "koin");
        Intrinsics.checkNotNullParameter(createScope, "createScope");
        this.lifecycleOwner = lifecycleOwner;
        this.koin = koin;
        this.createScope = createScope;
        final Function0 function0 = null;
        final ScopeHandlerViewModel scopeHandlerViewModel = (ScopeHandlerViewModel) new ViewModelLazy(Reflection.getOrCreateKotlinClass(ScopeHandlerViewModel.class), new Function0<ViewModelStore>() { // from class: org.koin.androidx.scope.LifecycleViewModelScopeDelegate$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = lifecycleOwner.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: org.koin.androidx.scope.LifecycleViewModelScopeDelegate$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = lifecycleOwner.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: org.koin.androidx.scope.LifecycleViewModelScopeDelegate$special$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = lifecycleOwner.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }).getValue();
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: org.koin.androidx.scope.LifecycleViewModelScopeDelegate.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                if (scopeHandlerViewModel.getScope() == null) {
                    scopeHandlerViewModel.setScope((Scope) this.createScope.invoke(this.koin));
                }
                this._scope = scopeHandlerViewModel.getScope();
            }
        });
    }

    public /* synthetic */ LifecycleViewModelScopeDelegate(final ComponentActivity componentActivity, Koin koin, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(componentActivity, koin, (i2 + 4) - (i2 | 4) != 0 ? new Function1<Koin, Scope>() { // from class: org.koin.androidx.scope.LifecycleViewModelScopeDelegate.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Scope invoke(Koin k2) {
                Intrinsics.checkNotNullParameter(k2, "k");
                return Koin.createScope$default(k2, KoinScopeComponentKt.getScopeName(componentActivity).getValue(), KoinScopeComponentKt.getScopeName(componentActivity), null, 4, null);
            }
        } : function1);
    }

    private final boolean isActive(LifecycleOwner lifecycleOwner) {
        return lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Scope getValue(LifecycleOwner lifecycleOwner, KProperty kProperty) {
        return getValue2(lifecycleOwner, (KProperty<?>) kProperty);
    }

    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public Scope getValue2(LifecycleOwner thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Scope scope = this._scope;
        if (scope != null) {
            Intrinsics.checkNotNull(scope);
            return scope;
        }
        if (!isActive(thisRef)) {
            throw new IllegalStateException(("can't get Scope for " + this.lifecycleOwner + " - LifecycleOwner is not Active").toString());
        }
        Scope scopeOrNull = this.koin.getScopeOrNull(KoinScopeComponentKt.getScopeName(this.lifecycleOwner).getValue());
        if (scopeOrNull == null) {
            scopeOrNull = this.createScope.invoke(this.koin);
        }
        this._scope = scopeOrNull;
        this.koin.getLogger().debug("got scope: " + this._scope + " for " + this.lifecycleOwner);
        Scope scope2 = this._scope;
        Intrinsics.checkNotNull(scope2);
        return scope2;
    }
}
