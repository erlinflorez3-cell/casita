package com.braze;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.braze.enums.Channel;
import com.braze.ui.actions.NewsfeedAction;
import com.braze.ui.actions.UriAction;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLeV7Zݷ2\u000f\u0002{<$a$yCIa\"Ԃ*\t]To˧vJp\u000bKƤ\u000e\u0016\u0007j4կ]xs\u0012\u0017˰JoU3UoC;fYLӌP2P72\u0004\u001abRV\u0010\u000fzqL<\u0016>B\t:\u0001\u0010}\u000b(\u0016\u001e@6\u007fLa\u0018RDN\u0005]h6S\u0007wJf'\u000e9CqUpb1%xw\u001dYAg9#0k\u00035^\fE\u0011C\n?\u001bgU,[M\u0002]NX.\u001bE/]\u0015urTeKu)\u001a58gcy^>,\u0006\n\u0014\rj\u0014T*o^<>2f6 cx\u0001fXP0rr\u0004\tvN\u0017S\u0016yO\u00021thy;G`g\u007f\u0013 6#/\u0003Q_b&x\u0015IU>uƱP̵׃HR\u0012[C\r2oĐ\u0006D˷4F"}, d2 = {"\u001ab^:\")KO.~DB\t\n\u0005De^({K\b\u001b MR\nEu,5fS", "", "1qT.g,.`\u001dZxm0\u0007\u0012\u0010r\n0kM\u0005", "\u001ab^:\")KO.~Dn0F\u0005-t\u00042\u0005NJ\u0007$KK\fKz/>/", "CqX", "\u001a`]1e6BRb\bzmul\u00163;", "3wc?T:", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=oT;<50S\u0016o~^>", "", "1gP;a,E", "\u001ab^:\")KO.~D^5\r\u0011=/]+wI\n\u0017\u001e\u001d", "1qT.g,.`\u001dZxm0\u0007\u0012\u0010r\n0kM\b\u0005&Ts\u0017>", "Cq[", "", "5dc\u0016a;>\\(_\u0002Z.\u000b", "", "7mc2a;\u001fZ\u0015\u0001en9\b\u0013=e", "\u001ab^:\")KO.~DB\t\n\u0005De^({K\b\u001b MR\nEu,5f<\u0004@|\u00167\\$Bg6\t%ulC\u0015c\u0002", "5nc<A,Pay~z]", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "<df@Y,>Rt|\nb6\u0006", "\u001ab^:\")KO.~Dn0F\u0005-t\u00042\u0005NJ\u007f\u0017Y}\u000f<v$\u0011W\r$Avk", "5nc<H9B", "CqX\u000eV;B]\"", "\u0017mc2a;\u001fZ\u0015\u0001en9\b\u0013=e", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface IBrazeDeeplinkHandler {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u000bGّ/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001\u000b\tURPgtOC\u000bI\u0015n\u0016~q\u0082M]"}, d2 = {"\u001ab^:\")KO.~DB\t\n\u0005De^({K\b\u001b MR\nEu,5f<\u0004@|\u00167\\$Bg6\t%ulC\u0015c\u0002", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001cNC\u00169\u0010\u001c/\bbdG&Xf\u001eIi\u0011u2d\u0006yANm\u001ca\f\u0019Bc", "\u001cNC\u00169\u0010\u001c/\bbdG&gx\u001dHy\u0016j*m\u000b\u00112Ko\u001cp\u0003\u001c=[\u0006", "#Q8,4\n-7\u0003gtH\u0017\\q)Wc\u0017^:rvs8Sm.p\u0001\u0013Ha\u0011\u001b\\\n", "#Q8,4\n-7\u0003gtH\u0017\\q)Wc\u0017^:\\t\u0006+Yv6g\t\u0015K", "#Q8,4\n-7\u0003gt;\bZn)Sn\u0004Y&zxv6iz&`\u0014/=f\u000f\u0017V\u0005", "#Q8,4\n-7\u0003gt;\bZn)Sn\u0004Y&z\u0001\u007f.c\b\u001eV\u0014/HY\r\u0019M\u0005(1,*K\u001d\r", "#Q8,H\u001b\":\u0007x\\>\u001bvp\u000bIh\"W\u001eoz\b+^\u00026Z\u000e$9f\u000f", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum IntentFlagPurpose {
        NOTIFICATION_ACTION_WITH_DEEPLINK,
        NOTIFICATION_PUSH_STORY_PAGE_CLICK,
        URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY,
        URI_ACTION_OPEN_WITH_ACTION_VIEW,
        URI_ACTION_BACK_STACK_GET_ROOT_INTENT,
        URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT,
        URI_UTILS_GET_MAIN_ACTIVITY_INTENT
    }

    UriAction createUriActionFromUri(Uri uri, Bundle bundle, boolean z2, Channel channel);

    UriAction createUriActionFromUrlString(String str, Bundle bundle, boolean z2, Channel channel);

    int getIntentFlags(IntentFlagPurpose intentFlagPurpose);

    void gotoNewsFeed(Context context, NewsfeedAction newsfeedAction);

    void gotoUri(Context context, UriAction uriAction);
}
