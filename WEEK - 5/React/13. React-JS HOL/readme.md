# 13. React-JS HOL

## Hands-on 13

### Objective

To demonstrate conditional rendering, multiple component rendering, list rendering using map(), and React keys.

---

## Software Requirements

- Node.js
- npm
- React
- Visual Studio Code

---

## Project Structure

```
bloggerapp
│
├── public
│
├── src
│   ├── Components
│   │      ├── BookDetails.js
│   │      ├── BlogDetails.js
│   │      ├── CourseDetails.js
│   │      └── Data.js
│   │
│   ├── App.js
│   ├── App.css
│   ├── index.js
│   └── index.css
│
├── package.json
├── package-lock.json
└── node_modules
```

---

## Steps Performed

1. Created a React application.

```bash
npx create-react-app bloggerapp
```

2. Created separate components for books, blogs, and courses.

3. Used the `map()` function to display lists.

4. Implemented conditional rendering using a boolean flag.

5. Styled the layout using CSS Flexbox.

6. Executed the application.

```bash
npm start
```

---

## Output

The application displays Course Details, Book Details, and Blog Details in three separate columns using React components.

---

## Screenshots

- Project Structure
- App.js
- Data.js
- BookDetails.js
- BlogDetails.js
- CourseDetails.js
- App.css
- Terminal Output
- Browser Output

---

## Result

The React application successfully demonstrates conditional rendering, component rendering, list rendering using `map()`, and React keys.