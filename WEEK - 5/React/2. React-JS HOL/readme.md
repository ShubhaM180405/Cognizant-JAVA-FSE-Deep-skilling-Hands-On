# React-JS HOL

## Hands-on 2

### Objective

To create a React application named **StudentApp** and implement multiple class components (Home, About and Contact) that display welcome messages for the Student Management Portal.

---

## Software Requirements

- Node.js
- npm
- React
- Visual Studio Code

---

## Project Structure

```
studentapp
│
├── public
│
├── src
│   ├── Components
│   │   ├── Home.js
│   │   ├── About.js
│   │   └── Contact.js
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

1. Created a new React application.

```bash
npx create-react-app studentapp
```

2. Navigated into the project.

```bash
cd studentapp
```

3. Created a **Components** folder inside the `src` directory.

4. Created three class components:
   - Home
   - About
   - Contact

5. Imported all the components into `App.js`.

6. Rendered all three components.

7. Applied CSS styling to center the contents.

8. Executed the application.

```bash
npm start
```

---

## Output

The application displays:

```
Welcome to the Home page of Student Management Portal

Welcome to the About page of the Student Management Portal

Welcome to the Contact page of the Student Management Portal
```

---

## Screenshots

- Project Structure
- Home.js
- About.js
- Contact.js
- App.js
- App.css
- Terminal Output
- Browser Output

---

## Result

The StudentApp React application was successfully created using Create React App. Three class components were implemented and rendered successfully, displaying the required welcome messages.