package io;

import java.io.*;

public class CopyMoreFileDemo {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("H:\\34道作业题");
        File destFile = new File("H:\\新建文件夹");



        copyFolder(srcFile,destFile);
    }
    //复制文件夹
    private static void copyFolder(File srcFile, File destFile) throws IOException {
        if(srcFile.isDirectory()){
            String srcFileName = srcFile.getName();
            File newFolder = new File (destFile,srcFileName);//封装的F:\\MyDrivers
            if(!newFolder.exists()){
                newFolder.mkdir();
            }
            File[] fileArray = srcFile.listFiles();
            for (File file : fileArray){
                copyFolder(file,newFolder);
            }
        }else{
            File newFile = new File(destFile,srcFile.getName());
            copyFile(srcFile,newFile);
        }
    }
    //字符缓冲流复制文件
    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys=new byte[1024];
        int len;
        while((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();

    }
}
