package androidx.activity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import yg.InterfaceC1492Gx;

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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: FullyDrawnReporter.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d̉=!,i\bDZc|İI\u0006F\u000b6B\u0015\"4\u0012\u0006јnj?0\\\u0017V\u008cjSX\u000e\u0014{b$\f>\u007fDSk |2\u0011_Twi~J\t\nq\u0012\u0016\u001a\tlBH\u0004|\f\u0014U˷\tƜ>\u074cޜs=Geҝ6\u0007(2(Oѯ\t\u0007"}, d2 = {"@d_<e;0V\u0019\bXh4\b\u0010/t\u007f", "", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\\P\b\u001e+&|\nN\u007f\u00125d\b-Fm#\u0004", "@d_<e;>`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "uKP;W9HW\u0018\u0012DZ*\f\r@i\u000f<E!\u0011\u001e\u001e[N\u001b8\t.\"Y\t*D|\u0016;#*AuC%\u0019q+>\u0018kuO\u00070E[R6e`<\u001e$\u001bX\u001dR5\u0016P/(*xS>#\u0011uG\fHr\u0011\u001b\u001a\u00175x: `\u0019V}\u001e\u0006=8lPb5=.FAs&.\u0013[&^\u0004$!\u0019q\u0017*>", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FullyDrawnReporterKt {

    /* JADX INFO: renamed from: androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1, reason: invalid class name */
    /* JADX INFO: compiled from: FullyDrawnReporter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    @DebugMetadata(c = "drixvqm\u00039mp\u0003x\u0007z\u0007\rB[\f\u0004\u0005\u0013^\u000e}\u0015\rq\u0006\u0012\u0012\u0016\u0019\u000b\u0019r\u001d", f = "\u0013A76B\f9'<2\u0015'1/12\".h%-", i = {0}, l = {185}, m = "A5AAEH,><F\u001cIHLICSE", n = {"\u0013jjOe\u001aTLFIX>.B$4u&/\u0017\u001e\u001c\u001b\u0010"}, s = {"xQ^"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return FullyDrawnReporterKt.reportWhenComplete(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object reportWhenComplete(androidx.activity.FullyDrawnReporter r5, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof androidx.activity.FullyDrawnReporterKt.AnonymousClass1
            if (r0 == 0) goto L2b
            r4 = r7
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r4 = (androidx.activity.FullyDrawnReporterKt.AnonymousClass1) r4
            int r0 = r4.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L2b
            int r0 = r4.label
            int r0 = r0 - r2
            r4.label = r0
        L19:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L3d
            if (r0 != r1) goto L35
            java.lang.Object r5 = r4.L$0
            androidx.activity.FullyDrawnReporter r5 = (androidx.activity.FullyDrawnReporter) r5
            goto L31
        L2b:
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r4 = new androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1
            r4.<init>(r7)
            goto L19
        L31:
            kotlin.ResultKt.throwOnFailure(r3)     // Catch: java.lang.Throwable -> L63
            goto L57
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3d:
            kotlin.ResultKt.throwOnFailure(r3)
            r5.addReporter()
            boolean r0 = r5.isFullyDrawnReported()
            if (r0 == 0) goto L4c
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L4c:
            r4.L$0 = r5     // Catch: java.lang.Throwable -> L63
            r4.label = r1     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r6.invoke(r4)     // Catch: java.lang.Throwable -> L63
            if (r0 != r2) goto L57
            return r2
        L57:
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            r5.removeReporter()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L63:
            r0 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            r5.removeReporter()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.FullyDrawnReporterKt.reportWhenComplete(androidx.activity.FullyDrawnReporter, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final Object reportWhenComplete$$forInline(FullyDrawnReporter fullyDrawnReporter, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Unit> continuation) {
        fullyDrawnReporter.addReporter();
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return Unit.INSTANCE;
        }
        try {
            function1.invoke(continuation);
            InlineMarker.finallyStart(1);
            fullyDrawnReporter.removeReporter();
            InlineMarker.finallyEnd(1);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            fullyDrawnReporter.removeReporter();
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }
}
