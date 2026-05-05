package androidx.lifecycle;

import android.app.Application;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import androidx.lifecycle.viewmodel.ViewModelProviderImpl;
import androidx.lifecycle.viewmodel.internal.DefaultViewModelProviderFactory;
import androidx.lifecycle.viewmodel.internal.JvmViewModelProviders;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: compiled from: ViewModelProvider.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2\u000fq|<$q$yCAV\"}8\tWȞog\u0005Jb\u000bI\u000f\u000e\u0016\u0007v4կ]xs\u0012\u00172HuEGcڎ[T\u0011td\u0004X5<S\u0016\"\u001fZIN%\u0007~QK$\u0012^A\u0001>`\u000fe\u0005H\u0015\u0016D&\u0001,`\u007fNdMǰa:=)CvHb7c>\u0004e\rt\\ܮ\u0011vo'kU=I%)a\n\u001fR\nG\u0013C\u007f?\u001dhU*ȅMse@\u0019\r\u001a\u0015;S\u001bh\u000b&\u000b\u0011Ōd\f58\u0018\bY^&(>\n\u001c\u0013Bǉ\u001c\u0015OH\\=Jp\u0016\u001fKz\u0003UPPHmp\u0012Aˀ6а)\u007fA>\u0002Gt_y;_]W\u0002\u000bټ,2)nOk\u0005\u0012n)3T&fa[NN`T\u001a[MmJ\u007f\u0011\u0014pˎ0Ͻ\u0004/\n'vC3Es9i0\f\bNֳu\u0006-`\u0017c\u001aVVT:nDLZ\u0013\u001ak\\j\u0015m`T\u001f;?dbΉ\u0007ą\f\u0013.t@`/3(N\u0016w\npSΪ\u00184Wfei\u001fu\u001chQdC7acVp\u0001\u000eZ̻<И\tXt[$\u0018hg@\"`TAݛyԞHN\u0014Ǝ՞C\u0011"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#\u0004", "", "As^?X", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0013Dc\u000b \r", "4`RAb9R", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l.?9z>+)>", "2dU.h3M1&~vm0\u0007\u0012\u000fx\u000f5wN", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,j", "uKP;W9HW\u0018\u0012De0}\t-y}/{\nq\u001b\u0017YW\u0018;v,#h\b-7C|*VBHu8\u001d(2h=\bc*bt.G\u0016?0\\dZG\u0013\u0012ax[5\u001e\tXA1-%3\u001d\u00176V\u0016\u0011O|\u0015\u0015\u001b?noU \u0017Kz\u0015sU'oF#p}GSMl)d\u0013)zi:63\u0018{\"z{_;\u0006\n)Tc", "=v]2e", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0013Dc\u000b !\u007f\u001f.Z\u0019", "uKP;W9HW\u0018\u0012De0}\t-y}/{\nq\u001b\u0017YW\u0018;v,#h\b-7W(7MP\u0011/%", "uKP;W9HW\u0018\u0012De0}\t-y}/{\nq\u001b\u0017YW\u0018;v,#h\b-7W(7MP\u0011R0'\u0014uk=\u0006vuUz(GJb*cR<.\u0018\u0012luX*\r\fDN.\u007fH6\u001f\u0015j*}9w\u000b\u0019*cx[", "7l_9", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n&]}2\u001fw\u0015.T.HuE\"\u0014hn\u001d\u000fn3$", "uKP;W9HW\u0018\u0012De0}\t-y}/{\n\u0012\u001b\u0017Yw\u0018;v,~J\u0002 IU -MJ&x>/\u0019gaFjk7ULj8", "5dc", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", ";nS2_\nEO'\r", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkb<\n\u0016$Qs\rO@,9Z}\u001eKk\u001d.\u00174?kF\u0006\u001fga@\\", "9dh", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u0013`y.ECY\u0015IL:x>\"\u0014{+@\u000bd,L\u000b%NL\u0018\u001d`R\u0005%\u001e\u0011Z\u0015$", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWIv&<Y{/\u0001Ss5IQIAw\u0005\u0011q`F\u0011g+a@.KMN*pPy=]\u0003^\u000e`\u0013\u0017\u0004YHy", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l\u000bV\nEu2?]|3\u0001t\u001a/MAOi;\u001e^Ye9\u0019K6Mv.\u001d", "\u000fmS?b0=D\u001d~\rF6{\t6F{&\u000bJ\u000e+", "\u0011n\\=T5B]\"", "\u0014`RAb9R", "\u001cdf\u0016a:MO\"|z?(z\u00189r\u0014", "\u001dmA2d<>`-_v\\;\u0007\u0016C", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class ViewModelProvider {
    public static final Companion Companion = new Companion(null);
    public static final CreationExtras.Key<String> VIEW_MODEL_KEY = ViewModelProviders.ViewModelKey.INSTANCE;
    private final ViewModelProviderImpl impl;

    /* JADX INFO: compiled from: ViewModelProvider.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјl\u007fOӄtev-\u0013V֖\u0013k\n4li2r[;\u0004\u001c.&\u0017Rfg\u0016r\u0011nŸG\u0014"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l7L(k@.\u0015uu\u001a\u0003a;X\u0004;\u001d", "", "u(E", "=mA2d<>`-", "", "DhTD@6=S ", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class OnRequeryFactory {
        public void onRequery(ViewModel viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore store, Factory factory) {
        this(store, factory, null, 4, null);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    @JvmStatic
    public static final ViewModelProvider create(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras) {
        return Companion.create(viewModelStore, factory, creationExtras);
    }

    @JvmStatic
    public static final ViewModelProvider create(ViewModelStoreOwner viewModelStoreOwner, Factory factory, CreationExtras creationExtras) {
        return Companion.create(viewModelStoreOwner, factory, creationExtras);
    }

    private ViewModelProvider(ViewModelProviderImpl viewModelProviderImpl) {
        this.impl = viewModelProviderImpl;
    }

    public /* synthetic */ ViewModelProvider(ViewModelStore viewModelStore, Factory factory, CreationExtras.Empty empty, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelStore, factory, (i2 & 4) != 0 ? CreationExtras.Empty.INSTANCE : empty);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore store, Factory factory, CreationExtras defaultCreationExtras) {
        this(new ViewModelProviderImpl(store, factory, defaultCreationExtras));
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStoreOwner owner) {
        this(owner.getViewModelStore(), androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE.getDefaultFactory$lifecycle_viewmodel_release(owner), androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE.getDefaultCreationExtras$lifecycle_viewmodel_release(owner));
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStoreOwner owner, Factory factory) {
        this(owner.getViewModelStore(), factory, androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE.getDefaultCreationExtras$lifecycle_viewmodel_release(owner));
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    public final <T extends ViewModel> T get(KClass<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) ViewModelProviderImpl.getViewModel$lifecycle_viewmodel_release$default(this.impl, modelClass, null, 2, null);
    }

    /* JADX INFO: compiled from: ViewModelProvider.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r.4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCC٥\"}8\tWȞmˮo`ҙ;C=\u0005V}p,֒Yxk\u0012WTPsW3{tm=nzN\u0005N9R>\u007f\u0005\u000f\"BH>\u007f+IQ\f :Xph]SRM< \nV /#\rk\\B`l\fG_)\tiPV?_^\u0006}\u0013LT5\u0017\u000faL6\u0007<\u0006)3T\u001b\rb]O\u0003mtk\u0007\u001f+}ǪKָ[6`ÜЕ\u00199"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l+MCv0'\u0019rj\u000f", "", "u(E", "$H4$R\u0014(2xetD\fp", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,SNaM\\", "", "1qT.g,", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#\u0004", "As^?X", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0013Dc\u000b \r", "4`RAb9R", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l.?9z>+)>", "3wc?T:", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,j", "=v]2e", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0013Dc\u000b !\u007f\u001f.Z\u0019", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ViewModelProvider create$default(Companion companion, ViewModelStoreOwner viewModelStoreOwner, Factory factory, CreationExtras creationExtras, int i2, Object obj) {
            if ((i2 + 2) - (2 | i2) != 0) {
                factory = androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE.getDefaultFactory$lifecycle_viewmodel_release(viewModelStoreOwner);
            }
            if ((i2 + 4) - (i2 | 4) != 0) {
                creationExtras = androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE.getDefaultCreationExtras$lifecycle_viewmodel_release(viewModelStoreOwner);
            }
            return companion.create(viewModelStoreOwner, factory, creationExtras);
        }

        public static /* synthetic */ ViewModelProvider create$default(Companion companion, ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras, int i2, Object obj) {
            if ((2 & i2) != 0) {
                factory = DefaultViewModelProviderFactory.INSTANCE;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
            return companion.create(viewModelStore, factory, creationExtras);
        }

        private Companion() {
        }

        @JvmStatic
        public final ViewModelProvider create(ViewModelStoreOwner owner, Factory factory, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new ViewModelProvider(owner.getViewModelStore(), factory, extras);
        }

        @JvmStatic
        public final ViewModelProvider create(ViewModelStore store, Factory factory, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new ViewModelProvider(store, factory, extras);
        }
    }

    public <T extends ViewModel> T get(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) get(JvmClassMappingKt.getKotlinClass(modelClass));
    }

    public final <T extends ViewModel> T get(String key, KClass<T> modelClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) this.impl.getViewModel$lifecycle_viewmodel_release(modelClass, key);
    }

    public <T extends ViewModel> T get(String key, Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) this.impl.getViewModel$lifecycle_viewmodel_release(JvmClassMappingKt.getKotlinClass(modelClass), key);
    }

    /* JADX INFO: compiled from: ViewModelProvider.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP\u008cZS@\u000fs{:%a\t\bّY`J}P\b\bMr0\u0012XZ#CU\u00076~pߚWV!]@\u0011bL}BKS\u007f?I`;73$x6أ}\u0005\u000f\u001frs\u001ev\u0013C\u0012\r26F\u0081HS5M3\u001cB\u0010L#\u0019$li^6\u000fm\f>_'\u0011oZNUfv\u0011֔\u0011Fb/U\"o\u001eC@}65+YΈ\u0015S\u0004?1A\"G\u0013k?-;K\u0004W|Y.\u001dE/]\u0013urTcKeԃ\u0010'9YԣJִʮ({\u0003}\u0013[2\rΣ+TΔ1\u0019"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l.?9z>+)>", "", "1qT.g,", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", ";nS2_\nEO'\r", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkb<\n\u0016$Qs\rO@,9Z}\u001eKk\u001d.\u00174?kF\u0006\u001fga@\\", "3wc?T:", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,j", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000fwI\u007f$!Kn!\u0006})6Y{45t\u0016w^G;}<(\u0014hh\u0003dp,J\u0006+QU.?k_nKiUA\nW*\u001a\u000f]@78K; \b*]\u007fBhJ|\u001a\u000eGRzAV\u0017\u001d", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l.k\u0017;\u0004/9X\u0011i>q\u0017.KW9r4g&laK\u000fm+N}p%YN(kV|Fs%i\u001bJ9bH@=-mQA#\u0007?\u0013\t?i\u0001\n*\f<j:3Z\u0010Ya\u001ftA0>", "\u0011n\\=T5B]\"", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Factory {
        public static final Companion Companion = Companion.$$INSTANCE;

        @JvmStatic
        static Factory from(ViewModelInitializer<?>... viewModelInitializerArr) {
            return Companion.from(viewModelInitializerArr);
        }

        default <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return (T) androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE.unsupportedCreateViewModel$lifecycle_viewmodel_release();
        }

        default <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) create(modelClass);
        }

        default <T extends ViewModel> T create(KClass<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) create(JvmClassMappingKt.getJavaClass((KClass) modelClass), extras);
        }

        /* JADX INFO: compiled from: ViewModelProvider.android.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":!\u007f\u0007|jA0JeN\u0093Siճ?k*3d`*qٴ?U(}j0]O\u007fg\u001dL\u000b#Q\u0012\u001e\"\tr2He|m\u0012\u00153ptm7msM9fud\nf7ŕ<y\u0013\u0007ʆ.O"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l.?9z>+)'?C\u000fn(Wz1P\"", "", "u(E", "4q^:", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l.?9z>+)>", "7mXA\\(EW.~\bl", "", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n&]}2\u001fw\u0015.T'DoC\"\u0011oeN\u0007p\u0002", "uZ;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J(\u001bG\u0002\u0016Fu%<#n$7\u007f}8LCBO=\"$l]@\u000bx,[Lj.HW+i\\v<'[a\u0012O+\u000b\u0019WH$85;\u001f\u001a\u0014S\u0001;ok\u0019 \u001f9ipO\u0015pCw$\u007fN=>", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            @JvmStatic
            public final Factory from(ViewModelInitializer<?>... initializers) {
                Intrinsics.checkNotNullParameter(initializers, "initializers");
                return androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE.createInitializerFactory$lifecycle_viewmodel_release((ViewModelInitializer<?>[]) Arrays.copyOf(initializers, initializers.length));
            }
        }
    }

    /* JADX INFO: compiled from: ViewModelProvider.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLcz\u0005I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP\u008cZS@\u000fs{:%a8\bّYaJ}P\b\bMs(qН^\u000bQ\u000fN9\u0007kDI\u001cz}\u0018\u0015˰Pqg3{rmCnxN\u000b0428@\u0007/\u001fp\\ǘzzQQT=>A\t:\u0019\u000fm\u000b Ň\u0014@H\u0001L_\u0018XDL\u0005cJ13\u00030D|,\u00104\u000bT%F\u0003/S\u000bҐ\"+N@}@3T\u001b\u0007\u0019]_\tEмK\u0007\u0011'U.y}e:p\u0006$\u0017;OS_!0\r\t_g$'YW*_ח\u0012(\u0006\u0006Ա\u0011I"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l6CMO=,$dj7\u0007D(L\u00061T`$", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l.?9z>+)>", "u(E", "1qT.g,", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", ";nS2_\nEO'\r", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkb<\n\u0016$Qs\rO@,9Z}\u001eKk\u001d.\u00174?kF\u0006\u001fga@\\", "3wc?T:", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,j", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000fwI\u007f$!Kn!\u0006})6Y{45t\u0016w^G;}<(\u0014hh\u0003dp,J\u0006+QU.?k_nKiUA\nW*\u001a\u000f]@78K; \b*]\u007fBhJ|\u001a\u000eGRzAV\u0017\u001d", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l.k\u0017;\u0004/9X\u0011i>q\u0017.KW9r4g&laK\u000fm+N}p%YN(kV|Fs%i\u001bJ9bH@=-mQA#\u0007?\u0013\t?i\u0001\n*\f<j:3Z\u0010Ya\u001ftA0>", "\u0011n\\=T5B]\"", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class NewInstanceFactory implements Factory {
        public static final Companion Companion = new Companion(null);
        public static final CreationExtras.Key<String> VIEW_MODEL_KEY = ViewModelProviders.ViewModelKey.INSTANCE;
        private static NewInstanceFactory _instance = null;

        public static final NewInstanceFactory getInstance() {
            return Companion.getInstance();
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return (T) JvmViewModelProviders.INSTANCE.createViewModel(modelClass);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) create(modelClass);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(KClass<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) create(JvmClassMappingKt.getJavaClass((KClass) modelClass), extras);
        }

        /* JADX INFO: compiled from: ViewModelProvider.android.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r.4ߚ\u007f\u0007|jA0JhN\u0093Siճ?k*3d`*qٴ?U(}r\u001d]O\u007fm~Lj\u000bq\u00124\u0018/n\u0003շWޯa\u0012\u0017˰\u0013}M7eqS8\u000fy\rӏ,ݨ&8\u0002ڎQ28N(v)H\u0002Qh؛B¤>\\\u001dO\u000b! \u0006V\"\u0007&jpߗ:R"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l6CMO=,$dj7\u0007D(L\u00061T`\r\nfZ}9\u001d\u0016d\u0017$", "", "u(E", "$H4$R\u0014(2xetD\fp", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,SNaM\\", "", "-h]@g(GQ\u0019", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l6CMO=,$dj7\u0007D(L\u00061T`$", "7mbAT5<S", "5dc\u0016a:MO\"|z\u001d(\u0006\u00129t{7\u007fJ\n%", "5dc\u0016a:MO\"|z", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J\b\u001bG\u0002uFu%<D\u000b*Hq\u0015.Z\u0002$kF\u0002\u001evp5\u0010a,/r%VV[@2", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public static /* synthetic */ void getInstance$annotations() {
            }

            private Companion() {
            }

            public final NewInstanceFactory getInstance() {
                if (NewInstanceFactory._instance == null) {
                    NewInstanceFactory._instance = new NewInstanceFactory();
                }
                NewInstanceFactory newInstanceFactory = NewInstanceFactory._instance;
                Intrinsics.checkNotNull(newInstanceFactory);
                return newInstanceFactory;
            }
        }
    }

    /* JADX INFO: compiled from: ViewModelProvider.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006\rnj?1Le^.Zݷ2\u000f\u0002{<$a&yCQU\"}(\nUb}˧\r\\\u000b\u000bq\u000e>\u0015\u000b+1Oiޯa\u0012\u001d2\u0003|EG]sK:xtd\u0007ڶ6\"F|E\u0018 *X\u0016\u0005{[M\"\u0011^B\u0001>`\u0011e\u0005H\u0017ĂB \u000f$%\u000b\\=`l$BO)\t݃PVO_^\u0006}\u0017T^?\u0013\u0007c.+\u0007?c kgΫ\u000bRiKKj\u007fD\u001dhm/KOyɎD`(\u0014C4\u007f\u0017k|>b\u0015Sp\fm3}n{T\u001c5\u0010z*\u000f\u0003\u0004؝\n'V<uEt\u000f&3;zsFV\u061clJ(z\u0010?G/\u000e=C?+haa\u0002!|B,\t\u001b-;\u0001\u001d1\"h\u05f8d\u0015)eH_?RX?^M8[\u0014Ъ\u0006Ͳf\u00022ʶΫK\u0013"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l)L:x>\"\u0014Ye9\u0019K6Mv.(HL;f_\u0007\u0013", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l6CMO=,$dj7\u0007D(L\u00061T`$", "u(E", "/o_9\\*:b\u001d\t\u0004", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "uKP;W9HW\u0018Hvi7Fd:p\u0007,y<\u0010\u001b!PEQ-", "Cmd@X+", "", "uKP;W9HW\u0018Hvi7Fd:p\u0007,y<\u0010\u001b!PEq\u007fg", "1qT.g,", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", ";nS2_\nEO'\r", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkb<\n\u0016$Qs\rO@,9Z}\u001eKk\u001d.\u00174?kF\u0006\u001fga@\\", "/o_", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000fwI\u007f$!KnW8\u00020~5\t+>q\u0014*\\GEt\na{dj8\u0014m0M\npNPO,ZfpD\u0014[K\u0012N=t\u000fXA+D", "3wc?T:", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,j", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000fwI\u007f$!Kn!\u0006})6Y{45t\u0016w^G;}<(\u0014hh\u0003dp,J\u0006+QU.?k_nKiUA\nW*\u001a\u000f]@78K; \b*]\u007fBhJ|\u001a\u000eGRzAV\u0017\u001d", "\u0011n\\=T5B]\"", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class AndroidViewModelFactory extends NewInstanceFactory {
        private static AndroidViewModelFactory _instance = null;
        private final Application application;
        public static final Companion Companion = new Companion(null);
        public static final CreationExtras.Key<Application> APPLICATION_KEY = new CreationExtras.Key<Application>() { // from class: androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion$APPLICATION_KEY$1
        };

        @JvmStatic
        public static final AndroidViewModelFactory getInstance(Application application) {
            return Companion.getInstance(application);
        }

        private AndroidViewModelFactory(Application application, int i2) {
            this.application = application;
        }

        public AndroidViewModelFactory() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AndroidViewModelFactory(Application application) {
            this(application, 0);
            Intrinsics.checkNotNullParameter(application, "application");
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.application != null) {
                return (T) create(modelClass);
            }
            Application application = (Application) extras.get(APPLICATION_KEY);
            if (application != null) {
                return (T) create(modelClass, application);
            }
            if (AndroidViewModel.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.create(modelClass);
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.application;
            if (application == null) {
                throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
            }
            return (T) create(modelClass, application);
        }

        private final <T extends ViewModel> T create(Class<T> cls, Application application) {
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                try {
                    T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                    Intrinsics.checkNotNullExpressionValue(tNewInstance, "{\n                try {\n…          }\n            }");
                    return tNewInstance;
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e2);
                } catch (InstantiationException e3) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e3);
                } catch (NoSuchMethodException e4) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e4);
                } catch (InvocationTargetException e5) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e5);
                }
            }
            return (T) super.create(cls);
        }

        /* JADX INFO: compiled from: ViewModelProvider.android.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jA0JfN\u0093Siճ?k*3d`*qٴ?U(}j\u0017]T\u007fg\u001dO\u000b\u000fQ\u0016\u001e\u0016'mrN&\rk\u0013'8RqO3{rk;\u0017x\rӔ\"ݨ&8\u0002ڎQ(8L(x\u0011By\u0011hؖL¤>R\u0015˟ő\u001e\u001a"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l)L:x>\"\u0014Ye9\u0019K6Mv.(HL;f_\u0007{q\u001cb\u0019J4\u0011\u000fb\u0017", "", "u(E", "\u000fO?\u0019<\n\u001aB|hcX\u0012\\|", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,SNaM\\", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "-h]@g(GQ\u0019", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l)L:x>\"\u0014Ye9\u0019K6Mv.(HL;f_\u0007\u0013", "5dc\u0016a:MO\"|z", "/o_9\\*:b\u001d\t\u0004", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final AndroidViewModelFactory getInstance(Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                if (AndroidViewModelFactory._instance == null) {
                    AndroidViewModelFactory._instance = new AndroidViewModelFactory(application);
                }
                AndroidViewModelFactory androidViewModelFactory = AndroidViewModelFactory._instance;
                Intrinsics.checkNotNull(androidViewModelFactory);
                return androidViewModelFactory;
            }
        }
    }
}
