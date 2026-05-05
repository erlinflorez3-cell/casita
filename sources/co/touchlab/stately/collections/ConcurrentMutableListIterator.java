package co.touchlab.stately.collections;

import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&˛\bDZc|\u0004O/8é6B\rӬ4\u0012\u000e\u0007nj?1LeV.ZS0\u0010s{B-cҕyCI[\"}(\fUȞ}˧\u0017L`ŏQ\u000e6\u001c\tl<I\u001cw\f\u0012?8RqO3\u0014nk:!\u0012F\r.4:<(\bi\u001a\tL \u0001\tHc\u0012\"2Pppĥ;Nŋ\u001e\u0012\u0014Dh\u0014,c\u007fNdP\u001daH8;\u0003 ĩ\u0015;ۢ4|[\u0017\u000fZ5\u0018\u000faL7\u0007K}\u001b3`\u001b\u0007\u0001i\u0006\u0017\b|K\u0014\u0001']Ǣ\u0010\bɱ:X\u000e$]1]\u001eurTjKe)\u001f5=gcyX>,\u0006\u0004\u0014\rrǉT\u001aόL.;$7\u001a\u001c8\rxcB`\u0002\u0015ۍ.{8ت\u0019Ӿ\u000433ݍkv_cS\u001d|:d\u0005k\"yЪpĲ_T\u0016֫ڦ\u001fg"}, d2 = {"\u001ab^{g6NQ\u001c\u0006v[u\u000b\u0018+t\u007f/\u0010\n~!\u001eNo\fKz/>gG}Av\u0014>ZP;tC\u0006%w]6\u000ec\u0013R\u00056+[N9Xa|Ji", "\u0013", "\u001ab^{g6NQ\u001c\u0006v[u\u000b\u0018+t\u007f/\u0010\n~!\u001eNo\fKz/>gG}Av\u0014>ZP;tC\u0006%w]6\u000ec\u0010]v4C[X92", "", "@n^A", "", "\u001ab^{g6NQ\u001c\u0006v[u\u000b\u0018+t\u007f/\u0010\n~! E\u007f\u001bIv.3mG\u000eKv\u00141ZMDoI\u001a\u0012oa\u000f", "2d[", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011\u007f\u001d@}n\u001c]\f/\u001b|\u0016;IREx\na\u0006", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "6`b\u001de,OW#\u000f\t", "", "<dgA<5=S,", "", ">qTC\\6Na", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", ">qTC\\6Na|\by^?", "Adc", "AsPAX3R\u001b\u0017\t\u0004\\<\n\u0016/n\u000foyJ\b\u001e\u0017E~\u0012F\u007f3"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ConcurrentMutableListIterator<E> extends ConcurrentMutableIterator<E> implements ListIterator<E>, KMutableListIterator {
    private final ListIterator<E> del;
    private final Object root;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcurrentMutableListIterator(Object root, ListIterator<E> del) {
        super(root, del);
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(del, "del");
        this.root = root;
        this.del = del;
    }

    @Override // java.util.ListIterator
    public void add(final E e2) {
        Object obj = this.root;
        Function0<Unit> function0 = new Function0<Unit>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableListIterator.add.1
            final /* synthetic */ ConcurrentMutableListIterator<E> this$0;

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
                ((ConcurrentMutableListIterator) this.this$0).del.add(e2);
            }
        };
        synchronized (obj) {
            function0.invoke();
        }
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        Boolean boolInvoke;
        Object obj = this.root;
        Function0<Boolean> function0 = new Function0<Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableListIterator.hasPrevious.1
            final /* synthetic */ ConcurrentMutableListIterator<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(((ConcurrentMutableListIterator) this.this$0).del.hasPrevious());
            }
        };
        synchronized (obj) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        Integer numInvoke;
        Object obj = this.root;
        Function0<Integer> function0 = new Function0<Integer>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableListIterator.nextIndex.1
            final /* synthetic */ ConcurrentMutableListIterator<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(((ConcurrentMutableListIterator) this.this$0).del.nextIndex());
            }
        };
        synchronized (obj) {
            numInvoke = function0.invoke();
        }
        return numInvoke.intValue();
    }

    @Override // java.util.ListIterator
    public E previous() {
        E eInvoke;
        Object obj = this.root;
        Function0<E> function0 = new Function0<E>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableListIterator.previous.1
            final /* synthetic */ ConcurrentMutableListIterator<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final E invoke() {
                return (E) ((ConcurrentMutableListIterator) this.this$0).del.previous();
            }
        };
        synchronized (obj) {
            eInvoke = function0.invoke();
        }
        return eInvoke;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        Integer numInvoke;
        Object obj = this.root;
        Function0<Integer> function0 = new Function0<Integer>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableListIterator.previousIndex.1
            final /* synthetic */ ConcurrentMutableListIterator<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(((ConcurrentMutableListIterator) this.this$0).del.previousIndex());
            }
        };
        synchronized (obj) {
            numInvoke = function0.invoke();
        }
        return numInvoke.intValue();
    }

    @Override // java.util.ListIterator
    public void set(final E e2) {
        Object obj = this.root;
        Function0<Unit> function0 = new Function0<Unit>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableListIterator.set.1
            final /* synthetic */ ConcurrentMutableListIterator<E> this$0;

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
                ((ConcurrentMutableListIterator) this.this$0).del.set(e2);
            }
        };
        synchronized (obj) {
            function0.invoke();
        }
    }
}
