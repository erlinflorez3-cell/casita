package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: SelectionGestures.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d̉=!,o\bӵLc\u0003\rI\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nʑA0ZeP.XS2\u000f\u0002{<$a$yCIU\"Ԃ*\teNo˧vJp\u000bK\u000f\f\u0018\u0001jBI]xc\u0012\u00172XoG\u074cUoS9ht<\u000b(288\u0002ڎ\u001988L(v)D{\u0010 5XphX=Q\u0013!*\u0006l(1\"jpf6vt$:G3\u0011sZNUaX|{\u0018\rÙe˼za,7X_C\"=S1\u0015z[m\u000eouK\u0014\u0001'U;yweGp\u007fB'[S\u001bp\u000b&\u000b\u0007\u0018ӣJˏ/Oq_h66\r\u0013{;J,\u000e42x2;)~\b<C%vaQh\u0002\rT0~oI/%.5qݐYƻUaI-fQ\n\u001b%\u001eQ\u0018\u0017!\nk>d#3lw\u007fA\u0002DKaf\n\bW4Վ\t\u0003\u0010E\u001c0u\u000eW{?JG)EsQ#O{2LR\u0001\u000f\u0005\u000f\u0003\u001a֠\u0011͕D\"|3OJ\u0017*rD\u0013\u0013\u0014P\u0003c\\\u0015[+l\u0007,\"C$j\u000bT!S\u0012\u0015л'ȬnMk)=OtWqn\u001a\u001c\u007f9\r>eUq\u001fyR%.o@p&pfpURȚ\u001b͈&2V\n(\u0018\nff\fA@gqJ?\\5'k-H18rE\u000b*wZ\u0017\u0012Eԡqʗ\u0007i2\u0014!\u001f^\u007f\to\u0016\u0010q,+wR=OuM%6W2hb}3\t\u000fs.U\u0016q\u000eƂ\r\"\u0004ɝ\u0014 D\u0019\u0010֚\u0002ˮ\u0017\u000f\u0007ǻR\u0018;Edr\u0014Ru\u0012U|38e\u0091j\u05cek\f\u0003r2`xM\u05cbX="}, d2 = {"!S0!<\n89xr", "", "7r??X*Ba\u0019i\u0005b5\f\t<", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA}&hjH\\'!", "2hbAT5<S|\rih3|\u0016+b\u0007(", "DhTD66GT\u001d\u0001\u000bk(\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", "1gP;Z,\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "1gP;Z,\u000b", "/vP6g\u000bHe\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7q@IGJV>\"\u001ewaFft,W\u0006\u0015EVY,29xG#\u0019^\u0017\u0018)\u0017\u0012cQ3rM7-Q\nS\u000bJl\n\u001c\u0012\u001d9ty\u0018\u001avLu&q\u000b0dO[)cDFE`9:", ";nd@X\u001a>Z\u0019|\nb6\u0006", "", "=ab2e=>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g|rqG\u0007Q,Uv%VPX5FO\u0001=!#Z\u001b$", "1kX0^:\u001c])\b\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=groe7\rq\nX\u00070VL[\u0002", "2nf;", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7q@IGJV>\"\u001ewaFft,W\u0006\u0015EVY,29nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\t6Y\u000b:d\u0010\u0010 \u0017~ypUeYUy\u001cu?8lPb)aQQSb\u0018d\u0013_\u001bk>D-}n'\u001bua.\u0017Q:\r{Q\u0007qkF,D6.FxeTE9VF\u00050\u001eG\u000b{\u001c;\"\u0004+\b<MB*=d\u0003Zk\"G(V\u001c0ZG5\u0004@L\u001cNKpKS:\u0017g,k\f\ru~/#mpmV\u000fPm\u001b%9jj\u0011F\u001c\u0011HMx$'SH-e}\u001e\u0018\u00071MvIL**g zS)c\u001aL\u0001p%&>%Ab\u000fvs=AV\"\rqH\b\u000b]M\u001eF\fvrG\u0004W!v ?zZ3\u001e8K:\u0006(", ";nd@X\u001a>Z\u0019|\nb6\u0006e>fL", "Ad[2V;B]\"`zl;\r\u0016/I\t3\fO", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", ";nd@X\u001a>Z\u0019|\nb6\u0006r,s\u007f5\r@\u000e", "BdgA79:U\u0003{\t^9\u000e\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=,P7m\u001e\u001b#hnJ\u0007p\u0002", "Ad[2V;B]\"`zl;\r\u0016/P\n,\u0005O\u0001$zPz\u001eKS46&", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHta6Yv|.HW+i\\v<'[X\u0018V6\u0017\u0013Y\u000b%xT@\u001e\u0004;M\fD2\u0010\f)\u001d~xpIV\u000eV}\u001f~\u000b\u0011rVg_gGHE`9h\u0016h\u0007YH:1%q&pOL7\t\t]\u0015qeCeqO$\u0005F$\bneVNnQKx1(\u0015\u000bw%A\"c+\b<bA&8N\u0002Yg%O^\u0006j\u0013bK6-:E\\=Up\u007f|M\u0012q\u001foQkl>@\u001dnu_W\u0013\u0011fl\u001f\u001cf[\u00123\u001c\r:Rq^\u0011C\u0004BY\tj", "Bnd0[\u001a>Z\u0019|\nb6\u0006", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7q@IGJV>\"\u001ewaFft,W\u0006\u0015EVY,29nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\t6Y\u000b:d\u0010\u0010 \u0017~ypUeY6y(\u0005 6dHC\\\bGNVb7:r[&[GD(\u0013\u0005b\u0019rX9\u0014\nSZ\u0003VCkpR)\n\u0002/HqdUE|\u001f'~+(Z{\u0005qCX}:J\u0014\n>9=h\u000e\u0015e\"Kh\t$0eA5o\u0014F\u001cNOl\u0006hM\u0012r(7Ktg1B\u0015/l_Q\u0011PG\u0014`5_nV", "Bnd0[\u001a>Z\u0019|\nb6\u0006i3r\u000e7fM\u0001%%", "2nf;8=>\\(", "Bnd0[\u001a>Z\u0019|\nb6\u0006v?b\u000e(\bP\u0001 &2|\u000eJ\u0005", "CoS.g,,S ~xm0\u0007\u0012\u001eo\u0010&~(\u000b\u0016\u0017", "CoS.g,-])|}F6{\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SelectionGesturesKt {
    private static final int STATIC_KEY = 8675309;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1, reason: invalid class name */
    /* JADX INFO: compiled from: SelectionGestures.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u0018\u000b\u0013\r\f\u001e\u0014\u001b\u001b[\u0002\u0015\u001d\u0017\u0016(\u001e%%~\u001e-/1/#2\u000b5", f = " 17/,<053\u000b(5551#0i&.", i = {0}, l = {TypedValues.CycleType.TYPE_WAVE_PHASE}, m = "0G2;G\u0018DME", n = {"\u0013jjOe\u001aC^7CZ\u000eFQ-"}, s = {"xQ^"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.awaitDown(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SelectionGestures.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u0018\u000b\u0013\r\f\u001e\u0014\u001b\u001b[\u0002\u0015\u001d\u0017\u0016(\u001e%%~\u001e-/1/#2\u000b5", f = " 17/,<053\u000b(5551#0i&.", i = {0, 0, 1, 1}, l = {158, 181}, m = "<?FE8':B<;MCJJ", n = {"\u0013jjOe\u001aOVKMK\u001d<F$)' 1\u0015", "^XuKdlGY", "\u0013jjOe\u001aOVKMK\u001d<F$)' 1\u0015", "^XuKdlGY"}, s = {"xQ^", "xQ_", "xQ^", "xQ_"})
    static final class C05741 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C05741(Continuation<? super C05741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return SelectionGesturesKt.mouseSelection(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelectionBtf2$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SelectionGestures.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u0018\u000b\u0013\r\f\u001e\u0014\u001b\u001b[\u0002\u0015\u001d\u0017\u0016(\u001e%%~\u001e-/1/#2\u000b5", f = " 17/,<053\u000b(5551#0i&.", i = {0, 0, 1, 1}, l = {351, 377}, m = "<?FE8':B<;MCJJ\u001fRE\u0012", n = {"\u0013jjOe\u001aOVKMK\u001d<F$)' 1\u0015s+\r\\", "^XuKdlGY", "\u0013jjOe\u001aOVKMK\u001d<F$)' 1\u0015s+\r\\", "^XuKdlGY"}, s = {"xQ^", "xQ_", "xQ^", "xQ_"})
    static final class C05751 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C05751(Continuation<? super C05751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return SelectionGesturesKt.mouseSelectionBtf2(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SelectionGestures.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u0018\u000b\u0013\r\f\u001e\u0014\u001b\u001b[\u0002\u0015\u001d\u0017\u0016(\u001e%%~\u001e-/1/#2\u000b5", f = " 17/,<053\u000b(5551#0i&.", i = {0, 0, 0, 1, 1}, l = {124, 128}, m = "C?F5;':B<;MCJJ", n = {"\u0013jjOe\u001aVVK=N\u001d<F$)' 1\u0015", "^XuKdlGY", "U_tYf:Q^D", "\u0013jjOe\u001aVVK=N\u001d<F$)' 1\u0015", "^XuKdlGY"}, s = {"xQ^", "xQ_", "xQ`", "xQ^", "xQ_"})
    static final class C05771 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C05771(Continuation<? super C05771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.touchSelection(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SelectionGestures.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u0018\u000b\u0013\r\f\u001e\u0014\u001b\u001b[\u0002\u0015\u001d\u0017\u0016(\u001e%%~\u001e-/1/#2\u000b5", f = " 17/,<053\u000b(5551#0i&.", i = {0, 0, 0, 1, 1}, l = {238, 241}, m = "C?F5;':B<;MCJJ#GQSU2UIXY", n = {"\u0013jjOe\u001aVVK=N\u001d<F$)' 1\u0015w \u0019\u001e\u000bj\u0019g\u0002\n", "^XuKdlGY", "U_tYf:Q^D", "\u0013jjOe\u001aVVK=N\u001d<F$)' 1\u0015w \u0019\u001e\u000bj\u0019g\u0002\n", "^XuKdlGY"}, s = {"xQ^", "xQ_", "xQ`", "xQ^", "xQ_"})
    static final class C05791 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C05791(Continuation<? super C05791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return SelectionGesturesKt.touchSelectionFirstPress(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SelectionGestures.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u0018\u000b\u0013\r\f\u001e\u0014\u001b\u001b[\u0002\u0015\u001d\u0017\u0016(\u001e%%~\u001e-/1/#2\u000b5", f = " 17/,<053\u000b(5551#0i&.", i = {0, 0, 0, 0, 0, 1, 1}, l = {276, 315}, m = "C?F5;':B<;MCJJ0SASFSXISZ7ZN]^", n = {"\u0013jjOe\u001aVVK=N\u001d<F$)' 1\u0015\u0005,\t\u001e{\f\u001cg|\u000bRxXiv", "^XuKdlGY", "U_tYf:Q^D", "^lgXEbQW", "_ekTf[T0:", "\u0013jjOe\u001aVVK=N\u001d<F$)' 1\u0015\u0005,\t\u001e{\f\u001cg|\u000bRxXiv", "^XuKdlGY"}, s = {"xQ^", "xQ_", "xQ`", "xQa", "vQ^", "xQ^", "xQ_"})
    static final class C05801 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C05801(Continuation<? super C05801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return SelectionGesturesKt.touchSelectionSubsequentPress(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SelectionGestures.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u0018\u000b\u0013\r\f\u001e\u0014\u001b\u001b[\u0002\u0015\u001d\u0017\u0016(\u001e%%~\u001e-/1/#2\u000b5e84)';-\u001c/710B8??&BI8>$G=?~\r", f = " 17/,<053\u000b(5551#0i&.", i = {}, l = {91}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C05811 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $updateTouchMode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05811(Function1<? super Boolean, Unit> function1, Continuation<? super C05811> continuation) {
            super(2, continuation);
            this.$updateTouchMode = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C05811 c05811 = new C05811(this.$updateTouchMode, continuation);
            c05811.L$0 = obj;
            return c05811;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((C05811) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: SelectionGestures.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u0018\u000b\u0013\r\f\u001e\u0014\u001b\u001b[\u0002\u0015\u001d\u0017\u0016(\u001e%%~\u001e-/1/#2\u000b5e84)';-\u001c/710B8??&BI8>$G=?~\r\u0001\u000f", f = " 17/,<053\u000b(5551#0i&.", i = {0}, l = {93}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aC^7CZ\u001aFC-:\u0018)\u0007\u001d\u0017%\u001b}y\n\u0017g"}, s = {"xQ^"})
        static final class C00651 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Boolean, Unit> $updateTouchMode;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00651(Function1<? super Boolean, Unit> function1, Continuation<? super C00651> continuation) {
                super(2, continuation);
                this.$updateTouchMode = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00651 c00651 = new C00651(this.$updateTouchMode, continuation);
                c00651.L$0 = obj;
                return c00651;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((C00651) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x002f -> B:6:0x0012). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r0 = r5.label
                    r3 = 1
                    if (r0 == 0) goto L32
                    if (r0 != r3) goto L3a
                    java.lang.Object r2 = r5.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
                    kotlin.ResultKt.throwOnFailure(r6)
                L12:
                    androidx.compose.ui.input.pointer.PointerEvent r6 = (androidx.compose.ui.input.pointer.PointerEvent) r6
                    kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r1 = r5.$updateTouchMode
                    boolean r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r6)
                    r0 = r0 ^ r3
                    java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                    r1.invoke(r0)
                L22:
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                    r0 = r5
                    kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                    r5.L$0 = r2
                    r5.label = r3
                    java.lang.Object r6 = r2.awaitPointerEvent(r1, r0)
                    if (r6 != r4) goto L12
                    return r4
                L32:
                    kotlin.ResultKt.throwOnFailure(r6)
                    java.lang.Object r2 = r5.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
                    goto L22
                L3a:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.C05811.C00651.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (((PointerInputScope) this.L$0).awaitPointerEventScope(new C00651(this.$updateTouchMode, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Modifier updateSelectionTouchMode(Modifier modifier, Function1<? super Boolean, Unit> function1) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, Integer.valueOf(STATIC_KEY), new C05811(function1, null));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SelectionGestures.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u0018\u000b\u0013\r\f\u001e\u0014\u001b\u001b[\u0002\u0015\u001d\u0017\u0016(\u001e%%~\u001e-/1/#2\u000b5e6)1+*<299\u00132ACEC7\u001cBEKK{\n", f = " 17/,<053\u000b(5551#0i&.", i = {}, l = {104}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C05761 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
        final /* synthetic */ TextDragObserver $textDragObserver;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05761(MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, Continuation<? super C05761> continuation) {
            super(2, continuation);
            this.$mouseSelectionObserver = mouseSelectionObserver;
            this.$textDragObserver = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C05761 c05761 = new C05761(this.$mouseSelectionObserver, this.$textDragObserver, continuation);
            c05761.L$0 = obj;
            return c05761;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((C05761) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                ClicksCounter clicksCounter = new ClicksCounter(pointerInputScope.getViewConfiguration());
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, new C00641(this.$mouseSelectionObserver, clicksCounter, this.$textDragObserver, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: SelectionGestures.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u0018\u000b\u0013\r\f\u001e\u0014\u001b\u001b[\u0002\u0015\u001d\u0017\u0016(\u001e%%~\u001e-/1/#2\u000b5e6)1+*<299\u00132ACEC7\u001cBEKK{\n}\f", f = " 17/,<053\u000b(5551#0i&.", i = {0}, l = {105, 111, 113}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aC^7CZ\u000f8='\r\u0018*6\u001c$\u001c"}, s = {"xQ^"})
        static final class C00641 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ClicksCounter $clicksCounter;
            final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
            final /* synthetic */ TextDragObserver $textDragObserver;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00641(MouseSelectionObserver mouseSelectionObserver, ClicksCounter clicksCounter, TextDragObserver textDragObserver, Continuation<? super C00641> continuation) {
                super(2, continuation);
                this.$mouseSelectionObserver = mouseSelectionObserver;
                this.$clicksCounter = clicksCounter;
                this.$textDragObserver = textDragObserver;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00641 c00641 = new C00641(this.$mouseSelectionObserver, this.$clicksCounter, this.$textDragObserver, continuation);
                c00641.L$0 = obj;
                return c00641;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((C00641) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r0 = r9.label
                    r8 = 3
                    r7 = 2
                    r1 = 1
                    if (r0 == 0) goto L17
                    if (r0 == r1) goto L2c
                    if (r0 == r7) goto L11
                    if (r0 != r8) goto L88
                L11:
                    kotlin.ResultKt.throwOnFailure(r10)
                L14:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L17:
                    kotlin.ResultKt.throwOnFailure(r10)
                    java.lang.Object r6 = r9.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r6
                    r0 = r9
                    kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                    r9.L$0 = r6
                    r9.label = r1
                    java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$awaitDown(r6, r0)
                    if (r10 != r4) goto L33
                    return r4
                L2c:
                    java.lang.Object r6 = r9.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r6
                    kotlin.ResultKt.throwOnFailure(r10)
                L33:
                    androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
                    boolean r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r10)
                    r5 = 0
                    if (r0 == 0) goto L5d
                    int r0 = r10.m5325getButtonsry648PA()
                    boolean r0 = androidx.compose.ui.input.pointer.PointerEvent_androidKt.m5358isPrimaryPressedaHzCxE(r0)
                    if (r0 == 0) goto L5d
                    java.util.List r3 = r10.getChanges()
                    int r2 = r3.size()
                    r1 = 0
                L4f:
                    if (r1 >= r2) goto L76
                    java.lang.Object r0 = r3.get(r1)
                    androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                    boolean r0 = r0.isConsumed()
                    if (r0 == 0) goto L73
                L5d:
                    boolean r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r10)
                    if (r0 != 0) goto L14
                    androidx.compose.foundation.text.TextDragObserver r1 = r9.$textDragObserver
                    r0 = r9
                    kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                    r9.L$0 = r5
                    r9.label = r8
                    java.lang.Object r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$touchSelection(r6, r1, r10, r0)
                    if (r0 != r4) goto L14
                    return r4
                L73:
                    int r1 = r1 + 1
                    goto L4f
                L76:
                    androidx.compose.foundation.text.selection.MouseSelectionObserver r2 = r9.$mouseSelectionObserver
                    androidx.compose.foundation.text.selection.ClicksCounter r1 = r9.$clicksCounter
                    r0 = r9
                    kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                    r9.L$0 = r5
                    r9.label = r7
                    java.lang.Object r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$mouseSelection(r6, r2, r1, r10, r0)
                    if (r0 != r4) goto L14
                    return r4
                L88:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.C05761.C00641.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }
    }

    public static final Modifier selectionGestureInput(Modifier modifier, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, mouseSelectionObserver, textDragObserver, new C05761(mouseSelectionObserver, textDragObserver, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab A[Catch: CancellationException -> 0x00d6, TryCatch #0 {CancellationException -> 0x00d6, blocks: (B:28:0x00a0, B:29:0x00a3, B:31:0x00ab, B:33:0x00ba, B:35:0x00c6, B:36:0x00c9, B:37:0x00cc, B:38:0x00d0, B:16:0x004c, B:21:0x0070, B:23:0x0074, B:25:0x007e, B:18:0x0053), top: B:44:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0 A[Catch: CancellationException -> 0x00d6, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00d6, blocks: (B:28:0x00a0, B:29:0x00a3, B:31:0x00ab, B:33:0x00ba, B:35:0x00c6, B:36:0x00c9, B:37:0x00cc, B:38:0x00d0, B:16:0x004c, B:21:0x0070, B:23:0x0074, B:25:0x007e, B:18:0x0053), top: B:44:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object touchSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.TextDragObserver r9, androidx.compose.ui.input.pointer.PointerEvent r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object mouseSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.selection.MouseSelectionObserver r9, androidx.compose.foundation.text.selection.ClicksCounter r10, androidx.compose.ui.input.pointer.PointerEvent r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2, reason: invalid class name */
    /* JADX INFO: compiled from: SelectionGestures.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u0018\u000b\u0013\r\f\u001e\u0014\u001b\u001b[\u0002\u0015\u001d\u0017\u0016(\u001e%%~\u001e-/1/#2\u000b5e6)1+*<299\u00132ACEC7#C>DK=K#ILRR!TG\u0014\u0007\u0016", f = " 17/,<053\u000b(5551#0i&.", i = {0}, l = {Mp4VideoDirectory.TAG_DEPTH, 217, 220, 221}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aC^7CZ\u000f8='\r\u0018*6\u001c$\u001c"}, s = {"xQ^"})
    static final class AnonymousClass2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ClicksCounter $clicksCounter;
        final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
        final /* synthetic */ TextDragObserver $textDragObserver;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ClicksCounter clicksCounter, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$clicksCounter = clicksCounter;
            this.$mouseSelectionObserver = mouseSelectionObserver;
            this.$textDragObserver = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$clicksCounter, this.$mouseSelectionObserver, this.$textDragObserver, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r12.label
                r8 = 4
                r7 = 3
                r9 = 2
                r10 = 1
                if (r0 == 0) goto L1a
                if (r0 == r10) goto L2f
                if (r0 == r9) goto L14
                if (r0 == r7) goto L14
                if (r0 != r8) goto La4
            L14:
                kotlin.ResultKt.throwOnFailure(r13)
            L17:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L1a:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r5 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                r0 = r12
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r12.L$0 = r5
                r12.label = r10
                java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$awaitDown(r5, r0)
                if (r13 != r3) goto L36
                return r3
            L2f:
                java.lang.Object r5 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                kotlin.ResultKt.throwOnFailure(r13)
            L36:
                androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.ui.input.pointer.PointerEvent) r13
                androidx.compose.foundation.text.selection.ClicksCounter r0 = r12.$clicksCounter
                r0.update(r13)
                boolean r11 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r13)
                r4 = 0
                if (r11 == 0) goto L65
                int r0 = r13.m5325getButtonsry648PA()
                boolean r0 = androidx.compose.ui.input.pointer.PointerEvent_androidKt.m5358isPrimaryPressedaHzCxE(r0)
                if (r0 == 0) goto L65
                java.util.List r6 = r13.getChanges()
                int r2 = r6.size()
                r1 = 0
            L57:
                if (r1 >= r2) goto L92
                java.lang.Object r0 = r6.get(r1)
                androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                boolean r0 = r0.isConsumed()
                if (r0 == 0) goto L7f
            L65:
                if (r11 != 0) goto L17
                androidx.compose.foundation.text.selection.ClicksCounter r0 = r12.$clicksCounter
                int r0 = r0.getClicks()
                if (r0 != r10) goto L82
                androidx.compose.foundation.text.TextDragObserver r1 = r12.$textDragObserver
                r0 = r12
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r12.L$0 = r4
                r12.label = r7
                java.lang.Object r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$touchSelectionFirstPress(r5, r1, r13, r0)
                if (r0 != r3) goto L17
                return r3
            L7f:
                int r1 = r1 + 1
                goto L57
            L82:
                androidx.compose.foundation.text.TextDragObserver r1 = r12.$textDragObserver
                r0 = r12
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r12.L$0 = r4
                r12.label = r8
                java.lang.Object r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$touchSelectionSubsequentPress(r5, r1, r13, r0)
                if (r0 != r3) goto L17
                return r3
            L92:
                androidx.compose.foundation.text.selection.MouseSelectionObserver r2 = r12.$mouseSelectionObserver
                androidx.compose.foundation.text.selection.ClicksCounter r1 = r12.$clicksCounter
                r0 = r12
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r12.L$0 = r4
                r12.label = r9
                java.lang.Object r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$mouseSelectionBtf2(r5, r2, r1, r13, r0)
                if (r0 != r3) goto L17
                return r3
            La4:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object selectionGesturePointerInputBtf2(PointerInputScope pointerInputScope, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass2(new ClicksCounter(pointerInputScope.getViewConfiguration()), mouseSelectionObserver, textDragObserver, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8 A[Catch: CancellationException -> 0x00d3, TryCatch #0 {CancellationException -> 0x00d3, blocks: (B:28:0x009d, B:29:0x00a0, B:31:0x00a8, B:33:0x00b7, B:35:0x00c3, B:36:0x00c6, B:37:0x00c9, B:38:0x00cd, B:16:0x0049, B:21:0x006d, B:23:0x0071, B:25:0x007b, B:18:0x0050), top: B:44:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd A[Catch: CancellationException -> 0x00d3, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00d3, blocks: (B:28:0x009d, B:29:0x00a0, B:31:0x00a8, B:33:0x00b7, B:35:0x00c3, B:36:0x00c6, B:37:0x00c9, B:38:0x00cd, B:16:0x0049, B:21:0x006d, B:23:0x0071, B:25:0x007b, B:18:0x0050), top: B:44:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object touchSelectionFirstPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.TextDragObserver r9, androidx.compose.ui.input.pointer.PointerEvent r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionFirstPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df A[Catch: CancellationException -> 0x010a, TryCatch #1 {CancellationException -> 0x010a, blocks: (B:38:0x00d4, B:39:0x00d7, B:41:0x00df, B:43:0x00ee, B:45:0x00fa, B:46:0x00fd, B:47:0x0100, B:48:0x0104, B:21:0x0095, B:23:0x0099, B:24:0x009b, B:26:0x009f, B:28:0x00a2, B:30:0x00ad, B:32:0x00b3, B:34:0x00b7, B:35:0x00bc, B:18:0x0058), top: B:58:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104 A[Catch: CancellationException -> 0x010a, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x010a, blocks: (B:38:0x00d4, B:39:0x00d7, B:41:0x00df, B:43:0x00ee, B:45:0x00fa, B:46:0x00fd, B:47:0x0100, B:48:0x0104, B:21:0x0095, B:23:0x0099, B:24:0x009b, B:26:0x009f, B:28:0x00a2, B:30:0x00ad, B:32:0x00b3, B:34:0x00b7, B:35:0x00bc, B:18:0x0058), top: B:58:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object touchSelectionSubsequentPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope r12, final androidx.compose.foundation.text.TextDragObserver r13, androidx.compose.ui.input.pointer.PointerEvent r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionSubsequentPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:23:0x0080, B:24:0x0083, B:26:0x008b, B:28:0x0099, B:30:0x00a5, B:31:0x00a8, B:20:0x0065), top: B:63:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:47:0x00f2, B:48:0x00f5, B:50:0x00fd, B:52:0x010b, B:54:0x0117, B:55:0x011a, B:44:0x00d7), top: B:63:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object mouseSelectionBtf2(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.selection.MouseSelectionObserver r9, androidx.compose.foundation.text.selection.ClicksCounter r10, androidx.compose.ui.input.pointer.PointerEvent r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelectionBtf2(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004a -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerEvent> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt.AnonymousClass1
            if (r0 == 0) goto L54
            r7 = r9
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r7 = (androidx.compose.foundation.text.selection.SelectionGesturesKt.AnonymousClass1) r7
            int r0 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L54
            int r0 = r7.label
            int r0 = r0 - r1
            r7.label = r0
        L13:
            java.lang.Object r6 = r7.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r7.label
            r4 = 1
            if (r0 == 0) goto L50
            if (r0 != r4) goto L5b
            java.lang.Object r8 = r7.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.ResultKt.throwOnFailure(r6)
        L27:
            androidx.compose.ui.input.pointer.PointerEvent r6 = (androidx.compose.ui.input.pointer.PointerEvent) r6
            java.util.List r3 = r6.getChanges()
            int r2 = r3.size()
            r1 = 0
        L32:
            if (r1 >= r2) goto L5a
            java.lang.Object r0 = r3.get(r1)
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
            boolean r0 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r0)
            if (r0 != 0) goto L4d
        L40:
            androidx.compose.ui.input.pointer.PointerEventPass r0 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r7.L$0 = r8
            r7.label = r4
            java.lang.Object r6 = r8.awaitPointerEvent(r0, r7)
            if (r6 != r5) goto L27
            return r5
        L4d:
            int r1 = r1 + 1
            goto L32
        L50:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L40
        L54:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r7 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            r7.<init>(r9)
            goto L13
        L5a:
            return r6
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.awaitDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean distanceIsTolerable(ViewConfiguration viewConfiguration, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return Offset.m3935getDistanceimpl(Offset.m3941minusMKHz9U(pointerInputChange.m5385getPositionF1C5BW0(), pointerInputChange2.m5385getPositionF1C5BW0())) < DragGestureDetectorKt.m762pointerSlopE8SPZFQ(viewConfiguration, pointerInputChange.m5388getTypeT8wyACA());
    }

    public static final boolean isPrecisePointer(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!PointerType.m5457equalsimpl0(changes.get(i2).m5388getTypeT8wyACA(), PointerType.Companion.m5462getMouseT8wyACA())) {
                return false;
            }
        }
        return true;
    }
}
