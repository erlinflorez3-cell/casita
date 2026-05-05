package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import yg.InterfaceC1492Gx;

/* JADX INFO: Add missing generic type declarations: [T] */
/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001b\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000bDB\u0007\"2\u0012 \u0006߿pAFǏ\u0016N>Tc*Eӆ*3lu2q[;\u0004\u001b.,\u0017QfmwpZZA¼=\t\\ѥ)߽MU\u0007aܱ\u00137ՈsЀ"}, d2 = {"9nc9\\5Q\u001d\u0017\t\bh<\f\r8e\u000eq|G\u000b)`Kx\u001d<\u0004.1`G\u000e3n\u0016\fWJBk2-\u001fu[7\u0011k4X\u007f\rV\u000b^5jNs=t\u0019d \rv", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "1n[9X*M", "", "1n[9X*M]&", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u0013c\u0005'7k%8Z\u0019\"q>-\u001clj\u0003\u0005m9X\u00076KUN:&0|F#\u0016c\u001eJ:\u0011\u000fb\u0017gUI30\u0004uP}DjJu\u0013\u00135h\u007f\u0018", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> implements Flow<T> {
    final /* synthetic */ Function3 $action$inlined;
    final /* synthetic */ Flow $this_onCompletion$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(Flow flow, Function3 function3) {
        this.$this_onCompletion$inlined = flow;
        this.$action$inlined = function3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L2f
            r5 = r12
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r5 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L2f
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L16:
            java.lang.Object r9 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r8 = 3
            r7 = 2
            r1 = 1
            r6 = 0
            if (r0 == 0) goto L4d
            if (r0 == r1) goto L41
            if (r0 == r7) goto Laa
            if (r0 != r8) goto L39
            java.lang.Object r3 = r5.L$0
            kotlinx.coroutines.flow.internal.SafeCollector r3 = (kotlinx.coroutines.flow.internal.SafeCollector) r3
            goto L35
        L2f:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r5 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1
            r5.<init>(r12)
            goto L16
        L35:
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L8b
            goto L83
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L41:
            java.lang.Object r11 = r5.L$1
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            java.lang.Object r2 = r5.L$0
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 r2 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) r2
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L93
            goto L63
        L4d:
            kotlin.ResultKt.throwOnFailure(r9)
            r0 = r5
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            kotlinx.coroutines.flow.Flow r0 = r10.$this_onCompletion$inlined     // Catch: java.lang.Throwable -> L90
            r5.L$0 = r10     // Catch: java.lang.Throwable -> L90
            r5.L$1 = r11     // Catch: java.lang.Throwable -> L90
            r5.label = r1     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r0.collect(r11, r5)     // Catch: java.lang.Throwable -> L90
            if (r0 != r4) goto L62
            return r4
        L62:
            r2 = r10
        L63:
            kotlinx.coroutines.flow.internal.SafeCollector r3 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.CoroutineContext r0 = r5.getContext()
            r3.<init>(r11, r0)
            kotlin.jvm.functions.Function3 r1 = r2.$action$inlined     // Catch: java.lang.Throwable -> L89
            r5.L$0 = r3     // Catch: java.lang.Throwable -> L89
            r5.L$1 = r6     // Catch: java.lang.Throwable -> L89
            r5.label = r8     // Catch: java.lang.Throwable -> L89
            r0 = 6
            kotlin.jvm.internal.InlineMarker.mark(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.Object r1 = r1.invoke(r3, r6, r5)     // Catch: java.lang.Throwable -> L89
            r0 = 7
            kotlin.jvm.internal.InlineMarker.mark(r0)     // Catch: java.lang.Throwable -> L89
            if (r1 != r4) goto L83
            return r4
        L83:
            r3.releaseIntercepted()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L89:
            r0 = move-exception
            goto L8c
        L8b:
            r0 = move-exception
        L8c:
            r3.releaseIntercepted()
            throw r0
        L90:
            r3 = move-exception
            r2 = r10
            goto L94
        L93:
            r3 = move-exception
        L94:
            kotlinx.coroutines.flow.ThrowingCollector r1 = new kotlinx.coroutines.flow.ThrowingCollector
            r1.<init>(r3)
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.jvm.functions.Function3 r0 = r2.$action$inlined
            r5.L$0 = r3
            r5.L$1 = r6
            r5.label = r7
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__EmittersKt.access$invokeSafely$FlowKt__EmittersKt(r1, r0, r3, r5)
            if (r0 != r4) goto Lb1
            return r4
        Laa:
            java.lang.Object r3 = r5.L$0
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            kotlin.ResultKt.throwOnFailure(r9)
        Lb1:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
