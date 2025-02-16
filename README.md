# 📝 To-Do Web App (Spring Boot)

This is a robust and efficient To-Do web application built using **Spring Boot** and **MySQL**. It provides users with a structured way to manage their daily tasks. 🚀

## 🛠 Tech Stack
- **Backend:** Spring Boot
- **Database:** MySQL
- **ORM:** JPA (Hibernate)
- **Frontend:** HTML, CSS, JavaScript (Optional)

## 📌 Getting Started

### 1️⃣ Setting Up MySQL
You can either use a MySQL server or run MySQL using Docker.

#### 🐳 Launch MySQL using Docker
Run the following command to start a MySQL container:

```sh
docker run --detach \
--env MYSQL_ROOT_PASSWORD=dummypassword \
--env MYSQL_USER=todos-user \
--env MYSQL_PASSWORD=dummytodos \
--env MYSQL_DATABASE=todos \
--name mysql \
--publish 3306:3306 \
mysql:8-oracle
```

#### 🔧 Using Your Own MySQL Server
If you prefer using your own MySQL server, update the `application.properties` file with your database credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todos
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
```

### 2️⃣ Running the Application

1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/todo-webapp.git
   ```
2. Navigate to the project directory:
   ```sh
   cd todo-webapp
   ```
3. Build and run the application:
   ```sh
   mvn spring-boot:run
   ```

### 3️⃣ Accessing the Application
Once the application is running, open your browser and visit:

```
http://localhost:8080
```

## 📸 Screenshots

Here are some screenshots showcasing different parts of the application:

### 🔐 Login Page
![Login Page](images/login.png)

### 🏠 Home Page
![Home Page](images/home.png)

### 📋 List To-Do
![List To-Do](images/list_todo.png)

### ✏️ Update Task
![Update Task](images/update.png)

### 🚪 Logout Page
![Logout Page](images/logout.png)

## 🚀 Future Deployment Plans
In the future, this application will be deployed using **Railway.app** with a cloud-based MySQL database. ☁️

## 🤝 Contributing
Contributions are welcome! Feel free to submit pull requests and improve this project. 💡

## 📜 License
This project is open-source and available under the MIT License. 📄

