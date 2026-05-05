package co.touchlab.stately.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&˛\bDRш|\u0004W\u00068\u000b<i\u0007\"2\u0014\u007f\u0007tsA0JfP.`S2şq\nJř\u0004&wّITJ\u0002P\t8NFh\u001fPj\rS\u000fL\u0015'llfe\u0001k\u0015'6po(3,pMCnxN\u000b04280ڎ/\u001cݵL\u0010\u0005\u007f\fR\u001a\u0018H@\u001fA\u0019ҟMM& \u000eV 7Ȧ#ɸNɇLlkCw)\u0011sZNUjv\u0011\u001e\u001fTX?\u0013\u0007c.+vʺc\u0017{و\u0005\u07baV[Gš\u0010\u0002K\b\u0001+U+2s67/ß\u0016Ʀ/O\u0015ƞğ*h"}, d2 = {"\u001ab^{g6NQ\u001c\u0006v[u\u000b\u0018+t\u007f/\u0010\n~!\u001eNo\fKz/>gG}Av\u0014>ZP;tC\u0006%w]6\u000ec\u0010]v4C[X92", "\u0013", "", "\u001ab^{g6NQ\u001c\u0006v[u\u000b\u0018+t\u007f/\u0010\n~! E\u007f\u001bIv.3mG\u000eKv\u00141ZMDoI\u001a\u0012oa\u000f", "", "@n^A", "2d[", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011\u007f\u001d@}n\u0019h}-3| ;#\u0007,", "6`b\u001bX?M", "", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "@d\\<i,", "", "AsPAX3R\u001b\u0017\t\u0004\\<\n\u0016/n\u000foyJ\b\u001e\u0017E~\u0012F\u007f3"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class ConcurrentMutableIterator<E> implements Iterator<E>, KMutableIterator {
    private final Iterator<E> del;
    private final Object root;

    /* JADX WARN: Multi-variable type inference failed */
    public ConcurrentMutableIterator(Object root, Iterator<? extends E> del) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(del, "del");
        this.root = root;
        this.del = del;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        Boolean boolInvoke;
        Object obj = this.root;
        Function0<Boolean> function0 = new Function0<Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableIterator.hasNext.1
            final /* synthetic */ ConcurrentMutableIterator<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(((ConcurrentMutableIterator) this.this$0).del.hasNext());
            }
        };
        synchronized (obj) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Iterator
    public E next() {
        E eInvoke;
        Object obj = this.root;
        Function0<E> function0 = new Function0<E>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableIterator.next.1
            final /* synthetic */ ConcurrentMutableIterator<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final E invoke() {
                return (E) ((ConcurrentMutableIterator) this.this$0).del.next();
            }
        };
        synchronized (obj) {
            eInvoke = function0.invoke();
        }
        return eInvoke;
    }

    @Override // java.util.Iterator
    public void remove() {
        Object obj = this.root;
        Function0<Unit> function0 = new Function0<Unit>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableIterator.remove.1
            final /* synthetic */ ConcurrentMutableIterator<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((ConcurrentMutableIterator) this.this$0).del.remove();
            }
        };
        synchronized (obj) {
            function0.invoke();
        }
    }
}
