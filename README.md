 # Project - Computer Shop

## Project Description

1. Here is the translation of the text to English: A program is required to model a computer store. The store has the following attributes:
- Name of the store.
- Owner of the store.
- Tax identifier of the store.
2. The computers in the store have the following attributes:
- Brand of the computer.
- Amount of memory.
- Processor characteristics.
- Operating system.
- Price of the computer.
3. The program must have methods that allow:
- Adding a computer to the store.
- Deleting a computer from the store given its brand.
- Searching for a computer in the store given its brand.
- Listing the information of all the computers that the store has.

## Technical Requirements

- **Diagram**: UML class diagram.
- **Test coverage**: at least 70%.

## Project Structure

This project is organized using **Spring Boot** to create a REST API. Below are the main layers of the system:

- **Controllers**: Handle HTTP requests and delegate business logic to services.
- **Services**: Contain business logic and handle interactions with models.
- **Models**: Represent the system's data, including entities for patients, appointments, and other necessary objects.
- **Repositories**: Manage data persistence through JPA.
- **DTOs**: Define data structures for transferring information.

## Installation

### Prerequisites:
- **Java 21**
- **Maven** to manage dependencies.

### Steps to run the project:

1. **Clone the repository**:

    ```bash
    https://github.com/abdiaslabrador/java_computers_shop_api_ff5.git
    cd java_computers_shop_api_ff5
    ```

2. **Configure the database**:
    Since we're using the in-memory H2 database, no additional configuration is needed here.

3. **Build and run the project**:

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

4. **Access the API**:
    - The API will be available at `http://localhost:8080`.
    - You can use tools like **Postman** or **Insomnia** to test the endpoints.

---

## API Endpoints

#### Computers
- **GET /computers**: List all computers.
- **POST /computers**: Create a new computer.
- **POST /computers/search**: Search a computer by brand.
- **GET /computers/{id}**: Get an computer by ID.
- **DELETE /computers/{id}**: Delete an computer data by ID

#### Bills
- **GET /bills**: List all bills.

The project uses **JUnit 5** for unit tests.

### Running Tests

To run the tests, use the following Maven command:

    mvn test

### Test Coverage

<img src="screenshot/test_cover.png" alt="Test Coverage" width="35%"> 

## Diagrams
Include diagrams such as:
 - **Class Diagram**:

<img src="screenshot/class diagram.drawio.png" alt="Class Diagram" width="70%">

- **Relational Diagram**:

<img src="screenshot/relational entity diagram.drawio.png" alt="Relational Diagram" width="40%">



## Authors
### Contact us with:

**Abdias Labrador** [GitHub](https://github.com/abdiaslabrador) / [LinkedIn](https://www.linkedin.com/in/abdias-labrador/)