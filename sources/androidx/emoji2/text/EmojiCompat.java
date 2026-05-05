package androidx.emoji2.text;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.collection.ArraySet;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.DefaultEmojiCompatConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public class EmojiCompat {
    public static final String EDITOR_INFO_METAVERSION_KEY = "android.support.text.emoji.emojiCompat_metadataVersion";
    public static final String EDITOR_INFO_REPLACE_ALL_KEY = "android.support.text.emoji.emojiCompat_replaceAll";
    static final int EMOJI_COUNT_UNLIMITED = Integer.MAX_VALUE;
    public static final int EMOJI_FALLBACK = 2;
    public static final int EMOJI_SUPPORTED = 1;
    public static final int EMOJI_UNSUPPORTED = 0;
    public static final int LOAD_STATE_DEFAULT = 3;
    public static final int LOAD_STATE_FAILED = 2;
    public static final int LOAD_STATE_LOADING = 0;
    public static final int LOAD_STATE_SUCCEEDED = 1;
    public static final int LOAD_STRATEGY_DEFAULT = 0;
    public static final int LOAD_STRATEGY_MANUAL = 1;
    private static final String NOT_INITIALIZED_ERROR_TEXT = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";
    public static final int REPLACE_STRATEGY_ALL = 1;
    public static final int REPLACE_STRATEGY_DEFAULT = 0;
    public static final int REPLACE_STRATEGY_NON_EXISTENT = 2;
    private static volatile boolean sHasDoneDefaultConfigLookup = false;
    private static volatile EmojiCompat sInstance = null;
    final int[] mEmojiAsDefaultStyleExceptions;
    private final int mEmojiSpanIndicatorColor;
    private final boolean mEmojiSpanIndicatorEnabled;
    private final GlyphChecker mGlyphChecker;
    private final CompatInternal mHelper;
    private final Set<InitCallback> mInitCallbacks;
    private final ReadWriteLock mInitLock = new ReentrantReadWriteLock();
    private volatile int mLoadState = 3;
    private final Handler mMainHandler;
    private final int mMetadataLoadStrategy;
    final MetadataRepoLoader mMetadataLoader;
    final boolean mReplaceAll;
    private final SpanFactory mSpanFactory;
    final boolean mUseEmojiAsDefaultStyle;
    private static final Object INSTANCE_LOCK = new Object();
    private static final Object CONFIG_LOCK = new Object();

    @Retention(RetentionPolicy.SOURCE)
    public @interface CodepointSequenceMatchResult {
    }

    public interface GlyphChecker {
        boolean hasGlyph(CharSequence charSequence, int i2, int i3, int i4);
    }

    public static abstract class InitCallback {
        public void onFailed(Throwable th) {
        }

        public void onInitialized() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LoadStrategy {
    }

    public interface MetadataRepoLoader {
        void load(MetadataRepoLoaderCallback metadataRepoLoaderCallback);
    }

    public static abstract class MetadataRepoLoaderCallback {
        public abstract void onFailed(Throwable th);

        public abstract void onLoaded(MetadataRepo metadataRepo);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ReplaceStrategy {
    }

    public interface SpanFactory {
        EmojiSpan createSpan(TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    private EmojiCompat(Config config) throws Throwable {
        this.mReplaceAll = config.mReplaceAll;
        this.mUseEmojiAsDefaultStyle = config.mUseEmojiAsDefaultStyle;
        this.mEmojiAsDefaultStyleExceptions = config.mEmojiAsDefaultStyleExceptions;
        this.mEmojiSpanIndicatorEnabled = config.mEmojiSpanIndicatorEnabled;
        this.mEmojiSpanIndicatorColor = config.mEmojiSpanIndicatorColor;
        this.mMetadataLoader = config.mMetadataLoader;
        this.mMetadataLoadStrategy = config.mMetadataLoadStrategy;
        this.mGlyphChecker = config.mGlyphChecker;
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Wg.Zd("f*a-i'cjk'#~a%g\u001af", (short) (Od.Xd() ^ (-13329)), (short) (Od.Xd() ^ (-7030)))).getDeclaredMethod(C1561oA.Xd("<;K%:CI(LMOES", (short) (C1580rY.Xd() ^ (-9711))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.mMainHandler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            ArraySet arraySet = new ArraySet();
            this.mInitCallbacks = arraySet;
            SpanFactory spanFactory = config.mSpanFactory;
            this.mSpanFactory = spanFactory == null ? new DefaultSpanFactory() : spanFactory;
            if (config.mInitCallbacks != null && !config.mInitCallbacks.isEmpty()) {
                arraySet.addAll(config.mInitCallbacks);
            }
            this.mHelper = new CompatInternal19(this);
            loadMetadata();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static EmojiCompat init(Context context) {
        return init(context, null);
    }

    public static EmojiCompat init(Context context, DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory defaultEmojiCompatConfigFactory) {
        EmojiCompat emojiCompat;
        if (sHasDoneDefaultConfigLookup) {
            return sInstance;
        }
        if (defaultEmojiCompatConfigFactory == null) {
            defaultEmojiCompatConfigFactory = new DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory(null);
        }
        Config configCreate = defaultEmojiCompatConfigFactory.create(context);
        synchronized (CONFIG_LOCK) {
            if (!sHasDoneDefaultConfigLookup) {
                if (configCreate != null) {
                    init(configCreate);
                }
                sHasDoneDefaultConfigLookup = true;
            }
            emojiCompat = sInstance;
        }
        return emojiCompat;
    }

    public static EmojiCompat init(Config config) {
        EmojiCompat emojiCompat = sInstance;
        if (emojiCompat == null) {
            synchronized (INSTANCE_LOCK) {
                emojiCompat = sInstance;
                if (emojiCompat == null) {
                    emojiCompat = new EmojiCompat(config);
                    sInstance = emojiCompat;
                }
            }
        }
        return emojiCompat;
    }

    public static boolean isConfigured() {
        return sInstance != null;
    }

    public static EmojiCompat reset(Config config) {
        EmojiCompat emojiCompat;
        synchronized (INSTANCE_LOCK) {
            emojiCompat = new EmojiCompat(config);
            sInstance = emojiCompat;
        }
        return emojiCompat;
    }

    public static EmojiCompat reset(EmojiCompat emojiCompat) {
        EmojiCompat emojiCompat2;
        synchronized (INSTANCE_LOCK) {
            sInstance = emojiCompat;
            emojiCompat2 = sInstance;
        }
        return emojiCompat2;
    }

    public static void skipDefaultConfigurationLookup(boolean z2) {
        synchronized (CONFIG_LOCK) {
            sHasDoneDefaultConfigLookup = z2;
        }
    }

    public static EmojiCompat get() {
        EmojiCompat emojiCompat;
        synchronized (INSTANCE_LOCK) {
            emojiCompat = sInstance;
            Preconditions.checkState(emojiCompat != null, NOT_INITIALIZED_ERROR_TEXT);
        }
        return emojiCompat;
    }

    public void load() throws Throwable {
        Preconditions.checkState(this.mMetadataLoadStrategy == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (isInitialized()) {
            return;
        }
        this.mInitLock.writeLock().lock();
        try {
            if (this.mLoadState == 0) {
                return;
            }
            this.mLoadState = 0;
            this.mInitLock.writeLock().unlock();
            this.mHelper.loadMetadata();
        } finally {
            this.mInitLock.writeLock().unlock();
        }
    }

    private void loadMetadata() throws Throwable {
        this.mInitLock.writeLock().lock();
        try {
            if (this.mMetadataLoadStrategy == 0) {
                this.mLoadState = 0;
            }
            this.mInitLock.writeLock().unlock();
            if (getLoadState() == 0) {
                this.mHelper.loadMetadata();
            }
        } catch (Throwable th) {
            this.mInitLock.writeLock().unlock();
            throw th;
        }
    }

    void onMetadataLoadSuccess() throws Throwable {
        ArrayList arrayList = new ArrayList();
        this.mInitLock.writeLock().lock();
        try {
            this.mLoadState = 1;
            arrayList.addAll(this.mInitCallbacks);
            this.mInitCallbacks.clear();
            this.mInitLock.writeLock().unlock();
            Handler handler = this.mMainHandler;
            ListenerDispatcher listenerDispatcher = new ListenerDispatcher(arrayList, this.mLoadState);
            Class<?> cls = Class.forName(C1561oA.ud("\u000f\u001b\u0010\u001d\u0019\u0012\fT\u0015\u0018Qj\u0003\u000f\u0004\u000b\u0003\u000f", (short) (C1499aX.Xd() ^ (-29627))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (OY.Xd() ^ 18178);
            int[] iArr = new int["um\u007fk=|n|j2Swuvfh\b\u0002".length()];
            QB qb = new QB("um\u007fk=|n|j2Swuvfh\b\u0002");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {listenerDispatcher};
            short sXd2 = (short) (FB.Xd() ^ 7719);
            int[] iArr2 = new int["XX]_".length()];
            QB qb2 = new QB("XX]_");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th) {
            this.mInitLock.writeLock().unlock();
            throw th;
        }
    }

    void onMetadataLoadFailed(Throwable th) throws Throwable {
        ArrayList arrayList = new ArrayList();
        this.mInitLock.writeLock().lock();
        try {
            this.mLoadState = 2;
            arrayList.addAll(this.mInitCallbacks);
            this.mInitCallbacks.clear();
            this.mInitLock.writeLock().unlock();
            Handler handler = this.mMainHandler;
            ListenerDispatcher listenerDispatcher = new ListenerDispatcher(arrayList, this.mLoadState, th);
            short sXd = (short) (Od.Xd() ^ (-30684));
            int[] iArr = new int["7E8GA<4~=By\u0015+9,5KY".length()];
            QB qb = new QB("7E8GA<4~=By\u0015+9,5KY");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[1];
            short sXd2 = (short) (C1607wl.Xd() ^ 28576);
            short sXd3 = (short) (C1607wl.Xd() ^ 14472);
            int[] iArr2 = new int["\u001f\u0015)\u0013^\u001c\u0010\u001c\u0014Y|\u001f\u0017\u0016\b\b\u0011\t".length()];
            QB qb2 = new QB("\u001f\u0015)\u0013^\u001c\u0010\u001c\u0014Y|\u001f\u0017\u0016\b\b\u0011\t");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            Object[] objArr = {listenerDispatcher};
            short sXd4 = (short) (OY.Xd() ^ 32691);
            short sXd5 = (short) (OY.Xd() ^ 14633);
            int[] iArr3 = new int["\u007f}\u0001\u0001".length()];
            QB qb3 = new QB("\u007f}\u0001\u0001");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3) + sXd5);
                i4++;
            }
            Method method = cls.getMethod(new String(iArr3, 0, i4), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th2) {
            this.mInitLock.writeLock().unlock();
            throw th2;
        }
    }

    public void registerInitCallback(InitCallback initCallback) {
        Preconditions.checkNotNull(initCallback, Xg.qd("tzv\u0003Rq}~uux\u00027{z\t\n\f\u0012>\u0002\u0006A\u0011\u0019\u0011\u0012", (short) (ZN.Xd() ^ 7343), (short) (ZN.Xd() ^ 17490)));
        this.mInitLock.writeLock().lock();
        try {
            if (this.mLoadState == 1 || this.mLoadState == 2) {
                Handler handler = this.mMainHandler;
                ListenerDispatcher listenerDispatcher = new ListenerDispatcher(initCallback, this.mLoadState);
                Class<?> cls = Class.forName(Jg.Wd("\u0007Fr9t'XTR\u0011?\u0014k1U\u0016M\u0013", (short) (C1499aX.Xd() ^ (-30354)), (short) (C1499aX.Xd() ^ (-26279))));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(ZO.xd("\u0002m)WfCv]h\bQjwk]*{\u0017", (short) (C1633zX.Xd() ^ (-8894)), (short) (C1633zX.Xd() ^ (-23061))));
                Object[] objArr = {listenerDispatcher};
                Method method = cls.getMethod(C1626yg.Ud("FaE\u0012", (short) (C1633zX.Xd() ^ (-5255)), (short) (C1633zX.Xd() ^ (-19849))), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else {
                this.mInitCallbacks.add(initCallback);
            }
        } finally {
            this.mInitLock.writeLock().unlock();
        }
    }

    public void unregisterInitCallback(InitCallback initCallback) {
        Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
        this.mInitLock.writeLock().lock();
        try {
            this.mInitCallbacks.remove(initCallback);
        } finally {
            this.mInitLock.writeLock().unlock();
        }
    }

    public int getLoadState() {
        this.mInitLock.readLock().lock();
        try {
            return this.mLoadState;
        } finally {
            this.mInitLock.readLock().unlock();
        }
    }

    private boolean isInitialized() {
        return getLoadState() == 1;
    }

    public boolean isEmojiSpanIndicatorEnabled() {
        return this.mEmojiSpanIndicatorEnabled;
    }

    public int getEmojiSpanIndicatorColor() {
        return this.mEmojiSpanIndicatorColor;
    }

    public int getEmojiStart(CharSequence charSequence, int i2) {
        return this.mHelper.getEmojiStart(charSequence, i2);
    }

    public int getEmojiEnd(CharSequence charSequence, int i2) {
        return this.mHelper.getEmojiEnd(charSequence, i2);
    }

    public static boolean handleOnKeyDown(Editable editable, int i2, KeyEvent keyEvent) {
        return EmojiProcessor.handleOnKeyDown(editable, i2, keyEvent);
    }

    public static boolean handleDeleteSurroundingText(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z2) {
        return EmojiProcessor.handleDeleteSurroundingText(inputConnection, editable, i2, i3, z2);
    }

    @Deprecated
    public boolean hasEmojiGlyph(CharSequence charSequence) {
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        return this.mHelper.hasEmojiGlyph(charSequence);
    }

    @Deprecated
    public boolean hasEmojiGlyph(CharSequence charSequence, int i2) {
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        return this.mHelper.hasEmojiGlyph(charSequence, i2);
    }

    public int getEmojiMatch(CharSequence charSequence, int i2) {
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        return this.mHelper.getEmojiMatch(charSequence, i2);
    }

    public CharSequence process(CharSequence charSequence) {
        return process(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence process(CharSequence charSequence, int i2, int i3) {
        return process(charSequence, i2, i3, Integer.MAX_VALUE);
    }

    public CharSequence process(CharSequence charSequence, int i2, int i3, int i4) {
        return process(charSequence, i2, i3, i4, 0);
    }

    public CharSequence process(CharSequence charSequence, int i2, int i3, int i4, int i5) {
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkArgumentNonnegative(i2, "start cannot be negative");
        Preconditions.checkArgumentNonnegative(i3, "end cannot be negative");
        Preconditions.checkArgumentNonnegative(i4, "maxEmojiCount cannot be negative");
        boolean z2 = false;
        Preconditions.checkArgument(i2 <= i3, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        Preconditions.checkArgument(i2 <= charSequence.length(), "start should be < than charSequence length");
        Preconditions.checkArgument(i3 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        if (i5 == 1) {
            z2 = true;
        } else if (i5 != 2) {
            z2 = this.mReplaceAll;
        }
        return this.mHelper.process(charSequence, i2, i3, i4, z2);
    }

    public String getAssetSignature() {
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        return this.mHelper.getAssetSignature();
    }

    public void updateEditorInfo(EditorInfo editorInfo) {
        if (isInitialized() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.mHelper.updateEditorInfoAttrs(editorInfo);
        }
    }

    public static class DefaultSpanFactory implements SpanFactory {
        @Override // androidx.emoji2.text.EmojiCompat.SpanFactory
        public EmojiSpan createSpan(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            return new TypefaceEmojiSpan(typefaceEmojiRasterizer);
        }
    }

    public static abstract class Config {
        int[] mEmojiAsDefaultStyleExceptions;
        boolean mEmojiSpanIndicatorEnabled;
        Set<InitCallback> mInitCallbacks;
        final MetadataRepoLoader mMetadataLoader;
        boolean mReplaceAll;
        SpanFactory mSpanFactory;
        boolean mUseEmojiAsDefaultStyle;
        int mEmojiSpanIndicatorColor = -16711936;
        int mMetadataLoadStrategy = 0;
        GlyphChecker mGlyphChecker = new DefaultGlyphChecker();

        protected Config(MetadataRepoLoader metadataRepoLoader) {
            Preconditions.checkNotNull(metadataRepoLoader, "metadataLoader cannot be null.");
            this.mMetadataLoader = metadataRepoLoader;
        }

        public Config registerInitCallback(InitCallback initCallback) {
            Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
            if (this.mInitCallbacks == null) {
                this.mInitCallbacks = new ArraySet();
            }
            this.mInitCallbacks.add(initCallback);
            return this;
        }

        public Config unregisterInitCallback(InitCallback initCallback) {
            Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
            Set<InitCallback> set = this.mInitCallbacks;
            if (set != null) {
                set.remove(initCallback);
            }
            return this;
        }

        public Config setReplaceAll(boolean z2) {
            this.mReplaceAll = z2;
            return this;
        }

        public Config setUseEmojiAsDefaultStyle(boolean z2) {
            return setUseEmojiAsDefaultStyle(z2, null);
        }

        public Config setUseEmojiAsDefaultStyle(boolean z2, List<Integer> list) {
            this.mUseEmojiAsDefaultStyle = z2;
            if (z2 && list != null) {
                this.mEmojiAsDefaultStyleExceptions = new int[list.size()];
                Iterator<Integer> it = list.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    this.mEmojiAsDefaultStyleExceptions[i2] = it.next().intValue();
                    i2++;
                }
                Arrays.sort(this.mEmojiAsDefaultStyleExceptions);
            } else {
                this.mEmojiAsDefaultStyleExceptions = null;
            }
            return this;
        }

        public Config setEmojiSpanIndicatorEnabled(boolean z2) {
            this.mEmojiSpanIndicatorEnabled = z2;
            return this;
        }

        public Config setEmojiSpanIndicatorColor(int i2) {
            this.mEmojiSpanIndicatorColor = i2;
            return this;
        }

        public Config setMetadataLoadStrategy(int i2) {
            this.mMetadataLoadStrategy = i2;
            return this;
        }

        public Config setSpanFactory(SpanFactory spanFactory) {
            this.mSpanFactory = spanFactory;
            return this;
        }

        public Config setGlyphChecker(GlyphChecker glyphChecker) {
            Preconditions.checkNotNull(glyphChecker, "GlyphChecker cannot be null");
            this.mGlyphChecker = glyphChecker;
            return this;
        }

        protected final MetadataRepoLoader getMetadataRepoLoader() {
            return this.mMetadataLoader;
        }
    }

    private static class ListenerDispatcher implements Runnable {
        private final List<InitCallback> mInitCallbacks;
        private final int mLoadState;
        private final Throwable mThrowable;

        ListenerDispatcher(InitCallback initCallback, int i2) {
            this(Arrays.asList((InitCallback) Preconditions.checkNotNull(initCallback, "initCallback cannot be null")), i2, null);
        }

        ListenerDispatcher(Collection<InitCallback> collection, int i2) {
            this(collection, i2, null);
        }

        ListenerDispatcher(Collection<InitCallback> collection, int i2, Throwable th) {
            Preconditions.checkNotNull(collection, "initCallbacks cannot be null");
            this.mInitCallbacks = new ArrayList(collection);
            this.mLoadState = i2;
            this.mThrowable = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.mInitCallbacks.size();
            int i2 = 0;
            if (this.mLoadState != 1) {
                while (i2 < size) {
                    this.mInitCallbacks.get(i2).onFailed(this.mThrowable);
                    i2++;
                }
            } else {
                while (i2 < size) {
                    this.mInitCallbacks.get(i2).onInitialized();
                    i2++;
                }
            }
        }
    }

    private static class CompatInternal {
        final EmojiCompat mEmojiCompat;

        int getEmojiEnd(CharSequence charSequence, int i2) {
            return -1;
        }

        public int getEmojiMatch(CharSequence charSequence, int i2) {
            return 0;
        }

        int getEmojiStart(CharSequence charSequence, int i2) {
            return -1;
        }

        boolean hasEmojiGlyph(CharSequence charSequence) {
            return false;
        }

        boolean hasEmojiGlyph(CharSequence charSequence, int i2) {
            return false;
        }

        CharSequence process(CharSequence charSequence, int i2, int i3, int i4, boolean z2) {
            return charSequence;
        }

        void updateEditorInfoAttrs(EditorInfo editorInfo) {
        }

        CompatInternal(EmojiCompat emojiCompat) {
            this.mEmojiCompat = emojiCompat;
        }

        void loadMetadata() throws Throwable {
            this.mEmojiCompat.onMetadataLoadSuccess();
        }

        String getAssetSignature() {
            return "";
        }
    }

    private static final class CompatInternal19 extends CompatInternal {
        private volatile MetadataRepo mMetadataRepo;
        private volatile EmojiProcessor mProcessor;

        CompatInternal19(EmojiCompat emojiCompat) {
            super(emojiCompat);
        }

        /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompat$CompatInternal19$1 */
        class AnonymousClass1 extends MetadataRepoLoaderCallback {
            AnonymousClass1() {
            }

            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
            public void onLoaded(MetadataRepo metadataRepo) throws Throwable {
                CompatInternal19.this.onMetadataLoadSuccess(metadataRepo);
            }

            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
            public void onFailed(Throwable th) throws Throwable {
                CompatInternal19.this.mEmojiCompat.onMetadataLoadFailed(th);
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        void loadMetadata() throws Throwable {
            try {
                this.mEmojiCompat.mMetadataLoader.load(new MetadataRepoLoaderCallback() { // from class: androidx.emoji2.text.EmojiCompat.CompatInternal19.1
                    AnonymousClass1() {
                    }

                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    public void onLoaded(MetadataRepo metadataRepo) throws Throwable {
                        CompatInternal19.this.onMetadataLoadSuccess(metadataRepo);
                    }

                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    public void onFailed(Throwable th) throws Throwable {
                        CompatInternal19.this.mEmojiCompat.onMetadataLoadFailed(th);
                    }
                });
            } catch (Throwable th) {
                this.mEmojiCompat.onMetadataLoadFailed(th);
            }
        }

        void onMetadataLoadSuccess(MetadataRepo metadataRepo) throws Throwable {
            if (metadataRepo == null) {
                this.mEmojiCompat.onMetadataLoadFailed(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.mMetadataRepo = metadataRepo;
            this.mProcessor = new EmojiProcessor(this.mMetadataRepo, this.mEmojiCompat.mSpanFactory, this.mEmojiCompat.mGlyphChecker, this.mEmojiCompat.mUseEmojiAsDefaultStyle, this.mEmojiCompat.mEmojiAsDefaultStyleExceptions, EmojiExclusions.getEmojiExclusions());
            this.mEmojiCompat.onMetadataLoadSuccess();
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        boolean hasEmojiGlyph(CharSequence charSequence) {
            return this.mProcessor.getEmojiMatch(charSequence) == 1;
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        boolean hasEmojiGlyph(CharSequence charSequence, int i2) {
            return this.mProcessor.getEmojiMatch(charSequence, i2) == 1;
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        public int getEmojiMatch(CharSequence charSequence, int i2) {
            return this.mProcessor.getEmojiMatch(charSequence, i2);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        int getEmojiStart(CharSequence charSequence, int i2) {
            return this.mProcessor.getEmojiStart(charSequence, i2);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        int getEmojiEnd(CharSequence charSequence, int i2) {
            return this.mProcessor.getEmojiEnd(charSequence, i2);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        CharSequence process(CharSequence charSequence, int i2, int i3, int i4, boolean z2) {
            return this.mProcessor.process(charSequence, i2, i3, i4, z2);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        void updateEditorInfoAttrs(EditorInfo editorInfo) {
            editorInfo.extras.putInt(EmojiCompat.EDITOR_INFO_METAVERSION_KEY, this.mMetadataRepo.getMetadataVersion());
            editorInfo.extras.putBoolean(EmojiCompat.EDITOR_INFO_REPLACE_ALL_KEY, this.mEmojiCompat.mReplaceAll);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        String getAssetSignature() {
            String strSourceSha = this.mMetadataRepo.getMetadataList().sourceSha();
            return strSourceSha == null ? "" : strSourceSha;
        }
    }
}
