package com.facebook.common.file;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class FileTree {
    public static boolean deleteContents(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean z2 = true;
        z2 = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                int i2 = (-1) - (((-1) - (z2 ? 1 : 0)) | ((-1) - (deleteRecursively(file2) ? 1 : 0)));
                z2 = true;
                if (i2 != 1) {
                    z2 = false;
                }
            }
        }
        return z2;
    }

    public static boolean deleteRecursively(File file) {
        if (file.isDirectory()) {
            deleteContents(file);
        }
        return file.delete();
    }

    public static void walkFileTree(File file, FileTreeVisitor fileTreeVisitor) {
        fileTreeVisitor.preVisitDirectory(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    walkFileTree(file2, fileTreeVisitor);
                } else {
                    fileTreeVisitor.visitFile(file2);
                }
            }
        }
        fileTreeVisitor.postVisitDirectory(file);
    }
}
