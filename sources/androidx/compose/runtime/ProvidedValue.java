package androidx.compose.runtime;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&˛\bDRш|İI\u0006F\u000b6B\u0005\"4\u0012\u0006\u0010nʑA0ZeP\u008cZS@\u000fsڔ<$q$yCQU\"}8\tWNm\u0003tOpŏk\u0011\fǝ\u0007i\\I\u0004x\u001ez\u0015˰RyM4euM;ptlӌN42>\b\b\u0019\u001c@GF͌\u000bGY\u0010*0nuJ^\u001bS\u001d\"\"\bN 7Ȧrf|=XxkBG+\u0013kRN]ڿF{{\u0016Vk5\u0017\u000ft.-P7c!5U\u0013\u0007\t¹U\u0002m|ݘ\th-4;M\u0002eNX.\u0019Ʀ/O\u001bl;7j-if\u001c);O\u001a֟~ʫn»ߡ\u007f\rB-^$5YF-Hk8\u0012A\u0005\u000bSnU8$\u0001@QʯBа)\u0006;ٿQ\u001dlcoNicE|\u001d\u0013.%\u0011nWż\u0003\u0010\u05ce\u0019!\\ȭi3WTK]\u001f/gG\u0006\u0017\u0001d\u0012*2<W\u0002?{Gф-$efޠ'!q\u000f\u001fִiЛ\tfpׅ\u0002TNV0\u0006fO8!$Zzߟ;*'ӺZ¯\u0015W,V\r\u0017\u0016-8^}W/A`Z]l\u0002j{b`ɛ1Ϭ;Yv\u0088^iGlK5\u007fhfСTλ\u0018EDϵ\u001dZl_a\u001f+n6@JH\u0019\u0015.:\u001b\u0089\u000eƱ6C\n\u001e:K?,-/V\t6JQ~\u0019_\u0011Ӑ&}\u0003:zѱk˨x\u000f\tˆtru\b\u0007j|\rnDECg4Oğ,ȫjط\u0001%\u000f~\u0002#\u0018\u0002ZOdt&we{Vچ08\u007f8\u0014Р\u0011ɒ-8\nΏ]Nx\n_rb<\t\u007f\u0012\u000fqÜd,Űnz<bpp]n/$|\u0006\u0001?ϑh*"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xI\u000169X}\u001f(i\u001d>M\u0019", "\"", "", "1n\\=b:Bb\u001d\t\u0004E6z\u00056", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0015WA7r\n", "D`[BX", "3w_9\\*Bb\u0002\u000f\u0002e", "", ";tc.g0H\\\u0004\t\u0002b*\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Er0C\\\b/\u001f}%*\\GEt\u001f(\u001cl_M\\", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "1n\\=h;>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0015WA7r\u0010\u001c\u0013hoG\u0011p\u001aL\u00012G\"", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "7r3Fa(FW\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f$Fq 74M9g;s{m]J\u0003-3J\u007f)\u00116K1\\P\u0002\u0013\txV\u0017M8\u0017\tXTmlN?*\u0012:IKHx\n\u001b\u001a\u001654^KR\u001bU|\u001f\u0005)9wBhc\u0004P,Oi.b 5\u0004XC91\u001eu\u0018.2N8\u0012\u0007]\u001fr\u001c\u0007wpV\u001d\u00038m&}jBBvU*\u0004#.KQ^\u0018<g{/}v\tE2\u007fe\u0015Te'Bh\u0002#u=Q0$E@\u001dH\u00179j0/", "\nrTA \u0006\u0017", "1`]\u001ci,K`\u001d}z", "5dc\u0010T5(d\u0019\f\bb+|", "u(I", "5dc\u0010b4I]'\u0003\nb6\u0006o9c{/", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.;|\u001a8V*Ei0%j", "5dc\u0010b4Ic(~9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "3eU2V;Bd\u0019ove<|", "5dc\u0012Y->Q(\u0003\f^\u001dx\u0010?e>5\fI\u0010\u001b\u001fGi\u001b<}%1g}^3v\u001f8\\?Jo>'#", "u(E", "5dc\u0012Y->Q(\u0003\f^\u001dx\u0010?e>5\fI\u0010\u001b\u001fGi\u001b<}%1g}", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "7r3Fa(FW\u0017=\bn5\f\r7ey5{G\u0001\u0013%G", "7rBAT;BQ", "7rBAT;BQW\f\u000bg;\u0001\u0011/_\r(\u0003@|%\u0017", "5dc\u001ah;:b\u001d\t\u0004I6\u0004\r-y>5\fI\u0010\u001b\u001fGi\u001b<}%1g}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d.1d\f#A|}>\\?Jo>'\u007frh=\u0005w\u0002", ">q^C\\+>R\nz\u0002n,", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "5dc g(MSW\f\u000bg;\u0001\u0011/_\r(\u0003@|%\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006^5DUz'7[%*\\C\u0011", "5dc#T3NSWz\u0004g6\f\u0005>i\n1\n", "5dc#T3NS", "7e=<g\bE`\u0019zyr\u0017\n\u0013@i~(z", "7e=<g\bE`\u0019zyr\u0017\n\u0013@i~(z~\u000e' Vs\u0016<p25`}\u001cEm", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ProvidedValue<T> {
    public static final int $stable = 8;
    private boolean canOverride = true;
    private final CompositionLocal<T> compositionLocal;
    private final Function1<CompositionLocalAccessorScope, T> compute;
    private final boolean explicitNull;
    private final boolean isDynamic;
    private final SnapshotMutationPolicy<T> mutationPolicy;
    private final T providedValue;
    private final MutableState<T> state;

    public static /* synthetic */ void getEffectiveValue$runtime_release$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProvidedValue(CompositionLocal<T> compositionLocal, T t2, boolean z2, SnapshotMutationPolicy<T> snapshotMutationPolicy, MutableState<T> mutableState, Function1<? super CompositionLocalAccessorScope, ? extends T> function1, boolean z3) {
        this.compositionLocal = compositionLocal;
        this.explicitNull = z2;
        this.mutationPolicy = snapshotMutationPolicy;
        this.state = mutableState;
        this.compute = function1;
        this.isDynamic = z3;
        this.providedValue = t2;
    }

    public final CompositionLocal<T> getCompositionLocal() {
        return this.compositionLocal;
    }

    public final SnapshotMutationPolicy<T> getMutationPolicy$runtime_release() {
        return this.mutationPolicy;
    }

    public final MutableState<T> getState$runtime_release() {
        return this.state;
    }

    public final Function1<CompositionLocalAccessorScope, T> getCompute$runtime_release() {
        return this.compute;
    }

    public final boolean isDynamic$runtime_release() {
        return this.isDynamic;
    }

    public final T getValue() {
        return this.providedValue;
    }

    public final boolean getCanOverride() {
        return this.canOverride;
    }

    public final T getEffectiveValue$runtime_release() {
        if (this.explicitNull) {
            return null;
        }
        MutableState<T> mutableState = this.state;
        if (mutableState != null) {
            return mutableState.getValue();
        }
        T t2 = this.providedValue;
        if (t2 != null) {
            return t2;
        }
        ComposerKt.composeRuntimeError("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }

    public final boolean isStatic$runtime_release() {
        return (this.explicitNull || getValue() != null) && !this.isDynamic;
    }

    public final ProvidedValue<T> ifNotAlreadyProvided$runtime_release() {
        this.canOverride = false;
        return this;
    }
}
