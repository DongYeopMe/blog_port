import { useState } from "react";

export default function WritingToggle({context}){
    const [isOpen, setMenu] = useState(false);

    const toggleMenu = () =>{
        setMenu(isOpen=> !isOpen);
    }
}