# Adding Numbers Server Application

## Overview

The Adding Numbers Server Application is a simple Java server application that listens for connections on port 2020, receives two numbers from a client, calculates their sum, and sends the result back to the client. The server uses standard Java I/O and networking classes to handle communication.

## Project Structure

- **`AddingNumbersServerApp.java`**: The main class that implements the server logic. It listens for client connections, processes incoming data, performs addition, and sends the result back to the client.

## Prerequisites

- Java Development Kit (JDK) 8 or later

## How It Works

1. **Server Initialization:**
   - The server starts and listens for incoming connections on port 2020.

2. **Client Connection:**
   - When a client connects, the server accepts the connection and reads the input.

3. **Data Processing:**
   - The server expects input in the format "num1#num2", where `num1` and `num2` are integers separated by a hash (#) symbol.
   - It splits the input string to extract the numbers, parses them as integers, and calculates their sum.

4. **Sending the Result:**
   - The server sends the result back to the client in the format "sum of num1 and num2 is result".

5. **Closing the Connection:**
   - After processing the data and sending the result, the server closes the socket connection.

## Known Issues

- The server does not handle multiple clients simultaneously; it handles one client at a time.
- Error handling is minimal and may need enhancement for production use.

## Future Enhancements

- Implement multi-threading to handle multiple client connections concurrently.
- Improve error handling and input validation.


Feel free to customize the contact details and any other specific information related to your project!
