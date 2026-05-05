package com.biocatch.client.android.sdk.core.jailbreak;

import com.biocatch.client.android.sdk.core.RootCheckConstants;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u0006\u0007nʑA0RqP.XU0ş\u0002ڔd$\n#2FтY\u001a\f\"QS\\n\u007fnxbSI\u001d\u000f.z\u0001+w_As \u001aJJ\u000eK[O\u0006<gb#85&@/P{\u001b\u007fH4\u0019*\u0005{[M\"\u0011^BGô^ҫQ\u0011\"Ň\u001e@&\u0004,`\bP<MzcƦ31"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wR??r1+\u0015dg\u0003k_0Us4GHT\u001eiN}H\u0014\u001f0", "", "u(E", ">q^0X:L", "\u001aiPCTuEO\"\u0001DI9\u0007\u0007/s\u000e}", "5dc\u001de6<S'\r", "u(;7T=:\u001d z\u0004`ug\u00169c\u007f6\n\u0016", "Adc\u001de6<S'\r", "uKY.i(\bZ\u0015\b|(\u0017\n\u0013-e\u000e6Q\u0004q", "2dbAe6R>&\tx^:\u000b", "", "5dc\u000fh-?S&e~g,\u000b", "", "5dc\u001de6<S'\rWr\u001al", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "4h[2A(FS", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class JailbreakWrapper {
    private Process process;

    public final void destroyProcess() {
        Process process = this.process;
        if (process != null) {
            process.destroy();
        }
    }

    public final String getBufferLines() {
        this.process = getProcessBySU(RootCheckConstants.BINARY_SU);
        Process process = this.process;
        return new BufferedReader(new InputStreamReader(process != null ? process.getInputStream() : null)).readLine();
    }

    public final Process getProcess() {
        return this.process;
    }

    public final Process getProcessBySU(String str) {
        return Runtime.getRuntime().exec(new String[]{"which", str});
    }

    public final void setProcess(Process process) {
        this.process = process;
    }
}
