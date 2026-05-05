package androidx.compose.ui.res;

import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.ui.graphics.vector.ImageVector;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: VectorResources.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007njO0Le^.Zݷ2\u000fy{<$a&yCI[\"}(\fUȞ}˧\u001fJ\t\n{\u000f\u0016'9m߽MU\u0007]Z\u0013@I\b?aU8NGi\r8\u001b\u001f`'h}\u0013\u000b2*v\u0013=٠C\u0014\u0018 ;XphZ=Q\u0013&*\u0006l-I5juf6vt\u000e>=-\u001bipQWc>\fe\rtYmˠv2R9AO]%'c\u00035UkG\u0013E\u0002?\u0015hU,YM\"Y\u001fj\u0010\u0016%+}\u0010mz6b\u0015Sp\fU0}g*Vdߍyߡ\u007f\rDǉأ\n9"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000e\u0017%\u0011S\u00168x%&Y{/Azs*KF;A", "", "u(E", ";`_", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000e\u0017%\u0011S\u00168x%&Y{/Azs*KF;*\u001a\u001e)>", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000e\u0017%\u0011S\u00168x%&Y{/Azs*KF;*\u0018&\u0011ja*\u0007a;X\u0004\u0007P[[@2", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", "1kT.e", "", "5dc", "9dh", ">qd;X", "1n]3\\.\u001cV\u0015\b|^:", "", "Adc", "7lP4X\u001d>Q(\t\b>5\f\u0016C", "\u0017lP4X\u001d>Q(\t\b>5\f\u0016C", "\u0019dh", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ImageVectorCache {
    public static final int $stable = 8;
    private final HashMap<Key, WeakReference<ImageVectorEntry>> map = new HashMap<>();

    /* JADX INFO: compiled from: VectorResources.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u0006\rnj?7LeV7ZS0\u0010s{B0cҕwٙAkڼ.\"7N\u000f~wvXZ#G=\u0007fx\u0019.YY\u0007`*\u000f`FņC3[t\u0006Dn~N\tN3r8(\u0007Gʤ+\u0011\u0017\u0005\u0006[K:\u0016vВq\u0003q\u001bY\u001d\u001a@ßn*\u0007\u001ejgf:vm.:]%3oHN5bH|{\u0011\rĝ&U\bo+C@eCE+a\u0012\u001fTq>1>8ތ\u00061.5;as\u0006:\u001fĳ\u0013]2]\u001eurTnKƀ_\\69R{K~\u0012߭{\u0001\u0004ȞT\u0006\u0014\f5O~@(f \u0012auCSnRؿbH\bЭy8\u001d-\u000e<ڨ=."}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000e\u0017%\u0011S\u00168x%&Y{/Azs*KF;*\u001a\u001e)>", "", "BgT:X", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\nm\u0017%Q\u007f\u001b:v3sH\u0001 ?mk", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\nm\u0017%Q\u007f\u001b:v3\u000b", "7c", "", "uKP;W9HW\u0018Hxh5\f\t8tI5{NJ\u0004\u0017Uy\u001eIt%C\u0018l#7u\u0016\u00041\u0007,", "5dc\u0016W", "u(8", "5dc![,FS", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fq\t@\u000f`\u0004G}\u0018L\u0004#5g<\u000f:m\u001e.#", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Key {
        public static final int $stable = 8;
        private final int id;
        private final Resources.Theme theme;

        public static /* synthetic */ Key copy$default(Key key, Resources.Theme theme, int i2, int i3, Object obj) {
            if ((i3 + 1) - (1 | i3) != 0) {
                theme = key.theme;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                i2 = key.id;
            }
            return key.copy(theme, i2);
        }

        public final Resources.Theme component1() {
            return this.theme;
        }

        public final int component2() {
            return this.id;
        }

        public final Key copy(Resources.Theme theme, int i2) {
            return new Key(theme, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return Intrinsics.areEqual(this.theme, key.theme) && this.id == key.id;
        }

        public int hashCode() {
            return (this.theme.hashCode() * 31) + Integer.hashCode(this.id);
        }

        public String toString() {
            return "Key(theme=" + this.theme + ", id=" + this.id + ')';
        }

        public Key(Resources.Theme theme, int i2) {
            this.theme = theme;
            this.id = i2;
        }

        public final Resources.Theme getTheme() {
            return this.theme;
        }

        public final int getId() {
            return this.id;
        }
    }

    /* JADX INFO: compiled from: VectorResources.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4\u0012}\u000enjG9LeN/ZS8\u001bsڔ:ša:ڎs;\u0004\u0019>5\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019/֒Yxk\u0016W9PxW3{p\u0004˧a==\u0013*J\"f|Kі\u001brc\u001e\u0002\u0013CyÈB6FpHR%M3\u001bB\fD \u000f tg|9\u000fȔ\\\u0003@1\u000f\u0002B|4\u00106\u000b[%Hj&;u(Գ,\t>C$=S1\n\u0019Đ>KF\u007fM\u001dhU8qʵr(Ef\u0002,\u0015YRոax.ؘ\u001dSf\u001151 rYP&(&{ԫ\u0011B\f\u05fa\u001e)N5;\"Ǻ\f "}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000e\u0017%\u0011S\u00168x%&Y{/Azs*KF;*\u0018&\u0011ja*\u0007a;X\u0004\u0007P[[@2", "", "7lP4X\u001d>Q(\t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0012U?=k%\u001e\u0013wkF\\", "1n]3\\.\u001fZ\u0015\u0001\t", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~j}\u001eFw#w1K7m4\u000f\u0015fpC\u00149\u0010\u0012g", "5dc\u0010b5?W\u001b_\u0002Z.\u000b", "u(8", "5dc\u0016`(@S\n~xm6\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#\u000f 5| ;\u0017'Cg6\u001e\u0006h_H\u0011p\u0002", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ImageVectorEntry {
        public static final int $stable = 0;
        private final int configFlags;
        private final ImageVector imageVector;

        public static /* synthetic */ ImageVectorEntry copy$default(ImageVectorEntry imageVectorEntry, ImageVector imageVector, int i2, int i3, Object obj) {
            if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
                imageVector = imageVectorEntry.imageVector;
            }
            if ((i3 + 2) - (i3 | 2) != 0) {
                i2 = imageVectorEntry.configFlags;
            }
            return imageVectorEntry.copy(imageVector, i2);
        }

        public final ImageVector component1() {
            return this.imageVector;
        }

        public final int component2() {
            return this.configFlags;
        }

        public final ImageVectorEntry copy(ImageVector imageVector, int i2) {
            return new ImageVectorEntry(imageVector, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageVectorEntry)) {
                return false;
            }
            ImageVectorEntry imageVectorEntry = (ImageVectorEntry) obj;
            return Intrinsics.areEqual(this.imageVector, imageVectorEntry.imageVector) && this.configFlags == imageVectorEntry.configFlags;
        }

        public int hashCode() {
            return (this.imageVector.hashCode() * 31) + Integer.hashCode(this.configFlags);
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.imageVector + ", configFlags=" + this.configFlags + ')';
        }

        public ImageVectorEntry(ImageVector imageVector, int i2) {
            this.imageVector = imageVector;
            this.configFlags = i2;
        }

        public final ImageVector getImageVector() {
            return this.imageVector;
        }

        public final int getConfigFlags() {
            return this.configFlags;
        }
    }

    public final ImageVectorEntry get(Key key) {
        WeakReference<ImageVectorEntry> weakReference = this.map.get(key);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void prune(int i2) {
        Iterator<Map.Entry<Key, WeakReference<ImageVectorEntry>>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            ImageVectorEntry imageVectorEntry = it.next().getValue().get();
            if (imageVectorEntry == null || Configuration.needNewResources(i2, imageVectorEntry.getConfigFlags())) {
                it.remove();
            }
        }
    }

    public final void set(Key key, ImageVectorEntry imageVectorEntry) {
        this.map.put(key, new WeakReference<>(imageVectorEntry));
    }

    public final void clear() {
        this.map.clear();
    }
}
