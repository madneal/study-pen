require 'oauth2'

callback = "http://121.36.215.221/"
app_id = "b72fb9768188bbcf79143b1b6f6464b98d8418c71c527165aa15d0fae67d809d"

secret = "8704640c992299bb60a4cf2ea69d37976bce7b892cd325f08bd422cd0259cbda"
client = OAuth2::Client.new(app_id, secret, site: "http://authorization-ptl-df6521cb-4c1f1d14.libcurl.so/")
puts client.auth_code.authorize_url(redirect_uri: callback)
exit


code="[CODE]"
access = client.auth_code.get_token( code, redirect_uri: callback)
access.get("/api/user").parsed

puts access.token  