package io;

import java.io.*;

public class CopyAll {
    public static void main(String[] args) {
        File srcFile = new File("H:\\34道作业题");
        File destFile = new File("H:\\新建文件夹");
        copyFolder(srcFile,destFile);

    }

    private static void copyFolder(File srcFile, File destFile) {
        if(srcFile.isDirectory()){
            String srcFileName = srcFile.getName();
            //封装的目的地文件夹下需要创建的目录名称
            File newFolder = new File(destFile, srcFileName);
            if(!newFolder.exists()){
                newFolder.mkdir();
            }
            //文件夹下可能还有文件夹，使用递归遍历
            File[] files = srcFile.listFiles();
            for(File file:files){
                copyFolder(file,newFolder);
            }
        }else {
            File newFile = new File(destFile, srcFile.getName());
            copyFile(srcFile,newFile);
        }
    }

    private static void copyFile(File srcFile,File destFile) {
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;
        try {
            bis = new BufferedInputStream(new FileInputStream(srcFile));
            bos = new BufferedOutputStream(new FileOutputStream(destFile));

            byte[] bys = new byte[1024];
            int read ;
            while((read=bis.read(bys))!=-1){
                bos.write(bys,0,read);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bis!=null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bos!=null){
                bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
