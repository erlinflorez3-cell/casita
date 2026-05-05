package org.koin.androidx.compose;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.androidx.viewmodel.ext.android.BundleExtKt;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\f6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2şs{J$c$\bCCU0}*ޛWN}gvJp\u000bK\u000f\f\u0016\u0001jBI]xc\u0012'EPģW3{nm=ntN\u0005N3h=ѩ\t\u0001(,`w\u0005}[KR\u0016PHví`\u0011c\u0004B\u00124CP\t$\\uTNJ\u0003\\h6S\toB\\/w0+N=LZ'\u001b\u007fy\u001eYJgE\u001b+a\u000e\u001f\\kA\u0013? J3t\u0010'\nW$k<`\u000e#-9_\u000fmrTl\u001bP\u000f\u0018\u0010-eb*aTߒ}¶zȞʀ\b\u000e\u00149`\b;-~\u000e\u001e5\u0005r\u001aD~\u0016~J\u0006Эo:-$(3Y>KnWaI\u001ff9\u0012\u0004;%S\u0007t!i\\&`C\u001c\u0005}W1_IUH|\u0014\nQs\f~q\u001a8\u00142W\u007f]\f'-E1 ]O\"\u007f|HҎJђuݓ¾lSwg̵@'v\u0019=ҁ9:Y֎h\u001b"}, d2 = {"2dU.h3M3,\u000e\bZ:", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,j", "DhTD@6=S l\nh9|rAn\u007f5", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0013Dc\u000b !\u007f\u001f.Z\u0019", "uKP;W9HW\u0018\u0012De0}\t-y}/{\nq\u001b\u0017YW\u0018;v,#h\b-7W(7MP\u0011R0'\u0014uk=\u0006vuL\u0001/RV\\,&_\u0003F#\u0016b\u000e\u0018\t\u0017\rdK2nQ\r\u0003K\u0013E\u000b:u\u000b\u0010\u0015!~qtCV\u000e[w\u001cu\u000b:lFkg\u0004FAL,\bq\f[,`DC\u0004'\u0001&\u0017v&", "5dc g(MS\n\u0003zp\u0014\u0007\b/l", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "=v]2e", "Ab^=X", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "AsPAX", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "\u001ana4\"2HW\"Hvg+\n\u00133d\u0013q\rD\u0001)\u001fQn\u000eC@33c\t \u0001J&7LJ;J4\u001f\u0019qeH\u000bm5$", ">`a.`,MS&\r", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EL\u0016/QL?z8(\u001e>", "uK^?ZuD]\u001d\bD\\6\n\txq\u0010$\u0003D\u0002\u001b\u0017T9yLr,9Z\u0002 DC|*VBHu8\u001d(2h=\bc*bt.G\u0016?0\\dZG\u0013\u0012a{]5\u001a\u0005CS-nQ\r\u0006\u00129KKAr\u0005\u0015_\f?wp\fd\u000eQ\u0005\u0015?/'rQY5`MKTi.mUd.d\u0004;4\u001do(\u001frY<S\\c\u001apa}qp\u0012na>.Mt_O\u000ftfD>(/Ty\u0007\u0016<a\u0003tU=\r29:n\u000e\u0016=~:gw\"6`@:o4F\u001bJUqu6K\u001eq.e\u0010\u000e,\u0013;!poqH\u001c\\Az\u001f\u001c]h\u007fD\\\n=\\9\u001c+G~@ow\u001c\tP\u0015qe[+%S\u0001!F", "DhTD@6=S ", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\f1n\u0012u", "uK^?ZuD]\u001d\bD\\6\n\txq\u0010$\u0003D\u0002\u001b\u0017T9yLr,9Z\u0002 DC|*VBHu8\u001d(2h=\bc*bt.G\u0016?0\\dZG\u0013\u0012a{]5\u001a\u0005CS-nQ\r\u0006\u00129KKAr\u0005\u0015_\f?wp\fd\u000eQ\u0005\u0015?/'rQY5`MKTi.mUd.d\u0004;4\u001do(\u001frY<S\\c\u001apa}qp\u0012na4-=zeJD\u0003\u001f:~/*U\nw[?h}:x5\u0004}\b@l\u0010Uu\u0018K4\\xoC=0%CF\u0017>^-|p?\u000ef3_\u000f\u000e,&5\u0019wMmG\u000f\u000eD\u0013pI7", "9nX; (GR&\t~]?D\u00079m\u000b2\n@z$\u0017No\nJv"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ViewModelInternalsKt {
    public static final CreationExtras defaultExtras(ViewModelStoreOwner viewModelStoreOwner, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        composer.startReplaceableGroup(19932612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(19932612, i2, -1, "org.koin.androidx.compose.defaultExtras (ViewModelInternals.kt:41)");
        }
        CreationExtras.Empty defaultViewModelCreationExtras = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultViewModelCreationExtras;
    }

    @Deprecated(message = "\u0018Y\u0001t|\u0004\u001eeNP-\u0012=$0Sh\u0014Qf\u000ev\u001ff{Gr6\u000e\f-zp\fGTR]|BU,\u0018R&hM\ra98$")
    @InterfaceC1492Gx
    public static final /* synthetic */ <T extends ViewModel> T getStateViewModel(Qualifier qualifier, ViewModelStoreOwner viewModelStoreOwner, Scope scope, Function0<Bundle> state, Function0<? extends ParametersHolder> function0, Composer composer, int i2, int i3) {
        Scope rootScope = scope;
        Qualifier qualifier2 = qualifier;
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(-524436839);
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            qualifier2 = null;
        }
        if ((i3 + 2) - (2 | i3) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            rootScope = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope();
        }
        Function0<? extends ParametersHolder> function02 = (i3 & 16) == 0 ? function0 : null;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        ViewModelStore viewModelStore = viewModelStoreOwner.getViewModelStore();
        CreationExtras.Empty extras = BundleExtKt.toExtras(state.invoke(), viewModelStoreOwner);
        if (extras == null) {
            extras = CreationExtras.Empty.INSTANCE;
        }
        T t2 = (T) GetViewModelKt.resolveViewModel$default(orCreateKotlinClass, viewModelStore, null, extras, qualifier2, rootScope, function02, 4, null);
        composer.endReplaceableGroup();
        return t2;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0019O\u0001L^\u0004\u0019\\d3)\u0015iT\r>E\f\u0012:Dv\u001bf6Y\u0004z^\u00046zmP$Df\u001cR>Z.4=\u001d\u0016/\t/hWNj}\u0005_\\\u0012a\u0004\u000b\u00039\u0003\u0006\u0011/L/P=\u0007l+\u0016qQ\u0015VgP2-=\u001b8")
    @InterfaceC1492Gx
    public static final /* synthetic */ <T extends ViewModel> ViewModelLazy<T> viewModel(Qualifier qualifier, ViewModelStoreOwner viewModelStoreOwner, Scope scope, Function0<? extends ParametersHolder> function0, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1205041158);
        if ((2 & i3) != 0 && LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((i3 & 4) != 0) {
            GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope();
        }
        throw new IllegalStateException("ViewModelLazy API is not supported by Jetpack Compose 1.1+".toString());
    }
}
