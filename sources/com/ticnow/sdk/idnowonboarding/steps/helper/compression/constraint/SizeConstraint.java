package com.ticnow.sdk.idnowonboarding.steps.helper.compression.constraint;

import com.ticnow.sdk.idnowonboarding.steps.helper.compression.UtilKt;
import java.io.File;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\r8é6B\r(4\u0012}\nnjG9L͜P.hS2\u000fq{Jř\f$ B{~*\u00020\tgN\u0016h~P`\u000bQ\u0011\u001e\u0016'm<O[xk\u0016'2prO9SoK>xtd\bڶ6\"F\u007fM\u000f(2`\u0010%\u0004sO\u001a\u001cH@\u001fE\u0019!\u0016\u0013(\u001e\u001e>N\fN`uXNH\u001bh\u0001Cs\u000fwIf'\u000e3Sմ\u0019ТX'\u0015Ǹ2*9@O5C&*\u038b\tқ_?\u000bӊBI\u0013l?'YLJɑ8ݼ\u0004\u0014\u001dۀ \u0019kw>\\3T7ϲ)˦ScSִ^4\u0006|\u0014\rj\u0007dͽ)ρ2-\"Ǒۅ\u0012@"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wPCBv4+^fkA\u0012p,\\\u0005+QU\u0018*f[\u0001L!\u000e^\u0017]tz\tnA\u0002xME.\u0015(M\u000bJ>", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wPCBv4+^fkA\u0012p,\\\u0005+QU\u0018*f[\u0001L!\u000e^\u0017]tj\u000fbO3{@;(\u0017\u0002", ";`g\u0013\\3>A\u001d\u0014z", "", "AsT=F0SS", "", ";`g\u0016g,KO(\u0003\u0005g", ";h]\u001eh(EW(\u0013", "uI8\u0016<o/", "7sT?T;B]\"", "7rB.g0LT\u001d~y", "", "7lP4X\rBZ\u0019", "\u001aiPCTuB]b_~e,R", "A`c6f-R", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class SizeConstraint implements Constraint {
    private int iteration;
    private final long maxFileSize;
    private final int maxIteration;
    private final int minQuality;
    private final int stepSize;

    public SizeConstraint(long j2, int i2, int i3, int i4) {
        this.maxFileSize = j2;
        this.stepSize = i2;
        this.maxIteration = i3;
        this.minQuality = i4;
    }

    public /* synthetic */ SizeConstraint(long j2, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, (i5 + 2) - (2 | i5) != 0 ? 10 : i2, (i5 + 4) - (4 | i5) != 0 ? 10 : i3, (i5 + 8) - (i5 | 8) == 0 ? i4 : 10);
    }

    @Override // com.ticnow.sdk.idnowonboarding.steps.helper.compression.constraint.Constraint
    public boolean isSatisfied(File imageFile) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        return imageFile.length() <= this.maxFileSize || this.iteration >= this.maxIteration;
    }

    @Override // com.ticnow.sdk.idnowonboarding.steps.helper.compression.constraint.Constraint
    public File satisfy(File imageFile) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        int i2 = this.iteration + 1;
        this.iteration = i2;
        Integer numValueOf = Integer.valueOf(100 - (i2 * this.stepSize));
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = this.minQuality;
        if (iIntValue < iIntValue2) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue2 = numValueOf.intValue();
        }
        return UtilKt.overWrite$default(imageFile, UtilKt.loadBitmap(imageFile), null, iIntValue2, 4, null);
    }
}
