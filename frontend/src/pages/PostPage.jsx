import PostItem from "../components/PostItem";
import { useLocation } from "react-router-dom";
const PostPage = () =>{
    const location = useLocation();
    const {title,content,create_At,category} = location.state;
    return(
        <PostItem title={title} content={content} create_At={create_At} category={category}/>
    );
}
export default PostPage;