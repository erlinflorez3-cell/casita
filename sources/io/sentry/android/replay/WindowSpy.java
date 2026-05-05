package io.sentry.android.replay;

import android.os.Build;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u000e\u0007nj?2Le^.Zݷ2\u000f\u0002{<řaӗqYП\u0006\u001a,!ITTg̊rJh\u000b\f\u001d\u0014\"\u0011lBH\u0004\u0006\u000e\u0016\u001d@ZomB\u001e\u000fK:xzF\u0005&387(\u00077Z\u0001ϽƺvټGU\u0014\u00146E~@j\u000fS\b(\u0016VY.\b6^}MdP#\u001e\u0011ǅݏ\u0003ݦFX/a6\b[\u0013^V-\u0016\u0005kԅ/P"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u007f@\u007f$?kk+KC", "", "u(E", "2dR<e\u001dBS+\\\u0002Z:\u000b", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "5dc\u0011X*H`\n\u0003zp\n\u0004\u0005=s", "u(;7T=:\u001d z\u0004`uZ\u0010+s\u000e}", "2dR<e\u001dBS+\\\u0002Z:\u000bG.e\u0007(}<\u0010\u0017", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "Eh]1b>\u001fW\u0019\u0006y", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fq\\D\u0001\u001e\u0016\u001d", "5dc$\\5=]+_~^3{", "u(;7T=:\u001d z\u0004`u\n\t0l\u007f&\u000b\na\u001b\u0017Nnc", "Eh]1b>\u001fW\u0019\u0006y\u001d+|\u0010/g{7{", ">t[9J0GR#\u0011", "\u001a`]1e6BRb\u0010~^>Fz3n~2\u000e\u0016", ";`h/X\u000b>Q#\fkb,\u000f", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class WindowSpy {
    public static final WindowSpy INSTANCE = new WindowSpy();
    private static final Lazy decorViewClass$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Class<?>>() { // from class: io.sentry.android.replay.WindowSpy$decorViewClass$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Class<?> invoke() {
            try {
                return Class.forName("com.android.internal.policy.DecorView");
            } catch (Throwable th) {
                String str = "Unexpected exception loading DecorView on API " + Build.VERSION.SDK_INT;
                return null;
            }
        }
    });
    private static final Lazy windowField$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Field>() { // from class: io.sentry.android.replay.WindowSpy$windowField$2
        @Override // kotlin.jvm.functions.Function0
        public final Field invoke() {
            Class decorViewClass = WindowSpy.INSTANCE.getDecorViewClass();
            if (decorViewClass == null) {
                return null;
            }
            try {
                Field declaredField = decorViewClass.getDeclaredField("mWindow");
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException e2) {
                String str = "Unexpected exception retrieving " + decorViewClass + "#mWindow on API " + Build.VERSION.SDK_INT;
                return null;
            }
        }
    });

    private WindowSpy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> getDecorViewClass() {
        return (Class) decorViewClass$delegate.getValue();
    }

    private final Field getWindowField() {
        return (Field) windowField$delegate.getValue();
    }

    public final Window pullWindow(View maybeDecorView) throws IllegalAccessException {
        Field windowField;
        Intrinsics.checkNotNullParameter(maybeDecorView, "maybeDecorView");
        Class<?> decorViewClass = getDecorViewClass();
        if (decorViewClass == null || !decorViewClass.isInstance(maybeDecorView) || (windowField = INSTANCE.getWindowField()) == null) {
            return null;
        }
        Object obj = windowField.get(maybeDecorView);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj;
    }
}
