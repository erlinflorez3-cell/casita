package com.dynatrace.agent.api.internal;

import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4L\u0005ӬBߚ\u0016\u0013\u0017jg/|dTnyY*\u001fo\n4<[RrS?c\u001c\u0016\"7P^kuqbZ9D\u001f\n$|\u0003,wVޯa\u0014\u00157Pu\u0010B[oU9\u000fuȥ\t&:ĲP{\u000b\b(2\u0019\u001f\u0005|[K:\u0013ضDvBĥ%O\u000b# \u000e\u000f/\u000f!tg|7ՂpcBǂ;\u0005oL\\/0?\u000bQ%F\u0003(˼zg&ѨX9; 3[α\u000b_"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n|\"\u001b\u0011s\u0017Kv2>U\u0005i&z\u0012,MN7x4'$Ka5\u0006c9$", "", "Dda@\\6G", "", "BqP0X\u0010=", ">`a2a;\"R", "BqP0X\rEO\u001b\r", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<D\u0010\u001b\\W<:\u001a\tbCy25", "5dc#X9LW#\b", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!e(<S|}", "5dc\u001dT9>\\(by", "5dc!e(<Sy\u0006v`:", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class TraceparentHeader {
    private static final String SUPPORTED_TRACEPARENT_VERSION = "00";
    private final String parentId;
    private final String traceFlags;
    private final String traceId;
    private final String version;
    public static final Companion Companion = new Companion(null);
    private static final String TRACEPARENT_REGEX = "^00-([0-9a-f]{32})-([0-9a-f]{16})-(0[01])$";
    private static final Regex pattern = new Regex(TRACEPARENT_REGEX);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005\"4\u0012\u000e\u0007nʑA0ZeP.XS0Ŧl\u0012éT[Rp\u0004B[\u001aԥ&\u000bUNuh7Xh\u0012[\u0011\u001c\u0015'r\\Mc\u0002u\u0012=5\u0013{M5eok<7ҝ\tӯ$2*\u0600J\u0011\u000f\u001eBH>yQŒ\u001eë\u00160H\u0081\u000b^\u001bR\u001d\u001a@\f\u0015ī\u0003ɉ`gVȤՈpg"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n|\"\u001b\u0011s\u0017Kv2>U\u0005i&z\u0012,MN7x4'$Ka5\u0006c9\rT1OWJ5`\\{\u0013", "", "\nh]6g\u0005", "u(E", "!T?\u001dB\u0019-3wxiK\bZh\u001aAl\bd/z\bv4]q&_", "", "\"Q0\u00108\u0017\u001a@xgiX\u0019\\j\u000fX", ">`cAX9G", "\u001aj^A_0G\u001d(~\u000emui\t1e\u0013}", ">`a@X", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n|\"\u001b\u0011s\u0017Kv2>U\u0005i&z\u0012,MN7x4'$Ka5\u0006c9$", "BqP0X7:`\u0019\b\n", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TraceparentHeader parse(String traceparent) {
            Intrinsics.checkNotNullParameter(traceparent, "traceparent");
            Regex regex = TraceparentHeader.pattern;
            String lowerCase = traceparent.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            MatchResult matchResultMatchEntire = regex.matchEntire(lowerCase);
            if (matchResultMatchEntire == null) {
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "The provided traceparent header does not match the format:'00-<trace-id-32-HEXDIG>-<parent-id-16-HEXDIG>-<trace-flags-2-HEXDIG>'");
                return null;
            }
            MatchResult.Destructured destructured = matchResultMatchEntire.getDestructured();
            String str = destructured.getMatch().getGroupValues().get(1);
            String str2 = destructured.getMatch().getGroupValues().get(2);
            String str3 = destructured.getMatch().getGroupValues().get(3);
            String str4 = str;
            for (int i2 = 0; i2 < str4.length(); i2++) {
                if (str4.charAt(i2) != '0') {
                    String str5 = str2;
                    for (int i3 = 0; i3 < str5.length(); i3++) {
                        if (str5.charAt(i3) != '0') {
                            return new TraceparentHeader(TraceparentHeader.SUPPORTED_TRACEPARENT_VERSION, str, str2, str3, null);
                        }
                    }
                    Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "Parent ID in traceparent header must not be all zeros");
                    return null;
                }
            }
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "Trace ID in traceparent header must not be all zeros");
            return null;
        }
    }

    private TraceparentHeader(String str, String str2, String str3, String str4) {
        this.version = str;
        this.traceId = str2;
        this.parentId = str3;
        this.traceFlags = str4;
    }

    public /* synthetic */ TraceparentHeader(String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4);
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getTraceFlags() {
        return this.traceFlags;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public final String getVersion() {
        return this.version;
    }
}
