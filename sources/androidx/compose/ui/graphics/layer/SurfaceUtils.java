package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
/* JADX INFO: compiled from: LayerSnapshot.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP\u008cZS@\u000fs{:%aӖqYП\u0006\u001a,!ITTg̊rJh\u000b\f\u0013\u0014\u001b\u0011jZK\u001e\u0007k\u0018'2pvo7[wU9\u000f}|\nh@0B\u0012\u0005/!ZL\u001e~\u0013Cy\u0015X1\txH]%O\u001b\u0019@\n\u0005!Q*jhf6vn4ƀ;ݭ\u0007iJ÷wm>\u007fe\u000f\\SU\u0011MѰ*ҋD7=ՖȕW\u000f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7\u0004>ZD7i4\u000e$lhG\\", "", "u(E", "6`b\u001fX;KW\u0019\u0010z]\u0014|\u00182o~", "", ":nR8;(KR+z\b^\nx\u0012@a\u000e\u0010{O\u0004!\u0016", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqc@\u0010\u001a!FE", "7r;<V2!O&}\rZ9|f+n\u0011$\n\u001c\u0012\u0013\u001bNk\u000bCv", ":nR86(Gd\u0015\r", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "Ata3T*>", "\u001a`]1e6BRb\u0010~^>Fv?r\u0001$y@V", ":nR86(Gd\u0015\r[Z3\u0004\u0006+c\u0006", "@db<_=>:#|\u0001A(\n\bAa\r(Y<\n(\u0013UW\u000eKy/4", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SurfaceUtils {
    public static final SurfaceUtils INSTANCE = new SurfaceUtils();
    private static boolean hasRetrievedMethod = false;
    private static Method lockHardwareCanvasMethod = null;

    public final boolean isLockHardwareCanvasAvailable() {
        return true;
    }

    private SurfaceUtils() {
    }

    public final Canvas lockCanvas(Surface surface) {
        return SurfaceVerificationHelper.INSTANCE.lockHardwareCanvas(surface);
    }

    private final Method resolveLockHardwareCanvasMethod() {
        Method declaredMethod;
        synchronized (this) {
            try {
                declaredMethod = lockHardwareCanvasMethod;
                if (!hasRetrievedMethod) {
                    hasRetrievedMethod = true;
                    declaredMethod = Surface.class.getDeclaredMethod("lockHardwareCanvas", new Class[0]);
                    declaredMethod.setAccessible(true);
                    lockHardwareCanvasMethod = declaredMethod;
                }
            } finally {
                declaredMethod = null;
            }
        }
        return declaredMethod;
    }

    private final Canvas lockCanvasFallback(Surface surface) throws IllegalAccessException, InvocationTargetException {
        Method methodResolveLockHardwareCanvasMethod = resolveLockHardwareCanvasMethod();
        if (methodResolveLockHardwareCanvasMethod != null) {
            Object objInvoke = methodResolveLockHardwareCanvasMethod.invoke(surface, new Object[0]);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.graphics.Canvas");
            return (Canvas) objInvoke;
        }
        return surface.lockCanvas(null);
    }
}
