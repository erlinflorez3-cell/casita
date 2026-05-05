package com.facebook.react.packagerconnection;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.common.logging.FLog;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Wg;

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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":5\u007f\u0007tvAӄLeVPZS0\u0018s{J$cҕyCIU\"}(\u000bUb}˧\rb\u000b\u000bq\u000e>\u0015\u0011+7YY\u0007]*\u000f`CņC3[q\u0006Mn\tN\u0005NGR<\b\u001b\u0019\u001aXM@z\tZc\f@5\u0011\tHU%Y\u0015\u001c\"\u0006l%\u0011 lg|;vp4ƀ1ݭ\u0007iJ÷wz>\u0003e\u0019VV7\r%f.-P7c\u001aSZ9Kқ_C\u001bAwE\u0013qw39I\fWdYVϯ\u0017ۣS\reöv~\u0013\\x\fU0\u007fgYZ&(&\u007f2azXdΑ3ρ272h\u000e\u001aA\u0002\u0013UF^\u0010m\u0013\u000f\tqN\u0017S\u0005Ĵ/?#ƘicA*\\DL\u0011\u001b0;\u0001\u001d42٭\u0010\u05ce\u0019\u001b\\ȭά5j"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EK|\u0015\u001dCq\u000eIt/>b}\u001eFq 7\u0017.7i:\u001a\u0017hn\u0017\u0011l5Nt6KVW\u001a\\a\u0002A\u001d\u0014hc", "", "/o_\u0010b5MS,\u000e", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "-`S1\\;B]\"z\u0002H7\f\r9n\u000e\t\u0006Mk\u0013\u0015Mk\u0010<\u0004", "", "", "/cS6g0H\\\u0015\u0006di;\u0001\u00138s`2\t+|\u0015\u001dCq\u000eI", "", "5dc\u000eW+Bb\u001d\t\u0004Z3f\u0014>i\n1\n!\u000b$\u0002Cm\u00148x%B", "u(;7T=:\u001d)\u000e~eud\u0005:;", "6nbA", "2dQBZ\u001a>`*~\bA6\u000b\u0018", "5dc\u0011X)NU\u0007~\bo,\nk9s\u000f", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0011X)NU\u0007~\bo,\nk9s\u000f", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", ">`R8T.><\u0015\u0007z", "5dc\u001dT*DO\u001b~cZ4|", ">qT3X9>\\\u0017~\t", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "Adc\u000eW+Bb\u001d\t\u0004Z3f\u0014>i\n1\\J\u000e\u0002\u0013Eu\n>v2", "", "9dh", "D`[BX", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class PackagerConnectionSettings {
    private static final String PREFS_DEBUG_SERVER_HOST_KEY = "debug_http_host";
    private final Map<String, String> _additionalOptionsForPackager;
    private final Context appContext;
    private final String packageName;
    private final SharedPreferences preferences;
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "PackagerConnectionSettings";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#2ߝx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?^h\u000e[\u0017$\u001a!lBH\u0004z\f\u0014e˳DņC3Uڎ\u07b2=e"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EK|\u0015\u001dCq\u000eIt/>b}\u001eFq 7\u0017.7i:\u001a\u0017hn\u0017\u0011l5Nt6KVW\u001a\\a\u0002A\u001d\u0014hL,5\u0015\u0010UJ(xM\r", "", "u(E", "\u001eQ4\u0013F&\u001d3un\\X\u001a\\u El\"^*n\u0006\u0011-O\u0002", "", "\"@6", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PackagerConnectionSettings(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.Qd("?ML\u001eIGL<NI", (short) (C1633zX.Xd() ^ (-25685))));
        this.appContext = context;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, C1593ug.zd("ml|Moqm\u0003z\u0004cys\u0006yyf\n}\u007f\u007f\u000e\u0002\f\u0002\u0005\u0014IPQRN", (short) (OY.Xd() ^ 8239), (short) (OY.Xd() ^ 23977)));
        this.preferences = defaultSharedPreferences;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od("y\u0006z\b\u0004|v?s~|\u0002qy~7Kvtyi{v", (short) (C1633zX.Xd() ^ (-31864)))).getMethod(C1561oA.Kd("\u0014\u0013#\u007f\u0012\u0015\u001e\u0015\u001c\u001b\u0005\u0019&\u001f", (short) (FB.Xd() ^ 14288)), new Class[0]);
        try {
            method.setAccessible(true);
            String str = (String) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(str, Wg.Zd("\u001dElPx\u0003#\"@ff\u0002&'\u0002\u0010'/b", (short) (C1580rY.Xd() ^ (-21413)), (short) (C1580rY.Xd() ^ (-27403))));
            this.packageName = str;
            this._additionalOptionsForPackager = new LinkedHashMap();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final Map<String, String> getAdditionalOptionsForPackager() {
        return this._additionalOptionsForPackager;
    }

    public String getDebugServerHost() {
        String string = this.preferences.getString(PREFS_DEBUG_SERVER_HOST_KEY, null);
        if (string != null && string.length() > 0) {
            return string;
        }
        String serverHost = AndroidInfoHelpers.getServerHost(this.appContext);
        if (Intrinsics.areEqual(serverHost, AndroidInfoHelpers.DEVICE_LOCALHOST)) {
            FLog.w(TAG, "You seem to be running on device. Run '" + AndroidInfoHelpers.getAdbReverseTcpCommand(this.appContext) + "' to forward the debug server's port to the device.");
        }
        Intrinsics.checkNotNull(serverHost);
        return serverHost;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final void setAdditionalOptionForPackager(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this._additionalOptionsForPackager.put(key, value);
    }

    public void setDebugServerHost(String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.preferences.edit().putString(PREFS_DEBUG_SERVER_HOST_KEY, host).apply();
    }
}
