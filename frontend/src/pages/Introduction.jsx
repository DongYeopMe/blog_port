import profile from "./../assets/profile.jpg"

const Introduction = () => {

    return (
        <div id="container" className="border-4 flex flex-col w-full">
            <section id="introduce " className="h-60 grid content-center p-4">
                <div id="head" className="flex justify-start h-48 px-4">
                    <div className="p-4">
                        <img src={profile} className="size-40"/>
                    </div>
                    <div className="p-7 flex flex-col w-full gap-4">
                        <pre className="font-sans text-base ">
                            완벽한 것은 존재하지 않다고 생각하기에 항상 성장하고자 노력합니다.
                        </pre>
                        <div id="contact" className="gap-8">
                            <div className="py-2">Contect</div>
                            <ul className="gap-4">
                                <li><a target="_blank" href="https://dongyeopme.gitbook.io/yeop-blog" id="blog">Blog</a></li>
                                <li><a target="_blank" href="https://github.com/DongYeopMe" id="github">Github</a></li>
                                <li>Email : dyplee22@gmail.com</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </section>
            <div id="stacks" className="px-14 py-6">
                기술 스택
                <button></button>
                <div id="frame" className="h-48 w-5/6 px-8">
                    <p>― 언어</p>
                    <p>┖ Java / JavaScript</p>
                    <p>― 프론트,백엔드</p>
                    <p>┖ React / Spring Boot / JPA / MySQL / Redis</p>
                    <p>― 기타</p>
                    <p>┖ AWS / Docker / Git</p>
                </div>
            </div>
            <div id ="projects">
            </div>
        </div>
    )
}

export default Introduction;