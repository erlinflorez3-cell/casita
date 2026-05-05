package androidx.compose.ui.platform;

import android.os.Build;
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
/* JADX INFO: compiled from: AndroidViewConfiguration.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0019\u007f\u0007lmA0RjP.X\\0\u0014\u0002ڔd$\n#2NKY(}:\t}O˗knX\\[U\u001d\t.x\u00190\u007f*Oى\u0014Ƥ6F\bA9R}C\nr\u0003=\u001d `&nN[Ц\u001cݵL\u0014\u000f|IS\u001a\u0018\u0001R~Cj\r{\u000fPf\\̛\"Ә\"`\u007fP<Szi\u000bA1\u0010\u0002B|1\u0016\u0005Sֈ\u000fТX+%xg,9L\bG#4k\u00035V\u0012\u0014Yӡsݘ\tl?)1Y\u0002]\u0007j\u000e%-+}\u0017\u0014G|د\u0007Ōd\u0010?-UuY\\^:\u0006\u000e\u0014\rj\u000eDZ}ε0ǉ\u001ej \u00109\t\u0001_\u0011\\\u0010^Z\u007f)b\rА'ő7+AӕǁUv"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\u001fQCMI>'\u0016lcI\u0014_;R\u00010\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", "DhTD66GT\u001d\u0001\u000bk(\f\r9n", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\u0006\u0006I\u0002\u001b\u0019W|\nKz/>/", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:YJ\n\u0018\u001bI\u007f\u001b8\u0006)?bSc(", "2nd/_,-O$f~g\u001b\u0001\u0011/M\u0004/\u0003D\u000f", "", "5dc\u0011b<;Z\u0019mvi\u0014\u0001\u0012\u001ei\b(cD\b\u001e\u001bU", "u(9", "2nd/_,-O$m~f,\u0007\u0019>M\u0004/\u0003D\u000f", "5dc\u0011b<;Z\u0019mvi\u001b\u0001\u0011/o\u00107cD\b\u001e\u001bU", "6`]1j9Bb\u001d\b|@,\u000b\u0018?r\u007f\u000f\u007fI\u0001~\u0013Tq\u0012E", "", "5dc\u0015T5=e&\u0003\nb5~j/s\u000f8\t@g\u001b GW\nIx)>", "u(5", "6`]1j9Bb\u001d\b|L3\u0007\u0014", "5dc\u0015T5=e&\u0003\nb5~v6o\u000b", ":n]4C9>a'm~f,\u0007\u0019>M\u0004/\u0003D\u000f", "5dc\u0019b5@>&~\tl\u001b\u0001\u0011/o\u00107cD\b\u001e\u001bU", ";`g6`<F4 \u0003\u0004`\u001d|\u00109c\u00047\u0010", "5dc\u001aT?B[)\u0007[e0\u0006\u000b e\u00072yD\u0010+", "Bnd0[\u001aE]$", "5dc!b<<V\u0007\u0006\u0005i", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidViewConfiguration implements ViewConfiguration {
    public static final int $stable = 8;
    private final android.view.ViewConfiguration viewConfiguration;

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public long getDoubleTapMinTimeMillis() {
        return 40L;
    }

    public AndroidViewConfiguration(android.view.ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public long getLongPressTimeoutMillis() {
        return android.view.ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public long getDoubleTapTimeoutMillis() {
        return android.view.ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public float getTouchSlop() {
        return this.viewConfiguration.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public float getHandwritingSlop() {
        return Build.VERSION.SDK_INT >= 34 ? AndroidViewConfigurationApi34.INSTANCE.getScaledHandwritingSlop(this.viewConfiguration) : super.getHandwritingSlop();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public float getMaximumFlingVelocity() {
        return this.viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public float getHandwritingGestureLineMargin() {
        return Build.VERSION.SDK_INT >= 34 ? AndroidViewConfigurationApi34.INSTANCE.getScaledHandwritingGestureLineMargin(this.viewConfiguration) : super.getHandwritingGestureLineMargin();
    }
}
