package com.braze.support;

import android.content.Context;
import android.content.SharedPreferences;
import bo.app.xc0;
import bo.app.yc0;
import com.braze.support.BrazeLogger;
import com.drew.metadata.exif.makernotes.OlympusRawInfoMakernoteDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d̉=!,u\bDJm|\u0004W\u00068\u000b4E\u0007\":\u001b\u007f\u0007llA0RkP.XT2\u000fy\u0003<$a$yCIU\"Ԃ*\teNogtKr!Q\u0019\u001e\u0016'i\\Mc\u0004u\u0012=>ruM@eqS8\u000fsN%.<:8(\u00041\u001e8S(v)O{\u0012 =XrPQ;L5  \u0014V\"\u0017\u001d\u000bffPV{u:]\"3oP^?aF{{\fvZ5\u001b\u000fc4*n6{\u0015=a\u0011\u0018j[m\u0015owK\u0018\u0001)=*wroDf\u0014,\u0015Ya=c\u00019t\u0007g_:&C]q`h\u000eV\n+\u0002\u001bO\u001c\u0010\u001c&v-E*t\u001e&3#\n{@~\u0001\u000fF\u000e\u0013y6E$\u0018=9R3hg`i\u0018v7*\u0004%&1\u001b\u0007!\no6`C\u001al\u007f_Mi@kGv\n\b<\u0006\"~\u007f\u001a*2No\u0002Ez?-G5EzQ/1m\u0012Hrf\u0007\u0007ph\u0002\b\u0001hX2|7O*7\u000b\u0003D\u0013\u0004\u001cTbzD\u0011{3t\u001b\fܱ+ \u000bvr%{ĳ!ћlorܔm\f+/t8y\u0003y\u0010o9\r2kU:ߌ4؏z\u001aGֺr\u0007^iPT,fj,:2vifǱNΌR\f\u001bԵ_\u0006*9D1G[KLY٤\u0015˩\u0001\u000fgʳx\u0012\u0005ZA%#}2{!\u0001~['s>ն\u001cض\u0001f*ΊQS;!4VBtB\u0006;\u0007-rVûi֙KLtֵ\u0097Y\u001f"}, d2 = {"\u0011@2\u00158&,Cy_^Q&gu\u000fF_\u0015[)^v\u0005APq#V", "", "5dc\u00104\n!3\u0013lj?\r`{)Pl\b\\ mv\u007f%O{6W\t\u001c9<\u001c@v =IR?u=,", "u(E", "\u001bC$,;\b,6\u0013h[X\u001b_h)Sn\u0015_)b\u0011\u007f7Vt", "5dc\u001a7{86tl]X\u0016]\u0003\u001eH_\"i/mz\u007f)iv,]\fsU\u0007)A|\u0012=QMDy", "\u001cT;\u0019R\u001c,3\u0006x^=&jx\fSn\fj0ov\u00115^z _\u0007", "!T5\u0013<\u001f81t\\]>&lv\u000fRy\fZ:cr\u0005*i~\u0018]\u0015\u0015", "5dc H\r\u001f7\fxX:\n_h)Um\bh:du\u0011*K{\u001fp\u0016\u0011@m\u007fui\u001f7WR7z8(\u001ev", "!T5\u0013<\u001f81t\\]>&lv\u000fRy\fZ:fv\u000b", "5dc H\r\u001f7\fxX:\n_h)Um\bh:du\u0011-O\u0002zr.>c\r\u001cFq 7[", "\"@6", "5dc\u0010T*ASy\u0003\u0002^\u001a\r\n0i\u0013", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "CrT?<+", "/oX\u0018X@", "5dc h-?W,_\bh4l\u0017/rc'^<\u000f\u001arPniGz\u000b5m", "CrT?<+!O'\u0002", "7r19T5D", "", "@dU2e,GQ\u0019", "7r=B_3(`u\u0006vg2", "7r=B_3(`x\u0007\u0006m@", "1nd;g\u0016<Q)\f\b^5z\t=", "", "AtQ g9B\\\u001b", "3l_Al\u001bH<)\u0006\u0002", "5dc\u000fl;>A\u001d\u0014z", "", "5dc\u001aW{!O'\u0002", "7e=<a\fF^(\u0013", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "Bqd;V(MS\b\tWr;|o/n\u00027~", "2db6e,=0-\u000ezE,\u0006\u000b>h", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class StringUtils {
    public static final String CACHE_SUFFIX_PREFERENCES_FILE = "com.appboy.support.stringutils.cachefilesuffix";
    public static final String MD5_HASH_OF_THE_STRING_NULL = "37a6259cc0c1dae299a7866489dff0bd";
    private static final String NULL_USER_ID_SUBSTITUTE_STRING = "null";
    public static final String SUFFIX_CACHE_USER_ID_HASH_VALUE = "user_id_hash_value";
    public static final String SUFFIX_CACHE_USER_ID_KEY = "user_id_key";
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("StringUtils");

    public static final int countOccurrences(String str, String subString) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(subString, "subString");
        return StringsKt.split$default((CharSequence) str, new String[]{subString}, false, 0, 6, (Object) null).size() - 1;
    }

    public static final String emptyToNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt.isBlank(str)) {
            return null;
        }
        return str;
    }

    public static final long getByteSize(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullExpressionValue(str.getBytes(Charsets.UTF_8), "this as java.lang.String).getBytes(charset)");
        return r1.length;
    }

    public static /* synthetic */ void getCACHE_SUFFIX_PREFERENCES_FILE$annotations() {
    }

    public static final String getCacheFileSuffix(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getCacheFileSuffix(context, str, null);
    }

    public static final String getCacheFileSuffix(Context context, String str, String str2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.ud("p{y~n\u0001{", (short) (C1499aX.Xd() ^ (-2694))));
        String strYd = C1561oA.yd("GMCB", (short) (OY.Xd() ^ 24815));
        if (str == null) {
            str = strYd;
        }
        if (Intrinsics.areEqual(str, strYd)) {
            return getSuffixFromUserIdHashAndApiKey(C1561oA.Yd("rw#xuy~*+x-{0.3\u0001\t\n3\n\f\u000b\f\u000b\u0010\u0012>AB\r@C", (short) (ZN.Xd() ^ 24481)), str2);
        }
        String strQd = Xg.qd("anm/cstgu\u00016|\u007f{||\u0001\u0004>\u0005\u0007\u0006}\u0004}\r\r\u0003\u0007\u000fJ\u0001\u007f\u0003\t\u0007\t\r\u0011\u000b\u001a\u001d\u000f\u0010\u0014$", (short) (C1499aX.Xd() ^ (-17600)), (short) (C1499aX.Xd() ^ (-19215)));
        short sXd = (short) (C1580rY.Xd() ^ (-3972));
        short sXd2 = (short) (C1580rY.Xd() ^ (-6965));
        int[] iArr = new int["6O9DsZINw\u0001BE*nh\u000fV\u007frs)8'".length()];
        QB qb = new QB("6O9DsZINw\u0001BE*nh\u000fV\u007frs)8'");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Object[] objArr = {strQd, 0};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1626yg.Ud("\u000b`Y,>lq\u000b@/IA\u0007Y<T\u0010M&;", (short) (Od.Xd() ^ (-11144)), (short) (Od.Xd() ^ (-26621))), Class.forName(ZO.xd("\u001b8~\u0006UO'\u001aoQ6Qqt\u007fW", (short) (C1580rY.Xd() ^ (-4798)), (short) (C1580rY.Xd() ^ (-7110)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            String strWd = Ig.wd("d\u00142e1}b4\u0001!5", (short) (FB.Xd() ^ OlympusRawInfoMakernoteDirectory.TagWbRbLevelsFineWeather));
            String string = sharedPreferences.getString(strWd, null);
            String strOd = EO.Od("}+?p\u001e\\/+V\u007f\b'Lep\"_U", (short) (OY.Xd() ^ 2719));
            if (string != null && Intrinsics.areEqual(string, str)) {
                String string2 = sharedPreferences.getString(strOd, null);
                if (string2 != null && string2.length() != 0) {
                    return getSuffixFromUserIdHashAndApiKey(string2, str2);
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) xc0.f2203a, 14, (Object) null);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new yc0(str, str2), 12, (Object) null);
            String md5Hash = getMd5Hash(str);
            sharedPreferences.edit().putString(strWd, str).putString(strOd, md5Hash).apply();
            return getSuffixFromUserIdHashAndApiKey(md5Hash, str2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static /* synthetic */ void getMD5_HASH_OF_THE_STRING_NULL$annotations() {
    }

    public static final String getMd5Hash(String str) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        BigInteger bigInteger = new BigInteger(1, messageDigest.digest(bytes));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format(Locale.US, "%032x", Arrays.copyOf(new Object[]{bigInteger}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(locale, format, *args)");
        return str2;
    }

    public static /* synthetic */ void getSUFFIX_CACHE_USER_ID_HASH_VALUE$annotations() {
    }

    public static /* synthetic */ void getSUFFIX_CACHE_USER_ID_KEY$annotations() {
    }

    private static final String getSuffixFromUserIdHashAndApiKey(String str, String str2) {
        return (str2 == null || StringsKt.isBlank(str2)) ? "." + str : "." + str + '.' + str2;
    }

    public static final void ifNonEmpty(String str, Function1<? super String, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (str == null || str.length() == 0) {
            return;
        }
        block.invoke(str);
    }

    public static final boolean isBlank(String str) {
        if (str != null) {
            return StringsKt.isBlank(str);
        }
        return false;
    }

    public static final boolean isNullOrBlank(String str) {
        return str == null || StringsKt.isBlank(str);
    }

    public static final boolean isNullOrEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static final String truncateToByteLength(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (getByteSize(str) <= i2) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        int byteSize = 0;
        for (char c2 : charArray) {
            byteSize += (int) getByteSize(String.valueOf(c2));
            if (byteSize > i2) {
                break;
            }
            sb.append(c2);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "truncatedStringBuilder.toString()");
        return string;
    }
}
