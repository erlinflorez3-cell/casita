package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
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
/* JADX INFO: compiled from: PersistentHashMapBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&i\u0006DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0R\u0007P.`x2\u000fq~<$i*yCAX\"}8\tWNmpvJp\u000bK\u000f\f\u001e\u0001j:f]xc\u0014\u00172PoG\u074cUoKBht<\u000b(20Z\u0002\u0005\u0007\u001b0V&͌#EQÈ /hr@Q\u001bM5&\"\bN G\u001dli^6\u000fl\f;_/\u0013kRNm^@~]\r\rTU\u000f7x.;N:M!5U\u0013\u0007\t¹O\u0005Oqs\u0004\u0017+ݳ/I\u0002\\~j\u000eB-7_\u000fmr\\ؘ\u0015Sp\f]*}g\u0012dV.\u0006*\u0014\rj4T\u001ao[<^2f6@cx\u0001\u0007XP8މ\t\u0014ѐe6%YHI9n3hg`q\u0018~;\n8%\u001eYЧ5Ħ[ڍ\u0012`#Q\u001d\u0015_hiBSG\u0005\t\nA{7\tb8Ï44U&G{G-]9ھ_91Y4\u001eV}\u007fv3\u0011\u0019ew\r`N2r\u001c6:\tBɮTf\u0015k\u0007S\u0007gWadi\u0015: \u00156[.;Q)\u001e\u0002gh Ҕ\u0014qܦ)/tm\"\byJo9\reeUqCyR-ܝo@p+pfxR۱^\\6_\u0003lx\u0016\u0010\u000eT\\\u001c\u001fBA\u0002\u001cjιA\u001bl\u0015~\u0002LJo\u0004?41ӧ\u0012њX7<\u0005o-\u0003\u0013Qhj{\bm\tK<|\u0017õ[H\b\noĶWɋl8\u0015%\r\u000b\u0002\n\u0018\u007fZJdx&we{Vچ*;a/s\u0012=\u0003\u007fɈ\u000eβILzό\"e 4\u0013|(\u001d\u0012Ý:Թ\fvxݚxlP^b'Bxd\u00041\u001a5$\bt^\u0007Wed\u000b\u0012ŬYt\u0013YrMf\u0011[ȕ*ݵ\u0005{*ĜM/I<+,\u0018\u00165,ou:\f<\u0013z\u0011<s\u001c\u0003\u0003Ϥ\"̔f_e2IVa[\u0005X0?\r\u0005Hdx\u0015Xd\u0017U%3va\u0015tdWe\u000b]\u001e%I\u0003ݿ|Æ_F\u001b̊\u001664\u00028\u0017c\u007f\u001a\u0003QJaoa\u000f\u0006myj;N\u001d0#{_|Pp\u0014։b͓f\u00158ү\f\u001a<iIr%>\u000fMB>\r \u0019mlo\u0016\u0012\u000b\u007f|^=Bh\u0017JŀXոX|tXN1nrȠ%h"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011d\u0015\u0003O-vUYh\t*=Se\u0012`\u0017<-`A9$!G", "\u0019", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS\u001f\u001b\u0013j&\u0012?o\u007f\f#c", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK^5DUz'7U\u00129#", ";`_", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011d\u0015\u0003O-vUYh\t*=Se\u0012`\u00175", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZWR3\u0018\fYI$wS3.\f6R\u0010\u0005l\t\u0014&\u001d1gwB>\fRC\u007fuN7lTh_\u0003V$Ap-L\bjr +", "3mc?\\,L", "", "", "5dc\u0012a;KW\u0019\r", "u(;7T=:\u001d)\u000e~euj\t>;", "9dh@", "5dc\u0018X@L", ";nS\u0010b<Gb", "", "5dc\u001ab+\u001c])\b\n\u001d9\r\u0012>i\b(uM\u0001\u001e\u0017C}\u000e", "u(8", "Adc\u001ab+\u001c])\b\n\u001d9\r\u0012>i\b(uM\u0001\u001e\u0017C}\u000e", "uH\u0018#", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011h\"yA\u0012rEY5", "5dc\u001bb+>\u0012&\u000f\u0004m0\u0005\t)r\u007f/{<\u000f\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006v8DY\u000b)3t_4WRBo=1^fk@\u000ec*]z1PZ\u00180dZ\u0003L\u0010\u000fa\u000e\u0018/\u0015\u0010`A,nMF\u001b\u00170S\u000bI2\u0005\u0014\u001e\u001eDfmIVwC\u0005^dN-h/c^y\u001d", "Adc\u001bb+>\u0012&\u000f\u0004m0\u0005\t)r\u007f/{<\u000f\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZWR3\u0018\fYI$wS3.\f6R\u0010\u0005l\t\u0014&\u001d1gwB>\fRC\u0004\u0003E)QPX_O\u000b2", "=oT?T;B]\"kzl<\u0004\u0018", "5dc\u001cc,KO(\u0003\u0005g\u0019|\u0017?l\u000ff\tP\n&\u001bOo\bIv,5U\f ", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc\u001cc,KO(\u0003\u0005g\u0019|\u0017?l\u000ff\tP\n&\u001bOo\bIv,5U\f ", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012W:\r\u0012b=+8,G.\u0004)M\t?w\u0015u(\u00175w~EZ\u001b\u001d", "=v]2e:AW$", "5dc\u001cj5>`'\u0002~i", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006v8DY\u000b)3t_4WRBo=1^fk@\u000ec*]z1PZ\u00180dZ\u0003L\u0010\u000fa\u000e\u0018/\u0016\u0014YN-jK\u0001\u0007\u0018;E~?o\u0005\u001b*wGspOd\u0013K\u0005j", "Adc\u001cj5>`'\u0002~i", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZWR4\u001c\u0005fJ u\u000e\u001f/\u0017(F\u0006Bl\u0010 \u007f >j}PY\u0014ROXf", "D`[BX", "Ahi2", "5dc \\A>", "Adc \\A>", "D`[BX:", "", "5dc#T3NS'", "u(;7T=:\u001d)\u000e~euZ\u00136l\u007f&\u000bD\u000b l", "0tX9W", "1kT.e", "", "1n]AT0Ga~~\u000f", "", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "5dc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", ">tc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", ">tc\u000e_3", "4q^:", "", "@d\\<i,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kqB", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class PersistentHashMapBuilder<K, V> extends AbstractMutableMap<K, V> implements PersistentMap.Builder<K, V> {
    public static final int $stable = 8;
    private PersistentHashMap<K, V> map;
    private int modCount;
    private TrieNode<K, V> node;
    private V operationResult;
    private MutabilityOwnership ownership = new MutabilityOwnership();
    private int size;

    public PersistentHashMapBuilder(PersistentHashMap<K, V> persistentHashMap) {
        this.map = persistentHashMap;
        this.node = this.map.getNode$runtime_release();
        this.size = this.map.size();
    }

    public final MutabilityOwnership getOwnership() {
        return this.ownership;
    }

    protected final void setOwnership(MutabilityOwnership mutabilityOwnership) {
        this.ownership = mutabilityOwnership;
    }

    public final TrieNode<K, V> getNode$runtime_release() {
        return this.node;
    }

    public final void setNode$runtime_release(TrieNode<K, V> trieNode) {
        this.node = trieNode;
    }

    public final V getOperationResult$runtime_release() {
        return this.operationResult;
    }

    public final void setOperationResult$runtime_release(V v2) {
        this.operationResult = v2;
    }

    public final int getModCount$runtime_release() {
        return this.modCount;
    }

    public final void setModCount$runtime_release(int i2) {
        this.modCount = i2;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return this.size;
    }

    public void setSize(int i2) {
        this.size = i2;
        this.modCount++;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    /* JADX INFO: renamed from: build */
    public PersistentHashMap<K, V> build2() {
        PersistentHashMap<K, V> persistentHashMap;
        if (this.node == this.map.getNode$runtime_release()) {
            persistentHashMap = this.map;
        } else {
            this.ownership = new MutabilityOwnership();
            persistentHashMap = new PersistentHashMap<>(this.node, size());
        }
        this.map = persistentHashMap;
        return persistentHashMap;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Set<Map.Entry<K, V>> getEntries() {
        return new PersistentHashMapBuilderEntries(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Set<K> getKeys() {
        return new PersistentHashMapBuilderKeys(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Collection<V> getValues() {
        return new PersistentHashMapBuilderValues(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K k2) {
        return this.node.containsKey(k2 != null ? k2.hashCode() : 0, k2, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(K k2) {
        return this.node.get(k2 != null ? k2.hashCode() : 0, k2, 0);
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    public V put(K k2, V v2) {
        this.operationResult = null;
        this.node = this.node.mutablePut(k2 != null ? k2.hashCode() : 0, k2, v2, 0, this);
        return this.operationResult;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        PersistentHashMap<K, V> persistentHashMapBuild2 = map instanceof PersistentHashMap ? (PersistentHashMap) map : null;
        if (persistentHashMapBuild2 == null) {
            PersistentHashMapBuilder persistentHashMapBuilder = map instanceof PersistentHashMapBuilder ? (PersistentHashMapBuilder) map : null;
            persistentHashMapBuild2 = persistentHashMapBuilder != null ? persistentHashMapBuilder.build2() : null;
        }
        if (persistentHashMapBuild2 != null) {
            DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
            int size = size();
            TrieNode<K, V> trieNode = this.node;
            TrieNode<K, V> node$runtime_release = persistentHashMapBuild2.getNode$runtime_release();
            Intrinsics.checkNotNull(node$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.node = trieNode.mutablePutAll(node$runtime_release, 0, deltaCounter, this);
            int size2 = (persistentHashMapBuild2.size() + size) - deltaCounter.getCount();
            if (size != size2) {
                setSize(size2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(K k2) {
        this.operationResult = null;
        TrieNode trieNodeMutableRemove = this.node.mutableRemove(k2 != null ? k2.hashCode() : 0, k2, 0, this);
        if (trieNodeMutableRemove == null) {
            trieNodeMutableRemove = TrieNode.Companion.getEMPTY$runtime_release();
            Intrinsics.checkNotNull(trieNodeMutableRemove, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = trieNodeMutableRemove;
        return this.operationResult;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        TrieNode trieNodeMutableRemove = this.node.mutableRemove(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (trieNodeMutableRemove == null) {
            trieNodeMutableRemove = TrieNode.Companion.getEMPTY$runtime_release();
            Intrinsics.checkNotNull(trieNodeMutableRemove, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = trieNodeMutableRemove;
        return size != size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        TrieNode<K, V> eMPTY$runtime_release = TrieNode.Companion.getEMPTY$runtime_release();
        Intrinsics.checkNotNull(eMPTY$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = eMPTY$runtime_release;
        setSize(0);
    }
}
