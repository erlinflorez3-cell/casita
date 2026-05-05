package androidx.compose.ui.text.android;

import kotlin.Metadata;
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
/* JADX INFO: compiled from: TextLayout.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u0018\u007fјnjG5LeN1ZS8\u0018s{:)a$\bّkUH|b\u0014_Rug\u0007J\t\fß\u0013\u0006$z3RW^\u0011]@\u0015bF}IKM\u001eAid\u0003A\u001d `.h}\u0013\u000e2*v\u001c'~QY$\u0012^L7:\u001b\u0019[\u00142\u00124DP\u0005,f\u007fNdL5iH?;\u0003\u0018H~+m:\u0015M;J\u001d3\u001b\by\u001eYFg9#/k\u00035V$K\u0011Q\n=3nW+9S\fWd\\P #.g\r\fv|؛\u0011Ōd\f/˃ oYU&(&\u0001RȡHǬ\u0012\u0006/Ξ~<(f \u000eauɤWFX\u061cvD\u0006\u0002o>ж)\u0013"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u001aw#2bMDz0%\u007fro=\u0016g6WT#EON\u0002", "", ":`h<h;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i&m)=4?OuD-j", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W8\u007f$Bc\u0002\u001f\u0001\\\u0016A\\*7\u007f>.$>%*", "1`R5X+$S-", "", "1`R5X+/O \u000fz", "", "5dc\u0019T@Hc(", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006r.4f\b$67\u0005.`R\"gH(%w7", "5dc", "=eU@X;", "CobAe,:[", "", "1`R5X", ">qX:T9R", "5dc\u001de0FO&\u0013Yh>\u0006\u0017>r\u007f$\u0004", "5dc\u001de0FO&\u0013ji:\f\u0016/a\b", "5dc X*H\\\u0018z\br\u000b\u0007\u001b8s\u000f5{<\t", "5dc X*H\\\u0018z\br\u001c\b\u0017>r\u007f$\u0004", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class HorizontalPositionCache {
    private int cachedKey = -1;
    private float cachedValue;
    private final TextLayout layout;

    public HorizontalPositionCache(TextLayout textLayout) {
        this.layout = textLayout;
    }

    public final TextLayout getLayout() {
        return this.layout;
    }

    public final float getPrimaryDownstream(int i2) {
        return get(i2, false, false, true);
    }

    public final float getPrimaryUpstream(int i2) {
        return get(i2, true, true, true);
    }

    public final float getSecondaryDownstream(int i2) {
        return get(i2, false, false, false);
    }

    public final float getSecondaryUpstream(int i2) {
        return get(i2, true, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final float get(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r4 = 1
            r3 = 0
            if (r7 == 0) goto L34
            androidx.compose.ui.text.android.TextLayout r0 = r5.layout
            android.text.Layout r0 = r0.getLayout()
            int r2 = androidx.compose.ui.text.android.LayoutCompat_androidKt.getLineForOffset(r0, r6, r7)
            androidx.compose.ui.text.android.TextLayout r0 = r5.layout
            int r1 = r0.getLineStart(r2)
            androidx.compose.ui.text.android.TextLayout r0 = r5.layout
            int r0 = r0.getLineEnd(r2)
            if (r6 == r1) goto L1e
            if (r6 != r0) goto L34
        L1e:
            r0 = r4
        L1f:
            int r1 = r6 * 4
            if (r9 == 0) goto L2e
            if (r0 == 0) goto L26
            r4 = r3
        L26:
            int r1 = r1 + r4
            int r0 = r5.cachedKey
            if (r0 != r1) goto L36
            float r0 = r5.cachedValue
            return r0
        L2e:
            if (r0 == 0) goto L32
            r4 = 2
            goto L26
        L32:
            r4 = 3
            goto L26
        L34:
            r0 = r3
            goto L1f
        L36:
            if (r9 == 0) goto L45
            androidx.compose.ui.text.android.TextLayout r0 = r5.layout
            float r0 = r0.getPrimaryHorizontal(r6, r7)
        L3e:
            if (r8 == 0) goto L44
            r5.cachedKey = r1
            r5.cachedValue = r0
        L44:
            return r0
        L45:
            androidx.compose.ui.text.android.TextLayout r0 = r5.layout
            float r0 = r0.getSecondaryHorizontal(r6, r7)
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.HorizontalPositionCache.get(int, boolean, boolean, boolean):float");
    }
}
