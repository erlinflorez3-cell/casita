package androidx.tracing;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Trace.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<;\"&i\u0016DLc\u0003\u0010I\u00066\u00106B\r(4\u0012}\bnjO0Le^.ZS8şs{:$sU\u007fّSU`|B\u000bUȞuf\u001fTh\u000b[\u0015\u0016\u0018\tjZK\u0004y\u000e\u001c\u001d5ZuO5]o\u00048\u000fu|ӓ&\u07be!\u0600ѩ\t\u0001(.`=\u0005ٙ[KR\u0011PBví`\f}\t(\u0017\u001e>N\u0003NhmPDK\u0005cJ13\u00030A|(&ܥ\u0003ת\fϿù+\r\u0005g6jN>M\u0015kR#\tX¹M\u0002o{K\r\u0001-7-Ys\u00068\u0007\u0001D\u001f9X%c\u0003(l\u0005\u007fj:([YqNh\u00148y\u000b{S;2\u000fLΰNό,ԿǴ\f\u000eA\u007f\u000b\u0019NW\u001a^\t~\u001bc<Ѝ3~c/G'~Q\u0010=IRE\t\u001d\rL-1\u000b']b\u0011x+!S\bYAWP?XNPXk|\u0014tr\u0004@\u0003^W.=B\u0084tш$6٦=#/|ȸHMoy\u000bµ\u0019\u0002hZHF9ë\u001aI"}, d2 = {"BqP0X", "\"", ":`iF?(;S ", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "0k^0^", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d\\0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", ":`Q2_", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010.\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "BqP0X\bLg\"|", ":`iF@,MV#}cZ4|", ":`iF66HY\u001d~", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d\\0tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003_K\u0005\u0010mBj[CN=NdsN\td\u001dZI\u0010", ";dc5b+'O!~", "1n^8\\,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'\u0007!&Ns\u0017\u0006{6=#~0@k%2WLI5\u0015.\u001efp=\u0011lw$]-Q[U0e\u001cpG!\u001cj\u001dR4\r\u0013#\u001f.wS;(\u0018(X\u0006EqVO|\u00131{l\f]\fP{^_>.hDh5", "BqP0\\5@\u001b\u001f\u000e\u000eX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TraceKt {

    /* JADX INFO: renamed from: androidx.tracing.TraceKt$traceAsync$1, reason: invalid class name */
    /* JADX INFO: compiled from: Trace.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    @DebugMetadata(c = "drixvqm\u00039\u0001\u007fory\u007fyAh\bwz}d\u000f", f = "!>,-.u2:", i = {0, 0}, l = {76}, m = "CB258\u0015HOE;", n = {"\\[vNaZ0HC?", "ReqQ[["}, s = {"xQ^", "uQ^"})
    static final class AnonymousClass1<T> extends ContinuationImpl {
        int I$0;
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
            return TraceKt.traceAsync(null, 0, null, this);
        }
    }

    public static final <T> T trace(String label, Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(block, "block");
        Trace.beginSection(label);
        try {
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            Trace.endSection();
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <T> T trace(Function0<String> lazyLabel, Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(lazyLabel, "lazyLabel");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean zIsEnabled = Trace.isEnabled();
        if (zIsEnabled) {
            Trace.beginSection(lazyLabel.invoke());
        }
        try {
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            if (zIsEnabled) {
                Trace.endSection();
            }
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object traceAsync(java.lang.String r5, int r6, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super T> r8) {
        /*
            boolean r0 = r8 instanceof androidx.tracing.TraceKt.AnonymousClass1
            if (r0 == 0) goto L27
            r4 = r8
            androidx.tracing.TraceKt$traceAsync$1 r4 = (androidx.tracing.TraceKt.AnonymousClass1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L27
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L13:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 != r1) goto L31
            int r6 = r4.I$0
            java.lang.Object r5 = r4.L$0
            java.lang.String r5 = (java.lang.String) r5
            goto L2d
        L27:
            androidx.tracing.TraceKt$traceAsync$1 r4 = new androidx.tracing.TraceKt$traceAsync$1
            r4.<init>(r8)
            goto L13
        L2d:
            kotlin.ResultKt.throwOnFailure(r3)     // Catch: java.lang.Throwable -> L56
            goto L4c
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L39:
            kotlin.ResultKt.throwOnFailure(r3)
            androidx.tracing.Trace.beginAsyncSection(r5, r6)
            r4.L$0 = r5     // Catch: java.lang.Throwable -> L56
            r4.I$0 = r6     // Catch: java.lang.Throwable -> L56
            r4.label = r1     // Catch: java.lang.Throwable -> L56
            java.lang.Object r3 = r7.invoke(r4)     // Catch: java.lang.Throwable -> L56
            if (r3 != r2) goto L4c
            return r2
        L4c:
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            androidx.tracing.Trace.endAsyncSection(r5, r6)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r3
        L56:
            r0 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            androidx.tracing.Trace.endAsyncSection(r5, r6)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.tracing.TraceKt.traceAsync(java.lang.String, int, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final <T> Object traceAsync$$forInline(String str, int i2, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        Trace.beginAsyncSection(str, i2);
        try {
            return function1.invoke(continuation);
        } finally {
            InlineMarker.finallyStart(1);
            Trace.endAsyncSection(str, i2);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <T> T traceAsync(Function0<String> lazyMethodName, Function0<Integer> lazyCookie, Function0<? extends T> block) {
        String strInvoke;
        int iIntValue;
        Intrinsics.checkNotNullParameter(lazyMethodName, "lazyMethodName");
        Intrinsics.checkNotNullParameter(lazyCookie, "lazyCookie");
        Intrinsics.checkNotNullParameter(block, "block");
        if (Trace.isEnabled()) {
            strInvoke = lazyMethodName.invoke();
            iIntValue = lazyCookie.invoke().intValue();
            Trace.beginAsyncSection(strInvoke, iIntValue);
        } else {
            strInvoke = null;
            iIntValue = 0;
        }
        try {
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            if (strInvoke != null) {
                Trace.endAsyncSection(strInvoke, iIntValue);
            }
            InlineMarker.finallyEnd(1);
        }
    }
}
