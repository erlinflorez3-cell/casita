package org.koin.core.definition;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;
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
@KoinDslMarker
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&˛\bDRш|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP.hS2\u000f\u0002{<$q$yCQU\"Ԃ*\teNo˧vJh)K\u000f\f\u0016\u0001j:R]xc\u0017\u00172XoG3S\rE9nz>\u0005&3*8\b\u0011\tɝ0Ђ\u0016\rٙkM\u0012۵>?!:\u0001\r\u000em*\u0016\u0014?8\u0001L^wVDK\u0005aJ/)\u0004\u0018F^/e0\u000bR%Hj&;xqC9FOV%'c\u00035ZkA\u0013? F\u0015j7'aɞ\"^\u001f^\u0010\u0016%+\u0006Օ<|͉`\u0005Wk\u001c+9[{K~\u001b8\b\u0001{\u001bJ\u001c\u0018\u0016-X2=\u001al\t<7#\u0002ՂDP\u0010n\u000b\u0007\t\u0010N\u0017S\u0002yۆ:cq_\u0011S\u001d^7\u0002\u0006;\"iѮoidb>x\u00171S&SwӌA\u0006p\\;q^}\u0006\u0001b02\u00142W\u007f]\u0005!0'%mكg*\nq\u0012JTg-ݓ?rרmRNKhĉ\u0017\u007f1\u0017>rD\u0013\u00122óU!=\u001f\u00014^\u0017\u0004\u0018\u00170\\}=O)>]\u0016Ɲj3Hk>=5v9in\"ލ\u0006ު\u000f9;Qq\u0011yR%\u0016oFh\u0005fiZW\u001cZb)P6xr\u0016w\nIf\u000e)1msL[21'b-i\u0013 RA+\u0011o\\x\u0010-]C&\u0013iZڏ7\b9b\u0001qwx\u007fؓ[jĘ1AW@I,[\"v@\u0015#5\f$\u0010MgZUdv&{e\u007f0\u0016 :\u007f3k\"Uɶ(z\u0013;zdr\u0014c}\u001851\u0015{%:\u0017..Ťj9<n\"bO\u0003)R~l+;\ft\u007f\u007fbt~\u0010ibDs>w-Im\u0005pF8\u001d\u001fL71w05M1S'#\u0017&\u0018_\u001bob\u0002qDx\u0011\u0011Vxs@DcDq+WkoS8w\u0018ERrFz\u0014ZH\u0019\n>ȷGͩc\u038bTыh\u0003^Е]\r5\u0011t\u001bD\u000fvkiP3q\u0004K<wz\u0012Q\u0017,dS'!M\n܊\u001c\b\"œ\u0017Ί\u0013\u0016\u0013֊Ip\u00187K<vYh&>$DHDGS\u0004\u0015>\u0019$b4L\n\u001bC\u0003r\u0016\u0012\u000b\u007f|ܪ=\u001e\u001bH\u0004=f\u000e\u000bۿ;`߃\t`KkՃ.\u0007\u0007۰K ~T?%>Ub;{2/`\u009b\r!rʪ\u0017h+LRv\n.6[\u0019\u000fU]IJ0:\u0086K/u \b\u000e>;\u000bA\u00132)>i\u0013uu^`a٤p͒h\u0003\u001aצjP(N\r!\u001d\u0010B1\u001d3i^\u0001pz-zPߺ;I\"݅/F/0\u001a#4h);\u001e?=CYn$'\u0002X\u0002?,\u0017vð3ؗx-dަ&h\u0010\b)e6s\u001c\u000f\u00106\u07b9T_"}, d2 = {"\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9j<r.\u0014Y~$@q%2WL\u0011", "\"", "", "Ab^=X\u0018NO \u0003{b,\n", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", ">qX:T9RB-\nz", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "?tP9\\-BS&", "2dU6a0MW#\b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9l<w)>]\r$Avk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "9h]1", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9s@\u007f$\u000b", "AdR<a+:`-m\u000fi,\u000b", "", "uK^?ZuD]\u001d\bD\\6\n\txq\u0010$\u0003D\u0002\u001b\u0017T9yLr,9Z\u0002 DC|4WRBo=g\"hb@\u0007a;\u0018\\\u0005NH\\:29|J\u0016[`\u0018R4V\u0003cN$8PG\u001b\u000f0J\u0006;uJw&\n<nqFV\u001d\u001d`\u001b\u007fP0lO#d\u000bO\u000bFr3b\u001bc'eH\u0004\u0005$z\u0017*lZ7VQ:\u001b\u007fTCmqK\"D6.Km%EEpYEx6#U\u0005Aw6as\u0001[2\u007fE&\u007ft\u0014Ona%b\u0007$\u0002 2", "-ba2T;>Rt\u000ehm(\n\u0018", "", "5dc,V9>O(~y:;j\u0018+r\u000ffwI\n!&C~\u0012F\u007f3", "u(E", "5dc,V9>O(~y:;j\u0018+r\u000f", "u(I", "Adc,V9>O(~y:;j\u0018+r\u000f", "uY\u0018#", "1`[9U(<Y'", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9k8},2U{&EC", "5dc\u0010T3EP\u0015|\u0001l", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//~(|D\n\u001b&Ky\u0017\u0006T!<`z\u001c5s$\u0004", "Adc\u0010T3EP\u0015|\u0001l", "uK^?ZuD]\u001d\bD\\6\n\txd\u007f)\u007fI\u0005&\u001bQxW\u001ar,<Vy\u001e={kq>", "5dc\u0011X-B\\\u001d\u000e~h5", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "5dc\u0018\\5=", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//~(|D\n\u001b&Ky\u0017\u0006\\)>XS", "5dc\u001de0FO&\u0013ir7|", "u(;8b;EW\"H\b^-\u0004\t-tI\u000eYG|%%\u001d", "5dc\u001eh(EW\u001a\u0003zk", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\f8wG\u0005\u0018\u001bG|W(\u0007!<]~$7zk", "Adc\u001eh(EW\u001a\u0003zk", "uK^?ZuD]\u001d\bD\\6\n\txq\u0010$\u0003D\u0002\u001b\u0017T9yLr,9Z\u0002 DCY\u001f", "5dc V6IS\u0005\u000fve0}\r/r", "5dc X*H\\\u0018z\br\u001b\u0011\u0014/s", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc X*H\\\u0018z\br\u001b\u0011\u0014/s", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n_F", "3pd._:", "=sW2e", "6`b!l7>", "1kPGm", "6`b566=S", "", "7r", "Ab^=X\u000b>T\u001d\b~m0\u0007\u0012", "BnBAe0GU", "", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class BeanDefinition<T> {
    private boolean _createdAtStart;
    private Callbacks<T> callbacks;
    private final Function2<Scope, ParametersHolder, T> definition;
    private final Kind kind;
    private final KClass<?> primaryType;
    private Qualifier qualifier;
    private final Qualifier scopeQualifier;
    private List<? extends KClass<?>> secondaryTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public BeanDefinition(Qualifier scopeQualifier, KClass<?> primaryType, Qualifier qualifier, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition, Kind kind, List<? extends KClass<?>> secondaryTypes) {
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(primaryType, "primaryType");
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        this.scopeQualifier = scopeQualifier;
        this.primaryType = primaryType;
        this.qualifier = qualifier;
        this.definition = definition;
        this.kind = kind;
        this.secondaryTypes = secondaryTypes;
        this.callbacks = new Callbacks<>(null, 1, null);
    }

    public /* synthetic */ BeanDefinition(Qualifier qualifier, KClass kClass, Qualifier qualifier2, Function2 function2, Kind kind, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(qualifier, kClass, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? null : qualifier2, function2, kind, (i2 + 32) - (i2 | 32) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeanDefinition copy$default(BeanDefinition beanDefinition, Qualifier qualifier, KClass kClass, Qualifier qualifier2, Function2 function2, Kind kind, List list, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            qualifier = beanDefinition.scopeQualifier;
        }
        if ((2 & i2) != 0) {
            kClass = beanDefinition.primaryType;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            qualifier2 = beanDefinition.qualifier;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            function2 = beanDefinition.definition;
        }
        if ((i2 + 16) - (16 | i2) != 0) {
            kind = beanDefinition.kind;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            list = beanDefinition.secondaryTypes;
        }
        return beanDefinition.copy(qualifier, kClass, qualifier2, function2, kind, list);
    }

    public static /* synthetic */ void get_createdAtStart$annotations() {
    }

    public final Qualifier component1() {
        return this.scopeQualifier;
    }

    public final KClass<?> component2() {
        return this.primaryType;
    }

    public final Qualifier component3() {
        return this.qualifier;
    }

    public final Function2<Scope, ParametersHolder, T> component4() {
        return this.definition;
    }

    public final Kind component5() {
        return this.kind;
    }

    public final List<KClass<?>> component6() {
        return this.secondaryTypes;
    }

    public final BeanDefinition<T> copy(Qualifier scopeQualifier, KClass<?> primaryType, Qualifier qualifier, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition, Kind kind, List<? extends KClass<?>> secondaryTypes) {
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(primaryType, "primaryType");
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        return new BeanDefinition<>(scopeQualifier, primaryType, qualifier, definition, kind, secondaryTypes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        BeanDefinition beanDefinition = (BeanDefinition) obj;
        return Intrinsics.areEqual(this.primaryType, beanDefinition.primaryType) && Intrinsics.areEqual(this.qualifier, beanDefinition.qualifier) && Intrinsics.areEqual(this.scopeQualifier, beanDefinition.scopeQualifier);
    }

    public final Callbacks<T> getCallbacks() {
        return this.callbacks;
    }

    public final Function2<Scope, ParametersHolder, T> getDefinition() {
        return this.definition;
    }

    public final Kind getKind() {
        return this.kind;
    }

    public final KClass<?> getPrimaryType() {
        return this.primaryType;
    }

    public final Qualifier getQualifier() {
        return this.qualifier;
    }

    public final Qualifier getScopeQualifier() {
        return this.scopeQualifier;
    }

    public final List<KClass<?>> getSecondaryTypes() {
        return this.secondaryTypes;
    }

    public final boolean get_createdAtStart() {
        return this._createdAtStart;
    }

    public final boolean hasType(KClass<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return Intrinsics.areEqual(this.primaryType, clazz) || this.secondaryTypes.contains(clazz);
    }

    public int hashCode() {
        Qualifier qualifier = this.qualifier;
        return ((((qualifier != null ? qualifier.hashCode() : 0) * 31) + this.primaryType.hashCode()) * 31) + this.scopeQualifier.hashCode();
    }

    public final boolean is(KClass<?> clazz, Qualifier qualifier, Qualifier scopeDefinition) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(scopeDefinition, "scopeDefinition");
        return hasType(clazz) && Intrinsics.areEqual(this.qualifier, qualifier) && Intrinsics.areEqual(this.scopeQualifier, scopeDefinition);
    }

    public final void setCallbacks(Callbacks<T> callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "<set-?>");
        this.callbacks = callbacks;
    }

    public final void setQualifier(Qualifier qualifier) {
        this.qualifier = qualifier;
    }

    public final void setSecondaryTypes(List<? extends KClass<?>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.secondaryTypes = list;
    }

    public final void set_createdAtStart(boolean z2) {
        this._createdAtStart = z2;
    }

    public String toString() {
        String str;
        String string = this.kind.toString();
        String str2 = "'" + KClassExtKt.getFullName(this.primaryType) + '\'';
        if (this.qualifier == null || (str = ",qualifier:" + this.qualifier) == null) {
            str = "";
        }
        return "[" + string + AbstractJsonLexerKt.COLON + str2 + str + (Intrinsics.areEqual(this.scopeQualifier, ScopeRegistry.Companion.getRootScopeQualifier()) ? "" : ",scope:" + this.scopeQualifier) + (this.secondaryTypes.isEmpty() ? "" : ",binds:" + CollectionsKt.joinToString$default(this.secondaryTypes, ",", null, null, 0, null, new Function1<KClass<?>, CharSequence>() { // from class: org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(KClass<?> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return KClassExtKt.getFullName(it);
            }
        }, 30, null)) + AbstractJsonLexerKt.END_LIST;
    }
}
