package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadLocalKt;
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
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nj?5LeV.ZS0\u0011qە4:ӋTqq:\u0016!\u0004\"\u07beSPmg|K#\u0018Q\u0019\u001e\u0018\u000fiZM\u001cތٕ\u0016\u000f8M8JAY\b=gm;Ȃӯ$2(FB\u0018\u000f)BH>\u0004+GY\u0013*0nt\u0001ĥҫQ\u0005 \"V`.\u00036pwRFJ\u0003\\h3Q\bRJ^+o2\u0013L;J3*cǻcӿ/B?5#+$\u0015\u0015Ys?1C({[ؓ)ݳ/M\fY<`\u000e\u001dƬ/`"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E/\u0004$\u0017CntFt!<9\u000f @||8WN\u0011", "", "\nh]6g\u0005", "u(E", "@dU", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0003?a\u0006*@\\\u0019;M?:R>\u001c\u0011o7", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \u0012\u0017 VV\u0018F\u0002z", "\u001aiPCTuEO\"\u0001DM/\n\t+df2y<\bl", "\u001aiPCTuEO\"\u0001DM/\n\t+df2y<\bl", "3uT;g\u0013H]$", "5dc\u0012i,Gb\u007f\t\u0005ij\u0003\u0013>l\u00041\u000f:~!$Q\u007f\u001d@\u007f%CS{*Dm", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJv(Gx\u001d#\u0001/@/", "1ta?X5M=&g\u000be3", "1ta?X5M=&g\u000be3;\u000f9t\u0007,\u0005Sz\u0015!Ty\u001eKz.5gw\u001eAz\u0016", "@db2g\fOS\"\u000eah6\b", "", "@db2g\fOS\"\u000eah6\bG5o\u000f/\u007fI\u0014\u0011\u0015Q|\u0018L\u0006)>Y\f\u001a5w#.", "Adc\u0012i,Gb\u007f\t\u0005i", "Adc\u0012i,Gb\u007f\t\u0005ij\u0003\u0013>l\u00041\u000f:~!$Q\u007f\u001d@\u007f%CS{*Dm", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ThreadLocalEventLoop {
    public static final ThreadLocalEventLoop INSTANCE = new ThreadLocalEventLoop();
    private static final ThreadLocal<EventLoop> ref = ThreadLocalKt.commonThreadLocal(new Symbol("ThreadLocalEventLoop"));

    private ThreadLocalEventLoop() {
    }

    public final EventLoop currentOrNull$kotlinx_coroutines_core() {
        return ref.get();
    }

    public final EventLoop getEventLoop$kotlinx_coroutines_core() {
        ThreadLocal<EventLoop> threadLocal = ref;
        EventLoop eventLoop = threadLocal.get();
        if (eventLoop != null) {
            return eventLoop;
        }
        EventLoop eventLoopCreateEventLoop = EventLoopKt.createEventLoop();
        threadLocal.set(eventLoopCreateEventLoop);
        return eventLoopCreateEventLoop;
    }

    public final void resetEventLoop$kotlinx_coroutines_core() {
        ref.set(null);
    }

    public final void setEventLoop$kotlinx_coroutines_core(EventLoop eventLoop) {
        ref.set(eventLoop);
    }
}
