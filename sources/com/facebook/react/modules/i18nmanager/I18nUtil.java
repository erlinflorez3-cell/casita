package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import androidx.core.text.TextUtilsCompat;
import com.facebook.hermes.intl.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
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
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146B\u0005\"4\u0012\u0006\u0007nʑA0ZeP.XV2\u000fy\b<$a,\bّYkJ}P\b\bM}(sPZŲG\u000f\u0014\u0016A~:Mmx\f\u0017?6PuW3{vm=nxN\u0005N4jF\b\r\u0019\u001aXJ@z\tIc\f@7\u0007p\u0003^\u001bV\u001d\u001a@\bn$\u000f$tg|=\u0011\u0001kDG#1nrR5eH|{\u0014vX5\u0017\u000faL-\tUC =S1\t\u0003_M\tWqk\f\u0019+57as\u0006C\t\u0004\"#CO;_9&%\u0011_o$'YQ\u0014O^\u0014@w)\u0003UJ\u0012\u001e\u001e'v0]\u001et\u000e&3#y\u001a@\u0019\u0010lS\u0018z\u00108G)\u000e9C9Im\u0018a\u00047\\I\u0014\u0005;#S\u0005|'sT<gE\u001fb\u0004i1\u007fMmL\\\u001dq=\u001c\u00067bJ>\u0012D_\u007f]\u0001A2%+O[g*Qo\u0010]\\g%\u00071zajjHn$%V\u000eѪ\u000bɔ^H|\u0007qQb[µ\u0015d"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006zp\bb\u0006\u001c@i\u0018.Z\r\u001f7\u0007'\u0005we@\\", "", "u(E", "7r32i0<S\u0004\fz_,\n\u0016/df$\u0005B\u0011\u0013\u0019G\\|#", "", "u(I", "/k[<j\u0019-:", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/o_9\\*:b\u001d\t\u0004A(\u000bu>lm8\u0007K\u000b$&", "2n;2Y;\u001a\\\u0018k~`/\fvAa\u000b\f\u0005-o}", "4na0X\u0019-:", "7r??X-,S(", "9dh", "", "2dU.h3MD\u0015\u0006\u000b^", "7rA!?", "7rA!?\bEZ#\u0011z]", "7rA!?\rH`\u0017~y", "Adc\u001de,?", "D`[BX", "AvP=?,?bt\byK0~\f>I\t\u0015j'", "4kX=", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class I18nUtil {
    private static final String KEY_FOR_PERFS_MAKE_RTL_FLIP_LEFT_AND_RIGHT_STYLES = "RCTI18nUtil_makeRTLFlipLeftAndRightStyles";
    private static final String KEY_FOR_PREFS_ALLOWRTL = "RCTI18nUtil_allowRTL";
    private static final String KEY_FOR_PREFS_FORCERTL = "RCTI18nUtil_forceRTL";
    private static final String SHARED_PREFS_NAME = "com.facebook.react.modules.i18nmanager.I18nUtil";
    public static final Companion Companion = new Companion(null);
    private static final I18nUtil instance = new I18nUtil();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005$4\u0012\u000e\u0007nj?2JͣIDɟ\u0004*=j<9*[ҸuCIUb\t0\u0011gN\u0016n5OҼ\u000fC\u0015\u0010f\u0005x-aU'_hƄ\u0005Բs?;ݹ@IGc\r63\"\tĵ\u000bѩ\t\u0001\"ݒ\u0019\u001c\u0005~[K:\u0014\u0007ώCĐV\rUĨj\u001e\u0014C8\u0001L^>ޱ\tՂp]Bǂs\u0014wHf'\u000e73\u0013ϘJZ/˙\u000fc$3N@߷\u00190"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006zp\bb\u0006\u001c@i\u0018.Z\r\u001f7\u0007'\u0005we@EA6V\u0002#PPX52", "", "u(E", "\u0019DH,9\u0016+M\u0004^g?\u001avp\u000bK_\"h/g\u0011w.Sx6]\u0005\u0016Hw{ L\u0010\u001b1%\u001eZ.\f\u0004\\H\u0019t", "", "\u0019DH,9\u0016+M\u0004kZ?\u001avd\u0016Li\u001ah/g", "\u0019DH,9\u0016+M\u0004kZ?\u001avi\u0019R]\bh/g", "!G0\u001f8\u000b8>\u0006^[L&ed\u0017E", "7mbAT5<S", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006zp\bb\u0006\u001c@i\u0018.Z\r\u001f7\u0007'\u0005we@\\", "5dc\u0016a:MO\"|z", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u001f!F\u007f\u0015<\u0005n9%P)?i\u001f*OCH5\u0018igqQH\u000bj\u0002", "\u0012D?\u001f8\n\u001aBx]9`,\fl8s\u000f$\u0005>\u0001", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(message = "\u0018Y\u0001t?}#jlH6}UT5\\o`\u000e(\t4Kf~O\u0002*/d\r&q_$Q[h\u0002xL-Ey\u0014WO\u00059YZ?%AC\u001f\u001cH(", replaceWith = @ReplaceWith(expression = "instance", imports = {}))
        @InterfaceC1492Gx
        public final I18nUtil DEPRECATED$getInstance() {
            return getInstance();
        }

        @JvmStatic
        public final I18nUtil getInstance() {
            return I18nUtil.instance;
        }
    }

    private I18nUtil() {
    }

    private final boolean applicationHasRtlSupport(Context context) throws Throwable {
        Object obj;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("'3,9920x!,.3'/8p\u0019DFK?QP", (short) (C1499aX.Xd() ^ (-18150)))).getMethod(Qg.kd(".+9\u000532-)\"\u001f1%*(\u0002&\u001d%", (short) (FB.Xd() ^ 27303), (short) (FB.Xd() ^ 315)), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strVd = hg.Vd(")5*73,&n#.,1!).f($cu$#\u001e\u001a\u0013\u0010\"\u0016\u001b\u0019r\u0017\u000e\u0016", (short) (FB.Xd() ^ 6541), (short) (FB.Xd() ^ 8091));
            short sXd = (short) (Od.Xd() ^ (-26421));
            int[] iArr = new int["/4(-8".length()];
            QB qb = new QB("/4(-8");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                Class<?> cls = Class.forName(strVd);
                Field field = 1 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            int iIntValue = ((Integer) obj).intValue();
            return (iIntValue + 4194304) - (iIntValue | 4194304) != 0;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @JvmStatic
    public static final I18nUtil getInstance() {
        return Companion.getInstance();
    }

    private final boolean isDevicePreferredLanguageRTL() {
        return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    private final boolean isPrefSet(Context context, String str, boolean z2) throws Throwable {
        Object[] objArr = {C1561oA.yd("epm-lfghlxwr<\u007fqlu\u0006>|\u0006y\n\u007f\u007f\rF\u0001OU\u000b\t\u0004\u0010\u0002\u0007\f\u0018Rl[a\u0017|#\u0017\u0019", (short) (C1580rY.Xd() ^ (-2910))), 0};
        Method method = Class.forName(C1561oA.Yd("\u0017%\u001c+)$ j!..5'18r\t66=/C@", (short) (C1633zX.Xd() ^ (-19679)))).getMethod(Jg.Wd("?|o.'\u000f\u0004V7fwN/\u0012}bO\u0004iV", (short) (C1499aX.Xd() ^ (-9437)), (short) (C1499aX.Xd() ^ (-12254))), Class.forName(Xg.qd("\u0018\u0010&\u0012_\u001f\u0015#\u001dd\u000b-,$*$", (short) (C1499aX.Xd() ^ (-8419)), (short) (C1499aX.Xd() ^ (-5732)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            return ((SharedPreferences) method.invoke(context, objArr)).getBoolean(str, z2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final boolean isRTLAllowed(Context context) {
        return isPrefSet(context, KEY_FOR_PREFS_ALLOWRTL, true);
    }

    private final boolean isRTLForced(Context context) {
        return isPrefSet(context, KEY_FOR_PREFS_FORCERTL, false) || StringsKt.equals(System.getProperty("FORCE_RTL_FOR_TESTING", Constants.CASEFIRST_FALSE), "true", true);
    }

    private final void setPref(Context context, String str, boolean z2) throws Throwable {
        short sXd = (short) (Od.Xd() ^ (-29725));
        short sXd2 = (short) (Od.Xd() ^ (-5491));
        int[] iArr = new int["Y\u00073+eCJug;\u0011&O\"n@rh(\r,Ug*\u0014#l\u001fMM\u000fx1e\u000e\rP\u001eqC]3\u0018A3a$".length()];
        QB qb = new QB("Y\u00073+eCJug;\u0011&O\"n@rh(\r,Ug*\u0014#l\u001fMM\u000fx1e\u000e\rP\u001eqC]3\u0018A3a$");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Object[] objArr = {new String(iArr, 0, i2), 0};
        Method method = Class.forName(C1626yg.Ud("W\u0007\u0011baI_.>y\u0004#t9v\u0014\u000f\u0011&S\u0019?\u0017", (short) (C1580rY.Xd() ^ (-23920)), (short) (C1580rY.Xd() ^ (-20330)))).getMethod(EO.Od("\u0012g\u0007\u0003\u0003P{\u0001F\u0015;\u0006QX7\u0007l]*N", (short) (C1607wl.Xd() ^ 30276)), Class.forName(Ig.wd("n-\u0014_dm\u0007$ux\u001c#ufwW", (short) (C1633zX.Xd() ^ (-20377)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(context, objArr)).edit();
            editorEdit.putBoolean(str, z2);
            editorEdit.apply();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void allowRTL(Context context, boolean z2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        setPref(context, KEY_FOR_PREFS_ALLOWRTL, z2);
    }

    public final boolean doLeftAndRightSwapInRTL(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return isPrefSet(context, KEY_FOR_PERFS_MAKE_RTL_FLIP_LEFT_AND_RIGHT_STYLES, true);
    }

    public final void forceRTL(Context context, boolean z2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        setPref(context, KEY_FOR_PREFS_FORCERTL, z2);
    }

    public final boolean isRTL(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return applicationHasRtlSupport(context) && (isRTLForced(context) || (isRTLAllowed(context) && isDevicePreferredLanguageRTL()));
    }

    public final void swapLeftAndRightInRTL(Context context, boolean z2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        setPref(context, KEY_FOR_PERFS_MAKE_RTL_FLIP_LEFT_AND_RIGHT_STYLES, z2);
    }
}
