package com.biocatch.client.android.sdk.collection.collectors.emulator;

import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.collectors.OnDemandCollector;
import com.biocatch.client.android.sdk.wrappers.BuildInfo;
import com.biocatch.client.android.sdk.wrappers.Pattern;
import com.biocatch.client.android.sdk.wrappers.SystemProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.XS2\u000f\u0002{<$a%yCQU\"}(\nWNusvJ`\fK\u000f\u0014\u001f\u0001j2K[ތs܈?8RqO3{ok8!\u0010F\t.3:8(\u0007\u0011\u001e8K(v)G[\u0010 5XphXҫQ\u0005(\u0019ND.\u00196\\\u0016N|\\=iH0;\u0003\u0018D%ώa݁\u0001M\u0015Ͽ%9\u001b~y\u001eYIm\nkȃUΫ\u000bVsA\tI\u007fHUz53CI\"dl-VЃ\u0017ۣS\u0011ut,j\u0013`1\u001e5;gcyaD|Nߕ}Ɂ@\b&\b-Z<@jx\u0016\"Kt!hv\u0011XތDȸ~eN\u0019+\u0014AA\n-thy;Gcm<[ٿ ţ\u0005r9]Z%n+k`\u0006TIQnA\u001fݓ\fՒAm\f͏3\u000e8\tHG.5R\u00800ϲ)7cݽأ%\u0005"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LV<cN\u0002G![:\u0016^2\t\u0014cN\u0002xK>\u001f\u0006;S\u000f\u0011", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p1U-,dN{<q\u001ca\u0015N)\u001c\u000ff\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LV<cN\u0002G![:\u0016^2\t\u0014cN\fxC7&]", "0tX9W\u0010GT#", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5\u0011.\u0019o`\u001d\u0010d6$", ">`cAX9G", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5\u001f\u001a$waF\u00109", "AxbAX4)`#\nzk;\u0001\t=", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5\"2#waAqp6Yv4VPN:2", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004iIz\u00129XCHy}z%lh8jl-XL\u000eEVVuYV|;\u0010!X\u0011\u0018)\u0014\tYJ38@@\u001e\u00156M\u0001\u0005v\u007f\u0012_ Bf{MV\u001dUC\u007fqP8hSb5`EKM,'h\u0016]\u0019k8=m\u0012x\u001d\u001bq_w\u0006\u0005R\u001e|Vx1uF\u001fDJ1:xfFR}\u001f*\t5.K\u0004b\u001f<ct8\u00041\u0004B\u007fyU", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "7r4:h3:b#\fY^;|\u0007>e~\f\u0005\u001d\u0011\u001b\u001eFZ\nIr-5h}-E", "", "u(I", "7r4:h3:b#\fY^;|\u0007>e~\f\u0005.\u0015%&GwxI\u000105f\r$7l", "@t]\u0010b3ES\u0017\u000e~h5", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class EmulatorCollector extends OnDemandCollector<EmulatorModel> {
    private final BuildInfo buildInfo;
    private final Pattern pattern;
    private final SystemProperties systemProperties;

    public EmulatorCollector(BuildInfo buildInfo, Pattern pattern, SystemProperties systemProperties) {
        Intrinsics.checkNotNullParameter(buildInfo, "buildInfo");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(systemProperties, "systemProperties");
        this.buildInfo = buildInfo;
        this.pattern = pattern;
        this.systemProperties = systemProperties;
    }

    private final boolean isEmulatorDetectedInBuildParameters() throws Exception {
        return this.pattern.match(this.buildInfo.getHardware(), "(?=.*goldfish)(?=.*vbox86)(?=.*andy)") || this.pattern.match(this.buildInfo.getFingerprint(), "(?=.*generic)(?=.*unknown)") || this.pattern.match(this.buildInfo.getModel(), "(?=.*sdk)(?=.*Emulator)(?=.*Android SDK built for x86)") || this.pattern.match(this.buildInfo.getManufacturer(), "(?=.*Genymotion)") || this.pattern.match(this.buildInfo.getProduct(), "(?=.*google_sdk)");
    }

    private final boolean isEmulatorDetectedInSystemPropertied() throws Exception {
        return Intrinsics.areEqual(this.systemProperties.get("ro.kernel.qemu"), "1");
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.Emulator;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.enableEmulatorDetectorFeature;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "is_emulator";
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.OnDemandCollector
    public EmulatorModel runCollection() {
        return new EmulatorModel(isEmulatorDetectedInBuildParameters() || isEmulatorDetectedInSystemPropertied());
    }
}
