package com.braze.models.inappmessage;

import bo.app.h00;
import bo.app.s30;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>)6B\r.4\u0012}\u0007njO0LeN7ZS@\u000fs{:'aI\bّYiJ}P\b\u007fN\u0016g'IoKJ\u0015\u001aȀ|l2Wc\b\u001e)\u0015FRsMCeok>pxD\u001782PIѩ\t\u0003 8V#?\u000eQN$\u0018@B\u0001:\u0001\u000f{\u0006`&ĂB\"\u0007!jk\u0017CVru:](I}ŌR)e6\u000bT]hb/%xw\u001dYBmIS9*Ο\u0013қ_O\u000bAwE\u0013q?)1S\u0002bVZ\u0006 #8̦\u0011s"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=\u0007{Bx}.[Q7m4\u0013\u0019sl9\u0006?:\\v6*[V39N\u0001=i", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=\u0007{Bx}.[Q7m4\u0001$ph\u0016\u0003q,$", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001e\nllD\u0007b\b\\\u0005'V/]4c(", "", "", "5dc\u001fX4Hb\u0019Z\tl,\fs+t\u00036\\J\u000e\u0002$Gp\u000eKt(", "u(;7T=:\u001d)\u000e~euc\r=tU", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "4na\u0017f6G>)\u000e", "u(;<e.\bX'\t\u0004(\u0011jr\u0018O|-{>\u0010l", "/rb2g:3W$kzf6\f\t\u001fr\u0007", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u000ef:>b's~i\u0019|\u00119t\u007f\u0018\tG", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000ef:>b's~i\u0019|\u00119t\u007f\u0018\tG", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\nh]6g\u0005", "u(E", "8r^;B)CS\u0017\u000e", "\u001aa^{T7I\u001d\u001cIE4", "0qPGX\u0014:\\\u0015\u0001zk", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u0014Q9\nG\u0002n8$Huz^", "\u0011n\\=T5B]\"", "0n\u001e.c7\bafI", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public abstract class InAppMessageZippedAssetHtmlBase extends InAppMessageHtmlBase implements IInAppMessageZippedAssetHtml {
    public static final s30 Companion = new s30();
    private static final String HTML_CONTENT_ZIPPED_ASSETS_REMOTE_URL = "zipped_assets_url";
    private String assetsZipRemoteUrl;

    public InAppMessageZippedAssetHtmlBase() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageZippedAssetHtmlBase(JSONObject jsonObject, h00 brazeManager) {
        super(jsonObject, brazeManager);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        String it = jsonObject.optString(HTML_CONTENT_ZIPPED_ASSETS_REMOTE_URL);
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (StringsKt.isBlank(it)) {
            return;
        }
        setAssetsZipRemoteUrl(it);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject jSONObjectForJsonPut = super.forJsonPut();
        try {
            jSONObjectForJsonPut.putOpt(HTML_CONTENT_ZIPPED_ASSETS_REMOTE_URL, getAssetsZipRemoteUrl());
        } catch (JSONException unused) {
        }
        return jSONObjectForJsonPut;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageZippedAssetHtml
    public String getAssetsZipRemoteUrl() {
        return this.assetsZipRemoteUrl;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        ArrayList arrayList = new ArrayList();
        String assetsZipRemoteUrl = getAssetsZipRemoteUrl();
        if (assetsZipRemoteUrl != null && !StringsKt.isBlank(assetsZipRemoteUrl)) {
            arrayList.add(assetsZipRemoteUrl);
        }
        return arrayList;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageZippedAssetHtml
    public void setAssetsZipRemoteUrl(String str) {
        this.assetsZipRemoteUrl = str;
    }
}
