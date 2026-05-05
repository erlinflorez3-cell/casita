package kotlinx.coroutines;

import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eRLcz\tI\u0006>\u000b6B\u0005#4\u0012\u000e\u0007njO0LeV\u008cZS@\u000fs{:&c$\u007fLCU \u007f(ޢѩN}˧\u001fPj\rS\u000f4ǝ'ilP[xٕ\u0016\u00118B}@{%}CQ`#=%\"8ĲF\u0002%\u0003 )V\u0019' QU$36?\u0001<b\r\u0014\r*\u001a\u0016D0\u0003.\\.WdT|aJ19\u0002\u0018O|2ۢ4|S\u001bvX5\u001c\u000fad3pAC%=Y\u0013\tb[\u0006\fm}\u0004ݣhҊ++W\u0005(Nf\u0012,\u0015YbC\"I̮^ԇUj\u001c)1cq`h\u0010.\n\t\u0012u<\n\u0010n'N1\u0016\u001al\fv3zwՈDg"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0013DU\u000b/\r", "", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0012D5\u000eH\u0013-", "\u001a@I&", "\u000fS>\u001a<\n", "#M3\u0016F\u0017\u001aBvaZ=", "7me<^,", "", Global.BLANK, "\"", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "@dR2\\=>`", "1n\\=_,MW#\b", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007<i'*\u0017J7t6g~ef9\u0005r\u00025|1VSR5&P|J\u001e\"i\u0012W+\u001bN7K-}H@/\u0004;M\fD>D|", "7r;.m@", "", "7r;.m@|O\"\b\u0005m(\f\r9n\u000e", "u(E", "u(I", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class CoroutineStart extends Enum<CoroutineStart> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CoroutineStart[] $VALUES;
    public static final CoroutineStart DEFAULT = new CoroutineStart("DEFAULT", 0);
    public static final CoroutineStart LAZY = new CoroutineStart("LAZY", 1);
    public static final CoroutineStart ATOMIC = new CoroutineStart("ATOMIC", 2);
    public static final CoroutineStart UNDISPATCHED = new CoroutineStart("UNDISPATCHED", 3);

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            try {
                iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoroutineStart.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ CoroutineStart[] $values() {
        return new CoroutineStart[]{DEFAULT, LAZY, ATOMIC, UNDISPATCHED};
    }

    static {
        CoroutineStart[] coroutineStartArr$values = $values();
        $VALUES = coroutineStartArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(coroutineStartArr$values);
    }

    private CoroutineStart(String str, int i2) {
        super(str, i2);
    }

    public static EnumEntries<CoroutineStart> getEntries() {
        return $ENTRIES;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    public static CoroutineStart valueOf(String str) {
        return (CoroutineStart) Enum.valueOf(CoroutineStart.class, str);
    }

    public static CoroutineStart[] values() {
        return (CoroutineStart[]) $VALUES.clone();
    }

    public final <R, T> void invoke(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r2, Continuation<? super T> continuation) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1) {
            CancellableKt.startCoroutineCancellable(function2, r2, continuation);
            return;
        }
        if (i2 == 2) {
            ContinuationKt.startCoroutine(function2, r2, continuation);
        } else if (i2 == 3) {
            UndispatchedKt.startCoroutineUndispatched(function2, r2, continuation);
        } else if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }
}
