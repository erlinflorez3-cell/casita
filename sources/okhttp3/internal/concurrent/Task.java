package okhttp3.internal.concurrent;

import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\r+4\u0012}\u000bnjG7LeN1ZS@\u000fs{:'c$\u007fCCU \u007f(-eȞ\u0018g\u001dI\u001b S\u0013\u0014\u0016\u0011jZJe~c\u0012\u001d4Zom6ޜs=Gd=I\u00135J\"f\u00105\u0005(9`\u0010%\u000b\nŷë\u00160F\b\u0003X\u001be\u001d\u001a@\u0010\u0005DI$j\u0001f6vm$N\u007f2\u0011kZNUb݁\u0001S\u0015Ͽl)\u0013{o${OE5-%\u0002\u0004\u07baVaGšWsC\fv/wCW|o6\u0007\njƄ7̠\u0011iz̦t\u0007Wk\u001a3KQiX^\u001cx\u0012\t\u000b%>\u001a\r47\u001f͔9բj\u0014\u0016ޗ\rtYQ^\u0014~D\u0006\u000eoJж)\u001a"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I~'$To\u0017K@\u00141g\u0004u", "", "<`\\2", "", "1`]0X3:P ~", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}p\u0004q", "5dc\u0010T5<S zwe,", "u(I", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "<dgA8?>Q)\u000ezG(\u0006\u0013\u001ei\b(", "", "5dc\u001bX?M3,~xn;|q+n\n\u0017\u007fH\u0001U!Mr\u001dK\u0002", "u(9", "Adc\u001bX?M3,~xn;|q+n\n\u0017\u007fH\u0001U!Mr\u001dK\u0002", "uI\u0018#", "?tTBX", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I~'$To\u0017K@\u00141g\u0004\fGm&.#", "5dc\u001eh,NSW\t\u0001a;\f\u0014", "u(;<^/Mb$LDb5\f\t<n{/E>\u000b \u0015W|\u001b<\u007f4~Hy.=Y&.]C\u0011", "Adc\u001eh,NSW\t\u0001a;\f\u0014", "uK^8[;M^fH~g;|\u00168a\u0007qyJ\n\u0015'T|\u000eE\u0006n$U\f&#}\u0016>M\u0019~\\", "7mXAD<>c\u0019", "", "7mXAD<>c\u0019=\u0005d/\f\u0018:", "@t]\u001ca*>", "BnBAe0GU", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class Task {
    private final boolean cancelable;
    private final String name;
    private long nextExecuteNanoTime;
    private TaskQueue queue;

    public Task(String name, boolean z2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.cancelable = z2;
        this.nextExecuteNanoTime = -1L;
    }

    public /* synthetic */ Task(String str, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? true : z2);
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    public final String getName() {
        return this.name;
    }

    public final long getNextExecuteNanoTime$okhttp() {
        return this.nextExecuteNanoTime;
    }

    public final TaskQueue getQueue$okhttp() {
        return this.queue;
    }

    public final void initQueue$okhttp(TaskQueue queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        TaskQueue taskQueue = this.queue;
        if (taskQueue == queue) {
            return;
        }
        if (taskQueue != null) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.queue = queue;
    }

    public abstract long runOnce();

    public final void setNextExecuteNanoTime$okhttp(long j2) {
        this.nextExecuteNanoTime = j2;
    }

    public final void setQueue$okhttp(TaskQueue taskQueue) {
        this.queue = taskQueue;
    }

    public String toString() {
        return this.name;
    }
}
