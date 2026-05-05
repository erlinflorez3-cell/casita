package androidx.work.impl;

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
/* JADX INFO: compiled from: WorkDatabaseMigrations.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,u\bDJn\u0015\u0010OيH\u000b\\AUӯ~߽{\u0007nʑY<Re`.\u0001R\u0001Ţ>ڷ8$cҕ\u0012OIV2}P\b&ȡ:̊rJbŏc\u001b\u0014\u0018\u0011jZH,ޏ0ܫ\u00132Jģ_?[rU9\u000fs\rӏrݨ&8\u0002ڎ!&8L(v)B\"ËdضDpBĥ-Y\u0013\u001f*\u0006l\u001fWȩ/ʄR6PǍ}F=)\u001bipM}ۂ\u0003ƊQ\rNÖG\u0019\u0005h6+n6\fՙw٨\u0007\u0007Z¹_\u000fMyU\u0005\u0017&}ǥ\u001cָ[6`Ü4!9X%]!%3ӧ$ԃ\u0010'3Ւ\u0004W^\u0018@w)zcɠV؝\n'P͓M&t\u0013&3#q*ö#ؿbB\bЭˑ:#"}, d2 = {"\u0011Q4\u000eG\f87\u0002]ZQ&gh\u001cIi\u0007u.or\u00046i| ^\u0005", "", "\u0011Q4\u000eG\f8=\tmtH\rvt\u001fOn\u0004u+j}z%c", "\u0011Q4\u000eG\f8@\tgtB\u0015vi\u0019R_\nh*p\u007fu", "\u0011Q4\u000eG\f8A\rli>\u0014vl\u000e_c\u0011\\*", "\u0011Q4\u000eG\f8E\u0003k`X\u0017ir\u0011R_\u0016i", "\u0017M8!<\b%7\u000e^tI\fil\u0019Dy\u0006e0i\u0006v4", "\u001bH6\u001f4\u001b\u001eMteVK\u0014vl\u0018Fi\"j*z\u0005\u000b5^m$p\t\u0014Sa\t\u0018W", "\u001eDA\u0016B\u000b\"1\u0013pdK\u0012vv\u000fTy\u0016Y#`u\u0007.O\b)V\u0011%9k\u000f\u0017L\u0010\n<", " D<\u001cI\f8/\u007fZgF&`q\u0010O", "!DC,7\f\u001f/\teiX\nfq\u001eEh\u0017u0mz\u00116\\q\u001eX\u0005\"G", "!DC,7\f\u001f/\teiX\u0015\\w!Ol\u000eu/t\u0002v", "%NA\u0018F\u0017\u001e1\u0013ZY=&ku\u0013Ga\bh:hr\nAMw%e\u0005\u001eHw~\u0017Tq\"", "%NA\u0018F\u0017\u001e1\u0013ZY=&ku\u0013Ga\bh:p\u0002u#^m6U\u0005\u001c5q", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 2, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class WorkDatabaseMigrationsKt {
    private static final String CREATE_INDEX_PERIOD_START_TIME = "\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ";
    private static final String CREATE_OUT_OF_QUOTA_POLICY = "ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0";
    private static final String CREATE_RUN_IN_FOREGROUND = "ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0";
    private static final String CREATE_SYSTEM_ID_INFO = "\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ";
    private static final String CREATE_WORK_PROGRESS = "\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ";
    private static final String INITIALIZE_PERIOD_COUNTER = "UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0";
    private static final String MIGRATE_ALARM_INFO_TO_SYSTEM_ID_INFO = "\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ";
    private static final String PERIODIC_WORK_SET_SCHEDULE_REQUESTED_AT = "\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ";
    private static final String REMOVE_ALARM_INFO = "DROP TABLE IF EXISTS alarmInfo";
    private static final String SET_DEFAULT_CONTENT_URI_TRIGGERS = "UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL";
    private static final String SET_DEFAULT_NETWORK_TYPE = "UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ";
    private static final String WORKSPEC_ADD_TRIGGER_MAX_CONTENT_DELAY = "ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1";
    private static final String WORKSPEC_ADD_TRIGGER_UPDATE_DELAY = "ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1";
}
