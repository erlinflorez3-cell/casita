package org.koin.androidx.compose;

import androidx.compose.runtime.Composer;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<;!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tvAӄLe^.Zݷ2\u000f\u0002{<řc$\bCCU0}*\teNogtKrtQƤ\u001e\u0016?iLQ[ތk\u0011%1jom3}wC9nuN\u000761P:*\u000b\u0007\u001a8K(v)G{\u0014\u00180NuRT#L3 B\fD \u000f%tg|>xrc:=,\u001bipXWs6\u0005[\u0018^b7\u000f\u0007aL8V6c!\u000eU\u0019\u00061i\u0006ũEҵ<ݛص+'9X\fADh\u0018\u0014[*o\u0015cö4[\u001bP\t\fU+\u007fkQP\u001c)\u0010|\u0012\fj\u0006>\f-H<02f6\u0012c|xSNU\u001a`X~)gf\u001d+\u007fA2Q\u001b\u0015Y\u0012A\u001fNE\u0005\u001d\rL-1\u0003'cb\u0019x#+V\bQ_^V<vZr[Slb~)̫0̯/ϚĬ3{\u001f=ϒ%<c<)݃\u001c0Gלk\b"}, d2 = {"5dc#\\,P;#}ze", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "DhTD@6=S l\nh9|rAn\u007f5", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0013Dc\u000b !\u007f\u001f.Z\u0019", "9dh", "", "3wc?T:", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,j", "Ab^=X", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", ">`a.`,MS&\r", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EL\u0016/QL?z8(\u001e>", "uK^?ZuD]\u001d\bD\\6\n\txq\u0010$\u0003D\u0002\u001b\u0017T9yLr,9Z\u0002 DC|*VBHu8\u001d(2h=\bc*bt.G\u0016?0\\dZG\u0013\u0012a{]5\u001a\u0005CS-nQ\r\u0006\r(Z}\u0005o|\u0015\u0018W#y}F_\u0012\u001d`\u0011~@6rJXrCNEFb(x\nf\u001d&K>$&y#\u001ahWwg\tS\r\u0002V\u0004pGZ(\b42\u0014TeSG9[Fx0hI\u0006\u0005\u0012{fr5\u007f-M\"(@o\u0005!N\u001eHm\u007f\u00195&F8.\u007f=#HIryvG\u001c2\u007fq\u0011\fq9;\"0;JD\u0018\u0006j!_4t)~AZ\u0011HWo^4V\bQ_\u0002\u0015Rd.upSQ\u001baV}T\b\t[\u001a\u0002\u0010p\u001c\u001bA_D]\u0010h(s5T\u0013RY<\f\u000eAM\u0014pOe", "9nX;I0>e\u0001\ty^3", "9nX; (GR&\t~]?D\u00079m\u000b2\n@z$\u0017No\nJv"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ViewModelKt {
    @Deprecated(message = "8Y\u0001t|\u0004\u001eeNP-\u0012=$0Sh\u0014Qf\u000ev\u001ff{Gr", replaceWith = @ReplaceWith(expression = "koinViewModel", imports = {}))
    @InterfaceC1492Gx
    public static final /* synthetic */ <T extends ViewModel> T getViewModel(Qualifier qualifier, ViewModelStoreOwner viewModelStoreOwner, String str, CreationExtras creationExtras, Scope scope, Function0<? extends ParametersHolder> function0, Composer composer, int i2, int i3) {
        CreationExtras creationExtrasDefaultExtras = creationExtras;
        Scope scopeRememberCurrentKoinScope = scope;
        String str2 = str;
        Qualifier qualifier2 = qualifier;
        composer.startReplaceableGroup(667488325);
        if ((i3 + 1) - (1 | i3) != 0) {
            qualifier2 = null;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((4 & i3) != 0) {
            str2 = null;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            creationExtrasDefaultExtras = ViewModelInternalsKt.defaultExtras(viewModelStoreOwner, composer, 8);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            scopeRememberCurrentKoinScope = KoinApplicationKt.rememberCurrentKoinScope(composer, 0);
        }
        Function0<? extends ParametersHolder> function02 = (i3 & 32) == 0 ? function0 : null;
        composer.startReplaceableGroup(-1614864554);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        T t2 = (T) GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStoreOwner.getViewModelStore(), str2, creationExtrasDefaultExtras, qualifier2, scopeRememberCurrentKoinScope, function02);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return t2;
    }

    public static final /* synthetic */ <T extends ViewModel> T koinViewModel(Qualifier qualifier, ViewModelStoreOwner viewModelStoreOwner, String str, CreationExtras creationExtras, Scope scope, Function0<? extends ParametersHolder> function0, Composer composer, int i2, int i3) {
        Scope scopeCurrentKoinScope = scope;
        CreationExtras creationExtrasDefaultExtras = creationExtras;
        String str2 = str;
        Qualifier qualifier2 = qualifier;
        composer.startReplaceableGroup(-1614864554);
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            qualifier2 = null;
        }
        if ((2 & i3) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((4 & i3) != 0) {
            str2 = null;
        }
        if ((8 & i3) != 0) {
            creationExtrasDefaultExtras = ViewModelInternalsKt.defaultExtras(viewModelStoreOwner, composer, 8);
        }
        if ((i3 + 16) - (16 | i3) != 0) {
            scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(composer, 0);
        }
        Function0<? extends ParametersHolder> function02 = (-1) - (((-1) - i3) | ((-1) - 32)) == 0 ? function0 : null;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        T t2 = (T) GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStoreOwner.getViewModelStore(), str2, creationExtrasDefaultExtras, qualifier2, scopeCurrentKoinScope, function02);
        composer.endReplaceableGroup();
        return t2;
    }
}
