Getting the source code
In this challenge, you can download the source code as a zip file using the following link: codereview_01.zip

# This challenge
In this challenge, you are going to review the source code of a file system "adapter" for Express. Basically, Express uses Express-Session to handle sessions. Express-Session allows developers to use different storage mechanisms:

File System (the code you are reviewing).
Databases.
A cache.
...
Here, an attacker only controls few values and it turns out one of them is used without any filtering or escaping.

This is however only a weakness as Express-Session will cryptographically sign the value. Therefore, you will need to brute force the key used to sign the session in order to exploit this bug. However, it is still something to look for as this type of issues happened in other tools and is covered in challenges like Gogs RCE.

Once you find where the bug lies, you can submit your answer with the name of the file (with the full path) and the line that contains the weakness. For example, if the file is test/reap.js, just put test/reap.js (don't add session-file-store-master).

# Conclusion
This exercise showed you how to find a weakness in a library used as part of a very complex framework. By digging into the source code, you can easily find code that does not seem right. I hope you enjoyed learning with PentesterLab.

# Solution

* file: lib/session-file-helper.js
* line: 21
* bug type: Directory transversal
