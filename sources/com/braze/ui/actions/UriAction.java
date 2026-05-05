package com.braze.ui.actions;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import com.braze.BrazeInternal;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.Channel;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewActivity;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.support.UriUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tsAӄLe^.ZS0\u001ds{B$cҕyCQU\"Ԃ*\teNo˧vJh\u001aK\u000f\f\u0016\u0001jBI]xc\u0017\u0015FXģo3{n}`f\tF\t.2:8(\u0006\u0011 8J(x\u0011By\u000f\"4NtRR;R\u0015\u001e \fV /%֔kNDP-j@C3\u0007wKf'\u000eܞƊQ\rT^o\u001b\u0005x6+nOe\u00193l\u001b\u0007\u0001u\u0006\u0017\b\u0012K \u0001'UGyweOp\u007fB/[S\u001b]\u000b&\u000b\u0006\u0002f\u001a)CQyJ~\u0011nzC/\u001bY\u001c\u0014\u0016)X.[6\u0015&>7\u0003\fk@~\u001c\u000fH\u000e|y8-$.6[=)\u0006iai5~;\n%%\u001eQ\"5&ƟX\u000en7ct\u0006tIQnYxR\u0018rUm2\u000b\u0013\u00068\u0004HG.0,\u0017<\u0019=9q8Q$2\u0004\u0011du\u001b\u001d`\u0017k\u001aVVY:nDQZ\r\u001aZ\\d3l\u0001Zf.)O2S5\u0001N%h|\u0006a9%>f\u007flw\u0004e]8?_jEY\u0007k<XidA7ie&`\u0001yZA\u0005\u0003\u0013~~B\u0002$\u000b`6;JH\u0019*(\u007fRN$\u0013`@\"\"B.I\u001br\u0014v\u0006dD\n\u001d\u0017\u0007rh>\u0017\u000572\u001c\u0002$##1Tjp\bg'J\\\u0003n$ECg4G)\u001c$9F\u000b)\u001f~\"\u0007\u001eќNܤPr\u001e߯m}&!(E\"@K\u0015'\u0001?100։Pxmʸe\u0014-\b\u000b\b_Sv.\u007f\b\u0019q\u0003ߓvߝS`\u001fǱ\u000f`x2\u0016t {gW\tY4l\u0019_VI!\b0ߩZ̞\u0001\u0011'Ǉ=\u0003u5\u000bIME-2$\u000eӊ3="}, d2 = {"\u001ab^:\")KO.~Dn0F\u0005-t\u00042\u0005NJ\u0007$KK\fKz/>/", "\u001ab^:\")KO.~Dn0F\u0005-t\u00042\u0005NJzrE~\u0012F\u007fz", "CqX", "\u001a`]1e6BRb\bzmul\u00163;", "3wc?T:", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "CrT$X)/W\u0019\u0011", "", "1gP;a,E", "\u001ab^:\")KO.~D^5\r\u0011=/]+wI\n\u0017\u001e\u001d", "uKP;W9HW\u0018H\u0004^;Fx<iU\u000fwI\u007f$!KnWF\u0005n\u0012i\u0007\u001f>mk#4AEs}\u001b\"dv9Pc5^~5\u0011*Q(e[rDiUK", "=qX4\\5:Z", "uKR<`u;`\u0015\u0014z(<\u0001R+c\u000f,\u0006I\u000f`\u0007Tsi:\u0006)?bSc(", "5dc\u0010[(G\\\u0019\u0006", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eqYC|  Gvc", "5dc\u0012k;KO'", "u(;.a+K]\u001d}Dh:Fe?n~/{\u0016", "5dc\"e0", "u(;.a+K]\u001d}Dg,\fR\u001fr\u0004}", "Adc\"e0", "uKP;W9HW\u0018H\u0004^;Fx<iUkl", "5dc\"f,0S\u0016o~^>", "u(I", "Adc\"f,0S\u0016o~^>", "uY\u0018#", "3wT0h;>", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u000eV;B]\"o~^>`\u0012>e\t7", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "5dc\u0016a;>\\(Z\bk(\u0011z3t\u0003\u0006\u0006I\u0002\u001b\u0019W|\u000e;S!3_k/3k\u001c", "", "B`a4X;\"\\(~\u0004m", "1n]3\\.N`\u0015\u000e~h5g\u00169v\u0004'{M", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;o&;IR?u=\t\"rr=\u0006c9$", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001w$w*SDj;\u001ejO]B\u0006p6RupEVW;\\[\u0002\u0007w\u001bi\u000eW:bkWK,8AD\u001b\u001d,\u0013\u007fEq\u0002\u0010\u0018\u001eBf\u007fF`\u0019\u0011V\"qV)FPb`}IQR^9h\u0016h\biDK(\u0013q&p,F\u0015\u0006\u0005R\u001e|Vx1eQ\"\n8-M7?OTo^KJ", "5dc$X)/W\u0019\u0011V\\;\u0001\u001a3t\u0014\f\u0005O\u0001 &", "=oT;H9BE\u001d\u000e}:*\f\r9np,{R", "=oT;H9BE\u001d\u000e}:*\f\r9np,{Ra$!OZ\u001eJy", "=oT;H9BE\u001d\u000e}P,yy3e\u0012\u0004yO\u0005(\u001bV\u0004", "=oT;H9BE\u001d\u000e}P,yy3e\u0012\u0004yO\u0005(\u001bV\u0004nI\u0001- i\f#", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class UriAction implements IAction {
    private final Channel channel;
    private final Bundle extras;
    private Uri uri;
    private boolean useWebView;

    public UriAction(Uri uri, Bundle bundle, boolean z2, Channel channel) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.uri = uri;
        this.extras = bundle;
        this.useWebView = z2;
        this.channel = channel;
    }

    public UriAction(UriAction original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.uri = original.uri;
        this.extras = original.extras;
        this.useWebView = original.useWebView;
        this.channel = original.getChannel();
    }

    @Override // com.braze.ui.actions.IAction
    public void execute(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (BrazeFileUtils.isLocalUri(this.uri)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.UriAction.execute.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Not executing local Uri: " + UriAction.this.getUri();
                }
            }, 7, (Object) null);
            return;
        }
        if (BrazeActionParser.INSTANCE.isBrazeActionUri(this.uri)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.UriAction.execute.2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Executing BrazeActions uri:\n'" + UriAction.this.getUri() + '\'';
                }
            }, 6, (Object) null);
            BrazeActionParser.INSTANCE.execute(context, this.uri, getChannel());
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.UriAction.execute.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Executing Uri action from channel " + UriAction.this.getChannel() + ": " + UriAction.this.getUri() + ". UseWebView: " + UriAction.this.getUseWebView() + ". Extras: " + UriAction.this.getExtras();
            }
        }, 7, (Object) null);
        if (this.useWebView && CollectionsKt.contains(BrazeFileUtils.REMOTE_SCHEMES, this.uri.getScheme())) {
            if (getChannel() == Channel.PUSH) {
                openUriWithWebViewActivityFromPush(context, this.uri, this.extras);
                return;
            } else {
                openUriWithWebViewActivity(context, this.uri, this.extras);
                return;
            }
        }
        if (getChannel() == Channel.PUSH) {
            openUriWithActionViewFromPush(context, this.uri, this.extras);
        } else {
            openUriWithActionView(context, this.uri, this.extras);
        }
    }

    protected final Intent getActionViewIntent(Context context, Uri uri, Bundle bundle) throws Throwable {
        List list;
        Intrinsics.checkNotNullParameter(context, EO.Od("Z\u001e\rl7\u0010:", (short) (OY.Xd() ^ 10730)));
        Intrinsics.checkNotNullParameter(uri, C1561oA.Qd("ZVL", (short) (ZN.Xd() ^ 23856)));
        short sXd = (short) (ZN.Xd() ^ 28618);
        short sXd2 = (short) (ZN.Xd() ^ 29780);
        int[] iArr = new int["y\b~\u000e\f\u0007\u0003M\n\u0010\u0017\t\u0013\u001aT\t\f\u001e\u0014\u001b\u001b[\u0005xu\t".length()];
        QB qb = new QB("y\b~\u000e\f\u0007\u0003M\n\u0010\u0017\t\u0013\u001aT\t\f\u001e\u0014\u001b\u001b[\u0005xu\t");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Intent intent = new Intent(new String(iArr, 0, i2));
        intent.setData(uri);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            short sXd3 = (short) (C1607wl.Xd() ^ 23390);
            int[] iArr2 = new int["5A6C?82z/:8=-5:r\u0007205%72".length()];
            QB qb2 = new QB("5A6C?82z/:8=-5:r\u0007205%72");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Kd("$#3\u0010\"%.%,+\u0014)7+21?", (short) (ZN.Xd() ^ 16592)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Object[] objArr2 = {intent, PackageManager.ResolveInfoFlags.of(0L)};
                Method method2 = Class.forName(Wg.Zd("F\u00064g~)A-z<u{*edc@mK\u0010Yp\u0013IL|\u001dV~\"Ee\f", (short) (C1580rY.Xd() ^ (-29526)), (short) (C1580rY.Xd() ^ (-5705)))).getMethod(Qg.kd("GJ9EK\u001a>C3;@\f-=1=/9-(5", (short) (C1580rY.Xd() ^ (-19306)), (short) (C1580rY.Xd() ^ (-16962))), Class.forName(C1561oA.Xd("v\u0005{\u000b\t\u0004\u007fJ\u0001\u000e\u000e\u0015\u0007\u0011\u0018Rn\u0015\u001c\u000e\u0018\u001f", (short) (Od.Xd() ^ (-15939)))), Class.forName(Wg.vd(" ,%2*#!i*57<(09q?;~ ,-8->;&9A3<9\u0011Ar\u0005\u000e\t\t\u0012\fn\u0017\u000e\u0012g\u0011\u0005\u0016!", (short) (ZN.Xd() ^ 11626))));
                try {
                    method2.setAccessible(true);
                    list = (List) method2.invoke(packageManager, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } else {
            Object[] objArr3 = new Object[0];
            Method method3 = Class.forName(hg.Vd("'3(51*$l!,*/\u001f',dx$\"'\u0017)$", (short) (C1580rY.Xd() ^ (-1692)), (short) (C1580rY.Xd() ^ (-896)))).getMethod(C1561oA.ud("!\u001e,\u0007\u0017\u0018\u001f\u0014\u0019\u0016|\u0010\u001c\u000e\u0013\u0010\u001c", (short) (Od.Xd() ^ (-21375))), new Class[0]);
            try {
                method3.setAccessible(true);
                PackageManager packageManager2 = (PackageManager) method3.invoke(context, objArr3);
                Object[] objArr4 = {intent, 0};
                Method method4 = Class.forName(C1561oA.yd("\u0016\"\u001b( \u0019\u0017_\u0010\u001b\u001d\"\u000e\u0016\u001fW51t\u0016\"#.#$!\f\u001f'\u0019\"\u001f\u0007", (short) (FB.Xd() ^ 3550))).getMethod(Xg.qd("9>/=E\u0016<C5?F\u00147I?MAMC@O", (short) (C1607wl.Xd() ^ 8500), (short) (C1607wl.Xd() ^ 3220)), Class.forName(C1561oA.Yd("1?6EC>:\u0005;HHOAKR\r)OVHRY", (short) (Od.Xd() ^ (-2179)))), Integer.TYPE);
                try {
                    method4.setAccessible(true);
                    list = (List) method4.invoke(packageManager2, objArr4);
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
        Intrinsics.checkNotNullExpressionValue(list, Jg.Wd("}\u0005,nv\u0005&$Iy\u0010=4\u001438`#\"AB\u0005L<㿦\u0017i\u0010\u001cz\u001a\nM\\\u0014w\u001aKF\u001d(LvP?xgAo7", (short) (C1633zX.Xd() ^ (-4381)), (short) (C1633zX.Xd() ^ (-8748))));
        if (list.size() > 1) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                final ResolveInfo resolveInfo = (ResolveInfo) it.next();
                String str = resolveInfo.activityInfo.packageName;
                Class<?> cls = Class.forName(ZO.xd("QT/BMwX6+\u001er}\u001b\u0018mP\u0013KgyK#J", (short) (Od.Xd() ^ (-26368)), (short) (Od.Xd() ^ NotificationManagerCompat.IMPORTANCE_UNSPECIFIED)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr5 = new Object[0];
                short sXd4 = (short) (C1633zX.Xd() ^ (-6750));
                short sXd5 = (short) (C1633zX.Xd() ^ (-3344));
                int[] iArr3 = new int["\u0018@$P\u0013LJ9\u001f1Aj;7".length()];
                QB qb3 = new QB("\u0018@$P\u0013LJ9\u001f1Aj;7");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + (i4 * sXd5))) + xuXd3.CK(iKK3));
                    i4++;
                }
                Method method5 = cls.getMethod(new String(iArr3, 0, i4), clsArr);
                try {
                    method5.setAccessible(true);
                    if (Intrinsics.areEqual(str, (String) method5.invoke(context, objArr5))) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.UriAction.getActionViewIntent.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Setting deep link intent package to " + resolveInfo.activityInfo.packageName + '.';
                            }
                        }, 7, (Object) null);
                        intent.setPackage(resolveInfo.activityInfo.packageName);
                        break;
                    }
                } catch (InvocationTargetException e6) {
                    throw e6.getCause();
                }
            }
        }
        return intent;
    }

    @Override // com.braze.ui.actions.IAction
    public Channel getChannel() {
        return this.channel;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final Intent[] getIntentArrayWithConfiguredBackStack(Context context, Bundle bundle, Intent targetIntent, BrazeConfigurationProvider configurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(targetIntent, "targetIntent");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intent mainActivityIntent = null;
        if (configurationProvider.isPushDeepLinkBackStackActivityEnabled()) {
            final String pushDeepLinkBackStackActivityClassName = configurationProvider.getPushDeepLinkBackStackActivityClassName();
            String str = pushDeepLinkBackStackActivityClassName;
            if (str == null || StringsKt.isBlank(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.UriAction.getIntentArrayWithConfiguredBackStack.1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Adding main activity intent to back stack while opening uri from push";
                    }
                }, 6, (Object) null);
                mainActivityIntent = UriUtils.getMainActivityIntent(context, bundle);
            } else if (UriUtils.isActivityRegisteredInManifest(context, pushDeepLinkBackStackActivityClassName)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.UriAction.getIntentArrayWithConfiguredBackStack.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Adding custom back stack activity while opening uri from push: " + pushDeepLinkBackStackActivityClassName;
                    }
                }, 6, (Object) null);
                if (bundle != null) {
                    mainActivityIntent = new Intent().setClassName(context, pushDeepLinkBackStackActivityClassName).setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_GET_ROOT_INTENT)).putExtras(bundle);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.UriAction.getIntentArrayWithConfiguredBackStack.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Not adding unregistered activity to the back stack while opening uri from push: " + pushDeepLinkBackStackActivityClassName;
                    }
                }, 6, (Object) null);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.UriAction.getIntentArrayWithConfiguredBackStack.5
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Not adding back stack activity while opening uri from push due to disabled configuration setting.";
                }
            }, 6, (Object) null);
        }
        if (mainActivityIntent != null) {
            return new Intent[]{mainActivityIntent, targetIntent};
        }
        targetIntent.setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT));
        return new Intent[]{targetIntent};
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final boolean getUseWebView() {
        return this.useWebView;
    }

    protected final Intent getWebViewActivityIntent(Context context, Uri uri, Bundle bundle) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        final String customHtmlWebViewActivityClassName = BrazeInternal.INSTANCE.getConfigurationProvider(context).getCustomHtmlWebViewActivityClassName();
        String str = customHtmlWebViewActivityClassName;
        if (str == null || StringsKt.isBlank(str) || !UriUtils.isActivityRegisteredInManifest(context, customHtmlWebViewActivityClassName)) {
            intent = new Intent(context, (Class<?>) BrazeWebViewActivity.class);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.UriAction$getWebViewActivityIntent$webViewActivityIntent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Launching custom WebView Activity with class name: " + customHtmlWebViewActivityClassName;
                }
            }, 7, (Object) null);
            intent = new Intent().setClassName(context, customHtmlWebViewActivityClassName);
            Intrinsics.checkNotNullExpressionValue(intent, "customWebViewActivityCla…ivityClassName)\n        }");
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("url", uri.toString());
        return intent;
    }

    protected void openUriWithActionView(Context context, final Uri uri, final Bundle bundle) throws Exception {
        Intrinsics.checkNotNullParameter(context, Ig.wd("t3 \u000e\u000e|\r", (short) (C1580rY.Xd() ^ (-6636))));
        Intrinsics.checkNotNullParameter(uri, EO.Od("~MR", (short) (OY.Xd() ^ 10386)));
        Intent actionViewIntent = getActionViewIntent(context, uri, bundle);
        actionViewIntent.setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_ACTION_VIEW));
        CX.ud();
        try {
            Class<?> cls = Class.forName(C1561oA.Qd("bncple_(\\gejZbg 4_]bRd_", (short) (C1580rY.Xd() ^ (-16868))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1593ug.zd("drixvqm8n{{\u0003t~\u0006@\\\u0003\n{\u0006\r", (short) (C1633zX.Xd() ^ (-31794)), (short) (C1633zX.Xd() ^ (-5716))));
            Object[] objArr = {actionViewIntent};
            short sXd = (short) (ZN.Xd() ^ 18798);
            int[] iArr = new int["UUAQR\u001e?OCOAKO".length()];
            QB qb = new QB("UUAQR\u001e?OCOAKO");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.UriAction.openUriWithActionView.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to handle uri " + uri + " with extras: " + bundle;
                }
            }, 4, (Object) null);
        }
    }

    protected final void openUriWithActionViewFromPush(Context context, final Uri uri, Bundle bundle) throws Exception {
        Intrinsics.checkNotNullParameter(context, C1561oA.Kd("7DDK=QN", (short) (OY.Xd() ^ 11211)));
        Intrinsics.checkNotNullParameter(uri, Wg.Zd("Sfo", (short) (OY.Xd() ^ 3568), (short) (OY.Xd() ^ 8514)));
        try {
            Intent[] intentArrayWithConfiguredBackStack = getIntentArrayWithConfiguredBackStack(context, bundle, getActionViewIntent(context, uri, bundle), BrazeInternal.INSTANCE.getConfigurationProvider(context));
            CX.ud();
            Class<?> cls = Class.forName(C1561oA.Xd("5C:IGB>\t?LLSEOV\u0011'TT[Ma^", (short) (FB.Xd() ^ 12129)));
            Class<?>[] clsArr = {Intent[].class};
            Object[] objArr = {intentArrayWithConfiguredBackStack};
            short sXd = (short) (C1607wl.Xd() ^ 28723);
            int[] iArr = new int["AC-?>\f+=?M=I;8C".length()];
            QB qb = new QB("AC-?>\f+=?M=I;8C");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (ActivityNotFoundException e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e3, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.UriAction.openUriWithActionViewFromPush.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Could not find appropriate activity to open for deep link " + uri;
                }
            }, 4, (Object) null);
        }
    }

    protected final void openUriWithWebViewActivity(Context context, Uri uri, Bundle bundle) throws Exception {
        Intrinsics.checkNotNullParameter(context, Qg.kd("P[Y^N`[", (short) (C1499aX.Xd() ^ (-16092)), (short) (C1499aX.Xd() ^ (-16522))));
        Intrinsics.checkNotNullParameter(uri, hg.Vd("plb", (short) (C1580rY.Xd() ^ (-28070)), (short) (C1580rY.Xd() ^ (-24356))));
        Intent webViewActivityIntent = getWebViewActivityIntent(context, uri, bundle);
        webViewActivityIntent.setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY));
        CX.ud();
        short sXd = (short) (OY.Xd() ^ 5114);
        int[] iArr = new int["\u0019%\u001a'#\u001c\u0016^\u0013\u001e\u001c!\u0011\u0019\u001eVj\u0016\u0014\u0019\t\u001b\u0016".length()];
        QB qb = new QB("\u0019%\u001a'#\u001c\u0016^\u0013\u001e\u001c!\u0011\u0019\u001eVj\u0016\u0014\u0019\t\u001b\u0016");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.yd("(6)8:5-w\"/+2(25o\u007f&)\u001b)0", (short) (C1633zX.Xd() ^ (-8591))));
            Object[] objArr = {webViewActivityIntent};
            short sXd2 = (short) (C1499aX.Xd() ^ (-3948));
            int[] iArr2 = new int["SUCUX&I[Q_S_e".length()];
            QB qb2 = new QB("SUCUX&I[Q_S_e");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.UriAction.openUriWithWebViewActivity.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "BrazeWebViewActivity not opened successfully.";
                }
            }, 4, (Object) null);
        }
    }

    protected final void openUriWithWebViewActivityFromPush(Context context, Uri uri, Bundle bundle) throws Exception {
        Intrinsics.checkNotNullParameter(context, Xg.qd("?LLSEYV", (short) (C1580rY.Xd() ^ (-4759)), (short) (C1580rY.Xd() ^ (-8529))));
        Intrinsics.checkNotNullParameter(uri, Jg.Wd("myc", (short) (OY.Xd() ^ 14845), (short) (OY.Xd() ^ 3297)));
        try {
            Intent[] intentArrayWithConfiguredBackStack = getIntentArrayWithConfiguredBackStack(context, bundle, getWebViewActivityIntent(context, uri, bundle), BrazeInternal.INSTANCE.getConfigurationProvider(context));
            CX.ud();
            Object[] objArr = {intentArrayWithConfiguredBackStack};
            Method method = Class.forName(ZO.xd("]sr\u001ajt$\u001b=!_toQ\u0014G\u0014\u0003v^3Kv", (short) (ZN.Xd() ^ 32132), (short) (ZN.Xd() ^ 17226))).getMethod(C1626yg.Ud("!B \u0013\u000f\"m\u000b>vC)ECa", (short) (C1607wl.Xd() ^ 24602), (short) (C1607wl.Xd() ^ 17208)), Intent[].class);
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.UriAction.openUriWithWebViewActivityFromPush.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Braze WebView Activity not opened successfully.";
                }
            }, 4, (Object) null);
        }
    }

    public final void setUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<set-?>");
        this.uri = uri;
    }

    public final void setUseWebView(boolean z2) {
        this.useWebView = z2;
    }
}
