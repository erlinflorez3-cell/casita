package org.koin.androidx.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dynatrace.android.agent.Global;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.androidx.viewmodel.factory.KoinViewModelFactory;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d̉=!,u\bӵLc\u000b\u0004I\u00066\f6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$q$yّCU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]xc\u0012'^PģW5cnk8\u0011|<\u0005.2::\u0010\u0004/\u001bZP\u0016v\tEc\u000e(/nojZ\u0013M\u0013\u001d*\bT\u001f/\u001d#ff)Vpu@?%\u0013i\tTUdP\u0003SεTZO\r%hN5N?M\u001b5U\u0013\u0007\u0019am\fo{K\u000f\u0001-7-Ys\u0006B\u0007\u000bD\u001d1O\u001b_\u000b(r\u0004\u007f_<19\\{Q`\u00108w)\n;G4\u0016\f'V.E\u001c|\u0007<4%vaOh\u0002\rR0\tg6%6\u0018;;;+f\u007fsQ\u0018|BB\n%\n1\u0014\u0007!\"Z.f\u001bÑb}y1\u007fGmR\\\u0012qC}\u0006\u0001bH029w\u0004=\u0006).E1gc?#/m\u001aJZf%\u0004\u0011lavjHn0\u001f\u001e=*\u0017\frFz\u0004\u001aQ\u0005\\: e\u001c\u0003\u0017.\u001c\u0019 j\tT/5\u0012^O\u0017{\u0001L\f\u0015\u000e1|68\u00032\u0013Ć=^AJɊg&"}, d2 = {"5dc#\\,P;#}ze\u0012|\u001d", "", "?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "9dh", "1kP@f\u0015:[\u0019", ":`iFE,L] \u0010zO0|\u001b\u0017o~(\u0003", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "Dl29T:L", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "DhTD@6=S l\nh9|", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0013Dc\u000b \r", "3wc?T:", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(EQ\u0005\u0017)Oy\r<}n\u0013f}\u001cFq 7-VJx0,j", "Ab^=X", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", ">`a.`,MS&\r", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "@db<_=>D\u001d~\rF6{\t6", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EL\u0016/QL?z8(\u001e>", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l.k\u0017;\u0004/9X\u0011i>q\u0017.KW9r4g\u0006laKnm+N}\u0015VV[,29w9%\u000e$\u0015J4\u000fNGP1rM9tn(R\u0001Hr\u0005\u000b)W<nqBT$E\u0001\u0015?R-hXaixGH\u000f@7d\bn!fC\u001a7#~\u0015)>78\u0017}\u001d\u0017|V\u00031eQ&z\u00020NibJFsUI>\u0013/G\u0003{\u00136X\u0002\u0001[7\u00116s<n\tT1\u0016Hkx^:ZK2&\u007f*\u0011IVcKSD\u0018w&e\u0011WgF9bfulF\u001e\u000bg i~Bo\n5a\nHR:jj-zKZ\u0007\u001f\r\u000677lMD\u001bR\u0015\u0018wDkP\u0015\u0003\u0015N\"\u001b.\u001d\u0013", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class GetViewModelKt {
    public static final String getViewModelKey(Qualifier qualifier, String str, String str2) {
        String str3;
        if (str != null) {
            return str;
        }
        if (qualifier == null) {
            return null;
        }
        StringBuilder sbAppend = new StringBuilder().append(qualifier.getValue());
        if (str2 == null || (str3 = Global.UNDERSCORE + str2) == null) {
            str3 = "";
        }
        return sbAppend.append(str3).toString();
    }

    public static /* synthetic */ String getViewModelKey$default(Qualifier qualifier, String str, String str2, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            qualifier = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            str2 = null;
        }
        return getViewModelKey(qualifier, str, str2);
    }

    public static final <T extends ViewModel> Lazy<T> lazyResolveViewModel(final KClass<T> vmClass, final Function0<? extends ViewModelStore> viewModelStore, final String str, final Function0<? extends CreationExtras> extras, final Qualifier qualifier, final Scope scope, final Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(vmClass, "vmClass");
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<T>() { // from class: org.koin.androidx.viewmodel.GetViewModelKt.lazyResolveViewModel.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModel invoke() {
                return GetViewModelKt.resolveViewModel(vmClass, viewModelStore.invoke(), str, extras.invoke(), qualifier, scope, function0);
            }
        });
    }

    public static /* synthetic */ Lazy lazyResolveViewModel$default(KClass kClass, Function0 function0, String str, Function0 function02, Qualifier qualifier, Scope scope, Function0 function03, int i2, Object obj) {
        Qualifier qualifier2 = qualifier;
        String str2 = str;
        if ((4 & i2) != 0) {
            str2 = null;
        }
        if ((16 & i2) != 0) {
            qualifier2 = null;
        }
        return lazyResolveViewModel(kClass, function0, str2, function02, qualifier2, scope, (-1) - (((-1) - i2) | ((-1) - 64)) == 0 ? function03 : null);
    }

    public static final <T extends ViewModel> T resolveViewModel(KClass<T> vmClass, ViewModelStore viewModelStore, String str, CreationExtras extras, Qualifier qualifier, Scope scope, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(vmClass, "vmClass");
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Class<T> javaClass = JvmClassMappingKt.getJavaClass((KClass) vmClass);
        ViewModelProvider viewModelProvider = new ViewModelProvider(viewModelStore, new KoinViewModelFactory(vmClass, scope, qualifier, function0), extras);
        String viewModelKey = getViewModelKey(qualifier, str, javaClass.getCanonicalName());
        return viewModelKey != null ? (T) viewModelProvider.get(viewModelKey, javaClass) : (T) viewModelProvider.get(javaClass);
    }

    public static /* synthetic */ ViewModel resolveViewModel$default(KClass kClass, ViewModelStore viewModelStore, String str, CreationExtras creationExtras, Qualifier qualifier, Scope scope, Function0 function0, int i2, Object obj) {
        Qualifier qualifier2 = qualifier;
        String str2 = str;
        if ((4 & i2) != 0) {
            str2 = null;
        }
        if ((i2 + 16) - (16 | i2) != 0) {
            qualifier2 = null;
        }
        return resolveViewModel(kClass, viewModelStore, str2, creationExtras, qualifier2, scope, (i2 & 64) == 0 ? function0 : null);
    }
}
