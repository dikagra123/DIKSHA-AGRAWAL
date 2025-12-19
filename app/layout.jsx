import "./globals.css";
export const metadata = {
title: "Diksha Agrawal | Portfolio",
description: "B.Tech CSE (E‑Commerce Technology) student portfolio",
};


export default function RootLayout({ children }) {
return (
<html lang="en" className="dark">
<body className="bg-white text-slate-900 dark:bg-slate-950 dark:text-slate-200">
{children}
</body>
</html>
);
}