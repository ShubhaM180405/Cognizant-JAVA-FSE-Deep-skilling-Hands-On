# 9. React-JS HOL

## Hands-on 9

### Objective

To demonstrate ES6 features in React including map(), arrow functions, destructuring, spread operator, and conditional rendering.

---

## Software Requirements

- Node.js
- npm
- React
- Visual Studio Code

---

## Project Structure

```
cricketapp
│
├── public
│
├── src
│   ├── Components
│   │      ├── IndianPlayers.js
│   │      ├── ListofIndianPlayers.js
│   │      ├── ListofPlayers.js
│   │      └── Scorebelow70.js
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
npx create-react-app cricketapp
```

2. Created components for displaying player information.

3. Displayed all players using map().

4. Filtered players using arrow functions.

5. Implemented array destructuring for odd and even players.

6. Merged arrays using the spread operator.

7. Rendered components conditionally using a flag variable.

8. Executed the application.

```bash
npm start
```

---

## Output

The application displays either:

- Complete player details with players scoring less than or equal to 70, or
- Odd players, even players, and merged Indian players.

depending on the value of the flag variable.

---

## Screenshots

- Project Structure
- App.js
- ListofPlayers.js
- Scorebelow70.js
- IndianPlayers.js
- ListofIndianPlayers.js
- App.css
- Terminal Output
- Browser Output (Flag = true)
- Browser Output (Flag = false)

---

## Result

The React application successfully demonstrates the ES6 features used in modern React development.