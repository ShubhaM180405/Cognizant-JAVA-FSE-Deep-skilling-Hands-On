# 3. React-JS HOL

## Hands-on 3

### Objective

To create a React application named **scorecalculatorapp** using a Function Component that accepts student details through Props, calculates the percentage score, and displays the information with CSS styling.

---

## Software Requirements

- Node.js
- npm
- React
- Visual Studio Code

---

## Project Structure

```
scorecalculatorapp
│
├── public
│
├── src
│   ├── Components
│   │     └── CalculateScore.js
│   │
│   ├── Stylesheets
│   │     └── mystyle.css
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
npx create-react-app scorecalculatorapp
```

2. Navigated into the project.

```bash
cd scorecalculatorapp
```

3. Created a **Components** folder inside the `src` directory.

4. Created a Function Component named **CalculateScore.js**.

5. Created a **Stylesheets** folder and added **mystyle.css**.

6. Imported the stylesheet into the Function Component.

7. Passed the student details as Props from **App.js**.

8. Calculated the percentage score using JavaScript functions.

9. Executed the application.

```bash
npm start
```

---

## Output

The application displays:

- Student Name
- School Name
- Total Marks
- Percentage Score

Example:

```
Student Details

Name : Shubham Sangram Bej

School : DAV Public School

Total : 290 Marks

Score : 96.67%
```

---

## Screenshots

- Project Structure
- CalculateScore.js
- mystyle.css
- App.js
- Terminal Output
- Browser Output

---

## Result

The **scorecalculatorapp** React application was successfully developed using a Function Component. Student details were passed using Props, the percentage score was calculated successfully, and CSS styling was applied to display the output in a user-friendly format.