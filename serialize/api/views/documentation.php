<div class=\"row\">
  <div class=\"col-lg-12\">
    <h1>Api to Shell: Documentation </h1> 

    <h3>Register</h3>
    <pre>$ curl -X POST -H \"Content-Type: application/json\" -d '{\"username\":\"xyz\",\"password\":\"xyz\"}' http://vulnerable/register</pre> 


    <h3>Login</h3>
    <pre>$ curl -X POST -H \"Content-Type: application/json\" -d '{\"username\":\"xyz\",\"password\":\"xyz\"}' http://vulnerable/login</pre> 


    <h3>List of files</h3>
    <pre>$ curl -X POST -H \"Content-Type: application/json\" -d '{\"token\":\"9299...2\"}' http://vulnerable/files</pre> 


    <h3>Retrieve a file</h3>
    <pre>$ curl -X POST -H \"Content-Type: application/json\" -d '{ \"token\": \"9299...2\", \"uuid\": \"192..\", \"sig\": \"12...\"}' http://vulnerable/file</pre> 

    <h3>Upload a file</h3>
    <pre>$ curl -X POST -H \"Content-Type: application/json\" -d '{ \"token\": \"9299...2\", \"filename\": \"text.txt\", \"content\": \"MY DATA...\"}' http://vulnerable/upload</pre> 

 
  </div>
</div>
