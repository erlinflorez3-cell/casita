package com.google.mlkit.vision.common.internal;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.internal.model.ModelUtils;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.sdkinternal.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.Od;
import yg.ZN;

/* JADX INFO: loaded from: classes7.dex */
public class AutoMLModelUtils {
    private AutoMLModelUtils() {
    }

    public static String[] getModelAndLabelFilePaths(Context context, LocalModel localModel, boolean z2) throws Throwable {
        String string;
        String string2 = z2 ? (String) Preconditions.checkNotNull(localModel.getAssetFilePath()) : (String) Preconditions.checkNotNull(localModel.getAbsoluteFilePath());
        if (localModel.isManifestFile()) {
            ModelUtils.AutoMLManifest manifestFile = ModelUtils.parseManifestFile(string2, z2, context);
            if (manifestFile == null) {
                throw new IOException("Failed to parse manifest file.");
            }
            Preconditions.checkState(Constants.AUTOML_IMAGE_LABELING_MODEL_TYPE.equals(manifestFile.getModelType()), "Model type should be: %s.", Constants.AUTOML_IMAGE_LABELING_MODEL_TYPE);
            string2 = new File(new File(string2).getParent(), manifestFile.getModelFile()).toString();
            string = new File(new File(string2).getParent(), manifestFile.getLabelsFile()).toString();
        } else {
            string = "";
        }
        return new String[]{string2, string};
    }

    public static List<String> readLabelsFile(Context context, String str, boolean z2) throws Throwable {
        InputStream fileInputStream;
        ArrayList arrayList = new ArrayList();
        if (z2) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Qd("XdYfb[U\u001eR][`PX]\u0016*USXHZU", (short) (ZN.Xd() ^ 18915))).getMethod(C1593ug.zd("_^n<opcss", (short) (C1607wl.Xd() ^ 5065), (short) (C1607wl.Xd() ^ 28221)), new Class[0]);
            try {
                method.setAccessible(true);
                fileInputStream = ((AssetManager) method.invoke(context, objArr)).open(str);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            fileInputStream = new FileInputStream(new File(str));
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, C1561oA.od("\u0018\u0016\u0007lv", (short) (Od.Xd() ^ (-9962)))));
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                arrayList.add(line);
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod(C1561oA.Kd("`deUxtuxl{|oo", (short) (C1633zX.Xd() ^ (-11180))), Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
            }
            throw th;
        }
    }
}
