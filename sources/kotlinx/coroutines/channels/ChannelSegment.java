package kotlinx.coroutines.channels;

import com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.Segment;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&˛\bDZc|İI\u0006>\u00126B\u0005\"4\u0012\u000e\u0007nʑA0RkP.XW2\u000f\u0002{<$iҕyCAW\"}0\tWNmwvJh\u0014K\u000f\f\u001c\u0001j:J]ތe\u0012%2JoE4SڎSʠ\tv<ӌ.1RD\n\r\u0011 :J vAByÈ@0\u0001&JV\u001bN\u001d\u001a@\bN,\u000f!to^8Xl\u0014ŽE\"1݃RZ5cH\u0005]\u000fVT]˙\r`L0P;C\u001b=S1\u000eқ_A\tG\u007fFM\u00065:CI\"kf\\\u000e)-+}\u0014\u000ev4r\u001dQ\u0017ϯm˃յgMV%6\u0010C\u0011\u001bU\u001c\u000e<Ωx2;/~\b<:;ɁՂDR\bxP\u001bCvD3=\u007fiٿi\u001ftfy;GU}ަ˿\u0011 )\u001e|<$g\u001c~-\u001b\u0003\f\u00025_UUH|\u0011 Ɲъ\bph!r\u001c>g\u0018/*%^\u001b3Ls9Q(\u001c\bVe\u007fx\u001b_\u0017b0R\u0011U0\u0011.9@\b:ith\u0013\u0001hT\u00073W۳ɟX\u0007\u0004+[=j\u001cT!S$~Sv~\u0003M\f\u0011U5tXqp\u0002\r\u0006H%ڨ̳Uc\u0016\u0007\u001b\u001e\"eTb3\u007f\u0017Fa!r\\V)bNx8\u0010}ZM:\"bE\u007fEL.G\u0018\u000b$\u000fґٿFA\u00033(yv;\u0017VI#1xTx\u0017\u0016h\\\u001fv\u0018~WX\u0015b8,o`{ӧłY\"naEC\u0015-\f\u007fu{|KZ\u0002.u\u0004\u0003P\u001c(hi1S\u0012=/Y6\u0010^]L!\u0018\u0018aZ;\t0\u0012\u000fi|^k\u0016\u007f\t,\u000fqzSbK:v\r\u001as\u001cr\n\u0012iV|Wc\u000bެq=wwYʞ>ҡ<|\rȔn:\u000fs:\u0003E/S'Sȶ&\u0019eY˸am\b0\u007fm\u001d2Et\u00129{\u001e\u007ffa_H:fX\b\r\u0015а&=\u0015PX\u0003w6I?\tcΠJыhtn:S\u001c=\u0010֮\u000ba"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0004.OK;tCs", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00135[\u0006 @|k", "7c", "", ">qTC", "1gP;a,E", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002EZ~ Dm\u0015\fP?Dt4%j", ">nX;g,Ka", "", "\nh]6g\u0005", "uI;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0015\u001aCx\u0017<}3~7\u0001\u001c@v\u00165;C=s4'$>H?\u0011r3R\u007f:\u0011JX9fb\u0002A\u001d\u0012hWL.\t\u000ebA+|\u000e\u0014/\t-I\u000f;g^\u000f\u0012\u0017>jw\u0018:S8", "-bW.a5>Z", "5dc\u0010[(G\\\u0019\u0006", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0015\u001aCx\u0017<}3~6\u000e!8m#.L!>g='\u0015o7", "2`c.", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015#|\u001b8\u000bz", "", "<t\\/X9(T\u0007\u0006\u0005m:", "5dc\u001bh4;S&h{L3\u0007\u0018=", "u(8", "As^?X\fES!~\u0004m", "", "7mS2k", "3kT:X5M", "As^?X\fES!~\u0004mj\u0003\u0013>l\u00041\u000f:~!$Q\u007f\u001d@\u007f%CS{*Dm", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "5dc\u0012_,FS\"\u000e", "5dc\u0012_,FS\"\u000e9d6\f\u00103n\u0013\"yJ\u000e!'Vs\u0017<\u0005\u001f3c\u000b ", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "@dc?\\,OSx\u0006zf,\u0006\u0018", "@dc?\\,OSx\u0006zf,\u0006\u0018mk\n7\u0003D\n*\u0011Ey\u001bF\u000749b}.1k ;M", "1kT.a\fES!~\u0004m", "1kT.a\fES!~\u0004mj\u0003\u0013>l\u00041\u000f:~!$Q\u007f\u001d@\u007f%CS{*Dm", "Adc\u0012_,FS\"\u000eaZA\u0011", "D`[BX", "5dc g(MS", "5dc g(MSW\u0005\u0005m3\u0001\u0012B_}2\tJ\u0011&\u001bPo\u001c6t/BY", "Adc g(MS", "Adc g(MSW\u0005\u0005m3\u0001\u0012B_}2\tJ\u0011&\u001bPo\u001c6t/BY", "1`b g(MS", "", "4q^:", "Bn", "1`b g(MSW\u0005\u0005m3\u0001\u0012B_}2\tJ\u0011&\u001bPo\u001c6t/BY", "5dc\u000ea+,S(l\nZ;|", "CoS.g,", "5dc\u000ea+,S(l\nZ;|G5o\u000f/\u007fI\u0014\u0011\u0015Q|\u0018L\u0006)>Y\f\u001a5w#.", "=m2.a*>Z z\nb6\u0006", "1`d@X", "", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "=m2.a*>Z ~yK,\t\u0019/s\u000f", "@dR2\\=>`", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ChannelSegment<E> extends Segment<ChannelSegment<E>> {
    private final BufferedChannel<E> _channel;
    private final /* synthetic */ AtomicReferenceArray data;

    public ChannelSegment(long j2, ChannelSegment<E> channelSegment, BufferedChannel<E> bufferedChannel, int i2) {
        super(j2, channelSegment, i2);
        this._channel = bufferedChannel;
        this.data = new AtomicReferenceArray(BufferedChannelKt.SEGMENT_SIZE * 2);
    }

    private final /* synthetic */ AtomicReferenceArray getData() {
        return this.data;
    }

    private final void setElementLazy(int i2, Object obj) {
        getData().set(i2 * 2, obj);
    }

    public final boolean casState$kotlinx_coroutines_core(int i2, Object obj, Object obj2) {
        return Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(getData(), (i2 * 2) + 1, obj, obj2);
    }

    public final void cleanElement$kotlinx_coroutines_core(int i2) {
        setElementLazy(i2, null);
    }

    public final Object getAndSetState$kotlinx_coroutines_core(int i2, Object obj) {
        return getData().getAndSet((i2 * 2) + 1, obj);
    }

    public final BufferedChannel<E> getChannel() {
        BufferedChannel<E> bufferedChannel = this._channel;
        Intrinsics.checkNotNull(bufferedChannel);
        return bufferedChannel;
    }

    public final E getElement$kotlinx_coroutines_core(int i2) {
        return (E) getData().get(i2 * 2);
    }

    @Override // kotlinx.coroutines.internal.Segment
    public int getNumberOfSlots() {
        return BufferedChannelKt.SEGMENT_SIZE;
    }

    public final Object getState$kotlinx_coroutines_core(int i2) {
        return getData().get((i2 * 2) + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        cleanElement$kotlinx_coroutines_core(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        if (r2 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        r0 = getChannel().onUndeliveredElement;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if (r0 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r0, r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.internal.Segment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCancellation(int r5, java.lang.Throwable r6, kotlin.coroutines.CoroutineContext r7) {
        /*
            r4 = this;
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            if (r5 < r0) goto L6b
            r2 = 1
        L5:
            if (r2 == 0) goto La
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            int r5 = r5 - r0
        La:
            java.lang.Object r1 = r4.getElement$kotlinx_coroutines_core(r5)
        Le:
            java.lang.Object r3 = r4.getState$kotlinx_coroutines_core(r5)
            boolean r0 = r3 instanceof kotlinx.coroutines.Waiter
            if (r0 != 0) goto L1a
            boolean r0 = r3 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r0 == 0) goto L41
        L1a:
            if (r2 == 0) goto L3c
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
        L20:
            boolean r0 = r4.casState$kotlinx_coroutines_core(r5, r3, r0)
            if (r0 == 0) goto Le
            r4.cleanElement$kotlinx_coroutines_core(r5)
            r0 = r2 ^ 1
            r4.onCancelledRequest(r5, r0)
            if (r2 == 0) goto L3b
            kotlinx.coroutines.channels.BufferedChannel r0 = r4.getChannel()
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r0.onUndeliveredElement
            if (r0 == 0) goto L3b
            kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r0, r1, r7)
        L3b:
            return
        L3c:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            goto L20
        L41:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            if (r3 == r0) goto L4d
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            if (r3 != r0) goto L5e
        L4d:
            r4.cleanElement$kotlinx_coroutines_core(r5)
            if (r2 == 0) goto L5d
            kotlinx.coroutines.channels.BufferedChannel r0 = r4.getChannel()
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r0.onUndeliveredElement
            if (r0 == 0) goto L5d
            kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r0, r1, r7)
        L5d:
            return
        L5e:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            if (r3 == r0) goto Le
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_RCV$p()
            if (r3 != r0) goto L6d
            goto Le
        L6b:
            r2 = 0
            goto L5
        L6d:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            if (r3 == r0) goto L77
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r3 != r0) goto L78
        L77:
            return
        L78:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            if (r3 != r0) goto L7f
            return
        L7f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelSegment.onCancellation(int, java.lang.Throwable, kotlin.coroutines.CoroutineContext):void");
    }

    public final void onCancelledRequest(int i2, boolean z2) {
        if (z2) {
            getChannel().waitExpandBufferCompletion$kotlinx_coroutines_core((this.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i2));
        }
        onSlotCleaned();
    }

    public final E retrieveElement$kotlinx_coroutines_core(int i2) {
        E element$kotlinx_coroutines_core = getElement$kotlinx_coroutines_core(i2);
        cleanElement$kotlinx_coroutines_core(i2);
        return element$kotlinx_coroutines_core;
    }

    public final void setState$kotlinx_coroutines_core(int i2, Object obj) {
        getData().set((i2 * 2) + 1, obj);
    }

    public final void storeElement$kotlinx_coroutines_core(int i2, E e2) {
        setElementLazy(i2, e2);
    }
}
