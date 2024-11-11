import Header from "../layouts/Header"
import Footer from "../layouts/Footer"
import React from "react"

const Layout = (props) => {
    return (
        <div>
            <Header />

            <main>
                {props.children}
            </main>

            <Footer />
        </div>
    )
}
export default Layout