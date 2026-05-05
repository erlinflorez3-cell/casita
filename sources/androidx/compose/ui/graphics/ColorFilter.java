package androidx.compose.ui.graphics;

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
/* JADX INFO: compiled from: ColorFilter.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007\"2\u0015}\u001c|ʑW6tev-\u000bR0O|\u0002é4c2q[?\u0004\u001bf\"gQɁkg|M+!Q\u000f\u001e\u001a'k\u0015I4z4܉\u0011̓FuG\u074ceqC=nyȫ\t'"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "", "<`c6i,\u001c] \t\b?0\u0004\u0018/r", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006\u0006G\u000b$wKv\u001d<\u0004z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001eU\r$Hms8TMHL8%$hn\u000f", "uKP;W9HW\u0018H|k(\b\f3c\u000eqYJ\b!$(s\u0015Kv2\u000b\u001dn", "5dc\u001bT;Bd\u0019\\\u0005e6\ni3l\u000f(\t~\u0011\u001b\u0011I|\nGy)3gw-7t\u0016*[C", "u(;.a+K]\u001d}D`9x\u00142i}6E\u001e\u000b\u001e!TP\u0012C\u0006%B/", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class ColorFilter {
    public static final Companion Companion = new Companion(null);
    private final android.graphics.ColorFilter nativeColorFilter;

    public ColorFilter(android.graphics.ColorFilter colorFilter) {
        this.nativeColorFilter = colorFilter;
    }

    public final android.graphics.ColorFilter getNativeColorFilter$ui_graphics_release() {
        return this.nativeColorFilter;
    }

    /* JADX INFO: compiled from: ColorFilter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\tnjO0LeN2ZS@\u000fs{:%aҜrYП\u0006\u001a,!ITTg̊rJh\u000b\f'\u0014\u0017\u0011jZK\u0006|k\u0013'2pr\u00068߲nމ˃dv<\t.7jX\b\u000b\u0019\u001aXJ@z\tJc\f@8ptH[%M3\"X\u000bͽ\u001fҵɉ`iT@Vw&\\=/\u001bipPWc>\ne\rt\\W\u0013|a,9X7c$kXЁ\u0006ѸÜC\u0005E\u0002K\u0016ؕ',3LyɰR\u0007~Е\u0019="}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CH*\u0012(\u001ds]B\u000bm5$", "", "u(E", "1n[<e\u0014:b&\u0003\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DU\u0012=ZGNA", "1n[<e\u0014:b&\u0003\u000e&1_jvO\u000b&", "uZ5u?(GR&\t~]?F\u00079m\u000b2\n@J'\u001b\u0011q\u001b8\u0002(9W\fi\u0015w\u001d8Z$?rC\u001e\">", ":hV5g0GU", ";t[A\\7Eg", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "/cS", ":hV5g0GU`FdP1c\u000e\u0013", "uI9u?(GR&\t~]?F\u00079m\u000b2\n@J'\u001b\u0011q\u001b8\u0002(9W\fi\u0015w\u001d8Z$?rC\u001e\">", "Bh]A", "1n[<e", "0kT;W\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "Bh]A ?\u001eB\"\fyl", "uI8u?(GR&\t~]?F\u00079m\u000b2\n@J'\u001b\u0011q\u001b8\u0002(9W\fi\u0015w\u001d8Z$?rC\u001e\">", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: tint-xETnrds$default, reason: not valid java name */
        public static /* synthetic */ ColorFilter m4219tintxETnrds$default(Companion companion, long j2, int i2, int i3, Object obj) {
            if ((i3 + 2) - (i3 | 2) != 0) {
                i2 = BlendMode.Companion.m4118getSrcIn0nO6VwU();
            }
            return companion.m4222tintxETnrds(j2, i2);
        }

        /* JADX INFO: renamed from: tint-xETnrds, reason: not valid java name */
        public final ColorFilter m4222tintxETnrds(long j2, int i2) {
            return new BlendModeColorFilter(j2, i2, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: renamed from: colorMatrix-jHG-Opc, reason: not valid java name */
        public final ColorFilter m4220colorMatrixjHGOpc(float[] fArr) {
            return new ColorMatrixColorFilter(fArr, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: renamed from: lighting--OWjLjI, reason: not valid java name */
        public final ColorFilter m4221lightingOWjLjI(long j2, long j3) {
            return new LightingColorFilter(j2, j3, (DefaultConstructorMarker) null);
        }
    }
}
