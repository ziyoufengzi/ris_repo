package com.base;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by JFYT002 on 2017/11/27.
 */
public class BaseController {

    /**
     * VUE
     * @param result
     * @param response
     * @return
     */
    public static String vue(String result, HttpServletResponse response) {

        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        response.addHeader("Access-Control-Max-Age", "1800");

        return result;
    }
}
