package androidx.compose.ui.text.font;

import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.caches.SimpleArrayMap;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0ZeP.hS2şs{J$c$wCCU0}*ޛWN}gvJ`\u000bK\u000f\u0014\u0016\u0001j2I]xk\u001b\u00172HoG3coE9vt>\u0005&2*8\u0010\u0005\t\u001a0I\u0016͌\u0011ŏ{\f@/xpWpMPŋ\u001e\u0012\u0014>h\",g\u007fPLG\u001b_j31\u000f\u0002B|4\u00104\u000b[%F\u00036͒u`Օ*¨˝9\u0015+cK/`lW\u0003m\u0004m\tv3?+w\u0001\b:f\u000e,\u0015Y^=c\u00019t\u0007g_:&[UiK^\"@w)\u0011U\u0003\u0012$\u001e)^-[\u0019\u0017\f\u001c?\rr\u0002M\u0001\u0006lP\u0018z\u0010EG)\u000eGC9I{\u0002}I0fO\u0002\u0004\u001d(3\t~%kV$_C\u001a\u0003\u0011a5aBSG|\t\bU4Օ/Ċ\u0006*\u0012J\u0010)=\u0017)0-$eZi'/w\u001aHrt'\tnvki\u0001Wp.|-O2\u0019\u0010jFz\u0004\u001aO\u0003trґSlh\u0015~ \u0013N^N˖#ڰ\u000fʚұghҷQ_\u0012%=i\be|o&Wgc\n̓SӒ\u0014aZΘdWJh\u001ddvDc\f\td8$BH\u0019\u0012&\u0003\u001b\u008b\u000eƱ6?yʉ\u0005D?\"t!X\u0005.Bo\u0005\u0019ajh>\u0001\u0003=zѳk˨x\t\tˆʗpxo{Oص\u0019\u000f!5AWTԐ*t"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~5\f4@k\u0005BXC<g2\u001erd_<\u00079", "", "u(E", "\u001eda:T5>\\(_vb3\r\u0016/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~5\f4@k\u0005BXC<g2\u001erd_<\u0007\"\b\\\u000b0E;b7\\Sn;\u0014~Z\u001c^2\u001cZ", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "1`R5X\u0013HQ\u001f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0019Cr46c\u000b(\u0001[*7KFHu=\"*h`#\u0004h,L\u0006|", ">da:T5>\\(\\v\\/|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\f8t(5gG\u000e;u!5M\u001fHx02|dl\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~5\f4@k\u0005BXC<g2\u001erd_<\u0007\"\u0012N\u000b|", "@dbB_;\u001cO\u0017\u0002z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\f8t(5gG\u0007D}s*KF;A", "5dc", "4n]A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FC", ">kPAY6K[y\t\u0004m\u0013\u0007\u0005.e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~D\u0005\u001cFn ;U$EtC\u0005\u001fd`9\u00149", "5dcy$\b,2)bM", ">tc", "", "@dbB_;", "4na2i,K", "", "@t]\u0010T*AS\u0018", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|k\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011\\RukR\u0006L]\u0013d\u0017]tw\fUP%xQ?\u007f\u00125XhEd\u007f\f#c*QvLe\u0017K\u0003^zR12GihwVEOk8.lo&ZI>.\u001d=n\u0002nZ=\u0011\u007f\\Zp\\\u0007qwV\u001d\u000482\bKeOTs^Lp6#U\u0005MU\u0019]p<pv\u000b038.nHl\u0018<mN", "@t]\u0010T*AS\u0018[\u0002h*\u0003\r8g", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u000frh;V\u001bR^\u0019\u007fv\\,i\t=u\u00077", "\u0019dh", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AsyncTypefaceCache {
    public static final int $stable = 8;
    private final Object PermanentFailure = AsyncTypefaceResult.m6191constructorimpl(null);
    private final LruCache<Key, AsyncTypefaceResult> resultCache = new LruCache<>(16);
    private final SimpleArrayMap<Key, AsyncTypefaceResult> permanentCache = new SimpleArrayMap<>(0, 1, null);
    private final SynchronizedObject cacheLock = Synchronization_jvmKt.createSynchronizedObject();

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1, reason: invalid class name */
    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~D\f}\u0012\u000fI\u0003\r\r\u0014Nb\u0016\u001d\u0013\tz!\u0019\u000f\u0011\r\u0010\u0013q\u0011\u0014\u001a\u0018", f = "\u0013;9>\u00151::\u000b316\u0007!,')5\u000f3)\u001d\u001d\u0017\u0018\u0019s\u0016\u0012 #\u0013\u001fY\u0016\u001e", i = {0, 0, 0}, l = {398}, m = "AE?\u001547=;;", n = {"c^kY", "Z[{", "UetKh[T"}, s = {"xQ^", "xQ_", "\u0007Q^"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AsyncTypefaceCache.this.runCached(null, null, false, null, this);
        }
    }

    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0006I\u0006>\u00146B\u0005)4\u0012\u0006\rnj?1LeV:ZS0\u0010qږr:ӋTqq:\u0016)\u000e(\u0017Ofi}mxYŲG\u0011\f\u0017\u0007ltac\u0002u\u0012=6ruM=eqS8\u000fs|ԣ!ݨ&:\u007f\u0010\u000f&rV\u001e\u0004\u0013Cy\u001aX٪?¤>T\u0013\\\u0013*Z\u0014L1\u0019\u001e\u000by\u0015ɻGǰa<56\u0011}\u0013]5bH|{\u0011|\u0019ܮ\u0011zy 1EE;e6a\u0003\u001fTq>1>џA\u000bpѧ?-Oze>ݢ~\u0014Ƭ/d"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~5\f4@k\u0005BXC<g2\u001erd_<\u0007\"\b\\\u000b0E;b7\\Sn;\u0014~Z\u001c^2\u001cZ", "", "@dbB_;", "1n]@g9NQ(\t\b&0\u0005\u00146", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "7r?2e4:\\\u0019\b\n?(\u0001\u0010?r\u007f", "", "7r?2e4:\\\u0019\b\n?(\u0001\u0010?r\u007fo\u007fH\f\u001e", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "5dc\u001fX:NZ(", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "3pd._:", "=sW2e", "3pd._:\u0006W!\n\u0002", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kqB", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @JvmInline
    public static final class AsyncTypefaceResult {
        private final Object result;

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ AsyncTypefaceResult m6190boximpl(Object obj) {
            return new AsyncTypefaceResult(obj);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static Object m6191constructorimpl(Object obj) {
            return obj;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m6192equalsimpl(Object obj, Object obj2) {
            return (obj2 instanceof AsyncTypefaceResult) && Intrinsics.areEqual(obj, ((AsyncTypefaceResult) obj2).m6197unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m6193equalsimpl0(Object obj, Object obj2) {
            return Intrinsics.areEqual(obj, obj2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m6194hashCodeimpl(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* JADX INFO: renamed from: isPermanentFailure-impl, reason: not valid java name */
        public static final boolean m6195isPermanentFailureimpl(Object obj) {
            return obj == null;
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m6196toStringimpl(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return m6192equalsimpl(this.result, obj);
        }

        public int hashCode() {
            return m6194hashCodeimpl(this.result);
        }

        public String toString() {
            return m6196toStringimpl(this.result);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Object m6197unboximpl() {
            return this.result;
        }

        private /* synthetic */ AsyncTypefaceResult(Object obj) {
            this.result = obj;
        }

        public final Object getResult() {
            return this.result;
        }
    }

    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4J\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:Śa:ڎs;\u0004\u0019>7\u0019S\\g\u007fnx[\u001bI\u001d\b.z\u0001+wTޯa\u0012\u001d5\u000bvM;eok:'ӡ7M)@+P{\u001b\u007fH)\u000fǼwC`Y\u0016*0n\u0081jX\u0013M\u0013\u001a*\u0006l!1&bg\\8`ns9]\"IފA\u00178m;\u0015M;R\u0005-\u001b\u0004y A?e4[ɃTK\u000e`iW\u0003m\u0001\u0004\u07b2go.9Y\fWdiFу\u0014{^\u001b]\u000b&\u000b\u0006Ōd\u0012/˃geQT\u001c-H\f\n\u000fT\u0006$\u0005UGͶ1 nڜ&5zxaGй\u0006p"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~5\f4@k\u0005BXC<g2\u001erd_<\u0007\"\u0012N\u000b|", "", "4n]A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FC", ":nP1X9$S-", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d\u0010?", "5dc\u0013b5M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u0004", "5dc\u0019b(=S&dzr", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Key {
        public static final int $stable = 8;
        private final Font font;
        private final Object loaderKey;

        public static /* synthetic */ Key copy$default(Key key, Font font, Object obj, int i2, Object obj2) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                font = key.font;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                obj = key.loaderKey;
            }
            return key.copy(font, obj);
        }

        public final Font component1() {
            return this.font;
        }

        public final Object component2() {
            return this.loaderKey;
        }

        public final Key copy(Font font, Object obj) {
            return new Key(font, obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return Intrinsics.areEqual(this.font, key.font) && Intrinsics.areEqual(this.loaderKey, key.loaderKey);
        }

        public int hashCode() {
            int iHashCode = this.font.hashCode() * 31;
            Object obj = this.loaderKey;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.font + ", loaderKey=" + this.loaderKey + ')';
        }

        public Key(Font font, Object obj) {
            this.font = font;
            this.loaderKey = obj;
        }

        public final Font getFont() {
            return this.font;
        }

        public final Object getLoaderKey() {
            return this.loaderKey;
        }
    }

    public static /* synthetic */ void put$default(AsyncTypefaceCache asyncTypefaceCache, Font font, PlatformFontLoader platformFontLoader, Object obj, boolean z2, int i2, Object obj2) {
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        asyncTypefaceCache.put(font, platformFontLoader, obj, z2);
    }

    public final void put(Font font, PlatformFontLoader platformFontLoader, Object obj, boolean z2) {
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            if (obj == null) {
                this.permanentCache.put(key, AsyncTypefaceResult.m6190boximpl(this.PermanentFailure));
            } else if (z2) {
                this.permanentCache.put(key, AsyncTypefaceResult.m6190boximpl(AsyncTypefaceResult.m6191constructorimpl(obj)));
            } else {
                this.resultCache.put(key, AsyncTypefaceResult.m6190boximpl(AsyncTypefaceResult.m6191constructorimpl(obj)));
            }
        }
    }

    /* JADX INFO: renamed from: get-1ASDuI8, reason: not valid java name */
    public final AsyncTypefaceResult m6189get1ASDuI8(Font font, PlatformFontLoader platformFontLoader) {
        AsyncTypefaceResult asyncTypefaceResult;
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            asyncTypefaceResult = this.resultCache.get(key);
            if (asyncTypefaceResult == null) {
                asyncTypefaceResult = this.permanentCache.get(key);
            }
        }
        return asyncTypefaceResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object runCached(androidx.compose.ui.text.font.Font r8, androidx.compose.ui.text.font.PlatformFontLoader r9, boolean r10, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> r11, kotlin.coroutines.Continuation<java.lang.Object> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.text.font.AsyncTypefaceCache.AnonymousClass1
            if (r0 == 0) goto L71
            r5 = r12
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r5 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AnonymousClass1) r5
            int r0 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L71
            int r0 = r5.label
            int r0 = r0 - r2
            r5.label = r0
        L19:
            java.lang.Object r3 = r5.result
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L39
            if (r0 != r2) goto La7
            boolean r10 = r5.Z$0
            java.lang.Object r4 = r5.L$1
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r4 = (androidx.compose.ui.text.font.AsyncTypefaceCache.Key) r4
            java.lang.Object r0 = r5.L$0
            androidx.compose.ui.text.font.AsyncTypefaceCache r0 = (androidx.compose.ui.text.font.AsyncTypefaceCache) r0
            kotlin.ResultKt.throwOnFailure(r3)
        L33:
            androidx.compose.ui.text.platform.SynchronizedObject r2 = r0.cacheLock
            monitor-enter(r2)
            if (r3 != 0) goto L77
            goto L95
        L39:
            kotlin.ResultKt.throwOnFailure(r3)
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r4 = new androidx.compose.ui.text.font.AsyncTypefaceCache$Key
            java.lang.Object r0 = r9.getCacheKey()
            r4.<init>(r8, r0)
            androidx.compose.ui.text.platform.SynchronizedObject r1 = r7.cacheLock
            monitor-enter(r1)
            androidx.compose.ui.text.caches.LruCache<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r0 = r7.resultCache     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> Lb5
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r0 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r0     // Catch: java.lang.Throwable -> Lb5
            if (r0 != 0) goto L5a
            androidx.compose.ui.text.caches.SimpleArrayMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r0 = r7.permanentCache     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> Lb5
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r0 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r0     // Catch: java.lang.Throwable -> Lb5
        L5a:
            if (r0 == 0) goto L5d
            goto Laf
        L5d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb5
            monitor-exit(r1)
            r5.L$0 = r7
            r5.L$1 = r4
            r5.Z$0 = r10
            r5.label = r2
            java.lang.Object r3 = r11.invoke(r5)
            if (r3 != r6) goto L6f
            return r6
        L6f:
            r0 = r7
            goto L33
        L71:
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r5 = new androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            r5.<init>(r12)
            goto L19
        L77:
            if (r10 == 0) goto L87
            androidx.compose.ui.text.caches.SimpleArrayMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r1 = r0.permanentCache     // Catch: java.lang.Throwable -> La4
            java.lang.Object r0 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m6191constructorimpl(r3)     // Catch: java.lang.Throwable -> La4
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r0 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m6190boximpl(r0)     // Catch: java.lang.Throwable -> La4
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> La4
            goto La0
        L87:
            androidx.compose.ui.text.caches.LruCache<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r1 = r0.resultCache     // Catch: java.lang.Throwable -> La4
            java.lang.Object r0 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m6191constructorimpl(r3)     // Catch: java.lang.Throwable -> La4
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r0 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m6190boximpl(r0)     // Catch: java.lang.Throwable -> La4
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> La4
            goto La0
        L95:
            androidx.compose.ui.text.caches.SimpleArrayMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r1 = r0.permanentCache     // Catch: java.lang.Throwable -> La4
            java.lang.Object r0 = r0.PermanentFailure     // Catch: java.lang.Throwable -> La4
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r0 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m6190boximpl(r0)     // Catch: java.lang.Throwable -> La4
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> La4
        La0:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La4
            monitor-exit(r2)
            return r3
        La4:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        La7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Laf:
            java.lang.Object r0 = r0.m6197unboximpl()     // Catch: java.lang.Throwable -> Lb5
            monitor-exit(r1)
            return r0
        Lb5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncTypefaceCache.runCached(androidx.compose.ui.text.font.Font, androidx.compose.ui.text.font.PlatformFontLoader, boolean, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object runCachedBlocking(Font font, PlatformFontLoader platformFontLoader, Function0<? extends Object> function0) {
        synchronized (this.cacheLock) {
            try {
                Key key = new Key(font, platformFontLoader.getCacheKey());
                AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceResult) this.resultCache.get(key);
                if (asyncTypefaceResult == null) {
                    asyncTypefaceResult = (AsyncTypefaceResult) this.permanentCache.get(key);
                }
                if (asyncTypefaceResult != null) {
                    Object objM6197unboximpl = asyncTypefaceResult.m6197unboximpl();
                    InlineMarker.finallyStart(2);
                    InlineMarker.finallyEnd(2);
                    return objM6197unboximpl;
                }
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                Object objInvoke = function0.invoke();
                put$default(this, font, platformFontLoader, objInvoke, false, 8, null);
                return objInvoke;
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
    }
}
