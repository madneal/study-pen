# Getting the source code
In this challenge, you can download the source code as a zip file using the following link: codereview_10.zip

# This challenge
In this challenge, you are going to review the source code of a Golang application. The goal here is to only focus on the image upload handler (to keep things simple).

This bug can be exploited and was quickly fixed after being discovered by PentesterLab.

# Conclusion
This exercise showed you how to find a vulnerability in a more significant project by focusing on a subset of the code. By digging into the source code, you can easily find code that does not seem right. I hope you enjoyed learning with PentesterLab.

# Solution

filename: code-review/10/uadmin/upload_image_handler.go
line: 24
bug type: Directory Traversal