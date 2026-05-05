package androidx.compose.ui.text.font;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
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
/* JADX INFO: compiled from: FontStyle.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4E\u0007\":\u001b\u007f\u0007lnA0RqP.XU0ŧ*\u0012éBlTqq:\u000e\u0019\u000fb\u0018USwk|Jr\u000bq\u0010و\u001azp.WXAu \u0015JB\u001eFcS}EQb\u000b53\u001fxƉ9ѩ\t\u0003 3V\u001a?\tQV$\u0012^A7ńQҫQ\u0007 \u001e\u0014Ah\u000e,i\u007fNdV3qƠ3%\txP^wn>|e\rtUܮ\u0011|iӜCB=9#*َ\u0002\u0007ҡ_Q"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "5dc#T3NS", "u(8", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class FontStyle {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Normal = m6231constructorimpl(0);
    private static final int Italic = m6231constructorimpl(1);

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontStyle m6230boximpl(int i2) {
        return new FontStyle(i2);
    }

    @Deprecated(message = "\u0013R\u00016\u0005yTlkLg`_#@Ape\u0015,RV\u001bd\u0004Gz*]\u0007cLwZx5aut>\u0014\u0007G;\u001e_O", replaceWith = @ReplaceWith(expression = "FontStyle.", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m6231constructorimpl(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6232equalsimpl(int i2, Object obj) {
        return (obj instanceof FontStyle) && i2 == ((FontStyle) obj).m6236unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6233equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6234hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    public boolean equals(Object obj) {
        return m6232equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6234hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6236unboximpl() {
        return this.value;
    }

    @Deprecated(message = "\u0013R\u00016\u0005yTlkLg`_#@Ape\u0015,RV\u001bd\u0004Gz*]\u0007cLwZx5aut>\u0014\u0007G;\u001e_O", replaceWith = @ReplaceWith(expression = "FontStyle.", imports = {}))
    @InterfaceC1492Gx
    private /* synthetic */ FontStyle(int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    public String toString() {
        return m6235toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6235toStringimpl(int i2) {
        return m6233equalsimpl0(i2, Normal) ? ReactProgressBarViewManager.DEFAULT_STYLE : m6233equalsimpl0(i2, Italic) ? "Italic" : "Invalid";
    }

    /* JADX INFO: compiled from: FontStyle.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005(4\u0012\u0006%nʑ?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\u0004_(\b:\u000f_Pwg\u001dL\t\u0016\u0014,\u0014\u0017\u0011jZKȺwزށ\u000e1ԲsM;M}CIbz9\u0013 J$>}\u0013\u0006jGV\u0017\u000fzqMŁ\u0011ؓфo9ň\u0011[\r\u001a \fN\"\u0007&jgf8Nuk?ǅ#\fqETϭ{^{U\rLsܴ\u0011\u0003"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTCyI>& dj=\u0011l\u0002", "", "u(E", "\u0017sP9\\*", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "5dc\u0016g(EW\u0017Ft&\u0013Z\bAA>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc\u0016g(EW\u0017Ft&\u0013Z\bAA", "u(8", "\u0017", "\u001cna:T3", "5dc\u001bb9FO Ft&\u0013Z\bAA>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc\u001bb9FO Ft&\u0013Z\bAA", "D`[BX:", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getItalic-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m6237getItalic_LCdwA$annotations() {
        }

        /* JADX INFO: renamed from: getNormal-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m6238getNormal_LCdwA$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getNormal-_-LCdwA, reason: not valid java name */
        public final int m6240getNormal_LCdwA() {
            return FontStyle.Normal;
        }

        /* JADX INFO: renamed from: getItalic-_-LCdwA, reason: not valid java name */
        public final int m6239getItalic_LCdwA() {
            return FontStyle.Italic;
        }

        public final List<FontStyle> values() {
            return CollectionsKt.listOf((Object[]) new FontStyle[]{FontStyle.m6230boximpl(m6240getNormal_LCdwA()), FontStyle.m6230boximpl(m6239getItalic_LCdwA())});
        }
    }
}
