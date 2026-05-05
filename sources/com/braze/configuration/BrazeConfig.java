package com.braze.configuration;

import androidx.compose.ui.layout.LayoutKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DeviceKey;
import com.braze.enums.LocationProviderName;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import java.util.EnumSet;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u001e\u007fјnjG9LeN/ZS8\u0015s{:$c$\bCCU0}*\tUOog\u0005Jb\u000bI\u0011\u000e\u0016\u000fj4I[\u0012e\u0012%2JoE<StSʠ\u0011td\u0004X1_x\u0007\u000b\u0001*.V\u0010\u000fzqLë\u00160Nr\u0003X\u001b\n\u001d\u001a@\n\u00054Q.jjf8^k\f>e'Y\u074bDĚ+_8ŧ\u001e\u001fTY?\u000f\r`L1v;\f՞'٨\u0007\tZ[M\n\u0010\u0004K\r\u0001)=*wy\u000e:/ä\u0016Ʀ/Q\u0015]\u0001--\u0017_i$)AN\u0012U\u0007\u0012~Ã|ԫ\u0011>\f\u000e\u00142\u0019D;&~\u0010\u001e5\u0005r\u0002Nf\u0001\rO6~8د\u0019Ӿ\u000433ݍkr_aS\u0019|8R˟\u000f̷'\u0001vď,d\u001co-\u001djv\u007f5\bD\u0014ʸP̆]=uՎAr\u0010:\u001c2]~]\u007fG2m®9٦=#)ǽR^Rx\u000f\rpjci\u0001ZV!\u001d#m._ȹ\\ֈh\u0005s¬%j:$e\u001ej\u0006,\u0012I$3ʄ>Ƽ)\u0012VOvt;]k\u001e=1|6\br\"\u0012.\u07b2`ۋ9Qk߄2b\u0005)W>x\u0004\u0007jxWbȟ^͈&2PК`\u000e\nZf\u0014#4OqJKB0GiKLY٤D˩\u0001\tgʳ9\"\rlK&\u0019hRz?\u0005'ʜr״kzQ,\u000bgr=OjM\u001b<TPlj\u0001yȜ\u0001\u0381\u0004Goն\u0018\\z0\u000eW\u0012\u001fD\u001eoU\u0006˓\u0015ä\u0003):Ĉ}WZ\u000e}Sc\u0011U\u00053}e\u0098j\u05cek\nrp:k;\\]p/$\r]!->hVנcâ~IkT\u0019f\u000f[\u0001 q>d7+\u000fU\"{ˢqݕ\u000175C5(f\n\"M-csh\u001e40feնvФ\b.k\u0016}i\"o@ZPKo}l(ZpYܱJܖ{\nJ\tB\u0014\u0004ZO\u0005\tXNL954j]Ե\u000f\u0080Z]B\u0013}\u0005\u0005@mK\fE\u0014\u0013\rI[\u0015$ϑiƽqMd\u000bX\u0016Z\u001d\nS\u0007\u00142<N\\\u000ef_ݽ\b֯\u001c8I;p\f\r\u001b2WD>\u001e\nqZ \nfć\u0002ʮc\u0011\u001f2Pz\fh\u001cx\u0011^lG3f{dwƩ\u0003϶\u00135&xC8U\u007fTyGeH\u007f\u0002#?\u001fAʲ\u0001ݝ)-LTG\"xj\u000f1]_YH0<:K\u007fԞmƴ\u0010: |+Ih-Gx)a\r/\r\u0011\fh%ЎxՆjTV\"7\u0006K\u000f\u001cd\"\u0011!\u0018}x&f\u0004ٓPߺ;E\"\u0001%Ky\u0019\u001a&{H1,4;cA ݥ\u0016ր\u007fY[;\f\u000fp25.\r#rV<l@aqŵ\u0018ޭ\u001ad\n\t!Wp\u0016<u\rt -6<\u0006\u0006\nĀ\u0015Ȩ]m\u007f!N.{~\u0014ncj\u000f\t\u0012r\u001ar,̋\u0005Ђ5X\u0002n;Wm\u001b5zF\u0015nYh\u0017\n$/Ӂ\u0002ȗ\u0019('6\u0016iy\"]\u0012\u0001r\u0002N\n\u0013a3B˓cʘ4T&}-\u0001F\u00168\u0004@\u0017QU{D\u001b\r3ִDŃ\u0012`r(r{\\9\"-\u0017Jt\u0010A8|vtғ1ё\u001d\u001fcƬ\u0018p\u00155]K< _Vu\u001f\u000e׀\rÃ,v\u0019ܛ\u000br\u00032BD\u001fq.\u001bb1\u001d¯?Ն+Y,ݦ5\u00134\u007f]:X\u0007Z\u0015D\u0015\u0006լ:ԯB\\\"ˡ\fcAv1\u0013\u0017\u0014f\u0010&\u000boǂlܱW'2\u0001\u000b\f]Q\bg\u0004<\n6!)e\u0013F߮Yǃ?'=eZ.\\\u0014s\u0002\u0017OyU=gbM\f\u009e ¼YB\b\n-+t\u0018\u0004[\u0018GGGXe\u0013D-أYǋ*,>nR*\u0018|\u0007-\".\u007f\u0017\"h\u0012e\u000bЩ|\u008f\u001dDFϠ}~\u0015\u007fej\u0010\nr\u0017{\u0018\u000eʜ\bԠ7\u0019\u0005\u0010]|\u0011=W.e1r\\j\u0019*\b\u0011ߙc֯}IHY8\rе\u0016\u0013"}, d2 = {"\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;ok", "", "0tX9W,K", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;oT\u000b]GBj4+j", "uKR<`u;`\u0015\u0014z(*\u0007\u00120i\u00028\t<\u0010\u001b!P9jIr:57\b)8q\u0018l*S?r3\u001e\">%*", "/oX\u0018X@", "", "/qT\u000eh;H[\u0015\u000e~\\\u000e|\u00130e\t&{-\u0001#'G}\u001dJV.1V\u0005 6", "", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "/qT\u0014X6?S\"|zl\f\u0006\u0005,l\u007f'", "0`S\u001bX;P]&\u0005^g;|\u0016@a\u0007", "", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "0qPGX\u001a=Y\u0001~\nZ+x\u0018+", "\u001aiPCTuNb\u001d\u0006D>5\r\u0011\u001de\u000f}", "\u001ab^:\")KO.~D^5\r\u0011=/\\5wU\u0001\u0005\u0016MW\u000eKr$1hyu", "1tbAb4\u001e\\\u0018\n\u0005b5\f", "1tbAb4!b!\u0006l^)m\r/w[&\u000bD\u0012\u001b&[M\u00158\u00053\u001eU\u0006 ", "1tbAb4%]\u0017z\nb6\u0006s<o\u0011,z@\u000e\u007f\u0013Oo\u001c", "\u001ab^:\")KO.~D^5\r\u0011=/f2y<\u0010\u001b!PZ\u001bF\b)4Y\u000b\t3u\u0016\u0004", "2dU.h3M<#\u000e~_0z\u0005>i\n1W>~\u0017 VM\u0018C\u00012", "2dU.h3M<#\u000e~_0z\u0005>i\n1YC|  Gvl<\u0005#B]\t/;w\u001f", "2dU.h3M<#\u000e~_0z\u0005>i\n1YC|  Gvv8~%", "2de6V,(P\u001e~xm\b\u0004\u00109w\u0007,\nO", "\u001ab^:\")KO.~D^5\r\u0011=/^(\rD~\u0017|G\u0004c", "2nT@C<LV\u0007\u000e\u0005k@[\r=m\u00046\n*\nt\u001eKm\u0014", "4`[9U(<Yy\u0003\b^)x\u0017/M\u007f6\n<\u0003\u001b I]\u000eI\b)3Y['3{$9IR>", "4ha2U(LSv\u0006\u0005n+d\t=s{*\u007fI\u0003\u0005\u0017Pn\u000eIZ$\u001bY\u0012", "5n^1A,Me#\f\u0001B5\f\t<v{/", "5qT.g\u0015>b+\t\bd\u0010\u0006\u0018/r\u0011$\u0003", "7m0=c\u0014>a'z|^\u001e|\u0006 i\u007f:YG\u0005\u0017 VW\nO`. U\u007f \u0018q\u001f2[F;j&\u001a\u0019wIG", "7r01`\u0014>a'z|b5~u/g\u00046\u000bM|&\u001bQxmEr\"<Y|", "7r2<a;>\\(\\vk+\u000bx8r\u007f$z1\u0005%'CvqEu)3U\r*DM\u001f*JJ;j", "7r32i0<S\u0003{\u007f^*\fd6l\n:\u0003D\u000f&vPk\u000bCv$", "7r5._3;O\u0017\u0005[b9|\u0006+s\u007f\u0010{N\u000f\u0013\u0019Kx\u0010*v2F]{ \u0017v\u0012+TC:", "7r56e,;O'~Xe6\r\b\u0017e\u000e6wB\u0005 \u00194o\u0010@\u00054BU\r$Avu7I@Bk3", "7r56e,;O'~b^:\u000b\u00051i\t*i@\u000e(\u001bEowE_%GH\b&7v\u0003.OGIzA\u001a$lkBfl(K}'F", "7r7A`3\"\\t\n\u0006F,\u000b\u0017+g\u007f\u0004\u0007K\b+\tKx\rF\t\t>g}/EM\u001f*JJ;j", "7r7A`3\"\\t\n\u0006F,\u000b\u0017+g\u007f\u000b\u000bH\b}\u001bPu|8\u0004'5h])3j\u001d.L", "7r8;47I;\u0019\r\tZ.|d-c\u007f6\nD}\u001b\u001eK~\"\u001c\n#<i\f$Hm}8LC\u001bt0\u001b\u001ch`", "7r8;47I;\u0019\r\tZ.|w/s\u000f\u0013\fN\u0004v\u0013Io\u001b\u001bz3@`y4\u0017v\u0012+TC:", "7r;<V(MW#\bXh3\u0004\t-t\u00042\u0005 \n\u0013\u0014No\r", "7r=2j:\u001fS\u0019}kb:\r\u00056I\t'\u007f>|&!TY\u0017", "7r?Bf/\u001dS\u0019\nab5\u0003e+c\u0006\u0016\u000b<~\u001drE~\u0012Mz4I9\u0007\u001c4t\u0016-", "7r?Bf/!b!\u0006g^5{\t<i\t*[I|\u0014\u001eGn", "7r?Bf/0O\u001f~h\\9|\t8F\n5dJ\u0010\u001b\u0018Km\nKz/>9\u0007\u001c4t\u0016-", "7rB1^\bNb\u001c^\u0004Z)\u0004\t.", "7rB2f:B]\"l\nZ9\fe+s\u007f'jD\t\u0017!W~mEr\"<Y|", "7rC<h*A;#}zK,\t\u00193r\u007f'\\J\u000ey&OvqER0@A}.Ei\u0018.[", ":`a4X\u0015Hb\u001d\u007f~\\(\f\r9nc&\u0006I", ">tb57,>^\u007f\u0003\u0004d\tx\u00075S\u000f$yF\\\u0015&K\u0001\u0012K\u000b\u0003<U\f. i\u001e.", "AcZ\u0013_(O]&", "\u001ab^:\")KO.~D^5\r\u0011=/m'\u0002!\b\u0013(Q|c", "AdaCX9-O&\u0001zm", "Adb@\\6GB\u001d\u0007zh<\f", "Ag^B_+(^(b\u0004P/|\u0012\u001au\u000e+WP\u0010\u001a!Ts#<u", "Ag^B_+)`\u0019\u0010zg;`\u0012\u000bp\u000b\u0010{N\u000f\u0013\u0019GN\u0012J\u0002,1m^*DL\u001a/NCHk=-\u0005vaF\u0015", "Ag^B_+.a\u0019p~g+\u0007\u001b\u0010l{*i@~'$GS\u0017\u0018t49j\u0002/;m$", "AlP9_\u0015Hb\u001d\u007f~\\(\f\r9nc&\u0006I", "BqX4Z,K/\u0017\u000e~h5d\r8i\b8\u0004/\u0005\u001f\u0017+x\u001d<\u000461`k 5w\u001f-[", "Eh[9;(GR ~en:\u007fg/e\u000b\u000f\u007fI\u0007%rW~\u0018Dr49Wy'>\u0002", "BnBAe0GU", "\u0010tX9W,K", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BrazeConfig {
    public final String apiKey;
    public final Boolean areAutomaticGeofenceRequestsEnabled;
    public final Boolean areGeofencesEnabled;
    public final Integer badNetworkInterval;
    public final EnumSet<BrazeSdkMetadata> brazeSdkMetadata;
    private final Builder builder;
    public final String customEndpoint;
    public final String customHtmlWebViewActivityClassName;
    public final EnumSet<LocationProviderName> customLocationProviderNames;
    public final Integer defaultNotificationAccentColor;
    public final String defaultNotificationChannelDescription;
    public final String defaultNotificationChannelName;
    public final EnumSet<DeviceKey> deviceObjectAllowlist;
    public final Boolean doesPushStoryDismissOnClick;
    public final String fallbackFirebaseMessagingServiceClasspath;
    public final String firebaseCloudMessagingSenderIdKey;
    public final Integer goodNetworkInterval;
    public final Integer greatNetworkInterval;
    public final Integer inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
    public final Boolean isAdmMessagingRegistrationEnabled;
    public final Boolean isContentCardsUnreadVisualIndicatorEnabled;
    public final Boolean isDeviceObjectAllowlistEnabled;
    public final Boolean isFallbackFirebaseMessagingServiceEnabled;
    public final Boolean isFirebaseCloudMessagingRegistrationEnabled;
    public final Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
    public final Boolean isHtmlInAppMessageApplyWindowInsetsEnabled;
    public final Boolean isHtmlInAppMessageHtmlLinkTargetEnabled;
    public final Boolean isInAppMessageAccessibilityExclusiveModeEnabled;
    public final Boolean isInAppMessageTestPushEagerDisplayEnabled;
    public final Boolean isLocationCollectionEnabled;
    public final Boolean isNewsFeedVisualIndicatorOn;
    public final Boolean isPushDeepLinkBackStackActivityEnabled;
    public final Boolean isPushHtmlRenderingEnabled;
    public final Boolean isPushWakeScreenForNotificationEnabled;
    public final Boolean isSdkAuthEnabled;
    public final Boolean isSessionStartBasedTimeoutEnabled;
    public final Boolean isTouchModeRequiredForHtmlInAppMessages;
    public final String largeNotificationIcon;
    public final String pushDeepLinkBackStackActivityClassName;
    public final SdkFlavor sdkFlavor;
    public final String serverTarget;
    public final Integer sessionTimeout;
    public final Boolean shouldOptInWhenPushAuthorized;
    public final Boolean shouldPreventInAppMessageDisplayForDifferentUsers;
    public final Boolean shouldUseWindowFlagSecureInActivities;
    public final String smallNotificationIcon;
    public final Integer triggerActionMinimumTimeIntervalSeconds;
    public final Boolean willHandlePushDeepLinksAutomatically;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005*4\u0012\u000e\u0007nʑA0RkP.XX2\u000fy\u0005<$a3yCQU\"}8\tWNmgvJp\u000bKƤ\u000e\u0016\u000fj4I[ke\u0012%2JoE\"UoS9ht<<&ݍ(Nц5\u0001H)\t\u0015|\u000fŲO\f 0\u0001Ï<X\r]\r \u0012\u0014?8\u00034[\u0016PFPr]H2;\u0005\u007fA|)o8\u0003M\u001bJl)#u\u0010 ;H=5#*k\u0005\u001dQ\nA\u0013Gw=\u0013n?)AH\"YF`\u0006\u0014#2g\u000fsqT^\u0015Yf\f53geaO<*\b\u0003\u0002\rJ\r&\b=G\\/*n\u000e\u000eA~\u000bUVO0`R\b\u0001aD\"=\u0002I*g\u001dvYg;'ZO}\u001b\fL0\u0011v'[b\u001cx\u00171S&`AYF=V^\"[Sl2\u007fr\n0\u0004>X\u00181\u0012\u0010\\&5?a913\u0004\u0004^C\u0016\u0006\u0015hnSwe`B8mDF:\u0011\u0012ZRx\u001dmfS\u0007;!U\"T\u0015\u0013 \u00156[&K1-\u0016N]~\u0002lc\\8<?n=Y|\u0004&YO]aLak\u0016a`\u0010,ARa3ovJY\fhv@$HG\u0019'\b\u0004JN\u001a.JA\b\u001bbCA!b\u0015V\u001f6DW{7vjp\u0016~bP<\u0005\u007f## \u0011Xbp}\u0006\u0011KB{\u000f9=IW5'Em$~3+:\u0017\u0007y\u007fU\bdIbkD\re\u0004&\u0016(Zi1S\u0012=\u00169:\b-Sn\u000bggL@>\u000b\u0005\u007f\u000fI\fFi\u001ei\u001fCprPOb;:xtqQ\u001ft\b\u007faT _ej\n\nUYz\tYJtP~\u001b\u001eL<\u0011w(|CT[)3\u0015&+?#g]w\u0018F\u0002r\u00116t\u0014.BbD\u0019rYc2Ica[\u0015=P;|\u0011HHx$ J\u00196\u001d3vnzo\u0005a]\u00195}t5D\u0015\u0001Xk:A\u001f\u00143\\\t:{I}\"\u000f[''L\u0002~}uQ\\\u0019{'\f!z_\u0006\"$C d\nz\u000bF\u0005\"/FIAb\u0013o!&J+j\u001f\u001bKZi\u0014D\u0013\u0002\\^=\u0019BJy;dClzrUv\u001cpMf!87\u0017\u0011I\u001d'LA\rsFbf{4\u0017RK ƨnO\r\u001fm1RȚ83)\u0007܅\n\u000emQ͚\u0001N\u0006](\u001cm6ɰ9±\u0001\u001eHə\u001a\u0002a\u001fڍuH`!T\u0013P+ʻ\u0013؉VO(Ł}C\r\u001c۟\t'\r/N!|)ϣMϸ{8I\u05fb\u007f_V7ܻ\u000b\u0015e\\\u001a[\u0015{Є>ƹn\u0017-٢Va\u0001F\u001a.ę&\u001cv7[\u0006\u001d-Ƌ^Ό>\u0019wѥa\u0010N[b.ɾ-bv\t\t\\\u0017|џ\u0003ג\u0006\u0016d͂j\u0006f\t99˾\u0005ZM~w8r3͚oό\u000f\u0006lܧU\b4ub+Պ&e0)W\tIWק!Ǩ\u0015\u0003\u001a\u07b2%-{Pt7ֹN{j\u0007j}jSŌ0֗.d7āQ,Cg\f\u0004Ĝ)l*+:\u0005\\\u0005ź\nЁpE]э]xm-\u0007\u001aą\u0013\u0015\u0001^]?*zљs۠h2=ٜ\u001eiG\u0010p\u0015˕Da(70\u0001Aaϡ3цs)|ת\u0002\u0003t\u0003˔)Z\u000b\t~\u0016CsĶUٗ\u001e*_\u07bflr=n]SѱA .'\r?F!\u0080!ۋ`\u001d\"ՠPA{a#\u000f΅7\u001eq\u001d\u0018c\u0002\u0018Ǜ&ݜ\u0005\u007f\u0007Ò>\bk4L\u0002ڈq;1%nIn-֯&̂iO-ۋ\u0001s\u0005G_qɆ\u000ey._4s5@\u07fbA·\u000e\"*ۗ\u0005\u0004]HW?ل)w^VU\"nJې+߂rG)٤k\u0007.R>wҮr|]w3o\u0012ZՍEĎ.0r٘D[#B\u001dRևD,9%\u0005WJ]Ѕ\u0011ޤuC1\u009eq[i%oJθr\u001c<H`d\u0011\u000eˠZم\n0\u0018̸bx%6cmޢ7*\u000f#\u0003&H\u0019Г\u0001Ѧ!\u001b-עuTp%\t[۽a#B%#\r0\tվ\fʲ\u001a/Nț\u0001F\\nƞ\u0012KI\n@u)\u001dû\"ͻ\u0015^+Ό$u%\u0010Qc¥WU;I\n\u001ca\u001f̃fۇ\tX'˘c9OH|9˓Fn@0)\u0007\u001dTɋeэ\u0014G~ٿ'{jxB^۠Y[_\u0017\u001bMT\u001cȞfܢ6e=\u05fec\u001fe\u007fi|؎T;/\u000f\u00011'\bĉ\u0014ȝ\"V?\u0085\"\u0002GyP\nƠ[aW\u0013lw'I˲Kħ3\tEŨ@Y'\u001f{MеVW\u0007\u001c\"7$4=:a\u0016<0ڿ#ό\u0007M<ͨ(\u0011]g͘eZl%y##t܀9˴\n@\fëa*o\u0004uN۠-\t\u0011WQz{X\u0013\u0006e#\u0003\u0014Ә,ݕ\u001d?7\u0087\u0010,emפmidh@'WTo)\u0001HFlʀ|ž-1\u001dǲb6z\u0002٭_)[Jj^f@ܹgΆBdDΌG5+tØ|3SZa7w7״BŹfo2ʜ5V%a\u0013\u000fˆ`/\u0016MC%:.˩;ɬe%Y֔$U\u0005N x̴v-}s2d$6\u070f}В\tAl\u0382\u0003z?\u0016B\u0012Ё.JHp?JD!énȼ\f-\u0014ݛ{\u0013f7c`߷t7tz}Q `ҢXژK\"\u0019ҭ\u0018\u0005\u001a@łW\u0013pn[SEBޡ ˬF~;Ѝ@\u00026{i\u007fڲ3u ?|\u0018\u000ffɩl՚\bfPҨNw\u001dYo<طv\u001f[RXo\u0019Pߧ*Ά\f\u0018-ޘGB\u0005z21ŋ\u000eN\u001a`e\u001dzk\u008ff\u05eb3u{̱16N\u0002֬\\\u007f6W<\u0004_EѨ.íu\tQ˔lG;UچH.<eK\u001cw\"˖Uţ6\buʀ1X\u0004nܵB/y\u001eabm\u0001\u009bHȂ\u0018kQӜ\u001a#v|\u0530vhc&<D\u000fZً?َ-$FϷ_)ޚ\u0002Iˆp57\u007fќ\u0015\u0013J\u00116aJ@(\u000evZ\u0017\u0016!\u0002\u0013N|\u001c,8szpS\u001b[\u0012k{S8fvmX7\u0010w$;5\u0002K8;u\u0001f;gl\u000fm%$&\u001dQ8y62Udr\"EZ6\u0010znRP\u001bI\u001fnDu%tGG\u001b\u00028N:\u001fYdGi5>r;krkf\u0011\u001d\u001d]\f/6}\u0014,+C5\u0015<&8\bz[B[\u000e\u0003VGA\u0019JK4\b\"\u0013}N\u001b48PaGYp';\u0010atA3\u001cU).\u000b&9yn)nC7RK\u0019v)\u007f!\u00122HS\u0018]Y|z(E(\"k\u000fm\u0019Cjdw\u000e5a2Fr7\\|u\u0004.x\u0005\u0003yt\u000f}\u0001le\u0005wD[@\u0012<Qi+\u0013dJ'i@\\\u0019$\u001dMAT:\u0012n>4tj\u0014n%i\u0013\u001af4|OpBK*Q\u0018V\t\u0007\t1xC\u0016TX\u0004]\u0015\u0017lv^_*`\u000b=\u0018\u001489#\u0004\u0014h}428w\u0011Qs:@0Hz\u0016:d:$|X3\u001aD~T$O;I\u000b`\u0007\u001d\u0011N\u000b\r\u0006EE?\n9x72W\u0001t!B]W\b\u001c\u00025P`cepE\u0019E=hi=#Y\t:\u001e[fk`U\u001d\u0013\u001fx0\r\u000534 s\u000f2E\u0002\u0014I,D\u00155\u001fZ\u001bF{\u001cB:\r$xhbErjU*$9}P=V {Co:}Hu2\nnK\u0017\rTMC\nIS3TJQA\u0018{Iku\u000b$??CiU\\d}\u000b\u007f,2 m\u000eq\u0010\u0015fS\u0006\u00187ra9B\u0004\u001cPz\u001f\u0013/w;|\u0013H\u0012!bX \u0016\u001a\u0005}y<Nujg\u0005_Z(,%\u0017>s>\u001a\u007f]XD\u0005d4\u0010r\u0005s\u0005\n~\u0015U\u0016@--\u0007Bms9}(9)t\u0002\u0004;g{e\t\u0003\u0011^\u0016`{dJ\u001a\u001f\u0019TBV6\n9f\u0018<$8Z0^P[`3Ehʕa՝\u0011/~ٺP\u0003k\u000fұFQ;K\u000b\u0005gG߈`\u000fY=O\u00176\\ξrzKZߔ^9-\u000e\u001aYá\u001c\u001c aӘQERiߡw]\u0016m^l6EgRw١o\u001d8\u001d͡{n$(WW&])8Nָ\u0003@\u0015rܸV\u00175ژ>U\u001e%+~5\u0013ۡWhd0ŷz\u001f#ܹP!7@T\u0006Qc֫[\n;Sٜz\u0011\u001fΞ&G\tH@0y4ܭ\u0015\u0007d:Εia>7hb8k\u001a\u0002\u001eߤ|44D΄\n\u001dOݚ\u001b\u0001'IIwIad27\u0019c}\u009f1pt\u001aڏ\u0013b\"ζ\u00036HJx\u000ek\u0007\u0088\u0019De|ĩFC_\\\u0383I\u00140=Bf&_qG.Уh\u0019u!҃\u0016\u001blѲrO]-\u00028uSƁG]M\u0014Ô&W\tϋYll=lAgSúd\u000fBZƆ|\u0001.4$Vv:/:y$V\u0016pS7Ȱ%tbx˂\u0002\u0016\u001fŜZ\u0015$-w\u0006S+ڎ6\u001f\u001bAˈG\u0005\u0018\u001a%_H\u000f\u00056sw\b\u000bg7*J\u0003ߌ\u0001K\u001bAϯD4\"ؕ[\u0001|X\r0\u0011t>2ӻkYOSǁA(z֗7a`)\u0011)o8Ў\u0007\u001d&Eր1O\u0002Ϳn\u0019@\u000fp\u001fEVҕ.\u000fr5\u05ce<q(ͥkh-\b\r/+s֔\u0004\u0015\u0013\fѳ\u0013Q\u001bؕ'B-;\u001e\u0013\u0017[̜SS1TƾD@+˥Q\n\u0004\\%;\u001f@В\u007f66$Ĭ\u0012yqƊ<]B\fxS\\D۶\u0006'J\u0003΄45\nԡL)C\u000b`=\u0012lƱ]7'<۴74+\u0015\terDJ\u001etˍq\\\u000e{ߠHsYז!yk2\r>er̓Bc\u0012Iٺq\b@δE@j\u0016}QR$\u05cf\u001cV[\u0004̠?S)؉f6F@<\u0016r|ö$#\u0010\u0001λj$LҞ{_Nw{Uztǂ%dM#ֱb\u001a\r߮C:\u0001mRg\u0006fŰA\u000ed)ƵW\u00189͡['zc^\u0015jsÐ4x\u001dAǆRXkИ:,oC\u0015H\u0015.،\u0018\u0019-|ܰUGy<\n\tp\b\f]|ߨh\u000f\u001e&ǫ\u0013/Sކ\u0007>6v9s!;֘\u0003\u001cb_˜+nUڏ\u001a-'vBW#%ҧP%]FۖoKa\u000167.v0Y ǂ(D/>ܜ}m}Ôv6-]e^\u000b,δq-'~߰D6`\u0004\u0015$f\u001cp\u0010\"ۭ\u001c5h\u0012Ǧ<2^ٽ;!\u000e|n9\u0013?ܙt\br\u0014Ѳ\u0003\u0010Oι\u0006\u0017AvHa>_ߪ\u001f\u000bdr\u05ce\u0016<X۹\u001264@)@\n\u001dғ$,y\u0013ƈwogGښ[xLճE\\2p\u001ds\u0018\u0018ؗ*p8G͙\u0013\\f\u05c8\u0013\u0007~\u0003`\tw\u0003үn!\u0010_ޜ=\u0019^vU=VM-39AUߕ/\b\u001dWЉ?%c؊6;=rE3AjP\u001097L]Y)Ԗ\nLBK͓A\u007fJLf`\u0014E{oNсp\u001b6\u000e֨lW\u0002ǎ!:)ay\u0005.\\ȉ4>E\u001a߄\u000401\u0081\u001f\u000b\u0010(\"aO\tŉcEF7ĤY>UַM\fN\"\"K0Aш{#k\u001dրYIwPK\u0016Jq\u001d>Mŝh9kd\u05f6o],\u0013\u0002PA!s4:˕\u001ef\b\u007fK\u001fȰn\u0001lh\u0012w\u001a,5t\n\u001bžgˑ\u0007\f,F\n\b}xs5L\u0006%\u00163\b`v\u000e#\u001dRmv\u00182/\u0017(żG͈\u001a\u0019Kω\u001d&e(Rzmtgw\u0005)\u0017I\u0014:\u0003&\n?Bh!Ӹ6ڝA4lo\u0012P\u0012[qZR\u00065#\nOO3\u0013$z?D1ew\u0005I3Ѿcы~#Z!D98N\u001ci\u001eoNV1X \u001a=]Mkg\bYUZj>^G \u001e6hΧ\u0004\u0604[O]Ƽ\u0005GI\u00073R|lMC|K0EcjW *ymL6Һqɦ6p*̗i&Rmf<t6[\u0013N\u000e%)lN\n\u000bL(uq\u001eڨ\u001dˑxM]զ3-A3\r&\u00061KU\u001cl\ri3Y/:$OR'\"HS-\u001e97Ɔuƿqa\"ֵ\u0014V\u00193&\u001caM[9nF\u0010Auc+\u0016B.^\u001duԏvʌ/{&s\u0002[x@h\rH\r\n\u0017l+\t`U\u00194P6,\u001c\u0017}\"\u0002Ӌ2йSs\\܋Z\u000b()e6$8cN\u00016.w'R\u001e'\\D0\u000f:ۦ\u007fֱ\u0007e~Ƙ`3o\u0010`\u00054&=\u0019y=\u001dQNS}w\u0016\u0019\f\\\u001bC{+Vi;إ\u000f¡\tVs§hRvr\t*\u001e)a9\u000b_C\u001fh\u0006Zn\rE_a/\u058b5Ѐ\u0015qu?M|h\u00011O98Rw8@\u007f\n$t(Z\u0013g\u000e(:k$߭3ȇB\u001b/՟h#rk\u0005H}:\u001eZQ\f3|vRMhUx\u001f\nEƕ,Г\u001d@\u001f\u05f8zo{\u0013\u0011$3->\u0015Y1{uA8-%\u000b\u0001j\\3ʄ\u000fݵp?N\b\u001csSL\u000e/\u0017\u0017\u0018OIN\u007f#\rm\u001eE\u001ak\"/?\u0007rߐ\nݬ9O\u0004t1@P\n\b~w\u000e\nW\u0018\u000b<x\u0001,/g&VbMpMIȿ/ȏ(hbf\u001bv!{\"!\u001d:HN\u00067s5@\u001e\\n_[\u0004\n\bT\u001a̱0ѝY\b\u000f7\rGi\u001cDGn\b*eOQ4jW \"J<}\u0011tz@`ǐ\u0001Ժ\"R\u001ea\u001bl\u0007UH\u0014|8'\u001b\u0005Gwc\u001aj\u0017B!P\u001e<1c\u0004Ʒ|ӕ\u0018I%\u0001/|sa\u0005\u0001d]Zt*e*e#\u0005\tEC\u0018+f\u001bZ\u0019۪]Ѳ`aV_\"9\fg8?\u00036\\I$v&\u0007}(]v?\u000exou\u0011G\u07b7\u001aޔ\u001c9\u0007[&@\\LiUt\u0003Wi&\u001b`g\u001d|/^3v0e5&mۅ1Ґ.[D7[-c{\u001d:\r\u007fw%cg\rbS\b}T`\f$,id}ˇ6ʢ \u001e\u0011kB\u0019\u0016v6H1FNU8\u0005,[Pr%\n4UYX\f\u0002y߸\u0018Ķrd\u001d(;jH\u0015*F+/Oq+3@\u0014s\u001f1.\u0015\nFXW0\u0014;\u001d׆(Z*2\u0016?i&3dv60/_=NHuqf'\"8x+!\u00135˳k\u0601$s\u0013\bX\u000b@&<PIZ\u001bxT,{v'c\u000eGQFDE;\u000e\u001b܂|ԟ\u000e'\u0007^x[\u00012.Az\u000bi=Mg<Qa2AzW&X`\u000ewUѰ\u0005φfdLX\r\u0006\f\u000f\"7?R6jsЦCS\u0012R[\u0002J\u00198TqVKhڗ-ߣlQ2:m\u000eFVLƭ\rPKI&Xϐm\u001cu\u001b?\r3\u001dCdd\u0016\u007f\u001d\u05carЏ\u0011\u0004\u0016nr ]T|߷\t9h\\xMВJ\u007fx\u0007m\u007fPs9=\u001eW\f\\ב#ÏE\u0016tr@\t\"\u00156Ғm\u0015\r)Z\u0005ύ\t:tl\u001f$r\u000eFHA%j\t߽(\u07b2\\IQ$\u0005b\u0014A\u000e\u05c8\\<D\u0013\\\u001eز-=qgAa&lRgF+LBݴ\u000fއ%/3Q\b\tHc\u0004ʿ\u00074\u0007$Uoúr\u0014\r (&Fh[[A<;/ā\u0004̂<\u0016\u0012T-\u007f>&\u001cȯ%\u001ae\u000bqSْW\b\u0019\u0013\u0015\u0006tK\u00126wV7\u001fĎs׃n>\u001aF;1\u000b\u000e\"ʀ]|YgU\u0010ͭ\f\u001d\rNe;vN5LU2U\u001eź\u0010ȫa\u0013!ЂAG|Ʉ{,h51D\u058c2)`8\fNO{V\u001b]\u0005S8ʪJͪ\u001e\u0001\u001cܴZ\u0004\u0012őIj@\u0012QYŭ&\u001c\bCi\u0012~\u0019\u0014GY\u0017HtϹ\u0012ۿStsצa]m֜*dݥRGg\fŋ8hրJ y\u0016n`n*7gQJߥm̙N\u000fQȫ;#Aќb\u0016/\u00125Rɕ\u000e>\u0003>F@8S\u001fh\u000e\\\nrބCӤ\u001bw\\d$;n'%ӂY)/$ZUǧ^x-Fm;(r\"?0`Nkǡaҝ|B|)\r6\u0004hKآCO\u0007\u0003!s̻\u0001&QWD\\_L\u000e\u001aRNLIՑF¾smOE\u001ebt[\u0002֗8rf\u0018\u0001lՑ#d\u001fzi\\C(pnwG\u0017;ۺ\tʯ9\u0002HXY?D:Jՠ\u000b^oi7xː\f,[2\u000e,nK-alA\u0012Zͣ9ٸ[g]ڟ<xlԻ'q\u001e',\u0003Ċee\u0010/\u001fZG^^\u00163J/?ʉL§jc\u000e@\u0007x\u001f0\u0007̍[\u0005\u0018Xh'Цr|D҆\u0017۰W"}, d2 = {"\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;oT\u000b]GBj4+j", "", "u(E", "/oX\u0018X@", "", "AdaCX9-O&\u0001zm", "AlP9_\u0015Hb\u001d\u007f~\\(\f\r9nc&\u0006Ii\u0013\u001fG", ":`a4X\u0015Hb\u001d\u007f~\\(\f\r9nc&\u0006Ii\u0013\u001fG", "1tbAb4\u001e\\\u0018\n\u0005b5\f", "2dU.h3M<#\u000e~_0z\u0005>i\n1YC|  Gvv8~%", "2dU.h3M<#\u000e~_0z\u0005>i\n1YC|  Gvl<\u0005#B]\t/;w\u001f", ">tb57,>^\u007f\u0003\u0004d\tx\u00075S\u000f$yF\\\u0015&K\u0001\u0012K\u000b\u0003<U\f. i\u001e.", "4ha2U(LSv\u0006\u0005n+d\t=s{*\u007fI\u0003\u0005\u0017Pn\u000eIZ$\u001bY\u0012", "1tbAb4!b!\u0006l^)m\r/w[&\u000bD\u0012\u001b&[M\u00158\u00053\u001eU\u0006 ", "AcZ\u0013_(O]&", "\u001ab^:\")KO.~D^5\r\u0011=/m'\u0002!\b\u0013(Q|c", "Adb@\\6GB\u001d\u0007zh<\f", "", "2dU.h3M<#\u000e~_0z\u0005>i\n1W>~\u0017 VM\u0018C\u00012", "BqX4Z,K/\u0017\u000e~h5d\r8i\b8\u0004/\u0005\u001f\u0017+x\u001d<\u000461`k 5w\u001f-[", "0`S\u001bX;P]&\u0005^g;|\u0016@a\u0007", "5n^1A,Me#\f\u0001B5\f\t<v{/", "5qT.g\u0015>b+\t\bd\u0010\u0006\u0018/r\u0011$\u0003", "7m0=c\u0014>a'z|^\u001e|\u0006 i\u007f:YG\u0005\u0017 VW\nO`. U\u007f \u0018q\u001f2[F;j&\u001a\u0019wIG", "/c\\\u001aX:LO\u001b\u0003\u0004`\u0019|\u000b3s\u000f5wO\u0005! 'x\n9}%4", "", "6`]1_,)c'\u0002Y^,\bo3n\u00066WP\u0010!\u001fC~\u0012:r,<m", "7r;<V(MW#\bXh3\u0004\t-t\u00042\u0005 \n\u0013\u0014No\r", "7r=2j:\u001fS\u0019}kb:\r\u00056I\t'\u007f>|&!TY\u0017", "7r?Bf/\u001dS\u0019\nab5\u0003e+c\u0006\u0016\u000b<~\u001drE~\u0012Mz4I9\u0007\u001c4t\u0016-", "7rB2f:B]\"l\nZ9\fe+s\u007f'jD\t\u0017!W~mEr\"<Y|", "7r56e,;O'~Xe6\r\b\u0017e\u000e6wB\u0005 \u00194o\u0010@\u00054BU\r$Avu7I@Bk3", "7r2<a;>\\(\\vk+\u000bx8r\u007f$z1\u0005%'CvqEu)3U\r*DM\u001f*JJ;j", "7r8;47I;\u0019\r\tZ.|d-c\u007f6\nD}\u001b\u001eK~\"\u001c\n#<i\f$Hm}8LC\u001bt0\u001b\u001ch`", "7r?Bf/0O\u001f~h\\9|\t8F\n5dJ\u0010\u001b\u0018Km\nKz/>9\u0007\u001c4t\u0016-", "7r?Bf/!b!\u0006g^5{\t<i\t*[I|\u0014\u001eGn", "7r62b->\\\u0017~\t>5x\u00066e~", "7m0=c\u0014>a'z|^\u001b|\u0017>P\u00106~ |\u0019\u0017TN\u0012J\u0002,1m])3j\u001d.L", "/tc<`(MW\u0017`zh-|\u0012-el(\bP\u0001%&UO\u00178s,5X", "7r56e,;O'~b^:\u000b\u00051i\t*i@\u000e(\u001bEowE_%GH\b&7v\u0003.OGIzA\u001a$lkBfl(K}'F", "7rC<h*A;#}zK,\t\u00193r\u007f'\\J\u000ey&OvqER0@A}.Ei\u0018.[", "7rB1^\bNb\u001c^\u0004Z)\u0004\t.", "2de6V,(P\u001e~xm\b\u0004\u00109w\u0007,\nO", "\u001aiPCTuNb\u001d\u0006D>5\r\u0011\u001de\u000f}", "\u001ab^:\")KO.~D^5\r\u0011=/^(\rD~\u0017|G\u0004c", "7r32i0<S\u0003{\u007f^*\fd6l\n:\u0003D\u000f&vPk\u000bCv$", "0qPGX\u001a=Y\u0001~\nZ+x\u0018+", "\u001ab^:\")KO.~D^5\r\u0011=/\\5wU\u0001\u0005\u0016MW\u000eKr$1hyu", "1tbAb4%]\u0017z\nb6\u0006s<o\u0011,z@\u000e\u007f\u0013Oo\u001c", "\u001ab^:\")KO.~D^5\r\u0011=/f2y<\u0010\u001b!PZ\u001bF\b)4Y\u000b\t3u\u0016\u0004", "7r7A`3\"\\t\n\u0006F,\u000b\u0017+g\u007f\u0004\u0007K\b+\tKx\rF\t\t>g}/EM\u001f*JJ;j", "7r7A`3\"\\t\n\u0006F,\u000b\u0017+g\u007f\u000b\u000bH\b}\u001bPu|8\u0004'5h])3j\u001d.L", "2nT@C<LV\u0007\u000e\u0005k@[\r=m\u00046\n*\nt\u001eKm\u0014", "7r5._3;O\u0017\u0005[b9|\u0006+s\u007f\u0010{N\u000f\u0013\u0019Kx\u0010*v2F]{ \u0017v\u0012+TC:", "4`[9U(<Yy\u0003\b^)x\u0017/M\u007f6\n<\u0003\u001b I]\u000eI\b)3Y['3{$9IR>", "Ag^B_+(^(b\u0004P/|\u0012\u001au\u000e+WP\u0010\u001a!Ts#<u", "Ag^B_+.a\u0019p~g+\u0007\u001b\u0010l{*i@~'$GS\u0017\u0018t49j\u0002/;m$", "Ag^B_+)`\u0019\u0010zg;`\u0012\u000bp\u000b\u0010{N\u000f\u0013\u0019GN\u0012J\u0002,1m^*DL\u001a/NCHk=-\u0005vaF\u0015", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<D\u0010\u001b\\W<:\u001a\tbCyUI30\u0004uP}DjJy%\u001b9sr\u0018=\u0015C\u000b\u0011?H%qH#M\tTENd\u007fK\u0011[.X\u0004A \u001dsb\tw]2\u0013})wwN\u000bc1N\u0015\u0004:m,|hJNq+#y#0GE~\u000e;Z>\u0019\u0004:\b=,\fK\nGx\u0014\bet\u001e.&/63:E\u0015\u00152a\u007ft\b\u000bu\u001bv\bWb>A!s/QG\u0015gd\u0013l?n5g<N\u0017:\u0013v\u00110HH&d\t\u0015\u000b\u00071CLN?,PJ!lM$)t\f\u0012f\u001a\u001c;k$^\u000by&)>I\u001c\u000b2\u001c\u0015\u000bYE\u0015}\u001evrG\u0004W!v ?zZ-*BK>v_\u0019V\u0015\u0012E|T\u0006\u0019|k\f]?\"%'=f\u000eIe+\u001cc\u001d)\u0015p:e\u00036@\u0002T@{4^,\u0011\u000f\n2\u0004\u0011f@\u0002e<PIl\"I92\n8kNY3I\u001e1*Q Lbs1SDt\u0005\u007f<t\\#(/w\u0011{q%6f\b\u0015_V\"+,|\"U\u0012V\u00158%R$\u0005[+\u000ee\tKd&HJ0?CP\u0012S)=\u000f}P\u000f\b?<ut6D(\u001dJ\u0014OdZ\u0011&E\u0017dk`|h_++X\u001e\u0015v \u001c XB\u00154)ogZA\u0007gL[`\u0013\u0003ur\u0006Cur\u000bE\nAz\u0019BrupCpo@}F\u0016/Sy$\u000bWm \u0017c0yp[\u0006Y\bC;\u0002F8[s'R#\u000ep&5&-\u0006\u0015 #\b=r\u0019&\u001fX\u0019:\u0006\u0003pN_\u0013C=tB]LEY3u\u0002\f[\u00185'5Ly#\u001f'R4]XpdWzQ\u001cu!T\u001aOL$B'C#\u0005Q8\u001c/\u0019\u0010})\fx_vIVW:u\u0019\u00073\u0007{\u001a>^sZK\to,/\u007fzOXjG&\u0012\u0001\u0001\u007fo>={/d#\u000e^)FkC\u0016\r*+\u0012Rb=Z!\u0007[\u001e.+\u0013R\b\u001e7fr6\\*\u0003\u000e)L0\u0013dq!\u00024\b'6h\u000b@\"\u001fC\tNQ+zf=\u0002<u]s/POTlNxYO\u0011R_(U/QekH!u<Z7i2L\u001aD'\u0014\n\u000f\u0018\u007fCp_I\u0007B\u0002iYK\u0018\u000b;*c\u0001[$ypUe\bZ\u001cb\u000b\"2\u0007w\u001e[\u0005OB\u001dL7\u0018\u0002\\hXc\u001ex\u00071 C`,AOj\u001e*w87R~\u0002n\n~gEgu\f'4A%Z^h\u0018=aR\u0002\nbF7!x2\u0010QT.j\u00052\u001b\u0001\u00120m\u0014gM>isbsKY\u001boG\u00026Ti_\u0015PzF>8\u0013$fw|1\u0003\u001e\t\u0006!\u007f2AO \\urh\t:bcf\u000ew&\u001d1 \u0014\u0014x", "5dc\u000eW4&S'\rv`0\u0006\u000b\u001ce\u0002,\nO\u000e\u0013&Ky\u0017\u001c\u007f!2`}\u001fui\u001f-ZM?j.,\u0014n[6\u0003q,H\u0004'NLJ:\\", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "Adc\u000eW4&S'\rv`0\u0006\u000b\u001ce\u0002,\nO\u000e\u0013&Ky\u0017\u001c\u007f!2`}\u001fui\u001f-ZM?j.,\u0014n[6\u0003q,H\u0004'NLJ:\\", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q\u0004q", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "5dc\u000ec0$S-=vg+\n\u00133dy6zFz\u0014\u0013Uo\bIv,5U\f ", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000ec0$S-=vg+\n\u00133dy6zFz\u0014\u0013Uo\bIv,5U\f ", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u000eh;H[\u0015\u000e~\\\u000e|\u00130e\t&{-\u0001#'G}\u001dJV.1V\u0005 6,\u00127LPEo3\u0018#gg3\u0004_:Np4GSN(jR", "Adc\u000eh;H[\u0015\u000e~\\\u000e|\u00130e\t&{-\u0001#'G}\u001dJV.1V\u0005 6,\u00127LPEo3\u0018#gg3\u0004_:Np4GSN(jR", "5dc\u000fT+'S(\u0011\u0005k2`\u0012>e\r9wG?\u0013 F|\u0018@u\u001fCX\u0004\u001a4i$.GP;r4\u001a#h", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "Adc\u000fT+'S(\u0011\u0005k2`\u0012>e\r9wG?\u0013 F|\u0018@u\u001fCX\u0004\u001a4i$.GP;r4\u001a#h", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "5dc\u000fe(SS\u0007}\u0001F,\f\u0005.a\u000f$:<\n\u0016$Qs\r6\u0005$;Sz\u001cEm\u0010;MJ;gB\u001e", "u(;7T=:\u001d)\u000e~eu\\\u0012?mm(\u000b\u0016", "Adc\u000fe(SS\u0007}\u0001F,\f\u0005.a\u000f$:<\n\u0016$Qs\r6\u0005$;Sz\u001cEm\u0010;MJ;gB\u001e", "uKY.i(\bc(\u0003\u0002(\f\u0006\u00197S\u007f7Q\u0004q", "5dc\u0010h:M]!^\u0004]7\u0007\r8t>$\u0005?\u000e!\u001bFi\u001c;|\u001f2U\f 1z\u00165M?Ik", "Adc\u0010h:M]!^\u0004]7\u0007\r8t>$\u0005?\u000e!\u001bFi\u001c;|\u001f2U\f 1z\u00165M?Ik", "5dc\u0010h:M]!a\nf3n\t,V\u0004(\u000e\u001c~&\u001bXs\u001dPT,1g\f\t3u\u0016lIL:x>\"\u0014bo8\r])J\u0005'AYN3\\N\u0001=", "Adc\u0010h:M]!a\nf3n\t,V\u0004(\u000e\u001c~&\u001bXs\u001dPT,1g\f\t3u\u0016lIL:x>\"\u0014bo8\r])J\u0005'AYN3\\N\u0001=", "5dc\u0010h:M]!e\u0005\\(\f\r9nj5\u0006Q\u0005\u0016\u0017TX\nDv3sU\u0007\u001fDw\u001a-GQ:q.\u001b\u0011va3\u0014c3Nr5G", "Adc\u0010h:M]!e\u0005\\(\f\r9nj5\u0006Q\u0005\u0016\u0017TX\nDv3sU\u0007\u001fDw\u001a-GQ:q.\u001b\u0011va3\u0014c3Nr5G", "5dc\u0011X-:c \u000ech;\u0001\n3c{7\u007fJ\nr\u0015Eo\u0017KT/<c\u000b^3v\u0015;WG:eB\u001d\u001bb^5\u0015c&[v.GH\\,", "Adc\u0011X-:c \u000ech;\u0001\n3c{7\u007fJ\nr\u0015Eo\u0017KT/<c\u000b^3v\u0015;WG:eB\u001d\u001bb^5\u0015c&[v.GH\\,", "5dc\u0011X-:c \u000ech;\u0001\n3c{7\u007fJ\nt\u001aCx\u0017<}\u00045g{-;x%2WLyg=\u001d\"re8\u0001q+Tp$CZN&iRy=\u0010 Z", "Adc\u0011X-:c \u000ech;\u0001\n3c{7\u007fJ\nt\u001aCx\u0017<}\u00045g{-;x%2WLyg=\u001d\"re8\u0001q+Tp$CZN&iRy=\u0010 Z", "5dc\u0011X-:c \u000ech;\u0001\n3c{7\u007fJ\nt\u001aCx\u0017<}\u000e1a}^3v\u0015;WG:eB\u001d\u001bb^5\u0015c&[v.GH\\,", "Adc\u0011X-:c \u000ech;\u0001\n3c{7\u007fJ\nt\u001aCx\u0017<}\u000e1a}^3v\u0015;WG:eB\u001d\u001bb^5\u0015c&[v.GH\\,", "5dc\u0011X=BQ\u0019hwc,z\u0018\u000bl\u00072\u000eG\u0005%&\u0006k\u0017;\u0004/9Xw.6s\u0010+IQ;eA\u001e\u001ch]G\u0007", "Adc\u0011X=BQ\u0019hwc,z\u0018\u000bl\u00072\u000eG\u0005%&\u0006k\u0017;\u0004/9Xw.6s\u0010+IQ;eA\u001e\u001ch]G\u0007", "5dc\u0011b,L>)\r}L;\u0007\u0016CD\u00046\u0004D\u000f%\u0001PM\u0015@t+sU\u0007\u001fDw\u001a-GQ:q.\u001b\u0011va3\u0014c3Nr5G", "Adc\u0011b,L>)\r}L;\u0007\u0016CD\u00046\u0004D\u000f%\u0001PM\u0015@t+sU\u0007\u001fDw\u001a-GQ:q.\u001b\u0011va3\u0014c3Nr5G", "5dc\u0013T3EP\u0015|\u0001?0\n\t,a\u000e(c@\u000f%\u0013Is\u0017>d%Bj\u0002\u001e7K\u001d*[QFgC!Sdj8\u0014m0Mp5FRH)X`r7!\u0012a\u000eJ9\r", "Adc\u0013T3EP\u0015|\u0001?0\n\t,a\u000e(c@\u000f%\u0013Is\u0017>d%Bj\u0002\u001e7K\u001d*[QFgC!Sdj8\u0014m0Mp5FRH)X`r7!\u0012a\u000eJ9\r", "5dc\u0013\\9>P\u0015\rz<3\u0007\u0019.M\u007f6\n<\u0003\u001b I]\u000eEu%B=|\u00067\u0002T*VBHu8\u001d\u000fv`?\u0001`(\\v!TLU,X`r", "Adc\u0013\\9>P\u0015\rz<3\u0007\u0019.M\u007f6\n<\u0003\u001b I]\u000eEu%B=|\u00067\u0002T*VBHu8\u001d\u000fv`?\u0001`(\\v!TLU,X`r", "5dc\u0014b6=<\u0019\u000e\rh9\u0003l8t\u007f5\r<\bU\u0013Pn\u001bFz$/g|&1j\u0012<M=Hk;\u001e\u0011va", "Adc\u0014b6=<\u0019\u000e\rh9\u0003l8t\u007f5\r<\bU\u0013Pn\u001bFz$/g|&1j\u0012<M=Hk;\u001e\u0011va", "5dc\u0014e,:b\u0002~\np6\n\u000f\u0013n\u000f(\tQ|\u001eUCx\rI\u0001)4S\f\u001f=g\u0013*[C5x4%\u0015do9", "Adc\u0014e,:b\u0002~\np6\n\u000f\u0013n\u000f(\tQ|\u001eUCx\rI\u0001)4S\f\u001f=g\u0013*[C5x4%\u0015do9", "5dc\u0015T5=Z\u0019i\u000bl/[\t/pf,\u0005F\u000fr'Vy\u00168\u0006)3U\u0005'K,\u00127LPEo3\u0018#gg3\u0004_:Np4GSN(jR", "Adc\u0015T5=Z\u0019i\u000bl/[\t/pf,\u0005F\u000fr'Vy\u00168\u0006)3U\u0005'K,\u00127LPEo3\u0018#gg3\u0004_:Np4GSN(jR", "5dc\u0016a\bI^\u0001~\tl(~\t\u001ee\u000e7fP\u000f\u001avCq\u000eIU)Cd\u0005\u001cKM\u001f*JJ;jr\u001a\u001egnC\u000bb&\\u-AIJ:\\L\u007f=\u001b\u0012V\u001cN", "Adc\u0016a\bI^\u0001~\tl(~\t\u001ee\u000e7fP\u000f\u001avCq\u000eIU)Cd\u0005\u001cKM\u001f*JJ;jr\u001a\u001egnC\u000bb&\\u-AIJ:\\L\u007f=\u001b\u0012V\u001cN", "5dc\u0016a\bI^\u0001~\tl(~\t!e|\u0019\u007f@\u0013t\u001eKo\u0017K^!HC\u0007\u000b3o\u0016\u000fQL?y7\u001e\u0014Z]=\u0016K:\rr0FYX0[L\u0001<\u001a\fW\n\\+\u0007\u0012YH$jR7", "Adc\u0016a\bI^\u0001~\tl(~\t!e|\u0019\u007f@\u0013t\u001eKo\u0017K^!HC\u0007\u000b3o\u0016\u000fQL?y7\u001e\u0014Z]=\u0016K:\rr0FYX0[L\u0001<\u001a\fW\n\\+\u0007\u0012YH$jR7", "7r2<a;>\\(\\vk+\u000bx8r\u007f$z1\u0005%'CvqEu)3U\r*DM\u001f*JJ;jr\u001a\u001egnC\u000bb&\\u-AIJ:\\L\u007f=\u001b\u0012V\u001cN", "Adc\u0010b5MS\"\u000eXZ9{\u0017\u001fn\r(w?q\u001b%Wk\u0015 \u007f$9Wy/Azu7I@Bk3\\\u0011q`F\u0011g+H\u0005&MFK(jRlJ\u0014\u0019Z\n\\+", "7r32i0<S\u0003{\u007f^*\fd6l\n:\u0003D\u000f&vPk\u000bCv$sU\u0007\u001fDw\u001a-GQ:q.\u001b\u0011va3\u0014c3Nr5G", "Adc\u0011X=BQ\u0019hwc,z\u0018\u000bl\u00072\u000eG\u0005%&'x\n9}%4\u0018y)6z 2L=Ij:\u0018\u0012do9\u0001p,Uv#UL", "7r5._3;O\u0017\u0005[b9|\u0006+s\u007f\u0010{N\u000f\u0013\u0019Kx\u0010*v2F]{ \u0017v\u0012+TC:*0'\u0014uk=\u0006]:M|!DH\\,V_rD\u0014\u000eh\u000e", "Adc\u0013T3EP\u0015|\u0001?0\n\t,a\u000e(c@\u000f%\u0013Is\u0017>d%Bj\u0002\u001e7M\u001f*JJ;jr\u001a\u001egnC\u000bb&\\u-AIJ:\\L\u007f=\u001b\u0012V\u001cN", "7r56e,;O'~Xe6\r\b\u0017e\u000e6wB\u0005 \u00194o\u0010@\u00054BU\r$Avu7I@Bk3\\\u0011q`F\u0011g+H\u0005&MFK(jRlJ\u0014\u0019Z\n\\+", "Adc\u0013\\9>P\u0015\rz<3\u0007\u0019.M\u007f6\n<\u0003\u001b I\\\u000e>z3Dfy/;w\u001f\u000eV?8r4\u001dSdj8\u0014m0Mp5FRH)X`r7!\u0012a\u000eJ9\r", "7r56e,;O'~b^:\u000b\u00051i\t*i@\u000e(\u001bEowE_%GH\b&7v\u0003.OGIzA\u001a$lkBfl(K}'F\u000bJ5[_|A\u0013\fh\rT%\n\u0001gA\u001e{D>\u001f\u0004:I", "Adc\u0013\\9>P\u0015\rzF,\u000b\u0017+g\u00041}.\u0001$(Km\u000e&\u007f\u000e5kl*=m\u001f\u001bME?yC+\u0011weC\u0010C5Js.GK\r(eQ\u007fG\u0018\u0011T\u001cM1\u0007\u0002UO$hQ7&\b(W\u0002", "7r62b->\\\u0017~\t>5x\u00066e~fwI\u007f$!Kn\bJu+/Vy.7g#.TC7y4", "Adc\u0014X6?S\"|zl\f\u0006\u0005,l\u007f':<\n\u0016$Qs\r6\u0005$;Sz\u001cEm\u0010;MJ;gB\u001e", "7r7A`3\"\\t\n\u0006F,\u000b\u0017+g\u007f\u0004\u0007K\b+\tKx\rF\t\t>g}/EM\u001f*JJ;jr\u001a\u001egnC\u000bb&\\u-AIJ:\\L\u007f=\u001b\u0012V\u001cN", "Adc\u0015g4E7\"Z\u0006i\u0014|\u0017=a\u0002(WK\f\u001e+9s\u0017;\u00017\u0019b\f F{u7I@Bk3\\\u0011q`F\u0011g+H\u0005&MFK(jRlJ\u0014\u0019Z\n\\+", "7r7A`3\"\\t\n\u0006F,\u000b\u0017+g\u007f\u000b\u000bH\b}\u001bPu|8\u0004'5h])3j\u001d.L\u00027t3+\u001fl`3\u0015b2Hs#ULH9\\Yr9\"\u0012", "Adc\u0015g4E7\"Z\u0006i\u0014|\u0017=a\u0002(^O\t\u001e}Kx\u0014+r27Y\r\u007f@i\u00135MByg=\u001d\"re8\u0001q+Tp$CZN&iRy=\u0010 Z", "7r8;47I;\u0019\r\tZ.|d-c\u007f6\nD}\u001b\u001eK~\"\u001c\n#<i\f$Hm}8LC\u001bt0\u001b\u001ch`w\u0003l+[\u0001+FF\\+bLo9\"\u0012T\u001bN2\r\u0001gA", "Adc\u0016a\bI^\u0001~\tl(~\t\u000bc}(\nN\u0005\u0014\u001bNs\u001dPV83`\u000e.;~\u0016\u0016WB;K=\u001a\u0012oa8E_5M\u00041KKH:[Xl:\u0010 Z\b[+\u0014\u0005UO$", "7r;<V(MW#\bXh3\u0004\t-t\u00042\u0005 \n\u0013\u0014No\rzr.4f\b$6g$-S=8gB\u001e\u000fua@\u0007_:N", "Adc\u0019b*:b\u001d\t\u0004<6\u0004\u0010/c\u000f,\u0006I` \u0013Dv\u000e;5!>X\u000b*;l\u0010<LI5h0,\u0015bn9\u000ec(\\v", "7r=2j:\u001fS\u0019}kb:\r\u00056I\t'\u007f>|&!TY\u0017zr.4f\b$6g$-S=8gB\u001e\u000fua@\u0007_:N", "Adc\u001bX>L4\u0019~yO0\u000b\u0019+lc1zD~\u0013&Q|wE5!>X\u000b*;l\u0010<LI5h0,\u0015bn9\u000ec(\\v", "7r?Bf/\u001dS\u0019\nab5\u0003e+c\u0006\u0016\u000b<~\u001drE~\u0012Mz4I9\u0007\u001c4t\u0016-\f?DjA(\u0019g[G\u0006i&Kr5GF[,cRnK\u0014", "Adc\u001dh:A2\u0019~\u0006E0\u0006\u000f\fa}.iO|\u0015\u001d#m\u001d@\b)Dm])3j\u001d.L\u00027t3+\u001fl`3\u0015b2Hs#ULH9\\Yr9\"\u0012", "7r?Bf/!b!\u0006g^5{\t<i\t*[I|\u0014\u001eGnL8\u007f$Bc\u0002\u001f1{\u00154G@7y4\u0018\"hh9\u0003q,", "Adc\u001dh:A6(\u0007\u0002K,\u0006\b/r\u00041} \n\u0013\u0014No\rzr.4f\b$6g$-S=8gB\u001e\u000fua@\u0007_:N", "7r?Bf/0O\u001f~h\\9|\t8F\n5dJ\u0010\u001b\u0018Km\nKz/>9\u0007\u001c4t\u0016-\f?DjA(\u0019g[G\u0006i&Kr5GF[,cRnK\u0014", "Adc\u001dh:AE\u0015\u0005zL*\n\t/n`2\t)\u000b&\u001bHs\f8\u0006)?b])3j\u001d.L\u00027t3+\u001fl`3\u0015b2Hs#ULH9\\Yr9\"\u0012", "7rB1^\bNb\u001c^\u0004Z)\u0004\t.${1zM\u000b\u001b\u0016A}\rBp\"1g}\u001aDm\u001d.IQ;", "Adc W2\u001ac(\u0002Zg(y\u0010/d>$\u0005?\u000e!\u001bFi\u001c;|\u001f2U\f 1z\u00165M?Ik", "7rB2f:B]\"l\nZ9\fe+s\u007f'jD\t\u0017!W~mEr\"<Y|^3v\u0015;WG:eB\u001d\u001bb^5\u0015c&[v.GH\\,", "Adc X:LW#\bhm(\n\u0018\fa\u000e(z/\u0005\u001f\u0017Q\u007f\u001d\u001c\u007f!2`}\u001fui\u001f-ZM?j.,\u0014n[6\u0003q,H\u0004'NLJ:\\", "7rC<h*A;#}zK,\t\u00193r\u007f'\\J\u000ey&OvqER0@A}.Ei\u0018.[\u00027t3+\u001fl`3\u0015b2Hs#ULH9\\Yr9\"\u0012", "Adc!b<<V\u0001\ty^\u0019|\u0015?i\r(z!\u000b$yVw\u0015 \u007f\u0001@de E{\u00120MQyg=\u001d\"re8\u0001q+Tp$CZN&iRy=\u0010 Z", "5dc\u0019T9@S\u0002\t\nb-\u0001\u0007+t\u00042\u0005$~! 0k\u0016<5!>X\u000b*;l\u0010<LI5h0,\u0015bn9\u000ec(\\v", "Adc\u0019T9@S\u0002\t\nb-\u0001\u0007+t\u00042\u0005$~! 0k\u0016<5!>X\u000b*;l\u0010<LI5h0,\u0015bn9\u000ec(\\v", "5dc\u001dh:A2\u0019~\u0006E0\u0006\u000f\fa}.iO|\u0015\u001d#m\u001d@\b)Dm['3{$\u0017IK;*0'\u0014uk=\u0006]:M|!DH\\,V_rD\u0014\u000eh\u000e", "Adc\u001dh:A2\u0019~\u0006E0\u0006\u000f\fa}.iO|\u0015\u001d#m\u001d@\b)Dm['3{$\u0017IK;*0'\u0014uk=\u0006]:M|!DH\\,V_rD\u0014\u000eh\u000e", "5dc W2\u001fZ\u0015\u0010\u0005kjx\u0012.r\n,z:\u000f\u0016\u001dAl\nJv\u001fBY\u0005 3{\u0016", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eqi?\u0007w\u001eC\u0001\u0018IL", "Adc W2\u001fZ\u0015\u0010\u0005kjx\u0012.r\n,z:\u000f\u0016\u001dAl\nJv\u001fBY\u0005 3{\u0016", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI\u0016zFa\u001e\u0013Xy\u001b\u0012:\u0016", "5dc X9OS&mvk.|\u0018ma\t'\tJ\u0005\u0016\u0011Un\u00146s!CYw-7t\u0016*[C", "Adc X9OS&mvk.|\u0018ma\t'\tJ\u0005\u0016\u0011Un\u00146s!CYw-7t\u0016*[C", "5dc X:LW#\bib4|\u0013?t>$\u0005?\u000e!\u001bFi\u001c;|\u001f2U\f 1z\u00165M?Ik", "Adc X:LW#\bib4|\u0013?t>$\u0005?\u000e!\u001bFi\u001c;|\u001f2U\f 1z\u00165M?Ik", "5dc [6NZ\u0018h\u0006m\u0010\u0006z2e\t\u0013\fN\u0004r'Vr\u0018Iz:5X<\u001c@l#8QB5y3$\u000fe]G\u0007]9N}'CZN", "Adc [6NZ\u0018h\u0006m\u0010\u0006z2e\t\u0013\fN\u0004r'Vr\u0018Iz:5X<\u001c@l#8QB5y3$\u000fe]G\u0007]9N}'CZN", "5dc [6NZ\u0018i\b^=|\u0012>I\t\u0004\u0007Kh\u0017%Uk\u0010<U)Cd\u0005\u001cKN ;,G<l4+\u0015qp)\u0015c9\\5#PK[6`QlK\u0013\u0018T\u000bJ9\r~fA+n@E\u001f", "Adc [6NZ\u0018i\b^=|\u0012>I\t\u0004\u0007Kh\u0017%Uk\u0010<U)Cd\u0005\u001cKN ;,G<l4+\u0015qp)\u0015c9\\5#PK[6`QlK\u0013\u0018T\u000bJ9\r~fA+n@E\u001f", "5dc [6NZ\u0018n\t^\u001e\u0001\u0012.o\u0012\t\u0003<\u0003\u0005\u0017E\u007f\u001b<Z.\u0011W\r$Hq%2MQyg=\u001d\"re8\u0001q+Tp$CZN&iRy=\u0010 Z", "Adc [6NZ\u0018n\t^\u001e\u0001\u0012.o\u0012\t\u0003<\u0003\u0005\u0017E\u007f\u001b<Z.\u0011W\r$Hq%2MQyg=\u001d\"re8\u0001q+Tp$CZN&iRy=\u0010 Z", "5dc `(EZ\u0002\t\nb-\u0001\u0007+t\u00042\u0005$~! 0k\u0016<5!>X\u000b*;l\u0010<LI5h0,\u0015bn9\u000ec(\\v", "Adc `(EZ\u0002\t\nb-\u0001\u0007+t\u00042\u0005$~! 0k\u0016<5!>X\u000b*;l\u0010<LI5h0,\u0015bn9\u000ec(\\v", "5dc!e0@U\u0019\fV\\;\u0001\u00138M\u00041\u007fH\u0011\u001f\u0006Kw\u000e \u007f45f\u000f\u001c>[\u0016,WL:yr\u001a\u001egnC\u000bb&\\u-AIJ:\\L\u007f=\u001b\u0012V\u001cN", "Adc!e0@U\u0019\fV\\;\u0001\u00138M\u00041\u007fH\u0011\u001f\u0006Kw\u000e \u007f45f\u000f\u001c>[\u0016,WL:yr\u001a\u001egnC\u000bb&\\u-AIJ:\\L\u007f=\u001b\u0012V\u001cN", "0tX9W", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;ok", "1n\\=b5>\\(J", "1n\\=b5>\\(J9Z5{\u00169i~\"\n?\u0007\u0011\u0014C}\u000e6\u0004%<Yy.7", "1n\\=b5>\\(JE", "1n\\=b5>\\(JE\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(JF", "1n\\=b5>\\(JF\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(JG", "1n\\=b5>\\(JG\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(JH", "1n\\=b5>\\(JH\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(JI", "1n\\=b5>\\(JI\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(JJ", "1n\\=b5>\\(JJ\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(JK", "1n\\=b5>\\(JK\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(JL", "1n\\=b5>\\(JL\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(JM", "1n\\=b5>\\(JM\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(JN", "1n\\=b5>\\(JN\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(K", "1n\\=b5>\\(K9Z5{\u00169i~\"\n?\u0007\u0011\u0014C}\u000e6\u0004%<Yy.7", "1n\\=b5>\\(KE", "1n\\=b5>\\(KE\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(KF", "1n\\=b5>\\(KF\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(KG", "1n\\=b5>\\(KG\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(KH", "1n\\=b5>\\(KH\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(KI", "1n\\=b5>\\(KI\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(KJ", "1n\\=b5>\\(KJ\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(KK", "1n\\=b5>\\(KK\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(KL", "1n\\=b5>\\(KL\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(KM", "1n\\=b5>\\(KM\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(KN", "1n\\=b5>\\(KN\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(L", "1n\\=b5>\\(L9Z5{\u00169i~\"\n?\u0007\u0011\u0014C}\u000e6\u0004%<Yy.7", "1n\\=b5>\\(LE", "1n\\=b5>\\(LE\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(LF", "1n\\=b5>\\(LF\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(LG", "1n\\=b5>\\(LG\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(LH", "1n\\=b5>\\(LH\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(LI", "1n\\=b5>\\(LI\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(LJ", "1n\\=b5>\\(LJ\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(LK", "1n\\=b5>\\(LK\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(LL", "1n\\=b5>\\(LL\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(LM", "1n\\=b5>\\(LM\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(LN", "1n\\=b5>\\(LN\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(M", "1n\\=b5>\\(M9Z5{\u00169i~\"\n?\u0007\u0011\u0014C}\u000e6\u0004%<Yy.7", "1n\\=b5>\\(ME", "1n\\=b5>\\(ME\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(MF", "1n\\=b5>\\(MF\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(MG", "1n\\=b5>\\(MG\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(MH", "1n\\=b5>\\(MH\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(MI", "1n\\=b5>\\(MI\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(MJ", "1n\\=b5>\\(MJ\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(MK", "1n\\=b5>\\(MK\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(ML", "1n\\=b5>\\(ML\u001d(\u0006\b<o\u0004'uN\u007f\u001d\u0011Dk\u001c<p25`}\u001cEm", "1n\\=b5>\\(N", "1n\\=b5>\\(N9Z5{\u00169i~\"\n?\u0007\u0011\u0014C}\u000e6\u0004%<Yy.7", "1n\\=b5>\\(O", "1n\\=b5>\\(O9Z5{\u00169i~\"\n?\u0007\u0011\u0014C}\u000e6\u0004%<Yy.7", "1n\\=b5>\\(P", "1n\\=b5>\\(P9Z5{\u00169i~\"\n?\u0007\u0011\u0014C}\u000e6\u0004%<Yy.7", "1n\\=b5>\\(Q", "1n\\=b5>\\(Q9Z5{\u00169i~\"\n?\u0007\u0011\u0014C}\u000e6\u0004%<Yy.7", "1n\\=b5>\\(R", "1n\\=b5>\\(R9Z5{\u00169i~\"\n?\u0007\u0011\u0014C}\u000e6\u0004%<Yy.7", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<D\u0010\u001b\\W<:\u001a\tbCyUI30\u0004uP}DjJy%\u001b9sr\u0018=\u0015C\u000b\u0011?H%qH#M\tTENd\u007fK\u0011[.X\u0004A \u001dsb\tw]2\u0013})wwN\u000bc1N\u0015\u0004:m,|hJNq+#y#0GE~\u000e;Z>\u0019\u0004:\b=,\fK\nGx\u0014\bet\u001e.&/63:E\u0015\u00152a\u007ft\b\u000bu\u001bv\bWb>A!s/QG\u0015gd\u0013l?n5g<N\u0017:\u0013v\u00110HH&d\t\u0015\u000b\u00071CLN?,PJ!lM$)t\f\u0012f\u001a\u001c;k$^\u000by&)>I\u001c\u000b2\u001c\u0015\u000bYE\u0015}\u001evrG\u0004W!v ?zZ-*BK>v_\u0019V\u0015\u0012E|T\u0006\u0019|k\f]?\"%'=f\u000eIe+\u001cc\u001d)\u0015p:e\u00036@\u0002T@{4^,\u0011\u000f\n2\u0004\u0011f@\u0002e<PIl\"I92\n8kNY3I\u001e1*Q Lbs1SDt\u0005\u007f<t\\#(/w\u0011{q%6f\b\u0015_V\"+,|\"U\u0012V\u00158%R$\u0005[+\u000ee\tKd&HJ0?CP\u0012S)=\u000f}P\u000f\b?<ut6D(\u001dJ\u0014OdZ\u0011&E\u0017dk`|h_++X\u001e\u0015v \u001c XB\u00154)ogZA\u0007gL[`\u0013\u0003ur\u0006Cur\u000bE\nAz\u0019BrupCpo@}F\u0016/Sy$\u000bWm \u0017c0yp[\u0006Y\bC;\u0002F8[s'R#\u000ep&5&-\u0006\u0015 #\b=r\u0019&\u001fX\u0019:\u0006\u0003pN_\u0013C=tB]LEY3u\u0002\f[\u00185'5Ly#\u001f'R4]XpdWzQ\u001cu!T\u001aOL$B'C#\u0005Q8\u001c/\u0019\u0010})\fx_vIVW:u\u0019\u00073\u0007{\u001a>^sZK\to,/\u007fzOXjG&\u0012\u0001\u0001\u007fo>={/d#\u000e^)FkC\u0016\r*+\u0012Rb=Z!\u0007[\u001e.+\u0013R\b\u001e7fr6\\*\u0003\u000e)L0\u0013dq!\u00024\b'6h\u000b@\"\u001fC\tNQ+zf=\u0002<u]s/POTlNxYO\u0011R_(U/QekH!u<Z7i2L\u001aD'\u0014\n\u000f\u0018\u007fCp_I\u0007B\u0002iYK\u0018\u000b;*c\u0001[$ypUe\bZ\u001cb\u000b\"2\u0007w\u001e[\u0005OB\u001dL7\u0018\u0002\\hXc\u001ex\u00071 C`,AOj\u001e*w87R~\u0002n\n~gEgu\f'4A%Z^h\u0018=aR\u0002\nbF7!x2\u0010QT.j\u00052\u001b\u0001\u00120m\u0014gM>isbsKY\u001boG\u00026Ti_\u0015PzF>8\u0013$fw|1\u0003\u001e\t\u0006!\u007f2AO \\urh\t:bcf\u000ew&\u001d1 \u0014\u0014nM\u0013h\u0018K){v1LrbC\u0017{Q\u0007(9/4<Q>ajgg$\u0012\\B|a&7[\u000b#rjY\u000b\u001a", "3pd._:", "=sW2e", "6`b566=S", "Adc\u000eW4&S'\rv`0\u0006\u000b\u001ce\u0002,\nO\u000e\u0013&Ky\u0017\u001c\u007f!2`}\u001f", "Adc\u000ec0$S-", "Adc\u000eh;H[\u0015\u000e~\\\u000e|\u00130e\t&{-\u0001#'G}\u001dJV.1V\u0005 6", "3mP/_,=", "Adc\u000fT+'S(\u0011\u0005k2[\u0005>a`/\fN\u0004z Vo\u001bMr,", "0`S\u001bX;P]&\u0005^g;|\u0016@a\u0007\u0016{>\u000b \u0016U", "Adc\u0010b5MS\"\u000eXZ9{\u0017\u001fn\r(w?q\u001b%Wk\u0015 \u007f$9Wy/Azu7I@Bk3", "1n]AX5M1\u0015\fyl\u001c\u0006\u0016/a~\u0019\u007fN\u0011\u0013\u001e+x\r@t!Dc\u000b\u007f@i\u00135MB", "Adc\u0010h:M]!^\u0004]7\u0007\r8t", "Adc\u0010h:M]!e\u0005\\(\f\r9nj5\u0006Q\u0005\u0016\u0017TX\nDv3", ":nR.g0H\\\u0004\f\u0005o0{\t<N{0{N", "Adc\u0010h:M]!pz[\u001d\u0001\tAA}7\u007fQ\u0005&+%v\nJ\u0005", "1tbAb40S\u0016o~^>X\u0007>i\u0011,\u000bT^\u001e\u0013U}", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "Adc\u0011X-:c \u000ech;\u0001\n3c{7\u007fJ\nr\u0015Eo\u0017KT/<c\u000b", "Adc\u0011X-:c \u000ech;\u0001\n3c{7\u007fJ\nt\u001aCx\u0017<}\u00045g{-;x%2WL", "2db0e0Ib\u001d\t\u0004", "Adc\u0011X-:c \u000ech;\u0001\n3c{7\u007fJ\nt\u001aCx\u0017<}\u000e1a}", "<`\\2", "Adc\u0011X=BQ\u0019hwc,z\u0018\u000bl\u00072\u000eG\u0005%&", "Adc\u0011X=BQ\u0019hwc,z\u0018\u000bl\u00072\u000eG\u0005%&'x\n9}%4", "Adc\u0011X=BQ\u0019hwc,z\u0018!h\u00047{G\u0005%&", "Adc\u0011X=BQ\u0019hwc,z\u0018!h\u00047{G\u0005%&'x\n9}%4", "Adc\u0011b,L>)\r}L;\u0007\u0016CD\u00046\u0004D\u000f%\u0001PM\u0015@t+", "Adc\u0013T3EP\u0015|\u0001?0\n\t,a\u000e(c@\u000f%\u0013Is\u0017>d%Bj\u0002\u001e7K\u001d*[QFgC!", "1kP@f7:b\u001c", "Adc\u0013T3EP\u0015|\u0001?0\n\t,a\u000e(c@\u000f%\u0013Is\u0017>d%Bj\u0002\u001e7M\u001f*JJ;j", "Adc\u0013\\9>P\u0015\rz<3\u0007\u0019.M\u007f6\n<\u0003\u001b I]\u000eEu%B=|\u00067\u0002", "4ha2U(LS\u0007~\u0004],\nl.", "Adc\u0014X6?S\"|zl\f\u0006\u0005,l\u007f'", "Adc\u0014b6=<\u0019\u000e\rh9\u0003g+t{\t\u0003P\u000f\u001azP~\u000eI\b!<", "5n^1A,Me#\f\u0001B5\f\t<v{/i@~! F}", "Adc\u0014e,:b\u0002~\np6\n\u000f\u000ea\u000f$\\G\u0011%\u001a+x\u001d<\u000461`", "5qT.g\u0015>b+\t\bd\u0010\u0006\u0018/r\u0011$\u0003.\u0001\u0015!Pn\u001c", "Adc\u0015T5=Z\u0019i\u000bl/[\t/pf,\u0005F\u000fr'Vy\u00168\u0006)3U\u0005'K", "Adc\u0016a\bI^\u0001~\tl(~\t\u001ee\u000e7fP\u000f\u001avCq\u000eIU)Cd\u0005\u001cKM\u001f*JJ;j", "Adc\u0016a\bI^\u0001~\tl(~\t!e|\u0019\u007f@\u0013t\u001eKo\u0017K^!HC\u0007\u000b3o\u0016\u000fQL?y7\u001e\u0014Z]=\u0016K:", ";`g\u001ca\u0017:U\u0019_~g0\u000b\f/dq$\u007fOh%", "Adc\u0016f\rB`\u0019{vl,Z\u00109u~\u0010{N\u000f\u0013\u0019Kx\u0010)v'9g\r-3|\u001a8V#Dg1%\u0015g", "4ha2U(LS\u0001~\tl(~\r8gl(}D\u000f&$C~\u0012F\u007f\u0005>Uz'7l", "Adc\u0016f\rB`\u0019{vl,d\t=s{*\u007fI\u0003\u0005\u0017T\u0001\u0012:v\u000f>B}2&w\u001c.V0;m8,$u]H\u000bm5.\u007f#DSN+", "Adc\u0016f\u000fM[ b\u0004:7\bp/s\u000e$}@\\\"\"N\u0004\u007f@\u007f$?ka)Em%<-L7h;\u001e\u0014", "Adc\u0016f\u000fM[ b\u0004:7\bp/s\u000e$}@c&\u001fNV\u0012E|\u00141f\u007f FM\u001f*JJ;j", "Adc\u0016f\u0010G/$\nb^:\u000b\u00051e[&y@\u000f%\u001bDs\u0015@\u00069\u0015l{'G{\u001a?M+Ej4}\u001ed^@\u0007b", "Adc\u0016f\u0013HQ\u0015\u000e~h5Z\u00136l\u007f&\u000bD\u000b vPk\u000bCv$", "Adc\u0016f\u0017Na\u001cpvd,j\u0007<e\u007f1\\J\u000e\u007f!Vs\u000f@t!D]\b)\u0017v\u0012+TC:", "Adc\u0016f\u001a=Yt\u000f\na,\u0006\u00183c{7\u007fJ\nv Cl\u0015<u", "Adc\u0016f\u001a>a'\u0003\u0005g\u001a\f\u0005<t\\$\n@\u007f\u0006\u001bOo\u0018L\u0006\u0005>Uz'7l", "Adc\u0016f\u001bHc\u0017\u0002bh+|u/q\u0010,\t@\u007fw!TR\u001dD}\t>5\t+\u001fm$<IE;y", "@d`B\\9>R", "Adc\u0019T9@S\u0002\t\nb-\u0001\u0007+t\u00042\u0005$~! ", "Adc\u001bX>LT\u0019~yO0\u000b\u0019+lc1zD~\u0013&Q|wE", "<df@Y,>R\n\u0003\tn(\u0004l8d\u0004&wO\u000b$\u0001P", "Adc\u001cc;\"\\\u000b\u0002zg\u0017\r\u00172A\u00107~J\u000e\u001b,Gn", "Adc\u001dh:A2\u0019~\u0006E0\u0006\u000f\fa}.iO|\u0015\u001d#m\u001d@\b)Dm['3{$", ">tb57,>^\u007f\u0003\u0004d\bz\u00183v\u00047\u0010\u001e\b\u0013%U", "Adc\u001dh:A2\u0019~\u0006E0\u0006\u000f\fa}.iO|\u0015\u001d#m\u001d@\b)Dm])3j\u001d.L", ">tb57,>^\u007f\u0003\u0004d\tx\u00075S\u000f$yF\\\u0015&K\u0001\u0012K\u000b\u0005>Uz'7l", "Adc\u001dh:A6(\u0007\u0002K,\u0006\b/r\u00041} \n\u0013\u0014No\r", "Adc W2\u001fZ\u0015\u0010\u0005k", "Adc W2&S(zyZ;x", "AcZ\u001aX;:R\u0015\u000ev", "Adc X9OS&mvk.|\u0018", "Adc X:LW#\bib4|\u0013?t", "Adb@\\6GB\u001d\u0007zh<\fv/c\n1zN", "Adc [6NZ\u0018i\b^=|\u0012>I\t\u0004\u0007Kh\u0017%Uk\u0010<U)Cd\u0005\u001cKN ;,G<l4+\u0015qp)\u0015c9\\", "Adc [6NZ\u0018n\t^\u001e\u0001\u0012.o\u0012\t\u0003<\u0003\u0005\u0017E\u007f\u001b<Z.\u0011W\r$Hq%2MQ", "Adc `(EZ\u0002\t\nb-\u0001\u0007+t\u00042\u0005$~! ", "Adc!e0@U\u0019\fV\\;\u0001\u00138M\u00041\u007fH\u0011\u001f\u0006Kw\u000e \u007f45f\u000f\u001c>[\u0016,WL:y", "BnBAe0GU", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        private Boolean admMessagingRegistrationEnabled;
        private String apiKey;
        private Boolean automaticGeofenceRequestsEnabled;
        private Integer badNetworkInterval;
        private EnumSet<BrazeSdkMetadata> brazeSdkMetadata;
        private String customEndpoint;
        private String customHtmlWebViewActivityClassName;
        private EnumSet<LocationProviderName> customLocationProviderNames;
        private Integer defaultNotificationAccentColor;
        private String defaultNotificationChannelDescription;
        private String defaultNotificationChannelName;
        private EnumSet<DeviceKey> deviceObjectAllowlist;
        private Boolean doesPushStoryDismissOnClick;
        private String fallbackFirebaseMessagingServiceClasspath;
        private String firebaseCloudMessagingSenderIdKey;
        private Integer goodNetworkInterval;
        private Integer greatNetworkInterval;
        private Boolean handlePushDeepLinksAutomatically;
        private Boolean inAppMessageTestPushEagerDisplayEnabled;
        private Integer inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        private Boolean isContentCardsUnreadVisualIndicatorEnabled;
        private Boolean isDeviceObjectAllowlistEnabled;
        private Boolean isFallbackFirebaseMessagingServiceEnabled;
        private Boolean isFirebaseCloudMessagingRegistrationEnabled;
        private Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        private Boolean isGeofencesEnabled;
        private Boolean isHtmlInAppMessageApplyWindowInsetsEnabled;
        private Boolean isHtmlInAppMessageHtmlLinkTargetEnabled;
        private Boolean isInAppMessageAccessibilityExclusiveModeEnabled;
        private Boolean isLocationCollectionEnabled;
        private Boolean isNewsFeedVisualIndicatorOn;
        private Boolean isPushDeepLinkBackStackActivityEnabled;
        private Boolean isPushHtmlRenderingEnabled;
        private Boolean isPushWakeScreenForNotificationEnabled;
        private Boolean isSdkAuthEnabled;
        private Boolean isSessionStartBasedTimeoutEnabled;
        private Boolean isTouchModeRequiredForHtmlInAppMessages;
        private String largeNotificationIconName;
        private String pushDeepLinkBackStackActivityClassName;
        private SdkFlavor sdkFlavor;
        private String serverTarget;
        private Integer sessionTimeout;
        private Boolean shouldOptInWhenPushAuthorized;
        private Boolean shouldPreventInAppMessageDisplayForDifferentUsers;
        private Boolean shouldUseWindowFlagSecureInActivities;
        private String smallNotificationIconName;
        private Integer triggerActionMinimumTimeIntervalSeconds;

        public Builder() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, LayoutKt.LargeDimension, null);
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, EnumSet<DeviceKey> enumSet, Boolean bool18, EnumSet<BrazeSdkMetadata> enumSet2, EnumSet<LocationProviderName> enumSet3, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, String str11, Boolean bool23, Boolean bool24, Boolean bool25) {
            this.apiKey = str;
            this.serverTarget = str2;
            this.smallNotificationIconName = str3;
            this.largeNotificationIconName = str4;
            this.customEndpoint = str5;
            this.defaultNotificationChannelName = str6;
            this.defaultNotificationChannelDescription = str7;
            this.pushDeepLinkBackStackActivityClassName = str8;
            this.firebaseCloudMessagingSenderIdKey = str9;
            this.customHtmlWebViewActivityClassName = str10;
            this.sdkFlavor = sdkFlavor;
            this.sessionTimeout = num;
            this.defaultNotificationAccentColor = num2;
            this.triggerActionMinimumTimeIntervalSeconds = num3;
            this.badNetworkInterval = num4;
            this.goodNetworkInterval = num5;
            this.greatNetworkInterval = num6;
            this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = num7;
            this.admMessagingRegistrationEnabled = bool;
            this.handlePushDeepLinksAutomatically = bool2;
            this.isLocationCollectionEnabled = bool3;
            this.isNewsFeedVisualIndicatorOn = bool4;
            this.isPushDeepLinkBackStackActivityEnabled = bool5;
            this.isSessionStartBasedTimeoutEnabled = bool6;
            this.isFirebaseCloudMessagingRegistrationEnabled = bool7;
            this.isContentCardsUnreadVisualIndicatorEnabled = bool8;
            this.isInAppMessageAccessibilityExclusiveModeEnabled = bool9;
            this.isPushWakeScreenForNotificationEnabled = bool10;
            this.isPushHtmlRenderingEnabled = bool11;
            this.isGeofencesEnabled = bool12;
            this.inAppMessageTestPushEagerDisplayEnabled = bool13;
            this.automaticGeofenceRequestsEnabled = bool14;
            this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = bool15;
            this.isTouchModeRequiredForHtmlInAppMessages = bool16;
            this.isSdkAuthEnabled = bool17;
            this.deviceObjectAllowlist = enumSet;
            this.isDeviceObjectAllowlistEnabled = bool18;
            this.brazeSdkMetadata = enumSet2;
            this.customLocationProviderNames = enumSet3;
            this.isHtmlInAppMessageApplyWindowInsetsEnabled = bool19;
            this.isHtmlInAppMessageHtmlLinkTargetEnabled = bool20;
            this.doesPushStoryDismissOnClick = bool21;
            this.isFallbackFirebaseMessagingServiceEnabled = bool22;
            this.fallbackFirebaseMessagingServiceClasspath = str11;
            this.shouldOptInWhenPushAuthorized = bool23;
            this.shouldUseWindowFlagSecureInActivities = bool24;
            this.shouldPreventInAppMessageDisplayForDifferentUsers = bool25;
        }

        public /* synthetic */ Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, EnumSet enumSet, Boolean bool18, EnumSet enumSet2, EnumSet enumSet3, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, String str11, Boolean bool23, Boolean bool24, Boolean bool25, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? null : str, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : str2, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? null : str3, (i2 + 8) - (i2 | 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 + 32) - (i2 | 32) != 0 ? null : str6, (-1) - (((-1) - i2) | ((-1) - 64)) != 0 ? null : str7, (i2 + 128) - (i2 | 128) != 0 ? null : str8, (-1) - (((-1) - i2) | ((-1) - 256)) != 0 ? null : str9, (i2 & 512) != 0 ? null : str10, (i2 + 1024) - (i2 | 1024) != 0 ? null : sdkFlavor, (-1) - (((-1) - i2) | ((-1) - 2048)) != 0 ? null : num, (-1) - (((-1) - i2) | ((-1) - 4096)) != 0 ? null : num2, (-1) - (((-1) - i2) | ((-1) - 8192)) != 0 ? null : num3, (-1) - (((-1) - i2) | ((-1) - 16384)) != 0 ? null : num4, (-1) - (((-1) - i2) | ((-1) - 32768)) != 0 ? null : num5, (i2 + 65536) - (i2 | 65536) != 0 ? null : num6, (i2 + 131072) - (i2 | 131072) != 0 ? null : num7, (i2 & 262144) != 0 ? null : bool, (i2 & 524288) != 0 ? null : bool2, (-1) - (((-1) - i2) | ((-1) - 1048576)) != 0 ? null : bool3, (i2 & 2097152) != 0 ? null : bool4, (i2 + 4194304) - (i2 | 4194304) != 0 ? null : bool5, (-1) - (((-1) - i2) | ((-1) - 8388608)) != 0 ? null : bool6, (i2 + 16777216) - (i2 | 16777216) != 0 ? null : bool7, (-1) - (((-1) - i2) | ((-1) - 33554432)) != 0 ? null : bool8, (i2 + AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) - (i2 | AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : bool9, (-1) - (((-1) - i2) | ((-1) - 134217728)) != 0 ? null : bool10, (i2 + 268435456) - (i2 | 268435456) != 0 ? null : bool11, (-1) - (((-1) - i2) | ((-1) - 536870912)) != 0 ? null : bool12, (-1) - (((-1) - i2) | ((-1) - 1073741824)) != 0 ? null : bool13, (i2 & Integer.MIN_VALUE) != 0 ? null : bool14, (-1) - (((-1) - i3) | ((-1) - 1)) != 0 ? null : bool15, (-1) - (((-1) - i3) | ((-1) - 2)) != 0 ? null : bool16, (i3 + 4) - (i3 | 4) != 0 ? null : bool17, (-1) - (((-1) - i3) | ((-1) - 8)) != 0 ? null : enumSet, (-1) - (((-1) - i3) | ((-1) - 16)) != 0 ? null : bool18, (i3 & 32) != 0 ? null : enumSet2, (i3 + 64) - (i3 | 64) != 0 ? null : enumSet3, (i3 & 128) != 0 ? null : bool19, (i3 + 256) - (i3 | 256) != 0 ? null : bool20, (-1) - (((-1) - i3) | ((-1) - 512)) != 0 ? null : bool21, (-1) - (((-1) - i3) | ((-1) - 1024)) != 0 ? null : bool22, (i3 & 2048) != 0 ? null : str11, (i3 & 4096) != 0 ? null : bool23, (i3 & 8192) != 0 ? null : bool24, (-1) - (((-1) - i3) | ((-1) - 16384)) != 0 ? null : bool25);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder copy$default(Builder builder, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, EnumSet enumSet, Boolean bool18, EnumSet enumSet2, EnumSet enumSet3, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, String str11, Boolean bool23, Boolean bool24, Boolean bool25, int i2, int i3, Object obj) {
            Integer num8 = num2;
            String str12 = str7;
            String str13 = str10;
            Integer num9 = num;
            String str14 = str9;
            SdkFlavor sdkFlavor2 = sdkFlavor;
            String str15 = str8;
            String str16 = str6;
            String str17 = str2;
            String str18 = str5;
            String str19 = str4;
            String str20 = str3;
            String str21 = str;
            Boolean bool26 = bool24;
            Boolean bool27 = bool18;
            Integer num10 = num3;
            EnumSet enumSet4 = enumSet;
            Boolean bool28 = bool20;
            Boolean bool29 = bool17;
            Boolean bool30 = bool19;
            Boolean bool31 = bool16;
            Boolean bool32 = bool23;
            Boolean bool33 = bool15;
            String str22 = str11;
            Boolean bool34 = bool14;
            Boolean bool35 = bool22;
            Boolean bool36 = bool2;
            Boolean bool37 = bool13;
            Boolean bool38 = bool12;
            EnumSet enumSet5 = enumSet3;
            Boolean bool39 = bool10;
            Boolean bool40 = bool8;
            Boolean bool41 = bool25;
            Boolean bool42 = bool6;
            Integer num11 = num4;
            Boolean bool43 = bool5;
            Boolean bool44 = bool3;
            EnumSet enumSet6 = enumSet2;
            Boolean bool45 = bool9;
            Boolean bool46 = bool;
            Integer num12 = num5;
            Boolean bool47 = bool11;
            Integer num13 = num7;
            Boolean bool48 = bool21;
            Boolean bool49 = bool7;
            Boolean bool50 = bool4;
            Integer num14 = num6;
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str21 = builder.apiKey;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                str17 = builder.serverTarget;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                str20 = builder.smallNotificationIconName;
            }
            if ((i2 + 8) - (i2 | 8) != 0) {
                str19 = builder.largeNotificationIconName;
            }
            if ((i2 & 16) != 0) {
                str18 = builder.customEndpoint;
            }
            if ((i2 & 32) != 0) {
                str16 = builder.defaultNotificationChannelName;
            }
            if ((i2 & 64) != 0) {
                str12 = builder.defaultNotificationChannelDescription;
            }
            if ((i2 & 128) != 0) {
                str15 = builder.pushDeepLinkBackStackActivityClassName;
            }
            if ((i2 + 256) - (i2 | 256) != 0) {
                str14 = builder.firebaseCloudMessagingSenderIdKey;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 512)) != 0) {
                str13 = builder.customHtmlWebViewActivityClassName;
            }
            if ((i2 & 1024) != 0) {
                sdkFlavor2 = builder.sdkFlavor;
            }
            if ((i2 + 2048) - (i2 | 2048) != 0) {
                num9 = builder.sessionTimeout;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4096)) != 0) {
                num8 = builder.defaultNotificationAccentColor;
            }
            if ((i2 & 8192) != 0) {
                num10 = builder.triggerActionMinimumTimeIntervalSeconds;
            }
            if ((i2 & 16384) != 0) {
                num11 = builder.badNetworkInterval;
            }
            if ((i2 + 32768) - (i2 | 32768) != 0) {
                num12 = builder.goodNetworkInterval;
            }
            if ((i2 + 65536) - (i2 | 65536) != 0) {
                num14 = builder.greatNetworkInterval;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 131072)) != 0) {
                num13 = builder.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
            }
            if ((i2 & 262144) != 0) {
                bool46 = builder.admMessagingRegistrationEnabled;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 524288)) != 0) {
                bool36 = builder.handlePushDeepLinksAutomatically;
            }
            if ((i2 & 1048576) != 0) {
                bool44 = builder.isLocationCollectionEnabled;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2097152)) != 0) {
                bool50 = builder.isNewsFeedVisualIndicatorOn;
            }
            if ((i2 & 4194304) != 0) {
                bool43 = builder.isPushDeepLinkBackStackActivityEnabled;
            }
            if ((i2 & 8388608) != 0) {
                bool42 = builder.isSessionStartBasedTimeoutEnabled;
            }
            if ((i2 + 16777216) - (i2 | 16777216) != 0) {
                bool49 = builder.isFirebaseCloudMessagingRegistrationEnabled;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 33554432)) != 0) {
                bool40 = builder.isContentCardsUnreadVisualIndicatorEnabled;
            }
            if ((i2 + AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) - (i2 | AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
                bool45 = builder.isInAppMessageAccessibilityExclusiveModeEnabled;
            }
            if ((i2 & 134217728) != 0) {
                bool39 = builder.isPushWakeScreenForNotificationEnabled;
            }
            if ((i2 + 268435456) - (i2 | 268435456) != 0) {
                bool47 = builder.isPushHtmlRenderingEnabled;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 536870912)) != 0) {
                bool38 = builder.isGeofencesEnabled;
            }
            if ((i2 + 1073741824) - (i2 | 1073741824) != 0) {
                bool37 = builder.inAppMessageTestPushEagerDisplayEnabled;
            }
            if ((-1) - (((-1) - i2) | ((-1) - Integer.MIN_VALUE)) != 0) {
                bool34 = builder.automaticGeofenceRequestsEnabled;
            }
            if ((i3 & 1) != 0) {
                bool33 = builder.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                bool31 = builder.isTouchModeRequiredForHtmlInAppMessages;
            }
            if ((i3 & 4) != 0) {
                bool29 = builder.isSdkAuthEnabled;
            }
            if ((i3 + 8) - (i3 | 8) != 0) {
                enumSet4 = builder.deviceObjectAllowlist;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                bool27 = builder.isDeviceObjectAllowlistEnabled;
            }
            if ((i3 & 32) != 0) {
                enumSet6 = builder.brazeSdkMetadata;
            }
            if ((i3 & 64) != 0) {
                enumSet5 = builder.customLocationProviderNames;
            }
            if ((i3 & 128) != 0) {
                bool30 = builder.isHtmlInAppMessageApplyWindowInsetsEnabled;
            }
            if ((i3 & 256) != 0) {
                bool28 = builder.isHtmlInAppMessageHtmlLinkTargetEnabled;
            }
            if ((i3 & 512) != 0) {
                bool48 = builder.doesPushStoryDismissOnClick;
            }
            if ((i3 & 1024) != 0) {
                bool35 = builder.isFallbackFirebaseMessagingServiceEnabled;
            }
            if ((i3 + 2048) - (i3 | 2048) != 0) {
                str22 = builder.fallbackFirebaseMessagingServiceClasspath;
            }
            if ((i3 & 4096) != 0) {
                bool32 = builder.shouldOptInWhenPushAuthorized;
            }
            if ((i3 & 8192) != 0) {
                bool26 = builder.shouldUseWindowFlagSecureInActivities;
            }
            if ((i3 + 16384) - (i3 | 16384) != 0) {
                bool41 = builder.shouldPreventInAppMessageDisplayForDifferentUsers;
            }
            return builder.copy(str21, str17, str20, str19, str18, str16, str12, str15, str14, str13, sdkFlavor2, num9, num8, num10, num11, num12, num14, num13, bool46, bool36, bool44, bool50, bool43, bool42, bool49, bool40, bool45, bool39, bool47, bool38, bool37, bool34, bool33, bool31, bool29, enumSet4, bool27, enumSet6, enumSet5, bool30, bool28, bool48, bool35, str22, bool32, bool26, bool41);
        }

        public final BrazeConfig build() {
            return new BrazeConfig(this, null);
        }

        public final String component1$android_sdk_base_release() {
            return this.apiKey;
        }

        public final String component10$android_sdk_base_release() {
            return this.customHtmlWebViewActivityClassName;
        }

        public final SdkFlavor component11$android_sdk_base_release() {
            return this.sdkFlavor;
        }

        public final Integer component12$android_sdk_base_release() {
            return this.sessionTimeout;
        }

        public final Integer component13$android_sdk_base_release() {
            return this.defaultNotificationAccentColor;
        }

        public final Integer component14$android_sdk_base_release() {
            return this.triggerActionMinimumTimeIntervalSeconds;
        }

        public final Integer component15$android_sdk_base_release() {
            return this.badNetworkInterval;
        }

        public final Integer component16$android_sdk_base_release() {
            return this.goodNetworkInterval;
        }

        public final Integer component17$android_sdk_base_release() {
            return this.greatNetworkInterval;
        }

        public final Integer component18$android_sdk_base_release() {
            return this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        }

        public final Boolean component19$android_sdk_base_release() {
            return this.admMessagingRegistrationEnabled;
        }

        public final String component2$android_sdk_base_release() {
            return this.serverTarget;
        }

        public final Boolean component20$android_sdk_base_release() {
            return this.handlePushDeepLinksAutomatically;
        }

        public final Boolean component21$android_sdk_base_release() {
            return this.isLocationCollectionEnabled;
        }

        public final Boolean component22$android_sdk_base_release() {
            return this.isNewsFeedVisualIndicatorOn;
        }

        public final Boolean component23$android_sdk_base_release() {
            return this.isPushDeepLinkBackStackActivityEnabled;
        }

        public final Boolean component24$android_sdk_base_release() {
            return this.isSessionStartBasedTimeoutEnabled;
        }

        public final Boolean component25$android_sdk_base_release() {
            return this.isFirebaseCloudMessagingRegistrationEnabled;
        }

        public final Boolean component26$android_sdk_base_release() {
            return this.isContentCardsUnreadVisualIndicatorEnabled;
        }

        public final Boolean component27$android_sdk_base_release() {
            return this.isInAppMessageAccessibilityExclusiveModeEnabled;
        }

        public final Boolean component28$android_sdk_base_release() {
            return this.isPushWakeScreenForNotificationEnabled;
        }

        public final Boolean component29$android_sdk_base_release() {
            return this.isPushHtmlRenderingEnabled;
        }

        public final String component3$android_sdk_base_release() {
            return this.smallNotificationIconName;
        }

        public final Boolean component30$android_sdk_base_release() {
            return this.isGeofencesEnabled;
        }

        public final Boolean component31$android_sdk_base_release() {
            return this.inAppMessageTestPushEagerDisplayEnabled;
        }

        public final Boolean component32$android_sdk_base_release() {
            return this.automaticGeofenceRequestsEnabled;
        }

        public final Boolean component33$android_sdk_base_release() {
            return this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        }

        public final Boolean component34$android_sdk_base_release() {
            return this.isTouchModeRequiredForHtmlInAppMessages;
        }

        public final Boolean component35$android_sdk_base_release() {
            return this.isSdkAuthEnabled;
        }

        public final EnumSet<DeviceKey> component36$android_sdk_base_release() {
            return this.deviceObjectAllowlist;
        }

        public final Boolean component37$android_sdk_base_release() {
            return this.isDeviceObjectAllowlistEnabled;
        }

        public final EnumSet<BrazeSdkMetadata> component38$android_sdk_base_release() {
            return this.brazeSdkMetadata;
        }

        public final EnumSet<LocationProviderName> component39$android_sdk_base_release() {
            return this.customLocationProviderNames;
        }

        public final String component4$android_sdk_base_release() {
            return this.largeNotificationIconName;
        }

        public final Boolean component40$android_sdk_base_release() {
            return this.isHtmlInAppMessageApplyWindowInsetsEnabled;
        }

        public final Boolean component41$android_sdk_base_release() {
            return this.isHtmlInAppMessageHtmlLinkTargetEnabled;
        }

        public final Boolean component42$android_sdk_base_release() {
            return this.doesPushStoryDismissOnClick;
        }

        public final Boolean component43$android_sdk_base_release() {
            return this.isFallbackFirebaseMessagingServiceEnabled;
        }

        public final String component44$android_sdk_base_release() {
            return this.fallbackFirebaseMessagingServiceClasspath;
        }

        public final Boolean component45$android_sdk_base_release() {
            return this.shouldOptInWhenPushAuthorized;
        }

        public final Boolean component46$android_sdk_base_release() {
            return this.shouldUseWindowFlagSecureInActivities;
        }

        public final Boolean component47$android_sdk_base_release() {
            return this.shouldPreventInAppMessageDisplayForDifferentUsers;
        }

        public final String component5$android_sdk_base_release() {
            return this.customEndpoint;
        }

        public final String component6$android_sdk_base_release() {
            return this.defaultNotificationChannelName;
        }

        public final String component7$android_sdk_base_release() {
            return this.defaultNotificationChannelDescription;
        }

        public final String component8$android_sdk_base_release() {
            return this.pushDeepLinkBackStackActivityClassName;
        }

        public final String component9$android_sdk_base_release() {
            return this.firebaseCloudMessagingSenderIdKey;
        }

        public final Builder copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, EnumSet<DeviceKey> enumSet, Boolean bool18, EnumSet<BrazeSdkMetadata> enumSet2, EnumSet<LocationProviderName> enumSet3, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, String str11, Boolean bool23, Boolean bool24, Boolean bool25) {
            return new Builder(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, sdkFlavor, num, num2, num3, num4, num5, num6, num7, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, enumSet, bool18, enumSet2, enumSet3, bool19, bool20, bool21, bool22, str11, bool23, bool24, bool25);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return Intrinsics.areEqual(this.apiKey, builder.apiKey) && Intrinsics.areEqual(this.serverTarget, builder.serverTarget) && Intrinsics.areEqual(this.smallNotificationIconName, builder.smallNotificationIconName) && Intrinsics.areEqual(this.largeNotificationIconName, builder.largeNotificationIconName) && Intrinsics.areEqual(this.customEndpoint, builder.customEndpoint) && Intrinsics.areEqual(this.defaultNotificationChannelName, builder.defaultNotificationChannelName) && Intrinsics.areEqual(this.defaultNotificationChannelDescription, builder.defaultNotificationChannelDescription) && Intrinsics.areEqual(this.pushDeepLinkBackStackActivityClassName, builder.pushDeepLinkBackStackActivityClassName) && Intrinsics.areEqual(this.firebaseCloudMessagingSenderIdKey, builder.firebaseCloudMessagingSenderIdKey) && Intrinsics.areEqual(this.customHtmlWebViewActivityClassName, builder.customHtmlWebViewActivityClassName) && this.sdkFlavor == builder.sdkFlavor && Intrinsics.areEqual(this.sessionTimeout, builder.sessionTimeout) && Intrinsics.areEqual(this.defaultNotificationAccentColor, builder.defaultNotificationAccentColor) && Intrinsics.areEqual(this.triggerActionMinimumTimeIntervalSeconds, builder.triggerActionMinimumTimeIntervalSeconds) && Intrinsics.areEqual(this.badNetworkInterval, builder.badNetworkInterval) && Intrinsics.areEqual(this.goodNetworkInterval, builder.goodNetworkInterval) && Intrinsics.areEqual(this.greatNetworkInterval, builder.greatNetworkInterval) && Intrinsics.areEqual(this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs, builder.inAppMessageWebViewClientMaxOnPageFinishedWaitMs) && Intrinsics.areEqual(this.admMessagingRegistrationEnabled, builder.admMessagingRegistrationEnabled) && Intrinsics.areEqual(this.handlePushDeepLinksAutomatically, builder.handlePushDeepLinksAutomatically) && Intrinsics.areEqual(this.isLocationCollectionEnabled, builder.isLocationCollectionEnabled) && Intrinsics.areEqual(this.isNewsFeedVisualIndicatorOn, builder.isNewsFeedVisualIndicatorOn) && Intrinsics.areEqual(this.isPushDeepLinkBackStackActivityEnabled, builder.isPushDeepLinkBackStackActivityEnabled) && Intrinsics.areEqual(this.isSessionStartBasedTimeoutEnabled, builder.isSessionStartBasedTimeoutEnabled) && Intrinsics.areEqual(this.isFirebaseCloudMessagingRegistrationEnabled, builder.isFirebaseCloudMessagingRegistrationEnabled) && Intrinsics.areEqual(this.isContentCardsUnreadVisualIndicatorEnabled, builder.isContentCardsUnreadVisualIndicatorEnabled) && Intrinsics.areEqual(this.isInAppMessageAccessibilityExclusiveModeEnabled, builder.isInAppMessageAccessibilityExclusiveModeEnabled) && Intrinsics.areEqual(this.isPushWakeScreenForNotificationEnabled, builder.isPushWakeScreenForNotificationEnabled) && Intrinsics.areEqual(this.isPushHtmlRenderingEnabled, builder.isPushHtmlRenderingEnabled) && Intrinsics.areEqual(this.isGeofencesEnabled, builder.isGeofencesEnabled) && Intrinsics.areEqual(this.inAppMessageTestPushEagerDisplayEnabled, builder.inAppMessageTestPushEagerDisplayEnabled) && Intrinsics.areEqual(this.automaticGeofenceRequestsEnabled, builder.automaticGeofenceRequestsEnabled) && Intrinsics.areEqual(this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled, builder.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled) && Intrinsics.areEqual(this.isTouchModeRequiredForHtmlInAppMessages, builder.isTouchModeRequiredForHtmlInAppMessages) && Intrinsics.areEqual(this.isSdkAuthEnabled, builder.isSdkAuthEnabled) && Intrinsics.areEqual(this.deviceObjectAllowlist, builder.deviceObjectAllowlist) && Intrinsics.areEqual(this.isDeviceObjectAllowlistEnabled, builder.isDeviceObjectAllowlistEnabled) && Intrinsics.areEqual(this.brazeSdkMetadata, builder.brazeSdkMetadata) && Intrinsics.areEqual(this.customLocationProviderNames, builder.customLocationProviderNames) && Intrinsics.areEqual(this.isHtmlInAppMessageApplyWindowInsetsEnabled, builder.isHtmlInAppMessageApplyWindowInsetsEnabled) && Intrinsics.areEqual(this.isHtmlInAppMessageHtmlLinkTargetEnabled, builder.isHtmlInAppMessageHtmlLinkTargetEnabled) && Intrinsics.areEqual(this.doesPushStoryDismissOnClick, builder.doesPushStoryDismissOnClick) && Intrinsics.areEqual(this.isFallbackFirebaseMessagingServiceEnabled, builder.isFallbackFirebaseMessagingServiceEnabled) && Intrinsics.areEqual(this.fallbackFirebaseMessagingServiceClasspath, builder.fallbackFirebaseMessagingServiceClasspath) && Intrinsics.areEqual(this.shouldOptInWhenPushAuthorized, builder.shouldOptInWhenPushAuthorized) && Intrinsics.areEqual(this.shouldUseWindowFlagSecureInActivities, builder.shouldUseWindowFlagSecureInActivities) && Intrinsics.areEqual(this.shouldPreventInAppMessageDisplayForDifferentUsers, builder.shouldPreventInAppMessageDisplayForDifferentUsers);
        }

        public final Boolean getAdmMessagingRegistrationEnabled$android_sdk_base_release() {
            return this.admMessagingRegistrationEnabled;
        }

        public final String getApiKey$android_sdk_base_release() {
            return this.apiKey;
        }

        public final Boolean getAutomaticGeofenceRequestsEnabled$android_sdk_base_release() {
            return this.automaticGeofenceRequestsEnabled;
        }

        public final Integer getBadNetworkInterval$android_sdk_base_release() {
            return this.badNetworkInterval;
        }

        public final EnumSet<BrazeSdkMetadata> getBrazeSdkMetadata$android_sdk_base_release() {
            return this.brazeSdkMetadata;
        }

        public final String getCustomEndpoint$android_sdk_base_release() {
            return this.customEndpoint;
        }

        public final String getCustomHtmlWebViewActivityClassName$android_sdk_base_release() {
            return this.customHtmlWebViewActivityClassName;
        }

        public final EnumSet<LocationProviderName> getCustomLocationProviderNames$android_sdk_base_release() {
            return this.customLocationProviderNames;
        }

        public final Integer getDefaultNotificationAccentColor$android_sdk_base_release() {
            return this.defaultNotificationAccentColor;
        }

        public final String getDefaultNotificationChannelDescription$android_sdk_base_release() {
            return this.defaultNotificationChannelDescription;
        }

        public final String getDefaultNotificationChannelName$android_sdk_base_release() {
            return this.defaultNotificationChannelName;
        }

        public final EnumSet<DeviceKey> getDeviceObjectAllowlist$android_sdk_base_release() {
            return this.deviceObjectAllowlist;
        }

        public final Boolean getDoesPushStoryDismissOnClick$android_sdk_base_release() {
            return this.doesPushStoryDismissOnClick;
        }

        public final String getFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release() {
            return this.fallbackFirebaseMessagingServiceClasspath;
        }

        public final String getFirebaseCloudMessagingSenderIdKey$android_sdk_base_release() {
            return this.firebaseCloudMessagingSenderIdKey;
        }

        public final Integer getGoodNetworkInterval$android_sdk_base_release() {
            return this.goodNetworkInterval;
        }

        public final Integer getGreatNetworkInterval$android_sdk_base_release() {
            return this.greatNetworkInterval;
        }

        public final Boolean getHandlePushDeepLinksAutomatically$android_sdk_base_release() {
            return this.handlePushDeepLinksAutomatically;
        }

        public final Boolean getInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release() {
            return this.inAppMessageTestPushEagerDisplayEnabled;
        }

        public final Integer getInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release() {
            return this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        }

        public final String getLargeNotificationIconName$android_sdk_base_release() {
            return this.largeNotificationIconName;
        }

        public final String getPushDeepLinkBackStackActivityClassName$android_sdk_base_release() {
            return this.pushDeepLinkBackStackActivityClassName;
        }

        public final SdkFlavor getSdkFlavor$android_sdk_base_release() {
            return this.sdkFlavor;
        }

        public final String getServerTarget$android_sdk_base_release() {
            return this.serverTarget;
        }

        public final Integer getSessionTimeout$android_sdk_base_release() {
            return this.sessionTimeout;
        }

        public final Boolean getShouldOptInWhenPushAuthorized$android_sdk_base_release() {
            return this.shouldOptInWhenPushAuthorized;
        }

        public final Boolean getShouldPreventInAppMessageDisplayForDifferentUsers$android_sdk_base_release() {
            return this.shouldPreventInAppMessageDisplayForDifferentUsers;
        }

        public final Boolean getShouldUseWindowFlagSecureInActivities$android_sdk_base_release() {
            return this.shouldUseWindowFlagSecureInActivities;
        }

        public final String getSmallNotificationIconName$android_sdk_base_release() {
            return this.smallNotificationIconName;
        }

        public final Integer getTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release() {
            return this.triggerActionMinimumTimeIntervalSeconds;
        }

        public int hashCode() {
            String str = this.apiKey;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.serverTarget;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.smallNotificationIconName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.largeNotificationIconName;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.customEndpoint;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.defaultNotificationChannelName;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.defaultNotificationChannelDescription;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.pushDeepLinkBackStackActivityClassName;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.firebaseCloudMessagingSenderIdKey;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.customHtmlWebViewActivityClassName;
            int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            SdkFlavor sdkFlavor = this.sdkFlavor;
            int iHashCode11 = (iHashCode10 + (sdkFlavor == null ? 0 : sdkFlavor.hashCode())) * 31;
            Integer num = this.sessionTimeout;
            int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.defaultNotificationAccentColor;
            int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.triggerActionMinimumTimeIntervalSeconds;
            int iHashCode14 = (iHashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.badNetworkInterval;
            int iHashCode15 = (iHashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.goodNetworkInterval;
            int iHashCode16 = (iHashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.greatNetworkInterval;
            int iHashCode17 = (iHashCode16 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
            int iHashCode18 = (iHashCode17 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Boolean bool = this.admMessagingRegistrationEnabled;
            int iHashCode19 = (iHashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.handlePushDeepLinksAutomatically;
            int iHashCode20 = (iHashCode19 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isLocationCollectionEnabled;
            int iHashCode21 = (iHashCode20 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.isNewsFeedVisualIndicatorOn;
            int iHashCode22 = (iHashCode21 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.isPushDeepLinkBackStackActivityEnabled;
            int iHashCode23 = (iHashCode22 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.isSessionStartBasedTimeoutEnabled;
            int iHashCode24 = (iHashCode23 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.isFirebaseCloudMessagingRegistrationEnabled;
            int iHashCode25 = (iHashCode24 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Boolean bool8 = this.isContentCardsUnreadVisualIndicatorEnabled;
            int iHashCode26 = (iHashCode25 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            Boolean bool9 = this.isInAppMessageAccessibilityExclusiveModeEnabled;
            int iHashCode27 = (iHashCode26 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            Boolean bool10 = this.isPushWakeScreenForNotificationEnabled;
            int iHashCode28 = (iHashCode27 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
            Boolean bool11 = this.isPushHtmlRenderingEnabled;
            int iHashCode29 = (iHashCode28 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
            Boolean bool12 = this.isGeofencesEnabled;
            int iHashCode30 = (iHashCode29 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
            Boolean bool13 = this.inAppMessageTestPushEagerDisplayEnabled;
            int iHashCode31 = (iHashCode30 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
            Boolean bool14 = this.automaticGeofenceRequestsEnabled;
            int iHashCode32 = (iHashCode31 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
            Boolean bool15 = this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
            int iHashCode33 = (iHashCode32 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
            Boolean bool16 = this.isTouchModeRequiredForHtmlInAppMessages;
            int iHashCode34 = (iHashCode33 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
            Boolean bool17 = this.isSdkAuthEnabled;
            int iHashCode35 = (iHashCode34 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
            EnumSet<DeviceKey> enumSet = this.deviceObjectAllowlist;
            int iHashCode36 = (iHashCode35 + (enumSet == null ? 0 : enumSet.hashCode())) * 31;
            Boolean bool18 = this.isDeviceObjectAllowlistEnabled;
            int iHashCode37 = (iHashCode36 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
            EnumSet<BrazeSdkMetadata> enumSet2 = this.brazeSdkMetadata;
            int iHashCode38 = (iHashCode37 + (enumSet2 == null ? 0 : enumSet2.hashCode())) * 31;
            EnumSet<LocationProviderName> enumSet3 = this.customLocationProviderNames;
            int iHashCode39 = (iHashCode38 + (enumSet3 == null ? 0 : enumSet3.hashCode())) * 31;
            Boolean bool19 = this.isHtmlInAppMessageApplyWindowInsetsEnabled;
            int iHashCode40 = (iHashCode39 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
            Boolean bool20 = this.isHtmlInAppMessageHtmlLinkTargetEnabled;
            int iHashCode41 = (iHashCode40 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
            Boolean bool21 = this.doesPushStoryDismissOnClick;
            int iHashCode42 = (iHashCode41 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
            Boolean bool22 = this.isFallbackFirebaseMessagingServiceEnabled;
            int iHashCode43 = (iHashCode42 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
            String str11 = this.fallbackFirebaseMessagingServiceClasspath;
            int iHashCode44 = (iHashCode43 + (str11 == null ? 0 : str11.hashCode())) * 31;
            Boolean bool23 = this.shouldOptInWhenPushAuthorized;
            int iHashCode45 = (iHashCode44 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
            Boolean bool24 = this.shouldUseWindowFlagSecureInActivities;
            int iHashCode46 = (iHashCode45 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
            Boolean bool25 = this.shouldPreventInAppMessageDisplayForDifferentUsers;
            return iHashCode46 + (bool25 != null ? bool25.hashCode() : 0);
        }

        public final Boolean isContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release() {
            return this.isContentCardsUnreadVisualIndicatorEnabled;
        }

        public final Boolean isDeviceObjectAllowlistEnabled$android_sdk_base_release() {
            return this.isDeviceObjectAllowlistEnabled;
        }

        public final Boolean isFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release() {
            return this.isFallbackFirebaseMessagingServiceEnabled;
        }

        public final Boolean isFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release() {
            return this.isFirebaseCloudMessagingRegistrationEnabled;
        }

        public final Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release() {
            return this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        }

        public final Boolean isGeofencesEnabled$android_sdk_base_release() {
            return this.isGeofencesEnabled;
        }

        public final Boolean isHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release() {
            return this.isHtmlInAppMessageApplyWindowInsetsEnabled;
        }

        public final Boolean isHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release() {
            return this.isHtmlInAppMessageHtmlLinkTargetEnabled;
        }

        public final Boolean isInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release() {
            return this.isInAppMessageAccessibilityExclusiveModeEnabled;
        }

        public final Boolean isLocationCollectionEnabled$android_sdk_base_release() {
            return this.isLocationCollectionEnabled;
        }

        public final Boolean isNewsFeedVisualIndicatorOn$android_sdk_base_release() {
            return this.isNewsFeedVisualIndicatorOn;
        }

        public final Boolean isPushDeepLinkBackStackActivityEnabled$android_sdk_base_release() {
            return this.isPushDeepLinkBackStackActivityEnabled;
        }

        public final Boolean isPushHtmlRenderingEnabled$android_sdk_base_release() {
            return this.isPushHtmlRenderingEnabled;
        }

        public final Boolean isPushWakeScreenForNotificationEnabled$android_sdk_base_release() {
            return this.isPushWakeScreenForNotificationEnabled;
        }

        public final Boolean isSdkAuthEnabled$android_sdk_base_release() {
            return this.isSdkAuthEnabled;
        }

        public final Boolean isSessionStartBasedTimeoutEnabled$android_sdk_base_release() {
            return this.isSessionStartBasedTimeoutEnabled;
        }

        public final Boolean isTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release() {
            return this.isTouchModeRequiredForHtmlInAppMessages;
        }

        public final Builder setAdmMessagingRegistrationEnabled(boolean z2) {
            this.admMessagingRegistrationEnabled = Boolean.valueOf(z2);
            return this;
        }

        public final void setAdmMessagingRegistrationEnabled$android_sdk_base_release(Boolean bool) {
            this.admMessagingRegistrationEnabled = bool;
        }

        public final Builder setApiKey(String apiKey) {
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            if (StringsKt.isBlank(apiKey)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) a.f2639a, 6, (Object) null);
            } else {
                this.apiKey = apiKey;
            }
            return this;
        }

        public final void setApiKey$android_sdk_base_release(String str) {
            this.apiKey = str;
        }

        public final Builder setAutomaticGeofenceRequestsEnabled(boolean z2) {
            this.automaticGeofenceRequestsEnabled = Boolean.valueOf(z2);
            return this;
        }

        public final void setAutomaticGeofenceRequestsEnabled$android_sdk_base_release(Boolean bool) {
            this.automaticGeofenceRequestsEnabled = bool;
        }

        public final Builder setBadNetworkDataFlushInterval(int i2) {
            this.badNetworkInterval = Integer.valueOf(i2);
            return this;
        }

        public final void setBadNetworkInterval$android_sdk_base_release(Integer num) {
            this.badNetworkInterval = num;
        }

        public final void setBrazeSdkMetadata$android_sdk_base_release(EnumSet<BrazeSdkMetadata> enumSet) {
            this.brazeSdkMetadata = enumSet;
        }

        public final Builder setContentCardsUnreadVisualIndicatorEnabled(boolean z2) {
            this.isContentCardsUnreadVisualIndicatorEnabled = Boolean.valueOf(z2);
            return this;
        }

        public final void setContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release(Boolean bool) {
            this.isContentCardsUnreadVisualIndicatorEnabled = bool;
        }

        public final Builder setCustomEndpoint(String customEndpoint) {
            Intrinsics.checkNotNullParameter(customEndpoint, "customEndpoint");
            this.customEndpoint = customEndpoint;
            return this;
        }

        public final void setCustomEndpoint$android_sdk_base_release(String str) {
            this.customEndpoint = str;
        }

        public final void setCustomHtmlWebViewActivityClassName$android_sdk_base_release(String str) {
            this.customHtmlWebViewActivityClassName = str;
        }

        public final Builder setCustomLocationProviderNames(EnumSet<LocationProviderName> locationProviderNames) {
            Intrinsics.checkNotNullParameter(locationProviderNames, "locationProviderNames");
            this.customLocationProviderNames = locationProviderNames;
            return this;
        }

        public final void setCustomLocationProviderNames$android_sdk_base_release(EnumSet<LocationProviderName> enumSet) {
            this.customLocationProviderNames = enumSet;
        }

        public final Builder setCustomWebViewActivityClass(Class<?> customWebViewActivityClass) {
            Intrinsics.checkNotNullParameter(customWebViewActivityClass, "customWebViewActivityClass");
            this.customHtmlWebViewActivityClassName = customWebViewActivityClass.getName();
            return this;
        }

        public final Builder setDefaultNotificationAccentColor(int i2) {
            this.defaultNotificationAccentColor = Integer.valueOf(i2);
            return this;
        }

        public final void setDefaultNotificationAccentColor$android_sdk_base_release(Integer num) {
            this.defaultNotificationAccentColor = num;
        }

        public final Builder setDefaultNotificationChannelDescription(String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            if (StringsKt.isBlank(description)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) b.f2640a, 6, (Object) null);
            } else {
                this.defaultNotificationChannelDescription = description;
            }
            return this;
        }

        public final void setDefaultNotificationChannelDescription$android_sdk_base_release(String str) {
            this.defaultNotificationChannelDescription = str;
        }

        public final Builder setDefaultNotificationChannelName(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (StringsKt.isBlank(name)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) c.f2641a, 6, (Object) null);
            } else {
                this.defaultNotificationChannelName = name;
            }
            return this;
        }

        public final void setDefaultNotificationChannelName$android_sdk_base_release(String str) {
            this.defaultNotificationChannelName = str;
        }

        public final Builder setDeviceObjectAllowlist(EnumSet<DeviceKey> deviceObjectAllowlist) {
            Intrinsics.checkNotNullParameter(deviceObjectAllowlist, "deviceObjectAllowlist");
            this.deviceObjectAllowlist = deviceObjectAllowlist;
            return this;
        }

        public final void setDeviceObjectAllowlist$android_sdk_base_release(EnumSet<DeviceKey> enumSet) {
            this.deviceObjectAllowlist = enumSet;
        }

        public final Builder setDeviceObjectAllowlistEnabled(boolean z2) {
            this.isDeviceObjectAllowlistEnabled = Boolean.valueOf(z2);
            return this;
        }

        public final void setDeviceObjectAllowlistEnabled$android_sdk_base_release(Boolean bool) {
            this.isDeviceObjectAllowlistEnabled = bool;
        }

        @Deprecated(message = "\u0018Y\u0001t\rT!`fRg=c\u001a@2ab\u0012*\nW\u000e\\{I\u0003KZ\u00013}tUwV\u0015AvNS\u00118NZs", replaceWith = @ReplaceWith(expression = "setDeviceObjectAllowlist", imports = {}))
        @InterfaceC1492Gx
        public final Builder setDeviceObjectWhitelist(EnumSet<DeviceKey> deviceObjectAllowlist) {
            Intrinsics.checkNotNullParameter(deviceObjectAllowlist, "deviceObjectAllowlist");
            return setDeviceObjectAllowlist(deviceObjectAllowlist);
        }

        @Deprecated(message = "\u0018Y\u0001t\rT!`fRg=c\u001a@2ab\u0012*\nW\u000e\\{I\u0003KZ\u00013}tUwV2ji;R#7\u0002\u0014e[\u0006'YV\u0004\u0003", replaceWith = @ReplaceWith(expression = "setDeviceObjectAllowlistEnabled", imports = {}))
        @InterfaceC1492Gx
        public final Builder setDeviceObjectWhitelistEnabled(boolean z2) {
            return setDeviceObjectAllowlistEnabled(z2);
        }

        public final Builder setDoesPushStoryDismissOnClick(boolean z2) {
            this.doesPushStoryDismissOnClick = Boolean.valueOf(z2);
            return this;
        }

        public final void setDoesPushStoryDismissOnClick$android_sdk_base_release(Boolean bool) {
            this.doesPushStoryDismissOnClick = bool;
        }

        public final Builder setFallbackFirebaseMessagingServiceClasspath(String classpath) {
            Intrinsics.checkNotNullParameter(classpath, "classpath");
            this.fallbackFirebaseMessagingServiceClasspath = classpath;
            return this;
        }

        public final void setFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release(String str) {
            this.fallbackFirebaseMessagingServiceClasspath = str;
        }

        public final Builder setFallbackFirebaseMessagingServiceEnabled(boolean z2) {
            this.isFallbackFirebaseMessagingServiceEnabled = Boolean.valueOf(z2);
            return this;
        }

        public final void setFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release(Boolean bool) {
            this.isFallbackFirebaseMessagingServiceEnabled = bool;
        }

        public final void setFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release(Boolean bool) {
            this.isFirebaseCloudMessagingRegistrationEnabled = bool;
        }

        public final Builder setFirebaseCloudMessagingSenderIdKey(String firebaseSenderId) {
            Intrinsics.checkNotNullParameter(firebaseSenderId, "firebaseSenderId");
            if (StringsKt.isBlank(firebaseSenderId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) d.f2642a, 6, (Object) null);
            } else {
                this.firebaseCloudMessagingSenderIdKey = firebaseSenderId;
            }
            return this;
        }

        public final void setFirebaseCloudMessagingSenderIdKey$android_sdk_base_release(String str) {
            this.firebaseCloudMessagingSenderIdKey = str;
        }

        public final void setFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release(Boolean bool) {
            this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = bool;
        }

        public final Builder setGeofencesEnabled(boolean z2) {
            this.isGeofencesEnabled = Boolean.valueOf(z2);
            return this;
        }

        public final void setGeofencesEnabled$android_sdk_base_release(Boolean bool) {
            this.isGeofencesEnabled = bool;
        }

        public final Builder setGoodNetworkDataFlushInterval(int i2) {
            this.goodNetworkInterval = Integer.valueOf(i2);
            return this;
        }

        public final void setGoodNetworkInterval$android_sdk_base_release(Integer num) {
            this.goodNetworkInterval = num;
        }

        public final Builder setGreatNetworkDataFlushInterval(int i2) {
            this.greatNetworkInterval = Integer.valueOf(i2);
            return this;
        }

        public final void setGreatNetworkInterval$android_sdk_base_release(Integer num) {
            this.greatNetworkInterval = num;
        }

        public final Builder setHandlePushDeepLinksAutomatically(boolean z2) {
            this.handlePushDeepLinksAutomatically = Boolean.valueOf(z2);
            return this;
        }

        public final void setHandlePushDeepLinksAutomatically$android_sdk_base_release(Boolean bool) {
            this.handlePushDeepLinksAutomatically = bool;
        }

        public final void setHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release(Boolean bool) {
            this.isHtmlInAppMessageApplyWindowInsetsEnabled = bool;
        }

        public final void setHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release(Boolean bool) {
            this.isHtmlInAppMessageHtmlLinkTargetEnabled = bool;
        }

        public final void setInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release(Boolean bool) {
            this.isInAppMessageAccessibilityExclusiveModeEnabled = bool;
        }

        public final Builder setInAppMessageTestPushEagerDisplayEnabled(boolean z2) {
            this.inAppMessageTestPushEagerDisplayEnabled = Boolean.valueOf(z2);
            return this;
        }

        public final void setInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release(Boolean bool) {
            this.inAppMessageTestPushEagerDisplayEnabled = bool;
        }

        public final Builder setInAppMessageWebViewClientMaxOnPageFinishedWaitMs(int i2) {
            if (i2 >= 0) {
                this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = Integer.valueOf(i2);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new e(i2), 6, (Object) null);
            }
            return this;
        }

        public final void setInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release(Integer num) {
            this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = num;
        }

        public final Builder setIsFirebaseCloudMessagingRegistrationEnabled(boolean z2) {
            this.isFirebaseCloudMessagingRegistrationEnabled = Boolean.valueOf(z2);
            return this;
        }

        public final Builder setIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled(boolean z2) {
            this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = Boolean.valueOf(z2);
            return this;
        }

        public final Builder setIsHtmlInAppMessageApplyWindowInsetsEnabled(boolean z2) {
            this.isHtmlInAppMessageApplyWindowInsetsEnabled = Boolean.valueOf(z2);
            return this;
        }

        public final Builder setIsHtmlInAppMessageHtmlLinkTargetEnabled(boolean z2) {
            this.isHtmlInAppMessageHtmlLinkTargetEnabled = Boolean.valueOf(z2);
            return this;
        }

        public final Builder setIsInAppMessageAccessibilityExclusiveModeEnabled(boolean z2) {
            this.isInAppMessageAccessibilityExclusiveModeEnabled = Boolean.valueOf(z2);
            return this;
        }

        public final Builder setIsLocationCollectionEnabled(boolean z2) {
            this.isLocationCollectionEnabled = Boolean.valueOf(z2);
            return this;
        }

        public final Builder setIsPushWakeScreenForNotificationEnabled(boolean z2) {
            this.isPushWakeScreenForNotificationEnabled = Boolean.valueOf(z2);
            return this;
        }

        public final Builder setIsSdkAuthenticationEnabled(boolean z2) {
            this.isSdkAuthEnabled = Boolean.valueOf(z2);
            return this;
        }

        public final Builder setIsSessionStartBasedTimeoutEnabled(boolean z2) {
            this.isSessionStartBasedTimeoutEnabled = Boolean.valueOf(z2);
            return this;
        }

        public final Builder setIsTouchModeRequiredForHtmlInAppMessages(boolean z2) {
            this.isTouchModeRequiredForHtmlInAppMessages = Boolean.valueOf(z2);
            return this;
        }

        public final Builder setLargeNotificationIcon(String largeNotificationIconName) {
            Intrinsics.checkNotNullParameter(largeNotificationIconName, "largeNotificationIconName");
            this.largeNotificationIconName = largeNotificationIconName;
            return this;
        }

        public final void setLargeNotificationIconName$android_sdk_base_release(String str) {
            this.largeNotificationIconName = str;
        }

        public final void setLocationCollectionEnabled$android_sdk_base_release(Boolean bool) {
            this.isLocationCollectionEnabled = bool;
        }

        public final void setNewsFeedVisualIndicatorOn$android_sdk_base_release(Boolean bool) {
            this.isNewsFeedVisualIndicatorOn = bool;
        }

        public final Builder setNewsfeedVisualIndicatorOn(boolean z2) {
            this.isNewsFeedVisualIndicatorOn = Boolean.valueOf(z2);
            return this;
        }

        public final Builder setOptInWhenPushAuthorized(boolean z2) {
            this.shouldOptInWhenPushAuthorized = Boolean.valueOf(z2);
            return this;
        }

        public final Builder setPushDeepLinkBackStackActivityClass(Class<?> pushDeepLinkActivityClass) {
            Intrinsics.checkNotNullParameter(pushDeepLinkActivityClass, "pushDeepLinkActivityClass");
            this.pushDeepLinkBackStackActivityClassName = pushDeepLinkActivityClass.getName();
            return this;
        }

        public final void setPushDeepLinkBackStackActivityClassName$android_sdk_base_release(String str) {
            this.pushDeepLinkBackStackActivityClassName = str;
        }

        public final Builder setPushDeepLinkBackStackActivityEnabled(boolean z2) {
            this.isPushDeepLinkBackStackActivityEnabled = Boolean.valueOf(z2);
            return this;
        }

        public final void setPushDeepLinkBackStackActivityEnabled$android_sdk_base_release(Boolean bool) {
            this.isPushDeepLinkBackStackActivityEnabled = bool;
        }

        public final Builder setPushHtmlRenderingEnabled(boolean z2) {
            this.isPushHtmlRenderingEnabled = Boolean.valueOf(z2);
            return this;
        }

        public final void setPushHtmlRenderingEnabled$android_sdk_base_release(Boolean bool) {
            this.isPushHtmlRenderingEnabled = bool;
        }

        public final void setPushWakeScreenForNotificationEnabled$android_sdk_base_release(Boolean bool) {
            this.isPushWakeScreenForNotificationEnabled = bool;
        }

        public final void setSdkAuthEnabled$android_sdk_base_release(Boolean bool) {
            this.isSdkAuthEnabled = bool;
        }

        public final Builder setSdkFlavor(SdkFlavor sdkFlavor) {
            this.sdkFlavor = sdkFlavor;
            return this;
        }

        public final void setSdkFlavor$android_sdk_base_release(SdkFlavor sdkFlavor) {
            this.sdkFlavor = sdkFlavor;
        }

        public final Builder setSdkMetadata(EnumSet<BrazeSdkMetadata> enumSet) {
            this.brazeSdkMetadata = enumSet;
            return this;
        }

        public final Builder setServerTarget(String serverTarget) {
            Intrinsics.checkNotNullParameter(serverTarget, "serverTarget");
            this.serverTarget = serverTarget;
            return this;
        }

        public final void setServerTarget$android_sdk_base_release(String str) {
            this.serverTarget = str;
        }

        public final void setSessionStartBasedTimeoutEnabled$android_sdk_base_release(Boolean bool) {
            this.isSessionStartBasedTimeoutEnabled = bool;
        }

        public final Builder setSessionTimeout(int i2) {
            this.sessionTimeout = Integer.valueOf(i2);
            return this;
        }

        public final void setSessionTimeout$android_sdk_base_release(Integer num) {
            this.sessionTimeout = num;
        }

        public final void setShouldOptInWhenPushAuthorized$android_sdk_base_release(Boolean bool) {
            this.shouldOptInWhenPushAuthorized = bool;
        }

        public final Builder setShouldPreventInAppMessageDisplayForDifferentUsers(boolean z2) {
            this.shouldPreventInAppMessageDisplayForDifferentUsers = Boolean.valueOf(z2);
            return this;
        }

        public final void setShouldPreventInAppMessageDisplayForDifferentUsers$android_sdk_base_release(Boolean bool) {
            this.shouldPreventInAppMessageDisplayForDifferentUsers = bool;
        }

        public final Builder setShouldUseWindowFlagSecureInActivities(boolean z2) {
            this.shouldUseWindowFlagSecureInActivities = Boolean.valueOf(z2);
            return this;
        }

        public final void setShouldUseWindowFlagSecureInActivities$android_sdk_base_release(Boolean bool) {
            this.shouldUseWindowFlagSecureInActivities = bool;
        }

        public final Builder setSmallNotificationIcon(String smallNotificationIconName) {
            Intrinsics.checkNotNullParameter(smallNotificationIconName, "smallNotificationIconName");
            this.smallNotificationIconName = smallNotificationIconName;
            return this;
        }

        public final void setSmallNotificationIconName$android_sdk_base_release(String str) {
            this.smallNotificationIconName = str;
        }

        public final void setTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release(Boolean bool) {
            this.isTouchModeRequiredForHtmlInAppMessages = bool;
        }

        public final Builder setTriggerActionMinimumTimeIntervalSeconds(int i2) {
            this.triggerActionMinimumTimeIntervalSeconds = Integer.valueOf(i2);
            return this;
        }

        public final void setTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release(Integer num) {
            this.triggerActionMinimumTimeIntervalSeconds = num;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Builder(apiKey=");
            sb.append(this.apiKey).append(", serverTarget=").append(this.serverTarget).append(", smallNotificationIconName=").append(this.smallNotificationIconName).append(", largeNotificationIconName=").append(this.largeNotificationIconName).append(", customEndpoint=").append(this.customEndpoint).append(", defaultNotificationChannelName=").append(this.defaultNotificationChannelName).append(", defaultNotificationChannelDescription=").append(this.defaultNotificationChannelDescription).append(", pushDeepLinkBackStackActivityClassName=").append(this.pushDeepLinkBackStackActivityClassName).append(", firebaseCloudMessagingSenderIdKey=").append(this.firebaseCloudMessagingSenderIdKey).append(", customHtmlWebViewActivityClassName=").append(this.customHtmlWebViewActivityClassName).append(", sdkFlavor=").append(this.sdkFlavor).append(", sessionTimeout=");
            sb.append(this.sessionTimeout).append(", defaultNotificationAccentColor=").append(this.defaultNotificationAccentColor).append(", triggerActionMinimumTimeIntervalSeconds=").append(this.triggerActionMinimumTimeIntervalSeconds).append(", badNetworkInterval=").append(this.badNetworkInterval).append(", goodNetworkInterval=").append(this.goodNetworkInterval).append(", greatNetworkInterval=").append(this.greatNetworkInterval).append(", inAppMessageWebViewClientMaxOnPageFinishedWaitMs=").append(this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs).append(", admMessagingRegistrationEnabled=").append(this.admMessagingRegistrationEnabled).append(", handlePushDeepLinksAutomatically=").append(this.handlePushDeepLinksAutomatically).append(", isLocationCollectionEnabled=").append(this.isLocationCollectionEnabled).append(", isNewsFeedVisualIndicatorOn=").append(this.isNewsFeedVisualIndicatorOn).append(", isPushDeepLinkBackStackActivityEnabled=").append(this.isPushDeepLinkBackStackActivityEnabled);
            sb.append(", isSessionStartBasedTimeoutEnabled=").append(this.isSessionStartBasedTimeoutEnabled).append(", isFirebaseCloudMessagingRegistrationEnabled=").append(this.isFirebaseCloudMessagingRegistrationEnabled).append(", isContentCardsUnreadVisualIndicatorEnabled=").append(this.isContentCardsUnreadVisualIndicatorEnabled).append(", isInAppMessageAccessibilityExclusiveModeEnabled=").append(this.isInAppMessageAccessibilityExclusiveModeEnabled).append(", isPushWakeScreenForNotificationEnabled=").append(this.isPushWakeScreenForNotificationEnabled).append(", isPushHtmlRenderingEnabled=").append(this.isPushHtmlRenderingEnabled).append(", isGeofencesEnabled=").append(this.isGeofencesEnabled).append(", inAppMessageTestPushEagerDisplayEnabled=").append(this.inAppMessageTestPushEagerDisplayEnabled).append(", automaticGeofenceRequestsEnabled=").append(this.automaticGeofenceRequestsEnabled).append(", isFirebaseMessagingServiceOnNewTokenRegistrationEnabled=").append(this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled).append(", isTouchModeRequiredForHtmlInAppMessages=").append(this.isTouchModeRequiredForHtmlInAppMessages).append(", isSdkAuthEnabled=");
            sb.append(this.isSdkAuthEnabled).append(", deviceObjectAllowlist=").append(this.deviceObjectAllowlist).append(", isDeviceObjectAllowlistEnabled=").append(this.isDeviceObjectAllowlistEnabled).append(", brazeSdkMetadata=").append(this.brazeSdkMetadata).append(", customLocationProviderNames=").append(this.customLocationProviderNames).append(", isHtmlInAppMessageApplyWindowInsetsEnabled=").append(this.isHtmlInAppMessageApplyWindowInsetsEnabled).append(", isHtmlInAppMessageHtmlLinkTargetEnabled=").append(this.isHtmlInAppMessageHtmlLinkTargetEnabled).append(", doesPushStoryDismissOnClick=").append(this.doesPushStoryDismissOnClick).append(", isFallbackFirebaseMessagingServiceEnabled=").append(this.isFallbackFirebaseMessagingServiceEnabled).append(", fallbackFirebaseMessagingServiceClasspath=").append(this.fallbackFirebaseMessagingServiceClasspath).append(", shouldOptInWhenPushAuthorized=").append(this.shouldOptInWhenPushAuthorized).append(", shouldUseWindowFlagSecureInActivities=").append(this.shouldUseWindowFlagSecureInActivities);
            sb.append(", shouldPreventInAppMessageDisplayForDifferentUsers=").append(this.shouldPreventInAppMessageDisplayForDifferentUsers).append(')');
            return sb.toString();
        }
    }

    private BrazeConfig(Builder builder) {
        this.builder = builder;
        this.apiKey = builder.getApiKey$android_sdk_base_release();
        this.serverTarget = builder.getServerTarget$android_sdk_base_release();
        this.smallNotificationIcon = builder.getSmallNotificationIconName$android_sdk_base_release();
        this.largeNotificationIcon = builder.getLargeNotificationIconName$android_sdk_base_release();
        this.customEndpoint = builder.getCustomEndpoint$android_sdk_base_release();
        this.defaultNotificationChannelName = builder.getDefaultNotificationChannelName$android_sdk_base_release();
        this.defaultNotificationChannelDescription = builder.getDefaultNotificationChannelDescription$android_sdk_base_release();
        this.pushDeepLinkBackStackActivityClassName = builder.getPushDeepLinkBackStackActivityClassName$android_sdk_base_release();
        this.firebaseCloudMessagingSenderIdKey = builder.getFirebaseCloudMessagingSenderIdKey$android_sdk_base_release();
        this.customHtmlWebViewActivityClassName = builder.getCustomHtmlWebViewActivityClassName$android_sdk_base_release();
        this.sdkFlavor = builder.getSdkFlavor$android_sdk_base_release();
        this.sessionTimeout = builder.getSessionTimeout$android_sdk_base_release();
        this.defaultNotificationAccentColor = builder.getDefaultNotificationAccentColor$android_sdk_base_release();
        this.triggerActionMinimumTimeIntervalSeconds = builder.getTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release();
        this.badNetworkInterval = builder.getBadNetworkInterval$android_sdk_base_release();
        this.goodNetworkInterval = builder.getGoodNetworkInterval$android_sdk_base_release();
        this.greatNetworkInterval = builder.getGreatNetworkInterval$android_sdk_base_release();
        this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = builder.getInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release();
        this.isAdmMessagingRegistrationEnabled = builder.getAdmMessagingRegistrationEnabled$android_sdk_base_release();
        this.willHandlePushDeepLinksAutomatically = builder.getHandlePushDeepLinksAutomatically$android_sdk_base_release();
        this.isLocationCollectionEnabled = builder.isLocationCollectionEnabled$android_sdk_base_release();
        this.isNewsFeedVisualIndicatorOn = builder.isNewsFeedVisualIndicatorOn$android_sdk_base_release();
        this.isPushDeepLinkBackStackActivityEnabled = builder.isPushDeepLinkBackStackActivityEnabled$android_sdk_base_release();
        this.isSessionStartBasedTimeoutEnabled = builder.isSessionStartBasedTimeoutEnabled$android_sdk_base_release();
        this.isFirebaseCloudMessagingRegistrationEnabled = builder.isFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release();
        this.isContentCardsUnreadVisualIndicatorEnabled = builder.isContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release();
        this.isInAppMessageAccessibilityExclusiveModeEnabled = builder.isInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release();
        this.isPushWakeScreenForNotificationEnabled = builder.isPushWakeScreenForNotificationEnabled$android_sdk_base_release();
        this.isPushHtmlRenderingEnabled = builder.isPushHtmlRenderingEnabled$android_sdk_base_release();
        this.areGeofencesEnabled = builder.isGeofencesEnabled$android_sdk_base_release();
        this.isInAppMessageTestPushEagerDisplayEnabled = builder.getInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release();
        this.areAutomaticGeofenceRequestsEnabled = builder.getAutomaticGeofenceRequestsEnabled$android_sdk_base_release();
        this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = builder.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release();
        this.isSdkAuthEnabled = builder.isSdkAuthEnabled$android_sdk_base_release();
        this.isTouchModeRequiredForHtmlInAppMessages = builder.isTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release();
        this.deviceObjectAllowlist = builder.getDeviceObjectAllowlist$android_sdk_base_release();
        this.isDeviceObjectAllowlistEnabled = builder.isDeviceObjectAllowlistEnabled$android_sdk_base_release();
        this.customLocationProviderNames = builder.getCustomLocationProviderNames$android_sdk_base_release();
        this.brazeSdkMetadata = builder.getBrazeSdkMetadata$android_sdk_base_release();
        this.isHtmlInAppMessageApplyWindowInsetsEnabled = builder.isHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release();
        this.isHtmlInAppMessageHtmlLinkTargetEnabled = builder.isHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release();
        this.doesPushStoryDismissOnClick = builder.getDoesPushStoryDismissOnClick$android_sdk_base_release();
        this.isFallbackFirebaseMessagingServiceEnabled = builder.isFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release();
        this.fallbackFirebaseMessagingServiceClasspath = builder.getFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release();
        this.shouldOptInWhenPushAuthorized = builder.getShouldOptInWhenPushAuthorized$android_sdk_base_release();
        this.shouldUseWindowFlagSecureInActivities = builder.getShouldUseWindowFlagSecureInActivities$android_sdk_base_release();
        this.shouldPreventInAppMessageDisplayForDifferentUsers = builder.getShouldPreventInAppMessageDisplayForDifferentUsers$android_sdk_base_release();
    }

    public /* synthetic */ BrazeConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public String toString() {
        return this.builder.toString();
    }
}
