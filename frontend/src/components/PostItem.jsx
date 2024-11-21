import { useNavigate } from "react-router-dom";
import ReactMarkdown from "react-markdown";


const PostItem = ({title,content,create_At,category}) =>{
const mockContent = `
    # Hello World
    This is a **Markdown** example with:
    - Bullet points
    - Links [Google](https://google.com)
    `;


    return (
        <div className="flex flex-col justify-items-center w-[632px]">
                <header className="flex flex-col">
                    <h1 className="text-3xl font-bold font-mono my-4">{title}</h1>
                    <h4 className="text-sky-400 font-bold font-sans">{category}</h4>
                    <p className="text-sm font-light text-right my-8">{create_At}</p>
                </header>
                <article className="flex flex-row-reverse">
                    <aside className="ml-12 w-auto">
                        <div className="inline-block">
                            <ul className="">
                                <li>여러가지</li>
                                <li>두번째</li>
                            </ul>
                        </div>
                    </aside>
                    <div className="">
                        <ReactMarkdown>{content}</ReactMarkdown>
                    </div>
                </article>
        </div>
    )
}
export default PostItem;