import { createTheme } from "@mui/material";

const darkTheme = createTheme({
  palette: {
    mode: "dark",
    primary: {
        main: "#00FF99",
    },
    secondary: {
        main: "#5A20CB",
    },
    black: {
        main: "#242B2E"
    },
    background: {
        main: "#000000",
        default: "#0D0D0D",
        paper: "#0D0D0D"
    },
    textColor: {
        main: "#111111"
    } 
}
});

export default darkTheme;
