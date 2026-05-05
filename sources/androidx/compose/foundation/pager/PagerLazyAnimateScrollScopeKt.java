package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: compiled from: PagerLazyAnimateScrollScope.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!4i\bӵLc\u000b\u0004IيH\u0019<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f-ʈW,"}, d2 = {"\u001e`V2e\u0013:h-Z\u0004b4x\u0018/S}5\u0006G\b\u0005\u0015Qz\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;*\u007f+OH],JP\u007fG\u001b\u0019H\fX6\rZ", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP)z0-\u0015>", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PagerLazyAnimateScrollScopeKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1 */
    /* JADX INFO: compiled from: PagerLazyAnimateScrollScope.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я;\u001d̉=!4i\bӵLc\u0003\nI\u00066\u00146B\r'4\u0012}\u0007njG0L͜P.hS2\u000f\u0002{<$q$yCI٥\"}8\tWNmj\u0017Iҙ\u0011K%إFx\u0019+\u0012c\u0007i*\u000f`O CA[\b=ga;JMU@1Py3\u0011JOV!\u000f\u001cIJ\u001c\u0014@@\u001fMb\u0015]\u000b*\u0014\u0016>N\u0011LpwRFJ\u0003\\hDQ\u0015ݦFN-uvž\fϘJT5$?{,CX7c%MS1\u001a\u0003_M\u001cWqk\u0006\u0019+5Eas\u00067\u001f\u0014d'9O%]!'\u0013Y(ӷ\u000eˏ/S{MV\u00106zK\u000e\u001b@\u001c\u000e4(~\u0003\u0004Ֆhڿ\u00127\rtYE^\u0005/T\u000e\u0001y6E&6\b\u0002ݤ\u001dƻUeS\u001bT>\n\b]01\t\u0007!\nUD5kèVɐU5iBCQ\\\r*O{\u000e\tb0+:p\u001eČ1ɨ\u00152/'=fG&ݒo\u001d"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\u00012\fI\u007f\u0013&Ky\u0017\u0006\u0002!7Y\u000bi\"i\u0018.Z*7\u0001Hy\u001eli5\u0016c\u001aL\u00041NS<*f]r##PE\nP+\u001akUV8JM;'\u0004;Io9u\u000b\u0013\u001d{3t{B\u0015[", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;*\u007f+OH],JP\u007fG\u001b\u0019H\fX6\rZ", "4ha@g\u001dBa\u001d{\u0002^\u0010\f\t7I\t'{S", "", "5dc\u0013\\9Lb\n\u0003\tb)\u0004\t\u0013t\u007f0_I\u007f\u0017*", "u(8", "4ha@g\u001dBa\u001d{\u0002^\u0010\f\t7S}5\u0006G\b\u0001\u0018H}\u000eK", "5dc\u0013\\9Lb\n\u0003\tb)\u0004\t\u0013t\u007f0i>\u000e!\u001eNY\u000f=\u0005%D", "7sT:66N\\(", "5dc\u0016g,F1#\u000f\u0004m", ":`bAI0LW\u0016\u0006zB;|\u0011\u0013n~(\u000f", "5dc\u0019T:MD\u001d\r~[3|l>e\b\f\u0005?\u0001*", "Dhb6U3>7(~\u0003l\b\u000e\t<a\u0002(iD\u0016\u0017", "5dc#\\:BP ~^m,\u0005\u0017\u000bv\u007f5wB\u0001\u0005\u001b\\o", "1`[0h3:b\u0019]~l;x\u0012-en2", "", "B`a4X;\"\\\u0018~\u000e", "Aba<_3", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "AmP=G6\"b\u0019\u0007", "7mS2k", "Aba<_3(T\u001a\rzm", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements LazyLayoutAnimateScrollScope {
        AnonymousClass1() {
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
        public int getFirstVisibleItemIndex() {
            return pagerState.getFirstVisiblePage$foundation_release();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
        public int getFirstVisibleItemScrollOffset() {
            return pagerState.getFirstVisiblePageOffset$foundation_release();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
        public int getLastVisibleItemIndex() {
            return ((PageInfo) CollectionsKt.last((List) pagerState.getLayoutInfo().getVisiblePagesInfo())).getIndex();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
        public int getItemCount() {
            return pagerState.getPageCount();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
        public void snapToItem(ScrollScope scrollScope, int i2, int i3) {
            pagerState.snapToItem$foundation_release(i2, i3 / pagerState.getPageSizeWithSpacing$foundation_release(), true);
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
        public float calculateDistanceTo(int i2) {
            PageInfo pageInfo;
            List<PageInfo> visiblePagesInfo = pagerState.getLayoutInfo().getVisiblePagesInfo();
            int size = visiblePagesInfo.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    pageInfo = null;
                    break;
                }
                pageInfo = visiblePagesInfo.get(i3);
                if (pageInfo.getIndex() == i2) {
                    break;
                }
                i3++;
            }
            return pageInfo == null ? ((i2 - pagerState.getCurrentPage()) * getVisibleItemsAverageSize()) - (pagerState.getCurrentPageOffsetFraction() * pagerState.getPageSizeWithSpacing$foundation_release()) : r1.getOffset();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
        public Object scroll(Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
            Object objScroll$default = ScrollableState.scroll$default(pagerState, null, function2, continuation, 1, null);
            return objScroll$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll$default : Unit.INSTANCE;
        }

        private final int getVisibleItemsAverageSize() {
            return pagerState.getPageSize$foundation_release() + pagerState.getPageSpacing$foundation_release();
        }
    }

    public static final LazyLayoutAnimateScrollScope PagerLazyAnimateScrollScope(PagerState pagerState) {
        return new LazyLayoutAnimateScrollScope() { // from class: androidx.compose.foundation.pager.PagerLazyAnimateScrollScopeKt.PagerLazyAnimateScrollScope.1
            AnonymousClass1() {
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getFirstVisibleItemIndex() {
                return pagerState.getFirstVisiblePage$foundation_release();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getFirstVisibleItemScrollOffset() {
                return pagerState.getFirstVisiblePageOffset$foundation_release();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getLastVisibleItemIndex() {
                return ((PageInfo) CollectionsKt.last((List) pagerState.getLayoutInfo().getVisiblePagesInfo())).getIndex();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getItemCount() {
                return pagerState.getPageCount();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public void snapToItem(ScrollScope scrollScope, int i2, int i3) {
                pagerState.snapToItem$foundation_release(i2, i3 / pagerState.getPageSizeWithSpacing$foundation_release(), true);
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public float calculateDistanceTo(int i2) {
                PageInfo pageInfo;
                List<PageInfo> visiblePagesInfo = pagerState.getLayoutInfo().getVisiblePagesInfo();
                int size = visiblePagesInfo.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        pageInfo = null;
                        break;
                    }
                    pageInfo = visiblePagesInfo.get(i3);
                    if (pageInfo.getIndex() == i2) {
                        break;
                    }
                    i3++;
                }
                return pageInfo == null ? ((i2 - pagerState.getCurrentPage()) * getVisibleItemsAverageSize()) - (pagerState.getCurrentPageOffsetFraction() * pagerState.getPageSizeWithSpacing$foundation_release()) : r1.getOffset();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public Object scroll(Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
                Object objScroll$default = ScrollableState.scroll$default(pagerState, null, function2, continuation, 1, null);
                return objScroll$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll$default : Unit.INSTANCE;
            }

            private final int getVisibleItemsAverageSize() {
                return pagerState.getPageSize$foundation_release() + pagerState.getPageSpacing$foundation_release();
            }
        };
    }
}
