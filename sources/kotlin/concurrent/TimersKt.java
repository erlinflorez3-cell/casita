package kotlin.concurrent;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d̉=!4i\bӵLc\u0003\u0010Iي8\u000b<K\u0007Ӭ4\u0012\u000e\u0007nʑA0RlP\u008cZS@\u000fs{J$c$\u007fCCU0}*\tUT\u007f3|Ϻr\u000bq\u000e6\u001e~j:Imzs\u0011=3ruE3[qU9\u000fwf\t.6:8(\n1\u001e8N(v)J{#\u00182NxRc\u001dO\u0015\u001a@\u0010N\"\u0011\u001e\u000br|?Ղp]@;iɍoƢMϋw}\u000bձ%F\u0003&=~g\u001e9@O7+$\u0002\u00047Xa?\u0011A\n=3kW-1I\u0002dNX.\u001bE/]\u0013urTc5hf\u000e53gt[R\u001e(&\u0005\f\u000fL\u0004<\u0011UQͶ1\u001al\u0014TޟzʺRóh\u001alP\u0018z\u00105G+\u000e3C;1e\u007fbk\u001d\\9\u0014\u0005;!i\u007f\u0007lib&`C\u001a\u0005\u007fW1_@UJd\t\b>\u001e\nvb\u0010,\u001c0u\u0003_\u007f\u001f2/%e`i'/q\u001aHrn'\u001cfjaqjYP$~\u0016e4\u0019\u000ejD\u0013\u0010\u001aYԜ\\,\u0017YbΉ\rś\u0007ʶ8*\u0006J9%>M\u007fpoj[]\"'EeeZ\u001fq\u0014WG`K5\u007ff@gXv\"LTb3_\u0017Fa\u0012r\\V)b_p\u0012\u0006\u0004\\_\u001c\u0015B? &D.A\u0019\u000b v\fٿFA\u0003\u0015&ʻn˦}ԞKI\u0011x<t7\u000b\u0001svqu\u0001a=\rb2-o[E\u001b6UPsb\u0006ɠ\u000b~y\f\u000eэRݺK˾.'c\f8\u0016HCy/k\u0012?\u00037C\u001a-sQ#|WO /\u0013\u000e\n\u0011Kh\\q\u0018l\u0001,\u000fuxXݚ\u001b\"|j9ׄ\u000eݦ~טy\u007f\tW{T9efI!\u0002\n@\\I\u0015\u0005M#U\u0005}(\u00155[JW4\u001cy\"7-rmk\u007f.(l\u001f(\u0005e27\u0012\u001f̔fQc>\u0002ͷO̫}Ж:Uz\u0013ZH\u0019\u00020B73=7VS|p\u0005?}\"5\u007ft\u000fD\u001e\u0001Xk:Ay\u000e6>_X~q\u0007љbC+\u001d\u0014ϑmȓlжtDX\u001f\"\u000b*;\u0017\u0012J<PZet!04zH:OAz\u0005j\u0010TK2>\u0016\u0013[ey\b z.Po\u0011'2p~i_ոXxbb\u000fλfӝ_ԠB:\r\"K\u001e'?Y\u0005\u001cE\u00053qC\u0019SK\u000eKn]\u0005~%YK\u0005P!*f\t#VmEY\u0002d\u000eW+}k\u001e\u0017f!Ԡ!B\u001e'\u007fܹ\u0017ۜuѪvDcwfd%\u001c\u000fR|!Y\u0003\t\u000f&<8\u0016;\u001d]x\bb[S~\u000f=E(\t/U9\t\u001c|\u0012P+/\u00165[Hws͂+{]_\u0002փ\u000eį\u001fٴ\u05f7t&dZ\u0014Ѹ:\f\u001aƖ\u001a\u0006"}, d2 = {"4hg2W\u0019:b\u0019m~f,\n", "\u001aiPCTuNb\u001d\u0006DM0\u0005\t<;", "<`\\2", "", "2`T:b5", "", "AsP?g\bM", "\u001aiPCTuNb\u001d\u0006D=(\f\t\u0005", ">da6b+", "", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aiPCTuNb\u001d\u0006DM0\u0005\t<T{6\u0002\u0016", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "7mXA\\(E2\u0019\u0006vr", "Bh\\2e", "Bh\\2e\u001b:a\u001f", "AbW2W<ES", "Bh\\2", "2d[.l", "AbW2W<ESt\u000e[b?|\b\u001ca\u000f(", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class TimersKt {

    /* JADX INFO: renamed from: kotlin.concurrent.TimersKt$timerTask$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0013\u001d̉=!4i\bӵLc\u0003\u0004IيX\nǞH\u00078ܥBw5e3?>D}H\\S\u001a>ƈo}"}, d2 = {"9nc9\\5\bQ#\bxn9\n\t8tI\u0017\u007fH\u0001$%-~LKz-5fl\u001cEsTy", "\u001aiPCTuNb\u001d\u0006DM0\u0005\t<T{6\u0002\u0016", "@t]", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass1 extends TimerTask {
        final /* synthetic */ Function1<TimerTask, Unit> $action;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super TimerTask, Unit> function1) {
            this.$action = function1;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.$action.invoke(this);
        }
    }

    private static final Timer fixedRateTimer(String str, boolean z2, long j2, long j3, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z2);
        timer.scheduleAtFixedRate(new AnonymousClass1(action), j2, j3);
        return timer;
    }

    private static final Timer fixedRateTimer(String str, boolean z2, Date startAt, long j2, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z2);
        timer.scheduleAtFixedRate(new AnonymousClass1(action), startAt, j2);
        return timer;
    }

    static /* synthetic */ Timer fixedRateTimer$default(String str, boolean z2, long j2, long j3, Function1 action, int i2, Object obj) {
        long j4 = j2;
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            j4 = 0;
        }
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z2);
        timer.scheduleAtFixedRate(new AnonymousClass1(action), j4, j3);
        return timer;
    }

    static /* synthetic */ Timer fixedRateTimer$default(String str, boolean z2, Date startAt, long j2, Function1 action, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            str = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z2);
        timer.scheduleAtFixedRate(new AnonymousClass1(action), startAt, j2);
        return timer;
    }

    private static final TimerTask schedule(Timer timer, long j2, long j3, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(action);
        timer.schedule(anonymousClass1, j2, j3);
        return anonymousClass1;
    }

    private static final TimerTask schedule(Timer timer, long j2, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(action);
        timer.schedule(anonymousClass1, j2);
        return anonymousClass1;
    }

    private static final TimerTask schedule(Timer timer, Date time, long j2, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(action);
        timer.schedule(anonymousClass1, time, j2);
        return anonymousClass1;
    }

    private static final TimerTask schedule(Timer timer, Date time, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(action);
        timer.schedule(anonymousClass1, time);
        return anonymousClass1;
    }

    private static final TimerTask scheduleAtFixedRate(Timer timer, long j2, long j3, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(action);
        timer.scheduleAtFixedRate(anonymousClass1, j2, j3);
        return anonymousClass1;
    }

    private static final TimerTask scheduleAtFixedRate(Timer timer, Date time, long j2, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(action);
        timer.scheduleAtFixedRate(anonymousClass1, time, j2);
        return anonymousClass1;
    }

    public static final Timer timer(String str, boolean z2) {
        return str == null ? new Timer(z2) : new Timer(str, z2);
    }

    private static final Timer timer(String str, boolean z2, long j2, long j3, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z2);
        timer.schedule(new AnonymousClass1(action), j2, j3);
        return timer;
    }

    private static final Timer timer(String str, boolean z2, Date startAt, long j2, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z2);
        timer.schedule(new AnonymousClass1(action), startAt, j2);
        return timer;
    }

    static /* synthetic */ Timer timer$default(String str, boolean z2, long j2, long j3, Function1 action, int i2, Object obj) {
        long j4 = j2;
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = null;
        }
        if ((2 & i2) != 0) {
            z2 = false;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            j4 = 0;
        }
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z2);
        timer.schedule(new AnonymousClass1(action), j4, j3);
        return timer;
    }

    static /* synthetic */ Timer timer$default(String str, boolean z2, Date startAt, long j2, Function1 action, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = timer(str, z2);
        timer.schedule(new AnonymousClass1(action), startAt, j2);
        return timer;
    }

    private static final TimerTask timerTask(Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new AnonymousClass1(action);
    }
}
