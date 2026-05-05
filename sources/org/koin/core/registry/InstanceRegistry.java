package org.koin.core.registry;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.InstanceContext;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.module.ModuleKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.truncatedMessage(InvalidProtocolBufferException.java:70)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.refillBuffer(CodedInputStream.java:1094)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.ensureAvailable(CodedInputStream.java:1080)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readRawBytesSlowPath(CodedInputStream.java:1215)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readBytes(CodedInputStream.java:529)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:244)
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
@Metadata(bv = {}, d1 = {"Яĕ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013.H~*, \u001b\u000ffxE8D{H6Ri*\u0017k\u00025,[:qK;c \u0006\"\u001fOVg}nRҙ\u0013C\u001d(\u001exp-QU\u0007]\u001aƁ:B\u0006?;Mu@A`\u0003R\r 8$@y\u001b\u0001\"ݒP\u0010\u0005\u0019KK\"\u00128ϋx:`\u0016U\u0005 \u0014\u000e>6\u0001&\\mO>H\u0003]B/)\u0005qBd'g0\u0003O\u0015FbG\u0015vg+A¨g5C$\u0014\u000e\u0017Vi?\u001b? >ݾl'5-\u0012\u0002eIp\u007fB)[S\u001br\u000b&\u000b\u001b\u0018`T29f{K~\"n»ߡ\u007f\rB\u001cV\u00115aF-HzNԄ\u07baxrYZ\u0019\u001al]\u0018z\u0010JG3\u000eBCC+laeK\u0019T8*\u0012;:i\u00017giq&`C/t{Wĸ_^SG~\u000eg\\\u0006\u00047\u000122\n0U G}'-EFgk?#/\u000e\u001aRTm\u0007\tphYj\u0001lnE\u001f\u001c=*\u00171rD\u0013+2®Zг0\u0011[C\u001da\f0+ \u000b\f\\%+ī\\m~h\u001bQk)=/-U\nvq\u000eeYv5KP\u00121\u0012b|\u0014M^z\u000fhlRW\u001cZb)PVv\u000e@}\u0002D\\1+2m\u0018L8:Z1\\Ci3&Pk\u0015\r\u000e_Q\u0010]\u007fyɶ\tȐ(t\u0017-\u0019o~\u001d\u007fxw@-d0[YQcHlŞɋl4\u0003SO*\u00021_m\\I\\l\\\u0014\u0004\u001f@\u0018 ߙ_Mm\u001b\u001d1A6\u0012-KM!\n\u0002Q Z\u0013|(C\u0002Ü\u05cek\bp&tvx\u0001gTE6'b\u00018 d.\u0010\u0012J\tl{T9\u0002\u0005I;$gsf8+\u0019O(39\b(\r7=CU3D1D3#\u0007ui\u001eT@ʬϪ*tk>t\u0013$+zWm2A9_X-ER,z5ZLzw\u000eC7X=9Va|rl7{,_\u0002t0D\r\u001fw\"ƥ݇s}:j(e\u0002\u0001\u0016\u0016tBk/mUmƚ{i\r\u0011X/\"\r\u00120\u001d3LE.\tof\u00190\ftFZq?p.T\tRU\\@\u0016>[T\u0018:VÿķJa\u0015U@\u0002<kdNlx\u000bjx\tnjx!X'/\u0017A_\u00119_\nVF35\u0014:\u000f\u00165\r+jU\u007f\u0015,[JZ9)kp\u00019k$H\u0012\u0006DH_)\u001cw8\u001aF]\u0015\u001dp,K=_&wv^tQU-gr=*f\u0001bR3\r3\u0015\u0014L\f\u001f\u000bGe!))\u03a2ٮRw=\u000bj!%GA\u001b\u001c\u0003sJI2n5\fCYp$+\fWY<,\u000fN$}\u05f7vֈ`W\u0016ўZl):.qDc֒\r\u0019X܀\u001c0P|\u0001\u0013~8DY\u001aW\u0012\u0015nY\u001a\u00041F7/|\u0006HL\u0017\u00068nUs~W\u001b\u0003\u0015=f\u007f~1`\u001d\u000f({;qf1ϓ\u0013\u05c9$X\u0019֧d84.N\u001cr/ S\u0012mYk.a\u001d1?o:a71\u0001%,/0:ą.X@\u0017Ag[PŢ\r%"}, d2 = {"\u001ana4\"2HW\"Hxh9|R<e\u0002,\nO\u000e+`+x\u001cKr.3Yj 9q$=ZW\u0011", "", "-j^6a", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041Q", "uK^?ZuD]\u001d\bD\\6\n\txK\n,\u0005\u0016D\b", "-h]@g(GQ\u0019\r", "", "", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9qEu%H?}4\r", "\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`+x\u001cKr.3Y^\u001c5| ;a\u0019", "5dc,^6B\\", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//e2\u007fIV", "3`V2e\u0010Ga(z\u0004\\,\u000b", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "", "\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`5s\u0017>}%\u0019b\f/3v\u0014..?9z>+)>", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", "7mbAT5<S'", "", "5dc\u0016a:MO\"|zl", "u(;7T=:\u001d)\u000e~eud\u0005:;", "/cS\u000e_3\u001eO\u001b~\bB5\u000b\u0018+n}(\n", "", ";nSB_,", "\u001ana4\"2HW\"Hxh9|R7o~8\u0003@J~!F\u007f\u0015<L", "1k^@X", "1k^@XjD]\u001d\bt\\6\n\t", "1qT.g,\u001aZ ^v`,\nl8s\u000f$\u0005>\u0001%", "1qT.g,\u001aZ ^v`,\nl8s\u000f$\u0005>\u0001%UMy\u0012Ep#?f}", "1qT.g,\u001eO\u001b~\bB5\u000b\u0018+n}(\n", "", "2dR9T9>@#\t\nB5\u000b\u0018+n}(", "\"", "7mbAT5<S", "?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "AdR<a+:`-m\u000fi,\u000b", "", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "/k[<j\u0016OS&\f~],", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bJ\u000e\u0019`My\u0012E@#?f}iC}\u00125QD?kAg\u0001x]@\u000bd0N\u0004|.QJ=X\u001c\u0003L\u0018\u0019$tR9\u001cZN\u0005\u0015", "2dR9T9>A\u0017\t\u0006^+`\u0012=t{1y@", "Ab^=X\u0018NO \u0003{b,\n", "Ab^=X\u0010\u001d", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roq\u001bL", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bJ\u000e\u0019`My\u0012E@#?f}iC}\u00125QD?kAg\u0001x]@\u000bd0N\u0004|.QJ=X\u001c\u0003L\u0018\u0019$tR9\u001cZN(.{F\u0001%\u00120RK9r\u000e\f_\u001aEfwFW\u0014G\u0007^aQ%oJZcyT\u0017,g&u\b)$XC<m\u0002\u0001&\u001fqR\u0004Ml", "2q^=F*H^\u0019b\u0004l;x\u0012-e\u000e", "Ab^=X", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "2q^=F*H^\u0019b\u0004l;x\u0012-e\u000ef\u0002J\u0005 \u0011Ey\u001b<", "5dc\u000e_3", "1kPGm", "7mbAT5<Sv\t\u0004m,\u0010\u0018", "\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`+x\u001cKr.3Y[*@|\u0016A\\\u0019", "5dc\u000e_3|Y#\u0003\u0004X*\u0007\u0016/", ":nP1@6=c ~", ":nP1@6=c ~\t", ";nSB_,L", "", ":nP1@6=c ~\t\u001d2\u0007\r8_}2\t@", "@db<_=>2\u0019\u007f~g0\f\r9n", "@db<_=>2\u0019\u007f~g0\f\r9n>.\u0006D\n\u0011\u0015Q|\u000e", "@db<_=>7\"\r\nZ5z\t", "@db<_=>7\"\r\nZ5z\tmk\n,\u0005:~!$G", "uK^?ZuD]\u001d\bD\\6\n\txq\u0010$\u0003D\u0002\u001b\u0017T9yLr,9Z\u0002 DC|4WRBo=g\"hb@\u0007a;\u0018\\\u0005NH\\:29|J\u0016[`\u0018R4V\u0003cN$8PG\u001b\u000f0J\u0006;uJw&\n<nqFV\u001d\u001d`\u001f\u0003CrnP]hCEKRbsh\u0015m,XC8$]U\")wL7\b{1\u001b{ayzv\u001d\\a= Oi%MAxW\u0006^$$Ky\u0007g", "A`e2@(I^\u001d\b|", ";`_=\\5@", "4`RAb9R", ":nV$T9GW\"\u0001", "Ahi2", "Cm[<T+&]\u0018\u000f\u0002^", "Cm[<T+&]\u0018\u000f\u0002^:", "Cm[<T+&]\u0018\u000f\u0002^:;\u000f9i\t\"yJ\u000e\u0017", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class InstanceRegistry {
    private final Map<String, InstanceFactory<?>> _instances;
    private final Koin _koin;
    private final HashMap<Integer, SingleInstanceFactory<?>> eagerInstances;

    public InstanceRegistry(Koin _koin) {
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this._koin = _koin;
        this._instances = KoinPlatformTools.INSTANCE.safeHashMap();
        this.eagerInstances = new HashMap<>();
    }

    private final void addAllEagerInstances(Module module) {
        for (SingleInstanceFactory<?> singleInstanceFactory : module.getEagerInstances()) {
            this.eagerInstances.put(Integer.valueOf(singleInstanceFactory.hashCode()), singleInstanceFactory);
        }
    }

    private final void createEagerInstances(Collection<? extends SingleInstanceFactory<?>> collection) {
        InstanceContext instanceContext = new InstanceContext(this._koin.getLogger(), this._koin.getScopeRegistry().getRootScope(), null, 4, null);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            ((SingleInstanceFactory) it.next()).get(instanceContext);
        }
    }

    public static /* synthetic */ void declareRootInstance$default(InstanceRegistry instanceRegistry, Object obj, Qualifier qualifier, List list, boolean z2, int i2, Object obj2) {
        boolean z3 = z2;
        List secondaryTypes = list;
        Qualifier qualifier2 = qualifier;
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            qualifier2 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            secondaryTypes = CollectionsKt.emptyList();
        }
        if ((i2 & 8) != 0) {
            z3 = true;
        }
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        Qualifier scopeQualifier = instanceRegistry.get_koin().getScopeRegistry().getRootScope().getScopeQualifier();
        Kind kind = Kind.Scoped;
        Intrinsics.needClassReification();
        InstanceRegistry$declareRootInstance$def$1 instanceRegistry$declareRootInstance$def$1 = new InstanceRegistry$declareRootInstance$def$1(obj);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, instanceRegistry$declareRootInstance$def$1, kind, secondaryTypes);
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(beanDefinition);
        saveMapping$default(instanceRegistry, z3, BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), singleInstanceFactory, false, 8, null);
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            saveMapping$default(instanceRegistry, z3, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), singleInstanceFactory, false, 8, null);
        }
    }

    public static /* synthetic */ void declareScopedInstance$default(InstanceRegistry instanceRegistry, Object obj, Qualifier qualifier, List list, boolean z2, Qualifier scopeQualifier, String scopeID, int i2, Object obj2) {
        List secondaryTypes = list;
        boolean z3 = z2;
        Qualifier qualifier2 = qualifier;
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            qualifier2 = null;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            secondaryTypes = CollectionsKt.emptyList();
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            z3 = true;
        }
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(scopeID, "scopeID");
        Kind kind = Kind.Scoped;
        Intrinsics.needClassReification();
        InstanceRegistry$declareScopedInstance$def$1 instanceRegistry$declareScopedInstance$def$1 = new InstanceRegistry$declareScopedInstance$def$1(obj);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, instanceRegistry$declareScopedInstance$def$1, kind, secondaryTypes);
        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier());
        InstanceFactory<?> instanceFactory = instanceRegistry.getInstances().get(strIndexKey);
        ScopedInstanceFactory scopedInstanceFactory = instanceFactory instanceof ScopedInstanceFactory ? (ScopedInstanceFactory) instanceFactory : null;
        if (scopedInstanceFactory != null) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
            scopedInstanceFactory.refreshInstance(scopeID, obj);
            return;
        }
        ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition);
        saveMapping$default(instanceRegistry, z3, strIndexKey, scopedInstanceFactory2, false, 8, null);
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            saveMapping$default(instanceRegistry, z3, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), scopedInstanceFactory2, false, 8, null);
        }
    }

    private final void loadModule(Module module, boolean z2) {
        for (Map.Entry<String, InstanceFactory<?>> entry : module.getMappings().entrySet()) {
            saveMapping$default(this, z2, entry.getKey(), entry.getValue(), false, 8, null);
        }
    }

    public static /* synthetic */ void saveMapping$default(InstanceRegistry instanceRegistry, boolean z2, String str, InstanceFactory instanceFactory, boolean z3, int i2, Object obj) {
        if ((i2 + 8) - (i2 | 8) != 0) {
            z3 = true;
        }
        instanceRegistry.saveMapping(z2, str, instanceFactory, z3);
    }

    private final void unloadModule(Module module) {
        Set<String> setKeySet = module.getMappings().keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        for (String str : setKeySet) {
            if (this._instances.containsKey(str)) {
                InstanceFactory<?> instanceFactory = this._instances.get(str);
                if (instanceFactory != null) {
                    instanceFactory.dropAll();
                }
                this._instances.remove(str);
            }
        }
    }

    public final void close$koin_core() {
        Iterator<Map.Entry<String, InstanceFactory<?>>> it = this._instances.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().dropAll();
        }
        this._instances.clear();
    }

    public final void createAllEagerInstances$koin_core() {
        Collection<SingleInstanceFactory<?>> collectionValues = this.eagerInstances.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        SingleInstanceFactory[] singleInstanceFactoryArr = (SingleInstanceFactory[]) collectionValues.toArray(new SingleInstanceFactory[0]);
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(Arrays.copyOf(singleInstanceFactoryArr, singleInstanceFactoryArr.length));
        this.eagerInstances.clear();
        createEagerInstances(arrayListArrayListOf);
    }

    public final /* synthetic */ <T> void declareRootInstance(T t2, Qualifier qualifier, List<? extends KClass<?>> secondaryTypes, boolean z2) {
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        Qualifier scopeQualifier = get_koin().getScopeRegistry().getRootScope().getScopeQualifier();
        Kind kind = Kind.Scoped;
        Intrinsics.needClassReification();
        InstanceRegistry$declareRootInstance$def$1 instanceRegistry$declareRootInstance$def$1 = new InstanceRegistry$declareRootInstance$def$1(t2);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, instanceRegistry$declareRootInstance$def$1, kind, secondaryTypes);
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(beanDefinition);
        saveMapping$default(this, z2, BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), singleInstanceFactory, false, 8, null);
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            saveMapping$default(this, z2, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), singleInstanceFactory, false, 8, null);
        }
    }

    public final /* synthetic */ <T> void declareScopedInstance(T t2, Qualifier qualifier, List<? extends KClass<?>> secondaryTypes, boolean z2, Qualifier scopeQualifier, String scopeID) {
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(scopeID, "scopeID");
        Kind kind = Kind.Scoped;
        Intrinsics.needClassReification();
        InstanceRegistry$declareScopedInstance$def$1 instanceRegistry$declareScopedInstance$def$1 = new InstanceRegistry$declareScopedInstance$def$1(t2);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, instanceRegistry$declareScopedInstance$def$1, kind, secondaryTypes);
        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier());
        InstanceFactory<?> instanceFactory = getInstances().get(strIndexKey);
        ScopedInstanceFactory scopedInstanceFactory = instanceFactory instanceof ScopedInstanceFactory ? (ScopedInstanceFactory) instanceFactory : null;
        if (scopedInstanceFactory != null) {
            Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type kotlin.Any");
            scopedInstanceFactory.refreshInstance(scopeID, t2);
            return;
        }
        ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition);
        saveMapping$default(this, z2, strIndexKey, scopedInstanceFactory2, false, 8, null);
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            saveMapping$default(this, z2, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), scopedInstanceFactory2, false, 8, null);
        }
    }

    public final void dropScopeInstances$koin_core(Scope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Collection<InstanceFactory<?>> collectionValues = this._instances.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (obj instanceof ScopedInstanceFactory) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ScopedInstanceFactory) it.next()).drop(scope);
        }
    }

    public final <T> List<T> getAll$koin_core(KClass<?> clazz, InstanceContext instanceContext) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(instanceContext, "instanceContext");
        Collection<InstanceFactory<?>> collectionValues = this._instances.values();
        ArrayList arrayList = new ArrayList();
        for (T t2 : collectionValues) {
            if (Intrinsics.areEqual(((InstanceFactory) t2).getBeanDefinition().getScopeQualifier(), instanceContext.getScope().getScopeQualifier())) {
                arrayList.add(t2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t3 : arrayList) {
            InstanceFactory instanceFactory = (InstanceFactory) t3;
            if (Intrinsics.areEqual(instanceFactory.getBeanDefinition().getPrimaryType(), clazz) || instanceFactory.getBeanDefinition().getSecondaryTypes().contains(clazz)) {
                arrayList2.add(t3);
            }
        }
        List listDistinct = CollectionsKt.distinct(arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDistinct, 10));
        Iterator<T> it = listDistinct.iterator();
        while (it.hasNext()) {
            arrayList3.add(((InstanceFactory) it.next()).get(instanceContext));
        }
        return arrayList3;
    }

    public final Map<String, InstanceFactory<?>> getInstances() {
        return this._instances;
    }

    public final Koin get_koin() {
        return this._koin;
    }

    public final void loadModules$koin_core(Set<Module> modules, boolean z2) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        for (Module module : modules) {
            loadModule(module, z2);
            addAllEagerInstances(module);
        }
    }

    public final InstanceFactory<?> resolveDefinition$koin_core(KClass<?> clazz, Qualifier qualifier, Qualifier scopeQualifier) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        return this._instances.get(BeanDefinitionKt.indexKey(clazz, qualifier, scopeQualifier));
    }

    public final <T> T resolveInstance$koin_core(Qualifier qualifier, KClass<?> clazz, Qualifier scopeQualifier, InstanceContext instanceContext) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(instanceContext, "instanceContext");
        InstanceFactory<?> instanceFactoryResolveDefinition$koin_core = resolveDefinition$koin_core(clazz, qualifier, scopeQualifier);
        Object obj = instanceFactoryResolveDefinition$koin_core != null ? instanceFactoryResolveDefinition$koin_core.get(instanceContext) : null;
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }

    public final void saveMapping(boolean z2, String mapping, InstanceFactory<?> factory, boolean z3) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(factory, "factory");
        if (this._instances.containsKey(mapping)) {
            if (!z2) {
                ModuleKt.overrideError(factory, mapping);
            } else if (z3) {
                this._koin.getLogger().warn("(+) override index '" + mapping + "' -> '" + factory.getBeanDefinition() + '\'');
            }
        }
        this._koin.getLogger().debug("(+) index '" + mapping + "' -> '" + factory.getBeanDefinition() + '\'');
        this._instances.put(mapping, factory);
    }

    public final int size() {
        return this._instances.size();
    }

    public final void unloadModules$koin_core(Set<Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Iterator<T> it = modules.iterator();
        while (it.hasNext()) {
            unloadModule((Module) it.next());
        }
    }
}
