package androidx.customview.poolingcontainer;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import java.util.Iterator;
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
/* JADX INFO: compiled from: PoolingContainer.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d̉=!,o\bDJc|\u0004O\u000f8é6B\u0015\"4\u0012}\nnjO0LeN/ZS8\u000fsڔ<$q$yCAU\"}8\tWNmg\u0007\\h\u0018[\u000f4$!jZM\u0006|k!'2p\u007f\u00068ewKJxtd\u0013H2P<\u0012\r\u000f,BH>\u0005#Cy\u001f*BN\u0005RR;[-\u001a@\nn$\u000f-tg|F\u000fq}F=݊\u001bipM}ۂ2ƊQ\rNÖG\u0019\u0005a6+n6\fՙ'٨\u0007\u0007Z¹_)MtU\u0005\u0017)O+ww\b:f\u0001,\u0015YQC\"1j3ӫ]ԃ\u00101CQiN^\u0013Hy\u0001\u0002\u001bC$!\u0014/`.[\u001c\u000f\b<7+7ՂDT\u001a`H\b\tfV-3\tK+g%\u000fQ\u0010?O\u000f\u000eީ\u0007ڟ\"'\u0019p'fb\u001aה\u00190"}, d2 = {"\u0017r?<b3B\\\u001b\\\u0005g;x\r8e\r\u0017wB", "", "\u001en^9\\5@1#\b\nZ0\u0006\t<L\u00046\u000b@\n\u0017$*y\u0015;v2$U\u007f", "D`[BX", "", "7r?<b3B\\\u001b\\\u0005g;x\r8e\r", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q\u0004u", "Adc\u001db6EW\"\u0001Xh5\f\u00053n\u007f5", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q5D\b", "7rF6g/B\\\u0004\t\u0005e0\u0006\u000b\ro\t7wD\n\u0017$", ">n^9\\5@1#\b\nZ0\u0006\t<L\u00046\u000b@\n\u0017$*y\u0015;v2", "\u001a`]1e6BR,Hxn:\f\u00137v\u0004(\u000e\n\f!!Ns\u0017>t/>hy$@m#w8MEr8'\u0017FkB\u0016_0Wv4.P\\;\\[rJv\u001ca\rN8b", "5dc\u001db6EW\"\u0001Xh5\f\u00053n\u007f5bD\u000f&\u0017Po\u001b\u001f\u0001,4Y\u000b", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q\u0004g\u0013 F|\u0018@u8~W\u000e.Fw\u001e?QCM5?(\u001foeB\ta6W\u0006#KUN9&=|G\u001b\u0016c\u0010,5\u0016\u0014UE-nQ\u001e#\u0016;I\u000b;uc\u0016\u001d\r5wF", "/cS\u001db6EW\"\u0001Xh5\f\u00053n\u007f5bD\u000f&\u0017Po\u001b", "", ":hbAX5>`", "\u001a`]1e6BR,Hxn:\f\u00137v\u0004(\u000e\n\f!!Ns\u0017>t/>hy$@m#w8MEr8'\u0017FkB\u0016_0Wv4.P\\;\\[rJi", "1`[9C6HZ\u001d\b|<6\u0006\u0018+i\t(\t*\n\u0004\u0017No\nJv", "1`[9C6HZ\u001d\b|<6\u0006\u0018+i\t(\t*\n\u0004\u0017No\nJv\u0006?f[#;t\u0015;ML", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "@d\\<i,)]#\u0006~g.Z\u00138t{,\u0005@\u000e}\u001bU~\u000eEv2", "1tbAb4OW\u0019\u0011Bi6\u0007\u00103n\u0002&\u0006I\u0010\u0013\u001bPo\u001b6\u0004%<Yy.7"}, k = 2, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class PoolingContainer {
    private static final int PoolingContainerListenerHolderTag = R.id.pooling_container_listener_holder_tag;
    private static final int IsPoolingContainerTag = R.id.is_pooling_container_tag;

    public static final void addPoolingContainerListener(View view, PoolingContainerListener listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getPoolingContainerListenerHolder(view).addListener(listener);
    }

    public static final void removePoolingContainerListener(View view, PoolingContainerListener listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getPoolingContainerListenerHolder(view).removeListener(listener);
    }

    public static final boolean isPoolingContainer(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(IsPoolingContainerTag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void setPoolingContainer(View view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(IsPoolingContainerTag, Boolean.valueOf(z2));
    }

    public static final boolean isWithinPoolingContainer(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        for (Object obj : ViewKt.getAncestors(view)) {
            if ((obj instanceof View) && isPoolingContainer((View) obj)) {
                return true;
            }
        }
        return false;
    }

    public static final void callPoolingContainerOnRelease(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Iterator<View> it = ViewKt.getAllViews(view).iterator();
        while (it.hasNext()) {
            getPoolingContainerListenerHolder(it.next()).onRelease();
        }
    }

    public static final void callPoolingContainerOnReleaseForChildren(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Iterator<View> it = ViewGroupKt.getChildren(viewGroup).iterator();
        while (it.hasNext()) {
            getPoolingContainerListenerHolder(it.next()).onRelease();
        }
    }

    private static final PoolingContainerListenerHolder getPoolingContainerListenerHolder(View view) {
        int i2 = PoolingContainerListenerHolderTag;
        PoolingContainerListenerHolder poolingContainerListenerHolder = (PoolingContainerListenerHolder) view.getTag(i2);
        if (poolingContainerListenerHolder != null) {
            return poolingContainerListenerHolder;
        }
        PoolingContainerListenerHolder poolingContainerListenerHolder2 = new PoolingContainerListenerHolder();
        view.setTag(i2, poolingContainerListenerHolder2);
        return poolingContainerListenerHolder2;
    }
}
