package com.zking.ssm.Vo;

import com.zking.ssm.model.File;
import org.springframework.web.multipart.MultipartFile;


public class FileVo extends File {
    private String bookId;
    private MultipartFile img;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public MultipartFile getImg() {
        return img;
    }

    public void setImg(MultipartFile img) {
        this.img = img;
    }

}
