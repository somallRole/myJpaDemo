package com.demo.frankxu.common;


import org.springframework.util.AntPathMatcher;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 文件处理工具类
 */
public class FileUtil {

    private static String uploadpath = "";//地址

    public static Result<?> upload(HttpServletRequest request, HttpServletResponse response) {
        Result<?> result = new Result<>();
        try {
            String ctxPath = uploadpath;
            String fileName = null;
            String bizPath = "files";
            String nowday = new SimpleDateFormat("yyyyMMdd").format(new Date());
            File file = new File(ctxPath + File.separator + bizPath + File.separator + nowday);
            if (!file.exists()) {
                file.mkdirs();// 创建文件根目录
            }
            MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
            MultipartFile mf = multipartRequest.getFile("file");// 获取上传文件对象
            String orgName = mf.getOriginalFilename();// 获取文件名
            fileName = orgName.substring(0, orgName.lastIndexOf(".")) + "_" + System.currentTimeMillis() + orgName.substring(orgName.indexOf("."));
            String savePath = file.getPath() + File.separator + fileName;
            File savefile = new File(savePath);
            FileCopyUtils.copy(mf.getBytes(), savefile);
            String dbpath = bizPath + File.separator + nowday + File.separator + fileName;
            if (dbpath.contains("\\")) {
                dbpath = dbpath.replace("\\", "/");
            }
            result.setMessage(dbpath);
            result.setSuccess(true);
        } catch (IOException e) {
            result.setSuccess(false);
            result.setMessage("上传失败");
            System.out.println(e.getMessage());
        }
        return result;
    }


    /**
     * 预览图片
     * 请求地址：http://localhost:8080/common/view/{user/20190119/e1fe9925bc315c60addea1b98eb1cb1349547719_1547866868179.jpg}
     *
     * @param request
     * @param response
     */
    //@GetMapping(value = "/view/**")
    public void view(HttpServletRequest request, HttpServletResponse response) {
        // ISO-8859-1 ==> UTF-8 进行编码转换
        String imgPath = extractPathFromPattern(request);
        // 其余处理略
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            imgPath = imgPath.replace("..", "");
            if (imgPath.endsWith(",")) {
                imgPath = imgPath.substring(0, imgPath.length() - 1);
            }
            response.setContentType("image/jpeg;charset=utf-8");
            String localPath = uploadpath;
            String imgurl = localPath + File.separator + imgPath;
            inputStream = new BufferedInputStream(new FileInputStream(imgurl));
            outputStream = response.getOutputStream();
            byte[] buf = new byte[1024];
            int len;
            while ((len = inputStream.read(buf)) > 0) {
                outputStream.write(buf, 0, len);
            }
            response.flushBuffer();
        } catch (IOException e) {
            System.out.println("预览图片失败" + e.getMessage());
            // e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }

    /**
     * 下载文件
     * 请求地址：http://localhost:8080/common/download/{user/20190119/e1fe9925bc315c60addea1b98eb1cb1349547719_1547866868179.jpg}
     *
     * @param request
     * @param response
     * @throws Exception
     */
    //@GetMapping(value = "/download/**")
    public void download(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // ISO-8859-1 ==> UTF-8 进行编码转换
        String filePath = extractPathFromPattern(request);
        // 其余处理略
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            filePath = filePath.replace("..", "");
            if (filePath.endsWith(",")) {
                filePath = filePath.substring(0, filePath.length() - 1);
            }
            String localPath = uploadpath;
            String downloadFilePath = localPath + File.separator + filePath;
            File file = new File(downloadFilePath);
            if (file.exists()) {
                response.setContentType("application/force-download");// 设置强制下载不打开            
                response.addHeader("Content-Disposition", "attachment;fileName=" + new String(file.getName().getBytes("UTF-8"),"iso-8859-1"));
                inputStream = new BufferedInputStream(new FileInputStream(file));
                outputStream = response.getOutputStream();
                byte[] buf = new byte[1024];
                int len;
                while ((len = inputStream.read(buf)) > 0) {
                    outputStream.write(buf, 0, len);
                }
                response.flushBuffer();
            }

        } catch (Exception e) {
            System.out.println("文件下载失败" + e.getMessage());
            // e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }



    /**
     *  把指定URL后的字符串全部截断当成参数
     *  这么做是为了防止URL中包含中文或者特殊字符（/等）时，匹配不了的问题
     * @param request
     * @return
     */
    private static String extractPathFromPattern(final HttpServletRequest request) {
        String path = (String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
        String bestMatchPattern = (String) request.getAttribute(HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE);
        return new AntPathMatcher().extractPathWithinPattern(bestMatchPattern, path);
    }





    /**
     * 拆分文件
     *
     * @param f
     */
    public static void splitFile(File f) throws IOException {​
        // 切分为100K大小的文件
        long fileLength = 1024 * 100; ​
        RandomAccessFile src = new RandomAccessFile(f, "r");
        int numberOfPieces = (int) (src.length() / fileLength) + 1;
        int len = -1;
        byte[] b = new byte[1024];
        for (int i = 0; i < numberOfPieces; i++) {​
            String name = "src/test/resources/file/" + f.getName() + "." + (i + 1);
            File file = new File(name);
            file.createNewFile();
            RandomAccessFile dest = new RandomAccessFile(file, "rw");
            while ((len = src.read(b)) != -1) {
                dest.write(b, 0, len);
                //如果太大了就不在这个子文件写了 换下一个
                if (dest.length() > fileLength) {
                    break;
                }
            }
            dest.close();
        }
        src.close();
    }


    /**
     * 文件合并
     * @throws IOException
     */
    public static void mergeFile() throws IOException {

        int length = 3;
        String name = "src/test/resources/file/src.pdf.";
        File file = new File("src/test/resources/file/new.pdf");
        file.createNewFile();
        RandomAccessFile in = new RandomAccessFile(file, "rw");
        in.setLength(0);
        in.seek(0);
        byte[] bytes = new byte[1024];
        int len = -1;
        for (int i = 0; i < length; i++) {
            File src = new File(name + (i + 1));
            RandomAccessFile out = new RandomAccessFile(src, "rw");
            while ((len = out.read(bytes)) != -1) {
                in.write(bytes, 0, len);
            }
            out.close();
        }
        in.close();
    }





}
