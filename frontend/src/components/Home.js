import React,{useState} from "react";
import Profile from '../img/이력서 사진.jpg';
function Home(){
    return(
        <div id="container" className=" h-lvh border-4 flex  flex-col ">
            <div id="introduce " className="border-2 border-black">
                <div id="head" className="border-2 border-black">
                    <span>Introduce</span>
                    <img src={Profile} className="size-40 m-2"/>
                    <span>1996년 12월 02일</span>
                    <div>
                        <pre className="font-sans text-sm">
                            언제나 발전하는 사람을 지향합니다.
                        </pre>
                    </div>
                    <div id="contact" className="border-4 border-black">
                        <ul>
                            <li>Blog</li>
                            <li>Github</li>
                            <li>Email</li>
                            <li>Phone</li>
                        </ul>
                    </div>
                </div>
            </div>

            <div id = "stacks">
                <div id = "frame">
                    <span>Spring</span>
                    <span>React</span>
                </div>
                <div id="lang">
                    <span>Java</span>
                    <span>JavaScript</span>
                </div>
                <div id="others">
                    <span></span>
                    <span></span>
                    <span></span>

                </div>
            </div>
            <div id ="projects">
            </div>
        </div>
    )
}
export default Home;