package androidx.compose.ui.graphics.layer;

import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.core.os.HandlerCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1580rY;
import yg.InterfaceC1492Gx;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

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
/* JADX INFO: compiled from: LayerManager.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4D\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000f\u0002{<řc$\u007fLC٥\"}8\tWȞog|Jb\u000bI\u0012\u000e\u0016\u000fj4I[zc܈%˰`\no3{nu8z5A\u0015$@\"Py3\u0002ʀ.H\u001exCGY\u001c*0n\u0002\u0003V\u001b_\u001d\u001a@\u0013\u0007,\u000f1tg|GxpkNG#1t\u000bb5tH|{\u001ev^5#\u000fg.-P7c SjI\u0007\u001bgM\u001bWqk\u0016\u0019+5?as\u0006A!\u0004\".CO;nC5j\u0005i`:(˦SiSִ&*}}\n\u0011\r\u0010\u001c\u000b?H\\3pǔ\nԧ7tzԟ\u0011^\u0010eZ\u0002\u0011`d\u001f{ı?ڢ=\u001bnϟ2M'WO\u0002\u0015\u000f.#/yOe+טbڠ\u001fT\u007f\u0383\u0002]NI`N8f\u0014Ъ\u0010Ͳf\u00022ʶ\u0001[\u000e=\u0014\u0019>\u001957\nD9 \u001a\u0011\u001fֶsЛ\t`pׅ\u05c8Vc"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7|*aCHS0'\u0011jaF\\", "", "1`]CT:!] }zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{x8TB;x\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7y)Hi$\u0011WJ:kAsXY", "5dc\u0010T5OO'a\u0005e+|\u0016", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#[\u001c@~\u0012<0MBj4+j", "6`]1_,K", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "7lP4X\u0019>O\u0018~\b", "\u001a`]1e6BRb\u0007z]0xR\u0013m{*{-\u0001\u0013\u0016G|c", ":`h2e\u001a>b", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r D[\u0016=#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", ">da@\\:MS\"|zB;|\u0016+t\u00042\u0005$\n\u0002$Qq\u001b<\u00053", "", ">nbAc6GS\u0018kze,x\u0017/R\u007f4\f@\u000f&%", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001eq$=#", "2dbAe6R", "", "6`b\u0016`(@S\u0006~v],\n", ">da@\\:M", ":`h2e", ">da@\\:M:\u0015\u0013zk:", ":`h2e:", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u0015\u0013V~\u000eId%D/", "@d[2T:>", "CoS.g,%O-~\bI,\n\u00173s\u000f(\u0005>\u0001", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LayerManager {
    public static final Companion Companion = new Companion(null);
    private static final boolean isRobolectric;
    private final CanvasHolder canvasHolder;
    private final Handler handler;
    private ImageReader imageReader;
    private final MutableScatterSet<GraphicsLayer> layerSet = ScatterSetKt.mutableScatterSetOf();
    private boolean persistenceIterationInProgress;
    private MutableObjectList<GraphicsLayer> postponedReleaseRequests;

    public LayerManager(CanvasHolder canvasHolder) throws Throwable {
        this.canvasHolder = canvasHolder;
        short sXd = (short) (ZN.Xd() ^ 13220);
        short sXd2 = (short) (ZN.Xd() ^ 5223);
        int[] iArr = new int["P\u0002\u0011jHG,v\u0015x0/\u001cABci".length()];
        QB qb = new QB("P\u0002\u0011jHG,v\u0015x0/\u001cABci");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(ZO.xd("lM=\u0011S\u0005\u0018\u000bdkUhv", (short) (C1580rY.Xd() ^ (-18518)), (short) (C1580rY.Xd() ^ (-22629))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.handler = HandlerCompat.createAsync((Looper) declaredMethod.invoke(null, objArr), new Handler.Callback() { // from class: androidx.compose.ui.graphics.layer.LayerManager$$ExternalSyntheticLambda1
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return LayerManager.handler$lambda$0(this.f$0, message);
                }
            });
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    public static final boolean handler$lambda$0(LayerManager layerManager, Message message) {
        layerManager.persistLayers(layerManager.layerSet);
        return true;
    }

    public final void persist(GraphicsLayer graphicsLayer) {
        this.layerSet.add(graphicsLayer);
        if (this.handler.hasMessages(0)) {
            return;
        }
        this.handler.sendMessageAtFrontOfQueue(Message.obtain());
    }

    public final void release(GraphicsLayer graphicsLayer) {
        if (!this.persistenceIterationInProgress) {
            if (this.layerSet.remove(graphicsLayer)) {
                graphicsLayer.discardDisplayList$ui_graphics_release();
            }
        } else {
            MutableObjectList<GraphicsLayer> mutableObjectList = this.postponedReleaseRequests;
            if (mutableObjectList == null) {
                mutableObjectList = new MutableObjectList<>(0, 1, null);
                this.postponedReleaseRequests = mutableObjectList;
            }
            mutableObjectList.add(graphicsLayer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void persistLayers(androidx.collection.ScatterSet<androidx.compose.ui.graphics.layer.GraphicsLayer> r21) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.LayerManager.persistLayers(androidx.collection.ScatterSet):void");
    }

    public static final void persistLayers$lambda$3$lambda$2(ImageReader imageReader) {
        Image imageAcquireLatestImage;
        if (imageReader == null || (imageAcquireLatestImage = imageReader.acquireLatestImage()) == null) {
            return;
        }
        imageAcquireLatestImage.close();
    }

    public final void destroy() {
        ImageReader imageReader = this.imageReader;
        if (imageReader != null) {
            imageReader.close();
        }
        this.imageReader = null;
    }

    public final boolean hasImageReader() {
        return this.imageReader != null;
    }

    public final void updateLayerPersistence() {
        destroy();
        persistLayers(this.layerSet);
    }

    /* JADX INFO: compiled from: LayerManager.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146B\u0005\"2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimoX]ŸG\u0013"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7|*aCHS0'\u0011jaFEA6V\u0002#PPX52", "", "u(E", "7rA<U6ES\u0017\u000e\bb*", "", "u(I", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isRobolectric() {
            return LayerManager.isRobolectric;
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        isRobolectric = Intrinsics.areEqual(lowerCase, "robolectric");
    }
}
