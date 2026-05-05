package com.dynatrace.android.agent.util;

import kotlin.Metadata;
import yg.InterfaceC1492Gx;

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
@Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,u\bDJk\u0015\u0010OيH\u000b\\AUӳ~߽{\u0007nʑY<Re`.\u0001R\u0001Ŧ>ڷ8$cҕ\u0012OIV2}P\b&ȥ:̊rJbŏc\u001b\u0014\u0018\u0011jZH,ޓ0ܫ\u00132Jģ_?[rU9\u000fs\rӓrݨ&8\u0002ڎ!&8L(v)B\"ÏdضDpBĥ-Y\u0013\u001f*\u0006l\u001fWȭ/ʄR6PǍ}F=)\u001bipM}ۆ\u0003ƊQ\rNÖG\u0019\u0005h6+n6\f՝w٨\u0007\u0007Z¹_\u000fMyU\u0005\u0017&}ǩ\u001cָ[6`ÜЕ\u00194"}, d2 = {"\"@6,6\u0016&;\tg^<\bkl\u0019N", "", "\"@6,?\f /vrt<\u0016dp\u001fNc\u0006W/d\u0001\u007f", "\"@6,8\u001d\u001e<\bx\\>\u0015\\u\u000bTc\u0012d", "\"@6,8\u001d\u001e<\bxYB\u001agd\u001eCb\fd\"", "\"@6,8\u0015+7vab>\u0015k", "\"@6,F\u001b\u001a@\bxhM\u0016g\u0003\u000bG_\u0011j", "\"@6,?\u0010\u001f3vrXE\f", "\"@6,H\u001a\u001e@\u0013bcM\fid\rTc\u0012d", "\"@6,6\u0019\u001aA{xiK\bZn\u000fR", "\"@6,I\u0010\u001eE", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class OneAgentLoggingKt {
    public static final String TAG_COMMUNICATION = "dtxCommunication";
    public static final String TAG_CRASH_TRACKER = "dtxCrashTracker";
    public static final String TAG_ENRICHMENT = "dtxEnrichment";
    public static final String TAG_EVENT_DISPATCHING = "dtxDispatchingEvents";
    public static final String TAG_EVENT_GENERATION = "dtxEventGeneration";
    public static final String TAG_LEGACY_COMMUNICATION = "dtxLegacyCommunication";
    public static final String TAG_LIFECYCLE = "dtxLifecycle";
    public static final String TAG_START_STOP_AGENT = "dtxStartStop";
    public static final String TAG_USER_INTERACTION = "dtxUserInteraction";
    public static final String TAG_VIEW = "dtxViewContext";
}
