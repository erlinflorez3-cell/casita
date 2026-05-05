package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: compiled from: ViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<;!&i\u0016DLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{J$c$\bCCU }*\teNogtLrOQƤ\u001e\u0016?iLQ[ތk\u0011%1jom3}uC9nuN\u0005N4R@\u007f\u0005\u000f\u001dBJ&u)G{\u0014\u00180NuRT#L3 B\fD \u000f%tg|>\u000fǕcƠ3#\u0011rZ\u001b5ڿH|\u0014\ff\\-˙\u0005`4*h7c\u0015UY\t\u0007`\\W\u0003msm\rn'5.aum5\u0007\u0004D,1U\u001bg\u000b7l\u0007a`:/;QsK\u0017\rV\u0003ߡ\u007f\rB\u0010T\u0382-З-Ʀբj\b\u001c@\rBaóh\u0002%A \u0001gا%$(3Y9Kp_oS\u001f^9\f\u0005S\u001dQ\u0010\u001f'aT\u001ca-\u001b\u0003y\u00029W@KKf\fo<\u001c\b!j\b*\u00125_\u0002Ez?4G+=[G*9k0P\u000blЛ\t`vc\u0002\u001cVQ:n\\6J\u000f\u0012ɮRc-k~T\u0001,?OL^\u0015\f \u00190^\b<g$>]\u007fpoj[`\"'Eee]\u001fs\u0014WGcK7gb>g\u0003|\u001a?Ji\u001dX\u0015J\u001aێȺ`(0Dʎj\u0015\u007f~J¢<A1Ɩu/"}, d2 = {"DhTD@6=S ", "$L", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "DhTD@6=S l\nh9|rAn\u007f5", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0013Dc\u000b !\u007f\u001f.Z\u0019", "9dh", "", "4`RAb9R", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l.?9z>+)>", "3wc?T:", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,j", "uKP;W9HW\u0018\u0012De0}\t-y}/{\nq\u001b\u0017YW\u0018;v,#h\b-7W(7MP\u0011R9\u001a&d+@\u0003l.\u0018d6TPW.29nF\u0013\u001fd\u0012M>V\f]B$lX5&\bu:\u0006;zh\u0016\u0015\u000e<U}Lg\u0014Fy\"4\"%fUcl\u000e\u001d(Ak)q\u0016c\u001co\u0004A(\u0015q\u0017/fW.S\rW\u0011\u0005Z\u0004fgNbXE$:|_PNOhK\u0002#-!bs\u001b1e~/s@M24>o\u000fYgaKn\u0002$0dAp\u0004@D\u001eIYc\u0003B\"q,\u0006]\u0011\ro?5\u0018x/jL\u0010\u0007[+Y<a)q;R\u0018&Sn\u0015.\u001c", "7mXA\\(EW.~\b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012De0}\t-y}/{\nq\u001b\u0017YW\u0018;v,#h\b-7W(7MP\u0011R9\u001a&d+@\u0003l.\u0018d6TPW.29xG#\u0019^\u0017\u00180\u001e\r#B4wBF#\u00125WK\u001cx\n\n%\u0012?s<\u0018=\fPx\"\u007fE({\u0010Wi\u0002RKSbsq\u001ch,`B:mq{!&r^.\u0017Q7t69upfT#~77\bt_GEmi:{'h<\u007fw$\u001abs+{\u0003", ";nS2_\nEO'\r", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l.k\u0017;\u0004/9X\u0011i>q\u0017.KW9r4g\u0006laKnm+N}\u0015VV[,Fd{=!gA\u0013J<\tN`=-p\u000e%.\u00150R\u0004\u0011O|\u0015\u0015\u001b?noU \u0017Kz\u0015sU'oF#P}GS-l)d\u0013J*fK>#\u0014~W{dN=\u0014\tgfYN\u0003ftQ\u001dyKmEq\\FC\u0004SCtp0O{\n\u001a<Wt2>\u000b\u00114&Eh\u000fTG+Mkt#\u0002C=0%CF\u0017>^-svF\u0019r-aQ\u001br>@\u001dme-&\u0019\u000fh!i5n5d\u001b\u0016l:Rn\"1J}U%\u0001\u0019\n\u0007\"\u0002cPCdE\u0005\u001a\u0003,,^\u0011\nX", "5dc", "uKP;W9HW\u0018\u0012De0}\t-y}/{\nq\u001b\u0017YW\u0018;v,#h\b-7W(7MP\u0011R:($oeBPp,O}'E[\u0018\u0012:YnK\"gA\u0013J<\tN`=-p\u000e%.\u00150R\u0004\u0011O|\u0015\u0015\u001b?noU \u0017Kz\u0015sU'oF#P}GS-l)d\u0013J*fK>#\u0014~W{dN=\u0014\tgfYN\u0003ftQ\u001dyKmEq\\FC\u0004SCtp0O{\n\u001a<Wt2>\u000b\u00114&Eh\u000fTG+Mkt#\u0002 (#/5I\u001dCJv?sB\u000fh\u001du\u0006\u0015b~\"\u001dewKR\u000e\u0007dl", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/C>\u000b\u001f\"Q}\u000e6\u0004%<Yy.7"}, k = 5, mv = {1, 8, 0}, pn = "", xi = 48, xs = "4@5B>71Dy62.,)>'/'o6(#4)*\u001e\u001e$e\u0019$!#!$\u0015]\u0004\u0016\u0011\"v\u0018\f\f\u0012o\u0018")
final /* synthetic */ class ViewModelKt__ViewModelKt {
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i2, int i3) {
        CreationExtras.Empty defaultViewModelCreationExtras = creationExtras;
        String str2 = str;
        ViewModelStoreOwner current = viewModelStoreOwner;
        composer.startReplaceableGroup(1729797275);
        ComposerKt.sourceInformation(composer, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
        if ((1 & i3) != 0 && (current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            str2 = null;
        }
        ViewModelProvider.Factory factory2 = (i3 + 4) - (4 | i3) == 0 ? factory : null;
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        VM vm = (VM) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(ViewModel.class), current, str2, factory2, defaultViewModelCreationExtras, composer, (i2 << 3) & 65520, 0);
        composer.endReplaceableGroup();
        return vm;
    }

    public static final <VM extends ViewModel> VM viewModel(KClass<VM> modelClass, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        composer.startReplaceableGroup(1673618944);
        ComposerKt.sourceInformation(composer, "C(viewModel)P(3,4,2,1)*92@4283L7:ViewModel.kt#3tja67");
        if ((2 & i3) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            str = null;
        }
        if ((8 & i3) != 0) {
            factory = null;
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1673618944, i2, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:102)");
        }
        VM vm = (VM) ViewModelKt.get(viewModelStoreOwner, modelClass, str, factory, creationExtras);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return vm;
    }

    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, Function1<? super CreationExtras, ? extends VM> initializer, Composer composer, int i2, int i3) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        String str2 = str;
        ViewModelStoreOwner current = viewModelStoreOwner;
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        composer.startReplaceableGroup(419377738);
        ComposerKt.sourceInformation(composer, "CC(viewModel)P(2,1)*124@5789L7,129@5965L288:ViewModel.kt#3tja67");
        if ((1 & i3) != 0 && (current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            str2 = null;
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        Intrinsics.reifiedOperationMarker(4, "VM");
        initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(ViewModel.class), initializer);
        Unit unit = Unit.INSTANCE;
        ViewModelProvider.Factory factoryBuild = initializerViewModelFactoryBuilder.build();
        if (current instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
        }
        VM vm = (VM) ViewModelKt.viewModel(orCreateKotlinClass, current, str2, factoryBuild, defaultViewModelCreationExtras, composer, (-1) - (((-1) - (i2 << 3)) | ((-1) - 1008)), 0);
        composer.endReplaceableGroup();
        return vm;
    }

    public static /* synthetic */ ViewModel get$default(ViewModelStoreOwner viewModelStoreOwner, KClass kClass, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            str = null;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            factory = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
        }
        return ViewModelKt.get(viewModelStoreOwner, kClass, str, factory, creationExtras);
    }

    public static final <VM extends ViewModel> VM get(ViewModelStoreOwner viewModelStoreOwner, KClass<VM> modelClass, String str, ViewModelProvider.Factory factory, CreationExtras extras) {
        ViewModelProvider viewModelProviderCreate$default;
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "<this>");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (factory != null) {
            viewModelProviderCreate$default = ViewModelProvider.Companion.create(viewModelStoreOwner.getViewModelStore(), factory, extras);
        } else if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
            viewModelProviderCreate$default = ViewModelProvider.Companion.create(viewModelStoreOwner.getViewModelStore(), ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory(), extras);
        } else {
            viewModelProviderCreate$default = ViewModelProvider.Companion.create$default(ViewModelProvider.Companion, viewModelStoreOwner, (ViewModelProvider.Factory) null, (CreationExtras) null, 6, (Object) null);
        }
        return str != null ? (VM) viewModelProviderCreate$default.get(str, modelClass) : (VM) viewModelProviderCreate$default.get(modelClass);
    }
}
