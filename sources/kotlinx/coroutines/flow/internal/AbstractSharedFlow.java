package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&˛\bDZc|\u0004W\u00068\u000b<Ȑ\u0007\"2\u0013\u007f\u0007tyA0JgP.`Y2\u000fq~<$q$yّCU0}*\tUUog|Jb\u000bI\u0011\u000e\u0016\u000fj4կ[\u0017s܈7<HģM2usM9fud\u0005P6P:b\u0005_\u001bjMǘz|IN\u001a\u0016xK~Pj\r\u0004Ĩ`4ĂB \u000f5%\u0003\\N`tm>?%\u0019hx÷Ue`\u0001[&^TU\u0018=\u0004ӿ/@EO]0a\u001e\u001fR\u0012ΪIAџA\u0005v>o>W\u0010o6\u0007\u001dD\u00199m%])̦#\u0007Ōd\f5J\u0018~Yp&(&\u0018,\u001dJ%&\u00127J>-PǑ\u0018\u0010Ct!pnrHގHP-o=//\u00107;;1e\bĥQ\u0018|=,\u0013\u001b#;\u000b~%kV$_KÑjv\u007f7\u0010\u0001\u0014ʵZ̆]Eu\u0004~l\u001a,\n8U\t\u007f\u0018\u001f:/%efi'/p\u001aHrr5E7ê_ׂVNH̎\u0007\u0018=7\u0017\u001a+Pr\u0014\u0004P\u0003c\u0003ҍYɟX\u0007\u0006ܱc.j\bT#;\u000f|`?Ȍvܷa\n-Ä7Lg\u0001\u0004\u0014g;n3c\\\u0012#\u0018\u0017λ\u0018CTd\u000bltWΖ\u0010}"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011s\u0017Kv2>U\u0005i\u0013j$=Z?9z\"!\u0011ua8gj6`L", "!", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011s\u0017Kv2>U\u0005i\u0013j$=Z?9z\"!\u0011ua8gj6`d.Q[$", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0013Ib{#Dw\u001f2bC:U1#\u0015fp\u000f", "", "\nh]6g\u0005", "u(E", "D`[BX", "", "Ak^Af", "5dc _6Ma", "u(J\u0019^6MZ\u001d\b\u000e(*\u0007\u00169u\u000f,\u0005@\u000f`\u0018Ny \u0006z.DY\u000b)3t_\nJQJx0\u001c$Vd5\u0014c+/}1Y:U6k(", ")KZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9\u0012E\u0006%Bby'\u0001I\u0013<\\P7iC\f\u0018dn9\u0006D3X\t\u0015NV]\u0002", "", "<B^9_,<b#\f\t", "5dc\u001b66EZ\u0019|\nh9\u000b", "u(8", "<dgA<5=S,", "-rd/f*KW$\u000e~h5Z\u0013?n\u000f", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011s\u0017Kv2>U\u0005i%}\u0013<KP?vC\"\u001fq?C\u0017l;<\u0006#VL/3fdH", "AtQ@V9B^(\u0003\u0005g\n\u0007\u00198t", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u001d8\u0006%\u0016`\b2\r", "5dc h)LQ&\u0003\u0006m0\u0007\u0012\ro\u00101\u000b", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0018\u001eQ\u0002W*\u0006!DY^'A\u007fk", "1qT.g,,Z#\u000e", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0018\u001eQ\u0002W@\u007f45f\u0007\u001c>7q+[RHg2-\u0003k]F\u0007b\rU\u000195SX;2", "1qT.g,,Z#\u000eVk9x\u001d", "Ahi2", "uH\u0018(?2Hb \u0003\u0004quz\u0013<o\u00107\u007fI\u0001%`Hv\u0018N@)>h}-@i\u001dw)@IzA\u001a\u0013wO<\u0003p,MW.Q^<3faH", "/k[<V(MS\u0007\u0006\u0005m", "4qT2F3Hb", "", "Ak^A", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9\u0012E\u0006%Bby'\u0001I\u0013<\\P7iC\f\u0018dn9\u0006D3X\t\u0015NV]\u0002 C", "4na\u0012T*AA \t\nE6z\u000f/d", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public abstract class AbstractSharedFlow<S extends AbstractSharedFlowSlot<?>> {
    private SubscriptionCountStateFlow _subscriptionCount;
    private int nCollectors;
    private int nextIndex;
    private S[] slots;

    protected final S allocateSlot() {
        S s2;
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            S[] sArr = this.slots;
            if (sArr == null) {
                sArr = (S[]) createSlotArray(2);
                this.slots = sArr;
            } else if (this.nCollectors >= sArr.length) {
                Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                this.slots = (S[]) ((AbstractSharedFlowSlot[]) objArrCopyOf);
                sArr = (S[]) ((AbstractSharedFlowSlot[]) objArrCopyOf);
            }
            int i2 = this.nextIndex;
            do {
                s2 = sArr[i2];
                if (s2 == null) {
                    s2 = (S) createSlot();
                    sArr[i2] = s2;
                }
                i2++;
                if (i2 >= sArr.length) {
                    i2 = 0;
                }
                Intrinsics.checkNotNull(s2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!s2.allocateLocked(this));
            this.nextIndex = i2;
            this.nCollectors++;
            subscriptionCountStateFlow = this._subscriptionCount;
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.increment(1);
        }
        return s2;
    }

    protected abstract S createSlot();

    protected abstract S[] createSlotArray(int i2);

    protected final void forEachSlotLocked(Function1<? super S, Unit> function1) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (this.nCollectors == 0 || (abstractSharedFlowSlotArr = this.slots) == null) {
            return;
        }
        for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
            if (abstractSharedFlowSlot != null) {
                function1.invoke(abstractSharedFlowSlot);
            }
        }
    }

    protected final void freeSlot(S s2) {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        int i2;
        Continuation<Unit>[] continuationArrFreeLocked;
        synchronized (this) {
            int i3 = this.nCollectors - 1;
            this.nCollectors = i3;
            subscriptionCountStateFlow = this._subscriptionCount;
            if (i3 == 0) {
                this.nextIndex = 0;
            }
            Intrinsics.checkNotNull(s2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            continuationArrFreeLocked = s2.freeLocked(this);
        }
        for (Continuation<Unit> continuation : continuationArrFreeLocked) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m8980constructorimpl(Unit.INSTANCE));
            }
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.increment(-1);
        }
    }

    protected final int getNCollectors() {
        return this.nCollectors;
    }

    protected final S[] getSlots() {
        return this.slots;
    }

    public final StateFlow<Integer> getSubscriptionCount() {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            subscriptionCountStateFlow = this._subscriptionCount;
            if (subscriptionCountStateFlow == null) {
                subscriptionCountStateFlow = new SubscriptionCountStateFlow(this.nCollectors);
                this._subscriptionCount = subscriptionCountStateFlow;
            }
        }
        return subscriptionCountStateFlow;
    }
}
