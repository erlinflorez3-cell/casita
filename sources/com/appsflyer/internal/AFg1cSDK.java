package com.appsflyer.internal;

import androidx.exifinterface.media.ExifInterface;
import com.braze.configuration.BrazeConfigurationProvider;
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
@Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u000eRLc\u0003\u0010I\u0006604ȗ}8ܥB}\u0017hz9^Ǐ\u0014GnaY*\u001fo\n5<[Rqٴ?W \u007f0\f `um\u0007J\t\u000by\u0014\\ǥz̶0M]zc\u0016\u001d7+oE:6oC?It<\r\t2(Ab\u0005\u0007$\u0013H\u0016\u0002cCQ\u0018z0F}#R\u0013[m\u001a\u0018\u0015' \u0007.EgTG1lcL\u0018#\t|+N-s\u0019|S\"/T-#_a$B)7;-\u000eS\t ;[E\u001d(qC Q'-G2s]SA\u007f\u001a3\u0014O\u0013|[&b%:`\u0012H\u0014Oim9\u000e.\u001bc{\u0013`l\u000e\fL1.3@O\b\u0014Z"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0010\bt\u0013\u0014?S", "", "", ">/", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u00114", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "\u000fE01E,OS\"\u000fz=(\f\u0005", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "5dc\u001fX=>\\)~", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "1n\\=b5>\\(J", "1n\\=b5>\\(L", "1n\\=b5>\\(K", "1n\\=b5>\\(M", "/qT\u000e_3\u001fW\u0019\u0006yl\u001dx\u00103d", "1n_F", "1n_FW,?O)\u0006\n", "3pd._:", "BnBAe0GU", "6`b566=S", "\u000fE8;47I3*~\u0004m\u0017x\u0016+m\u007f7{Mi\u0013\u001fG", "\u000fE:2l:M]&~lk(\b\u0014/r", "\u000fE8;47I3*~\u0004m\u001b\u0011\u0014/", "@dV6f;>`v\u0006~^5\f", "\u000fE;<Z.>`", "7", ExifInterface.GPS_MEASUREMENT_3D, ExifInterface.GPS_MEASUREMENT_2D, "/eA\u0011?6@", "Cma2Z0Lb\u0019\fXe0|\u0012>", ExifInterface.LONGITUDE_EAST, "/e8;Y6%]\u001b", "D", "/e4?e6K:#\u0001", "/e32U<@:#\u0001", "4na0X", "/eE2e)Ha\u0019e\u0005`", "/e;<Z\rH`\u0017~", "/eF.e5%]\u001b", "/e4?e6K:#\u0001[h9\\\u001c-M{1wB\u0001$\u0001Pv\""}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public enum AFg1cSDK {
    SDK_LIFECYCLE("SDK Lifecycle"),
    PRIVACY_SANDBOX("Privacy Sandbox"),
    PLAY_INTEGRITY_API("Play Integrity Api"),
    OTHER("Other"),
    HTTP_CLIENT("HTTP Client"),
    QUEUE("Queue"),
    CACHE("Cache"),
    PREFERENCES("Preferences"),
    REMOTE_CONTROL("CFG"),
    DDL("DDL"),
    REFERRER("Referrer"),
    META_REFERRER("Meta Referrer"),
    SAMSUNG_PRELOAD_REFERRER("Samsung Preload Referrer"),
    ADVERTISING_ID("Advertising Id"),
    CROSS_PROMOTION("Cross Promotion"),
    EXCEPTION_MANAGER("Exception Manager"),
    ATTRIBUTION("Attribution"),
    RD("RD"),
    ENGAGEMENT("Engagement"),
    ANTI_FRAUD("Anti Fraud"),
    PUBLIC_API("Public API"),
    AD_REVENUE("Ad Revenue"),
    SDK_SETTERS("Setter"),
    PREDICT("Predict"),
    DEVICE_DATA("Device Data"),
    SECURITY("Security"),
    GENERAL(BrazeConfigurationProvider.DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE),
    PREINSTALL("Preinstall"),
    UNINSTALL("Uninstall"),
    PURCHASE_VALIDATION("Purchase Validation"),
    DMA("DMA"),
    PROXY("PROXY"),
    AF_EXECUTOR("AF Executor"),
    APP_SET_ID("App set ID");

    final String getCurrencyIso4217Code;

    AFg1cSDK(String str) {
        this.getCurrencyIso4217Code = str;
    }
}
