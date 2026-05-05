package com.braze.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import android.widget.ImageView;
import bo.app.d1;
import bo.app.dq;
import bo.app.eq;
import bo.app.fp;
import bo.app.fq;
import bo.app.gq;
import bo.app.ip;
import bo.app.jp;
import bo.app.kp;
import bo.app.lp;
import bo.app.mp;
import bo.app.np;
import bo.app.op;
import bo.app.pp;
import bo.app.qp;
import bo.app.u;
import bo.app.up;
import bo.app.vp;
import bo.app.wp;
import bo.app.xp;
import bo.app.yp;
import bo.app.z;
import bo.app.zp;
import com.braze.R;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeViewBounds;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import cz.msebera.android.httpclient.client.cache.HeaderConstants;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Xg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĉ\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.P\u000b*ܥ\u001aw\u001dfrˎ8D{H6ɟ[*\u001dk\u00044*\\,qY;]\u001a\u0004&\u0011OdgonP[\u0013C%\u0006\u001exp-QU\u000f]\u001a\u000f8Ew?AVw=?a|6\u001b :Ĳ@y\u0013#\"*V.~zIN\u0014\u0012F@x:X\u0017U\u00050\u0012\u000e>&\u0001&\\}N>Hr_B/9\u0003qBT/e5\u0013ձ+\u0012\u0005';u\u001a\u001dw\u0001DE\u00193T\u001b\u0007\u0001[ύ\u0007Aw\b\u0013zoV9R\fWd`0\u0018#,g\r\frV`\u0013Tx\fU-\u007fgYU&(&~,\u0013J\u000b&\b=G\\3`fڿ\u00125z{aJ\u0019'lQ\u0018\u0003\u007fD?'\u00162YEIr\u0002eI$f7*\u0007=\"1\u000e\u0007!\n`T`ڠ\u001fV}`?a\tRV_\"Yku4tp\u0003B\u0004^GF/ɨ\u00150\u001d6Em\u0002Z/\u0001\u001aHro'\tniki\u0001Hp&|*O*7\u001f\u000bHr\b\u0004P\u0003Z\\\u0015[!l\u0007,\fC&j~T#;\u000f|U/}ҷQ_\u0010:=|\u007f\u0011|\u0005&Wgfc9_d(a\u0001vDCJz\u001dX\u0015Y\u0004\u0010h_@\"`J\u001b\u0014\u0006\u0001\\N:\u0017bE\u007f#L.G\u0018\u000b\u001b\u000f\u0017ٿFC\u0003\"mt1C\rqK&\u0019hR\u00019\u0005^]\to\u0016xy2\u000b|:/WPc4VY0kL|Q\t/y\u000eN\u007fN]K\u001b\u001c<iދ$\u0018 V_M\u0006D\u001d\u001eA4\u0018,sX#i_N*')|*\u0013I\u0001Fg6\u0002!0nmbO\u0003\u0019R|ly;\nz~(g\r\u000fĕgV\u0011zLi;\u0018g_f8+\rO\"3#\b\"+VsWے!\u0018}7=9*\u000fw\u001aFy\u00110Vxs*DcD\u0015\u0013ik[SLY[\u000f>P&|\u000bRNzy\u0018B76;[^@\u0013\u0018\u001d=Ԫ\u000f1\u0004\u0011\u0015WU\u001ad\bR\u0015\u0006|b:\u0010.\u0002D\u0016\u0014\rCU\u0015[V\u007fm\u001cM\r\u0011X\u0016\"\r\u00120\u001d\u0018bB֕ZYh5>3<ADpSb3j9(B-T\b9C\u0005m\u00146\u0013\u007ft\u0005?\u001f8B\u0002Bn\u0010jw\u000b\\\u000f\nޝIb'Y\u000f/WJ,*M3\u001blt`_g@\fk\u001d7\u001d1Tǎj'1ubkc?f4#GsBw\u000ef\bU4\u0006k\u001e\u000e~\u001dԠ!D\u001eNG\u0004Yv\u0005dv\rkc|p'\u0016t]f\"W\u0001A\u0002ɽ@\f\u0015?'\u0002;\u0015pcdN&?s\u001e\u000f\"\\)5\u000e-gT(E\u0006c9mMxI?{\u0006t\u0002\u0003л$\"-:\u0003X%\u0007\u001c!\"]IBFu$c\u001a\tAPP\b<O\rr828<]\tK\u0004)]\bq(%N*Cl4D\u0012gǰ\u000eer\u001c|\u000f[\u0015tmny\u001dh\u0007\u001d_\u07b3Oܻ\u0017\\b<\u0017\u0010.\u0016a!\"T>+F\nr)>Qsj\u0001k}g;ie1ˮe;8T$=-:\u000e\u00060\u00166W\fj[\u0003|\t\u000b0xWL^Aۭ\u0011é\u0010-\u001c~\u0005\rlVcVT:6d]XI#iS_`5%{\u000fda\bģKװ;<\u0013q.>\u001fKRdzG8\fY\u0007\u000e\nD-tus\u001aeYzݩp݁*OM:H*:Yé\u0015|"}, d2 = {"\u001ab^:\")KO.~Db4x\u000b/sI\u0007{A|'\u001eVL\u001b8\f%\u0019ay\"7T *LCHA", "\u001ab^:\")KO.~Db4x\u000b/sI\fXM|,\u0017+w\n>v\f?U| DC", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1n]AX?M", "", "7lP4X\u001cKZ", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@q\u001b\u0017YE", "7lP4X\u001dBS+", "\u001ab^:\")KO.~D^5\r\u0011=/\\5wU\u0001\b\u001bG\u0002jF\u0007.4gS", "DhTD56N\\\u0018\r", "", "@d]1X9.` b\u0004m6m\r/w", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{dj8\u0014m0M@9KKP,k\u001cVE\u0010\u0014Z~R+\u001fZ@?.v\u000e4,\u0004AIK;q\u0011\u0014$W\u0012wlWV\u0001Ky'RK9qEg5=8", "9dh", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "0hc:T7", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", ">tc\u000f\\;FO$b\u0004m6d\t7C{&~@", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\r\u0006x21d\u0001$5{_\u000bQRCg?sXO]B\u0006p6RupIYJ7_VpK]n^\u001dV'\u0018Z", "7mXA70LYvzxa,k\u0005=k", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "1`a1", "@d]1X9.` b\u0004m6Z\u0005<dp,{R", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~V\u000b\u001cLm_6WB;rBg\u0013dn8\u0015-\nJ\u0004&\u001d3S(mN<D\u0010\u001b\\W<:\u001a\tbCyU@@\u001e\u00156M\u0001\u0005z\u0005\u000b\u0018\u000eD4TJR\u0012Gj\u0019uS~ODcgCDNAw*.\fh-dH\u0004\u0001!m.\u001bYT.\u001cX]!{Q\b=+8", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ej", "7m0=c\u0014>a'z|^", "@d]1X9.` b\u0004m6`\u0012\u000bp\u000b\u0010{N\u000f\u0013\u0019G`\u0012<\t", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~V\u000b\u001cLm_6WB;rBg\u0019q]D\u0012k,\\\u0005#IL\u0018\u0010@[NH\u001fyZ\u001c\\'\u000f\u0005/()jU3h\u000f(R\u0004\u0005V\u0010\u0019\u001a\u00177@W>_\u000fT\u0004\u0019t\u000b;lE[_\t\u0011%M^,d|c\u001dn\u0010!\"\u001eyb\u0018uLC\nES\u001a\u0003Z\b1DT\u0015\u00108\u0015Bmm#O\u007f^;\u0003|b<", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "3wc?T:", "5dc\u001dh:A0\u001d\u000e\u0003Z7]\u00169mo5\u0003", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001w$w*SDj;\u001ejOf5\u0018_uUr0I\u0016<;iV{?ixX\u0018Vt\n\u0012UV$8D@/\u0010:\u0013^Hd\u0016\f\u0007\u00125|MLf\u0019F\bj9(%qEfi}F\u000bGo&o\u000fc\u001bj\u0004\u0017(#y\u0015&>", "5dc\u0016a\bI^\u0001~\tl(~\t\fi\u000f0wKa$!O_\u001bC", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~V\u000b\u001cLm_6WB;rBg\u0019q]D\u0012k,\\\u0005#IL\u0018\u0010@[NH\u001fyZ\u001c\\'\u000f\u0005/()jU3h\u000f(R\u0004\u0005V\u0010\u0019\u001a\u00177@W@`\u0018\u0011v\"qV)2Fbo\u0002U\u000b\"o&y\fP!\\L\u0017.$z\u0018)>\u0014\u0015\u0006\u0005R\u001e|Vx1iT\u0015\u0006;(<{%#I~]8\u007f|", "", "7r>3Y3B\\\u0019", "Adc\u001cY-EW\"~", "uY\u0018#", "\u001a`]1e6BRb\bzmul\u00163;", "7lP4X\u001cKW", "", "", "6dP1X9L", "Ag^B_+,Y\u001d\nXZ*\u007f\r8g", "uKP;W9HW\u0018H\u0004^;Fx<iU\u000f\u0001<\u0012\u0013`W~\u0012C@\r1dSc,", "5dc\u000f\\;FO$_\bh4l\u00166", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{fkAP`9J\f'\u0011LW<d`<\u001a!\u000eo\u000e?/\r\u00176K4wCEtK\u0013E\u000b:u\u000b\u0010\u0015W7wlMY\u0014E\b^RE8pBd5", "\u001aa^{T7I\u001d)T", "2nf;_6:Ru\u0003\nf(\bi<o\b\u0018\tG", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001v\u0016=\u00173Ho\n\u0005\u0013ri\u0003\u0004p(cvpGU^4j\u001cOJ\u0010'Z~R+\u001facQ-mR\rbn)SK7s\fU&c", "5dc\u000f\\;FO$_\bh4Z\u0005-h\u007f", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'| \u0016Ty\u0012;@'BU\t#;k$w*GJs0)j", "5dc\u000f\\;FO$_\bh4d\t7C{&~@", "5dc\u000f\\;FO$_\bh4[\r=k]$yC\u0001", "AjX=70LYvzxa,", ">tc\u000f\\;FO$b\u0004m6Z\u0005-h\u007f", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\r\u0006x21d\u0001$5{_\u000bQRCg?s\n,R", "@d]1X9.` b\u0004m6m\r/wn$\nF?\u0013 F|\u0018@u\u001fCX\u0004\u001a4i$.GP;r4\u001a#h", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001\u007f\u001a-OCJ5\u0018&\u0011ja*\u000bc>$]%QT\u0018)iN\b=]\u0012c\u001eV9Vaf=9n5;\u001f\u001a\tS\u0012Dg\u000fa|\u00131{l\f]\fP{^cP6lO[5=8", "@d]1X9.` b\u0004m6m\r/wn$\nF", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006c%5b\r-3v%\u0015WAAA", "2hb86(<V\u0019e\u0005\\2", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006c%5b\r-3v%\u0015WAAA", "\u001a`]1e6BRb\u000f\nb3Fo<u]$yC\u0001l", ";d\\<e@\u001cO\u0017\u0002z", "\u001a`]1e6BRb\u000f\nb3Fo<u]$yC\u0001l", "5dc\u001aX4H`-\\v\\/|", "u(;.a+K]\u001d}Dn;\u0001\u0010xL\r8Y<~\u001a\u0017\u001d", "\u001aa^{T7I\u001d.T", "2hb8?9N1\u0015|}^", "\u001aa^{T7I\u001d.T", "\nrTA \u0006\u0017", "7r36f2\u001cO\u0017\u0002zL;x\u0016>i\t*", "(", "u(I", "\nh]6g\u0005", "\u0011n\\=T5B]\"", "0n\u001e.c7\bW$", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public final class DefaultBrazeImageLoader implements IBrazeImageLoader {
    public static final String BRAZE_LRU_CACHE_FOLDER = "appboy.imageloader.lru.cache";
    private static final String CACHE_PARAMETER_KEY = "cache";
    private static final int DISK_CACHE_SIZE = 52428800;
    private final ReentrantLock diskCacheLock;
    private z diskLruCache;
    private boolean isDiskCacheStarting;
    private boolean isOffline;
    private final LruCache<String, Bitmap> memoryCache;
    public static final ip Companion = new ip();
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) DefaultBrazeImageLoader.class);

    public DefaultBrazeImageLoader(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.diskCacheLock = new ReentrantLock();
        this.isDiskCacheStarting = true;
        this.memoryCache = new fp(BrazeImageUtils.getImageLoaderCacheSize());
        initDiskCacheTask(context);
    }

    @JvmStatic
    public static final void deleteStoredData(Context context) throws Throwable {
        Companion.a(context);
    }

    public static /* synthetic */ u downloadBitmapFromUrl$default(DefaultBrazeImageLoader defaultBrazeImageLoader, Context context, Uri uri, BrazeViewBounds brazeViewBounds, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            brazeViewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        return defaultBrazeImageLoader.downloadBitmapFromUrl(context, uri, brazeViewBounds);
    }

    @JvmStatic
    public static final File getDiskCacheDir(Context context, String str) throws Throwable {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(context, C1561oA.yd(".;7>4HA", (short) (C1499aX.Xd() ^ (-15490))));
        Intrinsics.checkNotNullParameter(str, C1561oA.Yd(")#\u001f(-\u001e\b\u001c)\"", (short) (C1580rY.Xd() ^ (-1909))));
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("\u007f\u000e\u0005\u0014\u0012\r\tS\n\u0017\u0017\u001e\u0010\u001a![q\u001f\u001f&\u0018,)", (short) (OY.Xd() ^ 31865), (short) (OY.Xd() ^ 20261))).getMethod(Jg.Wd("UMZ|\u0019To*\u0003@\u0003", (short) (C1499aX.Xd() ^ (-8564)), (short) (C1499aX.Xd() ^ (-11710))), new Class[0]);
        try {
            method.setAccessible(true);
            return new File(d1.a(sb.append(((File) method.invoke(context, objArr)).getPath()), File.separator, str));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final void initDiskCacheTask(Context context) {
        BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new up(context, this, null), 3, null);
    }

    private final Bitmap putBitmapIntoMemCache(String str, Bitmap bitmap) {
        return this.memoryCache.put(str, bitmap);
    }

    private final void renderUrlIntoView(Context context, String str, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        if (StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) yp.f2324a, 7, (Object) null);
            return;
        }
        try {
            renderUrlIntoViewTask$android_sdk_base_release(context, imageView, brazeViewBounds, str);
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, th, false, (Function0) new zp(str), 4, (Object) null);
        }
    }

    public final u downloadBitmapFromUrl(Context context, Uri imageUri, BrazeViewBounds brazeViewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        if (brazeViewBounds == null) {
            brazeViewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        return BrazeImageUtils.getBitmap(context, imageUri, brazeViewBounds);
    }

    public final Bitmap getBitmapFromCache(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bitmap bitmap = this.memoryCache.get(key);
        if (bitmap != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new jp(key, this), 6, (Object) null);
            return bitmap;
        }
        Bitmap bitmapFromDiskCache = getBitmapFromDiskCache(key);
        if (bitmapFromDiskCache == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lp(key), 7, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new kp(key), 6, (Object) null);
        putBitmapIntoMemCache(key, bitmapFromDiskCache);
        return bitmapFromDiskCache;
    }

    public final Bitmap getBitmapFromDiskCache(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ReentrantLock reentrantLock = this.diskCacheLock;
        reentrantLock.lock();
        try {
            z zVar = null;
            if (this.isDiskCacheStarting) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new mp(key), 6, (Object) null);
            } else {
                z zVar2 = this.diskLruCache;
                if (zVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    zVar2 = null;
                }
                if (zVar2.a(key)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new np(key), 6, (Object) null);
                    z zVar3 = this.diskLruCache;
                    if (zVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    } else {
                        zVar = zVar3;
                    }
                    return zVar.b(key);
                }
            }
            Unit unit = Unit.INSTANCE;
            return null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Bitmap getBitmapFromMemCache(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.memoryCache.get(key);
    }

    public final Bitmap getBitmapFromUrl(Context context, String imageUrl, BrazeViewBounds brazeViewBounds) {
        Bitmap bitmapFromCache;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        if (StringsKt.isBlank(imageUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) op.f1456a, 7, (Object) null);
            return null;
        }
        try {
            bitmapFromCache = getBitmapFromCache(imageUrl);
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, th, false, (Function0) new qp(imageUrl), 4, (Object) null);
        }
        if (bitmapFromCache != null) {
            return bitmapFromCache;
        }
        if (this.isOffline) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) pp.f1528a, 7, (Object) null);
        } else {
            Uri imageUri = Uri.parse(imageUrl);
            Intrinsics.checkNotNullExpressionValue(imageUri, "imageUri");
            u uVarDownloadBitmapFromUrl = downloadBitmapFromUrl(context, imageUri, brazeViewBounds);
            if (uVarDownloadBitmapFromUrl.f1897a != null) {
                if (!shouldSkipCaching(imageUri, uVarDownloadBitmapFromUrl.f1898b)) {
                    putBitmapIntoCache(imageUrl, uVarDownloadBitmapFromUrl.f1897a, BrazeFileUtils.isLocalUri(imageUri));
                }
                return uVarDownloadBitmapFromUrl.f1897a;
            }
        }
        return null;
    }

    @Override // com.braze.images.IBrazeImageLoader
    public Bitmap getInAppMessageBitmapFromUrl(Context context, IInAppMessage inAppMessage, String imageUrl, BrazeViewBounds brazeViewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return getBitmapFromUrl(context, imageUrl, brazeViewBounds);
    }

    public final LruCache<String, Bitmap> getMemoryCache() {
        return this.memoryCache;
    }

    @Override // com.braze.images.IBrazeImageLoader
    public Bitmap getPushBitmapFromUrl(Context context, Bundle bundle, String imageUrl, BrazeViewBounds brazeViewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return getBitmapFromUrl(context, imageUrl, brazeViewBounds);
    }

    public final boolean isDiskCacheStarting() {
        return this.isDiskCacheStarting;
    }

    public final void putBitmapIntoCache(String key, Bitmap bitmap, boolean z2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (getBitmapFromMemCache(key) == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vp(key), 7, (Object) null);
            this.memoryCache.put(key, bitmap);
        }
        if (z2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new wp(key), 7, (Object) null);
            return;
        }
        ReentrantLock reentrantLock = this.diskCacheLock;
        reentrantLock.lock();
        try {
            if (!this.isDiskCacheStarting) {
                z zVar = this.diskLruCache;
                z zVar2 = null;
                if (zVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    zVar = null;
                }
                if (!zVar.a(key)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xp(key), 7, (Object) null);
                    z zVar3 = this.diskLruCache;
                    if (zVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    } else {
                        zVar2 = zVar3;
                    }
                    zVar2.a(key, bitmap);
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void renderUrlIntoCardView(Context context, Card card, String imageUrl, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        renderUrlIntoView(context, imageUrl, imageView, brazeViewBounds);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void renderUrlIntoInAppMessageView(Context context, IInAppMessage inAppMessage, String imageUrl, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        renderUrlIntoView(context, imageUrl, imageView, brazeViewBounds);
    }

    public final void renderUrlIntoViewTask$android_sdk_base_release(Context context, ImageView imageView, BrazeViewBounds brazeViewBounds, String imageUrl) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        imageView.setTag(R.string.com_braze_image_lru_cache_image_url_key, imageUrl);
        BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new dq(this, context, imageUrl, brazeViewBounds, imageView, null), 3, null);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void setOffline(boolean z2) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new eq(z2), 6, (Object) null);
        this.isOffline = z2;
    }

    public final boolean shouldSkipCaching(Uri imageUri, Map<String, ? extends List<String>> map) {
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        if (!imageUri.getBooleanQueryParameter(CACHE_PARAMETER_KEY, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new fq(imageUri), 7, (Object) null);
            return true;
        }
        if (map == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            if (StringsKt.equals(entry.getKey(), "cache-control", true)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Iterable<String> iterable = (Iterable) entry2.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (String str : iterable) {
                    if (StringsKt.contains((CharSequence) str, (CharSequence) HeaderConstants.CACHE_CONTROL_NO_CACHE, true) || StringsKt.contains((CharSequence) str, (CharSequence) "max-age=0", true)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new gq(entry2, imageUri), 7, (Object) null);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
