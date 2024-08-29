import React, { useState } from "react";
import { NavLink } from "react-router-dom";

function LoginPage(){
    return(
        <div id="wrap" class="wrap">
            <header class="header">
                <a target="_blank" href="http://www.naver.com" class = "logo">
                    <h1>HOME</h1>
                </a>
            </header>
            <form className="loginForm">
                <div class="login_wrap">
                    <input type="text" className="userId" id="userId" placeholder="아이디 또는 이메일" autoFocus></input>
                    <input type="password" className="password" id="password" placeholder="비밀번호"></input>
                    <button id="loginBtn">Login</button>
                </div>
            </form>
            <div>
                <NavLink to="/findId">아이디 찾기</NavLink>
                <span>&nbsp;|&nbsp;</span>
                <NavLink to="/findPw">비밀번호 찾기</NavLink>
                <span>&nbsp;|&nbsp;</span>
                <NavLink to="/register">회원가입</NavLink>
            </div>
        </div>
    )
}
export default LoginPage;