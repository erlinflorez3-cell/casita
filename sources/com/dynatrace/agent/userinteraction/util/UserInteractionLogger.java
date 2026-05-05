package com.dynatrace.agent.userinteraction.util;

import com.dynatrace.agent.userinteraction.model.TouchAction;
import com.dynatrace.agent.userinteraction.model.TouchEvent;
import com.dynatrace.agent.userinteraction.model.TouchUserInteraction;
import com.dynatrace.agent.userinteraction.model.UiElement;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lkA0ZeP.XS2\u000fy\b<$q$yّA٥0ԂR\t}M(lĔN\\\u0011C\u001d\u0007^\fx.aU'`B\u0013@F\b?aR6މ˃dt<\u000bhE0?\u0012\u0005/\u001dZL\u001e~\u0013Cy\u0015XؓϮt:X\u0017\u0016\u000f(\u001d\u001e>N\rF\\\u0016W|H5gH:;\u0003\u0018Nv'\u000e=CMϞJb"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_>\\GB5$,\u0015uEB\u0016c9Jt6KVW\u0013fTt=!g", "", "\nh]6g\u0005", "u(E", ":nV!b<<Vx\u0010zg;", "", "Bnd0[\fOS\"\u000e", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<ft,W\u0006|", ":nV!b<<Vx\u0010zg;;\u00079my'\u0010I|&$Cm\u000e6r'5b\r\u001aDm\u001d.IQ;", ":nV!b<<V\t\rzk\u0010\u0006\u0018/r{&\u000bD\u000b ", "Bnd0[\u001cLS&b\u0004m,\n\u0005-t\u00042\u0005", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<vq,[Z0VL[(ZavG\u001dg", ":nV!b<<V\t\rzk\u0010\u0006\u0018/r{&\u000bD\u000b UEy\u00166u9>U\r-3k\u0016(IE;tC\u0018\"hh9\u0003q,", "Bn;<Z\u001aM`\u001d\b|", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\u000e\u0019Hh9\u000fc5]L", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class UserInteractionLogger {
    private final String toLogString(TouchUserInteraction touchUserInteraction) {
        String logString;
        String logString2;
        StringBuilder sb = new StringBuilder("Ancestor view ");
        UiElement ancestor = touchUserInteraction.getAncestor();
        String str = "NULL";
        if (ancestor == null || (logString = toLogString(ancestor)) == null) {
            logString = "NULL";
        }
        StringBuilder sbAppend = sb.append(logString).append("\n\tElement view ");
        UiElement element = touchUserInteraction.getElement();
        if (element != null && (logString2 = toLogString(element)) != null) {
            str = logString2;
        }
        return sbAppend.append(str).toString();
    }

    private final String toLogString(UiElement uiElement) {
        return "class: " + uiElement.getComponent() + " name: " + uiElement.getName() + " id: " + uiElement.getId();
    }

    public final void logTouchEvent$com_dynatrace_agent_release(TouchEvent touchEvent) {
        Intrinsics.checkNotNullParameter(touchEvent, "touchEvent");
        if (touchEvent.getAction() != TouchAction.MOVE) {
            Utility.devLog(OneAgentLoggingKt.TAG_USER_INTERACTION, "Received Touch event " + touchEvent.getAction().name() + " with coordinates [" + ((int) touchEvent.getX()) + AbstractJsonLexerKt.COLON + ((int) touchEvent.getY()) + AbstractJsonLexerKt.END_LIST);
        }
    }

    public final void logTouchUserInteraction$com_dynatrace_agent_release(TouchUserInteraction touchUserInteraction) {
        Intrinsics.checkNotNullParameter(touchUserInteraction, "touchUserInteraction");
        Utility.devLog(OneAgentLoggingKt.TAG_USER_INTERACTION, toLogString(touchUserInteraction));
    }
}
