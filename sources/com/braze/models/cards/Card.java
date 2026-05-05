package com.braze.models.cards;

import bo.app.e00;
import bo.app.el;
import bo.app.fl;
import bo.app.gl;
import bo.app.h00;
import bo.app.hl;
import bo.app.il;
import bo.app.jl;
import bo.app.kl;
import bo.app.ll;
import bo.app.m00;
import bo.app.ml;
import bo.app.nl;
import bo.app.ol;
import bo.app.pl;
import bo.app.ql;
import bo.app.tf;
import com.braze.enums.CardCategory;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.enums.Channel;
import com.braze.models.IPutIntoJson;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
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
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:305)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
@Metadata(bv = {}, d1 = {"Яć\u0014D57\u001eq\u007fZDkt\u001aA\u000e0\u00197J~(-\u001aw\u001dfr9FDmH4U[*\u001dw\u00044*\\,qQП]\u001a\u0004#\u0011O\\monP\\\u0013C%\u0006\u001exp,QU\u000f]\u001a\u000f8Bw?IMw=?`|6\u0013B:\">~\r\u0001(1P\u0010|\u0016KK\"\u00128@v?Z\rc\u0005\"\u0012\f@(\u00014\\oN<Xt]P/+\u0003oHT<uܞ\u001b<=Nd+\u001dxw\u001dY@e4M$CC>b_M\u001aWqk\u0005x+5\u0015as\u0006\u001fh\u0006\"/CQ#\\!?l\u000f_}$-;OiLf\rV\u0014\u000b\u0002\u001b\\\u001c\u0010\u001c&vMǉ\u001eh\u000exA`3jFd\u0012bP\u0017\u0013ad\u00175\u0004A\u0018Q\u001b\u0015:ň?\u001bT\"\nrU)1\u0003\u0007!\nU\u05f8d\u0017!V\u0006Ty\\NA`N8Zǀq\u0006vf\u0010-LIU\bG{?/G/EbQ)1m\u0012Hrm%\n¾lUoZVIj{$AB\t:Z\u000bxʰoRZb:\u001c\u0016)b\u0014\u0016\bA,#\f˶%'\u0016[]v2w[l\"%]g}^ˇo\u0010]Hl6}iq\"yR%\u0015oBp\u0016phXR:j#̼\"ĘLl\u0016\n\nW\u0017\u0019!GWqJHrEǬ`\u0017N\u0018,X\u0012\u000f\u0017vrh>~\u000b3zѳk˨x\r\tRb\b}\u007fI]:\u0017x$C@\u007fNO&,ȫjط\u0001'\u000f\u0001y\u001aU\u0003\u001d_Z\n.{e{&\u001708\u007fKs\u0013eȲ+ɨ\u00061MNx\u0003_kb;\t\u001d\u0012\u0011Qg\\\u0007>jGݝbʧNS\\\u0019(\u0017l\u0014s)r#\u0012mV|Wc\u0003\u0017k@Yr1ejpn\u0001ġ#(-\u0003uE\u000bYEE-B$\u001edD#\tui\u001e:0fϪ*~m\u00062\u000b$\u0018zSc[IF\u001an\ri:$\u001b-xLܖ{\u0012J\u000b:8AtYfv\u0004F{[D\f\u0016\u001f,;\u001b\r_ǈ\u0017y\u000664\u000f8 [\u007f\u001a\u000fQSaba\u0019\u0006my\u0007AN؝\u000e\u0015\u00043tC*i8X]\u0015\u0017^V&&=YCr\u0007L\tR:B;6\u0010s`w9(\u0003\u0010Ho\u000fE8Xri[DX7\u001d-ާ\u0011ޝIj),\u0007\u0006\u001dg6z;f\u0013$\u0017i=\u001bJ\u0001\u0002\u001e?\u001f˥S\tn'1{bq3*^8\u0019H.XW;N\u0004u*$oƴ\u0010B ~#{&SQS\u0017\u0019\u00053/+c\u001ffd%\u0013\u001dV\r&\u007fͭ\u0007է\u0012L\u0012\u0011\u0011S]+\bd3\u0007\\zWE <%\u0001y)\u001a:{FI.69;pajB(2[\u0012{TП,Č+\u000e|#b\u0015\u001c\u001f\"_!w$tf}\u0010G+PN\u0005dNƶv\u001a6\n<\u000e\u0010k\u0012\u0015d\u001ay99B-jz\t\u0013kv;\"c\u001bd%YI\u0007=۹bӖr=X\u001f\u000fi[f+Z`|\u001fV@Z\u0017C\"Qv?DLz)>P\u001al/o&܇\u0019Į3{2c7t`V\u0016!\u007f:\u0012-t*\u001b\u0001d\n\u000f~\u0017#\u0005Dm\r\rv^xKך+ِ\u0001\tP`\u0017YBn\u000b jvE'os\u001b\u0011x\u00072\u000e\u007f:wܧT̫\u001fA:\ruq\u0005[\u001b<h@\u000ev\u0013\u001d\u0001M\u007f,[G\u000b=X'0ށy҉\u0007*SG>\u0010\u0016da\"\u001f}r8N?\u0013\u001aZ;(߅M˵\u0015\u0005\u001d:\f>\u0015Q\u0006~_#=*/}7\r}y\bˌFތ;v+1\u0015?)\u00107P3\u0007}LU\\8iڧ\u0003WkX\u00153:\u001cMG$Mc\u0015P,-z<\b\f\".\u001bgLhc3ȅbؾ[\u0014.,<ERz_n~L\u0018\u0006\n\u001ay?i=\u0005c\tq1Dl+]p\u0015\"eh(\fzQ\u0004X\u000eʛ\u0012Ԡ7!\u0015\u0012UON.itS\u000ej\u001a\r;\u0002cR2\u00107*KN9B\u0006[\u0013\u000b()/D˰kݳ<\"\u001d\u000f\nY?\u0014x\u0002f|&*kxL\u0017j5\u001eipmX\u000fR_^F\u001am\u001e\u0016\\IMF<\u000f7ŏ\u001fчK\u0004QI\u0018<\nb5\u0013a\t\u0014(\blM$c.)LG\u001a#mxYk*ۇ\tY9Mj\u0012#\u0003;:</n>H+\u000fJکIh`\u0012J`R+һ4!"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "\u001ab^:\")KO.~Df6{\t6sI\ffP\u0010z VyrJ\u0001.\u000b", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "", ":nV\u0016`7KS'\r~h5", "u(I", ":nV\u0010_0<Y", "\u001aiPCTuNb\u001d\u0006D>5\r\u0011\u001de\u000f}", "\u001ab^:\")KO.~D^5\r\u0011=/]$\t?^\u0013&Gq\u0018I\u000bz", "1`c2Z6KW\u0019\r", "7r8;6(MS\u001b\t\br\u001a|\u0018", "uKY.i(\bc(\u0003\u0002(\f\u0006\u00197S\u007f7Q\u0004u", "4na\u0017f6G>)\u000e", "u(;<e.\bX'\t\u0004(\u0011jr\u0018O|-{>\u0010l", "", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "7rE._0=1\u0015\fy", "", "=sW2e", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "8r^;B)CS\u0017\u000e", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "\u001aa^{T7I\u001d\u001cIE4", "0qPGX\u0014:\\\u0015\u0001zk", "\u001aa^{T7I\u001d\u001cIE4", "\u001ab^:\")KO.~Dl;\u0007\u0016+g\u007fq_\u001e|$\u00165~\u0018Ir'5D\u000b*Hq\u0015.Z\u0019", "1`a1F;H`\u0015\u0001z", "\u001ab^:\")KO.~Dl;\u0007\u0016+g\u007fq_\u001e|$\u00165~\u0018Ir'5D\u000b*Hq\u0015.Z\u0019", "\u001aa^{T7I\u001d!IE4", "1`a145:Z-\u000e~\\:", "\u001aa^{T7I\u001d!IE4", "", "3wc?T:", "\u001aiPCTuNb\u001d\u0006DF(\b^", "5dc\u0012k;KO'", "u(;7T=:\u001d)\u000e~eud\u0005:;", "7c", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0016W", "", "1qT.g,=", "\u0018", "5dc\u0010e,:b\u0019}", "u(9", "CoS.g,=", "5dc\"c+:b\u0019}", "3w_6e,L/(", "5dc\u0012k7B`\u0019\rVm", "\nrTA \u0006\u0017", "\u001aiPCTuNb\u001d\u0006D>5\r\u0011\u001de\u000f}", "5dc\u0010T;>U#\f~^:", "u(;7T=:\u001d)\u000e~eu\\\u0012?mm(\u000b\u0016", "7r2<a;>\\(\\vk+", "(", "7rA2`6OS\u0018", "7r?6a5>R", "Adc\u001d\\5GS\u0018", "uY\u0018#", "7r29\\*DS\u0018", "=oT;H9B7\"pz[\u001d\u0001\tA", "5dc\u001cc,GC&\u0003^g\u001e|\u0006 i\u007f:", "5dc\u001cc,GC&\u0003^g\u001e|\u0006 i\u007f::<\n !Vk\u001d@\u0001.C", "u(E", "7r36f4Ba'\u0003we,Y\u001d\u001fs\u007f5", "Adc\u0011\\:FW'\r~[3|eCU\u000e(\t", "7rC2f;", "Adc!X:M", "Cq[", "5dc\"e3", "\u001ab^:\")KO.~D^5\r\u0011=/]$\t?o+\"GE", "1`a1G@IS", "\u001ab^:\")KO.~D^5\r\u0011=/]$\t?o+\"GE", "5dc\u0010T9=B-\nz", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eqY<\u000e\u0016\u0006[z\u000e\u0012", "E`b#\\,PS\u0018b\u0004m,\n\u0012+l", "7r8;W0<O(\t\bA0~\f6i\u0002+\u000b@\u007fz Vo\u001bEr,", "7r36f4Ba'~yB5\f\t<n{/", "\u001ab^:\")KO.~D^5\r\u0011=/]+wI\n\u0017\u001e\u001d", "1gP;a,E", "\u001ab^:\")KO.~D^5\r\u0011=/]+wI\n\u0017\u001e\u001d", "5dc\u0010[(G\\\u0019\u0006", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eqYC|  Gvc", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`+M\nIu\f9g\r @m#\u0004", ":hbAX5>`", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`+M\nIu\f9g\r @m#\u0004", "5dc\u0019\\:MS\"~\b", "u(;0b4\bP&z\u0010^u\u0005\u0013.e\u00076E>|$\u0016U9q\u001ar24@\u0002.Fm\u001f.Z\u0019", "Adc\u0019\\:MS\"~\b", "uKR<`u;`\u0015\u0014z(4\u0007\b/l\u000eqy<\u000e\u0016%\u0011Sk8\u0004$\u001c]\f/7v\u0016;#\u0007,", "3mP/_,=", "7r8;W0<O(\t\bA0~\f6i\u0002+\u000b@\u007f", "Adc\u0016a+BQ\u0015\u000e\u0005k\u000f\u0001\u000b2l\u0004*~O\u0001\u0016", "7r36f4Ba'~y", "Adc\u0011\\:FW'\rz]", "7r36f4Ba'~y\u001d(\u0006\u00129t{7\u007fJ\n%", "DhTDX+", "5dc#\\,PS\u0018", "Adc#\\,PS\u0018", "5dc#\\,PS\u0018=vg5\u0007\u0018+t\u00042\u0005N", "7r4Ec0KS\u0018", "7r2<a;K] ", "\u001ab^:\")KO.~D^5\r\u0011=/]$\t?f\u0017+\u0006Z\u001bF\b)4Y\u000bu", "1`a1>,Ra\u0004\f\u0005o0{\t<", "\nh]6g\u0005", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u0015QwW9\u0004!JYG @}\u001e<\u0017!7x3\u0004\u0015| $\u0014m=Ru'T\"5)f\u001cnH\u001f[]X\u0019\u0001s\u0003cImkQ34\buW\u0011Eu|\u000e\u0016W\u0019HlOU}V\u0004\"qC)SScp}FAR8\u0011a\u0016)\u0019gE\u0004,^<n^Y", "1`a1>,R>&\t\fb+|\u0016", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u0015QwW9\u0004!JYG @}\u001e<\u0017!7x3\u0004\u0015| $\u0014m=Ru'T\"\u0012\u001d", "\u0011n\\=T5B]\"", "0n\u001e.c7\bS ", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public class Card implements IPutIntoJson<JSONObject> {
    public static final el Companion = new el();
    private static final long DEFAULT_EXPIRES_AT_VALUE = -1;
    private final h00 brazeManager;
    private final m00 cardAnalytics;
    private final ICardStorageProvider<?> cardStorage;
    private final CardType cardType;
    private EnumSet<CardCategory> categories;
    private final Channel channel;
    private final long created;
    private final long expiresAt;
    private final Map<String, String> extras;
    private final String id;
    private boolean isClicked;
    private final boolean isContentCard;
    private boolean isDismissedInternal;
    private boolean isDismissibleByUser;
    private boolean isIndicatorHighlightedInternal;
    private boolean isPinned;
    private final boolean isRemoved;
    private boolean isTest;
    private final JSONObject jsonObject;
    private ICardListener listener;
    private final boolean openUriInWebView;
    private final long updated;
    private final String url;
    private boolean wasViewedInternal;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Card(JSONObject jsonObject, CardKey.Provider cardKeyProvider) {
        this(jsonObject, cardKeyProvider, null, null, null);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(cardKeyProvider, "cardKeyProvider");
    }

    public Card(JSONObject jsonObject, CardKey.Provider cardKeysProvider, h00 h00Var, ICardStorageProvider<?> iCardStorageProvider, m00 m00Var) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(cardKeysProvider, "cardKeysProvider");
        this.jsonObject = jsonObject;
        this.brazeManager = h00Var;
        this.cardStorage = iCardStorageProvider;
        this.cardAnalytics = m00Var;
        this.extras = JsonUtils.convertJSONObjectToMap(jsonObject.optJSONObject(cardKeysProvider.getKey(CardKey.EXTRAS)));
        String string = jsonObject.getString(cardKeysProvider.getKey(CardKey.ID));
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(car…vider.getKey(CardKey.ID))");
        this.id = string;
        this.isContentCard = cardKeysProvider.isContentCardProvider();
        this.cardType = CardType.DEFAULT;
        this.channel = cardKeysProvider.isContentCardProvider() ? Channel.CONTENT_CARD : Channel.NEWS_FEED;
        this.wasViewedInternal = jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.VIEWED));
        this.isDismissedInternal = jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.DISMISSED), false);
        this.isPinned = jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.PINNED), false);
        this.created = jsonObject.getLong(cardKeysProvider.getKey(CardKey.CREATED));
        this.expiresAt = jsonObject.optLong(cardKeysProvider.getKey(CardKey.EXPIRES_AT), -1L);
        this.openUriInWebView = jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.OPEN_URI_IN_WEBVIEW), false);
        this.isRemoved = jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.REMOVED), false);
        JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray(cardKeysProvider.getKey(CardKey.CATEGORIES));
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            this.categories = EnumSet.of(CardCategory.NO_CATEGORY);
        } else {
            EnumSet<CardCategory> enumSetNoneOf = EnumSet.noneOf(CardCategory.class);
            Iterator it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, jSONArrayOptJSONArray.length())), new fl(jSONArrayOptJSONArray)), new gl(jSONArrayOptJSONArray)).iterator();
            while (it.hasNext()) {
                CardCategory cardCategory = CardCategory.get((String) it.next());
                if (cardCategory != null) {
                    Intrinsics.checkNotNullExpressionValue(cardCategory, "get(categoryString)");
                    enumSetNoneOf.add(cardCategory);
                }
            }
            this.categories = enumSetNoneOf;
        }
        this.updated = this.jsonObject.optLong(cardKeysProvider.getKey(CardKey.UPDATED), this.created);
        this.isDismissibleByUser = this.jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.DISMISSIBLE), false);
        this.isIndicatorHighlightedInternal = this.jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.READ), this.wasViewedInternal);
        this.isClicked = this.jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.CLICKED), false);
        this.isTest = this.jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.IS_TEST), false);
    }

    public static /* synthetic */ void getOpenUriInWebView$annotations() {
    }

    public static /* synthetic */ void getViewed$annotations() {
    }

    public static /* synthetic */ void isDismissed$annotations() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(getClass(), obj.getClass())) {
            return false;
        }
        Card card = (Card) obj;
        return this.updated == card.updated && Intrinsics.areEqual(this.id, card.id);
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        return this.jsonObject;
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public final EnumSet<CardCategory> getCategories() {
        return this.categories;
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final long getCreated() {
        return this.created;
    }

    public final long getExpiresAt() {
        return this.expiresAt;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getId() {
        return this.id;
    }

    public final ICardListener getListener() {
        return this.listener;
    }

    public final boolean getOpenUriInWebView() {
        return this.openUriInWebView;
    }

    public final long getUpdated() {
        return this.updated;
    }

    public String getUrl() {
        return this.url;
    }

    public final boolean getViewed() {
        return this.wasViewedInternal;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        long j2 = this.updated;
        return iHashCode + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final boolean isClicked() {
        return this.isClicked;
    }

    public final boolean isContentCard() {
        return this.isContentCard;
    }

    public final boolean isControl() {
        return getCardType() == CardType.CONTROL;
    }

    public final boolean isDismissed() {
        return this.isDismissedInternal;
    }

    public final boolean isDismissibleByUser() {
        return this.isDismissibleByUser;
    }

    public final boolean isExpired() {
        long j2 = this.expiresAt;
        return j2 != -1 && j2 <= DateTimeUtils.nowInSeconds();
    }

    public final boolean isInCategorySet(EnumSet<CardCategory> categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        EnumSet<CardCategory> enumSet = this.categories;
        if (enumSet == null) {
            return false;
        }
        Iterator<CardCategory> it = categories.iterator();
        while (it.hasNext()) {
            if (enumSet.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean isIndicatorHighlighted() {
        return this.isIndicatorHighlightedInternal;
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public final boolean isRemoved() {
        return this.isRemoved;
    }

    public final boolean isTest() {
        return this.isTest;
    }

    public final boolean isValidCard() {
        if (!StringsKt.isBlank(this.id)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) kl.f1120a, 6, (Object) null);
        return false;
    }

    public final boolean logClick() {
        try {
            this.isClicked = true;
            if (this.brazeManager == null || this.cardAnalytics == null || this.cardStorage == null || !isValidCard()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new ml(this), 6, (Object) null);
                return false;
            }
            e00 e00VarB = this.cardAnalytics.b(this.id);
            if (e00VarB != null) {
                ((tf) this.brazeManager).a(e00VarB);
            }
            this.cardStorage.markCardAsClicked(this.id);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ll(this), 7, (Object) null);
            return true;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new nl(this), 4, (Object) null);
            return false;
        }
    }

    public final boolean logImpression() {
        try {
            if (this.brazeManager == null || this.cardAnalytics == null || this.cardStorage == null || !isValidCard()) {
                return false;
            }
            if (isControl()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new pl(this), 6, (Object) null);
                e00 e00VarC = this.cardAnalytics.c(this.id);
                if (e00VarC != null) {
                    ((tf) this.brazeManager).a(e00VarC);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new ol(this), 6, (Object) null);
                e00 e00VarD = this.cardAnalytics.d(this.id);
                if (e00VarD != null) {
                    ((tf) this.brazeManager).a(e00VarD);
                }
            }
            this.cardStorage.markCardAsViewed(this.id);
            return true;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new ql(this), 4, (Object) null);
            return false;
        }
    }

    public final void setDismissed(boolean z2) {
        e00 e00VarA;
        if (this.isDismissedInternal && z2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) hl.f838a, 6, (Object) null);
            return;
        }
        this.isDismissedInternal = z2;
        ICardStorageProvider<?> iCardStorageProvider = this.cardStorage;
        if (iCardStorageProvider != null) {
            iCardStorageProvider.markCardAsDismissed(this.id);
        }
        if (z2) {
            try {
                if (this.brazeManager == null || this.cardAnalytics == null || !isValidCard() || (e00VarA = this.cardAnalytics.a(this.id)) == null) {
                    return;
                }
                ((tf) this.brazeManager).a(e00VarA);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) il.f923a, 4, (Object) null);
            }
        }
    }

    public final void setDismissibleByUser(boolean z2) {
        this.isDismissibleByUser = z2;
    }

    public final void setIndicatorHighlighted(boolean z2) {
        ICardStorageProvider<?> iCardStorageProvider;
        this.isIndicatorHighlightedInternal = z2;
        try {
            ICardListener iCardListener = this.listener;
            if (iCardListener != null) {
                iCardListener.onCardUpdate();
            }
        } catch (Exception unused) {
        }
        if (!z2 || (iCardStorageProvider = this.cardStorage) == null) {
            return;
        }
        try {
            iCardStorageProvider.markCardAsVisuallyRead(this.id);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) e2, false, (Function0) jl.f1021a, 4, (Object) null);
        }
    }

    public final void setListener(ICardListener iCardListener) {
        this.listener = iCardListener;
    }

    public final void setPinned(boolean z2) {
        this.isPinned = z2;
    }

    public final void setTest(boolean z2) {
        this.isTest = z2;
    }

    public final void setViewed(boolean z2) {
        this.wasViewedInternal = z2;
        ICardStorageProvider<?> iCardStorageProvider = this.cardStorage;
        if (iCardStorageProvider != null) {
            iCardStorageProvider.markCardAsViewed(this.id);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\n            Card{\n            extras=");
        sb.append(this.extras).append("\n            id='").append(this.id).append("'\n            created=").append(this.created).append("\n            updated=").append(this.updated).append("\n            expiresAt=").append(this.expiresAt).append("\n            categories=").append(this.categories).append("\n            isContentCard=").append(this.isContentCard).append("\n            viewed=").append(this.wasViewedInternal).append("\n            isRead=").append(this.isIndicatorHighlightedInternal).append("\n            isDismissed=").append(this.isDismissedInternal).append("\n            isRemoved=").append(this.isRemoved).append("\n            isPinned=");
        sb.append(this.isPinned).append("\n            isClicked=").append(this.isClicked).append("\n            openUriInWebview=").append(this.openUriInWebView).append("\n            isDismissibleByUser=").append(this.isDismissibleByUser).append("\n            isTest=").append(this.isTest).append("\n            json=").append(JsonUtils.getPrettyPrintedString(this.jsonObject)).append("\n            }\n\n        ");
        return StringsKt.trimIndent(sb.toString());
    }
}
