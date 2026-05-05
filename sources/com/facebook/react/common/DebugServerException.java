package com.facebook.react.common;

import android.net.Uri;
import com.dynatrace.android.agent.Global;
import com.facebook.common.logging.FLog;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<N\u0007\"2\u0012\u007f\u0007tpA0JhP.`T2\u000fq\u007fJřy4\"GiT\u0003}\u0001\t\bMw(\u0014Pj\u001bG\u001d\u0007.x\u0019.YY\u0007`*\u000f`D\u007fCAQ\b=ge\u0005:\u0013&J\"f~ڱ\u0005\u001a8OP\u0004\u0001W[\u0010 1XphTҫQ\u0005(\u001aFU&\u0015.`uWNH\u001b_J51\r\u0002Dd&\u000e;ƊQ\rT`w\u001c\u0005n6+n9߱\u0019+[Έ\u001fTaM\u0011NѥA\u0016"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW\u001bv\"E[k D~\u0016;-V9k?-\u0019rj\u000f", "\u001aiPCTuEO\"\u0001DK<\u0006\u00183m\u007f\b\u000f>\u0001\"&Ky\u0017\u0012", "\u001aj^A_0G\u001d\u0006\u000f\u0004m0\u0005\t\u000fx}(\u0007O\u0005! \u001d", "2db0e0Ib\u001d\t\u0004", "", "4h[2A(FS", ":h]2A<FP\u0019\f", "", "1n[B`5", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u00121\u0007,", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "2dc.\\3&S'\rv`,", "Bga<j(;Z\u0019", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "=qX4\\5:Z\u0001~\tl(~\t", "5dc\u001ce0@W\"z\u0002F,\u000b\u0017+g\u007f", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DebugServerException extends RuntimeException {
    public static final Companion Companion = new Companion(null);
    private static final String GENERIC_ERROR_MESSAGE = "\n\nTry the following to fix the issue:\n\\u2022 Ensure that Metro is running\n\\u2022 Ensure that your device/emulator is connected to your machine and has USB debugging enabled - run 'adb devices' to see a list of connected devices\n\\u2022 Ensure Airplane Mode is disabled\n\\u2022 If you're on a physical device connected to the same machine, run 'adb reverse tcp:<PORT> tcp:<PORT> to forward requests from your device\n\\u2022 If your device is on the same Wi-Fi network, set 'Debug server host & port for device' in 'Dev settings' to your machine's IP address and the port of the local dev server - e.g. 10.0.1.1:<PORT>\n\n";
    private final String originalMessage;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007f\u0007llA0RfP.XV0Ŧl\u0012éT[Rp\u0004@[\u001aԥ&\t]N0\u0010|Mr\u000bq\u00136\u001a\u0007oDI\u0004z\u000e\u0016\u001d8Zom5}sK@xtd\u0007P80@\u0012\u0007\u0017\u0019XQV{CcY\u000f*0ntjV\u001bR\u001d\u001a@\bn$\u000f$tg|8xrkBG%\u0019hpWmdx\u0019[\u0017^V=\f%eN1N<M\u0017;R1\t\u0003aM\u000eWsS\u0004\u0017)m0\u0012\u0002eBp\u007fB\u0017[S\u001bj\u000b&\u000b\u0007\u0018`\\39P{K~\u0010~¾|ԫ\u0011<\f\u05faΣ+V"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW\u001bv\"E[k D~\u0016;-V9k?-\u0019rjwdm4Yr0KVW\u0002", "", "u(E", "\u0015D=\u0012E\u0010\u001cMxkgH\u0019vp\u000fSm\u0004] ", "", ";`Z2:,GS&\u0003x", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW\u001bv\"E[k D~\u0016;-V9k?-\u0019rj\u000f", "Cq[", "@dP@b5", "3wc?T", "B", "", ">`a@X", "Asa", "Ag^?g,G4\u001d\u0006zG(\u0005\t", "4t[990ES\u0002z\u0003^", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String shortenFileName(String str) {
            List listEmptyList;
            List<String> listSplit = new Regex(RemoteSettings.FORWARD_SLASH_STRING).split(str, 0);
            if (listSplit.isEmpty()) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listEmptyList = CollectionsKt.emptyList();
            }
            return (String) ArraysKt.last((String[]) listEmptyList.toArray(new String[0]));
        }

        @JvmStatic
        public final DebugServerException makeGeneric(String url, String reason, String extra, Throwable th) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(extra, "extra");
            return new DebugServerException(reason + StringsKt.replace$default(DebugServerException.GENERIC_ERROR_MESSAGE, "<PORT>", String.valueOf(Uri.parse(url).getPort()), false, 4, (Object) null) + extra, th);
        }

        @JvmStatic
        public final DebugServerException makeGeneric(String url, String reason, Throwable th) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(reason, "reason");
            return makeGeneric(url, reason, "", th);
        }

        @JvmStatic
        public final DebugServerException parse(String str, String str2) {
            String str3 = str2;
            if (str3 != null && str3.length() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    String string = jSONObject.getString("filename");
                    String string2 = jSONObject.getString("message");
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    Intrinsics.checkNotNull(string);
                    return new DebugServerException(string2, shortenFileName(string), jSONObject.getInt("lineNumber"), jSONObject.getInt("column"), null);
                } catch (JSONException e2) {
                    FLog.w(ReactConstants.TAG, "Could not parse DebugServerException from: " + str2, e2);
                }
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugServerException(String description) {
        super(description);
        Intrinsics.checkNotNullParameter(description, "description");
        this.originalMessage = description;
    }

    private DebugServerException(String str, String str2, int i2, int i3) {
        super(str + "\n  at " + str2 + Global.COLON + i2 + Global.COLON + i3);
        this.originalMessage = str;
    }

    public /* synthetic */ DebugServerException(String str, String str2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i2, i3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugServerException(String detailMessage, Throwable th) {
        super(detailMessage, th);
        Intrinsics.checkNotNullParameter(detailMessage, "detailMessage");
        this.originalMessage = detailMessage;
    }

    @JvmStatic
    public static final DebugServerException makeGeneric(String str, String str2, String str3, Throwable th) {
        return Companion.makeGeneric(str, str2, str3, th);
    }

    @JvmStatic
    public static final DebugServerException makeGeneric(String str, String str2, Throwable th) {
        return Companion.makeGeneric(str, str2, th);
    }

    @JvmStatic
    public static final DebugServerException parse(String str, String str2) {
        return Companion.parse(str, str2);
    }

    public final String getOriginalMessage() {
        return this.originalMessage;
    }
}
