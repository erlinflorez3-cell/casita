package androidx.compose.runtime;

import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: CompositionLocalMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d̉=!4i\bӵLc\u0003\u0013I\u0006F\u000b6B\u0005$4\u0012\u0006\u0010nj?0Le^.ZS0\u000fs{J$c$\u007ffCU(Ԃ*\teNog|Jb\u000bI\u0010\u001eG\u0007̓DI\u0004w\u000e\"\u001d2Z{O;SnM=pt<\u0006N4P9*\t\u000f\u001dBH>u+IQ\f 4XphQS˟ŋ\u001e\u0012\u0014C8\u001f,b\u007fNdO\r_@ǂ1\u000b\u0012B|&\u0010:\u000bV%Ld)\u001dv(&YJ}ߎ-`a\u000e\u001fR\n>+? <5\u001553Cq\u0004uFt\u0010\u001e%3_\u0011mt<[3`\u000f\u001675_k[T\u001e*\u000ey*\u001cj\u0014<\u00147J>-Hw6\u001byπxkc^\u0014vBF\u0003\u00028\u001dӛ\u000e;S9Ie\u0002kI\"f=\f\u0007\u001d\u001ei\t\u001d+\"٪\u05f8d\u0015)gɖUE"}, d2 = {"CoS.g,\u001c]!\n\u0005l0\f\r9ng$\u0007", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9x<\u000439g\r @|s8UNEy8-\u0019rj \u0011a(U^#R\"", "D`[BX:", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xI\u000169X}\u001f(i\u001d>M\u0019", ">`a2a;,Q#\nz", ">qTC\\6Na", "uZ;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006a2?j\u0002\u001f7l\u0007*TS;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u007fM\u001d!^\u0016Ntw\u0005fO(|S7(\u0017\nS\nFr\u000f\u0010%\u0012?sWLT\fNa\u0011\u0001\u0017\u0010dOXl\u0004K@X,(n\u0014j'j:\u00041$z(\u001fpPwt{`\u001fv`\tgpVv\u0005@/H{_UIy^#~%\u001bRcs\u001d\b\u001c['},\u0011>.5wNIq Ih\u0007\u0015uiQ05:D\u0013\t6c\u0003zB\u001cw\u001fj\u0017kl=<#sirL\u0019\u0010D!Y1hG|B(", "1n]AT0Ga", "", "\"", "9dh", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0015WA7r\n", ";tc.g,", ";tc.g6K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9~8}55<\b'6m#\u0004", "", "@dP1", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW'v2C]\f/7v%\fWKFuB\"$lkBmm*J}\u000fCW$\u0013X[qJ\u001e\u0016Y!\u0018)\u0017\rdK2n\u000eD/\u0011;M\n;2^\u0016\u001e\u0019?xtQZ\u001aP`\u001fs=0>\n@duX=\u000fi&m\u000e)\u0007Y?:\"#G", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CompositionLocalMapKt {
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    public static final PersistentCompositionLocalMap mutate(PersistentCompositionLocalMap persistentCompositionLocalMap, Function1<? super Map<CompositionLocal<Object>, ValueHolder<Object>>, Unit> function1) {
        PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builderBuilder2 = persistentCompositionLocalMap.builder2();
        function1.invoke(builderBuilder2);
        return builderBuilder2.build2();
    }

    public static final <T> boolean contains(PersistentCompositionLocalMap persistentCompositionLocalMap, CompositionLocal<T> compositionLocal) {
        Intrinsics.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return persistentCompositionLocalMap.containsKey(compositionLocal);
    }

    public static final <T> T read(PersistentCompositionLocalMap persistentCompositionLocalMap, CompositionLocal<T> compositionLocal) {
        Intrinsics.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        ValueHolder defaultValueHolder$runtime_release = persistentCompositionLocalMap.get((Object) compositionLocal);
        if (defaultValueHolder$runtime_release == null) {
            defaultValueHolder$runtime_release = compositionLocal.getDefaultValueHolder$runtime_release();
        }
        return (T) defaultValueHolder$runtime_release.readValue(persistentCompositionLocalMap);
    }

    public static /* synthetic */ PersistentCompositionLocalMap updateCompositionMap$default(ProvidedValue[] providedValueArr, PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            persistentCompositionLocalMap2 = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
        }
        return updateCompositionMap(providedValueArr, persistentCompositionLocalMap, persistentCompositionLocalMap2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    public static final PersistentCompositionLocalMap updateCompositionMap(ProvidedValue<?>[] providedValueArr, PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        PersistentCompositionLocalMap.Builder builderBuilder2 = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf().builder2();
        PersistentCompositionLocalMap persistentCompositionLocalMap3 = persistentCompositionLocalMap2;
        for (ProvidedValue<?> providedValue : providedValueArr) {
            CompositionLocal<?> compositionLocal = providedValue.getCompositionLocal();
            Intrinsics.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            ProvidableCompositionLocal providableCompositionLocal = (ProvidableCompositionLocal) compositionLocal;
            if (providedValue.getCanOverride() || !contains(persistentCompositionLocalMap, providableCompositionLocal)) {
                ValueHolder valueHolder = (ValueHolder) persistentCompositionLocalMap3.get((Object) providableCompositionLocal);
                Intrinsics.checkNotNull(providedValue, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                builderBuilder2.put(providableCompositionLocal, providableCompositionLocal.updatedStateOf$runtime_release(providedValue, valueHolder));
            }
        }
        return builderBuilder2.build2();
    }
}
