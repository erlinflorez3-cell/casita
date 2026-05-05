package com.braze.enums;

import bo.app.rl;
import com.biocatch.client.android.sdk.core.Constants;
import com.braze.models.FeatureFlag;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.facebook.common.callercontext.ContextChain;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
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
@Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u000eRLc\u0003\u0010I\u0006684Ș}8ܥ0\u00017lz;@D\u0014߉\\Q\f*\u0019v<K*[4uQ<m\u001a,\"\u0019S\\l\u007fnxZŲG\u0011\f\u001d\u0007r|^cyu\u0012=2xsУ7Ww??a\u00038\u001d\"8%F}U\u0016(/`\u0010%zyOë\u0016:Hr@W\u001bO\u001d\u001c\u0018\fL$i\u001ebs76NyF:51kiH]\u0010_6\r6\rLe\u0010\r|s\u0007+FJ\u001e\u0015+gk\u0007Xp(\u0003E\b&\u0005n>\u0010+O\f@6^\u0019|\u00151iu]xAE\u0005W|t'1lLKV,\u0011w\u0001\u001bu<\n.n'NO\u0016\u001al*v3z\u0016<@V&GB\u0006 J6\u001dKh31`\u0004fW\n$\u0019T`d\u0005\u0013H\f\u0001tLDT\u0014\r}\u001bZ%:1WnשL}"}, d2 = {"\u001ab^:\")KO.~D^5\r\u0011=/]$\t?f\u0017+\u001d", "", "", "4dT1>,R", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0013X,=9\u0019\u0013", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n]AX5M1\u0015\fyl\u0012|\u001d", "5dc\u0010b5MS\"\u000eXZ9{\u0017\u0015e\u0014", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044H7|0g\u001cdj;PQ;[z0I\"\u0012\u001d", "\u0011n\\=T5B]\"", "0n\u001e.c7\b` ", "\u001eq^C\\+>`", "\u0017C", "$H4$8\u000b", "\u0011Q4\u000eG\f\u001d", "\u0013W?\u0016E\f,Mtm", "\u0013WC\u001f4\u001a", "\u001dO4\u001bR\u001c+7\u0013bcX\u001e\\e I_\u001a", "\"X?\u0012", "\u0011@C\u0012:\u0016+7xl", "#O3\u000eG\f\u001d", "\u0012HB\u001a<\u001a,3w", " D<\u001cI\f\u001d", "\u001eH=\u001b8\u000b", "\u0012HB\u001a<\u001a,7ueZ", "\u0017RN!8\u001a-", " D0\u0011", "\u0011K8\u0010>\f\u001d", "\u0017L0\u00148&(<\u007frtB\u0014Xj\u000f", "\u0017L0\u00148&(<\u007frtN\u0019c", "\u0017L0\u00148&(<\u007frt=\u0016dd\u0013N", "\u0017L0\u00148&(<\u007frt:\u001agh\rTy\u0015W/d\u0001", "\u0011@?!<\u0016'3wx^F\b^h)Ig\u0004] ", "\u0011@?!<\u0016'3wx^F\b^h)Tc\u0017b ", "\u0011@?!<\u0016'3wx^F\b^h)D_\u0016Y-d\u0002\u0006+Yv", "\u0011@?!<\u0016'3wx^F\b^h)Ul\u000f", "\u0011@?!<\u0016'3wx^F\b^h)Di\u0010W$i", "\u0011@?!<\u0016'3wx^F\b^h)Am\u0013[\u001eo\u0011\u0004#^q&", "\"DG!R\b'<\u0003nc<\fdh\u0018Ty\u0017_/gv", "\"DG!R\b'<\u0003nc<\fdh\u0018Ty\u0007[.^\u0004z2^q&_", "\"DG!R\b'<\u0003nc<\fdh\u0018Ty\u0018h'", "\"DG!R\b'<\u0003nc<\fdh\u0018Ty\u0007e(\\z\u007f", "!G>\u001fG&'3\u000bltB\u0014Xj\u000f", "!G>\u001fG&'3\u000bltM\u0010ko\u000f", "!G>\u001fG&'3\u000blt=\fjf\u001cIj\u0017_*i", "!G>\u001fG&'3\u000bltN\u0019c", "!G>\u001fG&'3\u000blt=\u0016dd\u0013N", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public enum CardKey {
    ID("id", "id"),
    VIEWED("viewed", "v"),
    CREATED("created", "ca"),
    EXPIRES_AT("expires_at", "ea"),
    EXTRAS(InAppMessageBase.EXTRAS, "e"),
    OPEN_URI_IN_WEBVIEW(InAppMessageBase.OPEN_URI_IN_WEBVIEW, "uw"),
    TYPE("type", "tp"),
    CATEGORIES("categories", ""),
    UPDATED("updated", ""),
    DISMISSED("", "d"),
    REMOVED("", "r"),
    PINNED("", "p"),
    DISMISSIBLE("", "db"),
    IS_TEST("", "t"),
    READ("", "read"),
    CLICKED("", "cl"),
    IMAGE_ONLY_IMAGE(FeatureFlag.PROPERTIES_TYPE_IMAGE, ContextChain.TAG_INFRA),
    IMAGE_ONLY_URL("url", "u"),
    IMAGE_ONLY_DOMAIN(ClientCookie.DOMAIN_ATTR, ""),
    IMAGE_ONLY_ASPECT_RATIO("aspect_ratio", "ar"),
    CAPTIONED_IMAGE_IMAGE(FeatureFlag.PROPERTIES_TYPE_IMAGE, ContextChain.TAG_INFRA),
    CAPTIONED_IMAGE_TITLE("title", "tt"),
    CAPTIONED_IMAGE_DESCRIPTION("description", Constants.DEVICE_SOURCE_META_FIELD),
    CAPTIONED_IMAGE_URL("url", "u"),
    CAPTIONED_IMAGE_DOMAIN(ClientCookie.DOMAIN_ATTR, "dm"),
    CAPTIONED_IMAGE_ASPECT_RATIO("aspect_ratio", "ar"),
    TEXT_ANNOUNCEMENT_TITLE("title", "tt"),
    TEXT_ANNOUNCEMENT_DESCRIPTION("description", Constants.DEVICE_SOURCE_META_FIELD),
    TEXT_ANNOUNCEMENT_URL("url", "u"),
    TEXT_ANNOUNCEMENT_DOMAIN(ClientCookie.DOMAIN_ATTR, "dm"),
    SHORT_NEWS_IMAGE(FeatureFlag.PROPERTIES_TYPE_IMAGE, ContextChain.TAG_INFRA),
    SHORT_NEWS_TITLE("title", "tt"),
    SHORT_NEWS_DESCRIPTION("description", Constants.DEVICE_SOURCE_META_FIELD),
    SHORT_NEWS_URL("url", "u"),
    SHORT_NEWS_DOMAIN(ClientCookie.DOMAIN_ATTR, "dm");

    private final String contentCardsKey;
    private final String feedKey;
    public static final rl Companion = new Object() { // from class: bo.app.rl
    };
    private static final String IMAGE_ONLY_KEY = "banner_image";
    private static final String CAPTIONED_IMAGE_KEY = "captioned_image";
    private static final String TEXT_ANNOUNCEMENT_KEY = "text_announcement";
    private static final String SHORT_NEWS_KEY = "short_news";
    private static final String CONTROL_KEY = "control";
    private static final Map<String, CardType> cardTypeMap = MapsKt.mapOf(TuplesKt.to(IMAGE_ONLY_KEY, CardType.IMAGE), TuplesKt.to(CAPTIONED_IMAGE_KEY, CardType.CAPTIONED_IMAGE), TuplesKt.to(TEXT_ANNOUNCEMENT_KEY, CardType.TEXT_ANNOUNCEMENT), TuplesKt.to(SHORT_NEWS_KEY, CardType.SHORT_NEWS), TuplesKt.to(CONTROL_KEY, CardType.CONTROL));

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLc\u000b\u0004Iي8\u000b<N\u0007\"2\u0012\u007f\u0007|jAӄLe^.ZS0\u0012s{B-c$wIAZ0Ԃ@\u001c\u007fN\u0016f'InKP\u001f\n$\u0007\u0003,wbޯa\u0014\u0015CP\u0002\bF[rU9\u000fvf\t.3:8(\u0005в\u001e,N\u0013\u0005~\f`\u001a\u001aHB\u00079\u0001\u0014}\t(\u0018\u001e>N\u0006ɉ`iT>Vu&O=.\u001bkXMUa`\u0001[\u0017^TU\u0014țe 1KEAe:a\u0011\u001fR\nL9CџA\u000fp)-9W\u0003o8^\u000e\"%۩S\""}, d2 = {"\u001ab^:\")KO.~D^5\r\u0011=/]$\t?f\u0017+\u0006Z\u001bF\b)4Y\u000bu", "", "\u001ab^:\")KO.~D^5\r\u0011=/]$\t?f\u0017+\u001d", "9dh", "", "5dc\u0018X@", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI\u0006wM\u007f|\u0017[EQ#{!FUG'3v\u0018w;RHo= j", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "8r^;B)CS\u0017\u000e", "\u001ab^:\")KO.~D^5\r\u0011=/]$\t?o+\"GE", "5dc\u0010T9=B-\nz?9\u0007\u0011\u0014s\n1", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOVZ}Ey\u0016\u0006s21n}i7v&6[\r\u0019gA\u001d\u0004|l9\\", "1`a1G@IS", "5dc X9OS&dzr\r\n\u00137C{5z/\u0015\"\u0017", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI\u0006wM\u007f\u0006+Roc\u007f]*1jyi>i\u001f0\u00171Jx8'\u0017>", "", "7r2<a;>\\(\\vk+g\u00169v\u0004'{M", "(", "u(I", "\nh]6g\u0005", "uY\u0018#", "\u0011n\\=T5B]\"", "1n\\{U9:h\u0019Hzg<\u0005\u0017xa", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
    public static final class Provider {
        private final boolean isContentCardProvider;
        public static final a Companion = new a();
        public static final Provider CONTENT_CARDS = new Provider(true);
        public static final Provider NEWS_FEED = new Provider(false);

        public Provider(boolean z2) {
            this.isContentCardProvider = z2;
        }

        public final CardType getCardTypeFromJson(JSONObject jsonObject) {
            String optionalString;
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String optionalString2 = JsonUtils.getOptionalString(jsonObject, getKey(CardKey.TYPE));
            if (optionalString2 != null && optionalString2.length() != 0 && this.isContentCardProvider && Intrinsics.areEqual(optionalString2, CardKey.SHORT_NEWS_KEY) && ((optionalString = JsonUtils.getOptionalString(jsonObject, getKey(CardKey.SHORT_NEWS_IMAGE))) == null || optionalString.length() == 0)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b(jsonObject), 6, (Object) null);
                optionalString2 = CardKey.TEXT_ANNOUNCEMENT_KEY;
            }
            return CardKey.cardTypeMap.containsKey(optionalString2) ? (CardType) CardKey.cardTypeMap.get(optionalString2) : CardType.DEFAULT;
        }

        public final String getKey(CardKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this.isContentCardProvider ? key.getContentCardsKey() : key.getFeedKey();
        }

        public final String getServerKeyFromCardType(CardType cardType) {
            Intrinsics.checkNotNullParameter(cardType, "cardType");
            for (Map.Entry entry : CardKey.cardTypeMap.entrySet()) {
                String str = (String) entry.getKey();
                if (cardType == ((CardType) entry.getValue())) {
                    return str;
                }
            }
            return null;
        }

        public final boolean isContentCardProvider() {
            return this.isContentCardProvider;
        }
    }

    CardKey(String str, String str2) {
        this.feedKey = str;
        this.contentCardsKey = str2;
    }

    public final String getContentCardsKey() {
        return this.contentCardsKey;
    }

    public final String getFeedKey() {
        return this.feedKey;
    }
}
