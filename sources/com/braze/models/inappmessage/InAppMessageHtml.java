package com.braze.models.inappmessage;

import bo.app.h00;
import bo.app.j20;
import com.braze.enums.inappmessage.MessageType;
import com.braze.support.JsonUtils;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLc\u0003&I\u0006>\u00176Ȑ\u0007\":\u0012\u007f\u0007llA0R\u0004P.XS2\u000f\u0002{<$a/yCI^\"}(\tWN}gvJ`\u000fK\u000f\u001c\u0016\u0001j2M[\u000es܈-Yrom2\u0006neygzJӯ$4(X\b&A10\\ z\tec\f@;PtHv%M3=Ū\n@&!,\u0002(}<X|aHQ;\u0003\u0018M^+mT\u0015M;id-\u001b\u0005y A?e@%/a\u0017\u001fXkA\u0013? >3pҊ+-O\u0014e\\!!\"\u0019CO;`#6j\u0007il\u001c);O\u0012L`\u00108w)|;<J\"Ν+J41(kP'Az\u000b_PR\u0012^p\u0001\u000bcF\u0017S\u0001a+\u007f/ƻUcA\u001f\\>D\u0018\u001b';\u0007~#kT<aC#\u001b\fΦ5SFFVXRfKy\u001cp\u0011\rp\u0018ΥK\u00025\b\u001f;gGEiQ%7j0Szk5\t7ì_ׂVXH$t$E9!\u000e`Tr\u0012\fRZi:#\u001e<b\t\u0016\u0014#\"lwj\"5\u0012^O\u0017j\u0019M\u0014\nc/=ƀeˇo\u0012_;d5Cd46of\u000f\u001aO>r\u0005\u0007gp[B^\u001b,xüTн\u0014\b\u0004FT !GWs\"J:;9^\u001b_\u00116\u0013P\u000b#wZ\u0017)5\u0019տ(\u0007\u0002&z#\u000fk-\u0003}\u0007\u0011IZ\u0019\u0017v\u0004ۢSڤ\u001d*m$nQ\u000bAȽ\u0003\u001d"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=\u0007{Bx}.[Q7m4\u0001$ph\u000f", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=\u0007{Bx}.[Q7m4\u0001$ph\u0016\u0003q,$", "", "", "@d\\<g,)O(\u0002ih\u0013\u0007\u0007+l[6\n@\u0010~\u0013R", "", "Adc\u0019b*:Z\u0004\fz_,\f\u00072e~\u0004\nN\u0001&\u0002C~\u0011J", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)p", "5dc\u0019b*:Z\u0004\fz_,\f\u00072e~\u0004\nN\u0001&\u0002C~\u0011J", "u(;7T=:\u001d)\u000e~eud\u0005:;", "", "5dc\u001fX4Hb\u0019Z\tl,\fs+t\u00036\\J\u000e\u0002$Gp\u000eKt(", "u(;7T=:\u001d)\u000e~euc\r=tU", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "4na\u0017f6G>)\u000e", "u(;<e.\bX'\t\u0004(\u0011jr\u0018O|-{>\u0010l", ";db@T.>4\u001d~\u0002]:", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "5dc\u001aX:LO\u001b~[b,\u0004\b=", "Adc\u001aX:LO\u001b~[b,\u0004\b=", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOVZ\b", "\u001aiPCTuNb\u001d\u0006DF(\b^", "/rb2g\u001cKZ'", "\u001aiPCTuNb\u001d\u0006DE0\u000b\u0018\u0005", "5dc\u000ef:>b\t\f\u0002l", "Adc\u000ef:>b\t\f\u0002l", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "", "7r?Bf/)`\u001d\u0007zk", "u(I", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u001dY\f.3o\u0016\u001daN;A", "5dc\u001aX:LO\u001b~ir7|", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eq\u007fI|\"\"Oo\u001cJr'5#e E{\u00120M2Ov4s", ";db@T.>B-\nz", "\nh]6g\u0005", "u(E", "8r^;B)CS\u0017\u000e", "\u001aa^{T7I\u001d\u001cIE4", "0qPGX\u0014:\\\u0015\u0001zk", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u0014Q9\nG\u0002n8$Huz^", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u0014Q9\nG\u0002n8$Hu\u001ew#0\u0017HIu=gyVK\"p`1Nt6\u001d3S(mN<M#\u0016aW5/\u001b\u0014/\u0005\u0015", "\u0011n\\=T5B]\"", "0n\u001e.c7\bXeI", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public class InAppMessageHtml extends InAppMessageHtmlBase {
    private static final String ASSET_URLS_KEY = "asset_urls";
    public static final j20 Companion = new j20();
    public static final String IS_PUSH_PRIMER_KEY = "is_push_primer";
    public static final String MESSAGE_FIELDS_KEY = "message_fields";
    private List<String> assetUrls;
    private JSONObject messageFields;
    private Map<String, String> remotePathToLocalAssetMap;

    public InAppMessageHtml() {
        this.remotePathToLocalAssetMap = MapsKt.emptyMap();
        this.assetUrls = CollectionsKt.emptyList();
        this.messageFields = new JSONObject();
        this.assetUrls = CollectionsKt.emptyList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageHtml(JSONObject jsonObject, h00 brazeManager) {
        this(jsonObject, brazeManager, jsonObject.optJSONObject(MESSAGE_FIELDS_KEY), JsonUtils.convertStringJsonArrayToList(jsonObject.optJSONArray(ASSET_URLS_KEY)));
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
    }

    private InAppMessageHtml(JSONObject jSONObject, h00 h00Var, JSONObject jSONObject2, List<String> list) {
        super(jSONObject, h00Var);
        this.remotePathToLocalAssetMap = MapsKt.emptyMap();
        CollectionsKt.emptyList();
        this.messageFields = jSONObject2;
        this.assetUrls = list;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject jSONObjectForJsonPut = super.forJsonPut();
        try {
            jSONObjectForJsonPut.put("type", getMessageType().name());
        } catch (JSONException unused) {
        }
        return jSONObjectForJsonPut;
    }

    public final List<String> getAssetUrls() {
        return this.assetUrls;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Map<String, String> getLocalPrefetchedAssetPaths() {
        return this.remotePathToLocalAssetMap;
    }

    public final JSONObject getMessageFields() {
        return this.messageFields;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.HTML;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        return this.assetUrls;
    }

    public final boolean isPushPrimer() {
        JSONObject jSONObject = this.messageFields;
        return jSONObject != null && jSONObject.optBoolean(IS_PUSH_PRIMER_KEY, false);
    }

    public final void setAssetUrls(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.assetUrls = list;
    }

    @Override // com.braze.models.inappmessage.InAppMessageHtmlBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> remotePathToLocalAssetMap) {
        Intrinsics.checkNotNullParameter(remotePathToLocalAssetMap, "remotePathToLocalAssetMap");
        this.remotePathToLocalAssetMap = remotePathToLocalAssetMap;
    }

    public final void setMessageFields(JSONObject jSONObject) {
        this.messageFields = jSONObject;
    }
}
