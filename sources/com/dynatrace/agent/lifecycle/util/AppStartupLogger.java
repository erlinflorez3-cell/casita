package com.dynatrace.agent.lifecycle.util;

import com.dynatrace.agent.lifecycle.model.AppStartupPhase;
import com.dynatrace.agent.lifecycle.model.AppStartupType;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjG7LeN1ZS@\u000fs{:$c$\u007fOC٥ Ԃ8ޛ\u007fN\u0016f/OҼ\u000fE\u0015\u0006$y3@WW\u0011]@\u0012bF}CKM\u001eBid\u0003<\u001d `)\u0001\u0016\u0013\t2*v\u0013'~QO$\u0012^E!>`\u0013e\u0005H\u00196B.\n6\\\u0016U~TzgR/Q\u0006\u001aF\\+w0+RUjb2%v\u0010![DE9-%\u0002\b7ViK\u001b? J5l55CI\"^f\\\u000e\u001d-+}\u0014&|4k\u001dQ\u000f\u001cO+}j\u0012P˔,\t"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~i\r$>7q9X1JgA-%sHC\te,[L", "", "\nh]6g\u0005", "u(E", ":nV\u000ec7EW\u0017z\nb6\u0006v>a\r7\fK]\u0017\u0019Kx", "", "AsP?g<IB-\nz", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~a\b\u001f7t_\nXN)z0+$xl(\u001bn,$", "0dV6a\u001bB[\u0019", "", ":nV\u000ec7EW\u0017z\nb6\u0006v>a\r7\fK", "3mS!\\4>", ":nV\u000ec7EW\u0017z\nb6\u0006v>a\r7\fK^\u0013 Eo\u0015", ":nV\u001d[(LS", "AsP?g<I>\u001cz\t^", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~a\b\u001f7t_\nXN)z0+$xl$\n_:NL", "AsP?g\u001bB[\u0019", "Bn3.g,\u001f]&\u0007vm", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class AppStartupLogger {
    private final String toDateFormat(long j2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault());
        Date date = new Date();
        date.setTime(j2);
        String str = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final void logApplicationStartup(AppStartupType startupType, long j2, long j3) {
        Intrinsics.checkNotNullParameter(startupType, "startupType");
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "App startup type " + startupType.name() + " duration: " + (j3 - j2) + " ms");
    }

    public final void logApplicationStartupBegin(AppStartupType startupType, long j2) {
        Intrinsics.checkNotNullParameter(startupType, "startupType");
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "App startup type " + startupType.name() + " begin at " + toDateFormat(j2));
    }

    public final void logApplicationStartupCancel(AppStartupType startupType) {
        Intrinsics.checkNotNullParameter(startupType, "startupType");
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "App startup type " + startupType.name() + " was not finished");
    }

    public final void logPhase(AppStartupType startupType, AppStartupPhase startupPhase, long j2, long j3) {
        Intrinsics.checkNotNullParameter(startupType, "startupType");
        Intrinsics.checkNotNullParameter(startupPhase, "startupPhase");
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "App startup type " + startupType.name() + " phase " + startupPhase.name() + " [" + toDateFormat(j2) + "] -> [" + toDateFormat(j3) + AbstractJsonLexerKt.END_LIST);
    }
}
