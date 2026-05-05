package com.dynatrace.agent.storage.preference;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import com.dynatrace.agent.storage.db.EndPointInfo;
import com.dynatrace.agent.storage.di.StorageModuleKt;
import com.dynatrace.android.agent.util.Utility;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004W\u00068\u000bDB\u0007\"2\u0013\u007f\u0007|jA0JeP.`S2\u000fq~:řqҕ\"CiTR|/Ib^qunb`\u001bE\u001f\u0006Dz\u0019-֒Yzc\u0015\u001d6\u000b{M8eok?'ұtӯ$20?B\u0019\u000f\"BH>\u007f+GY\u0016*0nv\u0001ļK̂\t\u001a \u0011\u0007,\u000f*tg|?\u000fǤ\u001cƠ3#\u0011p\u0013`5_H\u0003]\u000fVTU\u000f%btѫB˝9\u0015-مα\u000b`"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r\u001bt3\t\u001fljHjl-XU#VH<6l_p=w\u001ae\u0015$", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r\u001bt3\t\u001fljHjl-XU#VH<6l_p=i", "2`c.F;H`\u0019", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011N\nKr\u0013Dc\u000b \r", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaG\\", "\nh]6g\u0005", "uKP;W9HW\u0018\u0012D](\f\u0005=t\n5{\n~!$G9l8\u0006!#h\b-7CY\u001f", "5dc\u0012a+)]\u001d\b\nB5}\u0013", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#])6X 2VR\u001ft5(j", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "Adc\u0012a+)]\u001d\b\nB5}\u0013", "", "3mS\u001db0Gb|\b{h", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ%&Q|\n>vn4VG\u007f@l\u00018QLJO=\u001f\u001f>H?\u0011r3R\u007fpEV[6lavF\u0014 $kX4\u001c\tbQ }HA(]o0\u00077y|U\u001d\n>l:,S\u0015Gw$K", "1kT.e\u0017KS\u001a~\b^5z\t=", "\u0019dh@", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class EndPointInfoDataSourceImpl implements EndPointInfoDataSource {
    private final DataStore<Preferences> dataStore;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\r.4\u0012}\nl˒9FǏ\u0016H\\Q\u00141\u0015kڷ8&a$\u007fD\fj(\u007f:\u000f_Pwg\u001dN\t\u000eß\u0013\f\u001eю\u0003.OZ\u0007cb$@I\bECO\u007f=gd#9ӯ$8*\u0600\u0012\u0007\u0007\"8NǞz\u0004"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r\u001bt3\t\u001fljHjl-XU#VH<6l_p=w\u001ae\u0015\r\u0011\r\u0019g\u0017", "", "\nh]6g\u0005", "u(E", "\u000fO?,<\u000b", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaGEI,bL", "", "5dc\u000eC\u001787w", "u(;.a+K]\u001d}\u000e(+x\u0018+s\u000f2\t@J\"$Gp\u000eIv.3Y\fi5w#.\u0017.Hk5\u001e\"hj7\u0007qj4v;\u001d", "\u0010D0\u0010B\u00158C\u0006e", "5dc\u000f8\b\u001c=\u0002xjK\u0013", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Keys {
        public static final Keys INSTANCE = new Keys();
        private static final Preferences.Key<String> APP_ID = PreferencesKeys.stringKey("ep_app_id");
        private static final Preferences.Key<String> BEACON_URL = PreferencesKeys.stringKey("ep_beacon_url");

        private Keys() {
        }

        public final Preferences.Key<String> getAPP_ID() {
            return APP_ID;
        }

        public final Preferences.Key<String> getBEACON_URL() {
            return BEACON_URL;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$clearPreferences$2, reason: invalid class name */
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
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            mutablePreferences.remove(Keys.INSTANCE.getAPP_ID());
            mutablePreferences.remove(Keys.INSTANCE.getBEACON_URL());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDZc|\u0004W\u00068é6B\r#:ߚ\u0010\u0007\u0015ia6TgX.\u0001TX\u000f\u001c\u007fB&s$ F\u0002]"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaG\\", "3wR2c;B]\"", ""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11322 extends SuspendLambda implements Function3<FlowCollector<? super Preferences>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C11322(Continuation<? super C11322> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super Preferences> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C11322 c11322 = new C11322(continuation);
            c11322.L$0 = flowCollector;
            c11322.L$1 = th;
            return c11322.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Utility.devLog(StorageModuleKt.TAG_STORAGE, "reading data: endpoint info could not be retrieved", (Throwable) this.L$1);
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

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$4, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDZc|\u0004W\u00068é6B\r#:ߚ\u0010\u0007\u0015ia6TgX.\u0001TX\u000f\u001c\u007fB&s$ F\u0002]"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#])6X 2VR\u001ft5(j", "3wR2c;B]\"", ""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends SuspendLambda implements Function3<FlowCollector<? super EndPointInfo>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super EndPointInfo> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
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
                Utility.devLog(StorageModuleKt.TAG_STORAGE, "mapping data: endpoint info could not be retrieved", (Throwable) this.L$1);
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(new EndPointInfo("", ""), this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$setEndPointInfo$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A/&:\u0012\u0010\u0007\u0015k\u007f8"}, d2 = {"\n`]<a@F])\rS", "", ">qT3X9>\\\u0017~\t", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0016]R7h;\u001e\u007fua:\u0007p,Wt'U\""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11332 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ EndPointInfo $endPointInfo;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11332(EndPointInfo endPointInfo, Continuation<? super C11332> continuation) {
            super(2, continuation);
            this.$endPointInfo = endPointInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11332 c11332 = new C11332(this.$endPointInfo, continuation);
            c11332.L$0 = obj;
            return c11332;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((C11332) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            mutablePreferences.set(Keys.INSTANCE.getAPP_ID(), this.$endPointInfo.getApplicationId());
            mutablePreferences.set(Keys.INSTANCE.getBEACON_URL(), this.$endPointInfo.getUrl());
            return Unit.INSTANCE;
        }
    }

    public EndPointInfoDataSourceImpl(DataStore<Preferences> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    @Override // com.dynatrace.agent.storage.preference.EndPointInfoDataSource
    public Object clearPreferences(Continuation<? super Unit> continuation) {
        Utility.devLog(StorageModuleKt.TAG_STORAGE, "endpoint preferences are cleared");
        Object objEdit = PreferencesKt.edit(this.dataStore, new AnonymousClass2(null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    @Override // com.dynatrace.agent.storage.preference.EndPointInfoDataSource
    public Object getEndPointInfo(Continuation<? super EndPointInfo> continuation) {
        final Flow flowM10520catch = FlowKt.m10520catch(this.dataStore.getData(), new C11322(null));
        return FlowKt.first(FlowKt.m10520catch(new Flow<EndPointInfo>() { // from class: com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1

            /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1$2$1, reason: invalid class name */
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

                /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L5f
                        r6 = r9
                        com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1$2$1 r6 = (com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        int r0 = r6.label
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L5f
                        int r0 = r6.label
                        int r0 = r0 - r1
                        r6.label = r0
                    L13:
                        java.lang.Object r1 = r6.result
                        java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r6.label
                        r4 = 1
                        if (r0 == 0) goto L26
                        if (r0 != r4) goto L65
                        kotlin.ResultKt.throwOnFailure(r1)
                    L23:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L26:
                        kotlin.ResultKt.throwOnFailure(r1)
                        kotlinx.coroutines.flow.FlowCollector r3 = r7.$this_unsafeFlow
                        r0 = r6
                        kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                        androidx.datastore.preferences.core.Preferences r8 = (androidx.datastore.preferences.core.Preferences) r8
                        com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$Keys r0 = com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl.Keys.INSTANCE
                        androidx.datastore.preferences.core.Preferences$Key r0 = r0.getAPP_ID()
                        java.lang.Object r2 = r8.get(r0)
                        java.lang.String r2 = (java.lang.String) r2
                        java.lang.String r1 = ""
                        if (r2 != 0) goto L41
                        r2 = r1
                    L41:
                        com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$Keys r0 = com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl.Keys.INSTANCE
                        androidx.datastore.preferences.core.Preferences$Key r0 = r0.getBEACON_URL()
                        java.lang.Object r0 = r8.get(r0)
                        java.lang.String r0 = (java.lang.String) r0
                        if (r0 != 0) goto L5d
                    L4f:
                        com.dynatrace.agent.storage.db.EndPointInfo r0 = new com.dynatrace.agent.storage.db.EndPointInfo
                        r0.<init>(r2, r1)
                        r6.label = r4
                        java.lang.Object r0 = r3.emit(r0, r6)
                        if (r0 != r5) goto L23
                        return r5
                    L5d:
                        r1 = r0
                        goto L4f
                    L5f:
                        com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1$2$1 r6 = new com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1$2$1
                        r6.<init>(r9)
                        goto L13
                    L65:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super EndPointInfo> flowCollector, Continuation continuation2) {
                Object objCollect = flowM10520catch.collect(new AnonymousClass2(flowCollector), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new AnonymousClass4(null)), continuation);
    }

    @Override // com.dynatrace.agent.storage.preference.EndPointInfoDataSource
    public Object setEndPointInfo(EndPointInfo endPointInfo, Continuation<? super Unit> continuation) {
        Utility.devLog(StorageModuleKt.TAG_STORAGE, "endpoint info is updated: " + endPointInfo);
        Object objEdit = PreferencesKt.edit(this.dataStore, new C11332(endPointInfo, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }
}
