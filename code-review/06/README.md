# Getting the source code

In this challenge, you can download the source code as a zip file using the following link: codereview_06.zip

## This challenge

In this challenge, you are going to review the source code of a Golang framework. The goal here is to only focus on the CORS code (to keep things simple).

The code suffers from a first issue in that it's not possible to have a policy returning * for Access-Control-Allow-Origin: since the code copies the Origin. However, this is not what we are interested in here.

This bug can not be exploited as the value provided will never be sent to the framework, however, it's interesting to know about this behaviour and pattern for future reviews in Golang.

# Conclusion

This exercise showed you how to find a weakness in a bigger project by focusing on a subset of the code. By digging into the source code, you can easily find code that does not seem right. I hope you enjoyed learning with PentesterLab.

# Soution

* file: router/cors.go
* line: 137
* bug type: filter bypass