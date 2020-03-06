# Getting the source code
In this challenge, you can download the source code as a zip file using the following link: [codereview_03.zip](https://pentesterlab.com/exercises/codereview_03/attachments/0)

## This challenge
In this challenge, you are going to review the source code of a JSON Web Token verifier with support for jku.

Here, an attacker has full control over the token provided (and its attributes). Most vulnerabilities in JWT libraries are bypasses of the verification mechanism, but here it is not the case. It's more logic bug.

Once you find where the bug lies, you can submit your answer with the name of the file (with the full path) and the line that contains the weakness.

# Conclusion
This exercise showed you how to find a vulnerability that can potentially have an important impact (even if it does not allow you to bypass the signature mechanism). By digging into the source code, you can easily find code that does not seem right. I hope you enjoyed learning with PentesterLab.