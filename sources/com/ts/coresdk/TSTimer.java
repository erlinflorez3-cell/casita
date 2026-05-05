package com.ts.coresdk;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLcz\u0005I\u0006>\u000b6B\u0005\"4\u0012\u0006\u0010nj?0LeV5Zݷ2\u000f\u0002{<$a'yCI٥ \u00038ޛ\u007fN\u0016x'IiKHǇ\n\u0018~z:N\u001e\u0004k\u0016'2prУ7OuAGe=A\u0013'J\"f\u007fڱ\u0005\u001c0O\u001e~C^Y\u0019*0nsjV\u001bW\u001d\u001a@\u000fn$\u000f*tg|AՂp_@<1\u0011:X\\)w2\u0013L;E\u000b'Kv8Ӡ7Ë;9\u001d'Y\u0003\u0015S"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0017\u007fH\u0001$l", "\u001aiPCTuNb\u001d\u0006DM0\u0005\t<;", "5", "\u001aiPCTuNb\u001d\u0006DM0\u0005\t<;", RemoteSettings.FORWARD_SLASH_STRING, "", "1`]0X3", "u(E", "", "7r8;\\;BO \u0003\u0010^+", "u(I", "", ">/", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0017\u007fH\u0001$U+^{+z-5fl\u001cEsk", ">0", "AbW2W<ES\bz\td", "uI;0b4\bb'Hxh9|\u0017.kI\u0017i/\u0005\u001f\u0017T.q+d\u00149a}-&i$4#\u0007,", "\u0017SB!\\4>`\bz\td", "\nh]6g\u0005", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TSTimer {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Timer f18242g;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u000eDLcz\u0004I\u0006>é4'\u0015Ӭ\\\u0012&\t/wG0\\ev-\u0019w֖\u0013m\u000242\\"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0017\u007fH\u0001$U+^{+z-5fl\u001cEsk", "", "2nC.f2", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public interface ITSTimerTask {
        void doTask();
    }

    public static final class a extends TimerTask {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ITSTimerTask f18243h;

        public a(ITSTimerTask iTSTimerTask) {
            this.f18243h = iTSTimerTask;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f18243h.doTask();
        }
    }

    public final void cancel() {
        try {
            Timer timer = this.f18242g;
            if (timer != null) {
                Intrinsics.checkNotNull(timer);
                timer.cancel();
                this.f18242g = null;
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean isInitialized() {
        return this.f18242g != null;
    }

    public final void scheduleTask(long j2, ITSTimerTask iTSTimerTask) {
        Intrinsics.checkNotNullParameter(iTSTimerTask, "");
        Timer timer = this.f18242g;
        if (timer != null) {
            Intrinsics.checkNotNull(timer);
            timer.cancel();
            this.f18242g = null;
        }
        Timer timer2 = new Timer();
        if (j2 > 0) {
            timer2.schedule(new a(iTSTimerTask), j2, j2);
        }
        this.f18242g = timer2;
    }
}
