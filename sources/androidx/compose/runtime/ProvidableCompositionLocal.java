package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nj?4Le^.ZS@\u000fs{J$c$wCCU0}*\tUPm\r\u0005Ϻ\u0003\rIƤ\u0014\u0015)p<Kex$\u0011=2\u0003\u0003E\u074c]yK:xzF\u000702X\u0600(\u0007в\u001e*V\u0013?\u0016QO$\u0018@B\u0001:\t҈{\nJ\u0016\u0014D8\u0001Tձ.lɇLncA=+K\u0004PW?e@~]\r|ÖU\u0012'e,1X7kՖkٌ\u0005\u07baV[M\u000b\b\u0018K\u000f\u0001-7-Ys\u000e̬\u0007\u0005D*9Z%n\u0003(l\u0005\u007fm\u001c);O\u001a֟~\u001a߭{z\u0002\u001b\u0003ǐ\u0010NAV=E v\n\u001e3+Ɂ\u0002E\u0001\u0006lH\u0018z\u0018ا]Ӣ\u0002Ĵ/9)n\u001a\u0011I)f=\f\u0007\u001d\u001eYЧ\u001d2\f^\u001cf-!dya1\b̵kM~\u0016gO\u0006\f\u0001d\u0012*:\u0382]~]\rW<ϲ)7aLk;y\u0016`Jwx\u0015`\u001fׅ\u0018cxJ0t.=:\u000b\u001cZzߟ3p\u0017Tй0&"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xI\u000169Xy\u001d>ms8UNEy8-\u0019rj \u0011a(UL", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0015WA7r\n", "2dU.h3M4\u0015|\nh9\u0011", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", "2dU.h3M>&\t\fb+|\b a\u00078{", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xI\u000169X}\u001f(i\u001d>M\u0019", "D`[BX", "2dU.h3M>&\t\fb+|\b a\u00078{~\u000e' Vs\u0016<p25`}\u001cEm", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wZSDz8&\u00152LF\u0011t0Mv&8HU<\\(", ">q^C\\+>a", ">q^C\\+>av\t\u0003i<\f\t.", "1n\\=h;>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0015WA7r\u0010\u001c\u0013hoG\u0011p\u001aL\u00012G\"", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ">q^C\\+>aw~{Z<\u0004\u0018", "CoS.g,=A(z\n^\u0016}", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9~8}55<\b'6m#\u0004", ">qTC\\6Na", "CoS.g,=A(z\n^\u0016}G<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "D`[BX\u000fHZ\u0018~\bH-", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class ProvidableCompositionLocal<T> extends CompositionLocal<T> {
    public static final int $stable = 0;

    public abstract ProvidedValue<T> defaultProvidedValue$runtime_release(T t2);

    public ProvidableCompositionLocal(Function0<? extends T> function0) {
        super(function0, null);
    }

    public final ProvidedValue<T> provides(T t2) {
        return defaultProvidedValue$runtime_release(t2);
    }

    public final ProvidedValue<T> providesDefault(T t2) {
        return defaultProvidedValue$runtime_release(t2).ifNotAlreadyProvided$runtime_release();
    }

    public final ProvidedValue<T> providesComputed(Function1<? super CompositionLocalAccessorScope, ? extends T> function1) {
        return new ProvidedValue<>(this, null, false, null, null, function1, false);
    }

    @Override // androidx.compose.runtime.CompositionLocal
    public ValueHolder<T> updatedStateOf$runtime_release(ProvidedValue<T> providedValue, ValueHolder<T> valueHolder) {
        DynamicValueHolder dynamicValueHolder = null;
        if (valueHolder instanceof DynamicValueHolder) {
            if (providedValue.isDynamic$runtime_release()) {
                dynamicValueHolder = (DynamicValueHolder) valueHolder;
                dynamicValueHolder.getState().setValue(providedValue.getEffectiveValue$runtime_release());
            }
            dynamicValueHolder = dynamicValueHolder;
        } else if (valueHolder instanceof StaticValueHolder) {
            if (providedValue.isStatic$runtime_release()) {
                StaticValueHolder staticValueHolder = (StaticValueHolder) valueHolder;
                if (Intrinsics.areEqual(providedValue.getEffectiveValue$runtime_release(), staticValueHolder.getValue())) {
                    dynamicValueHolder = staticValueHolder;
                }
            }
            dynamicValueHolder = dynamicValueHolder;
        } else if (valueHolder instanceof ComputedValueHolder) {
            ComputedValueHolder computedValueHolder = (ComputedValueHolder) valueHolder;
            if (providedValue.getCompute$runtime_release() == computedValueHolder.getCompute()) {
                dynamicValueHolder = computedValueHolder;
            }
            dynamicValueHolder = dynamicValueHolder;
        }
        return dynamicValueHolder == null ? valueHolderOf(providedValue) : dynamicValueHolder;
    }

    private final ValueHolder<T> valueHolderOf(ProvidedValue<T> providedValue) {
        if (!providedValue.isDynamic$runtime_release()) {
            return providedValue.getCompute$runtime_release() != null ? new ComputedValueHolder(providedValue.getCompute$runtime_release()) : providedValue.getState$runtime_release() != null ? new DynamicValueHolder(providedValue.getState$runtime_release()) : new StaticValueHolder(providedValue.getEffectiveValue$runtime_release());
        }
        MutableState<T> state$runtime_release = providedValue.getState$runtime_release();
        if (state$runtime_release == null) {
            T value = providedValue.getValue();
            SnapshotMutationPolicy<T> mutationPolicy$runtime_release = providedValue.getMutationPolicy$runtime_release();
            if (mutationPolicy$runtime_release == null) {
                mutationPolicy$runtime_release = SnapshotStateKt.structuralEqualityPolicy();
            }
            state$runtime_release = SnapshotStateKt.mutableStateOf(value, mutationPolicy$runtime_release);
        }
        return new DynamicValueHolder(state$runtime_release);
    }
}
