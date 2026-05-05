package com.braze;

import android.app.Activity;
import android.content.Intent;
import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.events.BrazePushEvent;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.FeedUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.IValueCallback;
import com.braze.events.InAppMessageEvent;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.events.SessionStateChangedEvent;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.FeatureFlag;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.outgoing.BrazeProperties;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
@Metadata(bv = {}, d1 = {"Яś\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013.H\u007f*, \u0004\u000ffp:8D{H6RY1\u0017k\n4,[*qK;k\u001a\u0006̝\u0011OdgonP]\u0013C%\u0006\u001eюr,_U\u0001]\u0018\u000f:B\u0006?;ݹw=O`|6\u000b :\"F\u0018\r\u00010*P\u0010|zKK\u001a\u00188@v:Z\r[\f\"Ň\u000e>6\u0001&\\mS>H\u0003]B/)\nqBd'g0\u0003R\u0015Fj'\u0015vg#3@E>\u001d%Y\u0006\u000fRiC\u000b?wD\rh='3ɞ{WLX\bϬ\u001d+e\reö.\\\u001bQhϯ/+ecSִ\u0016(\u000ez\u0004ȞD\u0004$\u0006/Ξ6-0f\u0010Ԅ;t\tSHА\bDXȕ+ad\u0016m(A=Q\u001b\u0015d\u0002=\u001f\u05cbE\u00105\u0017,8\u0019t1]d\u000e')Ij([?hXCXP\u001aY\u0004\u00022\t)&r\u0014>`\u0018/*$^\u001d3Qs;9 \u001a\u0007\u000fh0\u0011\u0013y\u0001S\u0018exF0\t.9@\b:_tj\u0013\u0007hVn+?RbxO\u000e\u0016/8\\&OQ+\u001ekgj\u007fi{{PIwxEx\u0007m$Vg~c;_\u0005(chuBD\u0003\u0007Mjtak\u000ep[VBbNx2\u0010}ZM:6xc:.BPI\u001br\u0014v(NHO#!apg>\u0004\u001bWl\u000fwK\r\u000f\u0011Rlp\u001e\u0011'qr!)0;ki=)(e\"\u0017T\u0013\"5':$\u0010mZrdlD\"\u001c h\u001c(fi/k?U#q8\u0010[]L!\u0015\u0018qZ;\t~\u0012\u000fi{^q\u0016\u001b\t2plZO\u0003\u0018P(%\u0017k\u001cr2\u0012at\u000ewmb;sDYt\u0013YjSf.KCf5\u000f#:~K,qPM\u001a\u0006HG\u0015\u0010b0\u0014v\u0002pD>v{\u0003Zh\\\u0005+akhS8wl/D0[\u0005\u0005XG\u0019|NfQN\u001bi`A\u0013\u0004\u0007>[BG\u007f|\u0006Z\u0012!\\ir+q\u00143\\\u0019p\u0018\f\f\"\u0019[%?`\u0004k{\"c\\9OU.S\f?**\u001ck3\u0007]pEH\b\n\u0017dF\u0002\bML\u0017aL,j\u001b;Ib&\u001e\u0012\u0011~tdU<zH\u0002yn\u000e\u0003\f#z\u0011)n\u0005x!X\u0014/\u0015A^\u00117G\u0004\u001cK\u00055qs\u0019U3\bIo\u007f\u0005tgCFj8Ik\u001f%Ssk\u0003a\u0002d\u0017w/{,\b\u000eN\u0017+\"r\u001e)zi\u0013uu^c;[r\u0011|x(e\u0001\u0012R/\r3\u0015\u0010R\t=D_s;\u001cpldN&Js \u000fW\\+\u001d\u000b+hv!;GM/SH\u0019\u0019W\u0002e\u0016S\u007f\u001e\u001fNj4x/!o\u000e\u00156$?\u0003P\u007fUz\u00027&\u0001&\u0012nbv\t\t\\\rfU\u0010t\u001a\u0015tX\u001a|QF5m\u0005\bXJ\u0017<:irc|\u001a#\u0003\u0015]\u0007\u0002t-^U!)c-A\u0012!^Yw.\u001e)\u007fB(V%DNz+&N\u0012m!q]#%-EjXfa6`f\u0016!\u0010t2/\u001bL]Kd\u0017Vd7o\u001dHeXvl>c#Wo8E\u000fV()\u0013bY#$ruO\u001b5Z;L'+L_Wr91\u0001RK=@Q\b*\r\u00101?\u0013z\u000ewZ\u000b\t~\u00161sj\u001dM(uq$\u001cw3,YbPD\u001e+?,WS#>.\u000et\u001aJN\u0018W\nC\u001fQ-84\u0003'\u001b;շ_gU6\u000f\u0012\u0019\u0015O{Ak\u0001\bMqQE?y)n~A57uLm 0}\u0011#\u0016id`y,wH\fBBcNQ\"\u001fR76y1R]1v}&\u0002\t\\\u0002,\u001c&XI5hkMzN\f\nZ|^\u0018-ao\u000bYzB,\u000bbrCz^]M\u0017\r;H\u001b\u001e,7=_Y7%W(O \u001aqm;S=8u<A\u0007J^zgDV_@\b=LQZjqH\u0003m\u007fr@< k%\u0004&6\u0003d\u000e@5\u0018U\u001f=j~j\u0007.Yb9S?(l\u0010Z\f9\u000b\\R\u0011+\u0010`b`C&cQ\u0002V_\u0018f}1\u001d??S\u001ck\f3[M:\nXkLc\u0015{_p;u^\u0015UO1\u0013A[$3?<.n>H=\t\u0010\u001cZ|N F\tDVU^FvtGnQF\u0019\u001cMP\u0006\u001fs\u0014JhG]t\u0011Y!\u0006\u0005\u0019ykA\u0007l\u001b\u0010o,C\u0015,hQ83u\u001d1lg6r\u0010yE\u0002W|\u001bax4_\u0010MDYQ|Xu?GEm\u0015RDo8\u0014\u0002<b\u0016&\u001a\u00180t\u001bRFX9HyI?|\t\u000fW\u000f\u0003|F\ffh6G\u0014&z\"E=o@Z \u001f\u001f\u000es3\u00108X\bf#l}O9\u000b1DAs!c}SB\u0005\u0018\u0001)P%W>B)\u0001H\u001e|ɦ}ž-4/Wioxv%p\u001f]Lk^iPܟhΆBgV>Nr'm \u0014)Y\\b7iGךMŹfvD)<Rx$!\u0003Qm%!\b\\\u00051\u007f5P!\u0010'*Ռ1϶N\u0010&lg\u0007#\u0003}5<\u001d}=ΐ\u0014џÂfv\fn\u000bl^\u0003θ3'\u058c^?"}, d2 = {"\u001ab^:\")KO.~DB\t\n\u0005DeU", "", "1ta?X5MC'~\b", "\u001ab^:\")KO.~D;9x\u001e/U\u000e(\t\u0016", "5dc\u0010h9KS\"\u000ejl,\n", "u(;0b4\bP&z\u0010^uY\u0016+z\u007f\u0018\n@\u000el", "2de6V,\"R", "", "5dc\u0011X=BQ\u0019by", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "7lP4X\u0013HO\u0018~\b", "\u001ab^:\")KO.~Db4x\u000b/sI\fXM|,\u0017+w\n>v\f?U| DC", "5dc\u0016`(@S\u007f\tv],\n", "u(;0b4\bP&z\u0010^u\u0001\u0011+g\u007f6E$]$\u0013\\oqDr'5@\b\u001c6m#\u0004", "Adc\u0016`(@S\u007f\tv],\n", "uKR<`u;`\u0015\u0014z(0\u0005\u00051e\u000eq_\u001d\u000e\u0013,GS\u00168x%\u001ccy\u001f7zkq>", "@dV6f;>`\u0019}en:\u007fw9k\u007f1", "5dc\u001fX.Ba(~\b^+g\u0019=hn2\u0002@\n", "Adc\u001fX.Ba(~\b^+g\u0019=hn2\u0002@\n", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "/cS \\5@Z\u0019l\u000fg*\u007f\u00169n\n8\n.\u0011\u0014%E|\u0012G\u0006)?b", "", "\"", "AtQ@V9BP\u0019\f", "\u001ab^:\")KO.~D^=|\u0012>sI\f[Q\u0001 &5\u007f\u000bJt29V}-\r", "3uT;g\nEO'\r", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "1gP;Z,.a\u0019\f", "CrT?<+", "AcZ\u000eh;AA\u001d\u0001\u0004Z;\r\u0016/", "1k^@X\u001a>a'\u0003\u0005g", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "2db2e0:Z\u001d\u0014z<6\u0006\u0018/n\u000f\u0006wM\u007f", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "1n]AX5M1\u0015\fyL;\n\r8g", "1n]AX5M1\u0015\fyC:\u0007\u0012", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "2db2e0:Z\u001d\u0014zB5X\u0014:M\u007f6\n<\u0003\u0017\u0005V|\u0012Ex", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ej", "7m0=c\u0014>a'z|^\u001a\f\u00163n\u0002", "5dc\u000e_3\u001fS\u0015\u000e\u000bk,]\u0010+g\u000e", "", "\u001ab^:\")KO.~Df6{\t6sI\t{<\u0010'$GP\u00158xz", "5dc\u0010T*AS\u0018\\\u0005g;|\u0012>C{5zN", "5dc\u0010b5MS\"\u000eXZ9{f9u\t7", "", "5dc\u0010b5MS\"\u000eXZ9{x8v\u0004(\u000e@\u007ft!Wx\u001d", "5dc\u0010b5MS\"\u000eXZ9{\u0017\u0016a\u000e7kK\u007f\u0013&GnqEd%3c\u0007\u001fEN#8U#Fu2!", "", "1n\\=_,MW#\bXZ3\u0004\u0006+c\u0006", "\u001ab^:\")KO.~D^=|\u0012>sI\fl<\b'\u0017%k\u0015Cs!3_S", "5dc\u0011X=BQ\u0019by::\u0011\u0012-", "5dc\u0013X(Mc&~[e(~", "7c", "5dc\u0016a:MO \u0006ik(z\u000f3n\u0002\fz", ":nV\u0010h:M]!^\f^5\f", "3uT;g\u0015:[\u0019", ">q^=X9MW\u0019\r", "\u001ab^:\")KO.~Df6{\t6sI2\fO\u0003!\u001bPqW\u0019\u0004!JYh-Ax\u0016;\\G;y\n", ":nV\u0013X(Mc&~[e(~l7p\r(\nN\u0005! ", ":nV\u0013X,=1\u0015\fy<3\u0001\u00075", "1`a1<+", ":nV\u0013X,=1\u0015\fyB4\b\u0016/s\u000e,\u0006I", ":nV\u0013X,=2\u001d\r\u0006e(\u0011\t.", ":nV\u001dh9<V\u0015\rz", ">q^1h*M7\u0018", "1ta?X5<gv\ty^", ">qX0X", "\u001aiPCTuFO(\u0002D;0~g/c\u00040wGV", "?tP;g0Mg", ":nV\u001dh:A<#\u000e~_0z\u0005>i\n1W>\u0010\u001b!PM\u0015@t+5X", "1`\\=T0@\\|}", "/bc6b5\"R", "/bc6b5-g$~", ":nV\u001dh:A<#\u000e~_0z\u0005>i\n1eK\u0001 \u0017F", "7mc2a;", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", ":nV\u001dh:AA(\t\br\u0017x\u000b/C\u0007,yF\u0001\u0016", ">`V2<+", "=oT;F,La\u001d\t\u0004", "@dU?X:A4\u0019z\nn9|i6a\u00026", "@d\\<i,,W\"\u0001\u0002^\u001a\r\u0006=c\r,\u0007O\u0005! ", "@d`BX:M1#\b\n^5\ff+r~6h@\u0002$\u0017Ur", "4q^:6(<V\u0019", "", "@d`BX:M1#\b\n^5\ff+r~6h@\u0002$\u0017UrnI\u0001-\u0013U{#7", "@d`BX:M4\u0019~yK,}\u0016/s\u0003", "@d`BX:M4\u0019~yK,}\u0016/s\u0003\t\tJ\tt\u0013Er\u000e", "@d`BX:M5\u0019\t{^5z\t=", ":`c6g<=S", "", ":n]4\\;NR\u0019", "@d`BX:M7!\u0007z]0x\u0018/D{7w!\b'%J", "@d`BX:M:#|vm0\u0007\u0012\u0013n\u00047\u007f<\b\u001b,C~\u0012F\u007f", "Adc\u0014b6@Z\u0019Zyo,\n\u00183s\u00041}$\u007f", "5n^4_,\u001aR*~\bm0\u000b\r8gc'", "7r;6`0M/\u0018m\bZ*\u0003\r8g_1w=\b\u0017\u0016", "Adc W2\u001ac(\u0002zg;\u0001\u0007+t\u00042\u0005.\u0005\u0019 C~\u001eIv", "AhV;T;N`\u0019", "AtQ@V9BP\u0019m\u0005<6\u0006\u0018/n\u000f\u0006wM\u007f%\u0007Rn\nKv3", "\u001ab^:\")KO.~D^=|\u0012>sI\u0006\u0006I\u0010\u0017 VM\nIu3%d|\u001cFm\u0015\u000e^CDz\n", "AtQ@V9BP\u0019m\u0005?,x\u0018?r\u007f\t\u0003<\u0003%\u0007Rn\nKv3", "\u001ab^:\")KO.~D^=|\u0012>sI\t{<\u0010'$GP\u00158x3%d|\u001cFm\u0015\u000e^CDz\n", "AtQ@V9BP\u0019m\u0005?,|\b\u001fp~$\u000b@\u000f", "\u001ab^:\")KO.~D^=|\u0012>sI\t{@\u007f\u0007\"Fk\u001d<u\u0005FY\u0007/\r", "AtQ@V9BP\u0019m\u0005G,\f\u001b9r\u0006\twD\b'$G}", "\u001ab^:\")KO.~D^=|\u0012>sI\u0005\t<\u0016\u0017\u007fG~ F\u0004+\u0016U\u0002'Gz\u0016\u000e^CDz\n", "AtQ@V9BP\u0019m\u0005G,\u000fl8A\u000b3c@\u000f%\u0013Io\u001c", "\u001ab^:\")KO.~D^=|\u0012>sI\f\u0005\u001c\f\"~G}\u001c8x%\u0015j})FC", "AtQ@V9BP\u0019m\u0005G6d\u0005>c\u0003,\u0005Bo$\u001bIq\u000eIW/B9\u000f @|", "\u001ab^:\")KO.~D^=|\u0012>sI\u0011\u0006(|&\u0015Js\u0017>e29[\u007f DM'.VR\u0011", "AtQ@V9BP\u0019m\u0005I<\u000b\f\u0018o\u000f,|D~\u0013&Ky\u0017\u001c\b%>h\f", "\u001ab^:\")KO.~D^=|\u0012>sI\u0005\t<\u0016\u0017\u0002W}\u0011\u001c\b%>hS", "AtQ@V9BP\u0019m\u0005L+\u0003d?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018EW!9`\u000e-7{", "\u001ab^:\")KO.~D^=|\u0012>sI\u0005\t<\u0016\u0017\u0005FuiL\u0006(5b\r$5i%2WL\u001bxA(\"Hr9\u0010r\u0002", "AtQ@V9BP\u0019m\u0005L,\u000b\u00173o\t\u0018\u0007?|&\u0017U", "\u001ab^:\")KO.~D^=|\u0012>sI\u0016{N\u000f\u001b!P]\u001d8\u0006%\u0013\\y)9m\u0015\u000e^CDz\n", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface IBraze {
    static /* synthetic */ void logPurchase$default(IBraze iBraze, String str, String str2, BigDecimal bigDecimal, int i2, BrazeProperties brazeProperties, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logPurchase");
        }
        if ((8 & i3) != 0) {
            i2 = 1;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            brazeProperties = null;
        }
        iBraze.logPurchase(str, str2, bigDecimal, i2, brazeProperties);
    }

    <T> void addSingleSynchronousSubscription(IEventSubscriber<T> iEventSubscriber, Class<T> cls);

    void changeUser(String str);

    void changeUser(String str, String str2);

    void closeSession(Activity activity);

    Card deserializeContentCard(String str);

    Card deserializeContentCard(JSONObject jSONObject);

    IInAppMessage deserializeInAppMessageString(String str);

    List<FeatureFlag> getAllFeatureFlags();

    List<Card> getCachedContentCards();

    int getContentCardCount();

    int getContentCardUnviewedCount();

    long getContentCardsLastUpdatedInSecondsFromEpoch();

    BrazeUser getCurrentUser();

    void getCurrentUser(IValueCallback<BrazeUser> iValueCallback);

    String getDeviceId();

    void getDeviceIdAsync(IValueCallback<String> iValueCallback);

    FeatureFlag getFeatureFlag(String str);

    IBrazeImageLoader getImageLoader();

    @Deprecated(message = "\u0018Y\u0001t\rT!`fRg=W\u001a@2ab\u0012*\nQ\u0010\u001a?c.p]\u0007ckyamXNhmGZ]9O Y`\u00031fIGnRM_K+\u0019T-{7\u0003\u0007\u0011sv/T\f~bat|aO\u0011J\u0013~", replaceWith = @ReplaceWith(expression = "deviceId", imports = {}))
    @InterfaceC1492Gx
    default String getInstallTrackingId() {
        return getDeviceId();
    }

    String getRegisteredPushToken();

    void logCustomEvent(String str);

    void logCustomEvent(String str, BrazeProperties brazeProperties);

    void logFeatureFlagImpression(String str);

    @Deprecated(message = "\u0013R\u00016\u0005yTZYS4:kt8WjWH\n\u0006z\u0010\u0015\u0003UuMZ}'q0\u0015\u0002\u0002Vj{MK\u001f7y&e\f\u00061_\b<%A@\u001b\u000fRa", replaceWith = @ReplaceWith(expression = "Card.logClick()", imports = {}))
    @InterfaceC1492Gx
    void logFeedCardClick(String str);

    @Deprecated(message = "\u0013R\u00016\u0005yTZYS4:kt8WjWH\n\u0006z\u0010\u0015\u0003UuS[\u00056k{_mQ[$1V\u0006'AM&[M}alWzqM;Q\rUSM(\u0007F\u0007\u0006\u001fxF*\u0019", replaceWith = @ReplaceWith(expression = "Card.logImpression", imports = {}))
    @InterfaceC1492Gx
    void logFeedCardImpression(String str);

    void logFeedDisplayed();

    void logPurchase(String str, String str2, BigDecimal bigDecimal);

    void logPurchase(String str, String str2, BigDecimal bigDecimal, int i2);

    void logPurchase(String str, String str2, BigDecimal bigDecimal, int i2, BrazeProperties brazeProperties);

    void logPurchase(String str, String str2, BigDecimal bigDecimal, BrazeProperties brazeProperties);

    void logPushNotificationActionClicked(String str, String str2, String str3);

    void logPushNotificationOpened(Intent intent);

    void logPushNotificationOpened(String str);

    void logPushStoryPageClicked(String str, String str2);

    void openSession(Activity activity);

    void refreshFeatureFlags();

    <T> void removeSingleSubscription(IEventSubscriber<T> iEventSubscriber, Class<T> cls);

    void requestContentCardsRefresh();

    @Deprecated(message = "\u0013R\u00016\u0005yTZYS4:kt8WjWH\u0010fz\rl{\t\u0001o_\n)y|/sPaavM)\u001fE>%HQ\u007f4][C-\u0007QQ\u001bYS_z\u0003=\u0010}KX\u0019.L\u0018\u0001 4\r\r]\u0015R\u000f$=6EX}O6\u001d\u0001\u007f3g'J\"+\u0012#z\u001dH_t!\"F<-C4eJIiqP2 \u000fK7t7eF ?g\u0013=xp&X\u0017:\u000b1&\u000e", replaceWith = @ReplaceWith(expression = "IBraze.requestContentCardsRefresh", imports = {}))
    @InterfaceC1492Gx
    void requestContentCardsRefresh(boolean z2);

    void requestContentCardsRefreshFromCache();

    void requestFeedRefresh();

    void requestFeedRefreshFromCache();

    void requestGeofences(double d2, double d3);

    void requestImmediateDataFlush();

    void requestLocationInitialization();

    void setGoogleAdvertisingId(String str, boolean z2);

    void setImageLoader(IBrazeImageLoader iBrazeImageLoader);

    void setRegisteredPushToken(String str);

    void setSdkAuthenticationSignature(String str);

    void subscribeToContentCardsUpdates(IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber);

    void subscribeToFeatureFlagsUpdates(IEventSubscriber<FeatureFlagsUpdatedEvent> iEventSubscriber);

    void subscribeToFeedUpdates(IEventSubscriber<FeedUpdatedEvent> iEventSubscriber);

    void subscribeToNetworkFailures(IEventSubscriber<BrazeNetworkFailureEvent> iEventSubscriber);

    void subscribeToNewInAppMessages(IEventSubscriber<InAppMessageEvent> iEventSubscriber);

    void subscribeToNoMatchingTriggerForEvent(IEventSubscriber<NoMatchingTriggerEvent> iEventSubscriber);

    void subscribeToPushNotificationEvents(IEventSubscriber<BrazePushEvent> iEventSubscriber);

    void subscribeToSdkAuthenticationFailures(IEventSubscriber<BrazeSdkAuthenticationErrorEvent> iEventSubscriber);

    void subscribeToSessionUpdates(IEventSubscriber<SessionStateChangedEvent> iEventSubscriber);
}
