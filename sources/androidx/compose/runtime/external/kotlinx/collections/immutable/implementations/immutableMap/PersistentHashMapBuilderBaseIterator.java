package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
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
/* JADX INFO: compiled from: PersistentHashMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0006ELc\u0003+I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG?Le^.ZS0\u000fs{B*c$wDCU(\u0007*ޛWNugvJ`\u0010K\u000f\u001c\u0016\u0001j2N[\u0007s܈74HģM2uqC8nt^\u0007&209*\u000b\u0011\u001c:HVw)E{\u001e\"2Pp\u0001Q\u001dO\u0015\u001aX\u0006N\"\u0011\u001e#h|9\t$mJ='\u001buRP7_fŧ]\u000fVT]\f%f.GN=M-5g\u0013\u0019b]O\u0003uмM\u0007x']*Yug6\u000f\u007fB\u001dYVոar4eMWn\u001c?+}t\u0012PV.\u0006\r\u0014\rj\u0015T\u0006oT<@2f>\u000eyϖrՂDP\u0010r\u000b\u0006\tvN\u0017S\u0011y?\u0002Ntgy;G_g\u007f\u0013$6#/yQgb&x\u001d+T}RAQF>vg:]K\b\u001cp\u0019̣Z\b>b\u0018/*\u001ct\u0017É;[G?i\u0005\u0010e\\g%\u0016\u0011la\u0004jHv̎\u001f\u001aEH!\f\u0011C\u0081\tk^s)D\u001fQ4`\u0017\u007f\u0018\u0013Vο\b>1%FM}m@җOύ\u000e%7ω\be|u&Wgi\n̓]Ӓ\u0014aZΘdOJn\u001dZ|A\nێ1٥4ϒ6Jr\u0010\u0006\t\u0015Z\u001a!J? +\u000bμ=Ǭ`\u0015PґڅFa"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011d\u0015\u0003O-vUYh\t*=Se\u0012`\u0017<-`A9$!N\u0015)h4=\n\tO |_O", "\u0019", "$", "\"", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011d\u0015\u0003O-vUYh\t*=Se\u0012`\u0017<\u0019j:\u001e3\u0014~\u0015*r]\u0004", "0tX9W,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011d\u0015\u0003O-vUYh\t*=Se\u0012`\u0017<-`A9$!G", ">`c5", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011h\"yA\u0012rEY<uUA)q*q\bn'i\u0010", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZWR3\u0018\fYI$wS3.\f6R\u0010\u0005l\t\u0014&\u001d1gwB>\fRC\u007fuN7lTh_\u0003V$Ap-L\bjyl>A#\u0014~n\u0011OL7\t\t]\u0015qeCeqO$\u0005F$\bzkOTs]<>'2Z{\u0005\u001b._>1~<\u000b83I.\u0003Un\u001f>\\\b\u00196eOp*>D#NG`|l\b\u0012p*h\b\u0016b>@\u0015timQ\u001dPa\u001fcEp[}>Rm:T9\u00044J~+ex\u0015e\u00032mIXC(P\u0010$}\u001aeP", "3w_2V;>R\u0001\ty<6\r\u0012>", "", ":`bA<;>`\u0015\u000ez]\u0012|\u001d", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "<dgAJ(L7\"\u0010\u0005d,{", "", "1gT0^\rH`v\t\u0003h+\u0001\n3c{7\u007fJ\n", "", "1gT0^\u0015>f(pvl\u0010\u0006\u001a9k\u007f'", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "@d\\<i,", "@db2g\u0017:b\u001c", "9dh\u0015T:A", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011h\"yA\u0012rEY5", "9dh", ">`c5<5=S,", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006v8DY\u000b)3t_4WRBo=1^fk@\u000ec*]z1PZ\u00180dZ\u0003L\u0010\u000fa\u000e\u0018/\u0015\u0010`A,nMF\u001b\u00170S\u000bI2\u0005\u0014\u001e\u001eDfmIVwC\u0005^dN-h/c^y\u001d(J^;`Uf\u0019e<\u0004\u000e\u0011v\u0019\u0019w&\u0012Ml", "Adc#T3NS", "<df#T3NS", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq>", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class PersistentHashMapBuilderBaseIterator<K, V, T> extends PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, KMutableIterator {
    public static final int $stable = 8;
    private final PersistentHashMapBuilder<K, V> builder;
    private int expectedModCount;
    private K lastIteratedKey;
    private boolean nextWasInvoked;

    public PersistentHashMapBuilderBaseIterator(PersistentHashMapBuilder<K, V> persistentHashMapBuilder, TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr) {
        super(persistentHashMapBuilder.getNode$runtime_release(), trieNodeBaseIteratorArr);
        this.builder = persistentHashMapBuilder;
        this.expectedModCount = persistentHashMapBuilder.getModCount$runtime_release();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public T next() {
        checkForComodification();
        this.lastIteratedKey = currentKey();
        this.nextWasInvoked = true;
        return (T) super.next();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        if (hasNext()) {
            K kCurrentKey = currentKey();
            TypeIntrinsics.asMutableMap(this.builder).remove(this.lastIteratedKey);
            resetPath(kCurrentKey != null ? kCurrentKey.hashCode() : 0, this.builder.getNode$runtime_release(), kCurrentKey, 0);
        } else {
            TypeIntrinsics.asMutableMap(this.builder).remove(this.lastIteratedKey);
        }
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount$runtime_release();
    }

    public final void setValue(K k2, V v2) {
        if (this.builder.containsKey(k2)) {
            if (hasNext()) {
                K kCurrentKey = currentKey();
                this.builder.put(k2, v2);
                resetPath(kCurrentKey != null ? kCurrentKey.hashCode() : 0, this.builder.getNode$runtime_release(), kCurrentKey, 0);
            } else {
                this.builder.put(k2, v2);
            }
            this.expectedModCount = this.builder.getModCount$runtime_release();
        }
    }

    private final void resetPath(int i2, TrieNode<?, ?> trieNode, K k2, int i3) {
        int i4 = i3 * 5;
        if (i4 > 30) {
            getPath()[i3].reset(trieNode.getBuffer$runtime_release(), trieNode.getBuffer$runtime_release().length, 0);
            while (!Intrinsics.areEqual(getPath()[i3].currentKey(), k2)) {
                getPath()[i3].moveToNextKey();
            }
            setPathLastIndex(i3);
            return;
        }
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i4);
        if (trieNode.hasEntryAt$runtime_release(iIndexSegment)) {
            getPath()[i3].reset(trieNode.getBuffer$runtime_release(), trieNode.entryCount$runtime_release() * 2, trieNode.entryKeyIndex$runtime_release(iIndexSegment));
            setPathLastIndex(i3);
        } else {
            int iNodeIndex$runtime_release = trieNode.nodeIndex$runtime_release(iIndexSegment);
            TrieNode<?, ?> trieNodeNodeAtIndex$runtime_release = trieNode.nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
            getPath()[i3].reset(trieNode.getBuffer$runtime_release(), trieNode.entryCount$runtime_release() * 2, iNodeIndex$runtime_release);
            resetPath(i2, trieNodeNodeAtIndex$runtime_release, k2, i3 + 1);
        }
    }

    private final void checkNextWasInvoked() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    private final void checkForComodification() {
        if (this.builder.getModCount$runtime_release() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }
}
