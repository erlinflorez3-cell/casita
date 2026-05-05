package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: PointerInputTestUtil.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d̉=!4i\bӵLc\u0003\u000bI\u00066\u000b6B\r'4\u0012}\u0007njGNLe^.Zݷ2\u000fy{<$q$yCQU\"}8\tWN}gvJp\u000bK\u000f\f\u001e\u0001j:X]xc\u001a'pPģW3{nm=ntN\u0005N3R>\u007f\u0005\u000f\u001cBH>w+IQ\f 3XphV=S\u000b\u001a \u000bV /\"\ruT6VruB?%\u0013ipV=^^\u0004\u0014ε^\u00175\u0016\u000faL5hSE\u00175S1\u0013b]O\u0003m~M\u0007x'U9Yug6\u0007\nB \u0014Okl#*j\u0015i`:3[UiK^\u001f@w)\nSɝɂ\rͺόL03,t\u001b&}\u0003\u0007k@~\f\u0007^\u0010|q6E1\u00105;9IsacK\u0019|E\f\u0007\u001d\u001eQ\u000b\u001d,DTloE\u001fb\bi1\u007fLmL\\\u001fq=\u001c\u0011!h\b*\u0012A_\u007f]\nWфш$ڛ٦=%'\u0002\u0010_\\>\u0005\u001dxh\u0002szdP$~\u0016e6\u0019\u000ejD\u0013\u0012{RdXZ\u001f]\u001ed\u0007,\u0012A+Ew\u001b0U\u0014\\_\u0001i\u0019Y\u000e\u001a3H~?irq\rg9\r@ck\u0004\u0010\u0010_'\u001aE<p\u0016pfpaRȗۛ'ίĘLl\u0016\u0013\n`f\\!JWqJ>TM)^%H1*RC\r\t\u000egx\u0012\u000fTa2\u0013k4t7\u000b~gYoF\by0\u000bp:-o]e#4n:nD~3\u0007-\u0001.N\u0018RMLz'\u000eU*.\\֝ÑPǽˮ\u0017\u0011\u0005D@\u001fEkZ\u0011}Q{\u0011Oz+x??v0\u007f\b\u0019q\\fpJ]s/\"%b#)\u000ed\u000e\u001ayF)K*Һ#\u0002Lj\u000b\u0003\b;v8+\u0004O\"3\u0003\b\"+6]I-\u001d$z,/Ce\u000eou.\bg'&#iJϺ{(}\u0005i]`:`I\b}n&2n\u001bBvk>٤jC:ؿAka|\u0001XHM9;\u000eh\u0017,;}f]J\u0013\u001e\fD0o*\"M,\u001f\u000f[5\u0013]S\u0016y}Ml\u000bx\u001c\u001a\r\f1\u001d ,?0V\u0006l7;Ҳs\u001d>DAق!j\bԀ8P"}, d2 = {"2nf;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "7c", "", "2ta.g0H\\\u0001\u0003\u0002e0\u000b", "F", "", "G", "6hbAb9BQ\u0015\u0006YZ;x", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001P\u001a<\\MHo2\u001a\u001cFd5\u0010e,$", "7me<^,(d\u0019\fVe3g\u0005=s\u007f6", "", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp$\u0003q:$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u001c\u0003l+Uv4\u001d", ">nX;g,K3*~\u0004m", "Ahi2", "7me<^,(d\u0019\fVe3g\u0005=s\u007f6C#K\"\u0004Wy\u0002", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zpKUY<k\u001c}G\u0018\u001bi\u000e[tw\u000f]J3nQ\u00170\b5XW ,q", "7me<^,(d\u0019\feZ:\u000b", ">nX;g,K3*~\u0004m\u0017x\u0017=", "7me<^,(d\u0019\feZ:\u000bP2U\u0007\rm*`", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zpKUY<k\u001c}G\u0018\u001bi\u000e[tw\u000f]J3nQ\u00170\b5XW\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004ArxJ#c\u0003RQT,5n\u0010h,\\G\u0004\u000f\u001eu\"*h]\u000e\u001b{\\ ]N\bu=,\\k", "7me<^,(d\u0019\feZ:\u000b\t=", ">nX;g,K3*~\u0004m\u0017x\u0017=e\u000e", "", "7me<^,(d\u0019\feZ:\u000b\t=-\u0003\u0018\u0003%r\u0001v", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zpKUY<k\u001c}G\u0018\u001bi\u000e[tw\u000f]J3nQ\u00170\b5XW1O|\u0015\u0015\u001b?noU \u000eQ\u0002 \u007fO)2V])}PLUqso\u0016c&k:Gm~{\u001d$wP;i\rS\u001a\u0002=uuu\u001d}>)", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zpKUY<k\u001c}G\u0018\u001bi\u000e[tw\u000f]J3nQ\u00170\b5XW\"m|\u001d\u0012WEytI vK\b$K&lY", ";ne25@", "2w", "2x", ";ne2G6", "Co", "\u001enX;g,K7\"\n\u000bm\u000fx\u0012.l\u007f5", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PointerInputTestUtilKt {
    public static /* synthetic */ PointerInputChange down$default(long j2, long j3, float f2, float f3, List list, int i2, Object obj) {
        List list2 = list;
        float f4 = f2;
        long j4 = j3;
        if ((2 & i2) != 0) {
            j4 = 0;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            f4 = 0.0f;
        }
        float f5 = (-1) - (((-1) - i2) | ((-1) - 8)) == 0 ? f3 : 0.0f;
        if ((i2 + 16) - (i2 | 16) != 0) {
            list2 = null;
        }
        return down(j2, j4, f4, f5, list2);
    }

    public static final PointerInputChange down(long j2, long j3, float f2, float f3, List<HistoricalChange> list) {
        PointerInputChange pointerInputChange = new PointerInputChange(PointerId.m5365constructorimpl(j2), j3, OffsetKt.Offset(f2, f3), true, 1.0f, j3, OffsetKt.Offset(f2, f3), false, false, 0, 0L, 1536, (DefaultConstructorMarker) null);
        List<HistoricalChange> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            return PointerInputChange.m5374copyOHpmEuE$default(pointerInputChange, 0L, 0L, 0L, false, 0L, 0L, false, 0, list, 0L, 767, null);
        }
        return pointerInputChange;
    }

    public static /* synthetic */ PointerInputChange moveTo$default(PointerInputChange pointerInputChange, long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        return moveTo(pointerInputChange, j2, f2, f3);
    }

    public static final PointerInputChange moveTo(PointerInputChange pointerInputChange, long j2, float f2, float f3) {
        long jM5383getIdJ3iCeTQ = pointerInputChange.m5383getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(jM5383getIdJ3iCeTQ, j2, OffsetKt.Offset(f2, f3), true, 1.0f, uptimeMillis, pointerInputChange.m5385getPositionF1C5BW0(), pressed, false, 0, 0L, 1536, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PointerInputChange moveBy$default(PointerInputChange pointerInputChange, long j2, float f2, float f3, int i2, Object obj) {
        if ((2 & i2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        return moveBy(pointerInputChange, j2, f2, f3);
    }

    public static final PointerInputChange moveBy(PointerInputChange pointerInputChange, long j2, float f2, float f3) {
        long jM5383getIdJ3iCeTQ = pointerInputChange.m5383getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(jM5383getIdJ3iCeTQ, pointerInputChange.getUptimeMillis() + j2, OffsetKt.Offset(Offset.m3937getXimpl(pointerInputChange.m5385getPositionF1C5BW0()) + f2, Offset.m3938getYimpl(pointerInputChange.m5385getPositionF1C5BW0()) + f3), true, 1.0f, uptimeMillis, pointerInputChange.m5385getPositionF1C5BW0(), pressed, false, 0, 0L, 1536, (DefaultConstructorMarker) null);
    }

    public static final PointerInputChange up(PointerInputChange pointerInputChange, long j2) {
        long jM5383getIdJ3iCeTQ = pointerInputChange.m5383getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(jM5383getIdJ3iCeTQ, j2, pointerInputChange.m5385getPositionF1C5BW0(), false, 1.0f, uptimeMillis, pointerInputChange.m5385getPositionF1C5BW0(), pressed, false, 0, 0L, 1536, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: invokeOverAllPasses-H0pRuoY$default, reason: not valid java name */
    public static /* synthetic */ void m5437invokeOverAllPassesH0pRuoY$default(Function3 function3, PointerEvent pointerEvent, long j2, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            j2 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m5436invokeOverAllPassesH0pRuoY(function3, pointerEvent, j2);
    }

    /* JADX INFO: renamed from: invokeOverAllPasses-H0pRuoY, reason: not valid java name */
    public static final void m5436invokeOverAllPassesH0pRuoY(Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> function3, PointerEvent pointerEvent, long j2) {
        m5440invokeOverPasseshUlJWOE(function3, pointerEvent, (List<? extends PointerEventPass>) CollectionsKt.listOf((Object[]) new PointerEventPass[]{PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final}), j2);
    }

    /* JADX INFO: renamed from: invokeOverPass-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m5439invokeOverPasshUlJWOE$default(Function3 function3, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            j2 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m5438invokeOverPasshUlJWOE(function3, pointerEvent, pointerEventPass, j2);
    }

    /* JADX INFO: renamed from: invokeOverPass-hUlJWOE, reason: not valid java name */
    public static final void m5438invokeOverPasshUlJWOE(Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> function3, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        m5440invokeOverPasseshUlJWOE(function3, pointerEvent, (List<? extends PointerEventPass>) CollectionsKt.listOf(pointerEventPass), j2);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m5443invokeOverPasseshUlJWOE$default(Function3 function3, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j2, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            j2 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m5441invokeOverPasseshUlJWOE((Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit>) function3, pointerEvent, pointerEventPassArr, j2);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m5441invokeOverPasseshUlJWOE(Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> function3, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j2) {
        m5440invokeOverPasseshUlJWOE(function3, pointerEvent, (List<? extends PointerEventPass>) ArraysKt.toList(pointerEventPassArr), j2);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m5442invokeOverPasseshUlJWOE$default(Function3 function3, PointerEvent pointerEvent, List list, long j2, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            j2 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m5440invokeOverPasseshUlJWOE((Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit>) function3, pointerEvent, (List<? extends PointerEventPass>) list, j2);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m5440invokeOverPasseshUlJWOE(Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> function3, PointerEvent pointerEvent, List<? extends PointerEventPass> list, long j2) {
        if (pointerEvent.getChanges().isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no changes".toString());
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no passes".toString());
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            function3.invoke(pointerEvent, list.get(i2), IntSize.m6800boximpl(j2));
        }
    }
}
