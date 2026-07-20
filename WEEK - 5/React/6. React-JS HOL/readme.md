# 6. React-JS HOL

## Hands-on 6

### Objective

To develop a Trainer Management application using React Router for navigation between multiple pages.

---

## Software Requirements

- Node.js
- npm
- React
- React Router DOM
- Visual Studio Code

---

## Project Structure

```
trainersapp
│
├── public
│
├── src
│   ├── Components
│   │      ├── Home.js
│   │      ├── TrainersList.js
│   │      └── TrainerDetails.js
│   │
│   ├── Trainer.js
│   ├── TrainersMock.js
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
npx create-react-app trainersapp
```

2. Installed React Router.

```bash
npm install react-router-dom
```

3. Created the Trainer model class.

4. Added mock trainer data.

5. Created Home, TrainersList and TrainerDetails components.

6. Configured routing using BrowserRouter.

7. Used Link for navigation.

8. Used useParams() to retrieve trainer information.

9. Executed the application.

```bash
npm start
```

---

## Output

The application successfully navigates between Home, Trainers List and Trainer Details pages using React Router.

---

## Screenshots

- Project Structure
- App.js
- Trainer.js
- TrainersMock.js
- Home.js
- TrainersList.js
- TrainerDetails.js
- Terminal Output
- Browser Output (Home)
- Browser Output (Trainer List)
- Browser Output (Trainer Details)

---

## Result

The React Router application was successfully developed and trainer details were displayed dynamically using URL parameters.