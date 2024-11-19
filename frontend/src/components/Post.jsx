import { Link } from "react-router-dom";

const Post = ({id,title,description,created_At}) =>{
    return (
        <div id = "post" className="border-2 min-w-80 mt-6 ">
            <h2 id="title" className="text-black mb-2 text-2xl"><Link>{title}</Link></h2>
            <div id="description" className="">{description}</div>
            <span id="create_At" className="text-sm mb-2">{created_At}</span>
        </div>
    )
}

export default Post;