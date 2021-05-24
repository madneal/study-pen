# Getting the source code
In this challenge, you can download the source code as a zip file using the following link: codereview_11.zip

# This challenge
In this challenge, you are going to review the source code of a .Net application. The goal here is to only focus on the login flow (to keep things simple).

In order to keep the size of the zip low, a lot of files have been removed from the initial web application.

# Conclusion
This exercise showed you how to find a vulnerability in a more significant project by focusing on a subset of the code. By digging into the source code, you can easily find code that does not seem right. I hope you enjoyed learning with PentesterLab.

# Solution

* filename: code-review/11/mojoportal/Web/Secure/Login.aspx.cs
* line: 155
* bug type: Open Redirect
