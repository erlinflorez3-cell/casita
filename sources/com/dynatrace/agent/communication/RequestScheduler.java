package com.dynatrace.agent.communication;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007fјnjG0L͜P.hS2şs{J$c$\bCCU \u0001(ޛeȞ\u0018g\u001dI\u001b\u0018S\u0013\u0014\u0016\u0011jZJǤ|_\u0018\u0011@E8uAS\b=gg%<\u000b @*Py3\nJDV\u001a\u000f\u0011IJ\u001c\u001a@F\u0001<b\r{\fH\u001e\u0016B0\u00034[\u0016MdS3Ҟxǥ'\u0005oO\\5(<\u000b\\%F\u0003.Sǿ ӿ/@EEe1a\u0003\u001fR\n@YӍsݘ\th/ݐ{W\u0002[NZ\u0016\u0013C0&\u0558ię*\\\rĩԉ\u00108"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001Z\u0016:]CIz\"\u001c\u0018h`I\u000ec9$", "", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7CY\u001f", "8nQ", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "AbW2W<ES", "", "AbW2W<EW\"\u0001ib4|", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "AbW2W<ES`dar2\r\u0005\u0013", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu\u001es =TGD52(\"rqH\u000bl,\\@\u0005QU]0ebnL\u0018\u001ccc\u0012\u0012\u0012\u0001j=mu@@!Q\u0016F\u0007;f\u0010a", "As^=8?>Q)\u000e~h5", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class RequestScheduler {
    private Job job;
    private final CoroutineScope scope;

    public RequestScheduler(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
    }

    /* JADX INFO: renamed from: schedule-KLykuaI$default, reason: not valid java name */
    public static /* synthetic */ Object m7104scheduleKLykuaI$default(RequestScheduler requestScheduler, long j2, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            j2 = Duration.Companion.m10409getZEROUwyO8pc();
        }
        return requestScheduler.m7105scheduleKLykuaI(j2, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX INFO: renamed from: schedule-KLykuaI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m7105scheduleKLykuaI(long r9, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.dynatrace.agent.communication.RequestScheduler$schedule$1
            if (r0 == 0) goto L61
            r4 = r12
            com.dynatrace.agent.communication.RequestScheduler$schedule$1 r4 = (com.dynatrace.agent.communication.RequestScheduler$schedule$1) r4
            int r0 = r4.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L61
            int r0 = r4.label
            int r0 = r0 - r2
            r4.label = r0
        L19:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L49
            if (r0 != r1) goto L67
            long r9 = r4.J$0
            java.lang.Object r11 = r4.L$1
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            java.lang.Object r1 = r4.L$0
            com.dynatrace.agent.communication.RequestScheduler r1 = (com.dynatrace.agent.communication.RequestScheduler) r1
            kotlin.ResultKt.throwOnFailure(r3)
        L33:
            kotlinx.coroutines.CoroutineScope r2 = r1.scope
            com.dynatrace.agent.communication.RequestScheduler$schedule$2 r5 = new com.dynatrace.agent.communication.RequestScheduler$schedule$2
            r3 = 0
            r5.<init>(r9, r11, r3)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r6 = 3
            r7 = 0
            r4 = 0
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt.launch$default(r2, r3, r4, r5, r6, r7)
            r1.job = r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L49:
            kotlin.ResultKt.throwOnFailure(r3)
            kotlinx.coroutines.Job r0 = r8.job
            if (r0 == 0) goto L5f
            r4.L$0 = r8
            r4.L$1 = r11
            r4.J$0 = r9
            r4.label = r1
            java.lang.Object r0 = kotlinx.coroutines.JobKt.cancelAndJoin(r0, r4)
            if (r0 != r2) goto L5f
            return r2
        L5f:
            r1 = r8
            goto L33
        L61:
            com.dynatrace.agent.communication.RequestScheduler$schedule$1 r4 = new com.dynatrace.agent.communication.RequestScheduler$schedule$1
            r4.<init>(r8, r12)
            goto L19
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.RequestScheduler.m7105scheduleKLykuaI(long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object stopExecution(Continuation<? super Unit> continuation) {
        Object objCancelAndJoin;
        Job job = this.job;
        return (job == null || (objCancelAndJoin = JobKt.cancelAndJoin(job, continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : objCancelAndJoin;
    }
}
