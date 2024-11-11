import React, { useState } from "react";
import { NavLink } from "react-router-dom";

function LoginPage(){
    return(
        <div className="h-screen flex items-center justify-center">
            <div id="wrap" className="flex flex-col justify-center bg-white text-center w-2/5 h-96 rounded-lg">
                <header class="header">
                    <img src="./img/logo.jpg" alt=""/>
                    <a target="_blank" href="http://www.naver.com" class="logo">
                        <h1 className="text-3xl text-gray-800">Log In</h1>
                    </a>
                </header>
                <form className="flex flex-col mt-5 px-5">
                    <div class="login_wrap">
                        <input type="text" className="bg-gray-100 shadow-inner border-2 focus:border-opacity-50 w-3/4 h-10 my-2" id="userId" placeholder="아이디 또는 이메일" autoFocus></input>
                        <input type="password" className="bg-gray-100 shadow-inner border-2 focus:border-opacity-50 w-3/4 h-10 my-2" id="password" placeholder="비밀번호"></input>
                        <button id="loginBtn" className="w-3/4 h-10 bg-gray-800 text-white mt-3 text-lg rounded-lg focus:outline-none hover:opacity-90 mb-3">Login</button>
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
        </div>
    )
}
export default LoginPage;