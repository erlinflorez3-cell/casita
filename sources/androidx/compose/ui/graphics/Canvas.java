package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
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
/* JADX INFO: compiled from: Canvas.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яč\u0014D57\u001eq\u007fR܀kŞ\fA\u00140\u0013ǞJ~8,\u001aՄ\u000ff\u000198DkJ6Ri*\u0017k\u00025,[2vK;[\u001f\u0006\"\u001fOVgmsRZ\u0019L\u0017إ\u001ex\u0001,QU~`\u001a\u000fHBw?9Pw=O`|6\u000b#:\"Ny\rЏ\"*^\u0010~zIV\u0014\u0012F@xíZ\r[#\"\u0012\f?(\u0001,noN<Nt]P/+ɅqBd'g0\u0003_\u0013+j܋=v\u0010\u001dsbE5-%\u0002\u00047ViA\u001b? @5n-'9M\fWd]F8Ǽ*˽ոat,b\u0013X).53gcyQ>,\u0006\u0004\u0014\rj\u000e>\f-H<12f6\u0013y\tʺRóг\u0006`H\u000b\tm~Q3\bK+g\u001c\u0017UoH1Ne\n5\u0011,2\u0019nOi\u0005\u0012n%3T&_aUNN`N8gms\npp\u0006B\u0004^LFSʾ\u0010фϲ)9aK144\u001aVX\u007fv3a\u0019Wwg`@P\u0005\\[Ӡ\bȱʑHf\u000b\u0003^l!2\u001ff4T5~N7h\u000b\u0006V9%>O\u007flwse]8/_jEt\u0007k<eibAQic>o\u0003z\"\\Tb3v\u0017Fa+r\\VBx\\3V\u0006\u0016\\N:\u0014bC\u007f)L,_'\r\u0019V\u00126Bo\u000b9chx(~\u0003AT\u0007w5\r\t/^\rt}\u0003\u0011IZ\u000b\u0011&;]i5G4\u0006&vQ\u0015#5\u001d$\u0004U\u0007dGz\r\\\u001a\u001e*.729\u007f0m\u0017\u001d\bA207uP\u0001\biM@5+\u0001\b2Sh\\u8n~Ixjxm\u0005\u001b0\u0016vrQ(+\u0014B\nT\u001f_c\u0003\f\fBW\u0018\u001bYjth\u0001\u0013F6%/}R\u0001CL['K6>8ۥ\u0014˕ԃmq4\"p8n\u001ds.DcDp\u0013Uk]S8w\u0006/B0Q\u0005\u0003pn\u001b{\u0016a!4;S\u000feҥoމиQ\r5,t6tU~\u0007s:Ap.8<\u000bBsq*DdI%\u001f~kg\u001c {b\u0011J\u001d=#{_#B\"C d\rz\t^8$\u001e<AI\u0019\u001d<7Xd0J'#C\u0003\nL4Ÿ~ʋݍ\u0013\u00198y\u0002s\u001f6b2tVv\u0006\u0011In[B\u0001-5c\"\u0007pI\u0005\u001cl\u00053qQ\u0019SK)a\u000f̣}ܺު/FZu)e!\u0017\u0019\u0004uCw\u0003f\bU2\u0006k\u001e\u0016h\u001c\u000b<Z\u0018IY\u0018%(%>\u001d#U\u0013O\u0015z sjNP7/~\u000b\u001dT\n=\u0019IS\u0001\u007fz-z\\(;Q+\u0019\u0017r77\u0010\u000b\u0003^\u001b[&{Q\u0006_xS?{\u0006Tk\u0002\u0016\"8'2wQ`e-~\n\f;\u0001::DpB!\u0013~!42X6\u000b\n\\JfY\u0010v\u001a\u0019n[{wOfUo\u001d\nPj\u0001x8\u00043\bÓT̃өj3\\?|s\u0019E\u0017ne.AY\u000b>\u001f\u00158X?BD\u00194bN\b\u0011q@Sq\b\tk}{SO֓jˋՀ52Xg\fiB\f\u0012ul(C<\u0007QLm!\\\u001bL\b\u0012l\n@d#,o(E-V*)\u0013bG#\"r<O\u0019Mi=Kn\u0016\u001cEw4Q5`O37`\u0019 ,\u0005\"\u001b:\u0011\u00030.P(\u000b\u007f\u0016Lsj\u001d{(sq$\u001ce3*YRPB6:A\u0012\u001f>r8NL\r\u001e*Ki3o'A\u0005#I\u001eo5'en_!=*/\u000b1\u0011MHIkh\u0002gv1N'oIw-_m]s\u001c?\f0fz\u0003[4n\u000f\u0010}y9Sp\u0012UnS:#2C\u001euQ \fUٳ)أЪDXy,\u0012{r<|\u001b;G\u001by:.to&K|[\u00105\b\u001f\\'R\u0017B-\u001b\buQvS#D;SZ[W\f7\u000e/|>P8ds_\u0001)G\\\f=Cw\u0012\u0017Jad\u0004wDgI\u001e-@t*\u000f3\u0006_=(8@\u000e=\b\u0006\u0010j`.nM\u001e-K\u0005&N\\'[\b\u0007SV\u001d\u0005v.p\r;\n$\r`\u00170\fzd#rKG\"O\u000e6\u001f\u0012/~)[S\u0007Ukx*WU fm=An\u0006J\u0007C,pMk/0|+C\u0001\u001b/<-n>H8\t\n\u001c,|H>R?hۣl/ߓ0[\u0007]I\u05fb\u001dJ\u001eEW\u001b\u0005-1ĸ;Cܪ\u0015,"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "", "1kX=C(MV", "", ">`c5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "1kX=B7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013`\u0002+!xk", "1kX=C(MV`\u0007\nk+[P\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:Cyq>", "1kX=E,<b", "@dRA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "1kX=E,<b`\u0007\nk+[P\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFCyq>", ":dUA", "", "Bn_", "@hV5g", "0ncAb4", "1kX=E,<b`gtBv\u0004\t1", "uE5\u00139\u0010\u0002D", "1n]0T;", ";`c?\\?", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", "1n]0T;\u0006#k{`[\u001ez", "uZ5uI", "2hb.U3>H", "2qPD49<", "AsP?g\bGU ~", "AvT2c\bGU ~", "CrT\u0010X5MS&", "", ">`X;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", "2qPD49<@\u0015}", "AsP?g\bGU ~gZ+", "AvT2c\bGU ~gZ+", "2qPD60KQ ~", "1d]AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "@`S6h:", "2qPD60KQ ~B2\u0012`p=z\n", "uI5\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`I|\nGy)3gG\u000b3q\u001f=#\u0007,", "2qPD<4:U\u0019", "7lP4X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FA", "Bn_\u0019X-M=\u001a\u007f\t^;", "2qPD<4:U\u0019Fy&z|\u0007\u0001I", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\n\u0003{dj8\u0014m0M\npEVV7f`r\u0007$\u0016$\u0010['\u0018\b]?28/3#\u0011;\u001fE,", "2qPD<4:U\u0019kz\\;", "AqR\u001cY-LS(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "AqR \\A>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "2rc\u001cY-LS(", "2rc \\A>", "2qPD<4:U\u0019kz\\;Dk\u001aB\u000b5\u0006\u000b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\n\u0003yMF \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u001eRt\u000f\u0012UL'rBEhr(M\u000bJ>D|", "2qPD?0GS", ">0", ">1", "2qPD?0GS`p\u0001hw{Z1", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`I|\nGy)3gG\u000b3q\u001f=#\u0007,", "2qPDB=:Z", "2qPDC(MV", "2qPDC6B\\(\r", ">nX;g\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n c\u0002)FU -M\u0019", ">nX;g:", "", "2qPDC6B\\(\rBH}k\u00182Rs", "uH;7T=:\u001d)\u000e~euc\r=tU\u000fwI\u007f$!Kn!\u0006t/=d\b.77&2\u0017EHg?!\u0019fo\u0003q_0W\u0006|\u000b=", "2qPDE(P>#\u0003\u0004m:", "", "2qPDE(P>#\u0003\u0004m:Dr\u0001T\u000f+h4", "uHJ\u0013?(GR&\t~]?F\u00079m\u000b2\n@J'\u001b\u0011q\u001b8\u0002(9W\fi\"i\u001a7\\\u0019~\\", "2qPDE,<b", "2qPDE6N\\\u0018kz\\;", "@`S6h:1", "@`S6h:2", "2qPDI,Kb\u001d|zl", "DdaA\\*>a", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n&Y\u000b/;k\u0016<#", "0kT;W\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "2qPDI,Kb\u001d|zlsks\u000fH\u0003\u0006c", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~J}-Fq\u0014.[\u0019\u001fR0'\u0014uk=\u0006vuL\u0001/RV\\,&bv\u0007\u0016\u001fV\u0019Q/\u000b\u0013#, rMFtK\u001d", "3mP/_,3", "@dbAb9>", "@nc.g,", "2dV?X,L", "A`e2", "A`e2?(RS&", "0nd;W:", "AbP9X", "Aw", "Ax", "AjTD", "AjTDE(=", "AwA.W", "AxA.W", "BqP;f3:b\u0019", "2w", "2x", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface Canvas {
    /* JADX INFO: renamed from: clipPath-mtrdD-E */
    void mo4031clipPathmtrdDE(Path path, int i2);

    /* JADX INFO: renamed from: clipRect-N_I0leg */
    void mo4032clipRectN_I0leg(float f2, float f3, float f4, float f5, int i2);

    /* JADX INFO: renamed from: concat-58bKbWc */
    void mo4033concat58bKbWc(float[] fArr);

    void disableZ();

    void drawArc(float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, Paint paint);

    /* JADX INFO: renamed from: drawCircle-9KIMszo */
    void mo4034drawCircle9KIMszo(long j2, float f2, Paint paint);

    /* JADX INFO: renamed from: drawImage-d-4ec7I */
    void mo4035drawImaged4ec7I(ImageBitmap imageBitmap, long j2, Paint paint);

    /* JADX INFO: renamed from: drawImageRect-HPBpro0 */
    void mo4036drawImageRectHPBpro0(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, Paint paint);

    /* JADX INFO: renamed from: drawLine-Wko1d7g */
    void mo4037drawLineWko1d7g(long j2, long j3, Paint paint);

    void drawOval(float f2, float f3, float f4, float f5, Paint paint);

    void drawPath(Path path, Paint paint);

    /* JADX INFO: renamed from: drawPoints-O7TthRY */
    void mo4038drawPointsO7TthRY(int i2, List<Offset> list, Paint paint);

    /* JADX INFO: renamed from: drawRawPoints-O7TthRY */
    void mo4039drawRawPointsO7TthRY(int i2, float[] fArr, Paint paint);

    void drawRect(float f2, float f3, float f4, float f5, Paint paint);

    void drawRoundRect(float f2, float f3, float f4, float f5, float f6, float f7, Paint paint);

    /* JADX INFO: renamed from: drawVertices-TPEHhCM */
    void mo4040drawVerticesTPEHhCM(Vertices vertices, int i2, Paint paint);

    void enableZ();

    void restore();

    void rotate(float f2);

    void save();

    void saveLayer(Rect rect, Paint paint);

    void scale(float f2, float f3);

    void skew(float f2, float f3);

    void translate(float f2, float f3);

    /* JADX INFO: compiled from: Canvas.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        @Deprecated
        public static void skewRad(Canvas canvas, float f2, float f3) {
            Canvas.super.skewRad(f2, f3);
        }

        @Deprecated
        /* JADX INFO: renamed from: clipRect-mtrdD-E */
        public static void m4156clipRectmtrdDE(Canvas canvas, Rect rect, int i2) {
            Canvas.super.m4153clipRectmtrdDE(rect, i2);
        }

        @Deprecated
        public static void drawRect(Canvas canvas, Rect rect, Paint paint) {
            Canvas.super.drawRect(rect, paint);
        }

        @Deprecated
        public static void drawOval(Canvas canvas, Rect rect, Paint paint) {
            Canvas.super.drawOval(rect, paint);
        }

        @Deprecated
        public static void drawArc(Canvas canvas, Rect rect, float f2, float f3, boolean z2, Paint paint) {
            Canvas.super.drawArc(rect, f2, f3, z2, paint);
        }

        @Deprecated
        public static void drawArcRad(Canvas canvas, Rect rect, float f2, float f3, boolean z2, Paint paint) {
            Canvas.super.drawArcRad(rect, f2, f3, z2, paint);
        }
    }

    static /* synthetic */ void scale$default(Canvas canvas, float f2, float f3, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
        }
        if ((i2 & 2) != 0) {
            f3 = f2;
        }
        canvas.scale(f2, f3);
    }

    default void skewRad(float f2, float f3) {
        skew(DegreesKt.degrees(f2), DegreesKt.degrees(f3));
    }

    /* JADX INFO: renamed from: clipRect-mtrdD-E$default */
    static /* synthetic */ void m4151clipRectmtrdDE$default(Canvas canvas, Rect rect, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i2 = ClipOp.Companion.m4167getIntersectrtfAjoo();
        }
        canvas.m4153clipRectmtrdDE(rect, i2);
    }

    /* JADX INFO: renamed from: clipRect-mtrdD-E */
    default void m4153clipRectmtrdDE(Rect rect, int i2) {
        mo4032clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i2);
    }

    /* JADX INFO: renamed from: clipRect-N_I0leg$default */
    static /* synthetic */ void m4150clipRectN_I0leg$default(Canvas canvas, float f2, float f3, float f4, float f5, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            i2 = ClipOp.Companion.m4167getIntersectrtfAjoo();
        }
        canvas.mo4032clipRectN_I0leg(f2, f3, f4, f5, i2);
    }

    /* JADX INFO: renamed from: clipPath-mtrdD-E$default */
    static /* synthetic */ void m4149clipPathmtrdDE$default(Canvas canvas, Path path, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i2 = ClipOp.Companion.m4167getIntersectrtfAjoo();
        }
        canvas.mo4031clipPathmtrdDE(path, i2);
    }

    default void drawRect(Rect rect, Paint paint) {
        drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    default void drawOval(Rect rect, Paint paint) {
        drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    default void drawArc(Rect rect, float f2, float f3, boolean z2, Paint paint) {
        drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f2, f3, z2, paint);
    }

    default void drawArcRad(Rect rect, float f2, float f3, boolean z2, Paint paint) {
        drawArc(rect, DegreesKt.degrees(f2), DegreesKt.degrees(f3), z2, paint);
    }

    /* JADX INFO: renamed from: drawImageRect-HPBpro0$default */
    static /* synthetic */ void m4152drawImageRectHPBpro0$default(Canvas canvas, ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, Paint paint, int i2, Object obj) {
        if (obj == null) {
            if ((i2 + 2) - (2 | i2) != 0) {
                j2 = IntOffset.Companion.m6776getZeronOccac();
            }
            if ((i2 + 4) - (4 | i2) != 0) {
                j3 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
            }
            if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
                j4 = IntOffset.Companion.m6776getZeronOccac();
            }
            if ((i2 + 16) - (i2 | 16) != 0) {
                j5 = j3;
            }
            canvas.mo4036drawImageRectHPBpro0(imageBitmap, j2, j3, j4, j5, paint);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
    }
}
