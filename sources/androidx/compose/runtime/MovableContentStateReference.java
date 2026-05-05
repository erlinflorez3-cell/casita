package androidx.compose.runtime;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{BBc$\bCCU0}*ޛWN}gvJ`\u001bI\u0014\u001cǝ)jZH\u0016Tc܈\u001f>PoW;]sM;vsd\u0004N32>\b\u0007\u0019\u001c@G>u\u000bGY\u000f*0ntJV\u001bR\u001d\u001a@\fN$\u000f%tg|>X\u0005kCG7\u0013yR\\7a@|{\u0019VX7\u000f\r`L*nBc\u001f5W\u0011\u0014j[m\u0011ӭu=\u0013ww99P\fWd`Vϭ\u0017ۣS\u0013eö>^\u000ban\u001dw=]fcP<,N\u07bf}Ɂ@\n\u0016ͺ?J4?(yX(At\u000b[PT\u0012`X~)`d\u0018{į5ڢ=!nϟy=\u001fbE\u0011U9,,\u0019\u00031kd\u001cp\u0017+T&]AUP?^M8Xkx2z9̤6˙4S\b\u07fc\u0014\u00134-3N{;)9y\u001b\u0019Vu\u0004\u001d`\u0017a@ɮJغ&t\u001eճB\u000b\u0012tR\u007fU\u007f^Vp.'LJS]ã\n˙$b\u007f˓9'\u0016j]\u0006:|[b\"%]l\u000eիp«\u0012]AӔK7W\u0002\u001e\u0001ؕz4"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR)z0-\u0015Ua:\u0007p,Wt'\u001d", "", "1n]AX5M", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR\u0011", ">`a.`,MS&", "1n\\=b:Bb\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF\u007f4Bc\u0005'7ls8UNEy8-\u0019rj\u000f", "Ak^AG(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014$Uz'7C", "/mR5b9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "7me._0=O(\u0003\u0005g:", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC\u001fs?%j", ":nR._:", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9x<\u000439g\r @|s8UNEy8-\u0019rj \u0011a(U^#R\"", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW$\u000161V\u0005 \u0015w\u001f=MLJA\u001b#\u0011y]\u0003\u000e_5P@\u0011DQN*k(Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ9Y\u000bJl\t\f_k?s\u007fO`\u0017Ny\u0014SK1sPgc\tKKN8\u0011`\u0015^*f>97]o##sZ<\nE`!{a}og\u0011\u0007\u0002B3-iXMEE<8}&,U\u007fv%{V~3\u007f7\u00124sCt\u000eZk >(T\u001e*_K4{\u001dA\u000fPG-\u0006{B\u00152\u0006e\u0016\u001d8\u001c-\"drmL\u000e\u001a'\u0015e=li\u000f7\u001c\u0013NR~\u0019/FH-[\u0007#\r\u00153mnX!%\\\f$~H1c\u001b\fip\u0016\u00185}9dd,\u001b", "5dc\u000ea*A]&=\bn5\f\r7ey5{G\u0001\u0013%G", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006R.3\\\b-\r", "5dc\u0010b4I]'\u0003\nb6\u0006G<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/>h\u000b*>t\u0016-+MCv>,\u0019weC\u00109", "5dc\u0010b5MS\"\u000e9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006^/FUz'7K 7\\CDz\n", "5dc\u0016a=:Z\u001d}vm0\u0007\u0012=$\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc\u0016a=:Z\u001d}vm0\u0007\u0012=$\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "5dc\u0019b*:Z'=\bn5\f\r7ey5{G\u0001\u0013%G", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006a%Bg\u0002.Fm\u001f=+MCv>,\u0019weC\u0010J6Lr./HY\u0002", "5dc\u001dT9:[\u0019\u000ezkj\n\u00198t\u00040{:\u000e\u0017\u001eGk\u001c<", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "5dc _6MB\u0015{\u0002^j\n\u00198t\u00040{:\u000e\u0017\u001eGk\u001c<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d,?hl\u001c4t\u0016\u0004", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MovableContentStateReference {
    public static final int $stable = 8;
    private final Anchor anchor;
    private final ControlledComposition composition;
    private final MovableContent<Object> content;
    private List<? extends Pair<RecomposeScopeImpl, ? extends Object>> invalidations;
    private final PersistentCompositionLocalMap locals;
    private final Object parameter;
    private final SlotTable slotTable;

    public MovableContentStateReference(MovableContent<Object> movableContent, Object obj, ControlledComposition controlledComposition, SlotTable slotTable, Anchor anchor, List<? extends Pair<RecomposeScopeImpl, ? extends Object>> list, PersistentCompositionLocalMap persistentCompositionLocalMap) {
        this.content = movableContent;
        this.parameter = obj;
        this.composition = controlledComposition;
        this.slotTable = slotTable;
        this.anchor = anchor;
        this.invalidations = list;
        this.locals = persistentCompositionLocalMap;
    }

    public final MovableContent<Object> getContent$runtime_release() {
        return this.content;
    }

    public final Object getParameter$runtime_release() {
        return this.parameter;
    }

    public final ControlledComposition getComposition$runtime_release() {
        return this.composition;
    }

    public final SlotTable getSlotTable$runtime_release() {
        return this.slotTable;
    }

    public final Anchor getAnchor$runtime_release() {
        return this.anchor;
    }

    public final List<Pair<RecomposeScopeImpl, Object>> getInvalidations$runtime_release() {
        return this.invalidations;
    }

    public final void setInvalidations$runtime_release(List<? extends Pair<RecomposeScopeImpl, ? extends Object>> list) {
        this.invalidations = list;
    }

    public final PersistentCompositionLocalMap getLocals$runtime_release() {
        return this.locals;
    }
}
