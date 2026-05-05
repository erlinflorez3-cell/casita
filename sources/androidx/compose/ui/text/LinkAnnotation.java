package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: LinkAnnotation.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nj?3J\u000b^\u008c\u0003SX\u000e${=.\u001c)wCтY\u001a\f\"Ya\\h\u007fp`Y9Eeٌ\u0018ѱn0aW~` \u0013\u0003T}DKO\u0006<gfKȩ\u0007ڶ6&P{\u000b\b(2У\u0014\u0002"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9t@\u007f+\u0011b\u0007*Fi%2WL\u0011", "", "u(E", ":h]8<5MS&zxm0\u0007\u0012\u0016i\u000e7{I\u0001$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9t@\u007f+\u0019b\r Di\u0014=QMDR8,$hj9\u00149", "5dc\u0019\\5D7\"\u000ezk(z\u00183o\t\u000f\u007fN\u0010\u0017 G|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006])>_a)Fm#*KR?u=\u0005\u0019vp9\u0010c9$", "Ash9X:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001c]\u0007&%|*5MQ\u0011", "5dc g@ES'", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhd$@s\u0004=aJ;y\n", "\u0011kX0^(;Z\u0019", "#q[", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class LinkAnnotation {
    public static final int $stable = 0;

    public /* synthetic */ LinkAnnotation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract LinkInteractionListener getLinkInteractionListener();

    public abstract TextLinkStyles getStyles();

    private LinkAnnotation() {
    }

    /* JADX INFO: compiled from: LinkAnnotation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\u0015\"4ߚ\u007f\u0007|jA0JkP.`\\2şs{BřcҕyCI[\"}(\tUS}˧\u001fJ\t\n\u00042\u0016\u001a\u0007jDI\u0004ym\u001a\u00152PqW5cnk<p|<\u0005.6::\u0010\u0004/\u001fݵL\u0010\u0005\u0001\f\\\u001a\u001fH@\u001fH\u0003\u0013[\u00142\u0014\u001c=N\u0011dֈg\u0017<V}u:]5I}\u000bT5rH|{\u000e\rhw!\u0005e6-V6c\u001a{ٜ\u0005\u07baVaGšWsC\fv/w?Wuo8n~B\u0018\u0002̔\u000fǁv,dӤib\u001209Y4Z^\u000e@w)|Ɂ@\n\u0016ͺ?J48(rۅ\u0012G"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9t@\u007f+\u0011b\u0007*Fi%2WLy[A%j", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9t@\u007f+\u0011b\u0007*Fi%2WL\u0011", "Cq[", "", "Ash9X:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001c]\u0007&%|*5MQ\u0011", ":h]8<5MS&zxm0\u0007\u0012\u0016i\u000e7{I\u0001$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9t@\u007f+\u0019b\r Di\u0014=QMDR8,$hj9\u00149", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\rJkG-^WaL\u0016J0W|\u0015V`U,j(Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ<MKJh\u0014\u001b_t9sv&_\u001fG\u0007\u0011sP-rO@c\bVANb7:OP", "5dc\u0019\\5D7\"\u000ezk(z\u00183o\t\u000f\u007fN\u0010\u0017 G|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006])>_a)Fm#*KR?u=\u0005\u0019vp9\u0010c9$", "5dc g@ES'", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhd$@s\u0004=aJ;y\n", "5dc\"e3", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Url extends LinkAnnotation {
        public static final int $stable = 8;
        private final LinkInteractionListener linkInteractionListener;
        private final TextLinkStyles styles;
        private final String url;

        public /* synthetic */ Url(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 + 2) - (2 | i2) != 0 ? null : textLinkStyles, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? null : linkInteractionListener);
        }

        public final String getUrl() {
            return this.url;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public TextLinkStyles getStyles() {
            return this.styles;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public LinkInteractionListener getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        public Url(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
            super(null);
            this.url = str;
            this.styles = textLinkStyles;
            this.linkInteractionListener = linkInteractionListener;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Url)) {
                return false;
            }
            Url url = (Url) obj;
            return Intrinsics.areEqual(this.url, url.url) && Intrinsics.areEqual(getStyles(), url.getStyles()) && Intrinsics.areEqual(getLinkInteractionListener(), url.getLinkInteractionListener());
        }

        public int hashCode() {
            int iHashCode = this.url.hashCode() * 31;
            TextLinkStyles styles = getStyles();
            int iHashCode2 = (iHashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            LinkInteractionListener linkInteractionListener = getLinkInteractionListener();
            return iHashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        public String toString() {
            return "LinkAnnotation.Url(url=" + this.url + ')';
        }
    }

    /* JADX INFO: compiled from: LinkAnnotation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\u0015\"4ߚ\u007f\u0007|jA0JkP.`\\2şs{BřcҕyCI[\"}(\tUS}˧\u001fJ\t\n\u00040\u0016\u001a\u0007jDI\u0004ym\u001a\u00152PqW5cnk<pzD\t8487(\nв\u001e*V\u0016?\fQX$\u0012^N!@`\u001ce\u00070\u00114Nfӌ\u001e%m\\G`l\fLu7KoPa?_^}\u0014!\u0017h5\u0011\u000fc4*n<\fխ'٨\u0007\rZ¹W\u0005ExK\r9;5-aum5\u0007\u0003jƚ-̠\u0011cz̦t\u0007Wi\u001a1{^qKh\u000eVxߡ\u007f\u0013Dǉ&\b-S<9ըj\u001c"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9t@\u007f+\u0011b\u0007*Fi%2WLyI;\"\u0013n]6\u000ec\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9t@\u007f+\u0011b\u0007*Fi%2WL\u0011", "B`V", "", "Ash9X:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001c]\u0007&%|*5MQ\u0011", ":h]8<5MS&zxm0\u0007\u0012\u0016i\u000e7{I\u0001$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9t@\u007f+\u0019b\r Di\u0014=QMDR8,$hj9\u00149", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\rJkG-^WaL\u0016J0W|\u0015V`U,j(Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ<MKJh\u0014\u001b_t9sv&_\u001fG\u0007\u0011sP-rO@c\bVANb7:OP", "5dc\u0019\\5D7\"\u000ezk(z\u00183o\t\u000f\u007fN\u0010\u0017 G|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006])>_a)Fm#*KR?u=\u0005\u0019vp9\u0010c9$", "5dc g@ES'", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhd$@s\u0004=aJ;y\n", "5dc!T.", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Clickable extends LinkAnnotation {
        public static final int $stable = 8;
        private final LinkInteractionListener linkInteractionListener;
        private final TextLinkStyles styles;
        private final String tag;

        public /* synthetic */ Clickable(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 + 2) - (i2 | 2) != 0 ? null : textLinkStyles, linkInteractionListener);
        }

        public final String getTag() {
            return this.tag;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public TextLinkStyles getStyles() {
            return this.styles;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public LinkInteractionListener getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        public Clickable(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
            super(null);
            this.tag = str;
            this.styles = textLinkStyles;
            this.linkInteractionListener = linkInteractionListener;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Clickable)) {
                return false;
            }
            Clickable clickable = (Clickable) obj;
            return Intrinsics.areEqual(this.tag, clickable.tag) && Intrinsics.areEqual(getStyles(), clickable.getStyles()) && Intrinsics.areEqual(getLinkInteractionListener(), clickable.getLinkInteractionListener());
        }

        public int hashCode() {
            int iHashCode = this.tag.hashCode() * 31;
            TextLinkStyles styles = getStyles();
            int iHashCode2 = (iHashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            LinkInteractionListener linkInteractionListener = getLinkInteractionListener();
            return iHashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.tag + ')';
        }
    }
}
