package com.eliteams.quick4j.web.model;

import org.springframework.web.multipart.MultipartFile;

/**
 * @作者 刘宝军
 * Created by Edion on 2017/1/5.
 */
public class NewActivitydetailVO {

    private NewActivitydetail newActivitydetail;

    private MultipartFile   multipartFileimage;


    public MultipartFile getMultipartFileimage() {
        return multipartFileimage;
    }

    public void setMultipartFileimage(MultipartFile multipartFileimage) {
        this.multipartFileimage = multipartFileimage;
    }

    public NewActivitydetail getNewActivitydetail() {
        return newActivitydetail;
    }

    public void setNewActivitydetail(NewActivitydetail newActivitydetail) {
        this.newActivitydetail = newActivitydetail;
    }
}
