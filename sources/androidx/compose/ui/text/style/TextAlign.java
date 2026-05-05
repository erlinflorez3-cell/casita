package androidx.compose.ui.text.style;

import java.util.List;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: TextAlign.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":\u001b\u007f\u0007lnA0RqP.XU0ŧ*\u0012éBjTqq:\u000e\u0019\rb\u0018UȞwk|Jr\u000bq\u0010و\u001azp.WXAu \u0013JB\u001eDcS}CQb\u000b53\u001fxƉ9ѩ\t\u0003 1V\u0018?\tQT$\u0012^A7ńQҫQ\u0007 \u001c\u0014Ah\u000e,g\u007fNdT3qƠ3%\tvP\\wk>|e\rtU}˚xҐ\"+Hʺߗ\u0014%٘\u0002\u0007\u0001\\ϓ\u0007O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|q5QEDA", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class TextAlign {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Left = m6521constructorimpl(1);
    private static final int Right = m6521constructorimpl(2);
    private static final int Center = m6521constructorimpl(3);
    private static final int Justify = m6521constructorimpl(4);
    private static final int Start = m6521constructorimpl(5);
    private static final int End = m6521constructorimpl(6);
    private static final int Unspecified = m6521constructorimpl(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ TextAlign m6520boximpl(int i2) {
        return new TextAlign(i2);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static int m6521constructorimpl(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m6522equalsimpl(int i2, Object obj) {
        return (obj instanceof TextAlign) && i2 == ((TextAlign) obj).m6526unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m6523equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m6524hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    public boolean equals(Object obj) {
        return m6522equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6524hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ int m6526unboximpl() {
        return this.value;
    }

    private /* synthetic */ TextAlign(int i2) {
        this.value = i2;
    }

    public String toString() {
        return m6525toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m6525toStringimpl(int i2) {
        return m6523equalsimpl0(i2, Left) ? "Left" : m6523equalsimpl0(i2, Right) ? "Right" : m6523equalsimpl0(i2, Center) ? "Center" : m6523equalsimpl0(i2, Justify) ? "Justify" : m6523equalsimpl0(i2, Start) ? "Start" : m6523equalsimpl0(i2, End) ? "End" : m6523equalsimpl0(i2, Unspecified) ? "Unspecified" : "Invalid";
    }

    /* JADX INFO: compiled from: TextAlign.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u000504\u0012\u0006%nʑ?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\u0004_(\u0010:\u000f_Pwg\u001dL\t\u001e\u0014&\u0014\u0017\u0011jZKȺwزށ\u000e1ԲsG;M}BQbz9\u0013$\u00039F\u007f\u001d\u0001H,ѳ\u000f͌ےBJë\u00168HpHW%O\u000b! \n\u000f7\u000f&tg|8֘kҗǶ.\"ɨmJV'm5\u0015O\u0013Ob+]\u000eo(C@e7\u05cf$مЁ\u0006QÜC\u000bGqK\n\u0001)-6Ww(Mf\f,\u0015YQ\u05ce\\öΟ[\u0004Ōd\u0014/+]hcR\u00145\u0006~L$J\u0012&\u0006UJό,ԿɊ\u0007\r\u07baxz[@^\u0007vD\u0006\no:g<\u000eCC9Ihј`ݢуM6߉\t\u0015&#\u000fs9]Z\u001fn\u0019ÔT\u0001Y4W͗YvM\u0012YC\rշtv"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|q5QED*\u0012(\u001ds]B\u000bm5$", "", "u(E", "\u0011d]AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|q5QEDA", "5dc\u0010X5MS&Fz)\u0013j\u000f\u0015k", "u(8", "\u0017", "\u0013mS", "5dc\u0012a+\u0006Scehd\u0012\u0003", "\u0018tbA\\-R", "5dc\u0017h:MW\u001a\u0013B^vcv5K\u0006", "\u001adUA", "5dc\u0019X-M\u001b\u0019IaL2b\u000f", " hV5g", "5dc\u001f\\.Ab`~EE\u001a\u0003n5", "!sP?g", "5dc g(Kb`~EE\u001a\u0003n5", "#mb=X*BT\u001d~y", "5dc\"a:IS\u0017\u0003{b,{P/0f\u0016\u0002&\u0007", "D`[BX:", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getLeft-e0LSkKk */
        public final int m6530getLefte0LSkKk() {
            return TextAlign.Left;
        }

        /* JADX INFO: renamed from: getRight-e0LSkKk */
        public final int m6531getRighte0LSkKk() {
            return TextAlign.Right;
        }

        /* JADX INFO: renamed from: getCenter-e0LSkKk */
        public final int m6527getCentere0LSkKk() {
            return TextAlign.Center;
        }

        /* JADX INFO: renamed from: getJustify-e0LSkKk */
        public final int m6529getJustifye0LSkKk() {
            return TextAlign.Justify;
        }

        /* JADX INFO: renamed from: getStart-e0LSkKk */
        public final int m6532getStarte0LSkKk() {
            return TextAlign.Start;
        }

        /* JADX INFO: renamed from: getEnd-e0LSkKk */
        public final int m6528getEnde0LSkKk() {
            return TextAlign.End;
        }

        public final List<TextAlign> values() {
            return CollectionsKt.listOf((Object[]) new TextAlign[]{TextAlign.m6520boximpl(m6530getLefte0LSkKk()), TextAlign.m6520boximpl(m6531getRighte0LSkKk()), TextAlign.m6520boximpl(m6527getCentere0LSkKk()), TextAlign.m6520boximpl(m6529getJustifye0LSkKk()), TextAlign.m6520boximpl(m6532getStarte0LSkKk()), TextAlign.m6520boximpl(m6528getEnde0LSkKk())});
        }

        /* JADX INFO: renamed from: getUnspecified-e0LSkKk */
        public final int m6533getUnspecifiede0LSkKk() {
            return TextAlign.Unspecified;
        }
    }
}
