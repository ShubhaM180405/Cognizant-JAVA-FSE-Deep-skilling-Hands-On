# 12. React-JS HOL

## Hands-on 12

### Objective

To demonstrate Conditional Rendering in React using Login and Logout functionality based on user authentication.

---

## Software Requirements

- Node.js
- npm
- React
- Visual Studio Code

---

## Project Structure

```
ticketbookingapp
│
├── public
│
├── src
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
npx create-react-app ticketbookingapp
```

2. Created UserGreeting and GuestGreeting components.

3. Created LoginButton and LogoutButton components.

4. Used React State to maintain login status.

5. Implemented conditional rendering using an element variable.

6. Executed the application.

```bash
npm start
```

---

## Output

Initially, the application displays:

- Please Sign Up
- Login Button

After clicking Login:

- Welcome Back
- Logout Button

Clicking Logout returns to the initial page.

---

## Screenshots

- Project Structure
- App.js
- App.css
- Terminal Output
- Browser Output (Guest Page)
- Browser Output (User Page)

---

## Result

The React application successfully demonstrates conditional rendering, React State, element variables, and component rendering based on user authentication.