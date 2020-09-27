# Getting the source code

In this challenge, you can download the source code as a zip file using the following link: codereview_12.zip

# This challenge

In this challenge, you are going to review the source code of a minimal Java application. The goal here is to gain some confidence with Java application. And the framework used creates very minimalistic applications. For this one, do not focus on the authentication and spend time looking for simple injection bugs.

To keep the size of the zip low, a lot of files have been removed from the initial web application.

# Conclusion

This exercise showed you how to find a vulnerability in a very small project and get familiar with Java applications. By digging into the source code, you can easily find code that does not seem right. I hope you enjoyed learning with PentesterLab.

# Solution:

file: src/main/java/Main.java
line: 31
bug type: cross site scripting 