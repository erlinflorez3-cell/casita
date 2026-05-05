package androidx.compose.material.ripple;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: Ripple.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!,r\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.XS2\u000f\u0002{<řc$\bCC٥\"}8\tWN}gvJ`\rK\u000f\u001c\u0016\u0001̓DWcxu\u0012=3rsM5eok<'tNC.6:8(\n1\u001e8N(v)J{\u0010 8XphQ=Q\u0013#*\u0006l*1\"jrf6vx\u000eD=0\u001boRP7_^\f{\u001b\rÖބ\fǸҐ\"-FGC&=a\u0011\u0019j[m\u0006ouK\u0018\u0001'U?\u0010swBfÜ,\u0015YNcơt͉`\u0005YӠϲ'0WfQז*Vvߧ\u007f\""}, d2 = {"\u0017rABa5B\\\u001bb\u0004I9|\u001a3e\u0012", "", "1qT.g,\u001a\\\u0018Z\nm(z\f\u001ci\u000b3\u0003@^! Vk\u0012Ev2\u0019Zf 7l\u0016-", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u0019u=-\u0011lj9\u00149", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "1qT.g,)Z\u0015\u000e{h9\u0005u3p\u000b/{)\u000b\u0016\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r\u001c4t\u0016\u0017WB;A", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6Wd1WYL,2", "0nd;W,=", "@`S6h:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DX#8LS9kAs", "@h_=_,\u001aZ$\u0002v", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u0017r?!\u0011>", "1qT.g,)Z\u0015\u000e{h9\u0005u3p\u000b/{)\u000b\u0016\u0017\u000f^l\u001ed1\u0015_", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u0018'$hn5\u0005r0X\u007f\u0015Q\\[*\\(g\u001ez\u000ec\r[5\u0011\u0004l\u000b\"xLB)\u0016,\u0013\u0012?2\u0003\u0019\u0012\u00198nnP mQ\u0001\u001f\u0003,6rEi]yT\u0017,h4s\u0013c&&?K,]r)$f_2\u0014\u0005aZSb\u0003evK#\u0004\u0003y\u0002TWOD|_@s:hI\u0006\u007f\u001d<ftt\u00051M=45dN*g\u001f>`t$(YH'\u000f@;\u0013\u0015", "4h]1A,:`\u0019\r\nO0|\u001b\u0011r\n8\u0007", "7mXA\\(ED\u001d~\r", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", ";`c2e0:Z`\f~i7\u0004\t)r\u007f/{<\u000f\u0017"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Ripple_androidKt {
    private static final boolean IsRunningInPreview = Intrinsics.areEqual(Build.DEVICE, "layoutlib");

    /* JADX INFO: renamed from: createPlatformRippleNode-TDGSqEk, reason: not valid java name */
    public static final DelegatableNode m1768createPlatformRippleNodeTDGSqEk(InteractionSource interactionSource, boolean z2, float f2, ColorProducer colorProducer, Function0<RippleAlpha> function0) {
        return IsRunningInPreview ? new CommonRippleNode(interactionSource, z2, f2, colorProducer, function0, null) : new AndroidRippleNode(interactionSource, z2, f2, colorProducer, function0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RippleContainer createAndAttachRippleContainerIfNeeded(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof RippleContainer) {
                return (RippleContainer) childAt;
            }
        }
        RippleContainer rippleContainer = new RippleContainer(viewGroup.getContext());
        viewGroup.addView(rippleContainer);
        return rippleContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup findNearestViewGroup(View view) {
        Object obj = view;
        while (!(obj instanceof ViewGroup)) {
            ViewParent parent = ((View) obj).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            obj = parent;
        }
        return (ViewGroup) obj;
    }
}
