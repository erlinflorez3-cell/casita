package kotlin.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lkQdR͜`.\u0019RJ\u0011qڔB#\u0004$ Ck_(~:\u000f_Pwg5I\t\r\nƬ\fɖw̓ߝI]\u0001c\u0018\u000eBB}>QLڱA9nwN9.6:8@\u0004!\u001c0Ϻ\u001eu#Cy\u0011B:NqRX\u001dO\u0015\u001aX\u0005l\"GȮb˚MȤԢleB5)\u0002yB\\&}/ƊQ\rTZ?A\u0005h6+\u00076U\u0017+م\u0011\u0006z[m\u0003o{K\u0006\u0001-7-Ys\u001e5\u0007\u0002ZƋ1Ͷ\fƞù&d\rWf\u000b7+]biOˎ,w\t~ȡ<\t\u0016\t-θ^[\u0019Ǻ\f\u0016"}, d2 = {"@dP1", "\"", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006c%5b\r-3v%\u001bM?:]A\"$hHC\u0005i\u0002", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`\u001eQm\u0014J@\u00125Y\u0007/Di\u001f=:C7j&+\u0019wa \u0011a2$]-Q[U0e\u001cwN\u001c[[\u001eW)\u001c\tcJ28%G(\u0006;M\fD3VO|\u00131{l\f]\fP{^_>.hDh5", "Ehc5?6<Y", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006]/3_S", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`\u001eQm\u0014J@\f?W\u0004u\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b%c\u0012\u0012\u0012\u0001j=mu@@!Q\u0016F\u0007;f\u0010a", "EqXAX", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class LocksKt {
    private static final <T> T read(ReentrantReadWriteLock reentrantReadWriteLock, Function0<? extends T> action) {
        Intrinsics.checkNotNullParameter(reentrantReadWriteLock, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            return action.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            lock.unlock();
            InlineMarker.finallyEnd(1);
        }
    }

    private static final <T> T withLock(Lock lock, Function0<? extends T> action) {
        Intrinsics.checkNotNullParameter(lock, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        lock.lock();
        try {
            return action.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            lock.unlock();
            InlineMarker.finallyEnd(1);
        }
    }

    private static final <T> T write(ReentrantReadWriteLock reentrantReadWriteLock, Function0<? extends T> action) {
        Intrinsics.checkNotNullParameter(reentrantReadWriteLock, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i3 = 0; i3 < readHoldCount; i3++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return action.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            while (i2 < readHoldCount) {
                lock.lock();
                i2++;
            }
            writeLock.unlock();
            InlineMarker.finallyEnd(1);
        }
    }
}
