package com.statsig.androidsdk.evaluator;

import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.statsig.androidsdk.Statsig;
import com.statsig.androidsdk.StatsigUser;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007|jA0ZeP.XT2\u000fy\u0005<$a)yCI\\\"}(\tWNusvϺb\u000bY\u000f\u000e\u0016~n4Ic|e\u0012\u00156JoM9UoC:fӛ6\u001bړb\"fxE\u0006 *Н\u0014v\tC\u0014\\ 1XphT=\u0002\u0013\u001d*6N1\u0011-\u000blߑ:RrcJ5)\nyDT-\u00068\r^\u001dU\u0003,˼zk$1P=;\u001c5U\t\rxdO\u0005Oqk\u000f\u0017+W1W{o8n~B\u0014[U\u001bf\u000b(r\u0004\u007f_TG9Z{K~\u0018X}\t\b%>\u001a\r4&x4;'~\n$2#q\u0004D^\u0010vB.\u0005*H%4\u00185A8Ik\u0002gI)f9\u0012\u0004;\u001di\u000178ie&b+\u001a\u0003\n\u00027_PUJd\t\b<4\u0004Ͳf\u00028\u0017x]\u000eC\u0014\u0013D\u0016SL\f=17\u0004\u0002v[\u0018z\u0013x\u0001S\u0018g\u0011V0\b.9@\b:Yth\u0013\u0002hT\u0007CAQ*l\u001f}6(ht\u0006V9'&M}}\u001an[s\"%]}g_|\u0007&YO]aJ\u001ay\u001e}jx*>ja5\\tXk\f\tsX&@`\u0003\u0010&\u0011\rc\u001a0JA\b\u001bbJa\u001fj%`\u00054Ao{ȤcZv/GdAD\u001bk:s7\u0016\u0001b~\u007f\u007fz_++_j}OrM\u0019T_RnB\n;\t\u0015r.F\u0018RUn\u0005\u0018\fT*\u001fFNGTGm# \u000f8`\u0017βIVxkaS\u0018.\u000b~\u007f\u0015au>x\u0018y\u001fA߯nTUZ'(|e\u0003%\u000ej&\u001cqH\u000bG\u0012^9_\u0007[\u0001&q>d7+\nO$3\u0011\b$\u00134[Bm\u001d^\f\"S-a\f\u000f 2\b\t'&#z40q=\bb\u007frя?`"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi\u0017~\u00125]?JuA\u000e$lhG\\", "", "u(E", "1n\\=T9>2\u0015\u000ezl", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi\u0015w\u001f/QE\u001b|0%%dp=\u0011l\u0002", "1n\\=T9>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aiPCTuNb\u001d\u0006D=(\f\t\u0005", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "", "1n]AT0Ga", "B`a4X;L", "D`[BX", "7f]<e,\u001cO'~", "5dc\u0011T;>", "7m_Bg", "5dc\u0012c6<V", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~@\b)9C", "5dc\u0013e6F3\"\u0010~k6\u0006\u0011/n\u000f", "", "CrT?", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7I\f DC", "4hT9W", "5dc\u0013e6FC'~\b", "5dc\"a0M7w", "7cCFc,", "5dc\"f,KD\u0015\u0006\u000b^\r\u0007\u0016\u0010i\u007f/z", "5dc#T3NSt\rYh<y\u0010/", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~8\b04t\u0016\u0004", "5dc#T3NSt\rhm9\u0001\u00121", ";`c0[\u001aM`\u001d\b|B5X\u0016<a\u0014", "B`a4X;", ">`a@X\u0010,=\b\u0003\u0003^:\f\u00057p", "Dda@\\6G1#\u0007\u0006Z9|", "", "D0", "D1", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class EvaluatorUtils {
    public static final EvaluatorUtils INSTANCE = new EvaluatorUtils();

    private EvaluatorUtils() {
    }

    private final Date getDate(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            Long epoch = getEpoch(obj);
            return epoch == null ? parseISOTimestamp(obj) : new Date(epoch.longValue());
        } catch (Exception unused) {
            return parseISOTimestamp(obj);
        }
    }

    private final Long getEpoch(Object obj) {
        long jLongValue;
        if (obj instanceof String) {
            jLongValue = Long.parseLong((String) obj);
        } else {
            if (!(obj instanceof Number)) {
                return null;
            }
            jLongValue = ((Number) obj).longValue();
        }
        if (String.valueOf(jLongValue).length() < 11) {
            jLongValue *= (long) 1000;
        }
        return Long.valueOf(jLongValue);
    }

    private final Date parseISOTimestamp(Object obj) {
        if (obj instanceof String) {
            try {
                return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").parse((String) obj);
            } catch (Exception e2) {
                Statsig.INSTANCE.getClient$android_sdk_release().getErrorBoundary$android_sdk_release().logException$android_sdk_release(e2, "parseISOTimestamp");
            }
        }
        return null;
    }

    public final ConfigEvaluation compareDates(Function2<? super Date, ? super Date, Boolean> compare, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(compare, "compare");
        if (obj == null || obj2 == null) {
            return new ConfigEvaluation(false, null, null, null, null, null, null, null, false, false, false, null, 4094, null);
        }
        Date date = getDate(obj);
        Date date2 = getDate(obj2);
        return (date == null || date2 == null) ? new ConfigEvaluation(false, null, null, null, null, null, null, null, false, false, false, null, 4094, null) : new ConfigEvaluation(compare.invoke(date, date2).booleanValue(), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
    }

    public final boolean contains(Object obj, Object obj2, boolean z2) {
        Iterable iterableAsIterable;
        if (obj != null && obj2 != null) {
            if (obj instanceof Iterable) {
                iterableAsIterable = (Iterable) obj;
            } else if (obj instanceof Object[]) {
                iterableAsIterable = ArraysKt.asIterable((Object[]) obj);
            }
            for (Object obj3 : iterableAsIterable) {
                if (((obj3 instanceof String) && (obj2 instanceof String) && StringsKt.equals((String) obj3, (String) obj2, z2)) || Intrinsics.areEqual(obj3, obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String getFromEnvironment(StatsigUser user, String field) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(field, "field");
        Map<String, String> statsigEnvironment$android_sdk_release = user.getStatsigEnvironment$android_sdk_release();
        String str = statsigEnvironment$android_sdk_release == null ? null : statsigEnvironment$android_sdk_release.get(field);
        if (str != null) {
            return str;
        }
        Map<String, String> statsigEnvironment$android_sdk_release2 = user.getStatsigEnvironment$android_sdk_release();
        if (statsigEnvironment$android_sdk_release2 == null) {
            return null;
        }
        String lowerCase = field.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        return statsigEnvironment$android_sdk_release2.get(lowerCase);
    }

    public final Object getFromUser(StatsigUser user, String field) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(field, "field");
        Object userValueForField = getUserValueForField(user, field);
        if (userValueForField == null) {
            String lowerCase = field.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
            userValueForField = getUserValueForField(user, lowerCase);
        }
        Object obj = null;
        if ((userValueForField == null || Intrinsics.areEqual(userValueForField, "")) && user.getCustom() != null) {
            Map<String, Object> custom = user.getCustom();
            userValueForField = custom == null ? null : custom.get(field);
            if (userValueForField == null) {
                Map<String, Object> custom2 = user.getCustom();
                if (custom2 == null) {
                    userValueForField = null;
                } else {
                    String lowerCase2 = field.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    userValueForField = custom2.get(lowerCase2);
                }
            }
        }
        if ((userValueForField != null && !Intrinsics.areEqual(userValueForField, "")) || user.getPrivateAttributes() == null) {
            return userValueForField;
        }
        Map<String, Object> privateAttributes = user.getPrivateAttributes();
        Object obj2 = privateAttributes == null ? null : privateAttributes.get(field);
        if (obj2 == null) {
            Map<String, Object> privateAttributes2 = user.getPrivateAttributes();
            if (privateAttributes2 != null) {
                String lowerCase3 = field.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                obj = privateAttributes2.get(lowerCase3);
            }
        } else {
            obj = obj2;
        }
        return obj;
    }

    public final String getUnitID(StatsigUser user, String str) {
        String lowerCase;
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(user, "user");
        if (str == null) {
            lowerCase = null;
        } else {
            lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        }
        if (!Intrinsics.areEqual(lowerCase, "userid")) {
            if (lowerCase == null) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(lowerCase.length() == 0);
            }
            if (Intrinsics.areEqual((Object) boolValueOf, (Object) false)) {
                Map<String, String> customIDs = user.getCustomIDs();
                String str2 = customIDs == null ? null : customIDs.get(str);
                if (str2 != null) {
                    return str2;
                }
                Map<String, String> customIDs2 = user.getCustomIDs();
                if (customIDs2 == null) {
                    return null;
                }
                return customIDs2.get(lowerCase);
            }
        }
        return user.getUserID();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r3.equals(io.sentry.protocol.App.JsonKeys.APP_VERSION) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r3.equals("userid") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r3.equals("appversion") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r3.equals("user_id") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r3.equals("ipaddress") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (r3.equals("ip") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        if (r3.equals("useragent") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (r3.equals("ip_address") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a0, code lost:
    
        if (r3.equals(io.sentry.Session.JsonKeys.USER_AGENT) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return r2.getAppVersion();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return r2.getUserID();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r2.getIp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return r2.getUserAgent();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getUserValueForField(com.statsig.androidsdk.StatsigUser r2, java.lang.String r3) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.evaluator.EvaluatorUtils.getUserValueForField(com.statsig.androidsdk.StatsigUser, java.lang.String):java.lang.Object");
    }

    public final Double getValueAsDouble(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return StringsKt.toDoubleOrNull((String) obj);
        }
        if (obj instanceof ULong) {
            return Double.valueOf(UnsignedKt.ulongToDouble(((ULong) obj).m9206unboximpl()));
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        return null;
    }

    public final String getValueAsString(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof String ? (String) obj : obj.toString();
    }

    public final boolean matchStringInArray(Object obj, Object obj2, Function2<? super String, ? super String, Boolean> compare) {
        Iterable iterableAsIterable;
        Intrinsics.checkNotNullParameter(compare, "compare");
        String valueAsString = getValueAsString(obj);
        if (valueAsString == null) {
            return false;
        }
        if (!(obj2 instanceof Iterable)) {
            if (obj2 instanceof Object[]) {
                iterableAsIterable = ArraysKt.asIterable((Object[]) obj2);
            }
            return false;
        }
        iterableAsIterable = (Iterable) obj2;
        Iterator it = iterableAsIterable.iterator();
        while (it.hasNext()) {
            String valueAsString2 = getValueAsString(it.next());
            if (valueAsString2 != null && compare.invoke(valueAsString, valueAsString2).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int versionCompare(String v1, String v2) {
        Intrinsics.checkNotNullParameter(v1, "v1");
        Intrinsics.checkNotNullParameter(v2, "v2");
        List listSplit$default = StringsKt.split$default((CharSequence) v1, new String[]{"."}, false, 0, 6, (Object) null);
        List listSplit$default2 = StringsKt.split$default((CharSequence) v2, new String[]{"."}, false, 0, 6, (Object) null);
        int i2 = 0;
        while (i2 < RangesKt.coerceAtLeast(listSplit$default.size(), listSplit$default2.size())) {
            int i3 = i2 < listSplit$default.size() ? Integer.parseInt((String) listSplit$default.get(i2)) : 0;
            int i4 = i2 < listSplit$default2.size() ? Integer.parseInt((String) listSplit$default2.get(i2)) : 0;
            if (i3 < i4) {
                return -1;
            }
            if (i3 > i4) {
                return 1;
            }
            i2++;
        }
        return 0;
    }
}
