package com.facebook.react.views.imagehelper;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.core.content.res.ResourcesCompat;
import com.dynatrace.android.agent.Global;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000eӵLcz\u0004I\u0006>.6B\r.4\u0012\u0006\rnj?0Le^.ZS0\u000fs{B$c$wDCU0}*\tUNog\u0005JbŏK\u000f\u0014\u001f\u0001j2I[}s܈-From2\u0006nQyez6ӯ$208B\u001b\u000f\u001fBH>z+GY\u0012*0nwjV\u001bU\u001d\u001a@\t\u0005 I\"jpf6vv&R=.\u001bkXMUb`\u0001[\u0013^TU\u0014'e,7X7c\u0018kSK\u001f`hW\u0005Upk\u0013\u0019+51as\u0006=\t\u0006\"!CQ#\\!)%\u001b_o$'YS\u0014O^\u0014@w)\u0003=B\u0012\u001a\u001e)^-[\u001d/\u001e\u001cC\rr\u0002Q\u0001\u0006lH\u0018z\u0010=G+\u000e?C;1e\u007fd\u0004-\\I\u0014\u0005;1S\u0005|'sT<gE\u001fb\u0004i1\u007fC\u000e`\\\u000bqI}\u0006\u0001b0-\u00142W\u007f]\u007f?0m©9٦=#)ǽɞLY"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5\\}'Bm#w:CIuD+\u0013h@F\u0003u(K}'+K1,c]rJi", "", "u(E", "@db<h9<Sw\fvp(y\u0010/I~\u0010wK", "", "", "", "/cS\u0011e(PO\u0016\u0006zB+", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "<na:T3Bh\u0019}cZ4|", "1kT.e", "", "5dc\u001cc,GW\"\u0001mf3k\u00051", "<`\\2", "5dc\u001fX:Hc&|z=9x\u001b+b\u0007(", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW\u001b\u0004!GUz'7C", "5dc\u001fX:Hc&|z=9x\u001b+b\u0007(_?", "5dc\u001fX:Hc&|z=9x\u001b+b\u0007(kM\u0005", "\u001a`]1e6BRb\bzmul\u00163;", "7rE2V;H`w\fvp(y\u0010/", "", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ResourceDrawableIdHelper {
    private static final String LOCAL_RESOURCE_SCHEME = "res";
    private final Map<String, Integer> resourceDrawableIdMap = new HashMap();
    public static final Companion Companion = new Companion(null);
    private static final ResourceDrawableIdHelper resourceDrawableIdHelper = new ResourceDrawableIdHelper();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007f\u0007ln?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\u0004`(\u0004:\t}R.lĔNZ\u0011L_\u0012$y\u0003,wWOصdƤ6BwЀ\u0004e}@Q`#:;d\tĺ:ѩ\t\u000b*,N\u0015\u0005z[M\u0012\u0018>GAF`\u0015e\u0005H\u0016\\̇\"Ә\"\\oޮɍLv"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5\\}'Bm#w:CIuD+\u0013h@F\u0003u(K}'+K1,c]rJRod\u0016Y'\u0016\tcJy", "", "u(E", "\u001aN2\u000e?&+3\u0007hjK\n\\\u0003\u001dCb\bc ", "", "7mbAT5<S", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5\\}'Bm#w:CIuD+\u0013h@F\u0003u(K}'+K1,c]rJi", "5dc\u0016a:MO\"|z\u001d(\u0006\u00129t{7\u007fJ\n%", "5dc\u0016a:MO\"|z", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ(\u001bG\u0002\u001c\u0006z-1[}#7t!.Z\r(kB(%u_9ep(`r$NL2+?RyH\u0014\u001f0", "@db<h9<Sw\fvp(y\u0010/I~\u000b{G\f\u0017$", "\u0012D?\u001f8\n\u001aBx]9`,\fl8s\u000f$\u0005>\u0001", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        @Deprecated(message = "\u0018Y\u0001t?}#jlH6}UT5\\o`\u000e(\t4Kf~O\u0002*/d\r&q_$H\\n(;G!>Q\u0013hP9%gUKfR", replaceWith = @ReplaceWith(expression = "instance", imports = {}))
        @InterfaceC1492Gx
        public final ResourceDrawableIdHelper DEPRECATED$getInstance() {
            return getInstance();
        }

        public final ResourceDrawableIdHelper getInstance() {
            return ResourceDrawableIdHelper.resourceDrawableIdHelper;
        }
    }

    private ResourceDrawableIdHelper() {
    }

    private final int addDrawableId(Context context, String str) throws Throwable {
        short sXd = (short) (C1633zX.Xd() ^ (-27535));
        int[] iArr = new int[";x\\KW$S\rw/0Xz\n(\u0003C}4\u0012H\u000f=".length()];
        QB qb = new QB(";x\\KW$S\rw/0Xz\n(\u0003C}4\u0012H\u000f=");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(EO.Od("\u0011h9s~au\u0014S%\u001d\u0015", (short) (C1580rY.Xd() ^ (-28994))), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            String strQd = C1561oA.Qd("hucxaajb", (short) (Od.Xd() ^ (-10893)));
            short sXd2 = (short) (OY.Xd() ^ 9158);
            short sXd3 = (short) (OY.Xd() ^ 14700);
            int[] iArr2 = new int["N\\Sb`[W\"Xeel^ho*@mmtfzw".length()];
            QB qb2 = new QB("N\\Sb`[W\"Xeel^ho*@mmtfzw");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
                i3++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.od("%\"0\u000b\u001b\u001c#\u0018\u001d\u001a\u0002\u0014\u001f\u0016", (short) (C1633zX.Xd() ^ (-7323))), new Class[0]);
            try {
                method2.setAccessible(true);
                int identifier = resources.getIdentifier(str, strQd, (String) method2.invoke(context, objArr2));
                this.resourceDrawableIdMap.put(str, Integer.valueOf(identifier));
                return identifier;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static final ResourceDrawableIdHelper getInstance() {
        return Companion.getInstance();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        r0 = r4.getName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String getOpeningXmlTag(android.content.Context r10, java.lang.String r11) throws java.lang.Exception {
        /*
            r9 = this;
            int r0 = r9.getResourceDrawableId(r10, r11)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = r1
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r3 = 0
            if (r0 <= 0) goto L4d
        L12:
            if (r1 == 0) goto Lc6
            int r6 = r1.intValue()
            java.lang.String r2 = "IWN][VR\u001dS``gYcj%;hhoaur"
            r1 = -10730(0xffffffffffffd616, float:NaN)
            int r0 = yg.C1580rY.Xd()
            r0 = r0 ^ r1
            short r8 = (short) r0
            int r0 = r2.length()
            int[] r7 = new int[r0]
            yg.QB r5 = new yg.QB
            r5.<init>(r2)
            r4 = 0
        L2e:
            boolean r0 = r5.YK()
            if (r0 == 0) goto L4f
            int r0 = r5.KK()
            yg.Xu r2 = yg.Xu.Xd(r0)
            int r1 = r2.CK(r0)
            int r0 = r8 + r8
            int r0 = r0 + r4
            int r1 = r1 - r0
            int r0 = r2.fK(r1)
            r7[r4] = r0
            int r4 = r4 + 1
            goto L2e
        L4d:
            r1 = r3
            goto L12
        L4f:
            java.lang.String r1 = new java.lang.String
            r0 = 0
            r1.<init>(r7, r0, r4)
            java.lang.Class r8 = java.lang.Class.forName(r1)     // Catch: android.content.res.Resources.NotFoundException -> Lc6
            r0 = 0
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch: android.content.res.Resources.NotFoundException -> Lc6
            r0 = 0
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: android.content.res.Resources.NotFoundException -> Lc6
            java.lang.String r4 = "II\u001e}Nf(oj%-t"
            r1 = -6685(0xffffffffffffe5e3, float:NaN)
            r2 = -3442(0xfffffffffffff28e, float:NaN)
            int r0 = yg.C1580rY.Xd()
            r0 = r0 ^ r1
            short r1 = (short) r0
            int r0 = yg.C1580rY.Xd()
            r0 = r0 ^ r2
            short r0 = (short) r0
            java.lang.String r0 = yg.Wg.Zd(r4, r1, r0)
            java.lang.reflect.Method r1 = r8.getMethod(r0, r7)     // Catch: android.content.res.Resources.NotFoundException -> Lc6
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.reflect.InvocationTargetException -> Lbf android.content.res.Resources.NotFoundException -> Lc6
            java.lang.Object r0 = r1.invoke(r10, r5)     // Catch: java.lang.reflect.InvocationTargetException -> Lbf android.content.res.Resources.NotFoundException -> Lc6
            android.content.res.Resources r0 = (android.content.res.Resources) r0     // Catch: android.content.res.Resources.NotFoundException -> Lc6
            android.content.res.XmlResourceParser r4 = r0.getXml(r6)     // Catch: android.content.res.Resources.NotFoundException -> Lc6
            java.lang.String r2 = "[ZjOee\")*+'"
            r1 = -11892(0xffffffffffffd18c, float:NaN)
            int r0 = yg.C1499aX.Xd()
            r0 = r0 ^ r1
            short r0 = (short) r0
            java.lang.String r0 = yg.C1561oA.Xd(r2, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)     // Catch: android.content.res.Resources.NotFoundException -> Lc6
            r2 = r4
            java.lang.AutoCloseable r2 = (java.lang.AutoCloseable) r2     // Catch: android.content.res.Resources.NotFoundException -> Lc6
            r0 = r2
            android.content.res.XmlResourceParser r0 = (android.content.res.XmlResourceParser) r0     // Catch: java.lang.Throwable -> Lb8
            int r1 = r4.getEventType()     // Catch: java.lang.Throwable -> Lb8
        La2:
            r0 = 1
            if (r1 == r0) goto Lb3
            r0 = 2
            if (r1 != r0) goto La9
            goto Lae
        La9:
            int r1 = r4.next()     // Catch: java.lang.Throwable -> Lb8
            goto La2
        Lae:
            java.lang.String r0 = r4.getName()     // Catch: java.lang.Throwable -> Lb8
            goto Lb4
        Lb3:
            r0 = r3
        Lb4:
            kotlin.jdk7.AutoCloseableKt.closeFinally(r2, r3)     // Catch: android.content.res.Resources.NotFoundException -> Lc6
            goto Lc5
        Lb8:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> Lba
        Lba:
            r0 = move-exception
            kotlin.jdk7.AutoCloseableKt.closeFinally(r2, r1)     // Catch: android.content.res.Resources.NotFoundException -> Lc6
            throw r0     // Catch: android.content.res.Resources.NotFoundException -> Lc6
        Lbf:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()     // Catch: android.content.res.Resources.NotFoundException -> Lc6
            throw r0     // Catch: android.content.res.Resources.NotFoundException -> Lc6
        Lc5:
            r3 = r0
        Lc6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.imagehelper.ResourceDrawableIdHelper.getOpeningXmlTag(android.content.Context, java.lang.String):java.lang.String");
    }

    public final synchronized void clear() {
        this.resourceDrawableIdMap.clear();
    }

    public final Drawable getResourceDrawable(Context context, String str) throws Throwable {
        Intrinsics.checkNotNullParameter(context, Wg.vd("lwy~r\u0005\u0004", (short) (C1499aX.Xd() ^ (-22758))));
        int resourceDrawableId = getResourceDrawableId(context, str);
        if (resourceDrawableId <= 0) {
            return null;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("w\u0004x\u0006\u0002zt=q|z\u007fow|5Itrwgyt", (short) (C1607wl.Xd() ^ 6698), (short) (C1607wl.Xd() ^ 23132))).getMethod(hg.Vd("96D!3@;@<,-:", (short) (C1580rY.Xd() ^ (-20110)), (short) (C1580rY.Xd() ^ (-7132))), new Class[0]);
        try {
            method.setAccessible(true);
            return ResourcesCompat.getDrawable((Resources) method.invoke(context, objArr), resourceDrawableId, null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final int getResourceDrawableId(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strReplace$default = StringsKt.replace$default(lowerCase, Global.HYPHEN, Global.UNDERSCORE, false, 4, (Object) null);
        try {
            return Integer.parseInt(strReplace$default);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                Integer num = this.resourceDrawableIdMap.get(strReplace$default);
                return num != null ? num.intValue() : addDrawableId(context, strReplace$default);
            }
        }
    }

    public final Uri getResourceDrawableUri(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        int resourceDrawableId = getResourceDrawableId(context, str);
        if (resourceDrawableId > 0) {
            Uri uriBuild = new Uri.Builder().scheme("res").path(String.valueOf(resourceDrawableId)).build();
            Intrinsics.checkNotNull(uriBuild);
            return uriBuild;
        }
        Uri uri = Uri.EMPTY;
        Intrinsics.checkNotNull(uri);
        return uri;
    }

    public final boolean isVectorDrawable(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.areEqual(getOpeningXmlTag(context, name), "vector");
    }
}
