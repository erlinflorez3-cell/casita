package androidx.compose.runtime.collection;

import androidx.collection.ScatterSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
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
/* JADX INFO: compiled from: ScatterSetWrapper.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&˛\bDR\u0004|İI\u0006F\u000b6B\u0005$4\u0012\u0006\rnj?1LeV7ZS0\u0011s{B@c$wCCU($*ޛUȞ}˧\u0017L`ŏQ\u000e6\u001c\tl<I\u001cw\f\u0012OCRyM4euM;ptlӌN4ŕ<y\u0013\u0004b>V\u001a\u000fzqV<\u0016>L\t:\t҈\u0014Ŀ\u001aŪ\n>.\u000efpu\\NH\u001bhj91\u0012\u0002H^)o03ձ;V\u001b;U|o/C@e@[9\u001c\u0010\u0015dsE\u0013A\u0002=;ؒU:qɵs(Nf\u0001,\u001b;Q\u001d])̦\u000b\u0007(ӡ\u000eˏ/Uk֟h\u0010.{\t\u0001]N\u0012\u0014\u001e'v5cn=ڳ\u0010\u07baxvkBV\nlKȾ~u"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u001cK?Jz4+\u0003hp+\u0014_7Yv4\u001d", "\"", "", "Adc", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u0015\u0013V~\u000eId%D/", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ\u0005\u0015C~\u001d<\u0004\u00135hSc(", "5dc X;|`)\b\nb4|\u0003<e\u0007(wN\u0001", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`\u0005Ek\u001dKv2#Y\ru", "Ahi2", "", "5dc \\A>", "u(8", "1n]AT0Ga", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1n]AT0Gat\u0006\u0002", "3kT:X5Ma", "", "7r4:c;R", "7sT?T;H`", "", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ScatterSetWrapper<T> implements Set<T>, KMappedMarker {
    public static final int $stable = 8;
    private final ScatterSet<T> set;

    @Override // java.util.Set, java.util.Collection
    public boolean add(T t2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }

    public ScatterSetWrapper(ScatterSet<T> scatterSet) {
        this.set = scatterSet;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public final ScatterSet<T> getSet$runtime_release() {
        return this.set;
    }

    public int getSize() {
        return this.set.getSize();
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScatterSetWrapper.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fpI2Te\u000f.\u0001TpŪ*"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eo{:\u000105/"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0007\u000b\u0005\f\u0002\u0007\u007fI\u007f\r\u000b\f\u0006\u0005\u0017\r\u0014\u0014Tz\f\u000b\u001f \u0012 \u0002\u0015%\t%\u0015%&\u001c*\\#/!/\u001f3/3es", f = " /,>=-9\u0019*8\u001a4\"0/#/i&.", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {34}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aK[;LG>FL", "Z\u001ak\\", "\\\u001ak\\\u0016_X", "[WuZ;dFLN}O@zC5", "X\u001ak\\\u0016_X", "bbqZ\u0016_X\u000b?P", "Q_v)akP[yC\\m@P", "Y\u001ak\\\u0016_X"}, s = {"xQ^", "xQ_", "xQ`", "uQ^", "uQ_", "vQ^", "uQ`", "uQa"})
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super T>, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ ScatterSetWrapper<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScatterSetWrapper<T> scatterSetWrapper, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = scatterSetWrapper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super T> sequenceScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
        /* JADX WARN: Type inference failed for: r5v10 */
        /* JADX WARN: Type inference failed for: r5v11 */
        /* JADX WARN: Type inference failed for: r5v12 */
        /* JADX WARN: Type inference failed for: r5v13 */
        /* JADX WARN: Type inference failed for: r5v14 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.sequences.SequenceScope] */
        /* JADX WARN: Type inference failed for: r5v5 */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Type inference failed for: r5v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005b -> B:6:0x002a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0087 -> B:20:0x0095). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0089 -> B:7:0x002c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003e -> B:6:0x002a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r12 = r21
                java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r12.label
                r20 = 0
                r10 = 8
                r9 = 1
                if (r0 == 0) goto L5e
                if (r0 != r9) goto L9a
                int r13 = r12.I$3
                int r1 = r12.I$2
                long r2 = r12.J$0
                int r8 = r12.I$1
                int r4 = r12.I$0
                java.lang.Object r7 = r12.L$2
                long[] r7 = (long[]) r7
                java.lang.Object r6 = r12.L$1
                java.lang.Object[] r6 = (java.lang.Object[]) r6
                java.lang.Object r5 = r12.L$0
                kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
                kotlin.ResultKt.throwOnFailure(r22)
            L2a:
                long r2 = r2 >> r10
                int r13 = r13 + r9
            L2c:
                if (r13 >= r1) goto L93
                r14 = 255(0xff, double:1.26E-321)
                r18 = -1
                long r16 = r18 - r14
                long r14 = r18 - r2
                long r16 = r16 | r14
                long r18 = r18 - r16
                r14 = 128(0x80, double:6.3E-322)
                int r0 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
                if (r0 >= 0) goto L2a
                int r0 = r8 << 3
                int r0 = r0 + r13
                r0 = r6[r0]
                r12.L$0 = r5
                r12.L$1 = r6
                r12.L$2 = r7
                r12.I$0 = r4
                r12.I$1 = r8
                r12.J$0 = r2
                r12.I$2 = r1
                r12.I$3 = r13
                r12.label = r9
                java.lang.Object r0 = r5.yield(r0, r12)
                if (r0 != r11) goto L2a
                return r11
            L5e:
                kotlin.ResultKt.throwOnFailure(r22)
                java.lang.Object r5 = r12.L$0
                kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
                androidx.compose.runtime.collection.ScatterSetWrapper<T> r0 = r12.this$0
                androidx.collection.ScatterSet r0 = r0.getSet$runtime_release()
                java.lang.Object[] r6 = r0.elements
                long[] r7 = r0.metadata
                int r0 = r7.length
                int r4 = r0 + (-2)
                if (r4 < 0) goto La2
                r8 = r20
            L76:
                r2 = r7[r8]
                long r0 = ~r2
                r13 = 7
                long r0 = r0 << r13
                long r15 = r0 + r2
                long r0 = r0 | r2
                long r15 = r15 - r0
                r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r15 = r15 & r13
                int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
                if (r0 == 0) goto L95
                int r0 = r8 - r4
                int r0 = ~r0
                int r0 = r0 >>> 31
                int r1 = 8 - r0
                r13 = r20
                goto L2c
            L93:
                if (r1 != r10) goto La2
            L95:
                if (r8 == r4) goto La2
                int r8 = r8 + 1
                goto L76
            L9a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            La2:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScatterSetWrapper.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.set.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return SequencesKt.iterator(new AnonymousClass1(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.set.contains(obj);
    }
}
