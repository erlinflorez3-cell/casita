package org.koin.core.module;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ScopeDSL;
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
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:305)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
@KoinDslMarker
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яģ\u0014D57\u001eq\u007fR܀kŞ\fA\u00149\u0013.H\u0003*,(w\u000ff\u000198D{H6RY.\u0017k\n@,[*rK;c9\u0006\"\u000fRVg}nRZ!C\u0017\u0006,xr,_U\u0001]\u0018\u0011:B\u0006?;Mu@A`\u000b6\r 8#@y\u001b\u0001\"*^\u0010~zYK\u0014\u0012F@x:h\rU\u0005 \u0012\u000e>.\u0007&ձoNDHtҗB/1\u0012qĩV'mL\u0005M\u0013H\\'\u001b\u0015i\u001e1D?5+%[\u0003\u001dRc?\t@wB\u001bؒW'YH4dF^\u0006\u0014#+g\r\fs͉`\u0005_bT89u{K~\u000fX}\t#%>\u001a\r4&\u000fͪ-b6\u00166Kz\u0003UPPH\tp)\u001be<Ѝ3*I*i#lQof1PMz30NJ\u0007t/\bl/p\u0017+T&\u007fASP=v}\u001a[MmJ\u001b\u0011/\u0013\n@I\u0010/B;\rGÉ;[?TgȄ\bӿCϙ?\\n\u0011kobJP\"5@eS)\u0010`եr/\u0002O\u0005`2\u0011[Gl\t\u0014\u0007AC\r\u001fB'3<fpxkzM\f851v7\b\u001e{\u0010g9%]c~L\u0016qT\u0007\u0014\u0006fA5ֽjBY=\u000b`6TJH\u00193>ӽJā\u000bƎzE\u007fOL,_M#)\u0011 ,wY|7\u0016\u000bx\u001e6l;4\u0007o#\u0005\t/ˆ\u000b)\u0010g'̢ض\u0001`0f\ncCN>UP\u001fd\u00071>\u0017y\u0010IwLuƂ\u001bP>g\n[.\u001ag\b_E!K\u0017-B\u00023Fz\u0010,V\u0016$58\u0015y=q\u00196uD\u0003t<`pK}q]'?y\u0001a j\u0010{qF)ò\u0012\u0014;eL\n\u000b\ti>^8+þM]kˡoj\u0012Ck[--\u0018\b\u0014]֒\u0010\u001d\u001as<1z\u000fT۩,ׄ,,(}$i]`qhQg;V&4l\tCvs>\r\u000b'BOKHo\u001b!^F\u0011#3,wo,k\r\u0007cH;\b\u0002D.e+\"`D\u0013'j3UeS\u0016$\u001eOj6b\u000f8.,F|W4N0Xgb7w\u0016u(6oq\u0011KØ\r$:]\u0003\rSnb.\u001e\u0010)6fc\u0015ğ@l\n:\u0007#b>tgX\u0007pE\u000fh:\u0003\u000f\u000faT'{̰\tmL\u0006uѺ8ޥR߹Qtx\u0018\u0017l5-TT\u007fEV\u0002!\u000fK؏Qs\u001854O/my\u001b$:.{KeH!?Q\u001f)\u000f0\r\f\u0006\fTj\u0005>~s^$9~)+\u001e>\u001a\u000f9H_t\u007fbsv|% I*\u0003'Do1j-ސJ\u001b37{ϊCȏi̟w\u0016eSS}6!VٴZȎ#Ǜ[\u001anŊm\u001d@\u0019\u007f\u001az\u0004\u000f\u0018^&T\u0001X\u007f\u000b\">\u000eFS\u00123\b\u0014\rb\u001a\u007f\nJ71|\nRKny8lKm\u001fq\u0019\n~If\u007f~1`\u001d\u000f({7A`CD!Y0\\!\u007f\u001a\u0016T(\u0015\u0012!gf˝o\u05cftwW܀%-5w8nQ2X,\f.J\u0005\u0012:l(CLܑQDlӷtnHi\u001cq;Hr\t$/$~\u000fH\rƷAI|vtғ1ё\u001d+cƬWb\r\u001aSM>#7iM3\bA\u0019\t@v?\u0004p'߰\u0004.Z\u000bx\u0019u2}\rbW2Si*}h174E\u0017^\u00182!\u0012!/`9N[\u000b5\u0005Oa9Q\u001d?\u0012}8d\f\u0017\u001fEnaS++/\u001a_+u}\bˑ<ތ;~+˄\u001fq!vt?=7kl5-R\u0010X!esf\u0011q,wXs&b[P\u0002\u001a\u001fRGd\u007fYǇ\u001cʻJ\u008dchHѲ\u0004Y\nJ8:\u0007F)lz\u0006݈\n1q\u001by\u0083\f\u00103ъ~^"}, d2 = {"\u001ana4\"2HW\"Hxh9|R7o~8\u0003@J~!F\u007f\u0015<L", "", "-ba2T;>Rt\u000ehm(\n\u0018", "", "uY\u0018#", "5dc,V9>O(~y:;j\u0018+r\u000ffwI\n!&C~\u0012F\u007f3", "u(E", "5dc,V9>O(~y:;j\u0018+r\u000f", "u(I", "\nrTA \u0006\u0017", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u001de\u000f}", "\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`5s\u0017>}%\u0019b\f/3v\u0014..?9z>+)>", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a5o\u001d\u0012", "3`V2e\u0010Ga(z\u0004\\,\u000b", "5dc\u0012T.>`|\b\tm(\u0006\u0007/s", "u(;7T=:\u001d)\u000e~eu_\u0005=hm(\u000b\u0016", "Adc\u0012T.>`|\b\tm(\u0006\u0007/s>.\u0006D\n\u0011\u0015Q|\u000e", "uKY.i(\bc(\u0003\u0002(\u000fx\u00172S\u007f7Q\u0004q", "7c", "", "5dc\u0016W", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "7mR9h+>R\u0001\tyn3|\u0017", "", "5dc\u0016a*Ec\u0018~yF6{\u00196e\u000efwI\n!&C~\u0012F\u007f3", "5dc\u0016a*Ec\u0018~yF6{\u00196e\u000e", "u(;7T=:\u001d)\u000e~euc\r=tU", "7r;<T+>R", ";`_=\\5@a", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9qEu%H?}4\r", "\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`+x\u001cKr.3Y^\u001c5| ;a\u0019", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", "5dc\u001aT7IW\"\u0001\t\u001d(\u0006\u00129t{7\u007fJ\n%", "5dc\u001aT7IW\"\u0001\t", "u(;7T=:\u001d)\u000e~eu_\u0005=hg$\u0007\u0016", "Ab^=X:", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "5dc V6IS'=vg5\u0007\u0018+t\u00042\u0005N", "5dc V6IS'", "3pd._:", "=sW2e", "4`RAb9R", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9sFz.\u0014Y~$@q%2WL\u0011", "\"", "?tP9\\-BS&", "2dU6a0MW#\b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9l<w)>]\r$Avk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "Ab^=X\u0018NO \u0003{b,\n", "6`b566=S", "", "7mR9h+>a", "", ";nSB_,", "", "uZ;<e.\bY#\u0003\u0004(*\u0007\u0016//\b2zP\b\u0017`/y\rL}%\u000b\u001dn", "", "7mS2k\u0017KW!z\br\u001b\u0011\u0014/", "7mbAT5<Syzxm6\n\u001d", "7mS2k\u001a>Q#\byZ9\u0011wCp\u007f6", ">kd@", "", ";nSB_,L", ">qT=T9>4#\fXk,x\u00183o\t\u0004\u000b.\u0010\u0013$V", "A`e2@(I^\u001d\b|", ";`_=\\5@", "Ab^=X", "Ab^=X\u001a>b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ana4\"2HW\"Hyl3Fv-o\u000b(Z.gl", "Ah]4_,", "1qT.g,=/(l\nZ9\f", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Module {
    private final boolean _createdAtStart;
    private HashSet<SingleInstanceFactory<?>> eagerInstances;
    private final String id;
    private final List<Module> includedModules;
    private final HashMap<String, InstanceFactory<?>> mappings;
    private final HashSet<Qualifier> scopes;

    public Module() {
        this(false, 1, null);
    }

    public Module(boolean z2) {
        this._createdAtStart = z2;
        this.id = KoinPlatformTools.INSTANCE.generateId();
        this.eagerInstances = new HashSet<>();
        this.mappings = new HashMap<>();
        this.scopes = new HashSet<>();
        this.includedModules = new ArrayList();
    }

    public /* synthetic */ Module(boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? false : z2);
    }

    public static /* synthetic */ KoinDefinition factory$default(Module module, Qualifier qualifier, Function2 definition, int i2, Object obj) {
        Qualifier qualifier2 = qualifier;
        if ((i2 + 1) - (i2 | 1) != 0) {
            qualifier2 = null;
        }
        Intrinsics.checkNotNullParameter(definition, "definition");
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, definition, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return new KoinDefinition(module, factoryInstanceFactory);
    }

    public static /* synthetic */ KoinDefinition factory$default(Module module, Qualifier qualifier, Function2 definition, Qualifier scopeQualifier, int i2, Object obj) {
        Qualifier qualifier2 = qualifier;
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            qualifier2 = null;
        }
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, definition, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return new KoinDefinition(module, factoryInstanceFactory);
    }

    public static /* synthetic */ void getIncludedModules$annotations() {
    }

    public static /* synthetic */ void getMappings$annotations() {
    }

    public static /* synthetic */ void getScopes$annotations() {
    }

    public static /* synthetic */ void get_createdAtStart$annotations() {
    }

    public static /* synthetic */ KoinDefinition single$default(Module module, Qualifier qualifier, boolean z2, Function2 definition, int i2, Object obj) {
        Qualifier qualifier2 = qualifier;
        if ((1 & i2) != 0) {
            qualifier2 = null;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = false;
        }
        Intrinsics.checkNotNullParameter(definition, "definition");
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, definition, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (z2 || module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return new KoinDefinition(module, singleInstanceFactory2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Intrinsics.areEqual(this.id, ((Module) obj).id);
    }

    public final /* synthetic */ <T> KoinDefinition<T> factory(Qualifier qualifier, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList));
        indexPrimaryType(factoryInstanceFactory);
        return new KoinDefinition<>(this, factoryInstanceFactory);
    }

    public final /* synthetic */ <T> KoinDefinition<T> factory(Qualifier qualifier, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition, Qualifier scopeQualifier) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList));
        indexPrimaryType(factoryInstanceFactory);
        return new KoinDefinition<>(this, factoryInstanceFactory);
    }

    public final HashSet<SingleInstanceFactory<?>> getEagerInstances() {
        return this.eagerInstances;
    }

    public final String getId() {
        return this.id;
    }

    public final List<Module> getIncludedModules() {
        return this.includedModules;
    }

    public final HashMap<String, InstanceFactory<?>> getMappings() {
        return this.mappings;
    }

    public final HashSet<Qualifier> getScopes() {
        return this.scopes;
    }

    public final boolean get_createdAtStart() {
        return this._createdAtStart;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public final void includes(Collection<Module> module) {
        Intrinsics.checkNotNullParameter(module, "module");
        CollectionsKt.addAll(this.includedModules, module);
    }

    public final void includes(Module... module) {
        Intrinsics.checkNotNullParameter(module, "module");
        CollectionsKt.addAll(this.includedModules, module);
    }

    public final void indexPrimaryType(InstanceFactory<?> instanceFactory) {
        Intrinsics.checkNotNullParameter(instanceFactory, "instanceFactory");
        BeanDefinition<?> beanDefinition = instanceFactory.getBeanDefinition();
        saveMapping(BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), instanceFactory);
    }

    public final void indexSecondaryTypes(InstanceFactory<?> instanceFactory) {
        Intrinsics.checkNotNullParameter(instanceFactory, "instanceFactory");
        BeanDefinition<?> beanDefinition = instanceFactory.getBeanDefinition();
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            saveMapping(BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), instanceFactory);
        }
    }

    public final boolean isLoaded() {
        return this.mappings.size() > 0;
    }

    public final List<Module> plus(List<Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        return CollectionsKt.plus((Collection) CollectionsKt.listOf(this), (Iterable) modules);
    }

    public final List<Module> plus(Module module) {
        Intrinsics.checkNotNullParameter(module, "module");
        return CollectionsKt.listOf((Object[]) new Module[]{this, module});
    }

    public final void prepareForCreationAtStart(SingleInstanceFactory<?> instanceFactory) {
        Intrinsics.checkNotNullParameter(instanceFactory, "instanceFactory");
        this.eagerInstances.add(instanceFactory);
    }

    public final void saveMapping(String mapping, InstanceFactory<?> factory) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.mappings.put(mapping, factory);
    }

    @KoinDslMarker
    public final /* synthetic */ <T> void scope(Function1<? super ScopeDSL, Unit> scopeSet) {
        Intrinsics.checkNotNullParameter(scopeSet, "scopeSet");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
        scopeSet.invoke(new ScopeDSL(typeQualifier, this));
        getScopes().add(typeQualifier);
    }

    @KoinDslMarker
    public final void scope(Qualifier qualifier, Function1<? super ScopeDSL, Unit> scopeSet) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        Intrinsics.checkNotNullParameter(scopeSet, "scopeSet");
        scopeSet.invoke(new ScopeDSL(qualifier, this));
        this.scopes.add(qualifier);
    }

    public final void setEagerInstances$koin_core(HashSet<SingleInstanceFactory<?>> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<set-?>");
        this.eagerInstances = hashSet;
    }

    public final /* synthetic */ <T> KoinDefinition<T> single(Qualifier qualifier, boolean z2, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        indexPrimaryType(singleInstanceFactory2);
        if (z2 || get_createdAtStart()) {
            prepareForCreationAtStart(singleInstanceFactory);
        }
        return new KoinDefinition<>(this, singleInstanceFactory2);
    }
}
