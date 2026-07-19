# 1. React-JS HOL

## Objective

To create a React application named **myfirstreact** using Create React App and display the heading **"Welcome to the first session of React"** and subheading **"Hi!! My name is Shubham Sangram Bej"** in the browser.

---

## Software Requirements

- Node.js
- npm
- React
- Visual Studio Code

---

## Project Structure

```
myfirstreact
│
├── public
├── src
│   └── App.js
├── package.json
├── package-lock.json
├── node_modules
└── README.md
```

---

## Steps Performed

1. Installed Node.js and npm.
2. Created a new React application using:

```bash
npx create-react-app myfirstreact
```

3. Navigated into the project folder.

```bash
cd myfirstreact
```

4. Opened the project in Visual Studio Code.

5. Replaced the contents of `App.js` with:

```jsx
function App() {
  return (
    <div>
      <h1>Welcome to the first session of React</h1>
    </div>
  );
}

export default App;
```

6. Started the development server using:

```bash
npm start
```

7. Opened the browser and verified the output at:

```
http://localhost:3000
```

---

## Output

The application displays the following heading:

```
Welcome to the first session of React
Hi!! My name is Shubham Sangram Bej
```

---

## Screenshots

- Project Structure
- App.js Source Code
- React Development Server (npm start)
- Browser Output
- React Project Creation (Success! Created myfirstreact)

---

## Result

The React application **myfirstreact** was created successfully using Create React App. The application executed successfully and displayed the required heading **"Welcome to the first session of React"** **"Hi!! My name is Shubham Sangram Bej"** in the browser.