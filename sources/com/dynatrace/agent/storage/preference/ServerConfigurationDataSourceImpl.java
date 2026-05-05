package com.dynatrace.agent.storage.preference;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import com.dynatrace.agent.storage.di.StorageModuleKt;
import com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl;
import com.dynatrace.android.agent.util.Utility;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004W\u00068\u000bDB\u0007\"2\u0013\u007f\u0007|jA0JgP.`S2\u000fq\u0001:řqҕ\"CiTR|3Ib^qunb`\u001bE\u001f\u0006Dz\u0019-֒Yzc\u0015\u001d6\u000b{M=eokD'ұtӯ$20DB\u0019\u000f'BH>\u0002+GY\u001a*0nv\u0001ļK̂\t\u001a \u0015\u0007,\u000f.tg|A\u000fǤ\u001cƠ3#\u0011u\u0013`5_H\u0003]\u000fVTU\u000f%btѫB˝9\u0015-مS#`bW\u0003mwm\tv,?+wy\u0016\u0007/ó Ʀ/U\u0015ƞ\u000b(b\r_iИ+="}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6e1nL\u0010\u007fd\u001e[)\rhaL+D", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6e1nL\u0010\u007fd\u001e[)\rZ", "2`c.F;H`\u0019", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011N\nKr\u0013Dc\u000b \r", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaG\\", "\nh]6g\u0005", "uKP;W9HW\u0018\u0012D](\f\u0005=t\n5{\n~!$G9l8\u0006!#h\b-7CY\u001f", "D`[BX", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6eCA\u0013", "AdaCX9\u001c]\"\u007f~`<\n\u0005>i\n1", "5dc X9OS&\\\u0005g-\u0001\u000b?r{7\u007fJ\n", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`%Vy\u001b8x%~d\u000b 8m#.VA;5\"\u001e\"yaFdm5Oz)WYJ;`\\{.bg", ">qT9b(=A\u0019\f\f^9Z\u00138f\u0004*\fM|&\u001bQx", "", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "Adc X9OS&\\\u0005g-\u0001\u000b?r{7\u007fJ\n", "1n]3\\.N`\u0015\u000e~h5mW", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ%&Q|\n>vn@f}!7z\u00167KC\u0005Y4+&hn\u0017\u0011l-Rx7TH]0f[c\fix`\u0018]2\u0011\u000e#?.{NG.\f5I\u0010\u0005F\u000b\u0015%\u0012>zlQZ\u001aPOX\\F%yB#fuPC\u000fL'i\f],2", "@db2g\u001a>`*~\b<6\u0006\n3g\u00105wO\u0005! ", "\u0019dh@", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ServerConfigurationDataSourceImpl implements ServerConfigurationDataSource {
    private final DataStore<Preferences> dataStore;
    private volatile ServerConfigurationV4 serverConfiguration;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\r)4\u0012}\bnjG6LeN0ZS8\u0018s{:$c$\u007fOCU }(ߜOdʴ\u0018nxYKJ\u0015\u0006Ȁ|l2Icy.'\u001d4ZuO5]ok=\u000fwȥ\t&:ĲP{\u000b\u0006(0\u0019%\u0005\u0002[Q\u001c\u0014@@\u001fB\u0001\u0010̂\t \u001aßV\"\u0007'jm\u001fKVvu@?%\u0013ipVUb݁\u0001S\u0015Ͽl)\u0013\u0002o${UEA-+c\u0005\u0017R\nL1BџA\u000bpѧ?-O\u0002e<)\u0015\"$CU\u001d_\u0003&\u000b\u0015\u007fcВ+1WҪcR\u00149\u0006\u0001Ա\u0011N"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6e1nL\u0010\u007fd\u001e[)\rhaL+-*73\u0016\u0002", "", "\nh]6g\u0005", "u(E", " DE\u0016F\u0010(<", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaGEI,bL", "", "5dc\u001f8\u001d\"A|hc", "u(;.a+K]\u001d}\u000e(+x\u0018+s\u000f2\t@J\"$Gp\u000eIv.3Y\fi5w#.\u0017.Hk5\u001e\"hj7\u0007qj4v;\u001d", "\u001b@G,5\f\u001a1\u0003gtL\u0010qh)Kc\u0005", "", "5dc\u001a4\u001f80xZXH\u0015vv\u0013Z_\"a$]", "\u001b@G,8\u001d\u001e<\bxhB!\\\u0003\u0015I\\", "5dc\u001a4\u001f83\n^cM&jl$Ey\u000e_\u001d", "\u0011@?!H\u0019\u001e", "", "5dc\u00104\u0017-C\u0006^", "#R4\u001fR\u0010'BxkV<\u001b`r\u0018_]\u0004f/p\u0004v", "", "5dc\"F\f+M|gi>\u0019Xf\u001eIi\u0011u\u001e\\\u0002\u00067\\m", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Keys {
        public static final Keys INSTANCE = new Keys();
        private static final Preferences.Key<Long> REVISION = PreferencesKeys.longKey("sc_revision");
        private static final Preferences.Key<Integer> MAX_BEACON_SIZE_KIB = PreferencesKeys.intKey("sc_max_beacon_size_kib");
        private static final Preferences.Key<Integer> MAX_EVENT_SIZE_KIB = PreferencesKeys.intKey("sc_max_event_size_kib");
        private static final Preferences.Key<Boolean> CAPTURE = PreferencesKeys.booleanKey("sc_capture");
        private static final Preferences.Key<String> USER_INTERACTION_CAPTURE = PreferencesKeys.stringKey("sc_user_interaction_capture");

        private Keys() {
        }

        public final Preferences.Key<Boolean> getCAPTURE() {
            return CAPTURE;
        }

        public final Preferences.Key<Integer> getMAX_BEACON_SIZE_KIB() {
            return MAX_BEACON_SIZE_KIB;
        }

        public final Preferences.Key<Integer> getMAX_EVENT_SIZE_KIB() {
            return MAX_EVENT_SIZE_KIB;
        }

        public final Preferences.Key<Long> getREVISION() {
            return REVISION;
        }

        public final Preferences.Key<String> getUSER_INTERACTION_CAPTURE() {
            return USER_INTERACTION_CAPTURE;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return ServerConfigurationDataSourceImpl.this.preloadServerConfiguration(this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDZc|\u0004W\u00068é6B\r#:ߚ\u0010\u0007\u0015ia6TgX.\u0001TX\u000f\u001c\u007fB&s$ F\u0002]"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaG\\", "3wR2c;B]\"", ""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<? super Preferences>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super Preferences> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = flowCollector;
            anonymousClass2.L$1 = th;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Utility.devLog(StorageModuleKt.TAG_STORAGE, "reading data: Configuration could not be retrieved", (Throwable) this.L$1);
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

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$4, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDZc|\u0004W\u00068é6B\r#:ߚ\u0010\u0007\u0015ia6TgX.\u0001TX\u000f\u001c\u007fB&s$ F\u0002]"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6eCA\u0013", "3wR2c;B]\"", ""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends SuspendLambda implements Function3<FlowCollector<? super ServerConfigurationV4>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super ServerConfigurationV4> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
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
                Utility.devLog(StorageModuleKt.TAG_STORAGE, "mapping data: Configuration could not be retrieved", (Throwable) this.L$1);
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(ServerConfigurationV4.Companion.getDEFAULT_CONFIG(), this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$resetServerConfiguration$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11381 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11381(Continuation<? super C11381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return ServerConfigurationDataSourceImpl.this.resetServerConfiguration(this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$resetServerConfiguration$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A/&:\u0012\u0010\u0007\u0015k\u007f8"}, d2 = {"\n`]<a@F])\rS", "", ">qT3X9>\\\u0017~\t", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0016]R7h;\u001e\u007fua:\u0007p,Wt'U\""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11392 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C11392(Continuation<? super C11392> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11392 c11392 = new C11392(continuation);
            c11392.L$0 = obj;
            return c11392;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((C11392) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            mutablePreferences.remove(Keys.INSTANCE.getREVISION());
            mutablePreferences.remove(Keys.INSTANCE.getMAX_BEACON_SIZE_KIB());
            mutablePreferences.remove(Keys.INSTANCE.getMAX_EVENT_SIZE_KIB());
            mutablePreferences.remove(Keys.INSTANCE.getCAPTURE());
            mutablePreferences.remove(Keys.INSTANCE.getUSER_INTERACTION_CAPTURE());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$setServerConfiguration$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A/&:\u0012\u0010\u0007\u0015k\u007f8"}, d2 = {"\n`]<a@F])\rS", "", ">qT3X9>\\\u0017~\t", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0016]R7h;\u001e\u007fua:\u0007p,Wt'U\""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11402 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ ServerConfigurationV4 $configurationV4;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11402(ServerConfigurationV4 serverConfigurationV4, Continuation<? super C11402> continuation) {
            super(2, continuation);
            this.$configurationV4 = serverConfigurationV4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence invokeSuspend$lambda$0(String str) {
            return str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11402 c11402 = new C11402(this.$configurationV4, continuation);
            c11402.L$0 = obj;
            return c11402;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((C11402) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            mutablePreferences.set(Keys.INSTANCE.getREVISION(), Boxing.boxLong(this.$configurationV4.getRevision()));
            mutablePreferences.set(Keys.INSTANCE.getMAX_BEACON_SIZE_KIB(), Boxing.boxInt(this.$configurationV4.getMaxBeaconSizeKib()));
            mutablePreferences.set(Keys.INSTANCE.getMAX_EVENT_SIZE_KIB(), Boxing.boxInt(this.$configurationV4.getMaxEventSizeKib()));
            mutablePreferences.set(Keys.INSTANCE.getCAPTURE(), Boxing.boxBoolean(this.$configurationV4.getCapture()));
            mutablePreferences.set(Keys.INSTANCE.getUSER_INTERACTION_CAPTURE(), CollectionsKt.joinToString$default(this.$configurationV4.getUserInteractionsCapture(), ",", null, null, 0, null, new Function1() { // from class: com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$setServerConfiguration$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ServerConfigurationDataSourceImpl.C11402.invokeSuspend$lambda$0((String) obj2);
                }
            }, 30, null));
            return Unit.INSTANCE;
        }
    }

    public ServerConfigurationDataSourceImpl(DataStore<Preferences> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.dataStore = dataStore;
        this.serverConfiguration = ServerConfigurationV4.Companion.getDEFAULT_CONFIG();
    }

    @Override // com.dynatrace.agent.storage.preference.ServerConfigurationDataSource
    public ServerConfigurationV4 getServerConfiguration() {
        return this.serverConfiguration;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    @Override // com.dynatrace.agent.storage.preference.ServerConfigurationDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object preloadServerConfiguration(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl.AnonymousClass1
            if (r0 == 0) goto L86
            r5 = r7
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$1 r5 = (com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl.AnonymousClass1) r5
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
            java.lang.Object r1 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L4f
            if (r0 != r3) goto L8c
            java.lang.Object r0 = r5.L$1
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl r0 = (com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl) r0
            java.lang.Object r2 = r5.L$0
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl r2 = (com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl) r2
            kotlin.ResultKt.throwOnFailure(r1)
        L2e:
            com.dynatrace.agent.storage.preference.ServerConfigurationV4 r1 = (com.dynatrace.agent.storage.preference.ServerConfigurationV4) r1
            r0.serverConfiguration = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "preloading of ServerConfiguration complete: "
            r1.<init>(r0)
            com.dynatrace.agent.storage.preference.ServerConfigurationV4 r0 = r2.getServerConfiguration()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "dtxStorage"
            com.dynatrace.android.agent.util.Utility.devLog(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L4f:
            kotlin.ResultKt.throwOnFailure(r1)
            androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r0 = r6.dataStore
            kotlinx.coroutines.flow.Flow r1 = r0.getData()
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$2 r0 = new com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$2
            r2 = 0
            r0.<init>(r2)
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.m10520catch(r1, r0)
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$$inlined$map$1 r1 = new com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$$inlined$map$1
            r1.<init>()
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$4 r0 = new com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$4
            r0.<init>(r2)
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.m10520catch(r1, r0)
            r5.L$0 = r6
            r5.L$1 = r6
            r5.label = r3
            java.lang.Object r1 = kotlinx.coroutines.flow.FlowKt.first(r0, r5)
            if (r1 != r4) goto L83
            return r4
        L83:
            r2 = r6
            r0 = r2
            goto L2e
        L86:
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$1 r5 = new com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$1
            r5.<init>(r7)
            goto L16
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl.preloadServerConfiguration(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    @Override // com.dynatrace.agent.storage.preference.ServerConfigurationDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object resetServerConfiguration(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl.C11381
            if (r0 == 0) goto L57
            r5 = r7
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$resetServerConfiguration$1 r5 = (com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl.C11381) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L57
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L16:
            java.lang.Object r2 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L35
            if (r0 != r3) goto L5d
            java.lang.Object r1 = r5.L$0
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl r1 = (com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl) r1
            kotlin.ResultKt.throwOnFailure(r2)
        L2a:
            com.dynatrace.agent.storage.preference.ServerConfigurationV4$Companion r0 = com.dynatrace.agent.storage.preference.ServerConfigurationV4.Companion
            com.dynatrace.agent.storage.preference.ServerConfigurationV4 r0 = r0.getDEFAULT_CONFIG()
            r1.serverConfiguration = r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L35:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.String r1 = "dtxStorage"
            java.lang.String r0 = "configuration preferences are cleared"
            com.dynatrace.android.agent.util.Utility.devLog(r1, r0)
            androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r2 = r6.dataStore
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$resetServerConfiguration$2 r1 = new com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$resetServerConfiguration$2
            r0 = 0
            r1.<init>(r0)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r5.L$0 = r6
            r5.label = r3
            java.lang.Object r0 = androidx.datastore.preferences.core.PreferencesKt.edit(r2, r1, r5)
            if (r0 != r4) goto L55
            return r4
        L55:
            r1 = r6
            goto L2a
        L57:
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$resetServerConfiguration$1 r5 = new com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$resetServerConfiguration$1
            r5.<init>(r7)
            goto L16
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl.resetServerConfiguration(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.dynatrace.agent.storage.preference.ServerConfigurationDataSource
    public Object setServerConfiguration(ServerConfigurationV4 serverConfigurationV4, Continuation<? super Unit> continuation) {
        Utility.devLog(StorageModuleKt.TAG_STORAGE, "configuration is updated: " + serverConfigurationV4);
        this.serverConfiguration = serverConfigurationV4;
        Object objEdit = PreferencesKt.edit(this.dataStore, new C11402(serverConfigurationV4, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }
}
