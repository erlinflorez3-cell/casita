package com.braze.models.inappmessage;

import bo.app.ba;
import bo.app.e00;
import bo.app.e20;
import bo.app.e9;
import bo.app.h00;
import bo.app.k20;
import bo.app.l20;
import bo.app.m20;
import bo.app.n20;
import bo.app.o20;
import bo.app.tf;
import bo.app.vw;
import bo.app.xe0;
import bo.app.z9;
import com.braze.enums.inappmessage.MessageType;
import com.braze.support.BrazeLogger;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>-6B\r.4ߚ\u007f\u0007tjA0JfP.`\\2\u000fq\b<$q$yّCU0}*\tUOm\r\u0005Ϻ\u000b\u000bq\u000e6\u0016'jlP[\u000bٕ\u0016\u00118X}KsduQId\u0003N\u001d `9H}\u0013\u001b2*v)ͯ~EQ\" K\t\u0012HW%M3\u001eB\u0016L#\u0019*li^6vnm<?#1kpOms݁\u0001O\u0013Kb-U\fo'C@e=E)a\n\u001fR\nAISџA\u0007n055\u0012\u0001eAp\u007fB\u0019qcոat,g\u0013]1.58geaO<*.\u000f:!\u0013Ǡ\u001aΝ+X6/ s\u0016\u001cKvxbN`\"`H\u0011\ts\u0007+3\u0013K+g#\u001dQ ;o\u05ceC߉\t\u0011&%\u0007\u0002/o%$n*3V\u000eP_Sv=\u0007N`ԲIъ\btj\u00040\u0019>UĲ3\u0018"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=\u0007{Bx}.[Q7m4\u0001$ph\u0016\u0003q,$", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=\u0007{Bx}.[Q7m4z\u0011va\u000f", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ewwi@\\", "", "", "@d\\<g,)O(\u0002ih\u0013\u0007\u0007+l[6\n@\u0010~\u0013R", "", "Adc\u0019b*:Z\u0004\fz_,\f\u00072e~\u0004\nN\u0001&\u0002C~\u0011J", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)p", "0tcAb5\"R", "", ":nV\u000fh;M]\"\\\u0002b*\u0003", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?5", "=m03g,K1 \t\t^+", "u(E", ":nR._\bLa\u0019\u000e\t=0\n\t-t\n5\u00100\u000e\u001e", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0019b*:Zt\r\t^;\u000bg3r\u007f&\u000bJ\u000e+\u0007Tv", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0019b*:Zt\r\t^;\u000bg3r\u007f&\u000bJ\u000e+\u0007Tv", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "E`b\u000fh;M]\"\\\u0002b*\u0003o9g\u0002(z", "(", "0tcAb5\"Rv\u0006~\\2|\b", "\nh]6g\u0005", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "8r^;B)CS\u0017\u000e", "\u001aa^{T7I\u001d\u001cIE4", "0qPGX\u0014:\\\u0015\u0001zk", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u0014Q9\nG\u0002n8$Huz^", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public abstract class InAppMessageHtmlBase extends InAppMessageBase implements IInAppMessageHtml {
    private String buttonIdClicked;
    private String localAssetsDirectoryUrl;
    private boolean wasButtonClickLogged;

    public InAppMessageHtmlBase() {
        setOpenUriInWebView(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageHtmlBase(JSONObject jsonObject, h00 brazeManager) {
        super(jsonObject, brazeManager, false, false, 12, null);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        setOpenUriInWebView(jsonObject.optBoolean(InAppMessageBase.OPEN_URI_IN_WEBVIEW, true));
    }

    @Override // com.braze.models.inappmessage.IInAppMessageHtml
    public String getLocalAssetsDirectoryUrl() {
        return this.localAssetsDirectoryUrl;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageHtml
    public boolean logButtonClick(String buttonId) {
        Intrinsics.checkNotNullParameter(buttonId, "buttonId");
        String triggerId = getTriggerId();
        h00 brazeManager = getBrazeManager();
        if (triggerId == null || triggerId.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k20(buttonId), 7, (Object) null);
            return false;
        }
        if (StringsKt.isBlank(buttonId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) l20.f1155a, 6, (Object) null);
            return false;
        }
        if (this.wasButtonClickLogged && getMessageType() != MessageType.HTML) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) m20.f1246a, 6, (Object) null);
            return false;
        }
        if (brazeManager == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) n20.f1334a, 6, (Object) null);
            return false;
        }
        z9 z9Var = ba.f257g;
        z9Var.getClass();
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        Intrinsics.checkNotNullParameter(buttonId, "buttonId");
        e00 e00VarA = z9Var.a(new e9(triggerId, buttonId));
        if (e00VarA != null) {
            ((tf) brazeManager).a(e00VarA);
        }
        this.buttonIdClicked = buttonId;
        this.wasButtonClickLogged = true;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o20(buttonId, triggerId), 7, (Object) null);
        return true;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        String triggerId;
        String str;
        h00 brazeManager;
        super.onAfterClosed();
        if (!this.wasButtonClickLogged || (triggerId = getTriggerId()) == null || StringsKt.isBlank(triggerId) || (str = this.buttonIdClicked) == null || StringsKt.isBlank(str) || (brazeManager = getBrazeManager()) == null) {
            return;
        }
        String triggerId2 = getTriggerId();
        String str2 = this.buttonIdClicked;
        e20 triggerEvent = new e20(triggerId2);
        triggerEvent.f537f = str2;
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        ((vw) ((tf) brazeManager).f1841d).b(xe0.class, new xe0(triggerEvent));
    }

    @Override // com.braze.models.inappmessage.IInAppMessageHtml
    public void setLocalAssetsDirectoryUrl(String str) {
        this.localAssetsDirectoryUrl = str;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> remotePathToLocalAssetMap) {
        Intrinsics.checkNotNullParameter(remotePathToLocalAssetMap, "remotePathToLocalAssetMap");
        if (remotePathToLocalAssetMap.isEmpty()) {
            return;
        }
        setLocalAssetsDirectoryUrl(((String[]) remotePathToLocalAssetMap.values().toArray(new String[0]))[0]);
    }
}
