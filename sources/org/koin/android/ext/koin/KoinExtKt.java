package org.koin.android.ext.koin;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.android.logger.AndroidLogger;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.registry.PropertyRegistryExtKt;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d̉=!4i\bDZc|\u0004G\u00068\u000b<N\u0007\"2\u0012\u007f\u0007|jAӄ\\uV\u008cjSX\u000e\u0014{b#\f(\u007fّSUH}:\u001b]O\u007fg\u001dI\u0003\u000bq\u000e6\u001c~j:Kmx\f\u0015'DPsW3{ne9\u000fsf\u000b&20=\u0012\u0005/ ݻL\u0017"}, d2 = {"/mS?b0=1#\b\n^?\f", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041WK\f\u001e\u001bEk\u001d@\u0001.\u000b", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/mS?b0=4\u001d\u0006zI9\u0007\u0014/r\u000f,{N", "9nX;C9H^\u0019\f\nr\r\u0001\u0010/", "", "/mS?b0=:#\u0001|^9", ":de2_", "\u001ana4\"2HW\"Hxh9|R6o\u0002*{MJ}\u0017Xo\u0015\u0012", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class KoinExtKt {
    public static final KoinApplication androidContext(KoinApplication koinApplication, final Context androidContext) {
        Intrinsics.checkNotNullParameter(koinApplication, "<this>");
        Intrinsics.checkNotNullParameter(androidContext, "androidContext");
        if (koinApplication.getKoin().getLogger().isAt(Level.INFO)) {
            koinApplication.getKoin().getLogger().info("[init] declare Android Context");
        }
        if (androidContext instanceof Application) {
            Koin.loadModules$default(koinApplication.getKoin(), CollectionsKt.listOf(ModuleDSLKt.module$default(false, new Function1<Module, Unit>() { // from class: org.koin.android.ext.koin.KoinExtKt.androidContext.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Module module) {
                    invoke2(module);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Module module) {
                    Intrinsics.checkNotNullParameter(module, "$this$module");
                    final Context context = androidContext;
                    Function2<Scope, ParametersHolder, Application> function2 = new Function2<Scope, ParametersHolder, Application>() { // from class: org.koin.android.ext.koin.KoinExtKt.androidContext.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Application invoke(Scope single, ParametersHolder it) {
                            Intrinsics.checkNotNullParameter(single, "$this$single");
                            Intrinsics.checkNotNullParameter(it, "it");
                            return (Application) context;
                        }
                    };
                    SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Application.class), null, function2, Kind.Singleton, CollectionsKt.emptyList()));
                    SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
                    module.indexPrimaryType(singleInstanceFactory2);
                    if (module.get_createdAtStart()) {
                        module.prepareForCreationAtStart(singleInstanceFactory);
                    }
                    DefinitionBindingKt.bind(new KoinDefinition(module, singleInstanceFactory2), Reflection.getOrCreateKotlinClass(Context.class));
                }
            }, 1, null)), false, false, 6, null);
        } else {
            Koin.loadModules$default(koinApplication.getKoin(), CollectionsKt.listOf(ModuleDSLKt.module$default(false, new Function1<Module, Unit>() { // from class: org.koin.android.ext.koin.KoinExtKt.androidContext.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Module module) {
                    invoke2(module);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Module module) {
                    Intrinsics.checkNotNullParameter(module, "$this$module");
                    final Context context = androidContext;
                    Function2<Scope, ParametersHolder, Context> function2 = new Function2<Scope, ParametersHolder, Context>() { // from class: org.koin.android.ext.koin.KoinExtKt.androidContext.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Context invoke(Scope single, ParametersHolder it) {
                            Intrinsics.checkNotNullParameter(single, "$this$single");
                            Intrinsics.checkNotNullParameter(it, "it");
                            return context;
                        }
                    };
                    SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Context.class), null, function2, Kind.Singleton, CollectionsKt.emptyList()));
                    SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
                    module.indexPrimaryType(singleInstanceFactory2);
                    if (module.get_createdAtStart()) {
                        module.prepareForCreationAtStart(singleInstanceFactory);
                    }
                    new KoinDefinition(module, singleInstanceFactory2);
                }
            }, 1, null)), false, false, 6, null);
        }
        return koinApplication;
    }

    public static final KoinApplication androidFileProperties(KoinApplication koinApplication, String str) throws Throwable {
        String[] list;
        String strUd = C1626yg.Ud("\u0011y*<\u001b\u001dzl3;x$\f`;\u0003/\u001d;&p\u001ew\u0001\u0006\u0012\u001dl", (short) (ZN.Xd() ^ 21433), (short) (ZN.Xd() ^ 2577));
        String strWd = Ig.wd("\"/Z0f\u000f5W]\\\t_\u0012\u0005\"}\u001e\u0018m\u007f\u007f\u0012|1@&\u0004I\u001e\u000b2", (short) (C1499aX.Xd() ^ (-21710)));
        short sXd = (short) (FB.Xd() ^ 22525);
        int[] iArr = new int["Z\u0013\u000ek9\fa4D\u000b/F\u0013\u000e\u000f*|nDe\u007f|\u001c T{F>\u0006\u0016_=l\u0017F\u0005xM'ecI\u001d\u007f;1:``u'Y".length()];
        QB qb = new QB("Z\u0013\u000ek9\fa4D\u000b/F\u0013\u000e\u000f*|nDe\u007f|\u001c T{F>\u0006\u0016_=l\u0017F\u0005xM'ecI\u001d\u007f;1:``u'Y");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        String str2 = new String(iArr, 0, i2);
        short sXd2 = (short) (C1607wl.Xd() ^ 11508);
        int[] iArr2 = new int["4k^^g1".length()];
        QB qb2 = new QB("4k^^g1");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Intrinsics.checkNotNullParameter(koinApplication, new String(iArr2, 0, i3));
        Intrinsics.checkNotNullParameter(str, C1593ug.zd("8=8>!DBD:HKQ\u001fCGA", (short) (ZN.Xd() ^ 17578), (short) (ZN.Xd() ^ 19424)));
        Properties properties = new Properties();
        Context context = (Context) koinApplication.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null);
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od("|\t}\u000b\u0007\u007fyBv\u0002\u007f\u0005t|\u0002:Nyw|l~y", (short) (C1580rY.Xd() ^ (-7812)))).getMethod(C1561oA.Kd("98H\u0016IJ=MM", (short) (C1607wl.Xd() ^ 8537)), new Class[0]);
            try {
                method.setAccessible(true);
                AssetManager assetManager = (AssetManager) method.invoke(context, objArr);
                if ((assetManager == null || (list = assetManager.list("")) == null) ? false : ArraysKt.contains(list, str)) {
                    try {
                        Class<?> cls = Class.forName(Wg.Zd("v\u0018v]#qUw6\u0017zY\u0013p_q\u000f\u0014wR\fwX", (short) (ZN.Xd() ^ 20987), (short) (ZN.Xd() ^ 8980)));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr2 = new Object[0];
                        short sXd3 = (short) (C1580rY.Xd() ^ (-5227));
                        int[] iArr3 = new int["\\[k9lm`pp".length()];
                        QB qb3 = new QB("\\[k9lm`pp");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 + i4));
                            i4++;
                        }
                        Method method2 = cls.getMethod(new String(iArr3, 0, i4), clsArr);
                        try {
                            method2.setAccessible(true);
                            InputStream inputStreamOpen = ((AssetManager) method2.invoke(context, objArr2)).open(str);
                            try {
                                properties.load(inputStreamOpen);
                                Unit unit = Unit.INSTANCE;
                                CloseableKt.closeFinally(inputStreamOpen, null);
                                PropertyRegistryExtKt.saveProperties(koinApplication.getKoin().getPropertyRegistry(), properties);
                                Unit unit2 = Unit.INSTANCE;
                                if (koinApplication.getKoin().getLogger().isAt(Level.INFO)) {
                                    koinApplication.getKoin().getLogger().info(strUd + unit2 + Wg.vd("4\u0006\u0005\u0003\u0001v\u0001\u0004\u0006\u0003\u000e;~\f\u0006\u0005$fuveuq.", (short) (C1499aX.Xd() ^ (-17979))) + str);
                                }
                            } finally {
                            }
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (Exception e3) {
                        koinApplication.getKoin().getLogger().error(str2 + e3);
                    }
                } else if (koinApplication.getKoin().getLogger().isAt(Level.INFO)) {
                    koinApplication.getKoin().getLogger().info(strWd + str + Qg.kd("\u007fEGIAzNHwCE68", (short) (C1633zX.Xd() ^ (-13725)), (short) (C1633zX.Xd() ^ (-19195))));
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (Exception e5) {
            Logger logger = koinApplication.getKoin().getLogger();
            StringBuilder sbAppend = new StringBuilder(hg.Vd("\nn\u001b\u0010\u001d\u0019\u0012\fSu\u0017\u0013\u0013\u0007\u0013\u0014\b\u0003\u0010x:~\u000b\n\u0006\b4\u000bzz|t.y{lnrvn&uvrrfrsgbo\u001b`kgd\u0016VgfWec\u001e", (short) (ZN.Xd() ^ 26025), (short) (ZN.Xd() ^ 21529))).append(str);
            short sXd4 = (short) (C1607wl.Xd() ^ 29524);
            int[] iArr4 = new int["OhM".length()];
            QB qb4 = new QB("OhM");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK(sXd4 + i5 + xuXd4.CK(iKK4));
                i5++;
            }
            logger.error(sbAppend.append(new String(iArr4, 0, i5)).append(e5).toString());
        }
        return koinApplication;
    }

    public static /* synthetic */ KoinApplication androidFileProperties$default(KoinApplication koinApplication, String str, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = "koin.properties";
        }
        return androidFileProperties(koinApplication, str);
    }

    public static final KoinApplication androidLogger(KoinApplication koinApplication, Level level) {
        Intrinsics.checkNotNullParameter(koinApplication, "<this>");
        Intrinsics.checkNotNullParameter(level, "level");
        koinApplication.getKoin().setupLogger(new AndroidLogger(level));
        return koinApplication;
    }

    public static /* synthetic */ KoinApplication androidLogger$default(KoinApplication koinApplication, Level level, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            level = Level.INFO;
        }
        return androidLogger(koinApplication, level);
    }
}
