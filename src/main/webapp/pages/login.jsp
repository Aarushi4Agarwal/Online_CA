<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login & Signup</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #161409;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            text-align: center;
        }

        .header {
            color: #fff;
            padding: 20px;
        }

        .header h1 {
            margin: 0;
            font-size: 50px;
            padding: 20px;
        }

        .header p {
            margin: 5px 0 0;
            color: #ddd;
            font-size: 14px;
            max-width: 300px;
            margin: 5px auto 0 auto;
           
        }

        .container {
            width: 300px;
            background: #fff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin: 0 auto;
        }

        .form-container {
            padding: 20px;
        }

        .form-switch {
            display: flex;
            justify-content: space-between;
            margin-bottom: 10px;
        }

        .form-switch-btn {
            width: 50%;
            padding: 10px;
            border: none;
            background: #eee;
            cursor: pointer;
            border-radius: 5px 5px 0 0;
            text-align: center;
        }

        .form-switch-btn.active {
            background: #007bff;
            color: white;
        }

        .form {
            display: none;
        }

        .form.active {
            display: block;
        }

        input {
            width: calc(100% - 20px);
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ddd;
            border-radius: 5px;
        }

        button {
            width: 100%;
            padding: 10px;
            border: none;
            background: #2a6fb9;
            color: white;
            border-radius: 5px;
            cursor: pointer;
        }

        button:hover {
            background: #0056b3;
        }

        p {
            color: red;
        }
    </style>
</head>
<body>
    <div class="header">
        <h1>Online CA</h1>
        <p>Revolutionizing Our Client Experience</p>
    </div>
    <div class="container">
        <div class="form-container">
            <div class="form-switch">
                <button id="login-btn" class="form-switch-btn active" onclick="showLogin()">Login</button>
                <button id="signup-btn" class="form-switch-btn" onclick="showSignup()">Signup</button>
            </div>
            <form id="login-form" class="form active">
                <h2>Login</h2>
                <input type="email" id="login-email" placeholder="Email" required>
                <input type="password" id="login-password" placeholder="Password" required>
                <button type="button" onclick="login()">Login</button>
                <p id="login-message"></p>
                <button type="button" onclick="showSignup()">Create an Account</button>
            </form>
            <form id="signup-form" class="form">
                <h2>Signup</h2>
                <input type="text" id="signup-username" placeholder="Username" required>
                <input type="email" id="signup-email" placeholder="Email" required>
                <input type="password" id="signup-password" placeholder="Password" required>
                <button type="button" onclick="signup()">Signup</button>
                <p id="signup-message"></p>
                <button type="button" onclick="showLogin()">Already have an account? Login</button>
            </form>
        </div>
    </div>
    <script>
        // In-memory storage for user data
        const users = {};

        function showLogin() {
            document.getElementById('login-form').classList.add('active');
            document.getElementById('signup-form').classList.remove('active');
            document.getElementById('login-btn').classList.add('active');
            document.getElementById('signup-btn').classList.remove('active');
        }

        function showSignup() {
            document.getElementById('signup-form').classList.add('active');
            document.getElementById('login-form').classList.remove('active');
            document.getElementById('signup-btn').classList.add('active');
            document.getElementById('login-btn').classList.remove('active');
        }

        function signup() {
            const username = document.getElementById('signup-username').value;
            const email = document.getElementById('signup-email').value;
            const password = document.getElementById('signup-password').value;

            if (username && email && password) {
                if (users[email]) {
                    document.getElementById('signup-message').textContent = 'User already exists!';
                } else {
                    users[email] = { username, password };
                    document.getElementById('signup-message').textContent = 'Signup successful!';
                }
            } else {
                document.getElementById('signup-message').textContent = 'Please fill in all fields.';
            }
        }

        function login() {
            const email = document.getElementById('login-email').value;
            const password = document.getElementById('login-password').value;

            if (email && password) {
                const user = users[email];
                if (user) {
                    if (user.password === password) {
                        document.getElementById('login-message').textContent = 'Login successful!';
                    } else {
                        document.getElementById('login-message').textContent = 'Invalid password.';
                    }
                } else {
                    document.getElementById('login-message').textContent = 'Account does not exist. Please sign up first.';
                }
            } else {
                document.getElementById('login-message').textContent = 'Please fill in all fields.';
            }
        }

        // Initialize to show the login form by default
        document.addEventListener('DOMContentLoaded', showLogin);
    </script>
</body>
</html>