package com.eliteams.quick4j.web.model;

import java.util.List;

/**
 * @作者 刘宝军
 * Created by Edion on 2016/12/24.
 */
public class NewYuebanCoustom extends NewYueban {
    public List<NewYuebanimage>  listimage;

    public List<NewYuebancommentCustom>  listcommentCoustom;



    public List<NewYuebanimage> getListimage() {
        return listimage;
    }

    public void setListimage(List<NewYuebanimage> listimage) {
        this.listimage = listimage;
    }


    public List<NewYuebancommentCustom> getListcommentCoustom() {
        return listcommentCoustom;
    }

    public void setListcommentCoustom(List<NewYuebancommentCustom> listcommentCoustom) {
        this.listcommentCoustom = listcommentCoustom;
    }
}
