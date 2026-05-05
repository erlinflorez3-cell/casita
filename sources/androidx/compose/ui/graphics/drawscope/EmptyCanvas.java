package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Vertices;
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
/* JADX INFO: compiled from: EmptyCanvas.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яď\u0014D57\u001eq\u007fZDkt\nA\u000e0\u0019.Jչ*,(w\u000f߿r9FDmH4T[*\u001dp\u00044*`,qY;]\u001a\u0004'\u0011O\\poñRZ!C\u0017\u0006\u001cxr,_U\u0001]\u0018\u0012:B\u0006?;Mu@A`\u000b6\rړ:\"Ny\r\u0001 5P\u0010\rzKŷ\u0014\u0012>^x:X\u000eU\u0005($\u000e>&\u0007&\\}N>ԟt]P/+\u0003oIV'u0\u0005M\u0013LZ܋#Ǹ\u0012\u001eY?w8չ)S\u0011\u0007\u001b{M\u0004Wqk\u0007\u0019+5.as\u0006:\t\u0004\"\u001aCO;c9:ڑ\u0004ĩԃ\u0010)1VqS\u0019F6\u0001\u0013{;>4\u0012\u00141`.[%\u0017\f\u001c?\rr\u0002K\u0001\u0006lO\u0018z\u0010AG)\u000eAC9Iq\u0002eI\u001ef7*\u000bS2ƹ\u007f͙Ĳ_V\u0014o#+\u001d\u0010_Bi@kJ~\u000egO\u0006\u0004\u001fuH>̯/ϚĬ3}\u0017B%:\u007faG99k0J\u000b{?Kn\u007fki\u0001Jp&| O*7\u0017\u000bHr\u0011\u0004P\u0003c\\\u0015[)l\u0007,\u0013C$j\u0006T!S\u001b~Sv\u0002\u0003M\f\u0015U3tPqn\u001a\u0019\b=lMMQ\u0012+\u0012V\u00050W<\u0011\"\u001fz\u000b{\u001axt(P4xn\u001e\u0017\u0014D|,C6M\u001344Z<I`#d\u001b\u001ep^C\u001dߙYӐʐ\u0003V9F\u0011\rl\u001d\u0017%h\\\u001fq\u0018|WQ\u0015`PSqUC@>UP\td\u00011#\u0017s.d.`ݺK˾טyW\u0002H$C\u0002\u0012=g+\u000f-+b\u0006;jdr\u0014w}\u00165&\u0015y=g\u00192u5\u0003pZ\u000f\u001bN]\u0004/\"%\u000b#'\u0016\u0015\u0018y\u0010t+Kqp#[lf9\u0017̔;Ѿ̞\u0001\u0007%O338J\u000bhECU\u001fF{\"c-a\f\n 2\b\u0018'&#\u000640q2\bb\u007fzxOϨHʲ˽B$*#\u0011y\u0011\u0019\u0006@Z\tb\u000fcLOn\tVfX;3\fr\u001f,;{\u0007_H \b}b9\u0010.\u0002Q\u0016\u0014\rNU\u0015[o\u007fm\u001ch#\u001f\u0013%\u0018D\u00141\u001d\u0014LA.Yob746w&RY;\u0011\"\u0003\u001dlb:v \u000bqV\u001a\n\u001e6\u0018F\u000eKG<P1S\\\u001eV\t\\\u0005h3\u001fud/F\u0019~=Pd\rî0܊֪JV5#@A\u001cE\u0017\\\u0003O-hU/R\u0010Q\u001bV\u00151\u000fS\u001b[I0x4K7\n\u0004o:U^\u0011ށAȰê=S\u0017#\u0005t'9c*fd%\u0014\u0017V\\,A~)\b>@\u0018\u001b#\u0019}} f;YfweNJ\u0005%RA\u0007:\b\u0014J)I\u001e5[Z\u0010~\\e\n\u001ek;,\nP$5\u000e\r!\u000bb>j\u0018i3:D|Ff\u0010\u0016+PN\u000f^N\u0003\u0001\".6A\u007f\u0006AI+^\bv(%NoCl4M{l\u0007&{l\u0012\f\u001c\u001fK\u000f? \u0012n[RM\r5\u0018F\u0013\u0007&j\u0015alp\u0011.aE*-R bW-\u0016wإoաϪ_\u000f1}yy*7>#6}M{<\u0018rZ6fSV{@+\u001d%zP*&^\u0019*\u0015x\u001a|,|-S%%[:TG6d]9_3$#U6\u001f\u0004sKV%?)W\u001be\n;s6\u0013)\u0003h\u007f;\u0014rX\u0017K\u0018gZ/vXKs?YRx\u0015\u00074&]8p\u0013r%V'=6P l^J I+KAG\u001c1\u0019F`\b\u0007G@1e\u001c;8]\u0015\u0001;A*5y\u0018\f7!._\u0013}yofi0{y͚'\u0011\nhPԏi\u0012Uֈe\f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001bs?-)F]B\u0018_:$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "u(E", "1kX=C(MV", "", ">`c5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "1kX=B7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013`\u0002+!xk", "1kX=C(MV`\u0007\nk+[P\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:Cyq>", "1kX=E,<b", ":dUA", "", "Bn_", "@hV5g", "0ncAb4", "1kX=E,<b`gtBv\u0004\t1", "uE5\u00139\u0010\u0002D", "1n]0T;", ";`c?\\?", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", "1n]0T;\u0006#k{`[\u001ez", "uZ5uI", "2hb.U3>H", "2qPD49<", "AsP?g\bGU ~", "AvT2c\bGU ~", "CrT\u0010X5MS&", "", ">`X;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", "2qPD60KQ ~", "1d]AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "@`S6h:", "2qPD60KQ ~B2\u0012`p=z\n", "uI5\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`I|\nGy)3gG\u000b3q\u001f=#\u0007,", "2qPD<4:U\u0019", "7lP4X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FA", "Bn_\u0019X-M=\u001a\u007f\t^;", "2qPD<4:U\u0019Fy&z|\u0007\u0001I", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\n\u0003{dj8\u0014m0M\npEVV7f`r\u0007$\u0016$\u0010['\u0018\b]?28/3#\u0011;\u001fE,", "2qPD<4:U\u0019kz\\;", "AqR\u001cY-LS(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "AqR \\A>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "2rc\u001cY-LS(", "2rc \\A>", "2qPD<4:U\u0019kz\\;Dk\u001aB\u000b5\u0006\u000b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\n\u0003yMF \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u001eRt\u000f\u0012UL'rBEhr(M\u000bJ>D|", "2qPD?0GS", ">0", ">1", "2qPD?0GS`p\u0001hw{Z1", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`I|\nGy)3gG\u000b3q\u001f=#\u0007,", "2qPDB=:Z", "2qPDC(MV", "2qPDC6B\\(\r", ">nX;g\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n c\u0002)FU -M\u0019", ">nX;g:", "", "2qPDC6B\\(\rBH}k\u00182Rs", "uH;7T=:\u001d)\u000e~euc\r=tU\u000fwI\u007f$!Kn!\u0006t/=d\b.77&2\u0017EHg?!\u0019fo\u0003q_0W\u0006|\u000b=", "2qPDE(P>#\u0003\u0004m:", "", "2qPDE(P>#\u0003\u0004m:Dr\u0001T\u000f+h4", "uHJ\u0013?(GR&\t~]?F\u00079m\u000b2\n@J'\u001b\u0011q\u001b8\u0002(9W\fi\"i\u001a7\\\u0019~\\", "2qPDE,<b", "2qPDE6N\\\u0018kz\\;", "@`S6h:1", "@`S6h:2", "2qPDI,Kb\u001d|zl", "DdaA\\*>a", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n&Y\u000b/;k\u0016<#", "0kT;W\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "2qPDI,Kb\u001d|zlsks\u000fH\u0003\u0006c", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~J}-Fq\u0014.[\u0019\u001fR0'\u0014uk=\u0006vuL\u0001/RV\\,&bv\u0007\u0016\u001fV\u0019Q/\u000b\u0013#, rMFtK\u001d", "3mP/_,3", "@dbAb9>", "@nc.g,", "2dV?X,L", "A`e2", "A`e2?(RS&", "0nd;W:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "AbP9X", "Aw", "Ax", "AjTD", "BqP;f3:b\u0019", "2w", "2x", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class EmptyCanvas implements Canvas {
    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(Rect rect, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float f2, float f3) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float f2, float f3) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float f2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skew(float f2, float f3) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: concat-58bKbWc */
    public void mo4033concat58bKbWc(float[] fArr) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipRect-N_I0leg */
    public void mo4032clipRectN_I0leg(float f2, float f3, float f4, float f5, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipPath-mtrdD-E */
    public void mo4031clipPathmtrdDE(Path path, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawLine-Wko1d7g */
    public void mo4037drawLineWko1d7g(long j2, long j3, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float f2, float f3, float f4, float f5, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float f2, float f3, float f4, float f5, float f6, float f7, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(float f2, float f3, float f4, float f5, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawCircle-9KIMszo */
    public void mo4034drawCircle9KIMszo(long j2, float f2, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImage-d-4ec7I */
    public void mo4035drawImaged4ec7I(ImageBitmap imageBitmap, long j2, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImageRect-HPBpro0 */
    public void mo4036drawImageRectHPBpro0(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawPoints-O7TthRY */
    public void mo4038drawPointsO7TthRY(int i2, List<Offset> list, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawRawPoints-O7TthRY */
    public void mo4039drawRawPointsO7TthRY(int i2, float[] fArr, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawVertices-TPEHhCM */
    public void mo4040drawVerticesTPEHhCM(Vertices vertices, int i2, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        throw new UnsupportedOperationException();
    }
}
