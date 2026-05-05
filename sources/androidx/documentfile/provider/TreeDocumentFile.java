package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
class TreeDocumentFile extends DocumentFile {
    private Context mContext;
    private Uri mUri;

    TreeDocumentFile(DocumentFile documentFile, Context context, Uri uri) {
        super(documentFile);
        this.mContext = context;
        this.mUri = uri;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public DocumentFile createFile(String str, String str2) throws Throwable {
        Uri uriCreateFile = createFile(this.mContext, this.mUri, str, str2);
        if (uriCreateFile != null) {
            return new TreeDocumentFile(this, this.mContext, uriCreateFile);
        }
        return null;
    }

    private static Uri createFile(Context context, Uri uri, String str, String str2) throws Throwable {
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.Zd("\u0006#h?\f\u0012e\u0003\u0001\\gF\u0007X.wea)z\u007fk7", (short) (ZN.Xd() ^ 21488), (short) (ZN.Xd() ^ 21048))).getMethod(C1561oA.Xd("rq\u0002Q~~\u0006w\u0002\tg{\u000b\b\u0006\u0011\u0001\u000f", (short) (Od.Xd() ^ (-28927))), new Class[0]);
            try {
                method.setAccessible(true);
                return DocumentsContract.createDocument((ContentResolver) method.invoke(context, objArr), uri, str, str2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public DocumentFile createDirectory(String str) throws Throwable {
        Uri uriCreateFile = createFile(this.mContext, this.mUri, "vnd.android.document/directory", str);
        if (uriCreateFile != null) {
            return new TreeDocumentFile(this, this.mContext, uriCreateFile);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public Uri getUri() {
        return this.mUri;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public String getName() {
        return DocumentsContractApi19.getName(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public String getType() {
        return DocumentsContractApi19.getType(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isDirectory() {
        return DocumentsContractApi19.isDirectory(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isFile() {
        return DocumentsContractApi19.isFile(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isVirtual() {
        return DocumentsContractApi19.isVirtual(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long lastModified() {
        return DocumentsContractApi19.lastModified(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long length() {
        return DocumentsContractApi19.length(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canRead() {
        return DocumentsContractApi19.canRead(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canWrite() {
        return DocumentsContractApi19.canWrite(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean delete() throws Throwable {
        try {
            Context context = this.mContext;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.vd("\u001e,\u001f.0+#m(518.8;uo\u001d\u0019 \u0016*#", (short) (OY.Xd() ^ 21093))).getMethod(Qg.kd("\u0007\u0004\u0012_\u000b\t\u000e}\u0006\u000bgy\u0007\u0002}\u0007t\u0001", (short) (ZN.Xd() ^ 5556), (short) (ZN.Xd() ^ 2237)), new Class[0]);
            try {
                method.setAccessible(true);
                return DocumentsContract.deleteDocument((ContentResolver) method.invoke(context, objArr), this.mUri);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean exists() {
        return DocumentsContractApi19.exists(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public DocumentFile[] listFiles() throws Throwable {
        Context context = this.mContext;
        Class<?> cls = Class.forName(hg.Vd("/;0=92,t)427'/4l\u0001,*/\u001f1,", (short) (OY.Xd() ^ 24127), (short) (OY.Xd() ^ 5638)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (OY.Xd() ^ 31974);
        int[] iArr = new int["olzHsqvfnsPbojfo]i".length()];
        QB qb = new QB("olzHsqvfnsPbojfo]i");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            ContentResolver contentResolver = (ContentResolver) method.invoke(context, objArr);
            Uri uri = this.mUri;
            Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = null;
            try {
                try {
                    String[] strArr = new String[1];
                    strArr[0] = C1561oA.yd("WaXi\\S_dZca", (short) (C1607wl.Xd() ^ 23951));
                    cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, strArr, null, null, null);
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.mUri, cursorQuery.getString(0)));
                    }
                } catch (Exception e2) {
                    C1561oA.Yd("8dYle^hoBfjd", (short) (C1580rY.Xd() ^ (-10270)));
                    String str = Xg.qd("]y\u0003\u0007\u0001\u0001=\u0010\u0015\u0006\u0014\u001c]D", (short) (C1607wl.Xd() ^ 20967), (short) (C1607wl.Xd() ^ 29958)) + e2;
                }
                closeQuietly(cursorQuery);
                Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
                DocumentFile[] documentFileArr = new DocumentFile[uriArr.length];
                for (int i3 = 0; i3 < uriArr.length; i3++) {
                    documentFileArr[i3] = new TreeDocumentFile(this, this.mContext, uriArr[i3]);
                }
                return documentFileArr;
            } catch (Throwable th) {
                closeQuietly(cursorQuery);
                throw th;
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static void closeQuietly(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean renameTo(String str) throws Throwable {
        try {
            Context context = this.mContext;
            short sXd = (short) (OY.Xd() ^ 21759);
            short sXd2 = (short) (OY.Xd() ^ 19118);
            int[] iArr = new int["2|4o.eBY0i:\u001e`\u0017NF='g\u001bM\u001e{".length()];
            QB qb = new QB("2|4o.eBY0i:\u001e`\u0017NF='g\u001bM\u001e{");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(ZO.xd("Z\bQv\u001c}gf*:5:\u001f+B\u001cY~", (short) (C1499aX.Xd() ^ (-14498)), (short) (C1499aX.Xd() ^ (-28714))), new Class[0]);
            try {
                method.setAccessible(true);
                Uri uriRenameDocument = DocumentsContract.renameDocument((ContentResolver) method.invoke(context, objArr), this.mUri, str);
                if (uriRenameDocument != null) {
                    this.mUri = uriRenameDocument;
                    return true;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
