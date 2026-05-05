package com.facebook.react.modules.devtoolssettings;

import android.content.SharedPreferences;
import com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@ReactModule(name = "\u0004$4\u0011+*&,\u000b\u001c*)\u001d!\u0019$|\u0010\u001c\u000e\u0013\u0010\u001c")
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjG<LeN.ZS8\u000fs{:&a)\bّYaJ}P\b\bMs(yZ^\u0019C'\u0006Dy̶0Icz&\u001a\u001d7ZqU2{u\u0004M)|D\f8487(\u000bG.rX\u001e~\u0013Cy\u0015B6NzRT#L3 X\u001a\u00070\u000f)tg|?xrkDG%\u0019hpTms\u0001\t[\u0010^TU\u0011MѰ ҋD7=ՖȕW\u0010"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006u%Fh\b*>{$.\\R?t6,^GaJum6U\u0005\u0015G[]0eT\u0001%\u0010\u001bV\u0010N8t\u000fXQ+n\u001a", "\u001ab^:\"-:Q\u0019{\u0005h2F\n,r\u007f$yOJ%\"Gm\u001c\u0006_!D]\u000f \u0016m'\u001dWMBy\"\u001e$weB\tq\u0014J\u007f#IL[\u001agRp\u0013", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "AgP?X+)`\u0019\u007fzk,\u0006\u0007/s", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "5dc\u0010b5L] ~eZ;z\f\u001de\u000f7\u007fI\u0003%", "", "5dc\u001de6?W \u0003\u0004`\u001a|\u0018>i\t*\n", "Adc\u0010b5L] ~eZ;z\f\u001de\u000f7\u007fI\u0003%", "", "<df X;MW\"\u0001\t", "Adc\u001de6?W \u0003\u0004`\u001a|\u0018>i\t*\n", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DevToolsSettingsManagerModule extends NativeDevToolsSettingsManagerSpec {
    private static final Companion Companion = new Companion(null);
    private static final String KEY_CONSOLE_PATCH_SETTINGS = "ConsolePatchSettings";
    private static final String KEY_PROFILING_SETTINGS = "ProfilingSettings";
    private static final String SHARED_PREFERENCES_PREFIX = "ReactNative__DevToolsSettings";
    private final SharedPreferences sharedPreferences;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#2ߝx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈_>PsW3{q\u0014ʣ3ҽ:\u0005(݅ś<~"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006u%Fh\b*>{$.\\R?t6,^GaJum6U\u0005\u0015G[]0eT\u0001%\u0010\u001bV\u0010N8t\u000fXQ+n\u0003\u0015)\u00107E\u000b?r\na", "", "u(E", "\u0019DH,6\u0016'A\u0003eZX\u0017Xw\rHy\u0016[/oz\u007f)]", "", "\u0019DH,C\u0019(4|e^G\u000evv\u000fTn\fd\"n", "!G0\u001f8\u000b8>\u0006^[>\u0019\\q\rEm\"f-`wz:", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevToolsSettingsManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        SharedPreferences sharedPreferences = reactContext.getSharedPreferences(SHARED_PREFERENCES_PREFIX, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.sharedPreferences = sharedPreferences;
    }

    @Override // com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec
    public String getConsolePatchSettings() {
        return this.sharedPreferences.getString(KEY_CONSOLE_PATCH_SETTINGS, null);
    }

    @Override // com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec
    public String getProfilingSettings() {
        return this.sharedPreferences.getString(KEY_PROFILING_SETTINGS, null);
    }

    @Override // com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec
    public void setConsolePatchSettings(String str) {
        this.sharedPreferences.edit().putString(KEY_CONSOLE_PATCH_SETTINGS, str).apply();
    }

    @Override // com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec
    public void setProfilingSettings(String str) {
        this.sharedPreferences.edit().putString(KEY_PROFILING_SETTINGS, str).apply();
    }
}
