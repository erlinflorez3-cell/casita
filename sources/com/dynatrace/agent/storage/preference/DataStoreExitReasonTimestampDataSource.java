package com.dynatrace.agent.storage.preference;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import com.dynatrace.agent.storage.di.StorageModuleKt;
import com.dynatrace.android.agent.util.Utility;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007\"2\u0013\u007f\u0007tqA0JeP.`S2\u000fq~:řqҕ\"CiTR|/Ib^qunb`\u001bE\u001f\u0006Dz\u0019-֒Yzc\u0015\u001d6\u000b{M8eok?'ҡtӯ$20?B\u0019\u000f\"BH>\u007f+GY\u0016*0nv\u0001ĬK̂\t\u001a \u0011\u0007,\u000f*tg|?\u000fǔ\u001cƠ3#\u0011p\u0013`5_H\u0003]\u000fVTU\u000f%btѫB˝9\u0015-مα\u000b`"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r\u001agC\u001a\u0003wkF\u0007C?R\u0006\u0014GH\\6eAvE\u0014 i\nV6k\u0001h=\u0012xTD\u001d\b\u0002", "", "2`c.F;H`\u0019", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011N\nKr\u0013Dc\u000b \r", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaG\\", "\nh]6g\u0005", "uKP;W9HW\u0018\u0012D](\f\u0005=t\n5{\n~!$G9l8\u0006!#h\b-7CY\u001f", "5dc\u0010e(LV\b\u0003\u0003^:\f\u00057p", "", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "A`e269:a\u001cm~f,\u000b\u0018+m\u000b", "", "Bh\\2f;:[$", "uI;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^! Vs\u0017Lr49c\u0007uzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "1kT.e\u0017KS\u001a~\b^5z\t=", "\u0019dh@", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class DataStoreExitReasonTimestampDataSource {
    private final DataStore<Preferences> dataStore;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\r)4\u0012}\tl˒9FǏ\u0016H\\Q\u00141\u0015kڷ8&a$\u007fD\fj(\u007f:\u000f_Pwg\u001dN\t\u000eß\u0013\f\u001eю\u0003.OZ\u0007cb\u001b@I\b?aQFސ\fžx6\rړݮ&@"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r\u001agC\u001a\u0003wkF\u0007C?R\u0006\u0014GH\\6eAvE\u0014 i\nV6k\u0001h=\u0012xTD\u001d\bj/\u0002OvV", "", "\nh]6g\u0005", "u(E", "\u001a@C\u0012F\u001b81\u0006ZhA&kl\u0017Em\u0017W(k\u0011|'c", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaGEI,bL", "", "5dc\u00194\u001b\u001eA\bxXK\bjk)Tc\u0010[.or~2is\u001cj", "u(;.a+K]\u001d}\u000e(+x\u0018+s\u000f2\t@J\"$Gp\u000eIv.3Y\fi5w#.\u0017.Hk5\u001e\"hj7\u0007qj4v;\u001d", "\u0012D5\u000eH\u0013-M\bbb>\u001akd\u0017P", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Keys {
        public static final long DEFAULT_TIMESTAMP = -1;
        public static final Keys INSTANCE = new Keys();
        private static final Preferences.Key<Long> LATEST_CRASH_TIMESTAMP_KEY = PreferencesKeys.longKey("reason_crash");

        private Keys() {
        }

        public final Preferences.Key<Long> getLATEST_CRASH_TIMESTAMP_KEY() {
            return LATEST_CRASH_TIMESTAMP_KEY;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$clearPreferences$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A/&:\u0012\u0010\u0007\u0015k\u007f8"}, d2 = {"\n`]<a@F])\rS", "", ">qT3X9>\\\u0017~\t", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0016]R7h;\u001e\u007fua:\u0007p,Wt'U\""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((MutablePreferences) this.L$0).remove(Keys.INSTANCE.getLATEST_CRASH_TIMESTAMP_KEY());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDZc|\u0004W\u00068é6B\r#:ߚ\u0010\u0007\u0015ia6TgX.\u0001TX\u000f\u001c\u007fB&s$ F\u0002]"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaG\\", "3wR2c;B]\"", ""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11302 extends SuspendLambda implements Function3<FlowCollector<? super Preferences>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C11302(Continuation<? super C11302> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super Preferences> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C11302 c11302 = new C11302(continuation);
            c11302.L$0 = flowCollector;
            c11302.L$1 = th;
            return c11302.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Utility.devLog(StorageModuleKt.TAG_STORAGE, "reading data: anr timestamp could not be retrieved", (Throwable) this.L$1);
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(PreferencesFactory.createEmpty(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$4, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDZc|\u0004O\r8é6B\r#:ߚ\u0010\u0007\u0015ia6TgX.\u0001TX\u000f\u001c\u007fB&s$ F\u0002]"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "", "3wR2c;B]\"", ""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends SuspendLambda implements Function3<FlowCollector<? super Long>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super Long> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
            anonymousClass4.L$0 = flowCollector;
            anonymousClass4.L$1 = th;
            return anonymousClass4.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Utility.devLog(StorageModuleKt.TAG_STORAGE, "mapping data: anr timestamp could not be retrieved", (Throwable) this.L$1);
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(Boxing.boxLong(-1L), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$saveCrashTimestamp$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A/&:\u0012\u0010\u0007\u0015k\u007f8"}, d2 = {"\n`]<a@F])\rS", "", ">qT3X9>\\\u0017~\t", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0016]R7h;\u001e\u007fua:\u0007p,Wt'U\""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11312 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $timestamp;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11312(long j2, Continuation<? super C11312> continuation) {
            super(2, continuation);
            this.$timestamp = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11312 c11312 = new C11312(this.$timestamp, continuation);
            c11312.L$0 = obj;
            return c11312;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((C11312) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((MutablePreferences) this.L$0).set(Keys.INSTANCE.getLATEST_CRASH_TIMESTAMP_KEY(), Boxing.boxLong(this.$timestamp));
            return Unit.INSTANCE;
        }
    }

    public DataStoreExitReasonTimestampDataSource(DataStore<Preferences> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    public final Object clearPreferences(Continuation<? super Unit> continuation) {
        Utility.devLog(StorageModuleKt.TAG_STORAGE, "exit reason preferences are cleared");
        Object objEdit = PreferencesKt.edit(this.dataStore, new AnonymousClass2(null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    public final Object getCrashTimestamp(Continuation<? super Long> continuation) {
        final Flow flowM10520catch = FlowKt.m10520catch(this.dataStore.getData(), new C11302(null));
        return FlowKt.first(FlowKt.m10520catch(new Flow<Long>() { // from class: com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1

            /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L55
                        r5 = r8
                        com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1$2$1 r5 = (com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1.AnonymousClass2.AnonymousClass1) r5
                        int r2 = r5.label
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r0 = r2 + r1
                        r2 = r2 | r1
                        int r0 = r0 - r2
                        if (r0 == 0) goto L55
                        int r0 = r5.label
                        int r0 = r0 - r1
                        r5.label = r0
                    L16:
                        java.lang.Object r1 = r5.result
                        java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r5.label
                        r3 = 1
                        if (r0 == 0) goto L29
                        if (r0 != r3) goto L5b
                        kotlin.ResultKt.throwOnFailure(r1)
                    L26:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L29:
                        kotlin.ResultKt.throwOnFailure(r1)
                        kotlinx.coroutines.flow.FlowCollector r2 = r6.$this_unsafeFlow
                        r0 = r5
                        kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                        androidx.datastore.preferences.core.Preferences r7 = (androidx.datastore.preferences.core.Preferences) r7
                        com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$Keys r0 = com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource.Keys.INSTANCE
                        androidx.datastore.preferences.core.Preferences$Key r0 = r0.getLATEST_CRASH_TIMESTAMP_KEY()
                        java.lang.Object r0 = r7.get(r0)
                        java.lang.Long r0 = (java.lang.Long) r0
                        if (r0 == 0) goto L52
                        long r0 = r0.longValue()
                    L45:
                        java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
                        r5.label = r3
                        java.lang.Object r0 = r2.emit(r0, r5)
                        if (r0 != r4) goto L26
                        return r4
                    L52:
                        r0 = -1
                        goto L45
                    L55:
                        com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1$2$1 r5 = new com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1$2$1
                        r5.<init>(r8)
                        goto L16
                    L5b:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Long> flowCollector, Continuation continuation2) {
                Object objCollect = flowM10520catch.collect(new AnonymousClass2(flowCollector), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new AnonymousClass4(null)), continuation);
    }

    public final Object saveCrashTimestamp(long j2, Continuation<? super Unit> continuation) {
        Utility.devLog(StorageModuleKt.TAG_STORAGE, "anr timestamp is updated: " + j2);
        Object objEdit = PreferencesKt.edit(this.dataStore, new C11312(j2, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }
}
