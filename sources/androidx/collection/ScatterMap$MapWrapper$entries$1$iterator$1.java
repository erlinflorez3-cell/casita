package androidx.collection;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import yg.InterfaceC1492Gx;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,i\bDJc|\u0004W\u00068\u000b<f\rӬD\u0012&\u0006\u0007l?ӄReh0XR8\u0010\u0014\u000eD2k0\u0002EKU`}2\u000b_N.h\u001dM\t\r\nƯD"}, d2 = {"\n`]<a@F])\rS", "", "\u0019", "$", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eo{:\u000105/", ""}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@DebugMetadata(c = "drixvqm\u00039o|z{ut\u0007|\u0004\u0004Dj{z\u000f\u0010\u0002\u0010k\u0001\u0011Eo\u0005\u0015|\u0019\t\u0019\u001a\u0010\u001eP\u0013\u001d$#\u001b\u0018'XfZ!-\u001f-\u001d1-1cq", f = " /,>=-9\u0013&4p-5", i = {0, 0, 0, 0, 0, 0, 0}, l = {703}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aK[;LG>FL", "\\\u001ak\\", "[WuZ;dFLN}O@", "X\u001ak\\", "bbqZ\u0016_X", "Q_v)akP[yC\\", "Y\u001ak\\"}, s = {"xQ^", "xQ`", "uQ^", "uQ_", "vQ^", "uQ`", "uQa"})
final class ScatterMap$MapWrapper$entries$1$iterator$1<K, V> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Map.Entry<? extends K, ? extends V>>, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScatterMap<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScatterMap$MapWrapper$entries$1$iterator$1(ScatterMap<K, V> scatterMap, Continuation<? super ScatterMap$MapWrapper$entries$1$iterator$1> continuation) {
        super(2, continuation);
        this.this$0 = scatterMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScatterMap$MapWrapper$entries$1$iterator$1 scatterMap$MapWrapper$entries$1$iterator$1 = new ScatterMap$MapWrapper$entries$1$iterator$1(this.this$0, continuation);
        scatterMap$MapWrapper$entries$1$iterator$1.L$0 = obj;
        return scatterMap$MapWrapper$entries$1$iterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super Map.Entry<? extends K, ? extends V>> sequenceScope, Continuation<? super Unit> continuation) {
        return ((ScatterMap$MapWrapper$entries$1$iterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:7:0x002a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0065 -> B:6:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008f -> B:23:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0091 -> B:8:0x002c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r12 = r19
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.label
            r0 = 8
            r10 = 1
            if (r1 == 0) goto L69
            if (r1 != r10) goto La2
            int r2 = r12.I$3
            int r1 = r12.I$2
            long r3 = r12.J$0
            int r9 = r12.I$1
            int r5 = r12.I$0
            java.lang.Object r8 = r12.L$2
            long[] r8 = (long[]) r8
            java.lang.Object r7 = r12.L$1
            androidx.collection.ScatterMap r7 = (androidx.collection.ScatterMap) r7
            java.lang.Object r6 = r12.L$0
            kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
            kotlin.ResultKt.throwOnFailure(r20)
        L28:
            r0 = 8
        L2a:
            long r3 = r3 >> r0
            int r2 = r2 + r10
        L2c:
            if (r2 >= r1) goto L9b
            r13 = 255(0xff, double:1.26E-321)
            r17 = -1
            long r15 = r17 - r13
            long r13 = r17 - r3
            long r15 = r15 | r13
            long r17 = r17 - r15
            r14 = 128(0x80, double:6.3E-322)
            int r13 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r13 >= 0) goto L68
            int r15 = r9 << 3
            int r15 = r15 + r2
            androidx.collection.MapEntry r14 = new androidx.collection.MapEntry
            java.lang.Object[] r0 = r7.keys
            r13 = r0[r15]
            java.lang.Object[] r0 = r7.values
            r0 = r0[r15]
            r14.<init>(r13, r0)
            r12.L$0 = r6
            r12.L$1 = r7
            r12.L$2 = r8
            r12.I$0 = r5
            r12.I$1 = r9
            r12.J$0 = r3
            r12.I$2 = r1
            r12.I$3 = r2
            r12.label = r10
            java.lang.Object r0 = r6.yield(r14, r12)
            if (r0 != r11) goto L28
            return r11
        L68:
            goto L2a
        L69:
            kotlin.ResultKt.throwOnFailure(r20)
            java.lang.Object r6 = r12.L$0
            kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
            androidx.collection.ScatterMap<K, V> r7 = r12.this$0
            long[] r8 = r7.metadata
            int r1 = r8.length
            int r5 = r1 + (-2)
            if (r5 < 0) goto Laa
            r9 = 0
        L7a:
            r3 = r8[r9]
            long r1 = ~r3
            r13 = 7
            long r1 = r1 << r13
            r15 = -1
            long r13 = r15 - r1
            long r1 = r15 - r3
            long r13 = r13 | r1
            long r15 = r15 - r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r15 = r15 & r13
            int r1 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r1 == 0) goto L9a
            int r1 = r9 - r5
            int r1 = ~r1
            int r1 = r1 >>> 31
            int r1 = 8 - r1
            r2 = 0
            goto L2c
        L9a:
            goto L9d
        L9b:
            if (r1 != r0) goto Laa
        L9d:
            if (r9 == r5) goto Laa
            int r9 = r9 + 1
            goto L7a
        La2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Laa:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
