package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: AndroidPreloadedFont.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.`_2\u000fq|<$i-yCAW\"}8\tWNmmvJp\u000bK\u000f\f\u0017\u0001jBI]xs\u0012\u00172XoG\u074cS\u001eSʠ\u0011td\u0004`O(:\n\t\u000f\u001aBH>w\u000bGY\u000e*0nsJV\u001bQ\u001d\u001a@\u000b̧$\u0001,b0eD`\u0005_P.Q\u0014\u001aH\\@w2\u0013L;`\u001bE˼za$F\tLC1=U\u0019\u0006\u0001lo\u0007M\u000bU\u0005\u0017AmǢʁwW<uP&#2g\u000fsqTd[ŐbВ+/geQY\u001c2H\u0007\n\u0018T\u0004<\u0012}Ρ:ǉ\u001ef\u0010Ԅ\u0004\f\u0001UXP0a݆~Э̡5\u0016Ӿ\u0004;39)uicA&\\EL\u001f\u001b.;\u0003\u0005 \ned֬!ôX\u0004YĸiBCZ\\\u001dy?s\u0018~wR9\u00120_\u007f]| 2\u001d-ڛs;)7y\u0019҉Ch\u0015$\u0001èSrZKF̰\u000bD62\t\u0012y֎h&"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~5\u0007\u001fDw\u001a-8P;r>\u001a\u0014h`\u001a\u0011l;$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~5\u0007\u001fDw\u001a-.MDz\n", "EdX4[;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "D`a6T;B]\"lzm;\u0001\u00121s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5P\u0005|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|\b.QE>z\n\u0002{dj8\u0014m0M\npEVV7f`r\u0007$\u0016$\u001dN>\u001cNZK-}\u000e\u0018)\u0011;:}Hl|\u001b\u001a\u0018>)^Be\u001fK\u0003\u0017\u0004\u0017lY", "1`R5X\u0012>g", "", "5dc\u0010T*AS~~\u000f", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "2hS\u0016a0ME\u001d\u000e}<6\u0006\u0018/x\u000f", "", "5dc g@ES`xBE\n{\u001b\u000b", "u(8", "\u0017", "Bx_2Y(<S", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0017\u0010K\u0001\u0018\u0013Eoc", "5dc!l7>T\u0015|z\u001d<\u0001\u0003>e\u00137uM\u0001\u001e\u0017C}\u000e", "u(;.a+K]\u001d}D`9x\u00142i}6E/\u0015\"\u0017Hk\f<L", "Adc!l7>T\u0015|z\u001d<\u0001\u0003>e\u00137uM\u0001\u001e\u0017C}\u000e", "uKP;W9HW\u0018H|k(\b\f3c\u000eqjT\f\u0017\u0018Cm\u000e\u0012:\u0016", "5dc$X0@V(", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av% MG=nCs", "2n;<T+", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "2n;<T+|c\u001dx\n^?\f\u0003<e\u0007(wN\u0001", ":nP16(<V\u0019}", ":nP16(<V\u0019}9n0v\u0018/x\u000f\"\t@\b\u0017\u0013Uo", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~5\u0007\u001fDw\u001a-)QIkC~\u001fqp\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~5\u0007\u001fDw\u001a-.GBk\u0013\u001e#fn=\u0012r6[W1P[$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~5\u0007\u001fDw\u001a-.GBk\u0015(\u001ew7", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class AndroidPreloadedFont extends AndroidFont {
    public static final int $stable = 0;
    private boolean didInitWithContext;
    private final int style;
    private android.graphics.Typeface typeface;
    private final FontWeight weight;

    public /* synthetic */ AndroidPreloadedFont(FontWeight fontWeight, int i2, FontVariation.Settings settings, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontWeight, i2, settings);
    }

    public abstract android.graphics.Typeface doLoad$ui_text_release(Context context);

    public abstract String getCacheKey();

    @Override // androidx.compose.ui.text.font.Font
    public final FontWeight getWeight() {
        return this.weight;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: getStyle-_-LCdwA, reason: not valid java name */
    public final int mo6188getStyle_LCdwA() {
        return this.style;
    }

    private AndroidPreloadedFont(FontWeight fontWeight, int i2, FontVariation.Settings settings) {
        super(FontLoadingStrategy.Companion.m6225getBlockingPKNRLFQ(), AndroidPreloadedFontTypefaceLoader.INSTANCE, settings, null);
        this.weight = fontWeight;
        this.style = i2;
    }

    public final android.graphics.Typeface getTypeface$ui_text_release() {
        return this.typeface;
    }

    public final void setTypeface$ui_text_release(android.graphics.Typeface typeface) {
        this.typeface = typeface;
    }

    public final android.graphics.Typeface loadCached$ui_text_release(Context context) {
        if (!this.didInitWithContext && this.typeface == null) {
            this.typeface = doLoad$ui_text_release(context);
        }
        this.didInitWithContext = true;
        return this.typeface;
    }
}
