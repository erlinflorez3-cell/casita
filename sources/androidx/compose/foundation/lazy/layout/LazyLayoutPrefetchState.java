package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012\u000e\u0007njG0Le^.ZS0\u000fs{J$c$wFCU0}*\tUOog|hb\u000bY\u000f\u000e\u0016~j4Ikxe܈\u00172PuG\u074cUoS9ht<\b&78\u0600*\u0005/\u0019bH.\u0016;o[\u0014\u00180NpRT#L3\u001b\"\u001fD \u000f tz^8Xl\f>?%\u0013ipS=^^\u007f֔\u0011FZ-˼za,2\tHC'=Y\u0013\tb[m\u0017m\u0005\u0004ݛص+'1^<cDn\u0018\u0014CB\u007f\u0011k\u000b>\\3j)*5Agcyg>,\u0006\u0013\u0014\rj\u001d>\n5bF-H\u0002ܕ\rޗϢvUFl\u0010{\u0013\u001f\tcN*5\u0002C+g\u001fvSq;GSMz3\u0010̷'\u0001t'2٭\u0010\u05ce\u0019\u001b\\ȭ\"K_HUJd\t\bFDՏ|Ċ\u00066\f\u0382_\u00025\u0006\u001f97'=gG0qw\u0010V\\g%\u00147èUׂVHH̎?*E*!\u000epC\u0013\u0006B\u00adVг0\u0017Uȼl\t\u0004\u0018!1ςwA)(\u0016ʼk\u0017hҽQ}"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;9\u0004'HL]*_@\u00029#\u00120", "", ">qT3X;<V\u0007|}^+\r\u0010/r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nQ*Qv&WSN92", "=m=2f;>R\u0004\fz_,\f\u00072", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005T4,$h`$\u0014c-N\u0006%J:L6gRH", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001f+\u0015iaH\u0005f\u001aLy'F\\U,i(YC\u001e!a\u0012Wt\u0012\u0016a\u000b%~M5.\f6R\u0010\u0005I\u0011\u0015\u0014\u001d9ty\u000e,S8", ">qT3X;<V{z\u0004]3|s<o\u0011,z@\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nF(Wu.G7[6mVq=!g", "5dc\u001de,?S(|}A(\u0006\b6ej5\u0006Q\u0005\u0016\u0017T.\u000fF\u0007.4U\r$Av\u0010;MJ;gB\u001e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\t\"hb9\u0016a/1r0FSN\u0017i\\\u0004A\u0013\u0012gc", "Adc\u001de,?S(|}A(\u0006\b6ej5\u0006Q\u0005\u0016\u0017T.\u000fF\u0007.4U\r$Av\u0010;MJ;gB\u001e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001f+\u0015iaH\u0005f\u000fJ\u007f&NL99fcv<\u0014\u001f0Q?", ">qT3X;<V\u0001~\nk0z\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nK,]\u0004+EZ$", "5dc\u001de,?S(|}L*\u007f\t.u\u0007(\t~\u0002!'Pn\nKz/>S\u000b >m\u0012<M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\t\"hb9\u0016a/<t*GK^3\\_H", "1n[9X*M<\u0019\r\n^+g\u0016/f\u007f7yCm\u0017#Wo\u001cK\u0005", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nP,Z\u0007'U[$", "1n[9X*M<\u0019\r\n^+g\u0016/f\u007f7yCm\u0017#Wo\u001cK\u0005c6c\u000e)6i%2WL5x4%\u0015do9", "AbW2W<ES\u0004\fz_,\f\u00072", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;9\u0004'HL]*_@\u00029#\u0012\u0019x[+\u000e\u0005h?'Q@@\u001e\u000f,\u001f", "7mS2k", "", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "AbW2W<ES\u0004\fz_,\f\u00072-J.bL]#)", "uH9u?(GR&\t~]?F\u00079m\u000b2\n@J\u0018!Wx\r8\u0006)?bG'3\u0003*wT?OuD-^O]N\u001bJ(b\u00017V7[,]R\u0002;\u0017\u007fi\n]+KofA%nS5\"j(R\u0001BhV", "\u001cdbAX+)`\u0019\u007fzm*\u007fv-o\u000b(_H\f\u001e", "\u001eqT3X;<V{z\u0004]3|", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyLayoutPrefetchState {
    public static final int $stable = 0;
    private final Function1<NestedPrefetchScope, Unit> onNestedPrefetch;
    private PrefetchHandleProvider prefetchHandleProvider;
    private final PrefetchMetrics prefetchMetrics;
    private final PrefetchScheduler prefetchScheduler;

    /* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4\u0012\u000e\u0007nʑ?%Z͜x.\u0001Rr\u0015y{L$\n%8g\u0004[(\u007f:\t}O.\fôIZ\u000eGȝ\u0005ǝёj0QW~|@\u000e̙Ftс7L"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;9\u0004'HL]*_@\u00029#\u0012\u0019x[+\u000e\u0005h?'Q@@\u001e\u000f,\u001f", "", "1`]0X3", "", ";`a84:.`\u001b~\u0004m", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005JD&\u001d|D5\u0010b3NL", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nF(Wu.G7[6mVq=!P=\nW*\u0014\u00055J#[DC/\b:XeCs\ba", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface PrefetchHandle {
        void cancel();

        void markAsUrgent();
    }

    public LazyLayoutPrefetchState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutPrefetchState(PrefetchScheduler prefetchScheduler, Function1<? super NestedPrefetchScope, Unit> function1) {
        this.prefetchScheduler = prefetchScheduler;
        this.onNestedPrefetch = function1;
        this.prefetchMetrics = new PrefetchMetrics();
    }

    public /* synthetic */ LazyLayoutPrefetchState(PrefetchScheduler prefetchScheduler, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? null : prefetchScheduler, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : function1);
    }

    public final PrefetchScheduler getPrefetchScheduler$foundation_release() {
        return this.prefetchScheduler;
    }

    public final PrefetchHandleProvider getPrefetchHandleProvider$foundation_release() {
        return this.prefetchHandleProvider;
    }

    public final void setPrefetchHandleProvider$foundation_release(PrefetchHandleProvider prefetchHandleProvider) {
        this.prefetchHandleProvider = prefetchHandleProvider;
    }

    public final PrefetchHandle schedulePrefetch(int i2) {
        return m1190schedulePrefetch0kLqBqw(i2, LazyLayoutPrefetchStateKt.ZeroConstraints);
    }

    /* JADX INFO: renamed from: schedulePrefetch-0kLqBqw, reason: not valid java name */
    public final PrefetchHandle m1190schedulePrefetch0kLqBqw(int i2, long j2) {
        PrefetchHandle prefetchHandleM1203schedulePrefetchVKLhPVY;
        PrefetchHandleProvider prefetchHandleProvider = this.prefetchHandleProvider;
        return (prefetchHandleProvider == null || (prefetchHandleM1203schedulePrefetchVKLhPVY = prefetchHandleProvider.m1203schedulePrefetchVKLhPVY(i2, j2, this.prefetchMetrics)) == null) ? DummyHandle.INSTANCE : prefetchHandleM1203schedulePrefetchVKLhPVY;
    }

    public final List<PrefetchRequest> collectNestedPrefetchRequests$foundation_release() {
        Function1<NestedPrefetchScope, Unit> function1 = this.onNestedPrefetch;
        if (function1 == null) {
            return CollectionsKt.emptyList();
        }
        NestedPrefetchScopeImpl nestedPrefetchScopeImpl = new NestedPrefetchScopeImpl();
        function1.invoke(nestedPrefetchScopeImpl);
        return nestedPrefetchScopeImpl.getRequests();
    }

    /* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLcz\u0004I\u0006>*6B\u0015\"4ߚ\u007f\u0007t\tA0JfP.`S2şs{B*cҕyCQU\"}(\nUȡi}ñzZ9BO\tȀ|j:I\u001e\u0007k\u001a'2pxo7[yU9\u000f\u007f|\u0019hR0@\u0012\u0005/#ZL\u001e\u0001\u0013Cy\u0017B4N|RR;ZK.ǀ\u0005̄ŋ\u0005 bu\\E\u0019~k;G)\u0013kRNUb^~$θHù+\r~ѭn@N;M\u001b5U\u0013\u0007\u0001^m\bu6ݘ\tl?)1O\u0002^̯X\u0005\u001c\u00181̟)\fq͏`\u0015"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;9\u0004'HL]*_@\u00029#\u0012\u0019vN9\u001c\u0005X,1nE7.\u0006/7\u007fEs\u0001o\u001e\u0019<@", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005T4,$h`$\u0014c-N\u0006%J:L6gRH", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]a4GMN;ZU`L\u0010!Zc\u0012\u001c", "-qT>h,Lb'", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nP,Z\u0007'U[$", "@d`BX:Ma", "", "5dc\u001fX8NS'\u000e\t", "u(;7T=:\u001d)\u000e~euc\r=tU", "AbW2W<ES\u0004\fz_,\f\u00072", "", "7mS2k", "", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "AbW2W<ES\u0004\fz_,\f\u00072-J.bL]#)", "uH9uI", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class NestedPrefetchScopeImpl implements NestedPrefetchScope {
        private final List<PrefetchRequest> _requests = new ArrayList();

        public NestedPrefetchScopeImpl() {
        }

        public final List<PrefetchRequest> getRequests() {
            return this._requests;
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        public void schedulePrefetch(int i2) {
            mo1191schedulePrefetch0kLqBqw(i2, LazyLayoutPrefetchStateKt.ZeroConstraints);
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        /* JADX INFO: renamed from: schedulePrefetch-0kLqBqw, reason: not valid java name */
        public void mo1191schedulePrefetch0kLqBqw(int i2, long j2) {
            PrefetchHandleProvider prefetchHandleProvider$foundation_release = LazyLayoutPrefetchState.this.getPrefetchHandleProvider$foundation_release();
            if (prefetchHandleProvider$foundation_release == null) {
                return;
            }
            this._requests.add(prefetchHandleProvider$foundation_release.m1202createNestedPrefetchRequestVKLhPVY(i2, j2, LazyLayoutPrefetchState.this.prefetchMetrics));
        }
    }
}
