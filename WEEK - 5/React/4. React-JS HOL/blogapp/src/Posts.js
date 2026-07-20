import React from "react";
import Post from "./Post";

class Posts extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            posts: []
        };
    }

    loadPosts() {

        fetch("https://jsonplaceholder.typicode.com/posts")
            .then(response => response.json())
            .then(data => {

                const posts = data.map(
                    p => new Post(p.id, p.title, p.body)
                );

                this.setState({
                    posts: posts
                });

            });

    }

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        alert(error);
        console.log(info);
    }

    render() {

        return (

            <div style={{ margin: "20px" }}>

                <h1 style={{ textAlign: "center" }}>
                    Blog Posts
                </h1>

                {

                    this.state.posts.map(post => (

                        <div
                            key={post.id}
                            style={{
                                border: "1px solid gray",
                                marginBottom: "15px",
                                padding: "15px",
                                borderRadius: "10px"
                            }}
                        >

                            <h3>{post.title}</h3>

                            <p>{post.body}</p>

                        </div>

                    ))

                }

            </div>

        );

    }

}

export default Posts;