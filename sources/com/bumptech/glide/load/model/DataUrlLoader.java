package com.bumptech.glide.load.model;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public final class DataUrlLoader<Model, Data> implements ModelLoader<Model, Data> {
    private static final String BASE64_TAG = ";base64";
    private static final String DATA_SCHEME_IMAGE = "data:image";
    private final DataDecoder<Data> dataDecoder;

    public interface DataDecoder<Data> {
        void close(Data data) throws IOException;

        Data decode(String str) throws IllegalArgumentException;

        Class<Data> getDataClass();
    }

    private static final class DataUriFetcher<Data> implements DataFetcher<Data> {
        private Data data;
        private final String dataUri;
        private final DataDecoder<Data> reader;

        DataUriFetcher(String str, DataDecoder<Data> dataDecoder) {
            this.dataUri = str;
            this.reader = dataDecoder;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
            try {
                this.reader.close(this.data);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public Class<Data> getDataClass() {
            return this.reader.getDataClass();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.DataFetcher
        public void loadData(Priority priority, DataFetcher.DataCallback<? super Data> dataCallback) {
            try {
                Data dataDecode = this.reader.decode(this.dataUri);
                this.data = dataDecode;
                dataCallback.onDataReady(dataDecode);
            } catch (IllegalArgumentException e2) {
                dataCallback.onLoadFailed(e2);
            }
        }
    }

    public static final class StreamFactory<Model> implements ModelLoaderFactory<Model, InputStream> {
        private final DataDecoder<InputStream> opener = new DataDecoder<InputStream>() { // from class: com.bumptech.glide.load.model.DataUrlLoader.StreamFactory.1
            @Override // com.bumptech.glide.load.model.DataUrlLoader.DataDecoder
            public void close(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.bumptech.glide.load.model.DataUrlLoader.DataDecoder
            public InputStream decode(String str) throws Throwable {
                if (!str.startsWith(ZO.xd("\"\u000eQ\u007fK;$.^Z", (short) (C1499aX.Xd() ^ (-18288)), (short) (C1499aX.Xd() ^ (-7221))))) {
                    throw new IllegalArgumentException(C1561oA.Kd("+MS\u007fB\u0002YEQOK\bRWLSR\u000eSQeS\u0013IGB%", (short) (C1633zX.Xd() ^ (-2002))));
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException(C1561oA.od("\"=FE:>6m0;87*g04d($6\"_\u0014\u0010\ti", (short) (C1633zX.Xd() ^ (-11512))));
                }
                String strSubstring = str.substring(0, iIndexOf);
                short sXd = (short) (C1499aX.Xd() ^ (-2244));
                short sXd2 = (short) (C1499aX.Xd() ^ (-19722));
                int[] iArr = new int["XWEM<Oq".length()];
                QB qb = new QB("XWEM<Oq");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                    i2++;
                }
                if (!strSubstring.endsWith(new String(iArr, 0, i2))) {
                    throw new IllegalArgumentException(C1593ug.zd("Mou\"d$ggzm?>+uzovu1vt\tv6ljeH", (short) (C1580rY.Xd() ^ (-24305)), (short) (C1580rY.Xd() ^ (-18253))));
                }
                Object[] objArr = {str.substring(iIndexOf + 1), 0};
                Method declaredMethod = Class.forName(Ig.wd("\u0012O7%\u0001>e6O*%\u0006\u001d#F6\\=a", (short) (C1607wl.Xd() ^ 3114))).getDeclaredMethod(C1561oA.Qd("22/:..", (short) (C1633zX.Xd() ^ (-16455))), Class.forName(EO.Od("*Q\u0015$0#w}\u001d$K\u000b30)<", (short) (FB.Xd() ^ 15173))), Integer.TYPE);
                try {
                    declaredMethod.setAccessible(true);
                    return new ByteArrayInputStream((byte[]) declaredMethod.invoke(null, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }

            @Override // com.bumptech.glide.load.model.DataUrlLoader.DataDecoder
            public Class<InputStream> getDataClass() {
                return InputStream.class;
            }
        };

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader<Model, InputStream> build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DataUrlLoader(this.opener);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public DataUrlLoader(DataDecoder<Data> dataDecoder) {
        this.dataDecoder = dataDecoder;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<Data> buildLoadData(Model model, int i2, int i3, Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(model), new DataUriFetcher(model.toString(), this.dataDecoder));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(Model model) {
        return model.toString().startsWith(DATA_SCHEME_IMAGE);
    }
}
