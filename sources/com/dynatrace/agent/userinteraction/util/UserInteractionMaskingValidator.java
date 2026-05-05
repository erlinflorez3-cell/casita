package com.dynatrace.agent.userinteraction.util;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
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
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00146Ȑ\u0007\"B\u0012\u007f\u0007ln?ӄZ͜f8\u0003SX\u000e$z>d`ҸuEAU(~j\u0015]P\u007fg\u001dM\u000b\u000fQ\u0013\u001e\u0016'otUc~u\u0012=5rsM7eok>)~D\f82P;\"\u0005/\u001fpHX\u0001\tKc\f@3hphWSMM$ \u000fV /!\u0005g|;\u000flӀ>:"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_>\\GB5$,\u0015uEB\u0016c9Jt6KVW\u0014X`xA\u001d\u0014K\nU/\f\u0001hK1D", "", "\nh]6g\u0005", "u(E", "7rE6X>&O'\u0005z]", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7r<.f2>Ru\u0013iZ.", "7rB2V<KS\u0018mzq;`\u0012:u\u000f\u000fwT\u000b'&", "7rC2k;\"\\$\u000f\nE(\u0011\u0013?t", "7rB2V<KS\u0018mzq;m\r/w", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class UserInteractionMaskingValidator {
    private static final Companion Companion = new Companion(null);
    private static final String DT_MASK_TAG = "data-dt-mask";
    private static final int MASK_FOR_BITS = 4080;
    private static final String SR_MASK_TAG = "data-dtrum-mask";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005\"4\u0012\u0006\rnʑ?ӇE{߉^R\u0002)Or\u00024ż_&wCIVj\n0\u000bgN\u0016jEϽ-ŲG\u000f\u000eǝIv:Mmx\f\u0015e˳\u0015ņC3Uڎ\u000eEnyN\u0005N8x\u0603Lڱ\u0005\u001a2ϺǞz\u0002"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_>\\GB5$,\u0015uEB\u0016c9Jt6KVW\u0014X`xA\u001d\u0014K\nU/\f\u0001hK1-\"A'\u0013(R\u0006EqV", "", "\nh]6g\u0005", "u(E", "\u0012SN\u001a4\u001a$M\bZ\\", "", "!QN\u001a4\u001a$M\bZ\\", "\u001b@B\u0018R\r(@\u0013[^M\u001a", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final boolean isSecuredTextInputLayout(View view) {
        if (!isTextInputLayout(view)) {
            return false;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        FrameLayout frameLayout = childAt instanceof FrameLayout ? (FrameLayout) childAt : null;
        if (frameLayout == null) {
            return false;
        }
        int childCount = frameLayout.getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = frameLayout.getChildAt(i2);
            Intrinsics.checkNotNull(childAt2);
            z2 = isSecuredTextView(childAt2) || z2;
        }
        return z2;
    }

    private final boolean isSecuredTextView(View view) {
        if (!(view instanceof TextView)) {
            return false;
        }
        int inputType = ((TextView) view).getInputType() & MASK_FOR_BITS;
        return (inputType == 128 || inputType == 144) || (inputType == 16) || (inputType == 224);
    }

    private final boolean isTextInputLayout(View view) {
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        return Intrinsics.areEqual(view.getClass().getName(), "com.google.android.material.textfield.TextInputLayout") && !(viewGroup != null && viewGroup.getChildCount() == 0);
    }

    public final boolean isMaskedByTag(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return Intrinsics.areEqual(view.getTag(), DT_MASK_TAG) || Intrinsics.areEqual(view.getTag(), SR_MASK_TAG);
    }

    public final boolean isViewMasked(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return isMaskedByTag(view) || isSecuredTextView(view) || isSecuredTextInputLayout(view);
    }
}
