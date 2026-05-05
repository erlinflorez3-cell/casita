package com.braze.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeDateFormat;
import com.braze.enums.BrazeViewBounds;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
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
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0006G\u001aFéLC/\"Z\u00110\u0007gly3ǲiH<Rޠ.\u0012"}, d2 = {"\u001ab^:\")KO.~Di<\u000b\fxB\r$\u0011@i!&Kp\u0012:r49c\u0007\u000eF\u0002\u001d..?9z>+)>", "", "u(E", "\u0011n\\=T5B]\"", "\u001cn>=F,Gb\u001d\bze\u001a\f\u001d6e", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class BrazeNotificationStyleFactory {
    private static final int BIG_PICTURE_STYLE_IMAGE_HEIGHT = 192;
    public static final Companion Companion = new Companion(null);
    private static final String STORY_SET_GRAVITY = "setGravity";
    private static final String STORY_SET_VISIBILITY = "setVisibility";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яz\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\":\u001e\u007f\u0007ljA0ZeP\u008cZS@\u000fsڔ<$q$yّCU0}*\tUNog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4կ]xs\u0012\u0017˰JoU3UڎE9vt>ӌ(288\u0002\u0005\u0007\u001a2H&v\u0003ŏS\f 9Hp@R\u0015M\u001b\u001a\u001aßF \u000f\u001edgT7Nǔ^PǂS\u0003\u0018A\u000f,e0ƊQ\rTTo+\u0005g6+n>e\u00193[\u001b\u0007\u0001do\u0007M{U\u0005\u00172W/W\u007fo6\u0007\rZ\u0015so\u001bk\u000b&\u000b\f\u0002d\u001a/CO\u0012T\u0001\u00146\u0007\u0013}#;2\u001e6+V?E\u001a\u0015\nT3=\u0001aRh\u0004tA.\u000e\u0012:%/\u00183YDcr_uS\u0019|L,\t\u001b(;\u0001\u001d,$j\u001cv-\u001djv\u007fH\u0002DK`f\n\bV\u001e\b~l\u001a*2;\u0010\u0018=\u0016)0-$evi'/u\u001aHrr'\tn\u0001ki\u0001a\u0007'7*EF!\f\t_\u0015\tyhlXZ*} b\u0011\u0016\bA+%\u000eJ>=\u0012dN\u0017\b\u001bQk\"=/\u0015P\nry\u0018o9\r>}_q/yR%4o@p\rpfp\\RZ%F0S`j>\u0018,H\\.+2m\u0015L8:;1\\CS3\"PM\u0015\t\u000eg/\u0010GjAH\u001biR\u001a9\u0005^\u0003\to\u0016\fy0\u000bj:-o\\{\u001enk0\u0010L|Q,/w\u000e_\u007fLue\u001d\u001a\u0004_\u0014 D%\u007fV\u007fI!\u0010\u0017)`\u0004\u0004թ\u001fȌiQUȼw\u0007\u000b|';\u00172>Ő=Ҕ0`r\u07ba `%'\u000f^!'^۰R\u05fbeF\u0003òϳX3"}, d2 = {"\u001ab^:\")KO.~Di<\u000b\fxB\r$\u0011@i!&Kp\u0012:r49c\u0007\u000eF\u0002\u001d..?9z>+)'?C\u000fn(Wz1P\"", "", "u(E", "\u0010H6,C\u0010\u001cB\tkZX\u001ak|\u0016Ey\fc\u001cbv\u0011*Oq\u001eY\u0014", "", "!S>\u001fL&,3\bx\\K\bml\u001eY", "", "!S>\u001fL&,3\bxkB\u001a`e\u0013Lc\u0017o", "1qT.g,,b#\f\u000fI(~\t\rl\u0004&\u0002@\u007f\u0002\u0017Pn\u0012Ex\t>h})F", "\u001a`]1e6BRbz\u0006iug\t8d\u00041}$\n&\u0017P~c", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">`h9b(=", "\u001ab^:\")KO.~Df6{\t6sI3\fN\u0004`sTk#<_/D]~$5i%2WL&gH%\u001fd`\u000f", ">tb5F;H`-iv`,", "\u001ab^:\")KO.~Df6{\t6sI3\fN\u0004`sTk#<_/D]~$5i%2WL&gH%\u001fd`wqs:Qd6QYb\u0017XTr\u0013", "1qT.g,,b#\f\u000fM9x\u001a/r\u000e(z+\u0001 \u0016Kx\u0010 \u007f45b\r", "<nc6Y0<O(\u0003\u0005g\f\u0010\u0018<a\u000e", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", ">`V2<5=S,", "5dc\u000f\\.)W\u0017\u000e\u000bk,e\u0013>i\u0001,y<\u0010\u001b!P]\u001dP}%", "\u001a`]1e6BR,Hxh9|R+p\u000bqdJ\u0010\u001b\u0018Km\nKz/>7\b(Bi%l*G=V8\u001c$xn9tr@Uv|", "5dc\u000f\\.-S,\u000ech;\u0001\n3c{7\u007fJ\n\u0005&[v\u000e", "\u001a`]1e6BR,Hxh9|R+p\u000bqdJ\u0010\u001b\u0018Km\nKz/>7\b(Bi%l*G=Z41$VpM\u000ec\u0002", "5dc\u0010b5OS&\rvm0\u0007\u0012+lj8\nCn&+No", "\u001a`]1e6BR,Hxh9|R+p\u000bqdJ\u0010\u001b\u0018Km\nKz/>7\b(Bi%l5CIy0 \u0019qc'\u0016w3NL", "<nc6Y0<O(\u0003\u0005g\t\r\r6d\u007f5", "\u001a`]1e6BR,Hxh9|R+p\u000bqdJ\u0010\u001b\u0018Km\nKz/>7\b(Bi%l*S?r3\u001e\">", "5dc\u0016a3B\\\u0019b\u0003Z.|v>y\u0007(", "\u001a`]1e6BR,Hxh9|R+p\u000bqdJ\u0010\u001b\u0018Km\nKz/>7\b(Bi%l;ROr4s", "5dc\u001bb;BT\u001d|vm0\u0007\u0012\u001dt\u0014/{", "5dc g6Kg\u0007\u000e\u000fe,", "\u001a`]1e6BR,Hxh9|R+p\u000bqdJ\u0010\u001b\u0018Km\nKz/>7\b(Bi%l,C9uA\u001a$h`\u0017\u0017q;X~\u0018KL`\u001akfy=i", "7rA2`6MS\n\u0003zp\u0015\u0007\u00183f\u0004&wO\u0005! #\u0001\n@}!2`}\u000eBi\u0014.+MDyC+\u0011lj9\u0006", "", ">n_B_(MS\u0004\u000f\ta\u001a\f\u0013<yj$}@", "DhTD", "\u001a`]1e6BRb\u0011~].|\u0018xR\u007f0\u0006O\u0001\b\u001bG\u0002\u001c\u0012", "Adc\u000f\\.)W\u0017\u000e\u000bk,j\u00197m{5\u0010\u001c\n\u0016\u0006K~\u0015<", "", "0hV\u001d\\*Mc&~ch;\u0001\n3c{7\u007fJ\n\u0005&[v\u000e", "Adc g@ES|\u007fhn7\b\u0013<t\u007f'", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final PendingIntent createStoryPageClickedPendingIntent(Context context, BrazeNotificationPayload brazeNotificationPayload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            Intent intent = new Intent(Constants.BRAZE_STORY_CLICKED_ACTION).setClass(context, NotificationTrampolineActivity.class);
            Intrinsics.checkNotNullExpressionValue(intent, "Intent(Constants.BRAZE_S…lineActivity::class.java)");
            int flags = intent.getFlags();
            int intentFlags = BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_PUSH_STORY_PAGE_CLICK);
            intent.setFlags((flags + intentFlags) - (flags & intentFlags));
            intent.putExtras(brazeNotificationPayload.getNotificationExtras());
            intent.putExtra(Constants.BRAZE_ACTION_URI_KEY, pushStoryPage.getDeeplink());
            intent.putExtra(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY, pushStoryPage.getUseWebview());
            intent.putExtra(Constants.BRAZE_STORY_PAGE_ID, pushStoryPage.getStoryPageId());
            intent.putExtra(Constants.BRAZE_CAMPAIGN_ID, pushStoryPage.getCampaignId());
            intent.putExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, BrazeNotificationUtils.getNotificationId(brazeNotificationPayload));
            PendingIntent activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags());
            Intrinsics.checkNotNullExpressionValue(activity, "getActivity(\n           …tentFlags()\n            )");
            return activity;
        }

        private final PendingIntent createStoryTraversedPendingIntent(Context context, Bundle bundle, int i2) {
            Intent intent = new Intent(Constants.BRAZE_STORY_TRAVERSE_CLICKED_ACTION).setClass(context, BrazeNotificationUtils.getNotificationReceiverClass());
            Intrinsics.checkNotNullExpressionValue(intent, "Intent(Constants.BRAZE_S…otificationReceiverClass)");
            if (bundle != null) {
                bundle.putInt(Constants.BRAZE_STORY_INDEX_KEY, i2);
                intent.putExtras(bundle);
            }
            int immutablePendingIntentFlags = IntentUtils.getImmutablePendingIntentFlags();
            PendingIntent broadcast = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, (1073741824 + immutablePendingIntentFlags) - (1073741824 & immutablePendingIntentFlags));
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(\n          …      flags\n            )");
            return broadcast;
        }

        private final boolean isRemoteViewNotificationAvailableSpaceConstrained(Context context) throws Throwable {
            Object obj;
            if (Build.VERSION.SDK_INT >= 31) {
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.ud("O[P]YRL\u0015ITRWGOT\r!LJO?QL", (short) (Od.Xd() ^ (-30708)))).getMethod(C1561oA.yd("YVh4^]\\XMJ`TUS+VPUI[R", (short) (FB.Xd() ^ 29966)), new Class[0]);
                try {
                    method.setAccessible(true);
                    Context context2 = (Context) method.invoke(context, objArr);
                    Class<?> cls = Class.forName(C1561oA.Yd("`netrmi4jww~pz\u0002<R\u007f\u007f\u0007x\r\n", (short) (FB.Xd() ^ 10409)));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr2 = new Object[0];
                    short sXd = (short) (OY.Xd() ^ 25478);
                    short sXd2 = (short) (OY.Xd() ^ 4598);
                    int[] iArr = new int["]\\l:jkhfa`tjqqMslv".length()];
                    QB qb = new QB("]\\l:jkhfa`tjqqMslv");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                        i2++;
                    }
                    Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                    try {
                        method2.setAccessible(true);
                        ApplicationInfo applicationInfo = (ApplicationInfo) method2.invoke(context2, objArr2);
                        String strWd = Jg.Wd("3\u001e\u0013\u001f\u001fyp=s[[dQ;D{=\u001d[m\u001e}xvpOaV];\u0014<3\u001a", (short) (OY.Xd() ^ 26727), (short) (OY.Xd() ^ 23972));
                        String strXd = ZO.xd("\u000fsXlNG\u0011VjfM&%@kF", (short) (ZN.Xd() ^ 15977), (short) (ZN.Xd() ^ 31540));
                        try {
                            Class<?> cls2 = Class.forName(strWd);
                            Field field = 1 != 0 ? cls2.getField(strXd) : cls2.getDeclaredField(strXd);
                            field.setAccessible(true);
                            obj = field.get(applicationInfo);
                        } catch (Throwable th) {
                            obj = null;
                        }
                        if (((Integer) obj).intValue() >= 31) {
                            return true;
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            return false;
        }

        private final boolean populatePushStoryPage(RemoteViews remoteViews, BrazeNotificationPayload brazeNotificationPayload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            Context context = brazeNotificationPayload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$populatePushStoryPage$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Push story page cannot render without a context";
                    }
                }, 7, (Object) null);
                return false;
            }
            BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
            if (configurationProvider == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$populatePushStoryPage$2
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Push story page cannot render without a configuration provider";
                    }
                }, 7, (Object) null);
                return false;
            }
            String bitmapUrl = pushStoryPage.getBitmapUrl();
            String str = bitmapUrl;
            if (str == null || StringsKt.isBlank(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$populatePushStoryPage$3
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Push story page image url invalid";
                    }
                }, 7, (Object) null);
                return false;
            }
            Bitmap pushBitmapFromUrl = Braze.Companion.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, brazeNotificationPayload.getNotificationExtras(), bitmapUrl, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
            if (pushBitmapFromUrl == null) {
                return false;
            }
            remoteViews.setImageViewBitmap(R.id.com_braze_story_image_view, pushBitmapFromUrl);
            String title = pushStoryPage.getTitle();
            String str2 = title;
            if (str2 == null || StringsKt.isBlank(str2)) {
                remoteViews.setInt(R.id.com_braze_story_text_view_container, BrazeNotificationStyleFactory.STORY_SET_VISIBILITY, 8);
            } else {
                remoteViews.setTextViewText(R.id.com_braze_story_text_view, HtmlUtils.getHtmlSpannedTextIfEnabled(title, configurationProvider));
                remoteViews.setInt(R.id.com_braze_story_text_view_container, BrazeNotificationStyleFactory.STORY_SET_GRAVITY, pushStoryPage.getTitleGravity());
            }
            String subtitle = pushStoryPage.getSubtitle();
            String str3 = subtitle;
            if (str3 == null || StringsKt.isBlank(str3)) {
                remoteViews.setInt(R.id.com_braze_story_text_view_small_container, BrazeNotificationStyleFactory.STORY_SET_VISIBILITY, 8);
            } else {
                remoteViews.setTextViewText(R.id.com_braze_story_text_view_small, HtmlUtils.getHtmlSpannedTextIfEnabled(subtitle, configurationProvider));
                remoteViews.setInt(R.id.com_braze_story_text_view_small_container, BrazeNotificationStyleFactory.STORY_SET_GRAVITY, pushStoryPage.getSubtitleGravity());
            }
            remoteViews.setOnClickPendingIntent(R.id.com_braze_story_relative_layout, createStoryPageClickedPendingIntent(context, brazeNotificationPayload, pushStoryPage));
            return true;
        }

        public final NotificationCompat.BigPictureStyle getBigPictureNotificationStyle(BrazeNotificationPayload payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            Context context = payload.getContext();
            if (context == null) {
                return null;
            }
            final String bigImageUrl = payload.getBigImageUrl();
            String str = bigImageUrl;
            if (str == null || StringsKt.isBlank(str)) {
                return null;
            }
            Bitmap pushBitmapFromUrl = Braze.Companion.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, payload.getNotificationExtras(), bigImageUrl, BrazeViewBounds.NOTIFICATION_EXPANDED_IMAGE);
            if (pushBitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Failed to download image bitmap for big picture notification style. Url: " + bigImageUrl;
                    }
                }, 7, (Object) null);
                return null;
            }
            try {
                if (pushBitmapFromUrl.getWidth() > pushBitmapFromUrl.getHeight()) {
                    int pixelsFromDensityAndDp = BrazeImageUtils.getPixelsFromDensityAndDp(BrazeImageUtils.getDensityDpi(context), 192);
                    int i2 = pixelsFromDensityAndDp * 2;
                    int displayWidthPixels = BrazeImageUtils.getDisplayWidthPixels(context);
                    if (i2 > displayWidthPixels) {
                        i2 = displayWidthPixels;
                    }
                    try {
                        pushBitmapFromUrl = Bitmap.createScaledBitmap(pushBitmapFromUrl, i2, pixelsFromDensityAndDp, true);
                    } catch (Exception e2) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$2
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Failed to scale image bitmap, using original.";
                            }
                        }, 4, (Object) null);
                    }
                }
                if (pushBitmapFromUrl == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$3
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Bitmap download failed for push notification. No image will be included with the notification.";
                        }
                    }, 6, (Object) null);
                    return null;
                }
                NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
                bigPictureStyle.bigPicture(pushBitmapFromUrl);
                setBigPictureSummaryAndTitle(bigPictureStyle, payload);
                return bigPictureStyle;
            } catch (Exception e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$4
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Failed to create Big Picture Style.";
                    }
                }, 4, (Object) null);
                return null;
            }
        }

        public final NotificationCompat.BigTextStyle getBigTextNotificationStyle(BrazeNotificationPayload payload) {
            CharSequence htmlSpannedTextIfEnabled;
            Intrinsics.checkNotNullParameter(payload, "payload");
            NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                return bigTextStyle;
            }
            String contentText = payload.getContentText();
            if (contentText != null && (htmlSpannedTextIfEnabled = HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider)) != null) {
                bigTextStyle.bigText(htmlSpannedTextIfEnabled);
            }
            String bigSummaryText = payload.getBigSummaryText();
            if (bigSummaryText != null) {
                bigTextStyle.setSummaryText(HtmlUtils.getHtmlSpannedTextIfEnabled(bigSummaryText, configurationProvider));
            }
            String bigTitleText = payload.getBigTitleText();
            if (bigTitleText != null) {
                bigTextStyle.setBigContentTitle(HtmlUtils.getHtmlSpannedTextIfEnabled(bigTitleText, configurationProvider));
            }
            return bigTextStyle;
        }

        public final NotificationCompat.MessagingStyle getConversationalPushStyle(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
            Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
            Intrinsics.checkNotNullParameter(payload, "payload");
            try {
                Map<String, BrazeNotificationPayload.ConversationPerson> conversationPersonMap = payload.getConversationPersonMap();
                BrazeNotificationPayload.ConversationPerson conversationPerson = conversationPersonMap.get(payload.getConversationReplyPersonId());
                if (conversationPerson == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getConversationalPushStyle$1
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Reply person does not exist in mapping. Not rendering a style";
                        }
                    }, 7, (Object) null);
                    return null;
                }
                NotificationCompat.MessagingStyle messagingStyle = new NotificationCompat.MessagingStyle(conversationPerson.getPerson());
                for (final BrazeNotificationPayload.ConversationMessage conversationMessage : payload.getConversationMessages()) {
                    BrazeNotificationPayload.ConversationPerson conversationPerson2 = conversationPersonMap.get(conversationMessage.getPersonId());
                    if (conversationPerson2 == null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getConversationalPushStyle$2
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Message person does not exist in mapping. Not rendering a style. " + conversationMessage;
                            }
                        }, 7, (Object) null);
                        return null;
                    }
                    messagingStyle.addMessage(conversationMessage.getMessage(), conversationMessage.getTimestamp(), conversationPerson2.getPerson());
                }
                messagingStyle.setGroupConversation(conversationPersonMap.size() > 1);
                notificationBuilder.setShortcutId(payload.getConversationShortcutId());
                return messagingStyle;
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getConversationalPushStyle$3
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Failed to create conversation push style. Returning null.";
                    }
                }, 4, (Object) null);
                return null;
            }
        }

        public final NotificationCompat.Style getInlineImageStyle(BrazeNotificationPayload brazeNotificationPayload, NotificationCompat.Builder builder) throws Throwable {
            ApplicationInfo applicationInfo;
            Intrinsics.checkNotNullParameter(brazeNotificationPayload, C1626yg.Ud(">iw\t\u001bXh", (short) (Od.Xd() ^ (-877)), (short) (Od.Xd() ^ (-23045))));
            Intrinsics.checkNotNullParameter(builder, Ig.wd("S.~NBg\u0010<oW]@Dkq=\fxL", (short) (OY.Xd() ^ 27081)));
            Context context = brazeNotificationPayload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getInlineImageStyle$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Inline Image Push cannot render without a context";
                    }
                }, 7, (Object) null);
                return null;
            }
            String bigImageUrl = brazeNotificationPayload.getBigImageUrl();
            String str = bigImageUrl;
            if (str == null || StringsKt.isBlank(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getInlineImageStyle$2
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Inline Image Push image url invalid";
                    }
                }, 7, (Object) null);
                return null;
            }
            Bundle notificationExtras = brazeNotificationPayload.getNotificationExtras();
            Bitmap pushBitmapFromUrl = Braze.Companion.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, notificationExtras, bigImageUrl, BrazeViewBounds.NOTIFICATION_INLINE_PUSH_IMAGE);
            if (pushBitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getInlineImageStyle$3
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Inline Image Push failed to get image bitmap";
                    }
                }, 7, (Object) null);
                return null;
            }
            boolean zIsRemoteViewNotificationAvailableSpaceConstrained = isRemoteViewNotificationAvailableSpaceConstrained(context);
            Object[] objArr = new Object[0];
            Method method = Class.forName(EO.Od("L)n^Ml\u0016\tuorT12:\u000fq\u000eff\u000fw\u0018", (short) (C1580rY.Xd() ^ (-13333)))).getMethod(C1561oA.Qd("=:H#34;052\u001a,7.", (short) (Od.Xd() ^ (-25044))), new Class[0]);
            try {
                method.setAccessible(true);
                RemoteViews remoteViews = new RemoteViews((String) method.invoke(context, objArr), zIsRemoteViewNotificationAvailableSpaceConstrained ? R.layout.com_braze_push_inline_image_constrained : R.layout.com_braze_notification_inline_image);
                BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
                Icon iconCreateWithResource = Icon.createWithResource(context, configurationProvider.getSmallNotificationIconResourceId());
                Intrinsics.checkNotNullExpressionValue(iconCreateWithResource, C1593ug.zd("\u0013#\u0017\u0014(\u001a\r ,!\f /,31#&iLcdef饹7\u001c0?<CA36\u001b7]tuvwxyz{|}~\u007f\n", (short) (ZN.Xd() ^ 12658), (short) (ZN.Xd() ^ 22345)));
                Integer accentColor = brazeNotificationPayload.getAccentColor();
                if (accentColor != null) {
                    iconCreateWithResource.setTint(accentColor.intValue());
                }
                remoteViews.setImageViewIcon(R.id.com_braze_inline_image_push_app_icon, iconCreateWithResource);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.od("p|q~zsm6jusxhpu.Bmkp`rm", (short) (Od.Xd() ^ (-5912)))).getMethod(C1561oA.Kd("^]mJ\\_h_feNcqelky", (short) (OY.Xd() ^ 17102)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method2.invoke(context, objArr2);
                    try {
                        if (Build.VERSION.SDK_INT >= 33) {
                            Object[] objArr3 = new Object[0];
                            Method method3 = Class.forName(Wg.Zd("munW\b|Z^fm0\u0012u9\"V~&(\t,:\u0018", (short) (OY.Xd() ^ 12237), (short) (OY.Xd() ^ 19426))).getMethod(C1561oA.Xd("\u0011\u0010 |\u000f\u0012\u001b\u0012\u0019\u0018\u0002\u0016#\u001c", (short) (C1580rY.Xd() ^ (-4612))), new Class[0]);
                            try {
                                method3.setAccessible(true);
                                String str2 = (String) method3.invoke(context, objArr3);
                                PackageManager.ApplicationInfoFlags applicationInfoFlagsOf = PackageManager.ApplicationInfoFlags.of(0L);
                                Class<?> cls = Class.forName(Wg.vd("7E<KA<8\u0003ANNU?IP\u000bVT\u00169CFOFUT=RXLSR(", (short) (FB.Xd() ^ 10280)));
                                Class<?>[] clsArr = new Class[2];
                                clsArr[0] = Class.forName(Qg.kd("H>R<\bE9E=\u0003'GD:>6", (short) (FB.Xd() ^ 23795), (short) (FB.Xd() ^ 1436)));
                                clsArr[1] = Class.forName(hg.Vd("\u0007\u0013\b\u0015\u0011\n\u0004L\u0001\f\n\u000f~\u0007\fD\u0006\u0002AbrszotqXkwinkw(Drqlha^pdigAe\\d:_SXc", (short) (Od.Xd() ^ (-24543)), (short) (Od.Xd() ^ (-21845))));
                                Object[] objArr4 = {str2, applicationInfoFlagsOf};
                                Method method4 = cls.getMethod(C1561oA.ud("A>L\u0018FE@<52D8=;\u0015908", (short) (FB.Xd() ^ 10405)), clsArr);
                                try {
                                    method4.setAccessible(true);
                                    applicationInfo = (ApplicationInfo) method4.invoke(packageManager, objArr4);
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        } else {
                            Class<?> cls2 = Class.forName(C1561oA.yd("]k^mojb-Wd`g]gj%O|x\u007fu\n\u0003", (short) (FB.Xd() ^ 1817)));
                            Class<?>[] clsArr2 = new Class[0];
                            Object[] objArr5 = new Object[0];
                            short sXd = (short) (C1499aX.Xd() ^ (-4650));
                            int[] iArr = new int["ZYiFX[d[baK_le".length()];
                            QB qb = new QB("ZYiFX[d[baK_le");
                            int i2 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                                i2++;
                            }
                            Method method5 = cls2.getMethod(new String(iArr, 0, i2), clsArr2);
                            try {
                                method5.setAccessible(true);
                                String str3 = (String) method5.invoke(context, objArr5);
                                Class<?> cls3 = Class.forName(Xg.qd("\u001b) /-($n%229+5<v:8y\u001d/2;298!6D8?>L", (short) (C1633zX.Xd() ^ (-14452)), (short) (C1633zX.Xd() ^ (-1995))));
                                Class<?>[] clsArr3 = new Class[2];
                                clsArr3[0] = Class.forName(Jg.Wd("BG\u001bTWd\u0018s#w[K\u007fE\tP", (short) (C1607wl.Xd() ^ 7782), (short) (C1607wl.Xd() ^ 19931)));
                                clsArr3[1] = Integer.TYPE;
                                Object[] objArr6 = {str3, 0};
                                Method method6 = cls3.getMethod(ZO.xd("\\YD>g4hTFJ=\u0001\u000e$\u0005y*2", (short) (C1607wl.Xd() ^ 28576), (short) (C1607wl.Xd() ^ 3521)), clsArr3);
                                try {
                                    method6.setAccessible(true);
                                    applicationInfo = (ApplicationInfo) method6.invoke(packageManager, objArr6);
                                } catch (InvocationTargetException e4) {
                                    throw e4.getCause();
                                }
                            } catch (InvocationTargetException e5) {
                                throw e5.getCause();
                            }
                        }
                        Intrinsics.checkNotNullExpressionValue(applicationInfo, C1626yg.Ud("x4}O@\u0003f\u0007q(\u000bmImha\f)TCO\u0012V=뿉5\u000f<\u0006CTX\"T#_\u0017g)\u0010 \u000b\u000e\b<z9Tk<", (short) (C1633zX.Xd() ^ (-23804)), (short) (C1633zX.Xd() ^ (-14279))));
                        Class<?> cls4 = Class.forName(Ig.wd("\u0014{C*v+B<\u001e\u000b\u0010s1D\u001e6OB[U#\u0002[Q0jo/zz\u001d8q", (short) (Od.Xd() ^ (-28174))));
                        Class<?>[] clsArr4 = {Class.forName(EO.Od("Q.(XHfG\u0004k\u0016k[\u001c\u0017\r,4\u0017\u001f^Q\u0019~\u007f=\u001b\u0010>\"r5B\nx", (short) (FB.Xd() ^ 18696)))};
                        Object[] objArr7 = {applicationInfo};
                        short sXd2 = (short) (ZN.Xd() ^ 21661);
                        int[] iArr2 = new int["\u001d\u001a(s\"!\u001c\u0018\u0011\u000e \u0014\u0019\u0017s\b\b\n\u0010".length()];
                        QB qb2 = new QB("\u001d\u001a(s\"!\u001c\u0018\u0011\u000e \u0014\u0019\u0017s\b\b\n\u0010");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                            i3++;
                        }
                        Method method7 = cls4.getMethod(new String(iArr2, 0, i3), clsArr4);
                        try {
                            method7.setAccessible(true);
                            CharSequence charSequence = (CharSequence) method7.invoke(packageManager, objArr7);
                            Intrinsics.checkNotNull(charSequence, C1593ug.zd("6>67k0/=>@Fr6:u:9LNzPL}MOO\u000fQYQR\u0007\\bZP\fX]c\\Z`!Gih`f`", (short) (FB.Xd() ^ 3692), (short) (FB.Xd() ^ 30528)));
                            remoteViews.setTextViewText(R.id.com_braze_inline_image_push_app_name_text, HtmlUtils.getHtmlSpannedTextIfEnabled((String) charSequence, configurationProvider));
                            remoteViews.setTextViewText(R.id.com_braze_inline_image_push_time_text, DateTimeUtils.formatDateNow(BrazeDateFormat.CLOCK_12_HOUR));
                            String string = notificationExtras.getString(C1561oA.od("8", (short) (C1580rY.Xd() ^ (-19571))));
                            if (string != null) {
                                remoteViews.setTextViewText(R.id.com_braze_inline_image_push_title_text, HtmlUtils.getHtmlSpannedTextIfEnabled(string, configurationProvider));
                            }
                            String string2 = notificationExtras.getString(C1561oA.Kd("\u0017", (short) (FB.Xd() ^ 31618)));
                            if (string2 != null) {
                                remoteViews.setTextViewText(R.id.com_braze_inline_image_push_content_text, HtmlUtils.getHtmlSpannedTextIfEnabled(string2, configurationProvider));
                            }
                            builder.setCustomContentView(remoteViews);
                            if (zIsRemoteViewNotificationAvailableSpaceConstrained) {
                                builder.setLargeIcon(pushBitmapFromUrl);
                                return new NotificationCompat.DecoratedCustomViewStyle();
                            }
                            remoteViews.setImageViewBitmap(R.id.com_braze_inline_image_push_side_image, pushBitmapFromUrl);
                            return new NoOpSentinelStyle();
                        } catch (InvocationTargetException e6) {
                            throw e6.getCause();
                        }
                    } catch (PackageManager.NameNotFoundException e7) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e7, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getInlineImageStyle$applicationInfo$1
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Inline Image Push application info was null";
                            }
                        }, 4, (Object) null);
                        return null;
                    }
                } catch (InvocationTargetException e8) {
                    throw e8.getCause();
                }
            } catch (InvocationTargetException e9) {
                throw e9.getCause();
            }
        }

        public final NotificationCompat.Style getNotificationStyle(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) throws Throwable {
            NotificationCompat.BigPictureStyle bigPictureNotificationStyle;
            Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (payload.isPushStory() && payload.getContext() != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Rendering push notification with DecoratedCustomViewStyle (Story)";
                    }
                }, 7, (Object) null);
                bigPictureNotificationStyle = getStoryStyle(notificationBuilder, payload);
            } else if (payload.isConversationalPush()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$2
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Rendering conversational push";
                    }
                }, 7, (Object) null);
                bigPictureNotificationStyle = getConversationalPushStyle(notificationBuilder, payload);
            } else if (payload.getBigImageUrl() == null) {
                bigPictureNotificationStyle = null;
            } else if (payload.isInlineImagePush()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$3
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Rendering push notification with custom inline image style";
                    }
                }, 7, (Object) null);
                bigPictureNotificationStyle = getInlineImageStyle(payload, notificationBuilder);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$4
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Rendering push notification with BigPictureStyle";
                    }
                }, 7, (Object) null);
                bigPictureNotificationStyle = getBigPictureNotificationStyle(payload);
            }
            if (bigPictureNotificationStyle != null) {
                return bigPictureNotificationStyle;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$5
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Rendering push notification with BigTextStyle";
                }
            }, 7, (Object) null);
            return getBigTextNotificationStyle(payload);
        }

        public final NotificationCompat.DecoratedCustomViewStyle getStoryStyle(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) throws Throwable {
            Intrinsics.checkNotNullParameter(builder, Wg.Zd("f\t<4_\t\u000f3tl!%$}\u007f&LT\r", (short) (C1499aX.Xd() ^ (-427)), (short) (C1499aX.Xd() ^ (-19944))));
            Intrinsics.checkNotNullParameter(brazeNotificationPayload, C1561oA.Xd("5'@48+/", (short) (FB.Xd() ^ 4731)));
            Context context = brazeNotificationPayload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getStoryStyle$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Push story page cannot render without a context";
                    }
                }, 7, (Object) null);
                return null;
            }
            List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = brazeNotificationPayload.getPushStoryPages();
            int pushStoryPageIndex = brazeNotificationPayload.getPushStoryPageIndex();
            BrazeNotificationPayload.PushStoryPage pushStoryPage = pushStoryPages.get(pushStoryPageIndex);
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.vd("\u0003\u000f\b\u0015\r\u0006\u0004L\r\u0018\u001a\u001f\u000b\u0013\u001cTT\u007f\u0002\u0007r\u0005\u0004", (short) (C1607wl.Xd() ^ 19056))).getMethod(Qg.kd("\r\n\u0018r\u0003\u0004\u000b\u007f\u0005\u0002i{\u0007}", (short) (C1633zX.Xd() ^ (-9933)), (short) (C1633zX.Xd() ^ (-32729))), new Class[0]);
            try {
                method.setAccessible(true);
                RemoteViews remoteViews = new RemoteViews((String) method.invoke(context, objArr), R.layout.com_braze_push_story_one_image);
                if (!populatePushStoryPage(remoteViews, brazeNotificationPayload, pushStoryPage)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getStoryStyle$2
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Push story page was not populated correctly. Not using DecoratedCustomViewStyle.";
                        }
                    }, 6, (Object) null);
                    return null;
                }
                Bundle notificationExtras = brazeNotificationPayload.getNotificationExtras();
                NotificationCompat.DecoratedCustomViewStyle decoratedCustomViewStyle = new NotificationCompat.DecoratedCustomViewStyle();
                int size = pushStoryPages.size();
                remoteViews.setOnClickPendingIntent(R.id.com_braze_story_button_previous, createStoryTraversedPendingIntent(context, notificationExtras, ((pushStoryPageIndex - 1) + size) % size));
                remoteViews.setOnClickPendingIntent(R.id.com_braze_story_button_next, createStoryTraversedPendingIntent(context, notificationExtras, (pushStoryPageIndex + 1) % size));
                builder.setCustomBigContentView(remoteViews);
                builder.setOnlyAlertOnce(true);
                return decoratedCustomViewStyle;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @JvmStatic
        public final void setBigPictureSummaryAndTitle(NotificationCompat.BigPictureStyle bigPictureNotificationStyle, BrazeNotificationPayload payload) {
            String contentText;
            Intrinsics.checkNotNullParameter(bigPictureNotificationStyle, "bigPictureNotificationStyle");
            Intrinsics.checkNotNullParameter(payload, "payload");
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                return;
            }
            String bigSummaryText = payload.getBigSummaryText();
            String bigTitleText = payload.getBigTitleText();
            String summaryText = payload.getSummaryText();
            if (bigSummaryText != null) {
                bigPictureNotificationStyle.setSummaryText(HtmlUtils.getHtmlSpannedTextIfEnabled(bigSummaryText, configurationProvider));
            }
            if (bigTitleText != null) {
                bigPictureNotificationStyle.setBigContentTitle(HtmlUtils.getHtmlSpannedTextIfEnabled(bigTitleText, configurationProvider));
            }
            if (summaryText == null && bigSummaryText == null && (contentText = payload.getContentText()) != null) {
                bigPictureNotificationStyle.setSummaryText(HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider));
            }
        }

        @JvmStatic
        public final void setStyleIfSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) throws Throwable {
            Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
            Intrinsics.checkNotNullParameter(payload, "payload");
            NotificationCompat.Style notificationStyle = getNotificationStyle(notificationBuilder, payload);
            if (notificationStyle instanceof NoOpSentinelStyle) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$setStyleIfSupported$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Setting style for notification";
                }
            }, 7, (Object) null);
            notificationBuilder.setStyle(notificationStyle);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0016DLcz\u0004G\u0006Fé^B-!l\u0015է\u000bfx9ӭHf"}, d2 = {"\u001ab^:\")KO.~Di<\u000b\fxB\r$\u0011@i!&Kp\u0012:r49c\u0007\u000eF\u0002\u001d..?9z>+)'JCpn\u001aN\u007f6KUN3Ja\u0007D\u0014g", "\u001a`]1e6BR,Hxh9|R+p\u000bqdJ\u0010\u001b\u0018Km\nKz/>7\b(Bi%l;ROr4s", "u(E", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class NoOpSentinelStyle extends NotificationCompat.Style {
    }

    @JvmStatic
    public static final void setBigPictureSummaryAndTitle(NotificationCompat.BigPictureStyle bigPictureStyle, BrazeNotificationPayload brazeNotificationPayload) {
        Companion.setBigPictureSummaryAndTitle(bigPictureStyle, brazeNotificationPayload);
    }

    @JvmStatic
    public static final void setStyleIfSupported(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) throws Throwable {
        Companion.setStyleIfSupported(builder, brazeNotificationPayload);
    }
}
