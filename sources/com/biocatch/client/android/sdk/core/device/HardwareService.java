package com.biocatch.client.android.sdk.core.device;

import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.client.android.sdk.core.ApplicationCache;
import com.dynatrace.android.agent.AdkSettings;
import java.io.File;
import java.io.FileFilter;
import java.io.RandomAccessFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0L͜P.`_2şs{B(cҕyCI[\"Ԃ(ޛeȞ\u0018g\u001dI\u001b\u001eS\u0013\u0014\u0016\u0011jZJe|k\u0014'2prУ7M}A\u0002h\u0003=\u001d\"H!f\u0002K\u0006b.V\u0019\u000fzqUT\u0016>K\t:\u0001\u0019\u001e\u0011(\u0017\u001e>N\u0007tմiߑ:Htҗ\u000b;1\u0003\u0002B|(6ܡ~֔\u0011F\\܋̂zn"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^K]F\u0006u([v\u0015GY_0ZRH", "", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "/o_9\\*:b\u001d\t\u0004<(z\f/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w)NFr8\u001c\u0011weC\u0010A(Ly'\u001d", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAz\u0016w=R?rBs{fkAP`0Xt#VJQuZYv=\u001d!$\nW*\u001a\u000f]@m|C=h\u00066V\u0002\u0005D\f\u0017\u001d\u00123f\u007fF`\u0019%u\u0013xA~,7", "Bd[2c/H\\-fvg(~\t<", "\u001a`]1e6BRb\u000eze,\b\f9n\u0014qj@\b\u0017\"Jy\u0017P^!>U\u007f DC", "5dc\u0016`,B", "", "5dc\u001f4\u0014", "", "<t\\/X9(Tv\t\b^:", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class HardwareService {
    private final TelephonyManager telephonyManager;
    private final Utils utils;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001b\u001d̉=!4i\bDJc|\u0004O\u000f8é6B\u0015\"4ߚ \u0006߿pAFǏ\u0016H\\Q\u0014-Ƃo{B$$2\u007fDSUH\u007fR\r]Q\u007fg\u001dN!\u001få\u0013\u000b"}, d2 = {"1n\\{U0HQ\u0015\u000exauz\u00103e\t7E<\n\u0016$Qs\r\u0006\u0005$;#{*Dm_-MT?i4gwdn8\u0019_9Nd'T]R*\\\u0011{M\u001c\u000fZ\u001b8,j\u000ffA2-\"B/h0P\u0011;u", "\u001aiPCTuB]b_~e,]\r6t\u007f5Q", "u(E", "/bR2c;", "", ">`c5a(FS", "\u001aiPCTuB]b_~e,R", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class CpuFilter implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File pathname) {
            Intrinsics.checkNotNullParameter(pathname, "pathname");
            return Pattern.matches("cpu[0-9]+", pathname.getName());
        }
    }

    public HardwareService(Utils utils, ApplicationCache applicationCache) {
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(applicationCache, "applicationCache");
        this.utils = utils;
        Object systemService = applicationCache.get().getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        this.telephonyManager = (TelephonyManager) systemService;
    }

    public final String getImei() {
        return this.utils.isVersionGreaterOrEqualTo(26) ? this.telephonyManager.getImei() : this.telephonyManager.getDeviceId();
    }

    public final double getRAM() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/meminfo", "r");
            try {
                Matcher matcher = Pattern.compile("(\\d+)").matcher(randomAccessFile.readLine());
                String str = AdkSettings.PLATFORM_TYPE_MOBILE;
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (strGroup != null) {
                        Intrinsics.checkNotNullExpressionValue(strGroup, "mem.group(1) ?: totalMememoryStr");
                        str = strGroup;
                    }
                }
                double d2 = Integer.parseInt(str);
                CloseableKt.closeFinally(randomAccessFile, null);
                return d2;
            } finally {
            }
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public final int numberOfCores() {
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new CpuFilter());
            if (fileArrListFiles != null) {
                return fileArrListFiles.length;
            }
        } catch (Exception unused) {
        }
        return 0;
    }
}
