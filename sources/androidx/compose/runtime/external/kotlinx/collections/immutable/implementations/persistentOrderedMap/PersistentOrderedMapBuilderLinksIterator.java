package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: PersistentOrderedMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0006DLc\u0003+I\u0006F\u000b6Ȑ\u0007\":ߚ\u007fјnjO0LeN0ZS8\u0015s{:-c$\u007fLC٥\"}0\tWNmktXpŏk\u0011\fǝ\u0007iTK[wk\u0012?>RwO9]qM9'td\u0007N3bY\n\u000b\u000f\u001dBJ&u)G[\u001c 5X|JT\u001dM;܅\"\bN 7\u001d\u000bmߑ:Hzd\u000351\u001b\u0002B|@&0ES\u001b`l';\u0010(\u001esFEP-%\u0002\u001cMR$F\u0011[\n=3\u007fmݧ+\u0012\u0001eSp\u0006$\u0017;OC\\!(#ӻQ)\u00125IgcyiT<H\u0019\n\u0012T\u0010\u001e\b7HdƦ*h\u0018\u000eis!Y\u0017Б\u0004ެF\u0006\u0003ʨN\u0019+\bA4\n't[y;GY\u000eީ\u0011ڟ\"#\t͙qsb\u001ax\u0015I_N΄=ҨDIPݐ\"[Cz\u0012~\u0003\u00040\u0013>WPI\n\"F\u0019;6\n=yܪwɘLPoϸ\u001dbnewehB(\u0003$Lz\u0017\u001a]\\f\u001bj~X/\u008f\u001dܖ T\u000fâX\u001f.r\u0010<O<fʝ[ŹmjUΪܬ)N"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WKFh\u000e\u001a\u001a\u001cDjyQ@\u001dFy\"u@\u0011dQ#JyTOIp9d\u0015n\u0007i9:1\u0014p\u0001\u0017s->\u000e\u0003R\u0011\u007f9}pmU|\n81:|eS\u001b", "\u0019", "$", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WKFh\u000e\u001a\u001a\u001cDjyQ@\u001dFy\"u@\u0011dQ#F}PGEa\u001b`\u0013o\u001d2", "<dgA>,R", "", "0tX9W,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WKFh\u000e\u001a\u001a\u001cDjyQ@\u001dFy\"u@\u0011dQ#JyTOIp9d\u0015n\u0007i9:1\u0014p\u0001\u0017s->\u000e\u0003R\u0011\u007f(", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_;]LJo<\u001e^htH\u0007p5J}pMV]3`[\u0006\u0007\u0012\u001ca\u0015N)\u001c\tcJ28H?'\u0018;E~BhJ\u0010\u001e\u0019<jxB_\u001fC\t\u0019\u007fJ72QYl\bKOTb3sul\u001c\\G:#{m$dSP;\u0018\u007fa r[\tQtF\u0019\b8#&if#Us\\;t4t\u000fl", "5dc\u000fh0ER\u0019\f9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006v8DY\u000b)3t_4WRBo=1^fk@\u000ec*]z1PZ\u00180dZ\u0003L\u0010\u000fa\u000e\u0018/\u0015\u0010`A,nMF\u001b\u00170S\u000bI2\f\f#\u001c9x\u007fB_\u001f1\u0007\u0014uN)g.UjC2ARp.r\u001b_&k$G#\u0014~\u0019\u001aPL9f\fW\u0018qR\u0007=", "3w_2V;>R\u0001\ty<6\r\u0012>", "", "7mS2k", "5dc\u0016a+>fW\f\u000bg;\u0001\u0011/_\r(\u0003@|%\u0017", "u(8", "Adc\u0016a+>fW\f\u000bg;\u0001\u0011/_\r(\u0003@|%\u0017", "uH\u0018#", ":`bA<;>`\u0015\u000ez]\u0012|\u001d", "5dc\u0019T:M7(~\bZ;|\b\u0015e\u0014f\tP\n&\u001bOo\bIv,5U\f ", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc\u0019T:M7(~\bZ;|\b\u0015e\u0014f\tP\n&\u001bOo\bIv,5U\f ", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "<dgAJ(L7\"\u0010\u0005d,{", "", "1gT0^\rH`v\t\u0003h+\u0001\n3c{7\u007fJ\n", "", "1gT0^\u000f:a\u0002~\u000em", "1gT0^\u0015>f(pvl\u0010\u0006\u001a9k\u007f'", "6`b\u001bX?M", "<dgA", "@d\\<i,", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class PersistentOrderedMapBuilderLinksIterator<K, V> implements Iterator<LinkedValue<V>>, KMutableIterator {
    public static final int $stable = 8;
    private final PersistentOrderedMapBuilder<K, V> builder;
    private int expectedModCount;
    private int index;
    private Object lastIteratedKey = EndOfChain.INSTANCE;
    private Object nextKey;
    private boolean nextWasInvoked;

    public PersistentOrderedMapBuilderLinksIterator(Object obj, PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.nextKey = obj;
        this.builder = persistentOrderedMapBuilder;
        this.expectedModCount = persistentOrderedMapBuilder.getHashMapBuilder$runtime_release().getModCount$runtime_release();
    }

    public final PersistentOrderedMapBuilder<K, V> getBuilder$runtime_release() {
        return this.builder;
    }

    public final Object getLastIteratedKey$runtime_release() {
        return this.lastIteratedKey;
    }

    public final void setLastIteratedKey$runtime_release(Object obj) {
        this.lastIteratedKey = obj;
    }

    public final int getIndex$runtime_release() {
        return this.index;
    }

    public final void setIndex$runtime_release(int i2) {
        this.index = i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.builder.size();
    }

    @Override // java.util.Iterator
    public LinkedValue<V> next() {
        checkForComodification();
        checkHasNext();
        this.lastIteratedKey = this.nextKey;
        this.nextWasInvoked = true;
        this.index++;
        LinkedValue<V> linkedValue = this.builder.getHashMapBuilder$runtime_release().get(this.nextKey);
        if (linkedValue == null) {
            throw new ConcurrentModificationException("Hash code of a key (" + this.nextKey + ") has changed after it was added to the persistent map.");
        }
        LinkedValue<V> linkedValue2 = linkedValue;
        this.nextKey = linkedValue2.getNext();
        return linkedValue2;
    }

    @Override // java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        TypeIntrinsics.asMutableMap(this.builder).remove(this.lastIteratedKey);
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getHashMapBuilder$runtime_release().getModCount$runtime_release();
        this.index--;
    }

    private final void checkHasNext() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void checkNextWasInvoked() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    private final void checkForComodification() {
        if (this.builder.getHashMapBuilder$runtime_release().getModCount$runtime_release() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }
}
