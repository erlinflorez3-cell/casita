package com.statsig.androidsdk;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.ToNumberPolicy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007fјnjO0LeN0ZS@\u000fs{:$c$\u007feCU }*\t]NogtP`ƐC%إFx\u0019+\nZ~]ܫ\u00132Po\bX[rU;vsd\tP80=\u0012\u0007\u0017\u0019XN@z\tJc\f@4\u0007\u0082xƞ\f˟ŋ\u001e\u0014\fF.\nfguXNH\u001bh\u0001ǂݭ\u0007iHZo\b>\ne\u001bVV7\r%e.-P7c\u0014;R1\u0015\u0003mM\u0012W\u007fM\u0007x'U/Yug6\u0007~*\u0014Y]U\u0001\u00016t\u0005\u007fq<-9T{Mf\rV}+\u007f\u001bC\u001c\u000e4+\u000f͔kָeڜԧ7vxeNYJ\nP\u0013\u0013ad(U\u0006A0Q\u001d|P\u0010AIRE\u0003\u001d\rL'1r/ol\u000e\u000f\u0019aƙ6ϼ0҅͘AJT\u001fgS6#~y\u001a,\u001a/u\u0004_\u0002\u001f3/'MZg)Qo\u0010O\\g%\t'åרmRNXrz$8B\t:\\\u001bߢ\u0007\u07fbTT`\u008cҍM\u001e\\\u0007\u0004\u001f˟$u"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7I\r$>C", "", "u(E", "2hb=T;<V\u0019\fek6\u000e\r.e\r", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`%y\u001bF\u000749b}~;{!*\\A>kA\t\"rr=\u0006c9$", "5dc\u0013e6FA\u001cz\b^+g\u0016/f\u000e", "", "AgP?X+)`\u0019\u007f\t", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "9dh", "5dc\u0013e6FA\u001cz\b^+g\u0016/f\u000efwI\u007f$!Kn\bJu+/f}'7i$.", "uKP;W9HW\u0018Hxh5\f\t8tI\u0016~<\u000e\u0017\u00162|\u000e=v25b{ EC|3IT75;\u001a\u001ej+'\u0016p0Wx|.RX;cV{\u0007\u0012\u001cg\u0018^:\u0011\u000eYOmLN@.\f5Y}Jl\u000b\u0015kQ\u001colSRYNu\u001ew\u000b\u0013eKY]\t\u001d", "5dc\u0014f6G", "\u001ab^:\".H]\u001b\u0006z(.\u000b\u00138/a6\u0006IV", "5dc\u0014f6G\u0012\u0015\byk6\u0001\b)s~.uM\u0001\u001e\u0017C}\u000e", "<na:T3Bh\u0019n\t^9", "", "CrT?", "@d\\<i,\u001f`#\u0007ha(\n\t.P\r(|N", "", "@d\\<i,\u001f`#\u0007ha(\n\t.P\r(|N?\u0013 F|\u0018@u\u001fCX\u0004\u001aDm\u001d.IQ;", "A`e2F;KW\"\u0001ih\u001a\u007f\u0005<e~\u0013\t@\u0002%", "D`[BX", "A`e2F;KW\"\u0001ih\u001a\u007f\u0005<e~\u0013\t@\u0002%UCx\rI\u0001)4S\f\u001f=g#.TC7y4", "uKP;W9HW\u0018Hxh5\f\t8tI\u0016~<\u000e\u0017\u00162|\u000e=v25b{ EC|3IT75;\u001a\u001ej+'\u0016p0Wx|.QJ=X\u001cy9\u001d\u0014${]8\u0011\u000e[\u0017\u000btNF&\f5\u0013\u007fEu\u000b\u001c%\u0012>j~\f4\u001aP\t\u0019~Q%wJchO\u000b(J^;`Uf\u0019e<\u0004\u000e\u0011v\u0019\u0019w&", "Ax]0:,M4&\t\u0003L/x\u0016/dj5{A\u000f", "Ax]0:,M4&\t\u0003L/x\u0016/dj5{A\u000fU\u0013Pn\u001bFz$/g|&1z\u00165M?Ik", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class StatsigUtil {
    public static final StatsigUtil INSTANCE = new StatsigUtil();
    private static final CoroutineDispatcherProvider dispatcherProvider = new CoroutineDispatcherProvider(null, null, null, 7, null);

    private StatsigUtil() {
    }

    public final Object getFromSharedPrefs$android_sdk_release(SharedPreferences sharedPreferences, String str, Continuation<? super String> continuation) {
        if (sharedPreferences == null) {
            return null;
        }
        return BuildersKt.withContext(dispatcherProvider.getIo(), new StatsigUtil$getFromSharedPrefs$2(sharedPreferences, str, null), continuation);
    }

    public final Gson getGson$android_sdk_release() {
        Gson gsonCreate = new GsonBuilder().setObjectToNumberStrategy(ToNumberPolicy.LONG_OR_DOUBLE).create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "GsonBuilder()\n            .setObjectToNumberStrategy(ToNumberPolicy.LONG_OR_DOUBLE)\n            .create()");
        return gsonCreate;
    }

    public final Map<String, Object> normalizeUser(Map<String, ? extends Object> map) {
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Object[]) {
                Object[] objArr = (Object[]) value;
                int length = objArr.length;
                ArrayList arrayList = new ArrayList();
                for (Object obj : objArr) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
                if (length == arrayList.size()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            } else if ((value instanceof String) || (value instanceof Boolean) || (value instanceof Double)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final Object removeFromSharedPrefs$android_sdk_release(SharedPreferences sharedPreferences, String str, Continuation<? super Unit> continuation) {
        Object objWithContext;
        return (sharedPreferences != null && (objWithContext = BuildersKt.withContext(dispatcherProvider.getIo(), new StatsigUtil$removeFromSharedPrefs$2(sharedPreferences, str, null), continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objWithContext : Unit.INSTANCE;
    }

    public final Object saveStringToSharedPrefs$android_sdk_release(SharedPreferences sharedPreferences, String str, String str2, Continuation<? super Unit> continuation) {
        Object objWithContext;
        return (sharedPreferences != null && (objWithContext = BuildersKt.withContext(dispatcherProvider.getIo(), new StatsigUtil$saveStringToSharedPrefs$2(sharedPreferences, str, str2, null), continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objWithContext : Unit.INSTANCE;
    }

    public final String syncGetFromSharedPrefs$android_sdk_release(SharedPreferences sharedPreferences, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String string = null;
        if (sharedPreferences == null) {
            return null;
        }
        try {
            string = sharedPreferences.getString(key, null);
            return string;
        } catch (ClassCastException unused) {
            return string;
        }
    }
}
