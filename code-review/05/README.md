# Getting the source code
In this challenge, you can download the source code as a zip file using the following link: codereview_05.zip

## This challenge
In this challenge, you are going to review the source code of a CGI node, this code base presents multiple issues. For this challenge we are interested in the one that is made worst if one Apache module is not loaded.

Once you find where the bug lies, you can submit your answer with the name of the file (with the full path) and the line that contains the weakness.

# Conclusion
This exercise showed you how to find a weakness in a simple project. By digging into the source code, you can easily find code that does not seem right. I hope you enjoyed learning with PentesterLab.

# Solution

* file: src/CgiNodeSession.js
* line: 114
* bug type: lack of randomness