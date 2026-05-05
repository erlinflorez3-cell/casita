package com.biocatch.client.android.sdk.web;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.core.exceptions.UnsupportedAPIException;
import com.biocatch.client.android.sdk.core.exceptions.WebviewException;
import com.biocatch.client.android.sdk.web.handlers.HybridDataHandler;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Timer;
import javax.security.auth.Destroyable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.Wg;

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
@Metadata(bv = {}, d1 = {"Яl\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007njO0L͜P.hS2şs{J$cҕyCIa\"Ԃ*\t]TogtKb\u000bY\u000f\u000eǝ\u0001jBI]ތe\u0012%2JoE7UoK9ht<\u0005(288\u0002ڎ\t\u001a@H\u0018v\u0001KS\f(0Hp@T\u0013˟\u001b܅B\u0006l\u001f1\u001e\u000bg\u00076v\u001c\u001e}?'\u0011jZNUa@\u0007[\u0010^Z7\u000f\u0007aL0n;E\u00193Y\u001b\u0007\u0001bO\u0007MyU\u0005\u0017071W}o8n~B ;S\u001bi\u000b&\u000b\u0012ad\u001a5CO\u0012Xח\u0012(\u0006\nD\u0011J\u001f&\u0006Udv3(\u0004 \u000ea\u00119T\t^\u0010|Z\u007f)\u0001f\u001b3 K+g<-R*A'pO{3)d7I|/~l\u000e\u000f1KX\u0006uIQn\\\u000fNRgK\u0013\u001cp\u0011\u001eZ\b>g\u0018/*\u001ct\u0017m=i_;!\u001a\u001e\u000fX0|\u0013\b\u0001S\u0018n\u000f@jz$_B\t:vth\u0013\u0015hT\u00077Ye*~\u001f}6/Pb\u0006g9'&M}\u0015\u001ap[\u000b\"'Eeed?{\u001cgQbaF\"c>Р)Λ\u0016͖@b\r֚7Na\u0012r\\V)\tʎlݻ{{L\u0088\\\u001f@@\n\u001cb.\bǌ^ČL\u0003&Փ\u0012\t\u0017krh>\f+՟&ғm$|էQ\\jx\bg'R\u0003ʌbĘ1AYځi6c4\u00018+6W~\"Ò\u001eшNܤPl\u001e߯&\u000e.*29\u007fDsSeȲ+ɨ\u00061]Nx{_db9\t\u007f\u0012\u0015Kj>g6o\u001f07ʇLׅX\u0017*Ԯ/\u00131\u0012|\u0002\u0010`t\u0006wib#s@_q1dz\u000f\u000fُ\u0011ȷ\"+\tǻ:~;FQAޝ\u001a("}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40rrjB\u0007a;R\u00010\u001d", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "\u001aiPCT?\ba\u0019|\u000bk0\f\u001dxa\u00107~\n_\u0017%V|\u0018Pr\"<YS", "6xQ?\\+\u001dO(z]Z5{\u0010/r", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_1IL:r4+#2DM\u0004p0MU#VH1(eQy=!g", "EdQ#\\,P", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%lD\u0001)l", "6`]1_,K", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "EdQ#\\,PC&\u0006", "", "AbW2W<ESv\t\u0004g,z\u0018\u0013n\u000f(\tQ|\u001e", "", "AkPCX\u0012>S$Z\u0002b=|l8t\u007f5\r<\b", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004iIm\u0013wP?Dj;\u001e\"v+\u001c\u001b`9Ru\u0006C[J\u000fX[qD\u0014\u001f0tS'\u001e\u0001#H wF\u0001,\b-\u0013s;d\u0007x\u0016\u000f5wpKT\u0010\u001d`\u0011~@6rJX)\u0004U\u000b(^3c\u0013_*2!8.\u001c;\u0016\u001frN*\u0019yVZn[xtqK\u0018D6.FueOSn[\u0006r1,KEg!6_\u0003\u0001[2\u007fE&\u007fk\u0001Tia,m\u0006\u00195^\u0017\u000b\ny-", "1`[9U(<Y{z\u0004]3|\u0016", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40rrjB\u0007a;R\u00010\u0006>N)DR\u0001K\u0010\u0014ZkJ2\u0014aU?*Q@@\u001e\u000f,VW", "EdQ\u001aX:LO\u001b~eh9\fz<a\u000b3{M", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40rrjB\u0007a;R\u00010\u0006>N)DR\u0001K\u0010\u0014ZxX8\u001cvf=/yDDt", "EdQ\u001aX:LO\u001b~jk0", "\u001a`]1e6BRb\bzmul\u00163;", "5dc$X)&S'\rv`,l\u00163", "u(;.a+K]\u001d}Dg,\fR\u001fr\u0004}", "\nrTA \u0006\u0017", "5dc$X)/W\u0019\u0011jk3", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n];X*M", "", "1n];X*MB#pz[\u001d\u0001\tA", "1n]CX9M;\u0019\r\tZ.|w9O|-{>\u0010", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", ";db@T.>", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%c@\u000f%\u0013Ioc", "2dbAe6R", "6`]1_,\u001aQ\u001f\b\u0005p3|\b1eg(\nN|\u0019\u0017", "8r^;@,La\u0015\u0001z", ">nbA@,La\u0015\u0001z", "@t]", "AbW2W<ESv\t\u0004g,z\u00183o\t\u0006~@~\u001d", "Ad]14*D\\#\u0011\u0002^+~\t\u0017e\u000e6wB\u0001", ";rV\u0016W", "Ad]1@,La\u0015\u0001z", ";db@T.>B-\nz", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40|hoG\u0003e,=\u000b2G\"", "2`c.", "%dQ\u001aX:LO\u001b~XZ3\u0004e+c\u0006\u000bwI\u007f\u001e\u0017T", "%dQ\u001aX:LO\u001b~eh9\fz<a\u000b3{M", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class WebViewConnection implements Runnable, Destroyable {
    private final WebMessageCallBackHandler callbackHandler;
    private final Handler handler;
    private final HybridDataHandler hybridDataHandler;
    private final int scheduleConnectInterval;
    private final Utils utils;
    private final WebMessagePortWrapper webMessagePortWrapper;
    private final WeakReference<WebView> webView;
    private String webViewUrl;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLш|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0LeV.ZS0\u000fs{J$cҕyCQU\"}(\nUȦi}ñzZ9BO\u001d&\u0001x,aY'^b\u000f`D\u007fCAP\b=gdҽ:\u0005.7j>\b\u000b\u0019\u001aXOVvCYY\u0014*0nwjV\u001bV\u001d\u001a@\u0010n$\u000f)tg|B\u000f\u0001&@=0\u001bipUm_x\u0001[\u001b^TU\u0014Gm,.X7c\u0019{و\u0005\u07baV[Gš\u0010\u0002K\u0005\u0001+U,\u001as\u00068/ß\u0016Ʀ/O\u0015ƞğ*k"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40rrjB\u0007a;R\u00010\u0006>N)DR\u0001K\u0010\u0014ZkJ2\u0014aU?*Q@@\u001e\u000f,VW", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%c@\u000f%\u0013IoxF\u00044sK}\u001d\u001fm$<IE;I0%\u001ce]7\r9", "EdQ\u001aX:LO\u001b~eh9\fz<a\u000b3{M", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40rrjB\u0007a;R\u00010\u0006>N)DR\u0001K\u0010\u0014ZxX8\u001cvf=/yDDt", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40rrjB\u0007a;R\u00010\u001d", "9dT=43Bd\u0019m~f,\n", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_\u0014MCFG;\"&hP=\u000fc9$", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004iIm\u0013w?C8\\8\u001e'FkB\u0010c*]z1P\"5*fZ<:\u0018\u001cX\n])\u0010NWH(nMFh\u00045H\u000fEl\u007fU$\r;4\u0003BSY9y\u0012fE)z$ch\u0003G?Tf4mJQ\u001dY\":2\"m\u001b\u001bSZ;\u0019m`\r}]yt=.\u0017\u0005@m;qeDA~S?>%&O{\u0001!{T}*\u00027\b3sDc\u000b\u0015y\u0018;(^\u0015,g\u001d.*G<\u0002CSc\u0003B\u0002~", "6`]1F/:Y\u0019lzm<\b", "", "=m<2f::U\u0019", ">naA", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%c@\u000f%\u0013IoxF\u00044\u000b", ";db@T.>", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%c@\u000f%\u0013Ioc", "Ad]1F<I^#\f\nl\bz\u000f\u0017e}+wI\u0005%\u001f", "As^=G0FS&", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public final class WebMessageCallBackHandler extends WebMessagePort.WebMessageCallback {
        private final KeepAliveTimer keepAliveTimer;
        final /* synthetic */ WebViewConnection this$0;
        private final WebMessagePortWrapper webMessagePortWrapper;

        public WebMessageCallBackHandler(WebViewConnection webViewConnection, WebMessagePortWrapper webMessagePortWrapper, KeepAliveTimer keepAliveTimer) throws UnsupportedAPIException {
            Intrinsics.checkNotNullParameter(webMessagePortWrapper, "webMessagePortWrapper");
            Intrinsics.checkNotNullParameter(keepAliveTimer, "keepAliveTimer");
            this.this$0 = webViewConnection;
            this.webMessagePortWrapper = webMessagePortWrapper;
            this.keepAliveTimer = keepAliveTimer;
            if (!webViewConnection.utils.isVersionGreaterOrEqualTo(23)) {
                throw new UnsupportedAPIException("WebMessageCallBackHandler Requires API level 23 and above");
            }
        }

        private final void handShakeSetup() {
            String url;
            this.webMessagePortWrapper.setConnected(true);
            WebViewConnection webViewConnection = this.this$0;
            WebView webView = (WebView) webViewConnection.webView.get();
            if (webView == null || (url = webView.getUrl()) == null) {
                url = "";
            }
            webViewConnection.webViewUrl = url;
            KeepAliveTimer.scheduleReconnect$default(this.keepAliveTimer, false, 1, null);
            Log.Companion.getLogger().info("Connection with webView established successfully");
        }

        private final void sendSupportsAckMechanism() {
            this.this$0.sendMessage(WebViewMessageType.IS_CHANNEL_SUPPORTS_ACK_MESSAGE_LOGIC, "true");
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort port, WebMessage message) {
            Intrinsics.checkNotNullParameter(port, "port");
            Intrinsics.checkNotNullParameter(message, "message");
            WebView webView = (WebView) this.this$0.webView.get();
            if (webView == null || !webView.isAttachedToWindow()) {
                Log.Companion.getLogger().debug("WebView is detached");
                return;
            }
            super.onMessage(port, message);
            Log.Companion.getLogger().debug("Data received from slave: " + message.getData());
            String data = message.getData();
            Intrinsics.checkNotNullExpressionValue(data, "message.data");
            if (StringsKt.contains$default((CharSequence) data, (CharSequence) "SlaveHandShake", false, 2, (Object) null)) {
                handShakeSetup();
                sendSupportsAckMechanism();
                return;
            }
            String data2 = message.getData();
            Intrinsics.checkNotNullExpressionValue(data2, "message.data");
            if (StringsKt.contains$default((CharSequence) data2, (CharSequence) "slaveAlive", false, 2, (Object) null)) {
                this.keepAliveTimer.reset();
                return;
            }
            try {
                String data3 = message.getData();
                Intrinsics.checkNotNullExpressionValue(data3, "message.data");
                if (StringsKt.contains$default((CharSequence) data3, (CharSequence) "flushData", false, 2, (Object) null)) {
                    return;
                }
                String data4 = message.getData();
                Intrinsics.checkNotNullExpressionValue(data4, "message.data");
                if (StringsKt.contains$default((CharSequence) data4, (CharSequence) "onbeforeunload", false, 2, (Object) null)) {
                    return;
                }
                JSONObject jSONObjectConvertMessageToObject = this.this$0.convertMessageToObject(message);
                this.this$0.handleAcknowledgeMessage(jSONObjectConvertMessageToObject);
                HybridDataHandler hybridDataHandler = this.this$0.hybridDataHandler;
                WebView webView2 = (WebView) this.this$0.webView.get();
                String string = jSONObjectConvertMessageToObject.getString("msgType");
                Intrinsics.checkNotNullExpressionValue(string, "jsonMessage.getString(\"msgType\")");
                String string2 = jSONObjectConvertMessageToObject.getString("data");
                Intrinsics.checkNotNullExpressionValue(string2, "jsonMessage.getString(\"data\")");
                hybridDataHandler.handleDataFromWeb(webView2, string, string2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }

        public final void stopTimer() {
            this.keepAliveTimer.stop();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146B\u0005%4\u0012\u000e\u0007nj?4LeV.ZS0\u0011s{B0c$wECU0}*\teNo˧tЂ\\!¼?\u0006Dw+/֒Yxk\u0012W6P}W3{~\u0006=n\u0005N\u0005NAj<\b\u0016\u0019\u001aXWX\u0005\tUc\f@?pvHe%O\u001b\u0019@\u001a\u0007,\u000f3tg|ExpkPG#1k\u000b`5vH|{\u001cv^5%\u000fg4*nP\u0006\u0015SmS\u001f`\\W\u0003ms\u0014ݢtҊ+7Q֕o8^\u0003\"\u0019KQ\u0013b\u0001,-\u001f_g$)AN\u0012S'ʲ4Þ~\b\u0015ɝ\u001c\u0010\f0V8M\u001cl\u0013\u001c?E\u0001aMh\u0004tA.\u00038ت#Ӿ\u000433ݍӾjl"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40rrjB\u0007a;R\u00010\u0006>N)DR\u0001K\u0010\u0014ZxX8\u001cvf=/yDDt", "", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004iIm\u0013w?C8\\8\u001e'FkB\u0010c*]z1P\"\u0012\u001d", "1n];X*MW#\bhm(\f\u0019=", "", "5dc\u0010b5GS\u0017\u000e~h5j\u0018+t\u00106", "u(I", "Adc\u0010b5GS\u0017\u000e~h5j\u0018+t\u00106", "uY\u0018#", "AkPCX\u0017Ha(fzl:x\u000b/P\n5\u000b", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%c@\u000f%\u0013IoxF\u00044\u000b", "5dc _(OS\u0004\t\tm\u0014|\u0017=a\u0002(fJ\u000e&", "u(;.a+K]\u001d}Dp,y\u000f3tI\u001a{=h\u0017%Uk\u0010<a/BhS", "Adc _(OS\u0004\t\tm\u0014|\u0017=a\u0002(fJ\u000e&", "uKP;W9HW\u0018H\r^)\u0003\r>/q(x(\u0001%%Cq\u000e'\u00012D/A\u0011", "EdQ#\\,P;\u0019\r\tZ.|s9r\u000f", "1qT.g,0S\u0016fzl:x\u000b/C\u0003$\u0005I\u0001\u001e", "", "2dbAe6R", "2dbAe6R3,\u0003\tm0\u0006\u000b\rh{1\u0005@\bz\u0018#\u0001\n@}!2`}", ">nbA@,La\u0015\u0001z", ";db@T.>", "", "Adc\u0010b5GS\u0017\u000ez]", "1n];X*MS\u0018", "Adc$X)&S'\rv`,Z\u00056l|$yFc\u0013 Fv\u000eI", "EdQ\u001aX:LO\u001b~XZ3\u0004\u0006+c\u0006\u000bwI\u007f\u001e\u0017T", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40rrjB\u0007a;R\u00010\u0006>N)DR\u0001K\u0010\u0014ZkJ2\u0014aU?*Q@@\u001e\u000f,VW", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40rrjB\u0007a;R\u00010\u001d", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public final class WebMessagePortWrapper {
        private boolean connectionStatus;
        private WebMessagePort slavePostMessagePort;
        private WebMessagePort webViewMessagePort;

        public WebMessagePortWrapper() throws UnsupportedAPIException {
            if (!WebViewConnection.this.utils.isVersionGreaterOrEqualTo(23)) {
                throw new UnsupportedAPIException("WebMessagePortWrapper Requires API level 23 and above");
            }
        }

        public final void createWebMessageChannel() {
            WebMessagePort[] webMessagePortArrCreateWebMessageChannel;
            WebView webView = (WebView) WebViewConnection.this.webView.get();
            if (webView == null || (webMessagePortArrCreateWebMessageChannel = webView.createWebMessageChannel()) == null) {
                throw new WebviewException("Unable to create web message channel. WebView instance is unavailable");
            }
            this.webViewMessagePort = webMessagePortArrCreateWebMessageChannel[0];
            this.slavePostMessagePort = webMessagePortArrCreateWebMessageChannel[1];
        }

        public final void destroy() {
            try {
                WebMessagePort webMessagePort = this.webViewMessagePort;
                if (webMessagePort != null) {
                    webMessagePort.setWebMessageCallback(null);
                }
                WebMessagePort webMessagePort2 = this.webViewMessagePort;
                if (webMessagePort2 != null) {
                    webMessagePort2.close();
                }
            } catch (Exception e2) {
                Log.Companion.getLogger().debug("An error occurred while destroying the message port.", e2);
            }
        }

        public final void destroyExistingChannelIfAvailable() {
            destroy();
        }

        public final boolean getConnectionStatus() {
            return this.connectionStatus;
        }

        public final WebMessagePort getSlavePostMessagePort() {
            return this.slavePostMessagePort;
        }

        public final void postMessage(String str) {
            WebMessagePort webMessagePort = this.webViewMessagePort;
            if (webMessagePort != null) {
                webMessagePort.postMessage(new WebMessage(str));
            }
        }

        public final void setConnected(boolean z2) {
            this.connectionStatus = z2;
        }

        public final void setConnectionStatus(boolean z2) {
            this.connectionStatus = z2;
        }

        public final void setSlavePostMessagePort(WebMessagePort webMessagePort) {
            this.slavePostMessagePort = webMessagePort;
        }

        public final void setWebMessageCallbackHandler(WebMessageCallBackHandler webMessageCallBackHandler) {
            WebMessagePort webMessagePort = this.webViewMessagePort;
            Intrinsics.checkNotNull(webMessagePort);
            webMessagePort.setWebMessageCallback(webMessageCallBackHandler);
        }
    }

    public WebViewConnection(HybridDataHandler hybridDataHandler, WeakReference<WebView> webView, Handler handler, Utils utils, String str, int i2, int i3) throws UnsupportedAPIException {
        Intrinsics.checkNotNullParameter(hybridDataHandler, "hybridDataHandler");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(utils, "utils");
        this.hybridDataHandler = hybridDataHandler;
        this.webView = webView;
        this.handler = handler;
        this.utils = utils;
        this.scheduleConnectInterval = i2;
        this.webViewUrl = str;
        if (!utils.isVersionGreaterOrEqualTo(23)) {
            throw new UnsupportedAPIException("WebViewConnection Requires API level 23 and above");
        }
        WebMessagePortWrapper webMessagePortWrapper = new WebMessagePortWrapper();
        this.webMessagePortWrapper = webMessagePortWrapper;
        this.callbackHandler = new WebMessageCallBackHandler(this, webMessagePortWrapper, new KeepAliveTimer(this, handler, webMessagePortWrapper, new Timer(), i3));
    }

    private final void connectToWebView() {
        WebView webView = this.webView.get();
        if (webView == null || webView.getUrl() == null) {
            return;
        }
        this.webMessagePortWrapper.destroyExistingChannelIfAvailable();
        this.webMessagePortWrapper.createWebMessageChannel();
        this.webMessagePortWrapper.setWebMessageCallbackHandler(this.callbackHandler);
        webView.postWebMessage(new WebMessage("CDHandShake", new WebMessagePort[]{this.webMessagePortWrapper.getSlavePostMessagePort()}), getWebMessageUri());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject convertMessageToObject(WebMessage webMessage) {
        try {
            return new JSONObject(webMessage.getData());
        } catch (JSONException e2) {
            e2.printStackTrace();
            return new JSONObject();
        }
    }

    private final Uri getWebMessageUri() {
        Uri uri;
        String str;
        WebView webView = this.webView.get();
        String url = webView != null ? webView.getUrl() : null;
        if (this.utils.isVersionGreaterOrEqualTo(24)) {
            uri = Uri.parse(ProxyConfig.MATCH_ALL_SCHEMES);
            str = "parse(\"*\")";
        } else {
            uri = Uri.parse(url);
            str = "parse(currentWebViewUrl)";
        }
        Intrinsics.checkNotNullExpressionValue(uri, str);
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAcknowledgeMessage(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("msgType") && jSONObject.has("msgId")) {
            String string = jSONObject.getString("msgId");
            Intrinsics.checkNotNullExpressionValue(string, "jsonMessage.getString(\"msgId\")");
            sendAcknowledgeMessage(string);
        }
    }

    private final void postMessage(String str) {
        try {
            this.webMessagePortWrapper.postMessage(str);
        } catch (IllegalStateException e2) {
            Log.Companion.getLogger().error("Failed to communicate with webView, port is closed - " + e2.getMessage());
        }
    }

    private final void scheduleConnectionCheck() throws Throwable {
        if (this.webMessagePortWrapper.getConnectionStatus()) {
            return;
        }
        Handler handler = this.handler;
        long j2 = this.scheduleConnectInterval;
        Class<?> cls = Class.forName(C1561oA.Kd("\t\u0017\u000e\u001d\u001b\u0016\u0012\\\u001f$_z\u0015#\u001a#\u001d+", (short) (FB.Xd() ^ 5099)));
        Class<?>[] clsArr = {Class.forName(Wg.Zd("\t\u007fS|\bH{G~E$\u0006=;p0xq", (short) (Od.Xd() ^ (-31382)), (short) (Od.Xd() ^ (-22419)))), Long.TYPE};
        Object[] objArr = {this, Long.valueOf(j2)};
        Method method = cls.getMethod(C1561oA.Xd("RRWY*LTJcPP", (short) (C1607wl.Xd() ^ 8481)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void connect() {
        String url;
        try {
            Log logger = Log.Companion.getLogger();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            WebView webView = this.webView.get();
            if (webView == null || (url = webView.getUrl()) == null) {
                url = "";
            }
            String str = String.format("WebViewConnection starts pinging to %s", Arrays.copyOf(new Object[]{url}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            logger.debug(str);
            connectToWebView();
            scheduleConnectionCheck();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        this.handler.removeCallbacks(this);
        this.callbackHandler.stopTimer();
        this.webMessagePortWrapper.destroy();
    }

    public final String getWebViewUrl() {
        return this.webViewUrl;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.webMessagePortWrapper.getConnectionStatus()) {
                return;
            }
            connectToWebView();
            scheduleConnectionCheck();
        } catch (IllegalStateException e2) {
            Log.Companion.getLogger().error("Port is already used" + e2);
        } catch (Throwable th) {
            Log.Companion companion = Log.Companion;
            companion.getLogger().debug("webView connection exception" + th);
            companion.getLogger().error(th);
        }
    }

    public final void sendAcknowledgeMessage(String msgId) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("{ \"msgType\": \"%s\", \"msgId\": %s}", Arrays.copyOf(new Object[]{WebViewMessageType.CHANNEL_MESSAGE_ID_ACK, msgId}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        postMessage(str);
    }

    public final void sendMessage(WebViewMessageType webViewMessageType, String str) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("{ \"msgType\": \"%s\", \"data\": %s}", Arrays.copyOf(new Object[]{webViewMessageType, str}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        postMessage(str2);
    }
}
