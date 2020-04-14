# Getting the source code
In this challenge, you can download the source code as a zip file using the following link: [codereview_02](https://pentesterlab.com/exercises/codereview_02/attachments/0).zip

## This challenge
In this challenge, you are going to review the source code of a file system "adapter" for [Flask](https://www.fullstackpython.com/flask.html). Basically, Flask can use server-side session using [Flask Session](https://github.com/fengsp/flask-session/).

Here, an attacker only controls few values and it turns out one of them is used without any filtering or escaping.

This is however only a weakness as the cache used will hash (using md5) the filename provided. However, it is still something to look for as this type of issues happened in other tools and is covered in challenges like Gogs RCE.

Once you find where the bug lies, you can submit your answer with the name of the file (with the full path) and the line that contains the weakness.

# Conclusion
This exercise showed you how to find a weakness in a library used as part of a very complex framework. By digging into the source code, you can easily find code that does not seem right. I hope you enjoyed learning with PentesterLab.

# Solution
