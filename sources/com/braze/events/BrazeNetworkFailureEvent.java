package com.braze.events;

import bo.app.cp;
import bo.app.l00;
import bo.app.mn;
import bo.app.tg;
import bo.app.w00;
import java.util.Map;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLc\u000b\u0004I\u00066\u000b6B\u0015\"4\u0012}\u000bnjG<LeN.ZS8\u0015s{:%c$\u007fLCU \u0003*\t]pogtLb\u000bQ\u0016\u000e\u0016~o4Ikxe\u0012\u00158HīEIݹ =g_-52`G2<\b\u000b\u0019\u001aXH z\tJc\f@3Ϯt<X8[1b \u0014?8\u0001L\\.߱7Ղp_@01\u00052P\\+w0+PSтUܮ\u0011xg\"9E\u007fW#-k\u00035Ѹ\fE\t?\u007fC\u001dhU'[OyWD_\u0018\u0014C.\u0016֜\\ę*^\u000bYn\u0015o9]ncP<2>\u0094zɁ@\u0006\u0014\u00115Tv;(t \u000ea\u00029ն?г\u0006`H\u000e\tp~/3\u0012K+g,\u0017WoK1PMz3\fdƗ\u0002ͼ%]Z n(kf\u0006WIQn=~N`Բ?ъ\btj\u00040\n>[PA\n\u0018F\u0017S:\u00129yܬmɘLHox\u000bgvh:gVV:nDD`\rɔ^Nl\u0007qfboD\u0013S4b\u0016N+!:t\u0006L#5\u0010|YxmzOs\tS9\u0015P\u0010r«\u0012aA`9O_~(cX\u0013\"\\\ry\u0013w~Di\u000b\tz^&ĘLt\u0018y\u0002c\\,+4E\u0013*V|F'\u007f-H1(xEҴ\ribj\u0016\"bW<\u0005oI\u0003\u0015Qej\u0018\bg'ob\u0001˃&7IS;@4}:j:&11ґw."}, d2 = {"\u001ab^:\")KO.~D^=|\u0012>sI\u0005\t<\u0016\u0017\u007fG~ F\u0004+\u0016U\u0002'Gz\u0016\u000e^CDz\n", "", "\u001aa^{T7I\u001d IE4", "1n\\=b5>\\(J", "u(;/bu:^$H\u0002)vR", "\u001aa^{T7I\u001d+IE4", "1n\\=b5>\\(K", "u(;/bu:^$H\r)vR", "0qPGX\u0019>_)~\tm", "6sc=66G\\\u0019|\nh9i\t=u\u00077", "1n_F", "uKQ<\"(I^b\u0006E)\u0002c\u00069/{3\u0007\n\u0013aa\u001d3t:\u0001-~V\u000b\u001cLm_.^CDzBgqu]N\u0007L,]\t1TR/(`Y\u0003J\u0014qk\u000eW:b", "", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "", "6`b566=S", "u(8", "=sW2e", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "\u001aa^{T7I\u001d IE4", "\u001aa^{T7I\u001d+IE4", "@db=b5LSv\ty^", "\u0017", "5dc\u001fX:I]\"\rz<6{\t", "", "@db=b5LS{~v],\n\u0017", "\u001aiPCTuNb\u001d\u0006DF(\b^", "5dc\u001fX:I]\"\rzA,x\b/r\u000e", "u(;7T=:\u001d)\u000e~eud\u0005:;", "", "@d`BX:M7\"\u0003\nb(\f\r9nn,\u0004@", "\u001aiPCTuEO\"\u0001DE6\u0006\u000b\u0005", "5dc\u001fX8NS'\u000e^g0\f\r+t\u00042\u0005/\u0005\u001f\u0017", "u(;7T=:\u001d z\u0004`uc\u00138gU", "@d`BX:MC&\u0006", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u001fX8NS'\u000ejk3", "\u001ab^:\")KO.~D^=|\u0012>sI\u0005\t<\u0016\u0017\u007fG~ F\u0004+\u0016U\u0002'Gz\u0016\u000e^CDzr\u000b\u0015tq9\u0015r\u001bb\u0002'\u001d", "@d`BX:MB-\nz", "\u001ab^:\")KO.~D^=|\u0012>sI\u0005\t<\u0016\u0017\u007fG~ F\u0004+\u0016U\u0002'Gz\u0016\u000e^CDzr\u000b\u0015tq9\u0015r\u001bb\u0002'\u001d", "5dc\u001fX8NS'\u000eir7|", "u(;0b4\bP&z\u0010^u|\u001a/n\u000f6E\u001d\u000e\u0013,GX\u000eK\t/B_^\u001c;t&;M#Lk=-SUaE\u0017c:]e;RL$", "\nh]6g\u0005", "uKQ<\"(I^b\u0006E)\u0002c\u00069/{3\u0007\n\u0013aa\u001d3~", " d`BX:MB-\nz", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public final class BrazeNetworkFailureEvent {
    private final l00 brazeRequest;
    private final w00 httpConnectorResult;
    private final Long requestInitiationTime;
    private final RequestType requestType;
    private final String requestUrl;
    private final int responseCode;
    private final Map<String, String> responseHeaders;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0007Gْ/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001͆\rS"}, d2 = {"\u001ab^:\")KO.~D^=|\u0012>sI\u0005\t<\u0016\u0017\u007fG~ F\u0004+\u0016U\u0002'Gz\u0016\u000e^CDzr\u000b\u0015tq9\u0015r\u001bb\u0002'\u001d", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0011N=!8\u0015-MvZg=\u001avv#N]", "\u001cDF R\r\u001e3wxhR\u0015Z", "\u001dS7\u0012E", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum RequestType {
        CONTENT_CARDS_SYNC,
        NEWS_FEED_SYNC,
        OTHER
    }

    public BrazeNetworkFailureEvent(l00 brazeRequest, w00 httpConnectorResult) {
        Intrinsics.checkNotNullParameter(brazeRequest, "brazeRequest");
        Intrinsics.checkNotNullParameter(httpConnectorResult, "httpConnectorResult");
        this.brazeRequest = brazeRequest;
        this.httpConnectorResult = httpConnectorResult;
        this.responseCode = httpConnectorResult.b();
        this.responseHeaders = httpConnectorResult.c();
        tg tgVar = (tg) brazeRequest;
        this.requestInitiationTime = tgVar.d();
        this.requestUrl = tgVar.e().a();
        RequestType requestType = brazeRequest instanceof mn ? RequestType.CONTENT_CARDS_SYNC : ((brazeRequest instanceof cp) && ((cp) brazeRequest).f().b()) ? RequestType.NEWS_FEED_SYNC : RequestType.OTHER;
        this.requestType = requestType;
    }

    private final l00 component1() {
        return this.brazeRequest;
    }

    private final w00 component2() {
        return this.httpConnectorResult;
    }

    public static /* synthetic */ BrazeNetworkFailureEvent copy$default(BrazeNetworkFailureEvent brazeNetworkFailureEvent, l00 l00Var, w00 w00Var, int i2, Object obj) {
        if ((1 & i2) != 0) {
            l00Var = brazeNetworkFailureEvent.brazeRequest;
        }
        if ((i2 & 2) != 0) {
            w00Var = brazeNetworkFailureEvent.httpConnectorResult;
        }
        return brazeNetworkFailureEvent.copy(l00Var, w00Var);
    }

    public final BrazeNetworkFailureEvent copy(l00 brazeRequest, w00 httpConnectorResult) {
        Intrinsics.checkNotNullParameter(brazeRequest, "brazeRequest");
        Intrinsics.checkNotNullParameter(httpConnectorResult, "httpConnectorResult");
        return new BrazeNetworkFailureEvent(brazeRequest, httpConnectorResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrazeNetworkFailureEvent)) {
            return false;
        }
        BrazeNetworkFailureEvent brazeNetworkFailureEvent = (BrazeNetworkFailureEvent) obj;
        return Intrinsics.areEqual(this.brazeRequest, brazeNetworkFailureEvent.brazeRequest) && Intrinsics.areEqual(this.httpConnectorResult, brazeNetworkFailureEvent.httpConnectorResult);
    }

    public final Long getRequestInitiationTime() {
        return this.requestInitiationTime;
    }

    public final RequestType getRequestType() {
        return this.requestType;
    }

    public final String getRequestUrl() {
        return this.requestUrl;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final Map<String, String> getResponseHeaders() {
        return this.responseHeaders;
    }

    public int hashCode() {
        return this.httpConnectorResult.hashCode() + (this.brazeRequest.hashCode() * 31);
    }

    public String toString() {
        return "BrazeNetworkFailureEvent(brazeRequest=" + this.brazeRequest + ", httpConnectorResult=" + this.httpConnectorResult + ')';
    }
}
