package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.time.Duration;
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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\n8\u000b4C\u0007\":\u001b\u007f\u0007lkA0ZeP.XU2\u000fy{<$a$w\"Q٥J}P\b\u0018Tus\u0007J\t\u0010\n#N%\u0007wDI\u0004\u0007$ܟMͩAģУ7M}L\nr\u00036\u001d\"H!fz[ж\u001cݵL\u0014\u000f|IM\u001a\u0015\u0001R~>j\u000fc\u0004H\u0017\\̫\"Ә\"`\u007fP<Nzd\u000bJ1\u000b\u0002Dd&\u000e9S֘\u000fѸS܋͒u`Օ*@˝9\u0019=U\t\u0011`fέ\u0003Ly=\u000b\u007f/*1ʀ\u0010\u00065`\u007f\u001a4۩S\u001d"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005nCY\r/;v\u0018<\u00171;zC\"\u001ejo$\u0014m=Ru'T\"", "", "A`\\=_0GU\u0006z\n^", "", "5dc T4IZ\u001d\b|K(\f\t", "u(;7T=:\u001d z\u0004`u[\u0013?b\u0007(Q", "Adb@\\6G3\"zwe,{", "", "5dc X:LW#\bZg(y\u0010/d", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "Adb@\\6G@\u0019\r\nZ9\fw3m\u007f2\fO", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "5dc X:LW#\bg^:\f\u0005<tn,\u0004@\u000b'&\u000fP\u0010?fv\u0007(", "u(;8b;EW\"H\nb4|R\u000eu\r$\u000bD\u000b l", "7rB2g;B\\\u001b\rhm(\u0004\t", "CoS.g,,S(\u000e~g.\u000b", "", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface SettingsProvider {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static boolean isSettingsStale(SettingsProvider settingsProvider) {
            return false;
        }

        public static Object updateSettings(SettingsProvider settingsProvider, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }
    }

    Double getSamplingRate();

    Boolean getSessionEnabled();

    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774 */
    Duration mo7778getSessionRestartTimeoutFghU774();

    boolean isSettingsStale();

    Object updateSettings(Continuation<? super Unit> continuation);
}
