package com.facebook.react.devsupport.interfaces;

import android.content.Context;
import android.text.SpannedString;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\r.4ߚ\u007f\u0007tyA0ZeP\u008cZS@\u000fs{:$c$\u007fLCU }*\teNogtJb\u000bY\u000f\u000e\u0016~k2.kތ\u000e\u0012=1znR{x}=Q`#75&@$P{\u001b\u007fH-x\u001a\u0005~[Q\u001c\u0014@@\u001f@\u0001\u0012}\t(\u0019\u001e>N\td\u0001ʄR6Vu&@=-\u001bipYm\u0004x6[\u0019^TU\u000e'e,8X7c#UW\u0011\tj[m\u0006o{K\t\u0001-7-Ys\u0006<\u0007\u0005D\u00199^%]!)\r\t_p$'Y`*oח\u0012(\u0006\rց\fɝǌ\u000e\n/J4LHeۅ\u0012GЀvR"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5!\u001e\u0014EkLi_5M}'T\"", "", "6`]1_,+S\u0018{\u0005q", "", "Bhc9X", "", "AsP0^", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\"-\u0011fg\u001a\u0014_4NL", "3qa<e\u001bR^\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0014+\"rn(\u001bn,$", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'~!\u001f\u0011p\n:v\"?c\u0004iDm\u0012,\\\r:kE,%slC\u0014ruR\u007f6GYO(ZR\u0001\u0007\u0002!V\fT\f\u001a\u0001aAyUBA'Q-E\u007f;e\u000b\u0016\u001cWBjl@eYFy&\u0004Q4sPfnCKJTb7e\b]\u001dj\u0004\u001a1!{&\n|[._?D", "7rA2c6Kbx\bv[3|\b", "", "@d_<e;+S\u0018{\u0005q", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "And?V,.` ", "@d_<e;\u001c]!\n\u0002^;|\b\u0016i\u000e7{I\u0001$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5!\u001e\u0014EkLi_5M}'T\u000b;,g\\\u007fLq\u001cb\u0019U+\u001c\u0005X((|S7(\b9\u001f", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s\u000bO_C\u000f--Jt'DVX2&_r9\u0012!$\rN<\u001b\u0015dL.{S\u0001#\u0011;I\u000f<d~\f$W#yl@\\pTu\u001du\u0017\u0010mBj[CN=NdsR\u001bl!e<\u0010\u000b\u0012{!diL,\nx]\u001bx\u001c\u0007gcE(D7$O{kQPybK>+(Z{\u0005\u0013.Vt9>\u001a\u00043\u0007@wgGp\u0017E^\u0006S\u0019\\L13E\u001a\u001dGVju{>\rO#o\u0017\u000ek5>n)V", " d_<e;\u001c]!\n\u0002^;|\b\u0016i\u000e7{I\u0001$", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface RedBoxHandler {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4\u0012}\u0007lOOӄtev-\u001bc8\u000f\u0004{b%\f*\u007fESW0|P\f\u0016r0w|Nr\u000bq\u00106\u001c\u0007lDKkw\f\u0015UVֈnЀݏMsE;f\u0014d\u0004ڼ6'ف}\u0004"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5!\u001e\u0014EkLi_5M}'T\u000b;,g\\\u007fLq\u001cb\u0019U+\u001c\u0005X((|S7(\b9\u001f", "", "=mA2c6Kbx\f\bh9", "", "AoP;a,=A(\f~g.", "\u001a`]1e6BRb\u000ezq;Fv:a\t1{?n&$Kx\u0010\u0012", "=mA2c6Kb\u0007\u000fx\\,\u000b\u0017", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface ReportCompletedListener {
        void onReportError(SpannedString spannedString);

        void onReportSuccess(SpannedString spannedString);
    }

    void handleRedbox(String str, StackFrame[] stackFrameArr, ErrorType errorType);

    boolean isReportEnabled();

    void reportRedbox(Context context, String str, StackFrame[] stackFrameArr, String str2, ReportCompletedListener reportCompletedListener);
}
