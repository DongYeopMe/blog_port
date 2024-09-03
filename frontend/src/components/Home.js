import React,{useState} from "react";

function Home(){
    return(
        <div id = "container">
            <div id = "introduce">
                <div id="head">
                    <img></img>
                    <span>introduce</span>
                </div>
                <div id="text">
                    <span></span>
                </div>
                <div id="blog">
                </div>
                <div id="contact">
                    <ul>
                        <li>Blog</li>
                        <li>Github</li>
                        <li>Email</li>
                        <li>Phone</li>
                    </ul>
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