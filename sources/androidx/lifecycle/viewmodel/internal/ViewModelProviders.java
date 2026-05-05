package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: ViewModelProviders.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007fјnjG?Le^.ZS0\u000fs{B@c$wCCU0}*ޛWN}gvϺb\u000bY\u000f\u000e\u0016~l4Ikxe\u0012\u0015;HŤ?Iݹ =g_-5%`7(8ѩ\t\u0001(*\u00119\u0005}[K:\u0016`X~?j\u0019]\r \u0011\u0016B0\u0001$]\u0016UdN\raJ/)\u0004\u0018I\u0015ϋۢ4~S\u0015T]o*\u0005d6+n;e#3X\u001b\u0011baO\u0007OqC\u0006\u0017.U5\u0010֕ɱ:X\u0006\u001c]t]\u0018urlh%Wfϯ57wcy]>2\u0006\t\u0014\u0013L\u0006\u001e\u0006mT\\<Jj\u0016\u001eKt!dph\u0010cZ\f\u000bi<\u00165\u0004C+?\u001c\u0015X\u0010A9RG{\u000b\u000eL*G͙Ĳ_V\u0014r#.\u001d\u000b_Ei@kY~\u000egR\u0006\u0004\u001fxHÏ˙4G\u0006FD$</=7\n=S%y\u0017`D\u0016\rK\u009bĈWiXa\tE|0O*7\u000ezJjʍyk|XZ\u001e}&b\u0015\u0016\u000e#\"lw\u0003<S\u001f\u0015иŹmjSyR<=\u0004OY5w.]?ӔAAyc>n\u0019Θ݀C>h#f\u0006\u0013_\u001a[t(P4\u001fНbȑ\u007fDVۼƷ6`"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n9b\r Dv\u00125\u00174?kF\u0006\u001fga@qp6_z&GY\\\u0002", "", "u(E", "$H4$R\u0014(2xetI\u0019fy\u0013D_\u0015u\u001f`wr7V|6\\\u0005)", "", "1qT.g,\"\\\u001d\u000e~Z3\u0001\u001e/r`$yO\u000b$+", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l.?9z>+)>", "7mXA\\(EW.~\bl", "", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n&]}2\u001fw\u0015.T'DoC\"\u0011oeN\u0007p\u0002", "1qT.g,\"\\\u001d\u000e~Z3\u0001\u001e/r`$yO\u000b$+\u0006v\u0012=v#IW\u0005 1~\u001a._KEj4%\u000fua@\u0007_:N", "uZ;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J(\u001bG\u0002\u0016Fu%<#n$7\u007f}8LCBO=\"$l]@\u000bx,[Lj.HW+i\\v<'[a\u0012O+\u000b\u0019WH$85;\u001f\u001a\u0014S\u0001;ok\u0019 \u001f9ipO\u0015pCw$\u007fN=>", "", "1qT.g,/W\u0019\u0011bh+|\u0010\u0010r\n0_I\u0005&\u001bCv\u0012Qv2C", "$L", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", ";nS2_\nEO'\r", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "3wc?T:", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,j", "1qT.g,/W\u0019\u0011bh+|\u0010\u0010r\n0_I\u0005&\u001bCv\u0012Qv2C\u0018\u0005$8m\u0014BKJ;eE\"\u0015ziC\u0006c3H\u0004'NLJ:\\", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l.k\u0017;\u0004/9X\u0011i>q\u0017.KW9r4g&laK\u000fm+N}p%YN(kV|Fs%i\u001bJ9bz@=-mQA#\u0007?\u0013\t?i\u0001\n*\f<j:SZ\u0010Y\u0002\u001ftA027]_\f/KDb1H\u0015c,`6A()q&p,7*\u0013z`\u001bvQ\r1nK\u001az68<t[\u00106sUN\\1\u001eK\u0003M", "5dc\u0011X-:c \u000eXk,x\u00183o\t\b\u000fO\u000e\u0013%", "=v]2e", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0013Dc\u000b !\u007f\u001f.Z\u0019", "5dc\u0011X-:c \u000eXk,x\u00183o\t\b\u000fO\u000e\u0013%\u0006v\u0012=v#IW\u0005 1~\u001a._KEj4%\u000fua@\u0007_:N", "5dc\u0011X-:c \u000e[Z*\f\u0013<y", "5dc\u0011X-:c \u000e[Z*\f\u0013<y>/\u007fA\u0001\u0015+Ev\u000e6\b)5k\u0006*6m\u001d(ZCBk0,\u0015", "5dc\u0011X-:c \u000e`^@", "\"", "5dc\u0011X-:c \u000e`^@;\u00103f\u007f&\u0010>\b\u0017\u0011Xs\u000eN~/4Y\u0005\u001aDm\u001d.IQ;", "CmbBc7H`(~y<9|\u0005>ep,{Rh!\u0016Gv", "CmbBc7H`(~y<9|\u0005>ep,{Rh!\u0016GvLCz&5W\u0012\u001e>m\u0010?QCMs>\u001d\u0015o[F\u0007j,J\u0005'", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J\b\u001bG\u0002uFu%</", "$hTD@6=S dzr", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ViewModelProviders {
    public static final ViewModelProviders INSTANCE = new ViewModelProviders();
    private static final String VIEW_MODEL_PROVIDER_DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";

    private ViewModelProviders() {
    }

    public final <T extends ViewModel> String getDefaultKey$lifecycle_viewmodel_release(KClass<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = ViewModelProviders_jvmKt.getCanonicalName(modelClass);
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName;
    }

    /* JADX INFO: compiled from: ViewModelProviders.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLc\u0003\u0010I\u00066\u000b4ɑ~8ܥB}\u0017hz9^D\u0014GnWY*Ƃo{B%Ӵ(s"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n9b\r Dv\u00125\u00174?kF\u0006\u001fga@qp6_z&GY\\jMVrO{\u001cY\u000eU\u0011\r\u0019/", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,SNaM\\", "", "u(E", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ViewModelKey implements CreationExtras.Key<String> {
        public static final ViewModelKey INSTANCE = new ViewModelKey();

        private ViewModelKey() {
        }
    }

    public final <VM extends ViewModel> VM unsupportedCreateViewModel$lifecycle_viewmodel_release() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public final ViewModelProvider.Factory createInitializerFactory$lifecycle_viewmodel_release(Collection<? extends ViewModelInitializer<?>> initializers) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) initializers.toArray(new ViewModelInitializer[0]);
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }

    public final ViewModelProvider.Factory createInitializerFactory$lifecycle_viewmodel_release(ViewModelInitializer<?>... initializers) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(initializers, initializers.length));
    }

    public final ViewModelProvider.Factory getDefaultFactory$lifecycle_viewmodel_release(ViewModelStoreOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelProviderFactory() : DefaultViewModelProviderFactory.INSTANCE;
    }

    public final CreationExtras getDefaultCreationExtras$lifecycle_viewmodel_release(ViewModelStoreOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
    }

    public final <VM extends ViewModel> VM createViewModelFromInitializers$lifecycle_viewmodel_release(KClass<VM> modelClass, CreationExtras extras, ViewModelInitializer<?>... initializers) {
        VM vm;
        ViewModelInitializer<?> viewModelInitializer;
        Function1<CreationExtras, T> initializer$lifecycle_viewmodel_release;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        int length = initializers.length;
        int i2 = 0;
        while (true) {
            vm = null;
            if (i2 >= length) {
                viewModelInitializer = null;
                break;
            }
            viewModelInitializer = initializers[i2];
            if (Intrinsics.areEqual(viewModelInitializer.getClazz$lifecycle_viewmodel_release(), modelClass)) {
                break;
            }
            i2++;
        }
        if (viewModelInitializer != null && (initializer$lifecycle_viewmodel_release = viewModelInitializer.getInitializer$lifecycle_viewmodel_release()) != 0) {
            vm = (VM) initializer$lifecycle_viewmodel_release.invoke(extras);
        }
        if (vm != null) {
            return vm;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + ViewModelProviders_jvmKt.getCanonicalName(modelClass)).toString());
    }
}
