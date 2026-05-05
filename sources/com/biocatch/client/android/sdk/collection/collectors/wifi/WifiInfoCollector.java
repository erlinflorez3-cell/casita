package com.biocatch.client.android.sdk.collection.collectors.wifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector;
import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.core.ApplicationCache;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import com.biocatch.client.android.sdk.core.hash.HashService;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.hg;

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
@Metadata(bv = {}, d1 = {"Яć\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u001dfrˎ8D{H6ɟ[*%k\u0004é,[:qKП]\u001a\u0014\"\u0011OTgon`Z\u0013C\u0015\u0007\u001ex\u0001,QU~^\u001a\u000fHBwЀ;M}IA`z8\r @+@ц\r\u00010*PƵ~zYK\u0014۵8@~@Z҈U\u00050\u0012\u000ē(\u0001,\\oN<It]P/+\u0003oMTϋuܞ\u001b\u0004=Ld)\u001dv\u0010\u001eY?o6K\\\fC>b_M\u0004Wqk\u0007x+5.as\u0006:h\u0004\"\u001aCO;c\u0003*j\fi`:/;SqTh\u000eV\u0002\u000b\u0004\u0013<\u0012\u0019\u001e)^-[&Ǵ\f\u000eA\u0002;aNw\u001a^p(+eD =\u007fa5\u007f//[od1Re\u001eU\rLŀGnikb8x\u00171S&jaUNh`N8\u0006\u0004nLvp/B\u0004^oF/D\u001f<4=7\nWS%y0`D\u0016#K`1aw\u0002`@P\rF;87$Zr\u0011Kk\u0019bf\\)MJ|7\u0002\u0016A8\\&hg%XT]\u001a\u0002j{\u0006P&wlE\f\u0007k<\u007f\u007fr{;_\u0017(a\u0001\u001fZ?\u0005h\u0013\r~B\u00024!pp(@}\u0003\u0010&$\u000bO\\\u001f@@\n\u001cb.\bǌ^ČL\u0003&Փ\u0012\u000f\u0017mrh>\u000e\u000b\bz҇k˨x\r\u0019Rb\u0001}xI[:\u000fx\"[T\b\noĶWɋl8\u0015%\r\u0013\u0002\u0015\u0018uZ]dn,t\u0004\u0013vډ&\u07fcU/EП_\r7J\u001a/[K!~(˪\u001eؠ~|\u0002Ҹ\ft<j j\u001f07ʇLׅX\u0017*Ԯ/\u00051\"|\u007f(z|O\u001eϡVߏ_Bat\ttJj\t\t\u0013&6%/wxğ7ԩG'%ȶH =2y]\u0018\u000e\u0005ӣnϪ*tmֽ|o$\u000fzQ\fR\u0012Ͳu˕\u0003>*غ=\u0011PS\u0003y\u001eA7@cΌJыhp^Е\u001e\u001d=\u001f~\rB\f\u001fx,:ÅTұ:ʡ.sK͟djQH)M\u0002\fDޱWů\u000fJ\u0017Ϙ[\b?s*\u001ck&-̳dס4\u0006{̸\u0007MI\b\u001d<7J\u000bɹhޭ\u000fC\\ȫћ\u00144"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011^R-`\u001cdA\u0015\u0016>\u0017O5j\u000f`H$lSA,]", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011^R-`\u001cdA\u0015\u0016>\u0017O5t\u000fXA+D", "/o_9\\*:b\u001d\t\u0004<(z\f/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w)NFr8\u001c\u0011weC\u0010A(Ly'\u001d", "4h[AX9", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&wKv\u001d<\u0004z", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "6`b5F,Kd\u001d|z", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wP?In}\u0001\u0011vd'\u0007p=Rt'\u001d", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "<dcDb9D@\u0019\u000b\u000b^:\fe?i\u0007'{M", "\u001a`]1e6BRb\bzmue\t>w\n5\u0002-\u0001#'G}\u001dzS59`| DC", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017\u001fFv;\"\u0013dp=\u0011l\nJt*G\"5(eQ\u007fG\u0018\u0011$\fX4\u001c\u0005bPmRMF\u001f\u0011;*\u0006Bw\u0001\u0019kt3tx\fS\u0014Qw\u0011\u0005?,2Bb^\u0007QED,(n\u0014g'eH9*]o#(h\u001a\u001e\u0019\u007fZ\u001fH9wqo\u0011\u0016~B\":|YI\u000fm\\@t0.\u0015w\u0001\u0011?bx*>;\u0003:s4n\u0012K1\u001b:l{^\u000fXO*\u00146I$CIcKS<\u0018ph^\f\u0018`1@\u0017h/_Q\u000e\u0014g\u001bZ~_i\t?\\\u000fLHu^%P\bC_{%\u0016\u00033qoR\rx^\n\u001btF2l\r\u0012\u0007p!\t.!Gg\u0013w4lK#y\u0005q7\u0019\u0006]B^yH\u001f74rjiy1<e\u0011U13YK5/Ss\u0017\u00154\u000e`B\u000e", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "1n];X*MW*\u0003\nr\u0014x\u0012+g\u007f5", "\u001a`]1e6BRb\bzmuZ\u00138n\u007f&\u000bD\u0012\u001b&[W\nEr'5fS", "1ta?X5M0'\r~]", "", "4qX2a+Eg\u0002z\u0003^", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "7rF6Y0\u001c]\"\bz\\;|\b", "", "<dcDb9D1\u0015\u0006\u0002[(z\u000f", "\u001a`]1e6BRb\bzmuZ\u00138n\u007f&\u000bD\u0012\u001b&[W\nEr'5f<\t7|(8ZI\u0019g;%\u0012d_?\\", "@dR2\\=>`", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011^R-`\u001cdA\u0015\u0016>\u0017O5j\u000f`H$lSA,F\u001eM\u0003?V\u0010\b%\u000e\u0013mlKX\u00104y\u0013uE:hS/", "ArX1G9N\\\u0017z\nb6\u0006o/n\u00027~", "", "EhU6@(GO\u001b~\b", "\u001a`]1e6BRb\bzmu\u000f\r0iI\u001a\u007fA\u0005~\u0013Pk\u0010<\u0004z", "1n]3\\.N`\u0019", "", "1qT.g,+S\u0017~~o,\n", "5dc\u0016c", "EhU6<5?]", "\u001a`]1e6BRb\bzmu\u000f\r0iI\u001a\u007fA\u0005z Hyc", "7mXAJ0?W\u0007~\bo0z\t", "1n];X*MW#\b^g-\u0007", "<dcDb9D>\u0015\fvf:Z\f+n\u0002(z", "=mF6Y0'S(\u0011\u0005k2Z\f+n\u0002(z", "@dV6f;>`\b\tc^;\u000f\u0013<k]$\u0003G}\u0013\u0015M", "AsP?g", "AsP?g\u001eBT\u001dlzk=\u0001\u0007/", "As^=", "Cma2Z0Lb\u0019\fc^;\u000f\u0013<k]$\u0003G}\u0013\u0015M", "\u0011n\\=T5B]\"", "\u001cdcDb9D1\u0015\u0006\u0002[(z\u000f\ra\u000b$xD\b\u001b&Ko\u001c\u001ay!>[}", "%hU6F;:b\u0019\\}Z5~\t\u001ce}(\u007fQ\u0001$", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class WifiInfoCollector extends ContinuousCollector<WifiInfoModel> {
    public static final Companion Companion = new Companion(null);
    public static final String INVALID_BSSID = "00:00:00:00:00:00";
    private final ApplicationCache applicationCache;
    private ConnectivityManager connectivityManager;
    private String currentBssid;
    private final IntentFilter filter;
    private final HashService hashService;
    private boolean isWifiConnected;
    private ConnectivityManager.NetworkCallback networkCallback;
    private final NetworkRequest.Builder networkRequestBuilder;
    private WifiStateChangeReceiver receiver;
    private int ssidTruncationLength;
    private final Utils utils;
    private WifiManager wifiManager;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011^R-`\u001cdA\u0015\u0016>\u0017O5j\u000f`H$lSA,F\nS\nFd\n\u0010 \u0017\u000b", "", "u(E", "\u0017ME\u000e?\u0010\u001dMulhB\u000b", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜N\u0094Tiճ?k*3d^ҸuCIUb\u00140\ngN\u0016i\u001fNh\u000e[\u000f4\u001a)n:Nmx\f\u0018UFԸsF"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011^R-`\u001cdA\u0015\u0016>\u0017O5j\u000f`H$lSA,F\u0015I\u0011Mr\u000e\u0012s\n<qm>T\u0016%u q>-oJhcyU\u001fH^3f\f5", "\u001a`]1e6BRb\bzmuZ\u00138n\u007f&\u000bD\u0012\u001b&[W\nEr'5f<\t7|(8ZI\u0019g;%\u0012d_?\\", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016`0]V</\u0018\u0013^qW,\u0017bcH+nBF)\u0015\u0002\rr", "=m2.c(;W \u0003\nb,\u000bf2a\t*{?", "", "<dcDb9D", "\u001a`]1e6BRb\bzmue\t>w\n5\u0002\u0016", "<dcDb9D1\u0015\nv[0\u0004\r>i\u007f6", "\u001a`]1e6BRb\bzmue\t>w\n5\u0002\u001e|\"\u0013Ds\u0015@\u0006)5gS", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public final class NetworkCallbackCapabilitiesChange extends ConnectivityManager.NetworkCallback {
        public NetworkCallbackCapabilitiesChange() {
            super(1);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
            super.onCapabilitiesChanged(network, networkCapabilities);
            TransportInfo transportInfo = networkCapabilities.getTransportInfo();
            WifiInfoCollector.this.isWifiConnected = networkCapabilities.hasTransport(1);
            if (transportInfo instanceof WifiInfo) {
                WifiInfoCollector.this.onWifiNetworkChanged((WifiInfo) transportInfo);
            } else {
                Log.Companion.getLogger().error("Failed collecting WIFI Info due to TransportInfo not received properly, transportInfo is " + (transportInfo != null ? transportInfo.getClass().getName() : null));
            }
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜N\u0093Tiճ?k*3d^ҸuCIUb\u00140\ngN\u0016i\u001fNh\u000e[\u000f4\u001a)n:Nmx\f\u0018UFԸsF"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011^R-`\u001cdA\u0015\u0016>\u0017O5j\u000f`H$lSA,F\u001eM\u0003?V\u0010\b%\u000e\u0013mlKX\u00104y\u0013uE:hS/", "\u001a`]1e6BRb|\u0005g;|\u0012>/\\5\u0006<\u007f\u0015\u0013U~z<t%9j}-\r", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016`0]V</\u0018\u0013^qW,\u0017bcH+nBF)\u0015\u0002\rr", "=mA2V,Bd\u0019", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7mc2a;", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public final class WifiStateChangeReceiver extends BroadcastReceiver {
        public WifiStateChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (Intrinsics.areEqual("android.net.wifi.STATE_CHANGE", intent.getAction())) {
                try {
                    WifiManager wifiManager = WifiInfoCollector.this.wifiManager;
                    if (wifiManager == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("wifiManager");
                        wifiManager = null;
                    }
                    WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                    if (connectionInfo == null) {
                        Log.Companion.getLogger().error("Failed collecting WIFI Info wifiManager.connectionInfo is null");
                    } else {
                        WifiInfoCollector.this.onWifiNetworkChanged(connectionInfo);
                    }
                } catch (Exception e2) {
                    Log.Companion.getLogger().error("Failed collecting WIFI Info", e2);
                }
            }
        }
    }

    public WifiInfoCollector(ApplicationCache applicationCache, IntentFilter filter, Utils utils, HashService hashService, ConfigurationRepository configurationRepository, NetworkRequest.Builder builder) {
        Intrinsics.checkNotNullParameter(applicationCache, "applicationCache");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(hashService, "hashService");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.applicationCache = applicationCache;
        this.filter = filter;
        this.utils = utils;
        this.hashService = hashService;
        this.networkRequestBuilder = builder;
        this.ssidTruncationLength = configurationRepository.getInt(ConfigurationFields.ssidTruncationLength);
    }

    public /* synthetic */ WifiInfoCollector(ApplicationCache applicationCache, IntentFilter intentFilter, Utils utils, HashService hashService, ConfigurationRepository configurationRepository, NetworkRequest.Builder builder, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(applicationCache, intentFilter, utils, hashService, configurationRepository, (i2 + 32) - (i2 | 32) != 0 ? null : builder);
    }

    private final WifiStateChangeReceiver createReceiver() {
        return new WifiStateChangeReceiver();
    }

    private final String getIp(WifiInfo wifiInfo) {
        List<LinkAddress> linkAddresses;
        Object next;
        InetAddress address;
        String hostAddress;
        if (!this.utils.isVersionGreaterOrEqualTo(31)) {
            return this.utils.ipToString(wifiInfo.getIpAddress());
        }
        ConnectivityManager connectivityManager = this.connectivityManager;
        if (connectivityManager == null) {
            return null;
        }
        LinkProperties linkProperties = connectivityManager.getLinkProperties(connectivityManager != null ? connectivityManager.getActiveNetwork() : null);
        if (linkProperties == null || (linkAddresses = linkProperties.getLinkAddresses()) == null) {
            return null;
        }
        Iterator<T> it = linkAddresses.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            InetAddress address2 = ((LinkAddress) next).getAddress();
            boolean zContains$default = false;
            if (address2 != null && (hostAddress = address2.getHostAddress()) != null) {
                Intrinsics.checkNotNullExpressionValue(hostAddress, "hostAddress");
                zContains$default = StringsKt.contains$default((CharSequence) hostAddress, (CharSequence) ".", false, 2, (Object) null);
            }
            if (zContains$default) {
                break;
            }
        }
        LinkAddress linkAddress = (LinkAddress) next;
        if (linkAddress == null || (address = linkAddress.getAddress()) == null) {
            return null;
        }
        return address.getHostAddress();
    }

    private final void initWifiService() throws Throwable {
        if (this.utils.isVersionGreaterOrEqualTo(31)) {
            Context applicationContext = this.applicationCache.get().getApplicationContext();
            Object[] objArr = {ConnectivityManager.class};
            Method method = Class.forName(C1593ug.zd("`netrmi4jww~pz\u0002<R\u007f\u007f\u0007x\r\n", (short) (C1499aX.Xd() ^ (-24080)), (short) (C1499aX.Xd() ^ (-24176)))).getMethod(C1561oA.Kd("]\\lLsnpbkResxlgj", (short) (C1607wl.Xd() ^ 9027)), Class.forName(C1561oA.od("rh|f2ocog-Ai]nm", (short) (FB.Xd() ^ 29681))));
            try {
                method.setAccessible(true);
                this.connectivityManager = (ConnectivityManager) method.invoke(applicationContext, objArr);
                this.networkCallback = new NetworkCallbackCapabilitiesChange();
                return;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Context applicationContext2 = this.applicationCache.get().getApplicationContext();
        short sXd = (short) (C1580rY.Xd() ^ (-8228));
        short sXd2 = (short) (C1580rY.Xd() ^ (-29639));
        int[] iArr = new int["Q[^)".length()];
        QB qb = new QB("Q[^)");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr2 = {new String(iArr, 0, i2)};
        Method method2 = Class.forName(C1561oA.Xd("\u001c*!0.)%o&33:,6=w\u000e;;B4HE", (short) (C1580rY.Xd() ^ (-13174)))).getMethod(Qg.kd("41?\u001dB;;+2\u0017(47)\"#", (short) (FB.Xd() ^ 19819), (short) (FB.Xd() ^ 27603)), Class.forName(Wg.vd("aYo[!`Vdf.Tvmeke", (short) (C1633zX.Xd() ^ (-6720)))));
        try {
            method2.setAccessible(true);
            Object objInvoke = method2.invoke(applicationContext2, objArr2);
            Intrinsics.checkNotNull(objInvoke, hg.Vd("\u001e$\u001a\u0019K\u000e\u000b\u0017\u0016\u0016\u001aD\u0006\bA\u0004\u0001\u0012\u0012<\u0010\n9\u0007\u0007\u0005B\u0003\t~}0\u0004\b}q+kwlyunh1pft-ufbd(Pa]_BUaSXUa", (short) (C1499aX.Xd() ^ (-21890)), (short) (C1499aX.Xd() ^ (-11053))));
            this.wifiManager = (WifiManager) objInvoke;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private final boolean isWifiConnected(WifiInfo wifiInfo) {
        return this.utils.isVersionGreaterOrEqualTo(31) ? this.isWifiConnected : (wifiInfo.getNetworkId() == -1 || wifiInfo.getIpAddress() == 0) ? false : true;
    }

    private final boolean networkParamsChanged(WifiInfo wifiInfo) {
        if (!isWifiConnected(wifiInfo)) {
            Log.Companion.getLogger().debug("wifi is not connected");
            return false;
        }
        String bssid = wifiInfo.getBSSID();
        Log.Companion.getLogger().debug("network bssid=" + bssid);
        return (bssid == null || Intrinsics.areEqual(bssid, INVALID_BSSID) || Intrinsics.areEqual(bssid, this.currentBssid)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWifiNetworkChanged(WifiInfo wifiInfo) {
        try {
            if (networkParamsChanged(wifiInfo)) {
                this.currentBssid = wifiInfo.getBSSID();
                long jCurrentTimeMillis = this.utils.currentTimeMillis();
                long currentEventId = getCurrentEventId();
                HashService hashService = this.hashService;
                String ssid = wifiInfo.getSSID();
                Intrinsics.checkNotNullExpressionValue(ssid, "connectionInfo.ssid");
                addToQueue(new WifiInfoModel(getContextIDCache().get(), currentEventId, jCurrentTimeMillis, hashService.getTruncatedHash(ssid, this.ssidTruncationLength), this.currentBssid, getIp(wifiInfo)));
            }
        } catch (Throwable th) {
            Log.Companion.getLogger().error("An error has occurred while collecting wifi info", th);
        }
    }

    private final void registerToNetworkCallback() {
        NetworkRequest.Builder builderAddTransportType;
        NetworkRequest.Builder builder = this.networkRequestBuilder;
        Unit unit = null;
        ConnectivityManager.NetworkCallback networkCallback = null;
        NetworkRequest networkRequestBuild = (builder == null || (builderAddTransportType = builder.addTransportType(1)) == null) ? null : builderAddTransportType.build();
        if (networkRequestBuild == null) {
            throw new InvalidOperationException("Network Request is not available");
        }
        ConnectivityManager connectivityManager = this.connectivityManager;
        if (connectivityManager != null) {
            ConnectivityManager.NetworkCallback networkCallback2 = this.networkCallback;
            if (networkCallback2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("networkCallback");
            } else {
                networkCallback = networkCallback2;
            }
            connectivityManager.registerNetworkCallback(networkRequestBuild, networkCallback);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            throw new InvalidOperationException("Connectivity manager is not available, not register to network callback");
        }
    }

    private final void startWifiService() {
        if (this.utils.isVersionGreaterOrEqualTo(31)) {
            registerToNetworkCallback();
        } else {
            this.receiver = createReceiver();
            this.applicationCache.get().registerReceiver(this.receiver, this.filter);
        }
    }

    private final void unregisterNetworkCallback() {
        ConnectivityManager connectivityManager = this.connectivityManager;
        if (connectivityManager != null) {
            ConnectivityManager.NetworkCallback networkCallback = this.networkCallback;
            if (networkCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("networkCallback");
                networkCallback = null;
            }
            connectivityManager.unregisterNetworkCallback(networkCallback);
        }
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public synchronized void configure(ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        super.configure(configurationRepository);
        this.ssidTruncationLength = configurationRepository.getInt(ConfigurationFields.ssidTruncationLength);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.WifiInfo;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isWifiInfoEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "wifiInfo";
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() throws Throwable {
        if (isStarted()) {
            Log.Companion.getLogger().error("Wifi Info collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Wifi Info collector is already started. Aborting the start operation.");
        }
        initWifiService();
        startWifiService();
        setStarted(true);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        WifiStateChangeReceiver wifiStateChangeReceiver = this.receiver;
        if (wifiStateChangeReceiver != null) {
            this.applicationCache.get().unregisterReceiver(wifiStateChangeReceiver);
            this.receiver = null;
        }
        unregisterNetworkCallback();
        setStarted(false);
    }
}
