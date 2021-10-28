# LogiGate

Note: Relative file links (e.g. "../css/main.css") are not consistent between running the website on localhost and simply opening the html files in a browser. The current solution is that all files have two lines for such references, with one commented out. The first one should be uncommented if opening files directly in a browser, and the second one should be uncommented if running the server.

For example, in index.html, this is how it should be for running the localhost server, and to open files directly in a browser, the other line should be commented instead.
```html
<!-- <link rel="stylesheet" type="text/css" href="../static/css/main.css"> -->
		<link rel="stylesheet" type="text/css" href="css/main.css">	
```

## What is LogiGate? 
A platform to help students and all interested learners practice and improve skills relating to logic and combinatorics problems. It will be available via website and mobile app, and allow users to solve problems, learn concepts, and discuss with the community.

## Project structure
```text
  src
    ├───main
    │   ├───java/com/logigate   Java classes
    │   └───resources           Static web content
    │       ├───static
    │       │   ├───css
    │       │   └───images
    │       └───templates       Web content templates
    │           ├───discuss
    │           ├───learn
    │           └───problems
    └───test/java/com/logigate  Java test classes
```