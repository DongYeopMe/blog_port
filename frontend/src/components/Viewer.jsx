import { Link } from "react-router-dom";
import image1 from "../assets/image1.webp"
import { useNavigate } from "react-router-dom";


const Viewer = ({id,title,content,description,created_At}) =>{
    const nav = useNavigate();
    return (
        <div id = "post" className="min-w-80 max-w-7xl mt-6 cursor-pointer"
        onClick = {()=>{
                    nav(`post/${title}`,{
                    state: {
                        title: title,
                        content: content,
                        create_At: created_At,
                        category: "TIL",
                        description: description,
                    },
                    })
                }}>
            <img src={image1}></img>
            <h1 id="title" className="text-2xl font-bold sm:text-3xl mb-2 text-2xl">
                {title}</h1>
            <div id="description" className="">{description}</div>
            <span id="create_At" className="text-sm mb-2">{created_At}</span>
        </div>
    )
}

export default Viewer;