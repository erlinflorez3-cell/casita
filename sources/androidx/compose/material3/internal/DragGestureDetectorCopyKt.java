package androidx.compose.material3.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
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
/* JADX INFO: compiled from: DragGestureDetectorCopy.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d̉=!4i\bDJd|\u0004O\u000b8é6B\u0015\"4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yCQU\"}(\nWNugvJ`\rK\u000f\u001c\u0016\u0001jBI]xc\u0013\u00172PxG3coE9fu>\u000562*8\u007f\u0006\u0019y8L(x\u0011By\u0011:0nvjV\u001bT\u001d\u001a@\u000en$\u000f'tg|@x!kEGS\u0013zR]Ud݁\u0001W\u0013Sd-\u0013\u0005q 1F]D%6c\u00125UÜC\rE~M\u000bn57-Oy}Fh\u0002$\u0015Y`;i9̧\u001b՝PӠВ+-UuYc&}\u0006\u000f\u0014\u000fR\u0003<\u000bOH\\3Jj\u0016\u0015Kt![pT\u0010gZ\u007f)kf-3\u000bK=I\u001dvQ\u0010@)PG{3\u0010.%\u0011nOl\u0003\u001a\u0011%)i\u0010]ASP=ve\u001a[Mm2s\u0011\u0018pʹvѓ~\u07fcɨ\u00150\u001d=EtQ?/\u0006\u001aHr\u0003\u001f\u0005\u000f\u0005\u0004m`OX\"\u001d\u001e}*ė\u000bɮֈh\u0007qmbvD-[;l\u0007,\u000b; \u000b\u0018l%3\u0019fO\u0017s1ܔУ\tɘçj9_\u0010y0wGlڨMQ\u0012\u000f8ׯx݀C>j\u0005ffba\u001a[t(P1\u001fН\u0012ȑ\u007fFV\f!2_}*6D1G_kȀ\u0005ٿFA\u0005ȁݣZm\u0018\u0002Zվ@1hˮx,"}, d2 = {"2dU.h3MB#\u000fxa\u001a\u0004\u0013:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", ";nd@X\u001aE]$", ";nd@X\u001bHB#\u000fxa\u001a\u0004\u0013:R{7\u007fJ", "", "/vP6g\u000fH`\u001d\u0014\u0005g;x\u0010\u001ao\u00041\u000b@\u000e\u0005\u001eQzwIT!>W}'>i%2WL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002", ">nX;g,K7\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018\u001dj", ">nX;g,KB-\nz", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x#2 h7", "=m?<\\5MS&l\u0002h7i\t+c\u0003(z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1gP;Z,", "=uT?F3H^", "", "/vP6g\u000fH`\u001d\u0014\u0005g;x\u0010\u001ao\u00041\u000b@\u000e\u0005\u001eQzwIT!>W}'>i%2WL\u0003m\u0013|\u001cGh\u0019", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7q@IGJV>\"\u001ewaFft,W\u0006\u0015EVY,27V$\u001a\u001ci\u0015R4V\njImoT@\u001d\u00170S\u000bI2a\u001c\u001f\fDnzK#e.\u007f\u001f\u0005H-q\u0010Wi\u0007QQTf3d\u001a)zfCI(\u001d\u0002\u0015*lZ7_?:\u0016ncu1nC\"|\u0002\u000e;r[DTE", "/vP6g\u0017HW\"\u000ezk\u001a\u0004\u0013:O\r\u0006wI~\u0017\u001eNk\u001d@\u0001.", "5dc\u0011e(@2\u001d\fz\\;\u0001\u00138V{/\f@", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "/vP6g\u0017HW\"\u000ezk\u001a\u0004\u0013:O\r\u0006wI~\u0017\u001eNk\u001d@\u0001.|d\u0007q\u0017L\n\u0016", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7q@IGJV>\"\u001ewaFft,W\u0006\u0015EVY,27V$\u001a\u001ci\u0015R4V\njImoT@\u001d\u00170S\u000bI2a\u001c\u001f\fDnzK#e.\u007f\u001f\u0005H-q\u0010^p\u0002\u0011BUk(s\u0010i&j\u0004\u001b4\u001do(\u001frYy_bY\u001b\u0002Y}p1E#\bB4MqdFS93F}6#T\fs!6b}\u00018\u0014\t0;2.\fGp\u001a\bHu\u001a,ZP|", "7r?<\\5MS&n\u0006", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", "7r?<\\5MS&n\u0006&\u000b\u0005zyfL:", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA}&hjH\\HoC", ">nX;g,KA \t\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", ">nX;g,KA \t\u0006&\fOv\u001aZ`\u0014", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~J\u0002 IK 7NG={A\u001a$lkB\\Go/", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DragGestureDetectorCopyKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r4.isConsumed() == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0126 -> B:12:0x0045). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x013f -> B:56:0x0148). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0141 -> B:56:0x0148). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m2911awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope r11, long r12, int r14, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r15, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r16) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.DragGestureDetectorCopyKt.m2911awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: awaitPointerSlopOrCancellation-pn7EDYM, reason: not valid java name */
    private static final Object m2912awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope awaitPointerEventScope, long j2, int i2, Function2<? super PointerInputChange, ? super Float, Unit> function2, Function1<? super Offset, Float> function1, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (m2913isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
            return null;
        }
        float fM2914pointerSlopE8SPZFQ = m2914pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i2);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j2;
        float fFloatValue = 0.0f;
        while (true) {
            int i3 = 0;
            InlineMarker.mark(0);
            Object objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            InlineMarker.mark(1);
            PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            while (true) {
                if (i3 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i3);
                if (Boolean.valueOf(PointerId.m5367equalsimpl0(pointerInputChange.m5383getIdJ3iCeTQ(), longRef.element)).booleanValue()) {
                    break;
                }
                i3++;
            }
            Intrinsics.checkNotNull(pointerInputChange);
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i4);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i4++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                longRef.element = pointerInputChange4.m5383getIdJ3iCeTQ();
            } else {
                fFloatValue += function1.invoke(Offset.m3926boximpl(pointerInputChange3.m5385getPositionF1C5BW0())).floatValue() - function1.invoke(Offset.m3926boximpl(pointerInputChange3.m5386getPreviousPositionF1C5BW0())).floatValue();
                if (Math.abs(fFloatValue) < fM2914pointerSlopE8SPZFQ) {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    InlineMarker.mark(0);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
                    InlineMarker.mark(1);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                } else {
                    function2.invoke(pointerInputChange3, Float.valueOf(fFloatValue - (Math.signum(fFloatValue) * fM2914pointerSlopE8SPZFQ)));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    fFloatValue = 0.0f;
                }
            }
        }
    }

    /* JADX INFO: renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    private static final boolean m2913isPointerUpDmW0f2w(PointerEvent pointerEvent, long j2) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i2);
            if (PointerId.m5367equalsimpl0(pointerInputChange.m5383getIdJ3iCeTQ(), j2)) {
                break;
            }
            i2++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z2 = true;
        }
        return true ^ z2;
    }

    /* JADX INFO: renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m2914pointerSlopE8SPZFQ(ViewConfiguration viewConfiguration, int i2) {
        return PointerType.m5457equalsimpl0(i2, PointerType.Companion.m5462getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }

    static {
        float fM6638constructorimpl = Dp.m6638constructorimpl((float) 0.125d);
        mouseSlop = fM6638constructorimpl;
        float fM6638constructorimpl2 = Dp.m6638constructorimpl(18);
        defaultTouchSlop = fM6638constructorimpl2;
        mouseToTouchSlopRatio = fM6638constructorimpl / fM6638constructorimpl2;
    }
}
