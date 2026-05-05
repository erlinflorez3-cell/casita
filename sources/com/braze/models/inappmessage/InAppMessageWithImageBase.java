package com.braze.models.inappmessage;

import android.graphics.Bitmap;
import bo.app.h00;
import bo.app.r30;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>-6B\r.4ߚ\u007f\u0007tjA0JeP.`q2\u000fq{<$q$yCAU\"}8\tWNmkvJh\u0014K\u000f\f)\u0001jBI]xc\u0015\u0015WXģ]`}ok8\u0011td\u0005X1Px\u0001\u000b\u0013ʀ.J\u0016\u001f\t_\f#\u0018DPtH{%M3$\"\nLK\u0019\u001e\u000b\u0012ߑ:Jr\u0006H[k$wGf'\u000e4-]\u001bIl3\u001dxq\u001eYBG7%%\u0002\u00055S\"SƄCsC\nv-o>W{o<h\u0002$\u0015YQ;d9:ػ\tSf\u001454\u0018pY[&(&\u0005B!ʀ\b\u0010\f2V:}<t\u0016&5\u000bq\u0002M\u0007\u0016\u001dVVфmي\u001b5\b51G)uicA)\\H\u001c\u0007\u001301\u0014?Gii&`C/\u000b\f\u0010E(͌I˓R a?s\u0019~x\u0012,\nKU\u001cG}\u0017E%=W]?</\u0006RjR\u0005\u000f\u0007vg\u0002k\t\\~6EނCҊ\r\u001cbFj\"ynlZ20[<t\t\u0004)!B-\u001aJD=\u0012dN\u0017k!a\u001c\u001e{ÛrƠ]~s\u0010]\\lQMSi4or\u0017\u0016Eap')zPz$\\r'P4~?fȅ}ΌR\u0010+4E\u0018*TϢ5H"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=\u0007{Bx}.[Q7m4\u0010\u0019wd\u001d\u000f_.NS#UL$", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=\u0007{Bx}.[Q7m4z\u0011va\u000f", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001e\u0007lp<jk(Pv|", "", "", "@d\\<g,)O(\u0002ih\u0013\u0007\u0007+l[6\n@\u0010~\u0013R", "", "Adc\u0019b*:Z\u0004\fz_,\f\u00072e~\u0004\nN\u0001&\u0002C~\u0011J", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)p", "", "5dc\u001fX4Hb\u0019Z\tl,\fs+t\u00036\\J\u000e\u0002$Gp\u000eKt(", "u(;7T=:\u001d)\u000e~euc\r=tU", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "4na\u0017f6G>)\u000e", "u(;<e.\bX'\t\u0004(\u0011jr\u0018O|-{>\u0010l", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "0hc:T7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "5dc\u000f\\;FO$", "u(;.a+K]\u001d}D`9x\u00142i}6E\u001d\u0005&\u001fCzc", "Adc\u000f\\;FO$", "uKP;W9HW\u0018H|k(\b\f3c\u000eqXD\u0010\u001f\u0013REQ-", "", "7lP4X\u000bHe\"\u0006\u0005Z+j\u0019-c\u007f6\nA\u0011\u001e", "(", "5dc\u0016`(@Sw\t\rg3\u0007\u0005.S\u0010&y@\u000f%\u0018Wv", "u(I", "Adc\u0016`(@Sw\t\rg3\u0007\u0005.S\u0010&y@\u000f%\u0018Wv", "uY\u0018#", "5dc\u0016`(@Sw\t\rg3\u0007\u0005.S\u0010&y@\u000f%\u0018WvL8\u007f.?hy/;w\u001f<", "u(E", ":nR._\u0010FO\u001b~jk3", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0019b*:Z|\u0007v`,l\u00166", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0019b*:Z|\u0007v`,l\u00166", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "@d\\<g,\"[\u0015\u0001zN9\u0004", "5dc\u001fX4Hb\u0019b\u0003Z.|x<l", "Adc\u001fX4Hb\u0019b\u0003Z.|x<l", "5dc\u0016`(@S\t\f\u0002", "7lP4X\u001cKZ", "\nh]6g\u0005", "8r^;B)CS\u0017\u000e", "\u001aa^{T7I\u001d\u001cIE4", "0qPGX\u0014:\\\u0015\u0001zk", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u0014Q9\nG\u0002n8$Huz^", "\u0011n\\=T5B]\"", "0n\u001e.c7\b`fI", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public abstract class InAppMessageWithImageBase extends InAppMessageBase implements IInAppMessageWithImage {
    public static final r30 Companion = new r30();
    private static final String REMOTE_IMAGE_URL = "image_url";
    private Bitmap bitmap;
    private boolean imageDownloadSuccessful;
    private String localImageUrl;
    private String remoteImageUrl;

    public InAppMessageWithImageBase() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageWithImageBase(JSONObject jsonObject, h00 brazeManager) {
        super(jsonObject, brazeManager, false, false, 12, null);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        setRemoteImageUrl(jsonObject.optString(REMOTE_IMAGE_URL));
    }

    public static /* synthetic */ void getImageDownloadSuccessful$annotations() {
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject jSONObjectForJsonPut = super.forJsonPut();
        try {
            jSONObjectForJsonPut.putOpt(REMOTE_IMAGE_URL, getRemoteImageUrl());
        } catch (JSONException unused) {
        }
        return jSONObjectForJsonPut;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public boolean getImageDownloadSuccessful() {
        return this.imageDownloadSuccessful;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public String getImageUrl() {
        return getRemoteImageUrl();
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public String getLocalImageUrl() {
        return this.localImageUrl;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        ArrayList arrayList = new ArrayList();
        String remoteImageUrl = getRemoteImageUrl();
        if (remoteImageUrl != null && !StringsKt.isBlank(remoteImageUrl)) {
            arrayList.add(remoteImageUrl);
        }
        return arrayList;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public String getRemoteImageUrl() {
        return this.remoteImageUrl;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public void setImageDownloadSuccessful(boolean z2) {
        this.imageDownloadSuccessful = z2;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public void setLocalImageUrl(String str) {
        this.localImageUrl = str;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> remotePathToLocalAssetMap) {
        Intrinsics.checkNotNullParameter(remotePathToLocalAssetMap, "remotePathToLocalAssetMap");
        if (remotePathToLocalAssetMap.isEmpty()) {
            return;
        }
        setLocalImageUrl(((String[]) remotePathToLocalAssetMap.values().toArray(new String[0]))[0]);
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public void setRemoteImageUrl(String str) {
        this.remoteImageUrl = str;
    }
}
