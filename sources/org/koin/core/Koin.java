package org.koin.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.error.ScopeNotCreatedException;
import org.koin.core.extension.ExtensionManager;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.logger.EmptyLogger;
import org.koin.core.logger.Logger;
import org.koin.core.module.Module;
import org.koin.core.module.ModuleKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.registry.InstanceRegistry;
import org.koin.core.registry.PropertyRegistry;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTimeTools;
import org.koin.mp.KoinPlatformTools;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĝ\u0014D57\u001eq\u007fR܀kt\nA\u000e0!.J~(.\u001aw\u001dfr96FmHDR[*\u0015n\u00044:[,qI=]\u001a\u0014\"\u0011OTionXZ\u0013C\u0015\u0006\u001ex\u0001,Qǁ\u0001](\u000f:Bu@;M}IA`\u000b6\r 8\"@y\u001b\u0001\"*N\u0011~zQi\u0014\u0012F@xíZ\r[\u000e\"\u0012\fC(\u00014\\oNLHt]P/+\u0003oLV'u0\u0005ձ\u0015Fj'\u0015vg\u001f3@M5\u001d%Y\u0006\u001dѸ\f?1>2@ݾl'5+\u0012weQp\u007fB1sS\u001bz\u000b&\u000b!\u001a{\u001aECO\u0012jp\u0014.»\t\u001c5<2/6+VPE\u001a-(ԧ7t\u0001v\tq\u0010|Z\u007f)\u0001V\u001f+ĮAKO\u001a\u000fQ\u0010:IX={\u001316'/\u0014\n[34'ڄ!\u001d#_Oi@kgn\u0012_Ɲ{$\u0007a**2/w\b= )2EJ [\u0018IQs\bHR\u000f\u000f\u0007vg\u0002h\u0019̹Fj\u0013$UB\t:ytl\u0013\u0010hX\u0007QyMzz7\u0002\u0016;8\\&eQ-\u0016N]\u0010\u0002lc\\8$w-E\u0004\u0007k<sYb9̐_\u0004&`\u0003z\"jTbKx\u0017JY\fh\u0005@$HG\u00199(\fJN\u001a?JI\u0002\"D0A\u0019b\u0016v1Loq\u0003\u000f_h\u0018(~\u0003cjѷo˨x\t\u000f\u0002%|}\u001a\u0011IZ\u0019\u0011&;ti5GK\u001e2vh\u0015#5\u001b$\bU\fdKz\u0012~u4\"hU(ni/\u00043/\u0001/Ʌ\u0010MuT\u0001\u001ciQ\"'\u0001}(=kp4g\u0016\u0013\t.vixx\u0005+(vl*;\u0016t\u0002\nat4]b\u0003CD@_qa\u0014\u0084R8\u000b@g]36\b\"CUMK-ݴ$\u0018*.=a\fh 6\u007fb\u001dN\rg\u001a+\u0012? vWe@rPWi\u0001N\"R&\u0019Av#`\nX\b\u0013GyǬGҥoމиQ\u000b=:/\u001c:J\t\\k<#oDT\\\rJwI͟\"~Y$W߄Y0\r{\nt\u000bx.*\u0013\u0002ς|22<HV\u0006a98\u0014\u00180:o`K\u0005\u001b/jҐ2\u0005,\u0019\u0002li4/+\bT\u0004'\u001b`g\\;54\u0005|j~`\u0005\u000fn\u0011)0\u0001\r6K \u000f4_\u00046\bbn{4\u0017Rc);lUƫtE[Lbo3,h\u0001\u0011F\fqy\n<\u0004UQ\u0006m\u0006\u000bfA-1H\u0018)pi\u001fox@^9\u000fzM\u0013/zhhM\u0001cΉ~|\u001cwRP\u0019Xgt\u0006asln\u007f=Ƒ(!-CQ\u0007:{\u0014N!-\u0014]E?_iBP,kYC\f?8.7\u0006\u0005!\u000b\u0011$e8\u0016\u0004<,pt\u001dHƈ\u0019Ҝ\u001fɌ̛Nt\u0001Fv%D\u0010\u001a5\u0018\u0012%y\f}'̸5K\u0015\u0006pJ\u0019|\u0018\u0017\u0005c\u001dz̦\u0007f?\u0018B\u0012;\u00115\tmmN\u0019^ŔH1{ \u0007\u00100\u0018#Y766\bY\u0014]&\u0001p2oܣ\u0011+=/rq?tj\u001e,>*}\u0012Nl,C`?M\u001d\u000bQnz\bo\u0010tiV\u0004%\u001478\u0015\u0003v\u0004y\u0013\u0013l;hruO\u001f/]\u001dG''2\ri.'ܐ`_16Z\u000b\u001e''\u0019\t:p\u001d\u0018,X\b!)\u001823Fb\u00062'\bm\u001ex\t.Y|PP\u0018.!\u000e?hp7NvE\u001c2:0m\b˙\u0017ݭ\u0014ƉN<\u0015cMraW5,\u0017{G-mAQs@ݩE\u00139.7oIV\u0017C+5st?\u000e\u0018dx(}i\\\u000fota5sg*iF\b\u0018V<2\u0016w3\u007fsj^)\u000e\u0015)X\nVb`pަt\u0087\"ؙ5\u001f\u0002UDiF\u0010\u0015eo\u0001Y\u0001$\u001bT>Xz\u001b4uSny\u0019s%EBg?\f/3%\u001a(O ps]\u0001\u001cG\\\fXCw\u0012mJad\u001fwDgy\u001e-@S,xx>i_>TB\u0011\u001b\u0011\u00101\u0001lFee*5\u001d\u000fFdx)WO/#F\u001f&n.pY93fHV\u0018\u001a}xbK\u0017\n˂uހK\u001e^º1\u001f\u0017^3\u0006=ipKMZBrK?K\u000b\u001cQ\u000f9<ڬ\u0007Ȝ%WlƓ%\u0002p3<Gn@ 3f\u0010^irU(D'PXq>;HP-fya?\\u\u07bfaȀi\u000b:ďG]j\u001f97opXd1=I\u001c\u0011!Y\u0019A\u001dTW\u0010ޯ%Ѵ\u0011=Fϐ\u0018^Oh\u000bma\u0012\tuX6\u007f MEYK\u001bm\u001cCoٓAך\u0010,/Ձ\u0016\u0015*zu\u0013\u0002\u0010(x\u0011fܼV.PN_̎\u0017pi٦~G"}, d2 = {"\u001ana4\"2HW\"Hxh9|R\u0015o\u00041Q", "", "u(E", "3wc2a:B]\"fvg(~\t<", "\u001ana4\"2HW\"Hxh9|R/x\u000f(\u0005N\u0005! \u0011O!Kv.C]\b)\u001fi\u001f*OCHA", "5dc\u0012k;>\\'\u0003\u0005g\u0014x\u0012+g\u007f5:<\n !Vk\u001d@\u0001.C", "5dc\u0012k;>\\'\u0003\u0005g\u0014x\u0012+g\u007f5", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\u007f;\u000b@\n%\u001bQxW\u001c\n45b\f$Av}*V?=kAs", "7mbAT5<S\u0006~|b:\f\u0016C", "\u001ana4\"2HW\"Hxh9|R<e\u0002,\nO\u000e+`+x\u001cKr.3Yj 9q$=ZW\u0011", "5dc\u0016a:MO\"|zK,~\r=t\r<:<\n !Vk\u001d@\u0001.C", "5dc\u0016a:MO\"|zK,~\r=t\r<", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\r(}D\u000f&$[9qE\u000541b{ $m\u00182[RH\u007f\n", "\nrTA \u0006\u0017", "\u001ana4\"2HW\"Hxh9|R6o\u0002*{MJ}!Iq\u000eIL", ":nV4X9", "5dc\u0019b.@S&=vg5\u0007\u0018+t\u00042\u0005N", "5dc\u0019b.@S&", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\u00072}B\u0001$`.y\u0010>v2\u000b", ">q^=X9Mg\u0006~|b:\f\u0016C", "\u001ana4\"2HW\"Hxh9|R<e\u0002,\nO\u000e+`2|\u0018Gv2Dmj 9q$=ZW\u0011", "5dc\u001de6IS&\u000e\u000fK,~\r=t\r<:<\n !Vk\u001d@\u0001.C", "5dc\u001de6IS&\u000e\u000fK,~\r=t\r<", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\r(}D\u000f&$[9xI\u000105f\r4$m\u00182[RH\u007f\n", "Ab^=X\u0019>U\u001d\r\nk@", "\u001ana4\"2HW\"Hxh9|R<e\u0002,\nO\u000e+`5m\u0018Gv\u00125[\u0002.Fz*\u0004", "5dc V6IS\u0006~|b:\f\u0016C${1\u0005J\u0010\u0013&Ky\u0017J", "5dc V6IS\u0006~|b:\f\u0016C", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\r(}D\u000f&$[9{:\u000105F}\";{%;a\u0019", "1k^@X", "", "1qT.g,\u001eO\u001b~\bB5\u000b\u0018+n}(\n", "1qT.g,,Q#\nz", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "\"", "\u001ana4\"2HW\"Hxh9|R-o\b3\u0006I\u0001 &\u0011U\u0018@\u007f\u00133c\t \u0015w\u001e9WL;tCs", "B", "uK^?ZuD]\u001d\bD\\6\n\txc\n0\u0007J\n\u0017 V9sFz.#W\b+7K 6XMDk=-j,HC\u0014euT\u0001+P\u0016L6iR<K\u0012\u001ce\u000e\u0018\u0019\u000b\u000fdAy", "Ab^=X\u0010=", "", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roq\u001bL", "And?V,", "?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "2dR9T9>", "7mbAT5<S", "AdR<a+:`-m\u000fi,\u000b", "", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "/k[<j\u0016OS&\f~],", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bJ\u000e\u0019`My\u0012E@#?f}iC}\u00125QD?kAg\u0001x]@\u000bd0N\u0004|.QJ=X\u001c\u0003L\u0018\u0019$tR9\u001cZN\u0005\u0015", "2d[2g,)`#\nzk;\u0011", "9dh", "2d[2g,,Q#\nz", "5dc", "1kPGm", ">`a.`,MS&\r", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EL\u0016/QL?z8(\u001e>", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l.y\u001b>@+?]\u0007i5w#.\u0017OKg;\"\u0016laFPO<J}+HPN929xG#\u0019^\u0017\u00180\u001e\r#B4wBF#\u00125WK\u001cx\n\n%\u0012?s;\u0018\u001avLu&q\u000b0dO[)cDFE`9:", "uK^?ZuD]\u001d\bD\\6\n\txq\u0010$\u0003D\u0002\u001b\u0017T9yLr,9Z\u0002 DC|4WRBo=g\u001ayi\u0003\bs5L\u0006+QU\\u=b{;#\u0016d\u0017\u0019\u0001Pk^=5j\u000e>\u001b\u0011.\u0013k8m\u0001\n%c", "5dc\u000e_3", "5dc\u001ce\nKS\u0015\u000ezL*\u0007\u0014/", "5dc\u001ce\u0015NZ ", "5dc\u001de6IS&\u000e\u000f", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "2dU.h3MD\u0015\u0006\u000b^", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", "5dc V6IS", "5dc V6IS\u0003\fcn3\u0004", "7mY2V;", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", ";nS2", "\u001aj^A_0G\u001d\u007fz\u0010r\u001b\u007f\u0016/a~\u0016wA\u0001&+/y\r<L", "7mY2V;(`\u0002\u000f\u0002e", ":nP1@6=c ~\t", ";nSB_,L", "\u001ana4\"2HW\"Hxh9|R7o~8\u0003@J~!F\u007f\u0015<L", "Adc\u001de6IS&\u000e\u000f", "D`[BX", "AdcBc\u0013HU\u001b~\b", "Cm[<T+&]\u0018\u000f\u0002^:", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Koin {
    private final ScopeRegistry scopeRegistry = new ScopeRegistry(this);
    private final InstanceRegistry instanceRegistry = new InstanceRegistry(this);
    private final PropertyRegistry propertyRegistry = new PropertyRegistry(this);
    private final ExtensionManager extensionManager = new ExtensionManager(this);
    private Logger logger = new EmptyLogger();

    public static /* synthetic */ Scope createScope$default(Koin koin, String scopeId, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            scopeId = KoinPlatformTools.INSTANCE.generateId();
        }
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return koin.getScopeRegistry().createScope(scopeId, new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class)), null);
    }

    public static /* synthetic */ Scope createScope$default(Koin koin, String scopeId, Object obj, int i2, Object obj2) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            obj = null;
        }
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return koin.getScopeRegistry().createScope(scopeId, new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class)), obj);
    }

    public static /* synthetic */ Scope createScope$default(Koin koin, String str, Qualifier qualifier, Object obj, int i2, Object obj2) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            obj = null;
        }
        return koin.createScope(str, qualifier, obj);
    }

    public static /* synthetic */ void declare$default(Koin koin, Object obj, Qualifier qualifier, List list, boolean z2, int i2, Object obj2) {
        boolean z3 = z2;
        List secondaryTypes = list;
        Qualifier qualifier2 = qualifier;
        if ((i2 + 2) - (i2 | 2) != 0) {
            qualifier2 = null;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            secondaryTypes = CollectionsKt.emptyList();
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            z3 = true;
        }
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        InstanceRegistry instanceRegistry = koin.getInstanceRegistry();
        Qualifier scopeQualifier = instanceRegistry.get_koin().getScopeRegistry().getRootScope().getScopeQualifier();
        Kind kind = Kind.Scoped;
        Intrinsics.needClassReification();
        Koin$declare$$inlined$declareRootInstance$1 koin$declare$$inlined$declareRootInstance$1 = new Koin$declare$$inlined$declareRootInstance$1(obj);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, koin$declare$$inlined$declareRootInstance$1, kind, secondaryTypes);
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(beanDefinition);
        InstanceRegistry.saveMapping$default(instanceRegistry, z3, BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), singleInstanceFactory, false, 8, null);
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            InstanceRegistry.saveMapping$default(instanceRegistry, z3, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), singleInstanceFactory, false, 8, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(Koin koin, KClass kClass, Qualifier qualifier, Function0 function0, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            qualifier = null;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            function0 = null;
        }
        return koin.get(kClass, qualifier, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(Koin koin, Qualifier qualifier, Function0 function0, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            qualifier = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function0 = null;
        }
        Scope rootScope = koin.getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public static /* synthetic */ void getExtensionManager$annotations() {
    }

    public static /* synthetic */ void getInstanceRegistry$annotations() {
    }

    public static /* synthetic */ void getLogger$annotations() {
    }

    public static /* synthetic */ Scope getOrCreateScope$default(Koin koin, String str, Qualifier qualifier, Object obj, int i2, Object obj2) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            obj = null;
        }
        return koin.getOrCreateScope(str, qualifier, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(Koin koin, KClass kClass, Qualifier qualifier, Function0 function0, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            qualifier = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            function0 = null;
        }
        return koin.getOrNull(kClass, qualifier, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(Koin koin, Qualifier qualifier, Function0 function0, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            qualifier = null;
        }
        if ((i2 & 2) != 0) {
            function0 = null;
        }
        Scope rootScope = koin.getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public static /* synthetic */ void getPropertyRegistry$annotations() {
    }

    public static /* synthetic */ void getScopeRegistry$annotations() {
    }

    public static /* synthetic */ Lazy inject$default(Koin koin, Qualifier qualifier, LazyThreadSafetyMode mode, Function0 function0, int i2, Object obj) {
        if ((1 & i2) != 0) {
            qualifier = null;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            mode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(mode, "mode");
        Scope rootScope = koin.getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt.lazy(mode, (Function0) new Koin$inject$$inlined$inject$1(rootScope, qualifier, function0));
    }

    public static /* synthetic */ Lazy injectOrNull$default(Koin koin, Qualifier qualifier, LazyThreadSafetyMode mode, Function0 function0, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            qualifier = null;
        }
        if ((2 & i2) != 0) {
            mode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(mode, "mode");
        Scope rootScope = koin.getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt.lazy(mode, (Function0) new Koin$injectOrNull$$inlined$injectOrNull$1(rootScope, qualifier, function0));
    }

    public static /* synthetic */ void loadModules$default(Koin koin, List list, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            z2 = true;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z3 = false;
        }
        koin.loadModules(list, z2, z3);
    }

    public final void close() {
        this.scopeRegistry.close$koin_core();
        this.instanceRegistry.close$koin_core();
        this.propertyRegistry.close();
        this.extensionManager.close();
    }

    public final void createEagerInstances() {
        this.logger.debug("Create eager instances ...");
        long timeInNanoSeconds = KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds();
        this.instanceRegistry.createAllEagerInstances$koin_core();
        this.logger.debug("Created eager instances in " + ((Number) new Pair(Unit.INSTANCE, Double.valueOf((KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds() - timeInNanoSeconds) / 1000000.0d)).getSecond()).doubleValue() + " ms");
    }

    public final /* synthetic */ <T> Scope createScope(String scopeId) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getScopeRegistry().createScope(scopeId, new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class)), null);
    }

    public final /* synthetic */ <T> Scope createScope(String scopeId, Object obj) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getScopeRegistry().createScope(scopeId, new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class)), obj);
    }

    public final Scope createScope(String scopeId, Qualifier qualifier, Object obj) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        return this.scopeRegistry.createScope(scopeId, qualifier, obj);
    }

    public final <T extends KoinScopeComponent> Scope createScope(T t2) {
        Intrinsics.checkNotNullParameter(t2, "t");
        return this.scopeRegistry.createScope(KoinScopeComponentKt.getScopeId(t2), KoinScopeComponentKt.getScopeName(t2), null);
    }

    public final /* synthetic */ <T> void declare(T t2, Qualifier qualifier, List<? extends KClass<?>> secondaryTypes, boolean z2) {
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        InstanceRegistry instanceRegistry = getInstanceRegistry();
        Qualifier scopeQualifier = instanceRegistry.get_koin().getScopeRegistry().getRootScope().getScopeQualifier();
        Kind kind = Kind.Scoped;
        Intrinsics.needClassReification();
        Koin$declare$$inlined$declareRootInstance$1 koin$declare$$inlined$declareRootInstance$1 = new Koin$declare$$inlined$declareRootInstance$1(t2);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, koin$declare$$inlined$declareRootInstance$1, kind, secondaryTypes);
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(beanDefinition);
        InstanceRegistry.saveMapping$default(instanceRegistry, z2, BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), singleInstanceFactory, false, 8, null);
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            InstanceRegistry.saveMapping$default(instanceRegistry, z2, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), singleInstanceFactory, false, 8, null);
        }
    }

    public final void deleteProperty(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.propertyRegistry.deleteProperty(key);
    }

    public final void deleteScope(String scopeId) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        this.scopeRegistry.deleteScope$koin_core(scopeId);
    }

    public final <T> T get(KClass<?> clazz, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) this.scopeRegistry.getRootScope().get(clazz, qualifier, function0);
    }

    public final /* synthetic */ <T> T get(Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public final /* synthetic */ <T> List<T> getAll() {
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.getAll(Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final ExtensionManager getExtensionManager() {
        return this.extensionManager;
    }

    public final InstanceRegistry getInstanceRegistry() {
        return this.instanceRegistry;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final /* synthetic */ <T> Scope getOrCreateScope(String scopeId) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
        Scope scopeOrNull = getScopeRegistry().getScopeOrNull(scopeId);
        return scopeOrNull == null ? createScope$default(this, scopeId, typeQualifier, null, 4, null) : scopeOrNull;
    }

    public final Scope getOrCreateScope(String scopeId, Qualifier qualifier, Object obj) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        Scope scopeOrNull = this.scopeRegistry.getScopeOrNull(scopeId);
        return scopeOrNull == null ? createScope(scopeId, qualifier, obj) : scopeOrNull;
    }

    public final <T> T getOrNull(KClass<?> clazz, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) this.scopeRegistry.getRootScope().getOrNull(clazz, qualifier, function0);
    }

    public final /* synthetic */ <T> T getOrNull(Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) rootScope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public final <T> T getProperty(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.propertyRegistry.getProperty(key);
    }

    public final <T> T getProperty(String key, T defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t2 = (T) this.propertyRegistry.getProperty(key);
        return t2 == null ? defaultValue : t2;
    }

    public final PropertyRegistry getPropertyRegistry() {
        return this.propertyRegistry;
    }

    public final Scope getScope(String scopeId) throws ScopeNotCreatedException {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Scope scopeOrNull = this.scopeRegistry.getScopeOrNull(scopeId);
        if (scopeOrNull != null) {
            return scopeOrNull;
        }
        throw new ScopeNotCreatedException("No scope found for id '" + scopeId + '\'');
    }

    public final Scope getScopeOrNull(String scopeId) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        return this.scopeRegistry.getScopeOrNull(scopeId);
    }

    public final ScopeRegistry getScopeRegistry() {
        return this.scopeRegistry;
    }

    public final /* synthetic */ <T> Lazy<T> inject(Qualifier qualifier, LazyThreadSafetyMode mode, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt.lazy(mode, (Function0) new Koin$inject$$inlined$inject$1(rootScope, qualifier, function0));
    }

    public final /* synthetic */ <T> Lazy<T> injectOrNull(Qualifier qualifier, LazyThreadSafetyMode mode, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt.lazy(mode, (Function0) new Koin$injectOrNull$$inlined$injectOrNull$1(rootScope, qualifier, function0));
    }

    public final void loadModules(List<Module> modules, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Set<Module> setFlatten = ModuleKt.flatten(modules);
        this.instanceRegistry.loadModules$koin_core(setFlatten, z2);
        this.scopeRegistry.loadScopes(setFlatten);
        if (z3) {
            createEagerInstances();
        }
    }

    public final void setProperty(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.propertyRegistry.saveProperty$koin_core(key, value);
    }

    public final void setupLogger(Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
    }

    public final void unloadModules(List<Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        this.instanceRegistry.unloadModules$koin_core(ModuleKt.flatten(modules));
    }
}
