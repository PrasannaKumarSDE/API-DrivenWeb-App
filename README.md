📦 Assignment Submission – Single Page Application + Backend (Spring Boot)


This project demonstrates a full-stack Single Page Application (SPA) where the frontend (HTML/CSS/JS) communicates with a Spring Boot backend.

The backend fetches data from a public API (GitHub Repos API), processes it, and sends the results to the frontend. The frontend displays the data in a colorful single-page interface with search functionality.

🛠 Tech Stack

Backend: Java, Spring Boot, REST API

Frontend: HTML, CSS, JavaScript (SPA – Single Page Application)

Database: (MySql;)

Public API Used: GitHub Repos API

⚙️ Setup Instructions
1️⃣ Backend Setup (Spring Boot)

Open the backend folder in your IDE  (Eclipse)

Make sure you have Java 17+ and Maven installed.

Configure pom.xml 
Run the application:

mvn spring-boot:run


The backend will start on:

http://localhost:8080

Backend API Endpoint:

GET http://localhost:8080/search?keyword=java

Fetches repositories from GitHub related to the keyword.


2️⃣ Frontend Setup (SPA)

Open the frontend/ folder.

Simply open index.html in a browser 

The page will connect to the backend running at http://localhost:8080.

🎨 Features

✅ Search GitHub repositories by keyword

✅ Backend fetches live data from GitHub API

✅ Frontend displays results dynamically

✅ Single Page Application (SPA) with JavaScript DOM updates

✅ Error handling for 404/500 responses

✅ Colorful, modern UI

🧪 Example Test

Run the backend (http://localhost:8080).

Open frontend/index.html.

Enter a keyword like java in the search bar.

Results will load with repository names, stars ⭐, and clickable links.


📌 Submission

Backend → Spring Boot project with API

Frontend → Colorful SPA (HTML/CSS/JS)
