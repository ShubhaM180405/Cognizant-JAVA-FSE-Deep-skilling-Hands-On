# 4. React-JS HOL

## Hands-on 4

### Objective

To create a React application named **blogapp** that demonstrates the use of React Lifecycle Methods by fetching blog posts from an online REST API and displaying them using a Class Component.

---

## Software Requirements

- Node.js
- npm
- React
- Visual Studio Code

---

## Project Structure

```
blogapp
│
├── public
│
├── src
│   ├── App.js
│   ├── App.css
│   ├── Post.js
│   ├── Posts.js
│   ├── index.js
│   └── index.css
│
├── package.json
├── package-lock.json
└── node_modules
```

---

## Steps Performed

1. Created a new React application.

```bash
npx create-react-app blogapp
```

2. Navigated into the project.

```bash
cd blogapp
```

3. Created the `Post.js` model class.

4. Created the `Posts.js` class component.

5. Implemented the `loadPosts()` method using the Fetch API.

6. Used the `componentDidMount()` lifecycle method to load the blog posts after the component was mounted.

7. Implemented the `render()` method to display the blog posts.

8. Added the `componentDidCatch()` lifecycle method for error handling.

9. Imported the `Posts` component into `App.js`.

10. Executed the application.

```bash
npm start
```

---

## Output

The application fetches blog posts from:

```
https://jsonplaceholder.typicode.com/posts
```

and displays the title and description of each post.

---

## Screenshots

- Project Structure
- Post.js
- Posts.js
- App.js
- Terminal Output
- Browser Output

---

## Result

The **blogapp** React application was successfully developed. React Lifecycle Methods were implemented successfully to fetch and display blog posts from an external REST API.