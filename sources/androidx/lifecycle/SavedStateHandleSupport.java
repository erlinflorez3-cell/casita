package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d̉=!4i\bDZc|İI\u0006>\u00176Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP\u008cZS@\u000fs{:%c$\bCCU ~*\teNogtLb\u000bY\u000f\u000eǝ\u0001j:I]xc\u0013'ZP\u007fW3{\u0001m=n\u0007N\u0005N6R<\b\u0018\u0019\u001aXO@z\tWc\f@2pvHg%O\u001b\u0019@\u0006\u0005 \u0019(jwf6v}\u0006:]9InZk5vH|{%f^-˙\u0005zF+n;]\u0015SZ+\u0007\u0019t\u0006\bӭu=\u0013\u0003G;9ɞ\f]FZ\u0010\u0014C+}\f\u0014v|ؠ\u0007Ōd\f/˃ooYQ&(&|Rȡ\u000fǬ\u0012\u0006/ΞNA(i \u0014Cv\u0003SnT0]x\u0004Qʰ8а)\u007f;ٿY'tVy;GP\u000eީWڟ\"#\t͙Aob\u0014x\u001b+V\bQ_Xn<~R`Է?ъ\bpj̣J\u001a>O\u0018/*\u001aV\u0017S;\u0012wyܪmɘLH\u007fx\u000bjv^\nhVL:nDDR\t:az#[ߙRԜ\\0)O\"b\u0015\rݚ\u0017;"}, d2 = {"\u0012D5\u000eH\u0013-Mtk\\L&bh#", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,SNaM\\", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "!@E\u00127&,BtmZX\u0012\\|", "", "!@E\u00127&,BtmZX\u0019\\j\u0013Sn\u0015o:j\t\u007f'\\\b\"V\u0019", "\u001a`]1e6BR,H\tZ=|\b=t{7{\nn\u0013(Gn{Kr45F}\";{%;a-Mt4+j", "$H4$@\u0016\u001d3\u007fx`> ", "$H4$R\u0014(2xetL\u001bfu\u000f_i\u001ad m\u0011|'c", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0013Dc\u000b !\u007f\u001f.Z\u0019", "A`e2W\u001aMO(~]Z5{\u0010/sj5\u0006Q\u0005\u0016\u0017T", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E.|(\u0017F]\u001d8\u0006%\u0018U\u0007\u001f>m$\u0019ZMLo3\u001e\">", "5dc T=>R\u0007\u000evm,_\u00058d\u0007(\n+\u000e!(Kn\u000eI", "uKP;W9HW\u0018\u0012Dl(\u000e\t.s\u000f$\u000b@J\u0005\u0013Xo\r*\u0006!DYj 9q$=ZW%}=\u001e\">% \u0003l+[\u0001+F_\u00183`Sr;(\u0010a\u000e\u0018\u0019\t\u0016Y@\u0012}@F\u001fj(R\u0001Bh\u000fv#\u0018FnoBce", "A`e2W\u001aMO(~]Z5{\u0010/sp\u0010", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E.|(\u0017F]\u001d8\u0006%\u0018U\u0007\u001f>m$\u001f5\u0019", "5dc T=>R\u0007\u000evm,_\u00058d\u0007(\n1h", "uKP;W9HW\u0018\u0012De0}\t-y}/{\nq\u001b\u0017YW\u0018;v,#h\b-7W(7MP\u0011/\u001b\u001a\u001egnC\u000bb?\u0018}+HLL@ZYr\u0007\u0002\u000ek\u000eM\u0019\u001c\u0001hA\u0007jM6&\b::i\u0011", "1qT.g,,O*~yL;x\u0018/H{1zG\u0001", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E.|(\u0017F]\u001d8\u0006%\u0018U\u0007\u001f>mk", "A`e2W\u001aMO(~g^.\u0001\u0017>r\u0014\u0012\u000eI\u0001$", "DhTD@6=S l\nh9|rAn\u007f5", "9dh", "2dU.h3M/&\u0001\t", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,j", "3mP/_,,O*~yL;x\u0018/H{1zG\u0001%", "", "\"", "uKP;W9HW\u0018\u0012Dl(\u000e\t.s\u000f$\u000b@J\u0005\u0013Xo\r*\u0006!DYj 9q$=ZW%}=\u001e\">%*", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/CN|(\u0017F}\u001d8\u0006%/f}'7i$."}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SavedStateHandleSupport {
    private static final String SAVED_STATE_KEY = "androidx.lifecycle.internal.SavedStateHandlesProvider";
    private static final String VIEWMODEL_KEY = "androidx.lifecycle.internal.SavedStateHandlesVM";
    public static final CreationExtras.Key<SavedStateRegistryOwner> SAVED_STATE_REGISTRY_OWNER_KEY = new CreationExtras.Key<SavedStateRegistryOwner>() { // from class: androidx.lifecycle.SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1
    };
    public static final CreationExtras.Key<ViewModelStoreOwner> VIEW_MODEL_STORE_OWNER_KEY = new CreationExtras.Key<ViewModelStoreOwner>() { // from class: androidx.lifecycle.SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1
    };
    public static final CreationExtras.Key<Bundle> DEFAULT_ARGS_KEY = new CreationExtras.Key<Bundle>() { // from class: androidx.lifecycle.SavedStateHandleSupport$DEFAULT_ARGS_KEY$1
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends SavedStateRegistryOwner & ViewModelStoreOwner> void enableSavedStateHandles(T t2) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Lifecycle.State currentState = t2.getLifecycle().getCurrentState();
        if (currentState != Lifecycle.State.INITIALIZED && currentState != Lifecycle.State.CREATED) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t2.getSavedStateRegistry().getSavedStateProvider(SAVED_STATE_KEY) == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(t2.getSavedStateRegistry(), t2);
            t2.getSavedStateRegistry().registerSavedStateProvider(SAVED_STATE_KEY, savedStateHandlesProvider);
            t2.getLifecycle().addObserver(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }

    private static final SavedStateHandle createSavedStateHandle(SavedStateRegistryOwner savedStateRegistryOwner, ViewModelStoreOwner viewModelStoreOwner, String str, Bundle bundle) {
        SavedStateHandlesProvider savedStateHandlesProvider = getSavedStateHandlesProvider(savedStateRegistryOwner);
        SavedStateHandlesVM savedStateHandlesVM = getSavedStateHandlesVM(viewModelStoreOwner);
        SavedStateHandle savedStateHandle = savedStateHandlesVM.getHandles().get(str);
        if (savedStateHandle != null) {
            return savedStateHandle;
        }
        SavedStateHandle savedStateHandleCreateHandle = SavedStateHandle.Companion.createHandle(savedStateHandlesProvider.consumeRestoredStateForKey(str), bundle);
        savedStateHandlesVM.getHandles().put(str, savedStateHandleCreateHandle);
        return savedStateHandleCreateHandle;
    }

    public static final SavedStateHandle createSavedStateHandle(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "<this>");
        SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) creationExtras.get(SAVED_STATE_REGISTRY_OWNER_KEY);
        if (savedStateRegistryOwner == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) creationExtras.get(VIEW_MODEL_STORE_OWNER_KEY);
        if (viewModelStoreOwner == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) creationExtras.get(DEFAULT_ARGS_KEY);
        String str = (String) creationExtras.get(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        return createSavedStateHandle(savedStateRegistryOwner, viewModelStoreOwner, str, bundle);
    }

    public static final SavedStateHandlesVM getSavedStateHandlesVM(ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "<this>");
        return (SavedStateHandlesVM) new ViewModelProvider(viewModelStoreOwner, new ViewModelProvider.Factory() { // from class: androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Intrinsics.checkNotNullParameter(extras, "extras");
                return new SavedStateHandlesVM();
            }
        }).get(VIEWMODEL_KEY, SavedStateHandlesVM.class);
    }

    public static final SavedStateHandlesProvider getSavedStateHandlesProvider(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        SavedStateRegistry.SavedStateProvider savedStateProvider = savedStateRegistryOwner.getSavedStateRegistry().getSavedStateProvider(SAVED_STATE_KEY);
        SavedStateHandlesProvider savedStateHandlesProvider = savedStateProvider instanceof SavedStateHandlesProvider ? (SavedStateHandlesProvider) savedStateProvider : null;
        if (savedStateHandlesProvider != null) {
            return savedStateHandlesProvider;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }
}
