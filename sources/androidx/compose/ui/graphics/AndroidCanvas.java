package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
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
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:305)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
/* JADX INFO: compiled from: AndroidCanvas.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яı\u0014D57\u001eq\u007fZDkt\nA\u000e0!.Jչ*,(w\u000ff\u000198DkM6Ra*\u0017ӆ\u00044:[,ڎK;k\u001a\u0006\"\u000fQVgusRZ\u0011H\u0017\u0006,xr,OZ\u0001] \u0018:ԏw?IMw=?`|6\u001b :\">|\r\u00010*P\u0010|}KK\"\u00128ϋx:h\rU\u0005 \u001b\u000e>.\u001f&ձoNDNt]@1+\u0003\u007fBV'e1\u0005M\u001bX\\'\u0013}i\u001eA@?ߎ\u001d%i\u0003\u000fRaF\u000b?\b=\rh--3I\nW>X\u0006\u0015\u001b*eՕ\u000erT[ETԃ\u0010'9O,k^\u001a@w)\t=@\u0012\u001c\u001e'v=]\u001et\u0018&3#\u0004\u001aT҉\u0001މ۰\u0004|gH%8Hk9M3f\u007fnk\u001d\\L\u0014\u0005;4S\u0005|8sT<vE\u001fb\u0010i1\u007fVmL\\#q=\u001c\u001a!f\u0010:\u001c0u\u0011u\u0010ö-ϏÉ;]?=/\u0007J`R\u0004\u000f\u0005\u000fu\u0004m`eX\"\u001d4}>ė\u000bɮֈh\u0007qobxt\u0017[=l\u0007,\u0015Y4%>JC=\u0010|\\\u0019mxbu\nSE\u0017;g\u0006\u0004\u000e\u0006O\u000f7Ci{\u0010\u0010h'\u0018MUz\u0005\u0007|rW\u001a}t(PHxn\u001e\u001c\u0014D|\"C6M\u001744ZWI`#o\u001b\u001epiC\u001d(\u0003v9\u0017Ta13m2\u001f!\u0001~\b!su%a,+vR1OxM\u0019T}h|ڍ{Ƚȷ\u0003u\u0006tuz\u0010tzE\u000eU*-F\u001eG\u0002G=A@/-@4EEz\u001e\u0016U[9?z+\"UOŕ-ԖŰnr2\u0014x~\u0018\u0015%W\u000f^!08h\u000e*yF)x\u0014X\u0019\u0012VI!:\n@\\p\u0015\u0005MWU\u0005}\\\u00155[zW!$3,/C\u001b\u000em}U\u0012b=N;yض+ϣ݁sdW\u001a@x\u0001qg=V\"Ry3FV*\u0010\bp4d\u0011A\tYd\u001f\u0002hQ\u0019V\u0016f5TS\u0005ĜZƥ݇s\u007f:oml<g\fWvCS\u001e}]u2\u0006Ql\rZ\u000f86*v\u001f\u0016*d8V\u0006\u000b94\u0014:06o\u0003)\u0005\u000572|D<6\u0018sXw\u001b(z.\\\u0010\u0013%IZsil>X\u0007tnH3vud/C\u0019~=IN|CX\u001dmt|uwz\u0017af!\u001b\u0019\\/j39\\Tg*X\\\u000f2]]qqHJLu78\u0004o:EH\u0001+\u000e0\u001bg\u001eAi\u0005tv\u0011ef^d%=\u0015\u0018~&7&\u0013|<dP#֞\u0018ۚζsd3\u001a\\F\u007f_(K/DW\u0014<\u0007q\u000b33\u00167==w\u0016Bl,[ab\u0016\bNHm\u0004=?j'&f8jK>$6.b0YCT.+FJ#\u001b:2\u0016|g\u0002aIY^\"\u0014\u0006rX'Yy6FY4\u0011\n\u00129\u0014rcO\u001bf_'*r;w5\tUut'ζYϐñW\"^c\u000eg]D-\b bW\u001d\u007fgv5\u0004O\n][3yQy1^zN\u0002-@\u000e\u0004X\u001cn\u0015\u0004\u0005[\u0013|\t\u000byr[\u001cs\u0003(\u0013\u000b<-\"\u0014\u0017H\r'C8T\u000b6d]MI#i&_`5\u001auM4HIRmC}FS.6L)\u0003ho%\u00048W!r.}\\1TkU\u001aUoTqr\u001b>KsNr\f:*&\u0011]ph$L32\u001cigcE'h\u0019\u0015f\u001c \u000b'\\\u0003Q\u0002Mp\u0015E)\u001b\u0018\u00121\u001aG$;\u0001|G\u000f\u001eu\bjI\u0001Mez\u0004<\u0006sq\u0017M\u0012~UuЫHʿ¹\"{[\u001e\u000ehg*2e\u000e#.Rw\\rej!ns\u0006\u0011l>~|R\u0005_l'\u0001:0wz\fd\nwzUC\u001a'(V*[yMY\u0016~\bo\\\rs!g\u0013\u0014\u000fK\u0017+v\u007fuNRar{W#q\u0005)\u0002kR2\u0010C*KNBB\u0006[(\u0005gxT\u0006Q\u000e&~&U#\u0012bIR\u000f\r\u0011!&\u0010cvtL\r|[+z\u000bn%jrvX\u001av\u001e\u0016\\UG\u0006\f7x\u0015AIwwO5*V*7c%$7\u0014\u0014\u007fju/}q\u0007Nڳ2َǮNZ;Vjv&/YeC\u0017\u0016iY0\u001eݍJϹ.X\u000eچ\u0016\u000bV\u0013\\|r,V0\u000f5\u0007ڄ\u0019֬4ӟ(؞Ag\u001d֧\u000f4h=id)-=^|Zu%3\u0002\u0010\r`O'\u001e# i8`%Jԟ=Ĩ\u007f\bdųʓ|rQ\u0013\t˓fO.ϏC\""}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0011b|-Aq\u0015\fILLgBs", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "u(E", "2rc\u001fX*M", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "7mc2e5:Zvz\u0004o(\u000b", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001eU\r$Hms*VT7y\n", "5dc\u0016a;>`\"z\u0002<(\u0006\u001a+s>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc\u0016a;>`\"z\u0002<(\u0006\u001a+s", "u(;.a+K]\u001d}D`9x\u00142i}6E\u001e| (C}c", "Adc\u0016a;>`\"z\u0002<(\u0006\u001a+s", "uKP;W9HW\u0018H|k(\b\f3c\u000eqY<\n(\u0013UEQ-", "AqR\u001fX*M", "1kX=C(MV", "", ">`c5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "1kX=B7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013`\u0002+!xk", "1kX=C(MV`\u0007\nk+[P\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:Cyq>", "1kX=E,<b", ":dUA", "", "Bn_", "@hV5g", "0ncAb4", "1kX=E,<b`gtBv\u0004\t1", "uE5\u00139\u0010\u0002D", "1n]0T;", ";`c?\\?", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", "1n]0T;\u0006#k{`[\u001ez", "uZ5uI", "2hb.U3>H", "2qPD49<", "AsP?g\bGU ~", "AvT2c\bGU ~", "CrT\u0010X5MS&", "", ">`X;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", "2qPD60KQ ~", "1d]AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "@`S6h:", "2qPD60KQ ~B2\u0012`p=z\n", "uI5\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`I|\nGy)3gG\u000b3q\u001f=#\u0007,", "2qPD<4:U\u0019", "7lP4X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FA", "Bn_\u0019X-M=\u001a\u007f\t^;", "2qPD<4:U\u0019Fy&z|\u0007\u0001I", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\n\u0003{dj8\u0014m0M\npEVV7f`r\u0007$\u0016$\u0010['\u0018\b]?28/3#\u0011;\u001fE,", "2qPD<4:U\u0019kz\\;", "AqR\u001cY-LS(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "AqR \\A>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "2rc\u001cY-LS(", "2rc \\A>", "2qPD<4:U\u0019kz\\;Dk\u001aB\u000b5\u0006\u000b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\n\u0003yMF \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u001eRt\u000f\u0012UL'rBEhr(M\u000bJ>D|", "2qPD?0GS", ">0", ">1", "2qPD?0GS`p\u0001hw{Z1", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`I|\nGy)3gG\u000b3q\u001f=#\u0007,", "2qPD?0GS'", ">nX;g:", "", "AsT=5@", "", "2qPDB=:Z", "2qPDC(MV", "2qPDC6B\\(\r", ">nX;g\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n c\u0002)FU -M\u0019", "2qPDC6B\\(\rBH}k\u00182Rs", "uH;7T=:\u001d)\u000e~euc\r=tU\u000fwI\u007f$!Kn!\u0006t/=d\b.77&2\u0017EHg?!\u0019fo\u0003q_0W\u0006|\u000b=", "2qPDE(P:\u001d\bzl", "", "2qPDE(P>#\u0003\u0004m:", "2qPDE(P>#\u0003\u0004m:Dr\u0001T\u000f+h4", "uHJ\u0013?(GR&\t~]?F\u00079m\u000b2\n@J'\u001b\u0011q\u001b8\u0002(9W\fi\"i\u001a7\\\u0019~\\", "2qPDE,<b", "2qPDE6N\\\u0018kz\\;", "@`S6h:1", "@`S6h:2", "2qPDI,Kb\u001d|zl", "DdaA\\*>a", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n&Y\u000b/;k\u0016<#", "0kT;W\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "2qPDI,Kb\u001d|zlsks\u000fH\u0003\u0006c", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~J}-Fq\u0014.[\u0019\u001fR0'\u0014uk=\u0006vuL\u0001/RV\\,&bv\u0007\u0016\u001fV\u0019Q/\u000b\u0013#, rMFtK\u001d", "3mP/_,3", "@dbAb9>", "@nc.g,", "2dV?X,L", "A`e2", "A`e2?(RS&", "0nd;W:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "AbP9X", "Aw", "Ax", "AjTD", "BqP;f3:b\u0019", "2w", "2x", "BnA2Z0H\\\u0003\n", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{B\u0005! \u0006Y\u0019\u0012", "BnA2Z0H\\\u0003\nB&}\rU\fm\u0002", "uH\u0018\u0019T5=`#\u0003y(.\n\u0005:h\u0004&\n\nm\u0017\u0019Ky\u0017z`0\u000b", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidCanvas implements Canvas {
    private Rect dstRect;
    private android.graphics.Canvas internalCanvas = AndroidCanvas_androidKt.EmptyCanvas;
    private Rect srcRect;

    public static /* synthetic */ void getInternalCanvas$annotations() {
    }

    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    public final void setInternalCanvas(android.graphics.Canvas canvas) {
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        this.internalCanvas.saveLayer(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint.asFrameworkPaint(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float f2, float f3) {
        this.internalCanvas.translate(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float f2, float f3) {
        this.internalCanvas.scale(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float f2) {
        this.internalCanvas.rotate(f2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skew(float f2, float f3) {
        this.internalCanvas.skew(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: concat-58bKbWc, reason: not valid java name */
    public void mo4033concat58bKbWc(float[] fArr) {
        if (MatrixKt.m4433isIdentity58bKbWc(fArr)) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        AndroidMatrixConversions_androidKt.m4048setFromEL8BTi8(matrix, fArr);
        this.internalCanvas.concat(matrix);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipRect-N_I0leg, reason: not valid java name */
    public void mo4032clipRectN_I0leg(float f2, float f3, float f4, float f5, int i2) {
        this.internalCanvas.clipRect(f2, f3, f4, f5, m4041toRegionOp7u2Bmg(i2));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public void mo4031clipPathmtrdDE(Path path, int i2) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (path instanceof AndroidPath) {
            canvas.clipPath(((AndroidPath) path).getInternalPath(), m4041toRegionOp7u2Bmg(i2));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* JADX INFO: renamed from: toRegionOp--7u2Bmg, reason: not valid java name */
    public final Region.Op m4041toRegionOp7u2Bmg(int i2) {
        return ClipOp.m4162equalsimpl0(i2, ClipOp.Companion.m4166getDifferencertfAjoo()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawLine-Wko1d7g, reason: not valid java name */
    public void mo4037drawLineWko1d7g(long j2, long j3, Paint paint) {
        this.internalCanvas.drawLine(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2), Offset.m3937getXimpl(j3), Offset.m3938getYimpl(j3), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float f2, float f3, float f4, float f5, Paint paint) {
        this.internalCanvas.drawRect(f2, f3, f4, f5, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float f2, float f3, float f4, float f5, float f6, float f7, Paint paint) {
        this.internalCanvas.drawRoundRect(f2, f3, f4, f5, f6, f7, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(float f2, float f3, float f4, float f5, Paint paint) {
        this.internalCanvas.drawOval(f2, f3, f4, f5, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawCircle-9KIMszo, reason: not valid java name */
    public void mo4034drawCircle9KIMszo(long j2, float f2, Paint paint) {
        this.internalCanvas.drawCircle(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2), f2, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, Paint paint) {
        this.internalCanvas.drawArc(f2, f3, f4, f5, f6, f7, z2, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (path instanceof AndroidPath) {
            canvas.drawPath(((AndroidPath) path).getInternalPath(), paint.asFrameworkPaint());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImage-d-4ec7I, reason: not valid java name */
    public void mo4035drawImaged4ec7I(ImageBitmap imageBitmap, long j2, Paint paint) {
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImageRect-HPBpro0, reason: not valid java name */
    public void mo4036drawImageRectHPBpro0(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, Paint paint) {
        if (this.srcRect == null) {
            this.srcRect = new Rect();
            this.dstRect = new Rect();
        }
        android.graphics.Canvas canvas = this.internalCanvas;
        Bitmap bitmapAsAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap);
        Rect rect = this.srcRect;
        Intrinsics.checkNotNull(rect);
        rect.left = IntOffset.m6766getXimpl(j2);
        rect.top = IntOffset.m6767getYimpl(j2);
        rect.right = IntOffset.m6766getXimpl(j2) + IntSize.m6808getWidthimpl(j3);
        rect.bottom = IntOffset.m6767getYimpl(j2) + IntSize.m6807getHeightimpl(j3);
        Unit unit = Unit.INSTANCE;
        Rect rect2 = this.dstRect;
        Intrinsics.checkNotNull(rect2);
        rect2.left = IntOffset.m6766getXimpl(j4);
        rect2.top = IntOffset.m6767getYimpl(j4);
        rect2.right = IntOffset.m6766getXimpl(j4) + IntSize.m6808getWidthimpl(j5);
        rect2.bottom = IntOffset.m6767getYimpl(j4) + IntSize.m6807getHeightimpl(j5);
        Unit unit2 = Unit.INSTANCE;
        canvas.drawBitmap(bitmapAsAndroidBitmap, rect, rect2, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawPoints-O7TthRY, reason: not valid java name */
    public void mo4038drawPointsO7TthRY(int i2, List<Offset> list, Paint paint) {
        if (!PointMode.m4479equalsimpl0(i2, PointMode.Companion.m4483getLinesr_lszbg())) {
            if (PointMode.m4479equalsimpl0(i2, PointMode.Companion.m4485getPolygonr_lszbg())) {
                drawLines(list, paint, 1);
                return;
            } else {
                if (PointMode.m4479equalsimpl0(i2, PointMode.Companion.m4484getPointsr_lszbg())) {
                    drawPoints(list, paint);
                    return;
                }
                return;
            }
        }
        drawLines(list, paint, 2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    private final void drawLines(List<Offset> list, Paint paint, int i2) {
        if (list.size() >= 2) {
            android.graphics.Paint paintAsFrameworkPaint = paint.asFrameworkPaint();
            int i3 = 0;
            while (i3 < list.size() - 1) {
                long jM3947unboximpl = list.get(i3).m3947unboximpl();
                long jM3947unboximpl2 = list.get(i3 + 1).m3947unboximpl();
                this.internalCanvas.drawLine(Offset.m3937getXimpl(jM3947unboximpl), Offset.m3938getYimpl(jM3947unboximpl), Offset.m3937getXimpl(jM3947unboximpl2), Offset.m3938getYimpl(jM3947unboximpl2), paintAsFrameworkPaint);
                i3 += i2;
            }
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawRawPoints-O7TthRY, reason: not valid java name */
    public void mo4039drawRawPointsO7TthRY(int i2, float[] fArr, Paint paint) {
        if (fArr.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        if (!PointMode.m4479equalsimpl0(i2, PointMode.Companion.m4483getLinesr_lszbg())) {
            if (PointMode.m4479equalsimpl0(i2, PointMode.Companion.m4485getPolygonr_lszbg())) {
                drawRawLines(fArr, paint, 1);
                return;
            } else {
                if (PointMode.m4479equalsimpl0(i2, PointMode.Companion.m4484getPointsr_lszbg())) {
                    drawRawPoints(fArr, paint, 2);
                    return;
                }
                return;
            }
        }
        drawRawLines(fArr, paint, 2);
    }

    private final void drawRawPoints(float[] fArr, Paint paint, int i2) {
        if (fArr.length % 2 == 0) {
            android.graphics.Paint paintAsFrameworkPaint = paint.asFrameworkPaint();
            int i3 = 0;
            while (i3 < fArr.length - 1) {
                this.internalCanvas.drawPoint(fArr[i3], fArr[i3 + 1], paintAsFrameworkPaint);
                i3 += i2;
            }
        }
    }

    private final void drawRawLines(float[] fArr, Paint paint, int i2) {
        if (fArr.length < 4 || fArr.length % 2 != 0) {
            return;
        }
        android.graphics.Paint paintAsFrameworkPaint = paint.asFrameworkPaint();
        int i3 = 0;
        while (i3 < fArr.length - 3) {
            this.internalCanvas.drawLine(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3], paintAsFrameworkPaint);
            i3 += i2 * 2;
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawVertices-TPEHhCM, reason: not valid java name */
    public void mo4040drawVerticesTPEHhCM(Vertices vertices, int i2, Paint paint) {
        this.internalCanvas.drawVertices(AndroidVertexMode_androidKt.m4084toAndroidVertexModeJOOmi9M(vertices.m4580getVertexModec2xauaI()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.asFrameworkPaint());
    }

    private final void drawPoints(List<Offset> list, Paint paint) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            long jM3947unboximpl = list.get(i2).m3947unboximpl();
            this.internalCanvas.drawPoint(Offset.m3937getXimpl(jM3947unboximpl), Offset.m3938getYimpl(jM3947unboximpl), paint.asFrameworkPaint());
        }
    }
}
