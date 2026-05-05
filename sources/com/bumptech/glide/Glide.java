package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.InputStreamRewinder;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.prefill.BitmapPreFiller;
import com.bumptech.glide.load.engine.prefill.PreFillType;
import com.bumptech.glide.load.model.AssetUriLoader;
import com.bumptech.glide.load.model.ByteArrayLoader;
import com.bumptech.glide.load.model.ByteBufferEncoder;
import com.bumptech.glide.load.model.ByteBufferFileLoader;
import com.bumptech.glide.load.model.DataUrlLoader;
import com.bumptech.glide.load.model.FileLoader;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.MediaStoreFileLoader;
import com.bumptech.glide.load.model.ResourceLoader;
import com.bumptech.glide.load.model.StreamEncoder;
import com.bumptech.glide.load.model.StringLoader;
import com.bumptech.glide.load.model.UnitModelLoader;
import com.bumptech.glide.load.model.UriLoader;
import com.bumptech.glide.load.model.UrlUriLoader;
import com.bumptech.glide.load.model.stream.HttpGlideUrlLoader;
import com.bumptech.glide.load.model.stream.HttpUriLoader;
import com.bumptech.glide.load.model.stream.MediaStoreImageThumbLoader;
import com.bumptech.glide.load.model.stream.MediaStoreVideoThumbLoader;
import com.bumptech.glide.load.model.stream.QMediaStoreUriLoader;
import com.bumptech.glide.load.model.stream.UrlLoader;
import com.bumptech.glide.load.resource.bitmap.BitmapDrawableDecoder;
import com.bumptech.glide.load.resource.bitmap.BitmapDrawableEncoder;
import com.bumptech.glide.load.resource.bitmap.BitmapEncoder;
import com.bumptech.glide.load.resource.bitmap.ByteBufferBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.ByteBufferBitmapImageDecoderResourceDecoder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.ExifInterfaceImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.InputStreamBitmapImageDecoderResourceDecoder;
import com.bumptech.glide.load.resource.bitmap.ParcelFileDescriptorBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.ResourceBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.StreamBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.UnitBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.bytes.ByteBufferRewinder;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.load.resource.drawable.UnitDrawableDecoder;
import com.bumptech.glide.load.resource.file.FileDecoder;
import com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableEncoder;
import com.bumptech.glide.load.resource.gif.GifFrameResourceDecoder;
import com.bumptech.glide.load.resource.gif.StreamGifDecoder;
import com.bumptech.glide.load.resource.transcode.BitmapBytesTranscoder;
import com.bumptech.glide.load.resource.transcode.BitmapDrawableTranscoder;
import com.bumptech.glide.load.resource.transcode.DrawableBytesTranscoder;
import com.bumptech.glide.load.resource.transcode.GifDrawableBytesTranscoder;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.module.GlideModule;
import com.bumptech.glide.module.ManifestParser;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ImageViewTargetFactory;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import com.drew.metadata.iptc.IptcDirectory;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class Glide implements ComponentCallbacks2 {
    private static final String DEFAULT_DISK_CACHE_DIR = "image_manager_disk_cache";
    private static final String TAG = "Glide";
    private static volatile Glide glide = null;
    private static volatile boolean isInitializing = false;
    private final ArrayPool arrayPool;
    private final BitmapPool bitmapPool;
    private BitmapPreFiller bitmapPreFiller;
    private final ConnectivityMonitorFactory connectivityMonitorFactory;
    private final RequestOptionsFactory defaultRequestOptionsFactory;
    private final Engine engine;
    private final GlideContext glideContext;
    private final MemoryCache memoryCache;
    private final Registry registry;
    private final RequestManagerRetriever requestManagerRetriever;
    private final List<RequestManager> managers = new ArrayList();
    private MemoryCategory memoryCategory = MemoryCategory.NORMAL;

    public interface RequestOptionsFactory {
        RequestOptions build();
    }

    Glide(Context context, Engine engine, MemoryCache memoryCache, BitmapPool bitmapPool, ArrayPool arrayPool, RequestManagerRetriever requestManagerRetriever, ConnectivityMonitorFactory connectivityMonitorFactory, int i2, RequestOptionsFactory requestOptionsFactory, Map<Class<?>, TransitionOptions<?, ?>> map, List<RequestListener<Object>> list, boolean z2, boolean z3) throws Throwable {
        ResourceDecoder byteBufferBitmapDecoder;
        ResourceDecoder streamBitmapDecoder;
        this.engine = engine;
        this.bitmapPool = bitmapPool;
        this.arrayPool = arrayPool;
        this.memoryCache = memoryCache;
        this.requestManagerRetriever = requestManagerRetriever;
        this.connectivityMonitorFactory = connectivityMonitorFactory;
        this.defaultRequestOptionsFactory = requestOptionsFactory;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("\u007f\u000e\u0005\u0014\n\u0005\u0001K\n\u0017\u0017\u001e\b\u0012\u0019Sq\u001f\u001f&\u0010$!", (short) (Od.Xd() ^ (-2354)))).getMethod(Qg.kd("mjxUgtotp`an", (short) (OY.Xd() ^ 4825), (short) (OY.Xd() ^ 11467)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            Registry registry = new Registry();
            this.registry = registry;
            registry.register(new DefaultImageHeaderParser());
            if (Build.VERSION.SDK_INT >= 27) {
                registry.register(new ExifInterfaceImageHeaderParser());
            }
            List<ImageHeaderParser> imageHeaderParsers = registry.getImageHeaderParsers();
            ByteBufferGifDecoder byteBufferGifDecoder = new ByteBufferGifDecoder(context, imageHeaderParsers, bitmapPool, arrayPool);
            ResourceDecoder<ParcelFileDescriptor, Bitmap> resourceDecoderParcel = VideoDecoder.parcel(bitmapPool);
            Downsampler downsampler = new Downsampler(registry.getImageHeaderParsers(), resources.getDisplayMetrics(), bitmapPool, arrayPool);
            if (!z3 || Build.VERSION.SDK_INT < 28) {
                byteBufferBitmapDecoder = new ByteBufferBitmapDecoder(downsampler);
                streamBitmapDecoder = new StreamBitmapDecoder(downsampler, arrayPool);
            } else {
                streamBitmapDecoder = new InputStreamBitmapImageDecoderResourceDecoder();
                byteBufferBitmapDecoder = new ByteBufferBitmapImageDecoderResourceDecoder();
            }
            ResourceDrawableDecoder resourceDrawableDecoder = new ResourceDrawableDecoder(context);
            ResourceLoader.StreamFactory streamFactory = new ResourceLoader.StreamFactory(resources);
            ResourceLoader.UriFactory uriFactory = new ResourceLoader.UriFactory(resources);
            ResourceLoader.FileDescriptorFactory fileDescriptorFactory = new ResourceLoader.FileDescriptorFactory(resources);
            ResourceLoader.AssetFileDescriptorFactory assetFileDescriptorFactory = new ResourceLoader.AssetFileDescriptorFactory(resources);
            BitmapEncoder bitmapEncoder = new BitmapEncoder(arrayPool);
            BitmapBytesTranscoder bitmapBytesTranscoder = new BitmapBytesTranscoder();
            GifDrawableBytesTranscoder gifDrawableBytesTranscoder = new GifDrawableBytesTranscoder();
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(hg.Vd("\u001f+ -)\"\u001cd\u0019$\"'\u0017\u001f$\\p\u001c\u001a\u001f\u000f!\u001c", (short) (Od.Xd() ^ (-24688)), (short) (Od.Xd() ^ (-3890)))).getMethod(C1561oA.ud("\u0013\u0010\u001ek\u0017\u0015\u001a\n\u0012\u0017s\u0006\u0013\u000e\n\u0013\u0001\r", (short) (FB.Xd() ^ 28257)), new Class[0]);
            try {
                method2.setAccessible(true);
                ContentResolver contentResolver = (ContentResolver) method2.invoke(context, objArr2);
                Registry registryAppend = registry.append(ByteBuffer.class, new ByteBufferEncoder()).append(InputStream.class, new StreamEncoder(arrayPool));
                short sXd = (short) (FB.Xd() ^ IptcDirectory.TAG_COUNTRY_OR_PRIMARY_LOCATION_NAME);
                int[] iArr = new int["t\u001d%\u001f\u0010 ".length()];
                QB qb = new QB("t\u001d%\u001f\u0010 ");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i3));
                    i3++;
                }
                String str = new String(iArr, 0, i3);
                registryAppend.append(str, ByteBuffer.class, Bitmap.class, byteBufferBitmapDecoder).append(str, InputStream.class, Bitmap.class, streamBitmapDecoder);
                if (ParcelFileDescriptorRewinder.isSupported()) {
                    registry.append(str, ParcelFileDescriptor.class, Bitmap.class, new ParcelFileDescriptorBitmapDecoder(downsampler));
                }
                Registry registryAppend2 = registry.append(str, ParcelFileDescriptor.class, Bitmap.class, resourceDecoderParcel).append(str, AssetFileDescriptor.class, Bitmap.class, VideoDecoder.asset(bitmapPool)).append(Bitmap.class, Bitmap.class, UnitModelLoader.Factory.getInstance()).append(str, Bitmap.class, Bitmap.class, new UnitBitmapDecoder()).append(Bitmap.class, (ResourceEncoder) bitmapEncoder);
                BitmapDrawableDecoder bitmapDrawableDecoder = new BitmapDrawableDecoder(resources, byteBufferBitmapDecoder);
                String strYd = C1561oA.Yd("l\u0015!\u001b\u0010 t$\u0014+\u0016\u0018#\u001d", (short) (ZN.Xd() ^ 5192));
                Registry registryAppend3 = registryAppend2.append(strYd, ByteBuffer.class, BitmapDrawable.class, bitmapDrawableDecoder).append(strYd, InputStream.class, BitmapDrawable.class, new BitmapDrawableDecoder(resources, streamBitmapDecoder)).append(strYd, ParcelFileDescriptor.class, BitmapDrawable.class, new BitmapDrawableDecoder(resources, resourceDecoderParcel)).append(BitmapDrawable.class, (ResourceEncoder) new BitmapDrawableEncoder(bitmapPool, bitmapEncoder));
                StreamGifDecoder streamGifDecoder = new StreamGifDecoder(imageHeaderParsers, byteBufferGifDecoder, arrayPool);
                String strQd = Xg.qd("Svt", (short) (FB.Xd() ^ 31973), (short) (FB.Xd() ^ 3742));
                registryAppend3.append(strQd, InputStream.class, GifDrawable.class, streamGifDecoder).append(strQd, ByteBuffer.class, GifDrawable.class, byteBufferGifDecoder).append(GifDrawable.class, (ResourceEncoder) new GifDrawableEncoder()).append(GifDecoder.class, GifDecoder.class, UnitModelLoader.Factory.getInstance()).append(str, GifDecoder.class, Bitmap.class, new GifFrameResourceDecoder(bitmapPool)).append(Uri.class, Drawable.class, resourceDrawableDecoder).append(Uri.class, Bitmap.class, new ResourceBitmapDecoder(resourceDrawableDecoder, bitmapPool)).register(new ByteBufferRewinder.Factory()).append(File.class, ByteBuffer.class, new ByteBufferFileLoader.Factory()).append(File.class, InputStream.class, new FileLoader.StreamFactory()).append(File.class, File.class, new FileDecoder()).append(File.class, ParcelFileDescriptor.class, new FileLoader.FileDescriptorFactory()).append(File.class, File.class, UnitModelLoader.Factory.getInstance()).register(new InputStreamRewinder.Factory(arrayPool));
                if (ParcelFileDescriptorRewinder.isSupported()) {
                    registry.register(new ParcelFileDescriptorRewinder.Factory());
                }
                Registry registryAppend4 = registry.append(Integer.TYPE, InputStream.class, streamFactory).append(Integer.TYPE, ParcelFileDescriptor.class, fileDescriptorFactory).append(Integer.class, InputStream.class, streamFactory).append(Integer.class, ParcelFileDescriptor.class, fileDescriptorFactory).append(Integer.class, Uri.class, uriFactory).append(Integer.TYPE, AssetFileDescriptor.class, assetFileDescriptorFactory).append(Integer.class, AssetFileDescriptor.class, assetFileDescriptorFactory).append(Integer.TYPE, Uri.class, uriFactory).append(String.class, InputStream.class, new DataUrlLoader.StreamFactory()).append(Uri.class, InputStream.class, new DataUrlLoader.StreamFactory()).append(String.class, InputStream.class, new StringLoader.StreamFactory()).append(String.class, ParcelFileDescriptor.class, new StringLoader.FileDescriptorFactory()).append(String.class, AssetFileDescriptor.class, new StringLoader.AssetFileDescriptorFactory()).append(Uri.class, InputStream.class, new HttpUriLoader.Factory());
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(Jg.Wd("Tg\u0014){()I6I#oU5\u0002.\u001b\u000e\u0003O\n\u0014V", (short) (C1499aX.Xd() ^ (-16956)), (short) (C1499aX.Xd() ^ (-12071)))).getMethod(ZO.xd("d\u000fR7K!/W\u000e", (short) (ZN.Xd() ^ 19687), (short) (ZN.Xd() ^ 3946)), new Class[0]);
                try {
                    method3.setAccessible(true);
                    Registry registryAppend5 = registryAppend4.append(Uri.class, InputStream.class, new AssetUriLoader.StreamFactory((AssetManager) method3.invoke(context, objArr3)));
                    Class<?> cls = Class.forName(C1626yg.Ud("mO('o,uyn\u001a~\u0010\u001a\u001cDT\u0005<Rb^\u0004\u000e", (short) (OY.Xd() ^ 32355), (short) (OY.Xd() ^ 20523)));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr4 = new Object[0];
                    short sXd2 = (short) (OY.Xd() ^ 15990);
                    int[] iArr2 = new int["s\u0019&W\"Lf\u001eY".length()];
                    QB qb2 = new QB("s\u0019&W\"Lf\u001eY");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd2 + i4)));
                        i4++;
                    }
                    Method method4 = cls.getMethod(new String(iArr2, 0, i4), clsArr);
                    try {
                        method4.setAccessible(true);
                        registryAppend5.append(Uri.class, ParcelFileDescriptor.class, new AssetUriLoader.FileDescriptorFactory((AssetManager) method4.invoke(context, objArr4))).append(Uri.class, InputStream.class, new MediaStoreImageThumbLoader.Factory(context)).append(Uri.class, InputStream.class, new MediaStoreVideoThumbLoader.Factory(context));
                        if (Build.VERSION.SDK_INT >= 29) {
                            registry.append(Uri.class, InputStream.class, new QMediaStoreUriLoader.InputStreamFactory(context));
                            registry.append(Uri.class, ParcelFileDescriptor.class, new QMediaStoreUriLoader.FileDescriptorFactory(context));
                        }
                        registry.append(Uri.class, InputStream.class, new UriLoader.StreamFactory(contentResolver)).append(Uri.class, ParcelFileDescriptor.class, new UriLoader.FileDescriptorFactory(contentResolver)).append(Uri.class, AssetFileDescriptor.class, new UriLoader.AssetFileDescriptorFactory(contentResolver)).append(Uri.class, InputStream.class, new UrlUriLoader.StreamFactory()).append(URL.class, InputStream.class, new UrlLoader.StreamFactory()).append(Uri.class, File.class, new MediaStoreFileLoader.Factory(context)).append(GlideUrl.class, InputStream.class, new HttpGlideUrlLoader.Factory()).append(byte[].class, ByteBuffer.class, new ByteArrayLoader.ByteBufferFactory()).append(byte[].class, InputStream.class, new ByteArrayLoader.StreamFactory()).append(Uri.class, Uri.class, UnitModelLoader.Factory.getInstance()).append(Drawable.class, Drawable.class, UnitModelLoader.Factory.getInstance()).append(Drawable.class, Drawable.class, new UnitDrawableDecoder()).register(Bitmap.class, BitmapDrawable.class, new BitmapDrawableTranscoder(resources)).register(Bitmap.class, byte[].class, bitmapBytesTranscoder).register(Drawable.class, byte[].class, new DrawableBytesTranscoder(bitmapPool, bitmapBytesTranscoder, gifDrawableBytesTranscoder)).register(GifDrawable.class, byte[].class, gifDrawableBytesTranscoder);
                        ResourceDecoder<ByteBuffer, Bitmap> resourceDecoderByteBuffer = VideoDecoder.byteBuffer(bitmapPool);
                        registry.append(ByteBuffer.class, Bitmap.class, resourceDecoderByteBuffer);
                        registry.append(ByteBuffer.class, BitmapDrawable.class, new BitmapDrawableDecoder(resources, resourceDecoderByteBuffer));
                        this.glideContext = new GlideContext(context, arrayPool, registry, new ImageViewTargetFactory(), requestOptionsFactory, map, list, engine, z2, i2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    private static void checkAndInitializeGlide(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws Throwable {
        if (isInitializing) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        isInitializing = true;
        initializeGlide(context, generatedAppGlideModule);
        isInitializing = false;
    }

    public static Glide get(Context context) throws Throwable {
        if (glide == null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(EO.Od(":p\u0019KQ\u0018b%\u0005A>f\u0006\t\u0017n8j\u0012$O\u000bU", (short) (C1633zX.Xd() ^ (-2626)))).getMethod(C1561oA.Qd("xu\u0004O}|wsli{otrFqotdvq", (short) (FB.Xd() ^ 6127)), new Class[0]);
            try {
                method.setAccessible(true);
                GeneratedAppGlideModule annotationGeneratedGlideModules = getAnnotationGeneratedGlideModules((Context) method.invoke(context, objArr));
                synchronized (Glide.class) {
                    if (glide == null) {
                        checkAndInitializeGlide(context, annotationGeneratedGlideModules);
                    }
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return glide;
    }

    private static GeneratedAppGlideModule getAnnotationGeneratedGlideModules(Context context) throws Throwable {
        try {
            Constructor<?> declaredConstructor = Class.forName(C1593ug.zd("\n\u0017\u0016W\r!\u001a\u001e#\u0015\u0014\u001a`\u001b!\u001f\u001b\u001df\u0001 *\"0 4&&\u000445\r31-/\u0018;1C;5\u001a?C@", (short) (C1607wl.Xd() ^ 25680), (short) (C1607wl.Xd() ^ 6851))).getDeclaredConstructor(Context.class);
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od(" ,!.*#\u001de\u001a%#(\u0018 %]q\u001d\u001b \u0010\"\u001d", (short) (C1580rY.Xd() ^ (-6878)))).getMethod(C1561oA.Kd("edtBrspnih|ryyO||\u0004u\n\u0007", (short) (C1633zX.Xd() ^ (-28255))), new Class[0]);
            try {
                method.setAccessible(true);
                return (GeneratedAppGlideModule) declaredConstructor.newInstance((Context) method.invoke(context, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable(Wg.Zd("\u0016\u000e[F\u0016", (short) (C1499aX.Xd() ^ (-26532)), (short) (C1499aX.Xd() ^ (-23749))), 5)) {
                C1561oA.Xd("Rnw{uu2\b\u00045|\u0001\u0007}:b\u0002\f\u0004\u0012\u0002\u0016\b\be\u0016\u0017n\u0015\u0013\u000f\u0011y\u001d\u0013%\u001d\u0017`S\u000e%,W,\"*1)\"^)/%/9)+f)7i,:;=C1E;BB%HF;>MNKO}BONRLPJ\u0006KMYOYPR\\Ri\u0011aa\u0014Xed&`codr`-bvosxjio6pvtprHr\u007f~\u0003|\u0001z\t7\u0002\b:\u0015\f\u0013\u0011?\u0002\u0012\u0013\u0010\u000e\t\b\u001c\u0012\u0019\u0019K\u000e\u001c\u0013O\u0012Qrz!\u001f\u001b\u001d\u0006)\u001f1)#^!/028&:,,h\u000b;<\u0014:846\u001fB8JB<wBGKHBKDNUCWMTT\u0007W[\n7UO`Pbj9_]Y[Dg]ogap\u001evimn#fj&zquoy\u0001y\b/yx\u0001\u0003\u0007zz", (short) (ZN.Xd() ^ 16378));
            }
            return null;
        } catch (IllegalAccessException e3) {
            throwIncorrectGlideModule(e3);
            return null;
        } catch (InstantiationException e4) {
            throwIncorrectGlideModule(e4);
            return null;
        } catch (NoSuchMethodException e5) {
            throwIncorrectGlideModule(e5);
            return null;
        } catch (InvocationTargetException e6) {
            throwIncorrectGlideModule(e6);
            return null;
        }
    }

    public static File getPhotoCacheDir(Context context) {
        return getPhotoCacheDir(context, "image_manager_disk_cache");
    }

    public static File getPhotoCacheDir(Context context, String str) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("N\\O^XSK\u0016HUQXFPS\u000e@mip^rk", (short) (OY.Xd() ^ 26809))).getMethod(Qg.kd("<9G\u00152373\u00115=", (short) (C1580rY.Xd() ^ (-17353)), (short) (C1580rY.Xd() ^ (-29701))), new Class[0]);
        try {
            method.setAccessible(true);
            File file = (File) method.invoke(context, objArr);
            if (file != null) {
                File file2 = new File(file, str);
                if (file2.mkdirs() || (file2.exists() && file2.isDirectory())) {
                    return file2;
                }
                return null;
            }
            short sXd = (short) (C1580rY.Xd() ^ (-8037));
            short sXd2 = (short) (C1580rY.Xd() ^ (-3042));
            int[] iArr = new int["v\u001b\u0017\u0011\u0011".length()];
            QB qb = new QB("v\u001b\u0017\u0011\u0011");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            if (Log.isLoggable(new String(iArr, 0, i2), 6)) {
                C1561oA.ud("***$7-4^\"&/&Y\u001c\u0019\u001a\u001e\u001aS\u0017\u001b#O\u0018!L\u001a \u0016\u0015", (short) (FB.Xd() ^ 4488));
            }
            return null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static RequestManagerRetriever getRetriever(Context context) {
        Preconditions.checkNotNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return get(context).getRequestManagerRetriever();
    }

    public static void init(Context context, GlideBuilder glideBuilder) throws Throwable {
        GeneratedAppGlideModule annotationGeneratedGlideModules = getAnnotationGeneratedGlideModules(context);
        synchronized (Glide.class) {
            if (glide != null) {
                tearDown();
            }
            initializeGlide(context, glideBuilder, annotationGeneratedGlideModules);
        }
    }

    @Deprecated
    public static synchronized void init(Glide glide2) {
        if (glide != null) {
            tearDown();
        }
        glide = glide2;
    }

    private static void initializeGlide(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws Throwable {
        initializeGlide(context, new GlideBuilder(), generatedAppGlideModule);
    }

    private static void initializeGlide(Context context, GlideBuilder glideBuilder, GeneratedAppGlideModule generatedAppGlideModule) throws Throwable {
        short sXd = (short) (C1580rY.Xd() ^ (-8661));
        int[] iArr = new int["\u0018&\u0019(*%\u001dg\u0012\u001f\u001b\"\u0018\"%_\n73:0D=".length()];
        QB qb = new QB("\u0018&\u0019(*%\u001dg\u0012\u001f\u001b\"\u0018\"%_\n73:0D=");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Yd("NM]+[\\YWRQe[bb8eel^ro", (short) (ZN.Xd() ^ 28042)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            List<GlideModule> listEmptyList = Collections.emptyList();
            if (generatedAppGlideModule == null || generatedAppGlideModule.isManifestParsingEnabled()) {
                listEmptyList = new ManifestParser(context2).parse();
            }
            short sXd2 = (short) (OY.Xd() ^ 4667);
            short sXd3 = (short) (OY.Xd() ^ 27096);
            int[] iArr2 = new int["\\\u0003\u0001|~".length()];
            QB qb2 = new QB("\\\u0003\u0001|~");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                i3++;
            }
            String str = new String(iArr2, 0, i3);
            if (generatedAppGlideModule != null && !generatedAppGlideModule.getExcludedModuleClasses().isEmpty()) {
                Set<Class<?>> excludedModuleClasses = generatedAppGlideModule.getExcludedModuleClasses();
                Iterator<GlideModule> it = listEmptyList.iterator();
                while (it.hasNext()) {
                    GlideModule next = it.next();
                    if (excludedModuleClasses.contains(next.getClass())) {
                        if (Log.isLoggable(str, 3)) {
                            short sXd4 = (short) (Od.Xd() ^ (-10922));
                            short sXd5 = (short) (Od.Xd() ^ (-28330));
                            int[] iArr3 = new int["Gy\rn''5A<ai\u0006\u0010\nW(N<Xlnr\u0014K,#EK[]~\u000bIs,4BFAlt\t\u0013\u0017~g".length()];
                            QB qb3 = new QB("Gy\rn''5A<ai\u0006\u0010\nW(N<Xlnr\u0014K,#EK[]~\u000bIs,4BFAlt\t\u0013\u0017~g");
                            int i4 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd5) ^ sXd4));
                                i4++;
                            }
                            String str2 = new String(iArr3, 0, i4) + next;
                        }
                        it.remove();
                    }
                }
            }
            if (Log.isLoggable(str, 3)) {
                Iterator<GlideModule> it2 = listEmptyList.iterator();
                while (it2.hasNext()) {
                    String str3 = ZO.xd("f%\u000b:yz\u007fE4k0 \u007fEh\u001aH>w[$;\u001b\u001ar\u0014k3w\u000b^''4?\u001bU@", (short) (C1499aX.Xd() ^ (-15095)), (short) (C1499aX.Xd() ^ (-2713))) + it2.next().getClass();
                }
            }
            glideBuilder.setRequestManagerFactory(generatedAppGlideModule != null ? generatedAppGlideModule.getRequestManagerFactory() : null);
            Iterator<GlideModule> it3 = listEmptyList.iterator();
            while (it3.hasNext()) {
                it3.next().applyOptions(context2, glideBuilder);
            }
            if (generatedAppGlideModule != null) {
                generatedAppGlideModule.applyOptions(context2, glideBuilder);
            }
            Glide glideBuild = glideBuilder.build(context2);
            for (GlideModule glideModule : listEmptyList) {
                try {
                    glideModule.registerComponents(context2, glideBuild, glideBuild.registry);
                } catch (AbstractMethodError e2) {
                    short sXd6 = (short) (C1607wl.Xd() ^ 27928);
                    short sXd7 = (short) (C1607wl.Xd() ^ 5994);
                    int[] iArr4 = new int[">\rb8\u000b\u00012==\u007f|6(|~1!|G|`\u000eua8MNU]\u0017@\u0006[eENHw)mI\u001bwjy$\u001a7|tNDj\u0018\b\u0011\\=$#j-\u0005,0qw\u0014Em\u0015W.\u0003VU|\\|a\u0016\u0013d2\f\u001fm\u0012\u0002chD9ei\u000e\u0019LC]O\u001frC<g\u0010\u0006,\u0017T>;\u0013.\u000b\u0011@,\u001a@'hPt\u001dW^\"\u0014B\u0014\\\t(<j\u000bn\u0007\u0015uH`N\u001f\u001d\\\u007fAOenBG~D\u0014\u0003m+\rdiZQm\u001cI}Uq\u00153t\n32k1%s}*\"=>z=(T\u007fip2MTwcnc7h \r4\u007f|m\u001at\u0002 _6\"Nby=8\tS\u001a\n&\u0010\\y\"Diu\u001d:~[F:~\n\u001aw\u0001".length()];
                    QB qb4 = new QB(">\rb8\u000b\u00012==\u007f|6(|~1!|G|`\u000eua8MNU]\u0017@\u0006[eENHw)mI\u001bwjy$\u001a7|tNDj\u0018\b\u0011\\=$#j-\u0005,0qw\u0014Em\u0015W.\u0003VU|\\|a\u0016\u0013d2\f\u001fm\u0012\u0002chD9ei\u000e\u0019LC]O\u001frC<g\u0010\u0006,\u0017T>;\u0013.\u000b\u0011@,\u001a@'hPt\u001dW^\"\u0014B\u0014\\\t(<j\u000bn\u0007\u0015uH`N\u001f\u001d\\\u007fAOenBG~D\u0014\u0003m+\rdiZQm\u001cI}Uq\u00153t\n32k1%s}*\"=>z=(T\u007fip2MTwcnc7h \r4\u007f|m\u001at\u0002 _6\"Nby=8\tS\u001a\n&\u0010\\y\"Diu\u001d:~[F:~\n\u001aw\u0001");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + (i5 * sXd7))) + xuXd4.CK(iKK4));
                        i5++;
                    }
                    throw new IllegalStateException(new String(iArr4, 0, i5) + glideModule.getClass().getName(), e2);
                }
            }
            if (generatedAppGlideModule != null) {
                generatedAppGlideModule.registerComponents(context2, glideBuild, glideBuild.registry);
            }
            Object[] objArr2 = {glideBuild};
            Method method2 = Class.forName(Ig.wd("\u0018l>.q'@?\",\u0013t7L$5&B\u0017v%\na", (short) (ZN.Xd() ^ 22934))).getMethod(C1561oA.Qd("j\\]^ggWc3^[][YOW\\*GQPECDKR", (short) (C1580rY.Xd() ^ (-5430))), Class.forName(EO.Od("s)M\u0003\u0017n=fkzs\u001cXoqL\u001fQ\u00072p\u0017(5ju1u\u001c\u001f2W/\u001e", (short) (C1633zX.Xd() ^ (-14053)))));
            try {
                method2.setAccessible(true);
                method2.invoke(context2, objArr2);
                glide = glideBuild;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public static synchronized void tearDown() {
        if (glide != null) {
            Context context = glide.getContext();
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1593ug.zd("\u001a(\u001f.,'#m$118*4;u\f99@2FC", (short) (ZN.Xd() ^ 30841), (short) (ZN.Xd() ^ 27787))).getMethod(C1561oA.od("52@\f:940)&8,1/\u0003.,1!3.", (short) (C1633zX.Xd() ^ (-6958))), new Class[0]);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                Object[] objArr2 = {glide};
                Method method2 = Class.forName(C1561oA.Kd("jxo~|ws>t\u0002\u0002\tz\u0005\fF\\\n\n\u0011\u0003\u0017\u0014", (short) (C1499aX.Xd() ^ (-11710)))).getMethod(C1561oA.Xd("2,1%(+68*8\n76:::2<C\u00132>?669BK", (short) (FB.Xd() ^ 18655)), Class.forName(Wg.Zd("wixh\u0013m\u00021o\u001dx z%\bf\u0005\u0017.\u0012>\u001f/Y,\u001c\u0014D-HdHYF", (short) (C1580rY.Xd() ^ (-31509)), (short) (C1580rY.Xd() ^ (-19725)))));
                try {
                    method2.setAccessible(true);
                    method2.invoke(context2, objArr2);
                    glide.engine.shutdown();
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        glide = null;
    }

    private static void throwIncorrectGlideModule(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static RequestManager with(Activity activity) {
        return getRetriever(activity).get(activity);
    }

    @Deprecated
    public static RequestManager with(Fragment fragment) {
        return getRetriever(fragment.getActivity()).get(fragment);
    }

    public static RequestManager with(Context context) {
        return getRetriever(context).get(context);
    }

    public static RequestManager with(View view) {
        return getRetriever(view.getContext()).get(view);
    }

    public static RequestManager with(androidx.fragment.app.Fragment fragment) {
        return getRetriever(fragment.getContext()).get(fragment);
    }

    public static RequestManager with(FragmentActivity fragmentActivity) {
        return getRetriever(fragmentActivity).get(fragmentActivity);
    }

    public void clearDiskCache() {
        Util.assertBackgroundThread();
        this.engine.clearDiskCache();
    }

    public void clearMemory() {
        Util.assertMainThread();
        this.memoryCache.clearMemory();
        this.bitmapPool.clearMemory();
        this.arrayPool.clearMemory();
    }

    public ArrayPool getArrayPool() {
        return this.arrayPool;
    }

    public BitmapPool getBitmapPool() {
        return this.bitmapPool;
    }

    ConnectivityMonitorFactory getConnectivityMonitorFactory() {
        return this.connectivityMonitorFactory;
    }

    public Context getContext() {
        return this.glideContext.getBaseContext();
    }

    GlideContext getGlideContext() {
        return this.glideContext;
    }

    public Registry getRegistry() {
        return this.registry;
    }

    public RequestManagerRetriever getRequestManagerRetriever() {
        return this.requestManagerRetriever;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        clearMemory();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        trimMemory(i2);
    }

    public synchronized void preFillBitmapPool(PreFillType.Builder... builderArr) {
        if (this.bitmapPreFiller == null) {
            this.bitmapPreFiller = new BitmapPreFiller(this.memoryCache, this.bitmapPool, (DecodeFormat) this.defaultRequestOptionsFactory.build().getOptions().get(Downsampler.DECODE_FORMAT));
        }
        this.bitmapPreFiller.preFill(builderArr);
    }

    void registerRequestManager(RequestManager requestManager) {
        synchronized (this.managers) {
            if (this.managers.contains(requestManager)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.managers.add(requestManager);
        }
    }

    boolean removeFromManagers(Target<?> target) {
        synchronized (this.managers) {
            Iterator<RequestManager> it = this.managers.iterator();
            while (it.hasNext()) {
                if (it.next().untrack(target)) {
                    return true;
                }
            }
            return false;
        }
    }

    public MemoryCategory setMemoryCategory(MemoryCategory memoryCategory) {
        Util.assertMainThread();
        this.memoryCache.setSizeMultiplier(memoryCategory.getMultiplier());
        this.bitmapPool.setSizeMultiplier(memoryCategory.getMultiplier());
        MemoryCategory memoryCategory2 = this.memoryCategory;
        this.memoryCategory = memoryCategory;
        return memoryCategory2;
    }

    public void trimMemory(int i2) {
        Util.assertMainThread();
        Iterator<RequestManager> it = this.managers.iterator();
        while (it.hasNext()) {
            it.next().onTrimMemory(i2);
        }
        this.memoryCache.trimMemory(i2);
        this.bitmapPool.trimMemory(i2);
        this.arrayPool.trimMemory(i2);
    }

    void unregisterRequestManager(RequestManager requestManager) {
        synchronized (this.managers) {
            if (!this.managers.contains(requestManager)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.managers.remove(requestManager);
        }
    }
}
