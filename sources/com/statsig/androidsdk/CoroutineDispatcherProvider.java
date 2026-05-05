package com.statsig.androidsdk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4L\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:Ša:ڎs;\u0004\u0019>C\u0019UTgunbZ9D\u001f\f\u001cxx.aU'^\"\u00158B}BKM\u001e>˃dtD\th90A\u0012\u0005/\u001bpс\u0011?\u0002QU$\u0012^A7ĴSUT\u0013%*\u0006l!Gɭ]0sDT\u0005]hǂS\toB\\'w0+N=LZ'\u001bxy\u001eYAg;\u001b%a\u0006\u001fR\n@Iԑp\u0006\u0016v4?+w\u0002\b<f\u000f,\u0017AN;\\9ͽ]MXn\u001c?+}t\u0012؋\rp~\t\u000e%<2!LЀG~<(h \u000eauɤWFX\u061cvD\u0006\u007fo<g4\u000e6C9IgЂeA!\u05cbO}\u000b\u0014,)Q}/[l\u000e\u000f\u0016ôX}YĸiBCP\\\u0010\u0558A\u0002"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`%y\u001bF\u000749b}~;{!*\\A>kA\t\"rr=\u0006c9$", "", ";`X;", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00049g\t\u001cFk\u0019.Z\u0019", "2dU.h3M", "7n", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0014]\f+3|\u00141MP\u0011R:($oeB\u001a-*X\u00041W[R5\\`<\u001b\u001e\u001fd\u001e]/\u0016\u00058E2y@F\u001d\u000b,VW\"n\u000b\u001b\u001d\u0012>}:@`\u001dQ\n$yJ)v\u00107i\u0007QQTf3djc+g6I\"\u0017q&p,A", "5dc\u0011X-:c \u000e", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt!Ty\u001eKz.58\u0002.Bi%,PCHA", "5dc\u0016b", "5dc\u001aT0G", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class CoroutineDispatcherProvider {

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private final CoroutineDispatcher f64default;

    /* JADX INFO: renamed from: io, reason: collision with root package name */
    private final CoroutineDispatcher f18205io;
    private final CoroutineDispatcher main;

    public CoroutineDispatcherProvider() {
        this(null, null, null, 7, null);
    }

    public CoroutineDispatcherProvider(CoroutineDispatcher main, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher io2) {
        Intrinsics.checkNotNullParameter(main, "main");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "default");
        Intrinsics.checkNotNullParameter(io2, "io");
        this.main = main;
        this.f64default = coroutineDispatcher;
        this.f18205io = io2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CoroutineDispatcherProvider(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 + 1) - (1 | i2) != 0) {
            Dispatchers dispatchers = Dispatchers.INSTANCE;
            coroutineDispatcher = Dispatchers.getMain();
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            Dispatchers dispatchers2 = Dispatchers.INSTANCE;
            coroutineDispatcher2 = Dispatchers.getDefault();
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            Dispatchers dispatchers3 = Dispatchers.INSTANCE;
            coroutineDispatcher3 = Dispatchers.getIO();
        }
        this(coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3);
    }

    public static /* synthetic */ CoroutineDispatcherProvider copy$default(CoroutineDispatcherProvider coroutineDispatcherProvider, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            coroutineDispatcher = coroutineDispatcherProvider.main;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            coroutineDispatcher2 = coroutineDispatcherProvider.f64default;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            coroutineDispatcher3 = coroutineDispatcherProvider.f18205io;
        }
        return coroutineDispatcherProvider.copy(coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3);
    }

    public final CoroutineDispatcher component1() {
        return this.main;
    }

    public final CoroutineDispatcher component2() {
        return this.f64default;
    }

    public final CoroutineDispatcher component3() {
        return this.f18205io;
    }

    public final CoroutineDispatcherProvider copy(CoroutineDispatcher main, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher io2) {
        Intrinsics.checkNotNullParameter(main, "main");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "default");
        Intrinsics.checkNotNullParameter(io2, "io");
        return new CoroutineDispatcherProvider(main, coroutineDispatcher, io2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoroutineDispatcherProvider)) {
            return false;
        }
        CoroutineDispatcherProvider coroutineDispatcherProvider = (CoroutineDispatcherProvider) obj;
        return Intrinsics.areEqual(this.main, coroutineDispatcherProvider.main) && Intrinsics.areEqual(this.f64default, coroutineDispatcherProvider.f64default) && Intrinsics.areEqual(this.f18205io, coroutineDispatcherProvider.f18205io);
    }

    public final CoroutineDispatcher getDefault() {
        return this.f64default;
    }

    public final CoroutineDispatcher getIo() {
        return this.f18205io;
    }

    public final CoroutineDispatcher getMain() {
        return this.main;
    }

    public int hashCode() {
        return (((this.main.hashCode() * 31) + this.f64default.hashCode()) * 31) + this.f18205io.hashCode();
    }

    public String toString() {
        return "CoroutineDispatcherProvider(main=" + this.main + ", default=" + this.f64default + ", io=" + this.f18205io + ')';
    }
}
