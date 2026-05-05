package com.rncamerakit.barcode;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import com.rncamerakit.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.QB;
import yg.Xu;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjG6L͜P.hS2\u000fq{<$q$yCA[\"}0\u0010WȞog|Jb\u000bI\u000f\u000e\u0016\u000fj4I[\u0006s܈-Yrom2\u0006ndyk\u0005:\u0013 J\"fzڱ\u0005\u001a8JX|\tXc\f@F\u0007p\u0003`\u001bd\u001d\u001a@\u001cn$\u000f6tg|O\u000fl&P==\u001bipdWc>\u0015e\rtmW\u0011\u0005|6+nK{\u0015ma\u0011#j[m\u0019ouK\u0005\u0001'U,\u0010s Df\u001d,\u0015Ye=a\u0001>t\u0005\u007fyR9seqih\u000eV\u000e+\u007f\u001b[\u001c\u000e4-x2;:~\b<9;\u0005\u001cN^#vB.\u0011\u0012<\u001d$\u000eUC9Il\u001aoI<f7*\u001b=$1%\u0007#qS<d])b\u001di1\u007fVmNT\tgc\u0006\u0004\u001fhR6\u00123_\u007f]\u007fgч#É;[A\u05faqw\u0010M\\g%\u000b7è_ׂVHH̎?\"E1!\f\tL;ʐwÏXX4Ҋ\u001e(b\u0010\u0016\bA&3ɿHƼ)\u0010Vи9\u0002xWu\nS:=Ƅeˇo\u001a_ުv5;]q\u001d\u0002T|\"MK3\u0011fvZS:`3̨.ĘLj\u0018ǮLP\\\u001d+2myrؼ8֞\u001d\\\u001dǽS*PS\u0015\t\u000e`?ɰ\u000bՁ7$\u000bǭt\u0001\u0017\u0014h\\\u001f\u0004>ձUض\u0001`*Ί۴U]"}, d2 = {"\u001ab^:\"9GQ\u0015\u0007zk(\u0003\r>/|$\t>\u000b\u0016\u0017\u0011L\nIt/4Y^-3u\u0016\u0004", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "0`a0b+>4&z\u0003^\u001a\u0001\u001e/", "\u001a`]1e6BRb\u000f\nb3Fv3z\u007f}", "0na1X9&O&\u0001~g", "", "0na1X9)O\u001d\b\n", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&l", "4qP:X\u000f>W\u001b\u0002\n", "4qP:X\u0019>Q(", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "5dc\u0013e(FS\u0006~xm", "u(;.a+K]\u001d}D`9x\u00142i}6E-\u0001\u0015&\u001d", "Adc\u0013e(FS\u0006~xm", "uKP;W9HW\u0018H|k(\b\f3c\u000eqh@~&l\u000b`", "4qP:X\u001eBR(\u0002", ":`b2e\u0017:W\"\u000e", ":`b2e ", ">qTC\\6Nay\fvf,k\r7e", "", "1`[0h3:b\u0019_\bZ4|u/c\u000f", "", "2qPD56KR\u0019\f", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "2qPD?(LS&", "Bh\\283:^'~y", "7mXA", "=m3?T>", "=m<2T:N`\u0019", "EhSA[\u0014>O'\u000f\b^\u001a\b\t-", "6dX4[;&S\u0015\r\u000bk,j\u0014/c", "Adc\u0013e(FSv\t\u0002h9", "0na1X9\u001c] \t\b", "Adc\u0013e(FS\u0007\u0003\u0010^", "Ahi2", "Adc\u0019T:>`v\t\u0002h9", ":`b2e\nHZ#\f", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^sz\u00057e\r$CF\u0005&\u0011To\u0015<r35"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class BarcodeFrame extends View {
    private static final int ANIMATION_SPEED = 4;
    public static final Companion Companion = new Companion(null);
    private static final Size DEFAULT_SIZE = new Size(300, 150);
    private static final int STROKE_WIDTH = 5;
    private Size barcodeFrameSize;
    private int borderMargin;
    private Paint borderPaint;
    private int frameHeight;
    private Rect frameRect;
    private int frameWidth;
    private Paint laserPaint;
    private int laserY;
    private long previousFrameTime;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007f\u0007lj?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\fa(~:\t}P>˪AН^\u000bKƤV\"\u0007mDI\u0004|4܋\u0011̓FoG\u074c\u001e{K>xtd\u0007v݈tأ}\u0005\tɝݻL\u0016"}, d2 = {"\u001ab^:\"9GQ\u0015\u0007zk(\u0003\r>/|$\t>\u000b\u0016\u0017\u0011L\nIt/4Y^-3u\u0016l+MCv0'\u0019rj\u000f", "", "u(E", "\u000fM8\u001a4\u001b\"=\u0002xhI\f\\g", "", "\u0012D5\u000eH\u0013-M\u0007bo>", "\u001a`]1e6BRb\u000f\nb3Fv3z\u007f}", "!SA\u001c>\f8E|]iA", "@dP0gsGO(\u0003\f^sz\u00057e\r$CF\u0005&\u0011To\u0015<r35"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeFrame(Context context) throws Throwable {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.borderPaint = new Paint();
        this.laserPaint = new Paint();
        this.frameRect = new Rect();
        this.barcodeFrameSize = DEFAULT_SIZE;
        this.previousFrameTime = System.currentTimeMillis();
        init(context);
    }

    private final void calculateFrameRect() throws Throwable {
        float width = this.barcodeFrameSize.getWidth();
        Context context = getContext();
        short sXd = (short) (C1633zX.Xd() ^ (-14412));
        short sXd2 = (short) (C1633zX.Xd() ^ (-2415));
        int[] iArr = new int["n\u0013d\\gn\u0018GjQ7L7[1\u0015[\u0019D&\u00159K".length()];
        QB qb = new QB("n\u0013d\\gn\u0018GjQ7L7[1\u0015[\u0019D&\u00159K");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Ig.wd("`8\u0017S%]\u0004(aIO9", (short) (Od.Xd() ^ (-1974))), new Class[0]);
        try {
            method.setAccessible(true);
            float f2 = width * ((Resources) method.invoke(context, objArr)).getDisplayMetrics().density;
            float height = this.barcodeFrameSize.getHeight();
            Context context2 = getContext();
            Class<?> cls = Class.forName(EO.Od(".\u0013VDi9\u0010)&UVv3B\u001cna\fRp9\u0004\u0012", (short) (C1580rY.Xd() ^ (-4561))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd3 = (short) (Od.Xd() ^ (-10280));
            int[] iArr2 = new int["(%3\u0010\"/*/+\u001b\u001c)".length()];
            QB qb2 = new QB("(%3\u0010\"/*/+\u001b\u001c)");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method2.setAccessible(true);
                float f3 = height * ((Resources) method2.invoke(context2, objArr2)).getDisplayMetrics().density;
                this.frameWidth = Math.max(100, Math.min((int) f2, getMeasuredWidth() - 80));
                this.frameHeight = Math.max(100, Math.min((int) f3, getMeasuredHeight() - 80));
                this.frameRect.left = (getMeasuredWidth() / 2) - (this.frameWidth / 2);
                this.frameRect.right = (getMeasuredWidth() / 2) + (this.frameWidth / 2);
                this.frameRect.top = (getMeasuredHeight() / 2) - (this.frameHeight / 2);
                this.frameRect.bottom = (getMeasuredHeight() / 2) + (this.frameHeight / 2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private final void drawBorder(Canvas canvas) {
        canvas.drawLine(this.frameRect.left, this.frameRect.top, this.frameRect.left, this.frameRect.top + this.borderMargin, this.borderPaint);
        canvas.drawLine(this.frameRect.left, this.frameRect.top, this.frameRect.left + this.borderMargin, this.frameRect.top, this.borderPaint);
        canvas.drawLine(this.frameRect.left, this.frameRect.bottom, this.frameRect.left, this.frameRect.bottom - this.borderMargin, this.borderPaint);
        canvas.drawLine(this.frameRect.left, this.frameRect.bottom, this.frameRect.left + this.borderMargin, this.frameRect.bottom, this.borderPaint);
        canvas.drawLine(this.frameRect.right, this.frameRect.top, this.frameRect.right - this.borderMargin, this.frameRect.top, this.borderPaint);
        canvas.drawLine(this.frameRect.right, this.frameRect.top, this.frameRect.right, this.frameRect.top + this.borderMargin, this.borderPaint);
        canvas.drawLine(this.frameRect.right, this.frameRect.bottom, this.frameRect.right, this.frameRect.bottom - this.borderMargin, this.borderPaint);
        canvas.drawLine(this.frameRect.right, this.frameRect.bottom, this.frameRect.right - this.borderMargin, this.frameRect.bottom, this.borderPaint);
    }

    private final void drawLaser(Canvas canvas, long j2) {
        if (this.laserY > this.frameRect.bottom || this.laserY < this.frameRect.top) {
            this.laserY = this.frameRect.top;
        }
        canvas.drawLine(this.frameRect.left + 5, this.laserY, this.frameRect.right - 5, this.laserY, this.laserPaint);
        this.laserY += (int) (j2 / ((long) 4));
    }

    private final void init(Context context) throws Throwable {
        Paint paint = new Paint();
        this.borderPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.borderPaint.setStrokeWidth(5.0f);
        this.laserPaint.setStyle(Paint.Style.STROKE);
        this.laserPaint.setStrokeWidth(5.0f);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("bpgvtok6lyy\u0001r|\u0004>T\u0002\u0002\tz\u000f\f", (short) (C1633zX.Xd() ^ (-18168)), (short) (C1633zX.Xd() ^ (-1670)))).getMethod(C1561oA.od("/,:\u0017)6162\"#0", (short) (C1580rY.Xd() ^ (-13509))), new Class[0]);
        try {
            method.setAccessible(true);
            this.borderMargin = ((Resources) method.invoke(context, objArr)).getDimensionPixelSize(R.dimen.border_length);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final Rect getFrameRect() {
        return this.frameRect;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        long jCurrentTimeMillis = System.currentTimeMillis() - this.previousFrameTime;
        super.onDraw(canvas);
        drawBorder(canvas);
        drawLaser(canvas, jCurrentTimeMillis);
        this.previousFrameTime = System.currentTimeMillis();
        invalidate(this.frameRect);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) throws Throwable {
        super.onMeasure(i2, i3);
        calculateFrameRect();
    }

    public final void setFrameColor(int i2) {
        this.borderPaint.setColor(i2);
    }

    public final void setFrameRect(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<set-?>");
        this.frameRect = rect;
    }

    public final void setFrameSize(Size size) {
        if (size == null) {
            size = DEFAULT_SIZE;
        }
        this.barcodeFrameSize = size;
        calculateFrameRect();
    }

    public final void setLaserColor(int i2) {
        this.laserPaint.setColor(i2);
    }
}
