package com.ticnow.sdk.idnowonboarding.onboarding;

import android.content.Intent;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import java.util.TimerTask;
import kotlin.Metadata;
import yg.CX;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u0013\u001d̉=!4i\bӵLc\u0003\u0004IيX\nǞH\u00078ܥBw5e3?>D}H\\S\u001a>ƈo}Ģ(Ӌ"}, d2 = {"9nc9\\5\bQ#\bxn9\n\t8tI\u0017\u007fH\u0001$%-~LKz-5fl\u001cEsTy", "\u001aiPCTuNb\u001d\u0006DM0\u0005\t<T{6\u0002\u0016", "@t]", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class ProcessOnboardingActivity$requestAppPermissions$$inlined$schedule$1 extends TimerTask {
    final /* synthetic */ ProcessOnboardingActivity this$0;

    public ProcessOnboardingActivity$requestAppPermissions$$inlined$schedule$1(ProcessOnboardingActivity processOnboardingActivity) {
        this.this$0 = processOnboardingActivity;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() throws Exception {
        this.this$0.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity$requestAppPermissions$$inlined$schedule$1$lambda$1
            @Override // java.lang.Runnable
            public final void run() {
                ProcessOnboardingActivity.access$getTextViewInitOnboardingStatus$p(this.this$0.this$0).setText("request app permissions");
            }
        });
        Intent intent = new Intent(this.this$0, (Class<?>) RequestPermissionsActivity.class);
        ProcessOnboardingActivity processOnboardingActivity = this.this$0;
        CX.ud();
        processOnboardingActivity.startActivityForResult(intent, IDStepResponseCodes.START_PERMISSION_REQUEST);
    }
}
