package com.dynatrace.agent.communication.preprocessing;

import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.communication.filter.EventRecordSizeFilter;
import com.dynatrace.agent.storage.db.EndPointInfo;
import com.dynatrace.agent.storage.db.EventDatabaseDataSource;
import com.dynatrace.agent.storage.db.EventRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
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
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tpAӄLe^.ZS0\u0012s{J$cҕyCQU\"}8\tWNupvϺb\u000bQ\u0016\u000e\u0016~j4Ic\u0017e\u0012%2JoE6UoS9ht<\u0007(208\u0002\u0005\u0007\u001b0Ϻ&͌+Cy\u000bRUPtHR%M3\u001b\"\nL\"\u0019\u001e\u000bj^:Vpu:](\u0013mPT?_^\u0004֔\u0011HZ/\u001b\u007f*@9NOC%)c\u0005\u001dQ\nO\u0013A\u0002=3yU6[M\u0002iNX.'[ۇ\u000eոar4pM\u0004n!?=_e[P<9\b\u0003\f\u0013L\u0006\u001e\u0006U_\\CHu8\u0012A\r\u000bSnS2dH\u007f\tzN\u0017S\u0005yڀwӸjSgU'i\u007f&\u0013)6)\u0011p1[\u0003+\u000f+K^\u0006oIWP?XN8pk\u00044tp\u0004B\u0004^JF߽: 2\u0019+ViYk-y#`D\u0016\u0019K¢'רmRVcj\u0007$[B\t:jlj\u0015m`T\u0007I?cLX\u0015} \u0013N]><q4\u001eNgh\u0018kܷa\u0010-Ä~9_xy\u0019(El5MQ\u0012\u00138ׯx݀C<jڳ)rPW$Z\u000b-xøJн\u0014w\u0004ͩ\u001f\u0018!8WqJ;\u0003վ\u001bÅ\u0019H\u000bٜ\u0013M\u000b\u0015wZ\u0017\u001dUԡ5ʗ\u0007i,ڏ\u0590\u0005u"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001x#.XPEi4,#lj;PB0\\\u0002#VJQ(YYr\u001c\u0010!Vx[5\u001e\tXA1D", "", "/bc6i,\u001e\\\u0018\n\u0005b5\f", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#])6X 2VR\u001ft5(j", "2`c.U(LSwz\nZ\u001a\u0007\u0019<c\u007f", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\rIR7h0,\u0015G]H\u0003Q6^\u0004%G\"", "3me2_6IS\u0007\u0003\u0010^", "", "Bh\\2C9Hd\u001d}zk", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006\u0006)=YG\u000f;u\u0016\u0019ZMLo3\u001e\">", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ%&Q|\n>vn4VG\u007f@l\u00018QLJO=\u001f\u001f>H7\u0011kuM\u000b0C[[(ZR<9\u0016\u0012c\u001d\u00189\u001c\u000ff=&n\u000e6\u001cQ\fZ\u0002Dw_\b%\n2f~B5\fVu\u0003\u007fQ6fF/C`EKM,)x\u0015[,i68$]m\u001b\u001bq_w\b\u0006[\u0019|[CvkO\u0019D'(FmFSO\u0001Y;t4t\u000fl", "5dc\u000eV;Bd\u0019^\u0004]7\u0007\r8t", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`%Vy\u001b8x%~Xzi\u0017v\u0015\u0019WGDz\u0018'\u0016r7", "3uT;g\u0019>Q#\fyL0\u0012\t\u0010i\u00077{M", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001n\u001a5\\CH5\u0014/\u0015qp&\u0007a6[u\u0015KaN\r`Y\u0002=!g", "Ad[2V;\u001dO(z", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001x#.XPEi4,#lj;PB0\\\u0002#VJQ(YYr\u001c\u0010!Vc", "", ";`g\u000fX(<]\"l~s,Y\u001d>e\u000e", "", "uI;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^! Vs\u0017Lr49c\u0007uzT\u001b*^?\u0005r0'\u00172K6\fc*]L", ">qT X3>Q(]vm(", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\u0016MR7j0-\u0011>", "2`c.f6N`\u0017~", ":h\\6g\u0019He'", ">qT X3>Q(]vm(;\u00079my'\u0010I|&$Cm\u000e6r'5b\r\u001aDm\u001d.IQ;", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ%&Q|\n>vn4VG\u007fHm\u001f=,?Jg1\u001a#h@5\u0016_\u001aX\u00074EL$\u0010CX|L\u001b\u0016cWL5\u001a\u000fiP(wDEhe6R\u0011?q\u0011\b%\u0012?sF\u0006=\u0015C\u000b\u0011?H%qH#IvLACq\u007f", ":nP18=>\\(]vm(", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\u001bMAEx3s", "3uT;g\u0014>b\u0015}vm(", ":nP18=>\\(]vm(;\u00079my'\u0010I|&$Cm\u000e6r'5b\r\u001aDm\u001d.IQ;", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f&\u0006HJ\u0016+Pk\u001dIr#5#y\"7v%w[REx0 \u00152`6PC=N\u007f6&H](YN\u0001=r\u000ei\n<5\u001d\u0012WAyUJA.\u000f0RK9r\u000e\u0016&\u001d9spP mQ\u0003$yJ9dU]i\u0003\u001d\u0005,g&u\b)$XC<m}n\u001e\u001bf_\u0004", "A`]6g0SSwz\nZ\u001a\u0007\u0019<c\u007f", "", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "Bn36f7:b\u0017\u0002v[3|g+t{", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class DispatchableDataProvider {
    private final EndPointInfo activeEndpoint;
    private final EventDatabaseDataSource databaseDataSource;
    private final int envelopeSize;
    private final EventRecordSizeFilter eventRecordSizeFilter;
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$selectData$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return DispatchableDataProvider.this.selectData(0L, this);
        }
    }

    public DispatchableDataProvider(EndPointInfo activeEndpoint, EventDatabaseDataSource databaseDataSource, int i2, TimeProvider timeProvider) {
        Intrinsics.checkNotNullParameter(activeEndpoint, "activeEndpoint");
        Intrinsics.checkNotNullParameter(databaseDataSource, "databaseDataSource");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.activeEndpoint = activeEndpoint;
        this.databaseDataSource = databaseDataSource;
        this.envelopeSize = i2;
        this.timeProvider = timeProvider;
        this.eventRecordSizeFilter = new EventRecordSizeFilter(i2);
    }

    public static /* synthetic */ Object preSelectData$com_dynatrace_agent_release$default(DispatchableDataProvider dispatchableDataProvider, EventDatabaseDataSource eventDatabaseDataSource, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 + 2) - (i3 | 2) != 0) {
            i2 = 1000;
        }
        return dispatchableDataProvider.preSelectData$com_dynatrace_agent_release(eventDatabaseDataSource, i2, continuation);
    }

    private final DispatchableData toDispatchableData(List<EventRecord> list, EndPointInfo endPointInfo) {
        return new DispatchableData(endPointInfo, list, ((EventRecord) CollectionsKt.first((List) list)).isPriorityData());
    }

    public final EndPointInfo getActiveEndpoint() {
        return this.activeEndpoint;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object loadEventData$com_dynatrace_agent_release(java.util.List<com.dynatrace.agent.storage.db.EventMetadata> r8, com.dynatrace.agent.storage.db.EventDatabaseDataSource r9, kotlin.coroutines.Continuation<? super java.util.List<com.dynatrace.agent.storage.db.EventRecord>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$loadEventData$1
            if (r0 == 0) goto L86
            r5 = r10
            com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$loadEventData$1 r5 = (com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$loadEventData$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L86
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L16:
            java.lang.Object r2 = r5.result
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L3f
            if (r0 != r4) goto L8c
            java.lang.Object r8 = r5.L$0
            java.util.List r8 = (java.util.List) r8
            kotlin.ResultKt.throwOnFailure(r2)
        L2a:
            java.util.List r2 = (java.util.List) r2
            int r1 = r2.size()
            int r0 = r8.size()
            if (r1 == r0) goto L3e
            java.lang.String r1 = "dtxCommunication"
            java.lang.String r0 = "ALERT! actual record size does not match metadata size"
            com.dynatrace.android.agent.util.Utility.devLog(r1, r0)
        L3e:
            return r2
        L3f:
            kotlin.ResultKt.throwOnFailure(r2)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L4d
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        L4d:
            r1 = r8
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r0)
            r3.<init>(r0)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r2 = r1.iterator()
        L61:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r2.next()
            com.dynatrace.agent.storage.db.EventMetadata r0 = (com.dynatrace.agent.storage.db.EventMetadata) r0
            long r0 = r0.getId()
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
            r3.add(r0)
            goto L61
        L79:
            java.util.List r3 = (java.util.List) r3
            r5.L$0 = r8
            r5.label = r4
            java.lang.Object r2 = r9.fetchEventRecordByIds(r3, r5)
            if (r2 != r6) goto L2a
            return r6
        L86:
            com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$loadEventData$1 r5 = new com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$loadEventData$1
            r5.<init>(r7, r10)
            goto L16
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider.loadEventData$com_dynatrace_agent_release(java.util.List, com.dynatrace.agent.storage.db.EventDatabaseDataSource, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object preSelectData$com_dynatrace_agent_release(com.dynatrace.agent.storage.db.EventDatabaseDataSource r8, int r9, kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Boolean, ? extends java.util.List<com.dynatrace.agent.storage.db.EventMetadata>>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$preSelectData$1
            if (r0 == 0) goto L87
            r6 = r10
            com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$preSelectData$1 r6 = (com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$preSelectData$1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L87
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L16:
            java.lang.Object r5 = r6.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r6.label
            r3 = 0
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L48
            if (r2 == r0) goto L61
            if (r2 != r1) goto L8d
            int r9 = r6.I$0
            java.lang.Object r2 = r6.L$0
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            kotlin.ResultKt.throwOnFailure(r5)
        L30:
            java.util.List r5 = (java.util.List) r5
            int r0 = r5.size()
            if (r0 >= r9) goto L3a
            r2.element = r3
        L3a:
            java.util.List r5 = (java.util.List) r5
            kotlin.Pair r1 = new kotlin.Pair
            boolean r0 = r2.element
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            r1.<init>(r0, r5)
            return r1
        L48:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlin.jvm.internal.Ref$BooleanRef r2 = new kotlin.jvm.internal.Ref$BooleanRef
            r2.<init>()
            r2.element = r0
            r6.L$0 = r8
            r6.L$1 = r2
            r6.I$0 = r9
            r6.label = r0
            java.lang.Object r5 = r8.fetchEventMetadata(r0, r9, r6)
            if (r5 != r4) goto L6e
            return r4
        L61:
            int r9 = r6.I$0
            java.lang.Object r2 = r6.L$1
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r8 = r6.L$0
            com.dynatrace.agent.storage.db.EventDatabaseDataSource r8 = (com.dynatrace.agent.storage.db.EventDatabaseDataSource) r8
            kotlin.ResultKt.throwOnFailure(r5)
        L6e:
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L3a
            r6.L$0 = r2
            r0 = 0
            r6.L$1 = r0
            r6.I$0 = r9
            r6.label = r1
            java.lang.Object r5 = r8.fetchEventMetadata(r3, r9, r6)
            if (r5 != r4) goto L86
            return r4
        L86:
            goto L30
        L87:
            com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$preSelectData$1 r6 = new com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$preSelectData$1
            r6.<init>(r7, r10)
            goto L16
        L8d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider.preSelectData$com_dynatrace_agent_release(com.dynatrace.agent.storage.db.EventDatabaseDataSource, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object sanitizeDataSource(Continuation<? super Unit> continuation) {
        Object objDeleteAllBefore = this.databaseDataSource.deleteAllBefore(this.timeProvider.millisSinceEpoch(), Duration.m10324getInWholeMillisecondsimpl(DispatchableDataProviderKt.RETENTION_TIME), continuation);
        return objDeleteAllBefore == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDeleteAllBefore : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object selectData(long r17, kotlin.coroutines.Continuation<? super kotlin.Pair<com.dynatrace.agent.communication.preprocessing.DispatchableData, java.lang.Boolean>> r19) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider.selectData(long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
