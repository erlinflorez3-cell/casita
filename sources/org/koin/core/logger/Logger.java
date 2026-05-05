package org.koin.core.logger;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4E\u0007\":\u0012\u007fјnjG<Le^.ZS0\u0011s{B-c$wCCU0}*\tUNm\f\u0005Ϻ\u000b\u000bq\u000eF#\tp2Icxu\u0012=3Բs?AO8MGf\r63'b*F\u0002\u001d\u0005H31\u0010U\u0005\fe\u001a\u001dH@\u001fA\u0003\u0011[\u00052\u00124?P\t,d\u007fRdQU]\u00199i'2R\\3w0+T=Nb/%z\u0010'\u0014@\u0016?]5a\u0010\u001fR\nF3G\u007fE\u001dlU0\u0014IRa~d\u000e\"-+}\u001c\u000ev4l\u001dQ\u000f\roE]tcP</(~\n\u001dT\u0004<\u0007WR<52l\u0018\u0010Ct!\\nbJrP\u0011\u0013ad\u001eU\u0004A;Q\u001b\u0015R\u0012?'VO{3\u0016f3\u000f\u00029[\u0003\u0015\u0011\u001d)\\\u0010U_Z)='XZqKm\u001cp\u0011\u0003\u0001ʽ<Ͻ\u0004;\u0004߾F\u0019+:i=C#q\u0007VFЂz\u0019"}, d2 = {"\u001ana4\"2HW\"Hxh9|R6o\u0002*{MJ}!Iq\u000eIL", "", ":de2_", "\u001ana4\"2HW\"Hxh9|R6o\u0002*{MJ}\u0017Xo\u0015\u0012", "uK^?ZuD]\u001d\bD\\6\n\txl\n*}@\u000e`}G\u0001\u000eCLh&", "5dc\u0019X=>Z", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\u00072}B\u0001$`.o\u001f<}z", "Adc\u0019X=>Z", "2dQBZ", "", ";rV", "", "\u001ana4\"2HW\"Hxh9|R6o\u0002*{MJ~v5]i\u001eVz", "2hb=_(R", "3qa<e", "7mU<", "7r0A", "", ":u[", ":nV", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "E`a;", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public abstract class Logger {
    private Level level;

    public Logger() {
        this(null, 1, null);
    }

    public Logger(Level level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.level = level;
    }

    public /* synthetic */ Logger(Level level, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? Level.INFO : level);
    }

    public final void debug(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        log(Level.DEBUG, msg);
    }

    public abstract void display(Level level, String str);

    public final void error(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        log(Level.ERROR, msg);
    }

    public final Level getLevel() {
        return this.level;
    }

    public final void info(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        log(Level.INFO, msg);
    }

    public final boolean isAt(Level lvl) {
        Intrinsics.checkNotNullParameter(lvl, "lvl");
        return this.level.compareTo(lvl) <= 0;
    }

    public final void log(Level lvl, String msg) {
        Intrinsics.checkNotNullParameter(lvl, "lvl");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (isAt(lvl)) {
            display(lvl, msg);
        }
    }

    public final void log(Level lvl, Function0<String> msg) {
        Intrinsics.checkNotNullParameter(lvl, "lvl");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (isAt(lvl)) {
            display(lvl, msg.invoke());
        }
    }

    public final void setLevel(Level level) {
        Intrinsics.checkNotNullParameter(level, "<set-?>");
        this.level = level;
    }

    public final void warn(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        log(Level.WARNING, msg);
    }
}
