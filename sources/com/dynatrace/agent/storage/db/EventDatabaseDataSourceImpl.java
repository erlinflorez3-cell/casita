package com.dynatrace.agent.storage.db;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\":\u0012\u007fјnjO0LeN.ZS8-s{:$c$\bCC٥\"}0\u0012WȞog|Pb\u000bI\u0010\u000e\u0016\u0007q4I[\u0002c܈%˰`\u000fo3{nu8\u007f5C\u0015$@\"Py3\u0002ʀ.J\u0016x\tF\u0014  4XphW=Q\u0013 *\u0006l'GȽ\u001bʄR6Vt&L=,\u001boRP7_^\u0004{\u0017\ríe˼za,6\tYC!=Y\u0013\tb[m\u0010m{m\tv5?+w\u0003\b:f\u0010,\u0015Y`SƵ1͉`\u0005_rTG9b{Q`\u00108w)\u0003;F4\u0018\u0014;`4=\u001cv\b<H#|\u001aĊ\u000fؿbB\u000e\u0011*R%<\u00183Y>Kj_yS\u0019|L,\t\u001b7;\u0001\u001d6\"ځL\u05ce\u0019\u001bb\u0012\u001aK_[UH|\u000f\nG{ \th\u0012,\u00140u\u0007]\u0006WћUÉ;[G9i\u0006\u0010e\\g%\n\u0011ra}jNP$~\u0016e?7\u0016!ռ#ʰoPbnt\u001d[:l\u0007,\rYؕ\u001bʟ@!3\u001b\u001f[vi\u0003M\f\u000b{ÇhƠ]nsލČ=~"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\rIR7h0,\u0015G]H\u0003Q6^\u0004%G0V7c(", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\rIR7h0,\u0015G]H\u0003Q6^\u0004%G\"", "2`^", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\rIM\u0011", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ%&Q|\n>vn4VG\u007fHm\u001f=,?EAw\u000f", ">tc", "", "3uT;g\u0019>Q#\fy", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\u001bMAEx3s", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ%&Q|\n>vn4VG\u007fHm\u001f=:C9uA\u001djOgC\u0016j0W@%QYX<kV{=\"[8\u0018W:\u0011\u000ei=3rN@tK\u0013N}LdJ\u0013\u0012\u001774Z?[\u0010E\tj", "5dc\u000e_3", "", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "4dc0[\fOS\"\u000eb^;x\b+t{", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\u0016MR7j0-\u0011>", "7r??\\6KW(\u0013", "", ":h\\6g\u0019He'", "", "uY8\u0019^6MZ\u001d\bD\\6\n\u0013?t\u00041{NJt!P~\u0012E\u0007!D]\b)\r1|3IT75;\u001a\u001ej+#\u0004h,L\u0006|", "4dc0[\fOS\"\u000eg^*\u0007\u0016.B\u0014\fzN", "@dR<e+\"R'", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f.\u0006O\b\u001b \u0011m\u0018I\u00015D]\u0007 E7s8VR?tD\u001a$lkB\\'\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001", "2d[2g,\u001aZ [z_6\n\t", "<nf", "@dc2a;B]\"m~f,", "uI9\u0019^6MZ\u001d\bD\\6\n\u0013?t\u00041{NJt!P~\u0012E\u0007!D]\b)\r1|3IT75;\u001a\u001ej+#\u0004h,L\u0006|", "2d[2g,", "3uT;g\u0019>Q#\fyl", "2d[2g,\"R'", "2d[2g,\u001aZ ", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class EventDatabaseDataSourceImpl implements EventDatabaseDataSource {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String EXCEPTION_LOG_MESSAGE = "operation was not completed for DB: ";
    private final EventDao dao;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176Ȑ\u0005ӯ-(Մ7f\u00198pKkH¯VU0\u000fy|\u00050i&\nCiXpԉt\u07beSNo˧ĚN^"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\rIR7h0,\u0015G]H\u0003Q6^\u0004%G0V7c\u0011PG\u001c\u001dV\u0017R5\u0016Z", "", "\nh]6g\u0005", "u(E", "\u0013W2\u0012C\u001b\"=\u0002xaH\u000evp\u000fSm\u0004] ", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$delete$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
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
            return EventDatabaseDataSourceImpl.this.delete(null, this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteAll$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11231 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C11231(Continuation<? super C11231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return EventDatabaseDataSourceImpl.this.deleteAll(this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteAllBefore$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11241 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C11241(Continuation<? super C11241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return EventDatabaseDataSourceImpl.this.deleteAllBefore(0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteIds$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11251 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C11251(Continuation<? super C11251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventDatabaseDataSourceImpl.this.deleteIds(null, this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$fetchEventMetadata$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11261 extends ContinuationImpl {
        int I$0;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C11261(Continuation<? super C11261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return EventDatabaseDataSourceImpl.this.fetchEventMetadata(false, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$fetchEventRecordByIds$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11271 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C11271(Continuation<? super C11271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventDatabaseDataSourceImpl.this.fetchEventRecordByIds(null, this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$getAll$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11281 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11281(Continuation<? super C11281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return EventDatabaseDataSourceImpl.this.getAll(this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$put$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11291 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C11291(Continuation<? super C11291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return EventDatabaseDataSourceImpl.this.put(null, this);
        }
    }

    public EventDatabaseDataSourceImpl(EventDao dao) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.dao = dao;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    @Override // com.dynatrace.agent.storage.db.EventDatabaseDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object delete(java.util.List<com.dynatrace.agent.storage.db.EventRecord> r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.AnonymousClass1
            if (r0 == 0) goto L24
            r5 = r8
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$delete$1 r5 = (com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.AnonymousClass1) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L24
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L13:
            java.lang.Object r1 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            java.lang.String r3 = "dtxStorage"
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 != r2) goto L2e
            goto L2a
        L24:
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$delete$1 r5 = new com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$delete$1
            r5.<init>(r8)
            goto L13
        L2a:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L56
            goto L5f
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "db event delete, eventRecords: "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r7)
            java.lang.String r0 = r0.toString()
            com.dynatrace.android.agent.util.Utility.devLog(r3, r0)
            com.dynatrace.agent.storage.db.EventDao r0 = r6.dao     // Catch: java.lang.Exception -> L56
            r5.label = r2     // Catch: java.lang.Exception -> L56
            java.lang.Object r0 = r0.delete(r7, r5)     // Catch: java.lang.Exception -> L56
            if (r0 != r4) goto L5f
            return r4
        L56:
            r1 = move-exception
            java.lang.String r0 = "operation was not completed for DB: delete"
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            com.dynatrace.android.agent.util.Utility.devLog(r3, r0, r1)
        L5f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.delete(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    @Override // com.dynatrace.agent.storage.db.EventDatabaseDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object deleteAll(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11231
            if (r0 == 0) goto L27
            r5 = r7
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteAll$1 r5 = (com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11231) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L27
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L16:
            java.lang.Object r4 = r5.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            java.lang.String r2 = "dtxStorage"
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 != r1) goto L31
            goto L2d
        L27:
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteAll$1 r5 = new com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteAll$1
            r5.<init>(r7)
            goto L16
        L2d:
            kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Exception -> L4c
            goto L55
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L39:
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.String r0 = "db event deleteAll"
            com.dynatrace.android.agent.util.Utility.devLog(r2, r0)
            com.dynatrace.agent.storage.db.EventDao r0 = r6.dao     // Catch: java.lang.Exception -> L4c
            r5.label = r1     // Catch: java.lang.Exception -> L4c
            java.lang.Object r0 = r0.deleteAll(r5)     // Catch: java.lang.Exception -> L4c
            if (r0 != r3) goto L55
            return r3
        L4c:
            r1 = move-exception
            java.lang.String r0 = "operation was not completed for DB: deleteAll"
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            com.dynatrace.android.agent.util.Utility.devLog(r2, r0, r1)
        L55:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.deleteAll(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    @Override // com.dynatrace.agent.storage.db.EventDatabaseDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object deleteAllBefore(long r12, long r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r16) {
        /*
            r11 = this;
            r3 = r16
            boolean r0 = r3 instanceof com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11241
            if (r0 == 0) goto L29
            r10 = r3
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteAllBefore$1 r10 = (com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11241) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L29
            int r0 = r10.label
            int r0 = r0 - r1
            r10.label = r0
        L18:
            java.lang.Object r1 = r10.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r10.label
            java.lang.String r2 = "dtxStorage"
            r4 = 1
            if (r0 == 0) goto L3b
            if (r0 != r4) goto L33
            goto L2f
        L29:
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteAllBefore$1 r10 = new com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteAllBefore$1
            r10.<init>(r3)
            goto L18
        L2f:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L67
            goto L70
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3b:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "db event deleteAllBefore, now: "
            r1.<init>(r0)
            r6 = r12
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r0 = ", retentionTime: "
            java.lang.StringBuilder r0 = r1.append(r0)
            r8 = r14
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.dynatrace.android.agent.util.Utility.devLog(r2, r0)
            com.dynatrace.agent.storage.db.EventDao r5 = r11.dao     // Catch: java.lang.Exception -> L67
            r10.label = r4     // Catch: java.lang.Exception -> L67
            java.lang.Object r0 = r5.deleteOutdated(r6, r8, r10)     // Catch: java.lang.Exception -> L67
            if (r0 != r3) goto L70
            return r3
        L67:
            r1 = move-exception
            java.lang.String r0 = "operation was not completed for DB: deleteAllBefore"
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            com.dynatrace.android.agent.util.Utility.devLog(r2, r0, r1)
        L70:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.deleteAllBefore(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    @Override // com.dynatrace.agent.storage.db.EventDatabaseDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object deleteIds(java.util.List<java.lang.Long> r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11251
            if (r0 == 0) goto L2a
            r5 = r8
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteIds$1 r5 = (com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11251) r5
            int r0 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L2a
            int r0 = r5.label
            int r0 = r0 - r2
            r5.label = r0
        L19:
            java.lang.Object r1 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            java.lang.String r3 = "dtxStorage"
            r2 = 1
            if (r0 == 0) goto L3c
            if (r0 != r2) goto L34
            goto L30
        L2a:
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteIds$1 r5 = new com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteIds$1
            r5.<init>(r8)
            goto L19
        L30:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L5c
            goto L65
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3c:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "db event deleteIds, recordIds: "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r7)
            java.lang.String r0 = r0.toString()
            com.dynatrace.android.agent.util.Utility.devLog(r3, r0)
            com.dynatrace.agent.storage.db.EventDao r0 = r6.dao     // Catch: java.lang.Exception -> L5c
            r5.label = r2     // Catch: java.lang.Exception -> L5c
            java.lang.Object r0 = r0.deleteById(r7, r5)     // Catch: java.lang.Exception -> L5c
            if (r0 != r4) goto L65
            return r4
        L5c:
            r1 = move-exception
            java.lang.String r0 = "operation was not completed for DB: deleteIds"
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            com.dynatrace.android.agent.util.Utility.devLog(r3, r0, r1)
        L65:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.deleteIds(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    @Override // com.dynatrace.agent.storage.db.EventDatabaseDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object fetchEventMetadata(boolean r8, int r9, kotlin.coroutines.Continuation<? super java.util.List<com.dynatrace.agent.storage.db.EventMetadata>> r10) {
        /*
            r7 = this;
            java.lang.String r5 = "db event fetchEventMetadata: "
            boolean r0 = r10 instanceof com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11261
            if (r0 == 0) goto L2e
            r6 = r10
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$fetchEventMetadata$1 r6 = (com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11261) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2e
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L15:
            java.lang.Object r0 = r6.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r6.label
            java.lang.String r2 = "dtxStorage"
            r1 = 1
            if (r3 == 0) goto L3c
            if (r3 != r1) goto L34
            int r9 = r6.I$0
            boolean r8 = r6.Z$0
            java.lang.Object r4 = r6.L$0
            java.util.List r4 = (java.util.List) r4
            goto L56
        L2e:
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$fetchEventMetadata$1 r6 = new com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$fetchEventMetadata$1
            r6.<init>(r10)
            goto L15
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3c:
            kotlin.ResultKt.throwOnFailure(r0)
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            com.dynatrace.agent.storage.db.EventDao r0 = r7.dao     // Catch: java.lang.Exception -> L81
            r6.L$0 = r3     // Catch: java.lang.Exception -> L81
            r6.Z$0 = r8     // Catch: java.lang.Exception -> L81
            r6.I$0 = r9     // Catch: java.lang.Exception -> L81
            r6.label = r1     // Catch: java.lang.Exception -> L81
            java.lang.Object r0 = r0.fetchEventMetadata(r8, r9, r6)     // Catch: java.lang.Exception -> L81
            if (r0 != r4) goto L54
            return r4
        L54:
            r4 = r3
            goto L59
        L56:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Exception -> L84
        L59:
            r3 = r0
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Exception -> L84
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L81
            r0.<init>(r5)     // Catch: java.lang.Exception -> L81
            java.lang.StringBuilder r1 = r0.append(r3)     // Catch: java.lang.Exception -> L81
            java.lang.String r0 = ", isPriority: "
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Exception -> L81
            java.lang.StringBuilder r1 = r0.append(r8)     // Catch: java.lang.Exception -> L81
            java.lang.String r0 = ", limitRows: "
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Exception -> L81
            java.lang.StringBuilder r0 = r0.append(r9)     // Catch: java.lang.Exception -> L81
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L81
            com.dynatrace.android.agent.util.Utility.devLog(r2, r0)     // Catch: java.lang.Exception -> L81
            goto L8e
        L81:
            r1 = move-exception
            r4 = r3
            goto L85
        L84:
            r1 = move-exception
        L85:
            java.lang.String r0 = "operation was not completed for DB: fetchEventMetadata"
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            com.dynatrace.android.agent.util.Utility.devLog(r2, r0, r1)
            r3 = r4
        L8e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.fetchEventMetadata(boolean, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    @Override // com.dynatrace.agent.storage.db.EventDatabaseDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object fetchEventRecordByIds(java.util.List<java.lang.Long> r9, kotlin.coroutines.Continuation<? super java.util.List<com.dynatrace.agent.storage.db.EventRecord>> r10) {
        /*
            r8 = this;
            java.lang.String r6 = "db event fetchEventRecordByIds: "
            boolean r0 = r10 instanceof com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11271
            if (r0 == 0) goto L31
            r7 = r10
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$fetchEventRecordByIds$1 r7 = (com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11271) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L31
            int r0 = r7.label
            int r0 = r0 - r1
            r7.label = r0
        L18:
            java.lang.Object r5 = r7.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r7.label
            java.lang.String r3 = "dtxStorage"
            r1 = 1
            if (r0 == 0) goto L43
            if (r0 != r1) goto L3b
            java.lang.Object r2 = r7.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r9 = r7.L$0
            java.util.List r9 = (java.util.List) r9
            goto L37
        L31:
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$fetchEventRecordByIds$1 r7 = new com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$fetchEventRecordByIds$1
            r7.<init>(r10)
            goto L18
        L37:
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Exception -> L7b
            goto L59
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L43:
            kotlin.ResultKt.throwOnFailure(r5)
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            com.dynatrace.agent.storage.db.EventDao r0 = r8.dao     // Catch: java.lang.Exception -> L79
            r7.L$0 = r9     // Catch: java.lang.Exception -> L79
            r7.L$1 = r2     // Catch: java.lang.Exception -> L79
            r7.label = r1     // Catch: java.lang.Exception -> L79
            java.lang.Object r5 = r0.fetchEventRecordByIds(r9, r7)     // Catch: java.lang.Exception -> L79
            if (r5 != r4) goto L59
            return r4
        L59:
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Exception -> L79
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L76
            r0.<init>(r6)     // Catch: java.lang.Exception -> L76
            java.lang.StringBuilder r1 = r0.append(r5)     // Catch: java.lang.Exception -> L76
            java.lang.String r0 = ", recordIds: "
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Exception -> L76
            java.lang.StringBuilder r0 = r0.append(r9)     // Catch: java.lang.Exception -> L76
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L76
            com.dynatrace.android.agent.util.Utility.devLog(r3, r0)     // Catch: java.lang.Exception -> L76
            goto L85
        L76:
            r1 = move-exception
            r2 = r5
            goto L7c
        L79:
            r1 = move-exception
            goto L7c
        L7b:
            r1 = move-exception
        L7c:
            java.lang.String r0 = "operation was not completed for DB: fetchEventRecordByIds"
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            com.dynatrace.android.agent.util.Utility.devLog(r3, r0, r1)
            r5 = r2
        L85:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.fetchEventRecordByIds(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    @Override // com.dynatrace.agent.storage.db.EventDatabaseDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getAll(kotlin.coroutines.Continuation<? super java.util.List<com.dynatrace.agent.storage.db.EventRecord>> r8) {
        /*
            r7 = this;
            java.lang.String r5 = "db event getAll: "
            boolean r0 = r8 instanceof com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11281
            if (r0 == 0) goto L2d
            r6 = r8
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$getAll$1 r6 = (com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11281) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L2d
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L18:
            java.lang.Object r0 = r6.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r6.label
            java.lang.String r4 = "dtxStorage"
            r1 = 1
            if (r2 == 0) goto L3b
            if (r2 != r1) goto L33
            java.lang.Object r3 = r6.L$0
            java.util.List r3 = (java.util.List) r3
            goto L51
        L2d:
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$getAll$1 r6 = new com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$getAll$1
            r6.<init>(r8)
            goto L18
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3b:
            kotlin.ResultKt.throwOnFailure(r0)
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            com.dynatrace.agent.storage.db.EventDao r0 = r7.dao     // Catch: java.lang.Exception -> L68
            r6.L$0 = r2     // Catch: java.lang.Exception -> L68
            r6.label = r1     // Catch: java.lang.Exception -> L68
            java.lang.Object r0 = r0.getAll(r6)     // Catch: java.lang.Exception -> L68
            if (r0 != r3) goto L4f
            return r3
        L4f:
            r3 = r2
            goto L54
        L51:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Exception -> L6b
        L54:
            r2 = r0
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L68
            r0.<init>(r5)     // Catch: java.lang.Exception -> L68
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Exception -> L68
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L68
            com.dynatrace.android.agent.util.Utility.devLog(r4, r0)     // Catch: java.lang.Exception -> L68
            goto L75
        L68:
            r1 = move-exception
            r3 = r2
            goto L6c
        L6b:
            r1 = move-exception
        L6c:
            java.lang.String r0 = "operation was not completed for DB: getAll"
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            com.dynatrace.android.agent.util.Utility.devLog(r4, r0, r1)
            r2 = r3
        L75:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.getAll(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    @Override // com.dynatrace.agent.storage.db.EventDatabaseDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object put(com.dynatrace.agent.storage.db.EventRecord r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11291
            if (r0 == 0) goto L24
            r5 = r8
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$put$1 r5 = (com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11291) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L24
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L13:
            java.lang.Object r1 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            java.lang.String r3 = "dtxStorage"
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 != r2) goto L2e
            goto L2a
        L24:
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$put$1 r5 = new com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$put$1
            r5.<init>(r8)
            goto L13
        L2a:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L56
            goto L5f
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "db event put: "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r7)
            java.lang.String r0 = r0.toString()
            com.dynatrace.android.agent.util.Utility.devLog(r3, r0)
            com.dynatrace.agent.storage.db.EventDao r0 = r6.dao     // Catch: java.lang.Exception -> L56
            r5.label = r2     // Catch: java.lang.Exception -> L56
            java.lang.Object r0 = r0.put(r7, r5)     // Catch: java.lang.Exception -> L56
            if (r0 != r4) goto L5f
            return r4
        L56:
            r1 = move-exception
            java.lang.String r0 = "operation was not completed for DB: put"
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            com.dynatrace.android.agent.util.Utility.devLog(r3, r0, r1)
        L5f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.put(com.dynatrace.agent.storage.db.EventRecord, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
