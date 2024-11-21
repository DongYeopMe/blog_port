import { Link } from "react-router-dom";
import image1 from "../assets/image1.webp"

const Post = ({id,title,description,created_At}) =>{
    return (
        <div id = "post" className="border-2 min-w-80 max-w-7xl mt-6 ">
            <img src={image1}></img>
            <h1 id="title" className="text-2xl font-bold sm:text-3xl mb-2 text-2xl"><Link>{title}</Link></h1>
            <div id="description" className="">{description}</div>
            <span id="create_At" className="text-sm mb-2">{created_At}</span>
        </div>
    )
}

export default Post;