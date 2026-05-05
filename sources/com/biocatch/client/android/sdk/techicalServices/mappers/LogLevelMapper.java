package com.biocatch.client.android.sdk.techicalServices.mappers;

import com.biocatch.android.commonsdk.logging.ELogLevel;
import com.biocatch.client.android.sdk.contract.LogLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lj?ԅD{߉^R\u0002)Op\u00024ż_$\u007fC\u0004a(~:\t}P\u0018k|Mr\u000bq\u0013N\"\u0007oDI\u0004|\u000e\u0016\u001d5Zom5ޢsC"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G/7k\u00192K?BY4+&l_9\u0015-4J\u00022GY\\uC\\t$\u0014#Z\u00156'\u0018\u0010YNy", "", "u(E", ";`_", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\u001bR> {hr9\u000e9", ":de2_", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\u001b(\u0017OaJ\u0007j\u0002", "@de2e;", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class LogLevelMapper {
    public static final LogLevelMapper INSTANCE = new LogLevelMapper();

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LogLevel.values().length];
            iArr[LogLevel.VERBOSE.ordinal()] = 1;
            iArr[LogLevel.DEBUG.ordinal()] = 2;
            iArr[LogLevel.INFO.ordinal()] = 3;
            iArr[LogLevel.WARNING.ordinal()] = 4;
            iArr[LogLevel.ERROR.ordinal()] = 5;
            iArr[LogLevel.CRITICAL.ordinal()] = 6;
            iArr[LogLevel.OFF.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ELogLevel.values().length];
            iArr2[ELogLevel.TRACE.ordinal()] = 1;
            iArr2[ELogLevel.DEBUG.ordinal()] = 2;
            iArr2[ELogLevel.INFO.ordinal()] = 3;
            iArr2[ELogLevel.WARNING.ordinal()] = 4;
            iArr2[ELogLevel.ERROR.ordinal()] = 5;
            iArr2[ELogLevel.CRITICAL.ordinal()] = 6;
            iArr2[ELogLevel.OFF.ordinal()] = 7;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private LogLevelMapper() {
    }

    public final ELogLevel map(LogLevel level) {
        Intrinsics.checkNotNullParameter(level, "level");
        switch (WhenMappings.$EnumSwitchMapping$0[level.ordinal()]) {
            case 1:
                return ELogLevel.TRACE;
            case 2:
                return ELogLevel.DEBUG;
            case 3:
                return ELogLevel.INFO;
            case 4:
                return ELogLevel.WARNING;
            case 5:
                return ELogLevel.ERROR;
            case 6:
                return ELogLevel.CRITICAL;
            case 7:
                return ELogLevel.OFF;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final LogLevel revert(ELogLevel level) {
        Intrinsics.checkNotNullParameter(level, "level");
        switch (WhenMappings.$EnumSwitchMapping$1[level.ordinal()]) {
            case 1:
                return LogLevel.VERBOSE;
            case 2:
                return LogLevel.DEBUG;
            case 3:
                return LogLevel.INFO;
            case 4:
                return LogLevel.WARNING;
            case 5:
                return LogLevel.ERROR;
            case 6:
                return LogLevel.CRITICAL;
            case 7:
                return LogLevel.OFF;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
