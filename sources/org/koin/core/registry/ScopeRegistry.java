package org.koin.core.registry;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.error.ScopeAlreadyCreatedException;
import org.koin.core.module.Module;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007|jA0ZeP\u008cZS82s{B0c$\bCCU0}*\tURog|jb\u000bI\u0010\u000e\u0016\u0007j4I[\u0003e\u0012%2JoE5cڎ[_\u0011td\u0004X1Hx\u0005\u0015\u0005(*`\u0010%{ŲO\f 2\t{Hg%M30Xß̧$\u0001$s0TD`\u0005]hEi\u00032h\\@w0+X=NbA%z\u0010'\u0014@\u0016?E)a\u001e\u001fR\nD3Gw=\u0013\u0005?)AH\"V|WH'#Hg\r\f\tV`\u0013ox\fU6\u0016ҪׂT\u000e.\u0017C\u0013\u001bY\u001c\u000e4=x6;4~\f<<]r2J\u0017\u061cެF\u007f\u0001\u0001~+3 K-O\u001a\u0015\\\u0012C'hO\u007f3\u0016\u0007#_xgZ\u001d\u001cn63T&gaUN_`N8|\u0004mL\u0003p&B\u0004^]09\n6F\u001d59k9QD\u001a\u0014\u0019Puv\u001d`\u0017T@ɰJغ&n\u001eճz%\u001a]\\t\u0015m`T\u00071?Q\u0005Z\u0017\u007f\u0018\u0013NaVBwغ\u0012ʽShqҔ\u001ey\u0018,GvG_~o<`\"^\u0012?ae a\u0001\u0002BG\u0013ϸ\u0007ֽjB[ێ+v6.JH\u0019\u001b.\u007f\u001b\u0090\u000eƱ6KyʉD.7&j#`\u0005$QO\rYthy(\u0005d54\u0003\u0018)#\u001b7\u0015ʷts\u007fzO?\u000btĞ1h"}, d2 = {"\u001ana4\"2HW\"Hxh9|R<e\u0002,\nO\u000e+`5m\u0018Gv\u00125[\u0002.Fz*\u0004", "", "-j^6a", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041Q", "uK^?ZuD]\u001d\bD\\6\n\txK\n,\u0005\u0016D\b", "-rR<c,\u001dS\u001a\u0003\u0004b;\u0001\u00138s", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u001de\u000f}", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a5o\u001d\u0012", "-rR<c,L", "", "", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roq\u001bL", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "@n^AF*H^\u0019", "5dc\u001fb6MA\u0017\t\u0006^jx\u00128o\u000f$\u000bD\u000b %", "u(E", "5dc\u001fb6MA\u0017\t\u0006^", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\u000e&\u0006K\u0001`\u0005Ey\u0019<L", "Ab^=X\u000b>T\u001d\b~m0\u0007\u0012=", "", "5dc V6ISw~{b5\u0001\u00183o\t6", "u(;7T=:\u001d)\u000e~euj\t>;", "1k^@X", "", "1k^@XjD]\u001d\bt\\6\n\t", "1k^@X\bEZ\u0007|\u0005i,\u000b", "1qT.g,,Q#\nz", "Ab^=X\u0010=", "?tP9\\-BS&", "And?V,", "2d[2g,,Q#\nz", "Ab^=X", "2d[2g,,Q#\nz\u001d2\u0007\r8_}2\t@", "5dc V6IS\u0003\fcn3\u0004", ":nP1@6=c ~", ";nSB_,", "\u001ana4\"2HW\"Hxh9|R7o~8\u0003@J~!F\u007f\u0015<L", ":nP1F*H^\u0019\r", ";nSB_,L", "\u0011n\\=T5B]\"", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ScopeRegistry {
    public static final Companion Companion = new Companion(null);
    private static final String ROOT_SCOPE_ID = "_root_";
    private static final StringQualifier rootScopeQualifier = QualifierKt._q(ROOT_SCOPE_ID);
    private final Koin _koin;
    private final HashSet<Qualifier> _scopeDefinitions;
    private final Map<String, Scope> _scopes;
    private final Scope rootScope;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007f\u0007ll?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\fa(~:\t}P>˪AН^\u000bKƤV0\u0007mDI\u0004|\u0014܈e˲DņC?UڎM;fyD\u000584(>\b\fи\u001e2"}, d2 = {"\u001ana4\"2HW\"Hxh9|R<e\u0002,\nO\u000e+`5m\u0018Gv\u00125[\u0002.Fz*l+MCv0'\u0019rj\u000f", "", "u(E", " N>!R\u001a\u001c=\u0004^tB\u000b", "", "@n^AF*H^\u0019j\u000bZ3\u0001\n3e\r", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011]\u001dIz.7E\u000e\u001c>q\u00172MP\u0011", "5dc\u001fb6MA\u0017\t\u0006^\u0018\r\u00056i\u0001,{M?\u0013 Py\u001d8\u0006)?b\f", "5dc\u001fb6MA\u0017\t\u0006^\u0018\r\u00056i\u0001,{M", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\f8wG\u0005\u0018\u001bG|W*\u000629b\u007f\fGi\u001d2NG;x\n", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getRootScopeQualifier$annotations() {
        }

        public final StringQualifier getRootScopeQualifier() {
            return ScopeRegistry.rootScopeQualifier;
        }
    }

    public ScopeRegistry(Koin _koin) {
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this._koin = _koin;
        HashSet<Qualifier> hashSet = new HashSet<>();
        this._scopeDefinitions = hashSet;
        Map<String, Scope> mapSafeHashMap = KoinPlatformTools.INSTANCE.safeHashMap();
        this._scopes = mapSafeHashMap;
        Scope scope = new Scope(rootScopeQualifier, ROOT_SCOPE_ID, true, _koin);
        this.rootScope = scope;
        hashSet.add(scope.getScopeQualifier());
        mapSafeHashMap.put(scope.getId(), scope);
    }

    private final void closeAllScopes() {
        Iterator it = CollectionsKt.toList(this._scopes.values()).iterator();
        while (it.hasNext()) {
            ((Scope) it.next()).close();
        }
    }

    public static /* synthetic */ Scope createScope$default(ScopeRegistry scopeRegistry, String str, Qualifier qualifier, Object obj, int i2, Object obj2) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            obj = null;
        }
        return scopeRegistry.createScope(str, qualifier, obj);
    }

    public static /* synthetic */ void getRootScope$annotations() {
    }

    private final void loadModule(Module module) {
        this._scopeDefinitions.addAll(module.getScopes());
    }

    public final void close$koin_core() {
        closeAllScopes();
        this._scopes.clear();
        this._scopeDefinitions.clear();
    }

    public final Scope createScope(String scopeId, Qualifier qualifier, Object obj) throws ScopeAlreadyCreatedException {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        this._koin.getLogger().debug("| (+) Scope - id:'" + scopeId + "' q:'" + qualifier + '\'');
        if (!this._scopeDefinitions.contains(qualifier)) {
            this._koin.getLogger().debug("| Scope '" + qualifier + "' not defined. Creating it ...");
            this._scopeDefinitions.add(qualifier);
        }
        if (this._scopes.containsKey(scopeId)) {
            throw new ScopeAlreadyCreatedException("Scope with id '" + scopeId + "' is already created");
        }
        Scope scope = new Scope(qualifier, scopeId, false, this._koin, 4, null);
        if (obj != null) {
            this._koin.getLogger().debug("|- Scope source set id:'" + scopeId + "' -> " + obj);
            scope.set_source(obj);
        }
        scope.linkTo(this.rootScope);
        this._scopes.put(scopeId, scope);
        return scope;
    }

    public final void deleteScope$koin_core(String scopeId) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Scope scope = this._scopes.get(scopeId);
        if (scope != null) {
            deleteScope$koin_core(scope);
        }
    }

    public final void deleteScope$koin_core(Scope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this._koin.getInstanceRegistry().dropScopeInstances$koin_core(scope);
        this._scopes.remove(scope.getId());
    }

    public final Scope getRootScope() {
        return this.rootScope;
    }

    public final Set<Qualifier> getScopeDefinitions() {
        return this._scopeDefinitions;
    }

    public final Scope getScopeOrNull(String scopeId) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        return this._scopes.get(scopeId);
    }

    public final void loadScopes(Set<Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Iterator<T> it = modules.iterator();
        while (it.hasNext()) {
            loadModule((Module) it.next());
        }
    }
}
