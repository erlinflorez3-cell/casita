package androidx.work.impl.model;

import android.net.Uri;
import android.os.Build;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: compiled from: WorkTypeConverters.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007fјnjGPLe^.Zݷ2\u000fy\f<$a%yCQU\"Ԃ*\teNo˧vJp\u000bK\u000f\f!~͚,_ǁ)]@\u000ejD\nZOj0B?`ҽ:\u0005.2jF\b\u0006\u0019\u001aXJ@z\tFc\f@4\u0007u\u0003f\u001bR\u001d \"\bN /%\u000bm~:Vtu:],In\u000b\\5iH|{\u0011vX5\u0018\u000faL-\u0007<}#3_\u001b\u0007\u0001ho\u0007M|U\u0005\u0017)m0\u0012\u0002eDp\u007fB$[S\u001bh\u000b&\u000b\u0007\u0018eT59_{K~\u001fX{\t\u0007%<2\u0010L,\u0011<;,~\b<5%vaSh\u0002\rOF\u007f*D%9\u00183Y;Kj_vS\u0019|FB\nU21\u0017\u0007!\n]>j#2l}a3a@kO|\u0010 B6\u0012~z\u001a*22w\u0004=\u0015).E6}`ަ'?"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+$m\t \u0015w\u001f?MPJkA,j", "", "u(E", "0`R8b-?>#\u0006~\\@k\u0013\u0013n\u000f", "", "0`R8b-?>#\u0006~\\@", "\u001a`]1e6BR,H\rh9\u0003R\fa}.\u0006A\u0002\u0002!Ns\fPL", "0xc249KO-m\u0005L,\fr0T\r,}B\u0001$%", "", "\u001a`]1e6BR,H\rh9\u0003R\ro\t6\u000bM|\u001b V}L\u001a\u0001.DY\u0007/'z\u001a\u001dZG=m4+j", "0xc2f", "", "7mc!b\t:Q\u001f\t{_\u0017\u0007\u00103c\u0014", "D`[BX", "7mc!b\u0015>b+\t\bd\u001b\u0011\u0014/", "\u001a`]1e6BR,H\rh9\u0003R\u0018e\u000f:\u0006M\u0007\u0006+Roc", "7mc!b\u0016Nb\u0003\u007ffn6\f\u0005\u001ao\u0007,yT", "\u001a`]1e6BR,H\rh9\u0003R\u0019u\u000f\u0012|,\u0011!&CZ\u0018Cz#I/", "7mc!b\u001aMO(~", "\u001a`]1e6BR,H\rh9\u0003R!o\r._I\u0002!U5~\nKvz", "<dcDb9DB-\nzM6`\u0012>", "<dcDb9DB-\nz", "=tc\u001cY\u0018N](zeh3\u0001\u0007CT\n\f\u0005O", ">n[6V@", "Adc\u001cY\u001bKW\u001b\u0001zk:k\u0013\fy\u000f(WM\u000e\u0013+", "BqX4Z,Ka", "AsPAX\u001bH7\"\u000e", "AsPAX", "\u0010`R8b-?>#\u0006~\\@`\b=", "\u001cdcDb9DB-\nzB+\u000b", "\u001dtc\u001cY\u0017HZ\u001d|\u000fB+\u000b", "!sPAX\u0010=a", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class WorkTypeConverters {
    public static final WorkTypeConverters INSTANCE = new WorkTypeConverters();

    /* JADX INFO: compiled from: WorkTypeConverters.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[WorkInfo.State.values().length];
            try {
                iArr[WorkInfo.State.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkInfo.State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkInfo.State.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkInfo.State.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkInfo.State.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WorkInfo.State.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BackoffPolicy.values().length];
            try {
                iArr2[BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BackoffPolicy.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[NetworkType.values().length];
            try {
                iArr3[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OutOfQuotaPolicy.values().length];
            try {
                iArr4[OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[OutOfQuotaPolicy.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    private WorkTypeConverters() {
    }

    /* JADX INFO: compiled from: WorkTypeConverters.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"4\u0012\u0006\u0013nj?3JΣHDɟ\u0004*=j<9*[ҸuCIUj\n0\ngN\u0016iEЁ-ŲG\u000f\u000eǝIv:Lmx\f\u0014e˷\u0015ņC3Uڎ\u000eEnxN\u0005N7x؇Lڱ\u0005\u001a2Ϻ`\u0003\tIc\f@2\u0017\u0088\rň\u0011M\r܅b\u0012L'\u0019\u001e\u000bi%ȫ\u001bǰa:7݊SuPV?_^~$μ\u0019ù+\r~ѭn7N@M\u0015SUYޞ%ÜC\u0003Gмݞ\tr"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+$m\t \u0015w\u001f?MPJkA,SVp5\u0016c\u0010M\u0005|", "", "u(E", "\u0010K>\u0010>\f\u001d", "", "\u0011@=\u00108\u0013%3w", "\u0011N<\u001d?\f-3wxhM\bkh\u001d", "", "\u0013M@\"8\u001c\u001e2", "\u0014@8\u00198\u000b", " T=\u001b<\u0015 ", "!T2\u00108\f\u001d3w", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class StateIds {
        public static final int BLOCKED = 4;
        public static final int CANCELLED = 5;
        public static final String COMPLETED_STATES = "(2, 3, 5)";
        public static final int ENQUEUED = 0;
        public static final int FAILED = 3;
        public static final StateIds INSTANCE = new StateIds();
        public static final int RUNNING = 1;
        public static final int SUCCEEDED = 2;

        private StateIds() {
        }
    }

    /* JADX INFO: compiled from: WorkTypeConverters.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"2\u009cw\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈ƪ6F"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+$m\t \u0015w\u001f?MPJkA,SE]7\rm-Oa1NPL@@Q\u0001\u0013", "", "u(E", "\u0013W?\u001cA\f'B|Za", "", "\u001aH=\u00124\u0019", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    private static final class BackoffPolicyIds {
        public static final int EXPONENTIAL = 0;
        public static final BackoffPolicyIds INSTANCE = new BackoffPolicyIds();
        public static final int LINEAR = 1;

        private BackoffPolicyIds() {
        }
    }

    /* JADX INFO: compiled from: WorkTypeConverters.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005&2\u009cw\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͓MŲO\f\u001aؓ\u0011|HX%M3\u001chæ\u0011ŋ\u0005\u001edɡ\u001fBVsu:]%Y݊\u0015Ě+_8ŧ֚\u0011N"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+$m\t \u0015w\u001f?MPJkA,SQaH\u0019m9Te;RL2+j(", "", "u(E", "\u0011N=\u001b8\n-3w", "", "\u001bDC\u0012E\f\u001d", "\u001cNC,E\f*C|kZ=", "\u001cNC,E\u0016\u001a;|g\\", "\"D<\u001dB\u0019\u001a@|enX\u001cep\u000fT_\u0015[\u001f", "#M<\u0012G\f+3w", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    private static final class NetworkTypeIds {
        public static final int CONNECTED = 1;
        public static final NetworkTypeIds INSTANCE = new NetworkTypeIds();
        public static final int METERED = 4;
        public static final int NOT_REQUIRED = 0;
        public static final int NOT_ROAMING = 3;
        public static final int TEMPORARILY_UNMETERED = 5;
        public static final int UNMETERED = 2;

        private NetworkTypeIds() {
        }
    }

    /* JADX INFO: compiled from: WorkTypeConverters.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"2\u009cw\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈ƪ6F"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+$m\t \u0015w\u001f?MPJkA,SRqHpd\u0017X}+E`2+j(", "", "u(E", "\u0012Q>\u001dR\u001e(@~xg>\u0018lh\u001dT", "", " T=,4\u001a8<\u0003gt>\u001fgh\u000eIn\bZ:r\u0001\u0004-iz\u001cb\u0015\u0015Gl", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    private static final class OutOfPolicyIds {
        public static final int DROP_WORK_REQUEST = 1;
        public static final OutOfPolicyIds INSTANCE = new OutOfPolicyIds();
        public static final int RUN_AS_NON_EXPEDITED_WORK_REQUEST = 0;

        private OutOfPolicyIds() {
        }
    }

    @JvmStatic
    public static final int stateToInt(WorkInfo.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @JvmStatic
    public static final WorkInfo.State intToState(int i2) {
        if (i2 == 0) {
            return WorkInfo.State.ENQUEUED;
        }
        if (i2 == 1) {
            return WorkInfo.State.RUNNING;
        }
        if (i2 == 2) {
            return WorkInfo.State.SUCCEEDED;
        }
        if (i2 == 3) {
            return WorkInfo.State.FAILED;
        }
        if (i2 == 4) {
            return WorkInfo.State.BLOCKED;
        }
        if (i2 == 5) {
            return WorkInfo.State.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to State");
    }

    @JvmStatic
    public static final int backoffPolicyToInt(BackoffPolicy backoffPolicy) {
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        int i2 = WhenMappings.$EnumSwitchMapping$1[backoffPolicy.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmStatic
    public static final BackoffPolicy intToBackoffPolicy(int i2) {
        if (i2 == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (i2 == 1) {
            return BackoffPolicy.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to BackoffPolicy");
    }

    @JvmStatic
    public static final int networkTypeToInt(NetworkType networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        int i2 = WhenMappings.$EnumSwitchMapping$2[networkType.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        int i3 = 2;
        if (i2 == 2) {
            return 1;
        }
        if (i2 != 3) {
            i3 = 4;
            if (i2 == 4) {
                return 3;
            }
            if (i2 != 5) {
                if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
                    throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                }
                return 5;
            }
        }
        return i3;
    }

    @JvmStatic
    public static final NetworkType intToNetworkType(int i2) {
        if (i2 == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (i2 == 1) {
            return NetworkType.CONNECTED;
        }
        if (i2 == 2) {
            return NetworkType.UNMETERED;
        }
        if (i2 == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (i2 == 4) {
            return NetworkType.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i2 == 5) {
            return NetworkType.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to NetworkType");
    }

    @JvmStatic
    public static final int outOfQuotaPolicyToInt(OutOfQuotaPolicy policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        int i2 = WhenMappings.$EnumSwitchMapping$3[policy.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmStatic
    public static final OutOfQuotaPolicy intToOutOfQuotaPolicy(int i2) {
        if (i2 == 0) {
            return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i2 == 1) {
            return OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to OutOfQuotaPolicy");
    }

    @JvmStatic
    public static final byte[] setOfTriggersToByteArray(Set<Constraints.ContentUriTrigger> triggers) throws IOException {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = byteArrayOutputStream;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = objectOutputStream;
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                ObjectOutputStream objectOutputStream2 = objectOutputStream;
                objectOutputStream2.writeInt(triggers.size());
                for (Constraints.ContentUriTrigger contentUriTrigger : triggers) {
                    objectOutputStream2.writeUTF(contentUriTrigger.getUri().toString());
                    objectOutputStream2.writeBoolean(contentUriTrigger.isTriggeredForDescendants());
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(objectOutputStream, null);
                Unit unit2 = Unit.INSTANCE;
                CloseableKt.closeFinally(objectOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    @JvmStatic
    public static final Set<Constraints.ContentUriTrigger> byteArrayToSetOfTriggers(byte[] bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = byteArrayInputStream;
        try {
            ByteArrayInputStream byteArrayInputStream2 = objectInputStream;
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    ObjectInputStream objectInputStream2 = objectInputStream;
                    int i2 = objectInputStream2.readInt();
                    for (int i3 = 0; i3 < i2; i3++) {
                        Uri uri = Uri.parse(objectInputStream2.readUTF());
                        boolean z2 = objectInputStream2.readBoolean();
                        Intrinsics.checkNotNullExpressionValue(uri, "uri");
                        linkedHashSet.add(new Constraints.ContentUriTrigger(uri, z2));
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(objectInputStream, null);
                } finally {
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            Unit unit2 = Unit.INSTANCE;
            CloseableKt.closeFinally(objectInputStream, null);
            return linkedHashSet;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
