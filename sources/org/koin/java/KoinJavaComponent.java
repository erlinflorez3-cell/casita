package org.koin.java;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLcz\u0006I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0Le^.ZS@\u000fs{:$c$\bCCU }*\teNogtJ`ƖC%إFx\u0019+\nZ~]ܫ\u00132Po\bt[pU9'vV\u0007&݅0:*\r\u000f\u001dBL v\u0001Dy\u0010B8FpHW%O\u001b\u0019@\fn4\u0007\u001ejnfDXnm:],\u0019hpV\u0010aF{,\u0017\rYܮ\u0011vo)sFEA-%\u0002\u0010MW$\u0003\u0011M\n?\u001bgm)KKyɎDZ0\u001c#.g\u0011mr,]3U\u0011\u0014-+]hcR$'&\u0001,!B\u0004\u001c\r?V>/*f6\u0017Is![)R\u0018]!\nAfي\u001b%\u000e>s{)uigK\u001b^7B\u0007;.C\u0003tďiV>h#\u001el{a1WAkL~\u0012_={\t\td\u0018)26w\u00145{\u001f5/3G]I#Ot\u0018Gro_\u0007vg2s\u0019M\tf|'O2\u0019\u0010jFz\u00042R\u0003hL\u0013Sȼb\t.\u0010!#t{L!+\u0011|S\u0019qpMk\u000f=1|6\bt\u001c\"]9l:M_s\u0012qR%\u001dU;\u0011\rAhXRjd#-Ϙ6Z"}, d2 = {"\u001ana4\"2HW\"H\u007fZ=xR\u0015o\u00041`<\u0012\u0013tQw\u0019F\u007f%>hS", "", "u(E", "5dc", "\"", "1kPGm", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", ">`a.`,MS&\r", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EL\u0016/QL?z8(\u001e>", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000f\u0006M\u0003`\u001dQs\u0017\u0006t/BYG,Gi\u001d2NG;x}\n%dh=\bg,[L\u000eMV]3`[<B%\u001a$\u000f^4\u000b\u0014]K-|\u000e\u0018/\u0011*X\u0006EqKaYt:f\u0002> \u0017C\u0003\u0017?+&mFWnO", "5dc\u0018b0G", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041Q", "5dc\u001ce\u0015NZ ", "7mY2V;", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "7mY2V;(`\u0002\u000f\u0002e", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class KoinJavaComponent {
    public static final KoinJavaComponent INSTANCE = new KoinJavaComponent();

    private KoinJavaComponent() {
    }

    @JvmStatic
    public static final <T> T get(Class<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) get$default(clazz, null, null, 6, null);
    }

    @JvmStatic
    public static final <T> T get(Class<?> clazz, Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) get$default(clazz, qualifier, null, 4, null);
    }

    @JvmStatic
    public static final <T> T get(Class<?> clazz, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) getKoin().get(JvmClassMappingKt.getKotlinClass(clazz), qualifier, function0);
    }

    public static /* synthetic */ Object get$default(Class cls, Qualifier qualifier, Function0 function0, int i2, Object obj) {
        if ((2 & i2) != 0) {
            qualifier = null;
        }
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        return get(cls, qualifier, function0);
    }

    @JvmStatic
    public static final Koin getKoin() {
        return KoinPlatformTools.INSTANCE.defaultContext().get();
    }

    @JvmStatic
    public static final <T> T getOrNull(Class<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) getOrNull$default(clazz, null, null, 6, null);
    }

    @JvmStatic
    public static final <T> T getOrNull(Class<?> clazz, Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) getOrNull$default(clazz, qualifier, null, 4, null);
    }

    @JvmStatic
    public static final <T> T getOrNull(Class<?> clazz, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) getKoin().getOrNull(JvmClassMappingKt.getKotlinClass(clazz), qualifier, function0);
    }

    public static /* synthetic */ Object getOrNull$default(Class cls, Qualifier qualifier, Function0 function0, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            qualifier = null;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            function0 = null;
        }
        return getOrNull(cls, qualifier, function0);
    }

    @JvmStatic
    public static final <T> Lazy<T> inject(Class<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return inject$default(clazz, null, null, 6, null);
    }

    @JvmStatic
    public static final <T> Lazy<T> inject(Class<?> clazz, Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return inject$default(clazz, qualifier, null, 4, null);
    }

    @JvmStatic
    public static final <T> Lazy<T> inject(final Class<?> clazz, final Qualifier qualifier, final Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<T>() { // from class: org.koin.java.KoinJavaComponent.inject.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return (T) KoinJavaComponent.get(clazz, qualifier, function0);
            }
        });
    }

    public static /* synthetic */ Lazy inject$default(Class cls, Qualifier qualifier, Function0 function0, int i2, Object obj) {
        if ((2 & i2) != 0) {
            qualifier = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            function0 = null;
        }
        return inject(cls, qualifier, function0);
    }

    @JvmStatic
    public static final <T> Lazy<T> injectOrNull(Class<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return injectOrNull$default(clazz, null, null, 6, null);
    }

    @JvmStatic
    public static final <T> Lazy<T> injectOrNull(Class<?> clazz, Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return injectOrNull$default(clazz, qualifier, null, 4, null);
    }

    @JvmStatic
    public static final <T> Lazy<T> injectOrNull(final Class<?> clazz, final Qualifier qualifier, final Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return LazyKt.lazy(new Function0<T>() { // from class: org.koin.java.KoinJavaComponent.injectOrNull.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return (T) KoinJavaComponent.getOrNull(clazz, qualifier, function0);
            }
        });
    }

    public static /* synthetic */ Lazy injectOrNull$default(Class cls, Qualifier qualifier, Function0 function0, int i2, Object obj) {
        if ((2 & i2) != 0) {
            qualifier = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            function0 = null;
        }
        return injectOrNull(cls, qualifier, function0);
    }
}
