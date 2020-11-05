require 'oauth2'

callback = "http://121.36.215.221/"
app_id = "c5ddce2c4a2ed487441144608748d675c639b0e4d722d97ee6d0add44e66a206"

secret = "72dfaf57c017adb0a69f5f01ceb5bdcb9283772bec54380da0301a0935505124"
client = OAuth2::Client.new(app_id, secret, site: "http://authorization-ptl-402e9b14-540bfe3a.libcurl.so/")
puts client.auth_code.authorize_url(redirect_uri: callback)


code="bcf616ab790e45c2dbe2c7e2946652f13cda97f995255088207ea32dabe51fe2"
access = client.auth_code.get_token( code, redirect_uri: callback)
access.get("/api/user").parsed

puts access.token  