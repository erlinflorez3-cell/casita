package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
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
/* JADX INFO: compiled from: ViewModel.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<;!&i\u0016DLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jA0JeP.hS2\u000fq{<$q$yCAU280ޛgN.f\u000fR`ŏQ\u000e\u001c\u0015!jZI\u0006~c\u0012\u001d3Zom5}wC9nwN\u000761P<*\r\u0007\u001a8M(x\u0011By\u0012X؛F¤>R\u001bT\u001d_ ßV G\u001d|mTȤVk\u0006:]#3sPV?e@~]\r\rSU\u0016'g$+N8M\u0015SU3\u000fX[M\u0006WsS\u0004\u0017+W3Ose;p\u0002*\u0014YUSbę*\\\u0013[x[5˃gc\u0012O..}\u07be\n\fd\u0004<\u0006WR<52l\u0018\u0010Ct9RnY2dH\u007f\tbN\u0017S\u0002c3?\u001btTy=/Me\u007f5\u0015$#\u000fs9]j\r\u000f\u001bKZ}Q?\\X=vZP^ǀq\u0004~o͌.\u0012"}, d2 = {"DhTD@6=S ", "$L", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "DhTD@6=S l\nh9|rAn\u007f5", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0013Dc\u000b !\u007f\u001f.Z\u0019", "9dh", "", "4`RAb9R", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0010Bc\u000f$6m#l.?9z>+)>", "uKP;W9HW\u0018\u0012De0}\t-y}/{\nq\u001b\u0017YW\u0018;v,#h\b-7W(7MP\u0011R9\u001a&d+@\u0003l.\u0018d6TPW.29nF\u0013\u001fd\u0012M>V\f]B$lX5&\bu:\u0006;zh\u0016\u0015\u000e<U}Lg\u0014Fy\"4\"%fUcl\u000e\u001d(Ak)q\u0016c\u001co\u00048.\u001c|#)h\u001a;\u001a\u0005b\u0015zRCEqO$\u0005F$KC?*\tVQEs4)Oz\u000b[9\\u+rA\u0002;*\u007fU\tKy\u007fH]x\u001c\u0002", ";nS2_\nEO'\r", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000fwI\u007f$!Kn!\u0006})6Y{45t\u0016w>G;}\u001c(\u0014hh'\u0016m9N`9PL[\u0002CWnN\u0010[a\nW-VrhN(wF\r\u0006\u00045H\u000fEl\u007f\u001f_\u00159kp@j\u000eNy^fE)z.c^yN,Rl;h\u000b_*\u001b\u001b6\"#{&/>7*\u0013z`\u001bvQ\r1eQ!\u0006B2>7hVN~YDtp|U\u0004\u0003\u001c@X\u0002\u0001X\u0011G\u001b&?c\u0012Uk\u0017Q(\u007f\u0019-\\?;$=<\\0Oc\bTH\rh&7", "3wc?T:", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,j", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000fwI\u007f$!Kn!\u0006})6Y{45t\u0016w>G;}\u001c(\u0014hh'\u0016m9N`9PL[\u0002CWnN\u0010[a\nW-VrhN(wF\r\u0006\u00045H\u000fEl\u007f\u001f_\u00159kp@j\u000eNy^fE)z.c^yN,Rl;h\u000b_*\u001b\u001b6\"#{&/>7*\u0013z`\u001bvQ\r1nK\u001az68<t[\u0010VsUN|1\u001eK\u0003Ao?Xp:x7\r\u0014=Eq\u0001Y=~:gw\"6`@:o4F\u001bJUqu6K\u001eq.e\u0010\u000e,\u0013;!poqH\u001c\\Az\u001f\u001c]h\u007fD\\\n=\\9\u001c+G~@ow\u001c\tP\u0015qe[+%S\u0001!F", ":hU2V@<Z\u0019F\fb,\u000f\u00119d\u007f/C>\u000b\u001f\"Q}\u000e6\u0004%<Yy.7"}, k = 5, mv = {1, 8, 0}, pn = "", xi = 48, xs = "4@5B>71Dy62.,)>'/'o6(#4)*\u001e\u001e$e\u0019$!#!$\u0015]\u0004\u0016\u0011\"v\u0018\f\f\u0012o\u0018")
final /* synthetic */ class ViewModelKt__ViewModel_androidKt {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016[\f:\u0004\b\u001a[]Kg|iTBWacu6\tm\u0018\u0012\u000bNo~\u000e\t%qm_$%_aiMO-A\u001f*j^z5")
    @InterfaceC1492Gx
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, Composer composer, int i2, int i3) {
        String str2 = str;
        ViewModelStoreOwner current = viewModelStoreOwner;
        composer.startReplaceableGroup(298765658);
        ComposerKt.sourceInformation(composer, "CC(viewModel)P(2,1)*49@2177L7,54@2350L55:ViewModel.android.kt#3tja67");
        if ((1 & i3) != 0 && (current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            str2 = null;
        }
        ViewModelProvider.Factory factory2 = (i3 + 4) - (i3 | 4) == 0 ? factory : null;
        Intrinsics.reifiedOperationMarker(4, "VM");
        VM vm = (VM) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(ViewModel.class), current, str2, factory2, (CreationExtras) null, composer, (-1) - (((-1) - (i2 << 3)) | ((-1) - 8176)), 16);
        composer.endReplaceableGroup();
        return vm;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016[\f:\u0004\b\u001a[]Kg|iTBWacu6\tm\u0018\u0012\u000bNo~\u000e\t%qm_$%_aiMO-A\u001f*j^z5")
    @InterfaceC1492Gx
    public static final /* synthetic */ ViewModel viewModel(Class modelClass, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, Composer composer, int i2, int i3) {
        String str2 = str;
        ViewModelStoreOwner current = viewModelStoreOwner;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        composer.startReplaceableGroup(-1252471378);
        ComposerKt.sourceInformation(composer, "C(viewModel)P(2,3,1)*80@3552L7:ViewModel.android.kt#3tja67");
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0 && (current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            str2 = null;
        }
        ViewModelProvider.Factory factory2 = (i3 & 8) == 0 ? factory : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1252471378, i2, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.android.kt:85)");
        }
        ViewModel viewModel = ViewModelKt__ViewModelKt.get$default(current, JvmClassMappingKt.getKotlinClass(modelClass), str2, factory2, null, 8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return viewModel;
    }

    public static final <VM extends ViewModel> VM viewModel(Class<VM> modelClass, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        composer.startReplaceableGroup(-1566358618);
        ComposerKt.sourceInformation(composer, "C(viewModel)P(3,4,2,1)*113@5123L7:ViewModel.android.kt#3tja67");
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            str = null;
        }
        if ((8 & i3) != 0) {
            factory = null;
        }
        if ((i3 & 16) != 0) {
            if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1566358618, i2, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.android.kt:123)");
        }
        VM vm = (VM) ViewModelKt.get(viewModelStoreOwner, JvmClassMappingKt.getKotlinClass(modelClass), str, factory, creationExtras);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return vm;
    }
}
