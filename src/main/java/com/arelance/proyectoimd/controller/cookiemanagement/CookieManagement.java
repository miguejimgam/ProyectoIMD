/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.controller.cookiemanagement;

import javax.servlet.http.Cookie;

/**
 *
 * @author Miguel
 */
public class CookieManagement {
    public static Cookie createLoginCookie() {
        Cookie cookie = new Cookie("loginCorrecto", "");
        cookie.setMaxAge(60*60*24);
        return cookie;
    }
    
    public static Cookie destroyLoginCookie(Cookie cookie) {
        cookie.setMaxAge(0);
        return cookie;
    }
}
