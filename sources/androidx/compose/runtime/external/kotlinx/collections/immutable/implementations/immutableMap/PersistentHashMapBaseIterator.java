package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
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
/* JADX INFO: compiled from: PersistentHashMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0006ELc\u0003*Iي8\u000bDB\u0007Ӭ4\u0012\u0006\u0016njO0LeN.ZS8\u0018s{:(c$\u007fICU \u0001*\t]NogtO`)YƤ.\u0018~̓:H}zc\u0011\u001d2jqE3[pm?pvF\u0005f3P::<\u0011*8K(\u0003\u000bE[\fHؓPrJRCL3\u001e\"\"L%\u00196l{^HXnm:e݊\u0013kRN]^@~]\r|TU\u0014%gӿ/@E=]+a\u0019\u001fR\nVI?:H\u0013\u0001?'aɞ:Y͏\\\u007f\".sU\u001bw\u000b&\u000b\u001c\u0018`T.9X{K~\u0018nÒzD\u001bJ\u001f&\u0006UY^1(\u0003 \u000ea\u00069S\t\\\u0010{Z\u007f1a|Ф%ő7+G47goD1Ne\u0006;\r\\#W͝-ƟX\u0014hٽ+V}\\?]\u0011iVS\"qM\u0002\u0014\u0003r\u0004:\u0004fϚ\u00101\f\u0011d\u001659k9Y!\u001a\tvJ>Ͻ\u0007¾l[qRVO:p\u001cD8\u0017\\rRt\u001dk~e/\u0091\u001dܖ `\u000fâ \u0015&n\u0006OA'\u0016b]}Ȳnk"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011d\u0015\u0003O-vUYh\t*=Se\u0012`\u0017<\u0019j:\u001e3\u0014~\u0015*r]\u0004", "\u0019", "$", "\"", "", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011h\"yA\u0012rEY5", ">`c5", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011h\"yA\u0012rEY<uUA)q*q\bn'i\u0010", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZWR3\u0018\fYI$wS3.\f6R\u0010\u0005l\t\u0014&\u001d1gwB>\fRC\u0004\u0003E)QPX_O=(Ak)q\u0016c\u001co\u00048.\u001c|#)h\u001a;\u001a\u0005b\u0015zRCgzV\u0019\bA E7aPTvYE\bp\u001dU\u0003~\u00120gx5};M82>t\u0014Gd\u001f>(|\u001d7cA/&?K\u000fNOm~z\b\u0012p'q\u0017\n_<1\u0001ap-7\u001c\u000b]\u007fe4a<|ERiMI|\u00116P\f\u0018\u001fj", "6`b\u001bX?M", "", "5dc\u0015T:'S,\u000e9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "u(E", "5dc\u001dT;A", "u(J\u0019T5=`#\u0003yquz\u00137p\n6{\n\u000e' Vs\u0016<@%Hh}-@i\u001dwSMJr8'(2_C\u000ej,L\u0006+QU\\u`ZzM#\u000eW\u0015Nt\u0011\rdH$vD@.\u0004;M\fDvJ\u0010\u001e\u0016Eyl?]\u0010/u ?06lFBixG\u001eAp*H\u001b_*XID1i", ")KP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZWR3\u0018\fYI$wS3.\f6R\u0010\u0005l\t\u0014&\u001d1gwB>\fRC\u0004\u0003E)QPX_VCOEF9d\u0019[,fG\u0010", ">`c5?(Lb|\by^?", "", "5dc\u001dT;A:\u0015\r\nB5{\tB", "u(8", "Adc\u001dT;A:\u0015\r\nB5{\tB", "uH\u0018#", "1gT0^\u000f:a\u0002~\u000em", "", "1ta?X5M9\u0019\u0013", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "3mbBe,'S,\u000eZg;\n\u001d\u0013sl(w?\u0015", ";ne2G6'S,\u000ech+|z3t\u0003\u0007wO|", ">`c5<5=S,", "<dgA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, KMappedMarker {
    public static final int $stable = 8;
    private boolean hasNext = true;
    private final TrieNodeBaseIterator<K, V, T>[] path;
    private int pathLastIndex;

    private static /* synthetic */ void getHasNext$annotations() {
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public PersistentHashMapBaseIterator(TrieNode<K, V> trieNode, TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr) {
        this.path = trieNodeBaseIteratorArr;
        trieNodeBaseIteratorArr[0].reset(trieNode.getBuffer$runtime_release(), trieNode.entryCount$runtime_release() * 2);
        this.pathLastIndex = 0;
        ensureNextEntryIsReady();
    }

    protected final TrieNodeBaseIterator<K, V, T>[] getPath() {
        return this.path;
    }

    protected final int getPathLastIndex() {
        return this.pathLastIndex;
    }

    protected final void setPathLastIndex(int i2) {
        this.pathLastIndex = i2;
    }

    private final int moveToNextNodeWithData(int i2) {
        if (this.path[i2].hasNextKey()) {
            return i2;
        }
        if (this.path[i2].hasNextNode()) {
            TrieNode<? extends K, ? extends V> trieNodeCurrentNode = this.path[i2].currentNode();
            if (i2 == 6) {
                this.path[i2 + 1].reset(trieNodeCurrentNode.getBuffer$runtime_release(), trieNodeCurrentNode.getBuffer$runtime_release().length);
            } else {
                this.path[i2 + 1].reset(trieNodeCurrentNode.getBuffer$runtime_release(), trieNodeCurrentNode.entryCount$runtime_release() * 2);
            }
            return moveToNextNodeWithData(i2 + 1);
        }
        return -1;
    }

    private final void ensureNextEntryIsReady() {
        if (this.path[this.pathLastIndex].hasNextKey()) {
            return;
        }
        for (int i2 = this.pathLastIndex; -1 < i2; i2--) {
            int iMoveToNextNodeWithData = moveToNextNodeWithData(i2);
            if (iMoveToNextNodeWithData == -1 && this.path[i2].hasNextNode()) {
                this.path[i2].moveToNextNode();
                iMoveToNextNodeWithData = moveToNextNodeWithData(i2);
            }
            if (iMoveToNextNodeWithData != -1) {
                this.pathLastIndex = iMoveToNextNodeWithData;
                return;
            }
            if (i2 > 0) {
                this.path[i2 - 1].moveToNextNode();
            }
            this.path[i2].reset(TrieNode.Companion.getEMPTY$runtime_release().getBuffer$runtime_release(), 0);
        }
        this.hasNext = false;
    }

    protected final K currentKey() {
        checkHasNext();
        return this.path[this.pathLastIndex].currentKey();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public T next() {
        checkHasNext();
        T next = this.path[this.pathLastIndex].next();
        ensureNextEntryIsReady();
        return next;
    }

    private final void checkHasNext() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }
}
