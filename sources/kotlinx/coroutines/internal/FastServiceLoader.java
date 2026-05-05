package kotlinx.coroutines.internal;

import com.dynatrace.android.agent.Global;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Xg;
import yg.ZO;

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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176Ȑ\u0007\":0\u007f\u0007|jA0JfP.hS2\u000fq~<$q$yCAZ\"}8\tWNmgvJp\u000bKƤ\u000e\u0016\u000fj4I[ye\u0012%2JģEލM\u0006މi`#5E'8\"أ}\u0007\u0007\u001a8IX\b\tGc\u0012\"2PphX;RK܅Ū\n>&\bf{uVNJ\u0003\\h5S\rwKf-o2\rM;L\u00031=zo)C@e8[ǯYK/`gW\tOsM\u0005/4U0iu]̬f\rD\u001f9]%c\u0003(l\u0005\u0018m:1[SqZh\u000eV\bA{Ui\u0012\u001f\u001e-X0=\u001a-\u0015<8\u0015tYó^\u000f\u000fL\u000e\ty<''\u00103qFIp\u0002eI(f7*\u0015S̔ţ\u0005n'm\u001d=n(3T>^QSF׀V[:]K\u0002\u001cp\u0011\u0005Z\b>V\u0018/*!^!3Es?3#{\u0002\u000fQ\u0016\u0001K`ĈWi`]\t6|,O0\u0019\u000ejD\u0013\b\u001aU\u0005\\:(e\u001c\u0003\u001fD\b[Jj\u0011T!k*nQnȉxg\u0006\nSJ\u0017Gg\u000b\u0004\u001ag;n3cls\u0012qR=.mY)ڶ^ڋFS\u001ax%<0Q`p y\fD|\u000fA7ou*TD1G}[HS*PC\u0015\t\u000e]?ɰQՁ7$\u000bǭˮx+"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00061g\r\u000e7z'2KC\"u0\u001d\u0015u7", "", "\nh]6g\u0005", "u(E", "\u001eQ4\u0013<\u001f", "", ":nP1@(B\\w\u0003\ti(\f\u00072e\r\tw>\u0010!$[", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\r1]\u0007~;{!*\\A>kA~\u0011fpC\u0014w\u0002", ":nP1@(B\\w\u0003\ti(\f\u00072e\r\tw>\u0010!$[.\u0014F\u0006,9b\u0011\u001a5w#8]R?t4,\u000ffkF\u0007", "1qT.g,\"\\'\u000evg*|r0", "0`b263:a'", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "AdaC\\*>1 z\tl", ":nP1", "!", "AdaC\\*>", ":nP1X9", "\u001aiPCTuEO\"\u0001D<3x\u0017=L\n$z@\u000el", ":nP1C9Hd\u001d}zk:", ":nP1C9Hd\u001d}zk:;\u000f9t\u0007,\u0005Sz\u0015!Ty\u001eKz.5gw\u001eAz\u0016", "5dc\u001de6OW\u0018~\bB5\u000b\u0018+n}(", "<`\\2", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u0013`y.ET *LCHA\u001b#\u0011y]\u0003\u000e_5P@\u0005NH\\:2\u0016YB\u0010#VWU'\u0016\u0007#+!sD5.]", ">`a@X", "Cq[", "\u001aiPCTuGS(HjK\u0013R", "CrT", Global.BLANK, "\u001aiPCTuNb\u001d\u0006Dc(\nR\u0014a\r\t\u007fG\u0001l", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKY.i(\bc(\u0003\u0002(1x\u0016xJ{5\\D\b\u0017l.u\u0018K})>#\u00031?7\u0017>VAJo>'#2BI\u0010a;R\u00010\u0013\"\u0012\u0013aN\u00049]\u0019V\u0017Ptv\u0002^A\"}\u001a", ">`a@X\rBZ\u0019", "@", "\u001aiPCTuB]b[\u000b_-|\u0016/dl(w?\u0001$l", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class FastServiceLoader {
    public static final FastServiceLoader INSTANCE = new FastServiceLoader();
    private static final String PREFIX = "META-INF/services/";

    private FastServiceLoader() {
    }

    private final MainDispatcherFactory createInstanceOf(Class<MainDispatcherFactory> cls, String str) {
        try {
            return cls.cast(Class.forName(str, true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final <S> S getProviderInstance(String str, ClassLoader classLoader, Class<S> cls) throws ClassNotFoundException {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> load(Class<S> cls, ClassLoader classLoader) {
        try {
            return loadProviders$kotlinx_coroutines_core(cls, classLoader);
        } catch (Throwable unused) {
            return CollectionsKt.toList(ServiceLoader.load(cls, classLoader));
        }
    }

    private final List<String> parse(URL url) throws IOException {
        BufferedReader bufferedReader;
        String string = url.toString();
        if (!StringsKt.startsWith$default(string, Xg.qd("<4F", (short) (C1499aX.Xd() ^ (-13987)), (short) (C1499aX.Xd() ^ (-25578))), false, 2, (Object) null)) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> file = INSTANCE.parseFile(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                return file;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        String strSubstringBefore$default = StringsKt.substringBefore$default(StringsKt.substringAfter$default(string, Jg.Wd("\u0010]\u000eL5OQ!\u0013", (short) (FB.Xd() ^ 26273), (short) (FB.Xd() ^ 17431)), (String) null, 2, (Object) null), '!', (String) null, 2, (Object) null);
        String strSubstringAfter$default = StringsKt.substringAfter$default(string, ZO.xd("'?", (short) (Od.Xd() ^ (-12247)), (short) (Od.Xd() ^ (-27133))), (String) null, 2, (Object) null);
        JarFile jarFile = new JarFile(strSubstringBefore$default, false);
        try {
            Class<?> cls = Class.forName(C1626yg.Ud("k;\\``EJ\u0013Dt.sO\u00193\fm:g -B", (short) (C1499aX.Xd() ^ (-17383)), (short) (C1499aX.Xd() ^ (-16090))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Ig.wd("JmrD\u000eoFAo[|Bmdw\u0014", (short) (OY.Xd() ^ 6867)));
            Object[] objArr = {strSubstringAfter$default};
            Constructor<?> constructor = cls.getConstructor(clsArr);
            try {
                constructor.setAccessible(true);
                bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream((ZipEntry) constructor.newInstance(objArr)), EO.Od("8\u0002A\u0011\u0013", (short) (C1633zX.Xd() ^ (-22237)))));
                try {
                    List<String> file2 = INSTANCE.parseFile(bufferedReader);
                    CloseableKt.closeFinally(bufferedReader, null);
                    jarFile.close();
                    return file2;
                } finally {
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    jarFile.close();
                    throw th3;
                } catch (Throwable th4) {
                    ExceptionsKt.addSuppressed(th2, th4);
                    throw th2;
                }
            }
        }
    }

    private final List<String> parseFile(BufferedReader bufferedReader) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return CollectionsKt.toList(linkedHashSet);
            }
            String string = StringsKt.trim((CharSequence) StringsKt.substringBefore$default(line, "#", (String) null, 2, (Object) null)).toString();
            String str = string;
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt != '.' && !Character.isJavaIdentifierPart(cCharAt)) {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + string).toString());
                }
            }
            if (str.length() > 0) {
                linkedHashSet.add(string);
            }
        }
    }

    private final <R> R use(JarFile jarFile, Function1<? super JarFile, ? extends R> function1) {
        try {
            R rInvoke = function1.invoke(jarFile);
            InlineMarker.finallyStart(1);
            jarFile.close();
            InlineMarker.finallyEnd(1);
            return rInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                try {
                    jarFile.close();
                    InlineMarker.finallyEnd(1);
                    throw th2;
                } catch (Throwable th3) {
                    ExceptionsKt.addSuppressed(th, th3);
                    throw th;
                }
            }
        }
    }

    public final List<MainDispatcherFactory> loadMainDispatcherFactory$kotlinx_coroutines_core() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!FastServiceLoaderKt.getANDROID_DETECTED()) {
            return load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory == null) {
                return load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
            }
            arrayList.add(mainDispatcherFactory);
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 != null) {
                arrayList.add(mainDispatcherFactory2);
            }
            return arrayList;
        } catch (Throwable unused3) {
            return load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    public final <S> List<S> loadProviders$kotlinx_coroutines_core(Class<S> cls, ClassLoader classLoader) {
        ArrayList list = Collections.list(classLoader.getResources(PREFIX + cls.getName()));
        Intrinsics.checkNotNullExpressionValue(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, INSTANCE.parse((URL) it.next()));
        }
        Set set = CollectionsKt.toSet(arrayList);
        if (set.isEmpty()) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        Set set2 = set;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(INSTANCE.getProviderInstance((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }
}
