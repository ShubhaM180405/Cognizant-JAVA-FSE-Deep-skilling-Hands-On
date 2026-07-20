# 5. React-JS HOL

## Hands-on 5

### Objective

To style React components using CSS Modules and inline styling by displaying cohort details in a dashboard format.

---

## Software Requirements

- Node.js
- npm
- React
- Visual Studio Code

---

## Project Structure

```
cohorttracker
│
├── public
│
├── src
│   ├── Components
│   │      └── CohortDetails.js
│   │
│   ├── Styles
│   │      └── CohortDetails.module.css
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
npx create-react-app cohorttracker
```

2. Created a `Components` folder.

3. Created the `CohortDetails.js` component.

4. Created the CSS Module file `CohortDetails.module.css`.

5. Applied styling using CSS Modules.

6. Applied conditional inline styling for cohort status.

7. Imported and rendered the component in `App.js`.

8. Executed the application.

```bash
npm start
```

---

## Output

The application displays all cohort information inside styled cards. The cohort title is displayed in green for ongoing cohorts and blue for scheduled cohorts.

---

## Screenshots

- Project Structure
- CohortDetails.js
- CohortDetails.module.css
- App.js
- Terminal Output
- Browser Output

---

## Result

The React application was successfully developed and styled using CSS Modules and inline styles.