package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: compiled from: SavedStateViewModelFactory.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2\u000fq|<$q$yّCU0}*\tUNog\u0005JbŏK\u000f\u001c\u0016\u0001j2I]xs\u0012\u00172HoG3[{E9ft>\u0005.2*8\u007f\u0005\u0017ɝZH>u+Cy\fR5F\u0005ĐV\r[\u0006Z)\fR0\u0007,^\u007fPLG\u001b`J31\u0007\u0002B|,ۢ4|[\u0013\u0007u-\"\u0007g,-X9K\u0014SV\u0013\u000b`_W\u0003mvM\u000bv.?-_r\u0006>ݼ\u0004\u0014#4\u00180k\u0002>\\Ka\u0001\u0012-˃]ssP<9(\u0005\n\u001fT\n\u001e\b7Ht=HyN\"\u07baxraT\u0019-lQ\u0018z(F7+\u0006đ9ICf\u007frk#\\I\u0014\u000b\u001d 3\u000151\ng>d#0lw\u007fG\u0018TףLN\u0018p\u0006\u0017\u0012\u007fz\u0002p\u0014PM\u0006\u07fc\n!V\u0017SH\f=19\u0004\u0002v]\u0018\u0001\u0013r\u0001YyTX@h~DJҊ\r\fh^-\u0013yklXZ-} b$\u0016\bA1#\r\r/3\u0012fQ~h\u0019P4܆1çj7aʤ<\u001ce@v5KP\u0012\u00188ׯ\u0003݀C<jڳ)rP]$Z\u000b(xøJн\u0014w\u0004ͩ\u001f\u001a!=Ws23Z=o¥!Ƞ\u0007\u001eJˆM\u0017mg\u0001\u0012\u0015Sa2Yǰ0ڲ\r\u0001Xʔ˂s\u0006"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E.|(\u0017F]\u001d8\u0006%&]}2\u001fw\u0015.T$7iC(\"|7", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l7L(k@.\u0015uu\u001a\u0003a;X\u0004;\u001d", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l.?9z>+)>", "u(E", "/o_9\\*:b\u001d\t\u0004", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "=v]2e", "\u001a`]1e6BR,H\tZ=|\b=t{7{\nn\u0013(Gn{Kr45F}\";{%;a-Mt4+j", "uKP;W9HW\u0018Hvi7Fd:p\u0007,y<\u0010\u001b!PEt8\u007f$Bc\u0002\u001fJ7$*^C:yC\u001a$h+'\u0003t,Md6C[N\u0019\\TvK#\u001fnw`4\r\u0012/\u0005\u0015", "2dU.h3M/&\u0001\t", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "uKP;W9HW\u0018Hvi7Fd:p\u0007,y<\u0010\u001b!PEt8\u007f$Bc\u0002\u001fJ7$*^C:yC\u001a$h+'\u0003t,Md6C[N\u0019\\TvK#\u001fnw`4\r\u0012/( wCD)\f+\u0013\fI2]\u001c\u001f\r<jF\u0006G", "4`RAb9R", ":hU2V@<Z\u0019", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvz", "A`e2W\u001aMO(~g^.\u0001\u0017>r\u0014", "\u001a`]1e6BR,H\tZ=|\b=t{7{\nn\u0013(Gn{Kr45F}\";{%;a\u0019", "1qT.g,", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", ";nS2_\nEO'\r", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkb<\n\u0016$Qs\rO@,9Z}\u001eKk\u001d.\u00174?kF\u0006\u001fga@\\", "3wc?T:", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,j", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000fwI\u007f$!Kn!\u0006})6Y{45t\u0016w^G;}<(\u0014hh\u0003dp,J\u0006+QU.?k_nKiUA\nW*\u001a\u000f]@78K; \b*]\u007fBhJ|\u001a\u000eGRzAV\u0017\u001d", "9dh", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u0013`y.ECY\u0015IL:x>\"\u0014{+@\u000bd,L\u000b%NL\u0018\u001d`R\u0005%\u001e\u0011Z\u0015$", "=mA2d<>`-", "", "DhTD@6=S ", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/CN|(\u0017F}\u001d8\u0006%/f}'7i$."}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {
    private Application application;
    private Bundle defaultArgs;
    private final ViewModelProvider.Factory factory;
    private Lifecycle lifecycle;
    private SavedStateRegistry savedStateRegistry;

    public SavedStateViewModelFactory() {
        this.factory = new ViewModelProvider.AndroidViewModelFactory();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SavedStateViewModelFactory(Application application, SavedStateRegistryOwner owner) {
        this(application, owner, null);
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    public SavedStateViewModelFactory(Application application, SavedStateRegistryOwner owner, Bundle bundle) {
        ViewModelProvider.AndroidViewModelFactory androidViewModelFactory;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.savedStateRegistry = owner.getSavedStateRegistry();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = bundle;
        this.application = application;
        if (application != null) {
            androidViewModelFactory = ViewModelProvider.AndroidViewModelFactory.Companion.getInstance(application);
        } else {
            androidViewModelFactory = new ViewModelProvider.AndroidViewModelFactory();
        }
        this.factory = androidViewModelFactory;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.get(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.get(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY) != null && extras.get(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY) != null) {
            Application application = (Application) extras.get(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
            boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
            Constructor constructorFindMatchingConstructor = (!zIsAssignableFrom || application == null) ? SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE) : SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE);
            if (constructorFindMatchingConstructor == null) {
                return (T) this.factory.create(modelClass, extras);
            }
            if (zIsAssignableFrom && application != null) {
                return (T) SavedStateViewModelFactoryKt.newInstance(modelClass, constructorFindMatchingConstructor, application, SavedStateHandleSupport.createSavedStateHandle(extras));
            }
            return (T) SavedStateViewModelFactoryKt.newInstance(modelClass, constructorFindMatchingConstructor, SavedStateHandleSupport.createSavedStateHandle(extras));
        }
        if (this.lifecycle != null) {
            return (T) create(str, modelClass);
        }
        throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
    }

    public final <T extends ViewModel> T create(String key, Class<T> modelClass) {
        T t2;
        Application application;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
        Constructor constructorFindMatchingConstructor = (!zIsAssignableFrom || this.application == null) ? SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE) : SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE);
        if (constructorFindMatchingConstructor == null) {
            return this.application != null ? (T) this.factory.create(modelClass) : (T) ViewModelProvider.NewInstanceFactory.Companion.getInstance().create(modelClass);
        }
        SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        Intrinsics.checkNotNull(savedStateRegistry);
        SavedStateHandleController savedStateHandleControllerCreate = LegacySavedStateHandleController.create(savedStateRegistry, lifecycle, key, this.defaultArgs);
        if (zIsAssignableFrom && (application = this.application) != null) {
            Intrinsics.checkNotNull(application);
            t2 = (T) SavedStateViewModelFactoryKt.newInstance(modelClass, constructorFindMatchingConstructor, application, savedStateHandleControllerCreate.getHandle());
        } else {
            t2 = (T) SavedStateViewModelFactoryKt.newInstance(modelClass, constructorFindMatchingConstructor, savedStateHandleControllerCreate.getHandle());
        }
        t2.addCloseable(LegacySavedStateHandleController.TAG_SAVED_STATE_HANDLE_CONTROLLER, savedStateHandleControllerCreate);
        return t2;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) create(canonicalName, modelClass);
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public void onRequery(ViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (this.lifecycle != null) {
            SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
            Intrinsics.checkNotNull(savedStateRegistry);
            Lifecycle lifecycle = this.lifecycle;
            Intrinsics.checkNotNull(lifecycle);
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, lifecycle);
        }
    }
}
