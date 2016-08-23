package com.think.controller;

import com.think.common.model.Blog;
import com.jfinal.core.Controller;


/**
 * Created by apple on 16/8/11.
 */
public class IndexController extends Controller{
    public void index() {
        Blog test1 = new Blog().set("title","hello world").set("content", "hello world");
        test1.save();

        Blog test2 = Blog.dao.findById(6);
        setAttr("test", test2).render("index.jsp");
    }
}
