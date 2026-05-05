package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: PersistentOrderedMap.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&˛\bDRш|\u0004G\u000b8\u000b<K\u0007\"2!}ј|ʑa2J͜V-\u0003SX\u000f,\t:8k(\u007fDSUPԂ̀\rO\\i(\u0006Pn\u001bG\u001d\u0007.x!ߚY[\u0007`*\u0011HA\u001e?ݯQoK=!\u0014F\t.3:80ڎ\u0011 8K(x\u0011By\f\"6NuRT#L3\u001aŪ\n>.\u0007fpu`NN|_J/YɅ\u0018ĩ~-mC\u0015O#E\u0003'U\u000bo2CFG7%%\nΈ5Ѹ\fE\u0011T\n?\u001bgU's`\u0002mN^\u0010\u0016%+\u0006Օ\föV`\u0013hx\f]˃յgK^&x\u0007\t\u0003%<2\u0016<kρ212h\u000e\u0017A~CbN[\u001a^p\b1&ي\u001b)\u001851E)p\"rI\u001ef9\u0012\u0004;\u001eţ\u0005t)żl\u0010f\")bHb?TX?^M8Yǀq\nxç\u001a,\n?U\u000e\u007f\r\u001f//%mكޠ')s\u0002VU\u007fx\u000bpva\u05c8Va"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WKFh\u000e\u001a\u001a\u001cDjyQ@\u001dFy\"u@\u0011dQ#F}PGEa\u001b`\u0013o\u001d2", "$", "", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", ">qTC\\6Na", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq>", "<dgA", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d\u0010?", "6`b\u001bX?M", "", "5dc\u0015T:'S,\u000e", "u(I", "6`b\u001de,OW#\u000f\t", "5dc\u0015T:)`\u0019\u0010~h<\u000b", "5dc\u001bX?M", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "5dc\u001de,OW#\u000f\t", "5dc#T3NS", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "Ehc5A,Qb", "<df\u001bX?M", "Ehc5C9>d\u001d\t\u000bl", "<df\u001de,OW#\u000f\t", "Ehc5I(Ec\u0019", "<df#T3NS", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wZSDz8&\u00152aL\u0016c9Wr.\u0011RX;cV{P]\u0010d\u0015U+\u000b\u0014]K-|\u000e;'\u0010<X}8o\u0001U\u001a\u0016@qpJV\u0019Vu$yK2v\u0010d_\u0007UESq*m\u001bI*[:G$\u0013Y\u0015&272\u0013\u0002S\u0010cN\u0001wg\u001d", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LinkedValue<V> {
    public static final int $stable = 8;
    private final Object next;
    private final Object previous;
    private final V value;

    public LinkedValue(V v2, Object obj, Object obj2) {
        this.value = v2;
        this.previous = obj;
        this.next = obj2;
    }

    public final Object getNext() {
        return this.next;
    }

    public final Object getPrevious() {
        return this.previous;
    }

    public final V getValue() {
        return this.value;
    }

    public LinkedValue(V v2) {
        this(v2, EndOfChain.INSTANCE, EndOfChain.INSTANCE);
    }

    public LinkedValue(V v2, Object obj) {
        this(v2, obj, EndOfChain.INSTANCE);
    }

    public final LinkedValue<V> withValue(V v2) {
        return new LinkedValue<>(v2, this.previous, this.next);
    }

    public final LinkedValue<V> withPrevious(Object obj) {
        return new LinkedValue<>(this.value, obj, this.next);
    }

    public final LinkedValue<V> withNext(Object obj) {
        return new LinkedValue<>(this.value, this.previous, obj);
    }

    public final boolean getHasNext() {
        return this.next != EndOfChain.INSTANCE;
    }

    public final boolean getHasPrevious() {
        return this.previous != EndOfChain.INSTANCE;
    }
}
