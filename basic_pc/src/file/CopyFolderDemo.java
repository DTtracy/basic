package file;

import java.io.*;

public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("H:\\EUI");
        String srcFolderName = srcFolder.getName();
        File destFolder = new File("basic_pc",srcFolderName);
        if(!destFolder.exists()){
            destFolder.mkdir();
        }
        File[] listfiles = srcFolder.listFiles();
        for(File srcFile : listfiles){
            String srcFileName = srcFile.getName();
            File destFile = new File(destFolder,srcFileName);
            copyFile(srcFile,destFile);
        }
    }

    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read())!=-1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();


    }
}
