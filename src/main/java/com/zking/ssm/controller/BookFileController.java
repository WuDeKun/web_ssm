package com.zking.ssm.controller;

import com.zking.ssm.Vo.FileVo;
import com.zking.ssm.model.Book;
import com.zking.ssm.model.File;
import com.zking.ssm.service.IFileService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("/bookFile")
public class BookFileController {
    @Autowired
    private IFileService IFileService;

    @RequestMapping("/upload")
    public String upload(FileVo fileVo){
        try {
            MultipartFile img=fileVo.getImg();
            String filePath="D:\\"+img.getOriginalFilename();
            String fileId= UUID.randomUUID().toString().replace("-","");
            File bookFile=new File();
            bookFile.setFileId(fileId);
            bookFile.setContentType(img.getContentType());
            bookFile.setRealName(img.getOriginalFilename());
            bookFile.setUrl(filePath);
            Book book=new Book();
            book.setBookId(fileVo.getBookId());
            book.setBookImage(fileId);
            IFileService.insert(bookFile,book);
            img.transferTo(new java.io.File(filePath));
            return "redirect:/book/bookList";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/book/bookList";
    }

    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(@RequestParam String fileId){
        try {
            File bookFile=IFileService.selectByPrimaryKey(fileId);
            java.io.File file=new java.io.File(bookFile.getUrl());
            String fileName=bookFile.getRealName();
            HttpHeaders headers = new HttpHeaders();//http头信息
            String downloadFileName = new String(fileName.getBytes("UTF-8"),"iso-8859-1");//设置编码
            headers.setContentDispositionFormData("attachment", downloadFileName);
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            //MediaType:互联网媒介类型  contentType：具体请求中的媒体类型信息
            return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
