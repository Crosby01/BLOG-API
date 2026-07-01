# Blog API
https://roadmap.sh/projects/blogging-platform-api

A simple RESTful Blog API built with Spring Boot.

## Features

* Create blog posts
* Get all blog posts
* Get a blog post by ID
* Update blog posts
* Delete blog posts
* Search blog posts by keyword

## Tech Stack

* Java
* Spring Boot
* Maven
* Postman

## API Endpoints

### Create Post

POST `/api/posts`

Request Body:

```json
{
  "title": "Spring Boot Guide",
  "content": "Learn Spring Boot"
}
```

### Get All Posts

GET `/api/posts`

### Get Post By ID

GET `/api/posts/{id}`

Example:

```http
GET /api/posts/1
```

### Update Post

PUT `/api/posts/{id}`

Example:

```json
{
  "title": "Updated Title",
  "content": "Updated Content"
}
```

### Delete Post

DELETE `/api/posts/{id}`

### Search Posts

GET `/api/posts/search?keyword=spring`

## Running the Project

Clone the repository:

```bash
git clone https://github.com/yourusername/blog-api.git
```

Navigate to the project:

```bash
cd blog-api
```

Run the application:

```bash
mvn spring-boot:run
```

The API will start on:

```text
http://localhost:8080
```

## Future Improvements

* H2 Database
* PostgreSQL Integration
* Spring Data JPA
* Validation
* Authentication & Authorization
* Pagination
* Docker Support
* Unit Testing

## Author

Vic EI
SWE
