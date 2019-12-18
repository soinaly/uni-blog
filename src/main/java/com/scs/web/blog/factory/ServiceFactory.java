package com.scs.web.blog.factory;

import com.scs.web.blog.service.ArticleService;
import com.scs.web.blog.service.TopicService;
import com.scs.web.blog.service.UserService;
import com.scs.web.blog.service.impl.ArticleServiceImpl;
import com.scs.web.blog.service.impl.TopicServiceImpl;
import com.scs.web.blog.service.impl.UserServiceImpl;


public class ServiceFactory {
    public static UserService getUserServiceInstance() {
        return new UserServiceImpl();
    }

    public static ArticleService getArticleServiceInstance() {
        return new ArticleServiceImpl();
    }

    public static TopicService getTopicServiceInstance() {
        return new TopicServiceImpl();
    }

}