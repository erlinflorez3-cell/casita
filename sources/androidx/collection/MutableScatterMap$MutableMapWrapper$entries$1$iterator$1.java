package androidx.collection;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import yg.InterfaceC1492Gx;

/* JADX INFO: Add missing generic type declarations: [V, K] */
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
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я/\u001d̉=!,\u0011\bDR\t|İI\u0006>\u00116B\u0005%4\u0012\u0006-nj?3LeV7ZS0\u000fs{B$cҕ\u001aBП[\"\u0014̝9a^uwzZ\\\u001bCEإ&zz,\u007fT']@\u000ezI}LKM\u001eK\u007fŲt~\u0018.A:D\n\u0007\u0011\u001a`Ϻ x\u000bC\u0002\u000b@0\u0007\u0098:\u001b\u0013[\u00152\u00124Of\u0015ntuONH\u001b_\u0011ǉ/ɨmNVϋw2\u0003P\u001bJt)\u0013{o${jE<-7c\u0011\u0017^kA\u0013?(ܵ\u0015j7'aH\"Wd`Vϳ!ۣS\u0019eö>^\u000bZn\u0016G-UnY\\˔,\n"}, d2 = {"/mS?b0=fb|\u0005e3|\u0007>i\n1E(\u0011&\u0013Dv\u000e*t!Dh}-\u001fi!l5SJg1%\u0015P]Dxp(Y\u0002'T\u000bN5k_v=\"P&LR:\r\u0012UP.{\u0003\u0003", "", "", "1ta?X5M", "", "5dc\u0010h9KS\"\u000e", "u(8", "Adc\u0010h9KS\"\u000e", "uH\u0018#", "7sT?T;H`", "", "5dc\u0016g,KO(\t\b", "u(;7T=:\u001d)\u000e~eu`\u0018/r{7\u0006MV", "Adc\u0016g,KO(\t\b", "uKY.i(\bc(\u0003\u0002(\u0010\f\t<a\u000f2\t\u0016D\b", "6`b\u001bX?M", "", "<dgA", "@d\\<i,", "", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableScatterMap$MutableMapWrapper$entries$1$iterator$1<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
    private int current = -1;
    private Iterator<? extends Map.Entry<K, V>> iterator;
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    MutableScatterMap$MutableMapWrapper$entries$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
        this.iterator = SequencesKt.iterator(new AnonymousClass1(mutableScatterMap, this, null));
    }

    public final Iterator<Map.Entry<K, V>> getIterator() {
        return this.iterator;
    }

    public final void setIterator(Iterator<? extends Map.Entry<K, V>> it) {
        Intrinsics.checkNotNullParameter(it, "<set-?>");
        this.iterator = it;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final void setCurrent(int i2) {
        this.current = i2;
    }

    /* JADX INFO: renamed from: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScatterMap.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,i\bDJc|\u0004W\u00068\u000b<g\rӬD\u0012&\u0006\u0007l?ӄReh0XR8\u0010\u0014\u000eD2k0\u0002EKU`}2\u000b_N.h\u001dM\t\r\nƯD"}, d2 = {"\n`]<a@F])\rS", "", "\u0019", "$", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eo{:\u000105/", ""}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|z{ut\u0007|\u0004\u0004Dd\u000e\u000e{}\t\u0003q\u0003\u0002\u0016\u0017\t\u0017r\b\u0018Lv  \u000e\u0010\u001b\u0015}\u0013#\u000b'\u0017'(\u001e,^!+21)&5fth/;-;+?;?q\u007fs\u0002", f = " /,>=-9\u0013&4p-5", i = {0, 0, 0, 0, 0, 0, 0}, l = {1412}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aK[;LG>FL", "\\\u001ak\\", "[WuZ;dFLN}O@", "X\u001ak\\", "bbqZ\u0016_X", "Q_v)akP[yC\\", "Y\u001ak\\"}, s = {"xQ^", "xQa", "uQ^", "uQ_", "vQ^", "uQ`", "uQa"})
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Map.Entry<K, V>>, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ MutableScatterMap<K, V> this$0;
        final /* synthetic */ MutableScatterMap$MutableMapWrapper$entries$1$iterator$1<K, V> this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableScatterMap<K, V> mutableScatterMap, MutableScatterMap$MutableMapWrapper$entries$1$iterator$1<K, V> mutableScatterMap$MutableMapWrapper$entries$1$iterator$1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = mutableScatterMap;
            this.this$1 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.this$1, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super Map.Entry<K, V>> sequenceScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0042 -> B:7:0x002e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0070 -> B:6:0x002c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009d -> B:23:0x00ab). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009f -> B:8:0x0030). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r12 = r20
                java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r12.label
                r15 = 8
                r14 = 1
                if (r0 == 0) goto L74
                if (r0 != r14) goto Lb0
                int r13 = r12.I$3
                int r2 = r12.I$2
                long r3 = r12.J$0
                int r5 = r12.I$1
                int r6 = r12.I$0
                java.lang.Object r10 = r12.L$3
                long[] r10 = (long[]) r10
                java.lang.Object r7 = r12.L$2
                androidx.collection.MutableScatterMap r7 = (androidx.collection.MutableScatterMap) r7
                java.lang.Object r9 = r12.L$1
                androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 r9 = (androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1) r9
                java.lang.Object r8 = r12.L$0
                kotlin.sequences.SequenceScope r8 = (kotlin.sequences.SequenceScope) r8
                kotlin.ResultKt.throwOnFailure(r21)
            L2c:
                r15 = 8
            L2e:
                long r3 = r3 >> r15
                int r13 = r13 + r14
            L30:
                if (r13 >= r2) goto La9
                r0 = 255(0xff, double:1.26E-321)
                r18 = -1
                long r16 = r18 - r0
                long r0 = r18 - r3
                long r16 = r16 | r0
                long r18 = r18 - r16
                r16 = 128(0x80, double:6.3E-322)
                int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
                if (r0 >= 0) goto L73
                int r0 = r5 << 3
                int r0 = r0 + r13
                r9.setCurrent(r0)
                androidx.collection.MutableMapEntry r15 = new androidx.collection.MutableMapEntry
                java.lang.Object[] r14 = r7.keys
                java.lang.Object[] r1 = r7.values
                int r0 = r9.getCurrent()
                r15.<init>(r14, r1, r0)
                r12.L$0 = r8
                r12.L$1 = r9
                r12.L$2 = r7
                r12.L$3 = r10
                r12.I$0 = r6
                r12.I$1 = r5
                r12.J$0 = r3
                r12.I$2 = r2
                r12.I$3 = r13
                r14 = 1
                r12.label = r14
                java.lang.Object r0 = r8.yield(r15, r12)
                if (r0 != r11) goto L2c
                return r11
            L73:
                goto L2e
            L74:
                kotlin.ResultKt.throwOnFailure(r21)
                java.lang.Object r8 = r12.L$0
                kotlin.sequences.SequenceScope r8 = (kotlin.sequences.SequenceScope) r8
                androidx.collection.MutableScatterMap<K, V> r7 = r12.this$0
                r0 = r7
                androidx.collection.ScatterMap r0 = (androidx.collection.ScatterMap) r0
                androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1<K, V> r9 = r12.this$1
                long[] r10 = r0.metadata
                int r0 = r10.length
                int r6 = r0 + (-2)
                if (r6 < 0) goto Lb8
                r5 = 0
            L8a:
                r3 = r10[r5]
                long r0 = ~r3
                r2 = 7
                long r0 = r0 << r2
                long r0 = r0 & r3
                r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r16 = r0 + r18
                long r0 = r0 | r18
                long r16 = r16 - r0
                int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
                if (r0 == 0) goto La8
                int r0 = r5 - r6
                int r0 = ~r0
                int r0 = r0 >>> 31
                int r2 = 8 - r0
                r13 = 0
                goto L30
            La8:
                goto Lab
            La9:
                if (r2 != r15) goto Lb8
            Lab:
                if (r5 == r6) goto Lb8
                int r5 = r5 + 1
                goto L8a
            Lb0:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            Lb8:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        return this.iterator.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i2 = this.current;
        if (i2 != -1) {
            this.this$0.removeValueAt(i2);
            this.current = -1;
        }
    }
}
