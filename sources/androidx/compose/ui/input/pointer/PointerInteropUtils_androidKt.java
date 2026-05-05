package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: PointerInteropUtils.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d̉=!,i\bӵLc\u0003\u000bIي8\u000bDB\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000fq~<$i-yCAV2\"0ޛgN\u0016f\u001fP`\u000bQ\u000f\u001e\u0016'k\\Yczu\u001e\u001f4Rom7]qM9\u000fsd\bf݅:h\b\n\u0019\u001aXG8v)I{\u0010 7XphZ=]\u0013\u001c*\u0012N\"\u0011\u001e\u000bk^8Xl\f9]&I݃ƢMϋۢ4~S\u0016T^?=\u0005l6+n6]\u0015SY3\u000b`bW\u0003mym\u0015v)?7Yug6\u0007\u0004$\u0017;O;\\!)#ӤƢ_ϯˏ/QiW^\u0018@0\t\u0007%<2\r.'v4]\u001et\u000f&3#z\u0004P^\u0004vN\u0010|q6E)\u00105;9Ie\u007fdk\u001d\\D\u0014\u0005;,i\u0001ϒ żڍ\u0012b\u001b*b\bΆ1VH@Nݲ&\b<ѐ\b\u0002"}, d2 = {"3l_Al\n:\\\u0017~\u0002F6\f\r9n_9{I\u0010\u0005\u0015Qz\u000e", "", "<nf\u001a\\3EW'", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "Bn2.a*>Z\u0001\t\nb6\u0006h@e\t7i>\u000b\"\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", "=eU@X;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "Bn2.a*>Z\u0001\t\nb6\u0006h@e\t7i>\u000b\"\u0017\u000fnU\u000bv#\u0007=", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA}&hjH\\H\u0013T\u00016NPWuacz\u0007\u0015\"c\f]/\u0017\u000eg\u000b\u0005~M5.\f6RM\u0011,q", "Bn<<g0H\\x\u0010zg;j\u00079p\u007f", "Bn<<g0H\\x\u0010zg;j\u00079p\u007foz\bO\u0017\u0015\u0019S", "1`]0X3", "", "Bn<<g0H\\x\u0010zg;j\u00079p\u007fo\f=i\b)7[", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA}&hjH\\H\u0013T\u00016NPWuacz\u0007\u0015\"c\f]/\u0017\u000eg\u000b\u0005~M5.\f6RM\u0011]D|", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PointerInteropUtils_androidKt {
    /* JADX INFO: renamed from: toMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m5445toMotionEventScoped4ec7I(PointerEvent pointerEvent, long j2, Function1<? super MotionEvent, Unit> function1) {
        m5446toMotionEventScopeubNVwUQ(pointerEvent, j2, function1, false);
    }

    /* JADX INFO: renamed from: toCancelMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m5444toCancelMotionEventScoped4ec7I(PointerEvent pointerEvent, long j2, Function1<? super MotionEvent, Unit> function1) {
        m5446toMotionEventScopeubNVwUQ(pointerEvent, j2, function1, true);
    }

    public static /* synthetic */ void emptyCancelMotionEventScope$default(long j2, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            j2 = SystemClock.uptimeMillis();
        }
        emptyCancelMotionEventScope(j2, function1);
    }

    public static final void emptyCancelMotionEventScope(long j2, Function1<? super MotionEvent, Unit> function1) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j2, j2, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setSource(0);
        function1.invoke(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: toMotionEventScope-ubNVwUQ, reason: not valid java name */
    private static final void m5446toMotionEventScopeubNVwUQ(PointerEvent pointerEvent, long j2, Function1<? super MotionEvent, Unit> function1, boolean z2) {
        MotionEvent motionEvent$ui_release = pointerEvent.getMotionEvent$ui_release();
        if (motionEvent$ui_release == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
        }
        int action = motionEvent$ui_release.getAction();
        if (z2) {
            motionEvent$ui_release.setAction(3);
        }
        motionEvent$ui_release.offsetLocation(-Offset.m3937getXimpl(j2), -Offset.m3938getYimpl(j2));
        function1.invoke(motionEvent$ui_release);
        motionEvent$ui_release.offsetLocation(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2));
        motionEvent$ui_release.setAction(action);
    }
}
